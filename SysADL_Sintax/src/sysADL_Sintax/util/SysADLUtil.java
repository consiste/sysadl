package sysADL_Sintax.util;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import sysADL_Sintax.Package;;
public class SysADLUtil {

	public static Package upToPackage(EObject use) {
	  throw new UnsupportedOperationException("TODO: auto-generated method stub");
	}
	
	public static List<Package> importedPackages(Package p) {
		return p.getImports();
	}
}
