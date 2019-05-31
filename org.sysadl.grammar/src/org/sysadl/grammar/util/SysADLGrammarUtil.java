package org.sysadl.grammar.util;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.helper.OCLHelper;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.sysadl.Expression;
import org.sysadl.SysADLPackage;
import org.sysadl.SysADLPackage.Literals;

public class SysADLGrammarUtil {
	public static String nodeText(EObject exp) {
		if (exp==null) return "";
		INode expNode = NodeModelUtils.getNode(exp);
		String value = NodeModelUtils.getTokenText(expNode);
		return  value;
	}
	
	// TODO work here
	public static Object parseOCL(org.sysadl.Expression e) {
		String expr = nodeText(e);
		
		OCLExpression<EClassifier> query = null;
		
	    try {
			OCL<?, EClassifier, ?, ?, ?, ?, ?, ?, ?, Constraint, EClass, EObject> ocl;
		    ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
		    
		    // create an OCL helper object
		    OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl.createOCLHelper();
		    
		    // set the OCL context classifier
		    helper.setContext(SysADLPackage.Literals.CONFIGURATION);
	    
			Constraint constraint = helper.createInvariant("");
		} catch (ParserException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	    
		return null;
	}

}
