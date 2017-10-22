package com.jagex;

import java.util.Arrays;

public class ItemDefinition implements Definition {
	public static Class192 aClass192_8339;
	public static final int anInt8261 = 1;
	public static final int anInt8267 = 0;
	public static final int anInt8268 = 2;
	public static short[] aShortArray8265 = new short[256];
	public static ItemDefinitionLoader loader;
	static final int anInt8263 = 6;
	static final int anInt8264 = 5;

	static String aString8338 = "</col>";
	public boolean aBool8328;
	public boolean aBool8335;
	public boolean aBool8337;
	public int anInt8269 = 1628529111;
	public int anInt8274;
	public int anInt8277;
	public int anInt8293;
	public int anInt8294;
	public int anInt8296;
	public int anInt8305;
	public int anInt8321;
	public int anInt8332;
	public int[] anIntArray8304;
	public int boughtTemplate;
	public int combineInfo;
	public int combineTemplate;
	public String[] groundActions;
	public int id;
	public int loanTemplate;
	public boolean members;
	public int modelPitch = 0;
	public int modelRoll;
	public int modelScale = -632779120;
	public int modelTranslateX;
	public int modelTranslateY;
	public int modelYaw;
	public String name = "null";
	public int noteInfo;
	public int noteTemplate;
	public int stackable;
	public int team;
	public int value;
	public String[] widgetActions;
	byte[] aByteArray8288;
	byte[] aByteArray8331;
	int ambience;
	int anInt8284;
	int[] anIntArray8291;
	int[] anIntArray8292;
	String aString8286;
	int baseModel;
	int boughtInfo;
	DefinitionLoader<ItemDefinition> cache;
	int contrast;
	int femaleHead;
	int femaleModel;
	int femaleTranslateX;
	int femaleTranslateY;
	int femaleTranslateZ;
	int loanInfo;
	int maleHead;
	int maleModel;
	int maleTranslateX;
	int maleTranslateY;
	int maleTranslateZ;
	short[] originalColours;
	short[] originalTextures;
	HashTable parameters;
	BaseItemDefinitionProvider provider;
	byte[] recolourPalette;
	short[] replacementColours;
	short[] replacementTextures;
	int scaleX;
	int scaleY;
	int scaleZ;
	int secondaryFemaleHead;
	int secondaryFemaleModel;
	int secondaryMaleHead;
	int secondaryMaleModel;
	int[] stackAmounts;
	int[] stacks;
	int tertiaryFemaleModel;
	int tertiaryMaleModel;

