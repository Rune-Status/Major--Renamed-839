package com.jagex;

public class MapSceneDefinition implements Definition {

	public static MapSceneDefinitionLoader loader;
	public boolean aBool292 = false;
	public int colour;
	public int sprite;
	int[] argb;
	BaseMapSceneDefinitionProvider provider;

	MapSceneDefinition(int id, BaseMapSceneDefinitionProvider provider) {
		this.provider = provider;
	}

	public int[] argb(Toolkit toolkit, int rotations, boolean flipHorizontal) {
		if (argb != null) {
			return argb;
		}

		long id = -1706425343 * sprite | rotations << 16 | (flipHorizontal ? 262144 : 0) | 976039213 * toolkit.id << 19;
		loadSprite(toolkit, rotations, flipHorizontal, id);
		return argb;
	}

	@Override
	public void decode(Buffer buffer) {
		for (;;) {
			int opcode = buffer.readUByte();
			if (0 == opcode) {
				break;
			}

			decode(buffer, opcode);
		}
	}

	public Sprite getSprite(Toolkit toolkit, int rotations, boolean flipHorizontal) {
		long id = -1706425343 * sprite | rotations << 16 | (flipHorizontal ? 262144 : 0) | 976039213 * toolkit.id << 19;
		Sprite sprite = provider.sprites.get(id);
		if (sprite != null) {
			return sprite;
		}

		loadSprite(toolkit, rotations, flipHorizontal, id);
		return provider.sprites.get(id);
	}

	public boolean loaded() {
		return provider.images.fileLoaded(-1706425343 * sprite);
	}

	@Override
	public void method35() {

	}

	void decode(Buffer buffer, int opcode) {
		if (1 == opcode) {
			sprite = buffer.readSmart32() * 1975909377;
		} else if (2 == opcode) {
			colour = buffer.readUTriByte() * 142576029;
		} else if (opcode == 3) {
			aBool292 = true;
		} else if (opcode == 4) {
			sprite = -1975909377;
		}
	}

	void loadSprite(Toolkit toolkit, int rotations, boolean flipHorizontal, long id) {
		if (provider.images.fileLoaded(sprite * -1706425343)) {
			Image image = ImageUtils.loadFirst(provider.images, sprite * -1706425343, 0);
			if (image != null) {
				image.clearOffsets();

				if (flipHorizontal) {
					image.flipHorizontal();
				}

				for (int rotation = 0; rotation < rotations; rotation++) {
					image.rotateClockwise();
				}

				argb = image.argb(false);
				if (0 != colour * 1249789109) {
					int red = (1249789109 * colour & 0xff0000) >> 16;
					int green = (colour * 1249789109 & 0xff00) >> 8;
					int blue = 1249789109 * colour & 0xff;

					for (int index = 0; index < argb.length; index++) {
						int alpha = argb[index] >> 24 & 0xff;
						int inverseAlpha = 256 - alpha;

						if (0 != alpha) {
							int r = (argb[index] & 0xff0000) * red * -16777216;
							int g = green * (argb[index] & 0xff00) * 16711680;
							int b = 65280 * blue * (argb[index] & 0xff);
							int rgb = (r | g | b) >>> 8;

							if (alpha == 255) {
								argb[index] = rgb;
							} else {
								int existing = argb[index];
								argb[index] = alpha << 24
										| (alpha * (existing & 0xff00) + inverseAlpha * (rgb & 0xff00) & 0xff0000)
												+ ((rgb & 0xff00ff) * inverseAlpha + alpha * (existing & 0xff00ff) & ~0xff00ff) >> 8;
							}
						}
					}
				}
			}

			Sprite sprite = toolkit.createSprite(image, true);
			if (sprite != null) {
				provider.sprites.put(id, sprite);
			}
		}
	}

}