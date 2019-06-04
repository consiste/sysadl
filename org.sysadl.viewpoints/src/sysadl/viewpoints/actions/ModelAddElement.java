package sysadl.viewpoints.actions;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.action.AbstractExternalJavaAction;
import org.sysadl.ComponentDef;
import org.sysadl.ConnectorDef;
import org.sysadl.Model;
import org.sysadl.Package;
import org.sysadl.Protocol;
import org.sysadl.ProtocolBody;
import org.sysadl.SysADLFactory;
import org.sysadl.impl.ComponentDefImpl;
import org.sysadl.impl.ConnectorDefImpl;

public class ModelAddElement extends AbstractExternalJavaAction {

	@Override
	public boolean canExecute(Collection<? extends EObject> arg0) {
		return true;
	}

	@Override
	public void execute(Collection<? extends EObject> arg0, Map<String, Object> arg1) {
		SysADLFactory fac = SysADLFactory.eINSTANCE;
		for (EObject o : arg0) {
			System.out.println(o);
			switch ((String) arg1.get("type")) {
			case "Package":
				if (o instanceof Model)
					((Model) o).getPackages().add(fac.createPackage());
				break;
			case "Configuration":
				if (o instanceof ComponentDef) {
					((ComponentDef) o).setComposite(fac.createConfiguration());
				}
				if (o instanceof ConnectorDef) {
					((ConnectorDef) o).setComposite(fac.createConfiguration());
				}
				break;
			case "Protocol":
				if (o instanceof Package) {
					Protocol p = fac.createProtocol();
					ProtocolBody pb = fac.createProtocolBody();
					pb.setBody(fac.createProtocolBody());
					p.setBody(pb);
					((Package) o).getDefinitions().add(p);
				}
			default:
				// do nothing
				System.out.println("Didn't match anything");
				break;
			}

		}

	}

}
