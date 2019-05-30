package org.sysadl.util;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.sysadl.Model;
import org.sysadl.Package;

public class SysADLUtil {

	public static Package upToPackage(EObject use) {
	  EObject current = use;
	  while (!(current instanceof Package)) {
		  if (current instanceof Model) return null;
		  current = current.eContainer();
	  }
	  return (Package) current;
	}
	
	public static List<Package> importedPackages(Package p) {
		ArrayList<Package> packages = new ArrayList<Package>();
		//Iterator<Package> t = packages.iterator();
		Package current = p;
		packages.addAll(current.getImports());
	
		for (int i=0; i<packages.size();i++) {
			current = packages.get(i);
			for (Object ip : current.getImports()) {
				Package ipp = (Package) ip;
				if (!packages.contains(ipp)) { 
					packages.add(ipp); 
				}
			}	
		}
		return packages;
	}
	
}
