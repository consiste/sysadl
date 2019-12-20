package org.sysadl.verification.csp.ui;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.diagram.business.internal.metamodel.spec.DNodeListSpec;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.sysadl.ComponentDef;
import org.sysadl.Model;
import org.sysadl.util.SysADLUtil;
import org.sysadl.verification.fdr.adapters.FDRAdapterLoader;
import org.sysadl.verification.transformation.PerformTransformation;

public class Action implements IExternalJavaAction {
	private final String CONSOLE_NAME = "SysADL";
	
	public Action() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> arg0) {
		for (EObject e : arg0) {
			DNodeListSpec d = (DNodeListSpec) e;
			if (d.getTarget() instanceof ComponentDef) continue;
			else return false;
		}
		return true;
	}

	@Override
	public void execute(Collection<? extends EObject> arg0, Map<String, Object> arg1) {
		DNodeListSpec d = (DNodeListSpec) arg1.get("component");
		if (!(d.getTarget() instanceof ComponentDef)) {
			print("[SysADL Verification] "+d+" is not a component/architecture, aborting.");
			return;
		}
		
		ComponentDef comp = (ComponentDef) d.getTarget();
		if (comp.getComposite()==null) {
			print("[SysADL Verification] "+comp.getName()+" does not have a configuration, aborting.");
			return;
		}
		Model model = (Model) SysADLUtil.upToPackage(comp).eContainer();
	
		PerformTransformation.run(model, comp);
	}

	private MessageConsole findConsole(String name) {
		ConsolePlugin plugin = ConsolePlugin.getDefault();
		IConsoleManager conMan = plugin.getConsoleManager();
		IConsole[] existing = conMan.getConsoles();
		for (int i = 0; i < existing.length; i++)
			if (name.equals(existing[i].getName()))
				return (MessageConsole) existing[i];
		// no console found, so create a new one
		MessageConsole myConsole = new MessageConsole(name, null);
		conMan.addConsoles(new IConsole[] { myConsole });
		return myConsole;
	}
	
	private void print(String string) {
		MessageConsole myConsole = findConsole(CONSOLE_NAME);
		MessageConsoleStream out = myConsole.newMessageStream();
		out.println(string);
		System.out.println(string); // for development purposes
	}

}
