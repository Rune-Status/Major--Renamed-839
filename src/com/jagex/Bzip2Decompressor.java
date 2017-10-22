package com.jagex;

public final class Bzip2Decompressor {
	static final int anInt8192 = 50;
	static final int anInt8193 = 16;
	static final int anInt8194 = 4096;
	static final int anInt8195 = 23;
	static final int anInt8196 = 1;
	static final int anInt8197 = 6;
	static final int anInt8198 = 0;
	static Bzip2Context context = new Bzip2Context();

	public static int decompress(byte[] is, int i, byte[] is_0_, int i_1_, int i_2_) {
		synchronized (context) {
			context.aByteArray8096 = is_0_;
			context.anInt8092 = i_2_ * 1313918141;
			context.aByteArray8094 = is;
			context.anInt8095 = 0;
			context.anInt8121 = i * -481545447;
			context.anInt8101 = 0;
			context.anInt8100 = 0;
			context.anInt8093 = 0;
			context.anInt8085 = 0;
			method13397(context);
			i -= context.anInt8121 * -882018007;
			context.aByteArray8096 = null;
			context.aByteArray8094 = null;
			return i;
		}
	}

	static void method13397(Bzip2Context context) {
		int i = 0;
		int[] is = null;
		int[] is_21_ = null;
		int[] is_22_ = null;
		context.anInt8113 = -957100321;
		if (MonochromeJavaFont.anIntArray8946 == null) {
			MonochromeJavaFont.anIntArray8946 = new int[context.anInt8113 * 761359712];
		}
		boolean bool_23_ = true;
		while (bool_23_) {
			byte i_24_ = method13398(context);
			if (i_24_ == 23) {
				break;
			}
			i_24_ = method13398(context);
			i_24_ = method13398(context);
			i_24_ = method13398(context);
			i_24_ = method13398(context);
			i_24_ = method13398(context);
			i_24_ = method13398(context);
			i_24_ = method13398(context);
			i_24_ = method13398(context);
			i_24_ = method13398(context);
			i_24_ = method13399(context);
			if (i_24_ == 0) {

			}
			context.anInt8109 = 0;
			int i_25_ = method13398(context);
			context.anInt8109 = (context.anInt8109 * -588089053 << 8 | i_25_ & 0xff) * 41123467;
			i_25_ = method13398(context);
			context.anInt8109 = (context.anInt8109 * -588089053 << 8 | i_25_ & 0xff) * 41123467;
			i_25_ = method13398(context);
			context.anInt8109 = (context.anInt8109 * -588089053 << 8 | i_25_ & 0xff) * 41123467;
			for (int i_26_ = 0; i_26_ < 16; i_26_++) {
				i_24_ = method13399(context);
				context.aBoolArray8111[i_26_] = i_24_ == 1;
			}
			for (int i_27_ = 0; i_27_ < 256; i_27_++) {
				context.aBoolArray8110[i_27_] = false;
			}
			for (int i_28_ = 0; i_28_ < 16; i_28_++) {
				if (context.aBoolArray8111[i_28_]) {
					for (int i_29_ = 0; i_29_ < 16; i_29_++) {
						i_24_ = method13399(context);
						if (i_24_ == 1) {
							context.aBoolArray8110[i_28_ * 16 + i_29_] = true;
						}
					}
				}
			}
			method13401(context);
			int i_30_ = context.anInt8116 * -9933127 + 2;
			int i_31_ = method13400(3, context);
			int i_32_ = method13400(15, context);
			for (int i_33_ = 0; i_33_ < i_32_; i_33_++) {
				int i_34_ = 0;
				for (;;) {
					i_24_ = method13399(context);
					if (i_24_ == 0) {
						break;
					}
					i_34_++;
				}
				context.aByteArray8103[i_33_] = (byte) i_34_;
			}
			byte[] is_35_ = new byte[6];
			for (byte i_36_ = 0; i_36_ < i_31_; i_36_++) {
				is_35_[i_36_] = i_36_;
			}
			for (int i_37_ = 0; i_37_ < i_32_; i_37_++) {
				byte i_38_ = context.aByteArray8103[i_37_];
				byte i_39_ = is_35_[i_38_];
				for (; i_38_ > 0; i_38_--) {
					is_35_[i_38_] = is_35_[i_38_ - 1];
				}
				is_35_[0] = i_39_;
				context.aByteArray8102[i_37_] = i_39_;
			}
			for (int i_40_ = 0; i_40_ < i_31_; i_40_++) {
				int i_41_ = method13400(5, context);
				for (int i_42_ = 0; i_42_ < i_30_; i_42_++) {
					for (;;) {
						i_24_ = method13399(context);
						if (i_24_ == 0) {
							break;
						}
						i_24_ = method13399(context);
						if (i_24_ == 0) {
							i_41_++;
						} else {
							i_41_--;
						}
					}
					context.aByteArrayArray8117[i_40_][i_42_] = (byte) i_41_;
				}
			}
			for (int i_43_ = 0; i_43_ < i_31_; i_43_++) {
				int i_44_ = 32;
				byte i_45_ = 0;
				for (int i_46_ = 0; i_46_ < i_30_; i_46_++) {
					if (context.aByteArrayArray8117[i_43_][i_46_] > i_45_) {
						i_45_ = context.aByteArrayArray8117[i_43_][i_46_];
					}
					if (context.aByteArrayArray8117[i_43_][i_46_] < i_44_) {
						i_44_ = context.aByteArrayArray8117[i_43_][i_46_];
					}
				}
				method13402(context.anIntArrayArray8118[i_43_], context.anIntArrayArray8089[i_43_],
						context.anIntArrayArray8120[i_43_], context.aByteArrayArray8117[i_43_], i_44_, i_45_, i_30_);
				context.anIntArray8119[i_43_] = i_44_;
			}
			int i_47_ = context.anInt8116 * -9933127 + 1;
			int i_48_ = -1;
			int i_49_ = 0;
			for (int i_50_ = 0; i_50_ <= 255; i_50_++) {
				context.anIntArray8106[i_50_] = 0;
			}
			int i_51_ = 4095;
			for (int i_52_ = 15; i_52_ >= 0; i_52_--) {
				for (int i_53_ = 15; i_53_ >= 0; i_53_--) {
					context.aByteArray8097[i_51_] = (byte) (i_52_ * 16 + i_53_);
					i_51_--;
				}
				context.anIntArray8114[i_52_] = i_51_ + 1;
			}
			int i_54_ = 0;
			if (i_49_ == 0) {
				i_48_++;
				i_49_ = 50;
				byte i_55_ = context.aByteArray8102[i_48_];
				i = context.anIntArray8119[i_55_];
				is = context.anIntArrayArray8118[i_55_];
				is_22_ = context.anIntArrayArray8120[i_55_];
				is_21_ = context.anIntArrayArray8089[i_55_];
			}
			i_49_--;
			int i_56_ = i;
			int i_57_;
			int i_58_;
			for (i_58_ = method13400(i_56_, context); i_58_ > is[i_56_]; i_58_ = i_58_ << 1 | i_57_) {
				i_56_++;
				i_57_ = method13399(context);
			}
			int i_59_ = is_22_[i_58_ - is_21_[i_56_]];
			while (i_59_ != i_47_) {
				if (i_59_ == 0 || i_59_ == 1) {
					int i_60_ = -1;
					int i_61_ = 1;
					do {
						if (i_59_ == 0) {
							i_60_ += 1 * i_61_;
						} else if (i_59_ == 1) {
							i_60_ += 2 * i_61_;
						}
						i_61_ *= 2;
						if (i_49_ == 0) {
							i_48_++;
							i_49_ = 50;
							byte i_62_ = context.aByteArray8102[i_48_];
							i = context.anIntArray8119[i_62_];
							is = context.anIntArrayArray8118[i_62_];
							is_22_ = context.anIntArrayArray8120[i_62_];
							is_21_ = context.anIntArrayArray8089[i_62_];
						}
						i_49_--;
						i_56_ = i;
						for (i_58_ = method13400(i_56_, context); i_58_ > is[i_56_]; i_58_ = i_58_ << 1 | i_57_) {
							i_56_++;
							i_57_ = method13399(context);
						}
						i_59_ = is_22_[i_58_ - is_21_[i_56_]];
					} while (i_59_ == 0 || i_59_ == 1);
					i_60_++;
					i_25_ = context.aByteArray8122[context.aByteArray8097[context.anIntArray8114[0]] & 0xff];
					context.anIntArray8106[i_25_ & 0xff] += i_60_;
					for (; i_60_ > 0; i_60_--) {
						MonochromeJavaFont.anIntArray8946[i_54_] = i_25_ & 0xff;
						i_54_++;
					}
				} else {
					int i_63_ = i_59_ - 1;
					if (i_63_ < 16) {
						int i_64_ = context.anIntArray8114[0];
						i_24_ = context.aByteArray8097[i_64_ + i_63_];
						for (; i_63_ > 3; i_63_ -= 4) {
							int i_65_ = i_64_ + i_63_;
							context.aByteArray8097[i_65_] = context.aByteArray8097[i_65_ - 1];
							context.aByteArray8097[i_65_ - 1] = context.aByteArray8097[i_65_ - 2];
							context.aByteArray8097[i_65_ - 2] = context.aByteArray8097[i_65_ - 3];
							context.aByteArray8097[i_65_ - 3] = context.aByteArray8097[i_65_ - 4];
						}
						for (; i_63_ > 0; i_63_--) {
							context.aByteArray8097[i_64_ + i_63_] = context.aByteArray8097[i_64_ + i_63_ - 1];
						}
						context.aByteArray8097[i_64_] = i_24_;
					} else {
						int i_66_ = i_63_ / 16;
						int i_67_ = i_63_ % 16;
						int i_68_ = context.anIntArray8114[i_66_] + i_67_;
						i_24_ = context.aByteArray8097[i_68_];
						for (; i_68_ > context.anIntArray8114[i_66_]; i_68_--) {
							context.aByteArray8097[i_68_] = context.aByteArray8097[i_68_ - 1];
						}
						context.anIntArray8114[i_66_]++;
						for (; i_66_ > 0; i_66_--) {
							context.anIntArray8114[i_66_]--;
							context.aByteArray8097[context.anIntArray8114[i_66_]] = context.aByteArray8097[context.anIntArray8114[i_66_ - 1] + 16 - 1];
						}
						context.anIntArray8114[0]--;
						context.aByteArray8097[context.anIntArray8114[0]] = i_24_;
						if (context.anIntArray8114[0] == 0) {
							i_51_ = 4095;
							for (int i_69_ = 15; i_69_ >= 0; i_69_--) {
								for (int i_70_ = 15; i_70_ >= 0; i_70_--) {
									context.aByteArray8097[i_51_] = context.aByteArray8097[context.anIntArray8114[i_69_]
											+ i_70_];
									i_51_--;
								}
								context.anIntArray8114[i_69_] = i_51_ + 1;
							}
						}
					}
					context.anIntArray8106[context.aByteArray8122[i_24_ & 0xff] & 0xff]++;
					MonochromeJavaFont.anIntArray8946[i_54_] = context.aByteArray8122[i_24_ & 0xff] & 0xff;
					i_54_++;
					if (i_49_ == 0) {
						i_48_++;
						i_49_ = 50;
						byte i_71_ = context.aByteArray8102[i_48_];
						i = context.anIntArray8119[i_71_];
						is = context.anIntArrayArray8118[i_71_];
						is_22_ = context.anIntArrayArray8120[i_71_];
						is_21_ = context.anIntArrayArray8089[i_71_];
					}
					i_49_--;
					i_56_ = i;
					for (i_58_ = method13400(i_56_, context); i_58_ > is[i_56_]; i_58_ = i_58_ << 1 | i_57_) {
						i_56_++;
						i_57_ = method13399(context);
					}
					i_59_ = is_22_[i_58_ - is_21_[i_56_]];
				}
			}
			context.anInt8099 = 0;
			context.aByte8112 = (byte) 0;
			context.anIntArray8108[0] = 0;
			for (int i_72_ = 1; i_72_ <= 256; i_72_++) {
				context.anIntArray8108[i_72_] = context.anIntArray8106[i_72_ - 1];
			}
			for (int i_73_ = 1; i_73_ <= 256; i_73_++) {
				context.anIntArray8108[i_73_] += context.anIntArray8108[i_73_ - 1];
			}
			for (int i_74_ = 0; i_74_ < i_54_; i_74_++) {
				i_25_ = (byte) (MonochromeJavaFont.anIntArray8946[i_74_] & 0xff);
				MonochromeJavaFont.anIntArray8946[context.anIntArray8108[i_25_ & 0xff]] |= i_74_ << 8;
				context.anIntArray8108[i_25_ & 0xff]++;
			}
			context.anInt8115 = (MonochromeJavaFont.anIntArray8946[context.anInt8109 * -588089053] >> 8) * -1960467243;
			context.anInt8107 = 0;
			context.anInt8115 = MonochromeJavaFont.anIntArray8946[context.anInt8115 * -818514819] * -1960467243;
			context.anInt8105 = (byte) (context.anInt8115 * -818514819 & 0xff) * 768402561;
			Bzip2Context class635_75_;
			(class635_75_ = context).anInt8115 = (class635_75_.anInt8115 * -818514819 >> 8) * -1960467243;
			context.anInt8107 += -1653862747;
			context.anInt8091 = i_54_ * 168485507;
			method13405(context);
			bool_23_ = context.anInt8107 * 263530797 == context.anInt8091 * -275645397 + 1
					&& context.anInt8099 * -1852564001 == 0;
		}
	}

