package com.jagex;

public class NativeSprite extends Sprite {
	int anInt8694;
	Native2DTexture anInterface29_8695;
	NativeToolkit toolkit;
	int anInt8697;
	int anInt8698;
	boolean aBool8699 = false;
	int anInt8700;
	Interface16 anInterface16_8701;
	int anInt8702;
	int anInt8703;
	boolean aBool8704;
	boolean aBool8705;
	boolean aBool8706;
	boolean aBool8707;

	NativeSprite(NativeToolkit toolkit, int width, int height, boolean transparent, boolean bool_135_) {
		this.toolkit = toolkit;
		anInt8697 = width;
		anInt8698 = height;

		if (bool_135_) {
			Interface40 interface40 = toolkit.create2DTexture(transparent ? Class121.aClass121_1465
					: Class121.aClass121_1466, Class151.aClass151_2, width, height);
			anInterface16_8701 = interface40.method305(0);
			anInterface29_8695 = interface40;
		} else {
			anInterface29_8695 = toolkit.method14740(transparent ? Class121.aClass121_1465 : Class121.aClass121_1466,
					Class151.aClass151_2, width, height);
			anInterface16_8701 = null;
		}

		anInterface29_8695.setRepeating(true, true);
		aBool8704 = anInterface29_8695.getWidth() != width;
		aBool8705 = anInterface29_8695.getHeight() != height;
		aBool8706 = !aBool8704 && anInterface29_8695.method181();
		aBool8707 = !aBool8705 && anInterface29_8695.method181();
	}

	NativeSprite(NativeToolkit toolkit, int i, int i_0_, int[] is, int i_1_, int i_2_) {
		this.toolkit = toolkit;
		anInt8697 = i;
		anInt8698 = i_0_;
		anInterface16_8701 = null;
		anInterface29_8695 = toolkit.method14717(i, i_0_, false, is, i_1_, i_2_);
		anInterface29_8695.setRepeating(true, true);
		aBool8704 = anInterface29_8695.getWidth() != i;
		aBool8705 = anInterface29_8695.getHeight() != i_0_;
		aBool8706 = !aBool8704 && anInterface29_8695.method181();
		aBool8707 = !aBool8705 && anInterface29_8695.method181();
	}

	NativeSprite(NativeToolkit class134_sub3, Native2DTexture interface29) {
		this(class134_sub3, interface29, interface29.getWidth(), interface29.getHeight());
	}

	NativeSprite(NativeToolkit toolkit, Native2DTexture interface29, int i, int i_128_) {
		anInt8694 = 0;
		anInt8702 = 0;
		anInt8700 = 0;
		anInt8703 = 0;
		this.toolkit = toolkit;
		anInt8697 = i;
		anInt8698 = i_128_;
		anInterface29_8695 = interface29;
		anInterface16_8701 = null;
		aBool8704 = anInterface29_8695.getWidth() != i;
		aBool8705 = anInterface29_8695.getHeight() != i_128_;
		aBool8706 = !aBool8704 && anInterface29_8695.method181();
		aBool8707 = !aBool8705 && anInterface29_8695.method181();
	}

	@Override
	public int scaleWidth() {
		return anInt8697 + anInt8702 + anInt8703;
	}

	@Override
	public void setOffsets(int i, int i_18_, int i_19_, int i_20_) {
		anInt8702 = i;
		anInt8694 = i_18_;
		anInt8703 = i_19_;
		anInt8700 = i_20_;
		aBool8699 = anInt8702 != 0 || anInt8694 != 0 || anInt8703 != 0 || anInt8700 != 0;
	}

	@Override
	public void getOffsets(int[] is) {
		is[0] = anInt8702;
		is[1] = anInt8694;
		is[2] = anInt8703;
		is[3] = anInt8700;
	}

	@Override
	public int scaleHeight() {
		return anInt8698 + anInt8694 + anInt8700;
	}

	@Override
	public Interface16 method2075() {
		return anInterface16_8701;
	}

	@Override
	public void method2076(int i, int i_26_, int i_27_, int i_28_, int[] is, int[] is_29_, int i_30_, int i_31_) {
		anInterface29_8695.method185(i, i_26_, i_27_, i_28_, is, is_29_, i_30_);
	}

