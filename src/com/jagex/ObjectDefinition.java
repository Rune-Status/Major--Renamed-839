package com.jagex;

import java.util.Arrays;

public class ObjectDefinition implements Definition {
	public static short[] aShortArray7446 = new short[256];
	static final int anInt7429 = 6;
	static final int anInt7447 = 127007;

	static void method9290(Toolkit toolkit) {
		if ((84366055 * Class56.menuOptionCount >= 2 || Client.widgetSelected) && null == Client.aClass226_10801) {
			String string;
			if (Client.widgetSelected && 84366055 * Class56.menuOptionCount < 2) {
				string = new StringBuilder().append(Client.selectedWidgetAction)
						.append(TranslatableString.aClass5_157.translate(Client.currentLanguage))
						.append(Client.aString10789).append(" ").append(Class60.aString677).toString();
			} else if (Class612.method10339() && 84366055 * Class56.menuOptionCount > 2) {
				string = Class589.method9918(Class480_Sub41_Sub4.aClass480_Sub31_Sub17_11430);
			} else {
				MenuOption class480_sub31_sub17 = Class480_Sub41_Sub4.aClass480_Sub31_Sub17_11430;
				if (class480_sub31_sub17 == null) {
					return;
				}
				string = Class589.method9918(class480_sub31_sub17);
				int[] is = Widget.method4318(class480_sub31_sub17);
				if (is != null) {
					string = new StringBuilder().append(string).append(UrlResourceRequest.method1572(is)).toString();
				}
			}
			if (84366055 * Class56.menuOptionCount > 2) {
				string = new StringBuilder().append(string).append(Item.getColourHtml(16777215)).append(" / ")
						.append(84366055 * Class56.menuOptionCount - 2)
						.append(TranslatableString.MORE_OPTIONS.translate(Client.currentLanguage)).toString();
			}
			if (null != Class56.aClass226_636) {
				Font class132 = Class56.aClass226_636.method4229(Class509.aClass374_6997, Client.anInterface47_10645,
						-70505081);
				if (class132 == null) {
					class132 = Class450.b12Full;
				}
				class132.method2300(string, 469815189 * Class56.anInt637, 838332027 * Class56.anInt638,
						Class56.aClass226_636.width * 688089097, 1362321717 * Class56.aClass226_636.height,
						Class56.aClass226_636.colour * 923665021, Class56.aClass226_636.anInt2425 * -1694773323,
						Class56.aClass226_636.anInt2546 * 747852125, 982465999 * Class56.aClass226_636.anInt2458,
						Client.aRandom10887, Class54.anInt608, Client.anIntArray10854, Class368.aClass116Array4053,
						LruDefinitionCacheIterator.anIntArray278, 2146236134);
				Client.method8796(Client.anIntArray10854[0], Client.anIntArray10854[1], Client.anIntArray10854[2],
						Client.anIntArray10854[3]);
			}
		}
	}

	static void method9291(Toolkit toolkit) {
		if (-1503545849 * Class63.anInt943 != Client.localPlayer.plane && Client.aClass460_10760.method7687() != null) {
			TimeUtil.time();
			if (Class56.method1351(toolkit, Client.localPlayer.plane, 265232705)) {
				Class63.anInt943 = Client.localPlayer.plane * -742271049;
			}
		}
	}

	static final boolean modelsLoaded(ObjectDefinitionLoader loader, int id, int type) {
		ObjectDefinition definition = loader.get(id);
		if (type == 11) {
			type = 10;
		} else if (type >= 5 && type <= 8) {
			type = 4;
		}

		return definition.typeLoaded(type);
	}

