package com.jagex;

import java.util.ArrayList;

public final class Class626 {
	static int anInt8034;
	public static ReferenceCache aClass168_8035;
	static int[] anIntArray8037 = new int[3];
	static final int anInt8038 = 2000000;
	static Class397[] aClass397Array8039;
	static boolean aBool8040;
	static String aString8041;
	static ArrayList anArrayList8042;
	static final int anInt8043 = 200000;
	static int anInt8044;

	static {
		aClass168_8035 = new ReferenceCache(4);
		aClass397Array8039 = new Class397[2];
		aBool8040 = false;
		aString8041 = null;
		anArrayList8042 = new ArrayList();
		anInt8034 = 0;
		anInt8044 = 0;
	}

	public static int method13053() {
		if (3 == Class533.anInt7283 * 1274816843) {
			return -1;
		}
		if (1274816843 * Class533.anInt7283 != 0) {
			return Class533.anInt7272 * 1363335771;
		}
		if (null == Class533.aStringArray7273) {
			if (Class485.osName.startsWith("mac ")) {
				if (Class485.architecture.startsWith("ppc")) {
					Class533.anInt7283 = -1088075479;
					return -1;
				}
				Class533.aStringArray7273 = new String[3];
				Class533.aStringArray7273[0] = "sdk-mac-dynamic";
				Class533.aStringArray7273[1] = "twitchsdk";
				Class533.aStringArray7273[2] = "twitchtv";
				Class533.aBoolArray7265 = new boolean[3];
				Class533.aBoolArray7265[0] = false;
				Class533.aBoolArray7265[1] = false;
				Class533.aBoolArray7265[2] = true;
			} else if (Class485.osName.startsWith("win")) {
				Class533.aStringArray7273 = new String[6];
				Class533.aStringArray7273[0] = "avutil-ttv-51";
				Class533.aStringArray7273[1] = "libmp3lame-ttv";
				Class533.aStringArray7273[2] = "swresample-ttv-0";
				Class533.aStringArray7273[5] = "twitchtv";
				if (Class485.architecture.startsWith("amd64") || Class485.architecture.startsWith("x86_64")) {
					Class533.aStringArray7273[3] = "libmfxsw64";
					Class533.aStringArray7273[4] = "twitchsdk_64_release";
				} else if (Class485.architecture.startsWith("i386") || Class485.architecture.startsWith("i486")
						|| Class485.architecture.startsWith("i586") || Class485.architecture.startsWith("x86")) {
					Class533.aStringArray7273[3] = "libmfxsw32";
					Class533.aStringArray7273[4] = "twitchsdk_32_release";
				} else {
					Class533.anInt7283 = -1088075479;
					return -1;
				}
				Class533.aBoolArray7265 = new boolean[6];
				Class533.aBoolArray7265[0] = true;
				Class533.aBoolArray7265[1] = true;
				Class533.aBoolArray7265[2] = true;
				Class533.aBoolArray7265[3] = false;
				Class533.aBoolArray7265[4] = true;
				Class533.aBoolArray7265[5] = true;
			} else {
				Class533.anInt7283 = -1088075479;
				return -1;
			}
		}
		Class533.anInt7283 = 1068963939;
		return 0;
	}

	public static Class270 method13054(int i) {
		if (i == -221221467 * Class270.aClass270_2997.anInt3000) {
			return Class270.aClass270_2997;
		}
		if (-221221467 * Class270.aClass270_2995.anInt3000 == i) {
			return Class270.aClass270_2995;
		}
		if (Class270.aClass270_2996.anInt3000 * -221221467 == i) {
			return Class270.aClass270_2996;
		}
		if (i == -221221467 * Class270.aClass270_2998.anInt3000) {
			return Class270.aClass270_2998;
		}
		if (i == Class270.aClass270_2999.anInt3000 * -221221467) {
			return Class270.aClass270_2999;
		}
		return null;
	}

	static final void method13055(ScriptExecutionContext class613, int i) {
		int i_1_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_1_);
		Interface class221 = Class598.loadedInterfaces[i_1_ >> 16];
		ScriptExecutionContext.method1159(class226, class221, class613);
	}

	Class626() throws Throwable {
		throw new Error();
	}
}
