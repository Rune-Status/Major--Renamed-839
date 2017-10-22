package com.jagex;

public class LazyNativeCubeMapTextureProvider extends NativeCubeMapTextureProvider {
	static int[][] data = new int[6][];
	NativeCubeMapTexture texture;
	NativeToolkit toolkit;
	int id;

	LazyNativeCubeMapTextureProvider(NativeToolkit toolkit, int id) {
		this.toolkit = toolkit;
		this.id = id;
	}

	@Override
	NativeCubeMapTexture getTexture() {
		if (texture == null) {
			Interface19 loader = toolkit.anInterface19_1546;
			TextureMetrics metrics = toolkit.metricsList.get(id);

			if (metrics == null) {
				return null;
			} else if (!metrics.aBool1697) {
				return null;
			}

			if (!loader.loaded(Class549.TEXTURE, id)) {
				return null;
			}

			int[] source = loader.loadTranslucent(Class549.TEXTURE, id, 1.0F);
			int length = metrics.length * -931821243 * metrics.length * -931821243;
			if (source == null) {
				return null;
			}

			for (int index = 0; index < 6; index++) {
				data[index] = new int[length];
				System.arraycopy(source, length * index, data[index], 0, length);
			}

			texture = toolkit.createCubeMapTexture(metrics.length * -931821243, metrics.mipmapLevel != 0, data);
		}

		return texture;
	}

}