package com.jagex;

import jaggl.OpenGL;

public final class OpenGlX2DTexture extends OpenGlXTexture implements Interface40 {
	float widthScale;
	int height;
	int width;
	float heightScale;

	private static final int TEXTURE_2D = 0x0DE1;

	OpenGlX2DTexture(OpenGlXToolkit toolkit, Class121 class121, Class151 class151, int width, int height) {
		super(toolkit, TEXTURE_2D, class121, class151, width * height, false);
		if (!toolkit.aBool10984) {
			this.width = HashTable.nextPowerOfTwo(width);
			this.height = HashTable.nextPowerOfTwo(height);

			widthScale = (float) width / this.width;
			heightScale = (float) height / this.height;
		} else {
			this.width = width;
			this.height = height;
			widthScale = 1.0F;
			heightScale = 1.0F;
		}

		toolkit.method14689(this);
		OpenGL.glTexImage2Dub(target, 0, OpenGlXToolkit.method17357(aClass121_5266, aClass151_5267), width, height, 0,
				OpenGlXToolkit.method17363(aClass121_5266), OpenGlXToolkit.method17380(aClass151_5267), null, 0);
	}

	private static final int GL_UNPACK_ALIGNMENT = 0x0CF5;
	private static final int GL_UNPACK_ROW_LENGTH = 0x0CF2;

	OpenGlX2DTexture(OpenGlXToolkit toolkit, Class121 class121, int width, int height, boolean mipmapped, byte[] data,
			int i_1_, int i_2_) {
		super(toolkit, TEXTURE_2D, class121, Class151.aClass151_2, width * height, mipmapped);

		if (!this.toolkit.aBool10984) {
			this.width = HashTable.nextPowerOfTwo(width);
			this.height = HashTable.nextPowerOfTwo(height);
			widthScale = (float) width / (float) this.width;
			heightScale = (float) height / (float) this.height;

			if (width != this.width || height != this.height) {
				data = toolkit.method2506(width, height, this.width, this.height, data, i_1_, i_2_,
						class121.size * 115153045);
				i_1_ = 0;
				i_2_ = this.width;
			}
		} else {
			this.width = width;
			this.height = height;
			widthScale = 1.0F;
			heightScale = 1.0F;
		}

		toolkit.method14689(this);
		OpenGL.glPixelStorei(GL_UNPACK_ALIGNMENT, 1);
		if (!mipmapped || i_2_ != 0 || i_1_ != 0) {
			OpenGL.glPixelStorei(GL_UNPACK_ROW_LENGTH, i_2_);

			if (aClass121_5266 == Class121.aClass121_1463) {
				OpenGL.glCompressedTexImage2Dub(target, 0, 33777, width, height, 0, width * height / 2, data, i_1_);
			} else if (aClass121_5266 == Class121.aClass121_1459) {
				OpenGL.glCompressedTexImage2Dub(target, 0, 33779, width, height, 0, width * height, data, i_1_);
			} else {
				OpenGL.glTexImage2Dub(target, 0, OpenGlXToolkit.method17357(aClass121_5266, aClass151_5267), width,
						height, 0, OpenGlXToolkit.method17363(aClass121_5266), 5121, data, i_1_);
			}

			OpenGL.glPixelStorei(GL_UNPACK_ROW_LENGTH, 0);
		} else {
			method7860(target, width, height, data);
		}

		OpenGL.glPixelStorei(GL_UNPACK_ALIGNMENT, 4);
	}

	OpenGlX2DTexture(OpenGlXToolkit toolkit, Class121 class121, int width, int height, boolean mipmapped, float[] data,
			int i_33_, int i_34_) {
		super(toolkit, TEXTURE_2D, class121, Class151.aClass151_1, width * height, mipmapped);

		if (!this.toolkit.aBool10984) {
			this.width = HashTable.nextPowerOfTwo(width);
			this.height = HashTable.nextPowerOfTwo(height);
			widthScale = (float) width / (float) this.width;
			heightScale = (float) height / (float) this.height;

			if (width != this.width || height != this.height) {
				data = toolkit.method2668(width, height, this.width, this.height, data, i_33_, i_34_,
						class121.size * 115153045);
				i_33_ = 0;
				i_34_ = this.width;
			}
		} else {
			this.width = width;
			this.height = height;
			widthScale = 1.0F;
			heightScale = 1.0F;
		}

		toolkit.method14689(this);
		if (!mipmapped || i_34_ != 0 || i_33_ != 0) {
			OpenGL.glPixelStorei(3314, i_34_);
			OpenGL.glTexImage2Df(target, 0, OpenGlXToolkit.method17357(aClass121_5266, aClass151_5267), width, height,
					0, OpenGlXToolkit.method17363(aClass121_5266), 5126, data, i_33_ * 4);
			OpenGL.glPixelStorei(3314, 0);
		} else {
			method7861(target, width, height, data);
		}
	}

