package com.jagex;

import com.jagex.twitch.TwitchTV;

public class Class50 {
	static Class261_Sub1 aClass261_Sub1_582;
	static int mouseY;
	static boolean aBool584 = false;
	static int anInt585;

	public static void method1129(int i, int i_11_, int i_12_) {
		PulseEvent class480_sub31_sub5 = PulseEvent.create(20, (long) i_11_ << 32 | i);
		class480_sub31_sub5.delay();
	}

	static final void sleep(long l) {
		try {
			Thread.sleep(l);
		} catch (InterruptedException interruptedexception) {

		}
	}

	static void method1125(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_,
			MenuCategory class480_sub31_sub4, Font class132, FontSpecification class9, int i_6_, int i_7_, int i_8_) {
		if (i > i_1_ && i < i_1_ + i_3_ && i_0_ > i_5_ - -1971642963 * class9.topPadding - 1
				&& i_0_ < -1569538073 * class9.bottomPadding + i_5_) {
			i_6_ = i_7_;
		}
		String string = MenuCategory.getTitle(class480_sub31_sub4);
		class132.method2326(string, 3 + i_1_, i_5_, i_6_, 0, Client.aRandom10887, Class54.anInt608,
				Class368.aClass116Array4053, LruDefinitionCacheIterator.anIntArray278, 2020719272);
	}

	static int method1126(int i) {
		try {
			for (int i_9_ = 0; i_9_ < Class533.aStringArray7273.length; i_9_++) {
				if (null != Class533.aStringArray7273[i_9_] && Class533.aBoolArray7265[i_9_]) {
					Client.getNativeProvider().load(Class533.aStringArray7273[i_9_]);
				}
			}
		} catch (NativeLibraryLoadException exception_sub7) {
			return 3;
		}
		TwitchTV.tv = new TwitchTV();
		int i_10_ = TwitchTV.tv.InitialiseTTV(Class148.method3173());
		if (0 == i_10_) {
			Class533.aBool7275 = true;
		} else {
			HitsplatDefinitionProvider.reportError(new StringBuilder().append(10).append(Class60.COMMA).append(i_10_)
					.toString(), new RuntimeException());
		}
		return 2;
	}

	static final void method1127(ScriptExecutionContext class613, int i) {
		Class199.preferences.setValue(Class199.preferences.areaSoundsVolume,
				class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045]);
		Client.savePreferences();
		Client.sentPreferences = false;
	}

	static final void method1128(ScriptExecutionContext class613) {
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = ItemDefinition.aClass192_8339
				.method3773().getId();
	}

	Class50() throws Throwable {
		throw new Error();
	}
}
