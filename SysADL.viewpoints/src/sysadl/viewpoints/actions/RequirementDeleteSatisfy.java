package sysadl.viewpoints.actions;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.action.AbstractExternalJavaAction;
import org.eclipse.sirius.diagram.DEdge;
import org.eclipse.sirius.diagram.DNode;
import org.eclipse.sirius.diagram.EdgeTarget;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

import sysADL_Sintax.ElementDef;
import sysADL_Sintax.Model;
import sysADL_Sintax.Requirement;
import sysADL_Sintax.SysADLPackage;

public class RequirementDeleteSatisfy extends AbstractExternalJavaAction {

	@Override
	public boolean canExecute(Collection<? extends EObject> arg0) {
		for (EObject e : arg0) {
			if (!(e instanceof Requirement)) {
				return false;
			}
		} //  Might need fix
		return true; 
	}

	@Override
	public void execute(Collection<? extends EObject> arg0, Map<String, Object> arg1) {
		for (EObject arg : arg0) {
			Requirement e = (Requirement) arg;
			
			DNode e1 = (DNode) getOptionalParameter(arg1, "element", DEdge.class).getTargetNode();
			ElementDef element = (ElementDef) e1.getTarget();
			
			e.getSatisfiedBy().remove(element);
			// add back to the model involved elements list, so the element will not vanish
			Model m = getOptionalParameter(arg1, "model", Model.class);
			m.getInvolvedElements().add(element);
		}
	}

}