	OpenGlX2DTexture(OpenGlXToolkit toolkit, int width, int height, boolean mipmapped, int[] data, int i_37_, int i_38_) {
		super(toolkit, OpenGL.GL_TEXTURE_2D, Class121.aClass121_1465, Class151.aClass151_2, width * height, mipmapped);
		if (!this.toolkit.aBool10984) {
			this.width = HashTable.nextPowerOfTwo(width);
			this.height = HashTable.nextPowerOfTwo(height);
			widthScale = (float) width / (float) this.width;
			heightScale = (float) height / (float) this.height;

			if (width != this.width || height != this.height) {
				data = toolkit.method2694(width, height, this.width, this.height, data, i_37_, i_38_);
				i_37_ = 0;
				i_38_ = this.width;
			}
		} else {
			this.width = width;
			this.height = height;
			widthScale = 1.0F;
			heightScale = 1.0F;
		}

		toolkit.method14689(this);
		if (!mipmapped || i_38_ != 0 || i_37_ != 0) {
			OpenGL.glPixelStorei(3314, i_38_);
			OpenGL.glTexImage2Di(target, 0, 6408, this.width, this.height, 0, 32993, this.toolkit.anInt10993, data,
					i_37_ * 4);

			OpenGL.glPixelStorei(3314, 0);
		} else {
			method7859(target, width, height, data);
		}
	}

	@Override
	public int getWidth() {
		return width;
	}

	@Override
	public float method180(float f) {
		return f / height;
	}

	@Override
	public boolean method181() {
		return true;
	}

	@Override
	public void method183(int internalFormat, int width, int height, int i_6_, int[] is, int i_7_, int i_8_) {
		toolkit.method14689(this);
		OpenGL.glPixelStorei(3314, i_8_);
		OpenGL.glTexSubImage2Di(target, 0, internalFormat, width, height, i_6_, 32993, toolkit.anInt10993, is, i_7_);
		OpenGL.glPixelStorei(3314, 0);
	}

	@Override
	public float method184() {
		return heightScale;
	}

	@Override
	public void method185(int i, int i_25_, int i_26_, int i_27_, int[] is, int[] is_28_, int i_29_) {
		int[] is_30_ = is_28_ == null ? new int[width * height] : is_28_;
		toolkit.method14689(this);
		OpenGL.glGetTexImagei(target, 0, 32993, 5121, is_30_, 0);
		for (int i_31_ = 0; i_31_ < i_27_; i_31_++) {
			System.arraycopy(is_30_, i_31_ * width, is, i_29_ + i_31_ * i_26_, i_26_);
		}
	}

	@Override
	public float method187() {
		return widthScale;
	}

	@Override
	public float method191(float f) {
		return f / width;
	}

	@Override
	public void setRepeating(boolean bool, boolean bool_3_) {
		toolkit.method14689(this);
		OpenGL.glTexParameteri(target, 10242, bool ? 10497 : 33071);
		OpenGL.glTexParameteri(target, 10243, bool_3_ ? 10497 : 33071);
	}

	@Override
	public boolean generateMipmaps() {
		return super.generateMipmaps();
	}

	@Override
	public void method213(int i, int i_9_, int i_10_, int i_11_, byte[] is, Class121 class121, int i_12_, int i_13_) {
		toolkit.method14689(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, i_13_);
		OpenGL.glTexSubImage2Dub(target, 0, i, i_9_, i_10_, i_11_, OpenGlXToolkit.method17363(class121), 5121, is,
				i_12_);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@Override
	public void method218(int i, int i_14_, int i_15_, int i_16_, int[] is, int i_17_) {
		method185(i, i_14_, i_15_, i_16_, is, null, i_17_);
	}

	@Override
	public void method221(int i, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_) {
		toolkit.method14689(this);
		Display class146 = toolkit.method2628();
		if (class146 != null) {
			int i_23_ = class146.getHeight() - (i_22_ + i_20_);
			int i_24_ = OpenGlXToolkit.method17357(aClass121_5266, aClass151_5267);
			OpenGL.glCopyTexImage2D(target, 0, i_24_, i_21_, i_23_, i_19_, i_20_, 0);
		}
	}

	@Override
	public void method296(Class318 class318) {
		super.method296(class318);
	}

	@Override
	public void method301() {
		super.method301();
	}

	@Override
	public Interface16 method305(int i) {
		return new OpenGlXAttachable2DTexture(this, i);
	}

	@Override
	public int getHeight() {
		return height;
	}

	@Override
	public void deleteImmediately() {
		super.deleteImmediately();
	}

}