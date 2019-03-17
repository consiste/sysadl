package org.sysadl.context.exceptions;

import sysADL_Sintax.Expression;

public class InvalidExpression extends ContextException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7132039865635516585L;

	public InvalidExpression(Expression e) {
		super("The type "+e.getClass().getName()+" does cannot be executed by this engine.");
	}

}
