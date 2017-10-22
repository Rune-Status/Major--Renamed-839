package com.jagex;

public class LazyOpenGlCubeMapTextureProvider extends OpenGlCubeMapTextureProvider {
	static int[][] data = new int[6][];
	int id;
	OpenGlToolkit toolkit;
	OpenGlCubeMapTexture texture;

	LazyOpenGlCubeMapTextureProvider(OpenGlToolkit toolkit, int id) {
		this.toolkit = toolkit;
		this.id = id;
	}

	@Override
	OpenGlCubeMapTexture getTexture() {
		if (texture == null) {
			Interface19 interface19 = toolkit.anInterface19_1546;
			TextureMetrics metrics = toolkit.metricsList.get(id);

			if (metrics == null) {
				return null;
			} else if (!metrics.aBool1697) {
				return null;
			} else if (!interface19.loaded(Class549.TEXTURE, id)) {
				return null;
			}

			int[] source = interface19.loadTranslucent(Class549.TEXTURE, id, 1.0F);
			int length = metrics.length * -931821243 * metrics.length * -931821243;

			if (source == null) {
				return null;
			}

			for (int index = 0; index < 6; index++) {
				data[index] = new int[length];
				System.arraycopy(source, length * index, data[index], 0, length);
			}

			texture = new OpenGlCubeMapTexture(toolkit, Class121.aClass121_1466, Class151.aClass151_2,
					metrics.length * -931821243, metrics.mipmapLevel != 0, data);
		}

		return texture;
	}

}