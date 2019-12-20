package org.sysadl.verification.csp;

import java.io.IOException;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.sysadl.Model;
import org.sysadl.SysADLPackage;
import org.sysadl.SysADLFactory;
import org.sysadl.grammar.util.SysADLGrammarUtil;
import org.eclipse.emf.common.util.URI;

import com.google.inject.Injector;
import java.awt.FileDialog;
import javax.swing.JFrame;
import java.io.File;


public class SysADLCSPVerification implements IHandler {

	@Override
	public void addHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		if (window != null) {
			IStructuredSelection selection = (IStructuredSelection) window.getSelectionService().getSelection();
			IFile file = (IFile) selection.getFirstElement();
			
			Model m = SysADLGrammarUtil.getInstance().getModel(file);
			System.out.println(m.getName());
			
			
			
			SysADLVerificationWizard wiz = new SysADLVerificationWizard();
			wiz.init(PlatformUI.getWorkbench());
			wiz.setModel(m);
			wiz.setFile(file);
			WizardDialog dialog = new WizardDialog(wiz.getShell(), wiz);
			dialog.open();
			
//			String filePath = null; // put here the path to the file u wanna load
//
//			// just to be nice, select the file with a file dialog
//
//			FileDialog dialogTeste = new FileDialog(new JFrame());
//			dialogTeste.setTitle("Select external archive");
//			dialogTeste.setVisible(true);
//			for (File f : dialogTeste.getFiles()) {
//				filePath = f.getAbsolutePath();
//			}
//			
//			SysADLStandaloneSetup s = new SysADLStandaloneSetup();
//			SysADLPackage.eINSTANCE.eClass();
//			Injector i = s.createInjectorAndDoEMFRegistration();
//			ResourceSet rs = i.getInstance(XtextResourceSet.class);
//			Resource r = rs.getResource(URI.createFileURI(filePath), true);
//			try {
//				r.load(null);
//				Model m = (Model) r.getContents().get(0);
//				System.out.println(m.getName());
//				
//				SysADLVerificationWizard wiz = new SysADLVerificationWizard();
//				wiz.init(PlatformUI.getWorkbench());
//				wiz.setModel(m);
//				WizardDialog dialog = new WizardDialog(wiz.getShell(), wiz);
//				dialog.open();
//				 				
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			
		}

		return null;
	}

	@Override
	public boolean isEnabled() {
		// this is only enable if the FDR is found
		return true;
	}

	@Override
	public boolean isHandled() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void removeHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub

	}

}
