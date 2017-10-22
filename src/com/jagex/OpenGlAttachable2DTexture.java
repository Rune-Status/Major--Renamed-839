package com.jagex;

import jaggl.OpenGL;

public class OpenGlAttachable2DTexture implements OpenGlAttachable {
	private static final int GL_FRAMEBUFFER = 0x8D40;
	int mipmapping;

	OpenGl2DTexture texture;

	OpenGlAttachable2DTexture(OpenGl2DTexture texture, int mipmapLevel) {
		mipmapping = mipmapLevel;
		this.texture = texture;
	}

	@Override
	public void attach(int attachment) {
		OpenGL.glFramebufferTexture2DEXT(GL_FRAMEBUFFER, attachment, texture.target, texture.name, mipmapping);
	}

	@Override
	public void deleteImmediately() {

	}

	@Override
	public int getHeight() {
		return texture.height;
	}

	@Override
	public int getWidth() {
		return texture.width;
	}

}