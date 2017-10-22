package com.jagex;

import jaggl.OpenGL;

public class OpenGlSprite extends Sprite {

	RectangularOpenGl2DTexture aClass102_Sub1_Sub1_8622;
	OpenGlToolkit toolkit;
	RectangularOpenGl2DTexture aClass102_Sub1_Sub1_8624;
	int anInt8625;
	boolean aBool8626;
	int anInt8627;
	int anInt8628;
	int anInt8629;
	int anInt8630 = 0;

	OpenGlSprite(OpenGlToolkit toolkit, int width, int height, boolean bool) {
		this.toolkit = toolkit;
		aClass102_Sub1_Sub1_8622 = RectangularOpenGl2DTexture.create(toolkit, bool ? Class121.aClass121_1465
				: Class121.aClass121_1466, Class151.aClass151_2, width, height);
	}

	OpenGlSprite(OpenGlToolkit toolkit, int i, int i_25_, int i_26_, int i_27_) {
		this.toolkit = toolkit;
		aClass102_Sub1_Sub1_8622 = RectangularOpenGl2DTexture.create(toolkit, i, i_25_, i_26_, i_27_);
	}

	OpenGlSprite(OpenGlToolkit toolkit, int i, int i_28_, int[] is, int i_29_, int i_30_) {
		this.toolkit = toolkit;
		aClass102_Sub1_Sub1_8622 = RectangularOpenGl2DTexture.create(toolkit, i, i_28_, false, is, i_30_, i_29_);
	}

	@Override
	public int scaleWidth() {
		return aClass102_Sub1_Sub1_8622.anInt10950 + anInt8628 + anInt8625;
	}

	@Override
	public void setOffsets(int i, int i_31_, int i_32_, int i_33_) {
		anInt8628 = i;
		anInt8627 = i_31_;
		anInt8625 = i_32_;
		anInt8629 = i_33_;
		aBool8626 = anInt8628 != 0 || anInt8627 != 0 || anInt8625 != 0 || anInt8629 != 0;
	}

	@Override
	public void getOffsets(int[] is) {
		is[0] = anInt8628;
		is[1] = anInt8627;
		is[2] = anInt8625;
		is[3] = anInt8629;
	}

	@Override
	public int scaleHeight() {
		return aClass102_Sub1_Sub1_8622.anInt10947 + anInt8627 + anInt8629;
	}

	@Override
	public Interface16 method2075() {
		return aClass102_Sub1_Sub1_8622.method13938(0);
	}

	@Override
	public void method2076(int i, int i_115_, int i_116_, int i_117_, int[] is, int[] is_118_, int i_119_, int i_120_) {
		aClass102_Sub1_Sub1_8622.method13936(i, i_115_, i_116_, i_117_, is, is_118_, i_119_);
	}

