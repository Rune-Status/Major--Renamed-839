package com.jagex;

import jaggl.OpenGL;

public class Class101_Sub8 extends Class101 {
	static final char aChar8639 = '\001';
	static final char aChar8641 = '\0';
	boolean aBool8638 = false;
	OpenGlList aClass104_8640;

	Class101_Sub8(OpenGlToolkit class134_sub2) {
		super(class134_sub2);
		if (class134_sub2.aBool9124) {
			aClass104_8640 = new OpenGlList(class134_sub2, 2);
			aClass104_8640.create(0);
			toolkit.method14326(1);
			toolkit.setTextureParameters(34165, 7681);
			toolkit.method14376(2, 34168, 770);
			toolkit.method14283(0, 34167, 770);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			toolkit.method14326(0);
			aClass104_8640.end();
			aClass104_8640.create(1);
			toolkit.method14326(1);
			toolkit.setTextureParameters(8448, 8448);
			toolkit.method14376(2, 34166, 770);
			toolkit.method14283(0, 5890, 770);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			toolkit.method14326(0);
			aClass104_8640.end();
		}
	}

	@Override
	boolean method1811() {
		return true;
	}

	@Override
	void method1812(boolean bool) {
		OpenGlCubeMapTexture class102_sub3 = toolkit.method14292();
		if (aClass104_8640 != null && class102_sub3 != null && bool) {
			aClass104_8640.call('\0');
			toolkit.method14326(1);
			toolkit.setActiveTexture(class102_sub3);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadMatrixf(toolkit.aClass399_9092.method6571(toolkit.aFloatArray9052), 0);
			OpenGL.glScalef(1.0F, -1.0F, -1.0F);
			OpenGL.glMatrixMode(5888);
			toolkit.method14326(0);
			aBool8638 = true;
		} else {
			toolkit.method14283(0, 34168, 770);
		}
	}

	@Override
	void method1814() {
		if (aBool8638) {
			aClass104_8640.call('\001');
			toolkit.method14326(1);
			toolkit.setActiveTexture(null);
			toolkit.method14326(0);
		} else {
			toolkit.method14283(0, 5890, 770);
		}
		toolkit.setTextureParameters(8448, 8448);
		aBool8638 = false;
	}

	@Override
	void method1815(int i, int i_0_) {

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
