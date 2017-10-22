package com.jagex;

import jaggl.OpenGL;

public class OpenGlXAttachable2DTexture implements OpenGlXAttachable {
	private static final int GL_FRAMEBUFFER = 0x8D40;
	OpenGlX2DTexture texture;
	int mipmapping;

	OpenGlXAttachable2DTexture(OpenGlX2DTexture texture, int mipmapping) {
		this.mipmapping = mipmapping;
		this.texture = texture;
	}

	@Override
	public int getWidth() {
		return texture.getWidth();
	}

	@Override
	public void attach(int attachment) {
		OpenGL.glFramebufferTexture2DEXT(GL_FRAMEBUFFER, attachment, texture.target, texture.texture, mipmapping);
	}

	@Override
	public int getHeight() {
		return texture.getHeight();
	}

	@Override
	public void deleteImmediately() {

	}

}