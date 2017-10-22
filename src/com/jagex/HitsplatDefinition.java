package com.jagex;

public class HitsplatDefinition implements Definition {
	public static final int anInt7231 = -1;
	public static final int anInt7232 = 0;
	static final int anInt7235 = 70;
	static final int anInt7238 = 16777215;
	public static final int anInt7246 = 1;
	static int anInt7257;

	BaseHitsplatDefinitionProvider provider;
	int left;
	public int fade;
	public int offsetX;
	public boolean aBool7236 = false;
	public int font = -1793955935;
	public int duration;
	int icon;
	public int anInt7241;
	public int textColour = -990489187;
	DefinitionLoader<HitsplatDefinition> hitsplatLoader;
	int middle;
	public int offsetY;
	String amount;
	public int comparisonType;
	int right;
	int anInt7250;
	public int anInt7251;
	public int[] morphisms;
	int varbit;
	int varp;
	public int anInt7255;
	int anInt7256;
	public static HitsplatDefinitionLoader loader;

	HitsplatDefinition(int id, BaseHitsplatDefinitionProvider provider, DefinitionLoader<HitsplatDefinition> loader) {
		duration = 192890934;
		icon = 1609225663;
		middle = -2118873849;
		left = -407679737;
		right = -2050178579;
		fade = 1734769161;
		amount = "";
		comparisonType = -1867959515;
		varbit = 150108041;
		varp = -1817207983;
		anInt7250 = -1558387119;
		anInt7256 = 1475933291;
		this.provider = provider;
		hitsplatLoader = loader;
	}

