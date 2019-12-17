package org.sysadl.verification.fdr.adapters;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;

public class Assertion {
	private FDRAdapterLoader loader;

	private Class adapteeClass;
	private Object adaptee;
	
	public Assertion(Object assertion) {
		try {
			loader = FDRAdapterLoader.getInstance();
			adaptee = assertion;
			adapteeClass = loader.loadClass(FDRAdapterLoader.assertionClasspath);
		} catch (MalformedURLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void execute(Object arg) {
		try {
			Class cancellerClass = loader.loadClass(FDRAdapterLoader.cancellerClasspath);
			Method execute = adapteeClass.getMethod("execute", cancellerClass);
			
			execute.invoke(adaptee, arg);
		} catch (NoSuchMethodException | SecurityException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
	}

	public boolean passed() {
		try {
			Method passed = adapteeClass.getMethod("passed");
			Object result = passed.invoke(adaptee);
			
			return (boolean) result;
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
		return false;
	}

}
