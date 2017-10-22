package com.jagex;

public class Class445 {
	public static final int anInt5053 = 1;
	public static final int anInt5054 = 6;
	public static final int anInt5055 = 2;
	public static final int anInt5056 = 0;
	public static final int anInt5057 = 5;

	static final void method7357(ScriptExecutionContext class613, int i) {
		class613.anInt7924 -= -2049596966;
		boolean bool = class613.anIntArray7942[class613.anInt7924 * 1841827045] == 1;
		int i_0_ = class613.anIntArray7942[1 + 1841827045 * class613.anInt7924];
		Widget class226 = Widget.lookup(i_0_);
		Interface class221 = Class598.loadedInterfaces[i_0_ >> 16];
		ScriptExecutionContext.method3838(class226, class221, class613, bool ? Class227.aClass227_2560 : Class227.aClass227_2567);
	}

	static final void method7358(ScriptExecutionContext class613, short i) {
		class613.anInt7924 -= -2049596966;
		int i_1_ = class613.anIntArray7942[class613.anInt7924 * 1841827045];
		int i_2_ = class613.anIntArray7942[1841827045 * class613.anInt7924 + 1];
		String string = (String) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
		if (99 == i_1_) {
			CutsceneMob.printConsoleMessage(string);
		} else if (i_1_ == 98) {
			ProgramDefinition.setConsoleText(string);
		} else {
			Class176.addChatMessage(i_1_, i_2_, "", "", "", string, null);
		}
	}

	static final void method7359(ScriptExecutionContext class613, byte i) {
		class613.anInt7924 -= -2049596966;
		int i_3_ = class613.anIntArray7942[1841827045 * class613.anInt7924];
		int i_4_ = class613.anIntArray7942[1 + 1841827045 * class613.anInt7924];
		int i_5_ = ThemeMusicVolumeNormaliser.aClass10_2062.get(i_3_).getType(i_4_).id * 372827699;
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = i_5_;
	}

	static final void method7360(ScriptExecutionContext class613) {
		Class417.method6981((String) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933],
				class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045] == 1, 1790419640);
	}

	Class445() throws Throwable {
		throw new Error();
	}
}
