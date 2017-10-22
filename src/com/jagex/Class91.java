package com.jagex;

import jaggl.OpenGL;

public class Class91 {
	static final boolean method1732(byte[] is, int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		int i_4_ = i_0_ % i_3_;
		int i_5_;
		if (i_4_ != 0) {
			i_5_ = i_3_ - i_4_;
		} else {
			i_5_ = 0;
		}
		int i_6_ = -((i_1_ + i_3_ - 1) / i_3_);
		int i_7_ = -((i_0_ + i_3_ - 1) / i_3_);
		for (int i_8_ = i_6_; i_8_ < 0; i_8_++) {
			for (int i_9_ = i_7_; i_9_ < 0; i_9_++) {
				if (is[i] == 0) {
					return true;
				}
				i += i_3_;
			}
			i -= i_5_;
			if (is[i - 1] == 0) {
				return true;
			}
			i += i_2_;
		}
		return false;
	}

	static final void removeShadow(byte[] is, byte[] is_10_, int i, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_) {
		int i_16_ = -(i_12_ >> 2);
		i_12_ = -(i_12_ & 0x3);
		for (int i_17_ = -i_13_; i_17_ < 0; i_17_++) {
			for (int i_18_ = i_16_; i_18_ < 0; i_18_++) {
				is[i_11_++] += is_10_[i++];
				is[i_11_++] += is_10_[i++];
				is[i_11_++] += is_10_[i++];
				is[i_11_++] += is_10_[i++];
			}
			for (int i_19_ = i_12_; i_19_ < 0; i_19_++) {
				is[i_11_++] += is_10_[i++];
			}
			i_11_ += i_14_;
			i += i_15_;
		}
	}

	static final void copyShadow(byte[] out, byte[] source, int sourceOffset, int destOffset, int width, int height,
			int destStep, int sourceStep) {
		int minX = -(width >> 2);
		width = -(width & 0x3);

		for (int y = -height; y < 0; y++) {
			for (int x = minX; x < 0; x++) {
				out[destOffset++] -= source[sourceOffset++];
				out[destOffset++] -= source[sourceOffset++];
				out[destOffset++] -= source[sourceOffset++];
				out[destOffset++] -= source[sourceOffset++];
			}

			for (int i_40_ = width; i_40_ < 0; i_40_++) {
				out[destOffset++] -= source[sourceOffset++];
			}

			destOffset += destStep;
			sourceOffset += sourceStep;
		}
	}

	int width;
	OpenGlGround ground;
	byte[] map;
	int length;
	Class93[][] aClass93ArrayArray1261;
	int tileWidth;
	int tileLength;
	OpenGlToolkit toolkit;
	int scale;

	Class91(OpenGlToolkit toolkit, OpenGlGround ground) {
		this.toolkit = toolkit;
		this.ground = ground;

		width = 2 + (ground.width * 767658255 * ground.tileUnits * 1668096025 >> toolkit.shadowScale);
		length = 2 + (ground.length * 295124605 * ground.tileUnits * 1668096025 >> toolkit.shadowScale);
		map = new byte[width * length];
		scale = 7 + toolkit.shadowScale - ground.tileScale * -333236347;
		tileWidth = ground.width * 767658255 >> scale;
		tileLength = ground.length * 295124605 >> scale;
	}

