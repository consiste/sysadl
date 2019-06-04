package org.sysadl.util;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

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
import org.sysadl.LiteralExpression;
import org.sysadl.LogicalExpression;
import org.sysadl.Model;
import org.sysadl.MultiplicativeExpression;
import org.sysadl.NullLiteralExpression;
import org.sysadl.PortUse;
import org.sysadl.RelationalExpression;
import org.sysadl.ShiftExpression;
import org.sysadl.SysADLFactory;
import org.sysadl.impl.SysADLFactoryImpl;

public class SysADLCreationTools {
	public static Model getInitialModelObject() {
		SysADLFactory factory = SysADLFactoryImpl.eINSTANCE; 
		// Model
		org.sysadl.Model m = factory.createModel();
		m.setName("SysADLArchitecture");
		
		// Initial Package
		org.sysadl.Package p = factory.createPackage();
		p.setName("SysADL.types");
		m.getPackages().add(p);
		
		// Basic types
		org.sysadl.ValueTypeDef typeInt = factory.createValueTypeDef();
		typeInt.setName("Int");
		p.getDefinitions().add(typeInt);
		org.sysadl.ValueTypeDef typeBool = factory.createValueTypeDef();
		typeBool.setName("Boolean");
		p.getDefinitions().add(typeBool);
		org.sysadl.ValueTypeDef typeString = factory.createValueTypeDef();
		typeString.setName("String");
		p.getDefinitions().add(typeString);
		org.sysadl.ValueTypeDef typeVoid = factory.createValueTypeDef();
		typeVoid.setName("Void");
		p.getDefinitions().add(typeVoid);
		org.sysadl.ValueTypeDef typeReal = factory.createValueTypeDef();
		typeReal.setName("Real");
		p.getDefinitions().add(typeReal);
		
		return m;
	}
	
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
}