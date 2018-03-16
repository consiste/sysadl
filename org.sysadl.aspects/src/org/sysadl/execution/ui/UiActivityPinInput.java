package org.sysadl.execution.ui;

import java.util.Map;

import sysADL_Sintax.ActivityDef;
import sysADL_Sintax.Pin;

/**
 * This class is responsible for capturing Input values and presenting Output values 
 * for Pin in an Activity
 * Extend it to implement its methods 
 * @author Eduardo
 *
 */
public abstract class UiActivityPinInput {
	/**
	 * Save the activity for internal use
	 * Use activity.getInParameters() to retrieve a list of Pins
	 */
	protected ActivityDef activity;
	protected Map<Pin, Object> values;
	
	public UiActivityPinInput(ActivityDef ac) {
		this.activity = ac;
	}
	
	
	/**
	 * Requests input from user
	 * 
	 * Set all empty values to ObjectValue.EMPTY
	 * Empty is different from null, null is value of TypeDef Void
	 * 
	 * Default TypeDefs and its Java types:
	 * <SysADL Type> = <Java Class>
	 * TypeDef Void = null
	 * TypeDef Int = Integer
	 * TypeDef Real = Double
	 * TypeDef String = String
	 * TypeDef Boolean = Boolean
	 * 
	 * Check TypeDef of each Pin and request data according to it
	 * 
	 * @return true if user provided values for all pins, false otherwise
	 * Note: The user might not provide all inputs and it will NOT be an error
	 */
	public abstract boolean requestInputCMD();
	public abstract boolean requestInputGUI(String[] args);
	
	/**
	 * 
	 * @param target pin
	 * @return value provided for Pin
	 */
	public Object inputValueOf(Pin target) {
		return values.get(target);
	}
	
	public ActivityDef getActivity() {
		return activity;
	}

	public void setActivity(ActivityDef activity) {
		this.activity = activity;
	}

	public Map<Pin, Object> getValues() {
		return values;
	}

	public void setValues(Map<Pin, Object> values) {
		this.values = values;
	}


	
}
