package com.jagex;

public class Class202 {
	static int method3946(int i, int i_0_) {
		int i_1_;
		for (i_1_ = (int) Math.pow(i, 1.0 / i_0_) + 1; NpcDirection.method10426(i_1_, i_0_) > i; i_1_--) {

		}
		return i_1_;
	}

	int[] anIntArray2114;
	int anInt2115;
	int[] anIntArray2116;
	float[][] aFloatArrayArray2117;
	int[] anIntArray2118;
	int anInt2119 = 0;
	int anInt2120 = 0;

	int anInt2121;

	void method3947(Class217 class217) {
		class217.method4119(anInt2119 * 8 + anInt2120);
	}

	int method3950(Class217 class217) {
		int i;
		for (i = 0; anIntArray2116[i] >= 0; i = class217.method4060() != 0 ? anIntArray2116[i] : i + 1) {

		}
		return anIntArray2116[i] ^ 0xffffffff;
	}

	float[] method3954(Class217 class217) {
		return aFloatArrayArray2117[method3950(class217)];
	}

	void method3957() {
		int[] is = new int[anInt2115];
		int[] is_2_ = new int[33];
		for (int i = 0; i < anInt2115; i++) {
			int i_3_ = anIntArray2114[i];
			if (i_3_ != 0) {
				int i_4_ = 1 << 32 - i_3_;
				int i_5_ = is_2_[i_3_];
				is[i] = i_5_;
				int i_6_;
				if ((i_5_ & i_4_) != 0) {
					i_6_ = is_2_[i_3_ - 1];
				} else {
					i_6_ = i_5_ | i_4_;
					for (int i_7_ = i_3_ - 1; i_7_ >= 1; i_7_--) {
						int i_8_ = is_2_[i_7_];
						if (i_8_ != i_5_) {
							break;
						}
						int i_9_ = 1 << 32 - i_7_;
						if ((i_8_ & i_9_) != 0) {
							is_2_[i_7_] = is_2_[i_7_ - 1];
							break;
						}
						is_2_[i_7_] = i_8_ | i_9_;
					}
				}
				is_2_[i_3_] = i_6_;
				for (int i_10_ = i_3_ + 1; i_10_ <= 32; i_10_++) {
					int i_11_ = is_2_[i_10_];
					if (i_11_ == i_5_) {
						is_2_[i_10_] = i_6_;
					}
				}
			}
		}
		anIntArray2116 = new int[8];
		int i = 0;
		for (int i_12_ = 0; i_12_ < anInt2115; i_12_++) {
			int i_13_ = anIntArray2114[i_12_];
			if (i_13_ != 0) {
				int i_14_ = is[i_12_];
				int i_15_ = 0;
				for (int i_16_ = 0; i_16_ < i_13_; i_16_++) {
					int i_17_ = -2147483648 >>> i_16_;
					if ((i_14_ & i_17_) != 0) {
						if (anIntArray2116[i_15_] == 0) {
							anIntArray2116[i_15_] = i;
						}
						i_15_ = anIntArray2116[i_15_];
					} else {
						i_15_++;
					}
					if (i_15_ >= anIntArray2116.length) {
						int[] is_18_ = new int[anIntArray2116.length * 2];
						for (int i_19_ = 0; i_19_ < anIntArray2116.length; i_19_++) {
							is_18_[i_19_] = anIntArray2116[i_19_];
						}
						anIntArray2116 = is_18_;
					}
					i_17_ >>>= 1;
				}
				anIntArray2116[i_15_] = i_12_ ^ 0xffffffff;
				if (i_15_ >= i) {
					i = i_15_ + 1;
				}
			}
		}
	}

	void method3958(Class217 class217) {
		int i = class217.method4058();
		int i_20_ = class217.method4057();
		class217.method4119(24);
		anInt2121 = class217.method4119(16);
		anInt2115 = class217.method4119(24);
		if (anIntArray2114 == null || anIntArray2114.length != anInt2115) {
			anIntArray2114 = new int[anInt2115];
		}
		boolean bool = class217.method4060() != 0;
		if (bool) {
			int i_21_ = 0;
			int i_22_ = class217.method4119(5) + 1;
			while (i_21_ < anInt2115) {
				int i_23_ = class217.method4119(LatencyMonitor.method1059(anInt2115 - i_21_));
				for (int i_24_ = 0; i_24_ < i_23_; i_24_++) {
					anIntArray2114[i_21_++] = i_22_;
				}
				i_22_++;
			}
		} else {
			boolean bool_25_ = class217.method4060() != 0;
			for (int i_26_ = 0; i_26_ < anInt2115; i_26_++) {
				if (bool_25_ && class217.method4060() == 0) {
					anIntArray2114[i_26_] = 0;
				} else {
					anIntArray2114[i_26_] = class217.method4119(5) + 1;
				}
			}
		}
		method3957();
		int i_27_ = class217.method4119(4);
		if (i_27_ > 0) {
			float f = class217.method4056(class217.method4119(32));
			float f_28_ = class217.method4056(class217.method4119(32));
			int i_29_ = class217.method4119(4) + 1;
			boolean bool_30_ = class217.method4060() != 0;
			int i_31_;
			if (i_27_ == 1) {
				i_31_ = method3946(anInt2115, anInt2121);
			} else {
				i_31_ = anInt2115 * anInt2121;
			}
			anIntArray2118 = new int[i_31_];
			for (int i_32_ = 0; i_32_ < i_31_; i_32_++) {
				anIntArray2118[i_32_] = class217.method4119(i_29_);
			}
			aFloatArrayArray2117 = new float[anInt2115][anInt2121];
			if (i_27_ == 1) {
				for (int i_33_ = 0; i_33_ < anInt2115; i_33_++) {
					float f_34_ = 0.0F;
					int i_35_ = 1;
					for (int i_36_ = 0; i_36_ < anInt2121; i_36_++) {
						int i_37_ = i_33_ / i_35_ % i_31_;
						float f_38_ = anIntArray2118[i_37_] * f_28_ + f + f_34_;
						aFloatArrayArray2117[i_33_][i_36_] = f_38_;
						if (bool_30_) {
							f_34_ = f_38_;
						}
						i_35_ *= i_31_;
					}
				}
			} else {
				for (int i_39_ = 0; i_39_ < anInt2115; i_39_++) {
					float f_40_ = 0.0F;
					int i_41_ = i_39_ * anInt2121;
					for (int i_42_ = 0; i_42_ < anInt2121; i_42_++) {
						float f_43_ = anIntArray2118[i_41_] * f_28_ + f + f_40_;
						aFloatArrayArray2117[i_39_][i_42_] = f_43_;
						if (bool_30_) {
							f_40_ = f_43_;
						}
						i_41_++;
					}
				}
			}
		}
		anInt2120 = class217.method4058() - i;
		anInt2119 = class217.method4057() - i_20_;
	}
}
