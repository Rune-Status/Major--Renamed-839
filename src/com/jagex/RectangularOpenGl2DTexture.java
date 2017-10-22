package com.jagex;

import jaggl.OpenGL;

public class RectangularOpenGl2DTexture extends OpenGl2DTexture {

	static RectangularOpenGl2DTexture create(OpenGlToolkit toolkit, Class121 class121, Class151 class151, int width,
			int height, boolean bool, byte[] data, Class121 class121_1_) {
		if (toolkit.aBool8976 || Class577.isPowerOf2(width) && Class577.isPowerOf2(height)) {
			return new RectangularOpenGl2DTexture(toolkit, OpenGL.GL_TEXTURE_2D, class121, class151, width, height,
					bool, data, class121_1_);
		} else if (toolkit.aBool9126) {
			return new RectangularOpenGl2DTexture(toolkit, 34037, class121, class151, width, height, bool, data,
					class121_1_);
		}

		return new RectangularOpenGl2DTexture(toolkit, class121, class151, width, height,
				HashTable.nextPowerOfTwo(width), HashTable.nextPowerOfTwo(height), data, class121_1_);
	}

	static RectangularOpenGl2DTexture create(OpenGlToolkit toolkit, int i, int i_2_, boolean bool, int[] is, int i_3_,
			int i_4_) {
		if (toolkit.aBool8976 || Class577.isPowerOf2(i) && Class577.isPowerOf2(i_2_)) {
			return new RectangularOpenGl2DTexture(toolkit, OpenGL.GL_TEXTURE_2D, i, i_2_, bool, is, i_3_, i_4_);
		} else if (toolkit.aBool9126) {
			return new RectangularOpenGl2DTexture(toolkit, 34037, i, i_2_, bool, is, i_3_, i_4_);
		}

		return new RectangularOpenGl2DTexture(toolkit, i, i_2_, HashTable.nextPowerOfTwo(i),
				HashTable.nextPowerOfTwo(i_2_), is);
	}

	static RectangularOpenGl2DTexture create(OpenGlToolkit toolkit, Class121 class121, Class151 class151, int i,
			int i_12_) {
		if (toolkit.aBool8976 || Class577.isPowerOf2(i) && Class577.isPowerOf2(i_12_)) {
			return new RectangularOpenGl2DTexture(toolkit, OpenGL.GL_TEXTURE_2D, class121, class151, i, i_12_);
		} else if (toolkit.aBool9126) {
			return new RectangularOpenGl2DTexture(toolkit, 34037, class121, class151, i, i_12_);
		}

		return new RectangularOpenGl2DTexture(toolkit, class121, class151, i, i_12_, HashTable.nextPowerOfTwo(i),
				HashTable.nextPowerOfTwo(i_12_));
	}

	static RectangularOpenGl2DTexture create(OpenGlToolkit toolkit, int i, int i_34_, int i_35_, int i_36_) {
		if (toolkit.aBool8976 || Class577.isPowerOf2(i_35_) && Class577.isPowerOf2(i_36_)) {
			return new RectangularOpenGl2DTexture(toolkit, OpenGL.GL_TEXTURE_2D, i, i_34_, i_35_, i_36_, true);
		} else if (toolkit.aBool9126) {
			return new RectangularOpenGl2DTexture(toolkit, 34037, i, i_34_, i_35_, i_36_, true);
		}

		return new RectangularOpenGl2DTexture(toolkit, i, i_34_, i_35_, i_36_, HashTable.nextPowerOfTwo(i_35_),
				HashTable.nextPowerOfTwo(i_36_), true);
	}

	boolean square;
	int anInt10947;
	float heightRatio;
	float widthRatio;
	int anInt10950;
	boolean aBool10951;

	RectangularOpenGl2DTexture(OpenGlToolkit toolkit, Class121 class121, Class151 class151, int i, int i_18_,
			int i_19_, int i_20_) {
		super(toolkit, OpenGL.GL_TEXTURE_2D, class121, class151, i_19_, i_20_);
		anInt10950 = i;
		anInt10947 = i_18_;
		heightRatio = (float) i_18_ / (float) i_20_;
		widthRatio = (float) i / (float) i_19_;
		square = false;
		aBool10951 = true;
		setRepeating(false, false);
	}

