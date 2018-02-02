package org.sysadl.sysADL_Sintax.aspects

class Helper {
	public static int count = 0;
	public def static String genValue() {
		return "value"+(count++);
	}
}
