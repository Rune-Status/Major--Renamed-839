package com.jagex;

public abstract class Class562 {
	static final int anInt7550 = 8;
	static final int anInt7551 = 2;
	static final int anInt7552 = 4;
	static final int anInt7556 = 1;

	static final void method9476(ScriptExecutionContext class613) {
		int i_0_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Class224 class224 = (Class224) Queue.aClass678_Sub8_8139.get(i_0_);
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = class224.anInt2303 * 1606761481;
	}

	static boolean method9477(Widget class226, int i) {
		Class480_Sub16 class480_sub16 = Client.method17050(class226);
		if (class480_sub16.method15634(493408954) > 0) {
			return true;
		}
		if (class480_sub16.method15630(1754788389)) {
			return true;
		}
		return class226.aClass226_2478 != null;
	}

	public int anInt7553;

	public int anInt7554;

	int anInt7555;

	Class562() {

	}

	public boolean method9466(byte i) {
		return 0 != (-1833179177 * anInt7554 & 0x4);
	}

	public boolean method9467(int i) {
		return (anInt7554 * -1833179177 & 0x2) != 0;
	}

	public boolean method9468(int i) {
		return 0 != (anInt7554 * -1833179177 & 0x8);
	}

	public boolean method9475(byte i) {
		return (anInt7554 * -1833179177 & 0x1) != 0;
	}
}
