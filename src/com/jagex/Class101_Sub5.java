package com.jagex;

import jaggl.OpenGL;

public class Class101_Sub5 extends Class101 {
	static final int anInt8603 = 24;
	static final int anInt8604 = 128;
	static final int anInt8605 = 128;
	static final char aChar8606 = '\001';
	static final int anInt8607 = 5;
	static final float aFloat8608 = -12.0F;
	static final float aFloat8609 = 0.0F;
	static final char aChar8610 = '\0';
	static final float aFloat8614 = 26.0F;

	OpenGlCubeMapTexture[] textures;
	OpenGlList list;
	boolean aBool8613;
	boolean aBool8615 = false;

	Class101_Sub5(OpenGlToolkit toolkit) {
		super(toolkit);

		if (toolkit.aBool9124) {
			byte[][] is = new byte[6][16384];
			byte[][] is_0_ = new byte[6][16384];
			byte[][] is_1_ = new byte[6][16384];
			int i = 0;

			Class397 class397 = new Class397(0.0F, -1.0F, 0.0F);
			for (int i_2_ = 0; i_2_ < 128; i_2_++) {
				for (int i_3_ = 0; i_3_ < 128; i_3_++) {
					float f = 2.0F * i_3_ / 128.0F - 1.0F;
					float f_4_ = 2.0F * i_2_ / 128.0F - 1.0F;
					float f_5_ = (float) (1.0 / Math.sqrt(f * f + 1.0F + f_4_ * f_4_));

					f *= f_5_;
					f_4_ *= f_5_;

					for (int i_6_ = 0; i_6_ < 6; i_6_++) {
						Class397 class397_7_;
						if (i_6_ == 0) {
							class397_7_ = new Class397(-f_5_, -f, f_4_);
						} else if (i_6_ == 1) {
							class397_7_ = new Class397(f_5_, f, f_4_);
						} else if (i_6_ == 2) {
							class397_7_ = new Class397(-f, f_4_, -f_5_);
						} else if (i_6_ == 3) {
							class397_7_ = new Class397(-f, -f_4_, f_5_);
						} else if (i_6_ == 4) {
							class397_7_ = new Class397(f, f_5_, -f_4_);
						} else {
							class397_7_ = new Class397(f, -f_5_, f_4_);
						}

						float f_8_ = class397_7_.method6488(class397);
						f_8_ = Math.max(0.0F, Math.min(1.0F, f_8_));
						int i_9_;
						int i_10_;
						int i_11_;

						if (f_8_ > 0.0F) {
							i_11_ = Math.min(255, (int) (Math.pow(f_8_, 128.0) * 400.0));
							i_10_ = Math.min(255, (int) (Math.pow(f_8_, 24.0) * 400.0));
							i_9_ = Math.min(255, (int) (Math.pow(f_8_, 5.0) * 400.0));
						} else {
							i_9_ = 0;
							i_10_ = 0;
							i_11_ = 0;
						}

						is_0_[i_6_][i] = (byte) i_11_;
						is_1_[i_6_][i] = (byte) i_10_;
						is[i_6_][i] = (byte) i_9_;
					}
					i++;
				}
			}

			textures = new OpenGlCubeMapTexture[3];
			textures[0] = new OpenGlCubeMapTexture(toolkit, Class121.aClass121_1460, Class151.aClass151_2, 128, false,
					is_0_, Class121.aClass121_1460);
			textures[1] = new OpenGlCubeMapTexture(toolkit, Class121.aClass121_1460, Class151.aClass151_2, 128, false,
					is_1_, Class121.aClass121_1460);
			textures[2] = new OpenGlCubeMapTexture(toolkit, Class121.aClass121_1460, Class151.aClass151_2, 128, false,
					is, Class121.aClass121_1460);
			method14007();
		}
	}

	void method14007() {
		list = new OpenGlList(toolkit, 2);
		list.create(0);
		toolkit.method14326(1);

		OpenGL.glTexGeni(8192, 9472, 34065);
		OpenGL.glTexGeni(8193, 9472, 34065);
		OpenGL.glTexGeni(8194, 9472, 34065);

		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glEnable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();

		OpenGL.glRotatef(26.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glRotatef(-12.0F, 0.0F, 1.0F, 0.0F);
		OpenGL.glRotatef(0.0F, 0.0F, 0.0F, 1.0F);
		OpenGL.glMatrixMode(5888);

		if (!aBool8613) {
			toolkit.setTextureParameters(7681, 8448);
			toolkit.method14376(0, 34168, 768);
			toolkit.method14326(2);

			toolkit.setTextureParameters(260, 7681);
			toolkit.method14376(0, 34168, 768);
			toolkit.method14376(1, 34168, 770);
			toolkit.method14283(0, 34167, 770);
		} else {
			toolkit.setTextureParameters(260, 7681);
			toolkit.method14376(0, 5890, 770);
			toolkit.method14283(0, 34167, 770);
		}

		toolkit.method14326(0);
		list.end();
		list.create(1);
		toolkit.method14326(1);

		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);

		if (!aBool8613) {
			toolkit.setTextureParameters(8448, 8448);
			toolkit.method14376(0, 5890, 768);
			toolkit.method14326(2);

			toolkit.setTextureParameters(8448, 8448);
			toolkit.method14376(0, 5890, 768);
			toolkit.method14376(1, 34168, 768);
			toolkit.method14283(0, 5890, 770);
		} else {
			toolkit.setTextureParameters(8448, 8448);
			toolkit.method14376(0, 5890, 768);
			toolkit.method14283(0, 5890, 770);
		}

		toolkit.method14326(0);
		list.end();
	}

	@Override
	boolean method1811() {
		return true;
	}

	@Override
	void method1812(boolean bool) {
		if (list != null && bool) {
			if (!aBool8613) {
				toolkit.method14326(2);
				toolkit.setActiveTexture(toolkit.aClass102_Sub1_9047);
				toolkit.method14326(0);
			}

			list.call('\0');
			aBool8615 = true;
		} else {
			toolkit.method14283(0, 34168, 770);
		}
	}

	@Override
	void method1814() {
		if (aBool8615) {
			if (!aBool8613) {
				toolkit.method14326(2);
				toolkit.setActiveTexture(null);
			}

			toolkit.method14326(1);
			toolkit.setActiveTexture(null);
			toolkit.method14326(0);
			list.call('\001');
			aBool8615 = false;
		} else {
			toolkit.method14283(0, 5890, 770);
		}

		toolkit.setTextureParameters(8448, 8448);
	}

	@Override
	void method1815(int index, int i_12_) {
		if (aBool8615) {
			toolkit.method14326(1);
			toolkit.setActiveTexture(textures[index - 1]);
			toolkit.method14326(0);
		}
	}

	@Override
	void activate(OpenGlTexture texture, int i) {
		toolkit.setActiveTexture(texture);
		toolkit.setColourOp(i);
	}

	@Override
	void method1828(boolean bool) {
		toolkit.setTextureParameters(8448, 7681);
	}

}