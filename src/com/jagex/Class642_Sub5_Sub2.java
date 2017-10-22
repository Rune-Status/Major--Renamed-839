package com.jagex;

public class Class642_Sub5_Sub2 extends Class642_Sub5 {
	float[] aFloatArray11473;
	float[] aFloatArray11474;
	float[] aFloatArray11475;
	int anInt11476 = 0;

	public Class642_Sub5_Sub2(Class261 class261) {
		super(class261);
	}

	@Override
	float method16765(float f, float f_2_, float f_3_, int i) {
		float f_4_ = aFloat10573 / f;
		if (f_4_ < 0.0F) {
			f_4_ = 0.0F;
		}
		if (f_4_ > 1.0F) {
			f_4_ = 1.0F;
		}
		return f
				/ aFloatArray11473[1485611641 * anInt11476]
				* (aFloatArray11475[1485611641 * anInt11476] + f_4_
						* (aFloatArray11474[1485611641 * anInt11476] - aFloatArray11475[anInt11476 * 1485611641]));
	}

	@Override
	void method16766(byte i) {
		anInt11476 += 1584670665;
	}

	@Override
	void method16768(Buffer buffer, int i, int i_0_) {
		aFloatArray11475 = new float[i];
		aFloatArray11474 = new float[i];
		aFloatArray11473 = new float[i];
		anInt11476 = 0;
		for (int i_1_ = 0; i_1_ < i; i_1_++) {
			aFloatArray11475[i_1_] = buffer.readFloat();
			aFloatArray11474[i_1_] = buffer.readFloat();
			aFloatArray11473[i_1_] = buffer.readFloat();
		}
	}
}
