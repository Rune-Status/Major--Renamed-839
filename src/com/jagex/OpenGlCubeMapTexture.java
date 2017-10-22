package com.jagex;

import jaggl.OpenGL;

public class OpenGlCubeMapTexture extends OpenGlTexture {
	private static final int GL_BGRA_EXT = 0x80E1;
	private static final int GL_TEXTURE_CUBE_MAP = 0x8513;
	private static final int GL_TEXTURE_CUBE_MAP_POSITIVE_X = 0x8515;
	private static final int GL_UNSIGNED_BYTE = 0x1401;

	int length;

	OpenGlCubeMapTexture(OpenGlToolkit toolkit, Class121 class121, Class151 class151, int length) {
		super(toolkit, GL_TEXTURE_CUBE_MAP, class121, class151, length * length * 6, false);
		this.length = length;
		toolkit.setActiveTexture(this);

		for (int index = 0; index < 6; index++) {
			OpenGL.glTexImage2Dub(GL_TEXTURE_CUBE_MAP_POSITIVE_X + index, 0,
					OpenGlToolkit.internalFormat(aClass121_1328, aClass151_1330), length, length, 0,
					OpenGlToolkit.format(aClass121_1328), GL_UNSIGNED_BYTE, null, 0);
		}

		filterLinear(true);
	}

	OpenGlCubeMapTexture(OpenGlToolkit toolkit, Class121 class121, Class151 class151, int length, boolean mipmap,
			byte[][] data, Class121 class121_4) {
		super(toolkit, GL_TEXTURE_CUBE_MAP, class121, class151, length * length * 6, mipmap);
		this.length = length;
		toolkit.setActiveTexture(this);

		for (int index = 0; index < 6; index++) {
			OpenGL.glTexImage2Dub(GL_TEXTURE_CUBE_MAP_POSITIVE_X + index, 0,
					OpenGlToolkit.internalFormat(aClass121_1328, aClass151_1330), length, length, 0,
					OpenGlToolkit.format(class121_4), GL_UNSIGNED_BYTE, data[index], 0);
		}

		filterLinear(true);
	}

	OpenGlCubeMapTexture(OpenGlToolkit toolkit, Class121 class121, Class151 class151, int length, boolean mipmap,
			int[][] data) {
		super(toolkit, GL_TEXTURE_CUBE_MAP, class121, class151, length * length * 6, mipmap);
		this.length = length;
		toolkit.setActiveTexture(this);

		if (mipmap) {
			for (int index = 0; index < 6; index++) {
				method1845(GL_TEXTURE_CUBE_MAP_POSITIVE_X + index,
						OpenGlToolkit.internalFormat(aClass121_1328, aClass151_1330), length, length, GL_BGRA_EXT,
						toolkit.pixelType, data[index]);
			}
		} else {
			for (int index = 0; index < 6; index++) {
				OpenGL.glTexImage2Di(GL_TEXTURE_CUBE_MAP_POSITIVE_X + index, 0,
						OpenGlToolkit.internalFormat(aClass121_1328, aClass151_1330), length, length, 0, GL_BGRA_EXT,
						toolkit.pixelType, data[index], 0);
			}
		}

		filterLinear(true);
	}

	Interface16 method13959(int i, int mipmapLevel) {
		return new OpenGlAttachableCubeMapTexture(this, i, mipmapLevel);
	}

}