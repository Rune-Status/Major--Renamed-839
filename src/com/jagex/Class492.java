package com.jagex;

public class Class492 {
	static final int anInt6759 = 10;
	static final float aFloat6760 = 3.0F;
	static final int anInt6776 = 101;
	static Toolkit aClass134_6781;
	int[] anIntArray6756;
	boolean aBool6757;
	int anInt6758;
	Class490 aClass490_6761;
	Class496 aClass496_6762;
	boolean aBool6763;
	int[] anIntArray6764;
	int anInt6765;
	int[][][] anIntArrayArrayArray6766;
	int anInt6767;
	Class509[] aClass509Array6768;
	int anInt6769;
	int anInt6770;
	int anInt6771;
	int[] anIntArray6772;
	int anInt6773;
	Class509[] aClass509Array6774;
	int[] anIntArray6775;
	public boolean aBool6777 = true;
	Class509[] aClass509Array6778;
	int[] anIntArray6779;
	int[] anIntArray6780;
	float[] aFloatArray6782;
	Class509[] aClass509Array6783;
	int[] anIntArray6784;
	int anInt6785;
	boolean aBool6786;

	Class492(Class490 class490) {
		aBool6757 = true;
		aBool6763 = false;
		anInt6773 = 0;
		aFloatArray6782 = new float[3];
		anIntArray6756 = new int[2];
		anInt6770 = -1;
		anInt6785 = -1;
		aBool6786 = true;
		anInt6758 = class490.anInt6688 * -57333661;
		anInt6765 = class490.anInt6688 * -57333661;
		aClass490_6761 = class490;
		aClass509Array6768 = new Class509[526];
		anInt6767 = 0;
		aClass509Array6778 = new Class509[2000];
		anInt6769 = 0;
		aClass509Array6783 = new Class509[1037];
		anInt6771 = 0;
		aClass509Array6774 = new Class509[1034];
		anInt6773 = 0;
		anIntArrayArrayArray6766 = new int[aClass490_6761.planes * 453886331][aClass490_6761.width * 173827901 + 1][aClass490_6761.length * 134933557 + 1];
		aBool6763 = false;
		aBool6777 = true;
		if (aBool6777) {
			aClass496_6762 = new Class496(this);
		}
	}

	public void method8494() {
		method8486();
	}

	public void method8496(int i, int i_78_, int i_79_, int i_80_, int i_81_, int i_82_, int i_83_, int i_84_) {
		aClass509Array6768[anInt6767++] = new Class509(aClass490_6761, i, i_78_, i_79_, i_80_, i_80_, i_79_, i_83_,
				i_84_, i_84_, i_83_, i_81_, i_81_, i_82_, i_82_);
	}

	public void method8513(int i, int i_101_, int i_102_, int i_103_) {
		if (i == 8 || i == 16) {
			for (int i_104_ = 0; i_104_ < anInt6771; i_104_++) {
				Class509 class509 = aClass509Array6783[i_104_];
				if (class509.aByte6994 == i
						&& class509.aByte6980 == i_101_
						&& (class509.aShort6985 == i_102_ && class509.aShort6989 == i_103_ || class509.aShort6988 == i_102_
								&& class509.aShort6990 == i_103_)) {
					if (i_104_ != anInt6771) {
						System.arraycopy(aClass509Array6783, i_104_ + 1, aClass509Array6783, i_104_,
								aClass509Array6783.length - (i_104_ + 1));
					}
					anInt6771--;
					break;
				}
			}
		} else {
			Class489 class489 = aClass490_6761.aClass489ArrayArrayArray6706[i_101_][i_102_][i_103_];
			if (class489 != null) {
				if (i == 1) {
					class489.aShort6681 = (short) 0;
				} else if (i == 2) {
					class489.aShort6683 = (short) 0;
				}
			}
			method8486();
		}
	}

