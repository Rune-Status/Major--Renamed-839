package com.jagex;

import jaggl.OpenGL;

public class OpenGlXAttachableRenderBuffer implements OpenGlXAttachable {

	Class121 aClass121_5059;
	Class151 aClass151_5058;
	int renderBuffer;
	int height;
	OpenGlXToolkit toolkit;
	int width;

	OpenGlXAttachableRenderBuffer(OpenGlXToolkit toolkit, Class121 class121, Class151 class151, int width, int height) {
		aClass121_5059 = class121;
		aClass151_5058 = class151;
		this.width = width;
		this.height = height;
		this.toolkit = toolkit;

		int[] parameters = new int[1];
		OpenGL.glGenRenderbuffersEXT(1, parameters, 0);
		renderBuffer = parameters[0];

		OpenGL.glBindRenderbufferEXT(36161, renderBuffer);
		OpenGL.glRenderbufferStorageEXT(36161, OpenGlXToolkit.method17357(aClass121_5059, aClass151_5058), width,
				height);
	}

	OpenGlXAttachableRenderBuffer(OpenGlXToolkit toolkit, Class121 class121, Class151 class151, int width, int height, int samples) {
		aClass121_5059 = class121;
		aClass151_5058 = class151;
		this.width = width;
		this.height = height;
		this.toolkit = toolkit;

		int[] parameters = new int[1];
		OpenGL.glGenRenderbuffersEXT(1, parameters, 0);
		renderBuffer = parameters[0];

		OpenGL.glBindRenderbufferEXT(36161, renderBuffer);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, samples,
				OpenGlXToolkit.method17357(aClass121_5059, aClass151_5058), width, height);
	}

	@Override
	public void deleteImmediately() {
		if (renderBuffer != 0) {
			int[] parameters = new int[1];
			parameters[0] = renderBuffer;
			OpenGL.glDeleteRenderbuffersEXT(1, parameters, 0);
			renderBuffer = 0;
		}
	}

	@Override
	public void finalize() throws Throwable {
		if (renderBuffer != 0) {
			toolkit.deleteRenderBuffer(renderBuffer, width * height * aClass151_5058.size * -172886387
					* aClass121_5059.size * 115153045);
			renderBuffer = 0;
		}

		super.finalize();
	}

	@Override
	public int getHeight() {
		return height;
	}

	@Override
	public int getWidth() {
		return width;
	}

	@Override
	public void attach(int attachment) {
		OpenGL.glFramebufferRenderbufferEXT(36160, attachment, 36161, renderBuffer);
	}

}