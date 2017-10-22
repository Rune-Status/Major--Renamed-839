package com.jagex;

public class CustomisedItem {
	static final int anInt8486 = 1;
	static final int anInt8487 = 2;
	static final int anInt8489 = 8;
	static final int anInt8490 = 4;
	static final int anInt8493 = 2;

	public static void method13893(IcmpServiceListener interface68) {
		if (null == NotifyingIcmpService.service) {
			throw new IllegalStateException("");
		}
		NotifyingIcmpService.service.listeners.add(interface68);
	}

	public static Class480_Sub22 method13894(Class480_Sub22 class480_sub22, int i) {
		synchronized (Class480_Sub22.cache) {
			if (Class480_Sub22.remainingCache * 1412746033 == 0) {
				Class480_Sub22 class480_sub22_3_ = new Class480_Sub22(class480_sub22);
				return class480_sub22_3_;
			}
			Class480_Sub22.cache[(Class480_Sub22.remainingCache -= -612979247) * 1412746033].copyFrom(class480_sub22);
			Class480_Sub22 class480_sub22_4_ = Class480_Sub22.cache[1412746033 * Class480_Sub22.remainingCache];
			return class480_sub22_4_;
		}
	}

	static final void method13891(ScriptExecutionContext class613, int i) {
		String string = (String) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
		OutgoingFrame class480_sub15 = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_3957,
				Client.gameConnection.encryptor);
		class480_sub15.payload.writeByte(string.length() + 1);
		class480_sub15.payload.writeCString(string);
		Client.gameConnection.sendFrame(class480_sub15);
	}

	static final void method13892(int i, int i_0_, int i_1_, boolean bool) {
		if (Widget.loadInterface(i, null)) {
			Class264.method5001(Class598.loadedInterfaces[i].children, -1, i_0_, i_1_, bool);
		}
	}

	public int[] femaleHeadModels;
	public short[] replacementColours;
	public int[] maleModels;
	public int[] maleHeadModels;
	public int[] femaleModels = new int[3];
	public short[] replacementTextures;

	CustomisedItem(ItemDefinition definition) {
		maleModels = new int[3];
		femaleHeadModels = new int[2];
		maleHeadModels = new int[2];
		femaleModels[0] = definition.maleModel * 1307988017;
		femaleModels[1] = definition.secondaryMaleModel * -1492036259;
		femaleModels[2] = -1439146769 * definition.tertiaryMaleModel;
		maleModels[0] = definition.femaleModel * 1944542571;
		maleModels[1] = 1662891647 * definition.secondaryFemaleModel;
		maleModels[2] = definition.tertiaryFemaleModel * -951761059;
		femaleHeadModels[0] = -472849665 * definition.maleHead;
		femaleHeadModels[1] = definition.secondaryMaleHead * -787284609;
		maleHeadModels[0] = definition.femaleHead * -1500255615;
		maleHeadModels[1] = definition.secondaryFemaleHead * -1450505535;

		if (definition.replacementColours != null) {
			replacementColours = new short[definition.replacementColours.length];
			System.arraycopy(definition.replacementColours, 0, replacementColours, 0, replacementColours.length);
		}

		if (null != definition.replacementTextures) {
			replacementTextures = new short[definition.replacementTextures.length];
			System.arraycopy(definition.replacementTextures, 0, replacementTextures, 0, replacementTextures.length);
		}
	}

	static CustomisedItem create(ItemDefinition definition, Buffer buffer, int shorts) {
		CustomisedItem customised = new CustomisedItem(definition);
		int attributes = buffer.readUByte();
		boolean models = (attributes & 0x1) != 0;
		boolean headModels = (attributes & 0x2) != 0;
		boolean replacementColours = (attributes & 0x4) != 0;
		boolean replacementTextures = 0 != (attributes & 0x8);

		if (models) {
			if (shorts <= 1) {
				customised.femaleModels[0] = buffer.readUShort();
				customised.maleModels[0] = buffer.readUShort();
			} else {
				customised.femaleModels[0] = buffer.readSmart32();
				customised.maleModels[0] = buffer.readSmart32();
			}

			if (definition.secondaryMaleModel * -1492036259 != -1 || -1 != definition.secondaryFemaleModel * 1662891647) {
				if (shorts <= 1) {
					customised.femaleModels[1] = buffer.readUShort();
					customised.maleModels[1] = buffer.readUShort();
				} else {
					customised.femaleModels[1] = buffer.readSmart32();
					customised.maleModels[1] = buffer.readSmart32();
				}
			}

			if (definition.tertiaryMaleModel * -1439146769 != -1 || definition.tertiaryFemaleModel * -951761059 != -1) {
				if (shorts <= 1) {
					customised.femaleModels[2] = buffer.readUShort();
					customised.maleModels[2] = buffer.readUShort();
				} else {
					customised.femaleModels[2] = buffer.readSmart32();
					customised.maleModels[2] = buffer.readSmart32();
				}
			}
		}

		if (headModels) {
			if (shorts <= 1) {
				customised.femaleHeadModels[0] = buffer.readUShort();
				customised.maleHeadModels[0] = buffer.readUShort();
			} else {
				customised.femaleHeadModels[0] = buffer.readSmart32();
				customised.maleHeadModels[0] = buffer.readSmart32();
			}
			if (-1 != -787284609 * definition.secondaryMaleHead || -1450505535 * definition.secondaryFemaleHead != -1) {
				if (shorts <= 1) {
					customised.femaleHeadModels[1] = buffer.readUShort();
					customised.maleHeadModels[1] = buffer.readUShort();
				} else {
					customised.femaleHeadModels[1] = buffer.readSmart32();
					customised.maleHeadModels[1] = buffer.readSmart32();
				}
			}
		}

		if (replacementColours) {
			int packed = buffer.readUShort();
			int[] parts = new int[4];
			parts[0] = packed & 0xf;
			parts[1] = packed >> 4 & 0xf;
			parts[2] = packed >> 8 & 0xf;
			parts[3] = packed >> 12 & 0xf;

			for (int index = 0; index < 4; index++) {
				if (15 != parts[index]) {
					customised.replacementColours[parts[index]] = (short) buffer.readUShort();
				}
			}
		}
		if (replacementTextures) {
			int packed = buffer.readUByte();
			int[] parts = new int[2];
			parts[0] = packed & 0xf;
			parts[1] = packed >> 4 & 0xf;

			for (int index = 0; index < 2; index++) {
				if (15 != parts[index]) {
					customised.replacementTextures[parts[index]] = (short) buffer.readUShort();
				}
			}
		}

		return customised;
	}

	public static CustomisedItem create(ItemDefinition itemDefinition, Buffer buffer) {
		return create(itemDefinition, buffer, 2);
	}

}