package com.jagex;

public class ImageUtils {

	static final int anInt1861 = 0;
	static final int anInt1862 = 1;
	static final int anInt1863 = 0;

	public static Image[] decode(byte[] data) {
		Buffer buffer = new Buffer(data);
		buffer.offset = (data.length - 2) * 1258142129;

		int meta = buffer.readUShort();
		int type = meta >> 15;
		int count = meta & 0x7fff;

		if (type == 0) {
			IndexedImage[] images = new IndexedImage[count];
			for (int index = 0; index < count; index++) {
				images[index] = new IndexedImage();
			}

			buffer.offset = (data.length - 7 - count * 8) * 1258142129;
			int resizeWidth = buffer.readUShort();
			int resizeHeight = buffer.readUShort();
			int paletteSize = (buffer.readUByte() & 0xff) + 1;

			for (int index = 0; index < count; index++) {
				images[index].offsetX = buffer.readUShort();
			}

			for (int index = 0; index < count; index++) {
				images[index].offsetY = buffer.readUShort();
			}

			for (int index = 0; index < count; index++) {
				images[index].width = buffer.readUShort();
			}

			for (int index = 0; index < count; index++) {
				images[index].height = buffer.readUShort();
			}

			for (int index = 0; index < count; index++) {
				IndexedImage image = images[index];
				image.deltaWidth = resizeWidth - image.width - image.offsetX;
				image.deltaHeight = resizeHeight - image.height - image.offsetY;
			}

			buffer.offset = (data.length - 7 - count * 8 - (paletteSize - 1) * 3) * 1258142129;
			int[] palette = new int[paletteSize];

			for (int index = 1; index < paletteSize; index++) {
				palette[index] = buffer.readUTriByte();

				if (palette[index] == 0) {
					palette[index] = 1;
				}
			}

			for (int index = 0; index < count; index++) {
				images[index].palette = palette;
			}

			buffer.offset = 0;

			for (int index = 0; index < count; index++) {
				IndexedImage image = images[index];
				int rasterSize = image.width * image.height;
				image.raster = new byte[rasterSize];

				int attributes = buffer.readUByte();
				if ((attributes & 0x2) == 0) {
					if ((attributes & 0x1) == 0) {
						for (int pixel = 0; pixel < rasterSize; pixel++) {
							image.raster[pixel] = buffer.readByte();
						}
					} else {
						for (int x = 0; x < image.width; x++) {
							for (int y = 0; y < image.height; y++) {
								image.raster[x + y * image.width] = buffer.readByte();
							}
						}
					}
				} else {
					boolean transparent = false;
					image.alpha = new byte[rasterSize];

					if ((attributes & 0x1) == 0) {
						for (int pixel = 0; pixel < rasterSize; pixel++) {
							image.raster[pixel] = buffer.readByte();
						}

						for (int pixel = 0; pixel < rasterSize; pixel++) {
							byte alpha = image.alpha[pixel] = buffer.readByte();
							transparent = transparent | alpha != -1;
						}
					} else {
						for (int x = 0; x < image.width; x++) {
							for (int y = 0; y < image.height; y++) {
								image.raster[x + y * image.width] = buffer.readByte();
							}
						}

						for (int x = 0; x < image.width; x++) {
							for (int y = 0; y < image.height; y++) {
								byte alpha = image.alpha[x + y * image.width] = buffer.readByte();
								transparent = transparent | alpha != -1;
							}
						}
					}

					if (!transparent) {
						image.alpha = null;
					}
				}
			}

			return images;
		}

		DirectImage[] images = new DirectImage[count];
		buffer.offset = 0;
		int directType = buffer.readUByte();

		if (directType == 0) {
			boolean hasAlpha = buffer.readUByte() == 1;
			int width = buffer.readUShort();
			int height = buffer.readUShort();

			for (int image = 0; image < count; image++) {
				int[] raster = new int[width * height];

				for (int index = 0; index < width * height; index++) {
					raster[index] = ~0xffffff | buffer.readUTriByte();
					if (raster[index] == -65281) {
						raster[index] = 0;
					}
				}

				if (hasAlpha) {
					for (int index = 0; index < width * height; index++) {
						raster[index] &= 0xffffff;
						raster[index] |= buffer.readUByte() << 24;
					}
				}

				images[image] = new DirectImage(width, height, raster);
			}
		} else {
			if (directType == 1) {
				throw new UnsupportedOperationException();
			}
			throw new RuntimeException();
		}

		return images;
	}

	public static Image[] load(Archive images, int id) {
		byte[] data = images.get(id);
		if (data == null) {
			return null;
		}

		return decode(data);
	}

	public static Image[] load(Archive images, int id, int child) {
		byte[] is = images.get(id, child);
		if (is == null) {
			return null;
		}
		return decode(is);
	}

	public static Image loadFirst(Archive images, int id) {
		byte[] data = images.get(id);
		if (data == null) {
			return null;
		}

		return decode(data)[0];
	}

	public static Image loadFirst(Archive images, int id, int child) {
		byte[] data = images.get(id, child);
		if (data == null) {
			return null;
		}

		return decode(data)[0];
	}

	ImageUtils() throws Throwable {
		throw new Error();
	}

}