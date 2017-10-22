package com.jagex;

public abstract class Program {
	static StringHashFunction djb2 = new Djb2HashFunction();

	public static void method4568(int i) {
		Class473.anInt6545 = -43482057 * i;
	}

	public static byte[][][] method4569(int i) {
		byte[][][] is = new byte[8][4][];
		int i_35_ = i;
		int i_36_ = i;
		byte[] is_37_ = new byte[i_35_ * i_36_];
		int i_38_ = 0;
		for (int i_39_ = 0; i_39_ < i_36_; i_39_++) {
			for (int i_40_ = 0; i_40_ < i_35_; i_40_++) {
				if (i_40_ <= i_39_) {
					is_37_[i_38_] = (byte) -1;
				}
				i_38_++;
			}
		}
		is[0][0] = is_37_;
		is_37_ = new byte[i_36_ * i_35_];
		i_38_ = 0;
		for (int i_41_ = i_36_ - 1; i_41_ >= 0; i_41_--) {
			for (int i_42_ = 0; i_42_ < i_36_; i_42_++) {
				if (i_42_ <= i_41_) {
					is_37_[i_38_] = (byte) -1;
				}
				i_38_++;
			}
		}
		is[0][1] = is_37_;
		is_37_ = new byte[i_36_ * i_35_];
		i_38_ = 0;
		for (int i_43_ = 0; i_43_ < i_36_; i_43_++) {
			for (int i_44_ = 0; i_44_ < i_35_; i_44_++) {
				if (i_44_ >= i_43_) {
					is_37_[i_38_] = (byte) -1;
				}
				i_38_++;
			}
		}
		is[0][2] = is_37_;
		is_37_ = new byte[i_36_ * i_35_];
		i_38_ = 0;
		for (int i_45_ = i_36_ - 1; i_45_ >= 0; i_45_--) {
			for (int i_46_ = 0; i_46_ < i_35_; i_46_++) {
				if (i_46_ >= i_45_) {
					is_37_[i_38_] = (byte) -1;
				}
				i_38_++;
			}
		}
		is[0][3] = is_37_;
		is_37_ = new byte[i_35_ * i_36_];
		i_38_ = 0;
		for (int i_47_ = i_36_ - 1; i_47_ >= 0; i_47_--) {
			for (int i_48_ = 0; i_48_ < i_35_; i_48_++) {
				if (i_48_ <= i_47_ >> 1) {
					is_37_[i_38_] = (byte) -1;
				}
				i_38_++;
			}
		}
		is[1][0] = is_37_;
		is_37_ = new byte[i_36_ * i_35_];
		i_38_ = 0;
		for (int i_49_ = 0; i_49_ < i_36_; i_49_++) {
			for (int i_50_ = 0; i_50_ < i_35_; i_50_++) {
				if (i_38_ < 0 || i_38_ >= is_37_.length) {
					i_38_++;
				} else {
					if (i_50_ >= i_49_ << 1) {
						is_37_[i_38_] = (byte) -1;
					}
					i_38_++;
				}
			}
		}
		is[1][1] = is_37_;
		is_37_ = new byte[i_35_ * i_36_];
		i_38_ = 0;
		for (int i_51_ = 0; i_51_ < i_36_; i_51_++) {
			for (int i_52_ = i_35_ - 1; i_52_ >= 0; i_52_--) {
				if (i_52_ <= i_51_ >> 1) {
					is_37_[i_38_] = (byte) -1;
				}
				i_38_++;
			}
		}
		is[1][2] = is_37_;
		is_37_ = new byte[i_36_ * i_35_];
		i_38_ = 0;
		for (int i_53_ = i_36_ - 1; i_53_ >= 0; i_53_--) {
			for (int i_54_ = i_35_ - 1; i_54_ >= 0; i_54_--) {
				if (i_54_ >= i_53_ << 1) {
					is_37_[i_38_] = (byte) -1;
				}
				i_38_++;
			}
		}
		is[1][3] = is_37_;
		is_37_ = new byte[i_36_ * i_35_];
		i_38_ = 0;
		for (int i_55_ = i_36_ - 1; i_55_ >= 0; i_55_--) {
			for (int i_56_ = i_35_ - 1; i_56_ >= 0; i_56_--) {
				if (i_56_ <= i_55_ >> 1) {
					is_37_[i_38_] = (byte) -1;
				}
				i_38_++;
			}
		}
		is[2][0] = is_37_;
		is_37_ = new byte[i_35_ * i_36_];
		i_38_ = 0;
		for (int i_57_ = i_36_ - 1; i_57_ >= 0; i_57_--) {
			for (int i_58_ = 0; i_58_ < i_35_; i_58_++) {
				if (i_58_ >= i_57_ << 1) {
					is_37_[i_38_] = (byte) -1;
				}
				i_38_++;
			}
		}
		is[2][1] = is_37_;
		is_37_ = new byte[i_36_ * i_35_];
		i_38_ = 0;
		for (int i_59_ = 0; i_59_ < i_36_; i_59_++) {
			for (int i_60_ = 0; i_60_ < i_35_; i_60_++) {
				if (i_60_ <= i_59_ >> 1) {
					is_37_[i_38_] = (byte) -1;
				}
				i_38_++;
			}
		}
		is[2][2] = is_37_;
		is_37_ = new byte[i_36_ * i_35_];
		i_38_ = 0;
		for (int i_61_ = 0; i_61_ < i_36_; i_61_++) {
			for (int i_62_ = i_35_ - 1; i_62_ >= 0; i_62_--) {
				if (i_62_ >= i_61_ << 1) {
					is_37_[i_38_] = (byte) -1;
				}
				i_38_++;
			}
		}
		is[2][3] = is_37_;
		is_37_ = new byte[i_36_ * i_35_];
		i_38_ = 0;
		for (int i_63_ = i_36_ - 1; i_63_ >= 0; i_63_--) {
			for (int i_64_ = 0; i_64_ < i_35_; i_64_++) {
				if (i_64_ >= i_63_ >> 1) {
					is_37_[i_38_] = (byte) -1;
				}
				i_38_++;
			}
		}
		is[3][0] = is_37_;
		is_37_ = new byte[i_35_ * i_36_];
		i_38_ = 0;
		for (int i_65_ = 0; i_65_ < i_36_; i_65_++) {
			for (int i_66_ = 0; i_66_ < i_35_; i_66_++) {
				if (i_66_ <= i_65_ << 1) {
					is_37_[i_38_] = (byte) -1;
				}
				i_38_++;
			}
		}
		is[3][1] = is_37_;
		is_37_ = new byte[i_36_ * i_35_];
		i_38_ = 0;
		for (int i_67_ = 0; i_67_ < i_36_; i_67_++) {
			for (int i_68_ = i_35_ - 1; i_68_ >= 0; i_68_--) {
				if (i_68_ >= i_67_ >> 1) {
					is_37_[i_38_] = (byte) -1;
				}
				i_38_++;
			}
		}
		is[3][2] = is_37_;
		is_37_ = new byte[i_35_ * i_36_];
		i_38_ = 0;
		for (int i_69_ = i_36_ - 1; i_69_ >= 0; i_69_--) {
			for (int i_70_ = i_35_ - 1; i_70_ >= 0; i_70_--) {
				if (i_70_ <= i_69_ << 1) {
					is_37_[i_38_] = (byte) -1;
				}
				i_38_++;
			}
		}
		is[3][3] = is_37_;
		is_37_ = new byte[i_36_ * i_35_];
		i_38_ = 0;
		for (int i_71_ = i_36_ - 1; i_71_ >= 0; i_71_--) {
			for (int i_72_ = i_35_ - 1; i_72_ >= 0; i_72_--) {
				if (i_72_ >= i_71_ >> 1) {
					is_37_[i_38_] = (byte) -1;
				}
				i_38_++;
			}
		}
		is[4][0] = is_37_;
		is_37_ = new byte[i_36_ * i_35_];
		i_38_ = 0;
		for (int i_73_ = i_36_ - 1; i_73_ >= 0; i_73_--) {
			for (int i_74_ = 0; i_74_ < i_35_; i_74_++) {
				if (i_74_ <= i_73_ << 1) {
					is_37_[i_38_] = (byte) -1;
				}
				i_38_++;
			}
		}
		is[4][1] = is_37_;
		is_37_ = new byte[i_36_ * i_35_];
		i_38_ = 0;
		for (int i_75_ = 0; i_75_ < i_36_; i_75_++) {
			for (int i_76_ = 0; i_76_ < i_35_; i_76_++) {
				if (i_76_ >= i_75_ >> 1) {
					is_37_[i_38_] = (byte) -1;
				}
				i_38_++;
			}
		}
		is[4][2] = is_37_;
		is_37_ = new byte[i_36_ * i_35_];
		i_38_ = 0;
		for (int i_77_ = 0; i_77_ < i_36_; i_77_++) {
			for (int i_78_ = i_35_ - 1; i_78_ >= 0; i_78_--) {
				if (i_78_ <= i_77_ << 1) {
					is_37_[i_38_] = (byte) -1;
				}
				i_38_++;
			}
		}
		is[4][3] = is_37_;
		is_37_ = new byte[i_36_ * i_35_];
		i_38_ = 0;
		for (int i_79_ = 0; i_79_ < i_36_; i_79_++) {
			for (int i_80_ = 0; i_80_ < i_35_; i_80_++) {
				if (i_80_ <= i_35_ / 2) {
					is_37_[i_38_] = (byte) -1;
				}
				i_38_++;
			}
		}
		is[5][0] = is_37_;
		is_37_ = new byte[i_36_ * i_35_];
		i_38_ = 0;
		for (int i_81_ = 0; i_81_ < i_36_; i_81_++) {
			for (int i_82_ = 0; i_82_ < i_35_; i_82_++) {
				if (i_81_ <= i_36_ / 2) {
					is_37_[i_38_] = (byte) -1;
				}
				i_38_++;
			}
		}
		is[5][1] = is_37_;
		is_37_ = new byte[i_35_ * i_36_];
		i_38_ = 0;
		for (int i_83_ = 0; i_83_ < i_36_; i_83_++) {
			for (int i_84_ = 0; i_84_ < i_35_; i_84_++) {
				if (i_84_ >= i_35_ / 2) {
					is_37_[i_38_] = (byte) -1;
				}
				i_38_++;
			}
		}
		is[5][2] = is_37_;
		is_37_ = new byte[i_36_ * i_35_];
		i_38_ = 0;
		for (int i_85_ = 0; i_85_ < i_36_; i_85_++) {
			for (int i_86_ = 0; i_86_ < i_35_; i_86_++) {
				if (i_85_ >= i_36_ / 2) {
					is_37_[i_38_] = (byte) -1;
				}
				i_38_++;
			}
		}
		is[5][3] = is_37_;
		is_37_ = new byte[i_35_ * i_36_];
		i_38_ = 0;
		for (int i_87_ = 0; i_87_ < i_36_; i_87_++) {
			for (int i_88_ = 0; i_88_ < i_35_; i_88_++) {
				if (i_88_ <= i_87_ - i_36_ / 2) {
					is_37_[i_38_] = (byte) -1;
				}
				i_38_++;
			}
		}
		is[6][0] = is_37_;
		is_37_ = new byte[i_36_ * i_35_];
		i_38_ = 0;
		for (int i_89_ = i_36_ - 1; i_89_ >= 0; i_89_--) {
			for (int i_90_ = 0; i_90_ < i_35_; i_90_++) {
				if (i_90_ <= i_89_ - i_36_ / 2) {
					is_37_[i_38_] = (byte) -1;
				}
				i_38_++;
			}
		}
		is[6][1] = is_37_;
		is_37_ = new byte[i_36_ * i_35_];
		i_38_ = 0;
		for (int i_91_ = i_36_ - 1; i_91_ >= 0; i_91_--) {
			for (int i_92_ = i_35_ - 1; i_92_ >= 0; i_92_--) {
				if (i_92_ <= i_91_ - i_36_ / 2) {
					is_37_[i_38_] = (byte) -1;
				}
				i_38_++;
			}
		}
		is[6][2] = is_37_;
		is_37_ = new byte[i_35_ * i_36_];
		i_38_ = 0;
		for (int i_93_ = 0; i_93_ < i_36_; i_93_++) {
			for (int i_94_ = i_35_ - 1; i_94_ >= 0; i_94_--) {
				if (i_94_ <= i_93_ - i_36_ / 2) {
					is_37_[i_38_] = (byte) -1;
				}
				i_38_++;
			}
		}
		is[6][3] = is_37_;
		is_37_ = new byte[i_35_ * i_36_];
		i_38_ = 0;
		for (int i_95_ = 0; i_95_ < i_36_; i_95_++) {
			for (int i_96_ = 0; i_96_ < i_35_; i_96_++) {
				if (i_96_ >= i_95_ - i_36_ / 2) {
					is_37_[i_38_] = (byte) -1;
				}
				i_38_++;
			}
		}
		is[7][0] = is_37_;
		is_37_ = new byte[i_35_ * i_36_];
		i_38_ = 0;
		for (int i_97_ = i_36_ - 1; i_97_ >= 0; i_97_--) {
			for (int i_98_ = 0; i_98_ < i_35_; i_98_++) {
				if (i_98_ >= i_97_ - i_36_ / 2) {
					is_37_[i_38_] = (byte) -1;
				}
				i_38_++;
			}
		}
		is[7][1] = is_37_;
		is_37_ = new byte[i_35_ * i_36_];
		i_38_ = 0;
		for (int i_99_ = i_36_ - 1; i_99_ >= 0; i_99_--) {
			for (int i_100_ = i_35_ - 1; i_100_ >= 0; i_100_--) {
				if (i_100_ >= i_99_ - i_36_ / 2) {
					is_37_[i_38_] = (byte) -1;
				}
				i_38_++;
			}
		}
		is[7][2] = is_37_;
		is_37_ = new byte[i_36_ * i_35_];
		i_38_ = 0;
		for (int i_101_ = 0; i_101_ < i_36_; i_101_++) {
			for (int i_102_ = i_35_ - 1; i_102_ >= 0; i_102_--) {
				if (i_102_ >= i_101_ - i_36_ / 2) {
					is_37_[i_38_] = (byte) -1;
				}
				i_38_++;
			}
		}
		is[7][3] = is_37_;
		return is;
	}

