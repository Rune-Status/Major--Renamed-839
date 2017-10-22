package com.jagex;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public abstract class Class136 implements Interface19 {
	static int[] PALETTE = new int[256];
	static double PALETTE_INTENSITY = -1.0;

	private static final int TYPE_MATERIAL = 1;

	private static final int TYPE_TEXTURE = 6;

	static void offsetColour(int[] rgb, double intensity) {
		if (intensity != PALETTE_INTENSITY) {
			for (int index = 0; index < 256; index++) {
				int value = (int) (Math.pow(index / 255.0, intensity) * 255.0);
				PALETTE[index] = value > 255 ? 255 : value;
			}

			PALETTE_INTENSITY = intensity;
		}

		for (int index = 0; index < rgb.length; index++) {
			int red = PALETTE[rgb[index] >> 16 & 0xff];
			int green = PALETTE[rgb[index] >> 8 & 0xff];
			int blue = PALETTE[rgb[index] >> 0 & 0xff];
			rgb[index] = rgb[index] & ~0xFFFFFF | red << 16 | green << 8 | blue;
		}
	}

	@Override
	public float[] loadCombined(Class549 type, int id, float intensity) {
		if (type != Class549.TEXTURE_AND_MATERIAL) {
			return null;
		}

		int[] raw = loadRaw(type, id, intensity);
		if (null == raw) {
			return null;
		}

		int[] argb = null;
		byte[] data = get(Class549.MATERIAL, id);

		if (data != null) {
			try {
				byte actualType = (byte) (data[0] & 0xff);
				if (actualType != TYPE_MATERIAL) {
					return null;
				}

				byte[] headerless = new byte[data.length - 5];
				System.arraycopy(data, 5, headerless, 0, data.length - 5);
				argb = rgb(headerless);

				for (int index = 0; index < argb.length; index++) {
					argb[index] = argb[index] & 0xff;
				}
			} catch (IOException ioexception) {

			}
		}

		if (null == argb) {
			argb = new int[raw.length];
		}

		float[] normalised = new float[4 * raw.length];
		int dest = 0;

		for (int source = 0; source < raw.length; source++) {
			int colour = raw[source];
			int alpha = colour >>> 24;
			int red = (colour & 0xff0000) >> 16;
			int green = (colour & 0xff00) >> 8;
			int blue = colour & 0xff;

			float scale = 1.0F + argb[source] * 31.0F / 255.0F;
			normalised[dest++] = red * scale / 255.0F;
			normalised[dest++] = scale * green / 255.0F;
			normalised[dest++] = blue * scale / 255.0F;
			normalised[dest++] = alpha / 255.0F;
		}

		return normalised;
	}

	@Override
	public abstract boolean loaded(Class549 class549, int id);

	@Override
	public int[] loadOpaque(Class549 type, int id, float intensity) {
		return loadRaw(type, id, intensity);
	}

	@Override
	public int[] loadTranslucent(Class549 type, int id, float intensity) {
		int[] data = loadRaw(type, id, intensity);
		if (data == null) {
			return null;
		}

		for (int index = 0; index < data.length; index++) {
			if ((data[index] & 0xFFFFFF) != 0) {
				data[index] |= ~0xFFFFFF;
			} else {
				data[index] &= 0xFFFFFF;
			}
		}

		return data;
	}

	@Override
	public void method106() {

	}

	abstract byte[] get(Class549 type, int id);

	int[] rgb(byte[] data) throws IOException {
		BufferedImage image = ImageIO.read(new ByteArrayInputStream(data));
		return Class480_Sub32.getArgb(image);
	}

	int[] loadRaw(Class549 type, int id, double intensity) {
		byte[] data = get(type, id);
		if (data == null) {
			return null;
		}

		try {
			byte actualType = (byte) (data[0] & 0xff);
			if (Class549.TEXTURE == type) {
				if (TYPE_TEXTURE != actualType) {
					return null;
				}

				int[] out = null;
				int index = 1;

				for (int part = 0; part < 6; part++) {
					int length = (data[index] & 0xff) << 24 | (data[index + 1] & 0xff) << 16
							| (data[index + 2] & 0xff) << 8 | data[index + 3] & 0xff;
					byte[] image = new byte[length];
					System.arraycopy(data, index + 4, image, 0, length);
					int[] rgb = rgb(image);

					if (0 == part) {
						out = new int[rgb.length * 6];
					}

					System.arraycopy(rgb, 0, out, part * rgb.length, rgb.length);
					index += length + 4;
				}

				if (1.0 != intensity) {
					Class136.offsetColour(out, intensity);
				}

				return out;
			}

			if (actualType != 1) {
				return null;
			}

			byte[] headerless = new byte[data.length - 5];
			System.arraycopy(data, 5, headerless, 0, data.length - 5);
			int[] rgb = rgb(headerless);

			if (intensity != 1.0) {
				Class136.offsetColour(rgb, intensity);
			}

			return rgb;
		} catch (IOException ioexception) {
			return null;
		}
	}

}