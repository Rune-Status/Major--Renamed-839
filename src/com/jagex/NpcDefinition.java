package com.jagex;

import java.util.Arrays;

public class NpcDefinition implements Definition {

	public static final int anInt3012 = 1;
	public static short[] aShortArray3034 = new short[256];
	public static final int anInt3057 = 8;
	public static final int anInt3063 = 2;
	static final int anInt3082 = 6;

	DefinitionLoader<NpcDefinition> definitions;
	public int[] anIntArray3011;
	int ambience;
	byte aByte3014;
	public int anInt3015;
	public String name = "null";
	int[][] translations;
	public int[] models;
	public int[] headModels;
	public NpcDirection aClass621_3020;
	public int anInt3021;
	short[] originalColours;
	public short[] replacementColours;
	public byte aByte3024;
	short[] originalTextures;
	public short[] replacementTextures;
	public byte[] aByteArray3027;
	public byte[] aByteArray3028;
	public int anInt3029;
	byte aByte3030;
	int[] anIntArray3031;
	byte aByte3032;
	public boolean aBool3033;
	public int attackCursor;
	public boolean drawMapdot;
	public int combat;
	int scaleXZ;
	public int anInt3039;
	public boolean aBool3040;
	public boolean aBool3041;
	public int anInt3042;
	public Class379 aClass379_3043;
	int anInt3044;
	BaseNpcDefinitionProvider provider;
	public short[] aShortArray3046;
	public int armyIcon;
	public int contrast;
	public int[] morphisms;
	public int anInt3050;
	int varp;
	public boolean aBool3052;
	public boolean slowWalk;
	int varbit;
	public short aShort3055;
	byte aByte3056;
	public byte aByte3058;
	public short aShort3059;
	public byte aByte3060;
	public byte movementCapabilities;
	int scaleY;
	byte[] recolourPalette;
	public int anInt3065;
	public int boundSize = 694880435;
	public short aShort3067;
	public int anInt3068;
	public int anInt3069;
	public int anInt3070;
	HashTable parameters;
	public int height;
	public int anInt3073;
	public int mapFunction;
	public int[] anIntArray3075;
	public byte aByte3076;
	public String[] actions;
	public boolean aBool3078;
	public int anInt3079;
	public int anInt3080;
	public int anInt3081;
	public boolean animateIdle;
	public boolean aBool3084;
	public int id;
	public static NpcDefinitionLoader loader;

	NpcDefinition(int id, BaseNpcDefinitionProvider provider, DefinitionLoader<NpcDefinition> loader) {
		this.id = id;
		anInt3021 = -1700875047;
		attackCursor = -3151855;
		drawMapdot = true;
		combat = -113683803;
		scaleXZ = 373310848;
		scaleY = 2105229184;
		anIntArray3011 = null;
		aShortArray3046 = null;
		armyIcon = -1111060003;
		contrast = -240615200;
		varbit = 540961441;
		varp = 1644534961;
		aBool3052 = true;
		slowWalk = true;
		animateIdle = true;
		aByte3024 = (byte) -96;
		aByte3058 = (byte) -16;
		aShort3059 = (short) -1;
		anInt3029 = 506773403;
		anInt3065 = -77069175;
		anInt3050 = -1320378871;
		anInt3042 = -1363183263;
		anInt3070 = 966643283;
		height = 2117797645;
		aClass621_3020 = NpcDirection.SOUTH;
		mapFunction = -145498509;
		aByte3076 = (byte) -1;
		anInt3073 = -1269902957;
		anInt3079 = 737202944;
		anInt3080 = 1608790784;
		aBool3078 = true;
		anInt3015 = 1561293483 * id;
		this.provider = provider;
		definitions = loader;
		actions = provider.defaultActions.clone();
	}

