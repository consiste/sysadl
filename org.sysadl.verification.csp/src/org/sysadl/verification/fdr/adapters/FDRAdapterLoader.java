package org.sysadl.verification.fdr.adapters;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class FDRAdapterLoader {
	protected static final String sessionClasspath = "uk.ac.ox.cs.fdr.Session";
	protected static final String assertionClasspath = "uk.ac.ox.cs.fdr.Assertion";
	protected static final String fdrClasspath = "uk.ac.ox.cs.fdr.fdr";
	protected static final String inputFileErrorClasspath = "uk.ac.ox.cs.fdr.InputFileError";
	protected static final String fileLoadErrorClasspath = "uk.ac.ox.cs.fdr.FileLoadError";
	protected static final String cancellerClasspath = "uk.ac.ox.cs.fdr.Canceller";
	
	protected ClassLoader loader;
	
	private static FDRAdapterLoader instance;
	
	protected static FDRAdapterLoader getInstance() throws MalformedURLException {
		if (instance==null) instance = new FDRAdapterLoader();
		return instance;
	}
	
	private FDRAdapterLoader() throws MalformedURLException {
		loader = getClass().getClassLoader();
		File f = null; // TODO get from configuration
		
		for (File jar : f.listFiles()) {
			// TODO selet only the jar files
			loader = URLClassLoader.newInstance(
				new URL[] { jar.toURL() }, 
		        loader
		    );
		}
	}

	public Class loadClass(String classpath) throws ClassNotFoundException {
		return loader.loadClass(classpath);
	}
	
}
