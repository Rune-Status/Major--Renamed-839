package com.jagex;

public class Class487 {
	static final int anInt6656 = 512;
	public static int anInt6668;

	Class517 aClass517_6644;
	int anInt6645;
	int anInt6646;
	byte[] aByteArray6647;
	int anInt6648;
	Class475[] aClass475Array6649;
	int anInt6650;
	int anInt6651 = -1062426873;
	int anInt6652;
	Class475[] aClass475Array6653;
	int anInt6654;
	Sprite aClass116_6655;
	int anInt6657;
	int modelId;
	int anInt6659;
	Model aClass143_6660;
	int anInt6661;
	Class475 aClass475_6662;
	boolean aBool6663;
	Class487 aClass487_6664;
	boolean aBool6665 = true;
	int anInt6666;
	int anInt6667;

	public Class487(int i, Class475[] class475s, int i_3_, int i_4_, int i_5_, int i_6_, Class517 class517, int i_7_) {
		anInt6652 = -936030451 * i_4_;
		anInt6648 = 586720533 * i_5_;
		anInt6654 = -1608523425 * i_6_;
		anInt6645 = i * -222694501;
		aClass475Array6653 = class475s;
		aClass517_6644 = class517;

		if (null != class475s) {
			aClass475Array6649 = new Class475[class475s.length];
			aClass475_6662 = i_3_ >= 0 ? class475s[i_3_] : null;
		} else {
			aClass475Array6649 = null;
			aClass475_6662 = null;
		}

		modelId = -286454159 * i_7_;
	}

	public void method8251(int i, int i_0_) {
		anInt6661 = 1732984271 * (986009709 * anInt6667 + i * (i_0_ - 986009709 * anInt6667) / 255);
	}

	public void method8252(Class487 class487_2_) {
		if (aBool6663) {
			anInt6667 = 492385931 * anInt6661;
		} else if (class487_2_ != null && class487_2_.aBool6663) {
			anInt6667 = -161600613 - 492385931 * class487_2_.anInt6661;
		} else {
			anInt6667 = 0;
		}

		aBool6663 = true;
		aClass487_6664 = class487_2_;
		anInt6661 = 0;
	}

	public boolean method8253() {
		return aBool6663;
	}

	public Class487 method8254() {
		return aClass487_6664;
	}

	public void method8257(Toolkit toolkit, int i, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_,
			int i_14_, int i_15_) {
		method8258(toolkit, i, i_8_, i_9_, i_10_, i_11_, i_12_, i_13_, 0, i_15_, true, false);
	}

	public void method8258(Toolkit toolkit, int i, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_,
			int i_23_, int i_24_, boolean bool, boolean bool_25_) {
		int i_27_ = 0;
		if (aBool6663) {
			i_27_ = anInt6661 * -687953617;
		}

		if (aClass487_6664 != null) {
			Class487 class487_28_ = this;
			Class487 class487_29_ = aClass487_6664;

			if (class487_28_.hashCode() > class487_29_.hashCode()) {
				class487_28_ = aClass487_6664;
				class487_29_ = this;
				i_27_ = 255 - i_27_;
			}

			class487_28_.method8259(toolkit, i, i_17_, i_18_, i_19_, i_20_, i_21_, i_22_, i_23_, i_24_, bool, bool_25_,
					i_27_);
			class487_29_.method8259(toolkit, i, i_17_, i_18_, i_19_, i_20_, i_21_, i_22_, i_23_, i_24_, false,
					bool_25_, 255 - i_27_);
		} else {
			if (-1 == anInt6645 * 781728403) {
				toolkit.method2434(i_17_, i_18_, i_19_, i_20_, ~0xffffff | i_24_, 0);
			}

			method8259(toolkit, i, i_17_, i_18_, i_19_, i_20_, i_21_, i_22_, i_23_, i_24_, bool, bool_25_, i_27_);
		}
	}

	public void method8262() {
		aBool6663 = false;
		aClass487_6664 = null;
		anInt6661 = 0;
	}

