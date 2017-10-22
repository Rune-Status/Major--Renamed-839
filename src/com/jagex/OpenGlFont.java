package com.jagex;

import jaggl.OpenGL;

public class OpenGlFont extends Font {
	OpenGlList aClass104_9436;
	RectangularOpenGl2DTexture aClass102_Sub1_Sub1_9437;
	boolean aBool9438;
	OpenGlToolkit aClass134_Sub2_9439;

	OpenGlFont(OpenGlToolkit class134_sub2, FontSpecification class9, Image[] class152s, boolean bool) {
		super(class134_sub2, class9);
		aClass134_Sub2_9439 = class134_sub2;
		int i = 0;
		for (int i_0_ = 0; i_0_ < 256; i_0_++) {
			Image class152 = class152s[i_0_];
			if (class152.getHeight() > i) {
				i = class152.getHeight();
			}
			if (class152.getWidth() > i) {
				i = class152.getWidth();
			}
		}
		int i_1_ = i * 16;
		if (bool) {
			byte[] is = new byte[i_1_ * i_1_];
			for (int i_2_ = 0; i_2_ < 256; i_2_++) {
				Image class152 = class152s[i_2_];
				int i_3_ = class152.getHeight();
				int i_4_ = class152.getWidth();
				int i_5_ = i_2_ % 16 * i;
				int i_6_ = i_2_ / 16 * i;
				int i_7_ = i_6_ * i_1_ + i_5_;
				int i_8_ = 0;
				if (class152.isIndexed()) {
					IndexedImage class152_sub1 = (IndexedImage) class152s[i_2_];
					if (!class152_sub1.hasAlpha()) {
						byte[] is_9_ = class152_sub1.raster;
						for (int i_10_ = 0; i_10_ < i_3_; i_10_++) {
							for (int i_11_ = 0; i_11_ < i_4_; i_11_++) {
								is[i_7_++] = (byte) (is_9_[i_8_++] == 0 ? 0 : -1);
							}
							i_7_ += i_1_ - i_4_;
						}
					} else {
						byte[] is_12_ = class152_sub1.alpha;
						for (int i_13_ = 0; i_13_ < i_3_; i_13_++) {
							for (int i_14_ = 0; i_14_ < i_4_; i_14_++) {
								is[i_7_++] = is_12_[i_8_++];
							}
							i_7_ += i_1_ - i_4_;
						}
					}
				} else {
					DirectImage class152_sub2 = (DirectImage) class152s[i_2_];
					int[] is_15_ = class152_sub2.argb(false);
					if (!class152_sub2.hasAlpha()) {
						for (int i_16_ = 0; i_16_ < i_3_; i_16_++) {
							for (int i_17_ = 0; i_17_ < i_4_; i_17_++) {
								int i_18_ = is_15_[i_8_++];
								byte i_19_ = (byte) ((i_18_ >> 16 & 0xff) * 3 + (i_18_ >> 8 & 0xff) * 4
										+ (i_18_ & 0xff) >> 3);
								is[i_7_++] = i_19_;
							}
							i_7_ += i_1_ - i_4_;
						}
					} else {
						for (int i_20_ = 0; i_20_ < i_3_; i_20_++) {
							for (int i_21_ = 0; i_21_ < i_4_; i_21_++) {
								is[i_7_++] = (byte) (is_15_[i_8_++] >> 24 & 0xff);
							}
							i_7_ += i_1_ - i_4_;
						}
					}
				}
			}
			aClass102_Sub1_Sub1_9437 = RectangularOpenGl2DTexture.create(class134_sub2, Class121.aClass121_1460,
					Class151.aClass151_2, i_1_, i_1_, false, is, Class121.aClass121_1460);
			aBool9438 = true;
		} else {
			int[] is = new int[i_1_ * i_1_];
			for (int i_22_ = 0; i_22_ < 256; i_22_++) {
				Image class152 = class152s[i_22_];
				int i_23_ = class152.getHeight();
				int i_24_ = class152.getWidth();
				int i_25_ = i_22_ % 16 * i;
				int i_26_ = i_22_ / 16 * i;
				int i_27_ = i_26_ * i_1_ + i_25_;
				int i_28_ = 0;
				if (class152.isIndexed()) {
					IndexedImage class152_sub1 = (IndexedImage) class152s[i_22_];
					int[] is_29_ = class152_sub1.palette;
					byte[] is_30_ = class152_sub1.alpha;
					byte[] is_31_ = class152_sub1.raster;
					if (is_30_ != null) {
						for (int i_32_ = 0; i_32_ < i_23_; i_32_++) {
							for (int i_33_ = 0; i_33_ < i_24_; i_33_++) {
								is[i_27_++] = is_30_[i_28_] << 24 | is_29_[is_31_[i_28_] & 0xff];
								i_28_++;
							}
							i_27_ += i_1_ - i_24_;
						}
					} else {
						for (int i_34_ = 0; i_34_ < i_23_; i_34_++) {
							for (int i_35_ = 0; i_35_ < i_24_; i_35_++) {
								int i_36_;
								if ((i_36_ = is_31_[i_28_++]) != 0) {
									is[i_27_++] = ~0xffffff | is_29_[i_36_ & 0xff];
								} else {
									i_27_++;
								}
							}
							i_27_ += i_1_ - i_24_;
						}
					}
				} else {
					DirectImage class152_sub2 = (DirectImage) class152s[i_22_];
					int[] is_37_ = class152_sub2.argb(false);
					if (!class152_sub2.hasAlpha()) {
						for (int i_38_ = 0; i_38_ < i_23_; i_38_++) {
							for (int i_39_ = 0; i_39_ < i_24_; i_39_++) {
								int i_40_ = is_37_[i_28_] & 0xffffff;
								is[i_27_++] = (i_40_ == 0 ? 0 : 255) << 24 | i_40_;
								i_28_++;
							}
							i_27_ += i_1_ - i_24_;
						}
					} else {
						for (int i_41_ = 0; i_41_ < i_23_; i_41_++) {
							for (int i_42_ = 0; i_42_ < i_24_; i_42_++) {
								is[i_27_++] = is_37_[i_28_++];
							}
							i_27_ += i_1_ - i_24_;
						}
					}
				}
			}
			aClass102_Sub1_Sub1_9437 = RectangularOpenGl2DTexture.create(class134_sub2, i_1_, i_1_, false, is, 0, 0);
			aBool9438 = false;
		}
		aClass102_Sub1_Sub1_9437.filterLinear(false);
		aClass104_9436 = new OpenGlList(class134_sub2, 256);
		float f = aClass102_Sub1_Sub1_9437.widthRatio / aClass102_Sub1_Sub1_9437.anInt10950;
		float f_43_ = aClass102_Sub1_Sub1_9437.heightRatio / aClass102_Sub1_Sub1_9437.anInt10947;
		for (int i_44_ = 0; i_44_ < 256; i_44_++) {
			Image class152 = class152s[i_44_];
			int i_45_ = class152.getHeight();
			int i_46_ = class152.getWidth();
			int i_47_ = class152.getOffsetY();
			int i_48_ = class152.getOffsetX();
			float f_49_ = i_44_ % 16 * i;
			float f_50_ = i_44_ / 16 * i;
			float f_51_ = f_49_ * f;
			float f_52_ = f_50_ * f_43_;
			float f_53_ = (f_49_ + i_46_) * f;
			float f_54_ = (f_50_ + i_45_) * f_43_;
			aClass104_9436.create(i_44_);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(f_51_, aClass102_Sub1_Sub1_9437.heightRatio - f_52_);
			OpenGL.glVertex2i(i_48_, i_47_);
			OpenGL.glTexCoord2f(f_51_, aClass102_Sub1_Sub1_9437.heightRatio - f_54_);
			OpenGL.glVertex2i(i_48_, i_47_ + i_45_);
			OpenGL.glTexCoord2f(f_53_, aClass102_Sub1_Sub1_9437.heightRatio - f_54_);
			OpenGL.glVertex2i(i_48_ + i_46_, i_47_ + i_45_);
			OpenGL.glTexCoord2f(f_53_, aClass102_Sub1_Sub1_9437.heightRatio - f_52_);
			OpenGL.glVertex2i(i_48_ + i_46_, i_47_);
			OpenGL.glEnd();
			aClass104_9436.end();
		}
	}

