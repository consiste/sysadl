package org.sysadl.execution.statements.types;

import org.sysadl.context.exceptions.ContextException;

public class ControlReturnStatement extends ContextException {
	private Object value;

	public ControlReturnStatement(String message) {
		super(message);
	}

	public ControlReturnStatement(Object value) {
		super("");
		this.value = value;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -5184071317763774066L;

	public Object getValue() {
		return this.value;
	}
}
