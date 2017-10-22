package com.jagex;

public class OpenGlClippingMask extends ClippingMask {

	static OpenGlClippingMask create(OpenGlToolkit toolkit, int width, int height, int[] offsets, int[] widths) {
		byte[] data = new byte[width * height];
		for (int y = 0; y < height; y++) {
			int index = y * width + offsets[y];

			for (int x = 0; x < widths[y]; x++) {
				data[index++] = (byte) -1;
			}
		}

		return new OpenGlClippingMask(toolkit, width, height, data);
	}

	RectangularOpenGl2DTexture texture;

	OpenGlClippingMask(OpenGlToolkit toolkit, int width, int height, byte[] data) {
		texture = RectangularOpenGl2DTexture.create(toolkit, Class121.aClass121_1460, Class151.aClass151_2, width,
				height, false, data, Class121.aClass121_1460);
		texture.setRepeating(false, false);
	}

}