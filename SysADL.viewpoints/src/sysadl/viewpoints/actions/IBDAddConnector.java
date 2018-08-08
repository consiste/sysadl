package sysadl.viewpoints.actions;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.action.AbstractExternalJavaAction;
import org.eclipse.sirius.diagram.DNode;

import sysADL_Sintax.ComponentDef;
import sysADL_Sintax.ComponentUse;
import sysADL_Sintax.Configuration;
import sysADL_Sintax.ConnectorBinding;
import sysADL_Sintax.ConnectorDef;
import sysADL_Sintax.ConnectorUse;
import sysADL_Sintax.PortUse;

import sysADL_Sintax.SysADLFactory;

public class IBDAddConnector extends AbstractExternalJavaAction {

	@Override
	public boolean canExecute(Collection<? extends EObject> arg0) {
		// TODO Auto-generated method stub
		/*for (EObject e : arg0) {
			System.out.println("("+e.getClass().getName()+")");
		}*/
		return true;
	}

	@Override
	public void execute(Collection<? extends EObject> arg0, Map<String, Object> arg1) {
		/* available variables:
		 * - sourceView (DNode)
		 * - targetView (DNode)
		 * - source (PortUse)
		 * - target (PortUse)
		 * use [sourceView|targetview].eContainer().target to retrieve ComponentUse 
		 * */
		DNode sourceView = getOptionalParameter(arg1,"sourceView", DNode.class);
		PortUse source = getOptionalParameter(arg1, "source", PortUse.class);
		PortUse target = getOptionalParameter(arg1, "target", PortUse.class);
		
		/* two situations:
		 * ComponentIBD - Composite port
		 * ConnectorIBD - Composite port
		 * IBD (doesnt matter) - normal ports
		 */
		Configuration conf = null;
		EObject container = ((DNode)sourceView.eContainer()).getTarget();
		if (container instanceof ComponentUse) { // in this case, its a normal connector 
			conf = (Configuration) ((ComponentUse) container).eContainer();
		} else if (container instanceof PortUse) { // composite port
			EObject containerContainer = container.eContainer();
			
			// port use on proxy port
			if (containerContainer instanceof ComponentDef) {
				conf = ((ComponentDef)containerContainer).getComposite();
			} else if (containerContainer instanceof ConnectorDef) {
				conf = ((ConnectorDef)containerContainer).getComposite();
			}
			else { // final case, composite port on ComponentUse
				conf = (Configuration) containerContainer.eContainer();
			}
		} 
		
		ConnectorUse newConnector = SysADLFactory.eINSTANCE.createConnectorUse();
		
		// case simple connector
		ConnectorBinding tempBinding = SysADLFactory.eINSTANCE.createConnectorBinding(); // this binding is wrong, need to know connector type in advance
		newConnector.getBindings().add(tempBinding);
		tempBinding.setFirstPort(source);
		tempBinding.setSecondPort(target);
		
		conf.getConnectors().add(newConnector);
	}

}
