package com.jagex;

import java.util.Random;

public abstract class Class382 {
	static final int anInt4232 = 12;
	static final int anInt4237 = 4096;
	static final int anInt4239 = 4095;
	public static int[] anIntArray4240 = new int[4096];
	static {
		for (int i = 0; i < 4096; i++) {
			anIntArray4240[i] = method6253(i);
		}
	}

	static final int method6253(int i) {
		int i_42_ = i * (i * i >> 12) >> 12;
		int i_43_ = i * 6 - 61440;
		int i_44_ = 40960 + (i_43_ * i >> 12);
		return i_44_ * i_42_ >> 12;
	}

	static int method6265(int i, int i_52_, int i_53_, int i_54_) {
		int i_55_ = i & 0xf;
		int i_56_ = i_55_ < 8 ? i_52_ : i_53_;
		int i_57_ = i_55_ < 4 ? i_53_ : i_55_ == 12 || i_55_ == 14 ? i_52_ : i_54_;
		return ((i_55_ & 0x1) == 0 ? i_56_ : -i_56_) + ((i_55_ & 0x2) == 0 ? i_57_ : -i_57_);
	}

	int anInt4230 = 4;
	short[] aShortArray4231;
	int anInt4233 = 4;
	short[] aShortArray4234 = new short[512];
	int seed = 0;
	int anInt4236 = 4;
	int anInt4238 = 4;

	Class382(int seed, int i_45_, int i_46_, int i_47_, int i_48_) {
		this.seed = seed;
		anInt4236 = i_46_;
		anInt4233 = i_47_;
		anInt4238 = i_48_;
		anInt4230 = i_45_;
		method6254();
		method6256();
	}

	void method6251(int i, int i_0_, int i_1_) {
		int[] is = new int[i];
		int[] is_2_ = new int[i_0_];
		int[] is_3_ = new int[i_1_];

		for (int i_4_ = 0; i_4_ < i; i_4_++) {
			is[i_4_] = (i_4_ << 12) / i;
		}

		for (int i_5_ = 0; i_5_ < i_0_; i_5_++) {
			is_2_[i_5_] = (i_5_ << 12) / i_0_;
		}

		for (int i_6_ = 0; i_6_ < i_1_; i_6_++) {
			is_3_[i_6_] = (i_6_ << 12) / i_1_;
		}
		method6252();

		for (int i_7_ = 0; i_7_ < i_1_; i_7_++) {
			for (int i_8_ = 0; i_8_ < i_0_; i_8_++) {
				for (int i_9_ = 0; i_9_ < i; i_9_++) {
					for (int i_10_ = 0; i_10_ < anInt4230; i_10_++) {
						int i_11_ = aShortArray4231[i_10_] << 12;
						int i_12_ = anInt4236 * i_11_ >> 12;
						int i_13_ = anInt4233 * i_11_ >> 12;
						int i_14_ = anInt4238 * i_11_ >> 12;

						int i_15_ = is[i_9_] * i_11_ >> 12;
						int i_16_ = is_2_[i_8_] * i_11_ >> 12;
						int i_17_ = is_3_[i_7_] * i_11_ >> 12;

						i_15_ *= anInt4236;
						i_16_ *= anInt4233;
						i_17_ *= anInt4238;

						int i_18_ = i_15_ >> 12;
						int i_19_ = i_18_ + 1;
						i_18_ &= 0xff;

						int i_20_ = i_16_ >> 12;
						int i_21_ = i_20_ + 1;
						i_20_ &= 0xff;

						int i_22_ = i_17_ >> 12;
						int i_23_ = i_22_ + 1;
						i_22_ &= 0xff;

						if (i_19_ >= i_12_) {
							i_19_ = 0;
						} else {
							i_19_ &= 0xff;
						}

						if (i_21_ >= i_13_) {
							i_21_ = 0;
						} else {
							i_21_ &= 0xff;
						}

						if (i_23_ >= i_14_) {
							i_23_ = 0;
						} else {
							i_23_ &= 0xff;
						}

						i_15_ &= 0xfff;
						i_16_ &= 0xfff;
						i_17_ &= 0xfff;

						int i_24_ = anIntArray4240[i_15_];
						int i_25_ = anIntArray4240[i_16_];
						int i_26_ = anIntArray4240[i_17_];

						int i_27_ = i_15_ - 4096;
						int i_28_ = i_16_ - 4096;
						int i_29_ = i_17_ - 4096;

						int i_30_ = aShortArray4234[i_22_];
						int i_31_ = aShortArray4234[i_23_];

						int i_32_ = aShortArray4234[i_20_ + i_30_];
						int i_33_ = aShortArray4234[i_21_ + i_30_];
						int i_34_ = aShortArray4234[i_20_ + i_31_];
						int i_35_ = aShortArray4234[i_21_ + i_31_];

						int i_36_ = method6265(aShortArray4234[i_18_ + i_32_], i_15_, i_16_, i_17_);
						int i_37_ = method6265(aShortArray4234[i_19_ + i_32_], i_27_, i_16_, i_17_);
						int i_38_ = i_36_ + (i_24_ * (i_37_ - i_36_) >> 12);

						i_36_ = method6265(aShortArray4234[i_18_ + i_33_], i_15_, i_28_, i_17_);
						i_37_ = method6265(aShortArray4234[i_19_ + i_33_], i_27_, i_28_, i_17_);

						int i_39_ = i_36_ + (i_24_ * (i_37_ - i_36_) >> 12);
						int i_40_ = i_38_ + (i_25_ * (i_39_ - i_38_) >> 12);

						i_36_ = method6265(aShortArray4234[i_18_ + i_34_], i_15_, i_16_, i_29_);
						i_37_ = method6265(aShortArray4234[i_19_ + i_34_], i_27_, i_16_, i_29_);

						i_38_ = i_36_ + (i_24_ * (i_37_ - i_36_) >> 12);
						i_36_ = method6265(aShortArray4234[i_18_ + i_35_], i_15_, i_28_, i_29_);
						i_37_ = method6265(aShortArray4234[i_19_ + i_35_], i_27_, i_28_, i_29_);

						i_39_ = i_36_ + (i_24_ * (i_37_ - i_36_) >> 12);
						int i_41_ = i_38_ + (i_25_ * (i_39_ - i_38_) >> 12);
						method6268(i_10_, i_40_ + (i_26_ * (i_41_ - i_40_) >> 12));
					}

					method6264();
				}
			}
		}
	}

	abstract void method6252();

	void method6254() {
		aShortArray4231 = new short[anInt4230];
		for (int i = 0; i < anInt4230; i++) {
			aShortArray4231[i] = (short) (int) Math.pow(2.0, i);
		}
	}

	void method6256() {
		Random random = new Random(seed);
		for (int i = 0; i < 255; i++) {
			aShortArray4234[i] = (short) i;
		}

		for (int i = 0; i < 255; i++) {
			int i_49_ = 255 - i;
			int i_50_ = Class36.method991(random, i_49_);
			short i_51_ = aShortArray4234[i_50_];
			aShortArray4234[i_50_] = aShortArray4234[i_49_];
			aShortArray4234[i_49_] = aShortArray4234[i_49_ + 256] = i_51_;
		}
	}

	abstract void method6264();

	abstract void method6268(int i, int i_58_);

}