	@Override
	public void method2081(int i, int i_37_, ClippingMask class129, int i_38_, int i_39_) {
		toolkit.method14741();
		Class299 class299 = toolkit.aClass299_9370;
		class299.anInterface29_3282 = anInterface29_8695;
		class299.method5448(1, -1);
		i += anInt8702;
		i_37_ += anInt8694;
		float f = toolkit.method2628().getWidth();
		float f_40_ = toolkit.method2628().getHeight();
		class299.aClass399_3284.method6551(anInt8697 * 2.0F / f, anInt8698 * 2.0F / f_40_, 1.0F, 1.0F);
		class299.aClass399_3284.array[12] = (i + toolkit.method14608()) * 2.0F / f - 1.0F;
		class299.aClass399_3284.array[13] = (i_37_ + toolkit.method14608()) * 2.0F / f_40_ - 1.0F;
		class299.aClass399_3284.array[14] = -1.0F;
		class299.aClass399_3281.method6551(anInterface29_8695.method191(anInt8697),
				anInterface29_8695.method180(anInt8698), 1.0F, 1.0F);
		class299.anInterface32_3287 = toolkit.anInterface32_9417;
		class299.anInt3289 = 0;
		class299.aClass323_3288 = toolkit.aClass323_9420;
		Native2DTexture interface29 = ((NativeClippingMask) class129).texture;
		class299.anInterface29_3283 = interface29;
		class299.aClass399_3285.method6551(interface29.method191(anInt8697), interface29.method180(anInt8698), 1.0F,
				1.0F);
		class299.aClass399_3285.array[12] = interface29.method191(i - i_38_);
		class299.aClass399_3285.array[13] = interface29.method180(i_37_ - i_39_);
		class299.method5449();
	}

