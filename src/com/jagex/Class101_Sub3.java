package com.jagex;

import jaggl.OpenGL;

public class Class101_Sub3 extends Class101 {
	static final char aChar8598 = '\001';
	static final char aChar8600 = '\0';
	static float[] aFloatArray8601 = new float[4];
	OpenGlList list;
	Class107 aClass107_8599;

	Class101_Sub3(OpenGlToolkit toolkit, Class107 class107) {
		super(toolkit);
		aClass107_8599 = class107;
		list = new OpenGlList(toolkit, 2);
		list.create(0);
		toolkit.method14326(1);

		if (aClass107_8599.aBool1361) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}

		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		toolkit.method14326(0);
		list.end();
		list.create(1);
		toolkit.method14326(1);
		if (aClass107_8599.aBool1361) {
			OpenGL.glDisable(3170);
		}

		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		toolkit.method14326(0);
		list.end();
	}

	@Override
	boolean method1811() {
		return true;
	}

	@Override
	void method1812(boolean bool) {
		list.call('\0');
		if (aClass107_8599.aBool1361) {
			toolkit.method14326(1);
			toolkit.setActiveTexture(aClass107_8599.aClass102_Sub2_1360);
			toolkit.method14326(0);
		}
	}

	@Override
	void method1814() {
		list.call('\001');
		toolkit.method14326(1);
		toolkit.setActiveTexture(null);
		toolkit.method14326(0);
	}

	@Override
	void method1815(int i, int i_0_) {
		float f = -5.0E-4F * ((i & 0x3) + 1);
		float f_1_ = 5.0E-4F * ((i >> 3 & 0x3) + 1);
		float f_2_ = (i & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		boolean bool = (i & 0x80) != 0;
		toolkit.method14326(1);

		if (bool) {
			aFloatArray8601[0] = f_2_;
			aFloatArray8601[1] = 0.0F;
			aFloatArray8601[2] = 0.0F;
			aFloatArray8601[3] = 0.0F;
		} else {
			aFloatArray8601[0] = 0.0F;
			aFloatArray8601[1] = 0.0F;
			aFloatArray8601[2] = f_2_;
			aFloatArray8601[3] = 0.0F;
		}

		OpenGL.glTexGenfv(8192, 9474, aFloatArray8601, 0);
		aFloatArray8601[0] = 0.0F;
		aFloatArray8601[1] = f_2_;
		aFloatArray8601[2] = 0.0F;
		aFloatArray8601[3] = toolkit.anInt8966 * f % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, aFloatArray8601, 0);

		if (!aClass107_8599.aBool1361) {
			int i_3_ = (int) (f_1_ * toolkit.anInt8966 * 16.0F);
			toolkit.setActiveTexture(aClass107_8599.aClass102_Sub1Array1356[i_3_ % 16]);
		} else {
			aFloatArray8601[0] = 0.0F;
			aFloatArray8601[1] = 0.0F;
			aFloatArray8601[2] = 0.0F;
			aFloatArray8601[3] = toolkit.anInt8966 * f_1_ % 1.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray8601, 0);
		}

		toolkit.method14326(0);
	}

	@Override
	void activate(OpenGlTexture texture, int i) {
		toolkit.setActiveTexture(texture);
		toolkit.setColourOp(i);
	}

	@Override
	void method1828(boolean bool) {

	}

}