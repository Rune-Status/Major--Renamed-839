package com.jagex;

import com.jagex.twitch.TwitchTV;

public final class Class610 {
	static char[] BASE_37_CHARACTERS = { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
			'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8',
			'9' };
	static long[] aLongArray7912 = new long[12];

	static {
		for (int index = 0; index < aLongArray7912.length; index++) {
			aLongArray7912[index] = (long) Math.pow(37.0, index);
		}
	}

	static void method10310(Toolkit toolkit) {
		if (TwitchTV.isStreaming() && Class410.method6951()) {
			Class600_Sub1_Sub3_Sub3.method18082(0, 0, Engine.screenWidth * 1319181337, 350);
		}

		toolkit.method2760(0, 0, 1319181337 * Engine.screenWidth, 350);
		toolkit.method2434(0, 0, Engine.screenWidth * 1319181337, 350, Class65.anInt1011 * 2002418453 << 24 | 0x332277,
				1);
		int i_0_ = 350 / (-842621697 * Class65.anInt1004);

		if (951436779 * Class65.anInt1003 > 0) {
			int i_1_ = 346 - -842621697 * Class65.anInt1004 - 4;
			int i_2_ = i_0_ * i_1_ / (i_0_ + 951436779 * Class65.anInt1003 - 1);
			int i_3_ = 4;

			if (951436779 * Class65.anInt1003 > 1) {
				i_3_ += (i_1_ - i_2_) * (951436779 * Class65.anInt1003 - 1 - Class65.anInt1002 * 703340807)
						/ (951436779 * Class65.anInt1003 - 1);
			}

			toolkit.method2434(Engine.screenWidth * 1319181337 - 16, i_3_, 12, i_2_,
					2002418453 * Class65.anInt1011 << 24 | 0x332277, 2);

			for (int i_4_ = 703340807 * Class65.anInt1002; i_4_ < i_0_ + Class65.anInt1002 * 703340807
					&& i_4_ < 951436779 * Class65.anInt1003; i_4_++) {
				String[] strings = Class374.splitString(Class65.consoleMessages[i_4_], '\010');
				int i_5_ = (1319181337 * Engine.screenWidth - 8 - 16) / strings.length;

				for (int i_6_ = 0; i_6_ < strings.length; i_6_++) {
					int i_7_ = 8 + i_6_ * i_5_;
					toolkit.method2760(i_7_, 0, i_7_ + i_5_ - 8, 350);
					Client.p12Full.method2291(Class229.method4332(strings[i_6_], -547083363), i_7_, 350
							- Class65.anInt1009 * -104675789 - 2 - Class24.p12Full.bottomPadding * -1569538073
							- (i_4_ - Class65.anInt1002 * 703340807) * -842621697 * Class65.anInt1004, -1, -16777216);
				}
			}
		}

		Class558.p11Full.method2318("839 1", Engine.screenWidth * 1319181337 - 25, 330, -1, -16777216);
		toolkit.method2760(0, 0, 1319181337 * Engine.screenWidth, 350);
		toolkit.method2382(0, 350 - Class65.anInt1009 * -104675789, Engine.screenWidth * 1319181337, -1, -2089750437);
		Class450.b12Full.method2291(
				new StringBuilder().append("--> ").append(Class229.method4332(Class65.consoleText, -162732871))
						.toString(), 10, 350 - Class281_Sub3.b12Full.bottomPadding * -1569538073 - 1, -1, -16777216);

		if (HashedVariableCollection.aBool1483) {
			int i_8_ = -1;
			if (Client.tick % 30 > 15) {
				i_8_ = 16777215;
			}

			toolkit.method2431(
					10 + Class281_Sub3.b12Full.textWidth(new StringBuilder()
							.append("--> ")
							.append(Class229.method4332(Class65.consoleText, -1349086308).substring(0,
									-581519027 * Class65.consoleTextIndex)).toString()), 350
							- Class281_Sub3.b12Full.bottomPadding * -1569538073 - 11, 12, i_8_, -2146792975);
		}

		toolkit.method2421();
	}

	static final void method10311(ScriptExecutionContext class613, int i) throws ScriptException {
		class613.anInt7924 -= -2049596966;
		int i_9_ = class613.anIntArray7942[class613.anInt7924 * 1841827045];
		int i_10_ = class613.anIntArray7942[class613.anInt7924 * 1841827045 + 1];
		Class369.aClass261_Sub1_4079.method4854((float) (i_9_ * Math.PI * 2.0 / 16384.0), (float) (i_10_ * Math.PI
				* 2.0 / 16384.0));
	}

	Class610() throws Throwable {
		throw new Error();
	}
}
