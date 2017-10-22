package com.jagex;

import com.jagex.twitch.TwitchTV;

public class Class591 {
	public static byte[][] aByteArrayArray7833;

	public static final void method9995() {
		int i_5_ = Class199.preferences.aClass632_Sub22_10284.getValue();
		if (i_5_ == 0) {
			Client.aClass460_10760.method7770(null);
			Client.method13392(0);
		} else if (i_5_ == 1 || 3 == i_5_) {
			Class565.method9560((byte) 0);
			Client.method13392(512);
			if (Client.aClass460_10760.method7687() != null) {
				Class289_Sub1.method15314(1719053878);
			}
		} else {
			Class565.method9560((byte) (764752929 * Client.anInt10730 - 4 & 0xff));
			Client.method13392(2);
		}
		Client.anInt10745 = ProxyingVariableLoader.localPlane * 85047597;
	}

	static final void method9994(ScriptExecutionContext class613) {
		int i_4_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_4_);
		Interface class221 = Class598.loadedInterfaces[i_4_ >> 16];
		ScriptExecutionContext.method4327(class226, class221, class613);
	}

	static final void method9996(Widget class226, Interface class221, ScriptExecutionContext class613, int i) {
		class613.anInt7924 -= -1658050238;
		class226.aBool2444 = true;
		class226.anInt2450 = Math.max(Math.min(class613.anIntArray7942[class613.anInt7924 * 1841827045], 2816), 0) * 1891063989;
		class226.anInt2421 = Math.max(Math.min(class613.anIntArray7942[1 + 1841827045 * class613.anInt7924], 2816), 0)
				* -2020079217;
		class226.anInt2449 = Math.max(Math.min(class613.anIntArray7942[2 + 1841827045 * class613.anInt7924], 2816), 0) * 1972612725;
		int i_6_ = Math.max(Math.min(class613.anIntArray7942[3 + 1841827045 * class613.anInt7924], 255), 0);
		int i_7_ = Math.max(Math.min(class613.anIntArray7942[class613.anInt7924 * 1841827045 + 4], 255), 0);
		int i_8_ = Math.max(Math.min(class613.anIntArray7942[1841827045 * class613.anInt7924 + 5], 255), 0);
		class226.anInt2448 = (i_6_ << 16 | i_7_ << 8 | i_8_) * 63805755;
		class226.anInt2445 = class613.anIntArray7942[1841827045 * class613.anInt7924 + 6] * 1876152115;
		class226.anInt2459 = -992032957 * class613.anIntArray7942[7 + 1841827045 * class613.anInt7924];
		class226.anInt2349 = 1181110807 * class613.anIntArray7942[8 + 1841827045 * class613.anInt7924];
		class226.anInt2543 = 1966636513 * class613.anIntArray7942[1841827045 * class613.anInt7924 + 9];
		Widget.redraw(class226);
	}

	static void method9997(ScriptExecutionContext class613) {
		String string = (String) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = TwitchTV
				.sendTwitchChatMessage(string);
	}

	static final void method9998(ScriptExecutionContext class613, int i) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Client.method17050(class226)
				.method15633();
	}

	float aFloat7814;
	float aFloat7815;
	int skybox;
	float aFloat7817;
	float[] aFloatArray7818;
	int anInt7819;
	int anInt7820;
	float aFloat7821;
	float aFloat7822;
	int anInt7823;
	int anInt7824;
	Class397 aClass397_7825;
	int anInt7826;
	float aFloat7827;
	int anInt7828;
	int anInt7829;
	int[] anIntArray7830 = new int[3];
	int anInt7831;
	int anInt7832;

	public Class591() {
		aFloatArray7818 = new float[3];
		method9934();
	}

	public int method9933() {
		return -441412955 * anInt7824;
	}

	public int method9935() {
		return -831553671 * anInt7823;
	}

	public float method9936() {
		return aFloat7815;
	}

	public int method9940() {
		return 1679632379 * anInt7832;
	}

	public int method9941() {
		return anInt7820 * -905528305;
	}

	public float method9942() {
		return aFloat7821;
	}

	public float method9943() {
		return aFloat7822;
	}

	public float method9944() {
		return aFloat7827;
	}

	public Class397 method9945() {
		return aClass397_7825;
	}

	public int method9947() {
		return -692306013 * anInt7826;
	}

	public int method9950() {
		return -628606167 * anInt7831;
	}

	public int method9951(int i) {
		return anIntArray7830[i];
	}

	public float method9952(int i) {
		return aFloatArray7818[i];
	}

	public int method9953() {
		return -1516309917 * anInt7829;
	}

	public float method9954() {
		return aFloat7814;
	}

	public int method9956() {
		return anInt7819 * 837675635;
	}

	public boolean method9959(Buffer buffer) {
		int i_3_ = buffer.readUShort();
		if (i_3_ == 0) {
			anInt7829 = buffer.readUShort() * -634970293;
			return false;
		}
		if (0 != (i_3_ & Class589.aClass589_7787.anInt7795 * -126543503)) {
			anInt7823 = buffer.readInt() * 1037023945;
		}
		if ((i_3_ & -126543503 * Class589.aClass589_7781.anInt7795) != 0) {
			aFloat7815 = buffer.readFloat();
		}
		if (0 != (i_3_ & -126543503 * Class589.aClass589_7782.anInt7795)) {
			aFloat7814 = buffer.readFloat();
		}
		if ((i_3_ & -126543503 * Class589.aClass589_7783.anInt7795) != 0) {
			aFloat7817 = buffer.readFloat();
		}
		if (0 != (i_3_ & -126543503 * Class589.aClass589_7784.anInt7795)) {
			aClass397_7825 = Class397.from(buffer);
		}
		if ((i_3_ & Class589.aClass589_7785.anInt7795 * -126543503) != 0) {
			anInt7819 = buffer.readInt() * -1842492741;
		}
		if ((i_3_ & Class589.aClass589_7786.anInt7795 * -126543503) != 0) {
			anInt7820 = buffer.readUShort() * -1748192529;
		}
		if (0 != (i_3_ & -126543503 * Class589.aClass589_7794.anInt7795)) {
			anInt7824 = buffer.readUShort() * 1785005357;
		}
		if ((i_3_ & -126543503 * Class589.aClass589_7780.anInt7795) != 0) {
			aFloat7821 = buffer.readFloat();
		}
		if (0 != (i_3_ & -126543503 * Class589.aClass589_7789.anInt7795)) {
			aFloat7822 = buffer.readFloat();
		}
		if (0 != (i_3_ & -126543503 * Class589.aClass589_7793.anInt7795)) {
			aFloat7827 = buffer.readFloat();
		}
		if (0 != (i_3_ & Class589.aClass589_7788.anInt7795 * -126543503)) {
			skybox = buffer.readUShort() * 205821179;
			anInt7826 = buffer.readShort() * -1615467509;
			anInt7832 = buffer.readShort() * -723006669;
			anInt7828 = buffer.readShort() * -793355943;
			anInt7831 = buffer.readUShort() * -1682927335;
		}
		if (0 != (i_3_ & Class589.aClass589_7792.anInt7795 * -126543503)) {
			anIntArray7830[0] = buffer.readUShort();
			aFloatArray7818[0] = buffer.readFloat();
		}
		if (0 != (i_3_ & Class589.aClass589_7791.anInt7795 * -126543503)) {
			anIntArray7830[1] = buffer.readUShort();
			aFloatArray7818[1] = buffer.readFloat();
		}
		if (0 != (i_3_ & -126543503 * Class589.aClass589_7790.anInt7795)) {
			anIntArray7830[2] = buffer.readUShort();
			aFloatArray7818[2] = buffer.readFloat();
		}
		anInt7829 = buffer.readUShort() * -634970293;
		return true;
	}

	public int method9970() {
		return 918443571 * skybox;
	}

	public float method9975() {
		return aFloat7817;
	}

	public int method9988() {
		return anInt7828 * -1647681815;
	}

	void method9934() {
		anInt7823 = -1037023945;
		aFloat7815 = -1.0F;
		aFloat7814 = -1.0F;
		aFloat7817 = -1.0F;
		aClass397_7825 = null;
		anInt7819 = 1842492741;
		anInt7820 = 1748192529;
		aFloat7821 = -1.0F;
		aFloat7822 = -1.0F;
		aFloat7827 = -1.0F;
		anInt7824 = -1785005357;
		skybox = -205821179;
		anInt7826 = 1615467509;
		anInt7832 = 723006669;
		anInt7828 = 793355943;
		anInt7831 = 1682927335;
		for (int i_0_ = 0; i_0_ < anIntArray7830.length; i_0_++) {
			anIntArray7830[i_0_] = -1;
			aFloatArray7818[i_0_] = 0.0F;
		}
		anInt7829 = -870633256;
	}
}
