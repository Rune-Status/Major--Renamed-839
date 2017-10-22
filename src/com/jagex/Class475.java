package com.jagex;

public class Class475 {
	static final int anInt6553 = 0;
	static final int anInt6554 = 1;
	static final int anInt6555 = 2;
	static final int anInt6563 = 512;
	static final int anInt6566 = 192;
	static final int anInt6573 = 24;
	static final int anInt6574 = 24;
	static int[] anIntArray6575 = new int[4];
	static final int anInt6576 = 128;
	static final int anInt6577 = 13;
	static final int anInt6578 = 16;
	static Model aClass143_6579;
	static Sprite aClass116_6580;
	static Sprite aClass116_6581;

	static void method8112(Toolkit toolkit) {
		if (aClass116_6581 == null) {
			int[] is = new int[16384];
			int[] is_49_ = new int[16384];
			for (int i = 0; i < 64; i++) {
				int i_50_ = 64 - i;
				i_50_ *= i_50_;
				int i_51_ = 128 - i - 1;
				int i_52_ = i * 128;
				int i_53_ = i_51_ * 128;
				for (int i_54_ = 0; i_54_ < 64; i_54_++) {
					int i_55_ = 64 - i_54_;
					i_55_ *= i_55_;
					int i_56_ = 128 - i_54_ - 1;
					int i_57_ = 256 - (i_55_ + i_50_ << 8) / 4096;
					i_57_ = i_57_ * 3072 / 1536;
					if (i_57_ < 0) {
						i_57_ = 0;
					} else if (i_57_ > 255) {
						i_57_ = 255;
					}
					int i_58_ = i_57_ / 2;
					is_49_[i_52_ + i_54_] = is_49_[i_52_ + i_56_] = is_49_[i_53_ + i_54_] = is_49_[i_53_ + i_56_] = ~0xffffff
							| i_57_ << 16;
					is[i_52_ + i_54_] = is[i_52_ + i_56_] = is[i_53_ + i_54_] = is[i_53_ + i_56_] = 127 - i_58_ << 24 | 0xffffff;
				}
			}
			aClass116_6581 = toolkit.createSprite(is_49_, 0, 128, 128, 128);
			aClass116_6580 = toolkit.createSprite(is, 0, 128, 128, 128);
		}
	}

	static void method8117() {
		aClass143_6579 = null;
		aClass116_6581 = null;
	}