	public boolean method8265(Toolkit toolkit, int i, int i_50_) {
		if (948562249 * anInt6651 != i) {
			anInt6651 = 1062426873 * i;

			int i_52_ = Class593.priorPowerOf2(i);
			if (i_52_ > 512) {
				i_52_ = 512;
			}

			if (i_52_ <= 0) {
				i_52_ = 1;
			}

			if (i_52_ != -1738305869 * anInt6646) {
				anInt6646 = -144453509 * i_52_;
				aClass116_6655 = null;
			}

			if (null != aClass475Array6653) {
				anInt6650 = 0;
				int[] is = new int[aClass475Array6653.length];

				for (Class475 class475 : aClass475Array6653) {
					if (class475.method8106(anInt6652 * -2141186107, 1581023805 * anInt6648, anInt6654 * 1846327967,
							anInt6651 * 948562249)) {
						is[anInt6650 * 1636292419] = class475.anInt6571;
						aClass475Array6649[(anInt6650 += 659615083) * 1636292419 - 1] = class475;
					}
				}

				ArrayUtils.sort(is, aClass475Array6649, 0, anInt6650 * 1636292419 - 1);
			}
			aBool6665 = true;
		}

		boolean bool = false;
		if (aBool6665) {
			aBool6665 = false;
			for (int i_54_ = 1636292419 * anInt6650 - 1; i_54_ >= 0; i_54_--) {
				boolean bool_55_ = aClass475Array6649[i_54_].method8107(toolkit, aClass475_6662);
				Class487 class487_56_ = this;
				class487_56_.aBool6665 = class487_56_.aBool6665 | !bool_55_;
				bool |= bool_55_;
			}
		}

		if (i_50_ == 0 || !toolkit.method2383()) {
			aClass143_6660 = null;
		} else if (aClass143_6660 == null && -950734191 * modelId >= 0) {
			method8280(toolkit);
		}

		if (null != aClass487_6664 && this != aClass487_6664) {
			aClass487_6664.method8262();
			bool |= aClass487_6664.method8265(toolkit, i, i_50_);
		}

		return bool;
	}

	void method8259(Toolkit toolkit, int i, int i_30_, int i_31_, int i_32_, int i_33_, int i_34_, int i_35_,
			int i_36_, int i_37_, boolean bool, boolean bool_38_, int i_39_) {
		int i_41_ = 255 - i_39_;
		toolkit.method2456();
		toolkit.method2457();

		if (aClass143_6660 == null) {
			toolkit.method2426(2, 0);
			i_35_ = i + i_35_ & 0x3fff;
			if (-1 != anInt6645 * 781728403 && 0 != -1738305869 * anInt6646) {
				TextureMetrics metrics = HandshakeType.aClass147_3723.get(781728403 * anInt6645);
				if (aClass116_6655 == null
						&& PlayerVariableProvider.anInterface19_1027.loaded(Class549.TEXTURE_AND_MATERIAL, metrics.id
								* -464558709)) {
					int[] data = metrics.aClass554_1727 == Class554.aClass554_7500 ? PlayerVariableProvider.anInterface19_1027
							.loadOpaque(Class549.TEXTURE_AND_MATERIAL, metrics.id * -464558709, 0.7F)
							: PlayerVariableProvider.anInterface19_1027.loadTranslucent(Class549.TEXTURE_AND_MATERIAL,
									-464558709 * metrics.id, 0.7F);
					anInt6657 = data[0] * 1400785381;
					anInt6659 = -1863449577 * data[data.length - 1];
					aClass116_6655 = toolkit.createSprite(data, 0, -931821243 * metrics.length, metrics.length
							* -931821243, -931821243 * metrics.length);
				}

				int i_42_ = 255 == i_41_ ? metrics.aClass554_1727 == Class554.aClass554_7500 ? 1 : 0 : 1;
				if (1 == i_42_ && bool) {
					toolkit.method2434(i_30_, i_31_, i_32_, i_33_, i_37_, 0);
				}

				if (aClass116_6655 != null) {
					int i_43_ = i_33_ * i_34_ / -4096;
					int i_44_;

					for (i_44_ = i_35_ * i_33_ / 4096 + (i_32_ - i_33_) / 2; i_44_ > i_33_; i_44_ -= i_33_) {

					}

					for (; i_44_ < 0; i_44_ += i_33_) {

					}

					if (aClass517_6644 == Class517.aClass517_7061) {
						for (int i_45_ = i_44_ - i_33_; i_45_ < i_32_; i_45_ += i_33_) {
							aClass116_6655.method2082(i_45_ + i_30_, i_31_ + i_43_, i_33_, i_33_, 0,
									i_41_ << 24 | 0xffffff, i_42_);
						}

						if ((anInt6657 * -172373011 & ~0xffffff) != 0) {
							toolkit.method2805(0, 0, i_32_, 1 + i_31_ + i_43_, -172373011 * anInt6657);
						}

						if ((744715175 * anInt6659 & ~0xffffff) != 0) {
							toolkit.method2805(0, i_33_ + i_43_ + i_31_, i_32_, i_33_ - (i_33_ + i_31_ + i_43_),
									744715175 * anInt6659);
						}
					} else {
						for (; i_43_ > i_33_; i_43_ -= i_33_) {

						}

						for (; i_43_ < 0; i_43_ += i_33_) {

						}

						for (int i_46_ = i_44_ - i_33_; i_46_ < i_32_; i_46_ += i_33_) {
							for (int i_47_ = i_43_ - i_33_; i_47_ < i_33_; i_47_ += i_33_) {
								aClass116_6655.method2082(i_30_ + i_46_, i_31_ + i_47_, i_33_, i_33_, 0,
										i_41_ << 24 | 0xffffff, i_42_);
							}
						}
					}
				}
			} else {
				toolkit.method2434(i_30_, i_31_, i_32_, i_33_, i_41_ << 24 | i_37_, bool ? 0 : 1);
			}
		} else if (bool_38_) {
			Matrix4f class399 = toolkit.method2575();
			Matrix4f class399_48_ = toolkit.method2575();
			class399.array[2] = class399.array[3];
			class399.array[6] = class399.array[7];
			class399.array[10] = class399.array[11];
			class399.array[14] = class399.array[15];
			toolkit.method2540(class399);
			method8284(toolkit, i_34_, i_35_, i_36_, i_39_);
			toolkit.method2540(class399_48_);
		} else {
			if (bool) {
				toolkit.method2426(3, i_37_);
			}
			method8284(toolkit, i_34_, i_35_, i_36_, i_39_);
		}
		for (int i_49_ = 1636292419 * anInt6650 - 1; i_49_ >= 0; i_49_--) {
			aClass475Array6649[i_49_].method8119(toolkit, i_30_, i_31_, i_32_, i_33_, i_34_, i_35_, anInt6652
					* -2141186107, 1581023805 * anInt6648, anInt6654 * 1846327967, i_41_);
		}
		toolkit.method2426(2, 0);
		toolkit.method2446();
	}

