package org.sysadl.context;

public interface SysADLContext {
	/**
	 * Find Object pointed by value named name
	 * @param name
	 * @return
	 */
	public Object findByName(String name);
	
	public Object findByComplexName(String[] complexName);
}
