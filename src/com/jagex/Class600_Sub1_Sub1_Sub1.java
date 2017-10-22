package com.jagex;

public class Class600_Sub1_Sub1_Sub1 extends Class600_Sub1_Sub1 {
	static Class405 aClass405_11756 = new Class405();
	public int secondaryAmount;
	public int primary;
	public int primaryAmount;
	public int secondary = 1436680777;
	public Class405 aClass405_11747;
	public int tertiary = -49073473;
	public int tertiaryAmount;
	public Class405 aClass405_11750 = null;
	public Class405 aClass405_11751 = null;
	int anInt11752;
	public int anInt11753;
	int anInt11754;
	int anInt11755;
	int anInt11757;
	int anInt11758;
	boolean aBool11759;

	public Class600_Sub1_Sub1_Sub1(Class490 class490, int i, int i_30_, int i_31_, int i_32_, int i_33_) {
		super(class490, i, i_30_, i_31_, i_32_, i_33_);
		aClass405_11747 = null;
		anInt11753 = 0;
		anInt11757 = 0;
		aBool11759 = false;
		method16274(3);
		method18236();
	}

	@Override
	public Class498 method16293(Toolkit toolkit) {
		return null;
	}

	@Override
	public int method16295() {
		return -10;
	}

	@Override
	public int method16307() {
		return anInt11753 * -233203207 - method16295();
	}

