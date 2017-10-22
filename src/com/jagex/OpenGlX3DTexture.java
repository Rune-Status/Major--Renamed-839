package com.jagex;

import jaggl.OpenGL;

public class OpenGlX3DTexture extends OpenGlXTexture implements Native3DTexture {

	int depth;
	int width;
	int height;

	OpenGlX3DTexture(OpenGlXToolkit toolkit, Class121 class121, int width, int height, int depth, boolean mipmapped,
			byte[] data) {
		super(toolkit, 32879, class121, Class151.aClass151_2, width * height * depth, mipmapped);
		this.width = width;
		this.height = height;
		this.depth = depth;

		toolkit.method14689(this);

		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(target, 0, OpenGlXToolkit.method17357(aClass121_5266, aClass151_5267), width, height,
				depth, 0, OpenGlXToolkit.method17363(aClass121_5266), 5121, data, 0);
		OpenGL.glPixelStorei(3317, 4);

		if (mipmapped) {
			generateMipmaps();
		}
	}

	@Override
	public void method296(Class318 class318) {
		super.method296(class318);
	}

	@Override
	public void method301() {
		super.method301();
	}

	@Override
	public void deleteImmediately() {
		super.deleteImmediately();
	}

}