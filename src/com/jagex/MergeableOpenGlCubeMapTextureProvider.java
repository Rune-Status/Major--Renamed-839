package com.jagex;

import jaggl.OpenGL;

public class MergeableOpenGlCubeMapTextureProvider extends OpenGlCubeMapTextureProvider { // TODO bad name
	static int[] anIntArray11108 = new int[4];
	static int[] anIntArray11109 = new int[4];
	OpenGlToolkit toolkit;
	OpenGlCubeMapTexture texture;

	MergeableOpenGlCubeMapTextureProvider(OpenGlToolkit toolkit, int length) {
		this.toolkit = toolkit;
		this.texture = new OpenGlCubeMapTexture(toolkit, Class121.aClass121_1465, Class151.aClass151_2, length);
	}

	@Override
	OpenGlCubeMapTexture getTexture() {
		return texture;
	}

	int getLength() {
		return texture.length;
	}

	boolean method17493(OpenGlCubeMapTexture class102_sub3, OpenGlCubeMapTexture class102_sub3_0_, float f) {
		boolean bool = true;
		OpenGlDirectDisplay class146_sub2_sub1 = toolkit.aClass146_Sub2_Sub1_9049;
		toolkit.method2425(anIntArray11108);
		toolkit.method2421();
		toolkit.method2395(anIntArray11109);

		toolkit.method14307();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glViewport(0, 0, texture.length, texture.length);

		toolkit.method14334(false);
		toolkit.method14335(false);
		toolkit.method14338(false);
		toolkit.method14339(false);

		toolkit.method14497(-2);
		toolkit.method14326(1);
		toolkit.setTexEnvColour(0.0F, 0.0F, 0.0F, f);
		toolkit.setTextureParameters(34165, 34165);

		toolkit.setActiveTexture(class102_sub3_0_);
		toolkit.method14326(0);
		toolkit.setColourOp(1);

		toolkit.setActiveTexture(class102_sub3);
		toolkit.method2397(class146_sub2_sub1);

		for (int i = 0; i < 6; i++) {
			int i_1_ = 34069 + i;
			class146_sub2_sub1.method14256(0, texture.method13959(i_1_, 0));
			class146_sub2_sub1.method17475(0);

			if (class146_sub2_sub1.isComplete()) {
				OpenGL.glBegin(7);

				switch (i_1_) {
					case 34070:
						OpenGL.glTexCoord3i(-65535, 65534, -65534);
						OpenGL.glMultiTexCoord3i(33985, -65535, 65534, -65534);
						OpenGL.glVertex2f(0.0F, 0.0F);
						OpenGL.glTexCoord3i(-65535, 65534, 65534);
						OpenGL.glMultiTexCoord3i(33985, -65535, 65534, 65534);
						OpenGL.glVertex2f(1.0F, 0.0F);
						OpenGL.glTexCoord3i(-65535, -65534, 65534);
						OpenGL.glMultiTexCoord3i(33985, -65535, -65534, 65534);
						OpenGL.glVertex2f(1.0F, 1.0F);
						OpenGL.glTexCoord3i(-65535, -65534, -65534);
						OpenGL.glMultiTexCoord3i(33985, -65535, -65534, -65534);
						OpenGL.glVertex2f(0.0F, 1.0F);
						break;
					case 34069:
						OpenGL.glTexCoord3i(65535, 65534, 65534);
						OpenGL.glMultiTexCoord3i(33985, 65535, 65534, 65534);
						OpenGL.glVertex2f(0.0F, 0.0F);
						OpenGL.glTexCoord3i(65535, 65534, -65534);
						OpenGL.glMultiTexCoord3i(33985, 65535, 65534, -65534);
						OpenGL.glVertex2f(1.0F, 0.0F);
						OpenGL.glTexCoord3i(65535, -65534, -65534);
						OpenGL.glMultiTexCoord3i(33985, 65535, -65534, -65534);
						OpenGL.glVertex2f(1.0F, 1.0F);
						OpenGL.glTexCoord3i(65535, -65534, 65534);
						OpenGL.glMultiTexCoord3i(33985, 65535, -65534, 65534);
						OpenGL.glVertex2f(0.0F, 1.0F);
						break;
					case 34071:
						OpenGL.glTexCoord3i(-65534, 65535, -65534);
						OpenGL.glMultiTexCoord3i(33985, -65534, 65535, -65534);
						OpenGL.glVertex2f(0.0F, 0.0F);
						OpenGL.glTexCoord3i(65534, 65535, -65534);
						OpenGL.glMultiTexCoord3i(33985, 65534, 65535, -65534);
						OpenGL.glVertex2f(1.0F, 0.0F);
						OpenGL.glTexCoord3i(65534, 65535, 65534);
						OpenGL.glMultiTexCoord3i(33985, 65534, 65535, 65534);
						OpenGL.glVertex2f(1.0F, 1.0F);
						OpenGL.glTexCoord3i(-65534, 65535, 65534);
						OpenGL.glMultiTexCoord3i(33985, -65534, 65535, 65534);
						OpenGL.glVertex2f(0.0F, 1.0F);
						break;
					case 34072:
						OpenGL.glTexCoord3i(-65534, -65535, 65534);
						OpenGL.glMultiTexCoord3i(33985, -65534, -65535, 65534);
						OpenGL.glVertex2f(0.0F, 0.0F);
						OpenGL.glTexCoord3i(65534, -65535, 65534);
						OpenGL.glMultiTexCoord3i(33985, 65534, -65535, 65534);
						OpenGL.glVertex2f(1.0F, 0.0F);
						OpenGL.glTexCoord3i(65534, -65535, -65534);
						OpenGL.glMultiTexCoord3i(33985, 65534, -65535, -65534);
						OpenGL.glVertex2f(1.0F, 1.0F);
						OpenGL.glTexCoord3i(-65534, -65535, -65534);
						OpenGL.glMultiTexCoord3i(33985, -65534, -65535, -65534);
						OpenGL.glVertex2f(0.0F, 1.0F);
						break;
					case 34074:
						OpenGL.glTexCoord3i(65534, 65534, -65535);
						OpenGL.glMultiTexCoord3i(33985, 65534, 65534, -65535);
						OpenGL.glVertex2f(0.0F, 0.0F);
						OpenGL.glTexCoord3i(-65534, 65534, -65535);
						OpenGL.glMultiTexCoord3i(33985, -65534, 65534, -65535);
						OpenGL.glVertex2f(1.0F, 0.0F);
						OpenGL.glTexCoord3i(-65534, -65534, -65535);
						OpenGL.glMultiTexCoord3i(33985, -65534, -65534, -65535);
						OpenGL.glVertex2f(1.0F, 1.0F);
						OpenGL.glTexCoord3i(65534, -65534, -65535);
						OpenGL.glMultiTexCoord3i(33985, 65534, -65534, -65535);
						OpenGL.glVertex2f(0.0F, 1.0F);
						break;
					case 34073:
						OpenGL.glTexCoord3i(-65534, 65534, 65535);
						OpenGL.glMultiTexCoord3i(33985, -65534, 65534, 65535);
						OpenGL.glVertex2f(0.0F, 0.0F);
						OpenGL.glTexCoord3i(65534, 65534, 65535);
						OpenGL.glMultiTexCoord3i(33985, 65534, 65534, 65535);
						OpenGL.glVertex2f(1.0F, 0.0F);
						OpenGL.glTexCoord3i(65534, -65534, 65535);
						OpenGL.glMultiTexCoord3i(33985, 65534, -65534, 65535);
						OpenGL.glVertex2f(1.0F, 1.0F);
						OpenGL.glTexCoord3i(-65534, -65534, 65535);
						OpenGL.glMultiTexCoord3i(33985, -65534, -65534, 65535);
						OpenGL.glVertex2f(0.0F, 1.0F);
						break;
				}

				OpenGL.glEnd();
			} else {
				bool = false;
				break;
			}
		}

		class146_sub2_sub1.method14256(0, null);
		toolkit.method2398(class146_sub2_sub1);
		toolkit.method14326(1);

		toolkit.setActiveTexture(null);
		toolkit.setTextureParameters(8448, 8448);
		toolkit.method14326(0);
		toolkit.setActiveTexture(null);

		toolkit.method2760(anIntArray11108[0], anIntArray11108[1], anIntArray11108[2], anIntArray11108[3]);
		toolkit.method2566(anIntArray11109[0], anIntArray11109[1], anIntArray11109[2], anIntArray11109[3]);

		if (bool && !toolkit.aBool9108) {
			texture.generateMipmaps();
		}

		return bool;
	}

}