package sysadl.viewpoints.actions;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.action.AbstractExternalJavaAction;

import org.sysadl.ElementDef;
import org.sysadl.Model;
import org.sysadl.Requirement;

public class RequirementDeleteElement extends AbstractExternalJavaAction {

	@Override
	public boolean canExecute(Collection<? extends EObject> arg0) {
		for (EObject e : arg0) {
			if (!(e instanceof ElementDef)) {
				return false;
			}
		}
		return true; 
	}

	@Override
	public void execute(Collection<? extends EObject> arg0, Map<String, Object> arg1) {
		for (EObject obj : arg0) {
			ElementDef e = (ElementDef) obj;
			Model m = getOptionalParameter(arg1, "model", Model.class);
			// for each requirement, find those
			for (Object _r : m.getRequirements()) {
				Requirement r = (Requirement) _r;
				
				if (r.getSatisfiedBy().contains(e)) {
					r.getSatisfiedBy().remove(e);
				}
			}
			// also remove from the default list
			m.getInvolvedElements().remove(e);
			
		}
	}

}
