package sysADL_Sintax.util;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import sysADL_Sintax.AdditiveExpression;
import sysADL_Sintax.ClassificationExpression;
import sysADL_Sintax.ComponentUse;
import sysADL_Sintax.CompositePortDef;
import sysADL_Sintax.ConditionalLogicalExpression;
import sysADL_Sintax.ConditionalTestExpression;
import sysADL_Sintax.ConnectorUse;
import sysADL_Sintax.EqualityExpression;
import sysADL_Sintax.Expression;
import sysADL_Sintax.LogicalExpression;
import sysADL_Sintax.Model;
import sysADL_Sintax.MultiplicativeExpression;
import sysADL_Sintax.NullLiteralExpression;
import sysADL_Sintax.PortUse;
import sysADL_Sintax.RelationalExpression;
import sysADL_Sintax.ShiftExpression;
import sysADL_Sintax.SysADLFactory;
import sysADL_Sintax.impl.SysADLFactoryImpl;

public class SysADLCreationTools {
	public static Model getInitialModelObject() {
		SysADLFactory factory = SysADLFactoryImpl.eINSTANCE; 
		// Model
		sysADL_Sintax.Model m = factory.createModel();
		m.setName("SysADLArchitecture");
		
		// Initial Package
		sysADL_Sintax.Package p = factory.createPackage();
		p.setName("SysADL.types");
		m.getPackages().add(p);
		
		// Basic types
		sysADL_Sintax.ValueTypeDef typeInt = factory.createValueTypeDef();
		typeInt.setName("Int");
		p.getArchitectures().add(typeInt);
		sysADL_Sintax.ValueTypeDef typeBool = factory.createValueTypeDef();
		typeBool.setName("Boolean");
		p.getArchitectures().add(typeBool);
		sysADL_Sintax.ValueTypeDef typeString = factory.createValueTypeDef();
		typeString.setName("String");
		p.getArchitectures().add(typeString);
		sysADL_Sintax.ValueTypeDef typeVoid = factory.createValueTypeDef();
		typeVoid.setName("Void");
		p.getArchitectures().add(typeVoid);
		sysADL_Sintax.ValueTypeDef typeReal = factory.createValueTypeDef();
		typeReal.setName("Real");
		p.getArchitectures().add(typeReal);
		
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

	public static Expression createNullExpression() {
		ConditionalTestExpression exp = SysADLFactory.eINSTANCE.createConditionalTestExpression();
		ConditionalLogicalExpression c0 = SysADLFactory.eINSTANCE.createConditionalLogicalExpression();
		ConditionalLogicalExpression c1 = SysADLFactory.eINSTANCE.createConditionalLogicalExpression();
		LogicalExpression l0 = SysADLFactory.eINSTANCE.createLogicalExpression();
		LogicalExpression l1 = SysADLFactory.eINSTANCE.createLogicalExpression();
		LogicalExpression l2 = SysADLFactory.eINSTANCE.createLogicalExpression();
		EqualityExpression e = SysADLFactory.eINSTANCE.createEqualityExpression();
		ClassificationExpression c = SysADLFactory.eINSTANCE.createClassificationExpression();
		RelationalExpression r = SysADLFactory.eINSTANCE.createRelationalExpression();
		ShiftExpression s = SysADLFactory.eINSTANCE.createShiftExpression();
		AdditiveExpression a = SysADLFactory.eINSTANCE.createAdditiveExpression();
		MultiplicativeExpression m = SysADLFactory.eINSTANCE.createMultiplicativeExpression();
		NullLiteralExpression n = SysADLFactory.eINSTANCE.createNullLiteralExpression();
		exp.setOp1(c0);
		c0.setOp1(c1);
		c1.setOp1(l0);
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