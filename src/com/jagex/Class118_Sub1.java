package com.jagex;

import jaggl.OpenGL;

public class Class118_Sub1 extends Class118 {
	OpenGlToolkit toolkit;
	OpenGlTexture texture;

	Class118_Sub1(OpenGlToolkit toolkit, int[] argb) {
		this.toolkit = toolkit;

		if (toolkit.aBool8982) {
			byte[] data = flatten(argb);
			texture = new OpenGl3DTexture(toolkit, Class121.aClass121_1465, Class151.aClass151_2, 16, 16, 16, data,
					Class121.aClass121_1465);
		} else {
			texture = new OpenGl2DTexture(toolkit, OpenGL.GL_TEXTURE_2D, 256, 16, false, argb, 256, 0, false);
		}
	}

	OpenGlTexture getTexture() {
		return texture;
	}

	byte[] flatten(int[] argb) {
		byte[] cube = new byte[16384];
		for (int i = 0; i < 16; i++) {
			for (int i_2_ = 0; i_2_ < 16; i_2_++) {
				for (int i_3_ = 0; i_3_ < 16; i_3_++) {
					int colour = argb[256 * i_2_ + 16 * i_3_ + i];
					int index = (i_3_ * 256 + i_2_ * 16 + i) * 4;

					cube[index + 0] = (byte) (colour >> 16 & 0xff);
					cube[index + 1] = (byte) (colour >> 8 & 0xff);
					cube[index + 2] = (byte) (colour & 0xff);
					cube[index + 3] = (byte) -1;
				}
			}
		}

		return cube;
	}

}