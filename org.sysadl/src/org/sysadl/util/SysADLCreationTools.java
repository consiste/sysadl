package org.sysadl.util;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.sysadl.AbstractActivityDef;
import org.sysadl.AbstractComponentDef;
import org.sysadl.AbstractConnectorDef;
import org.sysadl.AbstractPortUse;
import org.sysadl.AdditiveExpression;
import org.sysadl.BooleanLiteralExpression;
import org.sysadl.ClassificationExpression;
import org.sysadl.ComponentUse;
import org.sysadl.CompositePortDef;
import org.sysadl.ConditionalLogicalExpression;
import org.sysadl.ConditionalTestExpression;
import org.sysadl.ConnectorUse;
import org.sysadl.EqualityExpression;
import org.sysadl.Expression;
import org.sysadl.AbstractFlow;
import org.sysadl.Invariant;
import org.sysadl.LiteralExpression;
import org.sysadl.LogicalExpression;
import org.sysadl.Model;
import org.sysadl.MultiplicativeExpression;
import org.sysadl.NullLiteralExpression;
import org.sysadl.PortUse;
import org.sysadl.RelationalExpression;
import org.sysadl.ShiftExpression;
import org.sysadl.Style;
import org.sysadl.SysADLFactory;
import org.sysadl.impl.SysADLFactoryImpl;

public class SysADLCreationTools {
	public static EList clonePorts(PortUse p) {
		EList l = new BasicEList();
		if (p.getDefinition() instanceof CompositePortDef) {
			EList ports = ((CompositePortDef) p.getDefinition()).getPorts();
			for (Object lp : ports) {
				PortUse _p = (PortUse) lp;
				PortUse newp = SysADLFactoryImpl.eINSTANCE.createPortUse();
				newp.setName(_p.getName());
				newp.setLowerBound(_p.getLowerBound());
				newp.setUpperBound(_p.getUpperBound());
				newp.setDefinition(_p.getDefinition());
				l.add(newp);
			}
		}
		return l;
	}
	public static EList clonePorts(ConnectorUse p) {
		EList l = new BasicEList();
		// TODO
		return l;
	}
	public static EList clonePorts(ComponentUse p) {
		EList l = new BasicEList();
		// TODO
		return l;
	}
	
	public static Model getModel(EObject e) {
		EObject val = e;
		while (!(val instanceof Model)) {
			val = val.eContainer(); // might be infinite loop
		}
		return (Model) val;
	}

