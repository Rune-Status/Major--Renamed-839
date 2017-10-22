package com.jagex;

public class Class139 {
	public int anInt1580;
	public boolean aBool1581 = false;
	public int anInt1582;
	public int anInt1583;
	public int anInt1584;
	public int anInt1585;

	public void method2870(Class379 class379, Matrix4f class399, Matrix4f class399_0_, float f, float f_1_, float f_2_,
			float f_3_) {
		boolean bool = false;
		aBool1581 = true;
		int i = (int) (class379.aFloat4206 + class379.aFloat4205) >> 1;
		int i_4_ = (int) (class379.aFloat4209 + class379.aFloat4207) >> 1;
		int i_5_ = i;
		int i_6_ = (int) class379.aFloat4203;
		int i_7_ = i_4_;
		float f_8_ = class399_0_.array[0] * i_5_ + class399_0_.array[4] * i_6_ + class399_0_.array[8] * i_7_
				+ class399_0_.array[12];
		float f_9_ = class399_0_.array[1] * i_5_ + class399_0_.array[5] * i_6_ + class399_0_.array[9] * i_7_
				+ class399_0_.array[13];
		float f_10_ = class399_0_.array[2] * i_5_ + class399_0_.array[6] * i_6_ + class399_0_.array[10] * i_7_
				+ class399_0_.array[14];
		float f_11_ = class399_0_.array[3] * i_5_ + class399_0_.array[7] * i_6_ + class399_0_.array[11] * i_7_
				+ class399_0_.array[15];
		if (f_10_ >= -f_11_) {
			anInt1580 = (int) (f + f_2_ * f_8_ / f_11_);
			anInt1582 = (int) (f_1_ + f_3_ * f_9_ / f_11_);
		} else {
			bool = true;
		}
		i_5_ = i;
		i_6_ = (int) class379.aFloat4202;
		i_7_ = i_4_;
		float f_12_ = class399_0_.array[0] * i_5_ + class399_0_.array[4] * i_6_ + class399_0_.array[8] * i_7_
				+ class399_0_.array[12];
		float f_13_ = class399_0_.array[1] * i_5_ + class399_0_.array[5] * i_6_ + class399_0_.array[9] * i_7_
				+ class399_0_.array[13];
		float f_14_ = class399_0_.array[2] * i_5_ + class399_0_.array[6] * i_6_ + class399_0_.array[10] * i_7_
				+ class399_0_.array[14];
		float f_15_ = class399_0_.array[3] * i_5_ + class399_0_.array[7] * i_6_ + class399_0_.array[11] * i_7_
				+ class399_0_.array[15];
		if (f_14_ >= -f_15_) {
			anInt1583 = (int) (f + f_2_ * f_12_ / f_15_);
			anInt1584 = (int) (f_1_ + f_3_ * f_13_ / f_15_);
		} else {
			bool = true;
		}
		if (bool) {
			if (f_10_ < -f_11_ && f_14_ < -f_15_) {
				aBool1581 = false;
			} else if (f_10_ < -f_11_) {
				float f_16_ = (f_10_ + f_11_) / (f_14_ + f_15_) - 1.0F;
				float f_17_ = f_8_ + f_16_ * (f_12_ - f_8_);
				float f_18_ = f_9_ + f_16_ * (f_13_ - f_9_);
				float f_19_ = f_11_ + f_16_ * (f_15_ - f_11_);
				anInt1580 = (int) (f + f_2_ * f_17_ / f_19_);
				anInt1582 = (int) (f_1_ + f_3_ * f_18_ / f_19_);
			} else if (f_14_ < -f_15_) {
				float f_20_ = (f_14_ + f_15_) / (f_10_ + f_11_) - 1.0F;
				float f_21_ = f_12_ + f_20_ * (f_8_ - f_12_);
				float f_22_ = f_13_ + f_20_ * (f_9_ - f_13_);
				float f_23_ = f_15_ + f_20_ * (f_11_ - f_15_);
				anInt1583 = (int) (f + f_2_ * f_21_ / f_23_);
				anInt1584 = (int) (f_1_ + f_3_ * f_22_ / f_23_);
			}
		}
		if (aBool1581) {
			float f_24_ = (float) Math.sqrt(Math.pow(class379.aFloat4205 - class379.aFloat4206, 2.0)
					+ Math.pow(class379.aFloat4207 - class379.aFloat4209, 2.0)) / 2.0F;
			if (f_10_ / f_11_ > f_14_ / f_15_) {
				float f_25_ = f_8_ + class399.array[0] * f_24_ + class399.array[12];
				float f_26_ = f_11_ + class399.array[3] * f_24_ + class399.array[15];
				anInt1585 = (int) (f - anInt1580 + f_2_ * f_25_ / f_26_);
			} else {
				float f_27_ = f_12_ + class399.array[0] * f_24_ + class399.array[12];
				float f_28_ = f_15_ + class399.array[3] * f_24_ + class399.array[15];
				anInt1585 = (int) (f - anInt1583 + f_2_ * f_27_ / f_28_);
			}
			aBool1581 = true;
		}
	}

	public boolean method2871(int i, int i_29_) {
		if (!aBool1581) {
			return false;
		}
		int i_30_ = anInt1583 - anInt1580;
		int i_31_ = anInt1584 - anInt1582;
		int i_32_ = i_30_ * i_30_ + i_31_ * i_31_;
		int i_33_ = i * i_30_ + i_29_ * i_31_ - (anInt1580 * i_30_ + anInt1582 * i_31_);
		if (i_33_ <= 0) {
			int i_34_ = anInt1580 - i;
			int i_35_ = anInt1582 - i_29_;
			return i_34_ * i_34_ + i_35_ * i_35_ < anInt1585 * anInt1585;
		}
		if (i_33_ > i_32_) {
			int i_36_ = anInt1583 - i;
			int i_37_ = anInt1584 - i_29_;
			return i_36_ * i_36_ + i_37_ * i_37_ < anInt1585 * anInt1585;
		}
		int i_38_ = 10;
		if (i_33_ != (i_33_ & 0x1fffff)) {
			i_38_ = 5;
		}
		i_33_ = (i_33_ << i_38_) / i_32_;
		int i_39_ = anInt1580 + (i_30_ * i_33_ >> i_38_) - i;
		int i_40_ = anInt1582 + (i_31_ * i_33_ >> i_38_) - i_29_;
		return i_39_ * i_39_ + i_40_ * i_40_ < anInt1585 * anInt1585;
	}

}