	void add(Shadow shadow, int x, int y) {
		OpenGlShadow shad = (OpenGlShadow) shadow;
		x += shad.x + 1;
		y += shad.y + 1;
		int i_21_ = x + y * width;
		int i_22_ = 0;
		int i_23_ = shad.height;
		int i_24_ = shad.width;
		int i_25_ = width - i_24_;
		int i_26_ = 0;

		if (y <= 0) {
			int i_27_ = 1 - y;
			i_23_ -= i_27_;
			i_22_ += i_27_ * i_24_;
			i_21_ += i_27_ * width;
			y = 1;
		}

		if (y + i_23_ >= length) {
			int i_28_ = y + i_23_ + 1 - length;
			i_23_ -= i_28_;
		}

		if (x <= 0) {
			int i_29_ = 1 - x;
			i_24_ -= i_29_;
			i_22_ += i_29_;
			i_21_ += i_29_;
			i_26_ += i_29_;
			i_25_ += i_29_;
			x = 1;
		}

		if (x + i_24_ >= width) {
			int i_30_ = x + i_24_ + 1 - width;
			i_24_ -= i_30_;
			i_26_ += i_30_;
			i_25_ += i_30_;
		}

		if (i_24_ > 0 && i_23_ > 0) {
			copyShadow(map, shad.map, i_22_, i_21_, i_24_, i_23_, i_25_, i_26_);
			update(x, y, i_24_, i_23_);
		}
	}

	void update(int i, int i_41_, int i_42_, int i_43_) {
		if (aClass93ArrayArray1261 != null) {
			int i_44_ = i - 1 >> 7;
			int i_45_ = i - 1 + i_42_ - 1 >> 7;
			int i_46_ = i_41_ - 1 >> 7;
			int i_47_ = i_41_ - 1 + i_43_ - 1 >> 7;

			for (int i_48_ = i_44_; i_48_ <= i_45_; i_48_++) {
				Class93[] class93s = aClass93ArrayArray1261[i_48_];
				for (int i_49_ = i_46_; i_49_ <= i_47_; i_49_++) {
					class93s[i_49_].aBool1275 = true;
				}
			}
		}
	}

	void delete(Shadow shad, int x, int y) {
		OpenGlShadow shadow = (OpenGlShadow) shad;
		x += shadow.x + 1;
		y += shadow.y + 1;
		int i_51_ = x + y * width;
		int i_52_ = 0;

		int i_53_ = shadow.height;
		int i_54_ = shadow.width;
		int i_55_ = width - i_54_;
		int i_56_ = 0;

		if (y <= 0) {
			int i_57_ = 1 - y;
			i_53_ -= i_57_;
			i_52_ += i_57_ * i_54_;
			i_51_ += i_57_ * width;
			y = 1;
		}

		if (y + i_53_ >= length) {
			int i_58_ = y + i_53_ + 1 - length;
			i_53_ -= i_58_;
		}

		if (x <= 0) {
			int i_59_ = 1 - x;
			i_54_ -= i_59_;
			i_52_ += i_59_;
			i_51_ += i_59_;
			i_56_ += i_59_;
			i_55_ += i_59_;
			x = 1;
		}

		if (x + i_54_ >= width) {
			int i_60_ = x + i_54_ + 1 - width;
			i_54_ -= i_60_;
			i_56_ += i_60_;
			i_55_ += i_60_;
		}

		if (i_54_ > 0 && i_53_ > 0) {
			removeShadow(map, shadow.map, i_52_, i_51_, i_54_, i_53_, i_55_, i_56_);
			update(x, y, i_54_, i_53_);
		}
	}

	boolean method1744(Shadow shad, int i, int i_61_) {
		OpenGlShadow shadow = (OpenGlShadow) shad;
		i += shadow.x + 1;
		i_61_ += shadow.y + 1;

		int i_62_ = i + i_61_ * width;
		int height = shadow.height;
		int i_64_ = shadow.width;
		int i_65_ = width - i_64_;

		if (i_61_ <= 0) {
			int i_66_ = 1 - i_61_;
			height -= i_66_;
			i_62_ += i_66_ * width;
			i_61_ = 1;
		}

		if (i_61_ + height >= length) {
			int i_67_ = i_61_ + height + 1 - length;
			height -= i_67_;
		}

		if (i <= 0) {
			int i_68_ = 1 - i;
			i_64_ -= i_68_;
			i_62_ += i_68_;
			i_65_ += i_68_;
			i = 1;
		}

		if (i + i_64_ >= width) {
			int i_69_ = i + i_64_ + 1 - width;
			i_64_ -= i_69_;
			i_65_ += i_69_;
		}

		if (i_64_ <= 0 || height <= 0) {
			return false;
		}

		int i_70_ = 8;
		i_65_ += (i_70_ - 1) * width;
		return method1732(map, i_62_, i_64_, height, i_65_, i_70_);
	}