	public static Class405 method4573() {
		Class405 class405 = new Class405();
		class405.method6758(0.0F, 1.0F, 0.0F, (float) (Math.random() * Math.PI * 2.0));
		float f = (float) (0.5 + 0.5 * Math.random()) * 256.0F;
		class405.method6744(f - 128.0F, 0.0F, 0.0F);
		class405.method6739(0.0F, 1.0F, 0.0F, (float) (Math.random() * Math.PI * 2.0));
		return class405;
	}

	protected int anInt2637 = -99944697;
	IndexedStringTable aClass244_2633;
	IndexedStringTable aClass244_2634;
	Class249[] aClass249Array2631;
	int anInt2635;
	int anInt2636;
	String name;

	Program(NativeToolkit toolkit, ProgramDefinition definition) {
		name = definition.aString2628;
		anInt2635 = definition.aClass241Array2627.length * 1734968313;
		aClass244_2633 = new IndexedStringTable(1613745737 * anInt2635, djb2);

		for (int i = 0; i < 1613745737 * anInt2635; i++) {
			aClass244_2633.put(i, definition.aClass241Array2627[i].name, method4472(definition.aClass241Array2627[i]));
		}

		anInt2636 = -815907877 * definition.aClass241Array2629.length;
		aClass244_2634 = new IndexedStringTable(333924435 * anInt2636, djb2);

		for (int i = 0; i < anInt2636 * 333924435; i++) {
			aClass244_2634.put(i, definition.aClass241Array2629[i].name, method4472(definition.aClass241Array2629[i]));
		}

		aClass249Array2631 = new Class249[definition.aClass246Array2624.length];
		for (int i = 0; i < definition.aClass246Array2624.length; i++) {
			aClass249Array2631[i] = method4446(toolkit, definition.aClass246Array2624[i]);
		}
	}

