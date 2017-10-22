package com.jagex;

public class Class457 {
	static Class457 aClass457_5140;
	public static Class457 aClass457_5141;
	static Class457 aClass457_5142;
	static Class457 aClass457_5143;
	static Class457 aClass457_5144;
	static Class457 aClass457_5145 = new Class457(0, false);
	static Class457 aClass457_5146;
	static Class457 aClass457_5147;
	static Class457 aClass457_5148;
	public static Class678_Sub21 aClass678_Sub21_5151;
	static {
		aClass457_5141 = new Class457(1, false);
		aClass457_5142 = new Class457(2, false);
		aClass457_5143 = new Class457(3, false);
		aClass457_5140 = new Class457(4, false);
		aClass457_5148 = new Class457(5, true);
		aClass457_5146 = new Class457(6, true);
		aClass457_5147 = new Class457(7, true);
		aClass457_5144 = new Class457(8, true);
	}

	static final void method7532(ScriptExecutionContext class613) {
		int i_0_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_0_);
		Interface class221 = Class598.loadedInterfaces[i_0_ >> 16];
		ScriptExecutionContext.method3983(class226, class221, class613);
	}

	static final void method7533(ScriptExecutionContext class613, int i) {
		Engine.method8026(true);
		Class60.method1371();
		Client.aClass460_10760.method7705();
		Client.savePreferences();
		Client.sentPreferences = false;
	}

	static final void method7534(ScriptExecutionContext class613) {
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.maxScreenSize
				.supported() ? 1 : 0;
	}

	static final void method7535(Widget class226, Interface class221, ScriptExecutionContext class613) {
		class226.anInt2463 = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045] * -1132968959;
		class226.anInt2484 = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045] * -1887779447;
	}

	int anInt5149;

	public boolean aBool5150;

	Class457(int i, boolean bool) {
		anInt5149 = i * -1615301299;
		aBool5150 = bool;
	}
}