	@Override
	public void method2085(int i, int i_49_, int i_50_, int i_51_, int i_52_, int i_53_, int i_54_) {
		if (toolkit.method14715() != Class306.aClass306_3313) {
			int i_55_ = i_49_ + i_51_;
			int i_56_ = i + i_50_;
			int i_57_ = scaleWidth();
			int i_58_ = scaleHeight();
			int i_59_ = i_49_ + anInt8694;
			for (int i_60_ = i_59_ + anInt8698; i_60_ <= i_55_; i_60_ += i_58_) {
				int i_61_ = i + anInt8702;
				for (int i_62_ = i_61_ + anInt8697; i_62_ <= i_56_; i_62_ += i_57_) {
					toolkit.aClass346_9366.method5910(i_61_, i_59_, i_61_ + anInt8697, i_59_ + anInt8698, 0.0F, 0.0F,
							anInterface29_8695.method187(), anInterface29_8695.method184(), anInterface29_8695, i_53_);
					i_61_ += i_57_;
				}
				if (i_61_ < i_56_) {
					int i_63_ = i_56_ - i_61_;
					toolkit.aClass346_9366.method5910(i_61_, i_59_, i_61_ + i_63_, i_59_ + anInt8698, 0.0F, 0.0F,
							(float) i_63_ / (float) anInt8697 * anInterface29_8695.method187(),
							anInterface29_8695.method184(), anInterface29_8695, i_53_);
				}
				i_59_ += i_58_;
			}
			if (i_59_ < i_55_) {
				int i_64_ = i_55_ - i_59_;
				float f = (float) i_64_ / (float) anInt8698 * anInterface29_8695.method184();
				int i_65_ = i + anInt8702;
				for (int i_66_ = i_65_ + anInt8697; i_66_ <= i_56_; i_66_ += i_57_) {
					toolkit.aClass346_9366.method5910(i_65_, i_59_, i_65_ + anInt8697, i_59_ + i_64_, 0.0F, 0.0F,
							anInterface29_8695.method187(), f, anInterface29_8695, i_53_);
					i_65_ += i_57_;
				}
				if (i_65_ < i_56_) {
					int i_67_ = i_56_ - i_65_;
					toolkit.aClass346_9366.method5910(i_65_, i_59_, i_65_ + i_67_, i_59_ + i_64_, 0.0F, 0.0F,
							(float) i_67_ / (float) anInt8697 * anInterface29_8695.method187(), f, anInterface29_8695,
							i_53_);
				}
			}
		} else {
			toolkit.method14741();
			toolkit.method14893(i_54_);
			Class299 class299 = toolkit.aClass299_9370;
			class299.anInterface29_3282 = anInterface29_8695;
			class299.method5448(i_52_, i_53_);
			float f = toolkit.method2628().getWidth();
			float f_68_ = toolkit.method2628().getHeight();
			class299.anInterface32_3287 = toolkit.anInterface32_9417;
			class299.anInt3289 = 0;
			class299.aClass323_3288 = toolkit.aClass323_9420;
			boolean bool = aBool8707 && anInt8694 == 0 && anInt8700 == 0;
			boolean bool_69_ = aBool8706 && anInt8702 == 0 && anInt8703 == 0;
			if (bool_69_ & bool) {
				class299.aClass399_3284.method6551(i_50_ * 2.0F / f, i_51_ * 2.0F / f_68_, 1.0F, 1.0F);
				class299.aClass399_3284.array[12] = (i + toolkit.method14608()) * 2.0F / f - 1.0F;
				class299.aClass399_3284.array[13] = (i_49_ + toolkit.method14608()) * 2.0F / f_68_ - 1.0F;
				class299.aClass399_3284.array[14] = -1.0F;
				class299.aClass399_3281.method6551(anInterface29_8695.method191(i_50_),
						anInterface29_8695.method180(i_51_), 1.0F, 1.0F);
				class299.method5453();
			} else if (bool_69_) {
				int i_70_ = i_49_ + i_51_;
				int i_71_ = scaleHeight();
				class299.aClass399_3281.method6551(anInterface29_8695.method191(i_50_),
						anInterface29_8695.method180(anInt8698), 1.0F, 1.0F);
				int i_72_ = i_49_ + anInt8694;
				for (int i_73_ = i_72_ + anInt8698; i_73_ <= i_70_; i_73_ += i_71_) {
					class299.aClass399_3284.method6551(i_50_ * 2.0F / f, anInt8698 * 2.0F / f_68_, 1.0F, 1.0F);
					class299.aClass399_3284.array[12] = (i + toolkit.method14608()) * 2.0F / f - 1.0F;
					class299.aClass399_3284.array[13] = (i_72_ + toolkit.method14608()) * 2.0F / f_68_ - 1.0F;
					class299.aClass399_3284.array[14] = -1.0F;
					class299.method5453();
					i_72_ += i_71_;
				}
				if (i_72_ < i_70_) {
					int i_74_ = i_70_ - i_72_;
					class299.aClass399_3281.method6551(anInterface29_8695.method191(i_50_),
							anInterface29_8695.method180(i_74_), 1.0F, 1.0F);
					class299.aClass399_3284.method6551(i_50_ * 2.0F / f, i_74_ * 2.0F / f_68_, 1.0F, 1.0F);
					class299.aClass399_3284.array[12] = (i + toolkit.method14608()) * 2.0F / f - 1.0F;
					class299.aClass399_3284.array[13] = (i_72_ + toolkit.method14608()) * 2.0F / f_68_ - 1.0F;
					class299.aClass399_3284.array[14] = -1.0F;
					class299.method5453();
				}
			} else if (bool) {
				int i_75_ = i + i_50_;
				int i_76_ = scaleWidth();
				class299.aClass399_3281.method6551(anInterface29_8695.method191(anInt8697),
						anInterface29_8695.method180(i_51_), 1.0F, 1.0F);
				int i_77_ = i + anInt8702;
				for (int i_78_ = i_77_ + anInt8697; i_78_ <= i_75_; i_78_ += i_76_) {
					class299.aClass399_3284.method6551(anInt8697 * 2.0F / f, i_51_ * 2.0F / f_68_, 1.0F, 1.0F);
					class299.aClass399_3284.array[12] = (i_77_ + toolkit.method14608()) * 2.0F / f - 1.0F;
					class299.aClass399_3284.array[13] = (i_49_ + toolkit.method14608()) * 2.0F / f_68_ - 1.0F;
					class299.aClass399_3284.array[14] = -1.0F;
					class299.method5453();
					i_77_ += i_76_;
				}
				if (i_77_ < i_75_) {
					int i_79_ = i_75_ - i_77_;
					class299.aClass399_3281.method6551(anInterface29_8695.method191(i_79_),
							anInterface29_8695.method180(i_51_), 1.0F, 1.0F);
					class299.aClass399_3284.method6551(i_79_ * 2.0F / f, i_51_ * 2.0F / f_68_, 1.0F, 1.0F);
					class299.aClass399_3284.array[12] = (i_77_ + toolkit.method14608()) * 2.0F / f - 1.0F;
					class299.aClass399_3284.array[13] = (i_49_ + toolkit.method14608()) * 2.0F / f_68_ - 1.0F;
					class299.aClass399_3284.array[14] = -1.0F;
					class299.method5453();
				}
			} else {
				int i_80_ = i_49_ + i_51_;
				int i_81_ = i + i_50_;
				int i_82_ = scaleWidth();
				int i_83_ = scaleHeight();
				int i_84_ = i_49_ + anInt8694;
				for (int i_85_ = i_84_ + anInt8698; i_85_ <= i_80_; i_85_ += i_83_) {
					class299.aClass399_3281.method6551(anInterface29_8695.method191(anInt8697),
							anInterface29_8695.method180(anInt8698), 1.0F, 1.0F);
					int i_86_ = i + anInt8702;
					for (int i_87_ = i_86_ + anInt8697; i_87_ <= i_81_; i_87_ += i_82_) {
						class299.aClass399_3284.method6551(anInt8697 * 2.0F / f, anInt8698 * 2.0F / f_68_, 1.0F, 1.0F);
						class299.aClass399_3284.array[12] = (i_86_ + toolkit.method14608()) * 2.0F / f - 1.0F;
						class299.aClass399_3284.array[13] = (i_84_ + toolkit.method14608()) * 2.0F / f_68_ - 1.0F;
						class299.aClass399_3284.array[14] = -1.0F;
						class299.method5453();
						i_86_ += i_82_;
					}
					if (i_86_ < i_81_) {
						int i_88_ = i_81_ - i_86_;
						class299.aClass399_3281.method6551(anInterface29_8695.method191(i_88_),
								anInterface29_8695.method180(anInt8698), 1.0F, 1.0F);
						class299.aClass399_3284.method6551(i_88_ * 2.0F / f, anInt8698 * 2.0F / f_68_, 1.0F, 1.0F);
						class299.aClass399_3284.array[12] = (i_86_ + toolkit.method14608()) * 2.0F / f - 1.0F;
						class299.aClass399_3284.array[13] = (i_84_ + toolkit.method14608()) * 2.0F / f_68_ - 1.0F;
						class299.aClass399_3284.array[14] = -1.0F;
						class299.method5453();
					}
					i_84_ += i_83_;
				}
				if (i_84_ < i_80_) {
					int i_89_ = i_80_ - i_84_;
					class299.aClass399_3281.method6551(anInterface29_8695.method191(anInt8697),
							anInterface29_8695.method180(i_89_), 1.0F, 1.0F);
					int i_90_ = i + anInt8702;
					for (int i_91_ = i_90_ + anInt8697; i_91_ <= i_81_; i_91_ += i_82_) {
						class299.aClass399_3284.method6551(anInt8697 * 2.0F / f, i_89_ * 2.0F / f_68_, 1.0F, 1.0F);
						class299.aClass399_3284.array[12] = (i_90_ + toolkit.method14608()) * 2.0F / f - 1.0F;
						class299.aClass399_3284.array[13] = (i_84_ + toolkit.method14608()) * 2.0F / f_68_ - 1.0F;
						class299.aClass399_3284.array[14] = -1.0F;
						class299.method5453();
						i_90_ += i_82_;
					}
					if (i_90_ < i_81_) {
						int i_92_ = i_81_ - i_90_;
						class299.aClass399_3281.method6551(anInterface29_8695.method191(i_92_),
								anInterface29_8695.method180(i_89_), 1.0F, 1.0F);
						class299.aClass399_3284.method6551(i_92_ * 2.0F / f, i_89_ * 2.0F / f_68_, 1.0F, 1.0F);
						class299.aClass399_3284.array[12] = (i_90_ + toolkit.method14608()) * 2.0F / f - 1.0F;
						class299.aClass399_3284.array[13] = (i_84_ + toolkit.method14608()) * 2.0F / f_68_ - 1.0F;
						class299.aClass399_3284.array[14] = -1.0F;
						class299.method5453();
					}
				}
			}
		}
	}

