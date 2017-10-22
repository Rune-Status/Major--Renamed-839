package com.jagex;

public class Class224 implements Definition {
	public static final int anInt2300 = 0;
	public static final int anInt2306 = 1;
	public static final int anInt2307 = 2;
	static long aLong2344;

	public boolean aBool2311;
	public boolean aBool2330;
	public boolean aBool2340;
	public byte[] aByteArray2323;
	public Class203 aClass203_2341;
	public Class220 aClass220_2336;
	public int anInt2296;
	public int anInt2299 = 563500359;
	public int anInt2302;
	public int anInt2303;
	public int anInt2304;
	public int anInt2305 = -684224003;
	public int anInt2308;
	public int anInt2309;
	public int anInt2310;
	public int anInt2319;
	public int anInt2326;
	public int anInt2327;
	public int anInt2328;
	public int anInt2331;
	public int anInt2332;
	public int anInt2333;
	public int anInt2335;
	public int anInt2338;
	public int anInt2339;
	public int anInt2343;
	public int[] anIntArray2324;
	public int[] anIntArray2337;
	public String aString2301;
	public String aString2313;
	public String[] aStringArray2312;
	public int id;
	public int[] morphisms;
	int anInt2314;
	int anInt2315;
	int anInt2316;
	int anInt2320;
	int anInt2321;
	int anInt2322;
	int anInt2334;
	DefinitionLoader<Class224> loader;
	HashTable parameters;
	Class222 provider;
	int varbit;
	int varp;

