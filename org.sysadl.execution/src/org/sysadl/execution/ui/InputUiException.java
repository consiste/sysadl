package org.sysadl.execution.ui;

import org.sysadl.ForControl;
import org.sysadl.Pin;

public class InputUiException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6391387909965747296L;
	
	private String message;
	/**
	 * 
	 * @param pins array with pins which provided values were inadequate
	 */
	public InputUiException(Pin[] pins) {
		super();
		message = "";
		for (Pin p : pins) {
			if (!message.isEmpty()) message+="\n";
			message += "(Pin)" +p.getName()+" : "+p.getDefinition().getName();
		}
	}
	
	@Override
	public String getMessage() {
		return message;
	}

}
