package com.jagex;

public final class NativeClippingMask extends ClippingMask {

	static NativeClippingMask create(NativeToolkit toolkit, int width, int height, int[] offsets, int[] widths) {
		if (toolkit.method14655(Class121.aClass121_1460, Class151.aClass151_2)) {
			byte[] data = new byte[width * height];
			for (int y = 0; y < height; y++) {
				int index = y * width + offsets[y];

				for (int x = 0; x < widths[y]; x++) {
					data[index++] = (byte) -1;
				}
			}

			return new NativeClippingMask(toolkit, width, height, data);
		}

		int[] data = new int[width * height];
		for (int y = 0; y < height; y++) {
			int index = y * width + offsets[y];

			for (int x = 0; x < widths[y]; x++) {
				data[index++] = -16777216;
			}
		}

		return new NativeClippingMask(toolkit, width, height, data);
	}

	Native2DTexture texture;

	NativeClippingMask(NativeToolkit toolkit, int width, int height, byte[] data) {
		texture = toolkit.create2DTexture(Class121.aClass121_1460, width, height, false, data);
		texture.setRepeating(false, false);
	}

	NativeClippingMask(NativeToolkit toolkit, int width, int height, int[] data) {
		texture = toolkit.create2DTexture(width, height, false, data);
		texture.setRepeating(false, false);
	}

}