	RectangularOpenGl2DTexture(OpenGlToolkit toolkit, Class121 class121, Class151 class151, int i, int i_25_,
			int scaledWidth, int scaledHeight, byte[] data, Class121 class121_28_) {
		super(toolkit, OpenGL.GL_TEXTURE_2D, class121, class151, scaledWidth, scaledHeight);
		anInt10950 = i;
		anInt10947 = i_25_;
		copy(0, scaledHeight - i_25_, i, i_25_, data, class121_28_, 0, 0, true);
		heightRatio = (float) i_25_ / (float) scaledHeight;
		widthRatio = (float) i / (float) scaledWidth;
		square = false;
		aBool10951 = true;
		setRepeating(false, false);
	}

	RectangularOpenGl2DTexture(OpenGlToolkit toolkit, int target, Class121 class121, Class151 class151, int width,
			int height) {
		super(toolkit, target, class121, class151, width, height);
		this.anInt10950 = width;
		this.anInt10947 = height;

		if (target == 34037) {
			heightRatio = height;
			widthRatio = width;
			square = false;
		} else {
			heightRatio = 1.0F;
			widthRatio = 1.0F;
			square = true;
		}

		aBool10951 = false;
	}

	RectangularOpenGl2DTexture(OpenGlToolkit toolkit, int i, Class121 class121, Class151 class151, int i_13_,
			int i_14_, boolean bool, byte[] is, Class121 class121_15_) {
		super(toolkit, i, class121, class151, i_13_, i_14_, bool, is, class121_15_, true);
		anInt10950 = i_13_;
		anInt10947 = i_14_;

		if (target == 34037) {
			heightRatio = i_14_;
			widthRatio = i_13_;
			square = false;
		} else {
			heightRatio = 1.0F;
			widthRatio = 1.0F;
			square = true;
		}

		aBool10951 = false;
	}

	RectangularOpenGl2DTexture(OpenGlToolkit toolkit, int i, int i_5_, int i_6_, boolean bool, int[] is, int i_7_,
			int i_8_) {
		super(toolkit, i, i_5_, i_6_, bool, is, i_7_, i_8_, true);
		anInt10950 = i_5_;
		anInt10947 = i_6_;

		if (target == 34037) {
			heightRatio = i_6_;
			widthRatio = i_5_;
			square = false;
		} else {
			heightRatio = 1.0F;
			widthRatio = 1.0F;
			square = true;
		}

		aBool10951 = false;
	}

	RectangularOpenGl2DTexture(OpenGlToolkit toolkit, int i, int i_21_, int i_22_, int i_23_, int i_24_, boolean bool) {
		super(toolkit, i, i_21_, i_22_, i_23_, i_24_);
		anInt10950 = i_23_;
		anInt10947 = i_24_;

		if (target == 34037) {
			heightRatio = i_24_;
			widthRatio = i_23_;
			square = false;
		} else {
			heightRatio = 1.0F;
			widthRatio = 1.0F;
			square = true;
		}

		aBool10951 = false;
	}

	RectangularOpenGl2DTexture(OpenGlToolkit toolkit, int i, int i_29_, int i_30_, int i_31_, int i_32_, int i_33_,
			boolean bool) {
		super(toolkit, OpenGL.GL_TEXTURE_2D, i, i_29_, i_32_, i_33_);
		anInt10950 = i_30_;
		anInt10947 = i_31_;
		heightRatio = (float) i_31_ / (float) i_33_;
		widthRatio = (float) i_30_ / (float) i_32_;
		square = false;
		aBool10951 = true;
		setRepeating(false, false);
	}

	RectangularOpenGl2DTexture(OpenGlToolkit toolkit, int i, int i_9_, int i_10_, int i_11_, int[] is) {
		super(toolkit, OpenGL.GL_TEXTURE_2D, Class121.aClass121_1465, Class151.aClass151_2, i_10_, i_11_);
		anInt10950 = i;
		anInt10947 = i_9_;
		copy(0, i_11_ - i_9_, i, i_9_, is, 0, 0, true);
		heightRatio = (float) i_9_ / (float) i_11_;
		widthRatio = (float) i / (float) i_10_;
		square = false;
		aBool10951 = true;
		setRepeating(false, false);
	}

	@Override
	void filterLinear(boolean filter) {
		super.filterLinear(filter && !aBool10951);
	}

}