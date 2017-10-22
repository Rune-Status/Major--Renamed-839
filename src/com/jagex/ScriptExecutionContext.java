package com.jagex;

import java.awt.Point;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.jagex.twitch.TwitchTV;
import com.jagex.twitch.TwitchWebcamDevice;
import com.jagex.twitch.TwitchWebcamDeviceCapability;

public class ScriptExecutionContext {
	public static boolean method10341(int i, int i_4_) {
		return i >= -1050493863 * ObjectCategory.aClass541_7335.type
				&& i <= ObjectCategory.aClass541_7355.type * -1050493863
				|| i == -1050493863 * ObjectCategory.aClass541_7339.type;
	}

	static final void method10340(int i, int i_0_) {
		if (Class495.aFloat6818 < Class495.aFloat6835) {
			Class495.aFloat6818 += Class495.aFloat6818 / 30.0;
			if (Class495.aFloat6818 > Class495.aFloat6835) {
				Class495.aFloat6818 = Class495.aFloat6835;
			}
			SpawnObjectCutsceneAction.method15149();
			Class495.anInt6857 = (int) Class495.aFloat6835 >> 1;
			Class495.aByteArrayArrayArray6814 = Program.method4569(Class495.anInt6857);
		} else if (Class495.aFloat6818 > Class495.aFloat6835) {
			Class495.aFloat6818 -= Class495.aFloat6818 / 30.0;
			if (Class495.aFloat6818 < Class495.aFloat6835) {
				Class495.aFloat6818 = Class495.aFloat6835;
			}
			SpawnObjectCutsceneAction.method15149();
			Class495.anInt6857 = (int) Class495.aFloat6835 >> 1;
			Class495.aByteArrayArrayArray6814 = Program.method4569(Class495.anInt6857);
		}
		if (-1 != -1810122229 * Class495_Sub1.anInt10327 && Class495_Sub1.anInt10324 * -311040241 != -1) {
			int i_2_ = Class495_Sub1.anInt10327 * -1810122229 - AsynchronousStreamRequest.anInt4532 * -1343037161;
			if (0 != i_2_) {
				i_2_ /= Math.min(Class495_Sub1.anInt10319 * 167203295, Math.abs(i_2_));
			}
			int i_3_ = -311040241 * Class495_Sub1.anInt10324 - ClanChannelUpdater.anInt3185 * -1266662223;
			if (i_3_ != 0) {
				i_3_ /= Math.min(167203295 * Class495_Sub1.anInt10319, Math.abs(i_3_));
			}
			AsynchronousStreamRequest.anInt4532 = 807429799 * (AsynchronousStreamRequest.anInt4532 * -1343037161 + i_2_);
			ClanChannelUpdater.anInt3185 = 1001358417 * (i_3_ + -1266662223 * ClanChannelUpdater.anInt3185);
			if (i_2_ == 0 && i_3_ == 0) {
				Class495_Sub1.anInt10327 = -1164673443;
				Class495_Sub1.anInt10324 = -732309487;
			}
			SpawnObjectCutsceneAction.method15149();
		}
		Iterator iterator = Class495_Sub1.aHashMap10331.entrySet().iterator();
		while (iterator.hasNext()) {
			Class36 class36 = (Class36) ((Map.Entry) iterator.next()).getValue();
			class36.anInt459 -= -1502791495;
			if (class36.anInt459 * 417680777 == 0) {
				if (-1056331583 * class36.anInt460 <= 1 && !Class495_Sub1.aBool10335) {
					iterator.remove();
				} else {
					class36.anInt460 -= -1060706495;
					class36.anInt459 = Class495_Sub1.anInt10334 * -122843361;
				}
			}
		}
		iterator = Class495_Sub1.aHashMap10332.entrySet().iterator();
		while (iterator.hasNext()) {
			Class36 class36 = (Class36) ((Map.Entry) iterator.next()).getValue();
			class36.anInt459 -= -1502791495;
			if (417680777 * class36.anInt459 == 0) {
				if (-1056331583 * class36.anInt460 <= 1 && !Class495_Sub1.aBool10335) {
					iterator.remove();
				} else {
					class36.anInt460 -= -1060706495;
					class36.anInt459 = Class495_Sub1.anInt10334 * -122843361;
				}
			}
		}
		if (Class495_Sub1.aBool10320 && null != Class208.aClass644_2168) {
			for (Class480_Sub11 class480_sub11 = (Class480_Sub11) Class208.aClass644_2168.head(); null != class480_sub11; class480_sub11 = (Class480_Sub11) Class208.aClass644_2168
					.next()) {
				Class224 class224 = (Class224) Class495.aClass678_Sub8_6803
						.get(818539827 * class480_sub11.aClass480_Sub37_10053.id);
				if (class480_sub11.method15592(i, i_0_, (byte) 75)) {
					if (null != class224.aStringArray2312) {
						if (null != class224.aStringArray2312[4]) {
							MenuOption.add(class224.aStringArray2312[4], class224.aString2313, -1, 1012, -1,
									818539827 * class480_sub11.aClass480_Sub37_10053.id,
									1606761481 * class224.anInt2303, 0, true, false,
									class480_sub11.aClass480_Sub37_10053.id * 818539827, false);
						}
						if (class224.aStringArray2312[3] != null) {
							MenuOption.add(class224.aStringArray2312[3], class224.aString2313, -1, 1011, -1,
									818539827 * class480_sub11.aClass480_Sub37_10053.id,
									class224.anInt2303 * 1606761481, 0, true, false,
									818539827 * class480_sub11.aClass480_Sub37_10053.id, false);
						}
						if (class224.aStringArray2312[2] != null) {
							MenuOption.add(class224.aStringArray2312[2], class224.aString2313, -1, 1010, -1,
									818539827 * class480_sub11.aClass480_Sub37_10053.id,
									class224.anInt2303 * 1606761481, 0, true, false,
									818539827 * class480_sub11.aClass480_Sub37_10053.id, false);
						}
						if (class224.aStringArray2312[1] != null) {
							MenuOption.add(class224.aStringArray2312[1], class224.aString2313, -1, 1009, -1,
									818539827 * class480_sub11.aClass480_Sub37_10053.id,
									1606761481 * class224.anInt2303, 0, true, false,
									class480_sub11.aClass480_Sub37_10053.id * 818539827, false);
						}
						if (null != class224.aStringArray2312[0]) {
							MenuOption.add(class224.aStringArray2312[0], class224.aString2313, -1, 1008, -1,
									818539827 * class480_sub11.aClass480_Sub37_10053.id,
									class224.anInt2303 * 1606761481, 0, true, false,
									818539827 * class480_sub11.aClass480_Sub37_10053.id, false);
						}
					}
					if (!class480_sub11.aClass480_Sub37_10053.aBool10311) {
						class480_sub11.aClass480_Sub37_10053.aBool10311 = true;
						ScriptExecutionContext.method6991(Class520.aClass520_7176,
								class480_sub11.aClass480_Sub37_10053.id * 818539827,
								1606761481 * class224.anInt2303);
					}
					if (class480_sub11.aClass480_Sub37_10053.aBool10311) {
						ScriptExecutionContext.method6991(Class520.aClass520_7178,
								818539827 * class480_sub11.aClass480_Sub37_10053.id,
								1606761481 * class224.anInt2303);
					}
				} else if (class480_sub11.aClass480_Sub37_10053.aBool10311) {
					class480_sub11.aClass480_Sub37_10053.aBool10311 = false;
					ScriptExecutionContext.method6991(Class520.aClass520_7172,
							818539827 * class480_sub11.aClass480_Sub37_10053.id,
							class224.anInt2303 * 1606761481);
				}
			}
		}
	}

	boolean aBool7932;
	ClanSettings aClass288_7941;
	Class357 aClass357_7946;
	ScriptInstruction[] instructions;
	Script script;
	Class480_Sub33 aClass480_Sub33_7935;
	Class600_Sub1_Sub1_Sub1 aClass600_Sub1_Sub1_Sub1_7938;
	Mob aClass600_Sub1_Sub3_Sub1_7936;
	Class604[] aClass604Array7919;
	Class611 aClass611_7931;
	Class611 aClass611_7945;
	long[] longVariables;
	long[] aLongArray7934;
	Map aMap7939;
	Map aMap7940;
	int anInt7921;
	int anInt7924;
	int counter;
	int anInt7926;
	int anInt7927;
	int anInt7928;
	int anInt7929;
	int[] anIntArray7930 = new int[5];
	int[] intVariables;
	int[] anIntArray7942;
	int[] anIntArray7943;
	int[][] anIntArrayArray7922;
	SceneObject anInterface55_7937;
	Object[] anObjectArray7918;
	Object[] stringVariables;
	static int operationCount = 0;

	ScriptExecutionContext() {
		anIntArrayArray7922 = new int[5][5000];
		anIntArray7942 = new int[1000];
		anInt7924 = 0;
		anObjectArray7918 = new Object[1000];
		anInt7929 = 0;
		aLongArray7934 = new long[1000];
		anInt7928 = 0;
		anInt7927 = 0;
		aClass604Array7919 = new Class604[50];
		aClass611_7931 = new Class611();
		aClass611_7945 = new Class611();
		aMap7939 = new HashMap();
		aMap7940 = new HashMap();
		anInt7921 = 0;
		counter = 160194073;
	}