	static byte method13398(Bzip2Context class635) {
		return (byte) method13400(8, class635);
	}

	static byte method13399(Bzip2Context class635) {
		return (byte) method13400(1, class635);
	}

	static int method13400(int i, Bzip2Context class635) {
		for (;;) {
			if (class635.anInt8101 * 597521901 >= i) {
				int i_76_ = class635.anInt8100 * 1200351525 >> class635.anInt8101 * 597521901 - i & (1 << i) - 1;
				class635.anInt8101 -= i * -1986318363;
				return i_76_;
			}
			class635.anInt8100 = (class635.anInt8100 * 1200351525 << 8 | class635.aByteArray8096[class635.anInt8092
					* -108491115] & 0xff) * 1853360813;
			class635.anInt8101 += 1289322280;
			class635.anInt8092 += 1313918141;
			class635.anInt8093 += -432460003;
			if (class635.anInt8093 * 490670901 == 0) {

			}
		}
	}

	static void method13401(Bzip2Context class635) {
		class635.anInt8116 = 0;
		for (int i = 0; i < 256; i++) {
			if (class635.aBoolArray8110[i]) {
				class635.aByteArray8122[class635.anInt8116 * -9933127] = (byte) i;
				class635.anInt8116 += 1785411465;
			}
		}
	}

