package com.jagex;

public class Class334 {
	static Class334 aClass334_3601 = new Class334();
	static Class334 aClass334_3602 = new Class334();
	static Class334 aClass334_3603 = new Class334();

	public static Class334[] values() {
		return new Class334[] { aClass334_3602, aClass334_3601, aClass334_3603 };
	}

	static void method5817() {
		if (ArchiveLoader.aClass622_4521 != Class622.aClass622_8003) {
			Class380.aClass380_4211.method6225();
		}
	}

	public int method5811(int i, int i_0_) {
		int i_2_ = -551672947 * Engine.screenHeight > i_0_ ? -551672947 * Engine.screenHeight : i_0_;
		if (this == aClass334_3602) {
			return 0;
		} else if (aClass334_3603 == this) {
			return i_2_ - i;
		} else if (aClass334_3601 == this) {
			return (i_2_ - i) / 2;
		}

		return 0;
	}

}