	public abstract void method4443();

	public Class480_Sub13_Sub1 method4444(String string) {
		return (Class480_Sub13_Sub1) aClass244_2634.valueOf(string);
	}

	public Class249 method4447(String string) throws Exception_Sub1_Sub1 {
		for (Class249 class249 : aClass249Array2631) {
			String string_1_ = class249.getName();

			if (null != string_1_ && string_1_.equals(string)) {
				if (!class249.method4648()) {
					throw new Exception_Sub1_Sub1(string);
				}

				return class249;
			}
		}

		throw new Exception_Sub1_Sub1(string);
	}

	public final void method4448(Class480_Sub13_Sub1 class480_sub13_sub1, Class375 class375) {
		aClass249Array2631[-1872152247 * anInt2637].method4651(class480_sub13_sub1, class375.aFloat4161,
				class375.aFloat4160, class375.aFloat4159, class375.aFloat4162);
	}

	public final Class249 method4449(int i) {
		return aClass249Array2631[i];
	}

	public final void method4451(int i, Matrix4f class399) {
		aClass249Array2631[anInt2637 * -1872152247].method4692(i, class399);
	}

	public int indexOf(Class249 class249) {
		for (int index = 0; index < aClass249Array2631.length; index++) {
			if (class249 == aClass249Array2631[index]) {
				return index;
			}
		}

		return -1;
	}

