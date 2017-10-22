package com.jagex;

import jaggl.OpenGL;

public class OpenGl3DTexture extends OpenGlTexture {

	private static final int TYPE_UNSIGNED_BYTE = 0x1401;
	int depth;
	int height;
	int width;

	OpenGl3DTexture(OpenGlToolkit toolkit, Class121 class121, Class151 class151, int width, int height, int depth) {
		super(toolkit, 32879, class121, class151, width * height * depth, false);
		this.width = width;
		this.height = height;
		this.depth = depth;

		toolkit.setActiveTexture(this);
		OpenGL.glTexImage3Dub(target, 0, OpenGlToolkit.internalFormat(aClass121_1328, aClass151_1330), width, height,
				depth, 0, OpenGlToolkit.format(aClass121_1328), TYPE_UNSIGNED_BYTE, null, 0);
		filterLinear(true);
	}

	OpenGl3DTexture(OpenGlToolkit toolkit, Class121 class121, Class151 class151, int width, int height, int depth,
			byte[] data, Class121 class121_2) {
		super(toolkit, 32879, class121, class151, width * height * depth, false);

		this.width = width;
		this.height = height;
		this.depth = depth;

		toolkit.setActiveTexture(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(target, 0, OpenGlToolkit.internalFormat(aClass121_1328, aClass151_1330), width, height,
				depth, 0, OpenGlToolkit.format(class121_2), TYPE_UNSIGNED_BYTE, data, 0);
		OpenGL.glPixelStorei(3317, 4);
		filterLinear(true);
	}

	void copy(int offsetX, int offsetY, int offsetZ, int width, int height, int x, int y) {
		toolkit.setActiveTexture(this);
		OpenGL.glCopyTexSubImage3D(target, 0, offsetX, offsetY, offsetZ, x, y, width, height);
		OpenGL.glFlush();
	}

}