package com.jagex;

public class Class480_Sub40_Sub1 extends Class480_Sub40 {
	static final boolean aBool11436 = true;
	static final int anInt11437 = 0;
	static final int anInt11438 = 1638;
	static final int anInt11443 = 4;
	static final int anInt11444 = 4;
	static final int anInt11449 = 8;
	short[] aShortArray11435;
	byte[] aByteArray11439 = new byte[512];
	short[] aShortArray11440;
	int anInt11441 = 0;
	int anInt11442 = -568291540;
	int anInt11445 = 1626102652;
	int anInt11446 = -1630234916;
	int anInt11447 = 1394026934;
	boolean aBool11448 = true;

	Class480_Sub40_Sub1() {
		super(0, true);
	}

	int method17897(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
		int i_6_ = i >> 12;
		int i_7_ = i_6_ + 1;
		if (i_7_ >= i_4_) {
			i_7_ = 0;
		}
		i &= 0xfff;
		i_6_ &= 0xff;
		i_7_ &= 0xff;
		int i_8_ = i - 4096;
		int i_9_ = i_0_ - 4096;
		int i_10_ = Class382.anIntArray4240[i];
		int i_11_ = aByteArray11439[i_6_ + i_1_] & 0x3;
		int i_12_;
		if (i_11_ <= 1) {
			i_12_ = 0 == i_11_ ? i_0_ + i : i_0_ - i;
		} else {
			i_12_ = i_11_ == 2 ? i - i_0_ : -i - i_0_;
		}
		i_11_ = aByteArray11439[i_1_ + i_7_] & 0x3;
		int i_13_;
		if (i_11_ <= 1) {
			i_13_ = i_11_ == 0 ? i_8_ + i_0_ : i_0_ - i_8_;
		} else {
			i_13_ = i_11_ == 2 ? i_8_ - i_0_ : -i_8_ - i_0_;
		}
		int i_14_ = (i_10_ * (i_13_ - i_12_) >> 12) + i_12_;
		i_11_ = aByteArray11439[i_2_ + i_6_] & 0x3;
		if (i_11_ <= 1) {
			i_12_ = 0 == i_11_ ? i_9_ + i : i_9_ - i;
		} else {
			i_12_ = 2 == i_11_ ? i - i_9_ : -i - i_9_;
		}
		i_11_ = aByteArray11439[i_7_ + i_2_] & 0x3;
		if (i_11_ <= 1) {
			i_13_ = 0 == i_11_ ? i_8_ + i_9_ : i_9_ - i_8_;
		} else {
			i_13_ = 2 == i_11_ ? i_8_ - i_9_ : -i_8_ - i_9_;
		}
		int i_15_ = ((i_13_ - i_12_) * i_10_ >> 12) + i_12_;
		return i_14_ + (i_3_ * (i_15_ - i_14_) >> 12);
	}

