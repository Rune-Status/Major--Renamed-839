package com.jagex;

public class Class380 {
	public static Class380 aClass380_4211 = new Class380(12);
	public static Class380 aClass380_4212 = new Class380(9);
	static Class380 aClass380_4213;
	public static Class380 aClass380_4214;
	public static Class380 aClass380_4215;
	public static Class380 aClass380_4216 = new Class380(7);
	public static Class380 aClass380_4217;
	public static Class380 aClass380_4218;
	public static Class380 aClass380_4219;
	public static Class380 aClass380_4220;
	public static Class380 aClass380_4221;
	static Class380 aClass380_4222;
	public static Class380 aClass380_4224;
	static {
		aClass380_4214 = new Class380(3);
		aClass380_4215 = new Class380(10);
		aClass380_4224 = new Class380(13);
		aClass380_4217 = new Class380(11);
		aClass380_4221 = new Class380(4);
		aClass380_4219 = new Class380(2);
		aClass380_4220 = new Class380(5);
		aClass380_4218 = new Class380(8);
		aClass380_4222 = new Class380(6);
		aClass380_4213 = new Class380(1);
	}

	public static void method6235(int i) {
		PulseEvent class480_sub31_sub5 = PulseEvent.create(3, i);
		class480_sub31_sub5.delay();
	}

	static void method6233(Class405 class405, Matrix4f class399, int i, int i_0_, int i_1_) {
		if (null == Class56.aClass399_645) {
			Class56.aClass399_645 = new Matrix4f(class399);
		} else {
			Class56.aClass399_645.copyFrom(class399);
		}
		Class56.aClass405_625.copyFrom(class405);
		Class56.anInt641 = -1225076965 * i;
		Class56.anInt621 = i_0_ * 59270555;
	}

	static final void method6234(ScriptExecutionContext class613) {
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.aClass632_Sub11_10264
				.getValue();
	}

	int anInt4223;

	Class380(int i) {
		anInt4223 = 1056928285 * i;
	}

	public String method6221() {
		return new StringBuilder().append("_").append(anInt4223 * -216735691).toString();
	}

	public Object method6222(Object... objects) throws Throwable {
		return JavascriptUtils.call(Class454.applet, method6221(), objects);
	}

	public void method6223(Object[] objects) {
		try {
			method6222(objects);
		} catch (Throwable throwable) {

		}
	}

	public void method6225() {
		try {
			method6228();
		} catch (Throwable throwable) {

		}
	}

	public Object method6228() throws Throwable {
		return JavascriptUtils.call(Class454.applet, method6221());
	}
}
