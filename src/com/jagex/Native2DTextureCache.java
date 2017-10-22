package com.jagex;

public class Native2DTextureCache {
	NativeToolkit toolkit;
	Interface19 anInterface19_3414;
	ReferenceCache<Native2DTexture> cache = new ReferenceCache(10485760, 256);

	Native2DTextureCache(NativeToolkit toolkit, Interface19 interface19) {
		this.toolkit = toolkit;
		anInterface19_3414 = interface19;
	}

	Native2DTexture get(TextureMetrics metrics) {
		return get(metrics, metrics.length * -931821243);
	}

	void sweep() {
		cache.sweep(5);
	}

	void clear() {
		cache.clear();
	}

	boolean loaded(TextureMetrics metrics, int i) {
		if (i == -1) {
			i = metrics.length * -931821243;
		}

		if (!metrics.aBool1701 || !toolkit.method2496()) {
			if (metrics.aClass554_1727 != Class554.aClass554_7499 || !Class279.method5212(metrics.aByte1719)) {
				return anInterface19_3414.loaded(Class549.TEXTURE_AND_MATERIAL, metrics.id * -464558709);
			}

			return anInterface19_3414.loaded(Class549.TEXTURE_AND_MATERIAL, metrics.id * -464558709);
		}

		return anInterface19_3414.loaded(Class549.TEXTURE_AND_MATERIAL, metrics.id * -464558709);
	}

	Native2DTexture get(TextureMetrics metrics, int i) {
		long l = i << 16 | metrics.id * -464558709;
		Native2DTexture cached = cache.get(l);
		if (cached != null) {
			return cached;
		} else if (!loaded(metrics, i)) {
			return null;
		}

		if (i == -1) {
			i = metrics.length * -931821243;
		}

		Native2DTexture texture;
		if (!metrics.aBool1701 || !toolkit.method2496()) {
			int[] is;
			if (metrics.aClass554_1727 != Class554.aClass554_7499 || !Class279.method5212(metrics.aByte1719)) {
				is = anInterface19_3414.loadOpaque(Class549.TEXTURE_AND_MATERIAL, metrics.id * -464558709, 0.7F);
			} else {
				is = anInterface19_3414.loadTranslucent(Class549.TEXTURE_AND_MATERIAL, metrics.id * -464558709, 0.7F);
			}

			texture = toolkit.create2DTexture(i, i, true, is);
		} else {
			float[] fs = anInterface19_3414.loadCombined(Class549.TEXTURE_AND_MATERIAL, metrics.id * -464558709, 0.7F);
			texture = toolkit.method14658(Class121.aClass121_1465, i, i, true, fs);
		}

		texture.setRepeating(metrics.aByte1709 == 1, metrics.aByte1705 == 1);
		cache.put(l, texture, i * i);
		return texture;
	}

}