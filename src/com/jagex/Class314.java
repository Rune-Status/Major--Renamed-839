package com.jagex;

public class Class314 {
	NativeArrayBuffer anInterface32_3332;
	boolean aBool3333;
	NativeArrayBuffer anInterface32_3334;
	boolean aBool3335;

	Class314(boolean bool) {
		aBool3333 = bool;
	}

	boolean method5663() {
		return aBool3335 && !aBool3333;
	}

	void method5664() {
		if (anInterface32_3332 != null) {
			anInterface32_3332.deleteImmediately();
		}

		aBool3335 = false;
	}

}