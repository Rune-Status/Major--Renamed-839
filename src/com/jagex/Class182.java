package com.jagex;

public class Class182 {
	String aString2002;

	Class182(Buffer buffer, boolean bool, boolean bool_0_) {
		if (bool) {
			buffer.readLong();
		}
		if (bool_0_) {
			aString2002 = buffer.readStringFast();
		} else {
			aString2002 = null;
		}
	}

	public String method3562() {
		return aString2002;
	}

}