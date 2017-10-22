package com.jagex;

import com.jagex.twitch.TwitchTV;

public class Class403 {
	public static int anInt4553;

	public static int twitchLogin(String string, String string_3_) {
		if (!Class533.aBool7275) {
			return 12;
		} else if (Client.getActiveConnection() != Client.gameConnection) {
			return 42;
		}

		return TwitchTV.tv.Login(string, string_3_);
	}

	static void method6716() {
		if (Class56.aClass480_Sub31_Sub4_646 != null) {
			Class56.aClass480_Sub31_Sub4_646 = null;
			Client.method8796(Class56.anInt635 * -1393036739, Class159.anInt1896 * -2036920667,
					328052667 * EnvironmentContext.anInt8164, FloatRaster.anInt1245 * 217318921);
		}
	}

	Class403() throws Throwable {
		throw new Error();
	}

}