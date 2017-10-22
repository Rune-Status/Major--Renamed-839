package com.jagex;

import java.util.Random;

public class Class484_Sub1 extends Class484 {

	static float[][] aFloatArrayArray10348 = { { -0.333333F, -0.333333F, -0.333333F },
			{ 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F },
			{ 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F },
			{ 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F },
			{ 0.333333F, 0.333333F, 0.333333F } };

	static final float method16206(float f, float f_0_, float f_1_) {
		return f + (f_0_ - f) * f_1_;
	}

	static final float method16207(int i, float f, float f_2_, float f_3_) {
		float[] fs = aFloatArrayArray10348[i];
		return fs[0] * f + fs[1] * f_2_ + fs[2] * f_3_;
	}

	static final float method16208(float f) {
		return f * f * f * (10.0F + (f * 6.0F - 15.0F) * f);
	}

	int[] anIntArray10347 = new int[512];

	public Class484_Sub1(int seed) {
		Random random = new Random(seed);
		for (int i_40_ = 0; i_40_ < 256; i_40_++) {
			anIntArray10347[i_40_] = anIntArray10347[i_40_ + 256] = i_40_;
		}

		for (int index = 0; index < 256; index++) {
			int next = random.nextInt() & 0xff;
			int i_43_ = anIntArray10347[next];
			anIntArray10347[next] = anIntArray10347[next + 256] = anIntArray10347[index];
			anIntArray10347[index] = anIntArray10347[index + 256] = i_43_;
		}
	}

	@Override
	void method8242(int i, int i_4_, int i_5_, int i_6_, float f, float f_7_, float f_8_, float f_9_, float[] fs,
			int i_10_) {
		int i_11_ = (int) (i_4_ * f - 1.0F);
		i_11_ &= 0xff;

		int i_12_ = (int) (i_5_ * f_7_ - 1.0F);
		i_12_ &= 0xff;

		int i_13_ = (int) (i_6_ * f_8_ - 1.0F);
		i_13_ &= 0xff;

		float f_14_ = i * f_8_;
		int i_15_ = (int) f_14_;
		int i_16_ = i_15_ + 1;

		float f_17_ = f_14_ - i_15_;
		float f_18_ = 1.0F - f_17_;
		float f_19_ = method16208(f_17_);

		i_15_ &= i_13_;
		i_16_ &= i_13_;

		int i_20_ = anIntArray10347[i_15_];
		int i_21_ = anIntArray10347[i_16_];

		for (int i_22_ = 0; i_22_ < i_5_; i_22_++) {
			float f_23_ = i_22_ * f_7_;
			int i_24_ = (int) f_23_;
			int i_25_ = i_24_ + 1;

			float f_26_ = f_23_ - i_24_;
			float f_27_ = 1.0F - f_26_;
			float f_28_ = method16208(f_26_);

			i_24_ &= i_12_;
			i_25_ &= i_12_;

			int i_29_ = anIntArray10347[i_24_ + i_20_];
			int i_30_ = anIntArray10347[i_25_ + i_20_];
			int i_31_ = anIntArray10347[i_24_ + i_21_];
			int i_32_ = anIntArray10347[i_25_ + i_21_];

			for (int i_33_ = 0; i_33_ < i_4_; i_33_++) {
				float f_34_ = i_33_ * f;
				int i_35_ = (int) f_34_;
				int i_36_ = i_35_ + 1;

				float f_37_ = f_34_ - i_35_;
				float f_38_ = 1.0F - f_37_;
				float f_39_ = method16208(f_37_);

				i_35_ &= i_11_;
				i_36_ &= i_11_;

				fs[i_10_++] = f_9_
						* method16206(
								method16206(
										method16206(
												method16207(anIntArray10347[i_35_ + i_29_] & 0x7, f_38_, f_27_, f_18_),
												method16207(anIntArray10347[i_36_ + i_29_] & 0x7, f_37_, f_27_, f_18_),
												f_39_),
										method16206(
												method16207(anIntArray10347[i_35_ + i_30_] & 0x7, f_38_, f_26_, f_18_),
												method16207(anIntArray10347[i_36_ + i_30_] & 0x7, f_37_, f_26_, f_18_),
												f_39_), f_28_),
								method16206(
										method16206(
												method16207(anIntArray10347[i_35_ + i_31_] & 0x7, f_38_, f_27_, f_17_),
												method16207(anIntArray10347[i_36_ + i_31_] & 0x7, f_37_, f_27_, f_17_),
												f_39_),
										method16206(
												method16207(anIntArray10347[i_35_ + i_32_] & 0x7, f_38_, f_26_, f_17_),
												method16207(anIntArray10347[i_36_ + i_32_] & 0x7, f_37_, f_26_, f_17_),
												f_39_), f_28_), f_19_);
			}
		}
	}

}