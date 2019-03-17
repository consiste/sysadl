package org.sysadl.context.exceptions;

import org.sysadl.context.SysADLContext;

public class ContextInvalidKey extends ContextException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -941357609952077720L;
	
	private String key;
	private SysADLContext context;
	
	public ContextInvalidKey(String name, SysADLContext context) {
		super("key doesn't exist in the context: "+name);
		this.key = name;
		this.context = context;
	}

}
