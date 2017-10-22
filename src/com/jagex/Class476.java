package com.jagex;

public class Class476 {
	public static byte[] method8139(int i, int i_15_, int i_16_, int i_17_, Class484 class484, float f, float f_18_,
			float f_19_, float f_20_, float f_21_) {
		byte[] is = new byte[i * i_15_ * i_16_];
		method8142(i, i_15_, i_16_, i_17_, class484, f, f_18_, f_19_, f_20_, f_21_, is, 0);
		return is;
	}

	static void method8138(int i, int i_0_, int i_1_, int i_2_, int i_3_, Class484 class484, float f, float f_4_,
			float f_5_, float f_6_, float f_7_, byte[] is, int i_8_) {
		int i_9_ = i_0_ * i_1_;
		float[] fs = new float[i_9_];
		for (int i_10_ = 0; i_10_ < i_3_; i_10_++) {
			int i_11_ = i_8_;
			class484.method8242(i, i_0_, i_1_, i_2_, f / i_0_, f_4_ / i_1_, f_5_ / i_2_, f_6_ * 127.0F, fs, 0);
			for (int i_12_ = 0; i_12_ < i_9_; i_12_++) {
				is[i_11_] += fs[i_12_];
				i_11_++;
			}
			f *= 2.0F;
			f_4_ *= 2.0F;
			f_5_ *= 2.0F;
			f_6_ *= f_7_;
		}
		int i_13_ = i_8_;
		for (int i_14_ = 0; i_14_ < i_9_; i_14_++) {
			is[i_13_] = (byte) (is[i_13_] + 127);
			i_13_++;
		}
	}

	static void method8142(int i, int i_22_, int i_23_, int i_24_, Class484 class484, float f, float f_25_,
			float f_26_, float f_27_, float f_28_, byte[] is, int i_29_) {
		for (int i_30_ = 0; i_30_ < i_23_; i_30_++) {
			method8138(i_30_, i, i_22_, i_23_, i_24_, class484, f, f_25_, f_26_, f_27_, f_28_, is, i_29_);
			i_29_ += i * i_22_;
		}
	}

	Class476() throws Throwable {
		throw new Error();
	}
}