	public boolean isMembers;
	public boolean aBool7383;
	public boolean aBool7392;
	public boolean aBool7398;
	public boolean aBool7417;
	public boolean aBool7420;
	public boolean aBool7434;
	public boolean aBool7435;
	public boolean aBool7437;
	public boolean aBool7441;
	public boolean aBool7443;
	public Class379 aClass379_7439;
	public Class550 aClass550_7388;
	public String[] actions;
	public int anInt7367;
	public int anInt7369;
	public int anInt7386;
	public int anInt7389;
	public int anInt7393;
	public int anInt7394;
	public int anInt7395;
	public int anInt7401;
	public int anInt7406;
	public int anInt7407;
	public int anInt7422;
	public int anInt7427;
	public int anInt7430;
	public int anInt7431;
	public int anInt7432;
	public int anInt7438;
	public int anInt7445;
	public int[] anIntArray7433;
	public int[] anIntArray7440;
	public boolean castsShadow;
	public int id;
	public boolean invertMapScene;
	public int length;
	public int mapFunction;
	public int mapscene;
	public boolean mirrorModel;
	public int[] morphisms;
	public String name = "null";
	public int occludes;
	public int width;
	byte aByte7382;
	byte aByte7384;
	byte aByte7412;
	byte aByte7428;
	byte aByte7444 = 0;
	byte[] aByteArray7380;
	byte[] aByteArray7390;
	int ambient;
	int anInt7391;
	int anInt7409;
	int anInt7418;
	int anInt7425;
	int[] anIntArray7396;
	int[] anIntArray7397;
	int[] anIntArray7403;
	boolean blockRange;
	int contrast;
	DefinitionLoader<ObjectDefinition> loader;
	int[][] models;
	byte[] modelTypes;
	short[] originalColours;
	short[] originalTextures;
	HashTable<Linkable> parameters;
	BaseObjectDefinitionProvider provider;
	byte[] recolourPalette;
	short[] replacementColours;
	short[] replacementTextures;
	int scaleX;
	int scaleY;
	int scaleZ;
	int translateX;
	int translateY;
	int translateZ;
	int varbit;

	int varp;

	ObjectDefinition(int id, BaseObjectDefinitionProvider provider, DefinitionLoader<ObjectDefinition> loader) {
		this.id = id;
		width = -1519782823;
		length = 1547662255;
		anInt7367 = 482908454;
		anInt7389 = -1123018159;
		anInt7391 = 873556181;
		occludes = 134588641;
		anInt7394 = -1639855424;
		anInt7401 = 388773824;
		mapFunction = 841554607;
		mapscene = 65927325;
		castsShadow = true;
		scaleX = -445169536;
		scaleY = 815622528;
		scaleZ = -1068811904;
		anInt7422 = 1882964605;
		varbit = 486005247;
		varp = 1350027371;
		anInt7427 = -1492088787;
		anInt7430 = -1463234029;
		aBool7434 = true;
		aBool7383 = true;
		anInt7438 = -2084779264;
		anInt7393 = -1211041024;
		aClass550_7388 = Class550.aClass550_7473;
		anInt7369 = 1714344229 * id;
		this.provider = provider;
		this.loader = loader;
		actions = provider.defaultActions.clone();
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
		method9243();
		if (blockRange) {
			anInt7367 = 0;
		}
		if (!provider.membersServer && isMembers) {
			actions = null;
			anIntArray7440 = null;
		}
	}

	public final boolean method9245(Class583 class583) {
		if (models == null) {
			return true;
		}
		boolean bool = true;
		for (int[] element : models) {
			for (int i_43_ = 0; i_43_ < element.length; i_43_++) {
				boolean bool_44_ = provider.modelLoaded(element[i_43_]);
				bool &= bool_44_;
				if (!bool_44_) {
					class583.anInt7770 = element[i_43_] * 1723557403;
				}
			}
		}
		return bool;
	}

