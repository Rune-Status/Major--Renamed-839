package com.jagex;

import java.util.HashMap;
import java.util.Map;

import com.jagex.twitch.TwitchTV;

public class Class154 {
	static Class154 aClass154_1864;
	static Class154 aClass154_1865;
	static Class154 aClass154_1866;
	static Class154 aClass154_1867 = new Class154(4);
	static Class154 aClass154_1868;
	static Class154 aClass154_1869;
	static {
		aClass154_1865 = new Class154(1);
		aClass154_1866 = new Class154(3);
		aClass154_1869 = new Class154(0);
		aClass154_1868 = new Class154(2);
		aClass154_1864 = new Class154(5);
	}

	public static void method3280() {
		if (Class533.aBool7275) {
			int i_0_ = TwitchTV.tv.ShutdownTTV();
			if (i_0_ == 0) {
				TwitchTV.tv = null;
				Class533.aBool7275 = false;
			}
		}
	}

	public static Map method3281(DefaultProvidingVarpLoader[] loaders) {
		if (loaders == null || 0 == loaders.length) {
			return null;
		}
		HashMap hashmap = new HashMap();
		for (DefaultProvidingVarpLoader loader : loaders) {
			hashmap.put(loader.type, loader);
		}

		return hashmap;
	}

	int anInt1870;

	Class154(int i) {
		anInt1870 = i * 807303379;
	}

	int method3278() {
		if (this == aClass154_1867) {
			return -1;
		}
		return 0x1000000 | anInt1870 * 325099355;
	}

}