	void method17899(int i, int[] is) {
		int i_17_ = anInt11445 * -55171809 * Class12.anIntArray272[i];
		if (anInt11446 * 1746126855 == 1) {
			int i_18_ = aShortArray11440[0];
			int i_19_ = aShortArray11435[0] << 12;
			int i_20_ = i_19_ * anInt11445 * -55171809 >> 12;
			int i_21_ = -745641501 * anInt11442 * i_19_ >> 12;
			int i_22_ = i_17_ * i_19_ >> 12;
			int i_23_ = i_22_ >> 12;
			int i_24_ = i_23_ + 1;
			if (i_24_ >= i_20_) {
				i_24_ = 0;
			}
			i_22_ &= 0xfff;
			int i_25_ = Class382.anIntArray4240[i_22_];
			int i_26_ = aByteArray11439[i_23_ & 0xff] & 0xff;
			int i_27_ = aByteArray11439[i_24_ & 0xff] & 0xff;
			if (aBool11448) {
				for (int i_28_ = 0; i_28_ < Class12.anInt275 * -1019869547; i_28_++) {
					int i_29_ = -745641501 * anInt11442 * Class12.anIntArray274[i_28_];
					int i_30_ = method17897(i_19_ * i_29_ >> 12, i_22_, i_26_, i_27_, i_25_, i_21_, -32795843);
					i_30_ = i_18_ * i_30_ >> 12;
					is[i_28_] = 2048 + (i_30_ >> 1);
				}
			} else {
				for (int i_31_ = 0; i_31_ < -1019869547 * Class12.anInt275; i_31_++) {
					int i_32_ = anInt11442 * -745641501 * Class12.anIntArray274[i_31_];
					int i_33_ = method17897(i_32_ * i_19_ >> 12, i_22_, i_26_, i_27_, i_25_, i_21_, -32795843);
					is[i_31_] = i_18_ * i_33_ >> 12;
				}
			}
		} else {
			int i_34_ = aShortArray11440[0];
			if (i_34_ > 8 || i_34_ < -8) {
				int i_35_ = aShortArray11435[0] << 12;
				int i_36_ = -55171809 * anInt11445 * i_35_ >> 12;
				int i_37_ = i_35_ * -745641501 * anInt11442 >> 12;
				int i_38_ = i_35_ * i_17_ >> 12;
				int i_39_ = i_38_ >> 12;
				int i_40_ = i_39_ + 1;
				if (i_40_ >= i_36_) {
					i_40_ = 0;
				}
				i_38_ &= 0xfff;
				int i_41_ = Class382.anIntArray4240[i_38_];
				int i_42_ = aByteArray11439[i_39_ & 0xff] & 0xff;
				int i_43_ = aByteArray11439[i_40_ & 0xff] & 0xff;
				for (int i_44_ = 0; i_44_ < Class12.anInt275 * -1019869547; i_44_++) {
					int i_45_ = Class12.anIntArray274[i_44_] * -745641501 * anInt11442;
					int i_46_ = method17897(i_45_ * i_35_ >> 12, i_38_, i_42_, i_43_, i_41_, i_37_, -32795843);
					is[i_44_] = i_34_ * i_46_ >> 12;
				}
			}
			for (int i_47_ = 1; i_47_ < 1746126855 * anInt11446; i_47_++) {
				i_34_ = aShortArray11440[i_47_];
				if (i_34_ > 8 || i_34_ < -8) {
					int i_48_ = aShortArray11435[i_47_] << 12;
					int i_49_ = anInt11445 * -55171809 * i_48_ >> 12;
					int i_50_ = i_48_ * anInt11442 * -745641501 >> 12;
					int i_51_ = i_17_ * i_48_ >> 12;
					int i_52_ = i_51_ >> 12;
					int i_53_ = i_52_ + 1;
					if (i_53_ >= i_49_) {
						i_53_ = 0;
					}
					i_51_ &= 0xfff;
					int i_54_ = Class382.anIntArray4240[i_51_];
					int i_55_ = aByteArray11439[i_52_ & 0xff] & 0xff;
					int i_56_ = aByteArray11439[i_53_ & 0xff] & 0xff;
					if (aBool11448 && 1746126855 * anInt11446 - 1 == i_47_) {
						for (int i_57_ = 0; i_57_ < -1019869547 * Class12.anInt275; i_57_++) {
							int i_58_ = Class12.anIntArray274[i_57_] * -745641501 * anInt11442;
							int i_59_ = method17897(i_58_ * i_48_ >> 12, i_51_, i_55_, i_56_, i_54_, i_50_, -32795843);
							i_59_ = is[i_57_] + (i_34_ * i_59_ >> 12);
							is[i_57_] = (i_59_ >> 1) + 2048;
						}
					} else {
						for (int i_60_ = 0; i_60_ < -1019869547 * Class12.anInt275; i_60_++) {
							int i_61_ = Class12.anIntArray274[i_60_] * -745641501 * anInt11442;
							int i_62_ = method17897(i_48_ * i_61_ >> 12, i_51_, i_55_, i_56_, i_54_, i_50_, -32795843);
							is[i_60_] += i_34_ * i_62_ >> 12;
						}
					}
				}
			}
		}
	}

	void method17902() {
		aByteArray11439 = Class12.method657(anInt11441 * 543022955, -2112569844);
		method17903(1027477213);
		for (int i_63_ = 1746126855 * anInt11446 - 1; i_63_ >= 1; i_63_--) {
			short i_64_ = aShortArray11440[i_63_];
			if (i_64_ > 8 || i_64_ < -8) {
				break;
			}
			anInt11446 -= -407558729;
		}
	}

	void method17903(int i) {
		if (anInt11447 * 1292512905 > 0) {
			aShortArray11440 = new short[anInt11446 * 1746126855];
			aShortArray11435 = new short[anInt11446 * 1746126855];
			for (int i_65_ = 0; i_65_ < 1746126855 * anInt11446; i_65_++) {
				aShortArray11440[i_65_] = (short) (int) (Math.pow(anInt11447 * 1292512905 / 4096.0F, i_65_) * 4096.0);
				aShortArray11435[i_65_] = (short) (int) Math.pow(2.0, i_65_);
			}
		} else if (null != aShortArray11440 && anInt11446 * 1746126855 == aShortArray11440.length) {
			aShortArray11435 = new short[1746126855 * anInt11446];
			for (int i_66_ = 0; i_66_ < 1746126855 * anInt11446; i_66_++) {
				aShortArray11435[i_66_] = (short) (int) Math.pow(2.0, i_66_);
			}
		}
	}
}
