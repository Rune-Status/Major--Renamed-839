package com.jagex;

public class Class379 {
	static float[] aFloatArray4204 = new float[8];
	static float[] aFloatArray4208 = new float[8];
	static float[] aFloatArray4210 = new float[8];
	public float aFloat4202;
	public float aFloat4203;
	public float aFloat4205;
	public float aFloat4206;
	public float aFloat4207;
	public float aFloat4209;

	public boolean method6218(int i, int i_0_, int i_1_, int i_2_, Matrix4f class399, float f, float f_3_, float f_4_,
			float f_5_) {
		boolean bool = false;
		float f_6_ = 3.4028235E38F;
		float f_7_ = -3.4028235E38F;
		float f_8_ = 3.4028235E38F;
		float f_9_ = -3.4028235E38F;
		aFloatArray4204[0] = aFloat4206;
		aFloatArray4208[0] = aFloat4203;
		aFloatArray4210[0] = aFloat4209;
		aFloatArray4204[1] = aFloat4205;
		aFloatArray4208[1] = aFloat4203;
		aFloatArray4210[1] = aFloat4209;
		aFloatArray4204[2] = aFloat4206;
		aFloatArray4208[2] = aFloat4202;
		aFloatArray4210[2] = aFloat4209;
		aFloatArray4204[3] = aFloat4205;
		aFloatArray4208[3] = aFloat4202;
		aFloatArray4210[3] = aFloat4209;
		aFloatArray4204[4] = aFloat4206;
		aFloatArray4208[4] = aFloat4203;
		aFloatArray4210[4] = aFloat4207;
		aFloatArray4204[5] = aFloat4205;
		aFloatArray4208[5] = aFloat4203;
		aFloatArray4210[5] = aFloat4207;
		aFloatArray4204[6] = aFloat4206;
		aFloatArray4208[6] = aFloat4202;
		aFloatArray4210[6] = aFloat4207;
		aFloatArray4204[7] = aFloat4205;
		aFloatArray4208[7] = aFloat4202;
		aFloatArray4210[7] = aFloat4207;
		for (int i_10_ = 0; i_10_ < 8; i_10_++) {
			float f_11_ = aFloatArray4204[i_10_];
			float f_12_ = aFloatArray4208[i_10_];
			float f_13_ = aFloatArray4210[i_10_];
			float f_14_ = class399.array[2] * f_11_ + class399.array[6] * f_12_ + class399.array[10] * f_13_
					+ class399.array[14];
			float f_15_ = class399.array[3] * f_11_ + class399.array[7] * f_12_ + class399.array[11] * f_13_
					+ class399.array[15];
			if (f_14_ >= -f_15_) {
				float f_16_ = class399.array[0] * f_11_ + class399.array[4] * f_12_ + class399.array[8] * f_13_
						+ class399.array[12];
				float f_17_ = class399.array[1] * f_11_ + class399.array[5] * f_12_ + class399.array[9] * f_13_
						+ class399.array[13];
				float f_18_ = f + f_4_ * f_16_ / f_15_;
				float f_19_ = f_3_ + f_5_ * f_17_ / f_15_;
				if (f_18_ < f_6_) {
					f_6_ = f_18_;
				}
				if (f_18_ > f_7_) {
					f_7_ = f_18_;
				}
				if (f_19_ < f_8_) {
					f_8_ = f_19_;
				}
				if (f_19_ > f_9_) {
					f_9_ = f_19_;
				}
				bool = true;
			}
		}
		int i_20_ = i + i_1_;
		int i_21_ = i_0_ + i_2_;
		return bool && i_20_ > f_6_ && i < f_7_ && i_21_ > f_8_ && i_0_ < f_9_;
	}
}