	public final synchronized Model method9246(Toolkit toolkit, int attributes, int type, int orientation,
			Ground class120, Ground class120_47_, int i_48_, int i_49_, int i_50_, Class650 class650,
			Class540 class540, int i_51_) {
		if (ObjectCategory.method5284(type)) {
			type = -1050493863 * ObjectCategory.aClass541_7344.type;
		}

		long key = orientation + (type << 3) + (-894246227 * anInt7369 << 10);
		int mask = attributes;
		key |= toolkit.id * 976039213 << 29;
		if (null != class540) {
			key |= class540.aLong7332 * 189278560431466431L << 32;
		}
		if (class650 != null) {
			attributes |= class650.method13457();
		}

		if (aByte7428 == 3) {
			attributes |= 0x7;
		} else {
			if (0 != aByte7428 || 0 != -262717273 * anInt7418) {
				attributes |= 0x2;
			}
			if (0 != 1500853677 * anInt7409) {
				attributes |= 0x1;
			}
			if (0 != anInt7425 * -2055959731) {
				attributes |= 0x4;
			}
		}

		if (type == -1050493863 * ObjectCategory.aClass541_7338.type && orientation > 3) {
			attributes |= 0x5;
		}
		Model model;
		synchronized (provider.aClass168_7319) {
			model = provider.aClass168_7319.get(key);
		}

		if (null == model || toolkit.method2637(model.functionMask(), attributes) != 0) {
			if (model != null) {
				attributes = toolkit.mergeFunctionMasks(attributes, model.functionMask());
			}

			model = method9247(toolkit, attributes, type, orientation, class540);
			if (model == null) {
				return null;
			}

			synchronized (provider.aClass168_7319) {
				provider.aClass168_7319.put(key, model);
			}
		}

		boolean updated = false;
		if (null != class650) {
			model = model.method2890((byte) 1, attributes, true);
			updated = true;
			class650.method13458(model, orientation & 0x3);
		}

		if (type == ObjectCategory.aClass541_7338.type * -1050493863 && orientation > 3) {
			if (!updated) {
				model = model.method2890((byte) 3, attributes, true);
				updated = true;
			}

			model.yaw(2048);
		}

		if (0 != aByte7428) {
			if (!updated) {
				model = model.method2890((byte) 3, attributes, true);
				updated = true;
			}
			model.method2901(aByte7428, -1785237629 * anInt7391, class120, class120_47_, i_48_, i_49_, i_50_);
		}

		if (0 != anInt7409 * 1500853677 || 0 != -262717273 * anInt7418 || anInt7425 * -2055959731 != 0) {
			if (!updated) {
				model = model.method2890((byte) 3, attributes, true);
				updated = true;
			}

			model.translate(1500853677 * anInt7409, anInt7418 * -262717273, -2055959731 * anInt7425);
		}

		if (updated) {
			model.updateFunctionMask(mask);
		}

		return model;
	}

	public boolean method9248() {
		if (null == morphisms) {
			return -1 != anInt7427 * 713357403 || anIntArray7433 != null;
		}

		for (int id : morphisms) {
			if (-1 != id) {
				ObjectDefinition definition = loader.get(id);
				if (-1 != 713357403 * definition.anInt7427 || definition.anIntArray7433 != null) {
					return true;
				}
			}
		}

		return false;
	}

	public int getParameter(int id, int defaultValue) {
		if (parameters == null) {
			return defaultValue;
		}

		LinkableInt linkable = (LinkableInt) parameters.get(id);
		if (null == linkable) {
			return defaultValue;
		}
		return -1189875169 * linkable.value;
	}

	public int[] method9251() {
		return anIntArray7396;
	}

	public boolean method9252() {
		return null != anIntArray7396;
	}

	public boolean method9253() {
		return anIntArray7396 != null && anIntArray7396.length > 1;
	}

	public final ObjectDefinition method9255(VariableLoader loader, VariableProvider provider) {
		int index = -1;
		if (varbit * 714856961 != -1) {
			VariableBitsDefinition bits = loader.getVarbit(varbit * 714856961);

			if (bits != null) {
				index = provider.getVarbit(bits);
			}
		} else if (179919805 * varp != -1) {
			BaseVariableParameterDefinition parameter = loader.getVarp(VarpType.PLAYER, varp * 179919805);

			if (parameter != null) {
				index = provider.getVarp(parameter);
			}
		}
		if (index < 0 || index >= morphisms.length - 1) {
			int id = morphisms[morphisms.length - 1];
			if (-1 != id) {
				return this.loader.get(id);
			}

			return null;
		} else if (-1 == morphisms[index]) {
			return null;
		}

		return this.loader.get(morphisms[index]);
	}

	public int method9256(int i) {
		if (null == anIntArray7403) {
			return -1;
		}
		return anIntArray7403[i];
	}

	public boolean method9261(int animation) {
		if (anIntArray7396 != null && animation != -1) {
			for (int element : anIntArray7396) {
				if (element == animation) {
					return true;
				}
			}
		}
		return false;
	}

