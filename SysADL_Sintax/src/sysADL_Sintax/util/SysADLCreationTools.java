package sysADL_Sintax.util;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import sysADL_Sintax.ComponentUse;
import sysADL_Sintax.CompositePortDef;
import sysADL_Sintax.ConnectorUse;
import sysADL_Sintax.Model;
import sysADL_Sintax.PortUse;
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
}
