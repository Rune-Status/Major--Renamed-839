package com.jagex;

import jaggl.OpenGL;

public abstract class OpenGlTexture {
	static final int anInt1320 = 5121;
	static final int anInt1322 = 34037;
	static final int anInt1324 = 32879;
	static int[] TEXTURE_NAMES = new int[1];
	static final int anInt1329 =OpenGL.GL_TEXTURE_2D;
	static final int anInt1331 = 3552;
	static final int anInt1334 = 34067;

	static void method1829(int i, int i_0_, int i_1_, int i_2_, Class121 class121, float[] fs) {
		if (i_1_ > 0 && !Class577.isPowerOf2(i_1_)) {
			throw new IllegalArgumentException("");
		}
		if (i_2_ > 0 && !Class577.isPowerOf2(i_2_)) {
			throw new IllegalArgumentException("");
		}
		int i_3_ = class121.size * 115153045;
		int i_4_ = 0;
		int i_5_ = i_1_ < i_2_ ? i_1_ : i_2_;
		int i_6_ = i_1_ >> 1;
		int i_7_ = i_2_ >> 1;
		float[] fs_8_ = fs;
		float[] fs_9_ = new float[i_6_ * i_7_ * i_3_];
		for (;;) {
			OpenGL.glTexImage2Df(i, i_4_, i_0_, i_1_, i_2_, 0, OpenGlToolkit.format(class121), 5126, fs_8_, 0);
			if (i_5_ <= 1) {
				break;
			}
			int i_10_ = i_1_ * i_3_;
			for (int i_11_ = 0; i_11_ < i_3_; i_11_++) {
				int i_12_ = i_11_;
				int i_13_ = i_11_;
				int i_14_ = i_13_ + i_10_;
				for (int i_15_ = 0; i_15_ < i_7_; i_15_++) {
					for (int i_16_ = 0; i_16_ < i_6_; i_16_++) {
						float f = fs_8_[i_13_];
						i_13_ += i_3_;
						f += fs_8_[i_13_];
						i_13_ += i_3_;
						f += fs_8_[i_14_];
						i_14_ += i_3_;
						f += fs_8_[i_14_];
						i_14_ += i_3_;
						fs_9_[i_12_] = f * 0.25F;
						i_12_ += i_3_;
					}
					i_13_ += i_10_;
					i_14_ += i_10_;
				}
			}
			float[] fs_17_ = fs_9_;
			fs_9_ = fs_8_;
			fs_8_ = fs_17_;
			i_1_ = i_6_;
			i_2_ = i_7_;
			i_6_ >>= 1;
			i_7_ >>= 1;
			i_5_ >>= 1;
			i_4_++;
		}
	}

	static void method1837(int i, int i_19_, int i_20_, int i_21_, Class121 class121, byte[] is) {
		if (i_20_ > 0 && !Class577.isPowerOf2(i_20_)) {
			throw new IllegalArgumentException("");
		}
		if (i_21_ > 0 && !Class577.isPowerOf2(i_21_)) {
			throw new IllegalArgumentException("");
		}
		int i_22_ = class121.size * 115153045;
		int i_23_ = 0;
		int i_24_ = i_20_ < i_21_ ? i_20_ : i_21_;
		int i_25_ = i_20_ >> 1;
		int i_26_ = i_21_ >> 1;
		byte[] is_27_ = is;
		byte[] is_28_ = new byte[i_25_ * i_26_ * i_22_];
		for (;;) {
			OpenGL.glTexImage2Dub(i, i_23_, i_19_, i_20_, i_21_, 0, OpenGlToolkit.format(class121), 5121, is_27_, 0);
			if (i_24_ <= 1) {
				break;
			}
			int i_29_ = i_20_ * i_22_;
			for (int i_30_ = 0; i_30_ < i_22_; i_30_++) {
				int i_31_ = i_30_;
				int i_32_ = i_30_;
				int i_33_ = i_32_ + i_29_;
				for (int i_34_ = 0; i_34_ < i_26_; i_34_++) {
					for (int i_35_ = 0; i_35_ < i_25_; i_35_++) {
						int i_36_ = is_27_[i_32_];
						i_32_ += i_22_;
						i_36_ += is_27_[i_32_];
						i_32_ += i_22_;
						i_36_ += is_27_[i_33_];
						i_33_ += i_22_;
						i_36_ += is_27_[i_33_];
						i_33_ += i_22_;
						is_28_[i_31_] = (byte) (i_36_ >> 2);
						i_31_ += i_22_;
					}
					i_32_ += i_29_;
					i_33_ += i_29_;
				}
			}
			byte[] is_37_ = is_28_;
			is_28_ = is_27_;
			is_27_ = is_37_;
			i_20_ = i_25_;
			i_21_ = i_26_;
			i_25_ >>= 1;
			i_26_ >>= 1;
			i_24_ >>= 1;
			i_23_++;
		}
	}