	void method1748() {
		aClass93ArrayArray1261 = new Class93[tileWidth][tileLength];
		for (int i = 0; i < tileLength; i++) {
			for (int i_71_ = 0; i_71_ < tileWidth; i_71_++) {
				aClass93ArrayArray1261[i_71_][i] = new Class93(toolkit, this, ground, i_71_, i, scale, i_71_ * 128 + 1,
						i * 128 + 1);
			}
		}
	}

	void method1750(int i, int i_72_, int i_73_, boolean[][] bools, boolean bool) {
		toolkit.method14335(false);
		toolkit.method14339(false);
		toolkit.method14497(-2);
		toolkit.setColourOp(1);
		toolkit.setBlendMode(1);

		float f = 1.0F / (toolkit.anInt9005 * 128);
		if (bool) {
			for (int i_74_ = 0; i_74_ < tileLength; i_74_++) {
				int i_75_ = i_74_ << scale;
				int i_76_ = i_74_ + 1 << scale;

				for (int i_77_ = 0; i_77_ < tileWidth; i_77_++) {
					int i_78_ = i_77_ << scale;
					int i_79_ = i_77_ + 1 << scale;

					while_16_: for (int i_80_ = i_78_; i_80_ < i_79_; i_80_++) {
						if (i_80_ - i >= -i_73_ && i_80_ - i <= i_73_) {
							for (int i_81_ = i_75_; i_81_ < i_76_; i_81_++) {
								if (i_81_ - i_72_ >= -i_73_ && i_81_ - i_72_ <= i_73_
										&& bools[i_80_ - i + i_73_][i_81_ - i_72_ + i_73_]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(f, f, 1.0F);
									OpenGL.glTranslatef(-i_77_ / f, -i_74_ / f, 1.0F);
									OpenGL.glMatrixMode(5888);

									aClass93ArrayArray1261[i_77_][i_74_].method1757();
									break while_16_;
								}
							}
						}
					}
				}
			}
		} else {
			for (int i_82_ = 0; i_82_ < tileLength; i_82_++) {
				int i_83_ = i_82_ << scale;
				int i_84_ = i_82_ + 1 << scale;

				for (int i_85_ = 0; i_85_ < tileWidth; i_85_++) {
					int i_86_ = 0;
					int i_87_ = i_85_ << scale;
					int i_88_ = i_85_ + 1 << scale;
					FloatBuffer rsfloatbuffer = toolkit.dataBuffer;
					rsfloatbuffer.offset = 0;

					for (int i_89_ = i_83_; i_89_ < i_84_; i_89_++) {
						if (i_89_ - i_72_ >= -i_73_ && i_89_ - i_72_ <= i_73_) {
							int i_90_ = i_89_ * ground.width * 767658255 + i_87_;

							for (int i_91_ = i_87_; i_91_ < i_88_; i_91_++) {
								if (i_91_ - i >= -i_73_ && i_91_ - i <= i_73_
										&& bools[i_91_ - i + i_73_][i_89_ - i_72_ + i_73_]) {
									short[] is = ground.materialIndices[i_90_];

									if (is != null) {
										if (toolkit.bigEndian) {
											for (short element : is) {
												rsfloatbuffer.writeShort(element & 0xffff);
												i_86_++;
											}
										} else {
											for (short element : is) {
												rsfloatbuffer.writeLEShort(element & 0xffff);
												i_86_++;
											}
										}
									}
								}
								i_90_++;
							}
						}
					}

					if (i_86_ > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(f, f, 1.0F);
						OpenGL.glTranslatef(-i_85_ / f, -i_82_ / f, 1.0F);
						OpenGL.glMatrixMode(5888);
						aClass93ArrayArray1261[i_85_][i_82_].method1758(rsfloatbuffer.payload, i_86_);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

}