	ItemDefinition(int id, DefinitionLoader cache, BaseItemDefinitionProvider provider) {
		this.id = id;
		anInt8277 = -1052567529;
		value = -607976203;
		anInt8296 = -935020419;
		anInt8293 = 478124671;
		anInt8305 = 369418787;
		maleModel = 485029679;
		secondaryMaleModel = -861644533;
		femaleModel = -708175683;
		secondaryFemaleModel = -992479615;
		tertiaryMaleModel = 772648433;
		tertiaryFemaleModel = -1825981685;
		maleHead = 1209656065;
		secondaryMaleHead = -1300677247;
		femaleHead = -1637504385;
		secondaryFemaleHead = -169641281;
		noteTemplate = -452506167;
		noteInfo = -101308467;
		loanInfo = -774016489;
		loanTemplate = -152855423;
		combineInfo = 125626149;
		combineTemplate = 1938225729;
		aString8286 = "null";
		scaleX = 195338368;
		scaleY = -1874548352;
		scaleZ = 1999459712;
		boughtInfo = 1185804131;
		boughtTemplate = 522006635;
		anInt8284 = 1478763007 * id;
		this.cache = cache;
		this.provider = provider;
		groundActions = provider.defaultGroundActions.clone();
		widgetActions = provider.defaultWidgetActions.clone();
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

	public final BaseModel getHeadModel(boolean male, CustomisedItem customised) {
		int primaryHead;
		int secondaryHead;

		if (male) {
			if (null != customised && null != customised.maleHeadModels) {
				primaryHead = customised.maleHeadModels[0];
				secondaryHead = customised.maleHeadModels[1];
			} else {
				primaryHead = -1500255615 * femaleHead;
				secondaryHead = -1450505535 * secondaryFemaleHead;
			}
		} else if (null != customised && customised.femaleHeadModels != null) {
			primaryHead = customised.femaleHeadModels[0];
			secondaryHead = customised.femaleHeadModels[1];
		} else {
			primaryHead = maleHead * -472849665;
			secondaryHead = secondaryMaleHead * -787284609;
		}

		if (primaryHead == -1) {
			return null;
		}

		BaseModel model = BaseModel.lookup(provider.modelArchive, primaryHead, 0);
		if (model.version < 13) {
			model.method3103(2);
		}

		if (-1 != secondaryHead) {
			BaseModel secondaryModel = BaseModel.lookup(provider.modelArchive, secondaryHead, 0);
			if (secondaryModel.version < 13) {
				secondaryModel.method3103(2);
			}

			BaseModel[] models = { model, secondaryModel };
			model = new BaseModel(models, 2);
		}

		if (originalColours != null) {
			short[] replacements;
			if (null != customised && customised.replacementColours != null) {
				replacements = customised.replacementColours;
			} else {
				replacements = replacementColours;
			}

			for (int index = 0; index < originalColours.length; index++) {
				model.recolour(originalColours[index], replacements[index]);
			}
		}

		if (null != originalTextures) {
			short[] replacements;
			if (null != customised && customised.replacementTextures != null) {
				replacements = customised.replacementTextures;
			} else {
				replacements = replacementTextures;
			}

			for (int index = 0; index < originalTextures.length; index++) {
				model.retexture(originalTextures[index], replacements[index]);
			}
		}

		return model;
	}

	public final BaseModel getModel(boolean bool, CustomisedItem item) {
		int primary;
		int secondary;
		int tertiary;

		if (bool) {
			if (item != null && item.maleModels != null) {
				primary = item.maleModels[0];
				secondary = item.maleModels[1];
				tertiary = item.maleModels[2];
			} else {
				primary = 1944542571 * femaleModel;
				secondary = 1662891647 * secondaryFemaleModel;
				tertiary = tertiaryFemaleModel * -951761059;
			}
		} else if (null != item && null != item.femaleModels) {
			primary = item.femaleModels[0];
			secondary = item.femaleModels[1];
			tertiary = item.femaleModels[2];
		} else {
			primary = 1307988017 * maleModel;
			secondary = secondaryMaleModel * -1492036259;
			tertiary = -1439146769 * tertiaryMaleModel;
		}

		if (-1 == primary) {
			return null;
		}

		BaseModel base = BaseModel.lookup(provider.modelArchive, primary, 0);
		if (base == null) {
			return null;
		}

		if (base.version < 13) {
			base.method3103(2);
		}

		if (secondary != -1) {
			BaseModel secondaryBase = BaseModel.lookup(provider.modelArchive, secondary, 0);
			if (secondaryBase.version < 13) {
				secondaryBase.method3103(2);
			}

			if (tertiary != -1) {
				BaseModel tertiaryBase = BaseModel.lookup(provider.modelArchive, tertiary, 0);
				if (tertiaryBase.version < 13) {
					tertiaryBase.method3103(2);
				}

				BaseModel[] bases = { base, secondaryBase, tertiaryBase };
				base = new BaseModel(bases, 3);
			} else {
				BaseModel[] bases = { base, secondaryBase };
				base = new BaseModel(bases, 2);
			}
		}

		if (!bool
				&& (maleTranslateX * -1422502477 != 0 || 1649178487 * maleTranslateY != 0 || 0 != maleTranslateZ * 1937680857)) {
			base.translate(maleTranslateX * -1422502477, maleTranslateY * 1649178487, maleTranslateZ * 1937680857);
		}

		if (bool
				&& (femaleTranslateX * -73514481 != 0 || femaleTranslateY * 761446557 != 0 || 0 != femaleTranslateZ * 1603928487)) {
			base.translate(femaleTranslateX * -73514481, femaleTranslateY * 761446557, 1603928487 * femaleTranslateZ);
		}

		if (originalColours != null) {
			short[] replacements;
			if (item != null && null != item.replacementColours) {
				replacements = item.replacementColours;
			} else {
				replacements = replacementColours;
			}

			for (int index = 0; index < originalColours.length; index++) {
				base.recolour(originalColours[index], replacements[index]);
			}
		}

		if (originalTextures != null) {
			short[] replacements;
			if (null != item && item.replacementTextures != null) {
				replacements = item.replacementTextures;
			} else {
				replacements = replacementTextures;
			}

			for (int index = 0; index < originalTextures.length; index++) {
				base.retexture(originalTextures[index], replacements[index]);
			}
		}

		return base;
	}

	public int getOrDefault(int id, int defaultValue) {
		if (parameters == null) {
			return defaultValue;
		}

		LinkableInt linkable = (LinkableInt) parameters.get(id);
		if (null == linkable) {
			return defaultValue;
		}

		return -1189875169 * linkable.value;
	}

	public String getOrDefault(int id, String defaultValue) {
		if (null == parameters) {
			return defaultValue;
		}

		LinkableObject linkable = (LinkableObject) parameters.get(id);
		if (null == linkable) {
			return defaultValue;
		}

		return (String) linkable.object;
	}

	public ItemDefinition getStack(int amount) {
		if (stacks != null && amount > 1) {
			int id = -1;
			for (int index = 0; index < 10; index++) {
				if (amount >= stackAmounts[index] && stackAmounts[index] != 0) {
					id = stacks[index];
				}
			}

			if (id != -1) {
				return cache.get(id);
			}
		}

		return this;
	}

	public final boolean headLoaded(boolean male, CustomisedItem item) {
		int primaryHead;
		int secondaryHead;

		if (male) {
			if (null != item && null != item.maleHeadModels) {
				primaryHead = item.maleHeadModels[0];
				secondaryHead = item.maleHeadModels[1];
			} else {
				primaryHead = -1500255615 * femaleHead;
				secondaryHead = -1450505535 * secondaryFemaleHead;
			}
		} else if (item != null && null != item.femaleHeadModels) {
			primaryHead = item.femaleHeadModels[0];
			secondaryHead = item.femaleHeadModels[1];
		} else {
			primaryHead = maleHead * -472849665;
			secondaryHead = -787284609 * secondaryMaleHead;
		}

		if (-1 == primaryHead) {
			return true;
		}

		boolean loaded = true;
		if (!provider.modelArchive.loaded(primaryHead, 0)) {
			loaded = false;
		}

		if (secondaryHead != -1 && !provider.modelArchive.loaded(secondaryHead, 0)) {
			loaded = false;
		}

		return loaded;
	}

	public final Model method13583(Toolkit toolkit, int i, int amount, PlayerAppearance appearance, Class650 class650,
			int i_29_, int i_30_, int i_31_, int i_32_) {
		if (null != stacks && amount > 1) {
			int id = -1;
			for (int index = 0; index < 10; index++) {
				if (amount >= stackAmounts[index] && stackAmounts[index] != 0) {
					id = stacks[index];
				}
			}

			if (-1 != id) {
				return cache.get(id).method13583(toolkit, i, 1, appearance, class650, i_29_, i_30_, i_31_, i_32_);
			}
		}

		int mask = i;
		if (null != class650) {
			mask |= class650.method13457();
		}

		Model model;
		synchronized (provider.models) {
			model = provider.models.get(anInt8284 * -1957175809 | toolkit.id * 976039213 << 29);
		}

		if (model == null || toolkit.method2637(model.functionMask(), mask) != 0) {
			if (model != null) {
				mask = toolkit.mergeFunctionMasks(mask, model.functionMask());
			}

			int attributes = mask;
			if (null != originalTextures) {
				attributes |= 0x8000;
			}

			if (null != originalColours || null != appearance) {
				attributes |= 0x4000;
			}

			if (-1477818687 * scaleX != 128) {
				attributes |= 0x1;
			}

			if (scaleY * 674013915 != 128) {
				attributes |= 0x2;
			}

			if (128 != 77516803 * scaleZ) {
				attributes |= 0x4;
			}

			BaseModel base = BaseModel.lookup(provider.modelArchive, -246742663 * baseModel, 0);
			if (base == null) {
				return null;
			}

			if (base.version < 13) {
				base.method3103(2);
			}

			model = toolkit.createModel(base, attributes, -68874867 * provider.anInt8371, 64 + ambience * -1741993459,
					965347853 * contrast + 850);
			if (-1477818687 * scaleX != 128 || scaleY * 674013915 != 128 || 128 != scaleZ * 77516803) {
				model.scale(-1477818687 * scaleX, 674013915 * scaleY, scaleZ * 77516803);
			}

			if (null != originalColours) {
				for (int index = 0; index < originalColours.length; index++) {
					if (recolourPalette != null && index < recolourPalette.length) {
						model.recolour(originalColours[index], aShortArray8265[recolourPalette[index] & 0xff]);
					} else {
						model.recolour(originalColours[index], replacementColours[index]);
					}
				}
			}

			if (originalTextures != null) {
				for (int index = 0; index < originalTextures.length; index++) {
					model.retexture(originalTextures[index], replacementTextures[index]);
				}
			}

			if (appearance != null) {
				for (int part = 0; part < 10; part++) {
					for (int index = 0; index < UnboundedDefinitionLoader.originalBodyColours[part].length; index++) {
						if (appearance.bodyColours[part] < HuffmanCodec.replacementBodyColours[part][index].length) {
							model.recolour(UnboundedDefinitionLoader.originalBodyColours[part][index],
									HuffmanCodec.replacementBodyColours[part][index][appearance.bodyColours[part]]);
						}
					}
				}
			}

			model.updateFunctionMask(mask);
			synchronized (provider.models) {
				provider.models.put(anInt8284 * -1957175809 | toolkit.id * 976039213 << 29, model);
			}
		}

		if (null != class650 || 0 != i_32_) {
			model = model.method2890((byte) 1, mask, true);
			if (class650 != null) {
				class650.method13458(model, 0);
			}

			if (0 != i_32_) {
				model.method2937(i_29_, i_30_, i_31_, i_32_);
			}
		}

		model.updateFunctionMask(i);
		return model;
	}

	public int method13593(int i, int i_65_) {
		if (anIntArray8291 == null) {
			return -1;
		}

		return anIntArray8291[i];
	}

	public int method13594(int i) {
		if (anIntArray8292 == null) {
			return -1;
		}

		return anIntArray8292[i];
	}

	@Override
	public void method35() {
		if (noteTemplate * 1898423175 != -1) {
			generateNote(cache.get(noteTemplate * 1898423175), cache.get(43311867 * noteInfo), provider.language);
		} else if (-1 != loanTemplate * 156720255) {
			generateLoan(cache.get(156720255 * loanTemplate), cache.get(471538265 * loanInfo), provider.language);
		} else if (boughtTemplate * -2144992323 != -1) {
			generateBought(cache.get(boughtTemplate * -2144992323), cache.get(-1390086731 * boughtInfo),
					provider.language);
		} else if (-1 != combineTemplate * -1261835713) {
			generateCombine(cache.get(combineTemplate * -1261835713), cache.get(1176183635 * combineInfo),
					provider.language);
		}

		if (!provider.membersServer && members) {
			team = 0;
			groundActions = provider.defaultGroundActions;
			widgetActions = provider.defaultWidgetActions;
			aBool8328 = false;
			anIntArray8304 = null;

			if (parameters != null) {
				boolean reset = false;

				for (Linkable parameter = parameters.first(); parameter != null; parameter = parameters.next()) {
					ParameterDefinition definition = provider.cache
							.get((int) (-4821875126325281949L * parameter.linkedKey));
					if (definition.disable) {
						parameter.unlink();
					} else {
						reset = true;
					}
				}

				if (!reset) {
					parameters = null;
				}
			}
		}
	}

	public final boolean modelsLoaded(boolean bool, CustomisedItem item) {
		int primary;
		int secondary;
		int tertiary;

		if (bool) {
			if (null != item && item.maleModels != null) {
				primary = item.maleModels[0];
				secondary = item.maleModels[1];
				tertiary = item.maleModels[2];
			} else {
				primary = 1944542571 * femaleModel;
				secondary = secondaryFemaleModel * 1662891647;
				tertiary = tertiaryFemaleModel * -951761059;
			}
		} else if (item != null && item.femaleModels != null) {
			primary = item.femaleModels[0];
			secondary = item.femaleModels[1];
			tertiary = item.femaleModels[2];
		} else {
			primary = maleModel * 1307988017;
			secondary = secondaryMaleModel * -1492036259;
			tertiary = -1439146769 * tertiaryMaleModel;
		}

		if (-1 == primary) {
			return true;
		}

		boolean loaded = true;
		if (!provider.modelArchive.loaded(primary, 0)) {
			loaded = false;
		}

		if (secondary != -1 && !provider.modelArchive.loaded(secondary, 0)) {
			loaded = false;
		}

		if (tertiary != -1 && !provider.modelArchive.loaded(tertiary, 0)) {
			loaded = false;
		}

		return loaded;
	}

	void decode(Buffer buffer, int opcode) {
		if (opcode == 1) {
			baseModel = buffer.readSmart32() * 706517193;
		} else if (2 == opcode) {
			name = buffer.readString();
		} else if (opcode == 4) {
			modelScale = buffer.readUShort() * -64740899;
		} else if (opcode == 5) {
			modelPitch = buffer.readUShort() * 1530090955;
		} else if (opcode == 6) {
			modelRoll = buffer.readUShort() * -1157560975;
		} else if (opcode == 7) {
			modelTranslateX = buffer.readUShort() * -254919585;
			if (modelTranslateX * 805773215 > 32767) {
				modelTranslateX -= 1012858880;
			}
		} else if (8 == opcode) {
			modelTranslateY = buffer.readUShort() * -647513863;
			if (modelTranslateY * -1113093815 > 32767) {
				modelTranslateY -= -1191641088;
			}
		} else if (11 == opcode) {
			stackable = 1818072239;
		} else if (12 == opcode) {
			value = buffer.readInt() * -607976203;
		} else if (13 == opcode) {
			anInt8296 = buffer.readUByte() * 935020419;
		} else if (opcode == 14) {
			anInt8293 = buffer.readUByte() * -478124671;
		} else if (opcode == 16) {
			members = true;
		} else if (18 == opcode) {
			anInt8277 = buffer.readUShort() * 1052567529;
		} else if (23 == opcode) {
			maleModel = buffer.readSmart32() * -485029679;
		} else if (24 == opcode) {
			secondaryMaleModel = buffer.readSmart32() * 861644533;
		} else if (25 == opcode) {
			femaleModel = buffer.readSmart32() * 708175683;
		} else if (opcode == 26) {
			secondaryFemaleModel = buffer.readSmart32() * 992479615;
		} else if (27 == opcode) {
			anInt8305 = buffer.readUByte() * -369418787;
		} else if (opcode >= 30 && opcode < 35) {
			groundActions[opcode - 30] = buffer.readString();
		} else if (opcode >= 35 && opcode < 40) {
			widgetActions[opcode - 35] = buffer.readString();
		} else if (40 == opcode) {
			int count = buffer.readUByte();
			originalColours = new short[count];
			replacementColours = new short[count];
			for (int index = 0; index < count; index++) {
				originalColours[index] = (short) buffer.readUShort();
				replacementColours[index] = (short) buffer.readUShort();
			}
		} else if (opcode == 41) {
			int count = buffer.readUByte();
			originalTextures = new short[count];
			replacementTextures = new short[count];
			for (int index = 0; index < count; index++) {
				originalTextures[index] = (short) buffer.readUShort();
				replacementTextures[index] = (short) buffer.readUShort();
			}
		} else if (42 == opcode) {
			int count = buffer.readUByte();
			recolourPalette = new byte[count];
			for (int index = 0; index < count; index++) {
				recolourPalette[index] = buffer.readByte();
			}
		} else if (43 == opcode) {
			anInt8294 = buffer.readInt() * -565882213;
			aBool8335 = true;
		} else if (44 == opcode) {
			int i_8_ = buffer.readUShort();
			int count = 0;
			for (int i_10_ = i_8_; i_10_ > 0; i_10_ >>= 1) {
				count++;
			}

			aByteArray8288 = new byte[count];
			byte i_11_ = 0;
			for (int i_12_ = 0; i_12_ < count; i_12_++) {
				if ((i_8_ & 1 << i_12_) > 0) {
					aByteArray8288[i_12_] = i_11_;
					i_11_++;
				} else {
					aByteArray8288[i_12_] = (byte) -1;
				}
			}
		} else if (45 == opcode) {
			int i_13_ = buffer.readUShort();
			int i_14_ = 0;
			for (int i_15_ = i_13_; i_15_ > 0; i_15_ >>= 1) {
				i_14_++;
			}
			aByteArray8331 = new byte[i_14_];
			byte i_16_ = 0;
			for (int i_17_ = 0; i_17_ < i_14_; i_17_++) {
				if ((i_13_ & 1 << i_17_) > 0) {
					aByteArray8331[i_17_] = i_16_;
					i_16_++;
				} else {
					aByteArray8331[i_17_] = (byte) -1;
				}
			}
		} else if (65 == opcode) {
			aBool8328 = true;
		} else if (opcode == 78) {
			tertiaryMaleModel = buffer.readSmart32() * -772648433;
		} else if (opcode == 79) {
			tertiaryFemaleModel = buffer.readSmart32() * 1825981685;
		} else if (opcode == 90) {
			maleHead = buffer.readSmart32() * -1209656065;
		} else if (opcode == 91) {
			femaleHead = buffer.readSmart32() * 1637504385;
		} else if (opcode == 92) {
			secondaryMaleHead = buffer.readSmart32() * 1300677247;
		} else if (93 == opcode) {
			secondaryFemaleHead = buffer.readSmart32() * 169641281;
		} else if (opcode == 94) {
			anInt8269 = buffer.readUShort() * -1628529111;
		} else if (opcode == 95) {
			modelYaw = buffer.readUShort() * -1891738913;
		} else if (96 == opcode) {
			anInt8274 = buffer.readUByte() * 1259992463;
		} else if (opcode == 97) {
			noteInfo = buffer.readUShort() * 101308467;
		} else if (opcode == 98) {
			noteTemplate = buffer.readUShort() * 452506167;
		} else if (opcode >= 100 && opcode < 110) {
			if (null == stacks) {
				stacks = new int[10];
				stackAmounts = new int[10];
			}

			stacks[opcode - 100] = buffer.readUShort();
			stackAmounts[opcode - 100] = buffer.readUShort();
		} else if (110 == opcode) {
			scaleX = buffer.readUShort() * 873941313;
		} else if (opcode == 111) {
			scaleY = buffer.readUShort() * -1591703213;
		} else if (112 == opcode) {
			scaleZ = buffer.readUShort() * -420586837;
		} else if (113 == opcode) {
			ambience = buffer.readByte() * 1371739333;
		} else if (opcode == 114) {
			contrast = buffer.readByte() * 1651222489;
		} else if (115 == opcode) {
			team = buffer.readUByte() * -2033915911;
		} else if (121 == opcode) {
			loanInfo = buffer.readUShort() * 774016489;
		} else if (opcode == 122) {
			loanTemplate = buffer.readUShort() * 152855423;
		} else if (125 == opcode) {
			maleTranslateX = (buffer.readByte() << 2) * 1642357115;
			maleTranslateY = (buffer.readByte() << 2) * 1893700167;
			maleTranslateZ = (buffer.readByte() << 2) * -812431767;
		} else if (126 == opcode) {
			femaleTranslateX = (buffer.readByte() << 2) * 813591791;
			femaleTranslateY = (buffer.readByte() << 2) * -1472608843;
			femaleTranslateZ = (buffer.readByte() << 2) * 1149146647;
		} else if (127 == opcode || opcode == 128 || 129 == opcode || 130 == opcode) {
			buffer.readUByte(); // cursor stuff
			buffer.readUShort();
		} else if (opcode == 132) {
			int count = buffer.readUByte();
			anIntArray8304 = new int[count];

			for (int index = 0; index < count; index++) {
				anIntArray8304[index] = buffer.readUShort();
			}
		} else if (134 == opcode) {
			anInt8332 = buffer.readUByte() * 1498252941;
		} else if (139 == opcode) {
			boughtInfo = buffer.readUShort() * -1185804131;
		} else if (opcode == 140) {
			boughtTemplate = buffer.readUShort() * -522006635;
		} else if (opcode >= 142 && opcode < 147) {
			if (null == anIntArray8291) {
				anIntArray8291 = new int[6];
				Arrays.fill(anIntArray8291, -1);
			}

			anIntArray8291[opcode - 142] = buffer.readUShort();
		} else if (opcode >= 150 && opcode < 155) {
			if (null == anIntArray8292) {
				anIntArray8292 = new int[5];
				Arrays.fill(anIntArray8292, -1);
			}

			anIntArray8292[opcode - 150] = buffer.readUShort();
		} else if (156 != opcode) {
			if (157 == opcode) {
				aBool8337 = true;
			} else if (opcode == 161) {
				combineInfo = buffer.readUShort() * -125626149;
			} else if (opcode == 162) {
				combineTemplate = buffer.readUShort() * -1938225729;
			} else if (163 == opcode) {
				anInt8321 = buffer.readUShort() * 1692594427;
			} else if (opcode == 164) {
				aString8286 = buffer.readString();
			} else if (165 == opcode) {
				stackable = -658822818;
			} else if (249 == opcode) {
				int count = buffer.readUByte();
				if (null == parameters) {
					int size = HashTable.nextPowerOfTwo(count);
					parameters = new HashTable(size);
				}

				for (int index = 0; index < count; index++) {
					boolean string = buffer.readUByte() == 1;
					int key = buffer.readUTriByte();
					Linkable value;

					if (string) {
						value = new LinkableObject<String>(buffer.readString());
					} else {
						value = new LinkableInt(buffer.readInt());
					}

					parameters.put(key, value);
				}
			}
		}
	}

	void generate(ItemGenerationType type, ItemDefinition template, ItemDefinition info, TranslatableString drop,
			Language language) {
		baseModel = 1 * template.baseModel;
		modelScale = 1 * template.modelScale;
		modelPitch = template.modelPitch * 1;
		modelRoll = 1 * template.modelRoll;
		modelYaw = 1 * template.modelYaw;
		modelTranslateX = template.modelTranslateX * 1;
		modelTranslateY = 1 * template.modelTranslateY;

		ItemDefinition replacements = (type == ItemGenerationType.NOTE) ? template : info;
		originalColours = replacements.originalColours;
		replacementColours = replacements.replacementColours;
		recolourPalette = replacements.recolourPalette;
		originalTextures = replacements.originalTextures;
		replacementTextures = replacements.replacementTextures;

		name = info.name;
		members = info.members;

		if (ItemGenerationType.NOTE == type) {
			value = info.value * 1;
			stackable = 1818072239;
		} else if (ItemGenerationType.COMBINE == type) {
			name = info.aString8286;
			value = (int) Math.floor(info.value * -1037924515 / (1795791411 * info.anInt8321)) * -607976203;
			stackable = 1818072239;
			aBool8328 = info.aBool8328;
			anInt8269 = 1 * template.anInt8269;
			anIntArray8291 = template.anIntArray8291;
			anIntArray8292 = template.anIntArray8292;
			widgetActions = new String[5];
			widgetActions[0] = TranslatableString.COMBINE.translate(language);
			widgetActions[4] = drop.translate(language);
		} else {
			value = 0;
			stackable = 1 * info.stackable;
			anInt8296 = info.anInt8296 * 1;
			anInt8293 = info.anInt8293 * 1;
			anInt8305 = info.anInt8305 * 1;
			maleModel = info.maleModel * 1;
			secondaryMaleModel = 1 * info.secondaryMaleModel;
			tertiaryMaleModel = 1 * info.tertiaryMaleModel;
			femaleModel = info.femaleModel * 1;
			secondaryFemaleModel = info.secondaryFemaleModel * 1;
			tertiaryFemaleModel = 1 * info.tertiaryFemaleModel;
			maleTranslateX = 1 * info.maleTranslateX;
			femaleTranslateX = info.femaleTranslateX * 1;
			maleTranslateY = 1 * info.maleTranslateY;
			femaleTranslateY = info.femaleTranslateY * 1;
			maleTranslateZ = info.maleTranslateZ * 1;
			femaleTranslateZ = info.femaleTranslateZ * 1;
			maleHead = 1 * info.maleHead;
			secondaryMaleHead = info.secondaryMaleHead * 1;
			femaleHead = info.femaleHead * 1;
			secondaryFemaleHead = info.secondaryFemaleHead * 1;
			anInt8269 = 1 * info.anInt8269;
			team = info.team * 1;
			groundActions = info.groundActions;
			parameters = info.parameters;
			widgetActions = new String[5];

			if (info.widgetActions != null) {
				for (int index = 0; index < 4; index++) {
					widgetActions[index] = info.widgetActions[index];
				}
			}

			widgetActions[4] = drop.translate(language);
		}
	}

	void generateBought(ItemDefinition template, ItemDefinition info, Language language) {
		generate(ItemGenerationType.BOUGHT, template, info, TranslatableString.DISCARD_BOUGHT, language);
	}

	void generateCombine(ItemDefinition template, ItemDefinition info, Language language) {
		generate(ItemGenerationType.COMBINE, template, info, TranslatableString.DROP, language);
	}

	void generateLoan(ItemDefinition template, ItemDefinition info, Language language) {
		generate(ItemGenerationType.LOAN, template, info, TranslatableString.DISCARD_LOAN, language);
	}

	void generateNote(ItemDefinition template, ItemDefinition info, Language language) {
		generate(ItemGenerationType.NOTE, template, info, null, language);
	}

	int[] getSprite(Toolkit class134, Toolkit class134_74_, int amount, int borderSize, int shadowColour, boolean note,
			int textType, Font font, PlayerAppearance appearance, MobDefaults defaults) {
		BaseModel base = BaseModel.lookup(provider.modelArchive, -246742663 * baseModel, 0);
		if (null == base) {
			return null;
		}

		if (base.version < 13) {
			base.method3103(2);
		}

		if (null != originalColours) {
			for (int index = 0; index < originalColours.length; index++) {
				if (null != recolourPalette && index < recolourPalette.length) {
					base.recolour(originalColours[index], aShortArray8265[recolourPalette[index] & 0xff]);
				} else {
					base.recolour(originalColours[index], replacementColours[index]);
				}
			}
		}

		if (null != originalTextures) {
			for (int index = 0; index < originalTextures.length; index++) {
				base.retexture(originalTextures[index], replacementTextures[index]);
			}
		}

		if (appearance != null) {
			for (int part = 0; part < 10; part++) {
				for (int index = 0; index < UnboundedDefinitionLoader.originalBodyColours[part].length; index++) {
					if (appearance.bodyColours[part] < HuffmanCodec.replacementBodyColours[part][index].length) {
						base.recolour(UnboundedDefinitionLoader.originalBodyColours[part][index],
								HuffmanCodec.replacementBodyColours[part][index][appearance.bodyColours[part]]);
					}
				}
			}
		}

		int mask = 2048;
		boolean scaled = false;
		if (-1477818687 * scaleX != 128 || scaleY * 674013915 != 128 || 128 != 77516803 * scaleZ) {
			scaled = true;
			mask |= 0x7;
		}

		Model model = class134.createModel(base, mask, 64, 64 + ambience * -1741993459, 768 + contrast * 965347853);
		if (!model.method2938()) {
			return null;
		}

		if (scaled) {
			model.scale(scaleX * -1477818687, 674013915 * scaleY, scaleZ * 77516803);
		}

		Sprite sprite = null;
		if (-1 != 1898423175 * noteTemplate) {
			sprite = provider.getSprite(class134, class134_74_, 43311867 * noteInfo, 10, 1, 0, true, true, 0, font,
					appearance, defaults, cache);
			if (null == sprite) {
				return null;
			}
		} else if (-1 != loanTemplate * 156720255) {
			sprite = provider.getSprite(class134, class134_74_, loanInfo * 471538265, amount, borderSize, shadowColour,
					false, true, 0, font, appearance, defaults, cache);
			if (null == sprite) {
				return null;
			}
		} else if (boughtTemplate * -2144992323 != -1) {
			sprite = provider.getSprite(class134, class134_74_, boughtInfo * -1390086731, amount, borderSize,
					shadowColour, false, true, 0, font, appearance, defaults, cache);
			if (sprite == null) {
				return null;
			}
		} else if (-1261835713 * combineTemplate != -1) {
			sprite = provider.getSprite(class134, class134_74_, 1176183635 * combineInfo, 10, 1, 0, true, true, 0,
					font, appearance, defaults, cache);
			if (null == sprite) {
				return null;
			}
		}

		int scale;
		if (note) {
			scale = (int) (1.5 * (777862773 * modelScale)) << 2;
		} else if (borderSize == 2) {
			scale = (int) (modelScale * 777862773 * 1.04) << 2;
		} else {
			scale = modelScale * 777862773 << 2;
		}

		Matrix4f class399 = class134.method2575();
		Matrix4f class399_86_ = class134.method2462();
		class399_86_.method6559(16.0F, 16.0F, 512.0F, 512.0F, 50.0F, 2.14748365E9F, class134.method2628().getWidth(),
				class134.method2628().getHeight());
		class134.method2540(class399_86_);
		class134.method2566(0, 0, class134.method2628().getWidth(), class134.method2628().getHeight());
		Class405 class405 = new Class405();
		class134.method2471(class405);
		class134.method2476(0.95F + (float) (Math.random() / 10.0));
		class134.method2477(16777215, 0.95F + (float) (Math.random() / 10.0), 0.95F + (float) (Math.random() / 10.0),
				-50.0F, -10.0F, -50.0F);
		Class405 class405_87_ = class134.method2463();
		class405_87_.method6758(0.0F, 0.0F, 1.0F, Class373.method6114(-(1309401375 * modelYaw) << 3));
		class405_87_.method6739(0.0F, 1.0F, 0.0F, Class373.method6114(modelRoll * -706143343 << 3));
		class405_87_.method6744(modelTranslateX * 805773215 << 2,
				(scale * Class373.SINE[1763387363 * modelPitch << 3] >> 14) - model.minimumY() / 2
						+ (modelTranslateY * -1113093815 << 2), (-1113093815 * modelTranslateY << 2)
						+ (Class373.COSINE[modelPitch * 1763387363 << 3] * scale >> 14));
		class405_87_.method6739(1.0F, 0.0F, 0.0F, Class373.method6114(1763387363 * modelPitch << 3));
		class134.method2760(0, 0, 36, 32);
		class134.method2426(2, 0);
		class134.method2434(0, 0, 36, 32, 0, 0);
		class134.setFogColour(0, -1, 0);
		model.method2917(class405_87_, null, 1);
		class134.method2540(class399);
		int[] is = class134.method2404(0, 0, 36, 32);
		if (borderSize >= 1) {
			is = method13585(is, -16777214, 1836059336);
			if (borderSize >= 2) {
				is = method13585(is, -1, 1836059336);
			}
		}
		if (shadowColour != 0) {
			method13586(is, shadowColour, 1826731311);
		}
		if (-1 != loanTemplate * 156720255) {
			sprite.method2079(0, 0);
		} else if (-1 != -2144992323 * boughtTemplate) {
			sprite.method2079(0, 0);
		}
		class134.createSprite(is, 0, 36, 36, 32).method2079(0, 0);
		if (noteTemplate * 1898423175 != -1) {
			sprite.method2079(0, 0);
		}
		if (-1 != -1261835713 * combineTemplate) {
			sprite.method2079(0, 0);
		}
		if (textType == 1 || 2 == textType && (1 == stackable * 1146503759 || 1 != amount) && -1 != amount) {
			font.method2291(Class571.method9654(amount, provider.language, defaults), 0, 9, -256, -16777215);
		}
		is = class134.method2404(0, 0, 36, 32);
		for (int i_88_ = 0; i_88_ < is.length; i_88_++) {
			if ((is[i_88_] & 0xffffff) == 0) {
				is[i_88_] = 0;
			} else {
				is[i_88_] |= ~0xffffff;
			}
		}
		return is;
	}

	int[] method13585(int[] is, int i, int i_45_) {
		int[] is_46_ = new int[1152];
		int i_47_ = 0;

		for (int i_48_ = 0; i_48_ < 32; i_48_++) {
			for (int i_49_ = 0; i_49_ < 36; i_49_++) {
				int i_50_ = is[i_47_];

				if (0 == i_50_) {
					if (i_49_ > 0 && 0 != is[i_47_ - 1]) {
						i_50_ = i;
					} else if (i_48_ > 0 && is[i_47_ - 36] != 0) {
						i_50_ = i;
					} else if (i_49_ < 35 && 0 != is[i_47_ + 1]) {
						i_50_ = i;
					} else if (i_48_ < 31 && is[i_47_ + 36] != 0) {
						i_50_ = i;
					}
				}

				is_46_[i_47_++] = i_50_;
			}
		}

		return is_46_;
	}

	void method13586(int[] is, int i, int i_51_) {
		for (int i_52_ = 31; i_52_ > 0; i_52_--) {
			int i_53_ = i_52_ * 36;

			for (int i_54_ = 35; i_54_ > 0; i_54_--) {
				if (0 == is[i_53_ + i_54_] && is[i_53_ + i_54_ - 1 - 36] != 0) {
					is[i_54_ + i_53_] = i;
				}
			}
		}
	}

}