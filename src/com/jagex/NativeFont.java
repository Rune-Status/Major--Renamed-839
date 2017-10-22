package com.jagex;

import java.nio.ByteBuffer;

public class NativeFont extends Font {
	byte[] offsets = new byte[512];
	Native2DTexture texture;
	int maximumDimension;
	NativeArrayBuffer anInterface32_8837;
	int anInt8838;
	NativeToolkit toolkit;

	NativeFont(NativeToolkit toolkit, FontSpecification specification, Image[] images, boolean bool) {
		super(toolkit, specification);
		this.toolkit = toolkit;
		maximumDimension = 0;

		for (int index = 0; index < 256; index++) {
			Image image = images[index];
			if (image.getHeight() > maximumDimension) {
				maximumDimension = image.getHeight();
			}

			if (image.getWidth() > maximumDimension) {
				maximumDimension = image.getWidth();
			}
		}

		anInt8838 = maximumDimension * 16;
		if (bool) {
			byte[] raster = new byte[anInt8838 * anInt8838];

			for (int index = 0; index < 256; index++) {
				Image image = images[index];
				int height = image.getHeight();
				int width = image.getWidth();
				int i_2_ = index % 16 * maximumDimension;
				int i_3_ = index / 16 * maximumDimension;
				int dest = i_3_ * anInt8838 + i_2_;
				int source = 0;

				if (image.isIndexed()) {
					IndexedImage indexed = (IndexedImage) images[index];
					if (!indexed.hasAlpha()) {
						byte[] pixels = indexed.raster;

						for (int y = 0; y < height; y++) {
							for (int x = 0; x < width; x++) {
								raster[dest++] = (byte) (pixels[source++] == 0 ? 0 : -1);
							}

							dest += anInt8838 - width;
						}
					} else {
						byte[] pixels = indexed.alpha;
						for (int y = 0; y < height; y++) {
							for (int x = 0; x < width; x++) {
								raster[dest++] = pixels[source++];
							}

							dest += anInt8838 - width;
						}
					}
				} else {
					DirectImage direct = (DirectImage) images[index];
					int[] argb = direct.argb(false);
					if (!direct.hasAlpha()) {
						for (int y = 0; y < height; y++) {
							for (int x = 0; x < width; x++) {
								int colour = argb[source++];
								byte rgb = (byte) ((colour >> 16 & 0xff) * 3 + (colour >> 8 & 0xff) * 4
										+ (colour & 0xff) >> 3);
								raster[dest++] = rgb;
							}
							dest += anInt8838 - width;
						}
					} else {
						for (int y = 0; y < height; y++) {
							for (int x = 0; x < width; x++) {
								raster[dest++] = (byte) (argb[source++] >> 24 & 0xff);
							}

							dest += anInt8838 - width;
						}
					}
				}
			}

			int[] data = new int[raster.length];
			for (int index = 0; index < raster.length; index++) {
				data[index] = raster[index] << 24 | 0xffffff;
			}

			texture = toolkit.create2DTexture(anInt8838, anInt8838, false, data);
		} else {
			int[] raster = new int[anInt8838 * anInt8838];
			for (int index = 0; index < 256; index++) {
				Image image = images[index];
				int height = image.getHeight();
				int width = image.getWidth();
				int i_22_ = index % 16 * maximumDimension;
				int i_23_ = index / 16 * maximumDimension;
				int dest = i_23_ * anInt8838 + i_22_;
				int source = 0;

				if (image.isIndexed()) {
					IndexedImage indexed = (IndexedImage) images[index];
					int[] palette = indexed.palette;
					byte[] alpha = indexed.alpha;
					byte[] pixels = indexed.raster;

					if (alpha != null) {
						for (int y = 0; y < height; y++) {
							for (int x = 0; x < width; x++) {
								raster[dest++] = alpha[source] << 24 | palette[pixels[source] & 0xff];
								source++;
							}

							dest += anInt8838 - width;
						}
					} else {
						for (int y = 0; y < height; y++) {
							for (int x = 0; x < width; x++) {
								int i;

								if ((i = pixels[source++]) != 0) {
									raster[dest++] = ~0xffffff | palette[i & 0xff];
								} else {
									dest++;
								}
							}

							dest += anInt8838 - width;
						}
					}
				} else {
					DirectImage direct = (DirectImage) images[index];
					int[] argb = direct.argb(false);

					if (!direct.hasAlpha()) {
						for (int y = 0; y < height; y++) {
							for (int x = 0; x < width; x++) {
								int colour = argb[source] & 0xffffff;
								raster[dest++] = (colour == 0 ? 0 : 255) << 24 | colour;
								source++;
							}

							dest += anInt8838 - width;
						}
					} else {
						for (int y = 0; y < height; y++) {
							for (int x = 0; x < width; x++) {
								raster[dest++] = argb[source++];
							}
							dest += anInt8838 - width;
						}
					}
				}
			}

			texture = toolkit.create2DTexture(anInt8838, anInt8838, false, raster);
		}

		texture.method296(Class318.aClass318_3393);
		anInterface32_8837 = toolkit.createArrayBuffer(false);
		anInterface32_8837.reallocate(20480, 20);

		ByteBuffer buffer = toolkit.aByteBuffer9279;
		buffer.clear();

		float f = texture.method191(anInt8838) / anInt8838;
		float f_40_ = texture.method180(anInt8838) / anInt8838;

		for (int index = 0; index < 256; index++) {
			Image image = images[index];
			int height = image.getHeight();
			int width = image.getWidth();
			int dy = image.getOffsetY();
			int dx = image.getOffsetX();

			float f_45_ = index % 16 * maximumDimension;
			float f_46_ = index / 16 * maximumDimension;
			float f_47_ = f_45_ * f;
			float f_48_ = f_46_ * f_40_;
			float f_49_ = (f_45_ + width) * f;
			float f_50_ = (f_46_ + height) * f_40_;

			buffer.putFloat(dx);
			buffer.putFloat(dy);
			buffer.putFloat(0.0F);
			buffer.putFloat(f_47_);
			buffer.putFloat(f_48_);
			buffer.putFloat(dx);
			buffer.putFloat(dy + height);
			buffer.putFloat(0.0F);
			buffer.putFloat(f_47_);
			buffer.putFloat(f_50_);
			buffer.putFloat(dx + width);
			buffer.putFloat(dy + height);
			buffer.putFloat(0.0F);
			buffer.putFloat(f_49_);
			buffer.putFloat(f_50_);
			buffer.putFloat(dx + width);
			buffer.putFloat(dy);
			buffer.putFloat(0.0F);
			buffer.putFloat(f_49_);
			buffer.putFloat(f_48_);
		}

		anInterface32_8837.read(0, buffer.position(), toolkit.aLong9268);
		for (int index = 0; index < 256; index++) {
			Image image = images[index];
			offsets[index * 2] = (byte) image.getOffsetX();
			offsets[index * 2 + 1] = (byte) image.getOffsetY();
		}
	}

