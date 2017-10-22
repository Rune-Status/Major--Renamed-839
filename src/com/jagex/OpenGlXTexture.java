package com.jagex;

import jaggl.OpenGL;

public abstract class OpenGlXTexture implements NativeTexture {
	static final int anInt5259 = 32879;
	static final int anInt5260 =OpenGL.GL_TEXTURE_2D;
	static final int anInt5265 = 0;
	static final int anInt5270 = 34067;
	static int[] parameters = new int[1];
	Class121 aClass121_5266;
	Class151 aClass151_5267;
	Class318 aClass318_5269 = Class318.aClass318_3394;
	int anInt5268;
	boolean mipmapped;
	int target;
	int texture;
	OpenGlXToolkit toolkit;

	OpenGlXTexture(OpenGlXToolkit toolkit, int target, Class121 class121, Class151 class151, int pixels,
			boolean mipmapped) {
		this.toolkit = toolkit;
		this.target = target;
		aClass121_5266 = class121;
		aClass151_5267 = class151;
		this.mipmapped = mipmapped;
		anInt5268 = pixels;

		OpenGL.glGenTextures(1, parameters, 0);
		texture = parameters[0];
		update();
		reallocate(0);
	}

	@Override
	public void deleteImmediately() {
		if (texture != 0) {
			toolkit.allocatedTextureSize -= getSize();
			int[] parameters = new int[1];
			parameters[0] = texture;

			OpenGL.glDeleteTextures(1, parameters, 0);
			texture = 0;
		}
	}

	@Override
	public void finalize() throws Throwable {
		if (texture != 0) {
			toolkit.deleteTexture(texture, getSize());
			texture = 0;
		}

		super.finalize();
	}

	int getSize() {
		int size = aClass121_5266.size * 115153045 * aClass151_5267.size * -172886387 * anInt5268;
		return mipmapped ? size * 4 / 3 : size;
	}

	boolean generateMipmaps() {
		if (texture == 0) {
			throw new IllegalStateException("");
		}

		int size = getSize();
		toolkit.method14689(this);
		if (toolkit.aBool10970) {
			OpenGL.glEnable(target);
		}

		OpenGL.glGenerateMipmapEXT(target);
		if (toolkit.aBool10970) {
			OpenGL.glDisable(target);
		}

		mipmapped = true;
		update();
		reallocate(size);
		return true;
	}

	@Override
	public void method296(Class318 class318) {
		if (aClass318_5269 != class318) {
			aClass318_5269 = class318;
			update();
		}
	}

	@Override
	public void method301() {
		if (texture == 0) {
			throw new IllegalStateException("");
		}
		int i = toolkit.method14665();
		int i_58_ = toolkit.anIntArray10969[i];

		if (i_58_ != target) {
			if (i_58_ != 0) {
				OpenGL.glBindTexture(i_58_, 0);
				OpenGL.glDisable(i_58_);
			}

			OpenGL.glEnable(target);
			toolkit.anIntArray10969[i] = target;
		}

		OpenGL.glBindTexture(target, texture);
	}

	void method7859(int target, int width, int height, int[] data) {
		if (texture == 0) {
			throw new IllegalStateException("");
		} else if (width > 0 && !Class577.isPowerOf2(width)) {
			throw new IllegalArgumentException("");
		} else if (height > 0 && !Class577.isPowerOf2(height)) {
			throw new IllegalArgumentException("");
		} else if (aClass121_5266 != Class121.aClass121_1465) {
			throw new IllegalArgumentException("");
		}

		int mipmapLevel = 0;
		int i_3_ = width < height ? width : height;
		int i_4_ = width >> 1;
		int i_5_ = height >> 1;
		int[] is_7_ = new int[i_4_ * i_5_];

		final int GL_BGRA_EXT = 0x80E1;
		for (;;) {
			OpenGL.glTexImage2Di(target, mipmapLevel, OpenGlXToolkit.method17357(aClass121_5266, aClass151_5267),
					width, height, 0, GL_BGRA_EXT, toolkit.anInt10993, data, 0);
			if (i_3_ <= 1) {
				break;
			}

			int i_8_ = 0;
			int i_9_ = 0;
			int i_10_ = i_9_ + width;

			for (int i_11_ = 0; i_11_ < i_5_; i_11_++) {
				for (int i_12_ = 0; i_12_ < i_4_; i_12_++) {
					int i_13_ = data[i_9_++];
					int i_14_ = data[i_9_++];
					int i_15_ = data[i_10_++];
					int i_16_ = data[i_10_++];
					int i_17_ = i_13_ >> 24 & 0xff;
					int i_18_ = i_13_ >> 16 & 0xff;
					int i_19_ = i_13_ >> 8 & 0xff;
					int i_20_ = i_13_ & 0xff;

					i_17_ += i_14_ >> 24 & 0xff;
					i_18_ += i_14_ >> 16 & 0xff;
					i_19_ += i_14_ >> 8 & 0xff;
					i_20_ += i_14_ & 0xff;
					i_17_ += i_15_ >> 24 & 0xff;
					i_18_ += i_15_ >> 16 & 0xff;
					i_19_ += i_15_ >> 8 & 0xff;
					i_20_ += i_15_ & 0xff;
					i_17_ += i_16_ >> 24 & 0xff;
					i_18_ += i_16_ >> 16 & 0xff;
					i_19_ += i_16_ >> 8 & 0xff;
					i_20_ += i_16_ & 0xff;

					is_7_[i_8_++] = (i_17_ & 0x3fc) << 22 | (i_18_ & 0x3fc) << 14 | (i_19_ & 0x3fc) << 6
							| (i_20_ & 0x3fc) >> 2;
				}

				i_9_ += width;
				i_10_ += width;
			}

			int[] is_21_ = is_7_;
			is_7_ = data;
			data = is_21_;
			width = i_4_;
			height = i_5_;
			i_4_ >>= 1;
			i_5_ >>= 1;
			i_3_ >>= 1;
			mipmapLevel++;
		}
	}

