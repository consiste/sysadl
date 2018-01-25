package sysadl.viewpoints.actions;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.action.AbstractExternalJavaAction;

import sysADL_Sintax.ElementDef;
import sysADL_Sintax.Model;
import sysADL_Sintax.Requirement;

public class RequirementAssignSatisfy extends AbstractExternalJavaAction {

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
		System.out.println("Executing...");
		ElementDef element = getOptionalParameter(arg1, "source", ElementDef.class);
		Requirement req = getOptionalParameter(arg1, "target", Requirement.class);
		
		// add element in the requirement satisfiction list
		req.getSatisfiedBy().add(element);
		
		// remove the element from the involvedElements list
		Model m = ((Model) req.eContainer());
		m.getInvolvedElements().remove(element);
	}



}