	@Override
	void renderCharacter(char character, int x, int y, int colour, boolean mono) {
		if (toolkit.method14715() != Class306.aClass306_3313) {
			x += offsets[character * '\002'];
			y += offsets[character * '\002' + '\001'];

			toolkit.aClass346_9366.method5910(x, y, x + maximumDimension, y + maximumDimension, character % '\020'
					/ 16.0F * texture.method187(), character / '\020' / 16.0F * texture.method184(),
					(character % '\020' + '\001') / 16.0F * texture.method187(), (character / '\020' + '\001') / 16.0F
							* texture.method184(), texture, colour);
		} else {
			toolkit.method14741();
			toolkit.method14893(1);
			Class299 class299 = toolkit.aClass299_9370;
			class299.anInterface29_3282 = texture;
			class299.method5448(0, colour);
			float width = toolkit.method2628().getWidth();
			float height = toolkit.method2628().getHeight();
			class299.aClass399_3284.method6551(2.0F / width, 2.0F / height, 1.0F, 1.0F);
			class299.aClass399_3284.array[12] = (x + toolkit.method14608()) * 2.0F / width - 1.0F;
			class299.aClass399_3284.array[13] = (y + toolkit.method14608()) * 2.0F / height - 1.0F;
			class299.aClass399_3284.array[14] = -1.0F;
			class299.aClass399_3281.toIdentity();
			class299.anInterface32_3287 = anInterface32_8837;
			class299.anInt3289 = character * '\004';
			class299.aClass323_3288 = toolkit.aClass323_9423;
			class299.method5453();
		}
	}

	@Override
	void renderCharacter(char c, int i, int i_51_, int i_52_, boolean bool, ClippingMask clipping, int i_53_, int i_54_) {

	}

}