	public final Class249 method4453() {
		return -1872152247 * anInt2637 >= 0 ? aClass249Array2631[-1872152247 * anInt2637] : null;
	}

	public final int method4454() {
		return anInt2637 * -1872152247;
	}

	public final void method4456(Class480_Sub13_Sub1 class480_sub13_sub1, float f) {
		aClass249Array2631[-1872152247 * anInt2637].method4697(class480_sub13_sub1, f);
	}

	public final void method4457(Class480_Sub13_Sub1 class480_sub13_sub1, float f, float f_5_, byte i) {
		aClass249Array2631[anInt2637 * -1872152247].method4649(class480_sub13_sub1, f, f_5_);
	}

	public final void method4458(int i, float[] fs, int i_6_) {
		aClass249Array2631[-1872152247 * anInt2637].method4661(i, fs, i_6_);
	}

	public final void method4459(Class480_Sub13_Sub1 class480_sub13_sub1, float f, float f_8_, float f_9_, float f_10_) {
		aClass249Array2631[-1872152247 * anInt2637].method4651(class480_sub13_sub1, f, f_8_, f_9_, f_10_);
	}

	public final void method4460(Class480_Sub13_Sub1 class480_sub13_sub1, Class397 class397) {
		aClass249Array2631[-1872152247 * anInt2637].method4650(class480_sub13_sub1, class397.x, class397.y, class397.z);
	}

