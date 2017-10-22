package com.jagex;

import jaggl.OpenGL;

public class Class107 {
	static Object anObject1352;
	static final int anInt1353 = 128;
	static final int anInt1354 = 128;
	static final int anInt1355 = 16;
	static final int anInt1359 = 4000;
	static Object anObject1362;
	static Object anObject1364;

	static void method1983(OpenGlToolkit toolkit) {
		if (anObject1362 == null) {
			Class382_Sub2_Sub1 class382_sub2_sub1 = new Class382_Sub2_Sub1();
			byte[] is = class382_sub2_sub1.method17534(128, 128, 16);
			anObject1362 = Archive.wrap(is, false);
		}

		if (anObject1364 == null) {
			Class382_Sub1_Sub1 class382_sub1_sub1 = new Class382_Sub1_Sub1();
			byte[] is = class382_sub1_sub1.method17490(128, 128, 16);
			anObject1364 = Archive.wrap(is, false);
		}

		Class117 class117 = toolkit.aClass117_9003;
		if (class117.method2162() && anObject1352 == null) {
			byte[] is = Class476.method8139(128, 128, 16, 8, new Class484_Sub1(419684), 4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
			anObject1352 = Archive.wrap(is, false);
		}
	}

	OpenGl2DTexture[] aClass102_Sub1Array1356;
	OpenGl2DTexture[] aClass102_Sub1Array1357 = null;
	OpenGl3DTexture aClass102_Sub2_1358 = null;
	OpenGl3DTexture aClass102_Sub2_1360;
	boolean aBool1361;

	OpenGl3DTexture aClass102_Sub2_1363;

	Class107(OpenGlToolkit toolkit) {
		aClass102_Sub1Array1356 = null;
		aClass102_Sub2_1360 = null;
		aClass102_Sub2_1363 = null;
		aBool1361 = toolkit.aBool8982;
		method1983(toolkit);

		if (!aBool1361) {
			aClass102_Sub1Array1357 = new OpenGl2DTexture[16];
			for (int i = 0; i < 16; i++) {
				byte[] is = Archive.unwrap(anObject1362, i * 32768, 32768);
				aClass102_Sub1Array1357[i] = new OpenGl2DTexture(toolkit, OpenGL.GL_TEXTURE_2D,
						Class121.aClass121_1462, Class151.aClass151_2, 128, 128, true, is, Class121.aClass121_1462,
						false);
			}

			aClass102_Sub1Array1356 = new OpenGl2DTexture[16];
			for (int i = 0; i < 16; i++) {
				byte[] is = Archive.unwrap(anObject1364, i * 32768, 32768);
				aClass102_Sub1Array1356[i] = new OpenGl2DTexture(toolkit, OpenGL.GL_TEXTURE_2D,
						Class121.aClass121_1462, Class151.aClass151_2, 128, 128, true, is, Class121.aClass121_1462,
						false);
			}
		} else {
			byte[] is = Archive.unwrap(anObject1362, false);
			aClass102_Sub2_1358 = new OpenGl3DTexture(toolkit, Class121.aClass121_1462, Class151.aClass151_2, 128, 128,
					16, is, Class121.aClass121_1462);

			is = Archive.unwrap(anObject1364, false);
			aClass102_Sub2_1360 = new OpenGl3DTexture(toolkit, Class121.aClass121_1462, Class151.aClass151_2, 128, 128,
					16, is, Class121.aClass121_1462);

			Class117 class117 = toolkit.aClass117_9003;
			if (class117.method2162()) {
				is = Archive.unwrap(anObject1352, false);

				aClass102_Sub2_1363 = new OpenGl3DTexture(toolkit, Class121.aClass121_1465, Class151.aClass151_2, 128,
						128, 16);
				OpenGl3DTexture class102_sub2 = new OpenGl3DTexture(toolkit, Class121.aClass121_1458,
						Class151.aClass151_2, 128, 128, 16, is, Class121.aClass121_1458);

				if (!class117.method2164(aClass102_Sub2_1363, class102_sub2, 2.0F)) {
					aClass102_Sub2_1363.delete();
					aClass102_Sub2_1363 = null;
				} else {
					aClass102_Sub2_1363.generateMipmaps();
				}

				class102_sub2.delete();
			}
		}
	}

}