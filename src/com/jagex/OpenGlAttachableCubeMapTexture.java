package com.jagex;

import jaggl.OpenGL;

public class OpenGlAttachableCubeMapTexture implements OpenGlAttachable {

	private static final int GL_FRAMEBUFFER = 0x8D40;

	int mipmapLevel;
	int target;
	OpenGlCubeMapTexture texture;

	OpenGlAttachableCubeMapTexture(OpenGlCubeMapTexture texture, int target, int mipmapLevel) {
		this.mipmapLevel = mipmapLevel;
		this.texture = texture;
		this.target = target;
	}

	@Override
	public void attach(int attachment) {
		OpenGL.glFramebufferTexture2DEXT(GL_FRAMEBUFFER, attachment, target, texture.name, mipmapLevel);
	}

	@Override
	public void deleteImmediately() {

	}

	@Override
	public int getHeight() {
		return texture.length;
	}

	@Override
	public int getWidth() {
		return texture.length;
	}

}