package sysadl.viewpoints.actions;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.action.AbstractExternalJavaAction;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

import sysADL_Sintax.ElementDef;
import sysADL_Sintax.Model;
import sysADL_Sintax.Requirement;

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
			m.getInvolvedElements().remove(e);
			if (e.getSatisfies() != null) {
				for (Object r : e.getSatisfies()) {
					((Requirement) r).getSatisfiedBy().remove(e);
				}
			}
		}
	}

}
