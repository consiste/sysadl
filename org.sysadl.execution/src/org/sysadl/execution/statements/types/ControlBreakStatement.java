package org.sysadl.execution.statements.types;

import org.sysadl.context.exceptions.ContextException;

public class ControlBreakStatement extends ContextException {
	private Object value;
	
	public ControlBreakStatement(String message) {
		super(message);
	}

	public ControlBreakStatement(Object value) {
		super("");
		this.value = value;
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1793760669288759765L;

	public Object getValue() {
		return this.value;
	}

}
