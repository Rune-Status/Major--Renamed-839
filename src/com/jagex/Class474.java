package com.jagex;

import java.applet.Applet;

public class Class474 {
	public static final int anInt6546 = 1;
	static final int anInt6547 = 3;
	static final int anInt6548 = 0;
	static String osName;
	static final int anInt6550 = 2;
	static Applet applet = null;

	public static void method8102(int i, int i_2_, int i_3_) {
		i <<= 3;
		i_2_ <<= 3;
		i_3_ <<= 3;

		if (3 == Connection.anInt7170 * 1212513917) {
			if (Class369.aClass261_Sub1_4079.method4837() == Class270.aClass270_2995) {
				Class281_Sub2 class281_sub2 = (Class281_Sub2) Class369.aClass261_Sub1_4079.method4876();
				Class395 class395 = new Class395();
				Class395 class395_5_ = new Class395();
				class395.method6367(0.0F, 1.0F, 0.0F, ((float) Math.PI) - (float) (Math.PI * i_2_ * 2.0 / 16384.0));
				Class397 class397 = new Class397(1.0F, 0.0F, 0.0F);
				class397.method6480(class395);
				class397.invert();
				class395_5_.method6380(class397, (float) (2.0 * (Math.PI * i)) / 16384.0F);
				class395.method6377(class395_5_);
				class281_sub2.aClass395_9749.copyFrom(class395);
			}
		} else {
			Client.aFloat10708 = i;
			Client.aFloat10787 = i_2_;

			if (Connection.anInt7170 * 1212513917 == 5) {
				Class155.anInt1874 = -1300105055 * i;
				Class550.anInt7476 = -1726145155 * i_2_;
				IncomingFrameMeta.anInt4473 = i_3_ * 796245051;
			}

			MovementType.method10452();
		}

		Client.aBool10611 = true;
	}

	static final int maximumLength(Class25 class25) {
		if (class25 == null) {
			return 12;
		}

		switch (class25.anInt345 * 1282054285) {
			default:
				return 12;
			case 6:
				return 20;
		}
	}

	static void method8101() {
		Class75.aClass168_1125.clear();
	}

	Class474() throws Throwable {
		throw new Error();
	}

	public static void init(Applet applet, String os) {
		Class474.applet = applet;
		Class474.osName = os;
	}

}