	@Override
	void renderCharacter(char character, int x, int i_60_, int i_61_, boolean mono) {
		aClass134_Sub2_9439.method14323();
		aClass134_Sub2_9439.setActiveTexture(aClass102_Sub1_Sub1_9437);
		if (aBool9438 || mono) {
			aClass134_Sub2_9439.setTextureParameters(7681, 8448);
			aClass134_Sub2_9439.method14376(0, 34168, 768);
		} else {
			aClass134_Sub2_9439.setTextureParameters(7681, 7681);
		}
		OpenGL.glColor4ub((byte) (i_61_ >> 16), (byte) (i_61_ >> 8), (byte) i_61_, (byte) (i_61_ >> 24));
		OpenGL.glTranslatef(x, i_60_, 0.0F);
		aClass104_9436.call(character);
		OpenGL.glLoadIdentity();
		if (aBool9438 || mono) {
			aClass134_Sub2_9439.method14376(0, 5890, 768);
		}
	}

	@Override
	void renderCharacter(char c, int i, int i_55_, int i_56_, boolean bool, ClippingMask clipping, int i_57_, int i_58_) {
		OpenGlClippingMask class129_sub2 = (OpenGlClippingMask) clipping;
		RectangularOpenGl2DTexture class102_sub1_sub1 = class129_sub2.texture;
		aClass134_Sub2_9439.method14323();
		aClass134_Sub2_9439.setActiveTexture(aClass102_Sub1_Sub1_9437);
		if (aBool9438 || bool) {
			aClass134_Sub2_9439.setTextureParameters(7681, 8448);
			aClass134_Sub2_9439.method14376(0, 34168, 768);
		} else {
			aClass134_Sub2_9439.setTextureParameters(7681, 7681);
		}
		aClass134_Sub2_9439.method14326(1);
		aClass134_Sub2_9439.setActiveTexture(class102_sub1_sub1);
		aClass134_Sub2_9439.setTextureParameters(7681, 8448);
		aClass134_Sub2_9439.method14376(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		float f = class102_sub1_sub1.widthRatio / class102_sub1_sub1.anInt10950;
		float f_59_ = class102_sub1_sub1.heightRatio / class102_sub1_sub1.anInt10947;
		OpenGL.glTexGenfv(8192, 9474, new float[] { f, 0.0F, 0.0F, -i_57_ * f }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, f_59_, 0.0F, -i_58_ * f_59_ }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (i_56_ >> 16), (byte) (i_56_ >> 8), (byte) i_56_, (byte) (i_56_ >> 24));
		OpenGL.glTranslatef(i, i_55_, 0.0F);
		aClass104_9436.call(c);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		aClass134_Sub2_9439.method14376(0, 5890, 768);
		aClass134_Sub2_9439.setTextureParameters(8448, 8448);
		aClass134_Sub2_9439.setActiveTexture(null);
		aClass134_Sub2_9439.method14326(0);
		if (aBool9438 || bool) {
			aClass134_Sub2_9439.method14376(0, 5890, 768);
		}
	}
}
