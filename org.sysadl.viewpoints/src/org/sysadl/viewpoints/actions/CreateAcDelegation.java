package org.sysadl.viewpoints.actions;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.sysadl.ActivityDef;
import org.sysadl.ActivityDelegation;
import org.sysadl.ActivityFlowable;

public class CreateAcDelegation implements IExternalJavaAction {

	public CreateAcDelegation() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> arg0) {
		return true;
	}

	@Override
	public void execute(Collection<? extends EObject> arg0, Map<String, Object> arg1) {
		ActivityFlowable source = (ActivityFlowable) arg1.get("source");
		ActivityFlowable target = (ActivityFlowable) arg1.get("target");
		ActivityDef ac = (ActivityDef) source.eContainer();
		ActivityDelegation newDelegation = org.sysadl.SysADLFactory.eINSTANCE.createActivityDelegation();
		newDelegation.setSource(source);
		newDelegation.setTarget(target);
		ac.getBody().getFlows().add(newDelegation);
	}

}
