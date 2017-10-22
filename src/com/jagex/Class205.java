package com.jagex;

public class Class205 {
	int anInt2130;
	int anInt2131;
	int anInt2132;
	int anInt2133;
	Class217 aClass217_2134;
	int[] anIntArray2135;
	int[] anIntArray2136;
	int anInt2137;
	int anInt2138;
	int[][] anIntArrayArray2139;

	Class225[] method3971(Class225[] class225s, int i, boolean[] bools) {
		int i_0_ = class225s.length;
		for (int i_1_ = 0; i_1_ < i_0_; i_1_++) {
			if (!bools[i_1_]) {
				for (int i_2_ = 0; i_2_ < i; i_2_++) {
					class225s[i_1_].aFloatArray2347[i_2_] = 0.0F;
				}
			}
		}
		int i_3_ = aClass217_2134.aClass202Array2216[anInt2138].anInt2121;
		int i_4_ = anInt2132 - anInt2131;
		int i_5_ = i_4_ / anInt2133;
		if (anIntArrayArray2139 == null || anIntArrayArray2139.length != i_0_ || anIntArrayArray2139[0].length != i_5_) {
			anIntArrayArray2139 = new int[i_0_][i_5_];
		} else {
			for (int i_6_ = 0; i_6_ < i_0_; i_6_++) {
				method3972(anIntArrayArray2139[i_6_]);
			}
		}
		for (int i_7_ = 0; i_7_ < 8; i_7_++) {
			int i_8_ = 0;
			while (i_8_ < i_5_) {
				if (i_7_ == 0) {
					for (int i_9_ = 0; i_9_ < i_0_; i_9_++) {
						if (!bools[i_9_]) {
							int i_10_ = aClass217_2134.aClass202Array2216[anInt2138].method3950(aClass217_2134);
							for (int i_11_ = i_3_ - 1; i_11_ >= 0; i_11_--) {
								if (i_8_ + i_11_ < i_5_) {
									anIntArrayArray2139[i_9_][i_8_ + i_11_] = i_10_ % anInt2130;
								}
								i_10_ /= anInt2130;
							}
						}
					}
				}
				for (int i_12_ = 0; i_12_ < i_3_; i_12_++) {
					for (int i_13_ = 0; i_13_ < i_0_; i_13_++) {
						if (!bools[i_13_]) {
							int i_14_ = anIntArrayArray2139[i_13_][i_8_];
							int i_15_ = anIntArray2136[i_14_ * 8 + i_7_];
							if (i_15_ >= 0) {
								int i_16_ = anInt2131 + i_8_ * anInt2133;
								Class202 class202 = aClass217_2134.aClass202Array2216[i_15_];
								if (anInt2137 == 0) {
									int i_17_ = anInt2133 / class202.anInt2121;
									for (int i_18_ = 0; i_18_ < i_17_; i_18_++) {
										float[] fs = class202.method3954(aClass217_2134);
										for (int i_19_ = 0; i_19_ < class202.anInt2121; i_19_++) {
											class225s[i_13_].aFloatArray2347[i_16_ + i_18_ + i_19_ * i_17_] += fs[i_19_];
										}
									}
								} else if (anInt2137 == 1 || anInt2137 == 2) {
									int i_20_ = 0;
									while (i_20_ < anInt2133) {
										float[] fs = class202.method3954(aClass217_2134);
										for (int i_21_ = 0; i_21_ < class202.anInt2121; i_21_++) {
											class225s[i_13_].aFloatArray2347[i_16_ + i_20_] += fs[i_21_];
											i_20_++;
										}
									}
								}
							}
						}
					}
					if (++i_8_ >= i_5_) {
						break;
					}
				}
			}
		}
		return class225s;
	}

	void method3972(int[] is) {
		if (is != null) {
			for (int i = 0; i < is.length; i++) {
				is[i] = 0;
			}
		}
	}

	void method3976(Class217 class217) {
		aClass217_2134 = class217;
		anInt2137 = aClass217_2134.method4119(16);
		anInt2131 = aClass217_2134.method4119(24);
		anInt2132 = aClass217_2134.method4119(24);
		anInt2133 = aClass217_2134.method4119(24) + 1;
		anInt2130 = aClass217_2134.method4119(6) + 1;
		anInt2138 = aClass217_2134.method4119(8);
		if (anIntArray2135 == null || anIntArray2135.length != anInt2130) {
			anIntArray2135 = new int[anInt2130];
		}
		for (int i = 0; i < anInt2130; i++) {
			int i_22_ = 0;
			int i_23_ = aClass217_2134.method4119(3);
			boolean bool = aClass217_2134.method4060() != 0;
			if (bool) {
				i_22_ = aClass217_2134.method4119(5);
			}
			anIntArray2135[i] = i_22_ << 3 | i_23_;
		}
		if (anIntArray2136 == null || anIntArray2136.length != anInt2130 * 8) {
			anIntArray2136 = new int[anInt2130 * 8];
		}
		for (int i = 0; i < anInt2130 * 8; i++) {
			anIntArray2136[i] = (anIntArray2135[i >> 3] & 1 << (i & 0x7)) != 0 ? aClass217_2134.method4119(8) : -1;
		}
	}

}