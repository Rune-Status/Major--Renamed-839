package com.jagex;

import jaggl.OpenGL;

public class OpenGl1DTexture extends OpenGlTexture {

	int width;

	OpenGl1DTexture(OpenGlToolkit toolkit, Class121 class121, Class151 class151, int width, byte[] data,
			Class121 class121_0_) {
		super(toolkit, 3552, class121, class151, width, false);
		this.width = width;
		toolkit.setActiveTexture(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(target, 0, OpenGlToolkit.internalFormat(aClass121_1328, aClass151_1330), width, 0,
				OpenGlToolkit.format(class121_0_), 5121, data, 0);
		OpenGL.glPixelStorei(3317, 4);
		filterLinear(true);
	}

	void setRepeating(boolean repeat) {
		toolkit.setActiveTexture(this);
		OpenGL.glTexParameteri(target, 10242, repeat ? 10497 : 33071);
	}

}