package sysadl.viewpoints.actions;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.action.AbstractExternalJavaAction;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

import sysADL_Sintax.ElementDef;
import sysADL_Sintax.Model;

public class RequirementDeleteElement extends AbstractExternalJavaAction {

	@Override
	public boolean canExecute(Collection<? extends EObject> arg0) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void execute(Collection<? extends EObject> arg0, Map<String, Object> arg1) {
		System.out.println("Trying to delete " + arg0);
		for (EObject obj : arg0) {
			ElementDef e = (ElementDef) obj;
			Model m = getOptionalParameter(arg1, "model", Model.class);
			System.out.println(m + " " + m.getClass());
			m.getInvolvedElements().remove(e);
			if (e.getSatisfies() != null) {
				e.getSatisfies().getSatisfiedBy().remove(e);
			}
		}
	}

}