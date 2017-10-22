package com.jagex;

public class Class470 {
	public static void method8046(boolean bool, boolean bool_5_) {
		if (bool) {
			Class598.anInt7849 -= -1935474425;
			if (0 == Class598.anInt7849 * -1042899785) {
				Class335.HSV_TABLE = null;
			}
		}
		if (bool_5_) {
			Class598.anInt7848 -= 325974101;
			if (-1007729411 * Class598.anInt7848 == 0) {
				Class598.HSL_TABLE = null;
			}
		}
	}

	public static String method8047(byte i) {
		return Class512.aString7005;
	}

	static final void method8042(ScriptExecutionContext class613) {
		int i_3_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = PlayerVariableProvider.instance
				.method410(i_3_);
	}

	static final void method8043(ScriptExecutionContext class613, int i) {
		Class587.method9895(class613, class613.aClass600_Sub1_Sub3_Sub1_7936, (byte) 35);
	}

	static final void method8044(Widget class226, Interface class221, ScriptExecutionContext class613) {
		String string = (String) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
		if (ScriptExecutionContext.method9239(string, class613) != null) {
			string = string.substring(0, string.length() - 1);
		}
		class226.anObjectArray2357 = Class562_Sub1.method16248(string, class613);
		class226.aBool2483 = true;
	}

	static final void method8045(ScriptExecutionContext class613, int i) {
		int i_4_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_4_);
		Interface class221 = Class598.loadedInterfaces[i_4_ >> 16];
		ScriptExecutionContext.method5906(class226, class221, class613);
	}

	int anInt6528;

	int anInt6529;

	int anInt6530;

	int anInt6531;

	String aString6532;

	public Class470(int i, int i_0_, int i_1_, int i_2_, String string) {
		anInt6529 = -1407913909 * i;
		anInt6530 = i_0_ * -1230192841;
		anInt6531 = 918555473 * i_1_;
		anInt6528 = i_2_ * 996519381;
		aString6532 = string;
	}

	int method8029() {
		return 2096585059 * anInt6529;
	}

	int method8030() {
		return 774055559 * anInt6530;
	}

	int method8031() {
		return anInt6528 * -2093079683;
	}

	String method8032() {
		return aString6532;
	}

	int method8035() {
		return anInt6531 * 1223695793;
	}
}