	public void method8515(int i, int i_105_, int i_106_, int i_107_, int i_108_, int i_109_) {
		if (i == 8 || i == 16) {
			if (i == 8) {
				int i_110_ = i_106_ << aClass490_6761.tileScale * -1911343043;
				int i_111_ = i_110_ + aClass490_6761.anInt6688 * -57333661;
				int i_112_ = i_107_ << aClass490_6761.tileScale * -1911343043;
				int i_113_ = i_112_ + aClass490_6761.anInt6688 * -57333661;
				int i_114_ = aClass490_6761.aClass120Array6702[i_105_].getTileHeight(i_106_, i_107_);
				int i_115_ = aClass490_6761.aClass120Array6702[i_105_].getTileHeight(i_106_ + 1, i_107_ + 1);
				aClass509Array6783[anInt6771++] = new Class509(aClass490_6761, i, i_105_, i_110_, i_111_, i_111_,
						i_110_, i_114_, i_115_, i_115_ - i_108_, i_114_ - i_108_, i_112_, i_113_, i_113_, i_112_);
			} else {
				int i_116_ = (i_106_ << aClass490_6761.tileScale * -1911343043) + aClass490_6761.anInt6688 * -57333661;
				int i_117_ = i_116_ - aClass490_6761.anInt6688 * -57333661;
				int i_118_ = i_107_ << aClass490_6761.tileScale * -1911343043;
				int i_119_ = i_118_ + aClass490_6761.anInt6688 * -57333661;
				int i_120_ = aClass490_6761.aClass120Array6702[i_105_].getTileHeight(i_106_ + 1, i_107_);
				int i_121_ = aClass490_6761.aClass120Array6702[i_105_].getTileHeight(i_106_, i_107_ + 1);
				aClass509Array6783[anInt6771++] = new Class509(aClass490_6761, i, i_105_, i_116_, i_117_, i_117_,
						i_116_, i_120_, i_121_, i_121_ - i_108_, i_120_ - i_108_, i_118_, i_119_, i_119_, i_118_);
			}
		} else {
			Class489 class489 = aClass490_6761.aClass489ArrayArrayArray6706[i_105_][i_106_][i_107_];
			if (class489 == null) {
				aClass490_6761.aClass489ArrayArrayArray6706[i_105_][i_106_][i_107_] = class489 = new Class489(i_105_);
			}
			if (i == 1) {
				class489.aShort6681 = (short) i_108_;
				class489.aShort6684 = (short) i_109_;
			} else if (i == 2) {
				class489.aShort6683 = (short) i_108_;
				class489.aShort6682 = (short) i_109_;
			}
			if (aBool6763) {
				method8486();
			}
		}
	}

	final boolean method8483(Class498 class498) {
		if (class498 == null) {
			return false;
		}
		return method8497(class498.anInt6885, class498.anInt6889, class498.anInt6893, class498.anInt6890
				- class498.anInt6885, class498.anInt6892 - class498.anInt6889, class498.anInt6894 - class498.anInt6893);
	}