	static void method13402(int[] is, int[] is_77_, int[] is_78_, byte[] is_79_, int i, int i_80_, int i_81_) {
		int i_82_ = 0;
		for (int i_83_ = i; i_83_ <= i_80_; i_83_++) {
			for (int i_84_ = 0; i_84_ < i_81_; i_84_++) {
				if (is_79_[i_84_] == i_83_) {
					is_78_[i_82_] = i_84_;
					i_82_++;
				}
			}
		}
		for (int i_85_ = 0; i_85_ < 23; i_85_++) {
			is_77_[i_85_] = 0;
		}
		for (int i_86_ = 0; i_86_ < i_81_; i_86_++) {
			is_77_[is_79_[i_86_] + 1]++;
		}
		for (int i_87_ = 1; i_87_ < 23; i_87_++) {
			is_77_[i_87_] += is_77_[i_87_ - 1];
		}
		for (int i_88_ = 0; i_88_ < 23; i_88_++) {
			is[i_88_] = 0;
		}
		int i_89_ = 0;
		for (int i_90_ = i; i_90_ <= i_80_; i_90_++) {
			i_89_ += is_77_[i_90_ + 1] - is_77_[i_90_];
			is[i_90_] = i_89_ - 1;
			i_89_ <<= 1;
		}
		for (int i_91_ = i + 1; i_91_ <= i_80_; i_91_++) {
			is_77_[i_91_] = (is[i_91_ - 1] + 1 << 1) - is_77_[i_91_];
		}
	}

