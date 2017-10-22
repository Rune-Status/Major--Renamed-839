package com.jagex;

public class QuestDefinition implements Definition {

	public static float method4406(Class395 class395) {
		Class397 class397 = Class397.create(0.0F, 0.0F, 1.0F);
		class397.method6480(class395);
		double angle = Math.atan2(class397.x, class397.z);
		class397.cache();
		if (angle < 0.0) {
			angle += 2 * Math.PI;
		}
		return (float) angle;
	}

	int[] anIntArray2586;
	public String aString2587;
	public String aString2588;
	int[][] anIntArrayArray2589;
	public int[] anIntArray2590;
	public int anInt2591 = 0;
	public int anInt2592 = 0;
	public boolean aBool2593 = false;
	public int anInt2594;
	int[] anIntArray2595;
	public int[] anIntArray2596;
	int[] anIntArray2597;
	int[][] anIntArrayArray2598;
	public int[] anIntArray2599;
	DefinitionLoader<QuestDefinition> questLoader;
	int[] anIntArray2601;
	public String[] aStringArray2602;
	public int anInt2603;
	HashTable parameters;
	int[] anIntArray2605;
	public String[] aStringArray2606;
	public int[][] anIntArrayArray2607;
	public int anInt2608 = 94438709;
	public static QuestDefinitionLoader loader;

	QuestDefinition(int id, DefinitionLoader<QuestDefinition> loader) {
		questLoader = loader;
	}

	@Override
	public void method35() {
		if (null == aString2588) {
			aString2588 = aString2587;
		}
	}

	@Override
	public void decode(Buffer buffer) {
		for (;;) {
			int opcode = buffer.readUByte();
			if (opcode == 0) {
				break;
			}

			decode(buffer, opcode);
		}
	}

	public int getParameter(int id, int defaultValue) {
		if (null == parameters) {
			return defaultValue;
		}
		LinkableInt linkable = (LinkableInt) parameters.get(id);
		if (linkable == null) {
			return defaultValue;
		}

		return linkable.value * -1189875169;
	}

	public boolean method4375(VariableProvider provider) {
		if (null != anIntArrayArray2589) {
			for (int[] varps : anIntArrayArray2589) {
				BaseVariableParameterDefinition varp = ((VariableLoader) provider).getVarp(VarpType.PLAYER, varps[0]);
				if (provider.getVarp(varp) >= varps[2]) {
					return true;
				}
			}
		}

		if (null != anIntArrayArray2598) {
			for (int[] varbits : anIntArrayArray2598) {
				VariableBitsDefinition varbit = ((VariableLoader) provider).getVarbit(varbits[0]);
				if (provider.getVarbit(varbit) >= varbits[2]) {
					return true;
				}
			}
		}

		return false;
	}

	public String getParameter(int id, String defaultValue) {
		if (null == parameters) {
			return defaultValue;
		}

		LinkableObject linkable = (LinkableObject) parameters.get(id);
		if (linkable == null) {
			return defaultValue;
		}

		return (String) linkable.object;
	}

	public boolean method4380(VariableProvider provider) {
		if (MovementType.method10453(provider, questLoader) < 2106198419 * anInt2594) {
			return false;
		}

		if (null != anIntArrayArray2607) {
			for (int[] element : anIntArrayArray2607) {
				if (((Interface65) provider).method410(element[0]) < element[1]) {
					return false;
				}
			}
		}

		if (anIntArray2590 != null) {
			for (int index = 0; index < anIntArray2590.length; index++) {
				if (!questLoader.get(anIntArray2590[index]).method4375(provider)) {
					return false;
				}
			}
		}

		if (null != anIntArray2599) {
			for (int index = 0; index < anIntArray2599.length; index++) {
				BaseVariableParameterDefinition varp = ((VariableLoader) provider).getVarp(VarpType.PLAYER,
						anIntArray2599[index]);
				int value = provider.getVarp(varp);
				if (value < anIntArray2597[index] || value > anIntArray2601[index]) {
					return false;
				}
			}
		}

		if (null != anIntArray2596) {
			for (int index = 0; index < anIntArray2596.length; index++) {
				VariableBitsDefinition varbit = ((VariableLoader) provider).getVarbit(anIntArray2596[index]);
				int value = provider.getVarbit(varbit);

				if (value < anIntArray2586[index] || value > anIntArray2605[index]) {
					return false;
				}
			}
		}

		return true;
	}

	public boolean method4381(VariableProvider provider) {
		return MovementType.method10453(provider, questLoader) >= 2106198419 * anInt2594;
	}

	public boolean method4384(VariableProvider provider, int i) {
		if (anIntArray2599 == null || i < 0 || i >= anIntArray2599.length) {
			return false;
		}

		BaseVariableParameterDefinition varp = ((VariableLoader) provider).getVarp(VarpType.PLAYER, anIntArray2599[i]);
		int value = provider.getVarp(varp);
		return !(value < anIntArray2597[i] || value > anIntArray2601[i]);
	}

