package com.jagex;

public class Class133 {
	static int anInt1530;
	static int anInt1531;
	static int anInt1532;
	static int[] anIntArray1533;
	static int anInt1534;
	static int anInt1535;
	static int anInt1536;
	static int anInt1537;

	public static void method2338(Toolkit toolkit, int[] is, int i) {
		method2341(toolkit, is, 0, is.length, i, null, null);
	}

	public static void method2355(Toolkit toolkit, int[] is, int i, int[] is_46_, int[] is_47_) {
		method2341(toolkit, is, 0, is.length, i, is_46_, is_47_);
	}

	static void method2341(Toolkit toolkit, int[] is, int i, int i_0_, int i_1_, int[] is_2_, int[] is_3_) {
		int[] is_4_ = new int[4];
		toolkit.method2425(is_4_);
		if (is_2_ != null && is_4_[3] - is_4_[1] != is_2_.length) {
			throw new IllegalStateException();
		}

		method2342();
		method2343(is, i, i_0_);
		method2344(is_4_[1]);

		while (method2345(is_4_[3])) {
			int i_5_ = anInt1534;
			int i_6_ = anInt1531;
			int i_7_ = anInt1530;

			if (is_2_ != null) {
				int i_8_ = i_7_ - is_4_[1];
				if (i_5_ < is_2_[i_8_] + is_4_[0]) {
					i_5_ = is_2_[i_8_] + is_4_[0];
				}

				if (i_6_ > is_2_[i_8_] + is_3_[i_8_] + is_4_[0]) {
					i_6_ = is_2_[i_8_] + is_3_[i_8_] + is_4_[0];
				}

				if (i_6_ - i_5_ <= 0) {
					continue;
				}
			}

			toolkit.method2437(i_5_, i_7_, i_6_ - i_5_, i_1_, 1);
		}
	}

	static void method2342() {
		anInt1535 = 0;
	}

	static void method2343(int[] is, int i, int i_9_) {
		int i_10_ = anInt1535 + (i_9_ << 1);
		if (anIntArray1533 == null || anIntArray1533.length < i_10_) {
			int[] is_11_ = new int[i_10_];
			for (int i_12_ = 0; i_12_ < anInt1535; i_12_++) {
				is_11_[i_12_] = anIntArray1533[i_12_];
			}
			anIntArray1533 = is_11_;
		}
		i_9_ += i;
		int i_13_ = i_9_ - 2;
		for (int i_14_ = i; i_14_ < i_9_; i_14_ += 2) {
			int i_15_ = is[i_13_ + 1];
			int i_16_ = is[i_14_ + 1];
			if (i_15_ < i_16_) {
				anIntArray1533[anInt1535++] = is[i_13_];
				anIntArray1533[anInt1535++] = i_15_;
				anIntArray1533[anInt1535++] = is[i_14_];
				anIntArray1533[anInt1535++] = i_16_;
			} else if (i_16_ < i_15_) {
				anIntArray1533[anInt1535++] = is[i_14_];
				anIntArray1533[anInt1535++] = i_16_;
				anIntArray1533[anInt1535++] = is[i_13_];
				anIntArray1533[anInt1535++] = i_15_;
			}
			i_13_ = i_14_;
		}
	}

	static void method2344(int i) {
		if (anInt1535 < 0) {
			anInt1537 = 0;
			anInt1536 = 0;
			anInt1532 = 0;
			anInt1530 = 2147483646;
		} else {
			method2346(0, anInt1535);
			int i_17_ = anIntArray1533[1];
			if (i_17_ < i) {
				i_17_ = i;
			}
			int i_18_ = 0;
			int i_19_;
			for (i_19_ = 0; i_19_ < anInt1535; i_19_ += 4) {
				int i_20_ = anIntArray1533[i_19_ + 1];
				if (i_17_ < i_20_) {
					break;
				}
				int i_21_ = anIntArray1533[i_19_];
				int i_22_ = anIntArray1533[i_19_ + 2];
				int i_23_ = anIntArray1533[i_19_ + 3];
				int i_24_ = (i_22_ - i_21_ << 16) / (i_23_ - i_20_);
				int i_25_ = (i_21_ << 16) + 32768;
				anIntArray1533[i_19_] = i_25_ + (i_17_ - i_20_) * i_24_;
				anIntArray1533[i_19_ + 2] = i_24_;
			}
			anInt1532 = i_18_;
			anInt1536 = i_19_;
			anInt1537 = i_19_;
			anInt1530 = i_17_ - 1;
		}
	}