	@Override
	public void method2088(int i, int i_129_, int i_130_, int i_131_, int i_132_, int i_133_) {
		anInterface29_8695.method221(i, i_129_, i_130_, i_131_, i_132_, i_133_);
	}

	@Override
	public void method2100(int i, int i_21_, int i_22_, int i_23_, int[] is, int i_24_, int i_25_) {
		anInterface29_8695.method183(i, i_21_, i_22_, i_23_, is, i_24_, i_25_);
	}

	@Override
	public void method2114(int i, int i_3_, int i_4_) {
		int[] is = toolkit.method2404(i, i_3_, anInt8697, anInt8698);
		int[] is_5_ = new int[anInt8697 * anInt8698];
		anInterface29_8695.method218(0, 0, anInt8697, anInt8698, is_5_, 0);
		if (i_4_ == 0) {
			for (int i_6_ = 0; i_6_ < anInt8698; i_6_++) {
				int i_7_ = i_6_ * anInt8697;
				for (int i_8_ = 0; i_8_ < anInt8697; i_8_++) {
					is_5_[i_7_ + i_8_] = is_5_[i_7_ + i_8_] & 0xffffff | is[i_7_ + i_8_] << 8 & ~0xffffff;
				}
			}
		} else if (i_4_ == 1) {
			for (int i_9_ = 0; i_9_ < anInt8698; i_9_++) {
				int i_10_ = i_9_ * anInt8697;
				for (int i_11_ = 0; i_11_ < anInt8697; i_11_++) {
					is_5_[i_10_ + i_11_] = is_5_[i_10_ + i_11_] & 0xffffff | is[i_10_ + i_11_] << 16 & ~0xffffff;
				}
			}
		} else if (i_4_ == 2) {
			for (int i_12_ = 0; i_12_ < anInt8698; i_12_++) {
				int i_13_ = i_12_ * anInt8697;
				for (int i_14_ = 0; i_14_ < anInt8697; i_14_++) {
					is_5_[i_13_ + i_14_] = is_5_[i_13_ + i_14_] & 0xffffff | is[i_13_ + i_14_] << 24 & ~0xffffff;
				}
			}
		} else if (i_4_ == 3) {
			for (int i_15_ = 0; i_15_ < anInt8698; i_15_++) {
				int i_16_ = i_15_ * anInt8697;
				for (int i_17_ = 0; i_17_ < anInt8697; i_17_++) {
					is_5_[i_16_ + i_17_] = is_5_[i_16_ + i_17_] & 0xffffff | (is[i_16_ + i_17_] != 0 ? -16777216 : 0);
				}
			}
		}
		method2100(0, 0, anInt8697, anInt8698, is_5_, 0, anInt8697);
	}

