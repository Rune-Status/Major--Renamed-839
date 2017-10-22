package com.jagex;

public class Class281_Sub1_Sub1 extends Class281_Sub1 {
	static String[] aStringArray11041;
	float[] aFloatArray11038;
	float[] aFloatArray11039;
	int anInt11040 = 0;

	public Class281_Sub1_Sub1(Class261 class261) {
		super(class261);
	}

	@Override
	public float method15226(short i) {
		return aFloat9745;
	}

	@Override
	public Class397 method5224() {
		Class397 class397 = Class397.empty();
		double[] ds = aClass401Array9742[1576672349 * anInt11040].method6671(aFloat9745);
		class397.x = (float) ds[0];
		class397.y = (float) ds[1];
		class397.z = (float) ds[2];
		return class397;
	}

	@Override
	public double[] method5228() {
		return aClass401Array9742[anInt11040 * 1576672349].method6671(aFloat9745);
	}

	@Override
	public float method5230(byte i) {
		return aClass401Array9742[anInt11040 * 1576672349].method6689(aFloat9745);
	}

	@Override
	void method15214(float f, float f_0_, int i) {
		aFloat9745 += f;
		if (aFloat9745 > aClass401Array9742[1576672349 * anInt11040].method6684()) {
			aFloat9745 = aClass401Array9742[1576672349 * anInt11040].method6684();
		}
	}

	@Override
	float method15215(float f, float f_1_, float f_2_, int i) {
		float f_3_ = aFloat9745 / aClass401Array9742[1576672349 * anInt11040].method6684();
		float f_4_ = aFloatArray11039[anInt11040 * 1576672349]
				+ (aFloatArray11038[anInt11040 * 1576672349] - aFloatArray11039[anInt11040 * 1576672349]) * f_3_;
		return f_4_;
	}

	@Override
	void method15216(int i) {
		anInt11040 += -569862155;
	}

	@Override
	void method15218(Buffer buffer, int i, int i_5_) {
		aFloatArray11039 = new float[i];
		aFloatArray11038 = new float[i];
		anInt11040 = 0;
		for (int i_6_ = 0; i_6_ < i; i_6_++) {
			aFloatArray11039[i_6_] = buffer.readFloat();
			aFloatArray11038[i_6_] = buffer.readFloat();
		}
	}
}