	public boolean method4385(VariableProvider provider, int i, int i_32_) {
		if (null == anIntArray2596 || i < 0 || i >= anIntArray2596.length) {
			return false;
		}

		VariableBitsDefinition varbit = ((VariableLoader) provider).getVarbit(anIntArray2596[i]);
		int value = provider.getVarbit(varbit);
		return !(value < anIntArray2586[i] || value > anIntArray2605[i]);
	}

	public boolean method4386(VariableProvider provider, int i) {
		if (null == anIntArrayArray2607 || i < 0 || i >= anIntArrayArray2607.length) {
			return false;
		}
		return ((Interface65) provider).method410(anIntArrayArray2607[i][0]) >= anIntArrayArray2607[i][1];
	}

	public boolean method4389(VariableProvider provider, int i) {
		if (anIntArray2590 == null || i < 0 || i >= anIntArray2590.length) {
			return false;
		}
		return questLoader.get(anIntArray2590[i]).method4375(provider);
	}

	public boolean method4397(VariableProvider provider) {
		if (null != anIntArrayArray2589) {
			for (int[] values : anIntArrayArray2589) {
				BaseVariableParameterDefinition varp = ((VariableLoader) provider).getVarp(VarpType.PLAYER, values[0]);
				if (provider.getVarp(varp) >= values[1]) {
					return true;
				}
			}
		}
		if (anIntArrayArray2598 != null) {
			for (int[] values : anIntArrayArray2598) {
				VariableBitsDefinition varbit = ((VariableLoader) provider).getVarbit(values[0]);
				if (provider.getVarbit(varbit) >= values[1]) {
					return true;
				}
			}
		}
		return false;
	}

	void decode(Buffer buffer, int opcode) {
		if (opcode == 1) {
			aString2587 = buffer.readPrefixedString();
		} else if (opcode == 2) {
			aString2588 = buffer.readPrefixedString();
		} else if (3 == opcode) {
			int count = buffer.readUByte();
			anIntArrayArray2589 = new int[count][3];

			for (int index = 0; index < count; index++) {
				anIntArrayArray2589[index][0] = buffer.readUShort();
				anIntArrayArray2589[index][1] = buffer.readInt();
				anIntArrayArray2589[index][2] = buffer.readInt();
			}
		} else if (opcode == 4) {
			int count = buffer.readUByte();
			anIntArrayArray2598 = new int[count][3];

			for (int index = 0; index < count; index++) {
				anIntArrayArray2598[index][0] = buffer.readUShort();
				anIntArrayArray2598[index][1] = buffer.readInt();
				anIntArrayArray2598[index][2] = buffer.readInt();
			}
		} else if (5 == opcode) {
			buffer.readUShort();
		} else if (opcode == 6) {
			anInt2591 = buffer.readUByte() * 170231021;
		} else if (7 == opcode) {
			anInt2592 = buffer.readUByte() * 273305943;
		} else if (opcode == 8) {
			aBool2593 = true;
		} else if (9 == opcode) {
			anInt2603 = buffer.readUByte() * 1198134663;
		} else if (opcode == 10) {
			int count = buffer.readUByte();
			anIntArray2595 = new int[count];

			for (int index = 0; index < count; index++) {
				anIntArray2595[index] = buffer.readInt();
			}
		} else if (12 == opcode) {
			buffer.readInt();
		} else if (opcode == 13) {
			int count = buffer.readUByte();
			anIntArray2590 = new int[count];

			for (int index = 0; index < count; index++) {
				anIntArray2590[index] = buffer.readUShort();
			}
		} else if (opcode == 14) {
			int count = buffer.readUByte();
			anIntArrayArray2607 = new int[count][2];

			for (int index = 0; index < count; index++) {
				anIntArrayArray2607[index][0] = buffer.readUByte();
				anIntArrayArray2607[index][1] = buffer.readUByte();
			}
		} else if (opcode == 15) {
			anInt2594 = buffer.readUShort() * 900955291;
		} else if (opcode == 17) {
			anInt2608 = buffer.readSmart32() * -94438709;
		} else if (18 == opcode) {
			int count = buffer.readUByte();
			anIntArray2599 = new int[count];
			anIntArray2597 = new int[count];
			anIntArray2601 = new int[count];
			aStringArray2602 = new String[count];

			for (int index = 0; index < count; index++) {
				anIntArray2599[index] = buffer.readInt();
				anIntArray2597[index] = buffer.readInt();
				anIntArray2601[index] = buffer.readInt();
				aStringArray2602[index] = buffer.readString();
			}
		} else if (19 == opcode) {
			int index = buffer.readUByte();
			anIntArray2596 = new int[index];
			anIntArray2586 = new int[index];
			anIntArray2605 = new int[index];
			aStringArray2606 = new String[index];

			for (int count = 0; count < index; count++) {
				anIntArray2596[count] = buffer.readInt();
				anIntArray2586[count] = buffer.readInt();
				anIntArray2605[count] = buffer.readInt();
				aStringArray2606[count] = buffer.readString();
			}
		} else if (249 == opcode) {
			int count = buffer.readUByte();
			if (parameters == null) {
				int size = HashTable.nextPowerOfTwo(count);
				parameters = new HashTable(size);
			}
			for (int i = 0; i < count; i++) {
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