	@Override
	public int method2119() {
		return anInt8698;
	}

	@Override
	public void method2142(int x, int i_32_, int i_33_, int i_34_, int i_35_) {
		if (toolkit.method14715() != Class306.aClass306_3313) {
			x += anInt8702;
			i_32_ += anInt8694;
			toolkit.aClass346_9366.method5910(x, i_32_, x + anInt8697, i_32_ + anInt8698, 0.0F, 0.0F,
					anInterface29_8695.method187(), anInterface29_8695.method184(), anInterface29_8695, i_34_);
		} else {
			toolkit.method14741();
			toolkit.method14893(i_35_);
			Class299 class299 = toolkit.aClass299_9370;
			class299.anInterface29_3282 = anInterface29_8695;
			class299.method5448(i_33_, i_34_);
			x += anInt8702;
			i_32_ += anInt8694;
			float f = toolkit.method2628().getWidth();
			float f_36_ = toolkit.method2628().getHeight();
			class299.aClass399_3284.method6551(anInt8697 * 2.0F / f, anInt8698 * 2.0F / f_36_, 1.0F, 1.0F);
			class299.aClass399_3284.array[12] = (x + toolkit.method14608()) * 2.0F / f - 1.0F;
			class299.aClass399_3284.array[13] = (i_32_ + toolkit.method14608()) * 2.0F / f_36_ - 1.0F;
			class299.aClass399_3284.array[14] = -1.0F;
			class299.aClass399_3281.method6551(anInterface29_8695.method191(anInt8697),
					anInterface29_8695.method180(anInt8698), 1.0F, 1.0F);
			class299.anInterface32_3287 = toolkit.anInterface32_9417;
			class299.anInt3289 = 0;
			class299.aClass323_3288 = toolkit.aClass323_9420;
			class299.method5453();
		}
	}

	@Override
	public int method2157() {
		return anInt8697;
	}

