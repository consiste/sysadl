package sysadl.viewpoints.actions;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.sysadl.AbstractComponentDef;
import org.sysadl.AbstractConnectorDef;
import org.sysadl.AbstractDef;
import org.sysadl.AbstractPortUse;
import org.sysadl.ComponentDef;
import org.sysadl.ConnectorDef;
import org.sysadl.PortUse;

public class ApplyStyle implements IExternalJavaAction {

	public ApplyStyle() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> arg0) {
		// can always execute
		return true;
	}

	@Override
	public void execute(Collection<? extends EObject> arg0, Map<String, Object> arg1) {
		Object element = arg1.get("style");
		for (EObject obj : arg0) {
			if (obj instanceof ComponentDef) {
				((ComponentDef) obj).setAbstractComponent((AbstractComponentDef) element);
			}
			else if (obj instanceof ConnectorDef) {
				((ConnectorDef) obj).setAbstractConnector((AbstractConnectorDef) element);
			}
			else if (obj instanceof PortUse) {
				((PortUse) obj).setAbstractPort((AbstractPortUse) element);
			}
		}
	}

}