	public final void method4461(Class480_Sub13_Sub1 class480_sub13_sub1, float f, float f_11_, float f_12_) {
		aClass249Array2631[anInt2637 * -1872152247].method4650(class480_sub13_sub1, f, f_11_, f_12_);
	}

	public int method4462() {
		return 1613745737 * anInt2635;
	}

	public final void method4463(Class480_Sub13_Sub1 class480_sub13_sub1, int i) {
		float f = (i >> 16 & 0xff) / 255.0F;
		float f_14_ = (i >> 8 & 0xff) / 255.0F;
		float f_15_ = (i & 0xff) / 255.0F;
		float f_16_ = (i >> 24 & 0xff) / 255.0F;
		method4459(class480_sub13_sub1, f, f_14_, f_15_, f_16_);
	}

	public abstract boolean method4464(Class249 class249);

	public final void method4466(Class480_Sub13_Sub1 class480_sub13_sub1, int i, NativeTexture texture) {
		aClass249Array2631[anInt2637 * -1872152247].method4655(class480_sub13_sub1, i, texture);
	}

	public final void method4468(int i, float f, float f_18_, float f_19_, float f_20_) {
		aClass249Array2631[anInt2637 * -1872152247].method4668(i, f, f_18_, f_19_, f_20_);
	}

