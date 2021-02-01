package org.sysadl.grammar.util;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.sysadl.Model;
import org.sysadl.SysADLPackage;
import org.sysadl.SysADLStandaloneSetup;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.emf.ecore.resource.Resource;

import com.google.inject.Injector;

public class SysADLGrammarUtil {
	private SysADLStandaloneSetup s;
	private static SysADLGrammarUtil instance;
	
	public static SysADLGrammarUtil getInstance() {
		if (instance==null) instance = new SysADLGrammarUtil();
		return instance;
	}
	
	private SysADLGrammarUtil() {
		s = new SysADLStandaloneSetup();
		SysADLPackage.eINSTANCE.eClass();
		s.createInjectorAndDoEMFRegistration();
	}
	
	public String nodeText(EObject exp) {
		if (exp==null) return "";
		INode expNode = NodeModelUtils.getNode(exp);
		return NodeModelUtils.getTokenText(expNode);
	}
	
	public Model getModel(IFile file) {
		IPath p = file.getFullPath();
		URI uri = URI.createFileURI(p.toString());
		return getModel(uri);
	}
	
	public Model getModel(URI uri) {
		Injector i = s.createInjector();
		
		ResourceSet rs = i.getInstance(XtextResourceSet.class);
		Resource r = rs.getResource(uri, true);
		return (Model) r.getContents().get(0);
	}

	public Injector createInjector() {
		return s.createInjector();
	}

}
