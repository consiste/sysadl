package org.sysadl.execution.value;

public class Values {
	public static Values VOID = new Values();
	
	public static boolean isVoid(Object o) {
		return (o == Values.VOID);
	}
}
