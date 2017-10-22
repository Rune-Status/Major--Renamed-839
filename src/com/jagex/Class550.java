package com.jagex;

public class Class550 implements Identifiable {
	static Class550 aClass550_7472 = new Class550(0);
	static Class550 aClass550_7473 = new Class550(1);
	public static Class550 aClass550_7474 = new Class550(2);
	public static int anInt7476;

	static final void method9333(Widget class226, Interface class221, ScriptExecutionContext class613, int i) {
		class226.aString2480 = (String) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
	}

	static final void method9334(ScriptExecutionContext class613, int i) {
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.bloom
				.supported() && Class60.activeToolkit.method2688() ? 1 : 0;
	}

	static final void method9335(ScriptExecutionContext class613, int i) {
		int i_0_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_0_);
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 2141391961 * class226.spriteOffsetY;
	}

	static final void method9336(ScriptExecutionContext class613, byte i) {
		Class340_Sub2.method15397(390582661);
	}

	static int method9337(int i, byte i_1_) {
		if (9 == i || 10 == i) {
			return 1;
		}
		if (i == 11) {
			return 8;
		}
		return i;
	}

	int anInt7475;

	Class550(int i) {
		anInt7475 = -1106763309 * i;
	}

	@Override
	public int getId() {
		return anInt7475 * -1078075813;
	}

	static Class550[] values() {
		return new Class550[] { aClass550_7472, aClass550_7474, aClass550_7473 };
	}
}
