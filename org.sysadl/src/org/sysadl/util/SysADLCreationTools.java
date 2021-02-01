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
			EList<?> ports = ((CompositePortDef) p.getDefinition()).getPorts();
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
		PortUse newP;
		for (PortUse port : p.getDefinition().getPorts()) {
			newP = SysADLFactory.eINSTANCE.createPortUse();
			newP.setName(port.getName());
			newP.setDefinition(port.getDefinition());
			newP.setLowerBound(port.getLowerBound());
			newP.setUpperBound(port.getUpperBound());
			newP.setAbstractPort(port.getAbstractPort());
			l.add(newP);
		}
		return l;
	}
	
	public static EList clonePorts(ComponentUse p) {
		EList l = new BasicEList();
		PortUse newP;
		for (PortUse port : p.getDefinition().getPorts()) {
			newP = SysADLFactory.eINSTANCE.createPortUse();
			newP.setName(port.getName());
			newP.setDefinition(port.getDefinition());
			newP.setLowerBound(port.getLowerBound());
			newP.setUpperBound(port.getUpperBound());
			newP.setAbstractPort(port.getAbstractPort());
			l.add(newP);
		}
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