	@Override
	public void method35() {
		if (null == models) {
			models = new int[0];
		}
		if (aByte3076 == -1) {
			if (null == provider || GameContext.RUNESCAPE == provider.game) {
				aByte3076 = (byte) 1;
			} else {
				aByte3076 = (byte) 0;
			}
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

	public final Model method5103(Toolkit toolkit, int i, Class678_Sub6 class678_sub6, VariableLoader interface14,
			VariableProvider interface12, Class650 class650, Class650 class650_1_, Class650[] class650s, int[] is,
			int i_2_, Class267 class267) {
		return method5104(toolkit, i, class678_sub6, interface14, interface12, class650, class650_1_, class650s, is,
				i_2_, class267, 995718295 * anInt3021, true);
	}

	public final Model method5104(Toolkit toolkit, int i, Class678_Sub6 class678_sub6, VariableLoader interface14,
			VariableProvider interface12, Class650 class650, Class650 class650_4_, Class650[] class650s, int[] is,
			int i_5_, Class267 class267, int i_6_, boolean bool) {
		if (morphisms != null) {
			NpcDefinition definition = morph(interface14, interface12);
			if (definition == null) {
				return null;
			}

			return definition.method5104(toolkit, i, class678_sub6, interface14, interface12, class650, class650_4_,
					class650s, is, i_5_, class267, i_6_, bool);
		}

		int i_9_ = i;
		if (128 != scaleY * -1022703233) {
			i_9_ |= 0x2;
		}

		if (-1100486877 * scaleXZ != 128) {
			i_9_ |= 0x5;
		}

		boolean bool_10_ = false;
		int i_11_ = null != class650s ? class650s.length : 0;
		for (int i_12_ = 0; i_12_ < i_11_; i_12_++) {
			if (class650s[i_12_] != null) {
				i_9_ |= class650s[i_12_].method13457();
				bool_10_ = true;
			}
		}

		if (null != class650) {
			i_9_ |= class650.method13457();
			bool_10_ = true;
		}

		if (class650_4_ != null) {
			i_9_ |= class650_4_.method13457();
			bool_10_ = true;
		}

		long l = anInt3015 * -181078013 | 976039213 * toolkit.id << 16;
		if (null != class267) {
			l |= class267.aLong2977 * 8555965287965026931L << 24;
		}

		Model class143;
		synchronized (provider.aClass168_2993) {
			class143 = provider.aClass168_2993.get(l);
		}

		Class515 class515 = null;
		if (!bool && -1 != i_6_) {
			class515 = class678_sub6.get(i_6_);
		} else if (anInt3021 * 995718295 != -1) {
			class515 = class678_sub6.get(995718295 * anInt3021);
		}

		if (class143 == null || (class143.functionMask() & i_9_) != i_9_) {
			if (null != class143) {
				i_9_ |= class143.functionMask();
			}

			int i_13_ = i_9_;
			if (null != originalColours) {
				i_13_ |= 0x4000;
			}

			if (originalTextures != null) {
				i_13_ |= 0x8000;
			}

			if (aByte3032 != 0) {
				i_13_ |= 0x80000;
			}

			int[] is_14_ = class267 != null && null != class267.models ? class267.models : models;
			boolean bool_15_ = false;

			synchronized (provider.models) {
				for (int i_16_ = 0; i_16_ < is_14_.length; i_16_++) {
					if (-1 != is_14_[i_16_] && !provider.models.loaded(is_14_[i_16_], 0)) {
						bool_15_ = true;
					}
				}
			}

			if (bool_15_) {
				return null;
			}

			BaseModel[] class144s = new BaseModel[is_14_.length];
			for (int i_17_ = 0; i_17_ < is_14_.length; i_17_++) {
				if (is_14_[i_17_] != -1) {
					synchronized (provider.models) {
						class144s[i_17_] = BaseModel.lookup(provider.models, is_14_[i_17_], 0);
					}

					if (null != class144s[i_17_]) {
						if (class144s[i_17_].version < 13) {
							class144s[i_17_].method3103(2);
						}

						if (translations != null && null != translations[i_17_]) {
							class144s[i_17_].translate(translations[i_17_][0], translations[i_17_][1],
									translations[i_17_][2]);
						}
					}
				}
			}

			if (class267 != null) {
				for (int i_18_ = 0; i_18_ < class144s.length; i_18_++) {
					if (null != class144s[i_18_]) {
						if (class267.aFloatArray2975 != null && class267.aFloatArray2975[i_18_] != 0.0F) {
							class144s[i_18_].method3125(class267.aFloatArray2975[i_18_]);
						}

						if (null != class267.anIntArrayArray2980) {
							class144s[i_18_].method3102(class267.anIntArrayArray2980[i_18_][0],
									class267.anIntArrayArray2980[i_18_][1], class267.anIntArrayArray2980[i_18_][2]);
						}

						if (null != class267.anIntArrayArray2979) {
							class144s[i_18_].translate(class267.anIntArrayArray2979[i_18_][0],
									class267.anIntArrayArray2979[i_18_][1], class267.anIntArrayArray2979[i_18_][2]);
						}
					}
				}
			}

			if (null != class515 && class515.anIntArrayArray7043 != null) {
				for (int i_19_ = 0; i_19_ < class515.anIntArrayArray7043.length; i_19_++) {
					if (i_19_ < class144s.length && null != class144s[i_19_]) {
						int i_20_ = 0;
						int i_21_ = 0;
						int i_22_ = 0;
						int i_23_ = 0;
						int i_24_ = 0;
						int i_25_ = 0;

						if (class515.anIntArrayArray7043[i_19_] != null) {
							i_20_ = class515.anIntArrayArray7043[i_19_][0];
							i_21_ = class515.anIntArrayArray7043[i_19_][1];
							i_22_ = class515.anIntArrayArray7043[i_19_][2];
							i_23_ = class515.anIntArrayArray7043[i_19_][3] << 3;
							i_24_ = class515.anIntArrayArray7043[i_19_][4] << 3;
							i_25_ = class515.anIntArrayArray7043[i_19_][5] << 3;
						}

						if (0 != i_23_ || 0 != i_24_ || i_25_ != 0) {
							class144s[i_19_].method3102(i_23_, i_24_, i_25_);
						}

						if (i_20_ != 0 || 0 != i_21_ || 0 != i_22_) {
							class144s[i_19_].translate(i_20_, i_21_, i_22_);
						}
					}
				}
			}

			BaseModel class144;
			if (class144s.length == 1) {
				class144 = class144s[0];
			} else {
				class144 = new BaseModel(class144s, class144s.length);
			}

			class143 = toolkit.createModel(class144, i_13_, provider.anInt2992 * 1151373881,
					ambience * -308407079 + 64, anInt3044 * -570909713 + 850);
			if (originalColours != null) {
				short[] is_26_;
				if (null != class267 && class267.colours != null) {
					is_26_ = class267.colours;
				} else {
					is_26_ = replacementColours;
				}

				for (int i_27_ = 0; i_27_ < originalColours.length; i_27_++) {
					if (recolourPalette != null && i_27_ < recolourPalette.length) {
						class143.recolour(originalColours[i_27_], aShortArray3034[recolourPalette[i_27_] & 0xff]);
					} else {
						class143.recolour(originalColours[i_27_], is_26_[i_27_]);
					}
				}
			}

			if (originalTextures != null) {
				short[] replacements;
				if (null != class267 && class267.textures != null) {
					replacements = class267.textures;
				} else {
					replacements = replacementTextures;
				}

				for (int i_29_ = 0; i_29_ < originalTextures.length; i_29_++) {
					class143.retexture(originalTextures[i_29_], replacements[i_29_]);
				}
			}

			if (aByte3032 != 0) {
				class143.method2937(aByte3014, aByte3030, aByte3056, aByte3032 & 0xff);
			}

			class143.method2962();
			class143.updateFunctionMask(i_9_);

			synchronized (provider.aClass168_2993) {
				provider.aClass168_2993.put(l, class143);
			}
		}

		Model class143_30_ = class143.method2890((byte) 4, i_9_, true);
		boolean bool_31_ = false;
		if (is != null) {
			for (int i_32_ = 0; i_32_ < 12; i_32_++) {
				if (-1 != is[i_32_]) {
					bool_31_ = true;
				}
			}
		}

		if (!bool_10_ && !bool_31_) {
			return class143_30_;
		}

		Class405[] class405s = null;
		if (null != class515) {
			class405s = class515.method8826();
		}

		if (bool_31_ && null != class405s) {
			for (int i_33_ = 0; i_33_ < 12; i_33_++) {
				if (class405s[i_33_] != null) {
					class143_30_.transform(class405s[i_33_], 1 << i_33_, true);
				}
			}
		}

		int i_34_ = 0;
		int i_35_ = 1;

		while (i_34_ < i_11_) {
			if (null != class650s[i_34_]) {
				class650s[i_34_].method13459(class143_30_, 0, i_35_, 1691643289);
			}
			i_34_++;
			i_35_ <<= 1;
		}

		if (bool_31_) {
			for (i_34_ = 0; i_34_ < 12; i_34_++) {
				if (is[i_34_] != -1) {
					i_35_ = is[i_34_] - i_5_;
					i_35_ &= 0x3fff;

					Class405 class405 = new Class405();
					class405.method6758(0.0F, 1.0F, 0.0F, Class373.method6114(i_35_));
					class143_30_.transform(class405, 1 << i_34_, false);
				}
			}
		}

		if (bool_31_ && class405s != null) {
			for (i_34_ = 0; i_34_ < 12; i_34_++) {
				if (class405s[i_34_] != null) {
					class143_30_.transform(class405s[i_34_], 1 << i_34_, false);
				}
			}
		}

		if (null != class650 && class650_4_ != null) {
			QuestDefinitionProvider.method4610(class143_30_, class650, class650_4_);
		} else if (class650 != null) {
			class650.method13458(class143_30_, 0);
		} else if (class650_4_ != null) {
			class650_4_.method13458(class143_30_, 0);
		}

		if (-1100486877 * scaleXZ != 128 || 128 != scaleY * -1022703233) {
			class143_30_.scale(-1100486877 * scaleXZ, scaleY * -1022703233, -1100486877 * scaleXZ);
		}

		class143_30_.updateFunctionMask(i);
		return class143_30_;
	}

	public final Model method5105(Toolkit toolkit, int i, VariableLoader loader, VariableProvider interface12,
			Class650 class650, Class267 class267) {
		if (morphisms != null) {
			NpcDefinition definition = morph(loader, interface12);
			if (definition == null) {
				return null;
			}

			return definition.method5105(toolkit, i, loader, interface12, class650, class267);
		}

		if (headModels == null && (class267 == null || null == class267.models)) {
			return null;
		}

		int i_38_ = i;
		if (class650 != null) {
			i_38_ |= class650.method13457();
		}

		long l = -181078013 * anInt3015 | toolkit.id * 976039213 << 16;
		if (class267 != null) {
			l |= 8555965287965026931L * class267.aLong2977 << 24;
		}

		Model class143;
		synchronized (provider.aClass168_2991) {
			class143 = provider.aClass168_2991.get(id);
		}

		if (null == class143 || (class143.functionMask() & i_38_) != i_38_) {
			if (class143 != null) {
				i_38_ |= class143.functionMask();
			}

			int i_39_ = i_38_;
			if (null != originalColours) {
				i_39_ |= 0x4000;
			}

			if (originalTextures != null) {
				i_39_ |= 0x8000;
			}

			if (0 != aByte3032) {
				i_39_ |= 0x80000;
			}

			int[] is = class267 != null && class267.models != null ? class267.models : headModels;
			boolean bool = false;
			synchronized (provider.models) {
				for (int i_40_ = 0; i_40_ < is.length; i_40_++) {
					if (!provider.models.loaded(is[i_40_], 0)) {
						bool = true;
					}
				}
			}

			if (bool) {
				return null;
			}

			BaseModel[] class144s = new BaseModel[is.length];
			synchronized (provider.models) {
				for (int i_41_ = 0; i_41_ < is.length; i_41_++) {
					class144s[i_41_] = BaseModel.lookup(provider.models, is[i_41_], 0);
				}
			}

			for (int i_42_ = 0; i_42_ < is.length; i_42_++) {
				if (null != class144s[i_42_] && class144s[i_42_].version < 13) {
					class144s[i_42_].method3103(2);
				}
			}

			BaseModel class144;
			if (1 == class144s.length) {
				class144 = class144s[0];
			} else {
				class144 = new BaseModel(class144s, class144s.length);
			}

			class143 = toolkit.createModel(class144, i_39_, 1151373881 * provider.anInt2992, 64, 768);
			if (originalColours != null) {
				short[] is_43_;
				if (class267 != null && class267.colours != null) {
					is_43_ = class267.colours;
				} else {
					is_43_ = replacementColours;
				}

				for (int i_44_ = 0; i_44_ < originalColours.length; i_44_++) {
					if (null != recolourPalette && i_44_ < recolourPalette.length) {
						class143.recolour(originalColours[i_44_], aShortArray3034[recolourPalette[i_44_] & 0xff]);
					} else {
						class143.recolour(originalColours[i_44_], is_43_[i_44_]);
					}
				}
			}

			if (originalTextures != null) {
				short[] is_45_;
				if (null != class267 && null != class267.textures) {
					is_45_ = class267.textures;
				} else {
					is_45_ = replacementTextures;
				}

				for (int i_46_ = 0; i_46_ < originalTextures.length; i_46_++) {
					class143.retexture(originalTextures[i_46_], is_45_[i_46_]);
				}
			}

			if (aByte3032 != 0) {
				class143.method2937(aByte3014, aByte3030, aByte3056, aByte3032 & 0xff);
			}

			class143.updateFunctionMask(i_38_);
			synchronized (provider.aClass168_2991) {
				provider.aClass168_2991.put(l, class143);
			}
		}

		if (class650 != null) {
			class143 = class143.method2890((byte) 1, i_38_, true);
			class650.method13458(class143, 0);
		}

		class143.updateFunctionMask(i);
		return class143;
	}

	public final boolean ready() {
		if (models == null) {
			return true;
		}

		boolean loaded = true;
		for (int model : models) {
			if (!provider.models.loaded(model, 0)) {
				loaded = false;
			}
		}

		return loaded;
	}

	public int getParameter(int id, int defaultValue) {
		if (null == parameters) {
			return defaultValue;
		}

		LinkableInt linkable = (LinkableInt) parameters.get(id);
		if (null == linkable) {
			return defaultValue;
		}

		return -1189875169 * linkable.value;
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

	public final NpcDefinition morph(VariableLoader loader, VariableProvider provider) {
		int index = -1;
		if (varbit * 1698432671 != -1) {
			VariableBitsDefinition variable = loader.getVarbit(varbit * 1698432671);
			if (variable != null) {
				index = provider.getVarbit(variable);
			}
		} else if (-1 != varp * 1866781615) {
			BaseVariableParameterDefinition variable = loader.getVarp(VarpType.PLAYER, 1866781615 * varp);
			if (variable != null) {
				index = provider.getVarp(variable);
			}
		}

		if (index < 0 || index >= morphisms.length - 1) {
			int id = morphisms[morphisms.length - 1];
			if (id != -1) {
				return definitions.get(id);
			}

			return null;
		}

		if (morphisms[index] == -1) {
			return null;
		}

		return definitions.get(morphisms[index]);
	}

	public boolean method5111() {
		if (morphisms == null) {
			return -1 != -1110085267 * anInt3029 || -1 != -1939755065 * anInt3050 || -232975009 * anInt3042 != -1;
		}

		for (int morphism : morphisms) {
			if (morphism != -1) {
				NpcDefinition cached = definitions.get(morphism);
				if (cached.anInt3029 * -1110085267 != -1 || -1 != cached.anInt3050 * -1939755065
						|| -232975009 * cached.anInt3042 != -1) {
					return true;
				}
			}
		}
		return false;
	}

	public int method5112(int i, int i_56_) {
		if (anIntArray3031 == null) {
			return -1;
		}
		return anIntArray3031[i];
	}

	public boolean method5128(VariableLoader interface14, VariableProvider interface12, int i) {
		if (null == morphisms) {
			return true;
		}
		int i_57_ = -1;
		if (-1 != varbit * 1698432671) {
			VariableBitsDefinition class301 = interface14.getVarbit(varbit * 1698432671);
			if (class301 != null) {
				i_57_ = interface12.getVarbit(class301);
			}
		} else if (varp * 1866781615 != -1) {
			BaseVariableParameterDefinition class131 = interface14.getVarp(VarpType.PLAYER, varp * 1866781615);
			if (null != class131) {
				i_57_ = interface12.getVarp(class131);
			}
		}
		if (i_57_ < 0 || i_57_ >= morphisms.length - 1) {
			int i_58_ = morphisms[morphisms.length - 1];
			return -1 != i_58_;
		}
		return morphisms[i_57_] != -1;
	}

	void decode(Buffer buffer, int opcode) {
		if (opcode == 1) {
			int count = buffer.readUByte();
			models = new int[count];
			for (int index = 0; index < count; index++) {
				models[index] = buffer.readSmart32();
			}
		} else if (2 == opcode) {
			name = buffer.readString();
		} else if (opcode == 12) {
			boundSize = buffer.readUByte() * 694880435;
		} else if (opcode >= 30 && opcode < 35) {
			actions[opcode - 30] = buffer.readString();
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
		} else if (opcode == 44) {
			int i_68_ = buffer.readUShort();
			int i_69_ = 0;
			for (int i_70_ = i_68_; i_70_ > 0; i_70_ >>= 1) {
				i_69_++;
			}
			aByteArray3027 = new byte[i_69_];
			byte i_71_ = 0;
			for (int i_72_ = 0; i_72_ < i_69_; i_72_++) {
				if ((i_68_ & 1 << i_72_) > 0) {
					aByteArray3027[i_72_] = i_71_;
					i_71_++;
				} else {
					aByteArray3027[i_72_] = (byte) -1;
				}
			}
		} else if (45 == opcode) {
			int i_73_ = buffer.readUShort();
			int i_74_ = 0;
			for (int i_75_ = i_73_; i_75_ > 0; i_75_ >>= 1) {
				i_74_++;
			}
			aByteArray3028 = new byte[i_74_];
			byte i_76_ = 0;
			for (int i_77_ = 0; i_77_ < i_74_; i_77_++) {
				if ((i_73_ & 1 << i_77_) > 0) {
					aByteArray3028[i_77_] = i_76_;
					i_76_++;
				} else {
					aByteArray3028[i_77_] = (byte) -1;
				}
			}
		} else if (60 == opcode) {
			int i_78_ = buffer.readUByte();
			headModels = new int[i_78_];
			for (int i_79_ = 0; i_79_ < i_78_; i_79_++) {
				headModels[i_79_] = buffer.readSmart32();
			}
		} else if (opcode == 93) {
			drawMapdot = false;
		} else if (opcode == 95) {
			combat = buffer.readUShort() * 113683803;
		} else if (opcode == 97) {
			scaleXZ = buffer.readUShort() * 1345093771;
		} else if (opcode == 98) {
			scaleY = buffer.readUShort() * -419760513;
		} else if (opcode == 99) {
			aBool3040 = true;
		} else if (100 == opcode) {
			ambience = buffer.readByte() * 72428393;
		} else if (101 == opcode) {
			anInt3044 = buffer.readByte() * -1973567669;
		} else if (opcode == 102) {
			int i_80_ = buffer.readUByte();
			int i_81_ = 0;
			for (int i_82_ = i_80_; 0 != i_82_; i_82_ >>= 1) {
				i_81_++;
			}
			anIntArray3011 = new int[i_81_];
			aShortArray3046 = new short[i_81_];
			for (int i_83_ = 0; i_83_ < i_81_; i_83_++) {
				if ((i_80_ & 1 << i_83_) == 0) {
					anIntArray3011[i_83_] = -1;
					aShortArray3046[i_83_] = (short) -1;
				} else {
					anIntArray3011[i_83_] = buffer.readSmart32();
					aShortArray3046[i_83_] = (short) buffer.readDecrSmart();
				}
			}
		} else if (103 == opcode) {
			contrast = buffer.readUShort() * -544390137;
		} else if (opcode == 106 || opcode == 118) {
			varbit = buffer.readUShort() * -540961441;
			if (varbit * 1698432671 == 65535) {
				varbit = 540961441;
			}

			varp = buffer.readUShort() * -1644534961;
			if (65535 == 1866781615 * varp) {
				varp = 1644534961;
			}

			int last = -1;
			if (118 == opcode) {
				last = buffer.readUShort();
				if (last == 65535) {
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
			morphisms[1 + count] = last;
		} else if (opcode == 107) {
			aBool3052 = false;
		} else if (109 == opcode) {
			slowWalk = false;
		} else if (111 == opcode) {
			animateIdle = false;
		} else if (opcode == 113) {
			aShort3055 = (short) buffer.readUShort();
			aShort3067 = (short) buffer.readUShort();
		} else if (opcode == 114) {
			aByte3024 = buffer.readByte();
			aByte3058 = buffer.readByte();
		} else if (119 == opcode) {
			movementCapabilities = buffer.readByte();
		} else if (opcode == 121) {
			translations = new int[models.length][];
			int count = buffer.readUByte();

			for (int i = 0; i < count; i++) {
				int index = buffer.readUByte();
				int[] translations = this.translations[index] = new int[3];
				translations[0] = buffer.readByte();
				translations[1] = buffer.readByte();
				translations[2] = buffer.readByte();
			}
		} else if (opcode == 123) {
			height = buffer.readUShort() * -2117797645;
		} else if (opcode == 125) {
			aClass621_3020 = CompressionType.findIdentifiable(NpcDirection.values(), buffer.readByte());
		} else if (127 == opcode) {
			anInt3021 = buffer.readUShort() * 1700875047;
		} else if (128 == opcode) {
			CompressionType.findIdentifiable(MovementType.values(), buffer.readUByte());
		} else if (134 == opcode) {
			anInt3029 = buffer.readUShort() * -506773403;
			if (anInt3029 * -1110085267 == 65535) {
				anInt3029 = 506773403;
			}

			anInt3065 = buffer.readUShort() * 77069175;
			if (-1218621881 * anInt3065 == 65535) {
				anInt3065 = -77069175;
			}

			anInt3050 = buffer.readUShort() * 1320378871;
			if (anInt3050 * -1939755065 == 65535) {
				anInt3050 = -1320378871;
			}

			anInt3042 = buffer.readUShort() * 1363183263;
			if (anInt3042 * -232975009 == 65535) {
				anInt3042 = -1363183263;
			}
			anInt3068 = buffer.readUByte() * -1561920937;
		} else if (opcode == 135 || opcode == 136) {
			buffer.readUByte();
			buffer.readUShort();
		} else if (137 == opcode) {
			attackCursor = buffer.readUShort() * 3151855;
		} else if (138 == opcode) {
			armyIcon = buffer.readSmart32() * 1111060003;
		} else if (opcode == 140) {
			anInt3070 = buffer.readUByte() * 121691821;
		} else if (opcode == 141) {
			aBool3041 = true;
		} else if (142 == opcode) {
			mapFunction = buffer.readUShort() * 145498509;
		} else if (143 == opcode) {
			aBool3033 = true;
		} else if (opcode >= 150 && opcode < 155) {
			actions[opcode - 150] = buffer.readString();
			if (!provider.membersServer) {
				actions[opcode - 150] = null;
			}
		} else if (155 == opcode) {
			aByte3014 = buffer.readByte();
			aByte3030 = buffer.readByte();
			aByte3056 = buffer.readByte();
			aByte3032 = buffer.readByte();
		} else if (opcode == 158) {
			aByte3076 = (byte) 1;
		} else if (159 == opcode) {
			aByte3076 = (byte) 0;
		} else if (160 == opcode) {
			int i_90_ = buffer.readUByte();
			anIntArray3075 = new int[i_90_];
			for (int i_91_ = 0; i_91_ < i_90_; i_91_++) {
				anIntArray3075[i_91_] = buffer.readUShort();
			}
		} else if (opcode != 162) {
			if (163 == opcode) {
				anInt3073 = buffer.readUByte() * 1269902957;
			} else if (opcode == 164) {
				anInt3079 = buffer.readUShort() * -735317805;
				anInt3080 = buffer.readUShort() * -429923277;
			} else if (opcode == 165) {
				anInt3081 = buffer.readUByte() * -886899535;
			} else if (168 == opcode) {
				anInt3069 = buffer.readUByte() * 1667459257;
			} else if (169 == opcode) {
				aBool3078 = false;
			} else if (opcode >= 170 && opcode < 176) {
				if (null == anIntArray3031) {
					anIntArray3031 = new int[6];
					Arrays.fill(anIntArray3031, -1);
				}
				int i_92_ = buffer.readUShort();
				if (i_92_ == 65535) {
					i_92_ = -1;
				}
				anIntArray3031[opcode - 170] = i_92_;
			} else if (178 != opcode) {
				if (179 == opcode) {
					aClass379_3043 = new Class379();
					aClass379_3043.aFloat4206 = buffer.readSmart();
					aClass379_3043.aFloat4203 = buffer.readSmart();
					aClass379_3043.aFloat4209 = buffer.readSmart();
					aClass379_3043.aFloat4205 = buffer.readSmart();
					aClass379_3043.aFloat4202 = buffer.readSmart();
					aClass379_3043.aFloat4207 = buffer.readSmart();
				} else if (180 == opcode) {
					anInt3039 = (buffer.readUByte() & 0xff) * 1338304613;
				} else if (181 == opcode) {
					aShort3059 = (short) buffer.readUShort();
					aByte3060 = (byte) buffer.readUByte();
				} else if (182 == opcode) {
					aBool3084 = true;
				} else if (249 == opcode) {
					int i_93_ = buffer.readUByte();
					if (parameters == null) {
						int i_94_ = HashTable.nextPowerOfTwo(i_93_);
						parameters = new HashTable(i_94_);
					}
					for (int i_95_ = 0; i_95_ < i_93_; i_95_++) {
						boolean bool = buffer.readUByte() == 1;
						int i_96_ = buffer.readUTriByte();
						Linkable class480;
						if (bool) {
							class480 = new LinkableObject(buffer.readString());
						} else {
							class480 = new LinkableInt(buffer.readInt());
						}
						parameters.put(i_96_, class480);
					}
				}
			}
		}
	}

}