	void method8486() {
		for (int i = 0; i < anInt6769; i++) {
			aClass509Array6778[i] = null;
		}
		anInt6769 = 0;
		for (int i = 0; i < aClass490_6761.planes * 453886331; i++) {
			for (int i_0_ = 0; i_0_ < aClass490_6761.width * 173827901; i_0_++) {
				for (int i_1_ = 0; i_1_ < aClass490_6761.length * 134933557; i_1_++) {
					Class489 class489 = aClass490_6761.aClass489ArrayArrayArray6706[i][i_1_][i_0_];
					if (class489 != null) {
						if (class489.aShort6681 > 0) {
							class489.aShort6681 *= -1;
						}
						if (class489.aShort6683 > 0) {
							class489.aShort6683 *= -1;
						}
					}
				}
			}
		}
		for (int i = 0; i < aClass490_6761.planes * 453886331; i++) {
			for (int i_2_ = 0; i_2_ < aClass490_6761.width * 173827901; i_2_++) {
				for (int i_3_ = 0; i_3_ < aClass490_6761.length * 134933557; i_3_++) {
					Class489 class489 = aClass490_6761.aClass489ArrayArrayArray6706[i][i_3_][i_2_];
					if (class489 != null) {
						boolean bool = aClass490_6761.aClass489ArrayArrayArray6706[0][i_3_][i_2_] != null
								&& aClass490_6761.aClass489ArrayArrayArray6706[0][i_3_][i_2_].aClass489_6673 != null;
						if (class489.aShort6681 < 0) {
							int i_4_ = i_2_;
							int i_5_ = i_2_;
							int i_6_ = i;
							int i_7_ = i;
							Class489 class489_8_ = aClass490_6761.aClass489ArrayArrayArray6706[i][i_3_][i_4_ - 1];
							int i_9_;
							for (i_9_ = aClass490_6761.aClass120Array6702[i].getTileHeight(i_3_, i_2_); i_4_ > 0
									&& class489_8_ != null
									&& class489_8_.aShort6681 < 0
									&& class489_8_.aShort6681 == class489.aShort6681
									&& class489_8_.aShort6684 == class489.aShort6684
									&& i_9_ == aClass490_6761.aClass120Array6702[i].getTileHeight(i_3_, i_4_ - 1)
									&& (i_4_ - 1 <= 0 || i_9_ == aClass490_6761.aClass120Array6702[i].getTileHeight(
											i_3_, i_4_ - 2)) && i_5_ - i_4_ <= 10; class489_8_ = aClass490_6761.aClass489ArrayArrayArray6706[i][i_3_][i_4_ - 1]) {
								i_4_--;
							}
							for (class489_8_ = aClass490_6761.aClass489ArrayArrayArray6706[i][i_3_][i_5_ + 1]; i_5_ < aClass490_6761.length * 134933557
									&& class489_8_ != null
									&& class489_8_.aShort6681 < 0
									&& class489_8_.aShort6681 == class489.aShort6681
									&& class489_8_.aShort6684 == class489.aShort6684
									&& i_9_ == aClass490_6761.aClass120Array6702[i].getTileHeight(i_3_, i_5_ + 1)
									&& (i_5_ + 1 >= aClass490_6761.length * 134933557 || i_9_ == aClass490_6761.aClass120Array6702[i]
											.getTileHeight(i_3_, i_5_ + 2)) && i_5_ - i_4_ <= 10; class489_8_ = aClass490_6761.aClass489ArrayArrayArray6706[i][i_3_][i_5_ + 1]) {
								i_5_++;
							}
							int i_10_ = i_7_ - i_6_ + 1;
							int i_11_ = aClass490_6761.aClass120Array6702[bool ? i_6_ + 1 : i_6_].getTileHeight(i_3_,
									i_4_);
							int i_12_ = i_11_ + class489.aShort6681 * i_10_;
							int i_13_ = aClass490_6761.aClass120Array6702[bool ? i_6_ + 1 : i_6_].getTileHeight(i_3_,
									i_5_ + 1);
							int i_14_ = i_13_ + class489.aShort6681 * i_10_;
							int i_15_ = i_3_ << aClass490_6761.tileScale * -1911343043;
							int i_16_ = i_4_ << aClass490_6761.tileScale * -1911343043;
							int i_17_ = (i_5_ << aClass490_6761.tileScale * -1911343043)
									+ aClass490_6761.anInt6688 * -57333661;
							aClass509Array6778[anInt6769++] = new Class509(aClass490_6761, 1, i_7_, i_15_
									+ class489.aShort6684, i_15_ + class489.aShort6684, i_15_ + class489.aShort6684,
									i_15_ + class489.aShort6684, i_11_, i_13_, i_14_, i_12_, i_16_, i_17_, i_17_, i_16_);
							for (int i_18_ = i_6_; i_18_ <= i_7_; i_18_++) {
								for (int i_19_ = i_4_; i_19_ <= i_5_; i_19_++) {
									aClass490_6761.aClass489ArrayArrayArray6706[i_18_][i_3_][i_19_].aShort6681 *= -1;
								}
							}
						}
						if (class489.aShort6683 < 0) {
							int i_20_ = i_3_;
							int i_21_ = i_3_;
							int i_22_ = i;
							int i_23_ = i;
							Class489 class489_24_ = aClass490_6761.aClass489ArrayArrayArray6706[i][i_20_ - 1][i_2_];
							int i_25_;
							for (i_25_ = aClass490_6761.aClass120Array6702[i].getTileHeight(i_3_, i_2_); i_20_ > 0
									&& class489_24_ != null
									&& class489_24_.aShort6683 < 0
									&& class489_24_.aShort6683 == class489.aShort6683
									&& class489_24_.aShort6682 == class489.aShort6682
									&& i_25_ == aClass490_6761.aClass120Array6702[i].getTileHeight(i_20_ - 1, i_2_)
									&& (i_20_ - 1 <= 0 || i_25_ == aClass490_6761.aClass120Array6702[i].getTileHeight(
											i_20_ - 2, i_2_)) && i_21_ - i_20_ <= 10; class489_24_ = aClass490_6761.aClass489ArrayArrayArray6706[i][i_20_ - 1][i_2_]) {
								i_20_--;
							}
							for (class489_24_ = aClass490_6761.aClass489ArrayArrayArray6706[i][i_21_ + 1][i_2_]; i_21_ < aClass490_6761.width * 173827901
									&& class489_24_ != null
									&& class489_24_.aShort6683 < 0
									&& class489_24_.aShort6683 == class489.aShort6683
									&& class489_24_.aShort6682 == class489.aShort6682
									&& i_25_ == aClass490_6761.aClass120Array6702[i].getTileHeight(i_21_ + 1, i_2_)
									&& (i_21_ + 1 >= aClass490_6761.width * 173827901 || i_25_ == aClass490_6761.aClass120Array6702[i]
											.getTileHeight(i_21_ + 2, i_2_)) && i_21_ - i_20_ <= 10; class489_24_ = aClass490_6761.aClass489ArrayArrayArray6706[i][i_21_ + 1][i_2_]) {
								i_21_++;
							}
							int i_26_ = i_23_ - i_22_ + 1;
							int i_27_ = aClass490_6761.aClass120Array6702[bool ? i_22_ + 1 : i_22_].getTileHeight(
									i_20_, i_2_);
							int i_28_ = i_27_ + class489.aShort6683 * i_26_;
							int i_29_ = aClass490_6761.aClass120Array6702[bool ? i_22_ + 1 : i_22_].getTileHeight(
									i_21_ + 1, i_2_);
							int i_30_ = i_29_ + class489.aShort6683 * i_26_;
							int i_31_ = i_20_ << aClass490_6761.tileScale * -1911343043;
							int i_32_ = (i_21_ << aClass490_6761.tileScale * -1911343043) + aClass490_6761.anInt6688
									* -57333661;
							int i_33_ = i_2_ << aClass490_6761.tileScale * -1911343043;
							aClass509Array6778[anInt6769++] = new Class509(aClass490_6761, 2, i_23_, i_31_, i_32_,
									i_32_, i_31_, i_27_, i_29_, i_30_, i_28_, i_33_ + class489.aShort6682, i_33_
											+ class489.aShort6682, i_33_ + class489.aShort6682, i_33_
											+ class489.aShort6682);
							for (int i_34_ = i_22_; i_34_ <= i_23_; i_34_++) {
								for (int i_35_ = i_20_; i_35_ <= i_21_; i_35_++) {
									aClass490_6761.aClass489ArrayArrayArray6706[i_34_][i_35_][i_2_].aShort6683 *= -1;
								}
							}
						}
					}
				}
			}
		}
		aBool6763 = true;
	}

