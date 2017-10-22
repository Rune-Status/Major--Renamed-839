package com.jagex;

public class Class382_Sub1 extends Class382 {
	byte[] aByteArray9845;
	int anInt9846;
	int anInt9847;
	int[] anIntArray9848 = new int[anInt4230];

	Class382_Sub1(int i, int i_1_, int i_2_, int i_3_, int i_4_, float f) {
		super(i, i_1_, i_2_, i_3_, i_4_);
		for (int i_5_ = 0; i_5_ < anInt4230; i_5_++) {
			anIntArray9848[i_5_] = (short) (int) (Math.pow(f, i_5_) * 4096.0);
		}
	}

	void method15338(int i, byte i_6_) {
		aByteArray9845[anInt9846++] = (byte) (127 + ((i_6_ & 0xff) >> 1));
	}

	@Override
	void method6252() {
		anInt9846 = 0;
		anInt9847 = 0;
	}

	@Override
	void method6264() {
		anInt9847 = Math.abs(anInt9847);
		if (anInt9847 >= 4096) {
			anInt9847 = 4095;
		}
		method15338(anInt9846++, (byte) (anInt9847 >> 4));
		anInt9847 = 0;
	}

	@Override
	void method6268(int i, int i_0_) {
		anInt9847 += i_0_ * anIntArray9848[i] >> 12;
	}
}
