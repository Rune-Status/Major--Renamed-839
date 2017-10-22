package com.jagex;

public class Class382_Sub2 extends Class382 {
	int anInt9941;
	byte[] aByteArray9942;
	int anInt9943;
	int anInt9944;
	int anInt9945;
	int anInt9946;
	int anInt9947;
	int anInt9948;
	int anInt9949;

	Class382_Sub2(int i, int i_2_, int i_3_, int i_4_, int i_5_, float f, float f_6_, float f_7_) {
		super(i, i_2_, i_3_, i_4_, i_5_);
		anInt9941 = (int) (f_7_ * 4096.0F);
		anInt9943 = (int) (f_6_ * 4096.0F);
		anInt9948 = anInt9949 = (int) (Math.pow(0.5, -f) * 4096.0);
	}

	void method15439(int i, byte i_1_) {
		aByteArray9942[i] = i_1_;
	}

	@Override
	void method6252() {
		anInt9945 = 0;
		anInt9946 = 0;
	}

	@Override
	void method6264() {
		anInt9948 = anInt9949;
		anInt9946 >>= 4;
		if (anInt9946 < 0) {
			anInt9946 = 0;
		} else if (anInt9946 > 255) {
			anInt9946 = 255;
		}
		method15439(anInt9945++, (byte) anInt9946);
		anInt9946 = 0;
	}

	@Override
	void method6268(int i, int i_0_) {
		if (i != 0) {
			anInt9944 = anInt9947 * anInt9941 >> 12;
			if (anInt9944 < 0) {
				anInt9944 = 0;
			} else if (anInt9944 > 4096) {
				anInt9944 = 4096;
			}
			anInt9947 = anInt9943 - (i_0_ < 0 ? -i_0_ : i_0_);
			anInt9947 = anInt9947 * anInt9947 >> 12;
			anInt9947 = anInt9947 * anInt9944 >> 12;
			anInt9946 += anInt9947 * anInt9948 >> 12;
			anInt9948 = anInt9948 * anInt9949 >> 12;
		} else {
			anInt9947 = anInt9943 - (i_0_ < 0 ? -i_0_ : i_0_);
			anInt9947 = anInt9947 * anInt9947 >> 12;
			anInt9944 = 4096;
			anInt9946 = anInt9947;
		}
	}
}
