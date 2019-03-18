package org.sysadl.execution.engine;

import org.eclipse.emf.ecore.EObject;
import org.sysadl.ActionUse;
import org.sysadl.Executable;
import org.sysadl.ExecutableAllocation;
import org.sysadl.Model;

public class ExecutionUtil {
	public static Model getModel(EObject e) {
		EObject val = e;
		while (!(val instanceof Model)) {
			val = val.eContainer(); // might be infinite loop
		}
		return (Model) val;
	}
	
	public static Executable getExecutablesFor(ActionUse e) {
		Executable r = null;
		Model m = getModel(e);
		if (m.getAllocation()==null) return null;
		for (Object a : m.getAllocation().getAllocs()) {
			if (a instanceof ExecutableAllocation) {
				if (((ExecutableAllocation) a).getTarget() == e.getDefinition()) {
					return ((ExecutableAllocation) a).getSource();
				}
			}
		}
		return r;
	}
}
