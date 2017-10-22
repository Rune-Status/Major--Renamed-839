package com.jagex;

public class Class313 {
	boolean aBool3328;
	NativeElementArrayBuffer anInterface36_3329;
	boolean aBool3330;
	NativeElementArrayBuffer anInterface36_3331;

	Class313(boolean bool) {
		aBool3328 = bool;
	}

	void method5657() {
		if (anInterface36_3331 != null) {
			anInterface36_3331.deleteImmediately();
		}
		aBool3330 = false;
	}

	boolean method5659() {
		return aBool3330 && !aBool3328;
	}

}