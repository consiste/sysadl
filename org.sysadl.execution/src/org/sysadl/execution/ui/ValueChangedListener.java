package org.sysadl.execution.ui;

import org.sysadl.Pin;

public interface ValueChangedListener {
	
	//Observable and Observer pattern
	void onChangedValue(Pin key);

}
