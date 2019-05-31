package org.sysadl.context;

import java.util.Set;

import org.sysadl.context.exceptions.ContextInvalidKey;

import org.sysadl.NamedElement;

public interface SysADLContext {
	/**
	 * Find Object pointed by value named name
	 * @param name
	 * @return
	 * @throws ContextInvalidKey 
	 */
	public Object findByName(String name) throws ContextInvalidKey;
	
	public Object findByComplexName(String[] complexName) throws ContextInvalidKey;
	
	public void add(NamedElement n, Object value);
	
	public void clear();
	
	public int size();
	
	public Set<String> keys();
	
	public void setThis(Object e);
	
	public Object getThis();

	public Object get(NamedElement target);
}