	boolean method8487(int i, int i_36_, int i_37_, int i_38_, int i_39_, Class498 class498) {
		if (!aBool6777 || !aBool6757) {
			return false;
		}
		if (aClass496_6762.anInt6878 < 101) {
			return false;
		}
		if (i_36_ < 0 || i_38_ < 0 || i_37_ >= anIntArrayArrayArray6766[i].length
				|| i_39_ >= anIntArrayArrayArray6766[i][i_36_].length) {
			return false;
		}
		if (i_36_ == i_37_ && i_38_ == i_39_) {
			if (!method8492(i, i_36_, i_38_)) {
				return false;
			}
			return method8483(class498);
		}
		for (int i_40_ = i_36_; i_40_ <= i_37_; i_40_++) {
			for (int i_41_ = i_38_; i_41_ <= i_39_; i_41_++) {
				if (anIntArrayArrayArray6766[i][i_40_][i_41_] == -(aClass490_6761.anInt6745 * 1515539159)) {
					return false;
				}
			}
		}
		return method8483(class498);
	}

	void method8488(Toolkit class134, int i) {
		aClass134_6781 = class134;
		if (!aBool6777 || !aBool6757) {
			anInt6773 = 0;
		} else {
			if (aBool6786) {
				aClass490_6761.aClass15_6713.getTime();
			}
			aClass134_6781.method2415(anIntArray6756);
			if (anInt6770 != (int) (anIntArray6756[0] / 3.0F) || anInt6785 != (int) (anIntArray6756[1] / 3.0F)) {
				anInt6770 = (int) (anIntArray6756[0] / 3.0F);
				anInt6785 = (int) (anIntArray6756[1] / 3.0F);
				anIntArray6780 = new int[anInt6770 * anInt6785];
			}
			anInt6773 = 0;
			for (int i_42_ = 0; i_42_ < anInt6767; i_42_++) {
				method8489(aClass134_6781, aClass509Array6768[i_42_], i);
			}
			for (int i_43_ = 0; i_43_ < anInt6769; i_43_++) {
				method8489(aClass134_6781, aClass509Array6778[i_43_], i);
			}
			for (int i_44_ = 0; i_44_ < anInt6771; i_44_++) {
				method8489(aClass134_6781, aClass509Array6783[i_44_], i);
			}
			aClass496_6762.anInt6878 = 0;
			if (anInt6773 > 0) {
				int i_45_ = anIntArray6780.length;
				int i_46_ = i_45_ - i_45_ & 0x7;
				int i_47_ = 0;
				while (i_47_ < i_46_) {
					anIntArray6780[i_47_++] = 2147483647;
					anIntArray6780[i_47_++] = 2147483647;
					anIntArray6780[i_47_++] = 2147483647;
					anIntArray6780[i_47_++] = 2147483647;
					anIntArray6780[i_47_++] = 2147483647;
					anIntArray6780[i_47_++] = 2147483647;
					anIntArray6780[i_47_++] = 2147483647;
					anIntArray6780[i_47_++] = 2147483647;
				}
				while (i_47_ < i_45_) {
					anIntArray6780[i_47_++] = 2147483647;
				}
				aClass496_6762.anInt6871 = 1;
				for (int i_48_ = 0; i_48_ < anInt6773; i_48_++) {
					Class509 class509 = aClass509Array6774[i_48_];
					aClass496_6762.method8665(class509.aShortArray6993[0], class509.aShortArray6993[1],
							class509.aShortArray6993[3], class509.aShortArray6995[0], class509.aShortArray6995[1],
							class509.aShortArray6995[3], class509.aShortArray6996[0], class509.aShortArray6996[1],
							class509.aShortArray6996[3]);
					aClass496_6762.method8665(class509.aShortArray6993[1], class509.aShortArray6993[2],
							class509.aShortArray6993[3], class509.aShortArray6995[1], class509.aShortArray6995[2],
							class509.aShortArray6995[3], class509.aShortArray6996[1], class509.aShortArray6996[2],
							class509.aShortArray6996[3]);
				}
				aClass496_6762.anInt6871 = 2;
			}
			if (aBool6786) {
				aClass490_6761.aClass15_6713.getTime();
			}
		}
	}

