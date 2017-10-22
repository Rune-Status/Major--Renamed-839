package com.jagex;

public class Class296_Sub3_Sub1 extends Class296_Sub3 {
	public static void method17524(int i, byte i_14_) {
		PulseEvent class480_sub31_sub5 = PulseEvent.create(21, i);
		class480_sub31_sub5.delay();
	}

	static void method17523(Toolkit class134, int i, int i_7_, Widget class226, int i_8_, byte i_9_) {
		for (int i_10_ = 7; i_10_ >= 0; i_10_--) {
			for (int i_11_ = 127; i_11_ >= 0; i_11_--) {
				int i_12_ = (i_8_ & 0x3f) << 10 | (i_10_ & 0x7) << 7 | i_11_ & 0x7f;
				Class44.method1067(false, true);
				int i_13_ = Class335.HSV_TABLE[i_12_];
				Class470.method8046(false, true);
				class134.method2434((i_11_ * 688089097 * class226.width >> 7) + i, i_7_
						+ ((7 - i_10_) * 1362321717 * class226.height >> 3), (688089097 * class226.width >> 7) + 1,
						1 + (class226.height * 1362321717 >> 3), ~0xffffff | i_13_, 0);
			}
		}
	}

	Class296_Sub3_Sub1(Archive class406, Archive class406_6_, Class340_Sub2_Sub1 class340_sub2_sub1) {
		super(class406, class406_6_, class340_sub2_sub1);
	}

	@Override
	void method15309(int i, int i_0_, int i_1_, int i_2_) {
		int i_4_ = aClass116_9818.scaleWidth();
		int i_5_ = 1122335351 * ((Class340_Sub2_Sub1) aClass340_3273).anInt11117 * Class270.method5076() / 10 % i_4_;
		aClass116_9818.method2084(i_5_ + i - i_4_, i_0_, i_4_ + i_1_ - i_5_, i_2_);
	}
}
