package org.sysadl.providers;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.console.ConsolePlugin;

import br.consiste.SysADLStandaloneSetup;
import sysADL_Sintax.ConditionalLogicalExpression;
import sysADL_Sintax.ConditionalTestExpression;
import sysADL_Sintax.Expression;
import sysADL_Sintax.LogicalExpression;
import sysADL_Sintax.Model;
import sysADL_Sintax.SysADLFactory;
import sysADL_Sintax.impl.SysADLFactoryImpl;

public class ExpressionProvider {
	public static Expression exp1 = exp1(); // value: 2
	public static ConditionalTestExpression conditionalTest1; 
	public static ConditionalTestExpression conditionalTest2; 
	public static ConditionalTestExpression conditionalTest3; 
	
	private static SysADLFactory factory = SysADLFactoryImpl.eINSTANCE;
	
	private static Expression exp1() {
		ConditionalTestExpression exp = factory.createConditionalTestExpression();
		ConditionalLogicalExpression exp_op1 = factory.createConditionalLogicalExpression();
		exp.setOp1(exp_op1);
		LogicalExpression exp1_op1 = factory.createLogicalExpression();
		exp_op1.setOp1(exp1_op1);
		// ...
		// continue 
		return exp;
	}
	
	public static void snippet() {
		// The following code is supposed to read a string and parse as a xtext model
		 try {
			 
			Shell shell = ConsolePlugin.getStandardDisplay().getActiveShell();
			FileDialog dialog = new FileDialog(shell, SWT.OPEN);
			dialog.setFilterExtensions(new String [] {"*.sysadl"});
			String filePath = dialog.open();
			File file = new File(filePath); // path to file
			InputStream fileStream = new FileInputStream(file);
			new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("../");
			com.google.inject.Injector injector = new SysADLStandaloneSetup().createInjectorAndDoEMFRegistration();
			XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
			resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
			Resource resource = resourceSet.createResource(URI.createURI("dummy:/example.sysadl"));
		
			resource.load(fileStream, resourceSet.getLoadOptions());
			// 
			
			Model model = (Model) resource.getContents().get(0); // model is a sysadl model
			
			System.out.println("Loaded model: " + model.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