	static void method8118(Toolkit toolkit) {
		if (aClass143_6579 == null) {
			BaseModel base = new BaseModel(580, 1104, 1);
			base.method3124((short) 0, (short) 32767, (short) 0, (short) 1024, (short) 1024, (short) 1024, (byte) 0,
					(byte) 0, (byte) 0);
			base.method3089(0, 128, 0);
			base.method3089(0, -128, 0);

			for (int i = 0; i <= 24; i++) {
				int i_59_ = i * 8192 / 24;
				int i_60_ = Class373.SINE[i_59_];
				int i_61_ = Class373.COSINE[i_59_];

				for (int i_62_ = 1; i_62_ < 24; i_62_++) {
					int i_63_ = i_62_ * 8192 / 24;
					int i_64_ = Class373.COSINE[i_63_] >> 7;
					int i_65_ = Class373.SINE[i_63_] * i_60_ >> 21;
					int i_66_ = Class373.SINE[i_63_] * i_61_ >> 21;
					base.method3089(i_66_, i_64_, -i_65_);
				}

				if (i > 0) {
					int i_67_ = i * 23 + 2;
					int i_68_ = i_67_ - 23;
					base.method3114(0, i_68_, i_67_, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);

					for (int i_69_ = 1; i_69_ < 23; i_69_++) {
						int i_70_ = i_68_ + 1;
						int i_71_ = i_67_ + 1;

						base.method3114(i_68_, i_70_, i_67_, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
						base.method3114(i_70_, i_71_, i_67_, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);

						i_68_ = i_70_;
						i_67_ = i_71_;
					}

					base.method3114(i_67_, i_68_, 1, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
				}
			}

			base.anInt1768 = base.vertexCount;
			base.anIntArray1781 = null;
			base.anIntArray1763 = null;
			base.aByteArray1790 = null;
			aClass143_6579 = toolkit.createModel(base, 51200, 33, 64, 768);
		}
	}

	int anInt6552;
	int anInt6556;
	int anInt6557;
	int anInt6558;
	int anInt6559;
	int anInt6560;
	boolean aBool6561;
	int anInt654;
	int anInt6564;
	int anInt6565;
	int anInt6567;
	int anInt6568;
	Sprite sprite;
	int size;
	int anInt6571;
	int anInt6572;
	int anInt6582;

	public Class475(int i, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, boolean bool, int i_14_,
			int i_15_, int i_16_) {
		anInt6582 = i_9_;
		anInt6559 = i_10_;
		anInt6557 = i_11_;
		aBool6561 = bool;
		anInt654 = i_8_;
		anInt6552 = i_13_;
		anInt6567 = i_12_;
		anInt6556 = i;
		anInt6560 = i_14_;
		anInt6558 = i_15_;
		anInt6572 = i_16_;
	}

	boolean method8106(int i, int i_0_, int i_1_, int i_2_) {
		int i_3_;
		int i_4_;
		int i_5_;

		if (!aBool6561) {
			i_3_ = anInt6582 - i;
			i_4_ = anInt6559 - i_0_;
			i_5_ = anInt6557 - i_1_;

			anInt6571 = (int) Math.sqrt(i_3_ * i_3_ + i_4_ * i_4_ + i_5_ * i_5_);
			if (anInt6571 == 0) {
				anInt6571 = 1;
			}

			i_3_ = (i_3_ << 8) / anInt6571;
			i_4_ = (i_4_ << 8) / anInt6571;
			i_5_ = (i_5_ << 8) / anInt6571;
		} else {
			anInt6571 = 1073741823;
			i_3_ = anInt6582;
			i_4_ = anInt6559;
			i_5_ = anInt6557;
		}

		int i_6_ = (int) (Math.sqrt(i_3_ * i_3_ + i_4_ * i_4_ + i_5_ * i_5_) * 256.0);
		if (i_6_ > 128) {
			i_3_ = (i_3_ << 16) / i_6_;
			i_4_ = (i_4_ << 16) / i_6_;
			i_5_ = (i_5_ << 16) / i_6_;
			anInt6568 = anInt6567 * i_2_ / (aBool6561 ? 1024 : anInt6571);
		} else {
			anInt6568 = 0;
		}

		if (anInt6568 < 8) {
			sprite = null;
			return false;
		}

		int i_7_ = HashTable.nextPowerOfTwo(anInt6568);
		if (i_7_ > i_2_) {
			i_7_ = Class593.priorPowerOf2(i_2_);
		}

		if (i_7_ > 512) {
			i_7_ = 512;
		}

		if (i_7_ != size) {
			size = i_7_;
		}

		anInt6564 = (int) (Math.asin(i_4_ / 256.0F) * 2607.5945876176133) & 0x3fff;
		anInt6565 = (int) (Math.atan2(i_3_, -i_5_) * 2607.5945876176133) & 0x3fff;
		sprite = null;
		return true;
	}

	boolean method8107(Toolkit toolkit, Class475 class475_17_) {
		return sprite != null || method8108(toolkit, class475_17_);
	}

	boolean method8108(Toolkit toolkit, Class475 class475_18_) {
		if (sprite == null) {
			if (anInt6556 == 0) {
				if (PlayerVariableProvider.anInterface19_1027.loaded(Class549.TEXTURE_AND_MATERIAL, anInt654)) {
					int[] data = PlayerVariableProvider.anInterface19_1027.loadOpaque(Class549.TEXTURE_AND_MATERIAL,
							anInt654, 0.7F);
					sprite = toolkit.createSprite(data, 0, size, size, size);
				}
			} else if (anInt6556 == 2) {
				method8109(toolkit, class475_18_);
			} else if (anInt6556 == 1) {
				method8111(toolkit, class475_18_);
			}
		}
		return sprite != null;
	}

	void method8109(Toolkit toolki, Class475 class475_19_) {
		BaseModel base = BaseModel.lookup(Class512.models, anInt654, 0);
		if (base != null) {
			toolki.method2425(anIntArray6575);
			toolki.method2760(0, 0, size, size);
			toolki.method2426(2, 0);
			toolki.method2434(0, 0, size, size, 0, 0);

			int i = 0;
			int i_20_ = 0;
			int i_21_ = 256;

			if (class475_19_ != null) {
				if (class475_19_.aBool6561) {
					i = -class475_19_.anInt6582;
					i_20_ = -class475_19_.anInt6559;
					i_21_ = -class475_19_.anInt6557;
				} else {
					i = anInt6582 - class475_19_.anInt6582;
					i_20_ = anInt6559 - class475_19_.anInt6559;
					i_21_ = anInt6557 - class475_19_.anInt6557;
				}
			}

			if (anInt6564 != 0) {
				int i_22_ = -anInt6564 & 0x3fff;
				int i_23_ = Class373.SINE[i_22_];
				int i_24_ = Class373.COSINE[i_22_];
				int i_25_ = i_20_ * i_24_ - i_21_ * i_23_ >> 14;
				i_21_ = i_20_ * i_23_ + i_21_ * i_24_ >> 14;
				i_20_ = i_25_;
			}

			if (anInt6565 != 0) {
				int i_26_ = -anInt6565 & 0x3fff;
				int i_27_ = Class373.SINE[i_26_];
				int i_28_ = Class373.COSINE[i_26_];
				int i_29_ = i_21_ * i_27_ + i * i_28_ >> 14;
				i_21_ = i_21_ * i_28_ - i * i_27_ >> 14;
				i = i_29_;
			}

			toolki.method2476(1.0F);
			toolki.method2477(anInt6552, 1.0F, 1.0F, i, i_20_, i_21_);
			base.method3102(anInt6560 & 0x3fff, anInt6558 & 0x3fff, anInt6572 & 0x3fff);
			Model model = toolki.createModel(base, 2048, 0, 64, 768);
			int i_30_ = model.method2923() - model.minimumX();
			int i_31_ = model.method2931() - model.minimumY();
			int i_32_ = i_30_ > i_31_ ? i_30_ : i_31_;
			int i_33_ = 1024 * size / i_32_;
			Matrix4f class399 = toolki.method2575();
			Matrix4f class399_34_ = toolki.method2462();
			class399_34_.method6560(size / 2, size / 2, i_33_, i_33_, 50.0F, 50000.0F, toolki.method2628().getWidth(),
					toolki.method2628().getHeight(), 1024.0F);
			toolki.method2540(class399_34_);
			Class405 class405 = new Class405();
			toolki.method2471(class405);
			Class405 class405_35_ = toolki.method2463();
			class405_35_.method6742(0.0F, 0.0F, 50 - model.method2886());
			model.method2917(class405_35_, null, 1);
			sprite = toolki.method2630(0, 0, size, size, true);
			sprite.method2114(0, 0, 3);
			toolki.method2540(class399);
			toolki.method2760(anIntArray6575[0], anIntArray6575[1], anIntArray6575[2], anIntArray6575[3]);
		}
	}

	void method8111(Toolkit toolkit, Class475 class475_36_) {
		method8118(toolkit);
		method8112(toolkit);
		toolkit.method2425(anIntArray6575);
		toolkit.method2760(0, 0, size, size);
		toolkit.method2426(2, 0);
		toolkit.method2434(0, 0, size, size, ~0xffffff | anInt6552, 0);
		int i = 0;
		int i_37_ = 0;
		int i_38_ = 256;
		if (class475_36_ != null) {
			if (class475_36_.aBool6561) {
				i = -class475_36_.anInt6582;
				i_37_ = -class475_36_.anInt6559;
				i_38_ = -class475_36_.anInt6557;
			} else {
				i = class475_36_.anInt6582 - anInt6582;
				i_37_ = class475_36_.anInt6559 - anInt6559;
				i_38_ = class475_36_.anInt6557 - anInt6557;
			}
		}
		if (anInt6564 != 0) {
			int i_39_ = Class373.SINE[anInt6564];
			int i_40_ = Class373.COSINE[anInt6564];
			int i_41_ = i_37_ * i_40_ - i_38_ * i_39_ >> 14;
			i_38_ = i_37_ * i_39_ + i_38_ * i_40_ >> 14;
			i_37_ = i_41_;
		}
		if (anInt6565 != 0) {
			int i_42_ = Class373.SINE[anInt6565];
			int i_43_ = Class373.COSINE[anInt6565];
			int i_44_ = i_38_ * i_42_ + i * i_43_ >> 14;
			i_38_ = i_38_ * i_43_ - i * i_42_ >> 14;
			i = i_44_;
		}

		Model model = aClass143_6579.method2890((byte) 0, 51200, true);
		model.retexture((short) 0, (short) anInt654);
		toolkit.method2476(1.0F);
		toolkit.method2477(16777215, 1.0F, 1.0F, i, i_37_, i_38_);
		int i_45_ = 1024 * size / (model.method2923() - model.minimumX());

		if (anInt6552 != 0) {
			i_45_ = i_45_ * 13 / 16;
		}

		Matrix4f class399 = toolkit.method2575();
		Matrix4f class399_46_ = toolkit.method2462();
		class399_46_.method6560(size / 2, size / 2, i_45_, i_45_, 50.0F, 50000.0F, toolkit.method2628().getWidth(),
				toolkit.method2628().getHeight(), 1024.0F);
		toolkit.method2540(class399_46_);
		toolkit.method2471(new Class405());
		Class405 class405 = new Class405();
		class405.method6742(0.0F, 0.0F, 50 - model.method2886());
		model.method2917(class405, null, 1);
		int i_47_ = size * 13 / 16;
		int i_48_ = (size - i_47_) / 2;
		aClass116_6580.method2082(i_48_, i_48_, i_47_, i_47_, 0, ~0xffffff | anInt6552, 1);
		sprite = toolkit.method2630(0, 0, size, size, true);
		toolkit.method2426(2, 0);
		toolkit.method2434(0, 0, size, size, 0, 0);
		aClass116_6581.method2082(0, 0, size, size, 1, 0, 0);
		sprite.method2114(0, 0, 3);
		toolkit.method2540(class399);
		toolkit.method2760(anIntArray6575[0], anIntArray6575[1], anIntArray6575[2], anIntArray6575[3]);
	}

	void method8119(Toolkit class134, int i, int i_72_, int i_73_, int i_74_, int i_75_, int i_76_, int i_77_,
			int i_78_, int i_79_, int i_80_) {
		if (sprite != null) {
			float[] fs = new float[3];
			float f = -(anInt6582 - i_77_ << 16);
			float f_81_ = anInt6559 - i_78_ << 15;
			float f_82_ = -(anInt6557 - i_79_ << 16);
			float[] fs_83_ = new float[3];
			class134.method2754().method6751(fs_83_);

			f += fs_83_[0];
			f_81_ += fs_83_[1];
			f_82_ += fs_83_[2];
			class134.method2424(f, f_82_, f_81_, fs);

			if (!(fs[2] < 0.0F)) {
				int i_84_ = (int) (fs[0] - anInt6568 / 2);
				int i_85_ = (int) (fs[1] - anInt6568 / 2);

				if (i_85_ < i_74_ && i_85_ + anInt6568 > 0 && i_84_ < i_73_ && i_84_ + anInt6568 > 0) {
					sprite.method2082(i_84_, i_85_, anInt6568, anInt6568, 0, i_80_ << 24 | 0xffffff, 1);
				}
			}
		}
	}

}