	public static Expression createTrueExpression() {
		ConditionalTestExpression exp = SysADLFactory.eINSTANCE.createConditionalTestExpression();
		// implies
		ConditionalLogicalExpression c0 = SysADLFactory.eINSTANCE.createConditionalLogicalExpression();
		// or
		ConditionalLogicalExpression c1 = SysADLFactory.eINSTANCE.createConditionalLogicalExpression();
		// and
		ConditionalLogicalExpression c2 = SysADLFactory.eINSTANCE.createConditionalLogicalExpression();
		// inclusive or
		LogicalExpression l0 = SysADLFactory.eINSTANCE.createLogicalExpression();
		// exclusive or
		LogicalExpression l1 = SysADLFactory.eINSTANCE.createLogicalExpression();
		// and expression
		LogicalExpression l2 = SysADLFactory.eINSTANCE.createLogicalExpression();
		// equality
		EqualityExpression e = SysADLFactory.eINSTANCE.createEqualityExpression();
		// classification
		ClassificationExpression c = SysADLFactory.eINSTANCE.createClassificationExpression();
		// relational
		RelationalExpression r = SysADLFactory.eINSTANCE.createRelationalExpression();
		// shift
		ShiftExpression s = SysADLFactory.eINSTANCE.createShiftExpression();
		// additive
		AdditiveExpression a = SysADLFactory.eINSTANCE.createAdditiveExpression();
		// multiplicative
		MultiplicativeExpression m = SysADLFactory.eINSTANCE.createMultiplicativeExpression();
		//NullLiteralExpression n = SysADLFactory.eINSTANCE.createNullLiteralExpression();
		// unary
		BooleanLiteralExpression n = SysADLFactory.eINSTANCE.createBooleanLiteralExpression();
		n.setIsTrue(true);
		exp.setOp1(c0);
		c0.setOp1(c1);
		c1.setOp1(c2);
		c2.setOp1(l0);
		l0.setOp1(l1);
		l1.setOp1(l2);
		l2.setOp1(e);
		e.setOp1(c);
		c.setOp(r);
		r.setOp1(s);
		s.setOp1(a);
		a.setOp1(m);
		m.setOp1(n);
		
		return exp;
	}
	
	
	public static Style createIoTStyle() {
		Style IoTStyle = SysADLFactory.eINSTANCE.createStyle();
		IoTStyle.setName("IoTStyle");
		
		// ports
		AbstractPortUse sensorOPT = SysADLFactory.eINSTANCE.createAbstractPortUse();
		sensorOPT.setName("SensorOPT");
		AbstractPortUse sensorIPT = SysADLFactory.eINSTANCE.createAbstractPortUse();
		sensorIPT.setName("SensorIPT");
		AbstractPortUse actuatorOPT = SysADLFactory.eINSTANCE.createAbstractPortUse();
		actuatorOPT.setName("ActuatorOPT");
		AbstractPortUse actuatorIPT = SysADLFactory.eINSTANCE.createAbstractPortUse();
		actuatorIPT.setName("ActuatorIPT");
		AbstractPortUse deviceOPT = SysADLFactory.eINSTANCE.createAbstractPortUse();
		deviceOPT.setName("DeviceOPT");
		AbstractPortUse deviceIPT = SysADLFactory.eINSTANCE.createAbstractPortUse();
		deviceIPT.setName("DeviceIPT");
		AbstractPortUse dataOPT = SysADLFactory.eINSTANCE.createAbstractPortUse();
		dataOPT.setName("DataOPT");
		AbstractPortUse dataIPT = SysADLFactory.eINSTANCE.createAbstractPortUse();
		dataIPT.setName("DataIPT");
		AbstractPortUse serviceOPT = SysADLFactory.eINSTANCE.createAbstractPortUse();
		serviceOPT.setName("ServiceOPT");
		AbstractPortUse serviceIPT = SysADLFactory.eINSTANCE.createAbstractPortUse();
		serviceIPT.setName("ServiceIPT");
		
		// components
		AbstractComponentDef sensor = SysADLFactory.eINSTANCE.createAbstractComponentDef();
		sensor.setName("SensorCP");
		sensor.getPorts().add(sensorOPT);
		
		AbstractComponentDef actuator = SysADLFactory.eINSTANCE.createAbstractComponentDef();
		actuator.setName("ActuatorCP");
		actuator.getPorts().add(actuatorIPT);
		
		AbstractComponentDef datastore = SysADLFactory.eINSTANCE.createAbstractComponentDef();
		datastore.setName("DataStoreCP");
		datastore.getPorts().add(dataIPT);
		datastore.getPorts().add(dataOPT);
		
		AbstractComponentDef controller = SysADLFactory.eINSTANCE.createAbstractComponentDef();
		controller.setName("ControllerCP");
		controller.getPorts().add(sensorIPT);
		controller.getPorts().add(actuatorOPT);
		
		AbstractComponentDef gateway = SysADLFactory.eINSTANCE.createAbstractComponentDef();
		gateway.setName("GatewayCP");
		gateway.getPorts().add(deviceIPT);
		gateway.getPorts().add(serviceIPT);
		gateway.getPorts().add(serviceOPT);
		gateway.getComposition().add(datastore);
		
		AbstractComponentDef device = SysADLFactory.eINSTANCE.createAbstractComponentDef();
		device.setName("DeviceCP");
		device.getPorts().add(deviceOPT);
		device.getPorts().add(sensorIPT);
		device.getPorts().add(actuatorOPT);
		device.getPorts().add(serviceIPT);
		device.getComposition().add(sensor);
		device.getComposition().add(actuator);
		device.getComposition().add(controller);
		device.getComposition().add(gateway);
		device.getComposition().add(datastore);
		
		AbstractComponentDef IoTARCH = SysADLFactory.eINSTANCE.createAbstractComponentDef();
		IoTARCH.setName("IoTARCH");
		device.getComposition().add(sensor);
		device.getComposition().add(actuator);
		device.getComposition().add(device);
		device.getComposition().add(gateway);
		device.getComposition().add(datastore);
		
		// connectors
		AbstractConnectorDef sensorDataCN = SysADLFactory.eINSTANCE.createAbstractConnectorDef();
		sensorDataCN.setName("SensorDataCN");
		sensorDataCN.getPorts().add(sensorOPT);
		sensorDataCN.getPorts().add(sensorIPT);
		AbstractFlow f = SysADLFactory.eINSTANCE.createAbstractFlow();
		f.setSource(sensorOPT);
		f.setSource(sensorIPT);
		sensorDataCN.getFlows().add(f);
		
		AbstractConnectorDef actuatorCommandCN = SysADLFactory.eINSTANCE.createAbstractConnectorDef();
		actuatorCommandCN.setName("ActuatorCommandCN");
		sensorDataCN.getPorts().add(actuatorOPT);
		sensorDataCN.getPorts().add(actuatorIPT);
		f.setSource(actuatorOPT);
		f.setSource(actuatorIPT);
		sensorDataCN.getFlows().add(f);
		
		AbstractConnectorDef deviceDataCN = SysADLFactory.eINSTANCE.createAbstractConnectorDef();
		deviceDataCN.setName("DeviceDataCN");
		sensorDataCN.getPorts().add(deviceOPT);
		sensorDataCN.getPorts().add(deviceIPT);
		f.setSource(deviceOPT);
		f.setSource(deviceIPT);
		sensorDataCN.getFlows().add(f);
		
		AbstractConnectorDef datastoreCN = SysADLFactory.eINSTANCE.createAbstractConnectorDef();
		datastoreCN.setName("DataStoreCN");
		sensorDataCN.getPorts().add(dataOPT);
		sensorDataCN.getPorts().add(dataIPT);
		f.setSource(dataOPT);
		f.setSource(dataIPT);
		sensorDataCN.getFlows().add(f);
		
		AbstractConnectorDef serviceCN = SysADLFactory.eINSTANCE.createAbstractConnectorDef();
		serviceCN.setName("ServiceCN");
		sensorDataCN.getPorts().add(serviceOPT);
		sensorDataCN.getPorts().add(serviceIPT);
		f.setSource(serviceOPT);
		f.setSource(serviceIPT);
		sensorDataCN.getFlows().add(f);
		
		// activities
		AbstractActivityDef monitoring = SysADLFactory.eINSTANCE.createAbstractActivityDef();
		monitoring.setName("Monitoring");
		AbstractActivityDef analysis = SysADLFactory.eINSTANCE.createAbstractActivityDef();
		analysis.setName("Analysis");
		AbstractActivityDef planning = SysADLFactory.eINSTANCE.createAbstractActivityDef();
		planning.setName("Planning");
		AbstractActivityDef execution = SysADLFactory.eINSTANCE.createAbstractActivityDef();
		execution.setName("Execution");
		
		// constraints
		Invariant checkSensorCP = SysADLFactory.eINSTANCE.createInvariant();
		checkSensorCP.setName("checkSensorCP");
		checkSensorCP.setExpr("self.checkCPRecursive(self, 'SensorCP')");

		Invariant checkDataStoreCP = SysADLFactory.eINSTANCE.createInvariant();
		checkDataStoreCP.setName("checkDataStoreCP");
		checkDataStoreCP.setExpr("self.checkCPRecursive(self, 'DataStoreCP')");
		
		Invariant checkDeviceCP = SysADLFactory.eINSTANCE.createInvariant();
		checkDeviceCP.setName("checkDeviceCP");
		checkDeviceCP.setExpr("self.checkCPRecursive(self, 'DeviceCP')");
		
		Invariant checkSensorOPT = SysADLFactory.eINSTANCE.createInvariant();
		checkSensorOPT.setName("checkSensorOPT");
		checkSensorOPT.setExpr("self.checkPTRecursive(self, 'SensorOPT')");
		
		Invariant checkActuatorIPT = SysADLFactory.eINSTANCE.createInvariant();
		checkActuatorIPT.setName("checkActuatorIPT");
		checkActuatorIPT.setExpr("not (self.checkCPRecursive(self, 'ActuatorCP') xor self.checkPTRecursive(self, 'ActuatorIPT'))");
		
		Invariant checkDataIPT = SysADLFactory.eINSTANCE.createInvariant();
		checkDataIPT.setName("checkDataIPT");
		checkDataIPT.setExpr("self.checkPTRecursive(self, 'DataIPT')");
		
		Invariant checkDataOPT = SysADLFactory.eINSTANCE.createInvariant();
		checkDataOPT.setName("checkDataOPT");
		checkDataOPT.setExpr("self.checkPTRecursive(self, 'DataOPT')");
		
		Invariant checkServiceOPT = SysADLFactory.eINSTANCE.createInvariant();
		checkServiceOPT.setName("checkServiceOPT");
		checkServiceOPT.setExpr("not (self.checkCPRecursive(self, 'GatewayCP') xor self.checkPTRecursive(self, 'ServiceOPT'))");
		
		Invariant checkDeviceIPT = SysADLFactory.eINSTANCE.createInvariant();
		checkDeviceIPT.setName("checkDeviceIPT");
		checkDeviceIPT.setExpr("not (self.checkCPRecursive(self, 'GatewayCP') xor self.checkPTRecursive(self, 'DeviceIPT'))");
		
		Invariant checkSensorDataCN = SysADLFactory.eINSTANCE.createInvariant();
		checkSensorDataCN.setName("checkSensorDataCN");
		checkSensorDataCN.setExpr("self.checkCNRecursive(self, 'SensorDataCN')");
		
		Invariant checkDataStoreCN = SysADLFactory.eINSTANCE.createInvariant();
		checkDataStoreCN.setName("checkDataStoreCN");
		checkDataStoreCN.setExpr("self.checkCNRecursive(self, 'DataStoreCN')");
		
		Invariant checkActuatorCommandCN = SysADLFactory.eINSTANCE.createInvariant();
		checkActuatorCommandCN.setName("checkActuatorCommandCN");
		checkActuatorCommandCN.setExpr("not (self.checkCPRecursive(self, 'ActuatorCP') xor self.checkCNRecursive(self, 'ActuatorCommandCN'))");
		
		Invariant checkServiceCN = SysADLFactory.eINSTANCE.createInvariant();
		checkServiceCN.setName("checkServiceCN");
		checkServiceCN.setExpr("not (self.checkCPRecursive(self, 'GatewayCP') xor self.checkCNRecursive(self, 'ServiceCN'))");
		
		Invariant checkDeviceDataCN = SysADLFactory.eINSTANCE.createInvariant();
		checkDeviceDataCN.setName("checkDeviceDataCN");
		checkDeviceDataCN.setExpr("not (self.checkPTRecursive(self, 'DeviceOPT') xor self.checkCNRecursive(self, 'DeviceDataCN'))");
		
		Invariant ControllerMustBeEmbeddedInDevice = SysADLFactory.eINSTANCE.createInvariant();
		ControllerMustBeEmbeddedInDevice.setName("ControllerMustBeEmbeddedInDevice");
		ControllerMustBeEmbeddedInDevice.setExpr("self.ControllerCPEmbedded(self)");
		
		Invariant SensorMustBeConnectedToDeviceOrController = SysADLFactory.eINSTANCE.createInvariant();
		SensorMustBeConnectedToDeviceOrController.setName("SensorMustBeConnectedToDeviceOrController");
		SensorMustBeConnectedToDeviceOrController.setExpr("self.SensorConnection(self)");
		
		Invariant ActuatorMustBeConnectedToDeviceOrController = SysADLFactory.eINSTANCE.createInvariant();
		ActuatorMustBeConnectedToDeviceOrController.setName("ActuatorMustBeConnectedToDeviceOrController");
		ActuatorMustBeConnectedToDeviceOrController.setExpr("self.ActuatorConnection(self)");
		
		Invariant SensorAndActuatorDontCommunicate = SysADLFactory.eINSTANCE.createInvariant();
		SensorAndActuatorDontCommunicate.setName("SensorAndActuatorDontCommunicate");
		SensorAndActuatorDontCommunicate.setExpr("self.Communication(self)");
		
		Invariant SensorDataCNMustNotBeMultiplex = SysADLFactory.eINSTANCE.createInvariant();
		SensorDataCNMustNotBeMultiplex.setName("SensorDataCNMustNotBeMultiplex");
		SensorDataCNMustNotBeMultiplex.setExpr("self.checkBindingsRecursive(self, 'SensorDataCN')");
		
		Invariant ActuatorCommandCNMustNotBeMultiplex = SysADLFactory.eINSTANCE.createInvariant();
		ActuatorCommandCNMustNotBeMultiplex.setName("ActuatorCommandCNMustNotBeMultiplex");
		ActuatorCommandCNMustNotBeMultiplex.setExpr("self.checkBindingsRecursive(self, 'ActuatorCommandCN')");
		
		Invariant DeviceDataCNMustNotBeMultiplex = SysADLFactory.eINSTANCE.createInvariant();
		DeviceDataCNMustNotBeMultiplex.setName("DeviceDataCNMustNotBeMultiplex");
		DeviceDataCNMustNotBeMultiplex.setExpr("self.checkBindingsRecursive(self, 'DeviceDataCN')");
		
		IoTStyle.getDefinitions().add(sensor);
		IoTStyle.getDefinitions().add(actuator);
		IoTStyle.getDefinitions().add(device);
		IoTStyle.getDefinitions().add(datastore);
		IoTStyle.getDefinitions().add(controller);
		IoTStyle.getDefinitions().add(gateway);
		
		IoTStyle.getDefinitions().add(sensorDataCN);
		IoTStyle.getDefinitions().add(actuatorCommandCN);
		IoTStyle.getDefinitions().add(deviceDataCN);
		IoTStyle.getDefinitions().add(datastoreCN);
		IoTStyle.getDefinitions().add(serviceCN);

		IoTStyle.getDefinitions().add(monitoring);
		IoTStyle.getDefinitions().add(analysis);
		IoTStyle.getDefinitions().add(planning);
		IoTStyle.getDefinitions().add(execution);
		
		IoTStyle.getInvariants().add(checkSensorCP);
		IoTStyle.getInvariants().add(checkDataStoreCP);
		IoTStyle.getInvariants().add(checkDeviceCP);
		IoTStyle.getInvariants().add(checkSensorOPT);
		IoTStyle.getInvariants().add(checkActuatorIPT);
		IoTStyle.getInvariants().add(checkDataIPT);
		IoTStyle.getInvariants().add(checkDataOPT);
		IoTStyle.getInvariants().add(checkServiceOPT);
		IoTStyle.getInvariants().add(checkDeviceIPT);
		IoTStyle.getInvariants().add(checkSensorDataCN);
		IoTStyle.getInvariants().add(checkDataStoreCN);
		IoTStyle.getInvariants().add(checkActuatorCommandCN);
		IoTStyle.getInvariants().add(checkServiceCN);
		IoTStyle.getInvariants().add(checkDeviceDataCN);
		
		IoTStyle.getInvariants().add(ControllerMustBeEmbeddedInDevice);
		IoTStyle.getInvariants().add(SensorMustBeConnectedToDeviceOrController);
		IoTStyle.getInvariants().add(ActuatorMustBeConnectedToDeviceOrController);
		IoTStyle.getInvariants().add(SensorAndActuatorDontCommunicate);
		IoTStyle.getInvariants().add(SensorDataCNMustNotBeMultiplex);
		IoTStyle.getInvariants().add(ActuatorCommandCNMustNotBeMultiplex);
		IoTStyle.getInvariants().add(DeviceDataCNMustNotBeMultiplex);
		
		return IoTStyle;
	}
}