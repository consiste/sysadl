package org.sysadl.execution.value;

import org.sysadl.TypeDef;

public class Values {
	private int id;
	
	private static int VOID_VALUE = 0;
	
	public static Values VOID = new Values(0);
	
	private Values(int i) {
		this.id = i;
	}

	public static boolean isVoid(Object o) {
		return (o instanceof Values) && ((Values) o).id==VOID_VALUE;
	}
	
	public static boolean isVoidType(TypeDef t) {
		return t.getName().equals("Void");
	}
}