	@Override
	public void method2081(int i, int i_63_, ClippingMask class129, int i_64_, int i_65_) {
		OpenGlClippingMask class129_sub2 = (OpenGlClippingMask) class129;
		RectangularOpenGl2DTexture class102_sub1_sub1 = class129_sub2.texture;
		aClass102_Sub1_Sub1_8622.filterLinear(false);
		toolkit.method14322();
		toolkit.setActiveTexture(aClass102_Sub1_Sub1_8622);
		toolkit.setColourOp(1);
		toolkit.method14326(1);
		toolkit.setActiveTexture(class102_sub1_sub1);
		toolkit.setTextureParameters(7681, 8448);
		toolkit.method14376(0, 34168, 768);
		toolkit.setBlendMode(1);
		i += anInt8628;
		i_63_ += anInt8627;
		int i_66_ = i + aClass102_Sub1_Sub1_8622.anInt10950;
		int i_67_ = i_63_ + aClass102_Sub1_Sub1_8622.anInt10947;
		float f = class102_sub1_sub1.widthRatio / class102_sub1_sub1.anInt10950;
		float f_68_ = class102_sub1_sub1.heightRatio / class102_sub1_sub1.anInt10947;
		float f_69_ = (i - i_64_) * f;
		float f_70_ = (i_66_ - i_64_) * f;
		float f_71_ = class102_sub1_sub1.heightRatio - (i_63_ - i_65_) * f_68_;
		float f_72_ = class102_sub1_sub1.heightRatio - (i_67_ - i_65_) * f_68_;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, aClass102_Sub1_Sub1_8622.heightRatio);
		OpenGL.glMultiTexCoord2f(33985, f_69_, f_71_);
		OpenGL.glVertex2i(i, i_63_);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_69_, f_72_);
		OpenGL.glVertex2i(i, i_63_ + aClass102_Sub1_Sub1_8622.anInt10947);
		OpenGL.glMultiTexCoord2f(33984, aClass102_Sub1_Sub1_8622.widthRatio, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_70_, f_72_);
		OpenGL.glVertex2i(i + aClass102_Sub1_Sub1_8622.anInt10950, i_63_ + aClass102_Sub1_Sub1_8622.anInt10947);
		OpenGL.glMultiTexCoord2f(33984, aClass102_Sub1_Sub1_8622.widthRatio,
				aClass102_Sub1_Sub1_8622.heightRatio);
		OpenGL.glMultiTexCoord2f(33985, f_70_, f_71_);
		OpenGL.glVertex2i(i + aClass102_Sub1_Sub1_8622.anInt10950, i_63_);
		OpenGL.glEnd();
		toolkit.method14376(0, 5890, 768);
		toolkit.setColourOp(0);
		toolkit.setActiveTexture(null);
		toolkit.method14326(0);
	}

	@Override
	public void method2085(int i, int i_73_, int i_74_, int i_75_, int i_76_, int i_77_, int i_78_) {
		int i_79_ = i + i_74_;
		int i_80_ = i_73_ + i_75_;
		aClass102_Sub1_Sub1_8622.filterLinear(false);
		toolkit.method14322();
		toolkit.setActiveTexture(aClass102_Sub1_Sub1_8622);
		toolkit.setBlendMode(i_78_);
		toolkit.setColourOp(i_76_);
		OpenGL.glColor4ub((byte) (i_77_ >> 16), (byte) (i_77_ >> 8), (byte) i_77_, (byte) (i_77_ >> 24));
		if (aClass102_Sub1_Sub1_8622.square && !aBool8626 && i_75_ >= aClass102_Sub1_Sub1_8622.anInt10947
				&& i_74_ >= aClass102_Sub1_Sub1_8622.anInt10950) {
			float f = aClass102_Sub1_Sub1_8622.heightRatio * i_75_ / aClass102_Sub1_Sub1_8622.anInt10947;
			float f_81_ = aClass102_Sub1_Sub1_8622.widthRatio * i_74_ / aClass102_Sub1_Sub1_8622.anInt10950;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, f);
			OpenGL.glVertex2i(i, i_73_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_80_);
			OpenGL.glTexCoord2f(f_81_, 0.0F);
			OpenGL.glVertex2i(i_79_, i_80_);
			OpenGL.glTexCoord2f(f_81_, f);
			OpenGL.glVertex2i(i_79_, i_73_);
			OpenGL.glEnd();
		} else {
			OpenGL.glPushMatrix();
			OpenGL.glTranslatef(anInt8628, anInt8627, 0.0F);
			int i_82_ = scaleWidth();
			int i_83_ = scaleHeight();
			int i_84_ = i_73_ + aClass102_Sub1_Sub1_8622.anInt10947;
			OpenGL.glBegin(7);
			int i_85_ = i_73_;
			for (; i_84_ <= i_80_; i_84_ += i_83_) {
				int i_86_ = i + aClass102_Sub1_Sub1_8622.anInt10950;
				int i_87_ = i;
				while (i_86_ <= i_79_) {
					OpenGL.glTexCoord2f(0.0F, aClass102_Sub1_Sub1_8622.heightRatio);
					OpenGL.glVertex2i(i_87_, i_85_);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(i_87_, i_84_);
					OpenGL.glTexCoord2f(aClass102_Sub1_Sub1_8622.widthRatio, 0.0F);
					OpenGL.glVertex2i(i_86_, i_84_);
					OpenGL.glTexCoord2f(aClass102_Sub1_Sub1_8622.widthRatio, aClass102_Sub1_Sub1_8622.heightRatio);
					OpenGL.glVertex2i(i_86_, i_85_);
					i_86_ += i_82_;
					i_87_ += i_82_;
				}
				if (i_87_ < i_79_) {
					float f = aClass102_Sub1_Sub1_8622.widthRatio * (i_79_ - i_87_)
							/ aClass102_Sub1_Sub1_8622.anInt10950;
					OpenGL.glTexCoord2f(0.0F, aClass102_Sub1_Sub1_8622.heightRatio);
					OpenGL.glVertex2i(i_87_, i_85_);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(i_87_, i_84_);
					OpenGL.glTexCoord2f(f, 0.0F);
					OpenGL.glVertex2i(i_79_, i_84_);
					OpenGL.glTexCoord2f(f, aClass102_Sub1_Sub1_8622.heightRatio);
					OpenGL.glVertex2i(i_79_, i_85_);
				}
				i_85_ += i_83_;
			}
			if (i_85_ < i_80_) {
				float f = aClass102_Sub1_Sub1_8622.heightRatio
						* (aClass102_Sub1_Sub1_8622.anInt10947 - (i_80_ - i_85_)) / aClass102_Sub1_Sub1_8622.anInt10947;
				int i_88_ = i + aClass102_Sub1_Sub1_8622.anInt10950;
				int i_89_ = i;
				while (i_88_ <= i_79_) {
					OpenGL.glTexCoord2f(0.0F, aClass102_Sub1_Sub1_8622.heightRatio);
					OpenGL.glVertex2i(i_89_, i_85_);
					OpenGL.glTexCoord2f(0.0F, f);
					OpenGL.glVertex2i(i_89_, i_80_);
					OpenGL.glTexCoord2f(aClass102_Sub1_Sub1_8622.widthRatio, f);
					OpenGL.glVertex2i(i_88_, i_80_);
					OpenGL.glTexCoord2f(aClass102_Sub1_Sub1_8622.widthRatio, aClass102_Sub1_Sub1_8622.heightRatio);
					OpenGL.glVertex2i(i_88_, i_85_);
					i_88_ += i_82_;
					i_89_ += i_82_;
				}
				if (i_89_ < i_79_) {
					float f_90_ = aClass102_Sub1_Sub1_8622.widthRatio * (i_79_ - i_89_)
							/ aClass102_Sub1_Sub1_8622.anInt10950;
					OpenGL.glTexCoord2f(0.0F, aClass102_Sub1_Sub1_8622.heightRatio);
					OpenGL.glVertex2i(i_89_, i_85_);
					OpenGL.glTexCoord2f(0.0F, f);
					OpenGL.glVertex2i(i_89_, i_80_);
					OpenGL.glTexCoord2f(f_90_, f);
					OpenGL.glVertex2i(i_79_, i_80_);
					OpenGL.glTexCoord2f(f_90_, aClass102_Sub1_Sub1_8622.heightRatio);
					OpenGL.glVertex2i(i_79_, i_85_);
				}
			}
			OpenGL.glEnd();
			OpenGL.glPopMatrix();
		}
	}

	@Override
	public void method2088(int i, int i_121_, int i_122_, int i_123_, int i_124_, int i_125_) {
		method14009(i, i_121_, i_122_, i_123_, i_124_, i_125_, false);
	}

	@Override
	public void method2100(int i, int i_54_, int i_55_, int i_56_, int[] is, int i_57_, int i_58_) {
		aClass102_Sub1_Sub1_8622.copy(i, i_54_, i_55_, i_56_, is, i_57_, i_58_, true);
	}

	@Override
	public void method2114(int i, int i_52_, int i_53_) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		aClass102_Sub1_Sub1_8624 = RectangularOpenGl2DTexture.create(toolkit, i, i_52_,
				aClass102_Sub1_Sub1_8622.anInt10950, aClass102_Sub1_Sub1_8622.anInt10947);
		anInt8630 = i_53_;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@Override
	public int method2119() {
		return aClass102_Sub1_Sub1_8622.anInt10947;
	}

	@Override
	public void method2142(int x, int i_59_, int i_60_, int i_61_, int i_62_) {
		aClass102_Sub1_Sub1_8622.filterLinear(false);
		toolkit.method14322();
		toolkit.setBlendMode(i_62_);
		OpenGL.glColor4ub((byte) (i_61_ >> 16), (byte) (i_61_ >> 8), (byte) i_61_, (byte) (i_61_ >> 24));
		x += anInt8628;
		i_59_ += anInt8627;
		if (aClass102_Sub1_Sub1_8624 == null) {
			toolkit.setActiveTexture(aClass102_Sub1_Sub1_8622);
			toolkit.setColourOp(i_60_);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, aClass102_Sub1_Sub1_8622.heightRatio);
			OpenGL.glVertex2i(x, i_59_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(x, i_59_ + aClass102_Sub1_Sub1_8622.anInt10947);
			OpenGL.glTexCoord2f(aClass102_Sub1_Sub1_8622.widthRatio, 0.0F);
			OpenGL.glVertex2i(x + aClass102_Sub1_Sub1_8622.anInt10950, i_59_ + aClass102_Sub1_Sub1_8622.anInt10947);
			OpenGL.glTexCoord2f(aClass102_Sub1_Sub1_8622.widthRatio, aClass102_Sub1_Sub1_8622.heightRatio);
			OpenGL.glVertex2i(x + aClass102_Sub1_Sub1_8622.anInt10950, i_59_);
			OpenGL.glEnd();
		} else {
			method14010(i_60_);
			aClass102_Sub1_Sub1_8624.filterLinear(false);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, aClass102_Sub1_Sub1_8622.heightRatio);
			OpenGL.glTexCoord2f(0.0F, aClass102_Sub1_Sub1_8622.heightRatio);
			OpenGL.glVertex2i(x, i_59_);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(x, i_59_ + aClass102_Sub1_Sub1_8622.anInt10947);
			OpenGL.glMultiTexCoord2f(33985, aClass102_Sub1_Sub1_8622.widthRatio, 0.0F);
			OpenGL.glTexCoord2f(aClass102_Sub1_Sub1_8622.widthRatio, 0.0F);
			OpenGL.glVertex2i(x + aClass102_Sub1_Sub1_8622.anInt10950, i_59_ + aClass102_Sub1_Sub1_8622.anInt10947);
			OpenGL.glMultiTexCoord2f(33985, aClass102_Sub1_Sub1_8622.widthRatio, aClass102_Sub1_Sub1_8622.heightRatio);
			OpenGL.glTexCoord2f(aClass102_Sub1_Sub1_8622.widthRatio, aClass102_Sub1_Sub1_8622.heightRatio);
			OpenGL.glVertex2i(x + aClass102_Sub1_Sub1_8622.anInt10950, i_59_);
			OpenGL.glEnd();
			method14011();
		}
	}

	@Override
	public int method2157() {
		return aClass102_Sub1_Sub1_8622.anInt10950;
	}

	void method14009(int i, int i_46_, int i_47_, int i_48_, int i_49_, int i_50_, boolean bool) {
		if (toolkit.aBool9111 && !bool) {
			int[] is = toolkit.method2404(i_49_, i_50_, i_47_, i_48_);
			if (is != null) {
				for (int i_51_ = 0; i_51_ < is.length; i_51_++) {
					is[i_51_] |= ~0xffffff;
				}
				method2100(i, i_46_, i_47_, i_48_, is, 0, i_47_);
			}
		} else {
			aClass102_Sub1_Sub1_8622.draw(i, i_46_, i_47_, i_48_, i_49_, i_50_);
		}
	}

	void method14010(int i) {
		toolkit.method14326(1);
		toolkit.setActiveTexture(aClass102_Sub1_Sub1_8622);
		toolkit.setTextureParameters(toolkit.method14329(i), 7681);
		toolkit.method14376(1, 34167, 768);
		toolkit.method14283(0, 34168, 770);
		toolkit.method14326(0);
		toolkit.setActiveTexture(aClass102_Sub1_Sub1_8624);
		toolkit.setTextureParameters(34479, 7681);
		toolkit.method14376(1, 34166, 768);
		if (anInt8630 == 0) {
			toolkit.setTexEnvColour(1.0F, 0.5F, 0.5F, 0.0F);
		} else if (anInt8630 == 1) {
			toolkit.setTexEnvColour(0.5F, 1.0F, 0.5F, 0.0F);
		} else if (anInt8630 == 2) {
			toolkit.setTexEnvColour(0.5F, 0.5F, 1.0F, 0.0F);
		} else if (anInt8630 == 3) {
			toolkit.setTexEnvColour(128.5F, 128.5F, 128.5F, 0.0F);
		}
	}

	void method14011() {
		toolkit.method14326(1);
		toolkit.setActiveTexture(null);
		toolkit.setTextureParameters(8448, 8448);
		toolkit.method14376(1, 34168, 768);
		toolkit.method14283(0, 5890, 770);
		toolkit.method14326(0);
		toolkit.method14376(1, 34168, 768);
	}

	@Override
	void method2083(int i, int i_34_, int i_35_, int i_36_, int i_37_, int i_38_, int i_39_, int i_40_) {
		aClass102_Sub1_Sub1_8622.filterLinear((i_40_ & 0x1) != 0);
		toolkit.method14322();
		toolkit.setBlendMode(i_39_);
		OpenGL.glColor4ub((byte) (i_38_ >> 16), (byte) (i_38_ >> 8), (byte) i_38_, (byte) (i_38_ >> 24));
		if (aBool8626) {
			float f = (float) i_35_ / (float) scaleWidth();
			float f_41_ = (float) i_36_ / (float) scaleHeight();
			float f_42_ = i + anInt8628 * f;
			float f_43_ = i_34_ + anInt8627 * f_41_;
			float f_44_ = f_42_ + aClass102_Sub1_Sub1_8622.anInt10950 * f;
			float f_45_ = f_43_ + aClass102_Sub1_Sub1_8622.anInt10947 * f_41_;
			if (aClass102_Sub1_Sub1_8624 == null) {
				toolkit.setActiveTexture(aClass102_Sub1_Sub1_8622);
				toolkit.setColourOp(i_37_);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, aClass102_Sub1_Sub1_8622.heightRatio);
				OpenGL.glVertex2f(f_42_, f_43_);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(f_42_, f_45_);
				OpenGL.glTexCoord2f(aClass102_Sub1_Sub1_8622.widthRatio, 0.0F);
				OpenGL.glVertex2f(f_44_, f_45_);
				OpenGL.glTexCoord2f(aClass102_Sub1_Sub1_8622.widthRatio,
						aClass102_Sub1_Sub1_8622.heightRatio);
				OpenGL.glVertex2f(f_44_, f_43_);
				OpenGL.glEnd();
			} else {
				method14010(i_37_);
				aClass102_Sub1_Sub1_8624.filterLinear(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, aClass102_Sub1_Sub1_8622.heightRatio);
				OpenGL.glTexCoord2f(0.0F, aClass102_Sub1_Sub1_8622.heightRatio);
				OpenGL.glVertex2f(f_42_, f_43_);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(f_42_, f_45_);
				OpenGL.glMultiTexCoord2f(33985, aClass102_Sub1_Sub1_8622.widthRatio, 0.0F);
				OpenGL.glTexCoord2f(aClass102_Sub1_Sub1_8622.widthRatio, 0.0F);
				OpenGL.glVertex2f(f_44_, f_45_);
				OpenGL.glMultiTexCoord2f(33985, aClass102_Sub1_Sub1_8622.widthRatio,
						aClass102_Sub1_Sub1_8622.heightRatio);
				OpenGL.glTexCoord2f(aClass102_Sub1_Sub1_8622.widthRatio, aClass102_Sub1_Sub1_8622.heightRatio);
				OpenGL.glVertex2f(f_44_, f_43_);
				OpenGL.glEnd();
				method14011();
			}
		} else if (aClass102_Sub1_Sub1_8624 == null) {
			toolkit.setActiveTexture(aClass102_Sub1_Sub1_8622);
			toolkit.setColourOp(i_37_);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, aClass102_Sub1_Sub1_8622.heightRatio);
			OpenGL.glVertex2i(i, i_34_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_34_ + i_36_);
			OpenGL.glTexCoord2f(aClass102_Sub1_Sub1_8622.widthRatio, 0.0F);
			OpenGL.glVertex2i(i + i_35_, i_34_ + i_36_);
			OpenGL.glTexCoord2f(aClass102_Sub1_Sub1_8622.widthRatio, aClass102_Sub1_Sub1_8622.heightRatio);
			OpenGL.glVertex2i(i + i_35_, i_34_);
			OpenGL.glEnd();
		} else {
			method14010(i_37_);
			aClass102_Sub1_Sub1_8624.filterLinear(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, aClass102_Sub1_Sub1_8622.heightRatio);
			OpenGL.glTexCoord2f(0.0F, aClass102_Sub1_Sub1_8622.heightRatio);
			OpenGL.glVertex2i(i, i_34_);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_34_ + i_36_);
			OpenGL.glMultiTexCoord2f(33985, aClass102_Sub1_Sub1_8622.widthRatio, 0.0F);
			OpenGL.glTexCoord2f(aClass102_Sub1_Sub1_8622.widthRatio, 0.0F);
			OpenGL.glVertex2i(i + i_35_, i_34_ + i_36_);
			OpenGL.glMultiTexCoord2f(33985, aClass102_Sub1_Sub1_8622.widthRatio, aClass102_Sub1_Sub1_8622.heightRatio);
			OpenGL.glTexCoord2f(aClass102_Sub1_Sub1_8622.widthRatio, aClass102_Sub1_Sub1_8622.heightRatio);
			OpenGL.glVertex2i(i + i_35_, i_34_);
			OpenGL.glEnd();
			method14011();
		}
	}

	@Override
	void method2096(float f, float f_0_, float f_1_, float f_2_, float f_3_, float f_4_, int i, ClippingMask class129,
			int i_5_, int i_6_) {
		RectangularOpenGl2DTexture class102_sub1_sub1 = ((OpenGlClippingMask) class129).texture;
		if (aBool8626) {
			float f_7_ = scaleWidth();
			float f_8_ = scaleHeight();
			float f_9_ = (f_1_ - f) / f_7_;
			float f_10_ = (f_2_ - f_0_) / f_7_;
			float f_11_ = (f_3_ - f) / f_8_;
			float f_12_ = (f_4_ - f_0_) / f_8_;
			float f_13_ = f_11_ * anInt8627;
			float f_14_ = f_12_ * anInt8627;
			float f_15_ = f_9_ * anInt8628;
			float f_16_ = f_10_ * anInt8628;
			float f_17_ = -f_9_ * anInt8625;
			float f_18_ = -f_10_ * anInt8625;
			float f_19_ = -f_11_ * anInt8629;
			float f_20_ = -f_12_ * anInt8629;
			f = f + f_15_ + f_13_;
			f_0_ = f_0_ + f_16_ + f_14_;
			f_1_ = f_1_ + f_17_ + f_13_;
			f_2_ = f_2_ + f_18_ + f_14_;
			f_3_ = f_3_ + f_15_ + f_19_;
			f_4_ = f_4_ + f_16_ + f_20_;
		}
		float f_21_ = f_3_ + (f_1_ - f);
		float f_22_ = f_2_ + (f_4_ - f_0_);
		aClass102_Sub1_Sub1_8622.filterLinear((i & 0x1) != 0);
		toolkit.method14322();
		toolkit.setActiveTexture(aClass102_Sub1_Sub1_8622);
		toolkit.setColourOp(1);
		toolkit.method14326(1);
		toolkit.setActiveTexture(class102_sub1_sub1);
		toolkit.setTextureParameters(7681, 8448);
		toolkit.method14376(0, 34168, 768);
		toolkit.setBlendMode(1);
		float f_23_ = class102_sub1_sub1.widthRatio / class102_sub1_sub1.anInt10950;
		float f_24_ = class102_sub1_sub1.heightRatio / class102_sub1_sub1.anInt10947;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, aClass102_Sub1_Sub1_8622.heightRatio);
		OpenGL.glMultiTexCoord2f(33985, f_23_ * (f - i_5_), class102_sub1_sub1.heightRatio - f_24_ * (f_0_ - i_6_));
		OpenGL.glVertex2f(f, f_0_);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_23_ * (f_3_ - i_5_), class102_sub1_sub1.heightRatio - f_24_ * (f_4_ - i_6_));
		OpenGL.glVertex2f(f_3_, f_4_);
		OpenGL.glMultiTexCoord2f(33984, aClass102_Sub1_Sub1_8622.widthRatio, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_23_ * (f_21_ - i_5_), class102_sub1_sub1.heightRatio - f_24_ * (f_22_ - i_6_));
		OpenGL.glVertex2f(f_21_, f_22_);
		OpenGL.glMultiTexCoord2f(33984, aClass102_Sub1_Sub1_8622.widthRatio, aClass102_Sub1_Sub1_8622.heightRatio);
		OpenGL.glMultiTexCoord2f(33985, f_23_ * (f_1_ - i_5_), class102_sub1_sub1.heightRatio - f_24_ * (f_2_ - i_6_));
		OpenGL.glVertex2f(f_1_, f_2_);
		OpenGL.glEnd();
		toolkit.method14376(0, 5890, 768);
		toolkit.setColourOp(0);
		toolkit.setActiveTexture(null);
		toolkit.method14326(0);
	}

	@Override
	void method2143(float f, float f_91_, float f_92_, float f_93_, float f_94_, float f_95_, int i, int i_96_,
			int i_97_, int i_98_) {
		if (aBool8626) {
			float f_99_ = scaleWidth();
			float f_100_ = scaleHeight();
			float f_101_ = (f_92_ - f) / f_99_;
			float f_102_ = (f_93_ - f_91_) / f_99_;
			float f_103_ = (f_94_ - f) / f_100_;
			float f_104_ = (f_95_ - f_91_) / f_100_;
			float f_105_ = f_103_ * anInt8627;
			float f_106_ = f_104_ * anInt8627;
			float f_107_ = f_101_ * anInt8628;
			float f_108_ = f_102_ * anInt8628;
			float f_109_ = -f_101_ * anInt8625;
			float f_110_ = -f_102_ * anInt8625;
			float f_111_ = -f_103_ * anInt8629;
			float f_112_ = -f_104_ * anInt8629;
			f = f + f_107_ + f_105_;
			f_91_ = f_91_ + f_108_ + f_106_;
			f_92_ = f_92_ + f_109_ + f_105_;
			f_93_ = f_93_ + f_110_ + f_106_;
			f_94_ = f_94_ + f_107_ + f_111_;
			f_95_ = f_95_ + f_108_ + f_112_;
		}
		float f_113_ = f_94_ + (f_92_ - f);
		float f_114_ = f_93_ + (f_95_ - f_91_);
		aClass102_Sub1_Sub1_8622.filterLinear((i_98_ & 0x1) != 0);
		toolkit.method14322();
		toolkit.setActiveTexture(aClass102_Sub1_Sub1_8622);
		toolkit.setBlendMode(i_97_);
		toolkit.setColourOp(i);
		OpenGL.glColor4ub((byte) (i_96_ >> 16), (byte) (i_96_ >> 8), (byte) i_96_, (byte) (i_96_ >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, aClass102_Sub1_Sub1_8622.heightRatio);
		OpenGL.glVertex2f(f, f_91_);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(f_94_, f_95_);
		OpenGL.glTexCoord2f(aClass102_Sub1_Sub1_8622.widthRatio, 0.0F);
		OpenGL.glVertex2f(f_113_, f_114_);
		OpenGL.glTexCoord2f(aClass102_Sub1_Sub1_8622.widthRatio, aClass102_Sub1_Sub1_8622.heightRatio);
		OpenGL.glVertex2f(f_92_, f_93_);
		OpenGL.glEnd();
	}
}
