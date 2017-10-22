package com.jagex;

import jaggl.OpenGL;

public class OpenGlAttachableRenderBuffer extends Cacheable implements OpenGlAttachable {
	static int[] parameters = new int[1];
	private static final int GL_FRAMEBUFFER = 0x8D40;
	private static final int GL_RENDERBUFFER = 0x8D41;

	Class121 aClass121_10943;
	Class151 aClass151_10944;
	int height;
	int renderBuffer;
	int size;
	OpenGlToolkit toolkit;
	int width;

	OpenGlAttachableRenderBuffer(OpenGlToolkit toolkit, Class121 class121, Class151 class151, int width, int height) {
		this.toolkit = toolkit;
		this.width = width;
		this.height = height;

		aClass121_10943 = class121;
		aClass151_10944 = class151;

		OpenGL.glGenRenderbuffersEXT(1, parameters, 0);
		renderBuffer = parameters[0];

		OpenGL.glBindRenderbufferEXT(GL_RENDERBUFFER, renderBuffer);
		OpenGL.glRenderbufferStorageEXT(GL_RENDERBUFFER,
				OpenGlToolkit.internalFormat(aClass121_10943, aClass151_10944), width, height);
		size = width * height * aClass121_10943.size * 115153045 * aClass151_10944.size * -172886387;
	}

	OpenGlAttachableRenderBuffer(OpenGlToolkit toolkit, Class121 class121, Class151 class151, int width, int height, int samples) {
		this.toolkit = toolkit;
		this.width = width;
		this.height = height;

		aClass121_10943 = class121;
		aClass151_10944 = class151;

		OpenGL.glGenRenderbuffersEXT(1, parameters, 0);
		renderBuffer = parameters[0];

		OpenGL.glBindRenderbufferEXT(GL_RENDERBUFFER, renderBuffer);
		OpenGL.glRenderbufferStorageMultisampleEXT(GL_RENDERBUFFER, samples,
				OpenGlToolkit.internalFormat(aClass121_10943, aClass151_10944), width, height);
		size = width * height * aClass121_10943.size * 115153045 * aClass151_10944.size * -172886387;
	}

	@Override
	public void attach(int attachment) {
		OpenGL.glFramebufferRenderbufferEXT(GL_FRAMEBUFFER, attachment, GL_RENDERBUFFER, renderBuffer);
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
			toolkit.deleteRenderBuffer(renderBuffer, size);
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

}