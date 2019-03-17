package org.sysadl.execution.ui;

import sysADL_Sintax.Pin;

public interface ValueChangedListener {
	
	//Observable and Observer pattern
	void onChangedValue(Pin key);

}
