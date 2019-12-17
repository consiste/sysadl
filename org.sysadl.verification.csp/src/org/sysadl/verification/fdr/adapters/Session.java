package org.sysadl.verification.fdr.adapters;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Collection;

//import uk.ac.ox.cs.fdr.Assertion;
//import uk.ac.ox.cs.fdr.FileLoadError;
//import uk.ac.ox.cs.fdr.InputFileError;
//import uk.ac.ox.cs.fdr.Session;
//import uk.ac.ox.cs.fdr.fdr;

public class Session {
	
	private FDRAdapterLoader loader;

	private Class adapteeClass;
	private Object adaptee;
	
	public Session() {
		try {
			loader = FDRAdapterLoader.getInstance();
			adapteeClass = loader.loadClass(FDRAdapterLoader.sessionClasspath);
			
			Constructor c = adapteeClass.getConstructor();
			adaptee = c.newInstance();
		} catch (MalformedURLException | ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
	}

	public void loadFile(String string) {
		Method loadfile;
		try {
			loadfile = adapteeClass.getMethod("loadFile", String.class);
			loadfile.invoke(adaptee, string);
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
	}

	public Collection<Assertion> assertions() {
		Method assertions;
		try {
			assertions = adapteeClass.getMethod("assertions");
			
			Collection<?> invokationResult = (Collection<?>) assertions.invoke(adaptee);
			ArrayList<Assertion> result = new ArrayList<Assertion>();
			for (Object assertion : invokationResult) {
				result.add(new Assertion(assertion));
			}
			
			return result;
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
	}

}
