package org.sysadl.context.impl;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.sysadl.context.SysADLContext;
import org.sysadl.context.exceptions.ContextInvalidKey;

import org.sysadl.NamedElement;

public class SysADLContextImpl implements SysADLContext {

	private Map<NamedElement, Object> map;
	private Object thisObj;
	
	public SysADLContextImpl() {
		map = new HashMap<NamedElement,Object>();
	}

	@Override
	public Object findByName(String name) throws ContextInvalidKey {
		Object targetValue = null;
		for (NamedElement n : map.keySet()) {
			if (n.getName().compareTo(name)==0) {
				targetValue = map.get(n);
				return targetValue;
			}
		}
		// at this point, the key does not exist
		throw new ContextInvalidKey(name, this);
	}

	@Override
	public Object findByComplexName(String[] complexName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(NamedElement n, Object value) {
		map.put(n, value);
	}
	
	public void clear() {
		map.clear();
	}
	
	public int size() {
		return map.size();
	}

	public Set<String> keys() {
		Set<String> s = new HashSet<String>();
		for (NamedElement n : map.keySet()) {
			s.add(n.getName());
		}
		return s;
	}

	@Override
	public void setThis(Object e) {
		this.thisObj = e;
	}

	@Override
	public Object getThis() {
		return thisObj;
	}
	
	public Object get(NamedElement target) {
		return map.get(target);
	}
}