	public int method9269() {
		if (null != anIntArray7396) {
			if (anIntArray7396.length > 1) {
				int i_79_ = (int) (Math.random() * 65535.0);
				for (int i_80_ = 0; i_80_ < anIntArray7396.length; i_80_++) {
					if (i_79_ <= anIntArray7397[i_80_]) {
						return anIntArray7396[i_80_];
					}
					i_79_ -= anIntArray7397[i_80_];
				}
			} else {
				return anIntArray7396[0];
			}
		}
		return -1;
	}

	public final synchronized Tuple method9287(Toolkit toolkit, int i, int type, int i_82_, Ground class120,
			Ground class120_83_, int i_84_, int i_85_, int i_86_, boolean bool, Class540 class540) {
		if (ObjectCategory.method5284(type)) {
			type = ObjectCategory.aClass541_7344.type * -1050493863;
		}

		long key = (type << 3) + (anInt7369 * -894246227 << 10) + i_82_;
		key |= toolkit.id * 976039213 << 29;
		if (null != class540) {
			key |= class540.aLong7332 * 189278560431466431L << 32;
		}

		int mask = i;
		if (aByte7428 == 3) {
			mask |= 0x7;
		} else {
			if (aByte7428 != 0 || -262717273 * anInt7418 != 0) {
				mask |= 0x2;
			}
			if (anInt7409 * 1500853677 != 0) {
				mask |= 0x1;
			}
			if (0 != -2055959731 * anInt7425) {
				mask |= 0x4;
			}
		}
		if (bool) {
			mask |= 0x40000;
		}
		boolean bool_89_ = 0 != aByte7428 && (class120 != null || null != class120_83_);
		boolean bool_90_ = 0 != 1500853677 * anInt7409 || -262717273 * anInt7418 != 0 || -2055959731 * anInt7425 != 0;

		Tuple<Model, Shadow> tuple;
		synchronized (provider.tuples) {
			tuple = provider.tuples.get(key);
		}

		Model model = tuple != null ? tuple.first : null;
		Shadow shadow = null;

		if (model == null || toolkit.method2637(model.functionMask(), mask) != 0) {
			if (null != model) {
				mask = toolkit.mergeFunctionMasks(mask, model.functionMask());
			}

			int attributes = mask;
			if (type == -1050493863 * ObjectCategory.aClass541_7338.type && i_82_ > 3) {
				attributes |= 0x5;
			}

			model = method9247(toolkit, attributes, type, i_82_, class540);
			if (model == null) {
				return null;
			}
			if (ObjectCategory.aClass541_7338.type * -1050493863 == type && i_82_ > 3) {
				model.yaw(2048);
			}

			if (bool && !bool_89_ && !bool_90_) {
				shadow = model.method3018(null);
			}

			model.updateFunctionMask(mask);
			tuple = new Tuple<Model, Shadow>(model, shadow);

			synchronized (provider.tuples) {
				provider.tuples.put(key, tuple);
			}
		} else {
			shadow = tuple.second;
			if (bool && shadow == null && !bool_89_ && !bool_90_) {
				shadow = tuple.second = model.method3018(null);
			}
		}

		if (bool_89_ || bool_90_) {
			model = model.method2890((byte) 0, mask, true);
			if (bool_89_) {
				model.method2901(aByte7428, -1785237629 * anInt7391, class120, class120_83_, i_84_, i_85_, i_86_);
			}
			if (bool_90_) {
				model.translate(1500853677 * anInt7409, anInt7418 * -262717273, anInt7425 * -2055959731);
			}
			if (bool) {
				shadow = model.method3018(null);
			}

			model.updateFunctionMask(i);
		} else {
			model = model.method2890((byte) 0, i, true);
		}

		provider.aClass674_7321.first = model;
		provider.aClass674_7321.second = shadow;
		return provider.aClass674_7321;
	}

	public final boolean typeLoaded(int type) {
		if (models == null) {
			return true;
		}

		boolean loaded = true;
		for (int index = 0; index < modelTypes.length; index++) {
			if (modelTypes[index] == type) {
				for (int child = 0; child < models[index].length; child++) {
					if (!provider.modelLoaded(models[index][child])) {
						loaded = false;
					}
				}
			}
		}

		return loaded;
	}