	void method8489(Toolkit class134, Class509 class509, int i) {
		aClass134_6781 = class134;
		if (anIntArray6775 != null && class509.aByte6980 >= i) {
			for (int i_49_ = 0; i_49_ < anIntArray6775.length; i_49_++) {
				if (anIntArray6775[i_49_] != -1000000
						&& (class509.anIntArray6992[0] <= anIntArray6775[i_49_]
								|| class509.anIntArray6992[1] <= anIntArray6775[i_49_]
								|| class509.anIntArray6992[2] <= anIntArray6775[i_49_] || class509.anIntArray6992[3] <= anIntArray6775[i_49_])
						&& (class509.anIntArray6991[0] <= anIntArray6784[i_49_]
								|| class509.anIntArray6991[1] <= anIntArray6784[i_49_]
								|| class509.anIntArray6991[2] <= anIntArray6784[i_49_] || class509.anIntArray6991[3] <= anIntArray6784[i_49_])
						&& (class509.anIntArray6991[0] >= anIntArray6764[i_49_]
								|| class509.anIntArray6991[1] >= anIntArray6764[i_49_]
								|| class509.anIntArray6991[2] >= anIntArray6764[i_49_] || class509.anIntArray6991[3] >= anIntArray6764[i_49_])
						&& (class509.anIntArray6983[0] <= anIntArray6772[i_49_]
								|| class509.anIntArray6983[1] <= anIntArray6772[i_49_]
								|| class509.anIntArray6983[2] <= anIntArray6772[i_49_] || class509.anIntArray6983[3] <= anIntArray6772[i_49_])
						&& (class509.anIntArray6983[0] >= anIntArray6779[i_49_]
								|| class509.anIntArray6983[1] >= anIntArray6779[i_49_]
								|| class509.anIntArray6983[2] >= anIntArray6779[i_49_] || class509.anIntArray6983[3] >= anIntArray6779[i_49_])) {
					return;
				}
			}
		}
		if (class509.aByte6994 == 1) {
			int i_50_ = class509.aShort6985 - aClass490_6761.anInt6723 * 1243106061 + aClass490_6761.anInt6686
					* 1414880535;
			if (i_50_ >= 0
					&& i_50_ <= aClass490_6761.anInt6686 * 1414880535 + aClass490_6761.anInt6686 * 1414880535) {
				int i_51_ = class509.aShort6989 - aClass490_6761.anInt6724 * -1342442459
						+ aClass490_6761.anInt6686 * 1414880535;
				if (i_51_ < 0) {
					i_51_ = 0;
				} else if (i_51_ > aClass490_6761.anInt6686 * 1414880535 + aClass490_6761.anInt6686 * 1414880535) {
					return;
				}
				int i_52_ = class509.aShort6990 - aClass490_6761.anInt6724 * -1342442459 + aClass490_6761.anInt6686
						* 1414880535;
				if (i_52_ > aClass490_6761.anInt6686 * 1414880535 + aClass490_6761.anInt6686 * 1414880535) {
					i_52_ = aClass490_6761.anInt6686 * 1414880535 + aClass490_6761.anInt6686 * 1414880535;
				} else if (i_52_ < 0) {
					return;
				}
				boolean bool = false;
				while_32_: do {
					do {
						if (i_51_ > i_52_) {
							break while_32_;
						}
					} while (!aClass490_6761.aBoolArrayArray6733[i_50_][i_51_++]);
					bool = true;
				} while (false);
				if (bool) {
					float f = aClass490_6761.anInt6725 * -1571728501 - class509.anIntArray6991[0];
					if (f < 0.0F) {
						f *= -1.0F;
					}
					if (!(f < anInt6758) && method8520(class509, 0) && method8520(class509, 1)
							&& method8520(class509, 2) && method8520(class509, 3)) {
						aClass509Array6774[anInt6773++] = class509;
					}
				}
			}
		} else if (class509.aByte6994 == 2) {
			int i_53_ = class509.aShort6989 - aClass490_6761.anInt6724 * -1342442459
					+ aClass490_6761.anInt6686 * 1414880535;
			if (i_53_ >= 0
					&& i_53_ <= aClass490_6761.anInt6686 * 1414880535 + aClass490_6761.anInt6686 * 1414880535) {
				int i_54_ = class509.aShort6985 - aClass490_6761.anInt6723 * 1243106061 + aClass490_6761.anInt6686
						* 1414880535;
				if (i_54_ < 0) {
					i_54_ = 0;
				} else if (i_54_ > aClass490_6761.anInt6686 * 1414880535 + aClass490_6761.anInt6686 * 1414880535) {
					return;
				}
				int i_55_ = class509.aShort6988 - aClass490_6761.anInt6723 * 1243106061 + aClass490_6761.anInt6686
						* 1414880535;
				if (i_55_ > aClass490_6761.anInt6686 * 1414880535 + aClass490_6761.anInt6686 * 1414880535) {
					i_55_ = aClass490_6761.anInt6686 * 1414880535 + aClass490_6761.anInt6686 * 1414880535;
				} else if (i_55_ < 0) {
					return;
				}
				boolean bool = false;
				while_33_: do {
					do {
						if (i_54_ > i_55_) {
							break while_33_;
						}
					} while (!aClass490_6761.aBoolArrayArray6733[i_54_++][i_53_]);
					bool = true;
				} while (false);
				if (bool) {
					float f = aClass490_6761.anInt6750 * -213807575 - class509.anIntArray6983[0];
					if (f < 0.0F) {
						f *= -1.0F;
					}
					if (!(f < anInt6758) && method8520(class509, 0) && method8520(class509, 1)
							&& method8520(class509, 2) && method8520(class509, 3)) {
						aClass509Array6774[anInt6773++] = class509;
					}
				}
			}
		} else if (class509.aByte6994 == 16 || class509.aByte6994 == 8) {
			int i_56_ = class509.aShort6985 - aClass490_6761.anInt6723 * 1243106061 + aClass490_6761.anInt6686
					* 1414880535;
			if (i_56_ >= 0
					&& i_56_ <= aClass490_6761.anInt6686 * 1414880535 + aClass490_6761.anInt6686 * 1414880535) {
				int i_57_ = class509.aShort6989 - aClass490_6761.anInt6724 * -1342442459
						+ aClass490_6761.anInt6686 * 1414880535;
				if (i_57_ >= 0
						&& i_57_ <= aClass490_6761.anInt6686 * 1414880535 + aClass490_6761.anInt6686 * 1414880535
						&& aClass490_6761.aBoolArrayArray6733[i_56_][i_57_]) {
					float f = aClass490_6761.anInt6725 * -1571728501 - class509.anIntArray6991[0];
					if (f < 0.0F) {
						f *= -1.0F;
					}
					float f_58_ = aClass490_6761.anInt6750 * -213807575 - class509.anIntArray6983[0];
					if (f_58_ < 0.0F) {
						f_58_ *= -1.0F;
					}
					if ((!(f < anInt6758) || !(f_58_ < anInt6758)) && method8520(class509, 0)
							&& method8520(class509, 1) && method8520(class509, 2) && method8520(class509, 3)) {
						aClass509Array6774[anInt6773++] = class509;
					}
				}
			}
		} else if (class509.aByte6994 == 4) {
			float f = class509.anIntArray6992[0] - aClass490_6761.anInt6727 * -1802802907;
			if (!(f <= anInt6765)) {
				int i_59_ = class509.aShort6989 - aClass490_6761.anInt6724 * -1342442459
						+ aClass490_6761.anInt6686 * 1414880535;
				if (i_59_ < 0) {
					i_59_ = 0;
				} else if (i_59_ > aClass490_6761.anInt6686 * 1414880535 + aClass490_6761.anInt6686 * 1414880535) {
					return;
				}
				int i_60_ = class509.aShort6990 - aClass490_6761.anInt6724 * -1342442459
						+ aClass490_6761.anInt6686 * 1414880535;
				if (i_60_ > aClass490_6761.anInt6686 * 1414880535 + aClass490_6761.anInt6686 * 1414880535) {
					i_60_ = aClass490_6761.anInt6686 * 1414880535 + aClass490_6761.anInt6686 * 1414880535;
				} else if (i_60_ < 0) {
					return;
				}
				int i_61_ = class509.aShort6985 - aClass490_6761.anInt6723 * 1243106061 + aClass490_6761.anInt6686
						* 1414880535;
				if (i_61_ < 0) {
					i_61_ = 0;
				} else if (i_61_ > aClass490_6761.anInt6686 * 1414880535 + aClass490_6761.anInt6686 * 1414880535) {
					return;
				}
				int i_62_ = class509.aShort6988 - aClass490_6761.anInt6723 * 1243106061 + aClass490_6761.anInt6686
						* 1414880535;
				if (i_62_ > aClass490_6761.anInt6686 * 1414880535 + aClass490_6761.anInt6686 * 1414880535) {
					i_62_ = aClass490_6761.anInt6686 * 1414880535 + aClass490_6761.anInt6686 * 1414880535;
				} else if (i_62_ < 0) {
					return;
				}
				boolean bool = false;
				while_34_: for (int i_63_ = i_61_; i_63_ <= i_62_; i_63_++) {
					for (int i_64_ = i_59_; i_64_ <= i_60_; i_64_++) {
						if (aClass490_6761.aBoolArrayArray6733[i_63_][i_64_]) {
							bool = true;
							break while_34_;
						}
					}
				}
				if (bool && method8520(class509, 0) && method8520(class509, 1) && method8520(class509, 2)
						&& method8520(class509, 3)) {
					aClass509Array6774[anInt6773++] = class509;
				}
			}
		}
	}

