package com.jagex;

public class Class465 {
	static Class465 aClass465_5272;
	static Class465 aClass465_5273;
	public static Class465 aClass465_5274 = new Class465();

	static {
		aClass465_5273 = new Class465();
		aClass465_5272 = new Class465();
	}

	public static float method7879(float f, float f_0_, int i) {
		double d = Math.atan2(f, f_0_);
		if (d < 0.0) {
			d = Math.PI + (d + Math.PI);
		}
		return (float) d;
	}

	static final void method7877(ScriptExecutionContext class613, int i) {
		if (Connection.anInt7170 * 1212513917 == 3) {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = (int) (Class369.aClass261_Sub1_4079
					.method4843() * 2607.5945876176133) >> 3;
		} else {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = (int) Client.aFloat10787 >> 3;
		}
	}

	static final void method7878(ScriptExecutionContext class613) {
		Client.aBool10632 = true;
		PlayerVarpType.method15346(-1243847657);
	}

	static void method7880() {

	}

	static final void method7881(ScriptExecutionContext class613, byte i) {
		int i_1_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_1_);
		Interface class221 = Class598.loadedInterfaces[i_1_ >> 16];
		Class655.method13550(class226, class221, class613, 726318087);
	}

	static final void method7882(ScriptExecutionContext class613, int i) {
		class613.anInt7924 -= -2049596966;
		int i_2_ = class613.anIntArray7942[1841827045 * class613.anInt7924];
		String string = (String) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
		boolean bool = 1 == class613.anIntArray7942[class613.anInt7924 * 1841827045 + 1];
		Class584.method9874(i_2_, string, bool, -1818223835);
	}

	Class465() {

	}
}