	void method8280(Toolkit toolkit) {
		try {
			boolean loaded = Class512.models.loadEntry(modelId * -950734191);

			if (loaded) {
				toolkit.method2477(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
				BaseModel base = BaseModel.lookup(Class512.models, -950734191 * modelId, 0);
				aClass143_6660 = toolkit.createModel(base, 1099776, 0, 255, 1);

				byte[] is = aClass143_6660.method2933();
				if (null == is) {
					aByteArray6647 = null;
				} else {
					aByteArray6647 = new byte[is.length];
					System.arraycopy(is, 0, aByteArray6647, 0, is.length);
				}
			}
		} catch (Exception exception) {

		}
	}

	void method8284(Toolkit toolkit, int i, int i_57_, int i_58_, int i_59_) {
		Class405 class405 = toolkit.method2754();
		Class405 class405_61_ = new Class405();
		class405_61_.method6742(0.0F, 0.0F, 0.0F);
		class405_61_.method6739(0.0F, -1.0F, 0.0F, Class373.method6114(-i_57_ & 0x3fff));
		class405_61_.method6739(-1.0F, 0.0F, 0.0F, Class373.method6114(-i & 0x3fff));
		class405_61_.method6739(0.0F, 0.0F, -1.0F, Class373.method6114(-i_58_ & 0x3fff));
		toolkit.method2471(class405_61_);
		Class405 class405_62_ = new Class405();

		if (i_59_ != -1657320987 * anInt6666) {
			aClass143_6660.method2935((byte) i_59_, aByteArray6647);
			anInt6666 = i_59_ * 131648493;
		}

		aClass143_6660.method2917(class405_62_, null, 0);
		toolkit.method2471(class405);
	}

	public static Class487 create(int skyboxId, int i_0_, int i_1_, int i_2_,
			DefinitionLoader<SkyboxDefinition> skyboxLoader, DefinitionLoader<SunDefinition> sunLoader) {
		Class475[] class475s = null;
		SkyboxDefinition skybox = skyboxLoader.get(skyboxId);

		if (null != skybox.suns) {
			class475s = new Class475[skybox.suns.length];

			for (int index = 0; index < class475s.length; index++) {
				SunDefinition sun = sunLoader.get(skybox.suns[index]);
				class475s[index] = new Class475(sun.anInt2842 * 929277813, sun.anInt2841 * -962868521,
						2005116199 * sun.anInt2837, sun.anInt2835 * -404412095, sun.anInt2838 * -1465278075,
						-1457034379 * sun.anInt2836, sun.anInt2840 * 1317687185, sun.aBool2844,
						172583507 * sun.anInt2843, -539866677 * sun.anInt2839, sun.anInt2845 * -205228967);
			}
		}

		return new Class487(-1947748217 * skybox.anInt7008, class475s, skybox.anInt7007 * 982281213, i_0_, i_1_, i_2_,
				skybox.aClass517_7009, -2053773277 * skybox.anInt7010);
	}

}