	@Override
	public void method35() {

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

	public final HitsplatDefinition method9036(VariableLoader interface14, VariableProvider interface12) {
		int index = -1;
		if (null == morphisms) {
			return this;
		}

		if (interface14 == null || null == interface12) {
			return null;
		}

		if (-1 != 1935331655 * varbit) {
			VariableBitsDefinition bits = interface14.getVarbit(varbit * 1935331655);
			if (bits != null) {
				index = interface12.getVarbit(bits);
			}
		} else if (-1 != -1139445169 * varp) {
			BaseVariableParameterDefinition class131 = interface14.getVarp(VarpType.PLAYER, -1139445169 * varp);
			if (class131 != null) {
				index = interface12.getVarp(class131);
			}
		}

		if (index < 0 || index >= morphisms.length - 1) {
			int id = morphisms[morphisms.length - 1];

			if (-1 != id) {
				return hitsplatLoader.get(id);
			}
			return null;
		}

		if (morphisms[index] == -1) {
			return null;
		}

		return hitsplatLoader.get(morphisms[index]);
	}

	public String formatAmount(int amount) {
		String string = this.amount;
		amount = amount * -1441914191 * anInt7250 / (-196470717 * anInt7256);
		for (;;) {
			int index = string.indexOf("%1");
			if (index < 0) {
				break;
			}

			string = string.substring(0, index) + Class452.decimalToString(amount, false) + string.substring(index + 2);
		}

		return string;
	}

	public Sprite getIconSprite(Toolkit toolkit) {
		if (icon * -1417681471 < 0) {
			return null;
		}

		Sprite sprite = (Sprite) provider.cache.get(-1417681471 * icon);
		if (null == sprite) {
			cacheSprites(toolkit);
			sprite = (Sprite) provider.cache.get(icon * -1417681471);
		}
		return sprite;
	}

	public Sprite getMiddleSprite(Toolkit toolkit) {
		if (-989548727 * middle < 0) {
			return null;
		}

		Sprite sprite = (Sprite) provider.cache.get(middle * -989548727);
		if (null == sprite) {
			cacheSprites(toolkit);
			sprite = (Sprite) provider.cache.get(-989548727 * middle);
		}
		return sprite;
	}

	public Sprite getRightSprite(Toolkit toolkit) {
		if (-1891353573 * right < 0) {
			return null;
		}

		Sprite sprite = (Sprite) provider.cache.get(-1891353573 * right);
		if (null == sprite) {
			cacheSprites(toolkit);
			sprite = (Sprite) provider.cache.get(-1891353573 * right);
		}

		return sprite;
	}

	public Sprite getLeftSprite(Toolkit toolkit) {
		if (left * -8425655 < 0) {
			return null;
		}

		Sprite sprite = (Sprite) provider.cache.get(left * -8425655);
		if (sprite == null) {
			cacheSprites(toolkit);
			sprite = (Sprite) provider.cache.get(left * -8425655);
		}

		return sprite;
	}

	void decode(Buffer buffer, int opcode) {
		if (opcode == 1) {
			font = buffer.readSmart32() * 1793955935;
		} else if (2 == opcode) {
			textColour = buffer.readUTriByte() * -1643533725;
			aBool7236 = true;
		} else if (opcode == 3) {
			icon = buffer.readSmart32() * -1609225663;
		} else if (4 == opcode) {
			left = buffer.readSmart32() * 407679737;
		} else if (opcode == 5) {
			middle = buffer.readSmart32() * 2118873849;
		} else if (opcode == 6) {
			right = buffer.readSmart32() * 2050178579;
		} else if (7 == opcode) {
			offsetX = buffer.readShort() * -490424841;
		} else if (8 == opcode) {
			amount = buffer.readPrefixedString();
		} else if (9 == opcode) {
			duration = buffer.readUShort() * -1469804631;
		} else if (opcode == 10) {
			offsetY = buffer.readShort() * 1388317683;
		} else if (11 == opcode) {
			fade = 0;
		} else if (opcode == 12) {
			comparisonType = buffer.readUByte() * 1867959515;
		} else if (13 == opcode) {
			anInt7241 = buffer.readShort() * 1456196935;
		} else if (14 == opcode) {
			fade = buffer.readUShort() * -1734769161;
		} else if (16 == opcode) {
			anInt7251 = buffer.readShort() * -123221589;
			anInt7255 = buffer.readShort() * 1068610351;
		} else if (17 == opcode || opcode == 18) {
			varbit = buffer.readUShort() * -150108041;
			if (65535 == 1935331655 * varbit) {
				varbit = 150108041;
			}

			varp = buffer.readUShort() * 1817207983;
			if (-1139445169 * varp == 65535) {
				varp = -1817207983;
			}

			int last = -1;
			if (opcode == 18) {
				last = buffer.readUShort();
				if (last == 65535) {
					last = -1;
				}
			}

			int count = buffer.readUByte();
			morphisms = new int[2 + count];
			for (int index = 0; index <= count; index++) {
				morphisms[index] = buffer.readUShort();
				if (65535 == morphisms[index]) {
					morphisms[index] = -1;
				}
			}

			morphisms[1 + count] = last;
		} else if (19 == opcode) {
			anInt7250 = buffer.readUShort() * -1558387119;
		} else if (20 == opcode) {
			anInt7256 = buffer.readUShort() * 1475933291;
		}
	}

	void cacheSprites(Toolkit toolkit) {
		Archive images = provider.images;
		if (icon * -1417681471 >= 0 && provider.cache.get(icon * -1417681471) == null
				&& images.fileLoaded(icon * -1417681471)) {

			Image image = ImageUtils.loadFirst(images, icon * -1417681471);
			provider.cache.put(-1417681471 * icon, toolkit.createSprite(image, true));
		}

		if (-989548727 * middle >= 0 && provider.cache.get(-989548727 * middle) == null
				&& images.fileLoaded(-989548727 * middle)) {
			Image image = ImageUtils.loadFirst(images, middle * -989548727);
			provider.cache.put(middle * -989548727, toolkit.createSprite(image, true));
		}

		if (left * -8425655 >= 0 && provider.cache.get(left * -8425655) == null
				&& images.fileLoaded(left * -8425655)) {
			Image image = ImageUtils.loadFirst(images, -8425655 * left);
			provider.cache.put(left * -8425655, toolkit.createSprite(image, true));
		}

		if (-1891353573 * right >= 0 && provider.cache.get(-1891353573 * right) == null
				&& images.fileLoaded(-1891353573 * right)) {
			Image image = ImageUtils.loadFirst(images, right * -1891353573);
			provider.cache.put(right * -1891353573, toolkit.createSprite(image, true));
		}
	}

}