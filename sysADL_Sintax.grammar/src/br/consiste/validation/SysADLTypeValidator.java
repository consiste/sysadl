package br.consiste.validation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.sysadl.CompositePortDef;
import org.sysadl.FlowProperty;
import org.sysadl.PortDef;
import org.sysadl.PortUse;
import org.sysadl.SimplePortDef;
import org.sysadl.TypeDef;

public class SysADLTypeValidator {
	public static boolean areTypesCompatible(TypeDef source, TypeDef target) {
		List<String> basicTypes = new ArrayList<String>(Arrays.asList("Int","String", "Boolean","Real"));
		// before any test, is the name of the types are equal, end of story
		if (target.equals(source)) return true;
		
		if (basicTypes.contains(source.getName())) {
			// t1 is basic type
			if (basicTypes.contains(target.getName())) {
				// t2 is also a basic type
				// type compatibility:
				// int accepts real
				// real accepts int
				// boolean accepts int
				// string only accepts string
			}
		} else {
			
		}
		// first case, t1 is a basic type and t2 too
		// second case, one of them is a basic type, the other is not
		return true; // TODO implement me
	}

	public static boolean arePortsCompatible(PortDef p1, PortDef p2) {
		// TODO special case, when p2 is type Void
		if (p1 instanceof SimplePortDef) {
			if (p2 instanceof SimplePortDef) {
				// simple ports, just check the flow property and the compatibility of flow types
				FlowProperty fp1 = ((SimplePortDef)p1).getFlowProperties();
				FlowProperty fp2 = ((SimplePortDef)p2).getFlowProperties();
				return fp1.equals(fp2) && SysADLTypeValidator.areTypesCompatible(((SimplePortDef) p1).getFlowType(), ((SimplePortDef) p2).getFlowType()); 
			} else
				return false;
		}
		if (p1 instanceof CompositePortDef) {
			if (p2 instanceof CompositePortDef) {
				// on composite ports the problem is a bit tricky
				// must exist a compatible port on p2 for each port on p1
				// the number of ports might be different, if the port compatibility is respected
				for (Object o : ((CompositePortDef) p1).getPorts()) {
					PortUse p = (PortUse) o;
					boolean found = false;
					for (Object op2 : ((CompositePortDef) p1).getPorts()) {
						if (arePortsCompatible(p.getDefinition(), ((PortUse)op2).getDefinition())) {
							found = true;
							break;
						}
					}
					if (!found) return false;
				}
				return true;
			} else
				return false;
		}
		return false; // TODO implement me
	}
}