	static boolean method2345(int i) {
		int i_26_ = anInt1536;
		int i_27_ = anInt1537;
		int i_28_ = anInt1530;
		int i_29_;
		for (; i_27_ >= i_26_; i_27_ = i_29_) {
			anInt1530 = ++i_28_;
			if (i_28_ >= i) {
				return false;
			}
			i_29_ = anInt1532;
			for (; i_26_ < anInt1535; i_26_ += 4) {
				int i_30_ = anIntArray1533[i_26_ + 1];
				if (i_28_ < i_30_) {
					break;
				}
				int i_31_ = anIntArray1533[i_26_];
				int i_32_ = anIntArray1533[i_26_ + 2];
				int i_33_ = anIntArray1533[i_26_ + 3];
				int i_34_ = (i_32_ - i_31_ << 16) / (i_33_ - i_30_);
				int i_35_ = (i_31_ << 16) + 32768;
				anIntArray1533[i_26_] = i_35_;
				anIntArray1533[i_26_ + 2] = i_34_;
			}
			for (int i_36_ = i_29_; i_36_ < i_26_; i_36_ += 4) {
				int i_37_ = anIntArray1533[i_36_ + 3];
				if (i_28_ >= i_37_) {
					anIntArray1533[i_36_] = anIntArray1533[i_29_];
					anIntArray1533[i_36_ + 1] = anIntArray1533[i_29_ + 1];
					anIntArray1533[i_36_ + 2] = anIntArray1533[i_29_ + 2];
					anIntArray1533[i_36_ + 3] = anIntArray1533[i_29_ + 3];
					i_29_ += 4;
				}
			}
			if (i_29_ == anInt1535) {
				anInt1535 = 0;
				return false;
			}
			method2363(i_29_, i_26_);
			anInt1532 = i_29_;
			anInt1536 = i_26_;
		}
		anInt1534 = anIntArray1533[i_27_] >> 16;
		anInt1531 = anIntArray1533[i_27_ + 4] >> 16;
		anIntArray1533[i_27_] += anIntArray1533[i_27_ + 2];
		anIntArray1533[i_27_ + 4] += anIntArray1533[i_27_ + 6];
		i_27_ += 8;
		anInt1537 = i_27_;
		return true;
	}

	static void method2346(int i, int i_38_) {
		if (i_38_ > i + 4) {
			int i_39_ = i;
			int i_40_ = anIntArray1533[i_39_];
			int i_41_ = anIntArray1533[i_39_ + 1];
			int i_42_ = anIntArray1533[i_39_ + 2];
			int i_43_ = anIntArray1533[i_39_ + 3];
			for (int i_44_ = i + 4; i_44_ < i_38_; i_44_ += 4) {
				int i_45_ = anIntArray1533[i_44_ + 1];
				if (i_45_ < i_41_) {
					anIntArray1533[i_39_] = anIntArray1533[i_44_];
					anIntArray1533[i_39_ + 1] = i_45_;
					anIntArray1533[i_39_ + 2] = anIntArray1533[i_44_ + 2];
					anIntArray1533[i_39_ + 3] = anIntArray1533[i_44_ + 3];
					i_39_ += 4;
					anIntArray1533[i_44_] = anIntArray1533[i_39_];
					anIntArray1533[i_44_ + 1] = anIntArray1533[i_39_ + 1];
					anIntArray1533[i_44_ + 2] = anIntArray1533[i_39_ + 2];
					anIntArray1533[i_44_ + 3] = anIntArray1533[i_39_ + 3];
				}
			}
			anIntArray1533[i_39_] = i_40_;
			anIntArray1533[i_39_ + 1] = i_41_;
			anIntArray1533[i_39_ + 2] = i_42_;
			anIntArray1533[i_39_ + 3] = i_43_;
			method2346(i, i_39_);
			method2346(i_39_ + 4, i_38_);
		}
	}

	static void method2363(int i, int i_48_) {
		for (; i_48_ >= i + 8; i_48_ -= 4) {
			boolean bool = true;
			for (int i_49_ = i + 4; i_49_ < i_48_; i_49_ += 4) {
				int i_50_ = anIntArray1533[i_49_ - 4];
				int i_51_ = anIntArray1533[i_49_];
				if (i_50_ > i_51_) {
					bool = false;
					anIntArray1533[i_49_ - 4] = i_51_;
					anIntArray1533[i_49_] = i_50_;
					i_50_ = anIntArray1533[i_49_ - 2];
					anIntArray1533[i_49_ - 2] = anIntArray1533[i_49_ + 2];
					anIntArray1533[i_49_ + 2] = i_50_;
					i_50_ = anIntArray1533[i_49_ - 1];
					anIntArray1533[i_49_ - 1] = anIntArray1533[i_49_ + 3];
					anIntArray1533[i_49_ + 3] = i_50_;
				}
			}
			if (bool) {
				break;
			}
		}
	}

	Class133() throws Throwable {
		throw new Error();
	}

}