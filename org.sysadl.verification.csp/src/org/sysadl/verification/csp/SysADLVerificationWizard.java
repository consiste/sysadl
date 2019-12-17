package org.sysadl.verification.csp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbench;
import org.sysadl.ArchitectureDef;
import org.sysadl.ComponentDef;
import org.sysadl.ElementDef;
import org.sysadl.Model;
import org.sysadl.verification.transformation.PerformTransformation;

public class SysADLVerificationWizard extends Wizard {
	private Model model;
	private VerificationWizardPage firstPage;
	private Map<String, Object> map; 
	private String selection;
	private IFile file;
	
	@Override
	public boolean performFinish() {
		Object e = map.get(selection);
		PerformTransformation.run(model, e);
		return true;
	}

	public void addPages() {
		firstPage = new VerificationWizardPage("org.sysadl.verification.wizard");
		firstPage.setTitle("Verification of SysADL Model");
		firstPage.setDescription("Verification Setup");
		
		addPage(firstPage);
	}

	public void setModel(Model m) {
		this.model = m;
	}
	
	public void init(IWorkbench workbench) {
		setWindowTitle("SysADL Verification");
		map = new HashMap<String, Object>();
	}
	
	public class VerificationWizardPage extends WizardPage {

		protected VerificationWizardPage(String pageName) {
			super(pageName);
		}

		@Override
		public void createControl(Composite parent) {
			map.clear();
			Composite composite = new Composite(parent, SWT.NONE);
			{
				GridLayout layout = new GridLayout();
				layout.numColumns = 2;
				layout.verticalSpacing = 12;
				composite.setLayout(layout);

				GridData data = new GridData();
				data.verticalAlignment = GridData.FILL;
				data.grabExcessVerticalSpace = true;
				data.horizontalAlignment = GridData.FILL;
				composite.setLayoutData(data);
			}
			Label containerLabel = new Label(composite, SWT.LEFT);
			{
				containerLabel.setText("Target Model");

				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				containerLabel.setLayoutData(data);
			}
			Combo targetModel = new Combo(composite, SWT.LEFT);
			{
				targetModel.setText(model.getName());

				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				targetModel.setLayoutData(data);
				targetModel.setEnabled(false);
			}
			
			Label archLabel = new Label(composite, SWT.LEFT);
			{
				archLabel.setText("Architecture to Verify");
				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				archLabel.setLayoutData(data);
			}
			Combo arch = new Combo(composite, SWT.RIGHT);
			{
				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				data.grabExcessHorizontalSpace = true;
				arch.setLayoutData(data);
				
				for (String s : getCompositeComponentNames()) {
					arch.add(s);
				}
				
				if (arch.getItemCount() == 1) {
					arch.select(0);
				}
				arch.addModifyListener(validator);
			}
			
			setControl(composite);
		}

		protected ModifyListener validator = new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				
			}
		};
		
	}
	
	private Collection<String> getCompositeComponentNames() {
		Collection<String> names = new ArrayList<String>();
		
		for (org.sysadl.Package p : model.getPackages()) {
			for (ElementDef d : p.getDefinitions()) {
				if (d instanceof ComponentDef) {
					if (((ComponentDef) d).getComposite()!=null) {
						String displayName = (d instanceof ArchitectureDef? "Architecture " : "Component ") +p.getName()+"."+d.getName();
						map.put(displayName, d);
						names.add(displayName);
					}
				}
			}
		}
		return names;
	}

	public void setFile(IFile file) {
		this.file= file;
	}
}
