package com.jagex;

import jaggl.OpenGL;

public class OpenGl2DTextureCache {
	ReferenceCache<OpenGl2DTexture> cache = new ReferenceCache<OpenGl2DTexture>(10485760, 256);
	Interface19 loader;
	OpenGlToolkit toolkit;

	OpenGl2DTextureCache(OpenGlToolkit toolkit, Interface19 loader) {
		this.toolkit = toolkit;
		this.loader = loader;
	}

	void clear() {
		cache.clear();
	}

	OpenGl2DTexture get(TextureMetrics metrics) {
		return get(metrics, metrics.length * -931821243);
	}

	OpenGl2DTexture get(TextureMetrics metrics, int length) {
		OpenGl2DTexture cached = cache.get(metrics.id * -464558709);
		if (cached != null) {
			return cached;
		}

		if (!loaded(Class549.TEXTURE_AND_MATERIAL, metrics, length)) {
			return null;
		}

		if (length == -1) {
			length = metrics.length * -931821243;
		}

		OpenGl2DTexture texture;
		if (!metrics.aBool1701 || !toolkit.method2496()) {
			int[] data;

			if (metrics.aClass554_1727 != Class554.aClass554_7499 || !Class279.method5212(metrics.aByte1719)) {
				data = loader.loadOpaque(Class549.TEXTURE_AND_MATERIAL, metrics.id * -464558709, 0.7F);
			} else {
				data = loader.loadTranslucent(Class549.TEXTURE_AND_MATERIAL, metrics.id * -464558709, 0.7F);
			}

			texture = new OpenGl2DTexture(toolkit, OpenGL.GL_TEXTURE_2D, length, length, metrics.mipmapLevel != 0,
					data, 0, 0, false);
		} else {
			float[] fs = loader.loadCombined(Class549.TEXTURE_AND_MATERIAL, metrics.id * -464558709, 0.7F);
			texture = new OpenGl2DTexture(toolkit, OpenGL.GL_TEXTURE_2D, Class121.aClass121_1465,
					Class151.aClass151_1855, length, length, metrics.mipmapLevel != 0, fs, Class121.aClass121_1465);
		}

		texture.setRepeating(metrics.aByte1709 == 1, metrics.aByte1705 == 1);
		cache.put(metrics.id * -464558709, texture, length * length);
		return texture;
	}

	boolean loaded(Class549 type, TextureMetrics metrics, int length) {
		if (length == -1) {
			length = metrics.length * -931821243;
		}

		if (!metrics.aBool1701 || !toolkit.method2496()) {
			if (metrics.aClass554_1727 != Class554.aClass554_7499 || !Class279.method5212(metrics.aByte1719)) {
				return loader.loaded(type, metrics.id * -464558709);
			}

			return loader.loaded(type, metrics.id * -464558709);
		}

		return loader.loaded(type, metrics.id * -464558709);
	}

	void sweep() {
		cache.sweep(5);
	}

}