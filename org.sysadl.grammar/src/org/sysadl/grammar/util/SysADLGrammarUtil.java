package org.sysadl.grammar.util;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.sysadl.Expression;
import org.sysadl.SysADLPackage;
import org.sysadl.SysADLPackage.Literals;

public class SysADLGrammarUtil {
	public static String nodeText(EObject exp) {
		if (exp==null) return "";
		INode expNode = NodeModelUtils.getNode(exp);
		return NodeModelUtils.getTokenText(expNode);
	}
	

}