	final boolean method8491(int i, int i_65_, int i_66_) {
		aClass134_6781.method2424(i, i_66_, i_65_, aFloatArray6782);
		if (aFloatArray6782[2] < 50.0F) {
			return false;
		}
		aFloatArray6782[0] /= 3.0F;
		aFloatArray6782[1] /= 3.0F;
		return true;
	}

	boolean method8492(int i, int i_67_, int i_68_) {
		if (!aBool6777 || !aBool6757) {
			return false;
		}
		if (aClass496_6762.anInt6878 < 101) {
			return false;
		}
		int i_69_ = anIntArrayArrayArray6766[i][i_67_][i_68_];
		if (i_69_ == -(aClass490_6761.anInt6745 * 1515539159)) {
			return false;
		}
		if (i_69_ == aClass490_6761.anInt6745 * 1515539159) {
			return true;
		}
		if (aClass490_6761.aClass120Array6700 == aClass490_6761.aClass120Array6704) {
			return false;
		}
		int i_70_ = i_67_ << aClass490_6761.tileScale * -1911343043;
		int i_71_ = i_68_ << aClass490_6761.tileScale * -1911343043;
		if (method8498(i_70_ + 1, aClass490_6761.aClass120Array6700[i].getTileHeight(i_67_, i_68_), i_71_ + 1, i_70_
				+ aClass490_6761.anInt6688 * -57333661 - 1,
				aClass490_6761.aClass120Array6700[i].getTileHeight(i_67_ + 1, i_68_ + 1), i_71_
						+ aClass490_6761.anInt6688 * -57333661 - 1, i_70_ + 1,
				aClass490_6761.aClass120Array6700[i].getTileHeight(i_67_, i_68_ + 1), i_71_
						+ aClass490_6761.anInt6688 * -57333661 - 1)
				&& method8498(i_70_ + 1, aClass490_6761.aClass120Array6700[i].getTileHeight(i_67_, i_68_), i_71_ + 1,
						i_70_ + aClass490_6761.anInt6688 * -57333661 - 1,
						aClass490_6761.aClass120Array6700[i].getTileHeight(i_67_ + 1, i_68_), i_71_ + 1, i_70_
								+ aClass490_6761.anInt6688 * -57333661 - 1,
						aClass490_6761.aClass120Array6700[i].getTileHeight(i_67_ + 1, i_68_ + 1), i_71_
								+ aClass490_6761.anInt6688 * -57333661 - 1)) {
			anIntArrayArrayArray6766[i][i_67_][i_68_] = aClass490_6761.anInt6745 * 1515539159;
			return true;
		}
		anIntArrayArrayArray6766[i][i_67_][i_68_] = -(aClass490_6761.anInt6745 * 1515539159);
		return false;
	}

