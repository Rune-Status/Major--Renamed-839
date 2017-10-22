package com.jagex;

import java.util.Iterator;

import com.jagex.twitch.TwitchTV;

public class Class581 implements Iterator {

	static final void method9836(ScriptExecutionContext class613, int i) {
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Client.localPlayerIndex
				* -406165969;
	}

	static final void method9837(ScriptExecutionContext class613, int i) {
		Class199.preferences.setValue(Class199.preferences.steroSound,
				class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045] == 1 ? 1 : 0);
		Client.savePreferences();
		Client.sentPreferences = false;
	}

	static int crc32(byte[] is, int i, int i_0_) {
		int i_2_ = -1;
		for (int i_3_ = i; i_3_ < i_0_; i_3_++) {
			i_2_ = i_2_ >>> 8 ^ Buffer.CRC_32[(i_2_ ^ is[i_3_]) & 0xff];
		}
		i_2_ ^= 0xffffffff;
		return i_2_;
	}

	static void method9839(ScriptExecutionContext class613) {
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = TwitchTV.getWebcamState();
	}

	static final void method9840(ScriptExecutionContext class613, int i) {
		class613.aLongArray7934[(class613.anInt7928 += 423292651) * -47101501 - 1] = class613.longVariables[class613.anIntArray7943[class613.counter * 1523704279]];
	}

	static final void method9842(Widget class226, Interface class221, ScriptExecutionContext class613, int i) {
		String string = (String) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
		if (ScriptExecutionContext.method9239(string, class613) != null) {
			string = string.substring(0, string.length() - 1);
		}
		class226.anObjectArray2517 = Class562_Sub1.method16248(string, class613);
		class226.aBool2483 = true;
	}

	static final void method9843(ScriptExecutionContext class613, byte i) {
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Class477_Sub3.method15580(
				(byte) 35).getId();
	}

	int anInt7765;

	Class559[] aClass559Array7766;

	Class581(Class559[] class559s) {
		aClass559Array7766 = class559s;
	}

	@Override
	public boolean hasNext() {
		return -223365019 * anInt7765 < aClass559Array7766.length;
	}

	@Override
	public Object next() {
		return aClass559Array7766[(anInt7765 += 1554004333) * -223365019 - 1];
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

}