	void method7860(int i, int i_22_, int i_23_, byte[] is) {
		if (texture == 0) {
			throw new IllegalStateException("");
		} else if (i_22_ > 0 && !Class577.isPowerOf2(i_22_)) {
			throw new IllegalArgumentException("");
		} else if (i_23_ > 0 && !Class577.isPowerOf2(i_23_)) {
			throw new IllegalArgumentException("");
		}

		int i_24_ = aClass121_5266.size * 115153045;
		int i_25_ = 0;
		int i_26_ = i_22_ < i_23_ ? i_22_ : i_23_;
		int i_27_ = i_22_ >> 1;
		int i_28_ = i_23_ >> 1;
		byte[] is_29_ = is;
		byte[] is_30_ = new byte[i_27_ * i_28_ * i_24_];

		for (;;) {
			OpenGL.glTexImage2Dub(i, i_25_, OpenGlXToolkit.method17357(aClass121_5266, aClass151_5267), i_22_, i_23_,
					0, OpenGlXToolkit.method17363(aClass121_5266), 5121, is_29_, 0);
			if (i_26_ <= 1) {
				break;
			}

			int i_31_ = i_22_ * i_24_;
			for (int i_32_ = 0; i_32_ < i_24_; i_32_++) {
				int i_33_ = i_32_;
				int i_34_ = i_32_;
				int i_35_ = i_34_ + i_31_;

				for (int i_36_ = 0; i_36_ < i_28_; i_36_++) {
					for (int i_37_ = 0; i_37_ < i_27_; i_37_++) {
						int i_38_ = is_29_[i_34_];
						i_34_ += i_24_;
						i_38_ += is_29_[i_34_];
						i_34_ += i_24_;
						i_38_ += is_29_[i_35_];
						i_35_ += i_24_;
						i_38_ += is_29_[i_35_];
						i_35_ += i_24_;
						is_30_[i_33_] = (byte) (i_38_ >> 2);
						i_33_ += i_24_;
					}

					i_34_ += i_31_;
					i_35_ += i_31_;
				}
			}

			byte[] is_39_ = is_30_;
			is_30_ = is_29_;
			is_29_ = is_39_;
			i_22_ = i_27_;
			i_23_ = i_28_;
			i_27_ >>= 1;
			i_28_ >>= 1;
			i_26_ >>= 1;
			i_25_++;
		}
	}

	void method7861(int i, int i_41_, int i_42_, float[] fs) {
		if (texture == 0) {
			throw new IllegalStateException("");
		} else if (i_41_ > 0 && !Class577.isPowerOf2(i_41_)) {
			throw new IllegalArgumentException("");
		} else if (i_42_ > 0 && !Class577.isPowerOf2(i_42_)) {
			throw new IllegalArgumentException("");
		}

		int i_43_ = aClass121_5266.size * 115153045;
		int i_44_ = 0;
		int i_45_ = i_41_ < i_42_ ? i_41_ : i_42_;
		int i_46_ = i_41_ >> 1;
		int i_47_ = i_42_ >> 1;

		float[] fs_48_ = fs;
		float[] fs_49_ = new float[i_46_ * i_47_ * i_43_];

		for (;;) {
			OpenGL.glTexImage2Df(i, i_44_, OpenGlXToolkit.method17357(aClass121_5266, aClass151_5267), i_41_, i_42_, 0,
					OpenGlXToolkit.method17363(aClass121_5266), 5126, fs_48_, 0);
			if (i_45_ <= 1) {
				break;
			}

			int i_50_ = i_41_ * i_43_;
			for (int i_51_ = 0; i_51_ < i_43_; i_51_++) {
				int i_52_ = i_51_;
				int i_53_ = i_51_;
				int i_54_ = i_53_ + i_50_;

				for (int i_55_ = 0; i_55_ < i_47_; i_55_++) {
					for (int i_56_ = 0; i_56_ < i_46_; i_56_++) {
						float f = fs_48_[i_53_];
						i_53_ += i_43_;
						f += fs_48_[i_53_];
						i_53_ += i_43_;
						f += fs_48_[i_54_];
						i_54_ += i_43_;
						f += fs_48_[i_54_];
						i_54_ += i_43_;
						fs_49_[i_52_] = f * 0.25F;
						i_52_ += i_43_;
					}

					i_53_ += i_50_;
					i_54_ += i_50_;
				}
			}

			float[] fs_57_ = fs_49_;
			fs_49_ = fs_48_;
			fs_48_ = fs_57_;
			i_41_ = i_46_;
			i_42_ = i_47_;
			i_46_ >>= 1;
			i_47_ >>= 1;
			i_45_ >>= 1;
			i_44_++;
		}
	}

	void reallocate(int oldSize) {
		toolkit.allocatedTextureSize -= oldSize;
		toolkit.allocatedTextureSize += getSize();
	}

	void update() {
		if (texture == 0) {
			throw new IllegalStateException("");
		}

		toolkit.method14689(this);
		if (aClass318_5269 == Class318.aClass318_3394) {
			OpenGL.glTexParameteri(target, 10241, mipmapped ? 9987 : 9729);
			OpenGL.glTexParameteri(target, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(target, 10241, mipmapped ? 9984 : 9728);
			OpenGL.glTexParameteri(target, 10240, 9728);
		}
	}

}