	boolean method8493(Class600_Sub1_Sub5 class600_sub1_sub5, int i, int i_72_, int i_73_) {
		if (!aBool6777 || !aBool6757) {
			return false;
		}
		if (aClass496_6762.anInt6878 < 101) {
			return false;
		}
		if (!method8492(i, i_72_, i_73_)) {
			return false;
		}
		int i_74_ = i_72_ << aClass490_6761.tileScale * -1911343043;
		int i_75_ = i_73_ << aClass490_6761.tileScale * -1911343043;
		int i_76_ = aClass490_6761.aClass120Array6700[i].getTileHeight(i_72_, i_73_) - 1;
		int i_77_ = i_76_ + class600_sub1_sub5.method16295();
		if (class600_sub1_sub5.aShort11489 == 1) {
			if (!method8498(i_74_, i_76_, i_75_, i_74_, i_77_, i_75_, i_74_, i_77_, i_75_
					+ aClass490_6761.anInt6688 * -57333661)) {
				return false;
			}
			return method8498(i_74_, i_76_, i_75_, i_74_, i_77_, i_75_ + aClass490_6761.anInt6688 * -57333661,
					i_74_, i_76_, i_75_ + aClass490_6761.anInt6688 * -57333661);
		}
		if (class600_sub1_sub5.aShort11489 == 2) {
			if (!method8498(i_74_, i_76_, i_75_ + aClass490_6761.anInt6688 * -57333661, i_74_
					+ aClass490_6761.anInt6688 * -57333661, i_77_, i_75_ + aClass490_6761.anInt6688
					* -57333661, i_74_, i_77_, i_75_ + aClass490_6761.anInt6688 * -57333661)) {
				return false;
			}
			return method8498(i_74_, i_76_, i_75_ + aClass490_6761.anInt6688 * -57333661, i_74_
					+ aClass490_6761.anInt6688 * -57333661, i_76_, i_75_ + aClass490_6761.anInt6688 * -57333661, i_74_
					+ aClass490_6761.anInt6688 * -57333661, i_77_, i_75_ + aClass490_6761.anInt6688 * -57333661);
		}
		if (class600_sub1_sub5.aShort11489 == 4) {
			if (!method8498(i_74_ + aClass490_6761.anInt6688 * -57333661, i_76_, i_75_, i_74_
					+ aClass490_6761.anInt6688 * -57333661, i_77_, i_75_, i_74_ + aClass490_6761.anInt6688
					* -57333661, i_77_, i_75_ + aClass490_6761.anInt6688 * -57333661)) {
				return false;
			}
			return method8498(i_74_ + aClass490_6761.anInt6688 * -57333661, i_76_, i_75_, i_74_
					+ aClass490_6761.anInt6688 * -57333661, i_77_, i_75_ + aClass490_6761.anInt6688
					* -57333661, i_74_ + aClass490_6761.anInt6688 * -57333661, i_76_, i_75_ + aClass490_6761.anInt6688
					* -57333661);
		}
		if (class600_sub1_sub5.aShort11489 == 8) {
			if (!method8498(i_74_, i_76_, i_75_, i_74_ + aClass490_6761.anInt6688 * -57333661, i_77_, i_75_, i_74_,
					i_77_, i_75_)) {
				return false;
			}
			return method8498(i_74_, i_76_, i_75_, i_74_ + aClass490_6761.anInt6688 * -57333661, i_76_, i_75_,
					i_74_ + aClass490_6761.anInt6688 * -57333661, i_77_, i_75_);
		}
		if (class600_sub1_sub5.aShort11489 == 16) {
			return method8497(i_74_, i_76_, i_75_ + aClass490_6761.anInt6689 * -142433419,
					aClass490_6761.anInt6689 * -142433419, i_77_, aClass490_6761.anInt6689 * -142433419);
		}
		if (class600_sub1_sub5.aShort11489 == 32) {
			return method8497(i_74_ + aClass490_6761.anInt6689 * -142433419, i_76_, i_75_
					+ aClass490_6761.anInt6689 * -142433419, aClass490_6761.anInt6689 * -142433419, i_77_,
					aClass490_6761.anInt6689 * -142433419);
		}
		if (class600_sub1_sub5.aShort11489 == 64) {
			return method8497(i_74_ + aClass490_6761.anInt6689 * -142433419, i_76_, i_75_, aClass490_6761.anInt6689
					* -142433419, i_77_, aClass490_6761.anInt6689 * -142433419);
		}
		if (class600_sub1_sub5.aShort11489 == 128) {
			return method8497(i_74_, i_76_, i_75_, aClass490_6761.anInt6689 * -142433419, i_77_,
					aClass490_6761.anInt6689 * -142433419);
		}
		return true;
	}

