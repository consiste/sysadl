package org.sysadl.verification.fdr.adapters;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.preferences.ScopedPreferenceStore;

public class FDRAdapterLoader {
	protected static final String sessionClasspath = "uk.ac.ox.cs.fdr.Session";
	protected static final String assertionClasspath = "uk.ac.ox.cs.fdr.Assertion";
	protected static final String fdrClasspath = "uk.ac.ox.cs.fdr.fdr";
	protected static final String inputFileErrorClasspath = "uk.ac.ox.cs.fdr.InputFileError";
	protected static final String fileLoadErrorClasspath = "uk.ac.ox.cs.fdr.FileLoadError";
	protected static final String cancellerClasspath = "uk.ac.ox.cs.fdr.Canceller";
	
	private static ClassLoader loader;
	
	private static FDRAdapterLoader instance;
	private static IPreferenceStore store;
	
	public static FDRAdapterLoader getInstance() throws MalformedURLException {
		if (instance==null) instance = new FDRAdapterLoader();
		return instance;
	}
	
	private FDRAdapterLoader() {
		try {
			checkLoader();
		} catch (Exception e) {
			// do nothing
		}
	}

	public Class loadClass(String classpath) throws ClassNotFoundException, MalformedURLException {
		checkLoader();
		return loader.loadClass(classpath);
	}
	
	private void checkLoader() throws MalformedURLException {
		if (loader == null) {
			loader = getClass().getClassLoader();
			
			String path = store.getString("CSP.Path");
			File f = new File(path); 

			loader = URLClassLoader.newInstance(
				new URL[] { f.toURL() }, 
		        loader
		    );
		}
	}

	public static void setPreferenceStore(IPreferenceStore newStore) {
		store = newStore;
	}
	
	public static IPreferenceStore getPreferenceStore() {
		return store;
	}

	public static boolean fdrExists() {
		if (store==null) return false;
		String fdrPath = store.getString("CSP.Path");
		File f = new File(fdrPath);
		return f.exists();
	}
	
}