	public final void method4469(int i, Class397 class397) {
		aClass249Array2631[anInt2637 * -1872152247].method4681(i, class397.x, class397.y, class397.z);
	}

	public final void method4470(Class480_Sub13_Sub1 class480_sub13_sub1, Matrix4f class399) {
		aClass249Array2631[-1872152247 * anInt2637].method4665(class480_sub13_sub1, class399);
	}

	public final void method4471(int i, Matrix4f class399) {
		aClass249Array2631[-1872152247 * anInt2637].method4660(i, class399);
	}

	public final void method4473(int i, int i_24_, NativeTexture texture) {
		aClass249Array2631[anInt2637 * -1872152247].method4674(i, i_24_, texture);
	}

	public int method4474() {
		return 333924435 * anInt2636;
	}

	public Class480_Sub13_Sub1 method4475(int i) {
		return (Class480_Sub13_Sub1) aClass244_2634.indexOf(i);
	}

	public abstract boolean method4476();

	public Class480_Sub13_Sub1 method4478(int i) {
		return (Class480_Sub13_Sub1) aClass244_2633.indexOf(i);
	}

	public final void method4499(int i, float f, float f_28_, float f_29_) {
		aClass249Array2631[anInt2637 * -1872152247].method4681(i, f, f_28_, f_29_);
	}

	public final int method4506() {
		return aClass249Array2631.length;
	}

	public Class480_Sub13_Sub1 method4521(String string) throws MissingShaderException {
		Class480_Sub13_Sub1 class480_sub13_sub1 = (Class480_Sub13_Sub1) aClass244_2633.valueOf(string);
		if (class480_sub13_sub1 == null) {
			throw new MissingShaderException(string);
		}
		return class480_sub13_sub1;
	}

	public abstract void method4522();

	public Class249 method4538() {
		Class249[] class249s = aClass249Array2631;
		for (Class249 class249 : class249s) {
			if (class249.method4648()) {
				return class249;
			}
		}
		return null;
	}

	public final void method4540(Class480_Sub13_Sub1 class480_sub13_sub1, Matrix4f class399) {
		aClass249Array2631[-1872152247 * anInt2637].method4653(class480_sub13_sub1, class399);
	}

	public String getName() {
		return name;
	}

	public final void method4545(Class480_Sub13_Sub1 class480_sub13_sub1, float[] fs) {
		aClass249Array2631[anInt2637 * -1872152247].method4663(class480_sub13_sub1, fs, fs.length);
	}

	public final void method4558(int i, Matrix4f class399) {
		aClass249Array2631[anInt2637 * -1872152247].method4659(i, class399);
	}

	abstract Class249 method4446(NativeToolkit toolkit, Class246 class246);

	abstract Class480_Sub13_Sub1 method4472(Class241 class241);

	void destroy() {

	}

}