	static void method1845(int target, int internalFormat, int i_39_, int i_40_, int i_41_, int i_42_, int[] data) {
		if (i_39_ > 0 && !Class577.isPowerOf2(i_39_)) {
			throw new IllegalArgumentException("");
		} else if (i_40_ > 0 && !Class577.isPowerOf2(i_40_)) {
			throw new IllegalArgumentException("");
		} else if (i_41_ != 32993) {
			throw new IllegalArgumentException("");
		}

		int level = 0;
		int i_44_ = i_39_ < i_40_ ? i_39_ : i_40_;
		int i_45_ = i_39_ >> 1;
		int i_46_ = i_40_ >> 1;
		int[] is_47_ = data;
		int[] is_48_ = new int[i_45_ * i_46_];
		for (;;) {
			OpenGL.glTexImage2Di(target, level, internalFormat, i_39_, i_40_, 0, i_41_, i_42_, is_47_, 0);
			if (i_44_ <= 1) {
				break;
			}
			int i_49_ = 0;
			int i_50_ = 0;
			int i_51_ = i_50_ + i_39_;
			for (int i_52_ = 0; i_52_ < i_46_; i_52_++) {
				for (int i_53_ = 0; i_53_ < i_45_; i_53_++) {
					int i_54_ = is_47_[i_50_++];
					int i_55_ = is_47_[i_50_++];
					int i_56_ = is_47_[i_51_++];
					int i_57_ = is_47_[i_51_++];
					int i_58_ = i_54_ >> 24 & 0xff;
					int i_59_ = i_54_ >> 16 & 0xff;
					int i_60_ = i_54_ >> 8 & 0xff;
					int i_61_ = i_54_ & 0xff;
					i_58_ += i_55_ >> 24 & 0xff;
					i_59_ += i_55_ >> 16 & 0xff;
					i_60_ += i_55_ >> 8 & 0xff;
					i_61_ += i_55_ & 0xff;
					i_58_ += i_56_ >> 24 & 0xff;
					i_59_ += i_56_ >> 16 & 0xff;
					i_60_ += i_56_ >> 8 & 0xff;
					i_61_ += i_56_ & 0xff;
					i_58_ += i_57_ >> 24 & 0xff;
					i_59_ += i_57_ >> 16 & 0xff;
					i_60_ += i_57_ >> 8 & 0xff;
					i_61_ += i_57_ & 0xff;
					is_48_[i_49_++] = (i_58_ & 0x3fc) << 22 | (i_59_ & 0x3fc) << 14 | (i_60_ & 0x3fc) << 6
							| (i_61_ & 0x3fc) >> 2;
				}
				i_50_ += i_39_;
				i_51_ += i_39_;
			}
			int[] is_62_ = is_48_;
			is_48_ = is_47_;
			is_47_ = is_62_;
			i_39_ = i_45_;
			i_40_ = i_46_;
			i_45_ >>= 1;
			i_46_ >>= 1;
			i_44_ >>= 1;
			level++;
		}
	}

	boolean mipmapped;
	int target;
	OpenGlToolkit toolkit;
	int name;
	Class121 aClass121_1328;
	Class151 aClass151_1330;
	boolean filterLinear = false;
	int size;

	OpenGlTexture(OpenGlToolkit toolkit, int target, Class121 class121, Class151 class151, int size, boolean mipmaped) {
		this.toolkit = toolkit;
		this.target = target;
		aClass121_1328 = class121;
		aClass151_1330 = class151;
		mipmapped = mipmaped;
		this.size = size;

		OpenGL.glGenTextures(1, TEXTURE_NAMES, 0);
		name = TEXTURE_NAMES[0];
		reallocate(0);
	}

	@Override
	public void finalize() throws Throwable {
		delete();
		super.finalize();
	}

	void update() {
		toolkit.setActiveTexture(this);
		if (filterLinear) {
			OpenGL.glTexParameteri(target, 10241, mipmapped ? 9987 : 9729);
			OpenGL.glTexParameteri(target, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(target, 10241, mipmapped ? 9984 : 9728);
			OpenGL.glTexParameteri(target, 10240, 9728);
		}
	}

	void setMipmapped(boolean mipmap) {
		if (mipmapped != mipmap) {
			int size = getSize();
			mipmapped = true;
			update();
			reallocate(size);
		}
	}

	int getSize() {
		int size = aClass121_1328.size * 115153045 * aClass151_1330.size * -172886387 * this.size;
		return mipmapped ? size * 4 / 3 : size;
	}

	void filterLinear(boolean filter) {
		if (filterLinear != filter) {
			filterLinear = filter;
			update();
		}
	}

	boolean generateMipmaps() {
		if (toolkit.aBool9035) {
			int size = getSize();
			toolkit.setActiveTexture(this);
			OpenGL.glGenerateMipmapEXT(target);
			mipmapped = true;
			update();
			reallocate(size);
			return true;
		}

		return false;
	}

	void deleteImmediately() {
		if (name != 0) {
			toolkit.allocatedTextureSize -= getSize();
			int[] names = new int[1];
			names[0] = name;
			OpenGL.glDeleteTextures(1, names, 0);
			name = 0;
		}
	}

	void delete() {
		if (name != 0) {
			toolkit.deleteTexture(name, getSize());
			name = 0;
		}
	}

	void reallocate(int oldSize) {
		toolkit.allocatedTextureSize -= oldSize;
		toolkit.allocatedTextureSize += getSize();
	}

}