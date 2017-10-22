package com.jagex;

public class Class320 {
	long aLong3411;
	int anInt3412;

	Class320(Class316 class316) {
		aLong3411 = class316.anInt3374;
		anInt3412 = 1;
	}

	Class320(Class316... class316s) {
		for (Class316 class316 : class316s) {
			method5733(class316);
		}
	}

	public final int method5729() {
		return anInt3412;
	}

	public final Class316 method5731(int i) {
		return Class316.method5697(method5732(i));
	}

	final int method5732(int i) {
		return (int) (aLong3411 >> Class316.anInt3373 * i) & 0xf;
	}

	final void method5733(Class316 class316) {
		aLong3411 |= class316.anInt3374 << Class316.anInt3373 * anInt3412++;
	}

}