	final boolean method8497(int i, int i_85_, int i_86_, int i_87_, int i_88_, int i_89_) {
		int i_90_ = i + i_87_;
		int i_91_ = i_85_ + i_88_;
		int i_92_ = i_86_ + i_89_;
		if (!method8498(i, i_91_, i_86_, i_90_, i_91_, i_92_, i, i_91_, i_92_)) {
			return false;
		}
		if (!method8498(i, i_91_, i_86_, i_90_, i_91_, i_86_, i_90_, i_91_, i_92_)) {
			return false;
		}
		if (i < aClass490_6761.anInt6725 * -1571728501) {
			if (!method8498(i, i_85_, i_92_, i, i_91_, i_86_, i, i_91_, i_92_)) {
				return false;
			}
			if (!method8498(i, i_85_, i_92_, i, i_85_, i_86_, i, i_91_, i_86_)) {
				return false;
			}
		} else {
			if (!method8498(i_90_, i_85_, i_92_, i_90_, i_91_, i_86_, i_90_, i_91_, i_92_)) {
				return false;
			}
			if (!method8498(i_90_, i_85_, i_92_, i_90_, i_85_, i_86_, i_90_, i_91_, i_86_)) {
				return false;
			}
		}
		if (i_86_ < aClass490_6761.anInt6750 * -213807575) {
			if (!method8498(i, i_85_, i_86_, i_90_, i_91_, i_86_, i, i_91_, i_86_)) {
				return false;
			}
			if (!method8498(i, i_85_, i_86_, i_90_, i_85_, i_86_, i_90_, i_91_, i_86_)) {
				return false;
			}
		} else {
			if (!method8498(i, i_85_, i_92_, i_90_, i_91_, i_92_, i, i_91_, i_92_)) {
				return false;
			}
			if (!method8498(i, i_85_, i_92_, i_90_, i_85_, i_92_, i_90_, i_91_, i_92_)) {
				return false;
			}
		}
		return true;
	}

	final boolean method8498(int i, int i_93_, int i_94_, int i_95_, int i_96_, int i_97_, int i_98_, int i_99_,
			int i_100_) {
		if (!method8491(i, i_93_, i_94_)) {
			return false;
		}
		i = (int) aFloatArray6782[0];
		i_93_ = (int) aFloatArray6782[1];
		i_94_ = (int) aFloatArray6782[2];
		if (!method8491(i_95_, i_96_, i_97_)) {
			return false;
		}
		i_95_ = (int) aFloatArray6782[0];
		i_96_ = (int) aFloatArray6782[1];
		i_97_ = (int) aFloatArray6782[2];
		if (!method8491(i_98_, i_99_, i_100_)) {
			return false;
		}
		i_98_ = (int) aFloatArray6782[0];
		i_99_ = (int) aFloatArray6782[1];
		i_100_ = (int) aFloatArray6782[2];
		return aClass496_6762.method8665(i_93_, i_96_, i_99_, i, i_95_, i_98_, i_94_, i_97_, i_100_);
	}

	boolean method8520(Class509 class509, int i) {
		if (!method8491(class509.anIntArray6991[i], class509.anIntArray6992[i], class509.anIntArray6983[i])) {
			return false;
		}
		class509.aShortArray6995[i] = (short) (int) aFloatArray6782[0];
		class509.aShortArray6993[i] = (short) (int) aFloatArray6782[1];
		class509.aShortArray6996[i] = (short) (int) aFloatArray6782[2];
		return true;
	}

	boolean method8521(int i, int i_122_, int i_123_, int i_124_) {
		if (!aBool6777 || !aBool6757) {
			return false;
		}
		if (aClass496_6762.anInt6878 < 101) {
			return false;
		}
		if (!method8492(i, i_122_, i_123_)) {
			return false;
		}
		int i_125_ = i_122_ << aClass490_6761.tileScale * -1911343043;
		int i_126_ = i_123_ << aClass490_6761.tileScale * -1911343043;
		return method8497(i_125_, aClass490_6761.aClass120Array6700[i].getTileHeight(i_122_, i_123_), i_126_,
				aClass490_6761.anInt6688 * -57333661, i_124_, aClass490_6761.anInt6688 * -57333661);
	}
}