	@Override
	boolean method16257(Toolkit toolkit, int i, int i_28_) {
		Class405 class405 = toolkit.method2463();
		class405.method6728(method10164());
		class405.method6744(0.0F, -10.0F, 0.0F);

		Model model = ItemDefinition.loader.get(primary * 1984247053).method13583(toolkit, 131072,
				primaryAmount * -1512703491, null, null, 0, 0, 0, 0);
		if (null != model) {
			if (null == aClass405_11750) {
				aClass405_11756.method6730();
			} else {
				aClass405_11756.copyFrom(aClass405_11750);
			}
			aClass405_11756.method6745(class405);

			if (model.method2918(i, i_28_, aClass405_11756, true, 0)) {
				return true;
			}
		}

		if (-1425903609 * secondary != -1) {
			model = ItemDefinition.loader.get(secondary * -1425903609).method13583(toolkit, 131072,
					-2046603417 * secondaryAmount, null, null, 0, 0, 0, 0);
			if (model != null) {
				if (aClass405_11751 == null) {
					aClass405_11756.method6730();
				} else {
					aClass405_11756.copyFrom(aClass405_11751);
				}
				aClass405_11756.method6745(class405);
				if (model.method2918(i, i_28_, aClass405_11756, true, 0)) {
					return true;
				}
			}
		}

		if (-1 != -1502690623 * tertiary) {
			model = ItemDefinition.loader.get(tertiary * -1502690623).method13583(toolkit, 131072,
					tertiaryAmount * 1531521965, null, null, 0, 0, 0, 0);
			if (model != null) {
				if (null == aClass405_11747) {
					aClass405_11756.method6730();
				} else {
					aClass405_11756.copyFrom(aClass405_11747);
				}
				aClass405_11756.method6745(class405);
				if (model.method2918(i, i_28_, aClass405_11756, true, 0)) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	int method16258() {
		ItemDefinition primary = ItemDefinition.loader.get(this.primary * 1984247053);
		int i_25_ = primary.anInt8332 * 327461957;

		if (-1425903609 * secondary != -1) {
			ItemDefinition secondary = ItemDefinition.loader.get(this.secondary * -1425903609);
			if (327461957 * secondary.anInt8332 > i_25_) {
				i_25_ = secondary.anInt8332 * 327461957;
			}
		}

		if (-1502690623 * tertiary != -1) {
			ItemDefinition tertiary = ItemDefinition.loader.get(-1502690623 * this.tertiary);
			if (327461957 * tertiary.anInt8332 > i_25_) {
				i_25_ = tertiary.anInt8332 * 327461957;
			}
		}

		return i_25_;
	}

	@Override
	boolean method16260() {
		return false;
	}

	@Override
	boolean method16261() {
		return aBool11759;
	}

	@Override
	void method16265(Toolkit toolkit) {

	}

	@Override
	Class506 method16271(Toolkit toolkit) {
		Class397 class397 = Class397.copyOf(method10164().aClass397_4507);
		Class491 class491 = aClass490_10378
				.method8350(plane, (int) class397.x >> 9, (int) class397.z >> 9, -1805913001);
		Class600_Sub1_Sub4 class600_sub1_sub4 = aClass490_10378.method8351(plane, (int) class397.x >> 9,
				(int) class397.z >> 9);

		int i_0_ = 0;
		if (class491 != null && class491.aClass600_Sub1_Sub3_6752.aBool11461) {
			i_0_ = class491.aClass600_Sub1_Sub3_6752.method16295();
		}

		if (null != class600_sub1_sub4 && class600_sub1_sub4.aShort11466 > -i_0_) {
			i_0_ = -class600_sub1_sub4.aShort11466;
		}

		if (i_0_ != -233203207 * anInt11753) {
			class397.y += i_0_ - anInt11753 * -233203207;
			method10169(class397);
			anInt11753 = i_0_ * 223467593;
		}

		Class405 class405 = toolkit.method2463();
		class405.method6730();
		if (-233203207 * anInt11753 == 0) {
			Ground ground = aClass490_10378.aClass120Array6700[collisionPlane];
			int i_3_ = anInt11757 * -1048113839 << 1;
			int i_4_ = i_3_;
			int i_5_ = -i_3_ / 2;
			int i_6_ = -i_4_ / 2;
			int i_7_ = ground.averageHeight((int) class397.x + i_5_, i_6_ + (int) class397.z);
			int i_8_ = i_3_ / 2;
			int i_9_ = -i_4_ / 2;
			int i_10_ = ground.averageHeight((int) class397.x + i_8_, (int) class397.z + i_9_);
			int i_11_ = -i_3_ / 2;
			int i_12_ = i_4_ / 2;
			int i_13_ = ground.averageHeight(i_11_ + (int) class397.x, i_12_ + (int) class397.z);
			int i_14_ = i_3_ / 2;
			int i_15_ = i_4_ / 2;
			int i_16_ = ground.averageHeight(i_14_ + (int) class397.x, i_15_ + (int) class397.z);
			int i_17_ = i_7_ < i_10_ ? i_7_ : i_10_;
			int i_18_ = i_13_ < i_16_ ? i_13_ : i_16_;
			int i_19_ = i_10_ < i_16_ ? i_10_ : i_16_;
			int i_20_ = i_7_ < i_13_ ? i_7_ : i_13_;
			if (0 != i_4_) {
				int i_21_ = (int) (Math.atan2(i_17_ - i_18_, i_4_) * 2607.5945876176133) & 0x3fff;
				if (i_21_ != 0) {
					class405.method6739(1.0F, 0.0F, 0.0F, Class373.method6114(i_21_));
				}
			}
			if (i_3_ != 0) {
				int i_22_ = (int) (Math.atan2(i_20_ - i_19_, i_3_) * 2607.5945876176133) & 0x3fff;
				if (0 != i_22_) {
					class405.method6739(0.0F, 0.0F, 1.0F, Class373.method6114(-i_22_));
				}
			}
			int i_23_ = i_16_ + i_7_;
			if (i_10_ + i_13_ < i_23_) {
				i_23_ = i_13_ + i_10_;
			}
			i_23_ = (i_23_ >> 1) - (int) class397.y;
			if (0 != i_23_) {
				class405.method6744(0.0F, i_23_, 0.0F);
			}
		}
		class397.cache();
		Class397 class397_24_ = method10164().aClass397_4507;
		class405.method6744(class397_24_.x, class397_24_.y - 10.0F, class397_24_.z);
		Class506 class506 = Class506.method570(true);
		aBool11759 = false;
		anInt11757 = 0;
		if (-1502690623 * tertiary != -1) {
			Model model = ItemDefinition.loader.get(-1502690623 * tertiary).method13583(toolkit, 526336,
					1531521965 * tertiaryAmount, null, null, anInt11755 * 593348181, anInt11752 * 1774949501,
					-472079585 * anInt11754, -218845363 * anInt11758);
			if (null != model) {
				if (null == aClass405_11747) {
					aClass405_11756.method6730();
				} else {
					aClass405_11756.copyFrom(aClass405_11747);
				}
				aClass405_11756.method6745(class405);
				model.method2917(aClass405_11756, aClass139Array10373[2], 0);
				aBool11759 |= model.method2939();
				anInt11757 = model.method3016() * 681860017;
			}
		}
		if (-1425903609 * secondary != -1) {
			Model model = ItemDefinition.loader.get(-1425903609 * secondary).method13583(toolkit, 526336,
					secondaryAmount * -2046603417, null, null, anInt11755 * 593348181, 1774949501 * anInt11752,
					anInt11754 * -472079585, -218845363 * anInt11758);
			if (null != model) {
				if (null == aClass405_11751) {
					aClass405_11756.method6730();
				} else {
					aClass405_11756.copyFrom(aClass405_11751);
				}
				aClass405_11756.method6745(class405);
				model.method2917(aClass405_11756, aClass139Array10373[1], 0);
				aBool11759 |= model.method2939();
				if (model.method3016() > -1048113839 * anInt11757) {
					anInt11757 = model.method3016() * 681860017;
				}
			}
		}
		Model model = ItemDefinition.loader.get(1984247053 * primary).method13583(toolkit, 526336,
				primaryAmount * -1512703491, null, null, 593348181 * anInt11755, anInt11752 * 1774949501,
				anInt11754 * -472079585, anInt11758 * -218845363);
		if (null != model) {
			if (aClass405_11750 == null) {
				aClass405_11756.method6730();
			} else {
				aClass405_11756.copyFrom(aClass405_11750);
			}
			aClass405_11756.method6745(class405);
			model.method2917(aClass405_11756, aClass139Array10373[0], 0);
			aBool11759 |= model.method2939();
			if (model.method3016() > anInt11757 * -1048113839) {
				anInt11757 = model.method3016() * 681860017;
			}
		}
		return class506;
	}

	void method18236() {
		anInt11755 = (32 + (int) (Math.random() * 4.0)) * 771294973;
		anInt11752 = (3 + (int) (Math.random() * 2.0)) * -1814985515;
		anInt11754 = (16 + (int) (Math.random() * 3.0)) * -2028136225;
		if (Class199.preferences.textures.getValue() == 1) {
			anInt11758 = (int) (Math.random() * 10.0) * -1721228923;
		} else {
			anInt11758 = (int) (Math.random() * 20.0) * -1721228923;
		}
	}

}