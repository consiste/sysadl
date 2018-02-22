package org.sysadl.context;

import sysADL_Sintax.NamedElement;

public interface SysADLContext {
	/**
	 * Find Object pointed by value named name
	 * @param name
	 * @return
	 */
	public Object findByName(String name);
	
	public Object findByComplexName(String[] complexName);
	
	public void add(NamedElement n, Object value);
}