	static final void method6012(ScriptExecutionContext context, int i) {
		BaseVariableParameterDefinition class131 = (BaseVariableParameterDefinition) context.script.anObjectArray11388[1523704279 * context.counter];
		VariableCollection interface13 = (VariableCollection) (context.anIntArray7943[1523704279 * context.counter] == 0 ? context.aMap7939
				.get(class131.type) : context.aMap7940.get(class131.type));
		ValueType class423 = class131.aClass422_1515.getValueType();
		if (class423 == ValueType.INTEGER) {
			if (class131.type == VarpType.CLIENT) {
				Class458.method7546(class131, 1182137911);
			}
			interface13.setIntVarp(class131, context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045]);
		} else if (ValueType.LONG == class423) {
			interface13.setLongVarp(class131, context.aLongArray7934[(context.anInt7928 -= 423292651) * -47101501]);
		} else if (class423 == ValueType.STRING) {
			if (VarpType.CLIENT == class131.type) {
				PulseEvent.resetStringVarp(class131);
			}
			interface13.setStringVarp(class131,
					context.anObjectArray7918[(context.anInt7929 -= -1356601931) * 211787933]);
		} else {
			throw new RuntimeException();
		}
	}

	static final void method7875(ScriptExecutionContext class613, int i) {
		MenuOption class480_sub31_sub17 = Class63.method1482();
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = LoadingRequirementType
				.method594(class480_sub31_sub17, -30585040);
		class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = MenuOption.getAction(
				class480_sub31_sub17);
		class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = Class630.method13109(
				class480_sub31_sub17, -16803526);
		class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = HostNameIdentifier
				.method1378(class480_sub31_sub17);
	}

	static void execute(Script script, int maximumOperations, ScriptExecutionContext context) {
		context.anInt7924 = 0;
		context.anInt7929 = 0;
		context.counter = 160194073;
		context.script = script;
		context.instructions = context.script.instructions;
		context.anIntArray7943 = context.script.anIntArray11391;

		ScriptInstruction instruction = null;
		context.anInt7927 = 0;
		context.aMap7939.clear();
		context.aMap7939.put(VarpType.PLAYER, PlayerVariableProvider.instance.collection);
		context.aMap7939.put(VarpType.CLIENT, Class199.aClass126_Sub1_2099);
		context.aMap7939.put(VarpType.CLAN, LinkableObject.aClass126_10169);

		if (context.aClass288_7941 != null) {
			context.aMap7939.put(VarpType.CLAN_SETTING, ClanVariableCollection.create(context.aClass288_7941));
		}

		if (context.aClass600_Sub1_Sub3_Sub1_7936 instanceof Npc) {
			context.aMap7939.put(VarpType.NPC, context.aClass600_Sub1_Sub3_Sub1_7936.anInterface13_11517);
		}

		if (context.aClass600_Sub1_Sub3_Sub1_7936 instanceof Player) {
			context.aMap7940.put(VarpType.PLAYER, context.aClass600_Sub1_Sub3_Sub1_7936.anInterface13_11517);
		}

		if (ItemDefinition.aClass192_8339 != null) {
			context.aMap7939.put(VarpType.aClass441_5047, ItemDefinition.aClass192_8339.method3836());
		}

		try {
			try {
				ScriptExecutionContext.operationCount = 0;
				for (;;) {
					ScriptExecutionContext.operationCount += -1084191747;
					if (ScriptExecutionContext.operationCount * -125949611 > maximumOperations) {
						throw new RuntimeException("");
					}

					instruction = context.instructions[(context.counter += -160194073) * 1523704279];
					if (Class626.aBool8040
							&& (null == Class626.aString8041 || context.script.aString11389 != null
									&& context.script.aString11389.indexOf(Class626.aString8041) != -1)) {
						System.out.println(context.script.aString11389 + ": " + instruction);
					}

					context.aBool7932 = 1 == context.anIntArray7943[1523704279 * context.counter];
					if (ScriptInstruction.aClass466_5576 == instruction && 0 == -748745979 * context.anInt7927) {
						Class604.method10231();
						break;
					}

					ScriptInterpreter.executeInstruction(instruction, context);
				}
			} catch (Exception exception) {
				ScriptExecutionContext.method1605(context, instruction, exception, "S");
				Class604.method10231();
			}
		} catch (Exception object) {
			Class604.method10231();
		}
	}

	static final void method10195(ScriptExecutionContext context) {
		context.anInt7924 -= -2049596966;
		int part = context.anIntArray7942[context.anInt7924 * 1841827045];
		int id = context.anIntArray7942[1841827045 * context.anInt7924 + 1];

		if (Client.localPlayer.appearance != null) {
			for (int index = 0; index < IdentikitDefinition.MALE_PARTS.length; index++) {
				if (IdentikitDefinition.MALE_PARTS[index] == part) {
					Client.localPlayer.appearance.setKit(IdentikitDefinition.loader, id, index);
					return;
				}
			}

			for (int index = 0; index < IdentikitDefinition.FEMALE_PARTS.length; index++) {
				if (IdentikitDefinition.FEMALE_PARTS[index] == part) {
					Client.localPlayer.appearance.setKit(IdentikitDefinition.loader, id, index);
					break;
				}
			}
		}
	}

	static final void method15096(ScriptExecutionContext class613, int i) {
		class613.aClass357_7946 = new Class357();
		class613.aClass357_7946.id = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045]
				* -516720029;
		class613.aClass357_7946.message = ThemeMusicVolumeNormaliser.aClass10_2062
				.get(class613.aClass357_7946.id * -973678773);
		class613.aClass357_7946.anIntArray3818 = new int[class613.aClass357_7946.message
				.fillerCount()];
	}

	static final void method15097(ScriptExecutionContext class613) {
		String string = null;
		if (null != Class551.identifier) {
			string = Class551.identifier.getHostName();
		}
		if (string == null) {
			string = "";
		}
		class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = string;
	}

	static final void method15098(ScriptExecutionContext class613) {
		class613.anInt7924 -= -2049596966;
		int i_0_ = class613.anIntArray7942[1841827045 * class613.anInt7924];
		int i_1_ = class613.anIntArray7942[1 + 1841827045 * class613.anInt7924];
		Class480_Sub41 class480_sub41 = (Class480_Sub41) Client.aClass667_10791.get(i_0_);
		if (class480_sub41 != null && i_1_ == 1021060255 * class480_sub41.anInt10372) {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 1;
		} else {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
		}
	}

	static final void method15099(Widget class226, Interface class221, ScriptExecutionContext class613) {
		String string = (String) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
		if (ScriptExecutionContext.method9239(string, class613) != null) {
			string = string.substring(0, string.length() - 1);
		}
		class226.anObjectArray2493 = Class562_Sub1.method16248(string, class613);
		class226.aBool2483 = true;
	}

	static void method15117(ScriptExecutionContext class613, short i) {
		class613.anIntArray7942[class613.anInt7924 * 1841827045 - 1] = QuestDefinition.loader
				.get(class613.anIntArray7942[class613.anInt7924 * 1841827045 - 1]).aBool2593 ? 1 : 0;
	}

	static final void method3329(ScriptExecutionContext class613, byte i) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		Class607.method10287(class226, class613, (byte) 0);
	}

	static final void method3328(Widget class226, ScriptExecutionContext class613) {
		class613.anInt7924 -= -2049596966;
		int i_4_ = class613.anIntArray7942[1841827045 * class613.anInt7924] - 1;
		int i_5_ = class613.anIntArray7942[1841827045 * class613.anInt7924 + 1];
		if (i_4_ < 0 || i_4_ > 9) {
			throw new RuntimeException();
		}
		Class453.method7414(class226, i_4_, i_5_, class613);
	}

	static final void method3327(Widget class226, Interface class221, ScriptExecutionContext class613) {
		class226.aString2530 = null;
		class226.aClass227_2531 = null;
	}

	static final void method3331(ScriptExecutionContext class613, int i) {
		if (Client.localPrivilege * 1667858447 >= 2) {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 1667858447 * Client.localPrivilege;
		} else {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
		}
	}

	static final void method3330(ScriptExecutionContext class613, int i) {
		int i_6_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_6_);
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = class226.anInt2382 * -1909412215;
	}

	static final void method15130(ScriptExecutionContext class613, int i) {
		int i_9_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = ThemeMusicVolumeNormaliser
				.isLatinLetter((char) i_9_) ? 1 : 0;
	}

	static final void method15133(ScriptExecutionContext class613, int i) {
		int i_1_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_1_);
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = class226.scrollPosition
				* -1881455913;
	}

	static final void method15137(ScriptExecutionContext class613, int i) {
		class613.anInt7924 -= -2049596966;
		int i_1_ = class613.anIntArray7942[1841827045 * class613.anInt7924];
		int i_2_ = class613.anIntArray7942[1841827045 * class613.anInt7924 + 1];
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = DefaultProvidingVarpLoader
				.method13931(i_1_, i_2_, false, 213484902);
	}

	static final void method811(ScriptExecutionContext class613) {
		Class495_Sub1.aBool10328 = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045] == 1;
	}

	static final void method812(ScriptExecutionContext class613, int i) {
		Client.aBool10799 = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045] == 1;
		if (Client.aBool10799) {
			QuickChatCategoryLoader.method7009();
		}
	}

	static final void method15093(ScriptExecutionContext class613, int i) {
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Client.aShort10880;
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Client.aShort10881;
	}

	static final void method2286(ScriptExecutionContext class613, int i) {
		int i_4_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		if (2 == -2028985543 * Client.anInt10892 && i_4_ < Client.friendCount * -1763746795) {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Client.friends[i_4_].world
					* -1900962431;
		} else {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
		}
	}

	static final void method2283(ScriptExecutionContext class613, int i) {
		int i_3_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_3_);
		Interface class221 = Class598.loadedInterfaces[i_3_ >> 16];
		ScriptExecutionContext.method13724(class226, class221, class613, -2076237373);
	}

	static final void method2288(ScriptExecutionContext class613, int i) {
		int i_8_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Class335.HSV_TABLE[i_8_ & 0xffff];
	}

	static final int[] method9239(String string, ScriptExecutionContext class613) {
		int[] is = null;
		if (string.length() > 0 && string.charAt(string.length() - 1) == 'Y') {
			int i_5_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
			if (i_5_ > 0) {
				is = new int[i_5_];
				while (i_5_-- > 0) {
					is[i_5_] = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
				}
			}
		}
		return is;
	}

	static final void method9382(ScriptExecutionContext class613) {
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.skyboxes
				.getValue();
	}

	static final void method9383(ScriptExecutionContext class613) {
		int i_5_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Npc class600_sub1_sub3_sub1_sub2 = (Npc) class613.aClass600_Sub1_Sub3_Sub1_7936;
		int i_6_ = class600_sub1_sub3_sub1_sub2.method18280(i_5_);
		int i_7_ = class600_sub1_sub3_sub1_sub2.method18277(i_5_);
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = i_6_;
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = i_7_;
	}

	static final void method9384(ScriptExecutionContext class613, byte i) {
		int i_8_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.orthoMode
				.compatible(i_8_);
	}

	static final void method2234(ScriptExecutionContext class613, int i) {
		String string = (String) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
		String string_1_ = (String) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
		OutgoingFrame class480_sub15 = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_3993,
				Client.lobbyConnection.encryptor);
		class480_sub15.payload.writeShort(Buffer.encodedStringLength(string) + Buffer.encodedStringLength(string_1_));
		class480_sub15.payload.writeCString(string);
		class480_sub15.payload.writeCString(string_1_);
		Client.lobbyConnection.sendFrame(class480_sub15);
	}

	static final void method2235(ScriptExecutionContext class613, int i) {
		int i_2_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		if (i_2_ >= 1 && i_2_ <= 2) {
			Class199.preferences.setValue(Class199.preferences.screenSize, i_2_);
			Class199.preferences.setValue(Class199.preferences.aClass632_Sub30_10305, i_2_);
			Client.savePreferences();
		}
	}

	static final void method2236(ScriptExecutionContext class613, byte i) {
		int i_3_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_3_);
		ScriptExecutionContext.method9293(class226, class613);
	}

	static final void method2237(ScriptExecutionContext class613, int i) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = -1168337917 * class226.anInt2391;
	}

	static final void method3190(ScriptExecutionContext class613, int i) {
		int i_6_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		if (Class495_Sub1.aClass667_10338 != null) {
			Linkable class480 = Class495_Sub1.aClass667_10338.get(i_6_);
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = class480 != null ? 1 : 0;
		} else {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
		}
	}

	static final void method1102(Widget class226, Interface class221, ScriptExecutionContext class613) {
		class226.anInt2406 = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045] * 76171347;
		Widget.redraw(class226);
	}

	static final void method15482(ScriptExecutionContext class613, byte i) {
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.orthoMode
				.supported() ? 1 : 0;
	}

	static final void method15483(ScriptExecutionContext class613) {
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
	}

	static final void method645(ScriptExecutionContext class613, byte i) {
		String string = (String) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
		int i_2_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		if (i_2_ == -1) {
			throw new RuntimeException("");
		}
		class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = new StringBuilder()
				.append(string).append((char) i_2_).toString();
	}

	static final void method646(ScriptExecutionContext class613, int i) {
		Class257.method4766();
	}

	static final void method6083(ScriptExecutionContext class613, int i) {
		int i_0_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		ItemDefinition itemDefinition = ItemDefinition.loader.get(i_0_);
		if (1898423175 * itemDefinition.noteTemplate == -1 && 43311867 * itemDefinition.noteInfo >= 0) {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 43311867 * itemDefinition.noteInfo;
		} else {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = i_0_;
		}
	}

	static final void method6084(ScriptExecutionContext class613) {
		class613.anInt7924 -= -2049596966;
		int i_1_ = class613.anIntArray7942[1841827045 * class613.anInt7924];
		boolean bool = 1 == class613.anIntArray7942[1 + class613.anInt7924 * 1841827045];
		if (Class495_Sub1.aClass667_10338 != null) {
			Linkable class480 = Class495_Sub1.aClass667_10338.get(i_1_);
			if (class480 != null && !bool) {
				class480.unlink();
			} else if (class480 == null && bool) {
				class480 = new Linkable();
				Class495_Sub1.aClass667_10338.put(i_1_, class480);
			}
		}
	}

	static final void method6085(ScriptExecutionContext class613, byte i) {
		int i_2_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		int i_3_ = Client.aClass448Array10869[i_2_].method7375();
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 5 == i_3_ ? 1 : 0;
	}

	static final void method1606(ScriptExecutionContext class613, short i) {
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = class613.aClass480_Sub33_7935
				.method16076((String) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933]);
	}

	static void method1605(ScriptExecutionContext context, ScriptInstruction instruction, Exception exception,
			String string) {
		StringBuilder builder = new StringBuilder(30);
		builder.append(string + " " + (context.script.linkedKey * -4821875126325281949L) + " ");
		for (int index = -748745979 * context.anInt7927 - 1; index >= 0; index--) {
			builder.append("").append(context.aClass604Array7919[index].scripts.linkedKey * -4821875126325281949L)
					.append(" ");
		}

		builder.append("").append(Integer.valueOf(instruction.opcode * 1521341811));
		HitsplatDefinitionProvider.reportError(builder.toString(), exception);
	}

	static void method2168(ScriptExecutionContext class613, int i) {
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = TwitchTV.tv.GetLoginState();
	}

	static final void method2169(ScriptExecutionContext class613) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = class226.hidden ? 1 : 0;
	}

	static final void method2170(ScriptExecutionContext class613, int i) {
		Class199.preferences.setValue(Class199.preferences.soundsEffectsVolume,
				class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045]);
		Client.savePreferences();
		Client.sentPreferences = false;
	}

	static final void method3578(ScriptExecutionContext class613, int i) {
		class613.anInt7929 -= 1581763434;
		String string = (String) class613.anObjectArray7918[class613.anInt7929 * 211787933];
		String string_0_ = (String) class613.anObjectArray7918[1 + class613.anInt7929 * 211787933];
		if (class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045] == 1) {
			class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = string;
		} else {
			class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = string_0_;
		}
	}

	static final void method3579(ScriptExecutionContext class613, byte i) {
		class613.anInt7924 -= -2049596966;
		int i_1_ = class613.anIntArray7942[1841827045 * class613.anInt7924];
		int i_2_ = class613.anIntArray7942[1 + 1841827045 * class613.anInt7924];
		ParameterDefinition class33 = ParameterDefinition.loader.get(i_2_);
		if (class33.isString()) {
			class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = NpcDefinition.loader.get(
					i_1_).getParameter(i_2_, class33.defaultString);
		} else {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = NpcDefinition.loader.get(
					i_1_).getParameter(i_2_, class33.defaultInt * -125275839);
		}
	}

	static final void method3583(ScriptExecutionContext class613) {
		Class199.preferences.setValue(Class199.preferences.groundDecoration,
				class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045] == 1 ? 1 : 0);
		Client.aClass460_10760.method7705();
		Client.savePreferences();
		Client.sentPreferences = false;
	}

	static final void method3748(ScriptExecutionContext class613, int i) {
		class613.anInt7924 -= 1122685165;
	}

	static final void method3747(ScriptExecutionContext class613, byte i) {
		class613.anInt7929 -= 225161503;
		class613.anInt7924 -= -2049596966;
		Class458.method7544((String) class613.anObjectArray7918[211787933 * class613.anInt7929],
				(String) class613.anObjectArray7918[class613.anInt7929 * 211787933 + 1],
				class613.anIntArray7942[1841827045 * class613.anInt7924],
				1 == class613.anIntArray7942[class613.anInt7924 * 1841827045 + 1],
				(String) class613.anObjectArray7918[class613.anInt7929 * 211787933 + 2]);
	}

	static final void method3750(ScriptExecutionContext class613) {
		int i_8_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_8_);
		Interface class221 = Class598.loadedInterfaces[i_8_ >> 16];
		ScriptExecutionContext.method1573(class226, class221, class613);
	}

	static final void method3721(ScriptExecutionContext class613, byte i) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 2134977475 * class226.spriteOffsetX;
	}

	static final void method3722(ScriptExecutionContext class613, int i) {
		class613.anInt7924 -= -2049596966;
		int i_88_ = class613.anIntArray7942[class613.anInt7924 * 1841827045];
		int i_89_ = class613.anIntArray7942[1 + 1841827045 * class613.anInt7924];
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 0 != (i_88_ & 1 << i_89_) ? 1
				: 0;
	}

	static final void method3723(ScriptExecutionContext class613, int i) {
		class613.anInt7924 -= -731138437;
		int i_90_ = class613.anIntArray7942[1841827045 * class613.anInt7924];
		int i_91_ = class613.anIntArray7942[1 + 1841827045 * class613.anInt7924] << 1;
		int i_92_ = class613.anIntArray7942[class613.anInt7924 * 1841827045 + 2];
		int i_93_ = class613.anIntArray7942[class613.anInt7924 * 1841827045 + 3];
		int i_94_ = class613.anIntArray7942[4 + 1841827045 * class613.anInt7924];
		int i_95_ = class613.anIntArray7942[class613.anInt7924 * 1841827045 + 5];
		int i_96_ = class613.anIntArray7942[6 + 1841827045 * class613.anInt7924];
		if (i_90_ >= 0 && i_90_ < 2 && null != Client.anIntArrayArrayArray10720[i_90_] && i_91_ >= 0
				&& i_91_ < Client.anIntArrayArrayArray10720[i_90_].length) {
			Client.anIntArrayArrayArray10720[i_90_][i_91_] = new int[] { (i_92_ >> 14 & 0x3fff) << 9, i_93_ << 2,
					(i_92_ & 0x3fff) << 9, i_96_ };
			Client.anIntArrayArrayArray10720[i_90_][1 + i_91_] = new int[] { (i_94_ >> 14 & 0x3fff) << 9, i_95_ << 2,
					(i_94_ & 0x3fff) << 9 };
		}
	}

	static final void method3539(Widget class226, Interface class221, ScriptExecutionContext class613, byte i) {
		String string = (String) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
		if (method9239(string, class613) != null) {
			string = string.substring(0, string.length() - 1);
		}
		class226.anObjectArray2513 = Class562_Sub1.method16248(string, class613);
		class226.aBool2483 = true;
	}

	static final void method3542(ScriptExecutionContext class613, int i) throws ScriptException {
		class613.anInt7924 -= 195773364;
		int i_7_ = class613.anIntArray7942[class613.anInt7924 * 1841827045];
		int i_8_ = class613.anIntArray7942[1 + class613.anInt7924 * 1841827045];
		int i_9_ = class613.anIntArray7942[2 + 1841827045 * class613.anInt7924];
		int i_10_ = class613.anIntArray7942[class613.anInt7924 * 1841827045 + 3];
		Class397 class397 = Class397.create(i_7_, i_8_, i_9_);
		if (-1.0F == class397.x) {
			class397.x = Float.POSITIVE_INFINITY;
		}
		if (class397.y == -1.0F) {
			class397.y = Float.POSITIVE_INFINITY;
		}
		if (-1.0F == class397.z) {
			class397.z = Float.POSITIVE_INFINITY;
		}
		Class369.aClass261_Sub1_4079.method4814(class397);
		Class369.aClass261_Sub1_4079.method4823(i_10_ / 1000.0F, (byte) 0);
		class397.cache();
	}

	static final void method3532(ScriptExecutionContext class613, int i) {
		int i_16_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_16_);
		Interface class221 = Class598.loadedInterfaces[i_16_ >> 16];
		ScriptExecutionContext.method4600(class226, class221, class613);
	}

	static final void method3533(ScriptExecutionContext class613, int i) {
		int i_17_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_17_);
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = class226.anInt2453 * 1668905963;
	}

	static final void method3535(ScriptExecutionContext class613) {
		int i_18_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Class583.method9864(i_18_, -1516343019);
	}

	static final void method3490(ScriptExecutionContext class613) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		Interface class221 = class611.aClass221_7913;
		int i_1_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		if (class226.animation * 1642844085 != i_1_) {
			if (i_1_ != -1) {
				if (null == class226.aClass650_2541) {
					class226.aClass650_2541 = new Class650_Sub3();
				}
				class226.aClass650_2541.update(i_1_);
			} else {
				class226.aClass650_2541 = null;
			}
			class226.animation = 1473373853 * i_1_;
			Widget.redraw(class226);
		}
		if (-1 == class226.component * -592186295 && !class221.aBool2278) {
			Class642_Sub4.method16758(class226.id * 1857819631, (byte) -1);
		}
	}

	static final void method3492(ScriptExecutionContext class613, byte i) {
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
	}

	static final void method3491(Widget class226, Interface class221, ScriptExecutionContext class613) {
		class226.method4234();
	}

	static final void method3494(ScriptExecutionContext class613, int i) {
		int i_15_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		if (0 != -2028985543 * Client.anInt10892 && i_15_ < Client.ignoredPlayerCount * -1127325433) {
			class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = Client.ignoredPlayers[i_15_].aString665;
		} else {
			class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = "";
		}
	}

	static final void method17578(ScriptExecutionContext class613) {
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.groundBlending
				.getValue() == 1 ? 1 : 0;
	}

	static final void method8842(ScriptExecutionContext class613, int i) {
		int i_41_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = ItemDefinition.loader.get(i_41_).stackable * 1146503759 == 1 ? 1
				: 0;
	}

	static void method8840(ScriptExecutionContext class613, int i) {
		class613.anInt7924 -= -2049596966;
		int i_28_ = class613.anIntArray7942[1841827045 * class613.anInt7924];
		int index = class613.anIntArray7942[class613.anInt7924 * 1841827045 + 1];
		TwitchWebcamDevice device = CachedParticleDefinitionLoader.method5981(i_28_);
		TwitchWebcamDeviceCapability capability = null;
		if (null != device) {
			capability = device.getCapability(index);
		}
		if (capability == null) {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = -1;
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = -1;
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = -1;
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = -1;
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = -1;
		} else {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = -892130713
					* capability.anInt933;
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = capability.anInt934 * 1172125411;
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = capability.anInt935 * 189650051;
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 1336383845 * capability.anInt936;
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 494968757 * capability.anInt937;
		}
	}

	static final void method8839(ScriptExecutionContext class613, int i) {
		int i_27_ = class613.anIntArray7943[1523704279 * class613.counter];
		class613.anInt7929 -= -1356601931 * i_27_;
		String string = Class179.method3540(class613.anObjectArray7918, 211787933 * class613.anInt7929, i_27_);
		class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = string;
	}

	static final void method7411(ScriptExecutionContext class613, int i) {
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.groundDecoration
				.supported() ? 1 : 0;
	}

	static final void method7409(Widget class226, ScriptExecutionContext class613, int i) {
		FontSpecification class9 = class226.method4230(Class509.aClass374_6997, Client.anInterface47_10645, (byte) -7);
		int i_3_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Point point = class9.method608(class226.text, class226.width * 688089097, class226.anInt2456 * -1873663917,
				i_3_, WeakReferenceTable.nameIcons);
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = point.x;
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = point.y;
	}

	static final void method7406(ScriptExecutionContext class613, int i) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		class613.anInt7924 -= -2049596966;
		int i_0_ = class613.anIntArray7942[class613.anInt7924 * 1841827045];
		int i_1_ = class613.anIntArray7942[1 + 1841827045 * class613.anInt7924];
		ParameterDefinition class33 = ParameterDefinition.loader.get(i_0_);
		if (class33.defaultInt * -125275839 != i_1_) {
			class226.method4240(i_0_, i_1_, (byte) 4);
		} else {
			class226.method4242(i_0_);
		}
	}

	static final void method1098(ScriptExecutionContext class613, int i) {
		class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = class613.script.anObjectArray11388[class613.counter * 1523704279];
	}

	static final void method2258(ScriptExecutionContext class613) {
		int i_0_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		ItemDefinition itemDefinition = ItemDefinition.loader.get(i_0_);
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = itemDefinition.anInt8269 * 1553194521;
	}

	static final void method2259(ScriptExecutionContext class613) {
		Class199.preferences.setValue(Class199.preferences.antiAliasing,
				class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045]);
		Client.savePreferences();
	}

	static final void method2260(ScriptExecutionContext class613, byte i) {
		int i_1_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_1_);
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 1151952653 * class226.spriteYaw;
	}

	static final void method3567(ScriptExecutionContext class613, int i) {
		class613.anInt7924 -= -2049596966;
		int i_9_ = class613.anIntArray7942[class613.anInt7924 * 1841827045];
		int i_10_ = class613.anIntArray7942[1 + 1841827045 * class613.anInt7924];
		if (-1 == i_10_) {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = -1;
		} else {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = AnimateObjectCutsceneAction.aClass420_9538
					.get(i_9_).getSubcategory((char) i_10_);
		}
	}

	static final void method3568(ScriptExecutionContext class613, int i) {
		int i_11_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		if (i_11_ > 255 || i_11_ < 0) {
			i_11_ = 0;
		}
		if (i_11_ != Class199.preferences.aClass632_Sub19_10283.getValue()) {
			Class199.preferences.setValue(Class199.preferences.aClass632_Sub19_10283, i_11_);
			Client.savePreferences();
			Client.sentPreferences = false;
		}
	}

	static final void method3569(ScriptExecutionContext class613, int i) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		Interface class221 = class611.aClass221_7913;
		Class490.method8470(class226, class221, class613, 1553858567);
	}

	static final void method14181(ScriptExecutionContext class613, byte i) {
		int i_16_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_16_);
		Interface class221 = Class598.loadedInterfaces[i_16_ >> 16];
		Class581.method9842(class226, class221, class613, 1410621056);
	}

	static final void method4411(ScriptExecutionContext class613, int i) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		Interface class221 = class611.aClass221_7913;
		Widget.method7527(class226, class221, true, 0, class613);
	}

	static void method8797(ScriptExecutionContext class613, byte i) {
		class613.anInt7924 -= -2049596966;
		class613.anIntArray7942[1841827045 * class613.anInt7924] = TwitchTV.method5832(
				class613.anIntArray7942[class613.anInt7924 * 1841827045],
				class613.anIntArray7942[1 + class613.anInt7924 * 1841827045], 1888119022);
		class613.anInt7924 += 1122685165;
	}

	static final void method8799(ScriptExecutionContext class613, int i) {
		int i_0_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Client.aClass448Array10869[i_0_]
				.method7380(1344469772);
	}

	static final void method8800(ScriptExecutionContext class613, int i) {
		int i_1_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		BaseMapSceneDefinitionProvider.method745(i_1_ >> 14 & 0x3fff, i_1_ & 0x3fff);
	}

	static final void method8801(ScriptExecutionContext class613, byte i) {
		class613.anInt7924 -= -1853823602;
		Class480_Sub22 class480_sub22 = (Class480_Sub22) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
		if (Class369.aClass261_Sub1_4079.method4836() != Class257.aClass257_2850) {
			throw new RuntimeException();
		}
		((Class642_Sub1) Class369.aClass261_Sub1_4079.method4834()).method16692(class480_sub22.copy(),
				class613.anIntArray7942[class613.anInt7924 * 1841827045],
				class613.anIntArray7942[1 + 1841827045 * class613.anInt7924],
				class613.anIntArray7942[2 + 1841827045 * class613.anInt7924],
				class613.anIntArray7942[class613.anInt7924 * 1841827045 + 3],
				class613.anIntArray7942[4 + 1841827045 * class613.anInt7924],
				class613.anIntArray7942[class613.anInt7924 * 1841827045 + 5], (byte) 30);
	}

	static final void method8802(ScriptExecutionContext class613, int i) {
		if (Client.supportsFullScreen && Client.fullScreenFrame != null) {
			Class254.method4740(Class199.preferences.screenSize.getValue(), -1, -1, false);
		}
		String string = (String) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
		boolean bool = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045] == 1;
		String string_2_ = new StringBuilder().append(JavaThreadResource.method1491()).append(string).toString();
		TranslatableString.openJsUrl(string_2_, bool, Client.useJs);
	}

	static final void method16046(ScriptExecutionContext class613, int i) {
		Class199.preferences.setValue(Class199.preferences.sceneryShadows,
				class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045]);
		Client.aClass460_10760.method7705();
		Client.savePreferences();
		Client.sentPreferences = false;
	}

	static final void method16047(ScriptExecutionContext class613, int i) {
		class613.anInt7924 -= -926911801;
		int i_0_ = class613.anIntArray7942[class613.anInt7924 * 1841827045];
		int i_1_ = class613.anIntArray7942[1841827045 * class613.anInt7924 + 1];
		int i_2_ = class613.anIntArray7942[2 + 1841827045 * class613.anInt7924];
		if (i_1_ == -1) {
			throw new RuntimeException();
		}
		EnumDefinition class675 = EnumDefinition.loader.get(i_1_);
		if (class675.valueType.getId() != i_0_) {
			throw new RuntimeException();
		}
		int[] is = class675.getKeys(Integer.valueOf(i_2_));
		int i_3_ = 0;
		if (null != is) {
			i_3_ = is.length;
		}
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = i_3_;
	}

	static final void method6922(ScriptExecutionContext class613, int i) {
		int i_7_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		if (i_7_ < 0) {
			i_7_ = 0;
		}
		Client.anInt10912 = 434321001 * (1953827643 * Client.anInt10714 + i_7_);
	}

	static final void method6919(ScriptExecutionContext class613, int i) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		ScriptExecutionContext.method9293(class226, class613);
	}

	static final void method6921(ScriptExecutionContext class613, int i) {
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.textures
				.supported() ? 1 : 0;
	}

	static final void method5097(ScriptExecutionContext class613, int i) {
		class613.anInt7924 -= 1122685165;
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Client.localPlayer.method17970()
				.hash();
	}

	static final void method5099(ScriptExecutionContext class613) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		if (Client.method17050(class226).method15631((short) -19297) && Client.aClass226_10793 == null) {
			Class276.method5162(1857819631 * class226.id, class226.component * -592186295, (short) 29410);
			Client.aClass226_10793 = Class185.method3584(1857819631 * class226.id, class226.component * -592186295);
			Widget.redraw(Client.aClass226_10793);
		}
	}

	static final void method18104(ScriptExecutionContext class613, byte i) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = class226.anInt2406 * -5030949;
	}

	static final void method14015(ScriptExecutionContext class613) {
		int i_1_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_1_);
		Interface class221 = Class598.loadedInterfaces[i_1_ >> 16];
		class613.anInt7924 -= -2049596966;
		class226.anInt2408 = 1526136459 * class613.anIntArray7942[class613.anInt7924 * 1841827045];
		class226.anInt2393 = class613.anIntArray7942[1 + class613.anInt7924 * 1841827045] * -970300639;
		Widget.redraw(class226);
		AsynchronousInputStream.method8775(class221, class226);
		if (class226.type * 1558474223 == 0) {
			Class548.method9327(class221, class226, false);
		}
	}

	static void method7343(ScriptExecutionContext class613) {
		QuestDefinition class234 = QuestDefinition.loader
				.get(class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045]);
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = class234.anIntArrayArray2607 == null ? 0
				: class234.anIntArrayArray2607.length;
	}

	static final void method7345(ScriptExecutionContext class613, byte i) {
		int i_2_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_2_);
		Interface class221 = Class598.loadedInterfaces[i_2_ >> 16];
		Class550.method9333(class226, class221, class613, -630418920);
	}

	static final void method5374(ScriptExecutionContext class613, int i) {
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Client.aBool10870 ? 1 : 0;
	}

	static final void method6971(ScriptExecutionContext class613, int i) {
		int i_0_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_0_);
		Interface class221 = Class598.loadedInterfaces[i_0_ >> 16];
		class226.anInt2453 = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045] * -1584868157;
		Widget.redraw(class226);
		if (-1 == class226.component * -592186295 && !class221.aBool2278) {
			PulseEvent.method13719(1857819631 * class226.id);
		}
	}

	static final void method6960(ScriptExecutionContext class613, byte i) {
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Client.aBool10769 ? 1 : 0;
	}

	static final void method7386(ScriptExecutionContext class613) {
		int i_13_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		if (Client.anInt10790 * 1764783361 != -1) {
			if (0 == i_13_) {
				class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 1764783361 * Client.anInt10790;
				return;
			}
			i_13_--;
		}
		Class480_Sub41 class480_sub41 = (Class480_Sub41) Client.aClass667_10791.first();
		while (i_13_-- > 0) {
			class480_sub41 = (Class480_Sub41) Client.aClass667_10791.next();
		}
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 1021060255 * class480_sub41.anInt10372;
	}

	static final void method1683(Widget class226, Interface class221, ScriptExecutionContext class613) {
		class613.anInt7924 -= 195773364;
		class226.anInt2540 = class613.anIntArray7942[class613.anInt7924 * 1841827045] * 553756117;
		class226.anInt2555 = 569020939 * class613.anIntArray7942[1 + class613.anInt7924 * 1841827045];
		class226.anInt2442 = class613.anIntArray7942[1841827045 * class613.anInt7924 + 2] * -1823482489;
		class226.anInt2412 = 610247499 * class613.anIntArray7942[1841827045 * class613.anInt7924 + 3];
		Widget.redraw(class226);
	}

	static final void method1684(ScriptExecutionContext class613, byte i) {
		int i_0_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		if (i_0_ != Class199.preferences.skyboxes.getValue()) {
			Class199.preferences.setValue(Class199.preferences.skyboxes, i_0_);
			Client.savePreferences();
			Client.sentPreferences = false;
		}
	}

	static final void method1685(ScriptExecutionContext class613, int i) {
		int i_1_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_1_);
		Interface class221 = Class598.loadedInterfaces[i_1_ >> 16];
		Widget.method7527(class226, class221, true, 2, class613);
	}

	static final void method1618(ScriptExecutionContext class613) {
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = class613.aClass288_7941.replacementOwner * 1405717133;
	}

	static final void method1617(ScriptExecutionContext class613, int i) {
		Client.processConsoleCommand(
				(String) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933], false, false);
	}

	static final void method1616(ScriptExecutionContext class613, int i) {
		int i_2_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_2_);
		Interface class221 = Class598.loadedInterfaces[i_2_ >> 16];
		ScriptExecutionContext.method911(class226, class221, class613);
	}

	static final void method3162(ScriptExecutionContext class613) {
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = -660318819 * Class31.anInt437;
	}

	static final void method14269(ScriptExecutionContext class613, int i) {
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 147042807 * Class495_Sub1.anInt10322 == 100 ? 1
				: 0;
	}

	static final void method13850(ScriptExecutionContext class613, byte i) {
		class613.anInt7924 -= -2049596966;
		int i_0_ = class613.anIntArray7942[class613.anInt7924 * 1841827045];
		int i_1_ = class613.anIntArray7942[1 + 1841827045 * class613.anInt7924];
		ConnectionInfo.method13843(9, i_0_, i_1_, "");
	}

	static final void method13852(ScriptExecutionContext class613) {
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = -1924912047 * Client.anInt10597;
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 832706251 * Client.anInt10596;
	}

	static final void method13726(ScriptExecutionContext class613, byte i) {
		int i_7_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_7_);
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 1362321717 * class226.height;
	}

	static final void method9316(ScriptExecutionContext class613) {
		class613.anInt7924 -= -926911801;
		int i_8_ = class613.anIntArray7942[class613.anInt7924 * 1841827045];
		boolean bool = class613.anIntArray7942[1 + class613.anInt7924 * 1841827045] == 1;
		int i_9_ = class613.anIntArray7942[1841827045 * class613.anInt7924 + 2];
		Class200 class200 = ItemDefinition.aClass192_8339.method3806(i_8_);
		if (class200.method3893() == null) {
			class200.method3892(Client.anInterface22_10652);
		}
		if (bool) {
			PlayerVariableParameterDefinition class131_sub2 = BaseVariableParameterDefinition.aClass77_Sub1_Sub2_3726
					.get(i_9_);
			switch (-1355589053 * class131_sub2.aClass422_1515.valueType.anInt4854) {
				case 4:
					class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = class200
							.method3893().getOrDefaultInt(class131_sub2.id * 169834903);
					break;
				case 0:
					class613.aLongArray7934[(class613.anInt7928 += 423292651) * -47101501 - 1] = class200.method3893()
							.getOrDefaultLong(class131_sub2.id * 169834903);
					break;
				default:
					class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = class200
							.method3893().getOrDefaultObject(169834903 * class131_sub2.id);
			}
		} else {
			VariableBitsDefinition class301 = VariableBitsDefinition.loader.get(i_9_);
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = class301.getValue(class200
					.method3893().getOrDefaultInt(169834903 * class301.varp.id));
		}
	}

	static final void method9317(ScriptExecutionContext class613, int i) {
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Client.anInt10912 * -1160922663
				- Client.anInt10714 * 1953827643;
	}

	static final void method9318(ScriptExecutionContext class613, int i) {
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Class31.anInt395 * 1004082977;
	}

	static final void method9319(ScriptExecutionContext class613, int i) {
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
	}

	static final void method9320(ScriptExecutionContext class613, int i) {
		class613.anInt7924 -= 1122685165;
		int i_10_ = class613.anIntArray7942[1841827045 * class613.anInt7924];
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Class480_Sub31_Sub13
				.method3149(i_10_);
	}

	static final void method9321(ScriptExecutionContext class613, int i) {
		if (Class369.aClass261_Sub1_4079.method4837() != Class270.aClass270_2997) {
			throw new RuntimeException();
		}
		class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = Class369.aClass261_Sub1_4079
				.method4848(901943881);
	}

	static final void method9322(ScriptExecutionContext class613) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		Interface class221 = class611.aClass221_7913;
		Class581.method9842(class226, class221, class613, 1778354250);
	}

	static final void method15340(ScriptExecutionContext class613, byte i) {
		int i_1_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Character
				.toUpperCase((char) i_1_);
	}

	static final void method6977(ScriptExecutionContext class613, int i) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		Interface class221 = class611.aClass221_7913;
		ScriptExecutionContext.method1146(class226, class221, class613);
	}

	static final void method6978(Widget class226, Interface class221, ScriptExecutionContext class613, int i) {
		String string = (String) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
		int[] is = method9239(string, class613);
		if (null != is) {
			string = string.substring(0, string.length() - 1);
		}
		class226.anObjectArray2500 = Class562_Sub1.method16248(string, class613);
		class226.anIntArray2501 = is;
		class226.aBool2483 = true;
	}

	static final void method6979(ScriptExecutionContext class613) {
		int i_1_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = ItemDefinition.aClass192_8339
				.method3806(i_1_).method3930();
	}

	static final void method6980(ScriptExecutionContext class613, int i) {
		class613.anInt7924 -= 195773364;
		int i_2_ = class613.anIntArray7942[1841827045 * class613.anInt7924];
		boolean bool = 1 == class613.anIntArray7942[class613.anInt7924 * 1841827045 + 1];
		int i_3_ = class613.anIntArray7942[2 + class613.anInt7924 * 1841827045];
		boolean bool_4_ = class613.anIntArray7942[3 + class613.anInt7924 * 1841827045] == 1;
		Class539.method9210(i_2_, bool, i_3_, bool_4_, (byte) -124);
	}

	static final void method6983(ScriptExecutionContext class613, int i) {
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = (int) ((TimeUtil.time()
				- ItemDefinition.aClass192_8339.method3770() - -4467880663037169619L
				* ParameterDefinition.remainingSubscription) / 1000L);
	}

	static void method4706(ScriptExecutionContext class613) {
		class613.anIntArray7942[1841827045 * class613.anInt7924 - 1] = QuestDefinition.loader
				.get(class613.anIntArray7942[class613.anInt7924 * 1841827045 - 1]).anInt2592 * -1213781401;
	}

	static final void method6995(ScriptExecutionContext class613) {
		class613.anInt7924 -= -2049596966;
		int i_0_ = class613.anIntArray7942[1841827045 * class613.anInt7924];
		int i_1_ = class613.anIntArray7942[class613.anInt7924 * 1841827045 + 1];
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = AnimateObjectCutsceneAction.aClass420_9538
				.get(i_0_).messages[i_1_];
	}

	static final void method6998(ScriptExecutionContext class613) {
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Class56.menuOptionCount * 84366055;
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = MenuCategory.count * 1469668737;
	}

	static final void method7000(Widget class226, ScriptExecutionContext class613) {
		int i_3_ = 10;
		Client.method17268(class226, i_3_, class613);
	}

	static final void method10197(ScriptExecutionContext class613) {
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Class431.method7147(
				Class199.preferences.currentToolkit.getValue(), 200);
	}

	static final void method10196(ScriptExecutionContext class613) {
		String string = (String) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
		int i_2_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		ContainerHeader.method7119(string, i_2_, -998046321);
	}

	static final void method10198(ScriptExecutionContext class613) {
		int i_3_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_3_);
		class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = class226.text;
	}

	static final void method8059(ScriptExecutionContext class613) {
		if (Client.anInt10764 * -90820499 >= 5 && Client.anInt10764 * -90820499 <= 9) {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = -90820499
					* Client.anInt10764;
		} else {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
		}
	}

	static final void method5370(ScriptExecutionContext class613) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		Interface class221 = class611.aClass221_7913;
		method1102(class226, class221, class613);
	}

	static final void method5371(ScriptExecutionContext class613) {
		int i_49_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_49_);
		class226.aStringArray2430 = null;
	}

	static final void method5372(ScriptExecutionContext class613) {
		class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = ((Player) class613.aClass600_Sub1_Sub3_Sub1_7936)
				.formattedName(true);
	}

	static final void method5276(ScriptExecutionContext class613) {
		class613.anInt7928 -= 846585302;
		if (class613.aLongArray7934[class613.anInt7928 * -47101501] != class613.aLongArray7934[1 + -47101501
				* class613.anInt7928]) {
			class613.counter += class613.anIntArray7943[1523704279 * class613.counter] * -160194073;
		}
	}

	static final void method5277(ScriptExecutionContext class613) {
		int i_3_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_3_);
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = class226.width * 688089097;
	}

	static final void method5278(ScriptExecutionContext class613) {
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.mobShadows
				.supported() ? 1 : 0;
	}

	static void method5275(Class520 class520, int i, int i_1_, ScriptExecutionContext context) {
		Script script = Script.lookup(class520, i, i_1_);
		if (null == script) {
			Class604.method10231();
		} else {
			context.intVariables = new int[script.intVariableCount * 58870653];
			context.stringVariables = new Object[script.stringVariableCount * -515357437];
			if (script.aClass520_11394 == Class520.aClass520_7176 || script.aClass520_11394 == Class520.aClass520_7178
					|| Class520.aClass520_7172 == script.aClass520_11394) {
				context.intVariables[0] = i;
				context.intVariables[1] = Client.recorder.getMouseX();
				context.intVariables[2] = Client.recorder.getMouseY();
			} else if (Class520.aClass520_7183 == script.aClass520_11394
					|| Class520.aClass520_7179 == script.aClass520_11394
					|| script.aClass520_11394 == Class520.aClass520_7173
					|| script.aClass520_11394 == Class520.aClass520_7177
					|| script.aClass520_11394 == Class520.aClass520_7190) {
				context.intVariables[0] = i;
			} else if (script.aClass520_11394 == Class520.aClass520_7184) {
				context.intVariables[0] = -414689037 * context.anInt7926;
			}
			execute(script, 200000, context);
		}
	}

	static final void method17569(ScriptExecutionContext class613) {
		Class480_Sub31_Sub18 class480_sub31_sub18 = Class436.method7271();
		if (null != class480_sub31_sub18) {
			boolean bool = class480_sub31_sub18.method17867(Class495.anInt6849 + AsynchronousStreamRequest.anInt4532
					* -1343037161, ClanChannelUpdater.anInt3185 * -1266662223 + Class495.anInt6823,
					Class626.anIntArray8037, 210884310);
			if (bool) {
				class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Class626.anIntArray8037[1];
				class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Class626.anIntArray8037[2];
			} else {
				class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = -1;
				class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = -1;
			}
		} else {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = -1;
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = -1;
		}
	}

	static final void method17530(ScriptExecutionContext class613) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		Interface class221 = class611.aClass221_7913;
		ScriptExecutionContext.method5906(class226, class221, class613);
	}

	static final void method17571(ScriptExecutionContext class613) {
		int i_0_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Client.aClass448Array10869[i_0_].anInt5071 * 848726687;
	}

	static final void method1632(Widget class226, Interface class221, ScriptExecutionContext class613) {
		class226.anInt2418 = -512645613;
		class226.anInt2486 = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045] * 1265546033;
		Widget.redraw(class226);
		if (-1 == -592186295 * class226.component && !class221.aBool2278) {
			PulseEvent.method7175(1857819631 * class226.id);
		}
	}

	static final void method1633(ScriptExecutionContext class613) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		class226.aStringArray2430 = null;
	}

	static final void method1635(ScriptExecutionContext class613) {
		int i_1_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		int i_2_ = Client.aClass448Array10869[i_1_].method7375();
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 1 == i_2_ ? 1 : 0;
	}

	static final void method15441(ScriptExecutionContext class613) {
		int i_3_ = Client.anIntArrayArrayArray10720[class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045]].length >> 1;
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = i_3_;
	}

	static final void method5857(ScriptExecutionContext class613) {
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = BaseAnimationDefinitionProvider
				.method3320(-1501875989 * Client.gameState) ? 1 : 0;
	}

	static final void method5856(ScriptExecutionContext class613) {
		class613.anInt7924 -= -2049596966;
		int i_6_ = class613.anIntArray7942[class613.anInt7924 * 1841827045];
		int i_7_ = class613.anIntArray7942[1841827045 * class613.anInt7924 + 1];
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = AnimateObjectCutsceneAction.aClass420_9538
				.get(i_6_).messageHotkeys[i_7_];
	}

	static final void method5855(ScriptExecutionContext class613) {
		Widget class226 = Widget.lookup(class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045]);
		class226.aClass226Array2542 = null;
		class226.aClass226Array2521 = null;
		Widget.redraw(class226);
	}

	static final void method5906(Widget class226, Interface class221, ScriptExecutionContext class613) {
		String string = (String) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
		if (method9239(string, class613) != null) {
			string = string.substring(0, string.length() - 1);
		}
		Class562_Sub1.method16248(string, class613);
	}

	static final void method5959(ScriptExecutionContext class613, int i) {
		int i_0_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_0_);
		Interface class221 = Class598.loadedInterfaces[i_0_ >> 16];
		ScriptExecutionContext.method4798(class226, class221, class613);
	}

	static final void method5960(ScriptExecutionContext class613, int i) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		Interface class221 = class611.aClass221_7913;
		ScriptExecutionContext.method13220(class226, class221, class613);
	}

	static final void method5961(ScriptExecutionContext class613, short i) {
		int i_1_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = class613.aClass480_Sub33_7935.aClass283Array10233[i_1_].aString3165;
	}

	static final void method5962(ScriptExecutionContext class613, byte i) {
		int i_2_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		if (i_2_ < 0 || i_2_ > 5 || 2 == i_2_) {
			i_2_ = 3;
		}
		ChecksumTableEntry.method6355(i_2_, false);
	}

	static final void method5963(ScriptExecutionContext class613, int i) {
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Client.anInt10790 * 1764783361;
	}

	static final void method6044(ScriptExecutionContext class613) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		Interface class221 = class611.aClass221_7913;
		ScriptExecutionContext.method6319(class226, class221, class613, 211787933);
	}

	static final void method6046(ScriptExecutionContext class613, int i) {
		class613.anInt7924 -= -2049596966;
		int i_4_ = class613.anIntArray7942[1841827045 * class613.anInt7924];
		int i_5_ = class613.anIntArray7942[1841827045 * class613.anInt7924 + 1];
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Class367.method6096(i_4_, i_5_,
				true, false, -2067061605);
	}

	static final void method6042(ScriptExecutionContext class613, int i) {
		class613.anInt7924 -= -2049596966;
		long l = class613.anIntArray7942[1841827045 * class613.anInt7924];
		long l_2_ = class613.anIntArray7942[1841827045 * class613.anInt7924 + 1];
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = (int) (l_2_ * l / 100L + l);
	}

	static final void method6043(ScriptExecutionContext class613, byte i) {
		Class480_Sub37 class480_sub37 = Class55.method1184();
		if (null == class480_sub37) {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = -1;
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = -1;
		} else {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = class480_sub37.id * 818539827;
			int i_3_ = 1881345255 * class480_sub37.anInt10314 << 28
					| Class495.anInt6849 + class480_sub37.anInt10310 * -1639918769 << 14 | Class495.anInt6823
					+ -342421335 * class480_sub37.anInt10308;
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = i_3_;
		}
	}

	static final void method5975(ScriptExecutionContext class613, int i) {
		int i_1_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_1_);
		Interface class221 = Class598.loadedInterfaces[i_1_ >> 16];
		Class480_Sub31_Sub13.method17837(class226, class221, class613);
	}

	static final void method5976(ScriptExecutionContext class613) {
		int i_2_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Client.aClass448Array10869[i_2_].anInt5069 * 1146866127;
	}

	static final void method5977(ScriptExecutionContext class613, byte i) {
		String string = (String) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
		if (Class515.aString7059 != null && Class515.aString7059.equalsIgnoreCase(string)) {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 1;
		} else {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
		}
	}

	static final void method6018(ScriptExecutionContext class613, int i) {
		int i_0_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_0_);
		int i_6_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		int i_7_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045] - 1;
		if (2 != class226.anInt2418 * 286135323) {
			throw new RuntimeException("");
		}
		NpcDefinition definition = NpcDefinition.loader.get(class226.anInt2486 * -643054127);
		if (class226.aClass267_2361 == null) {
			class226.aClass267_2361 = new Class267(definition, false);
		}
		class226.aClass267_2361.aLong2977 = Class36.method992() * 359135170314717883L;
		if (i_7_ < 0 || i_7_ >= definition.headModels.length) {
			throw new RuntimeException("");
		}
		class226.aClass267_2361.models[i_7_] = i_6_;
		Widget.redraw(class226);
	}

	static final void method6019(ScriptExecutionContext class613) {
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 3 == 1212513917 * Connection.anInt7170 ? 1
				: 0;
	}

	static final void method6021(ScriptExecutionContext class613) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		class226.anInt2524 = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045] * 657627567;
	}

	static final void method6022(ScriptExecutionContext class613) {
		if (Client.anInt10764 * -90820499 >= 5 && -90820499 * Client.anInt10764 <= 9) {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 1;
		} else {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
		}
	}

	static final void method6098(ScriptExecutionContext class613, int i) {
		class613.anInt7929 -= 1581763434;
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = VarpDefinition.method13983(
				(String) class613.anObjectArray7918[211787933 * class613.anInt7929],
				(String) class613.anObjectArray7918[1 + class613.anInt7929 * 211787933], Client.currentLanguage);
	}

	static final void method6103(ScriptExecutionContext class613, int i) {
		class613.anInt7924 -= -2049596966;
		if (class613.anIntArray7942[class613.anInt7924 * 1841827045] > class613.anIntArray7942[1 + class613.anInt7924 * 1841827045]) {
			class613.counter += class613.anIntArray7943[class613.counter * 1523704279] * -160194073;
		}
	}

	static final void method583(ScriptExecutionContext class613) {
		int i_6_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		boolean bool = true;
		if (i_6_ < 0) {
			bool = 0 == (1 + i_6_) % 4;
		} else if (i_6_ < 1582) {
			bool = i_6_ % 4 == 0;
		} else if (0 != i_6_ % 4) {
			bool = false;
		} else if (0 != i_6_ % 100) {
			bool = true;
		} else if (0 != i_6_ % 400) {
			bool = false;
		}
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = bool ? 1 : 0;
	}

	static final void method17320(ScriptExecutionContext class613, short i) {
		class613.anInt7929 -= 1581763434;
		String string = (String) class613.anObjectArray7918[class613.anInt7929 * 211787933];
		String string_0_ = (String) class613.anObjectArray7918[1 + class613.anInt7929 * 211787933];
		class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = new StringBuilder()
				.append(string).append(string_0_).toString();
	}

	static final void method17342(ScriptExecutionContext class613, int i) {
		class613.anInt7924 -= 1318458529;
		int i_0_ = class613.anIntArray7942[class613.anInt7924 * 1841827045];
		int i_1_ = class613.anIntArray7942[class613.anInt7924 * 1841827045 + 1];
		int i_2_ = class613.anIntArray7942[1841827045 * class613.anInt7924 + 2];
		int i_3_ = class613.anIntArray7942[1841827045 * class613.anInt7924 + 3];
		int i_4_ = class613.anIntArray7942[4 + 1841827045 * class613.anInt7924];
		TurnMobCutsceneAction.aClass186_9434.method3710(Class171.aClass171_1952, i_0_, i_1_, i_3_,
				Class156.aClass156_1876.method3293(), Class167.aClass167_1926, 0.0F, 0.0F, null, 0, i_4_, i_2_);
	}

	static final void method13722(ScriptExecutionContext class613, int i) {
		class613.anInt7924 -= 195773364;
		int i_4_ = class613.anIntArray7942[class613.anInt7924 * 1841827045];
		int i_5_ = class613.anIntArray7942[1 + 1841827045 * class613.anInt7924];
		int i_6_ = class613.anIntArray7942[2 + class613.anInt7924 * 1841827045];
		int i_7_ = class613.anIntArray7942[3 + class613.anInt7924 * 1841827045];
		int i_8_ = 256;
		TurnMobCutsceneAction.aClass186_9434.method3710(Class171.aClass171_1952, i_4_, i_5_, i_7_,
				Class156.aClass156_1876.method3293(), Class167.aClass167_1926, 0.0F, 0.0F, null, 0, i_8_, i_6_);
	}

	static final void method13723(ScriptExecutionContext class613, byte i) {
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = class613.aClass600_Sub1_Sub3_Sub1_7936
				.method16307();
	}

	static final void method13724(Widget class226, Interface class221, ScriptExecutionContext class613, int i) {
		class226.spriteScale = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045] * 1495301125;
		Widget.redraw(class226);
		if (-1 == class226.component * -592186295 && !class221.aBool2278) {
			PulseEvent.method4741(1857819631 * class226.id);
		}
	}

	static final void method1544(ScriptExecutionContext class613, int i) {
		int i_0_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_0_);
		Interface class221 = Class598.loadedInterfaces[i_0_ >> 16];
		Class600_Sub1_Sub4_Sub1.method18062(class226, class221, class613, 1758700346);
	}

	static final void method9689(ScriptExecutionContext class613) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		Interface class221 = class611.aClass221_7913;
		Class608.method10292(class226, class221, class613, (short) -21413);
	}

	static final void method9690(ScriptExecutionContext class613, byte i) {
		class613.anInt7929 -= 225161503;
		String string = (String) class613.anObjectArray7918[211787933 * class613.anInt7929];
		String string_0_ = (String) class613.anObjectArray7918[1 + class613.anInt7929 * 211787933];
		String string_1_ = (String) class613.anObjectArray7918[2 + class613.anInt7929 * 211787933];
		boolean bool = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045] == 1;
		HitbarDefinition.method8948(string, string_0_, string_1_, bool, 975873880);
	}

	static final void method729(Widget class226, Interface class221, ScriptExecutionContext class613) {
		String string = (String) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
		if (method9239(string, class613) != null) {
			string = string.substring(0, string.length() - 1);
		}
		class226.anObjectArray2519 = Class562_Sub1.method16248(string, class613);
		class226.aBool2483 = true;
	}

	static final void method731(Widget class226, Interface class221, ScriptExecutionContext class613) {
		String string = (String) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
		int[] is = method9239(string, class613);
		if (null != is) {
			string = string.substring(0, string.length() - 1);
		}
		class226.anObjectArray2498 = Class562_Sub1.method16248(string, class613);
		class226.anIntArray2499 = is;
		class226.aBool2483 = true;
	}

	static final void method7059(ScriptExecutionContext class613, short i) {
		MenuOption class480_sub31_sub17 = Class63.method1482();
		if (LoadingRequirementType.method594(class480_sub31_sub17, -30585040) == 7) {
			int i_8_ = (int) class480_sub31_sub17.getKey();
			if (i_8_ >= 0 && i_8_ <= Class80.playerCount * -1784886003) {
				Player player = Client.players[i_8_];
				if (null != player) {
					class613.aClass600_Sub1_Sub3_Sub1_7936 = player;
					class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 1;
					return;
				}
			}
		}
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
	}

	static void method7173(ScriptExecutionContext class613, byte i) {
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Class149.method3180() ? 1 : 0;
	}

	static final void method7174(ScriptExecutionContext class613, byte i) {
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = class613.intVariables[class613.anIntArray7943[class613.counter * 1523704279]];
	}

	static final void method9559(ScriptExecutionContext class613, int i) {
		class613.anInt7924 -= -2049596966;
		int i_4_ = class613.anIntArray7942[1841827045 * class613.anInt7924];
		int i_5_ = class613.anIntArray7942[1 + class613.anInt7924 * 1841827045];
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = ThemeMusicVolumeNormaliser.aClass10_2062
				.get(i_4_).responses[i_5_];
	}

	static final void method2067(ScriptExecutionContext class613) {
		String string = (String) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
		if (string.startsWith(Class290_Sub1.crown(0)) || string.startsWith(Class290_Sub1.crown(1))) {
			string = string.substring(7);
		}
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = IgnoredPlayer.isIgnored(string) ? 1
				: 0;
	}

	static final void method17487(ScriptExecutionContext class613) {
		int i_8_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_8_);
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 1920469085 * class226.parent;
	}

	static final void method912(ScriptExecutionContext class613, int i) {
		class613.anInt7929 -= 1581763434;
		String string = (String) class613.anObjectArray7918[class613.anInt7929 * 211787933];
		String string_2_ = (String) class613.anObjectArray7918[class613.anInt7929 * 211787933 + 1];
		Class250.method4708(string, string_2_);
	}

	static final void method913(ScriptExecutionContext class613, int i) {
		boolean bool = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045] == 1;
		Class198.method3873(bool);
	}

	static final void method914(ScriptExecutionContext class613, int i) {
		int i_3_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = PlayerVariableProvider.instance
				.method1546(i_3_);
	}

	static final void method911(Widget class226, Interface class221, ScriptExecutionContext class613) {
		class613.anInt7924 -= -2049596966;
		int i_0_ = class613.anIntArray7942[1841827045 * class613.anInt7924];
		int i_1_ = class613.anIntArray7942[class613.anInt7924 * 1841827045 + 1];
		if (-1 == i_0_ && i_1_ == -1) {
			class226.aClass226_2478 = null;
		} else {
			class226.aClass226_2478 = Class185.method3584(i_0_, i_1_);
		}
	}

	static final void method1370(ScriptExecutionContext class613, int i) {
		int i_2_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.fog
				.compatible(i_2_);
	}

	static final void method7005(Widget class226, Interface class221, ScriptExecutionContext class613) {
		int i_2_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		class226.aBool2539 = 1 == i_2_;
		Widget.redraw(class226);
	}

	static final void method7006(ScriptExecutionContext class613, short i) {
		int i_3_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Class480_Sub31_Sub18 class480_sub31_sub18 = Class495.method8553(i_3_);
		if (class480_sub31_sub18 == null) {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
		} else {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = -1874808723
					* class480_sub31_sub18.anInt11425;
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 1964867229 * class480_sub31_sub18.anInt11427;
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = -1334470583
					* class480_sub31_sub18.anInt11428;
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = -144068941
					* class480_sub31_sub18.anInt11421;
		}
	}

	static final void method7007(ScriptExecutionContext class613, int i) {
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Class369.aClass261_Sub1_4079
				.method4832(1841579820).anInt3005 * 818944887;
	}

	static void method7008(ScriptExecutionContext class613, int i) {
		QuestDefinition class234 = QuestDefinition.loader
				.get(class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045]);
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = class234.anIntArray2596 == null ? 0
				: class234.anIntArray2596.length;
	}

	static final void method7011(Widget class226, Interface class221, ScriptExecutionContext class613) {
		class226.colour = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045] * -742586667;
		Widget.redraw(class226);
		if (-1 == -592186295 * class226.component && !class221.aBool2278) {
			PulseEvent.resetWidgetColour(1857819631 * class226.id);
		}
	}

	static final void method4799(ScriptExecutionContext class613, int i) {
		class613.anInt7924 -= -535365073;
		Class349[] class349s = Class349.values();
		Class334[] class334s = Class334.values();
		Class249.method4699(class349s[class613.anIntArray7942[class613.anInt7924 * 1841827045]],
				class334s[class613.anIntArray7942[1841827045 * class613.anInt7924 + 1]],
				class613.anIntArray7942[1841827045 * class613.anInt7924 + 2],
				class613.anIntArray7942[class613.anInt7924 * 1841827045 + 3],
				class613.anIntArray7942[1841827045 * class613.anInt7924 + 4],
				class613.anIntArray7942[5 + class613.anInt7924 * 1841827045],
				class613.anIntArray7942[6 + 1841827045 * class613.anInt7924],
				class613.anIntArray7942[7 + 1841827045 * class613.anInt7924],
				class613.anIntArray7942[8 + class613.anInt7924 * 1841827045],
				class613.anIntArray7942[1841827045 * class613.anInt7924 + 9],
				class613.anIntArray7942[class613.anInt7924 * 1841827045 + 10]);
	}

	static final void method4798(Widget class226, Interface class221, ScriptExecutionContext class613) {
		class226.aBool2423 = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045] == 1;
		Widget.redraw(class226);
	}

	static final void method10237(Widget class226, Interface class221, ScriptExecutionContext class613, int i) {
		class226.anInt2446 = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045] * -1908006435;
	}

	static void method4032(ScriptExecutionContext class613, int i) {
		int i_0_ = Class62.method1381(class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045],
				1996763445);
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = i_0_;
	}

	static final void method4033(ScriptExecutionContext class613, int i) {
		int i_1_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_1_);
		Interface class221 = Class598.loadedInterfaces[i_1_ >> 16];
		method3491(class226, class221, class613);
	}

	static final void method4037(ScriptExecutionContext class613) {
		class613.anInt7924 -= -2049596966;
		int i_5_ = class613.anIntArray7942[1841827045 * class613.anInt7924];
		boolean bool = class613.anIntArray7942[class613.anInt7924 * 1841827045 + 1] == 1;
		if (!Class340.method5858(i_5_, bool, (byte) 23)) {
			throw new RuntimeException();
		}
	}

	static final void method9348(ScriptExecutionContext class613, int i) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		Interface class221 = class611.aClass221_7913;
		method3491(class226, class221, class613);
	}

	static final void method9349(ScriptExecutionContext class613) {
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = HashedVariableCollection.aBool1483 ? 1
				: 0;
	}

	static final void method9350(ScriptExecutionContext class613) throws ScriptException {
		class613.anInt7924 -= -2049596966;
		int i_5_ = class613.anIntArray7942[1841827045 * class613.anInt7924];
		Class397 class397 = Class397.create(i_5_, i_5_, i_5_);
		Class369.aClass261_Sub1_4079.method4802(class397);
		class397.cache();
	}

	static final void method9656(ScriptExecutionContext class613, int i) {
		class613.anInt7924 -= -2049596966;
		Client.anInt10781 = 897408463 * class613.anIntArray7942[class613.anInt7924 * 1841827045];
		Client.anInt10783 = class613.anIntArray7942[1841827045 * class613.anInt7924 + 1] * -856791521;
	}

	static final void method9655(ScriptExecutionContext class613, int i) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		Interface class221 = class611.aClass221_7913;
		IgnoredPlayer.method1363(class226, class221, class613, (byte) -93);
	}

	static void method16135(ScriptExecutionContext class613) {
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = TwitchTV.getViewerCount();
	}

	static final void method16136(Widget class226, Interface class221, ScriptExecutionContext class613, int i) {
		class226.aBool2444 = false;
		Widget.redraw(class226);
	}

	static void method8294(ScriptExecutionContext class613, int i) {
		int i_63_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		TwitchWebcamDevice twitchwebcamdevice = CachedParticleDefinitionLoader.method5981(i_63_);
		if (twitchwebcamdevice == null) {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = -1;
		} else {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = twitchwebcamdevice
					.capabilities();
		}
	}

	static final void method8295(ScriptExecutionContext class613, int i) {
		int i_64_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = class613.aClass288_7941.aBoolArray3214[i_64_] ? 1
				: 0;
	}

	static final void method3359(ScriptExecutionContext class613, byte i) {
		int i_0_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.buildArea
				.compatible(i_0_);
	}

	static final void method13522(ScriptExecutionContext class613, int i) {
		int i_5_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_5_);
		if (Client.method17050(class226).method15631((short) -19297) && Client.aClass226_10793 == null) {
			Class276.method5162(1857819631 * class226.id, class226.component * -592186295, (short) 29410);
			Client.aClass226_10793 = Class185.method3584(1857819631 * class226.id, class226.component * -592186295);
			Widget.redraw(Client.aClass226_10793);
		}
	}

	static final void method13520(ScriptExecutionContext class613, byte i) {
		int i_0_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.aClass632_Sub8_10280
				.compatible(i_0_);
	}

	static final void method3286(ScriptExecutionContext class613, int i) {
		int i_65_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		if (2 == Client.anInt10892 * -2028985543 && i_65_ < -1763746795 * Client.friendCount) {
			class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = Client.friends[i_65_].aString568;
		} else {
			class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = "";
		}
	}

	static final void method3287(ScriptExecutionContext class613) throws ScriptException {
		class613.anInt7924 -= 195773364;
		float f = class613.anIntArray7942[class613.anInt7924 * 1841827045];
		float f_66_ = class613.anIntArray7942[1841827045 * class613.anInt7924 + 1];
		float f_67_ = class613.anIntArray7942[2 + 1841827045 * class613.anInt7924];
		float f_68_ = class613.anIntArray7942[class613.anInt7924 * 1841827045 + 3] / 1000.0F;
		Class369.aClass261_Sub1_4079.method4915(Class397.create(f, f_66_, f_67_), f_68_);
	}

	static final void method3288(ScriptExecutionContext class613, byte i) {
		class613.anInt7924 -= -2049596966;
		int i_69_ = class613.anIntArray7942[class613.anInt7924 * 1841827045];
		int i_70_ = class613.anIntArray7942[1 + 1841827045 * class613.anInt7924];
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = AnimateObjectCutsceneAction.aClass420_9538
				.get(i_69_).subcategoryHotkeys[i_70_];
	}

	static final void method3290(ScriptExecutionContext class613, int i) {
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 1;
	}

	static final void method3291(ScriptExecutionContext class613, int i) {
		int i_72_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_72_);
		Interface class221 = Class598.loadedInterfaces[i_72_ >> 16];
		Widget.method7527(class226, class221, false, 2, class613);
	}

	static final void method3292(ScriptExecutionContext class613, byte i) {
		int i_73_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_73_);
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = class226.hidden ? 1 : 0;
	}

	static final ScriptExecutionContext method9584() {
		if (Class626.anInt8034 * 606205973 == Class626.anArrayList8042.size()) {
			Class626.anArrayList8042.add(new ScriptExecutionContext());
		}

		ScriptExecutionContext context = (ScriptExecutionContext) Class626.anArrayList8042
				.get(606205973 * Class626.anInt8034);
		Class626.anInt8034 += -710535363;
		return context;
	}

	static final void method9585(ScriptExecutionContext class613, int i) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		Interface class221 = class611.aClass221_7913;
		PlayerAppearance.method9805(class226, class221, class613, 2033404118);
	}

	static final void method9586(ScriptExecutionContext class613, int i) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		Interface class221 = class611.aClass221_7913;
		Class591.method9996(class226, class221, class613, 223375752);
	}

	static final void method9587(ScriptExecutionContext class613, byte i) {
		class613.anInt7924 -= -2049596966;
		int i_0_ = class613.anIntArray7942[1841827045 * class613.anInt7924];
		int i_1_ = class613.anIntArray7942[1 + 1841827045 * class613.anInt7924];
		Mob.method18041(i_0_, i_1_ >> 14 & 0x3fff, i_1_ & 0x3fff, true);
	}

	static final void method10418(ScriptExecutionContext class613) {
		int id = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		ItemDefinition definition = ItemDefinition.loader.get(id);

		int i_8_;
		if (definition.aBool8335) {
			i_8_ = definition.anInt8294 * -2006367341;
		} else if (definition.members) {
			i_8_ = -670718769 * Script.aClass580_11401.anInt7763;
		} else {
			i_8_ = Script.aClass580_11401.anInt7762 * -661273573;
		}

		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = i_8_;
	}

	static final void method4320(ScriptExecutionContext class613, int i) {
		class613.anInt7929 -= 1581763434;
		String string = (String) class613.anObjectArray7918[class613.anInt7929 * 211787933];
		String string_68_ = (String) class613.anObjectArray7918[1 + class613.anInt7929 * 211787933];
		if (Client.localPlayer.appearance != null && Client.localPlayer.appearance.male) {
			class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = string_68_;
		} else {
			class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = string;
		}
	}

	static final void method4323(ScriptExecutionContext class613, int i) {
		int i_72_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = CacheResourceWorker
				.isAlphaNumeric((char) i_72_) ? 1 : 0;
	}

	static final void method15953(ScriptExecutionContext class613, int i) {
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = -1448497935
				* ShaderMetaBuffer.unreadMessages;
	}

	static final void method17529(ScriptExecutionContext class613, byte i) {
		int i_0_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_0_);
		Interface class221 = Class598.loadedInterfaces[i_0_ >> 16];
		Class197.method3864(class226, class221, class613);
	}

	static final void method17755(ScriptExecutionContext class613) {
		class613.anInt7924 -= -2049596966;
		int i_0_ = class613.anIntArray7942[class613.anInt7924 * 1841827045];
		int i_1_ = class613.anIntArray7942[1 + class613.anInt7924 * 1841827045];
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Class480_Sub1.method2172(i_0_,
				i_1_, false);
	}

	static final void method15581(ScriptExecutionContext class613) {
		int i_8_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_8_);
		class226.aString2473 = (String) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
	}

	static final void method7852(ScriptExecutionContext class613) {
		int i_5_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		if (Class551.friendsChat != null && i_5_ < 46303181 * Client.friendChatSize
				&& Class551.friendsChat[i_5_].accountName.equalsIgnoreCase(Client.localPlayer.accountName)) {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 1;
		} else {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
		}
	}

	static final void method7391(ScriptExecutionContext class613) {
		int i_3_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_3_);
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Client.method17050(class226)
				.method15633();
	}

	static final void method7392(ScriptExecutionContext class613) throws ScriptException {
		int i_4_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Class369.aClass261_Sub1_4079.method4889(Class157.method3301(i_4_), true);
		Client.aBool10611 = true;
	}

	static final void method7395(ScriptExecutionContext class613, byte i) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		Interface class221 = class611.aClass221_7913;
		method1683(class226, class221, class613);
	}

	static final void method7387(ScriptExecutionContext class613) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		Interface class221 = class611.aClass221_7913;
		ScriptExecutionContext.method4770(class226, class221, class613);
	}

	static final void method7390(ScriptExecutionContext class613, byte i) {
		int i_11_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Class199.preferences.setValue(Class199.preferences.brightness, i_11_);
		Client.aClass460_10760.method7705();
		Client.savePreferences();
		Client.sentPreferences = false;
	}

	static final void method7370(ScriptExecutionContext class613, byte i) {
		class613.anInt7929 -= 1581763434;
		String string = (String) class613.anObjectArray7918[211787933 * class613.anInt7929];
		String string_0_ = (String) class613.anObjectArray7918[211787933 * class613.anInt7929 + 1];
		int i_1_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = string.indexOf(string_0_, i_1_);
	}

	static final void method7371(ScriptExecutionContext class613) {
		int i_2_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		ItemDefinition itemDefinition = ItemDefinition.loader.get(i_2_);
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = itemDefinition.aBool8335 ? 1 : 0;
	}

	static final void method7372(ScriptExecutionContext class613, int i) {
		class613.anInt7924 -= -2049596966;
		int i_3_ = class613.anIntArray7942[class613.anInt7924 * 1841827045];
		int i_4_ = class613.anIntArray7942[1 + class613.anInt7924 * 1841827045];
		ParameterDefinition class33 = ParameterDefinition.loader.get(i_4_);
		if (class33.isString()) {
			class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = AnimationDefinition.loader
					.get(i_3_).getParameter(i_4_, class33.defaultString);
		} else {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = AnimationDefinition.loader
					.get(i_3_).getParameter(i_4_, class33.defaultInt * -125275839);
		}
	}

	static final void method6354(ScriptExecutionContext class613, int i) {
		int i_3_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_3_);
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 1331228877 * class226.spriteScale;
	}

	static final void method6357(ScriptExecutionContext class613, int i) {
		class613.anInt7924 -= 1122685165;
		int i_8_ = class613.anIntArray7942[class613.anInt7924 * 1841827045];
		TurnMobCutsceneAction.aClass186_9434.method3594(i_8_);
	}

	public static void method6308(Class520 class520, int i, int i_0_, SceneObject interface55, int i_1_) {
		ScriptExecutionContext class613 = method9584();
		class613.anInterface55_7937 = interface55;
		method5275(class520, i, i_0_, class613);
		class613.anInterface55_7937 = null;
	}

	static final void method6309(ScriptExecutionContext class613, int i) {
		int i_2_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_2_);
		Interface class221 = Class598.loadedInterfaces[i_2_ >> 16];
		ScriptExecutionContext.method14027(class226, class221, class613);
	}

	static final void method6312(ScriptExecutionContext class613, byte i) {
		int i_3_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_3_);
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = -370763243 * class226.anInt2409;
	}

	static final void method6319(Widget class226, Interface class221, ScriptExecutionContext class613, int i) {
		boolean bool = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045] == 1;
		if (bool != class226.hidden) {
			class226.hidden = bool;
			Widget.redraw(class226);
		}
		if (-592186295 * class226.component == -1 && !class221.aBool2278) {
			PulseEvent.method9353(1857819631 * class226.id);
		}
	}

	static final void method6323(ScriptExecutionContext class613, byte i) {
		class613.anInt7928 -= 846585302;
		if (class613.aLongArray7934[class613.anInt7928 * -47101501] <= class613.aLongArray7934[1 + class613.anInt7928
				* -47101501]) {
			class613.counter += class613.anIntArray7943[class613.counter * 1523704279] * -160194073;
		}
	}

	static final void method8778(ScriptExecutionContext class613) {
		int i_14_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_14_);
		Interface class221 = Class598.loadedInterfaces[i_14_ >> 16];
		CutsceneMob.method3384(class226, class221, class613, 65535);
	}

	static final void method8777(ScriptExecutionContext class613, byte i) {
		int i_13_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_13_);
		Interface class221 = Class598.loadedInterfaces[i_13_ >> 16];
		Class490.method8470(class226, class221, class613, 1240505385);
	}

	static final void method7850(ScriptExecutionContext class613) {
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = -1101491257 * Engine.anInt6488;
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = -1101491257 * Engine.anInt6488;
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 1;
	}

	static final void method1030(ScriptExecutionContext class613, byte i) {
		class613.anInt7929 -= 1581763434;
		Class63.method1484((String) class613.anObjectArray7918[class613.anInt7929 * 211787933],
				(String) class613.anObjectArray7918[1 + 211787933 * class613.anInt7929], "",
				class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045] == 1, false, -31350113);
	}

	static final void method1031(ScriptExecutionContext class613, byte i) {
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Client.aShort10613;
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Client.aShort10878;
	}

	static final void method1032(ScriptExecutionContext class613) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = class226.item * 1391525437;
	}

	static final void method7272(ScriptExecutionContext class613, byte i) {
		int i_0_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = ((Class182) ItemDefinition.aClass192_8339
				.method3765().get(i_0_)).method3562();
	}

	static final void method7275(ScriptExecutionContext class613, int i) {
		int i_12_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = i_12_ ^ 0xffffffff;
	}

	static final void method1092(ScriptExecutionContext class613, byte i) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		Interface class221 = class611.aClass221_7913;
		String string = (String) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
		if (!string.equals(class226.text)) {
			class226.text = string;
			Widget.redraw(class226);
		}
		if (-1 == -592186295 * class226.component && !class221.aBool2278) {
			Class380.method6235(1857819631 * class226.id);
		}
	}

	static final void method1093(ScriptExecutionContext class613, byte i) {
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.sceneryShadows
				.getValue();
	}

	static final void method1094(ScriptExecutionContext class613, int i) {
		class613.anInt7924 -= -2049596966;
		int i_0_ = class613.anIntArray7942[1841827045 * class613.anInt7924];
		int i_1_ = class613.anIntArray7942[class613.anInt7924 * 1841827045 + 1];
		ConnectionInfo.method13843(5, i_0_, i_1_, "");
	}

	static final void method1095(ScriptExecutionContext class613) {
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.particles
				.supported() ? 1 : 0;
	}

	static final void method1096(ScriptExecutionContext class613, int i) throws ScriptException {
		Class369.aClass261_Sub1_4079
				.method4833(class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045] / 1000.0F);
	}

	static final void method4415(ScriptExecutionContext class613) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 688089097 * class226.width;
	}

	static final void method4416(ScriptExecutionContext class613, byte i) {
		method15098(class613);
	}

	static final void method4417(ScriptExecutionContext class613, int i) {
		if (Class193.keyRecorder.held(81)) {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 1;
		} else {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
		}
	}

	static final void method6937(ScriptExecutionContext class613, int i) {
		int i_3_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Class480_Sub31_Sub18 class480_sub31_sub18 = Class495.method8553(i_3_);
		if (class480_sub31_sub18 == null) {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
		} else {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = class480_sub31_sub18.anInt11422 * 181021407;
		}
	}

	static void method9297(ScriptExecutionContext class613, int i) {
		class613.anInt7924 -= -2049596966;
		boolean bool = class613.anIntArray7942[1841827045 * class613.anInt7924] != 0;
		boolean bool_99_ = 0 != class613.anIntArray7942[class613.anInt7924 * 1841827045 + 1];
		Class164.method3364(bool, bool_99_);
	}

	static final void method9296(ScriptExecutionContext class613, byte i) {
		Class199.preferences.setValue(Class199.preferences.multisample,
				class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045]);
		ChecksumTableEntry.method6355(Class199.preferences.currentToolkit.getValue(), false);
		Client.savePreferences();
	}

	static final void method9294(ScriptExecutionContext class613) {
		class613.anInt7924 -= -2049596966;
		int i_97_ = class613.anIntArray7942[class613.anInt7924 * 1841827045];
		int i_98_ = class613.anIntArray7942[class613.anInt7924 * 1841827045 + 1];
		ParameterDefinition class33 = ParameterDefinition.loader.get(i_98_);
		if (class33.isString()) {
			class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = ItemDefinition.loader
					.get(i_97_).getOrDefault(i_98_, class33.defaultString);
		} else {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = ItemDefinition.loader.get(
					i_97_).getOrDefault(i_98_, -125275839 * class33.defaultInt);
		}
	}

	static final void method9293(Widget class226, ScriptExecutionContext class613) {
		int i_94_ = 10;
		int i_95_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		int i_96_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		MobDefaults.method9579(class226, i_94_, i_95_, i_96_, class613);
	}

	static final void method9292(ScriptExecutionContext class613, int i) {
		int i_93_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_93_);
		Interface class221 = Class598.loadedInterfaces[i_93_ >> 16];
		class613.anInt7924 -= -2049596966;
		class226.scrollWidth = class613.anIntArray7942[class613.anInt7924 * 1841827045] * 1011153391;
		class226.scrollHeight = class613.anIntArray7942[1841827045 * class613.anInt7924 + 1] * 1575701533;
		Widget.redraw(class226);
		if (class226.type * 1558474223 == 0) {
			Class548.method9327(class221, class226, false);
		}
	}

	public static void method3463(Class520 class520, int i, int i_0_, Class606 class606,
			Class600_Sub1_Sub1_Sub1 class600_sub1_sub1_sub1, int i_1_) {
		ScriptExecutionContext class613 = method9584();
		class613.aClass600_Sub1_Sub1_Sub1_7938 = class600_sub1_sub1_sub1;
		method5275(class520, i, i_0_, class613);
		class613.aClass600_Sub1_Sub1_Sub1_7938 = null;
	}

	static final void method3538(ScriptExecutionContext class613) {
		class613.anInt7924 -= -2049596966;
		if (class613.anIntArray7942[1841827045 * class613.anInt7924] <= class613.anIntArray7942[1 + class613.anInt7924 * 1841827045]) {
			class613.counter += -160194073 * class613.anIntArray7943[1523704279 * class613.counter];
		}
	}

	static final void method3536(ScriptExecutionContext class613, int i) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		Interface class221 = class611.aClass221_7913;
		method3539(class226, class221, class613, (byte) 1);
	}

	static final void method3758(ScriptExecutionContext class613, int i) {
		Class199.preferences.setValue(Class199.preferences.maxScreenSize,
				class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045]);
		Client.savePreferences();
		Client.aBool10905 = true;
	}

	static final void method3757(ScriptExecutionContext class613, int i) {
		class613.anInt7924 -= -2049596966;
		int i_2_ = class613.anIntArray7942[1841827045 * class613.anInt7924];
		int i_3_ = class613.anIntArray7942[1 + class613.anInt7924 * 1841827045];
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = i_2_ > i_3_ ? i_2_ : i_3_;
	}

	static final void method5847(Widget class226, Interface class221, ScriptExecutionContext class613, int i) {
		int id = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		String string = (String) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
		ParameterDefinition definition = ParameterDefinition.loader.get(id);
		if (!definition.defaultString.equals(string)) {
			class226.method4241(id, string);
		} else {
			class226.method4242(id);
		}
	}

	static final void method5849(ScriptExecutionContext class613, int i) {
		int i_5_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = ItemDefinition.loader.get(i_5_).anInt8293 * 643684993;
	}

	static final void method5851(ScriptExecutionContext class613, byte i) {
		int i_7_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		int i_8_ = i_7_ >> 14 & 0x3fff;
		int i_9_ = i_7_ & 0x3fff;
		Class553 class553 = Client.aClass460_10760.method7679();
		i_8_ -= 2051316501 * class553.x;
		if (i_8_ < 0) {
			i_8_ = 0;
		} else if (i_8_ >= Client.aClass460_10760.method7680()) {
			i_8_ = Client.aClass460_10760.method7680();
		}
		i_9_ -= class553.z * -180305283;
		if (i_9_ < 0) {
			i_9_ = 0;
		} else if (i_9_ >= Client.aClass460_10760.method7707()) {
			i_9_ = Client.aClass460_10760.method7707();
		}
		Client.anInt10706 = 626449507 * ((i_8_ << 9) + 256);
		Client.anInt10707 = (256 + (i_9_ << 9)) * 1901113705;
		Connection.anInt7170 = -1637449474;
		TurnMobCutsceneAction.anInt9433 = -1490979241;
		Class156.anInt1886 = -1672889529;
	}

	static final void method3366(ScriptExecutionContext class613) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		method7409(class226, class613, 1792136316);
	}

	static final void method3367(ScriptExecutionContext class613) {
		String string = (String) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = (string != null) ? string
				.length() : 0;
	}

	static final void method3368(ScriptExecutionContext class613) throws ScriptException {
		class613.anInt7924 -= 195773364;
		float f = class613.anIntArray7942[class613.anInt7924 * 1841827045];
		float f_1_ = class613.anIntArray7942[1841827045 * class613.anInt7924 + 1];
		float f_2_ = class613.anIntArray7942[2 + class613.anInt7924 * 1841827045];
		float f_3_ = class613.anIntArray7942[3 + class613.anInt7924 * 1841827045] / 1000.0F;
		Class369.aClass261_Sub1_4079.method4820(Class397.create(f, f_1_, f_2_), f_3_);
	}

	static final void method3345(ScriptExecutionContext class613, int i) {
		int i_2_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		if (i_2_ != Class199.preferences.aClass632_Sub11_10264.getValue()) {
			Class199.preferences.setValue(Class199.preferences.aClass632_Sub11_10264, i_2_);
			Client.savePreferences();
			Client.sentPreferences = false;
			Client.aClass460_10760.method7705();
		}
	}

	static final void method3342(ScriptExecutionContext class613) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = class226.positionX * -346651673;
	}

	static final void method3458(ScriptExecutionContext class613) throws ScriptException {
		class613.anInt7924 -= -2049596966;
		int i_7_ = class613.anIntArray7942[1841827045 * class613.anInt7924];
		Class397 class397 = Class397.create(i_7_, i_7_, i_7_);
		Class369.aClass261_Sub1_4079.method4818(class397);
		class397.cache();
	}

	static final void method3461(ScriptExecutionContext class613) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		Interface class221 = class611.aClass221_7913;
		Widget.method7527(class226, class221, false, 1, class613);
	}

	static final void method3460(ScriptExecutionContext class613) {
		class613.anInt7924 -= -926911801;
		int i_8_ = class613.anIntArray7942[1841827045 * class613.anInt7924];
		int i_9_ = class613.anIntArray7942[class613.anInt7924 * 1841827045 + 1];
		int i_10_ = class613.anIntArray7942[2 + class613.anInt7924 * 1841827045];
		Widget.lookup(i_8_);
		Widget.method14089(Class598.loadedInterfaces[i_8_ >>> 16], i_8_ & 0xffff, i_9_, i_10_,
				class613.aBool7932, class613);
	}

	static final void method3413(ScriptExecutionContext class613, int i) {
		class613.anInt7924 -= -2049596966;
		Client.aShort10613 = (short) class613.anIntArray7942[1841827045 * class613.anInt7924];
		if (Client.aShort10613 <= 0) {
			Client.aShort10613 = (short) 256;
		}
		Client.aShort10878 = (short) class613.anIntArray7942[1841827045 * class613.anInt7924 + 1];
		if (Client.aShort10878 <= 0) {
			Client.aShort10878 = (short) 205;
		}
	}

	static final void method3486(ScriptExecutionContext class613, byte i) {
		int i_2_ = class613.anIntArray7943[1523704279 * class613.counter];
		Script class480_sub31_sub15 = Script.lookup(i_2_);
		if (null == class480_sub31_sub15) {
			throw new RuntimeException();
		}
		int[] is = new int[class480_sub31_sub15.intVariableCount * 58870653];
		Object[] objects = new Object[class480_sub31_sub15.stringVariableCount * -515357437];
		long[] ls = new long[-422003431 * class480_sub31_sub15.longVariables];
		for (int i_3_ = 0; i_3_ < class480_sub31_sub15.anInt11396 * -850802497; i_3_++) {
			is[i_3_] = class613.anIntArray7942[1841827045 * class613.anInt7924 - class480_sub31_sub15.anInt11396
					* -850802497 + i_3_];
		}
		for (int i_4_ = 0; i_4_ < 304041107 * class480_sub31_sub15.anInt11395; i_4_++) {
			objects[i_4_] = class613.anObjectArray7918[i_4_ + 211787933 * class613.anInt7929 - 304041107
					* class480_sub31_sub15.anInt11395];
		}
		for (int i_5_ = 0; i_5_ < class480_sub31_sub15.anInt11398 * -150541391; i_5_++) {
			ls[i_5_] = class613.aLongArray7934[-47101501 * class613.anInt7928 - -150541391
					* class480_sub31_sub15.anInt11398 + i_5_];
		}
		class613.anInt7924 -= -1124071213 * class480_sub31_sub15.anInt11396;
		class613.anInt7929 -= -994467089 * class480_sub31_sub15.anInt11395;
		class613.anInt7928 -= -510465669 * class480_sub31_sub15.anInt11398;
		Class604 class604 = new Class604();
		class604.scripts = class613.script;
		class604.anInt7882 = class613.counter * -1723093193;
		class604.anIntArray7883 = class613.intVariables;
		class604.anObjectArray7881 = class613.stringVariables;
		class604.aLongArray7885 = class613.longVariables;
		if (class613.anInt7927 * -748745979 >= class613.aClass604Array7919.length) {
			throw new RuntimeException();
		}
		class613.aClass604Array7919[(class613.anInt7927 += -783480371) * -748745979 - 1] = class604;
		class613.script = class480_sub31_sub15;
		class613.instructions = class613.script.instructions;
		class613.anIntArray7943 = class613.script.anIntArray11391;
		class613.counter = 160194073;
		class613.intVariables = is;
		class613.stringVariables = objects;
		class613.longVariables = ls;
	}

	static final void method3487(ScriptExecutionContext class613, int i) {
		String string = (String) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
		boolean bool = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045] == 1;
		HitbarDefinition.method8947(string, bool, 2006669253);
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Class357.anInt3819 * -1937034147;
	}

	static final void method3496(ScriptExecutionContext class613) {
		class613.anInt7928 -= 846585302;
		if (class613.aLongArray7934[-47101501 * class613.anInt7928] == class613.aLongArray7934[class613.anInt7928
				* -47101501 + 1]) {
			class613.counter += -160194073 * class613.anIntArray7943[1523704279 * class613.counter];
		}
	}

	static final void method3497(ScriptExecutionContext class613) {
		Class480_Sub31_Sub18 class480_sub31_sub18 = Class495
				.method8553(class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045]);
		if (class480_sub31_sub18 == null || class480_sub31_sub18.aString11420 == null) {
			class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = "";
		} else {
			class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = class480_sub31_sub18.aString11420;
		}
	}

	static final void method3498(ScriptExecutionContext class613) {
		boolean bool = false;
		if (Client.aBool10589) {
			try {
				Object object = Class380.aClass380_4224.method6222(Integer.valueOf(Class452.anInt5091 * 433270587),
						Boolean.valueOf(1 == Client.localPlayer.gender),
						Integer.valueOf(class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045]));
				if (object != null) {
					bool = ((Boolean) object).booleanValue();
				}
			} catch (Throwable throwable) {

			}
		}

		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = bool ? 1 : 0;
	}

	static final void method3528(ScriptExecutionContext class613) {
		int i_18_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_18_);
		Interface class221 = Class598.loadedInterfaces[i_18_ >> 16];
		IgnoredPlayer.method1363(class226, class221, class613, (byte) -81);
	}

	static final void method5133(ScriptExecutionContext class613) {
		int i_97_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_97_);
		Interface class221 = Class598.loadedInterfaces[i_97_ >> 16];
		method10237(class226, class221, class613, -351850258);
	}

	static final void method5134(ScriptExecutionContext class613, int i) {
		Widget class226 = Widget.lookup(class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045]);
		if (class226.aClass226Array2542 == null) {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
		} else {
			int i_98_ = class226.aClass226Array2542.length;
			for (int i_99_ = 0; i_99_ < class226.aClass226Array2542.length; i_99_++) {
				if (null == class226.aClass226Array2542[i_99_]) {
					i_98_ = i_99_;
					break;
				}
			}
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = i_98_;
		}
	}

	static final void method5137(Widget class226, Interface class221, ScriptExecutionContext class613, int i) {
		class226.aBool2461 = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045] == 1;
		Widget.redraw(class226);
		if (-1 == class226.component * -592186295 && !class221.aBool2278) {
			CursorDefinitionLoader.method16798(class226.id * 1857819631, (byte) 1);
		}
	}

	static final void method6280(ScriptExecutionContext class613, Mob mob) {
		class613.anInt7924 -= -731138437;
		int i_0_ = class613.anIntArray7942[class613.anInt7924 * 1841827045];
		int i_1_ = class613.anIntArray7942[class613.anInt7924 * 1841827045 + 1];
		int i_2_ = class613.anIntArray7942[2 + 1841827045 * class613.anInt7924];
		int i_3_ = class613.anIntArray7942[3 + 1841827045 * class613.anInt7924];
		int i_4_ = class613.anIntArray7942[1841827045 * class613.anInt7924 + 4];
		boolean bool = 1 == class613.anIntArray7942[1841827045 * class613.anInt7924 + 5];
		int i_5_ = class613.anIntArray7942[class613.anInt7924 * 1841827045 + 6];
		if (Class369.aClass261_Sub1_4079.method4837() != Class270.aClass270_2995) {
			throw new RuntimeException();
		}
		Class281_Sub2 class281_sub2 = (Class281_Sub2) Class369.aClass261_Sub1_4079.method4876();
		Class395 class395 = new Class395();
		Class395 class395_6_ = new Class395();
		class395.method6367(0.0F, 1.0F, 0.0F, (float) (2.0 * (Math.PI * i_4_) / 16384.0));
		Class397 class397 = new Class397(1.0F, 0.0F, 0.0F);
		class397.method6480(class395);
		class397.invert();
		class395_6_.method6380(class397, (float) (i_3_ * Math.PI * 2.0 / 16384.0));
		class395.method6377(class395_6_);
		Class553 class553 = Client.aClass460_10760.method7679();
		int i_7_ = 2051316501 * class553.x << 9;
		int i_8_ = -180305283 * class553.z << 9;
		if (mob != null) {
			class281_sub2.method15237(mob, new Class397(i_0_, i_1_, i_2_), class395, bool, i_5_,
					Client.aClass460_10760.method7696().tileHeights, Client.aClass460_10760.method7775(), i_7_, i_8_);
		}
		Client.aBool10611 = true;
	}

	static final void method6284(Widget class226, Interface class221, ScriptExecutionContext class613) {
		String string = (String) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
		if (method9239(string, class613) != null) {
			string = string.substring(0, string.length() - 1);
		}
		class226.anObjectArray2516 = Class562_Sub1.method16248(string, class613);
		class226.aBool2483 = true;
	}

	static final void method548(ScriptExecutionContext class613) {
		int width = Class403.anInt4553 * 3099199;
		int height = Engine.anInt6500 * 1670967737;
		int found = -1;

		if (Client.supportsFullScreen) {
			DisplayProperties[] properties = PlayerVarpType.method15345();
			for (int index = 0; index < properties.length; index++) {
				DisplayProperties display = properties[index];
				if (width == display.width * 1967400213 && height == display.height * -150744351) {
					found = index;
					break;
				}
			}
		}

		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = found;
	}

	static final void method6712(ScriptExecutionContext class613) {
		class613.anInt7924 -= -2049596966;
		int i_0_ = class613.anIntArray7942[class613.anInt7924 * 1841827045];
		float f = Class373.method6114(class613.anIntArray7942[1841827045 * class613.anInt7924 + 1]);
		Class480_Sub31_Sub19 class480_sub31_sub19 = Class369.aClass261_Sub1_4079.method4828(i_0_);
		if (null == class480_sub31_sub19) {
			throw new RuntimeException("");
		} else if (!(class480_sub31_sub19 instanceof Class480_Sub31_Sub19_Sub1)) {
			throw new RuntimeException("");
		}

		((Class480_Sub31_Sub19_Sub1) class480_sub31_sub19).method18161(f);
	}

	static final void method8991(ScriptExecutionContext class613) {
		String string = (String) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
		class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = string.toLowerCase();
	}

	static final void method8992(ScriptExecutionContext class613, int i) {
		int id = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = ItemDefinition.loader.get(id).anInt8305 * 1427382901;
	}

	static final void method6992(ScriptExecutionContext class613) {
		int i_4_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Client.aClass448Array10869[i_4_].anInt5068
				* -333623323;
	}

	static final void method6994(ScriptExecutionContext class613, int i) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		class613.anInt7924 -= -1658050238;
		byte[] is = null;
		byte[] is_5_ = null;
		int i_6_;
		for (i_6_ = 0; i_6_ < 10 && class613.anIntArray7942[i_6_ + 1841827045 * class613.anInt7924] >= 0; i_6_ += 2) {

		}
		if (i_6_ > 0) {
			is = new byte[i_6_ / 2];
			is_5_ = new byte[i_6_ / 2];
			for (i_6_ -= 2; i_6_ >= 0; i_6_ -= 2) {
				is[i_6_ / 2] = (byte) class613.anIntArray7942[i_6_ + class613.anInt7924 * 1841827045];
				is_5_[i_6_ / 2] = (byte) class613.anIntArray7942[1841827045 * class613.anInt7924 + i_6_ + 1];
			}
		}
		int i_1_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045] - 1;
		if (i_1_ < 0 || i_1_ > 9) {
			throw new RuntimeException();
		}
		Class650_Sub1.method16709(class226, i_1_, is, is_5_, class613, 39585591);
	}

	public static void method6991(Class520 class520, int i, int i_2_) {
		ScriptExecutionContext context = method9584();
		method5275(class520, i, i_2_, context);
	}

	static final void method7325(ScriptExecutionContext class613, byte i) {
		int i_2_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		if (null != Client.aString10890 && i_2_ < 46303181 * Client.friendChatSize) {
			class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = Class551.friendsChat[i_2_].aString1017;
		} else {
			class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = "";
		}
	}

	static final void method5204(ScriptExecutionContext class613) {
		class613.anInt7924 -= -2049596966;
		int i_0_ = class613.anIntArray7942[class613.anInt7924 * 1841827045];
		int i_1_ = class613.anIntArray7942[1841827045 * class613.anInt7924 + 1];
		ConnectionInfo.method13843(8, i_0_, i_1_, "");
	}

	static final void method5203(ScriptExecutionContext class613) {
		if (Client.supportsFullScreen && null != Client.fullScreenFrame) {
			Class254.method4740(Class199.preferences.screenSize.getValue(), -1, -1, false);
		}
	}

	static final void method5206(ScriptExecutionContext class613, int i) {
		String string = (String) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
		class613.anInt7924 -= -2049596966;
		int i_2_ = class613.anIntArray7942[class613.anInt7924 * 1841827045];
		int i_3_ = class613.anIntArray7942[1 + 1841827045 * class613.anInt7924];
		FontSpecification class9 = FontSpecification.create(Class80.fonts, i_3_, 0);
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = class9.getLineCount(string,
				i_2_, WeakReferenceTable.nameIcons);
	}

	static final void method5202(ScriptExecutionContext class613) {
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Client.recorder.leftButtonDown() ? 1
				: 0;
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Client.recorder
				.rightButtonDown() ? 1 : 0;
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Client.recorder
				.middleButtonDown() ? 1 : 0;
	}

	static final void method8238(ScriptExecutionContext class613) {
		class613.anInt7924 -= 1122685165;
		int i_1_ = class613.anIntArray7942[class613.anInt7924 * 1841827045];
		Class480_Sub31_Sub13 class480_sub31_sub13 = Class480_Sub31_Sub13.method3150(i_1_);
		if (class480_sub31_sub13 != null) {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = -1129723623
					* class480_sub31_sub13.anInt11375;
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = class480_sub31_sub13.anInt11373 * 1645966401;
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = class480_sub31_sub13.anInt11376
					* -1639949421;
			class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = class480_sub31_sub13.aString11377 != null ? class480_sub31_sub13.aString11377
					: "";
			class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = class480_sub31_sub13.aString11378 != null ? class480_sub31_sub13.aString11378
					: "";
			class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = null != class480_sub31_sub13.aString11379 ? class480_sub31_sub13.aString11379
					: "";
			class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = null != class480_sub31_sub13.aString11380 ? class480_sub31_sub13.aString11380
					: "";
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = class480_sub31_sub13.anInt11381 * 78704391;
			class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = null != class480_sub31_sub13.aString11383 ? class480_sub31_sub13.aString11383
					: "";
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = class480_sub31_sub13.aClass351_11374 != null ? class480_sub31_sub13.aClass351_11374
					.getId() : -1;
		} else {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = -1;
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
			class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = "";
			class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = "";
			class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = "";
			class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = "";
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
			class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = "";
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = -1;
		}
	}

	static final void method7189(ScriptExecutionContext class613, int i) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		Interface class221 = class611.aClass221_7913;
		boolean bool = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045] == 1;
		ScriptExecutionContext.method3838(class226, class221, class613, bool ? Class227.aClass227_2560 : Class227.aClass227_2567);
	}

	static final void method7190(ScriptExecutionContext class613) {
		int i_0_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_0_);
		class226.aString2368 = (String) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
	}

	static final void method9170(ScriptExecutionContext class613) {
		Class199.preferences.setValue(Class199.preferences.groundBlending,
				class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045] != 0 ? 1 : 0);
		Client.savePreferences();
		Client.aClass460_10760.method7705();
	}

	static final void method9169(ScriptExecutionContext context) {
		int id = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
		Widget widget = Widget.lookup(id);
		context.anInt7924 -= -926911801;
		int i_9_ = context.anIntArray7942[context.anInt7924 * 1841827045] - 1;
		int i_10_ = context.anIntArray7942[1841827045 * context.anInt7924 + 1];
		int i_11_ = context.anIntArray7942[1841827045 * context.anInt7924 + 2];

		if (i_9_ < 0 || i_9_ > 9) {
			throw new RuntimeException();
		}

		MobDefaults.method9579(widget, i_9_, i_10_, i_11_, context);
	}

	static void method8819(ScriptExecutionContext class613) {
		class613.anIntArray7942[class613.anInt7924 * 1841827045 - 1] = QuestDefinition.loader
				.get(class613.anIntArray7942[class613.anInt7924 * 1841827045 - 1]).anInt2591 * -2088404763;
	}

	static final void method8820(ScriptExecutionContext class613) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		Interface class221 = class611.aClass221_7913;
		method15099(class226, class221, class613);
	}

	static final void method4346(ScriptExecutionContext class613) {
		class613.anInt7924 -= -2049596966;
		Class474.method8102(class613.anIntArray7942[class613.anInt7924 * 1841827045],
				class613.anIntArray7942[class613.anInt7924 * 1841827045 + 1], 0);
	}

	static final void method4762(ScriptExecutionContext class613) {
		int i_1_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_1_);
		class226.aBool2475 = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045] == 1;
		Widget.redraw(class226);
	}

	static final void method4763(ScriptExecutionContext class613, byte i) {
		int i_2_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		if (2 == -2028985543 * Client.anInt10892 && i_2_ < -1763746795 * Client.friendCount) {
			class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = Client.friends[i_2_].aString573;
		} else {
			class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = "";
		}
	}

	static final void method4764(ScriptExecutionContext class613, int i) {
		if (Class369.aClass261_Sub1_4079.method4837() != Class270.aClass270_2995
				|| Class369.aClass261_Sub1_4079.method4836() != Class257.aClass257_2855) {
			throw new RuntimeException();
		}
		Class397 class397 = ((Class281_Sub2) Class369.aClass261_Sub1_4079.method4876()).method15243((byte) -60);
		Class397 class397_3_ = ((Class642_Sub3) Class369.aClass261_Sub1_4079.method4834()).method16720(1778457837);
		Class397 class397_4_ = Class397.copyOf(class397);
		class397_4_.subtract(class397_3_);
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = (int) class397_4_.distance();
	}

	static final void method748(ScriptExecutionContext class613, int i) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		Interface class221 = class611.aClass221_7913;
		class226.anInt2418 = -1025291226;
		class226.aClass267_2361 = null;
		class226.anInt2486 = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045] * 1265546033;
		if (-592186295 * class226.component == -1 && !class221.aBool2278) {
			PulseEvent.method7175(1857819631 * class226.id);
		}
	}

	static final void method5282(ScriptExecutionContext class613, byte i) {
		class613.anInt7929 -= 225161503;
		String string = (String) class613.anObjectArray7918[211787933 * class613.anInt7929];
		String string_5_ = (String) class613.anObjectArray7918[211787933 * class613.anInt7929 + 1];
		String string_6_ = (String) class613.anObjectArray7918[211787933 * class613.anInt7929 + 2];
		boolean bool = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045] == 1;
		Client.method5440(string, string_5_, string_6_, bool, 961581289);
	}

	static final void method5281(ScriptExecutionContext class613, int i) {
		boolean bool = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045] != 0;
		if (null != Client.localPlayer.appearance) {
			Client.localPlayer.appearance.setMale(bool);
		}
	}

	static final void method5283(ScriptExecutionContext class613) {
		int i_7_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_7_);
		int i_8_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		i_8_--;
		if (null == class226.aStringArray2430 || i_8_ >= class226.aStringArray2430.length
				|| class226.aStringArray2430[i_8_] == null) {
			class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = "";
		} else {
			class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = class226.aStringArray2430[i_8_];
		}
	}

	static final void method5286(ScriptExecutionContext class613) {
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Class369.aClass261_Sub1_4079
				.method4836() == null ? -1 : Class369.aClass261_Sub1_4079.method4836().anInt2854 * -2084034471;
	}

	static final void method16020(ScriptExecutionContext class613) {
		if (!Class369.aClass261_Sub1_4079.method4836().method4757()) {
			throw new RuntimeException();
		}
		Class642_Sub5 class642_sub5 = (Class642_Sub5) Class369.aClass261_Sub1_4079.method4834();
		class642_sub5.method16763(Class401.aClass401_8081, -1, 0.0F, (byte) -105);
		Client.aBool10611 = true;
	}

	static final void method13518(ScriptExecutionContext class613, int i) throws ScriptException {
		class613.anInt7924 -= -2049596966;
		int i_26_ = class613.anIntArray7942[1841827045 * class613.anInt7924];
		float f = class613.anIntArray7942[class613.anInt7924 * 1841827045 + 1] / 1000.0F;
		Class369.aClass261_Sub1_4079.method4825(i_26_, f, (byte) 114);
	}

	static final void method15080(ScriptExecutionContext class613) {
		int i_35_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_35_);
		Interface class221 = Class598.loadedInterfaces[i_35_ >> 16];
		ScriptExecutionContext.method4993(class226, class221, class613);
	}

	static final void method3560(ScriptExecutionContext class613, int i) {
		int i_5_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_5_);
		class226.disableHover = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045] == 1;
	}

	static final void method3559(ScriptExecutionContext class613, byte i) {
		class613.anInt7924 -= -2049596966;
		int i_4_ = class613.anIntArray7942[class613.anInt7924 * 1841827045];
		String string = (String) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
		boolean bool = 1 == class613.anIntArray7942[1 + 1841827045 * class613.anInt7924];
		Billboard.socialNetworkLogin(i_4_, string, bool);
	}

	static final void method3555(ScriptExecutionContext class613) {
		Class199.preferences.setValue(Class199.preferences.flickeringEffects,
				class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045] == 1 ? 1 : 0);
		Client.savePreferences();
		Client.sentPreferences = false;
	}

	static final void method3553(ScriptExecutionContext class613) {
		int i_2_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = ItemDefinition.aClass192_8339
				.method3772() == i_2_ ? 1 : 0;
	}

	static final void method3552(Widget class226, Interface class221, ScriptExecutionContext class613) {
		String string = (String) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
		int[] is = method9239(string, class613);
		if (null != is) {
			string = string.substring(0, string.length() - 1);
		}
		class226.anObjectArray2504 = Class562_Sub1.method16248(string, class613);
		class226.anIntArray2505 = is;
		class226.aBool2483 = true;
	}

	static final void method3551(ScriptExecutionContext class613) {
		int i_0_ = class613.anIntArray7943[1523704279 * class613.counter];
		class613.anInt7924 -= -2049596966;
		int i_1_ = class613.anIntArray7942[class613.anInt7924 * 1841827045];
		if (i_1_ < 0 || i_1_ >= class613.anIntArray7930[i_0_]) {
			throw new RuntimeException();
		}
		class613.anIntArrayArray7922[i_0_][i_1_] = class613.anIntArray7942[class613.anInt7924 * 1841827045 + 1];
	}

	static final void method1711(ScriptExecutionContext class613) {
		int i_0_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = i_0_ & 0x3fff;
	}

	static final void method2872(ScriptExecutionContext class613) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		class226.disableHover = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045] == 1;
	}

	static final void method3741(ScriptExecutionContext class613) {
		if (null != Client.aString10609) {
			class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = Client.aString10609;
		} else {
			class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = "";
		}
	}

	static final void method5836(ScriptExecutionContext class613) {
		int i_5_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Class480_Sub31_Sub18 class480_sub31_sub18 = Class495.method8552(i_5_ >> 14 & 0x3fff, i_5_ & 0x3fff);
		if (class480_sub31_sub18 == null) {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = -1;
		} else {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 1943328861 * class480_sub31_sub18.anInt11426;
		}
	}

	static final void method5835(ScriptExecutionContext class613, int i) {
		int i_4_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Class199.preferences.setValue(Class199.preferences.particles, i_4_);
		Client.savePreferences();
		Client.sentPreferences = false;
	}

	static final void method5834(ScriptExecutionContext class613) {
		int i_3_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 4094849 * Client.aClass448Array10869[i_3_].anInt5070;
	}

	static final void method5833(ScriptExecutionContext class613) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget widget = class611.aClass226_7914;
		int id = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		ParameterDefinition parameter = ParameterDefinition.loader.get(id);

		if (parameter.isString()) {
			class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = widget.method4239(id,
					parameter.defaultString, 219650637);
		} else {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = widget.method4238(id,
					-125275839 * parameter.defaultInt, -2072479445);
		}
	}

	static final void method546(ScriptExecutionContext class613) {
		if (Class369.aClass261_Sub1_4079.method4837() != Class270.aClass270_2995
				|| Class369.aClass261_Sub1_4079.method4836() != Class257.aClass257_2855) {
			throw new RuntimeException();
		}
		Class397 class397 = ((Class281_Sub2) Class369.aClass261_Sub1_4079.method4876()).method15243((byte) 3);
		Class397 class397_2_ = ((Class642_Sub3) Class369.aClass261_Sub1_4079.method4834()).method16720(2057132453);
		Class397 class397_3_ = Class397.copyOf(class397);
		class397_3_.subtract(class397_2_);
		float f = Class465.method7879(class397_3_.x, class397_3_.z, 1914134880);
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = (int) (2607.5945876176133 * f) & 0x3fff;
	}

	static void method547(ScriptExecutionContext class613) {
		class613.anIntArray7942[1841827045 * class613.anInt7924 - 2] = QuestDefinition.loader
				.get(class613.anIntArray7942[1841827045 * class613.anInt7924 - 2]).anIntArrayArray2607[class613.anIntArray7942[class613.anInt7924 * 1841827045 - 1]][1];
		class613.anInt7924 -= 1122685165;
	}

	static void method5438(ScriptExecutionContext class613, int i) {
		int i_3_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		TwitchWebcamDevice twitchwebcamdevice = CachedParticleDefinitionLoader.method5981(i_3_);
		if (null == twitchwebcamdevice) {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = -1;
			class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = "";
			class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = "";
		} else {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = -1008356979
					* twitchwebcamdevice.anInt924;
			class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = twitchwebcamdevice.aString922;
			class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = twitchwebcamdevice.aString923;
		}
	}

	static final void method5439(ScriptExecutionContext class613, byte i) {
		int i_4_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_4_);
		Interface class221 = Class598.loadedInterfaces[i_4_ >> 16];
		Widget.method7527(class226, class221, false, 0, class613);
	}

	static final void method5442(ScriptExecutionContext class613, byte i) {
		class613.anInt7924 -= 1122685165;
		int i_13_ = class613.anIntArray7942[class613.anInt7924 * 1841827045];
		TurnMobCutsceneAction.aClass186_9434.method3655(i_13_);
	}

	static void method5396(ScriptExecutionContext class613) {
		class613.anIntArray7942[1841827045 * class613.anInt7924 - 2] = QuestDefinition.loader.get(
				class613.anIntArray7942[class613.anInt7924 * 1841827045 - 2]).method4389(
				PlayerVariableProvider.instance, class613.anIntArray7942[class613.anInt7924 * 1841827045 - 1]) ? 1 : 0;
		class613.anInt7924 -= 1122685165;
	}

	static final void method5394(Widget class226, ScriptExecutionContext class613) {
		FontSpecification class9 = class226.method4230(Class509.aClass374_6997, Client.anInterface47_10645, (byte) -3);
		int i_2_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		int i_3_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		int i_4_ = class9.method610(class226.text, class226.width * 688089097, -1873663917 * class226.anInt2456,
				i_3_, i_2_, WeakReferenceTable.nameIcons);
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = i_4_;
	}

	static final void method5398(ScriptExecutionContext class613, int i) {
		int i_5_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_5_);
		Interface class221 = Class598.loadedInterfaces[i_5_ >> 16];
		method729(class226, class221, class613);
	}

	static final void method5399(ScriptExecutionContext class613, int i) {
		class613.anInt7924 -= 195773364;
		int i_6_ = class613.anIntArray7942[class613.anInt7924 * 1841827045];
		int i_7_ = class613.anIntArray7942[1 + class613.anInt7924 * 1841827045];
		int i_8_ = class613.anIntArray7942[1841827045 * class613.anInt7924 + 2];
		int i_9_ = class613.anIntArray7942[class613.anInt7924 * 1841827045 + 3];
		i_6_ += i_7_ << 14;
		i_6_ += i_8_ << 28;
		i_6_ += i_9_;
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = i_6_;
	}

	static final void method5428(ScriptExecutionContext class613) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 1331228877 * class226.spriteScale;
	}

	static final void method5401(ScriptExecutionContext class613, int i) {
		class613.anInt7928 -= 846585302;
		if (class613.aLongArray7934[class613.anInt7928 * -47101501] < class613.aLongArray7934[1 + -47101501
				* class613.anInt7928]) {
			class613.counter += -160194073 * class613.anIntArray7943[1523704279 * class613.counter];
		}
	}

	static final void method5221(ScriptExecutionContext class613, byte i) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		Interface class221 = class611.aClass221_7913;
		Widget class226_1_ = Class339.method5850(class221, class226, 1060483645);
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = null == class226_1_ ? -1
				: class226_1_.id * 1857819631;
	}

	static final void method5222(ScriptExecutionContext class613, int i) {
		if (Class369.aClass261_Sub1_4079.method4836() != Class257.aClass257_2850) {
			throw new RuntimeException();
		}
		((Class642_Sub1) Class369.aClass261_Sub1_4079.method4834()).method16687(
				class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045], -824728769);
	}

	static void method5223(ScriptExecutionContext class613, int i) {
		int i_2_ = class613.anIntArray7942[1841827045 * class613.anInt7924 - 3];
		int i_3_ = class613.anIntArray7942[1841827045 * class613.anInt7924 - 2];
		int i_4_ = class613.anIntArray7942[class613.anInt7924 * 1841827045 - 1];
		class613.anInt7924 -= -926911801;
		if (i_2_ > class613.anIntArray7930[i_3_]) {
			throw new RuntimeException();
		} else if (i_2_ > class613.anIntArray7930[i_4_]) {
			throw new RuntimeException();
		} else if (i_4_ == i_3_) {
			throw new RuntimeException();
		}

		ScriptInstruction.method7887(class613.anIntArrayArray7922[i_3_], class613.anIntArrayArray7922[i_4_], 0,
				i_2_ - 1);
	}

	static final void method5155(ScriptExecutionContext class613, int i) {
		int i_2_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		if (Class495_Sub1.aClass667_10318 != null) {
			Linkable class480 = Class495_Sub1.aClass667_10318.get(i_2_);
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = null != class480 ? 1 : 0;
		} else {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
		}
	}

	static final void method5156(ScriptExecutionContext class613, byte i) {
		int i_3_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		int i_4_ = Class340_Sub2.method15398(i_3_, (short) 775);
		if (i_4_ < 0) {
			throw new RuntimeException();
		}
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = i_4_;
	}

	static final void method5158(ScriptExecutionContext class613, byte i) {
		int i_5_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_5_);
		Interface class221 = Class598.loadedInterfaces[i_5_ >> 16];
		method6978(class226, class221, class613, -519590925);
	}

	static final void method5145(ScriptExecutionContext class613, int i) {
		int i_6_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_6_);
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = class226.positionY * -1901639223;
	}

	static final void method5146(ScriptExecutionContext class613, int i) {
		int i_7_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		if (i_7_ == -1) {
			Class199.preferences.setValue(Class199.preferences.aClass632_Sub22_10284,
					Class199.preferences.removeRoofs.getValue());
		} else {
			Class199.preferences.setValue(Class199.preferences.aClass632_Sub22_10284, i_7_);
		}
		Class591.method9995();
	}

	static final void method5147(ScriptExecutionContext class613) {
		class613.anInt7924 -= -2049596966;
		int i_8_ = class613.anIntArray7942[1841827045 * class613.anInt7924];
		boolean bool = class613.anIntArray7942[1 + class613.anInt7924 * 1841827045] == 1;
		Class199.preferences.setValue(Class199.preferences.desiredToolkit, i_8_);
		if (!bool) {
			Class199.preferences.setValue(Class199.preferences.graphics, 0);
		}
		Client.savePreferences();
		Client.sentPreferences = false;
	}

	static final void method5149(ScriptExecutionContext class613) {
		int i_10_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_10_);
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = class226.spriteRoll
				* -1831978227;
	}

	static final void method5150(ScriptExecutionContext class613) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		if (1391525437 * class226.item != -1) {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = -1212380503
					* class226.itemAmount;
		} else {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
		}
	}

	static final void method5045(Widget class226, ScriptExecutionContext class613, int i) {
		int i_5_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		int i_6_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045] - 1;
		int i_7_ = i_6_;
		if (class226.anInt2418 * 286135323 != 6 && 2 != 286135323 * class226.anInt2418) {
			throw new RuntimeException("");
		}
		NpcDefinition npcDefinition = NpcDefinition.loader.get(class226.anInt2486 * -643054127);
		if (null == class226.aClass267_2361) {
			class226.aClass267_2361 = new Class267(npcDefinition, 6 == class226.anInt2418 * 286135323);
		}
		class226.aClass267_2361.aLong2977 = Class36.method992() * 359135170314717883L;
		if (null != npcDefinition.aByteArray3027) {
			if (i_6_ < 0 || i_6_ >= npcDefinition.aByteArray3027.length) {
				throw new RuntimeException("");
			}
			i_7_ = npcDefinition.aByteArray3027[i_6_];
		}
		if (null == npcDefinition.replacementColours || i_7_ < 0 || i_7_ >= npcDefinition.replacementColours.length) {
			throw new RuntimeException("");
		}
		class226.aClass267_2361.colours[i_7_] = (short) i_5_;
		Widget.redraw(class226);
	}

	static final void method5044(ScriptExecutionContext class613, int i) {
		int i_4_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_4_);
		Interface class221 = Class598.loadedInterfaces[i_4_ >> 16];
		ScriptExecutionContext.method3838(class226, class221, class613,
				Class417.aClass480_Sub33_4650 == class613.aClass480_Sub33_7935 ? Class227.aClass227_2562
						: Class227.aClass227_2563);
	}

	static final void method5041(ScriptExecutionContext class613, byte i) {
		if (Class369.aClass261_Sub1_4079.method4836() != Class257.aClass257_2850) {
			throw new RuntimeException();
		}
		((Class642_Sub1) Class369.aClass261_Sub1_4079.method4834()).method16688(
				class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045], (byte) 65);
	}

	static final void method5003(ScriptExecutionContext class613, short i) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		int i_3_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		i_3_--;
		if (class226.aStringArray2430 == null || i_3_ >= class226.aStringArray2430.length
				|| class226.aStringArray2430[i_3_] == null) {
			class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = "";
		} else {
			class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = class226.aStringArray2430[i_3_];
		}
	}

	static final void method5002(ScriptExecutionContext class613) {
		int i_2_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_2_);
		Interface class221 = Class598.loadedInterfaces[i_2_ >> 16];
		method5847(class226, class221, class613, 2017488784);
	}

	static final void method5007(ScriptExecutionContext class613) {
		int i_5_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_5_);
		Interface class221 = Class598.loadedInterfaces[i_5_ >> 16];
		String string = (String) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
		if (!string.equals(class226.text)) {
			class226.text = string;
			Widget.redraw(class226);
		}
		if (-1 == -592186295 * class226.component && !class221.aBool2278) {
			Class380.method6235(1857819631 * class226.id);
		}
	}

	static final void method4998(ScriptExecutionContext class613) {
		class613.anInt7924 -= -2049596966;
		int i_0_ = class613.anIntArray7942[class613.anInt7924 * 1841827045];
		int i_1_ = class613.anIntArray7942[1841827045 * class613.anInt7924 + 1];
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Class62.method1384(class611.aClass226_7914, i_0_, i_1_);
	}

	static final void method5000(ScriptExecutionContext class613) {
		int i_2_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		if (-2028985543 * Client.anInt10892 == 2 && i_2_ < Client.friendCount * -1763746795) {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Client.friends[i_2_].aBool569 ? 1
					: 0;
		} else {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
		}
	}

	static final void method4994(ScriptExecutionContext class613, int i) {
		class613.anInt7924 -= -2049596966;
		int i_12_ = class613.anIntArray7942[class613.anInt7924 * 1841827045];
		int i_13_ = class613.anIntArray7942[class613.anInt7924 * 1841827045 + 1];
		Queue class638 = Class495.method8554(i_12_ >> 14 & 0x3fff, i_12_ & 0x3fff);
		boolean bool = false;
		for (Class480_Sub31_Sub18 class480_sub31_sub18 = (Class480_Sub31_Sub18) class638.getFront(); null != class480_sub31_sub18; class480_sub31_sub18 = (Class480_Sub31_Sub18) class638
				.next()) {
			if (i_13_ == 1943328861 * class480_sub31_sub18.anInt11426) {
				bool = true;
				break;
			}
		}
		if (bool) {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 1;
		} else {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
		}
	}

	static final void method4993(Widget class226, Interface class221, ScriptExecutionContext class613) {
		String string = (String) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
		if (method9239(string, class613) != null) {
			string = string.substring(0, string.length() - 1);
		}
		class226.anObjectArray2553 = Class562_Sub1.method16248(string, class613);
		class226.aBool2483 = true;
	}

	static final void method4995(ScriptExecutionContext class613) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		Interface class221 = class611.aClass221_7913;
		Class198.method3872(class226, class221, class613);
	}

	static final void method4996(ScriptExecutionContext class613) {
		Npc npc = (Npc) class613.aClass600_Sub1_Sub3_Sub1_7936;
		boolean bool = false;
		NpcDefinition definition = npc.definition;
		if (null != definition.morphisms) {
			definition = definition.morph(PlayerVariableProvider.instance, PlayerVariableProvider.instance);
		}
		if (null != definition) {
			bool = definition.aBool3052;
		}
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = bool ? 1 : 0;
	}

	static final void method4770(Widget class226, Interface class221, ScriptExecutionContext class613) {
		String string = (String) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
		if (method9239(string, class613) != null) {
			string = string.substring(0, string.length() - 1);
		}
		class226.anObjectArray2526 = Class562_Sub1.method16248(string, class613);
		class226.aBool2483 = true;
	}

	static final void method4745(ScriptExecutionContext class613) {
		Class562_Sub1 class562_sub1 = Class287.method5302();
		if (null != class562_sub1) {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = class562_sub1.anInt10370
					* -1741841871;
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = class562_sub1.anInt7554
					* -1833179177;
			class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = class562_sub1.aString10366;
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = class562_sub1.method16238();
			class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = class562_sub1
					.method16236();
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = class562_sub1.anInt7553
					* -1320445881;
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 1668853513 * class562_sub1.anInt10368;
			class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = class562_sub1.aString10365;
		} else {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = -1;
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
			class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = "";
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
			class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = "";
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
			class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = "";
		}
	}

	static final void method4739(ScriptExecutionContext class613) {
		int i_1_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = class613.aClass288_7941.bannedUserNames[i_1_];
	}

	static final void method14027(Widget class226, Interface class221, ScriptExecutionContext class613) {
		String string = (String) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
		if (method9239(string, class613) != null) {
			string = string.substring(0, string.length() - 1);
		}
		class226.anObjectArray2489 = Class562_Sub1.method16248(string, class613);
		class226.aBool2483 = true;
	}

	static final void method2857(ScriptExecutionContext class613, int i) {
		int i_0_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_0_);
		Interface class221 = Class598.loadedInterfaces[i_0_ >> 16];
		method5137(class226, class221, class613, -119986913);
	}

	static final void method2858(ScriptExecutionContext class613) {
		Class199.preferences.setValue(Class199.preferences.voiceOverVolume,
				class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045]);
		Client.savePreferences();
		Client.sentPreferences = false;
	}

	static final void method2859(ScriptExecutionContext class613) {
		String string = null;
		if (null != Class551.identifier) {
			string = Class551.identifier.getHostName();
		}
		if (null == string) {
			string = "";
		}
		class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = string;
	}

	static final void method2862(ScriptExecutionContext class613) {
		class613.anInt7924 -= 1318458529;
		int i_1_ = class613.anIntArray7942[class613.anInt7924 * 1841827045];
		int i_2_ = class613.anIntArray7942[1 + class613.anInt7924 * 1841827045];
		int i_3_ = class613.anIntArray7942[class613.anInt7924 * 1841827045 + 2];
		int i_4_ = class613.anIntArray7942[3 + 1841827045 * class613.anInt7924];
		int i_5_ = class613.anIntArray7942[1841827045 * class613.anInt7924 + 4];
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = (i_5_ - i_3_) * (i_2_ - i_1_)
				/ (i_4_ - i_3_) + i_1_;
	}

	static final void method2863(ScriptExecutionContext class613) {
		String string = (String) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
		StringBuilder stringbuilder = new StringBuilder(string.length());
		boolean bool = false;
		for (int i_6_ = 0; i_6_ < string.length(); i_6_++) {
			char c = string.charAt(i_6_);
			if (c == '<') {
				bool = true;
			} else if (c == '>') {
				bool = false;
			} else if (!bool) {
				stringbuilder.append(c);
			}
		}
		class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = stringbuilder.toString();
	}

	static final void method2866(ScriptExecutionContext class613) {
		if (Class369.aClass261_Sub1_4079.method4837() != Class270.aClass270_2995) {
			throw new RuntimeException();
		}
		Class281_Sub2 class281_sub2 = (Class281_Sub2) Class369.aClass261_Sub1_4079.method4876();
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = (int) (class281_sub2
				.method15263(-2113257482) * 2607.5945876176133) & 0x3fff;
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = (int) (class281_sub2
				.method15246(-1388725924) * 2607.5945876176133) & 0x3fff;
	}

	static final void method3183(ScriptExecutionContext class613) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		Interface class221 = class611.aClass221_7913;
		Class490.method8471(class226, class221, class613, -2124781903);
	}

	static final void method684(ScriptExecutionContext class613) {
		Class480_Sub22 class480_sub22 = (Class480_Sub22) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
		if (Class369.aClass261_Sub1_4079.method4837() != Class270.aClass270_2997) {
			throw new RuntimeException();
		}
		Class281_Sub3 class281_sub3 = (Class281_Sub3) Class369.aClass261_Sub1_4079.method4876();
		class281_sub3.method15304(class480_sub22);
		Client.aBool10611 = true;
	}

	static final void method3188(ScriptExecutionContext class613) {
		int i_7_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = i_7_ >> 28;
	}

	static final void method687(ScriptExecutionContext class613) {
		if (Class489.aClass655_6685 == null) {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = -1;
		} else {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Class489.aClass655_6685.anInt8247
					* -1219686185;
		}
	}

	static final void method3547(ScriptExecutionContext class613) {
		int i_2_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Class480_Sub31_Sub18 class480_sub31_sub18 = Class495.method8553(i_2_);
		if (null == class480_sub31_sub18) {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
		} else {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = -1334470583
					* class480_sub31_sub18.anInt11428 - class480_sub31_sub18.anInt11425 * -1874808723;
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = class480_sub31_sub18.anInt11421
					* -144068941 - 1964867229 * class480_sub31_sub18.anInt11427;
		}
	}

	static final void method3546(ScriptExecutionContext class613) {
		int i_1_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		ItemDefinition itemDefinition = ItemDefinition.loader.get(i_1_);
		if (itemDefinition.combineTemplate * -1261835713 == -1 && 1176183635 * itemDefinition.combineInfo >= 0) {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 1176183635 * itemDefinition.combineInfo;
		} else {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = i_1_;
		}
	}

	static final void method3549(ScriptExecutionContext class613) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		class226.aString2473 = (String) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
	}

	static final void method3545(ScriptExecutionContext class613) {
		int i_0_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = i_0_ >> 14 & 0x3fff;
	}

	static final void method3761(ScriptExecutionContext class613) {
		if (Client.aString10890 != null) {
			class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = Class452
					.filterName(Client.aString10890);
		} else {
			class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = "";
		}
	}

	static final void method3838(Widget class226, Interface class221, ScriptExecutionContext class613,
			Class227 class227) {
		int i_24_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		switch (class227.anInt2565 * 687529979) {
			case 0:
				class226.aString2530 = ItemDefinition.aClass192_8339.method3806(i_24_).method3930();
				break;
			case 1:
				if (null != Class551.friendsChat && i_24_ < Class551.friendsChat.length) {
					class226.aString2530 = Class551.friendsChat[i_24_].aString1017;
				}
				break;
			case 2:
			case 4:
				class226.aString2530 = class613.aClass480_Sub33_7935.aClass283Array10233[i_24_].aString3165;
				break;
			case 5:
				if (Client.anInt10892 * -2028985543 == 2 && i_24_ < Client.friendCount * -1763746795) {
					class226.aString2530 = Client.friends[i_24_].name;
				} else {
					return;
				}
				break;
			default:
				throw new IllegalStateException();
			case 3:
				class226.aString2530 = ((Class182) ItemDefinition.aClass192_8339.method3765().get(i_24_)).method3562();
		}
		class226.aClass227_2531 = class227;
	}

	static final void method522(ScriptExecutionContext class613) {
		class613.anInt7924 -= -2049596966;
		int i_3_ = class613.anIntArray7942[1841827045 * class613.anInt7924];
		int i_4_ = class613.anIntArray7942[1 + 1841827045 * class613.anInt7924];
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = DefaultProvidingVarpLoader
				.method13931(i_3_, i_4_, true, -2129011502);
	}

	static final void method3942(ScriptExecutionContext class613) {
		class613.anInt7924 -= -2049596966;
		int i_0_ = class613.anIntArray7942[class613.anInt7924 * 1841827045];
		boolean bool = 1 == class613.anIntArray7942[1841827045 * class613.anInt7924 + 1];
		if (0 == i_0_) {
			Class495_Sub1.aBool10340 = bool;
		} else if (1 == i_0_) {
			Class495_Sub1.aBool10341 = bool;
		} else if (2 == i_0_) {
			Class495_Sub1.aBool10342 = bool;
		} else {
			throw new RuntimeException();
		}
	}

	static final void method3941(ScriptExecutionContext class613) {
		String string = (String) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
		if (string.startsWith(Class290_Sub1.crown(0)) || string.startsWith(Class290_Sub1.crown(1))) {
			string = string.substring(7);
		}
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Client.isFriend(string) ? 1 : 0;
	}

	static final void method3969(ScriptExecutionContext class613) {
		class613.anInt7924 -= -926911801;
		int i_0_ = class613.anIntArray7942[1841827045 * class613.anInt7924];
		int i_1_ = class613.anIntArray7942[1841827045 * class613.anInt7924 + 1];
		int i_2_ = class613.anIntArray7942[2 + class613.anInt7924 * 1841827045];
		String string = (String) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
		if (-1 == i_1_) {
			throw new RuntimeException();
		}
		EnumDefinition class675 = EnumDefinition.loader.get(i_1_);
		if (class675.keyType.getId() != i_0_) {
			throw new RuntimeException();
		}
		if (class675.valueType.getId() != CharacterType.S_LOWER.getId()) {
			throw new RuntimeException();
		}
		int[] is = class675.getKeys(string);
		if (i_2_ < 0 || null == is || is.length <= i_2_) {
			throw new RuntimeException();
		}
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = is[i_2_];
	}

	static final void method3993(ScriptExecutionContext class613) {
		PreferenceManager.method1038();
		Class60.method1371();
		Client.aClass460_10760.method7705();
		Client.savePreferences();
		Client.sentPreferences = false;
	}

	static final void method3992(ScriptExecutionContext class613) {
		int i_0_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_0_);
		Interface class221 = Class598.loadedInterfaces[i_0_ >> 16];
		Widget.method7527(class226, class221, true, 0, class613);
	}

	static final void method4009(ScriptExecutionContext class613) {
		Class199.preferences.setValue(Class199.preferences.lighting,
				class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045] == 1 ? 1 : 0);
		PreferenceManager.method744();
		Client.aClass460_10760.method7690().method9709();
		Client.savePreferences();
		Client.sentPreferences = false;
	}

	static final void method4008(ScriptExecutionContext class613) throws ScriptException {
		class613.anInt7924 -= -926911801;
		Class369.aClass261_Sub1_4079.method4815(class613.anIntArray7942[1841827045 * class613.anInt7924],
				class613.anIntArray7942[1 + class613.anInt7924 * 1841827045],
				class613.anIntArray7942[2 + class613.anInt7924 * 1841827045], -2005117359);
	}

	static final void method4038(ScriptExecutionContext class613) {
		class613.anInt7924 -= -2049596966;
		int i_0_ = class613.anIntArray7942[1841827045 * class613.anInt7924];
		int i_1_ = class613.anIntArray7942[1841827045 * class613.anInt7924 + 1];
		Class480_Sub41.method4800(i_0_, new Class480_Sub41(i_1_, 3), null, true);
	}

	static final void method4223(ScriptExecutionContext class613) {
		int i_28_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		int[] is = CachedDefinitionLoader.method13912(i_28_);
		Class627.method13082(is, 0, class613.anIntArray7942, class613.anInt7924 * 1841827045, 3);
		class613.anInt7924 += -926911801;
	}

	static final void method4222(ScriptExecutionContext class613) {
		int i_27_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_27_);
		Interface class221 = Class598.loadedInterfaces[i_27_ >> 16];
		method7005(class226, class221, class613);
	}

	static final void method4326(ScriptExecutionContext class613) {
		class613.anInt7924 -= -2049596966;
		TurnMobCutsceneAction.aClass186_9434.method3617(class613.anIntArray7942[class613.anInt7924 * 1841827045],
				class613.anIntArray7942[1 + 1841827045 * class613.anInt7924]);
	}

	static final void method4327(Widget class226, Interface class221, ScriptExecutionContext class613) {
		String string = (String) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
		int[] is = method9239(string, class613);
		if (is != null) {
			string = string.substring(0, string.length() - 1);
		}
		class226.anObjectArray2496 = Class562_Sub1.method16248(string, class613);
		class226.anIntArray2497 = is;
		class226.aBool2483 = true;
	}

	static final void method4330(ScriptExecutionContext class613) {
		int i_0_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		ItemDefinition itemDefinition = ItemDefinition.loader.get(i_0_);
		if (itemDefinition.combineTemplate * -1261835713 >= 0 && itemDefinition.combineInfo * 1176183635 >= 0) {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 1176183635 * itemDefinition.combineInfo;
		} else {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = i_0_;
		}
	}

	static final void method753(Widget class226, Interface class221, ScriptExecutionContext class613) {
		class226.aBool2416 = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045] == 1;
		Widget.redraw(class226);
	}

	static final void method4358(ScriptExecutionContext class613) {
		String string = "";
		if (null != Class198.aClipboard2096) {
			Transferable transferable = Class198.aClipboard2096.getContents(null);
			if (null != transferable) {
				try {
					string = (String) transferable.getTransferData(DataFlavor.stringFlavor);
					if (string == null) {
						string = "";
					}
				} catch (Exception exception) {
	
				}
			}
		}
		class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = string;
	}

	static final void method4359(Widget class226, Interface class221, ScriptExecutionContext class613) {
		class226.anInt2418 = 1731739231;
		class226.anInt2486 = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045] * 1265546033;
		if (-592186295 * class226.component == -1 && !class221.aBool2278) {
			PulseEvent.method7175(1857819631 * class226.id);
		}
	}

	static final void method4357(ScriptExecutionContext class613) {
		int i_0_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_0_);
		Interface class221 = Class598.loadedInterfaces[i_0_ >> 16];
		method4770(class226, class221, class613);
	}

	static final void method4642(ScriptExecutionContext class613) {
		int i_0_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Class480_Sub31_Sub18 class480_sub31_sub18 = Class436.method7271();
		if (null != class480_sub31_sub18) {
			boolean bool = class480_sub31_sub18.method17861(i_0_ >> 28 & 0x3, i_0_ >> 14 & 0x3fff, i_0_ & 0x3fff,
					Class626.anIntArray8037);
			if (bool) {
				Class650.method13519(Class626.anIntArray8037[1], Class626.anIntArray8037[2]);
			}
		}
	}

	static final void method4644(ScriptExecutionContext class613) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		Interface class221 = class611.aClass221_7913;
		ScriptExecutionContext.method15352(class226, class221, class613);
	}

	static final void method5208(ScriptExecutionContext class613) {
		class613.anIntArray7942[class613.anInt7924 * 1841827045 - 1] = class613.aClass480_Sub33_7935
				.method16073(-1440019299)[class613.anIntArray7942[1841827045 * class613.anInt7924 - 1]];
	}

	static final void method15273(ScriptExecutionContext class613) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		Interface class221 = class611.aClass221_7913;
		MobDefaults.method9578(class226, class221, class613);
	}

	static final void method5260(ScriptExecutionContext class613) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		Interface class221 = class611.aClass221_7913;
		method14027(class226, class221, class613);
	}

	static final void method5261(ScriptExecutionContext class613) {
		class613.anInt7924 -= -926911801;
		int i_4_ = class613.anIntArray7942[1841827045 * class613.anInt7924];
		int i_5_ = class613.anIntArray7942[class613.anInt7924 * 1841827045 + 1];
		int i_6_ = class613.anIntArray7942[2 + 1841827045 * class613.anInt7924];
		if (-1 == i_5_) {
			throw new RuntimeException();
		}
		EnumDefinition class675 = EnumDefinition.loader.get(i_5_);
		if (class675.valueType.getId() != i_4_) {
			throw new RuntimeException();
		}
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = class675.containsValue(Integer
				.valueOf(i_6_)) ? 1 : 0;
	}

	static final void method5262(ScriptExecutionContext class613) {
		Class480_Sub22 class480_sub22 = (Class480_Sub22) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = -61099889
				* class480_sub22.anInt10154;
	}

	static final void method5265(ScriptExecutionContext class613) throws ScriptException {
		class613.anInt7924 -= -2049596966;
		int i_0_ = class613.anIntArray7942[1841827045 * class613.anInt7924];
		int i_1_ = class613.anIntArray7942[1 + class613.anInt7924 * 1841827045];
		Class397 class397 = Class397.create(i_0_, i_0_, i_0_);
		if (class397.x == -1.0F) {
			class397.x = Float.POSITIVE_INFINITY;
		}
		if (class397.y == -1.0F) {
			class397.y = Float.POSITIVE_INFINITY;
		}
		if (class397.z == -1.0F) {
			class397.z = Float.POSITIVE_INFINITY;
		}
		Class369.aClass261_Sub1_4079.method4871(class397);
		Class369.aClass261_Sub1_4079.method4833(i_1_ / 1000.0F);
		class397.cache();
	}

	static final void method5267(ScriptExecutionContext class613) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		Interface class221 = class611.aClass221_7913;
		method911(class226, class221, class613);
	}

	static final void method5266(ScriptExecutionContext class613) {
		int i_2_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_2_);
		Interface class221 = Class598.loadedInterfaces[i_2_ >> 16];
		method5906(class226, class221, class613);
	}

	static final void method5269(ScriptExecutionContext class613) {
		class613.anInt7924 -= -2049596966;
		int i_3_ = class613.anIntArray7942[1841827045 * class613.anInt7924];
		int i_4_ = class613.anIntArray7942[1841827045 * class613.anInt7924 + 1];
		class613.aClass357_7946.anIntArray3818[i_3_] = i_4_;
	}

	static final void method7088(ScriptExecutionContext class613) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		Interface class221 = class611.aClass221_7913;
		method731(class226, class221, class613);
	}

	static final void method7090(ScriptExecutionContext class613) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		ScriptExecutionContext.method2233(class226, class613);
	}

	static final void method7089(ScriptExecutionContext class613) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		Interface class221 = class611.aClass221_7913;
		method4798(class226, class221, class613);
	}

	static final void method7087(ScriptExecutionContext class613) {
		int i_2_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_2_);
		Interface class221 = Class598.loadedInterfaces[i_2_ >> 16];
		Class458.method7542(class226, class221, class613);
	}

	static final void method7276(Widget class226, Interface class221, ScriptExecutionContext class613) {
		String string = (String) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
		if (method9239(string, class613) != null) {
			string = string.substring(0, string.length() - 1);
		}
		class226.anObjectArray2491 = Class562_Sub1.method16248(string, class613);
		class226.aBool2483 = true;
	}

	static final void method6097(ScriptExecutionContext class613) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = class226.spriteRoll
				* -1831978227;
	}

	static final void method6095(ScriptExecutionContext class613) {
		Class437.method7274(0, 0, 688089097 * Client.aClass226_10798.width,
				Client.aClass226_10798.height * 1362321717, false);
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 101040205 * Client.anInt10888;
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Client.anInt10889 * -1154672011;
	}

	static final void method6094(ScriptExecutionContext class613) {
		int i_19_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = ThemeMusicVolumeNormaliser.aClass10_2062
				.get(i_19_).getMessage();
	}

	static void method7353(ScriptExecutionContext class613) {
		class613.anIntArray7942[1841827045 * class613.anInt7924 - 2] = QuestDefinition.loader.get(
				class613.anIntArray7942[1841827045 * class613.anInt7924 - 2]).method4386(
				PlayerVariableProvider.instance, class613.anIntArray7942[1841827045 * class613.anInt7924 - 1]) ? 1 : 0;
		class613.anInt7924 -= 1122685165;
	}

	static final void method7352(ScriptExecutionContext class613) {
		class613.anInt7924 -= -926911801;
		int i_0_ = class613.anIntArray7942[class613.anInt7924 * 1841827045];
		int i_1_ = class613.anIntArray7942[1 + class613.anInt7924 * 1841827045];
		int id = class613.anIntArray7942[2 + 1841827045 * class613.anInt7924];
		Widget widget = Widget.lookup(id);
		Class62.method1384(widget, i_0_, i_1_);
	}

	static final void method1070(ScriptExecutionContext class613) {
		class613.anInt7924 -= -2049596966;
		int i_2_ = class613.anIntArray7942[class613.anInt7924 * 1841827045];
		int i_3_ = class613.anIntArray7942[1 + class613.anInt7924 * 1841827045];
		if (i_2_ == 0) {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
		} else {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = (int) Math.pow(i_2_, i_3_);
		}
	}

	static final void method1069(Widget class226, Interface class221, ScriptExecutionContext class613) {
		class226.anInt2425 = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045] * 1380050589;
		Widget.redraw(class226);
	}

	static final void method1068(ScriptExecutionContext class613) {
		int i_1_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_1_);
		Interface class221 = Class598.loadedInterfaces[i_1_ >> 16];
		method7011(class226, class221, class613);
	}

	static final void method7415(ScriptExecutionContext class613) {
		Class562_Sub1 class562_sub1 = Class628.method13097(-1450126971);
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = null == class562_sub1 ? 0
				: -1833179177 * class562_sub1.anInt7554;
	}

	static final void method7416(ScriptExecutionContext class613) {
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = -1343037161
				* AsynchronousStreamRequest.anInt4532 + Class495.anInt6849;
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Class495.anInt6823
				+ ClanChannelUpdater.anInt3185 * -1266662223;
	}

	static final void method15406(ScriptExecutionContext class613) {
		class613.anInt7924 -= -926911801;
		int i_3_ = class613.anIntArray7942[class613.anInt7924 * 1841827045];
		int i_4_ = class613.anIntArray7942[1841827045 * class613.anInt7924 + 1];
		ConnectionInfo.method13843(4, i_3_, i_4_, "");
	}

	static final void method3983(Widget class226, Interface class221, ScriptExecutionContext class613) {
		class613.anInt7924 -= -926911801;
		int i_2_ = class613.anIntArray7942[1841827045 * class613.anInt7924];
		short i_3_ = (short) class613.anIntArray7942[class613.anInt7924 * 1841827045 + 1];
		short i_4_ = (short) class613.anIntArray7942[1841827045 * class613.anInt7924 + 2];
		if (i_2_ >= 0 && i_2_ < 5) {
			class226.method4243(i_2_, i_3_, i_4_);
			Widget.redraw(class226);
			if (-1 == -592186295 * class226.component && !class221.aBool2278) {
				PulseEvent.method15134(1857819631 * class226.id, i_2_);
			}
		}
	}

	static final void method3982(ScriptExecutionContext class613) {
		int i_1_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_1_);
		class226.anInt2465 = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045] * 1912613655;
	}

	static final void method2333(ScriptExecutionContext class613) {
		int i_131_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_131_);
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = class226.spritePitch
				* -322294683;
	}

	static final void method2335(ScriptExecutionContext class613) {
		int i_133_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Class650.method13519(i_133_ >> 14 & 0x3fff, i_133_ & 0x3fff);
	}

	static final void method14191(ScriptExecutionContext class613) {
		int i_74_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.water
				.compatible(i_74_);
	}

	static final void method14253(ScriptExecutionContext class613) {
		MenuOption class480_sub31_sub17 = Class63.method1482();
		if (LoadingRequirementType.method594(class480_sub31_sub17, -30585040) == 4) {
			LinkableObject class480_sub25 = Client.npcs.get(class480_sub31_sub17.getPrimary());
			if (class480_sub25 != null) {
				class613.aClass600_Sub1_Sub3_Sub1_7936 = (Mob) class480_sub25.object;
				class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 1;
				return;
			}
		}
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
	}

	static final void method1565(ScriptExecutionContext class613) {
		int i_0_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.particles
				.compatible(i_0_);
	}

	static final void method1566(ScriptExecutionContext class613) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		Interface class221 = class611.aClass221_7913;
		method6978(class226, class221, class613, -519590925);
	}

	static final void method1573(Widget class226, Interface class221, ScriptExecutionContext class613) {
		String string = (String) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
		if (method9239(string, class613) != null) {
			string = string.substring(0, string.length() - 1);
		}
		class226.anObjectArray2518 = Class562_Sub1.method16248(string, class613);
		class226.aBool2483 = true;
	}

	static final void method1151(ScriptExecutionContext class613) {
		class613.anInt7929 -= 225161503;
		Class63.method1484((String) class613.anObjectArray7918[211787933 * class613.anInt7929],
				(String) class613.anObjectArray7918[211787933 * class613.anInt7929 + 1],
				(String) class613.anObjectArray7918[211787933 * class613.anInt7929 + 2],
				class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045] == 1, true, -154337559);
	}

	static final void method1148(ScriptExecutionContext class613) {
		if (Class16.aShortArray282 == null || 2091568149 * Class280.anInt3154 >= Class357.anInt3819 * -1937034147) {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = -1;
		} else {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Class16.aShortArray282[(Class280.anInt3154 += -924015811) * 2091568149 - 1] & 0xffff;
		}
	}

	static final void method1147(ScriptExecutionContext class613) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		Interface class221 = class611.aClass221_7913;
		ScriptExecutionContext.method4600(class226, class221, class613);
	}

	static final void method1146(Widget class226, Interface class221, ScriptExecutionContext class613) {
		int i_0_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		class226.item = 702084843;
		if (-370763243 * class226.anInt2409 != i_0_) {
			class226.anInt2409 = i_0_ * -470325955;
			Widget.redraw(class226);
		}
	
		if (-592186295 * class226.component == -1 && !class221.aBool2278) {
			PulseEvent.method2856(1857819631 * class226.id);
		}
	}

	static final void method16382(ScriptExecutionContext script) {
		int id = script.anIntArray7942[(script.anInt7924 -= 1122685165) * 1841827045];
		String string = (String) script.anObjectArray7918[(script.anInt7929 -= -1356601931) * 211787933];
		if (id == -1) {
			throw new RuntimeException();
		}
	
		EnumDefinition definition = EnumDefinition.loader.get(id);
		if (CharacterType.S_LOWER != definition.valueType) {
			throw new RuntimeException();
		}
	
		int[] keys = definition.getKeys(string);
		int count = 0;
		if (keys != null) {
			count = keys.length;
		}
	
		script.anIntArray7942[(script.anInt7924 += 1122685165) * 1841827045 - 1] = count;
	}

	static final void method2233(Widget class226, ScriptExecutionContext class613) {
		int i_75_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		int i_76_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045] - 1;
		int i_77_ = i_76_;
		if (286135323 * class226.anInt2418 != 6 && 2 != class226.anInt2418 * 286135323) {
			throw new RuntimeException("");
		}
		NpcDefinition npcDefinition = NpcDefinition.loader.get(-643054127 * class226.anInt2486);
		if (class226.aClass267_2361 == null) {
			class226.aClass267_2361 = new Class267(npcDefinition, 286135323 * class226.anInt2418 == 6);
		}
		class226.aClass267_2361.aLong2977 = Class36.method992() * 359135170314717883L;
		if (npcDefinition.aByteArray3028 != null) {
			if (i_76_ < 0 || i_76_ >= npcDefinition.aByteArray3028.length) {
				throw new RuntimeException("");
			}
			i_77_ = npcDefinition.aByteArray3028[i_76_];
		}
		if (null == npcDefinition.replacementTextures || i_77_ < 0 || i_77_ >= npcDefinition.replacementTextures.length) {
			throw new RuntimeException("");
		}
		class226.aClass267_2361.textures[i_77_] = (short) i_75_;
		Widget.redraw(class226);
	}

	static final void method2231(ScriptExecutionContext class613) {
		Class199.preferences.setValue(Class199.preferences.idleAnimations,
				class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045]);
		Client.savePreferences();
	}

	static final void method2230(ScriptExecutionContext class613) {
		boolean bool = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045] != 0;
		int i_74_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = Client.formatLong(i_74_, 0,
				bool, Client.currentLanguage);
	}

	static final void method2228(ScriptExecutionContext class613) {
		int i_73_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_73_);
		class226.anInt2391 = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045] * 1873131179;
		Widget.redraw(class226);
	}

	static final void method10042(ScriptExecutionContext class613) {
		int i_0_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_0_);
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 923665021 * class226.colour;
	}

	static final void method10046(ScriptExecutionContext class613) {
		int i_3_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		String string = (String) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
		if (8 != Client.gameState * -1501875989 || Class628.method13100()) {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
		} else {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Class606.method10251(i_3_,
					string) ? 1 : 0;
		}
	}

	static final void method10159(ScriptExecutionContext class613) {
		class613.anInt7929 -= -1356601931;
		class613.anInt7924 -= -926911801;
		String string = (String) class613.anObjectArray7918[211787933 * class613.anInt7929];
		boolean bool = class613.anIntArray7942[class613.anInt7924 * 1841827045] == 1;
		boolean bool_0_ = 1 == class613.anIntArray7942[class613.anInt7924 * 1841827045 + 1];
		boolean bool_1_ = 1 == class613.anIntArray7942[2 + 1841827045 * class613.anInt7924];
		OutgoingFrame class480_sub15 = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_4026,
				Client.lobbyConnection.encryptor);
		class480_sub15.payload.writeShort(Buffer.encodedStringLength(string) + 1);
		class480_sub15.payload.writeCString(string);
		int i_2_ = 0;
		if (bool) {
			i_2_ |= 0x1;
		}
		if (bool_0_) {
			i_2_ |= 0x2;
		}
		if (bool_1_) {
			i_2_ |= 0x4;
		}
		class480_sub15.payload.writeByte(i_2_);
		Client.lobbyConnection.sendFrame(class480_sub15);
	}

	static final void method10160(ScriptExecutionContext class613) {
		String string = (String) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
		CalendarUtils.method524(string);
	}

	static void method8725(ScriptExecutionContext class613) {
		String string = (String) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
		TwitchWebcamDevice twitchwebcamdevice = TwitchWebcamDevice.method1368(string, -1698868275);
		if (twitchwebcamdevice == null) {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = -1;
			class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = "";
			class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = "";
		} else {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = twitchwebcamdevice.anInt924
					* -1008356979;
			class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = twitchwebcamdevice.aString922;
			class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = twitchwebcamdevice.aString923;
		}
	}

	static final void method8723(ScriptExecutionContext class613) {
		class613.anInt7924 -= -1853823602;
		int i_25_ = class613.anIntArray7942[1841827045 * class613.anInt7924];
		if (i_25_ >= 2) {
			throw new RuntimeException();
		}
		Client.anInt10620 = i_25_ * -1980304975;
		int i_26_ = class613.anIntArray7942[1 + 1841827045 * class613.anInt7924];
		if (i_26_ + 1 >= Client.anIntArrayArrayArray10720[-1583827119 * Client.anInt10620].length >> 1) {
			throw new RuntimeException();
		}
		Client.anInt10723 = 504536301 * i_26_;
		Client.anInt10725 = 0;
		Client.anInt10726 = 163092319 * class613.anIntArray7942[2 + 1841827045 * class613.anInt7924];
		Client.anInt10727 = class613.anIntArray7942[3 + 1841827045 * class613.anInt7924] * -944542531;
		int i_27_ = class613.anIntArray7942[4 + class613.anInt7924 * 1841827045];
		if (i_27_ >= 2) {
			throw new RuntimeException();
		}
		Client.anInt10722 = i_27_ * 1338730263;
		int i_28_ = class613.anIntArray7942[class613.anInt7924 * 1841827045 + 5];
		if (i_28_ + 1 >= Client.anIntArrayArrayArray10720[-2113519449 * Client.anInt10722].length >> 1) {
			throw new RuntimeException();
		}
		Client.anInt10724 = i_28_ * -349968753;
		Connection.anInt7170 = 442919637;
		TurnMobCutsceneAction.anInt9433 = -1490979241;
		Class156.anInt1886 = -1672889529;
	}

	static final void method8722(ScriptExecutionContext class613) {
		int i_24_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_24_);
		Interface class221 = Class598.loadedInterfaces[i_24_ >> 16];
		method4359(class226, class221, class613);
	}

	static final void method10322(ScriptExecutionContext class613) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 923665021 * class226.colour;
	}

	static final void method16729(ScriptExecutionContext class613) {
		String string;
		if (null != Client.localPlayer && null != Client.localPlayer.displayName) {
			string = Client.localPlayer.formattedName(true);
		} else {
			string = "";
		}
		class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = string;
	}

	static final void method15198(ScriptExecutionContext class613) {
		if (Class417.aClass480_Sub33_4650 != null) {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 1;
			class613.aClass480_Sub33_7935 = Class417.aClass480_Sub33_4650;
		} else {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
		}
	}

	static final void method15313(ScriptExecutionContext class613) {
		class613.anInt7924 -= -2049596966;
		int i_21_ = class613.anIntArray7942[class613.anInt7924 * 1841827045];
		int i_22_ = class613.anIntArray7942[1841827045 * class613.anInt7924 + 1];
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Class480_Sub1.method2172(i_21_,
				i_22_, true);
	}

	static final void method15352(Widget class226, Interface class221, ScriptExecutionContext class613) {
		class613.anInt7924 -= -926911801;
		class226.anInt2546 = class613.anIntArray7942[class613.anInt7924 * 1841827045] * -61633803;
		class226.anInt2458 = class613.anIntArray7942[1841827045 * class613.anInt7924 + 1] * 557492527;
		class226.anInt2456 = class613.anIntArray7942[1841827045 * class613.anInt7924 + 2] * -522822693;
		Widget.redraw(class226);
	}

	static final void method15351(ScriptExecutionContext class613) {
		int i_9_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_9_);
		Interface class221 = Class598.loadedInterfaces[i_9_ >> 16];
		method3327(class226, class221, class613);
	}

	static final void method5418(ScriptExecutionContext class613) {
		int i_3_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Class480_Sub31_Sub18 class480_sub31_sub18 = Class436.method7271();
		if (null != class480_sub31_sub18) {
			boolean bool = class480_sub31_sub18.method17861(i_3_ >> 28 & 0x3, i_3_ >> 14 & 0x3fff, i_3_ & 0x3fff,
					Class626.anIntArray8037);
			if (bool) {
				BaseMapSceneDefinitionProvider.method745(Class626.anIntArray8037[1], Class626.anIntArray8037[2]);
			}
		}
	}

	static final void method5301(ScriptExecutionContext class613) {
		int i_6_ = 0;
		int i_7_ = 0;
		for (ArchiveResourceProvider element : Archive.providers) {
			if (null != element && element.method15370()) {
				i_6_ += element.entryCount();
				i_7_ += element.extrasCount();
			}
		}
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = i_6_ == 0 ? 0 : 100 * i_7_
				/ i_6_;
	}

	static final void method5300(ScriptExecutionContext class613) throws ScriptException {
		int i_5_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Class369.aClass261_Sub1_4079.method4903(Class626.method13054(i_5_), true);
		Client.aBool10611 = true;
	}

	static final void method8543(ScriptExecutionContext class613) {
		String string = (String) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
		class613.anInt7924 -= -2049596966;
		int i_33_ = class613.anIntArray7942[class613.anInt7924 * 1841827045];
		int i_34_ = class613.anIntArray7942[1841827045 * class613.anInt7924 + 1];
		class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = string
				.substring(i_33_, i_34_);
	}

	static final void method8544(ScriptExecutionContext class613) {
		if (Client.supportsFullScreen && Client.fullScreenFrame != null) {
			Class254.method4740(Class199.preferences.screenSize.getValue(), -1, -1, false);
		}
		if (Class255.method4749() == Class465.aClass465_5274) {
			Class536.method9176();
			System.exit(0);
		} else {
			Class40.method1033();
		}
	}

	static final void method8704(ScriptExecutionContext class613) {
		int i_2_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_2_);
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = class226.spriteOffsetX * 2134977475;
	}

	static final void method8703(ScriptExecutionContext class613) {
		int i_1_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		EnumDefinition class675 = EnumDefinition.loader.get(i_1_);
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = class675.getSize();
	}

	static final void method8702(ScriptExecutionContext class613) {
		int i_0_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_0_);
		Interface class221 = Class598.loadedInterfaces[i_0_ >> 16];
		ScriptExecutionContext.method9925(class226, class221, class613);
	}

	static final void method8698(ScriptExecutionContext class613) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		Interface class221 = class611.aClass221_7913;
		Widget.method7527(class226, class221, true, 2, class613);
	}

	static final void method8699(ScriptExecutionContext class613) {
		class613.anInt7924 -= -2049596966;
		int i_6_ = class613.anIntArray7942[1841827045 * class613.anInt7924];
		int i_7_ = class613.anIntArray7942[class613.anInt7924 * 1841827045 + 1];
		ConnectionInfo.method13843(1, i_6_, i_7_, "");
	}

	static final void method8727(ScriptExecutionContext class613) {
		int i_0_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_0_);
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = -5030949 * class226.anInt2406;
	}

	static final void method8728(ScriptExecutionContext class613) {
		String string = (String) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
		if (string.startsWith(Class290_Sub1.crown(0)) || string.startsWith(Class290_Sub1.crown(1))) {
			string = string.substring(7);
		}
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = BefriendedPlayer.indexOf(string);
	}

	static final void method8739(ScriptExecutionContext class613) {
		int i_9_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_9_);
		Interface class221 = Class598.loadedInterfaces[i_9_ >> 16];
		Widget.method7527(class226, class221, true, 1, class613);
	}

	static final void method1138(Widget class226, Interface class221, ScriptExecutionContext class613) {
		String string = (String) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
		if (method9239(string, class613) != null) {
			string = string.substring(0, string.length() - 1);
		}
		class226.anObjectArray2515 = Class562_Sub1.method16248(string, class613);
		class226.aBool2483 = true;
	}

	static final void method8956(ScriptExecutionContext class613) {
		String string = (String) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
		class613.anInt7924 -= -926911801;
		int i_26_ = class613.anIntArray7942[class613.anInt7924 * 1841827045];
		int id = class613.anIntArray7942[1841827045 * class613.anInt7924 + 1];
		int i_28_ = class613.anIntArray7942[class613.anInt7924 * 1841827045 + 2];
		FontSpecification specification = FontSpecification.create(Class80.fonts, id, 0);
		String string_2 = specification.getSplitLine(string, i_26_, WeakReferenceTable.nameIcons, i_28_);
		class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = string_2 != null ? string_2
				: "";
	}

	static void method8953(ScriptExecutionContext class613) {
		class613.anInt7929 -= 1581763434;
		String string = (String) class613.anObjectArray7918[211787933 * class613.anInt7929];
		String string_5_ = (String) class613.anObjectArray7918[1 + class613.anInt7929 * 211787933];
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Class403.twitchLogin(string,
				string_5_);
	}

	static final void method8952(ScriptExecutionContext class613) {
		int i_3_ = class613.anIntArray7943[1523704279 * class613.counter];
		int i_4_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		if (i_4_ < 0 || i_4_ >= class613.anIntArray7930[i_3_]) {
			throw new RuntimeException();
		}
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = class613.anIntArrayArray7922[i_3_][i_4_];
	}

	static final void method8987(ScriptExecutionContext class613) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		Interface class221 = class611.aClass221_7913;
		method3983(class226, class221, class613);
	}

	static final void method9018(ScriptExecutionContext class613) {
		class613.anInt7924 -= -926911801;
		int i_0_ = class613.anIntArray7942[class613.anInt7924 * 1841827045];
		int i_1_ = class613.anIntArray7942[1 + 1841827045 * class613.anInt7924];
		int i_2_ = class613.anIntArray7942[1841827045 * class613.anInt7924 + 2];
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = class613.aClass288_7941
				.method5307(i_0_, i_1_, i_2_);
	}

	static final void method1164(ScriptExecutionContext class613) {
		int i_3_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		if (i_3_ >= 1 && i_3_ <= 2) {
			Class254.method4740(i_3_, -1, -1, false);
		}
	}

	static final void method1163(ScriptExecutionContext class613) {
		boolean bool = true;
		if (Client.aBool10589) {
			try {
				Object object = Class380.aClass380_4219.method6228();
				if (null != object) {
					bool = ((Boolean) object).booleanValue();
				}
			} catch (Throwable throwable) {
	
			}
		}
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = bool ? 1 : 0;
	}

	static final void method1159(Widget class226, Interface class221, ScriptExecutionContext class613) {
		class613.anInt7924 -= 195773364;
		class226.baseWidth = 1719388879 * class613.anIntArray7942[class613.anInt7924 * 1841827045];
		class226.baseHeight = 2033732677 * class613.anIntArray7942[1841827045 * class613.anInt7924 + 1];
		class226.anInt2431 = 0;
		class226.anInt2551 = 0;
	
		int i_0_ = class613.anIntArray7942[class613.anInt7924 * 1841827045 + 2];
		if (i_0_ < 0) {
			i_0_ = 0;
		} else if (i_0_ > 4) {
			i_0_ = 4;
		}
	
		int i_1_ = class613.anIntArray7942[1841827045 * class613.anInt7924 + 3];
		if (i_1_ < 0) {
			i_1_ = 0;
		} else if (i_1_ > 4) {
			i_1_ = 4;
		}
	
		class226.aByte2358 = (byte) i_0_;
		class226.aByte2383 = (byte) i_1_;
		Widget.redraw(class226);
		AsynchronousInputStream.method8775(class221, class226);
	
		if (0 == class226.type * 1558474223) {
			Class548.method9327(class221, class226, false);
		}
	}

	static final void method9023(ScriptExecutionContext class613) {
		class613.anInt7924 -= -2049596966;
		int i_0_ = class613.anIntArray7942[class613.anInt7924 * 1841827045];
		int i_1_ = class613.anIntArray7942[1841827045 * class613.anInt7924 + 1];
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = i_0_ % i_1_;
	}

	static final void method9024(ScriptExecutionContext class613) {
		Class368.method6102(class613.aClass600_Sub1_Sub3_Sub1_7936,
				class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045], true);
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = (int) Client.aFloatArray10736[0];
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = (int) Client.aFloatArray10736[1];
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = (int) Client.aFloatArray10736[2];
	}

	static final void method9299(ScriptExecutionContext class613) {
		class613.anInt7924 -= -2049596966;
		int i_0_ = class613.anIntArray7942[1841827045 * class613.anInt7924];
		int i_1_ = class613.anIntArray7942[1841827045 * class613.anInt7924 + 1] - 1;
		ItemDefinition itemDefinition = ItemDefinition.loader.get(i_0_);
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = itemDefinition.method13594(i_1_);
	}

	static final void method9326(ScriptExecutionContext class613) {
		Class199.preferences.setValue(Class199.preferences.cpu,
				class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045]);
		Client.savePreferences();
	}

	static final void method9325(ScriptExecutionContext class613) {
		int i_0_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_0_);
		Interface class221 = Class598.loadedInterfaces[i_0_ >> 16];
		DequeIterator.method13364(class226, class221, class613);
	}

	static final void method1537(Widget class226, ScriptExecutionContext class613) {
		int i_1_ = 10;
		int i_2_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Class453.method7414(class226, i_1_, i_2_, class613);
	}

	static final void method1536(ScriptExecutionContext class613) {
		int i_0_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Class224 class224 = (Class224) Queue.aClass678_Sub8_8139.get(i_0_);
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = class224.anInt2335 * 42167249;
	}

	static final void method13220(Widget class226, Interface class221, ScriptExecutionContext class613) {
		class226.anInt2418 = -1537936839;
		class226.anInt2486 = -1872598017 * Client.localPlayerIndex;
		class226.anInt2420 = 0;
		if (class226.component * -592186295 == -1 && !class221.aBool2278) {
			PulseEvent.method7175(1857819631 * class226.id);
		}
	}

	static final void method9926(ScriptExecutionContext class613) {
		class613.anInt7924 -= -2049596966;
		int i_3_ = class613.anIntArray7942[1841827045 * class613.anInt7924];
		int i_4_ = class613.anIntArray7942[1 + 1841827045 * class613.anInt7924];
		class613.aClass357_7946.anIntArray3818[i_3_] = i_4_;
	}

	static final void method9925(Widget class226, Interface class221, ScriptExecutionContext class613) {
		String string = (String) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
		if (method9239(string, class613) != null) {
			string = string.substring(0, string.length() - 1);
		}
		class226.anObjectArray2366 = Class562_Sub1.method16248(string, class613);
		class226.aBool2483 = true;
	}

	static final void method9339(ScriptExecutionContext class613) {
		int i_0_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = AnimationDefinition.loader
				.get(i_0_).length * 1337722301;
	}

	static final void method9341(ScriptExecutionContext class613) {
		int i_1_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_1_);
		Interface class221 = Class598.loadedInterfaces[i_1_ >> 16];
		method3838(class226, class221, class613, Class227.aClass227_2566);
	}

	static void method10439(ScriptExecutionContext class613) {
		class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = QuestDefinition.loader
				.get(class613.anIntArray7942[class613.anInt7924 * 1841827045 - 2]).aStringArray2602[class613.anIntArray7942[1841827045 * class613.anInt7924 - 1]];
		class613.anInt7924 -= -2049596966;
	}

	static void method10250(ScriptExecutionContext class613) {
		class613.anInt7924 -= -2049596966;
		int i_2_ = class613.anIntArray7942[class613.anInt7924 * 1841827045];
		int i_3_ = class613.anIntArray7942[class613.anInt7924 * 1841827045 + 1];
		TwitchWebcamDevice twitchwebcamdevice = CachedParticleDefinitionLoader.method5981(i_2_);
		TwitchWebcamDeviceCapability twitchwebcamdevicecapability = null;
		if (twitchwebcamdevice != null) {
			twitchwebcamdevicecapability = twitchwebcamdevice.method1415(i_3_);
		}
		if (null == twitchwebcamdevicecapability) {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = -1;
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = -1;
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = -1;
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = -1;
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = -1;
		} else {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = -892130713
					* twitchwebcamdevicecapability.anInt933;
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = twitchwebcamdevicecapability.anInt934 * 1172125411;
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 189650051 * twitchwebcamdevicecapability.anInt935;
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = twitchwebcamdevicecapability.anInt936 * 1336383845;
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 494968757 * twitchwebcamdevicecapability.anInt937;
		}
	}

	static final void method10249(ScriptExecutionContext class613) {
		if (Class369.aClass261_Sub1_4079.method4836() != Class257.aClass257_2850) {
			throw new RuntimeException();
		}
		((Class642_Sub1) Class369.aClass261_Sub1_4079.method4834()).method16703(
				class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045]);
	}

	static final void method9890(ScriptExecutionContext class613) throws ScriptException {
		class613.anInt7924 -= 195773364;
		int i_2_ = class613.anIntArray7942[class613.anInt7924 * 1841827045];
		int i_3_ = class613.anIntArray7942[1841827045 * class613.anInt7924 + 1];
		int i_4_ = class613.anIntArray7942[1841827045 * class613.anInt7924 + 2];
		Class397 class397 = Class397.create(i_2_, i_3_, i_4_);
		Class369.aClass261_Sub1_4079.method4802(class397);
		class397.cache();
	}

	static final void method9887(ScriptExecutionContext class613) {
		if (18 == Client.gameState * -1501875989) {
			OutgoingFrame class480_sub15 = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_3994,
					Client.lobbyConnection.encryptor);
			Client.lobbyConnection.sendFrame(class480_sub15);
		}
	}

	static final void method9886(ScriptExecutionContext class613) {
		int i_0_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_0_);
		Interface class221 = Class598.loadedInterfaces[i_0_ >> 16];
		Class457.method7535(class226, class221, class613);
	}

	static final void method782(ScriptExecutionContext class613) {
		int i_11_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Class480_Sub31_Sub18 class480_sub31_sub18 = Class436.method7271();
		if (null != class480_sub31_sub18) {
			boolean bool = class480_sub31_sub18.method17867(i_11_ >> 14 & 0x3fff, i_11_ & 0x3fff,
					Class626.anIntArray8037, 210884310);
			if (bool) {
				class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Class626.anIntArray8037[1];
				class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Class626.anIntArray8037[2];
			} else {
				class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = -1;
				class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = -1;
			}
		} else {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = -1;
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = -1;
		}
	}

	static final void method16371(ScriptExecutionContext class613, int i) {
		class613.anInt7924 -= -2049596966;
		int i_3_ = class613.anIntArray7942[class613.anInt7924 * 1841827045];
		int i_4_ = class613.anIntArray7942[class613.anInt7924 * 1841827045 + 1];
		Class480_Sub31_Sub13 class480_sub31_sub13 = BefriendedPlayer.method1101(i_3_, i_4_);
		if (class480_sub31_sub13 != null) {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = class480_sub31_sub13.anInt11382
					* -482365547;
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = class480_sub31_sub13.anInt11373 * 1645966401;
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = class480_sub31_sub13.anInt11376
					* -1639949421;
			class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = null != class480_sub31_sub13.aString11377 ? class480_sub31_sub13.aString11377
					: "";
			class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = class480_sub31_sub13.aString11378 != null ? class480_sub31_sub13.aString11378
					: "";
			class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = class480_sub31_sub13.aString11379 != null ? class480_sub31_sub13.aString11379
					: "";
			class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = class480_sub31_sub13.aString11380 != null ? class480_sub31_sub13.aString11380
					: "";
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = class480_sub31_sub13.anInt11381 * 78704391;
			class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = null != class480_sub31_sub13.aString11383 ? class480_sub31_sub13.aString11383
					: "";
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = class480_sub31_sub13.aClass351_11374 != null ? class480_sub31_sub13.aClass351_11374
					.getId() : -1;
		} else {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = -1;
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
			class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = "";
			class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = "";
			class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = "";
			class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = "";
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
			class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = "";
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = -1;
		}
	}

	static final void method4600(Widget class226, Interface class221, ScriptExecutionContext class613) {
		String string = (String) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
		if (method9239(string, class613) != null) {
			string = string.substring(0, string.length() - 1);
		}
		class226.anObjectArray2490 = Class562_Sub1.method16248(string, class613);
		class226.aBool2483 = true;
	}

}