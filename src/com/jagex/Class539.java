package com.jagex;

public class Class539 implements Identifiable {
	static Class539 aClass539_7323;
	static Class539 aClass539_7324;
	static Class539 aClass539_7325;
	static Class539 aClass539_7326;
	static Class539 aClass539_7327;
	static Class539 aClass539_7328 = new Class539(0);
	public static ObjectDefinitionLoader aClass678_Sub17_7330;
	static {
		aClass539_7324 = new Class539(1);
		aClass539_7326 = new Class539(2);
		aClass539_7323 = new Class539(3);
		aClass539_7327 = new Class539(4);
		aClass539_7325 = new Class539(5);
	}

	public static void method9210(int i, boolean bool, int i_2_, boolean bool_3_, byte i_4_) {
		WeakReferenceTable.method1091(0, Class671.aClass562_Sub1Array8455.length - 1, i, bool, i_2_, bool_3_);
		Class671.anInt8461 = 0;
		Class671.aClass587_8456 = null;
	}

	static final void method9209(ScriptExecutionContext class613, int i) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		int i_0_ = -1;
		int i_1_ = -1;
		Class211 class211 = class226.method4298(Class60.activeToolkit);
		if (class211 != null) {
			i_0_ = class211.anInt2182 * 881990655;
			i_1_ = class211.anInt2180 * 1644092335;
		}
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = i_0_;
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = i_1_;
	}

	int anInt7329;

	Class539(int i) {
		anInt7329 = -563881713 * i;
	}

	@Override
	public int getId() {
		return anInt7329 * -1960577553;
	}

	public static Class539[] values() {
		return new Class539[] { aClass539_7325, aClass539_7323, aClass539_7324, aClass539_7326, aClass539_7328,
				aClass539_7327 };
	}
}