	static void method13405(Bzip2Context class635) {
		byte i = class635.aByte8112;
		int i_92_ = class635.anInt8099 * -1852564001;
		int i_93_ = class635.anInt8107 * 263530797;
		int i_94_ = class635.anInt8105 * 1460099969;
		int[] is = MonochromeJavaFont.anIntArray8946;
		int i_95_ = class635.anInt8115 * -818514819;
		byte[] is_96_ = class635.aByteArray8094;
		int i_97_ = class635.anInt8095 * 1580984691;
		int i_98_ = class635.anInt8121 * -882018007;
		int i_99_ = i_98_;
		int i_100_ = class635.anInt8091 * -275645397 + 1;
		while_37_: for (;;) {
			if (i_92_ > 0) {
				for (;;) {
					if (i_98_ == 0) {
						break while_37_;
					}
					if (i_92_ == 1) {
						break;
					}
					is_96_[i_97_] = i;
					i_92_--;
					i_97_++;
					i_98_--;
				}
				if (i_98_ == 0) {
					i_92_ = 1;
					break;
				}
				is_96_[i_97_] = i;
				i_97_++;
				i_98_--;
			}
			for (;;) {
				if (i_93_ == i_100_) {
					i_92_ = 0;
					break while_37_;
				}
				i = (byte) i_94_;
				i_95_ = is[i_95_];
				int i_101_ = (byte) i_95_;
				i_95_ >>= 8;
				i_93_++;
				if (i_101_ != i_94_) {
					i_94_ = i_101_;
					if (i_98_ == 0) {
						i_92_ = 1;
						break while_37_;
					}
					is_96_[i_97_] = i;
					i_97_++;
					i_98_--;
				} else {
					if (i_93_ != i_100_) {
						break;
					}
					if (i_98_ == 0) {
						i_92_ = 1;
						break while_37_;
					}
					is_96_[i_97_] = i;
					i_97_++;
					i_98_--;
				}
			}
			i_92_ = 2;
			i_95_ = is[i_95_];
			int i_102_ = (byte) i_95_;
			i_95_ >>= 8;
			if (++i_93_ != i_100_) {
				if (i_102_ != i_94_) {
					i_94_ = i_102_;
				} else {
					i_92_ = 3;
					i_95_ = is[i_95_];
					i_102_ = (byte) i_95_;
					i_95_ >>= 8;
					if (++i_93_ != i_100_) {
						if (i_102_ != i_94_) {
							i_94_ = i_102_;
						} else {
							i_95_ = is[i_95_];
							i_102_ = (byte) i_95_;
							i_95_ >>= 8;
							i_93_++;
							i_92_ = (i_102_ & 0xff) + 4;
							i_95_ = is[i_95_];
							i_94_ = (byte) i_95_;
							i_95_ >>= 8;
							i_93_++;
						}
					}
				}
			}
		}
		int i_103_ = class635.anInt8085 * -2141656925;
		class635.anInt8085 += (i_99_ - i_98_) * 1426393867;
		if (class635.anInt8085 * -2141656925 >= i_103_) {

		}
		class635.aByte8112 = i;
		class635.anInt8099 = i_92_ * 1173872159;
		class635.anInt8107 = i_93_ * -1653862747;
		class635.anInt8105 = i_94_ * 768402561;
		MonochromeJavaFont.anIntArray8946 = is;
		class635.anInt8115 = i_95_ * -1960467243;
		class635.aByteArray8094 = is_96_;
		class635.anInt8095 = i_97_ * -67673157;
		class635.anInt8121 = i_98_ * -481545447;
	}

	Bzip2Decompressor() throws Throwable {
		throw new Error();
	}
}