	void decode(Buffer buffer, int opcode) {
		if (opcode == 1) {
			int count = buffer.readUByte();
			modelTypes = new byte[count];
			models = new int[count][];

			for (int index = 0; index < count; index++) {
				modelTypes[index] = buffer.readByte();
				int children = buffer.readUByte();
				models[index] = new int[children];

				for (int child = 0; child < children; child++) {
					models[index][child] = buffer.readSmart32();
				}
			}
		} else if (opcode == 2) {
			name = buffer.readString().intern();
		} else if (opcode == 14) {
			width = buffer.readUByte() * -1519782823;
		} else if (opcode == 15) {
			length = buffer.readUByte() * 1547662255;
		} else if (opcode == 17) {
			anInt7367 = 0;
		} else if (opcode != 18) {
			if (19 == opcode) {
				anInt7389 = buffer.readUByte() * 1123018159;
			} else if (opcode == 21) {
				aByte7428 = (byte) 1;
			} else if (22 == opcode) {
				aBool7392 = true;
			} else if (23 == opcode) {
				occludes = -134588641;
			} else if (opcode == 24) {
				int i_6_ = buffer.readSmart32();

				if (-1 != i_6_) {
					anIntArray7396 = new int[] { i_6_ };
				}
			} else if (opcode == 27) {
				anInt7367 = -1906029421;
			} else if (28 == opcode) {
				anInt7401 = (buffer.readUByte() << 2) * -1134776097;
			} else if (29 == opcode) {
				ambient = buffer.readByte() * -40782169;
			} else if (39 == opcode) {
				contrast = buffer.readByte() * 658457233;
			} else if (opcode >= 30 && opcode < 35) {
				actions[opcode - 30] = buffer.readString().intern();
			} else if (opcode == 40) {
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
			} else if (opcode == 42) {
				int count = buffer.readUByte();
				recolourPalette = new byte[count];

				for (int index = 0; index < count; index++) {
					recolourPalette[index] = buffer.readByte();
				}
			} else if (44 == opcode) {
				int i_13_ = buffer.readUShort();
				int i_14_ = 0;
				for (int i_15_ = i_13_; i_15_ > 0; i_15_ >>= 1) {
					i_14_++;
				}
				aByteArray7380 = new byte[i_14_];
				byte i_16_ = 0;
				for (int i_17_ = 0; i_17_ < i_14_; i_17_++) {
					if ((i_13_ & 1 << i_17_) > 0) {
						aByteArray7380[i_17_] = i_16_;
						i_16_++;
					} else {
						aByteArray7380[i_17_] = (byte) -1;
					}
				}
			} else if (opcode == 45) {
				int i_18_ = buffer.readUShort();
				int i_19_ = 0;
				for (int i_20_ = i_18_; i_20_ > 0; i_20_ >>= 1) {
					i_19_++;
				}
				aByteArray7390 = new byte[i_19_];
				byte i_21_ = 0;
				for (int i_22_ = 0; i_22_ < i_19_; i_22_++) {
					if ((i_18_ & 1 << i_22_) > 0) {
						aByteArray7390[i_22_] = i_21_;
						i_21_++;
					} else {
						aByteArray7390[i_22_] = (byte) -1;
					}
				}
			} else if (opcode == 62) {
				mirrorModel = true;
			} else if (opcode == 64) {
				castsShadow = false;
			} else if (opcode == 65) {
				scaleX = buffer.readUShort() * -1110774143;
			} else if (66 == opcode) {
				scaleY = buffer.readUShort() * -698271021;
			} else if (67 == opcode) {
				scaleZ = buffer.readUShort() * -310339981;
			} else if (69 == opcode) {
				buffer.readUByte();
			} else if (opcode == 70) {
				translateX = (buffer.readShort() << 2) * 91213201;
			} else if (opcode == 71) {
				translateY = (buffer.readShort() << 2) * 210779241;
			} else if (72 == opcode) {
				translateZ = (buffer.readShort() << 2) * -1732756803;
			} else if (73 == opcode) {
				aBool7420 = true;
			} else if (74 == opcode) {
				blockRange = true;
			} else if (75 == opcode) {
				anInt7422 = buffer.readUByte() * -1882964605;
			} else if (77 == opcode || opcode == 92) {
				varbit = buffer.readUShort() * -486005247;
				if (65535 == varbit * 714856961) {
					varbit = 486005247;
				}
				varp = buffer.readUShort() * -1350027371;
				if (65535 == 179919805 * varp) {
					varp = 1350027371;
				}

				int i_23_ = -1;
				if (92 == opcode) {
					i_23_ = buffer.readSmart32();
				}

				int i_24_ = buffer.readUByte();
				morphisms = new int[i_24_ + 2];

				for (int i_25_ = 0; i_25_ <= i_24_; i_25_++) {
					morphisms[i_25_] = buffer.readSmart32();
				}

				morphisms[1 + i_24_] = i_23_;
			} else if (78 == opcode) {
				anInt7427 = buffer.readUShort() * 1492088787;
				anInt7386 = buffer.readUByte() * -483251105;
			} else if (opcode == 79) {
				anInt7431 = buffer.readUShort() * -878064373;
				anInt7432 = buffer.readUShort() * -1020183757;
				anInt7386 = buffer.readUByte() * -483251105;
				int i_26_ = buffer.readUByte();
				anIntArray7433 = new int[i_26_];
				for (int i_27_ = 0; i_27_ < i_26_; i_27_++) {
					anIntArray7433[i_27_] = buffer.readUShort();
				}
			} else if (81 == opcode) {
				aByte7428 = (byte) 2;
				anInt7391 = buffer.readUByte() * -292082944;
			} else if (opcode == 82) {
				aBool7435 = true;
			} else if (88 == opcode) {
				aBool7383 = false;
			} else if (opcode == 89) {
				aBool7434 = false;
			} else if (opcode == 91) {
				isMembers = true;
			} else if (93 == opcode) {
				aByte7428 = (byte) 3;
				anInt7391 = buffer.readUShort() * -873556181;
			} else if (94 == opcode) {
				aByte7428 = (byte) 4;
			} else if (95 == opcode) {
				aByte7428 = (byte) 5;
				anInt7391 = buffer.readShort() * -873556181;
			} else if (opcode == 97) {
				aBool7437 = true;
			} else if (opcode == 98) {
				aBool7441 = true;
			} else if (99 == opcode || opcode == 100) {
				buffer.readUByte();
				buffer.readUShort();
			} else if (opcode == 101) {
				anInt7407 = buffer.readUByte() * -1357712335;
			} else if (opcode == 102) {
				mapscene = buffer.readUShort() * -65927325;
			} else if (103 == opcode) {
				occludes = 0;
			} else if (opcode == 104) {
				anInt7430 = buffer.readUByte() * -1454236947;
			} else if (105 == opcode) {
				invertMapScene = true;
			} else if (opcode == 106) {
				int i_28_ = buffer.readUByte();
				int i_29_ = 0;
				anIntArray7396 = new int[i_28_];
				anIntArray7397 = new int[i_28_];
				for (int i_30_ = 0; i_30_ < i_28_; i_30_++) {
					anIntArray7396[i_30_] = buffer.readSmart32();
					i_29_ += anIntArray7397[i_30_] = buffer.readUByte();
				}
				for (int i_31_ = 0; i_31_ < i_28_; i_31_++) {
					anIntArray7397[i_31_] = 65535 * anIntArray7397[i_31_] / i_29_;
				}
			} else if (opcode == 107) {
				mapFunction = buffer.readUShort() * -841554607;
			} else if (opcode >= 150 && opcode < 155) {
				actions[opcode - 150] = buffer.readString().intern();
				if (!provider.membersServer) {
					actions[opcode - 150] = null;
				}
			} else if (opcode == 160) {
				int i_32_ = buffer.readUByte();
				anIntArray7440 = new int[i_32_];
				for (int i_33_ = 0; i_33_ < i_32_; i_33_++) {
					anIntArray7440[i_33_] = buffer.readUShort();
				}
			} else if (162 == opcode) {
				aByte7428 = (byte) 3;
				anInt7391 = buffer.readInt() * -873556181;
			} else if (opcode == 163) {
				aByte7382 = buffer.readByte();
				aByte7384 = buffer.readByte();
				aByte7412 = buffer.readByte();
				aByte7444 = buffer.readByte();
			} else if (opcode == 164) {
				anInt7409 = buffer.readShort() * 1942484517;
			} else if (165 == opcode) {
				anInt7418 = buffer.readShort() * 946497303;
			} else if (166 == opcode) {
				anInt7425 = buffer.readShort() * 1272423813;
			} else if (opcode == 167) {
				anInt7445 = buffer.readUShort() * -1599794849;
			} else if (opcode != 168 && opcode != 169) {
				if (opcode == 170) {
					anInt7394 = buffer.readUSmart() * 262253349;
				} else if (opcode == 171) {
					anInt7395 = buffer.readUSmart() * 234666869;
				} else if (173 == opcode) {
					anInt7438 = buffer.readUShort() * -1249657653;
					anInt7393 = buffer.readUShort() * 1287115003;
				} else if (opcode == 177) {
					aBool7443 = true;
				} else if (opcode == 178) {
					anInt7406 = buffer.readUByte() * 546659077;
				} else if (opcode == 186) {
					aClass550_7388 = CompressionType.findIdentifiable(Class550.values(), buffer.readUByte());
				} else if (189 == opcode) {
					aBool7417 = true;
				} else if (opcode >= 190 && opcode < 196) {
					if (null == anIntArray7403) {
						anIntArray7403 = new int[6];
						Arrays.fill(anIntArray7403, -1);
					}
					anIntArray7403[opcode - 190] = buffer.readUShort();
				} else if (opcode == 196) {
					CompressionType.findIdentifiable(Class551.values(), buffer.readUByte());
				} else if (opcode == 197) {
					CompressionType.findIdentifiable(Class542.values(), buffer.readUByte());
				} else if (198 != opcode && 199 != opcode) {
					if (opcode == 200) {
						aBool7398 = true;
					} else if (201 == opcode) {
						aClass379_7439 = new Class379();
						aClass379_7439.aFloat4206 = buffer.readSmart();
						aClass379_7439.aFloat4203 = buffer.readSmart();
						aClass379_7439.aFloat4209 = buffer.readSmart();
						aClass379_7439.aFloat4205 = buffer.readSmart();
						aClass379_7439.aFloat4202 = buffer.readSmart();
						aClass379_7439.aFloat4207 = buffer.readSmart();
					} else if (249 == opcode) {
						int count = buffer.readUByte();
						if (parameters == null) {
							int size = HashTable.nextPowerOfTwo(count);
							parameters = new HashTable(size);
						}

						for (int index = 0; index < count; index++) {
							boolean string = buffer.readUByte() == 1;
							int id = buffer.readUTriByte();
							Linkable linkable;
							if (string) {
								linkable = new LinkableObject(buffer.readString().intern());
							} else {
								linkable = new LinkableInt(buffer.readInt());
							}

							parameters.put(id, linkable);
						}
					}
				}
			}
		}
	}

