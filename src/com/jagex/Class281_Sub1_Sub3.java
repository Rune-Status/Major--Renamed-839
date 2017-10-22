package com.jagex;

public class Class281_Sub1_Sub3 extends Class281_Sub1 {
	float[] aFloatArray11157;
	float[] aFloatArray11158;
	float[] aFloatArray11159;
	int anInt11160 = 0;

	public Class281_Sub1_Sub3(Class261 class261) {
		super(class261);
	}

	@Override
	float method15215(float f, float f_0_, float f_1_, int i) {
		float f_2_ = aFloat9745 / f;
		if (f_2_ < 0.0F) {
			f_2_ = 0.0F;
		}
		if (f_2_ > 1.0F) {
			f_2_ = 1.0F;
		}
		return (aFloatArray11158[anInt11160 * -30666349] + f_2_
				* (aFloatArray11157[-30666349 * anInt11160] - aFloatArray11158[anInt11160 * -30666349]))
				* (f / aFloatArray11159[-30666349 * anInt11160]);
	}

	@Override
	void method15216(int i) {
		anInt11160 += -1225608037;
	}

	@Override
	void method15218(Buffer buffer, int i, int i_3_) {
		aFloatArray11158 = new float[i];
		aFloatArray11157 = new float[i];
		aFloatArray11159 = new float[i];
		anInt11160 = 0;
		for (int i_4_ = 0; i_4_ < i; i_4_++) {
			aFloatArray11158[i_4_] = buffer.readFloat();
			aFloatArray11157[i_4_] = buffer.readFloat();
			aFloatArray11159[i_4_] = buffer.readFloat();
		}
	}
}
