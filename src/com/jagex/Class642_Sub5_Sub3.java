package com.jagex;

public class Class642_Sub5_Sub3 extends Class642_Sub5 {
	int anInt11477 = 0;
	float[] aFloatArray11478;
	float[] aFloatArray11479;

	public Class642_Sub5_Sub3(Class261 class261) {
		super(class261);
	}

	@Override
	public Class397 method13222(byte i) {
		return method13235();
	}

	@Override
	public Class397 method13235() {
		Class397 class397 = Class397.empty();
		double[] ds = aClass401Array10575[1804370861 * anInt11477].method6671(aFloat10573);
		class397.x = (float) ds[0];
		class397.y = (float) ds[1];
		class397.z = (float) ds[2];
		return class397;
	}

	@Override
	void method16764(float f, float f_4_, byte i) {
		aFloat10573 += f;
		if (aFloat10573 > aClass401Array10575[1804370861 * anInt11477].method6684()) {
			aFloat10573 = aClass401Array10575[anInt11477 * 1804370861].method6684();
		}
	}

	@Override
	float method16765(float f, float f_0_, float f_1_, int i) {
		float f_2_ = aFloat10573 / aClass401Array10575[1804370861 * anInt11477].method6684();
		float f_3_ = (aFloatArray11478[anInt11477 * 1804370861] - aFloatArray11479[anInt11477 * 1804370861]) * f_2_
				+ aFloatArray11479[anInt11477 * 1804370861];
		return f_3_;
	}

	@Override
	void method16766(byte i) {
		anInt11477 += -1764501467;
	}

	@Override
	double[] method16767(int i) {
		return aClass401Array10575[1804370861 * anInt11477].method6671(aFloat10573);
	}

	@Override
	void method16768(Buffer buffer, int i, int i_5_) {
		aFloatArray11479 = new float[i];
		aFloatArray11478 = new float[i];
		anInt11477 = 0;
		for (int i_6_ = 0; i_6_ < i; i_6_++) {
			aFloatArray11479[i_6_] = buffer.readFloat();
			aFloatArray11478[i_6_] = buffer.readFloat();
		}
	}
}
