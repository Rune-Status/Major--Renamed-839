package com.jagex;

import jaggl.OpenGL;

public class Class101_Sub7 extends Class101 {
	static float[] aFloatArray8632 = { 0.0F, 0.0F, 0.0F, 0.0F };
	static final char aChar8635 = '\0';
	static final char aChar8637 = '\001';
	Class107 aClass107_8633;
	OpenGlList aClass104_8634;
	OpenGl1DTexture aClass102_Sub4_8636;

	Class101_Sub7(OpenGlToolkit class134_sub2, Class107 class107) {
		super(class134_sub2);
		aClass107_8633 = class107;
		method14017();
		aClass102_Sub4_8636 = new OpenGl1DTexture(toolkit, Class121.aClass121_1460, Class151.aClass151_2, 2,
				new byte[] { 0, -1 }, Class121.aClass121_1460);
		aClass102_Sub4_8636.setRepeating(false);
	}

	void method14017() {
		aClass104_8634 = new OpenGlList(toolkit, 2);
		aClass104_8634.create(0);
		toolkit.method14326(1);
		toolkit.setTextureParameters(7681, 260);
		toolkit.method14376(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		toolkit.method14326(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (aClass107_8633.aBool1361) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		aClass104_8634.end();
		aClass104_8634.create(1);
		toolkit.method14326(1);
		toolkit.setTextureParameters(8448, 8448);
		toolkit.method14376(0, 5890, 768);
		OpenGL.glDisable(3168);
		toolkit.method14326(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (aClass107_8633.aBool1361) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		aClass104_8634.end();
	}

	@Override
	boolean method1811() {
		return true;
	}

	@Override
	void method1812(boolean bool) {
		if (toolkit.anInt9073 > 0) {
			float f = -0.5F / toolkit.anInt9073;
			toolkit.method14326(1);
			aFloatArray8632[0] = 0.0F;
			aFloatArray8632[1] = 0.0F;
			aFloatArray8632[2] = f;
			aFloatArray8632[3] = toolkit.aFloat9088 * f + 0.25F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, aFloatArray8632, 0);
			OpenGL.glPopMatrix();
			toolkit.method14378(0.5F, toolkit.anInt9073);
			toolkit.setActiveTexture(aClass102_Sub4_8636);
			toolkit.method14326(0);
		}
		aClass104_8634.call('\0');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@Override
	void method1814() {
		aClass104_8634.call('\001');
		if (toolkit.anInt9073 > 0) {
			toolkit.method14326(1);
			toolkit.setActiveTexture(null);
			toolkit.method14378(1.0F, 0.0F);
			toolkit.method14326(0);
		}
		toolkit.setTextureParameters(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@Override
	void method1815(int i, int i_0_) {
		if ((i & 0x1) == 1) {
			if (aClass107_8633.aBool1361) {
				toolkit.setActiveTexture(aClass107_8633.aClass102_Sub2_1358);
				aFloatArray8632[0] = 0.0F;
				aFloatArray8632[1] = 0.0F;
				aFloatArray8632[2] = 0.0F;
				aFloatArray8632[3] = toolkit.anInt8966 % 4000 / 4000.0F;
				OpenGL.glTexGenfv(8194, 9473, aFloatArray8632, 0);
			} else {
				int i_1_ = toolkit.anInt8966 % 4000 * 16 / 4000;
				toolkit.setActiveTexture(aClass107_8633.aClass102_Sub1Array1357[i_1_]);
			}
		} else if (aClass107_8633.aBool1361) {
			toolkit.setActiveTexture(aClass107_8633.aClass102_Sub2_1358);
			aFloatArray8632[0] = 0.0F;
			aFloatArray8632[1] = 0.0F;
			aFloatArray8632[2] = 0.0F;
			aFloatArray8632[3] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray8632, 0);
		} else {
			toolkit.setActiveTexture(aClass107_8633.aClass102_Sub1Array1357[0]);
		}
	}

	@Override
	void activate(OpenGlTexture texture, int i) {

	}

	@Override
	void method1828(boolean bool) {
		toolkit.setTextureParameters(260, 8448);
	}
}
