package org.sysadl.execution.ui;

import java.util.HashMap;


public class CustomListenerHashMap<Pin, String> extends HashMap<Pin,String>{
	
	private ValueChangedListener valueChangedListener;
	
    public CustomListenerHashMap(int i) {
		super(i);
	}

	public String put(Pin key, String value) {
		Object oldValue = this.get(key);
		String s = super.put(key, value);
		//if we already have that pin for a key, call the event!
		if(this.valueChangedListener != null && oldValue != null) {
			valueChangedListener.onChangedValue( (sysADL_Sintax.Pin) key);
		}
		
    	return s;
    	
    }

	
	public void setValueChangedListener (ValueChangedListener listener) {
		this.valueChangedListener = listener;
	}


}