	@Override
	void method2083(int i, int i_41_, int i_42_, int i_43_, int i_44_, int i_45_, int i_46_, int i_47_) {
		if (toolkit.method14715() != Class306.aClass306_3313) {
			if (aBool8699) {
				i_42_ = i_42_ * anInt8697 / scaleWidth();
				i_43_ = i_43_ * anInt8698 / scaleHeight();
				i += anInt8702 * i_42_ / anInt8697;
				i_41_ += anInt8694 * i_43_ / anInt8698;
			}
			toolkit.aClass346_9366.method5910(i, i_41_, i + i_42_, i_41_ + i_43_, anInterface29_8695.method191(0.0F),
					anInterface29_8695.method180(0.0F), anInterface29_8695.method191(anInt8697),
					anInterface29_8695.method180(anInt8698), anInterface29_8695, i_45_);
		} else {
			toolkit.method14741();
			toolkit.method14893(i_46_);
			Class299 class299 = toolkit.aClass299_9370;
			class299.anInterface29_3282 = anInterface29_8695;
			class299.method5448(i_44_, i_45_);
			if (aBool8699) {
				i_42_ = i_42_ * anInt8697 / scaleWidth();
				i_43_ = i_43_ * anInt8698 / scaleHeight();
				i += anInt8702 * i_42_ / anInt8697;
				i_41_ += anInt8694 * i_43_ / anInt8698;
			}
			float f = toolkit.method2628().getWidth();
			float f_48_ = toolkit.method2628().getHeight();
			class299.aClass399_3284.method6551(i_42_ * 2.0F / f, i_43_ * 2.0F / f_48_, 1.0F, 1.0F);
			class299.aClass399_3284.array[12] = (i + toolkit.method14608()) * 2.0F / f - 1.0F;
			class299.aClass399_3284.array[13] = (i_41_ + toolkit.method14608()) * 2.0F / f_48_ - 1.0F;
			class299.aClass399_3284.array[14] = -1.0F;
			class299.aClass399_3281.method6551(anInterface29_8695.method191(anInt8697),
					anInterface29_8695.method180(anInt8698), 1.0F, 1.0F);
			class299.anInterface32_3287 = toolkit.anInterface32_9417;
			class299.anInt3289 = 0;
			class299.aClass323_3288 = toolkit.aClass323_9420;
			class299.method5453();
		}
	}

	@Override
	void method2096(float f, float f_117_, float f_118_, float f_119_, float f_120_, float f_121_, int i,
			ClippingMask class129, int i_122_, int i_123_) {
		toolkit.method14741();
		Class299 class299 = toolkit.aClass299_9370;
		class299.anInterface29_3282 = anInterface29_8695;
		class299.method5448(1, -1);
		float f_124_ = toolkit.method2628().getWidth();
		float f_125_ = toolkit.method2628().getHeight();
		class299.aClass399_3284.toIdentity();
		if (aBool8699) {
			float f_126_ = (float) anInt8697 / (float) scaleWidth();
			float f_127_ = (float) anInt8698 / (float) scaleHeight();
			class299.aClass399_3284.array[0] = (f_118_ - f) * f_126_;
			class299.aClass399_3284.array[1] = (f_119_ - f_117_) * f_126_;
			class299.aClass399_3284.array[4] = (f_120_ - f) * f_127_;
			class299.aClass399_3284.array[5] = (f_121_ - f_117_) * f_127_;
			class299.aClass399_3284.array[12] = (f + anInt8702) * f_126_ + toolkit.method14608();
			class299.aClass399_3284.array[13] = (f_117_ + anInt8694) * f_127_ + toolkit.method14608();
		} else {
			class299.aClass399_3284.array[0] = f_118_ - f;
			class299.aClass399_3284.array[1] = f_119_ - f_117_;
			class299.aClass399_3284.array[4] = f_120_ - f;
			class299.aClass399_3284.array[5] = f_121_ - f_117_;
			class299.aClass399_3284.array[12] = f + toolkit.method14608();
			class299.aClass399_3284.array[13] = f_117_ + toolkit.method14608();
		}
		Matrix4f class399 = toolkit.aClass399_9324;
		class399.toIdentity();
		class399.array[0] = 2.0F / f_124_;
		class399.array[5] = 2.0F / f_125_;
		class399.array[12] = -1.0F;
		class399.array[13] = -1.0F;
		class399.array[14] = -1.0F;
		class299.aClass399_3284.method6547(class399);
		class299.aClass399_3281.method6551(anInterface29_8695.method191(anInt8697),
				anInterface29_8695.method180(anInt8698), 1.0F, 1.0F);
		class299.anInterface32_3287 = toolkit.anInterface32_9417;
		class299.anInt3289 = 0;
		class299.aClass323_3288 = toolkit.aClass323_9420;
		Native2DTexture interface29 = ((NativeClippingMask) class129).texture;
		class299.anInterface29_3283 = interface29;
		class299.aClass399_3285.toIdentity();
		class299.aClass399_3285.array[0] = (f_118_ - f) * interface29.method191(1.0F);
		class299.aClass399_3285.array[1] = (f_119_ - f_117_) * interface29.method191(1.0F);
		class299.aClass399_3285.array[4] = (f_120_ - f) * interface29.method180(1.0F);
		class299.aClass399_3285.array[5] = (f_121_ - f_117_) * interface29.method180(1.0F);
		class299.aClass399_3285.array[12] = (f - i_122_) * interface29.method191(1.0F);
		class299.aClass399_3285.array[13] = (f_117_ - i_123_) * interface29.method180(1.0F);
		class299.method5449();
	}