	void method9243() {
		if (anInt7389 * -1893691057 == -1) {
			anInt7389 = 0;
			if (null != modelTypes && 1 == modelTypes.length
					&& modelTypes[0] == ObjectCategory.aClass541_7338.type * -1050493863) {
				anInt7389 = 1123018159;
			}

			for (int index = 0; index < 5; index++) {
				if (actions[index] != null) {
					anInt7389 = 1123018159;
					break;
				}
			}
		}

		if (anInt7422 * 36878635 == -1) {
			anInt7422 = (383562139 * anInt7367 != 0 ? 1 : 0) * -1882964605;
		}
		if (method9252() || aBool7441 || morphisms != null) {
			aBool7443 = true;
		}
	}

	Model method9247(Toolkit toolkit, int attributes, int type, int orientation, Class540 class540) {
		int ambience = 64 + ambient * 2003603735;
		int contrast = this.contrast * 278902837 + 850;
		int originalMask = attributes;

		boolean bool = mirrorModel || ObjectCategory.aClass541_7337.type * -1050493863 == type && orientation > 3;
		if (bool) {
			attributes |= 0x10;
		}

		if (0 == orientation) {
			if (128 != 1103581569 * scaleX || -555969679 * translateX != 0) {
				attributes |= 0x1;
			}
			if (128 != 470089403 * scaleZ || 0 != -1138618219 * translateZ) {
				attributes |= 0x4;
			}
		} else {
			attributes |= 0xd;
		}

		if (scaleY * 1776495963 != 128 || 0 != -417786919 * translateY) {
			attributes |= 0x2;
		}

		if (originalColours != null) {
			attributes |= 0x4000;
		}

		if (null != originalTextures) {
			attributes |= 0x8000;
		}

		if (0 != aByte7444) {
			attributes |= 0x80000;
		}

		Model model = null;
		if (null != modelTypes) {
			int match = -1;

			for (int index = 0; index < modelTypes.length; index++) {
				if (type == modelTypes[index]) {
					match = index;
					break;
				}
			}

			if (match == -1) {
				return null;
			}

			int[] ids = null != class540 && null != class540.anIntArray7331 ? class540.anIntArray7331 : models[match];
			int length = ids.length;

			if (length > 0) {
				long key = 976039213 * toolkit.id;
				for (int index = 0; index < length; index++) {
					key = 67783L * key + ids[index];
				}

				synchronized (provider.aClass168_7318) {
					model = provider.aClass168_7318.get(key);
				}

				if (model != null) {
					if (ambience != model.method2971()) {
						attributes |= 0x1000;
					}
					if (contrast != model.method2932()) {
						attributes |= 0x2000;
					}
				}

				if (model == null || toolkit.method2637(model.functionMask(), attributes) != 0) {
					int mask = attributes | 0x1f01f;
					if (null != model) {
						mask = toolkit.mergeFunctionMasks(mask, model.functionMask());
					}

					BaseModel base = null;
					synchronized (provider.aClass144Array7315) {
						for (int index = 0; index < length; index++) {
							byte[] data = provider.getModel(ids[index]);
							if (null == data) {
								return null;
							}

							base = new BaseModel(data);
							if (base.version < 13) {
								base.method3103(2);
							}

							if (length > 1) {
								provider.aClass144Array7315[index] = base;
							}
						}

						if (length > 1) {
							base = new BaseModel(provider.aClass144Array7315, length);
						}
					}

					model = toolkit.createModel(base, mask, -590261867 * provider.anInt7317, ambience, contrast);
					synchronized (provider.aClass168_7318) {
						provider.aClass168_7318.put(key, model);
					}
				}
			}
		}

		if (null == model) {
			return null;
		}

		Model result = model.method2890((byte) 0, attributes, true);
		if (ambience != model.method2971()) {
			result.method2929(ambience);
		}

		if (contrast != model.method2932()) {
			result.method2974(contrast);
		}

		if (bool) {
			result.method2899();
		}

		if (-1050493863 * ObjectCategory.aClass541_7344.type == type && orientation > 3) {
			result.method2895(2048);
			result.translate(180, 0, -180);
		}

		orientation &= 0x3;
		if (1 == orientation) {
			result.method2895(4096);
		} else if (orientation == 2) {
			result.method2895(8192);
		} else if (3 == orientation) {
			result.method2895(12288);
		}

		if (originalColours != null) {
			short[] replacements;
			if (class540 != null && class540.aShortArray7333 != null) {
				replacements = class540.aShortArray7333;
			} else {
				replacements = replacementColours;
			}

			for (int index = 0; index < originalColours.length; index++) {
				if (null != recolourPalette && index < recolourPalette.length) {
					result.recolour(originalColours[index], aShortArray7446[recolourPalette[index] & 0xff]);
				} else {
					result.recolour(originalColours[index], replacements[index]);
				}
			}
		}

		if (originalTextures != null) {
			short[] replacement;
			if (null != class540 && class540.aShortArray7334 != null) {
				replacement = class540.aShortArray7334;
			} else {
				replacement = replacementTextures;
			}

			for (int index = 0; index < originalTextures.length; index++) {
				result.retexture(originalTextures[index], replacement[index]);
			}
		}

		if (0 != aByte7444) {
			result.method2937(aByte7382, aByte7384, aByte7412, aByte7444 & 0xff);
		}

		if (128 != 1103581569 * scaleX || 128 != scaleY * 1776495963 || 470089403 * scaleZ != 128) {
			result.scale(scaleX * 1103581569, scaleY * 1776495963, scaleZ * 470089403);
		}

		if (0 != -555969679 * translateX || translateY * -417786919 != 0 || -1138618219 * translateZ != 0) {
			result.translate(translateX * -555969679, translateY * -417786919, translateZ * -1138618219);
		}

		result.updateFunctionMask(originalMask);
		return result;
	}

}