	Class224(int id, DefinitionLoader loader, Class222 provider) {
		anInt2304 = -1147310301;
		aBool2330 = true;
		aStringArray2312 = new String[5];
		anInt2314 = 1308811019;
		anInt2315 = 1966455807;
		anInt2316 = -1198474499;
		varbit = -605362735;
		varp = 1306255143;
		anInt2321 = 1934481493;
		anInt2322 = -904614049;
		morphisms = null;
		anInt2310 = -762579031;
		anInt2326 = -1995361371;
		anInt2327 = -2147483648;
		anInt2328 = -2147483648;
		anInt2343 = 2018069775;
		anInt2331 = -782625547;
		anInt2332 = -1704690617;
		aClass203_2341 = Class203.aClass203_2122;
		aClass220_2336 = Class220.aClass220_2273;
		anInt2339 = -1475361775;
		aBool2340 = true;
		anInt2303 = 1724575175;
		anInt2296 = 1383124109;
		this.id = -1259381201 * id;
		this.loader = loader;
		this.provider = provider;
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

	public int getParameter(int id, int defaultValue) {
		if (parameters == null) {
			return defaultValue;
		}

		LinkableInt linkable = (LinkableInt) parameters.get(id);
		if (linkable == null) {
			return defaultValue;
		}

		return linkable.value * -1189875169;
	}

	public String getParameter(int id, String defaultValue) {
		if (null == parameters) {
			return defaultValue;
		}

		LinkableObject linkable = (LinkableObject) parameters.get(id);
		if (null == linkable) {
			return defaultValue;
		}

		return (String) linkable.object;
	}

	@Override
	public void method35() {
		if (anIntArray2324 != null) {
			for (int i_20_ = 0; i_20_ < anIntArray2324.length; i_20_ += 2) {
				if (anIntArray2324[i_20_] < -280927385 * anInt2310) {
					anInt2310 = anIntArray2324[i_20_] * -1384904617;
				} else if (anIntArray2324[i_20_] > 1010267847 * anInt2327) {
					anInt2327 = 809659127 * anIntArray2324[i_20_];
				}
				if (anIntArray2324[i_20_ + 1] < anInt2326 * -2101247021) {
					anInt2326 = anIntArray2324[i_20_ + 1] * -152122277;
				} else if (anIntArray2324[i_20_ + 1] > anInt2328 * -1478762713) {
					anInt2328 = 1708236951 * anIntArray2324[1 + i_20_];
				}
			}
		}
	}

	public boolean method4205(VariableLoader loader, VariableProvider provider) {
		int index = -1;
		if (varp * -1607573655 != -1) {
			BaseVariableParameterDefinition parameter = loader.getVarp(VarpType.PLAYER, -1607573655 * varp);
			index = provider.getVarp(parameter);
		} else if (-1 != -312709937 * varbit) {
			VariableBitsDefinition variable = loader.getVarbit(varbit * -312709937);
			index = provider.getVarbit(variable);
		} else {
			return true;
		}

		if (morphisms == null) {
			if (index < anInt2315 * -1757037567 || index > anInt2316 * 1006194091) {
				return false;
			}
		} else {
			if (index < 0 || index >= morphisms.length - 1) {
				int i_15_ = morphisms[morphisms.length - 1];
				if (-1 != i_15_) {
					if (-1 != -1757037567 * anInt2315 && -1 != 1006194091 * anInt2316
							&& (index < anInt2315 * -1757037567 || index > anInt2316 * 1006194091)) {
						return false;
					}
				} else {
					return false;
				}
			}

			if (-1 == morphisms[index]) {
				return false;
			}
		}

		int value;
		if (-1538616479 * anInt2322 != -1) {
			BaseVariableParameterDefinition variable = loader.getVarp(VarpType.PLAYER, anInt2322 * -1538616479);
			value = provider.getVarp(variable);
		} else if (anInt2321 * 447716099 != -1) {
			VariableBitsDefinition variable = loader.getVarbit(anInt2321 * 447716099);
			value = provider.getVarbit(variable);
		} else {
			return true;
		}

		return !(value < 508235809 * anInt2334 || value > -57741519 * anInt2320);
	}

	public Sprite method4207(Toolkit toolkit, boolean bool) {
		int id = bool ? 823274667 * anInt2305 : anInt2299 * 1584610185;
		int key = id | toolkit.id * 976039213 << 29;

		Sprite sprite = provider.cache.get(key);
		if (null != sprite) {
			return sprite;
		}

		if (!provider.images.fileLoaded(id)) {
			return null;
		}

		Image image = ImageUtils.loadFirst(provider.images, id, 0);
		if (null != image) {
			sprite = toolkit.createSprite(image, true);
			provider.cache.put(key, sprite);
		}

		return sprite;
	}

	public Sprite method4208(Toolkit toolkit) {
		int id = -667407941 * anInt2296 | toolkit.id * 976039213 << 29;
		Sprite sprite = provider.cache.get(id);
		if (sprite != null) {
			return sprite;
		}

		if (!provider.images.fileLoaded(anInt2296 * -667407941)) {
			return null;
		}

		Image image = ImageUtils.loadFirst(provider.images, -667407941 * anInt2296, 0);
		if (image != null) {
			sprite = toolkit.createSprite(image, true);
			provider.cache.put(id, sprite);
		}

		return sprite;
	}

	public final Class224 method4211(VariableLoader loader, VariableProvider provider) {
		int index = -1;
		if (-312709937 * varbit != -1) {
			VariableBitsDefinition variable = loader.getVarbit(-312709937 * varbit);
			if (variable != null) {
				index = provider.getVarbit(variable);
			}
		} else if (-1 != -1607573655 * varp) {
			BaseVariableParameterDefinition variable = loader.getVarp(VarpType.PLAYER, -1607573655 * varp);
			if (variable != null) {
				index = provider.getVarp(variable);
			}
		}

		if (index < 0 || index >= morphisms.length - 1) {
			int id = morphisms[morphisms.length - 1];
			if (-1 != id) {
				return this.loader.get(id);
			}

			return null;
		}

		if (-1 == morphisms[index]) {
			return null;
		}

		return this.loader.get(morphisms[index]);
	}

	public Sprite method4220(Toolkit toolkit) {
		Sprite sprite = provider.cache.get(1036946269 * anInt2314 | 0x20000 | toolkit.id * 976039213 << 29);
		if (sprite != null) {
			return sprite;
		}

		provider.images.fileLoaded(anInt2314 * 1036946269);
		Image image = ImageUtils.loadFirst(provider.images, 1036946269 * anInt2314, 0);
		if (null != image) {
			sprite = toolkit.createSprite(image, true);
			provider.cache.put(anInt2314 * 1036946269 | 0x20000 | 976039213 * toolkit.id << 29, sprite);
		}

		return sprite;
	}

	void decode(Buffer buffer, int opcode) {
		if (1 == opcode) {
			anInt2299 = buffer.readSmart32() * -563500359;
		} else if (opcode == 2) {
			anInt2305 = buffer.readSmart32() * 684224003;
		} else if (opcode == 3) {
			aString2301 = buffer.readString();
		} else if (4 == opcode) {
			anInt2302 = buffer.readUTriByte() * -1411440837;
		} else if (opcode == 5) {
			anInt2304 = buffer.readUTriByte() * 1147310301;
		} else if (6 == opcode) {
			anInt2335 = buffer.readUByte() * -907883215;
		} else if (opcode == 7) {
			int i_1_ = buffer.readUByte();
			if (0 == (i_1_ & 0x1)) {
				aBool2330 = false;
			}

			if ((i_1_ & 0x2) == 2) {
				aBool2311 = true;
			}
		} else if (8 == opcode) {
			buffer.readUByte();
		} else if (9 == opcode) {
			varbit = buffer.readUShort() * 605362735;
			if (65535 == -312709937 * varbit) {
				varbit = -605362735;
			}

			varp = buffer.readUShort() * -1306255143;
			if (varp * -1607573655 == 65535) {
				varp = 1306255143;
			}

			anInt2315 = buffer.readInt() * -1966455807;
			anInt2316 = buffer.readInt() * 1198474499;
		} else if (opcode >= 10 && opcode <= 14) {
			aStringArray2312[opcode - 10] = buffer.readString();
		} else if (15 == opcode) {
			int count = buffer.readUByte();
			anIntArray2324 = new int[count * 2];
			for (int index = 0; index < 2 * count; index++) {
				anIntArray2324[index] = buffer.readShort();
			}

			anInt2319 = buffer.readInt() * -860063171;
			int length = buffer.readUByte();
			anIntArray2337 = new int[length];

			for (int index = 0; index < anIntArray2337.length; index++) {
				anIntArray2337[index] = buffer.readInt();
			}

			aByteArray2323 = new byte[count];
			for (int index = 0; index < count; index++) {
				aByteArray2323[index] = buffer.readByte();
			}
		} else if (16 == opcode) {
			aBool2340 = false;
		} else if (17 == opcode) {
			aString2313 = buffer.readString();
		} else if (opcode == 18) {
			anInt2314 = buffer.readSmart32() * -1308811019;
		} else if (opcode == 19) {
			anInt2303 = buffer.readUShort() * -1724575175;
		} else if (opcode == 20) {
			anInt2321 = buffer.readUShort() * -1934481493;
			if (65535 == 447716099 * anInt2321) {
				anInt2321 = 1934481493;
			}

			anInt2322 = buffer.readUShort() * 904614049;
			if (-1538616479 * anInt2322 == 65535) {
				anInt2322 = -904614049;
			}

			anInt2334 = buffer.readInt() * 1321759713;
			anInt2320 = buffer.readInt() * 432409041;
		} else if (opcode == 21) {
			anInt2309 = buffer.readInt() * -1793914333;
		} else if (opcode == 22) {
			anInt2308 = buffer.readInt() * -1055992051;
		} else if (23 == opcode) {
			anInt2343 = buffer.readUByte() * -2018069775;
			anInt2331 = buffer.readUByte() * 782625547;
			anInt2332 = buffer.readUByte() * 1704690617;
		} else if (24 == opcode) {
			anInt2333 = buffer.readShort() * 749659719;
			anInt2338 = buffer.readShort() * 318332385;
		} else if (25 == opcode) {
			anInt2296 = buffer.readSmart32() * -1383124109;
		} else if (opcode == 26 || opcode == 27) {
			varbit = buffer.readUShort() * 605362735;
			if (65535 == -312709937 * varbit) {
				varbit = -605362735;
			}

			varp = buffer.readUShort() * -1306255143;
			if (varp * -1607573655 == 65535) {
				varp = 1306255143;
			}

			int last = -1;
			if (opcode == 27) {
				last = buffer.readUShort();
				if (65535 == last) {
					last = -1;
				}
			}

			int count = buffer.readUByte();
			morphisms = new int[count + 2];
			for (int index = 0; index <= count; index++) {
				morphisms[index] = buffer.readUShort();

				if (morphisms[index] == 65535) {
					morphisms[index] = -1;
				}
			}

			morphisms[count + 1] = last;
		} else if (28 == opcode) {
			anInt2339 = buffer.readUByte() * 1475361775;
		} else if (opcode == 29) {
			aClass203_2341 = CompressionType.findIdentifiable(Class203.values(), buffer.readUByte());
		} else if (opcode == 30) {
			aClass220_2336 = CompressionType.findIdentifiable(Class220.values(), buffer.readUByte());
		} else if (249 == opcode) {
			int count = buffer.readUByte();
			if (null == parameters) {
				int size = HashTable.nextPowerOfTwo(count);
				parameters = new HashTable(size);
			}

			for (int index = 0; index < count; index++) {
				boolean string = buffer.readUByte() == 1;
				int id = buffer.readUTriByte();
				Linkable linkable;

				if (string) {
					linkable = new LinkableObject(buffer.readString());
				} else {
					linkable = new LinkableInt(buffer.readInt());
				}

				parameters.put(id, linkable);
			}
		}
	}

}