	@Override
	void method2143(float f, float f_93_, float f_94_, float f_95_, float f_96_, float f_97_, int i, int i_98_,
			int i_99_, int i_100_) {
		if (toolkit.method14715() != Class306.aClass306_3313) {
			toolkit.aClass346_9366.method5911(f, f_93_, f_94_, f_95_, f_96_, f_97_, f_94_ + f_96_ - f, f_95_ + f_97_
					- f_93_, 0.0F, 0.0F, anInterface29_8695.method187(), 0.0F, 0.0F, anInterface29_8695.method184(),
					anInterface29_8695.method187(), anInterface29_8695.method184(), anInterface29_8695, i_98_);
		} else {
			toolkit.method14741();
			toolkit.method14893(i_99_);
			if (aBool8699) {
				float f_101_ = scaleWidth();
				float f_102_ = scaleHeight();
				float f_103_ = (f_94_ - f) / f_101_;
				float f_104_ = (f_95_ - f_93_) / f_101_;
				float f_105_ = (f_96_ - f) / f_102_;
				float f_106_ = (f_97_ - f_93_) / f_102_;
				float f_107_ = f_105_ * anInt8694;
				float f_108_ = f_106_ * anInt8694;
				float f_109_ = f_103_ * anInt8702;
				float f_110_ = f_104_ * anInt8702;
				float f_111_ = -f_103_ * anInt8703;
				float f_112_ = -f_104_ * anInt8703;
				float f_113_ = -f_105_ * anInt8700;
				float f_114_ = -f_106_ * anInt8700;
				f = f + f_109_ + f_107_;
				f_93_ = f_93_ + f_110_ + f_108_;
				f_94_ = f_94_ + f_111_ + f_107_;
				f_95_ = f_95_ + f_112_ + f_108_;
				f_96_ = f_96_ + f_109_ + f_113_;
				f_97_ = f_97_ + f_110_ + f_114_;
			}
			Class299 class299 = toolkit.aClass299_9370;
			class299.anInterface29_3282 = anInterface29_8695;
			class299.method5448(i, i_98_);
			float f_115_ = toolkit.method2628().getWidth();
			float f_116_ = toolkit.method2628().getHeight();
			class299.aClass399_3284.toIdentity();
			class299.aClass399_3284.array[0] = (f_94_ - f) * 2.0F / f_115_;
			class299.aClass399_3284.array[1] = (f_95_ - f_93_) * 2.0F / f_116_;
			class299.aClass399_3284.array[4] = (f_96_ - f) * 2.0F / f_115_;
			class299.aClass399_3284.array[5] = (f_97_ - f_93_) * 2.0F / f_116_;
			class299.aClass399_3284.array[12] = (f + toolkit.method14608()) * 2.0F / f_115_ - 1.0F;
			class299.aClass399_3284.array[13] = (f_93_ + toolkit.method14608()) * 2.0F / f_116_ - 1.0F;
			class299.aClass399_3284.array[14] = -1.0F;
			class299.aClass399_3281.method6551(anInterface29_8695.method191(anInt8697),
					anInterface29_8695.method180(anInt8698), 1.0F, 1.0F);
			class299.anInterface32_3287 = toolkit.anInterface32_9417;
			class299.anInt3289 = 0;
			class299.aClass323_3288 = toolkit.aClass323_9420;
			class299.method5453();
		}
	}
}
