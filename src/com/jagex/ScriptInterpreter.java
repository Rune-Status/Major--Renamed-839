package com.jagex;

import com.jagex.twitch.TwitchTV;
import com.jagex.twitch.TwitchWebcamDevice;

public class ScriptInterpreter {

	static final void executeInstruction(ScriptInstruction instruction, ScriptExecutionContext context)
			throws ScriptException, VarbitException {
		switch (instruction.opcode * 1521341811) {
			case 286:
				int i_0_28 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				if (i_0_28 != Class199.preferences.skyboxes.getValue()) {
					Class199.preferences.setValue(Class199.preferences.skyboxes, i_0_28);
					Client.savePreferences();
					Client.sentPreferences = false;
				}
				break;
			case 1145:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.flickeringEffects
						.getValue() == 1 ? 1 : 0;
				break;
			case 4:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.orthoMode
						.supported() ? 1 : 0;
				break;
			case 962:
				int i_0_29 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class226113 = Widget.lookup(i_0_29);
				Interface class22160 = Class598.loadedInterfaces[i_0_29 >> 16];
				class226113.anInt2418 = -1025291226;
				class226113.aClass267_2361 = null;
				class226113.anInt2486 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045] * 1265546033;
				if (-592186295 * class226113.component == -1 && !class22160.aBool2278) {
					PulseEvent.method7175(1857819631 * class226113.id);
				}
				break;
			case 393:
				int i_2_29 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.fog
						.compatible(i_2_29);
				break;
			case 1172:
				context.anInt7929 -= 1581763434;
				String string39 = (String) context.anObjectArray7918[context.anInt7929 * 211787933];
				String string_2_1 = (String) context.anObjectArray7918[context.anInt7929 * 211787933 + 1];
				Class250.method4708(string39, string_2_1);
				break;
			case 206:
				Class480_Sub31_Sub18 class480_sub31_sub184 = Class436.method7271();
				if (null != class480_sub31_sub184) {
					boolean bool8 = class480_sub31_sub184.method17867(Class495.anInt6849
							+ AsynchronousStreamRequest.anInt4532 * -1343037161, ClanChannelUpdater.anInt3185
							* -1266662223 + Class495.anInt6823, Class626.anIntArray8037, 210884310);
					if (bool8) {
						context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class626.anIntArray8037[1];
						context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class626.anIntArray8037[2];
					} else {
						context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = -1;
						context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = -1;
					}
				} else {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = -1;
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = -1;
				}
				break;
			case 563:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
				break;
			case 263:
				int i_1_33 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class226114 = Widget.lookup(i_1_33);
				Interface class22161 = Class598.loadedInterfaces[i_1_33 >> 16];
				ScriptExecutionContext.method3491(class226114, class22161, context);
				break;
			case 521:
				Class611 class61159 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class226115 = class61159.aClass226_7914;
				context.anInt7924 -= -2049596966;
				class226115.anInt2554 = context.anIntArray7942[1841827045 * context.anInt7924] * -87869317;
				class226115.anInt2428 = 1722970625 * context.anIntArray7942[1 + 1841827045 * context.anInt7924];
				Widget.redraw(class226115);
				break;
			case 1074:
				int i_32_ = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Client.ignoredPlayers[i_32_].aBool667 ? 1
						: 0;
				break;
			case 941:
				context.anInt7924 -= -2049596966;
				int i_10_8 = context.anIntArray7942[1841827045 * context.anInt7924];
				int i_11_7 = context.anIntArray7942[1 + 1841827045 * context.anInt7924];
				if (Client.supportsFullScreen) {
					Class254.method4740(3, i_10_8, i_11_7, false);
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Client.fullScreenFrame != null ? 1
							: 0;
				} else {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
				}
				break;
			case 97:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 100;
				break;
			case 1038:
				int i_0_30 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class226116 = Widget.lookup(i_0_30);
				Interface class22163 = Class598.loadedInterfaces[i_0_30 >> 16];
				ScriptExecutionContext.method731(class226116, class22163, context);
				break;
			case 475:
				Class364.method6081();
				break;
			case 402:
				ScriptExecutionContext.method9316(context);
				break;
			case 928:
				ScriptExecutionContext.method15273(context);
				break;
			case 295:
				Class611 class6114 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class2265 = class6114.aClass226_7914;
				Interface class2213 = class6114.aClass221_7913;
				context.anInt7924 -= -2049596966;
				class2265.anInt2408 = 1526136459 * context.anIntArray7942[context.anInt7924 * 1841827045];
				class2265.anInt2393 = context.anIntArray7942[1 + context.anInt7924 * 1841827045] * -970300639;
				Widget.redraw(class2265);
				AsynchronousInputStream.method8775(class2213, class2265);
				if (class2265.type * 1558474223 == 0) {
					Class548.method9327(class2213, class2265, false);
				}
				break;
			case 836:
				String string30 = (String) context.anObjectArray7918[(context.anInt7929 -= -1356601931) * 211787933];
				DefaultMapEntry.addChatMessage(string30);
				break;
			case 793:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class31.anInt388 * 2117820839;
				break;
			case 620:
				context.anInt7924 -= -2049596966;
				int i_0_ = context.anIntArray7942[1841827045 * context.anInt7924];
				int i_1_ = context.anIntArray7942[1 + context.anInt7924 * 1841827045];
				if (-1 == i_1_) {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = -1;
				} else {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = AnimateObjectCutsceneAction.aClass420_9538
							.get(i_0_).getMessage((char) i_1_);
				}
				break;
			case 177:
				ScriptExecutionContext.method8778(context);
				break;
			case 71:
				OutgoingFrame frame1 = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_4016,
						Client.gameConnection.encryptor);
				Client.gameConnection.sendFrame(frame1);
				break;
			case 1002:
				if (Class193.keyRecorder.held(86)) {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 1;
				} else {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
				}
				break;
			case 1107:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.musicVolume
						.getValue();
				break;
			case 863:
				context.anInt7924 -= -2049596966;
				if (context.anIntArray7942[context.anInt7924 * 1841827045] == context.anIntArray7942[context.anInt7924 * 1841827045 + 1]) {
					context.counter += -160194073 * context.anIntArray7943[1523704279 * context.counter];
				}
				break;
			case 1009:
				int i_5_ = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class2264 = Widget.lookup(i_5_);
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 731337999 * class2264.scrollWidth;
				break;
			case 89:
				if (-2028985543 * Client.anInt10892 == 0) {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = -2;
				} else if (1 == -2028985543 * Client.anInt10892) {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = -1;
				} else {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Client.friendCount
							* -1763746795;
				}
				break;
			case 911:
				Class50.method1128(context);
				break;
			case 739:
				int i_4_18 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class226130 = Widget.lookup(i_4_18);
				class226130.anInt2432 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045]
						* -1184204525;
				Widget.redraw(class226130);
				break;
			case 900:
				int i_0_41 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				ConfigEntry.method1004(i_0_41);
				break;
			case 345:
				Class410.method6948(context);
				break;
			case 766:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class495.method15087();
				break;
			case 289:
				int i_3_9 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class22636 = Widget.lookup(i_3_9);
				class22636.aBool2415 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045] == 1;
				Widget.redraw(class22636);
				break;
			case 1092:
				int i_1_36 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class226121 = Widget.lookup(i_1_36);
				Interface class22167 = Class598.loadedInterfaces[i_1_36 >> 16];
				ScriptExecutionContext.method1683(class226121, class22167, context);
				break;
			case 987:
				ScriptExecutionContext.method7371(context);
				break;
			case 942:
				ContainerHeader.method7114(context);
				break;
			case 57:
				ScriptExecutionContext.method2258(context);
				break;
			case 283:
				ScriptExecutionContext.method10198(context);
				break;
			case 638:
				context.anInt7924 -= -2049596966;
				int i_8_2 = context.anIntArray7942[context.anInt7924 * 1841827045];
				int i_9_2 = context.anIntArray7942[1 + 1841827045 * context.anInt7924];
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = i_9_2 + i_8_2;
				break;
			case 371:
				int i_3_31 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = WeakReferenceTable.aClass678_Sub12_558
						.get(i_3_31).anInt10934 * 2138482635;
				break;
			case 784:
				Class349.method5958(context);
				break;
			case 175:
				ValueType.method7042(context);
				break;
			case 833:
				ScriptExecutionContext.method6019(context);
				break;
			case 82:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = -258861345
						* Class481.recoverySetDate;
				break;
			case 1126:
				Class611 class6112 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class2262 = class6112.aClass226_7914;
				Interface class2211 = class6112.aClass221_7913;
				Class49.method1110(class2262, class2211, context, -232252327);
				break;
			case 114:
				int i_2_14 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				if (!Class60.activeToolkit.method2384()) {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 3;
				} else {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.antiAliasing
							.compatible(i_2_14);
				}
				break;
			case 795:
				context.anInt7924 -= -2049596966;
				int i_2_1 = context.anIntArray7942[1841827045 * context.anInt7924];
				int i_3_ = context.anIntArray7942[1 + 1841827045 * context.anInt7924];
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = i_3_ * i_2_1;
				break;
			case 1118:
				ScriptExecutionContext.method6309(context, 1759744511);
				break;
			case 974:
				int i_1_14 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class22662 = Widget.lookup(i_1_14);
				int i_1_13 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				int i_2_15 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045] - 1;
				if (class22662.anInt2418 * 286135323 != 6) {
					throw new RuntimeException("");
				}
				NpcDefinition npcDefinition = NpcDefinition.loader.get(-643054127 * class22662.anInt2486);
				if (class22662.aClass267_2361 == null) {
					class22662.aClass267_2361 = new Class267(npcDefinition, true);
				}
				class22662.aClass267_2361.aLong2977 = Class36.method992() * 359135170314717883L;
				if (i_2_15 < 0 || i_2_15 >= npcDefinition.models.length) {
					throw new RuntimeException(new StringBuilder().append("").append(i_2_15).toString());
				}
				class22662.aClass267_2361.models[i_2_15] = i_1_13;
				Widget.redraw(class22662);
				break;
			case 186:
				MobDefaults.method9580(context, -1634964836);
				break;
			case 617:
				context.anInt7929 -= 1581763434;
				String string38 = (String) context.anObjectArray7918[211787933 * context.anInt7929];
				String string_6_ = (String) context.anObjectArray7918[211787933 * context.anInt7929 + 1];
				Class419.method6999(string38, string_6_);
				break;
			case 708:
				ScriptExecutionContext.method3723(context, -30301868);
				break;
			case 886:
				ScriptExecutionContext.method8820(context);
				break;
			case 568:
				ScriptExecutionContext.method1068(context);
				break;
			case 989:
				Npc class600_sub1_sub3_sub1_sub2 = (Npc) context.aClass600_Sub1_Sub3_Sub1_7936;
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 2011629825 * class600_sub1_sub3_sub1_sub2.combat;
				break;
			case 1113:
				VariableBitsDefinition.method5470(context);
				break;
			case 245:
				ScriptExecutionContext.method9321(context, 536817328);
				break;
			case 292:
				PriorityQueue.method17940(context, -1793699965);
				break;
			case 1189:
				int i_0_2 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class22617 = Widget.lookup(i_0_2);
				Interface class22113 = Class598.loadedInterfaces[i_0_2 >> 16];
				ScriptExecutionContext.method15099(class22617, class22113, context);
				break;
			case 386:
				ScriptExecutionContext.method5374(context, 1435197818);
				break;
			case 80:
				context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = QuestDefinition.loader
						.get(context.anIntArray7942[1841827045 * context.anInt7924 - 2]).aStringArray2606[context.anIntArray7942[context.anInt7924 * 1841827045 - 1]];
				context.anInt7924 -= -2049596966;
				break;
			case 879:
				ScriptExecutionContext.method8543(context);
				break;
			case 259:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = null != Class495.aClass480_Sub31_Sub18_6808 ? 1943328861 * Class495.aClass480_Sub31_Sub18_6808.anInt11426
						: -1;
				break;
			case 467:
				Class611 class61179 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class226145 = class61179.aClass226_7914;
				Interface class22179 = class61179.aClass221_7913;
				Class600_Sub1_Sub4_Sub1.method18062(class226145, class22179, context, 1758700346);
				break;
			case 250:
				ScriptExecutionContext.method7088(context);
				break;
			case 20:
				context.anInt7924 -= -2049596966;
				break;
			case 821:
				ScriptExecutionContext.method6980(context, -456019114);
				break;
			case 663:
				Class611 class61113 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class22623 = class61113.aClass226_7914;
				Interface class22116 = class61113.aClass221_7913;
				ScriptExecutionContext.method753(class22623, class22116, context);
				break;
			case 192:
				ScriptExecutionContext.method8698(context);
				break;
			case 180:
				int i_102_ = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				int i_103_ = i_102_ >> 16;
				if (Class598.loadedInterfaces[i_103_] == null) {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
				} else {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class598.loadedInterfaces[i_103_].children[i_102_].anInt2375 * 455431873;
				}
				break;
			case 566:
				ScriptExecutionContext.method2859(context);
				break;
			case 362:
				ScriptExecutionContext.method10042(context);
				break;
			case 1198:
				Class31.method908(context, -731083930);
				break;
			case 1063:
				int i_4_21 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = Integer
						.toString(i_4_21);
				break;
			case 84:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = -1425748453 * Class671.anInt8465;
				break;
			case 273:
				ScriptExecutionContext.method4995(context);
				break;
			case 578:
				Class611 class61169 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class226133 = class61169.aClass226_7914;
				context.anInt7924 -= -2049596966;
				int i_1_42 = 10;
				byte[] is5 = { (byte) context.anIntArray7942[context.anInt7924 * 1841827045] };
				byte[] is_2_1 = { (byte) context.anIntArray7942[1 + 1841827045 * context.anInt7924] };
				Class650_Sub1.method16709(class226133, i_1_42, is5, is_2_1, context, 1015648284);
				break;
			case 217:
				ScriptExecutionContext.method4009(context);
				break;
			case 415:
				int i_3_33 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Class224 class2241 = (Class224) Queue.aClass678_Sub8_8139.get(i_3_33);
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = class2241.anInt2299 * 1584610185;
				break;
			case 558:
				int i_12_6 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = ItemDefinition.aClass192_8339
						.method3806(i_12_6).method3884().getId();
				break;
			case 720:
				ScriptExecutionContext.method1093(context, (byte) 7);
				break;
			case 120:
				ScriptExecutionContext.method6022(context);
				break;
			case 822:
				int i_40_ = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class22613 = Widget.lookup(i_40_);
				Interface class2219 = Class598.loadedInterfaces[i_40_ >> 16];
				ScriptExecutionContext.method7276(class22613, class2219, context);
				break;
			case 840:
				ScriptExecutionContext.method5962(context, (byte) -43);
				break;
			case 67:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = null != LinkableObject.aClass126_10169 ? 1
						: 0;
				break;
			case 472:
				context.anInt7924 -= -2049596966;
				int i_5_5 = context.anIntArray7942[1841827045 * context.anInt7924];
				int i_6_7 = context.anIntArray7942[context.anInt7924 * 1841827045 + 1];
				ConnectionInfo.method13843(10, i_5_5, i_6_7, "");
				break;
			case 213:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = TwitchTV
						.requestLiveStreams();
				break;
			case 275:
				ScriptExecutionContext.method8777(context, (byte) 1);
				break;
			case 971:
				ScriptExecutionContext.method3290(context, -2140770332);
				break;
			case 56:
				Class281_Sub1_Sub2.method17498(context, 1989353838);
				break;
			case 296:
				Class611 class61132 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class22661 = class61132.aClass226_7914;
				String string18 = (String) context.anObjectArray7918[(context.anInt7929 -= -1356601931) * 211787933];
				if (ScriptExecutionContext.method9239(string18, context) != null) {
					string18 = string18.substring(0, string18.length() - 1);
				}
				class22661.anObjectArray2523 = Class562_Sub1.method16248(string18, context);
				class22661.aBool2483 = true;
				break;
			case 873:
				ScriptExecutionContext.method5265(context);
				break;
			case 850:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class369.aClass261_Sub1_4079
						.method4837() == null ? -1 : Class369.aClass261_Sub1_4079.method4837().anInt3000 * -221221467;
				break;
			case 604:
				ScriptExecutionContext.method15137(context, -1230698562);
				break;
			case 533:
				int i_3_5 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class22629 = Widget.lookup(i_3_5);
				class22629.aBool2479 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045] == 1;
				Widget.redraw(class22629);
				break;
			case 479:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 1;
				break;
			case 480:
				Class596.method10108(context);
				break;
			case 37:
				ScriptExecutionContext.method14181(context, (byte) 85);
				break;
			case 698:
				ScriptExecutionContext.method8702(context);
				break;
			case 556:
				ScriptExecutionContext.method3747(context, (byte) -9);
				break;
			case 249:
				ScriptExecutionContext.method3190(context, 1260936021);
				break;
			case 1093:
				Class610.method10311(context, 142545813);
				break;
			case 842:
				ScriptExecutionContext.method5399(context, -1459939483);
				break;
			case 255:
				ScriptExecutionContext.method1148(context);
				break;
			case 428:
				int i_3_6 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = ItemDefinition.loader
						.get(i_3_6).value * -1037924515;
				break;
			case 1097:
				Class611 class61122 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class22642 = class61122.aClass226_7914;
				Interface class22122 = class61122.aClass221_7913;
				ScriptExecutionContext.method6284(class22642, class22122, context);
				break;
			case 1185:
				ScriptExecutionContext.method7392(context);
				break;
			case 313:
				Class199.preferences.setValue(Class199.preferences.water,
						context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045] == 1 ? 2 : 0);
				Client.aClass460_10760.method7705();
				Client.savePreferences();
				Client.sentPreferences = false;
				break;
			case 792:
				context.anInt7924 -= -2049596966;
				int i_1_3 = context.anIntArray7942[context.anInt7924 * 1841827045];
				int i_2_2 = context.anIntArray7942[1 + context.anInt7924 * 1841827045];
				ParameterDefinition class33 = ParameterDefinition.loader.get(i_2_2);
				if (class33.isString()) {
					context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = ((Class224) Queue.aClass678_Sub8_8139
							.get(i_1_3)).getParameter(i_2_2, class33.defaultString);
				} else {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = ((Class224) Queue.aClass678_Sub8_8139
							.get(i_1_3)).getParameter(i_2_2, class33.defaultInt * -125275839);
				}
				break;
			case 547:
				Class611 class61166 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class226125 = class61166.aClass226_7914;
				String string43 = (String) context.anObjectArray7918[(context.anInt7929 -= -1356601931) * 211787933];
				if (ScriptExecutionContext.method9239(string43, context) != null) {
					string43 = string43.substring(0, string43.length() - 1);
				}
				class226125.anObjectArray2452 = Class562_Sub1.method16248(string43, context);
				class226125.aBool2483 = true;
				break;
			case 167:
				Class50.method1127(context, 23412633);
				break;
			case 790:
				int i_10_9 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class226139 = Widget.lookup(i_10_9);
				Interface class22174 = Class598.loadedInterfaces[i_10_9 >> 16];
				Class490.method8473(class226139, class22174, context, (byte) -67);
				break;
			case 551:
				int i_2_13 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class22659 = Widget.lookup(i_2_13);
				ScriptExecutionContext.method7000(class22659, context);
				break;
			case 867:
				Class173.method3502(context);
				break;
			case 1012:
				ScriptExecutionContext.method6280(context, context.aClass600_Sub1_Sub3_Sub1_7936);
				break;
			case 63:
				String string17 = (String) context.anObjectArray7918[(context.anInt7929 -= -1356601931) * 211787933];
				BaseMapSceneDefinitionProvider.method746(string17);
				break;
			case 75:
				Class611 class61117 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class22633 = class61117.aClass226_7914;
				String string11 = (String) context.anObjectArray7918[(context.anInt7929 -= -1356601931) * 211787933];
				int[] is2 = ScriptExecutionContext.method9239(string11, context);
				if (null != is2) {
					string11 = string11.substring(0, string11.length() - 1);
				}
				class22633.anObjectArray2502 = Class562_Sub1.method16248(string11, context);
				class22633.anIntArray2503 = is2;
				class22633.aBool2483 = true;
				break;
			case 715:
				ScriptExecutionContext.method16047(context, -437093835);
				break;
			case 61:
				ScriptExecutionContext.method6960(context, (byte) 0);
				break;
			case 1164:
				ScriptExecutionContext.method1635(context);
				break;
			case 1086:
				String string2 = (String) context.anObjectArray7918[(context.anInt7929 -= -1356601931) * 211787933];
				int i_7_ = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Class491.method8480(string2, i_7_ == 1, (byte) 0);
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = -1937034147
						* Class357.anInt3819;
				break;
			case 732:
				context.anInt7924 -= -926911801;
				long l3 = context.anIntArray7942[1841827045 * context.anInt7924];
				long l_4_ = context.anIntArray7942[1 + 1841827045 * context.anInt7924];
				long l_5_ = context.anIntArray7942[1841827045 * context.anInt7924 + 2];
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = (int) (l_5_ * l3 / l_4_);
				break;
			case 953:
				ScriptExecutionContext.method3553(context);
				break;
			case 52:
				context.anInt7924 -= -2049596966;
				int i_0_32 = context.anIntArray7942[context.anInt7924 * 1841827045];
				int i_1_34 = context.anIntArray7942[1841827045 * context.anInt7924 + 1];
				ConnectionInfo.method13843(6, i_0_32, i_1_34, "");
				break;
			case 1011:
				Class611 class6119 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class22614 = class6119.aClass226_7914;
				Interface class22110 = class6119.aClass221_7913;
				Class480_Sub31_Sub13.method17837(class22614, class22110, context);
				break;
			case 775:
				ScriptExecutionContext.method9325(context);
				break;
			case 272:
				ScriptExecutionContext.method1151(context);
				break;
			case 79:
				ScriptExecutionContext.method5262(context);
				break;
			case 1109:
				Class611 class61110 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class22616 = class61110.aClass226_7914;
				Interface class22112 = class61110.aClass221_7913;
				DequeIterator.method13364(class22616, class22112, context);
				break;
			case 683:
				ScriptExecutionContext.method9926(context);
				break;
			case 921:
				TimeUtil.method4150(context);
				break;
			case 752:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = null != Client.localPlayer.appearance
						&& Client.localPlayer.appearance.male ? 1 : 0;
				break;
			case 991:
				ScriptExecutionContext.method4037(context);
				break;
			case 764:
				ScriptExecutionContext.method15483(context);
				break;
			case 536:
				Class491.method8478(context);
				break;
			case 2:
				ScriptExecutionContext.method2230(context);
				break;
			case 592:
				ReflectiveDefinitionProvider.method13898(context);
				break;
			case 622:
				Class611 class61111 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class22618 = class61111.aClass226_7914;
				Interface class22114 = class61111.aClass221_7913;
				Class457.method7535(class22618, class22114, context);
				break;
			case 34:
				int i_0_26 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.maxScreenSize
						.compatible(i_0_26);
				break;
			case 26:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class122.anInt1470 * 1046345539;
				break;
			case 123:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = -125949611
						* ScriptExecutionContext.operationCount;
				break;
			case 1051:
				VoiceOverVolumeNormaliser.method3537();
				break;
			case 765:
				int i_47_ = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class22621 = Widget.lookup(i_47_);
				Interface class22115 = Class598.loadedInterfaces[i_47_ >> 16];
				Class591.method9996(class22621, class22115, context, -58878062);
				break;
			case 293:
				Class471.method8057(context, 817491934);
				break;
			case 1132:
				Class38.method1016(context, -2064910991);
				break;
			case 610:
				AsynchronousOutputStream.method9165(context, -675573393);
				break;
			case 657:
				ScriptExecutionContext.method3329(context, (byte) 99);
				break;
			case 597:
				int i_5_26 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class226152 = Widget.lookup(i_5_26);
				String string47 = (String) context.anObjectArray7918[(context.anInt7929 -= -1356601931) * 211787933];
				if (ScriptExecutionContext.method9239(string47, context) != null) {
					string47 = string47.substring(0, string47.length() - 1);
				}
				class226152.anObjectArray2447 = Class562_Sub1.method16248(string47, context);
				class226152.aBool2483 = true;
				break;
			case 312:
				int i_1_35 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.textures
						.compatible(i_1_35);
				break;
			case 896:
				method12812(context);
				break;
			case 1023:
				TurnMobCutsceneAction.aClass186_9434
						.method3616(context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045]);
				break;
			case 611:
				ScriptExecutionContext.method15080(context);
				break;
			case 1010:
				CutsceneMob.method3385(context);
				break;
			case 856:
				ScriptExecutionContext.method5976(context);
				break;
			case 925:
				ScriptExecutionContext.method1147(context);
				break;
			case 1140:
				ScriptExecutionContext.method7190(context);
				break;
			case 171:
				Class330.method5804(context);
				break;
			case 603:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = LoadingRequirementType
						.method595();
				break;
			case 1137:
				Class457.method7532(context);
				break;
			case 919:
				ScriptExecutionContext.method5372(context);
				break;
			case 664:
				context.anInt7924 -= 195773364;
				int i_13_3 = context.anIntArray7942[1841827045 * context.anInt7924];
				int i_14_2 = context.anIntArray7942[1841827045 * context.anInt7924 + 1];
				int i_15_1 = context.anIntArray7942[context.anInt7924 * 1841827045 + 2];
				int i_16_2 = context.anIntArray7942[context.anInt7924 * 1841827045 + 3];
				Class397 class3974 = Class397.create(i_13_3, i_14_2, i_15_1);
				if (-1.0F == class3974.x) {
					class3974.x = Float.POSITIVE_INFINITY;
				}
				if (-1.0F == class3974.y) {
					class3974.y = Float.POSITIVE_INFINITY;
				}
				if (-1.0F == class3974.z) {
					class3974.z = Float.POSITIVE_INFINITY;
				}
				Class369.aClass261_Sub1_4079.method4871(class3974);
				Class369.aClass261_Sub1_4079.method4833(i_16_2 / 1000.0F);
				class3974.cache();
				break;
			case 526:
				ScriptExecutionContext.method1616(context, -183099594);
				break;
			case 69:
				Class459.method7672();
				break;
			case 577:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.antiAliasing
						.getValue();
				break;
			case 248:
				ScriptExecutionContext.method6983(context, -409520220);
				break;
			case 569:
				ScriptExecutionContext.method5260(context);
				break;
			case 366:
				ScriptExecutionContext.method3532(context, -723916082);
				break;
			case 117:
				IdentikitDefinitionProvider.method5492(context, (byte) -119);
				break;
			case 666:
				ScriptExecutionContext.method3286(context, 2102822053);
				break;
			case 671:
				ScriptExecutionContext.method3757(context, 1218247772);
				break;
			case 703:
				int i_1_45 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Client.aClass448Array10869[i_1_45].anInt5072 * 588129863;
				break;
			case 101:
				int i_6_20 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				if (!Class60.activeToolkit.method2688()) {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 3;
				} else {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.bloom
							.compatible(i_6_20);
				}
				break;
			case 960:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Client.aBool10632 ? 1 : 0;
				break;
			case 582:
				int i_0_33 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				if (i_0_33 == 0) {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class495_Sub1.aBool10340 ? 1
							: 0;
				} else if (i_0_33 == 1) {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class495_Sub1.aBool10341 ? 1
							: 0;
				} else if (i_0_33 == 2) {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class495_Sub1.aBool10342 ? 1
							: 0;
				} else {
					throw new RuntimeException();
				}
				break;
			case 384:
				ScriptExecutionContext.method6085(context, (byte) 8);
				break;
			case 239:
				context.anInt7924 -= 1122685165;
				int i_104_ = context.anIntArray7942[1841827045 * context.anInt7924];
				Class480_Sub41 class480_sub411 = (Class480_Sub41) Client.aClass667_10791.get(i_104_);
				if (class480_sub411 != null && class480_sub411.anInt10371 * -487784573 == 3) {
					Class480_Sub41.method9830(class480_sub411, true, true);
				}
				break;
			case 83:
				int i_4_13 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				ItemDefinition itemDefinition3 = ItemDefinition.loader.get(i_4_13);
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 2 == 1146503759 * itemDefinition3.stackable ? 1
						: 0;
				break;
			case 697:
				context.counter += -160194073 * context.anIntArray7943[context.counter * 1523704279];
				break;
			case 1049:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.buildArea
						.getValue();
				break;
			case 564:
				boolean bool7 = true;
				if (Client.aBool10589) {
					try {
						Object object = Class380.aClass380_4219.method6228();
						if (null != object) {
							bool7 = ((Boolean) object).booleanValue();
						}
					} catch (Throwable throwable) {

					}
				}
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = bool7 ? 1 : 0;
				break;
			case 1122:
				Class199.preferences.setValue(Class199.preferences.sceneryShadows,
						context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045]);
				Client.aClass460_10760.method7705();
				Client.savePreferences();
				Client.sentPreferences = false;
				break;
			case 103:
				boolean bool6 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045] == 1;
				Class198.method3873(bool6);
				break;
			case 770:
				context.anInt7924 -= -2049596966;
				int i_0_19 = context.anIntArray7942[1841827045 * context.anInt7924];
				int i_1_28 = context.anIntArray7942[1841827045 * context.anInt7924 + 1] - 1;
				ItemDefinition itemDefinition2 = ItemDefinition.loader.get(i_0_19);
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = itemDefinition2
						.method13594(i_1_28);
				break;
			case 76:
				if (Client.aBool10589) {
					Class380.aClass380_4217.method6225();
				}
				break;
			case 425:
				context.intVariables[context.anIntArray7943[1523704279 * context.counter]] = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				break;
			case 148:
				if (!Class628.method13100()) {
					Class410.method6946();
				}
				break;
			case 105:
				if (Class369.aClass261_Sub1_4079.method4837() != Class270.aClass270_2995
						|| Class369.aClass261_Sub1_4079.method4836() != Class257.aClass257_2855) {
					throw new RuntimeException();
				}
				Class397 class3972 = ((Class281_Sub2) Class369.aClass261_Sub1_4079.method4876()).method15243((byte) 3);
				Class397 class397_2_ = ((Class642_Sub3) Class369.aClass261_Sub1_4079.method4834())
						.method16720(2057132453);
				Class397 class397_3_ = Class397.copyOf(class3972);
				class397_3_.subtract(class397_2_);
				float f3 = Class465.method7879(class397_3_.x, class397_3_.z, 1914134880);
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = (int) (2607.5945876176133 * f3) & 0x3fff;
				break;
			case 781:
				int i_0_18 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Client.aClass448Array10869[i_0_18]
						.method7380(1344469772);
				break;
			case 779:
				int i_5_21 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				ItemDefinition itemDefinition1 = ItemDefinition.loader.get(i_5_21);
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 1795791411 * itemDefinition1.anInt8321;
				break;
			case 323:
				if (context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045] == 1) {
					context.counter += -160194073 * context.anIntArray7943[1523704279 * context.counter];
				}
				break;
			case 54:
				context.anInt7924 -= 1122685165;
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = -1;
				break;
			case 501:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.bloom
						.supported() && Class60.activeToolkit.method2688() ? 1 : 0;
				break;
			case 458:
				context.anInt7924 -= -2049596966;
				int i_67_ = context.anIntArray7942[1841827045 * context.anInt7924];
				boolean bool5 = context.anIntArray7942[1 + 1841827045 * context.anInt7924] == 1;
				context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = Class480_Sub22
						.method14268(i_67_, bool5);
				break;
			case 845:
				Class480_Sub22 class480_sub221 = (Class480_Sub22) context.anObjectArray7918[(context.anInt7929 -= -1356601931) * 211787933];
				if (Class369.aClass261_Sub1_4079.method4837() != Class270.aClass270_2997) {
					throw new RuntimeException();
				}
				Class281_Sub3 class281_sub3 = (Class281_Sub3) Class369.aClass261_Sub1_4079.method4876();
				class281_sub3.method15304(class480_sub221);
				Client.aBool10611 = true;
				break;
			case 412:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class149.method3180() ? 1
						: 0;
				break;
			case 392:
				context.anInt7924 -= -2049596966;
				int i_0_17 = context.anIntArray7942[1841827045 * context.anInt7924];
				int i_1_27 = context.anIntArray7942[context.anInt7924 * 1841827045 + 1];
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = AnimateObjectCutsceneAction.aClass420_9538
						.get(i_0_17).messages[i_1_27];
				break;
			case 710:
				context.anInt7924 -= 195773364;
				int i_2_24 = context.anIntArray7942[1841827045 * context.anInt7924];
				int i_3_22 = context.anIntArray7942[1 + 1841827045 * context.anInt7924];
				int i_4_12 = context.anIntArray7942[1841827045 * context.anInt7924 + 2];
				int i_5_20 = context.anIntArray7942[3 + 1841827045 * context.anInt7924];
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class341.method5864(
						i_2_24, i_3_22, i_4_12, 0 != i_5_20, 1958539402);
				break;
			case 805:
				int i_3_21 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = PlayerVariableProvider.instance
						.method1546(i_3_21);
				break;
			case 1121:
				Class380.aClass380_4216.method6225();
				break;
			case 724:
				Class611 class61147 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class22694 = class61147.aClass226_7914;
				Interface class22148 = class61147.aClass221_7913;
				ScriptExecutionContext.method1102(class22694, class22148, context);
				break;
			case 796:
				String string3 = (String) context.anObjectArray7918[(context.anInt7929 -= -1356601931) * 211787933];
				context.anInt7924 -= -2049596966;
				int i_2_3 = context.anIntArray7942[1841827045 * context.anInt7924];
				int i_3_1 = context.anIntArray7942[context.anInt7924 * 1841827045 + 1];
				FontSpecification class9 = FontSpecification.create(Class80.fonts, i_3_1, 0);
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = class9.textWidth(string3,
						i_2_3, WeakReferenceTable.nameIcons);
				break;
			case 370:
				Class611 class61124 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class22647 = class61124.aClass226_7914;
				String string44 = (String) context.anObjectArray7918[(context.anInt7929 -= -1356601931) * 211787933];
				if (ScriptExecutionContext.method9239(string44, context) != null) {
					string44 = string44.substring(0, string44.length() - 1);
				}
				class22647.anObjectArray2454 = Class562_Sub1.method16248(string44, context);
				class22647.aBool2483 = true;
				break;
			case 317:
				String string27 = (String) context.anObjectArray7918[(context.anInt7929 -= -1356601931) * 211787933];
				if (Class515.aString7059 != null && Class515.aString7059.equalsIgnoreCase(string27)) {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 1;
				} else {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
				}
				break;
			case 868:
				Class611 class61146 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class22693 = class61146.aClass226_7914;
				context.anInt7924 -= -1658050238;
				byte[] is3 = null;
				byte[] is_5_1 = null;
				int i_6_17;
				for (i_6_17 = 0; i_6_17 < 10 && context.anIntArray7942[i_6_17 + 1841827045 * context.anInt7924] >= 0; i_6_17 += 2) {

				}
				if (i_6_17 > 0) {
					is3 = new byte[i_6_17 / 2];
					is_5_1 = new byte[i_6_17 / 2];
					for (i_6_17 -= 2; i_6_17 >= 0; i_6_17 -= 2) {
						is3[i_6_17 / 2] = (byte) context.anIntArray7942[i_6_17 + context.anInt7924 * 1841827045];
						is_5_1[i_6_17 / 2] = (byte) context.anIntArray7942[1841827045 * context.anInt7924 + i_6_17 + 1];
					}
				}
				int i_1_38 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045] - 1;
				if (i_1_38 < 0 || i_1_38 > 9) {
					throw new RuntimeException();
				}
				Class650_Sub1.method16709(class22693, i_1_38, is3, is_5_1, context, 39585591);
				break;
			case 231:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.themeMusicVolume
						.getValue();
				break;
			case 607:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.removeRoofs
						.getValue();
				break;
			case 917:
				context.anInt7924 -= 1122685165;
				int i_8_5 = context.anIntArray7942[context.anInt7924 * 1841827045];
				TurnMobCutsceneAction.aClass186_9434.method3594(i_8_5);
				break;
			case 277:
				context.anInt7929 -= 1581763434;
				String string26 = (String) context.anObjectArray7918[context.anInt7929 * 211787933];
				String string_0_2 = (String) context.anObjectArray7918[1 + context.anInt7929 * 211787933];
				context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = new StringBuilder()
						.append(string26).append(string_0_2).toString();
				break;
			case 964:
				Class611 class6117 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class2268 = class6117.aClass226_7914;
				class2268.aBool2405 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045] == 1;
				Widget.redraw(class2268);
				break;
			case 408:
				context.anInt7924 -= -2049596966;
				int i_12_5 = context.anIntArray7942[context.anInt7924 * 1841827045];
				int i_13_2 = context.anIntArray7942[context.anInt7924 * 1841827045 + 1];
				Queue class638 = Class495.method8554(i_12_5 >> 14 & 0x3fff, i_12_5 & 0x3fff);
				boolean bool4 = false;
				for (Class480_Sub31_Sub18 class480_sub31_sub183 = (Class480_Sub31_Sub18) class638.getFront(); null != class480_sub31_sub183; class480_sub31_sub183 = (Class480_Sub31_Sub18) class638
						.next()) {
					if (i_13_2 == 1943328861 * class480_sub31_sub183.anInt11426) {
						bool4 = true;
						break;
					}
				}
				if (bool4) {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 1;
				} else {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
				}
				break;
			case 68:
				Class611 class61145 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class22692 = class61145.aClass226_7914;
				class22692.aBool2475 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045] == 1;
				Widget.redraw(class22692);
				break;
			case 773:
				int i_72_1 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class22691 = Widget.lookup(i_72_1);
				Interface class22146 = Class598.loadedInterfaces[i_72_1 >> 16];
				Widget.method7527(class22691, class22146, false, 2, context);
				break;
			case 678:
				String string;
				if (Client.localPlayer != null && Client.localPlayer.displayName != null) {
					string = Client.localPlayer.getName(false);
				} else {
					string = "";
				}
				context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = string;
				break;
			case 1190:
				int i_5_19 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Class369.aClass261_Sub1_4079.method4903(Class626.method13054(i_5_19), true);
				Client.aBool10611 = true;
				break;
			case 73:
				QuestDefinition class234 = QuestDefinition.loader
						.get(context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045]);
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = class234.anIntArray2596 == null ? 0
						: class234.anIntArray2596.length;
				break;
			case 164:
				context.anInt7924 -= -926911801;
				int i_6_16 = context.anIntArray7942[1841827045 * context.anInt7924];
				int i_7_12 = context.anIntArray7942[1 + context.anInt7924 * 1841827045];
				boolean bool3 = 1 == context.anIntArray7942[2 + context.anInt7924 * 1841827045];
				Class565 class565 = ItemDefinition.aClass192_8339.method3806(i_6_16).method3927(i_7_12);
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = bool3 ? class565
						.method9536() : class565.getExperience();
				break;
			case 455:
				Class611 class61144 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class22690 = class61144.aClass226_7914;
				int i_1_26 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				int i_2_23 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045] - 1;
				if (class22690.anInt2418 * 286135323 != 6) {
					throw new RuntimeException("");
				}
				NpcDefinition npcDefinition1 = NpcDefinition.loader.get(-643054127 * class22690.anInt2486);
				if (class22690.aClass267_2361 == null) {
					class22690.aClass267_2361 = new Class267(npcDefinition1, true);
				}
				class22690.aClass267_2361.aLong2977 = Class36.method992() * 359135170314717883L;
				if (i_2_23 < 0 || i_2_23 >= npcDefinition1.models.length) {
					throw new RuntimeException(new StringBuilder().append("").append(i_2_23).toString());
				}
				class22690.aClass267_2361.models[i_2_23] = i_1_26;
				Widget.redraw(class22690);
				break;
			case 665:
				context.anInt7924 -= -2049596966;
				TurnMobCutsceneAction.aClass186_9434.method3617(context.anIntArray7942[context.anInt7924 * 1841827045],
						context.anIntArray7942[1 + 1841827045 * context.anInt7924]);
				break;
			case 419:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.steroSound
						.getValue() == 1 ? 1 : 0;
				break;
			case 958:
				ScriptExecutionContext.method7386(context);
				break;
			case 183:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = context.aClass288_7941.talkRank;
				break;
			case 340:
				String string25 = (String) context.anObjectArray7918[(context.anInt7929 -= -1356601931) * 211787933];
				int i_2_22 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				if (i_2_22 == -1) {
					throw new RuntimeException("");
				}
				context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = new StringBuilder()
						.append(string25).append((char) i_2_22).toString();
				break;
			case 772:
				context.anInt7929 -= 1581763434;
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = VarpDefinition
						.method13983((String) context.anObjectArray7918[211787933 * context.anInt7929],
								(String) context.anObjectArray7918[1 + context.anInt7929 * 211787933],
								Client.currentLanguage);
				break;
			case 623:
				int i_1_25 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = context.aClass480_Sub33_7935.aClass283Array10233[i_1_25].aString3165;
				break;
			case 859:
				context.anInt7924 -= -2049596966;
				break;
			case 463:
				context.anInt7924 -= 195773364;
				int i_46_ = context.anIntArray7942[context.anInt7924 * 1841827045];
				int i_47_1 = context.anIntArray7942[1 + 1841827045 * context.anInt7924];
				int i_48_ = context.anIntArray7942[2 + 1841827045 * context.anInt7924];
				int i_49_ = context.anIntArray7942[3 + context.anInt7924 * 1841827045];
				EnumDefinition class6751 = EnumDefinition.loader.get(i_48_);
				if (class6751.keyType.getId() != i_46_ || class6751.valueType.getId() != i_47_1) {
					throw new RuntimeException(new StringBuilder().append(i_48_).append(" ").append(i_49_).toString());
				}
				if (i_47_1 == CharacterType.S_LOWER.getId()) {
					context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = class6751
							.getString(i_49_);
				} else {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = class6751
							.getInt(i_49_);
				}
				break;
			case 1138:
				Class368.method6102((Class600_Sub1) context.anInterface55_7937,
						context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045], true);
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = (int) Client.aFloatArray10736[0];
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = (int) Client.aFloatArray10736[1];
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = (int) Client.aFloatArray10736[2];
				break;
			case 686:
				int i_1_24 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class22689 = Widget.lookup(i_1_24);
				context.anInt7924 -= 1122685165;
				int i_3_23 = context.anIntArray7942[context.anInt7924 * 1841827045] - 1;
				if (i_3_23 < 0 || i_3_23 > 9) {
					throw new RuntimeException();
				}
				Client.method17268(class22689, i_3_23, context);
				break;
			case 121:
				int i_1_4 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				if (2 == -2028985543 * Client.anInt10892 && i_1_4 < Client.friendCount * -1763746795) {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Client.friends[i_1_4].anInt565 * 1108006443;
				} else {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
				}
				break;
			case 1084:
				context.anInt7924 -= -926911801;
				TurnMobCutsceneAction.aClass186_9434.method3617(context.anIntArray7942[1841827045 * context.anInt7924],
						context.anIntArray7942[context.anInt7924 * 1841827045 + 1]);
				break;
			case 1028:
				int i_2_21 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = ItemDefinition.aClass192_8339
						.method3806(i_2_21).method3880();
				break;
			case 673:
				context.anInt7924 -= -926911801;
				int i_11_5 = context.anIntArray7942[context.anInt7924 * 1841827045];
				int i_12_4 = context.anIntArray7942[1 + 1841827045 * context.anInt7924];
				int i_13_1 = context.anIntArray7942[2 + 1841827045 * context.anInt7924];
				QuickChatMessage class480_sub31_sub61 = ThemeMusicVolumeNormaliser.aClass10_2062.get(i_11_5);
				if (class480_sub31_sub61.getType(i_12_4).id * 372827699 != 0) {
					throw new RuntimeException("");
				}
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = class480_sub31_sub61
						.getConfig(i_12_4, i_13_1);
				break;
			case 517:
				int i_5_18 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class22688 = Widget.lookup(i_5_18);
				Interface class22145 = Class598.loadedInterfaces[i_5_18 >> 16];
				String string24 = (String) context.anObjectArray7918[(context.anInt7929 -= -1356601931) * 211787933];
				if (!string24.equals(class22688.text)) {
					class22688.text = string24;
					Widget.redraw(class22688);
				}
				if (-1 == -592186295 * class22688.component && !class22145.aBool2278) {
					Class380.method6235(1857819631 * class22688.id);
				}
				break;
			case 341:
				context.anInt7924 -= -2049596966;
				Client.anInt10781 = 897408463 * context.anIntArray7942[context.anInt7924 * 1841827045];
				Client.anInt10783 = context.anIntArray7942[1841827045 * context.anInt7924 + 1] * -856791521;
				break;
			case 838:
				Class31.method906(context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045]);
				break;
			case 1021:
				int i_5_17 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				if (Class551.friendsChat != null && i_5_17 < 46303181 * Client.friendChatSize
						&& Class551.friendsChat[i_5_17].accountName.equalsIgnoreCase(Client.localPlayer.accountName)) {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 1;
				} else {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
				}
				break;
			case 251:
				Client.aBool10814 = true;
				break;
			case 436:
				throw new RuntimeException("");
			case 232:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class56.menuOptionCount * 84366055;
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = MenuCategory.count * 1469668737;
				break;
			case 15:
				int i_0_16 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class22687 = Widget.lookup(i_0_16);
				Interface class22144 = Class598.loadedInterfaces[i_0_16 >> 16];
				ScriptExecutionContext.method4770(class22687, class22144, context);
				break;
			case 510:
				int i_2_20 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class22686 = Widget.lookup(i_2_20);
				Interface class22143 = Class598.loadedInterfaces[i_2_20 >> 16];
				ScriptExecutionContext.method5906(class22686, class22143, context);
				break;
			case 699:
				Class611 class61143 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class22685 = class61143.aClass226_7914;
				Interface class22142 = class61143.aClass221_7913;
				Class351.method5969(class22685, class22142, context);
				break;
			case 915:
				context.anIntArray7942[1841827045 * context.anInt7924 - 2] = QuestDefinition.loader.get(
						context.anIntArray7942[context.anInt7924 * 1841827045 - 2]).method4384(
						PlayerVariableProvider.instance, context.anIntArray7942[1841827045 * context.anInt7924 - 1]) ? 1
						: 0;
				context.anInt7924 -= 1122685165;
				break;
			case 938:
				context.anInt7928 -= 846585302;
				if (context.aLongArray7934[context.anInt7928 * -47101501] != context.aLongArray7934[1 + -47101501
						* context.anInt7928]) {
					context.counter += context.anIntArray7943[1523704279 * context.counter] * -160194073;
				}
				break;
			case 565:
				Class611 class61142 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class22684 = class61142.aClass226_7914;
				Interface class22141 = class61142.aClass221_7913;
				ScriptExecutionContext.method3838(class22684, class22141, context, Class227.aClass227_2564);
				break;
			case 912:
				int i_6_15 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class22683 = Widget.lookup(i_6_15);
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = class22683.anInt2382
						* -1909412215;
				break;
			case 532:
				context.anInt7928 -= 423292651;
				break;
			case 199:
				Class611 class61141 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class22682 = class61141.aClass226_7914;
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = class22682.spritePitch
						* -322294683;
				break;
			case 1186:
				Class369.aClass261_Sub1_4079
						.method4833(context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045] / 1000.0F);
				break;
			case 1060:
				Class611 class61140 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class22681 = class61140.aClass226_7914;
				int i_6_14 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				int i_7_11 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045] - 1;
				if (2 != class22681.anInt2418 * 286135323) {
					throw new RuntimeException("");
				}
				NpcDefinition definition6 = NpcDefinition.loader.get(class22681.anInt2486 * -643054127);
				if (class22681.aClass267_2361 == null) {
					class22681.aClass267_2361 = new Class267(definition6, false);
				}
				class22681.aClass267_2361.aLong2977 = Class36.method992() * 359135170314717883L;
				if (i_7_11 < 0 || i_7_11 >= definition6.headModels.length) {
					throw new RuntimeException("");
				}
				class22681.aClass267_2361.models[i_7_11] = i_6_14;
				Widget.redraw(class22681);
				break;
			case 970:
				break;
			case 1148:
				int i_0_15 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class22680 = Widget.lookup(i_0_15);
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 2141391961 * class22680.spriteOffsetY;
				break;
			case 575:
				throw new RuntimeException("");
			case 866:
				long l4 = context.aLongArray7934[(context.anInt7928 -= 423292651) * -47101501];
				context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = l4 == -1L ? "" : Long
						.toString(l4, 36).toUpperCase();
				break;
			case 908:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class348
						.getTwitchChatState();
				break;
			case 318:
				context.anInt7924 -= -2049596966;
				int i_4_11 = context.anIntArray7942[1841827045 * context.anInt7924];
				int i_5_16 = context.anIntArray7942[1 + context.anInt7924 * 1841827045];
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = ThemeMusicVolumeNormaliser.aClass10_2062
						.get(i_4_11).responses[i_5_16];
				break;
			case 282:
				int i_63_ = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				TwitchWebcamDevice twitchwebcamdevice = CachedParticleDefinitionLoader.method5981(i_63_);
				if (twitchwebcamdevice == null) {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = -1;
				} else {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = twitchwebcamdevice
							.capabilities();
				}
				break;
			case 735:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = context.aClass480_Sub33_7935.aByte10226;
				break;
			case 328:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = CacheResourceWorker.anInt4892
						* -1258027563;
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = -1102731111
						* Preference.anInt8072;
				break;
			case 150:
				context.anInt7924 -= -2049596966;
				int i_7_10 = context.anIntArray7942[1841827045 * context.anInt7924];
				Class397 class3971 = Class397.create(i_7_10, i_7_10, i_7_10);
				Class369.aClass261_Sub1_4079.method4818(class3971);
				class3971.cache();
				break;
			case 945:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = ItemDefinition.aClass192_8339
						.method3772();
				break;
			case 1128:
				Class611 class61139 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class22679 = class61139.aClass226_7914;
				Interface class22140 = class61139.aClass221_7913;
				ScriptExecutionContext.method5906(class22679, class22140, context);
				break;
			case 878:
				int i_0_14 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class22678 = Widget.lookup(i_0_14);
				Interface class22139 = Class598.loadedInterfaces[i_0_14 >> 16];
				Class197.method3864(class22678, class22139, context);
				break;
			case 1180:
				context.anInt7929 -= 1581763434;
				String string23 = (String) context.anObjectArray7918[211787933 * context.anInt7929];
				String string_0_1 = (String) context.anObjectArray7918[211787933 * context.anInt7929 + 1];
				int i_1_23 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = string23.indexOf(
						string_0_1, i_1_23);
				break;
			case 406:
				long l2 = TimeUtil.time();
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = (int) (l2 / 60000L);
				break;
			case 201:
				int i_1_22 = Class266.method5042();
				if (i_1_22 < 0) {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = -1;
					context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = "";
					context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = "";
					context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = "";
					context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = "";
				} else {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = TwitchTV.aTwitchEventLiveStreams1243.viewerCounts[i_1_22];
					context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = TwitchTV.aTwitchEventLiveStreams1243.channelUrls[i_1_22];
					context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = TwitchTV.aTwitchEventLiveStreams1243.previewUrlTemplates[i_1_22];
					context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = TwitchTV.aTwitchEventLiveStreams1243.streamTitles[i_1_22];
					context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = TwitchTV.aTwitchEventLiveStreams1243.channelDisplayNames[i_1_22];
				}
				break;
			case 700:
				int i_3_20 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class22677 = Widget.lookup(i_3_20);
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = -370763243
						* class22677.anInt2409;
				break;
			case 1037:
				context.anInt7924 -= -2049596966;
				int i_0_13 = context.anIntArray7942[1841827045 * context.anInt7924];
				int i_1_21 = context.anIntArray7942[1 + 1841827045 * context.anInt7924];
				Class480_Sub41 class480_sub412 = (Class480_Sub41) Client.aClass667_10791.get(i_0_13);
				if (class480_sub412 != null && i_1_21 == 1021060255 * class480_sub412.anInt10372) {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 1;
				} else {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
				}
				break;
			case 740:
				int i_74_ = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.water
						.compatible(i_74_);
				break;
			case 0:
				context.anInt7924 -= -926911801;
				int i_1_15 = context.anIntArray7942[context.anInt7924 * 1841827045];
				int i_2_16 = context.anIntArray7942[context.anInt7924 * 1841827045 + 1];
				int i_3_16 = context.anIntArray7942[context.anInt7924 * 1841827045 + 2];
				TurnMobCutsceneAction.aClass186_9434.method3720(i_1_15, i_2_16, i_3_16);
				break;
			case 30:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Client.localPlayer.combat * 1340998367;
				break;
			case 651:
				context.anInt7924 -= -2049596966;
				boolean bool2 = context.anIntArray7942[1841827045 * context.anInt7924] != 0;
				boolean bool_99_ = 0 != context.anIntArray7942[context.anInt7924 * 1841827045 + 1];
				Class164.method3364(bool2, bool_99_);
				break;
			case 334:
				int i_9_4 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				if (Client.anInt10892 * -2028985543 != 0 && i_9_4 < -1127325433 * Client.ignoredPlayerCount) {
					context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = Client.ignoredPlayers[i_9_4].name;
				} else {
					context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = "";
				}
				break;
			case 19:
				int i_2_19 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				if (Class495_Sub1.aClass667_10318 != null) {
					Linkable class4801 = Class495_Sub1.aClass667_10318.get(i_2_19);
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = null != class4801 ? 1
							: 0;
				} else {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
				}
				break;
			case 1135:
				int i_4_10 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class22676 = Widget.lookup(i_4_10);
				ScriptExecutionContext.method1537(class22676, context);
				break;
			case 1187:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = -1343037161
						* AsynchronousStreamRequest.anInt4532 + Class495.anInt6849;
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class495.anInt6823
						+ ClanChannelUpdater.anInt3185 * -1266662223;
				break;
			case 1183:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = -585847029
						* Client.anInt10859 == context.aClass600_Sub1_Sub3_Sub1_7936.method17969() ? 1 : 0;
				break;
			case 852:
				context.anInt7924 -= -2049596966;
				int i_0_12 = context.anIntArray7942[context.anInt7924 * 1841827045];
				int i_1_20 = context.anIntArray7942[1 + 1841827045 * context.anInt7924];
				ConnectionInfo.method13843(9, i_0_12, i_1_20, "");
				break;
			case 716:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.groundDecoration
						.supported() ? 1 : 0;
				break;
			case 1081:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Client.localPlayerIndex
						* -406165969;
				break;
			case 633:
				Class611 class61138 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class22675 = class61138.aClass226_7914;
				class22675.aString2473 = (String) context.anObjectArray7918[(context.anInt7929 -= -1356601931) * 211787933];
				break;
			case 375:
				Class611 class61137 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class22674 = class61137.aClass226_7914;
				Interface class22137 = class61137.aClass221_7913;
				class22674.anInt2418 = -1025291226;
				class22674.aClass267_2361 = null;
				class22674.anInt2486 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045] * 1265546033;
				if (-592186295 * class22674.component == -1 && !class22137.aBool2278) {
					PulseEvent.method7175(1857819631 * class22674.id);
				}
				break;
			case 721:
				int i_3_19 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class22673 = Widget.lookup(i_3_19);
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 1331228877 * class22673.spriteScale;
				break;
			case 243:
				Client.processConsoleCommand(
						(String) context.anObjectArray7918[(context.anInt7929 -= -1356601931) * 211787933], false,
						false);
				break;
			case 257:
				int i_1_19 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class22672 = Widget.lookup(i_1_19);
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 1151952653 * class22672.spriteYaw;
				break;
			case 888:
				Class611 class61116 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class22630 = class61116.aClass226_7914;
				Interface class22118 = class61116.aClass221_7913;
				ScriptExecutionContext.method7276(class22630, class22118, context);
				break;
			case 1083:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Client.aBool10598 ? 1 : 0;
				break;
			case 285:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 145690599 * Class31.anInt435;
				break;
			case 461:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = PaddedResourceWorker.aBool5033 ? 1
						: 0;
				break;
			case 785:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.graphics
						.getValue();
				break;
			case 918:
				int i_2_18 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				if (i_2_18 >= 1 && i_2_18 <= 2) {
					Class199.preferences.setValue(Class199.preferences.screenSize, i_2_18);
					Class199.preferences.setValue(Class199.preferences.aClass632_Sub30_10305, i_2_18);
					Client.savePreferences();
				}
				break;
			case 24:
				int i_10_5 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.aClass632_Sub11_10264
						.compatible(i_10_5);
				break;
			case 477:
				context.anInt7924 -= -926911801;
				int i_4_9 = context.anIntArray7942[1841827045 * context.anInt7924];
				int i_5_15 = context.anIntArray7942[context.anInt7924 * 1841827045 + 1];
				int i_6_13 = context.anIntArray7942[2 + 1841827045 * context.anInt7924];
				if (-1 == i_5_15) {
					throw new RuntimeException();
				}
				EnumDefinition class675 = EnumDefinition.loader.get(i_5_15);
				if (class675.valueType.getId() != i_4_9) {
					throw new RuntimeException();
				}
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = class675
						.containsValue(Integer.valueOf(i_6_13)) ? 1 : 0;
				break;
			case 1020:
				int i_4_8 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = ThemeMusicVolumeNormaliser.aClass10_2062
						.get(i_4_8).fillerCount();
				break;
			case 814:
				Class495_Sub1.logout(false);
				break;
			case 660:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Client.affiliateId * 672060199;
				break;
			case 968:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = -747091687
						* FloatRaster.anInt1244 & 0x1;
				break;
			case 718:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = TwitchTV.tv
						.GetLoginState();
				break;
			case 62:
				int i_9_6 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				if (-2028985543 * Client.anInt10892 == 2 && i_9_6 >= 0 && i_9_6 < -1763746795 * Client.friendCount) {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 274152061 * Client.friends[i_9_6].anInt574;
				} else {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
				}
				break;
			case 111:
				context.anInt7924 -= -2049596966;
				int i_78_ = context.anIntArray7942[1841827045 * context.anInt7924];
				int i_79_ = context.anIntArray7942[context.anInt7924 * 1841827045 + 1];
				if (i_78_ >= 0 && i_78_ < 2) {
					Client.anIntArrayArrayArray10720[i_78_] = new int[i_79_ << 1][4];
				}
				break;
			case 132:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Client.membersWorld ? 1
						: 0;
				break;
			case 197:
				if (context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045] == 0) {
					context.counter += -160194073 * context.anIntArray7943[1523704279 * context.counter];
				}
				break;
			case 1042:
				context.anInt7924 -= -926911801;
				byte[] is = { (byte) context.anIntArray7942[context.anInt7924 * 1841827045] };
				byte[] is_5_ = { (byte) context.anIntArray7942[1841827045 * context.anInt7924 + 1] };
				int i_6_4 = context.anIntArray7942[2 + context.anInt7924 * 1841827045];
				Widget class22622 = Widget.lookup(i_6_4);
				int i_1_39 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045] - 1;
				if (i_1_39 < 0 || i_1_39 > 9) {
					throw new RuntimeException();
				}
				Class650_Sub1.method16709(class22622, i_1_39, is, is_5_, context, 39585591);
				break;
			case 1077:
				int i_1_18 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class22671 = Widget.lookup(i_1_18);
				Interface class22136 = Class598.loadedInterfaces[i_1_18 >> 16];
				Class480_Sub31_Sub13.method17837(class22671, class22136, context);
				break;
			case 516:
				context.anIntArray7942[1841827045 * context.anInt7924 - 2] = QuestDefinition.loader
						.get(context.anIntArray7942[1841827045 * context.anInt7924 - 2]).anIntArrayArray2607[context.anIntArray7942[context.anInt7924 * 1841827045 - 1]][1];
				context.anInt7924 -= 1122685165;
				break;
			case 976:
				int i_1_8 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class22640 = Widget.lookup(i_1_8);
				Interface class22120 = Class598.loadedInterfaces[i_1_8 >> 16];
				ScriptExecutionContext.method1146(class22640, class22120, context);
				break;
			case 1067:
				context.anInt7924 -= 1122685165;
				break;
			case 927:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Client.recorder
						.leftButtonDown() ? 1 : 0;
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Client.recorder
						.rightButtonDown() ? 1 : 0;
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Client.recorder
						.middleButtonDown() ? 1 : 0;
				break;
			case 894:
				context.anInt7924 -= 1318458529;
				break;
			case 820:
				int i_72_ = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = CacheResourceWorker
						.isAlphaNumeric((char) i_72_) ? 1 : 0;
				break;
			case 874:
				int i_3_18 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Class480_Sub31_Sub18 class480_sub31_sub182 = Class495.method8553(i_3_18);
				if (class480_sub31_sub182 == null) {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
				} else {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = -1874808723
							* class480_sub31_sub182.anInt11425;
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 1964867229 * class480_sub31_sub182.anInt11427;
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = -1334470583
							* class480_sub31_sub182.anInt11428;
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = -144068941
							* class480_sub31_sub182.anInt11421;
				}
				break;
			case 3:
				int i_3_17 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class22670 = Widget.lookup(i_3_17);
				Interface class22135 = Class598.loadedInterfaces[i_3_17 >> 16];
				ScriptExecutionContext.method1632(class22670, class22135, context);
				break;
			case 27:
				Class611 class61136 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class22669 = class61136.aClass226_7914;
				Interface class22134 = class61136.aClass221_7913;
				boolean bool1 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045] == 1;
				ScriptExecutionContext.method3838(class22669, class22134, context, bool1 ? Class227.aClass227_2560
						: Class227.aClass227_2567);
				break;
			case 299:
				int i_7_6 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				BufferedConnectionContext class831 = Client.getActiveConnection();
				OutgoingFrame class480_sub152 = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_3925,
						class831.encryptor);
				class480_sub152.payload.writeByte(i_7_6);
				class831.sendFrame(class480_sub152);
				break;
			case 799:
				int i_10_1 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class22610 = Widget.lookup(i_10_1);
				class22610.aBool2405 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045] == 1;
				Widget.redraw(class22610);
				break;
			case 40:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class626.method13053();
				break;
			case 996:
				context.anInt7924 -= -2049596966;
				int i_88_ = context.anIntArray7942[context.anInt7924 * 1841827045];
				int i_89_ = context.anIntArray7942[1 + 1841827045 * context.anInt7924];
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 0 != (i_88_ & 1 << i_89_) ? 1
						: 0;
				break;
			case 549:
				context.anInt7924 -= -926911801;
				int i_9_5 = context.anIntArray7942[1841827045 * context.anInt7924];
				int i_10_4 = context.anIntArray7942[1841827045 * context.anInt7924 + 1];
				int i_11_4 = context.anIntArray7942[1841827045 * context.anInt7924 + 2];
				float f2 = (float) (2.0 * Math.atan(i_9_5 / 2.0F / i_11_4));
				float f_12_ = (float) (2.0 * Math.atan(i_10_4 / 2.0F / i_11_4));
				Class369.aClass261_Sub1_4079.method4854(f2, f_12_);
				break;
			case 351:
				int i_7_9 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class22668 = Widget.lookup(i_7_9);
				Interface class22133 = Class598.loadedInterfaces[i_7_9 >> 16];
				Class468.method7911(class22668, class22133, context);
				break;
			case 107:
				int i_27_ = context.anIntArray7943[1523704279 * context.counter];
				context.anInt7929 -= -1356601931 * i_27_;
				String string22 = Class179.method3540(context.anObjectArray7918, 211787933 * context.anInt7929, i_27_);
				context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = string22;
				break;
			case 646:
				context.anInt7924 -= -2049596966;
				if (context.anIntArray7942[1841827045 * context.anInt7924] < context.anIntArray7942[1 + context.anInt7924 * 1841827045]) {
					context.counter += context.anIntArray7943[context.counter * 1523704279] * -160194073;
				}
				break;
			case 321:
				Class611 class61135 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class22667 = class61135.aClass226_7914;
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 1 == 286135323 * class22667.anInt2418 ? class22667.anInt2486
						* -643054127
						: -1;
				break;
			case 147:
				int i_1_17 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				if (i_1_17 < 0 || i_1_17 > 1) {
					i_1_17 = 0;
				}
				Class38.method1020(1 == i_1_17);
				break;
			case 653:
				int i_5_9 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				if (2 == Client.anInt10892 * -2028985543 && i_5_9 < Client.friendCount * -1763746795) {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 489944991 * Client.friends[i_5_9].anInt572;
				} else {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
				}
				break;
			case 189:
				context.anInt7924 -= 1122685165;
				int i_13_ = context.anIntArray7942[context.anInt7924 * 1841827045];
				TurnMobCutsceneAction.aClass186_9434.method3655(i_13_);
				break;
			case 520:
				Class611 class61134 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class22666 = class61134.aClass226_7914;
				Interface class22132 = class61134.aClass221_7913;
				TimeUtil.method4148(class22666, class22132, context, -1685012784);
				break;
			case 659:
				Class611 class61133 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class22665 = class61133.aClass226_7914;
				Interface class2212 = class61133.aClass221_7913;
				ScriptExecutionContext.method3539(class22665, class2212, context, (byte) 1);
				break;
			case 459:
				int i_3_15 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class22663 = Widget.lookup(i_3_15);
				String string19 = (String) context.anObjectArray7918[(context.anInt7929 -= -1356601931) * 211787933];
				if (ScriptExecutionContext.method9239(string19, context) != null) {
					string19 = string19.substring(0, string19.length() - 1);
				}
				class22663.anObjectArray2523 = Class562_Sub1.method16248(string19, context);
				class22663.aBool2483 = true;
				break;
			case 923:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = context.intVariables[context.anIntArray7943[context.counter * 1523704279]];
				break;
			case 1004:
				throw new RuntimeException("");
			case 625:
				int i_12_3 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = i_12_3 ^ 0xffffffff;
				break;
			case 643:
				int i_0_23 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class226102 = Widget.lookup(i_0_23);
				Interface class22155 = Class598.loadedInterfaces[i_0_23 >> 16];
				Class198.method3869(class22155, class226102);
				break;
			case 744:
				ScriptExecutionContext.method7391(context);
				break;
			case 158:
				int i_0_38 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class226144 = Widget.lookup(i_0_38);
				Interface class22178 = Class598.loadedInterfaces[i_0_38 >> 16];
				ScriptExecutionContext.method6319(class226144, class22178, context, 211787933);
				break;
			case 1125:
				Class380.method6234(context);
				break;
			case 115:
				ScriptExecutionContext.method9349(context);
				break;
			case 572:
				ScriptExecutionContext.method2067(context);
				break;
			case 161:
				int i_1_2 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Character
						.toLowerCase((char) i_1_2);
				break;
			case 223:
				Class562.method9476(context);
				break;
			case 333:
				ScriptExecutionContext.method1095(context);
				break;
			case 553:
				ComponentMouseRecorder.method16425(context);
				break;
			case 77:
				ScriptExecutionContext.method4998(context);
				break;
			case 446:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.aClass632_Sub19_10283
						.getValue();
				break;
			case 851:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = context.aClass288_7941
						.indexOf((String) context.anObjectArray7918[(context.anInt7929 -= -1356601931) * 211787933]);
				break;
			case 1116:
				ScriptExecutionContext.method9350(context);
				break;
			case 90:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.aClass632_Sub8_10280
				.getValue();
				break;
			case 339:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 1;
				break;
			case 431:
				ScriptExecutionContext.method10196(context);
				break;
			case 92:
				OverlayDefinition.method9929(context.aClass600_Sub1_Sub3_Sub1_7936, context);
				break;
			case 1103:
				Npc class600_sub1_sub3_sub1_sub21 = (Npc) context.aClass600_Sub1_Sub3_Sub1_7936;
				NpcDefinition npcDefinition2 = class600_sub1_sub3_sub1_sub21.definition;
				if (null != npcDefinition2.morphisms) {
					npcDefinition2 = npcDefinition2.morph(PlayerVariableProvider.instance,
							PlayerVariableProvider.instance);
				}
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = npcDefinition2 != null ? 1
						: 0;
				break;
			case 630:
				Class611 class61123 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class22645 = class61123.aClass226_7914;
				Interface class22124 = class61123.aClass221_7913;
				ScriptExecutionContext.method5906(class22645, class22124, context);
				break;
			case 137:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = context.aClass288_7941.lootshareRank;
				break;
			case 142:
				VarpLoaderIterator.method9691();
				Class60.method1371();
				Client.aClass460_10760.method7705();
				Client.savePreferences();
				Client.sentPreferences = false;
				break;
			case 605:
				ScriptExecutionContext.method14015(context);
				break;
			case 975:
				ScriptExecutionContext.method5428(context);
				break;
			case 21:
				ScriptExecutionContext.method4706(context);
				break;
			case 943:
				Class637.method13160(FloatRaster.method1728());
				break;
			case 363:
				ScriptExecutionContext.method1566(context);
				break;
			case 144:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 829782561 * Client.anInt10863;
				break;
			case 688:
				context.anInt7924 -= -2049596966;
				int i_0_37 = context.anIntArray7942[context.anInt7924 * 1841827045];
				boolean bool8 = context.anIntArray7942[context.anInt7924 * 1841827045 + 1] == 1;
				WorldVarpType.method15405(i_0_37, bool8);
				break;
			case 319:
				Class486.method8248(context, 2146737178);
				break;
			case 679:
				int i_6_19 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				OutgoingFrame class480_sub156 = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_3989,
						Client.gameConnection.encryptor);
				class480_sub156.payload.writeShort(i_6_19);
				Client.gameConnection.sendFrame(class480_sub156);
				break;
			case 1110:
				ScriptExecutionContext.method16729(context);
				break;
			case 640:
				int i_4_6 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class22651 = Widget.lookup(i_4_6);
				ScriptExecutionContext.method3328(class22651, context);
				break;
			case 771:
				Class380.aClass380_4214.method6225();
				break;
			case 1146:
				ScriptExecutionContext.method1711(context);
				break;
			case 483:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.buildArea
						.supported() ? 1 : 0;
				break;
			case 985:
				Class368.method6102(context.aClass600_Sub1_Sub1_Sub1_7938,
						context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045], true);
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = (int) Client.aFloatArray10736[0];
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = (int) Client.aFloatArray10736[1];
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = (int) Client.aFloatArray10736[2];
				break;
			case 797:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.idleAnimations
						.getValue();
				break;
			case 507:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = SoundEffectsVolumeNormaliser.anInt1937 * 1138184625;
				break;
			case 226:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 2 == 1212513917 * Connection.anInt7170 ? 1
						: 0;
				break;
			case 902:
				ScriptExecutionContext.method2857(context, 336716704);
				break;
			case 1197:
				Class611 class6113 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class2263 = class6113.aClass226_7914;
				class2263.anInt2427 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045]
						* -592771235;
				break;
			case 937:
				int i_0_24 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class226103 = Widget.lookup(i_0_24);
				Interface class22156 = Class598.loadedInterfaces[i_0_24 >> 16];
				Interface.method5417(class22156, class226103);
				break;
			case 1130:
				context.anInt7924 -= 195773364;
				int i_16_ = context.anIntArray7942[1841827045 * context.anInt7924];
				int i_17_ = context.anIntArray7942[1 + context.anInt7924 * 1841827045];
				int i_18_ = context.anIntArray7942[2 + context.anInt7924 * 1841827045];
				int i_19_ = context.anIntArray7942[3 + context.anInt7924 * 1841827045];
				int i_20_ = 256;
				TurnMobCutsceneAction.aClass186_9434.method3710(Class171.aClass171_1952, i_16_, i_17_, i_19_,
						Class156.aClass156_1876.method3293(), Class167.aClass167_1926, 0.0F, 0.0F, null, 0, i_20_,
						i_18_);
				break;
			case 297:
				PreferenceManager.setDefaultPreferences();
				Class60.method1371();
				Client.aClass460_10760.method7705();
				Client.savePreferences();
				Client.sentPreferences = false;
				break;
			case 1034:
				ParticleTriangle.method9817(context);
				break;
			case 977:
				ScriptExecutionContext.method6979(context);
				break;
			case 1115:
				int i_1_12 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class22658 = Widget.lookup(i_1_12);
				Interface class22131 = Class598.loadedInterfaces[i_1_12 >> 16];
				Class470.method8044(class22658, class22131, context);
				break;
			case 885:
				method3478(context);
				break;
			case 70:
				int i_2_10 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.groundDecoration
						.compatible(i_2_10);
				break;
			case 689:
				ScriptExecutionContext.method3183(context);
				break;
			case 882:
				ScriptExecutionContext.method4330(context);
				break;
			case 198:
				Class38.method1018(context, -2067372167);
				break;
			case 55:
				Class351.method5967(context, -1815209116);
				break;
			case 93:
				Class611 class61148 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class22695 = class61148.aClass226_7914;
				Interface class22149 = class61148.aClass221_7913;
				ScriptExecutionContext.method5847(class22695, class22149, context, 2017488784);
				break;
			case 534:
				ArchiveResourceProvider.method15393(context);
				break;
			case 316:
				context.anInt7924 -= 1318458529;
				int i_7_4 = context.anIntArray7942[1841827045 * context.anInt7924];
				int i_8_3 = context.anIntArray7942[1 + context.anInt7924 * 1841827045];
				int i_9_3 = context.anIntArray7942[2 + 1841827045 * context.anInt7924];
				int i_10_3 = context.anIntArray7942[3 + context.anInt7924 * 1841827045];
				int i_11_2 = context.anIntArray7942[4 + 1841827045 * context.anInt7924];
				TurnMobCutsceneAction.aClass186_9434.method3710(Class171.aClass171_1952, i_7_4, i_8_3, i_10_3,
						Class156.aClass156_1876.method3293(), Class167.aClass167_1926, 0.0F, 0.0F, null, 0, i_11_2,
						i_9_3);
				break;
			case 1030:
				Class553 class5532 = new Class553();
				class5532
						.method9356((Class480_Sub22) context.anObjectArray7918[(context.anInt7929 -= -1356601931) * 211787933]);
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = class5532.hash();
				break;
			case 1101:
				ScriptExecutionContext.method16020(context);
				break;
			case 800:
				Class611 class61191 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class226168 = class61191.aClass226_7914;
				Interface class22188 = class61191.aClass221_7913;
				Widget.method13702(class226168, class22188, context, (byte) -101);
				break;
			case 151:
				Class572.method9670(context, 1392429404);
				break;
			case 1025:
				context.anInt7929 -= 1581763434;
				String string8 = (String) context.anObjectArray7918[context.anInt7929 * 211787933];
				String string_0_ = (String) context.anObjectArray7918[context.anInt7929 * 211787933 + 1];
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class509.method8779(
						string8, string_0_, 851587091);
				break;
			case 385:
				ScriptExecutionContext.method1070(context);
				break;
			case 1014:
				int i_0_42 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class226156 = Widget.lookup(i_0_42);
				ScriptExecutionContext.method2233(class226156, context);
				break;
			case 865:
				int i_7_2 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class22619 = Widget.lookup(i_7_2);
				ScriptExecutionContext.method7409(class22619, context, 1608016186);
				break;
			case 828:
				ScriptExecutionContext.method14253(context);
				break;
			case 834:
				ScriptExecutionContext.method9320(context, 1334527702);
				break;
			case 667:
				Class611 class61156 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class226107 = class61156.aClass226_7914;
				String string36 = (String) context.anObjectArray7918[(context.anInt7929 -= -1356601931) * 211787933];
				if (ScriptExecutionContext.method9239(string36, context) != null) {
					string36 = string36.substring(0, string36.length() - 1);
				}
				class226107.anObjectArray2487 = Class562_Sub1.method16248(string36, context);
				class226107.aBool2483 = true;
				break;
			case 337:
				Class49.method1114(context, -1152071406);
				break;
			case 265:
				VariableBitsDefinition bits = (VariableBitsDefinition) context.script.anObjectArray11388[context.counter * 1523704279];
				VariableCollection interface131 = (VariableCollection) (0 == context.anIntArray7943[1523704279 * context.counter] ? context.aMap7939
						.get(bits.varp.type) : context.aMap7940.get(bits.varp.type));
				try {
					interface131
							.setVarbit(bits, context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045]);
				} catch (VarbitException exception_sub4) {
					if (interface131 instanceof TimedVariableCollection) {
						ScriptExecutionContext.method1605(context, ScriptInstruction.aClass466_5279, exception_sub4,
								"VO");
					} else {
						throw exception_sub4;
					}
				}
				break;
			case 416:
				context.anInt7924 -= -2049596966;
				int i_3_28 = context.anIntArray7942[context.anInt7924 * 1841827045];
				int i_4_17 = context.anIntArray7942[context.anInt7924 * 1841827045 + 1];
				Mob.method18041(i_3_28, i_4_17 >> 14 & 0x3fff, i_4_17 & 0x3fff, false);
				break;
			case 1153:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class664.lastLoginDate * 1004352479;
				break;
			case 344:
				ScriptExecutionContext.method5208(context);
				break;
			case 413:
				Class611 class61167 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class226126 = class61167.aClass226_7914;
				class226126.anInt2432 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045]
						* -1184204525;
				Widget.redraw(class226126);
				break;
			case 1085:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = LatencyMonitor.isWindows() ? 1
						: 0;
				break;
			case 1158:
				context.anInt7924 -= -2049596966;
				MovementType class624 = CompressionType.findIdentifiable(MovementType.values(),
						context.anIntArray7942[1841827045 * context.anInt7924]);
				Class553 class553 = new Class553(context.anIntArray7942[context.anInt7924 * 1841827045 + 1]);
				if (-1 == class553.plane * 394202151) {
					throw new RuntimeException("");
				}
				if (MovementType.TELEPORTING != class624 && class624 != MovementType.WALKING && MovementType.RUNNING != class624) {
					throw new RuntimeException("");
				}
				if (null != Client.gameConnection) {
					OutgoingFrame frame = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_3952,
							Client.gameConnection.encryptor);
					frame.payload.writeShort(-180305283 * class553.z);
					frame.payload.writeLEShort(2051316501 * class553.x);
					frame.payload.writeByteS(class624.getId());
					Client.gameConnection.sendFrame(frame);
				}
				break;
			case 513:
				int i_0_22 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class226101 = Widget.lookup(i_0_22);
				Interface class22154 = Class598.loadedInterfaces[i_0_22 >> 16];
				Widget.method13702(class226101, class22154, context, (byte) 27);
				break;
			case 631:
				Class611 class61171 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class226135 = class61171.aClass226_7914;
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 923665021 * class226135.colour;
				break;
			case 804:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.fog
						.getValue() == 1 ? 1 : 0;
				break;
			case 109:
				context.anInt7924 -= -2049596966;
				int i_2_6 = context.anIntArray7942[context.anInt7924 * 1841827045];
				int i_3_4 = context.anIntArray7942[1 + 1841827045 * context.anInt7924];
				if (i_2_6 > 700 || i_3_4 > 700) {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 256;
				}
				double d = (Math.random() * (i_2_6 + i_3_4) - i_2_6 + 800.0) / 100.0;
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = (int) (Math.pow(2.0, d) + 0.5);
				break;
			case 947:
				int i_103_1 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				int i_104_1 = Client.aClass448Array10869[i_103_1].method7375();
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = i_104_1 == 0 ? 1 : 0;
				break;
			case 693:
				int i_2_27 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class226105 = Widget.lookup(i_2_27);
				String string34 = (String) context.anObjectArray7918[(context.anInt7929 -= -1356601931) * 211787933];
				if (ScriptExecutionContext.method9239(string34, context) != null) {
					string34 = string34.substring(0, string34.length() - 1);
				}
				class226105.anObjectArray2506 = Class562_Sub1.method16248(string34, context);
				class226105.aBool2483 = true;
				break;
			case 482:
				ScriptExecutionContext.method7343(context);
				break;
			case 1022:
				ScriptExecutionContext.method9383(context);
				break;
			case 407:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.lighting
						.getValue() == 1 ? 1 : 0;
				break;
			default:
				throw new RuntimeException();
			case 567:
				LoadingRequirementType.method591(context);
				break;
			case 813:
				context.anInt7924 -= -2049596966;
				int i_4_ = context.anIntArray7942[context.anInt7924 * 1841827045];
				int i_5_2 = context.anIntArray7942[1 + 1841827045 * context.anInt7924];
				int i_6_2 = i_5_2 >> 14 & 0x3fff;
				int i_7_1 = i_5_2 & 0x3fff;
				int i_8_1 = WallDecoration.method18092(i_4_, i_6_2, i_7_1, 353908189);
				if (i_8_1 < 0) {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = -1;
				} else {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = i_8_1;
				}
				break;
			case 1096:
				int i_0_9 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class22641 = Widget.lookup(i_0_9);
				class22641.anInt2374 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045] * 1445901463;
				Widget.redraw(class22641);
				break;
			case 768:
				int i_7_13 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				int i_8_8 = i_7_13 >> 14 & 0x3fff;
				int i_9_9 = i_7_13 & 0x3fff;
				Class553 class5535 = Client.aClass460_10760.method7679();
				i_8_8 -= 2051316501 * class5535.x;
				if (i_8_8 < 0) {
					i_8_8 = 0;
				} else if (i_8_8 >= Client.aClass460_10760.method7680()) {
					i_8_8 = Client.aClass460_10760.method7680();
				}
				i_9_9 -= class5535.z * -180305283;
				if (i_9_9 < 0) {
					i_9_9 = 0;
				} else if (i_9_9 >= Client.aClass460_10760.method7707()) {
					i_9_9 = Client.aClass460_10760.method7707();
				}
				Client.anInt10706 = 626449507 * ((i_8_8 << 9) + 256);
				Client.anInt10707 = (256 + (i_9_9 << 9)) * 1901113705;
				Connection.anInt7170 = -1637449474;
				TurnMobCutsceneAction.anInt9433 = -1490979241;
				Class156.anInt1886 = -1672889529;
				break;
			case 49:
				Class611 class61192 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class226169 = class61192.aClass226_7914;
				Interface class22121 = class61192.aClass221_7913;
				ScriptExecutionContext.method4993(class226169, class22121, context);
				break;
			case 1108:
				Class611 class61112 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class22620 = class61112.aClass226_7914;
				ScriptExecutionContext.method3328(class22620, context);
				break;
			case 992:
				int i_260_ = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				int i_261_ = Class199.preferences.musicVolume.getValue();
				if (i_261_ != i_260_) {
					Class199.preferences.setValue(Class199.preferences.musicVolume, i_260_);
					Client.savePreferences();
					Client.sentPreferences = false;
				}
				break;
			case 51:
				Class611 class61126 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class22650 = class61126.aClass226_7914;
				Interface class22127 = class61126.aClass221_7913;
				ScriptExecutionContext.method13724(class22650, class22127, context, 778480132);
				break;
			case 205:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.water
						.supported() ? 1 : 0;
				break;
			case 787:
				context.anInt7924 -= -926911801;
				int i_0_46 = context.anIntArray7942[context.anInt7924 * 1841827045];
				int i_1_50 = context.anIntArray7942[1 + context.anInt7924 * 1841827045];
				int i_2_39 = context.anIntArray7942[2 + 1841827045 * context.anInt7924];
				Widget class226170 = Widget.lookup(i_2_39);
				Class62.method1384(class226170, i_0_46, i_1_50);
				break;
			case 831:
				if (null == Class16.aShortArray282
						|| 2091568149 * Class280.anInt3154 >= Class357.anInt3819 * -1937034147) {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = -1;
				} else {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class16.aShortArray282[(Class280.anInt3154 += -924015811) * 2091568149 - 1] & 0xffff;
				}
				break;
			case 614:
				Class611 class61193 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class226171 = class61193.aClass226_7914;
				Interface class22189 = class61193.aClass221_7913;
				ScriptExecutionContext.method3552(class226171, class22189, context);
				break;
			case 1194:
				context.anInt7924 -= -2049596966;
				if (context.anIntArray7942[context.anInt7924 * 1841827045] != context.anIntArray7942[1 + 1841827045 * context.anInt7924]) {
					context.counter += -160194073 * context.anIntArray7943[1523704279 * context.counter];
				}
				break;
			case 694:
				context.anInt7924 -= -2049596966;
				int i_3_35 = context.anIntArray7942[context.anInt7924 * 1841827045];
				int i_4_24 = context.anIntArray7942[1 + context.anInt7924 * 1841827045];
				ParameterDefinition class332 = ParameterDefinition.loader.get(i_4_24);
				if (class332.isString()) {
					context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = AnimationDefinition.loader
							.get(i_3_35).getParameter(i_4_24, class332.defaultString);
				} else {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = AnimationDefinition.loader
							.get(i_3_35).getParameter(i_4_24, class332.defaultInt * -125275839);
				}
				break;
			case 843:
				int i_0_35 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class226131 = Widget.lookup(i_0_35);
				String string45 = (String) context.anObjectArray7918[(context.anInt7929 -= -1356601931) * 211787933];
				if (ScriptExecutionContext.method9239(string45, context) != null) {
					string45 = string45.substring(0, string45.length() - 1);
				}
				class226131.anObjectArray2454 = Class562_Sub1.method16248(string45, context);
				class226131.aBool2483 = true;
				break;
			case 806:
				Class650_Sub2.method16744(context);
				break;
			case 5:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.antiAliasing
						.supported() && Class60.activeToolkit.method2384() ? 1 : 0;
				break;
			case 594:
				int i_3_2 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = PlayerVariableProvider.instance
						.method1548(i_3_2);
				break;
			case 348:
				ScriptExecutionContext.method15097(context);
				break;
			case 1001:
				ScriptExecutionContext.method5147(context);
				break;
			case 1079:
				context.anIntArray7942[context.anInt7924 * 1841827045 - 2] = QuestDefinition.loader
						.get(context.anIntArray7942[context.anInt7924 * 1841827045 - 2]).anIntArray2590[context.anIntArray7942[1841827045 * context.anInt7924 - 1]];
				context.anInt7924 -= 1122685165;
				break;
			case 684:
				if (Client.supportsFullScreen) {
					DisplayProperties[] class651s = PlayerVarpType.method15345();
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = class651s.length;
				} else {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
				}
				break;
			case 832:
				boolean bool9 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045] != 0;
				Class509.method8776(bool9);
				break;
			case 1178:
				Class480_Sub37 class480_sub37 = Class480_Sub37.method7529();
				if (class480_sub37 == null) {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = -1;
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = -1;
				} else {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = class480_sub37.id * 818539827;
					int i_3_32 = 1881345255 * class480_sub37.anInt10314 << 28
							| Class495.anInt6849 + class480_sub37.anInt10310 * -1639918769 << 14 | Class495.anInt6823
							+ class480_sub37.anInt10308 * -342421335;
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = i_3_32;
				}
				break;
			case 357:
				ScriptExecutionContext.method6044(context);
				break;
			case 1149:
				ScriptExecutionContext.method4346(context);
				break;
			case 484:
				ScriptExecutionContext.method3496(context);
				break;
			case 182:
				Class591.method9997(context);
				break;
			case 704:
				int i_6_18 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class226108 = Widget.lookup(i_6_18);
				String string37 = (String) context.anObjectArray7918[(context.anInt7929 -= -1356601931) * 211787933];
				if (ScriptExecutionContext.method9239(string37, context) != null) {
					string37 = string37.substring(0, string37.length() - 1);
				}
				class226108.anObjectArray2487 = Class562_Sub1.method16248(string37, context);
				class226108.aBool2483 = true;
				break;
			case 722:
				int i_6_10 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				QuickChatCategory class480_sub31_sub91 = AnimateObjectCutsceneAction.aClass420_9538.get(i_6_10);
				if (class480_sub31_sub91.subcategories == null) {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
				} else {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = class480_sub31_sub91.subcategories.length;
				}
				break;
			case 963:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 848917157 * Class31.anInt439;
				break;
			case 332:
				Class499.method8686(context);
				break;
			case 951:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = -243952405
						* Class31.anInt431;
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = -583568077
						* Class31.anInt433;
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class31.anInt407 * 1741148661;
				Class31.anInt431 = 734206074;
				Class31.anInt433 = 1096708613;
				Class31.anInt407 = -35623517;
				break;
			case 1054:
				ScriptExecutionContext.method5834(context);
				break;
			case 471:
				ScriptExecutionContext.method2228(context);
				break;
			case 515:
				String string40 = (String) context.anObjectArray7918[(context.anInt7929 -= -1356601931) * 211787933];
				Client.removeIgnore(string40);
				break;
			case 525:
				Class455.method7420(context, -2103246647);
				break;
			case 302:
				ScriptExecutionContext.method3461(context);
				break;
			case 537:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class485.osName
						.startsWith("linux") ? 1 : 0;
				break;
			case 656:
				ParticlesPreference.method16438(context);
				break;
			case 108:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class485.osName
						.startsWith("win") ? 1 : 0;
				break;
			case 1045:
				Class283.method3558(context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045]);
				break;
			case 204:
				Class611 class61165 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class226124 = class61165.aClass226_7914;
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = class226124.spriteYaw * 1151952653;
				break;
			case 1040:
				ScriptExecutionContext.method5134(context, 1381322237);
				break;
			case 758:
				CursorDefinition.method10097();
				break;
			case 211:
				ScriptExecutionContext.method15313(context);
				break;
			case 1099:
				Class340_Sub2.method15399(context, (byte) -43);
				break;
			case 726:
				ScriptExecutionContext.method4763(context, (byte) 85);
				break;
			case 403:
				ScriptExecutionContext.method3368(context);
				break;
			case 267:
				ParallelHttpProvider.method7171(context, (byte) 4);
				break;
			case 185:
				int i_0_8 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				QuickChatMessage class480_sub31_sub6 = ThemeMusicVolumeNormaliser.aClass10_2062.get(i_0_8);
				if (null == class480_sub31_sub6.responses) {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
				} else {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = class480_sub31_sub6.responses.length;
				}
				break;
			case 1031:
				int i_5_1 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				if (Client.aString10890 != null && i_5_1 < 46303181 * Client.friendChatSize) {
					context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = Class551.friendsChat[i_5_1].aString1022;
				} else {
					context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = "";
				}
				break;
			case 691:
				Class611 class61173 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class226137 = class61173.aClass226_7914;
				class226137.anInt2374 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045] * 1445901463;
				Widget.redraw(class226137);
				break;
			case 35:
				int i_0_47 = Class62.method1381(context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045],
						1996763445);
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = i_0_47;
				break;
			case 1098:
				context.anInt7924 -= -2049596966;
				int i_3_36 = context.anIntArray7942[1841827045 * context.anInt7924];
				int i_4_25 = context.anIntArray7942[1841827045 * context.anInt7924 + 1];
				context.aClass357_7946.anIntArray3818[i_3_36] = i_4_25;
				break;
			case 1058:
				int i_2_40 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Class480_Sub31_Sub18 class480_sub31_sub183 = Class495.method8553(i_2_40);
				if (null == class480_sub31_sub183) {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
				} else {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = -1334470583
							* class480_sub31_sub183.anInt11428 - class480_sub31_sub183.anInt11425 * -1874808723;
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = class480_sub31_sub183.anInt11421
							* -144068941 - 1964867229 * class480_sub31_sub183.anInt11427;
				}
				break;
			case 500:
				context.anInt7924 -= -2049596966;
				int i_69_ = context.anIntArray7942[context.anInt7924 * 1841827045];
				int i_70_ = context.anIntArray7942[1 + 1841827045 * context.anInt7924];
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = AnimateObjectCutsceneAction.aClass420_9538
						.get(i_69_).subcategoryHotkeys[i_70_];
				break;
			case 244:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = -2119579857
						* Class340_Sub1.anInt9868;
				break;
			case 965:
				context.anInt7929 -= 1581763434;
				String string49 = (String) context.anObjectArray7918[context.anInt7929 * 211787933];
				String string_0_3 = (String) context.anObjectArray7918[1 + context.anInt7929 * 211787933];
				if (context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045] == 1) {
					context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = string49;
				} else {
					context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = string_0_3;
				}
				break;
			case 399:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = (int) (3919361711412166437L * Class679.subscriptionExpiration / 60000L);
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = (int) ((3919361711412166437L
						* Class679.subscriptionExpiration - TimeUtil.time() - ParameterDefinition.remainingSubscription
						* -4467880663037169619L) / 60000L);
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class548.activeSubscription ? 1
						: 0;
				break;
			case 818:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Client.aBool10599 ? 1 : 0;
				break;
			case 133:
				Class480_Sub22 class480_sub224 = (Class480_Sub22) context.anObjectArray7918[(context.anInt7929 -= -1356601931) * 211787933];
				if (Class369.aClass261_Sub1_4079.method4836() != Class257.aClass257_2848) {
					throw new RuntimeException();
				}
				Class642_Sub2 class642_sub2 = (Class642_Sub2) Class369.aClass261_Sub1_4079.method4834();
				class642_sub2.method16708(class480_sub224, -651393648);
				Client.aBool10611 = true;
				break;
			case 178:
				int i_8_7 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Class264 class264 = Class40.method1029(i_8_7);
				if (class264 == null) {
					throw new RuntimeException();
				}
				Class369.aClass261_Sub1_4079.method4812(class264);
				break;
			case 88:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class340_Sub2.method15396(
						(short) -17955).getId();
				break;
			case 326:
				Class640.method13205(context, -1148154530);
				break;
			case 676:
				ScriptExecutionContext.method7875(context, -1788645804);
				break;
			case 861:
				context.anInt7924 -= -2049596966;
				int i_1_37 = context.anIntArray7942[1841827045 * context.anInt7924];
				int i_2_31 = context.anIntArray7942[1 + 1841827045 * context.anInt7924];
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = i_1_37 & -1
						- (1 << i_2_31);
				break;
			case 234:
				int i_28_1 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class226147 = Widget.lookup(i_28_1);
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = -346651673
						* class226147.positionX;
				break;
			case 817:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = ItemDefinition.aClass192_8339
						.method3765().size();
				break;
			case 624:
				ScriptExecutionContext.method687(context);
				break;
			case 539:
				Client.useAutoWorld();
				break;
			case 478:
				Class611 class61155 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class226106 = class61155.aClass226_7914;
				String string35 = (String) context.anObjectArray7918[(context.anInt7929 -= -1356601931) * 211787933];
				if (ScriptExecutionContext.method9239(string35, context) != null) {
					string35 = string35.substring(0, string35.length() - 1);
				}
				class226106.anObjectArray2506 = Class562_Sub1.method16248(string35, context);
				class226106.aBool2483 = true;
				break;
			case 260:
				ScriptExecutionContext.method5855(context);
				break;
			case 417:
				context.anInt7924 -= -2049596966;
				int i_22_ = context.anIntArray7942[1841827045 * context.anInt7924];
				int i_23_ = context.anIntArray7942[context.anInt7924 * 1841827045 + 1];
				Class611 class61153;
				if (context.aBool7932) {
					class61153 = context.aClass611_7945;
				} else {
					class61153 = context.aClass611_7931;
				}
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = -1 != i_23_
						&& class61153.method10315(i_22_, i_23_, 1858942885) ? 1 : 0;
				break;
			case 173:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.bloom
						.getValue() == 1 ? 1 : 0;
				break;
			case 1129:
				ScriptExecutionContext.method6083(context, 1825613576);
				break;
			case 87:
				ScriptExecutionContext.method5398(context, 2040447639);
				break;
			case 574:
				ScriptExecutionContext.method15441(context);
				break;
			case 759:
				ScriptExecutionContext.method5044(context, 1891915099);
				break;
			case 122:
				ScriptExecutionContext.method4417(context, 362785145);
				break;
			case 298:
				Class486.method8247(context, 565902617);
				break;
			case 470:
				ScriptExecutionContext.method17571(context);
				break;
			case 1000:
				int i_0_40 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class226146 = Widget.lookup(i_0_40);
				Interface class22180 = Class598.loadedInterfaces[i_0_40 >> 16];
				PlayerAppearance.method9805(class226146, class22180, context, 1905714117);
				break;
			case 955:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = (int) Client.aFloat10708 >> 3;
				break;
			case 511:
				Class588.method9912(context, 1912420706);
				break;
			case 695:
				Class625.method10514(context, (byte) 1);
				break;
			case 1050:
				int i_1_43 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Class224 class224 = (Class224) Queue.aClass678_Sub8_8139.get(i_1_43);
				if (class224.aString2301 == null) {
					context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = "";
				} else {
					context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = class224.aString2301;
				}
				break;
			case 613:
				ScriptExecutionContext.method1092(context, (byte) 88);
				break;
			case 38:
				int i_1_49 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				if (Client.supportsFullScreen) {
					DisplayProperties[] class651s = PlayerVarpType.method15345();
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 1967400213 * class651s[i_1_49].width;
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = class651s[i_1_49].height
							* -150744351;
				} else {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
				}
				break;
			case 924:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Client.widgetSelected ? 1
						: 0;
				context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = Client.aString10789 == null ? ""
						: Client.aString10789;
				context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = null == Client.selectedWidgetAction ? ""
						: Client.selectedWidgetAction;
				break;
			case 738:
				ScriptExecutionContext.method9024(context);
				break;
			case 995:
				ScriptExecutionContext.method2283(context, 2033710614);
				break;
			case 233:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class452.anInt5091 * 433270587;
				break;
			case 44:
				ScriptExecutionContext.method6921(context, 558000847);
				break;
			case 194:
				BaseCursorDefinitionProvider.method9856(context, -1087360667);
				break;
			case 824:
				ScriptExecutionContext.method6977(context, 2119588380);
				break;
			case 1056:
				ScriptExecutionContext.method3331(context, 334411857);
				break;
			case 335:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Client.localPlayer
						.method17970().hash();
				break;
			case 1152:
				ScriptExecutionContext.method9341(context);
				break;
			case 1104:
				int i_5_14 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class22664 = Widget.lookup(i_5_14);
				class22664.anInt2427 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045]
						* -592771235;
				break;
			case 969:
				int i_12_1 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class22644 = Widget.lookup(i_12_1);
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = -1168337917
						* class22644.anInt2391;
				break;
			case 1179:
				int i_0_44 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Class183.method3576(context.aClass480_Sub33_7935 == Class417.aClass480_Sub33_4650, i_0_44, -1935020523);
				break;
			case 268:
				Class445.method7357(context, 232590530);
				break;
			case 377:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Client.tick;
				break;
			case 579:
				ScriptExecutionContext.method7007(context, 239159372);
				break;
			case 576:
				ScriptExecutionContext.method15340(context, (byte) -48);
				break;
			case 1027:
				GroundBlendingPreference.method16480(context, -330624277);
				break;
			case 309:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = -1113605561
						* Class671.activeConnectionInfo.id;
				break;
			case 489:
				context.anInt7924 -= -2049596966;
				int i_11_3 = context.anIntArray7942[1841827045 * context.anInt7924];
				int i_12_2 = context.anIntArray7942[1 + 1841827045 * context.anInt7924];
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class427.method7092(
						i_11_3, i_12_2, true);
				break;
			case 288:
				ScriptExecutionContext.method3292(context, (byte) -79);
				break;
			case 307:
				ScriptExecutionContext.method5301(context);
				break;
			case 737:
				ChecksumTable.method7085();
				break;
			case 130:
				ScriptExecutionContext.method8953(context);
				break;
			case 230:
				ValueType.method7041(context, -294811989);
				break;
			case 644:
				ScriptExecutionContext.method4799(context, -1667422451);
				break;
			case 303:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.skyboxes
						.supported() ? 1 : 0;
				break;
			case 778:
				ScriptExecutionContext.method16371(context, 1634869089);
				break;
			case 552:
				ScriptExecutionContext.method5963(context, -935129068);
				break;
			case 897:
				Class611 class61163 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class226122 = class61163.aClass226_7914;
				Interface class22168 = class61163.aClass221_7913;
				Class197.method3864(class226122, class22168, context);
				break;
			case 1024:
				String string29 = (String) context.anObjectArray7918[(context.anInt7929 -= -1356601931) * 211787933];
				Client.ignorePlayer(string29, false);
				break;
			case 187:
				ScriptExecutionContext.method2169(context);
				break;
			case 1032:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class189.method3754()
						.getId();
				break;
			case 110:
				ScriptExecutionContext.method17487(context);
				break;
			case 373:
				Class611 class61161 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class226118 = class61161.aClass226_7914;
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = class226118.scrollHeight
						* -184691147;
				break;
			case 261:
				int i_0_43 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class226158 = Widget.lookup(i_0_43);
				Interface class22186 = Class598.loadedInterfaces[i_0_43 >> 16];
				class226158.anInt2453 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045]
						* -1584868157;
				Widget.redraw(class226158);
				if (-1 == class226158.component * -592186295 && !class22186.aBool2278) {
					PulseEvent.method13719(1857819631 * class226158.id);
				}
				break;
			case 350:
				int i_10_10 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.skyboxes
						.compatible(i_10_10);
				break;
			case 581:
				throw new RuntimeException("");
			case 981:
				int i_2_37 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class226159 = Widget.lookup(i_2_37);
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = class226159.spriteOffsetX * 2134977475;
				break;
			case 503:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.aClass632_Sub8_10280
						.supported() ? 1 : 0;
				break;
			case 802:
				context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = Class592.method10026(
						Class614.method10355(context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045]),
						Client.currentLanguage.getId());
				break;
			case 922:
				int i_1_48 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class226160 = Widget.lookup(i_1_48);
				class226160.anInt2465 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045] * 1912613655;
				break;
			case 727:
				ScriptExecutionContext.method15098(context);
				break;
			case 612:
				OverlayDefinition.method9929(context.aClass600_Sub1_Sub1_Sub1_7938, context);
				break;
			case 216:
				Client.aClass226_10801 = null;
				Client.aClass226_10802 = null;
				break;
			case 661:
				int i_6_9 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class22637 = Widget.lookup(i_6_9);
				String string12 = (String) context.anObjectArray7918[(context.anInt7929 -= -1356601931) * 211787933];
				if (ScriptExecutionContext.method9239(string12, context) != null) {
					string12 = string12.substring(0, string12.length() - 1);
				}
				class22637.anObjectArray2508 = Class562_Sub1.method16248(string12, context);
				class22637.aBool2483 = true;
				break;
			case 595:
				AreaSoundVolumeNormaliser.method3845(context, (byte) -32);
				break;
			case 1072:
				ScriptExecutionContext.method9326(context);
				break;
			case 445:
				BaseNpcDefinitionProvider.method5067(context);
				break;
			case 584:
				Class591.method9998(context, 1841827045);
				break;
			case 731:
				ScriptExecutionContext.method6042(context, 2051316501);
				break;
			case 600:
				ScriptExecutionContext.method9886(context);
				break;
			case 374:
				ScriptExecutionContext.method10439(context);
				break;
			case 811:
				DummyOutputStream.method16835(context, -1479707914);
				break;
			case 78:
				int i_2_36 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class226153 = Widget.lookup(i_2_36);
				int i_3_32 = -1;
				int i_4_22 = -1;
				Class211 class211 = class226153.method4298(Class60.activeToolkit);
				if (null != class211) {
					i_3_32 = class211.anInt2182 * 881990655;
					i_4_22 = 1644092335 * class211.anInt2180;
				}
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = i_3_32;
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = i_4_22;
				break;
			case 803:
				ScriptExecutionContext.method13723(context, (byte) -8);
				break;
			case 682:
				if (Client.gameState * -1501875989 == 8) {
					Class671.aBool8463 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045] == 1;
				}
				break;
			case 1069:
				int i_6_8 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				if (Class369.aClass261_Sub1_4079.method4837() != Class270.aClass270_2995
						|| Class369.aClass261_Sub1_4079.method4836() != Class257.aClass257_2855) {
					throw new RuntimeException();
				}
				Class281_Sub2 class281_sub2 = (Class281_Sub2) Class369.aClass261_Sub1_4079.method4876();
				Class642_Sub3 class642_sub3 = (Class642_Sub3) Class369.aClass261_Sub1_4079.method4834();
				Class397 class397 = class281_sub2.method15243((byte) -26);
				Class397 class397_7_ = Class397.copyOf(class397);
				class397_7_.y += i_6_8;
				Class397 class397_8_ = Class397.difference(class642_sub3.method13235(), class397_7_);
				class397_8_.method6446();
				float f = class281_sub2.method15244((byte) 67).distance();
				Class398.method6540(class642_sub3.method13235(), class397_8_, class397, f, Class626.aClass397Array8039);
				if (Class626.aClass397Array8039[0] == null) {
					throw new RuntimeException("");
				}
				Class397 class397_9_;
				if (Class626.aClass397Array8039[1] == null) {
					class397_9_ = Class626.aClass397Array8039[0];
				} else if (Class397.difference(class642_sub3.method13235(), Class626.aClass397Array8039[0]).distance() < Class397
						.difference(class642_sub3.method13235(), Class626.aClass397Array8039[1]).distance()) {
					class397_9_ = Class626.aClass397Array8039[1];
				} else {
					class397_9_ = Class626.aClass397Array8039[0];
				}
				float f_10_ = Class465.method7879(class397.x - class397_9_.x, class397.z - class397_9_.z, 941891743);
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = (int) (f_10_ * 2607.5945876176133) & 0x3fff;
				break;
			case 1136:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.aClass632_Sub11_10264
						.supported() ? 1 : 0;
				break;
			case 242:
				Class611 class61178 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class226143 = class61178.aClass226_7914;
				Interface class22177 = class61178.aClass221_7913;
				ScriptExecutionContext.method729(class226143, class22177, context);
				break;
			case 616:
				ScriptExecutionContext.method3487(context, -1389542400);
				break;
			case 60:
				int i_0_27 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class226112 = Widget.lookup(i_0_27);
				if (null == class226112.aString2473) {
					context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = "";
				} else {
					context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = class226112.aString2473;
				}
				break;
			case 460:
				ScriptExecutionContext.method5149(context);
				break;
			case 254:
				Class457.method7534(context);
				break;
			case 609:
				ScriptExecutionContext.method6992(context);
				break;
			case 281:
				if (1 == Class73.anInt1110 * 1159976529) {
					Class73.aBool1107 = true;
				} else if (1159976529 * Class73.anInt1110 == 3) {
					Class73.aBool1108 = true;
				}
				break;
			case 443:
				ScriptExecutionContext.method4764(context, 1523351411);
				break;
			case 819:
				ScriptExecutionContext.method8797(context, (byte) -49);
				break;
			case 434:
				String string28 = (String) context.anObjectArray7918[(context.anInt7929 -= -1356601931) * 211787933];
				OutgoingFrame class480_sub154 = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_4011,
						Client.lobbyConnection.encryptor);
				class480_sub154.payload.writeByte(Buffer.encodedStringLength(string28));
				class480_sub154.payload.writeCString(string28);
				Client.lobbyConnection.sendFrame(class480_sub154);
				break;
			case 343:
				ScriptExecutionContext.method1565(context);
				break;
			case 354:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = context.aClass600_Sub1_Sub1_Sub1_7938
						.method16307();
				break;
			case 372:
				context.anInt7924 -= 1122685165;
				break;
			case 304:
				ScriptExecutionContext.method8727(context);
				break;
			case 361:
				Class611 class61168 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class226127 = class61168.aClass226_7914;
				Interface class2216 = class61168.aClass221_7913;
				ScriptExecutionContext.method1069(class226127, class2216, context);
				break;
			case 846:
				ScriptExecutionContext.method6012(context, 51045901);
				break;
			case 972:
				ScriptExecutionContext.method9317(context, -1758761604);
				break;
			case 734:
				Class572.method9671(context, 241469309);
				break;
			case 381:
				int i_0_6 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class22632 = Widget.lookup(i_0_6);
				String string10 = (String) context.anObjectArray7918[(context.anInt7929 -= -1356601931) * 211787933];
				int[] is1 = ScriptExecutionContext.method9239(string10, context);
				if (null != is1) {
					string10 = string10.substring(0, string10.length() - 1);
				}
				class22632.anObjectArray2502 = Class562_Sub1.method16248(string10, context);
				class22632.anIntArray2503 = is1;
				class22632.aBool2483 = true;
				break;
			case 635:
				ScriptExecutionContext.method5146(context, -182911698);
				break;
			case 1017:
				ScriptExecutionContext.method17342(context, 1008789325);
				break;
			case 590:
				context.anInt7924 -= -926911801;
				int i_11_9 = context.anIntArray7942[context.anInt7924 * 1841827045];
				int i_12_10 = context.anIntArray7942[context.anInt7924 * 1841827045 + 1];
				int i_13_4 = context.anIntArray7942[1841827045 * context.anInt7924 + 2];
				Class255 class255 = DespawnObjectCutsceneAction.method15085(i_11_9);
				float f4 = i_12_10;
				if (class255 == Class255.aClass255_2829 || class255 == Class255.aClass255_2830
						|| Class255.aClass255_2832 == class255) {
					f4 = Class373.method6114(i_12_10);
				}
				Class480_Sub31_Sub19_Sub2 class480_sub31_sub19_sub2 = new Class480_Sub31_Sub19_Sub2(
						Class369.aClass261_Sub1_4079.method15144(), class255, f4, i_13_4 / 1000.0F);
				Class369.aClass261_Sub1_4079.method4826(class480_sub31_sub19_sub2);
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 361545025 * class480_sub31_sub19_sub2.anInt11433;
				break;
			case 777:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Client.aBool10765
						&& !Client.aBool10766 ? 1 : 0;
				break;
			case 162:
				ScriptExecutionContext.method3942(context);
				break;
			case 129:
				if (Class369.aClass261_Sub1_4079.method4836() != Class257.aClass257_2850) {
					throw new RuntimeException();
				}
				((Class642_Sub1) Class369.aClass261_Sub1_4079.method4834()).method16689(
						context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045], 1466796676);
				break;
			case 756:
				context.anInt7924 -= -2049596966;
				int i_1_6 = context.anIntArray7942[1841827045 * context.anInt7924];
				int i_2_7 = context.anIntArray7942[1 + 1841827045 * context.anInt7924];
				Widget class22626 = Class185.method3584(i_1_6, i_2_7);
				PlayerVariableProvider.method1560();
				Class480_Sub16 class480_sub16 = Client.method17050(class22626);
				Class57.method1361(class22626, class480_sub16.method15633(), class480_sub16.anInt10101 * 1945403175);
				break;
			case 22:
				ScriptExecutionContext.method5856(context);
				break;
			case 916:
				Class600_Sub1_Sub5_Sub1.method18071(context, 432527561);
				break;
			case 1035:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
				break;
			case 33:
				Class600_Sub1_Sub4_Sub1.method18061(context, -400784067);
				break;
			case 506:
				if (null != Client.aByteArray10716) {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 1;
				} else {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
				}
				break;
			case 504:
				ScriptExecutionContext.method18104(context, (byte) -61);
				break;
			case 984:
				String message = (String) context.anObjectArray7918[(context.anInt7929 -= -1356601931) * 211787933];
				if (0 != 1667858447 * Client.localPrivilege || (!Client.aBool10765 || Client.aBool10766)
						&& !Client.aBool10769) {
					String lowercase = message.toLowerCase();
					int colour = 0;
					if (lowercase.startsWith(TranslatableString.YELLOW.translate(Language.ENGLISH))) {
						colour = 0;
						message = message.substring(TranslatableString.YELLOW.translate(Language.ENGLISH).length());
					} else if (lowercase.startsWith(TranslatableString.RED.translate(Language.ENGLISH))) {
						colour = 1;
						message = message.substring(TranslatableString.RED.translate(Language.ENGLISH).length());
					} else if (lowercase.startsWith(TranslatableString.GREEN.translate(Language.ENGLISH))) {
						colour = 2;
						message = message.substring(TranslatableString.GREEN.translate(Language.ENGLISH).length());
					} else if (lowercase.startsWith(TranslatableString.CYAN.translate(Language.ENGLISH))) {
						colour = 3;
						message = message.substring(TranslatableString.CYAN.translate(Language.ENGLISH).length());
					} else if (lowercase.startsWith(TranslatableString.PURPLE.translate(Language.ENGLISH))) {
						colour = 4;
						message = message.substring(TranslatableString.PURPLE.translate(Language.ENGLISH).length());
					} else if (lowercase.startsWith(TranslatableString.WHITE.translate(Language.ENGLISH))) {
						colour = 5;
						message = message.substring(TranslatableString.WHITE.translate(Language.ENGLISH).length());
					} else if (lowercase.startsWith(TranslatableString.FLASH1.translate(Language.ENGLISH))) {
						colour = 6;
						message = message.substring(TranslatableString.FLASH1.translate(Language.ENGLISH).length());
					} else if (lowercase.startsWith(TranslatableString.FLASH2.translate(Language.ENGLISH))) {
						colour = 7;
						message = message.substring(TranslatableString.FLASH2.translate(Language.ENGLISH).length());
					} else if (lowercase.startsWith(TranslatableString.FLASH3.translate(Language.ENGLISH))) {
						colour = 8;
						message = message.substring(TranslatableString.FLASH3.translate(Language.ENGLISH).length());
					} else if (lowercase.startsWith(TranslatableString.GLOW1.translate(Language.ENGLISH))) {
						colour = 9;
						message = message.substring(TranslatableString.GLOW1.translate(Language.ENGLISH).length());
					} else if (lowercase.startsWith(TranslatableString.GLOW2.translate(Language.ENGLISH))) {
						colour = 10;
						message = message.substring(TranslatableString.GLOW2.translate(Language.ENGLISH).length());
					} else if (lowercase.startsWith(TranslatableString.GLOW3.translate(Language.ENGLISH))) {
						colour = 11;
						message = message.substring(TranslatableString.GLOW3.translate(Language.ENGLISH).length());
					} else if (Client.currentLanguage != Language.ENGLISH) {
						if (lowercase.startsWith(TranslatableString.YELLOW.translate(Client.currentLanguage))) {
							colour = 0;
							message = message.substring(TranslatableString.YELLOW.translate(Client.currentLanguage)
									.length());
						} else if (lowercase.startsWith(TranslatableString.RED.translate(Client.currentLanguage))) {
							colour = 1;
							message = message.substring(TranslatableString.RED.translate(Client.currentLanguage)
									.length());
						} else if (lowercase.startsWith(TranslatableString.GREEN.translate(Client.currentLanguage))) {
							colour = 2;
							message = message.substring(TranslatableString.GREEN.translate(Client.currentLanguage)
									.length());
						} else if (lowercase.startsWith(TranslatableString.CYAN.translate(Client.currentLanguage))) {
							colour = 3;
							message = message.substring(TranslatableString.CYAN.translate(Client.currentLanguage)
									.length());
						} else if (lowercase.startsWith(TranslatableString.PURPLE.translate(Client.currentLanguage))) {
							colour = 4;
							message = message.substring(TranslatableString.PURPLE.translate(Client.currentLanguage)
									.length());
						} else if (lowercase.startsWith(TranslatableString.WHITE.translate(Client.currentLanguage))) {
							colour = 5;
							message = message.substring(TranslatableString.WHITE.translate(Client.currentLanguage)
									.length());
						} else if (lowercase.startsWith(TranslatableString.FLASH1.translate(Client.currentLanguage))) {
							colour = 6;
							message = message.substring(TranslatableString.FLASH1.translate(Client.currentLanguage)
									.length());
						} else if (lowercase.startsWith(TranslatableString.FLASH2.translate(Client.currentLanguage))) {
							colour = 7;
							message = message.substring(TranslatableString.FLASH2.translate(Client.currentLanguage)
									.length());
						} else if (lowercase.startsWith(TranslatableString.FLASH3.translate(Client.currentLanguage))) {
							colour = 8;
							message = message.substring(TranslatableString.FLASH3.translate(Client.currentLanguage)
									.length());
						} else if (lowercase.startsWith(TranslatableString.GLOW1.translate(Client.currentLanguage))) {
							colour = 9;
							message = message.substring(TranslatableString.GLOW1.translate(Client.currentLanguage)
									.length());
						} else if (lowercase.startsWith(TranslatableString.GLOW2.translate(Client.currentLanguage))) {
							colour = 10;
							message = message.substring(TranslatableString.GLOW2.translate(Client.currentLanguage)
									.length());
						} else if (lowercase.startsWith(TranslatableString.GLOW3.translate(Client.currentLanguage))) {
							colour = 11;
							message = message.substring(TranslatableString.GLOW3.translate(Client.currentLanguage)
									.length());
						}
					}
					lowercase = message.toLowerCase();
					int effect = 0;
					if (lowercase.startsWith(TranslatableString.WAVE.translate(Language.ENGLISH))) {
						effect = 1;
						message = message.substring(TranslatableString.WAVE.translate(Language.ENGLISH).length());
					} else if (lowercase.startsWith(TranslatableString.WAVE2.translate(Language.ENGLISH))) {
						effect = 2;
						message = message.substring(TranslatableString.WAVE2.translate(Language.ENGLISH).length());
					} else if (lowercase.startsWith(TranslatableString.SHAKE.translate(Language.ENGLISH))) {
						effect = 3;
						message = message.substring(TranslatableString.SHAKE.translate(Language.ENGLISH).length());
					} else if (lowercase.startsWith(TranslatableString.SCROLL.translate(Language.ENGLISH))) {
						effect = 4;
						message = message.substring(TranslatableString.SCROLL.translate(Language.ENGLISH).length());
					} else if (lowercase.startsWith(TranslatableString.SLIDE.translate(Language.ENGLISH))) {
						effect = 5;
						message = message.substring(TranslatableString.SLIDE.translate(Language.ENGLISH).length());
					} else if (Client.currentLanguage != Language.ENGLISH) {
						if (lowercase.startsWith(TranslatableString.WAVE.translate(Client.currentLanguage))) {
							effect = 1;
							message = message.substring(TranslatableString.WAVE.translate(Client.currentLanguage)
									.length());
						} else if (lowercase.startsWith(TranslatableString.WAVE2.translate(Client.currentLanguage))) {
							effect = 2;
							message = message.substring(TranslatableString.WAVE2.translate(Client.currentLanguage)
									.length());
						} else if (lowercase.startsWith(TranslatableString.SHAKE.translate(Client.currentLanguage))) {
							effect = 3;
							message = message.substring(TranslatableString.SHAKE.translate(Client.currentLanguage)
									.length());
						} else if (lowercase.startsWith(TranslatableString.SCROLL.translate(Client.currentLanguage))) {
							effect = 4;
							message = message.substring(TranslatableString.SCROLL.translate(Client.currentLanguage)
									.length());
						} else if (lowercase.startsWith(TranslatableString.SLIDE.translate(Client.currentLanguage))) {
							effect = 5;
							message = message.substring(TranslatableString.SLIDE.translate(Client.currentLanguage)
									.length());
						}
					}

					BufferedConnectionContext connection = Client.getActiveConnection();
					OutgoingFrame frame = OutgoingFrame.prepare(OutgoingFrameMeta.CHAT, connection.encryptor);
					frame.payload.writeByte(0);
					int start = -165875887 * frame.payload.offset;
					frame.payload.writeByte(colour);
					frame.payload.writeByte(effect);
					ComponentKeyRecord.encodeHuffman(frame.payload, message);
					frame.payload.writeSizeByte(frame.payload.offset * -165875887 - start);
					connection.sendFrame(frame);
				}
				break;
			case 116:
				int i_11_1 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class22631 = Widget.lookup(i_11_1);
				int i_0_5 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045] - 1;
				if (i_0_5 < 0 || i_0_5 > 9) {
					context.anInt7929 -= -1356601931;
				} else {
					class22631.method4235(i_0_5,
							(String) context.anObjectArray7918[(context.anInt7929 -= -1356601931) * 211787933],
							-691848142);
				}
				break;
			case 280:
				ScriptExecutionContext.method3486(context, (byte) -45);
				break;
			case 222:
				ScriptExecutionContext.method9690(context, (byte) -22);
				break;
			case 102:
				BaseCursorDefinitionProvider.method9860(context, 2031568012);
				break;
			case 524:
				ScriptExecutionContext.method15198(context);
				break;
			case 238:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.aClass632_Sub23_10272
						.getValue();
				break;
			case 376:
				context.anInt7924 -= -926911801;
				int i_0_25 = context.anIntArray7942[context.anInt7924 * 1841827045];
				int i_1_31 = context.anIntArray7942[context.anInt7924 * 1841827045 + 1];
				int i_2_26 = context.anIntArray7942[1841827045 * context.anInt7924 + 2];
				int i_3_25 = 255;
				int i_4_14 = 256;
				TurnMobCutsceneAction.aClass186_9434.method3710(Class171.aClass171_1952, i_0_25, i_1_31, i_3_25,
						Class156.aClass156_1876.method3293(), Class167.aClass167_1926, 0.0F, 0.0F, null, 0, i_4_14,
						i_2_26);
				break;
			case 1052:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = -1;
				break;
			case 884:
				ParallelHttpProvider.method7169(context, 1533594597);
				break;
			case 163:
				Class611 class61120 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class22638 = class61120.aClass226_7914;
				String string13 = (String) context.anObjectArray7918[(context.anInt7929 -= -1356601931) * 211787933];
				if (ScriptExecutionContext.method9239(string13, context) != null) {
					string13 = string13.substring(0, string13.length() - 1);
				}
				class22638.anObjectArray2508 = Class562_Sub1.method16248(string13, context);
				class22638.aBool2483 = true;
				break;
			case 72:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Client.isMember ? 1 : 0;
				break;
			case 1053:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = AsynchronousHttpRequestCreator
						.method6954();
				break;
			case 1195:
				ScriptExecutionContext.method5960(context, -997285381);
				break;
			case 509:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 100;
				break;
			case 905:
				ScriptExecutionContext.method8723(context);
				break;
			case 145:
				ScriptExecutionContext.method4008(context);
				break;
			case 913:
				Class49.method1111(context, 282726343);
				break;
			case 621:
				int i_1_40 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class226128 = Widget.lookup(i_1_40);
				context.anInt7924 -= -2049596966;
				int i_1_110 = 10;
				byte[] is4 = { (byte) context.anIntArray7942[context.anInt7924 * 1841827045] };
				byte[] is_2_ = { (byte) context.anIntArray7942[1 + 1841827045 * context.anInt7924] };
				Class650_Sub1.method16709(class226128, i_1_110, is4, is_2_, context, 1015648284);
				break;
			case 241:
				ScriptExecutionContext.method4642(context);
				break;
			case 742:
				context.anInt7924 -= -2049596966;
				int i_1_5 = context.anIntArray7942[context.anInt7924 * 1841827045];
				int i_2_4 = context.anIntArray7942[1841827045 * context.anInt7924 + 1];
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = i_1_5 | i_2_4;
				break;
			case 1090:
				Class611 class61128 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class22654 = class61128.aClass226_7914;
				Interface class22129 = class61128.aClass221_7913;
				ScriptExecutionContext.method3838(class22654, class22129, context,
						Class417.aClass480_Sub33_4650 == context.aClass480_Sub33_7935 ? Class227.aClass227_2562
								: Class227.aClass227_2563);
				break;
			case 936:
				context.stringVariables[context.anIntArray7943[context.counter * 1523704279]] = context.anObjectArray7918[(context.anInt7929 -= -1356601931) * 211787933];
				break;
			case 608:
				int i_28_ = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = PlayerVariableProvider.instance
						.method1549(i_28_);
				break;
			case 195:
				ScriptExecutionContext.method8722(context);
				break;
			case 452:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.voiceOverVolume
						.getValue();
				break;
			case 816:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.areaSoundsVolume
						.getValue();
				break;
			case 165:
				Class611 class61158 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class226111 = class61158.aClass226_7914;
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = class226111.height * 1362321717;
				break;
			case 31:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class31.anInt395 * 1004082977;
				break;
			case 138:
				ContainerHeader.method7118(context, (byte) 1);
				break;
			case 599:
				MenuOption class480_sub31_sub17 = PlayerVarpDefinitionIterator.method4143();
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = LoadingRequirementType
						.method594(class480_sub31_sub17, -30585040);
				context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = MenuOption
						.getAction(class480_sub31_sub17);
				context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = Class630.method13109(
						class480_sub31_sub17, -16803526);
				context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = HostNameIdentifier
						.method1378(class480_sub31_sub17);
				break;
			case 1033:
				ScriptExecutionContext.method1633(context);
				break;
			case 1082:
				ContainerHeader.method7116(context, 1784157628);
				break;
			case 618:
				ScriptExecutionContext.method3555(context);
				break;
			case 1184:
				context.anInt7924 -= -2049596966;
				int i_9_ = context.anIntArray7942[context.anInt7924 * 1841827045];
				int i_10_ = context.anIntArray7942[context.anInt7924 * 1841827045 + 1];
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class427.method7092(i_9_,
						i_10_, false);
				break;
			case 939:
				Class471.method8053(context, (byte) -27);
				break;
			case 1169:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Client.widgetSelected ? 1
						: 0;
				break;
			case 957:
				Class369.aClass261_Sub1_4079.reset();
				break;
			case 926:
				ScriptExecutionContext.method10046(context);
				break;
			case 626:
				Class611 class61114 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class22624 = class61114.aClass226_7914;
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = -592186295
						* class22624.component;
				break;
			case 1141:
				ScriptExecutionContext.method3188(context);
				break;
			case 423:
				ScriptExecutionContext.method3345(context, 2002652038);
				break;
			case 639:
				CursorDefinition.method10096(context);
				break;
			case 426:
				if (JavaFont.aClass288_8793 != null) {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 1;
					context.aClass288_7941 = JavaFont.aClass288_8793;
					context.aMap7939.put(VarpType.CLAN_SETTING, ClanVariableCollection.create(context.aClass288_7941));
				} else {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
				}
				break;
			case 157:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.groundDecoration
						.getValue() == 1 ? 1 : 0;
				break;
			case 474:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.idleAnimations
						.getValue();
				break;
			case 587:
				int i_1_7 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = PlayerVariableProvider.instance
						.method1547(i_1_7);
				break;
			case 139:
				Class592.method10025(context, -1462620331);
				break;
			case 113:
				ScriptExecutionContext.method16382(context);
				break;
			case 1087:
				Class650_Sub3.method16745(context, 675548716);
				break;
			case 410:
				AreaSoundVolumeNormaliser.method3846(context, -1951548277);
				break;
			case 748:
				context.anInt7924 -= -2049596966;
				Client.aShort10880 = (short) context.anIntArray7942[context.anInt7924 * 1841827045];
				if (Client.aShort10880 <= 0) {
					Client.aShort10880 = (short) 256;
				}
				Client.aShort10881 = (short) context.anIntArray7942[context.anInt7924 * 1841827045 + 1];
				if (Client.aShort10881 <= 0) {
					Client.aShort10881 = (short) 320;
				}
				break;
			case 1019:
				ScriptExecutionContext.method4644(context);
				break;
			case 1089:
				Class611 class61183 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class226154 = class61183.aClass226_7914;
				Interface class22185 = class61183.aClass221_7913;
				class226154.anInt2418 = 1731739231;
				class226154.anInt2486 = -1872598017 * Client.localPlayerIndex;
				class226154.anInt2420 = 0;
				if (-592186295 * class226154.component == -1 && !class22185.aBool2278) {
					PulseEvent.method7175(1857819631 * class226154.id);
				}
				break;
			case 329:
				int i_2_9 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				int i_3_10 = Client.aClass448Array10869[i_2_9].method7375();
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 2 == i_3_10 ? 1 : 0;
				break;
			case 411:
				Class611 class611 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class226 = class611.aClass226_7914;
				class226.anInt2465 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045] * 1912613655;
				break;
			case 1159:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.textures
						.getValue() == 1 ? 1 : 0;
				break;
			case 674:
				ScriptExecutionContext.method5857(context);
				break;
			case 751:
				ScriptExecutionContext.method1618(context);
				break;
			case 982:
				int i_10_2 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class22627 = Widget.lookup(i_10_2);
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 1 == class22627.anInt2418 * 286135323 ? class22627.anInt2486
						* -643054127
						: -1;
				break;
			case 487:
				WallDecoration.method18093(context, (byte) 50);
				break;
			case 218:
				ScriptExecutionContext.method9348(context, 1551810231);
				break;
			case 271:
				Class490.method8472();
				break;
			case 1191:
				ScriptExecutionContext.method3748(context, 1122685165);
				break;
			case 801:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.cpu
						.getValue();
				break;
			case 58:
				int i_0_21 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = ItemDefinition.aClass192_8339
						.method3806(i_0_21).method3882() ? 1 : 0;
				break;
			case 64:
				Class431.method7146(context, -2095203714);
				break;
			case 169:
				Class611 class61119 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class22635 = class61119.aClass226_7914;
				class22635.aBool2415 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045] == 1;
				Widget.redraw(class22635);
				break;
			case 783:
				ScriptExecutionContext.method4038(context);
				break;
			case 39:
				ScriptExecutionContext.method5282(context, (byte) 114);
				break;
			case 327:
				ScriptExecutionContext.method9319(context, 597960232);
				break;
			case 573:
				ScriptExecutionContext.method3494(context, 335473582);
				break;
			case 330:
				Class611 class61176 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class226141 = class61176.aClass226_7914;
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = -1909412215
						* class226141.anInt2382;
				break;
			case 214:
				Class56.anInt622 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045] * 1490974785;
				break;
			case 815:
				ScriptExecutionContext.method5156(context, (byte) 111);
				break;
			case 1193:
				ScriptExecutionContext.method8739(context);
				break;
			case 1071:
				Class611 class61181 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				if (class61181.aClass226_7914.component * -592186295 == -1) {
					if (context.aBool7932) {
						throw new RuntimeException("");
					}
					throw new RuntimeException("");
				}
				Widget class226149 = class61181.method10313();
				class226149.aClass226Array2542[class61181.aClass226_7914.component * -592186295] = null;
				Widget.redraw(class226149);
				break;
			case 367:
				context.anInt7924 -= -2049596966;
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = -1;
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = -1;
				break;
			case 978:
				Class471.method8056(context, 1545995063);
				break;
			case 418:
				Class599.method10161();
				break;
			case 46:
				context.anInt7924 -= 195773364;
				int i_5_10 = context.anIntArray7942[1841827045 * context.anInt7924];
				int i_6_11 = context.anIntArray7942[context.anInt7924 * 1841827045 + 1];
				int i_7_7 = context.anIntArray7942[1841827045 * context.anInt7924 + 2];
				int i_8_4 = context.anIntArray7942[3 + context.anInt7924 * 1841827045];
				Class553 class5531 = Client.aClass460_10760.method7679();
				ResourceManager.method6709((i_5_10 >> 14 & 0x3fff) - 2051316501 * class5531.x, (i_5_10 & 0x3fff)
						- class5531.z * -180305283, i_6_11 << 2, i_7_7, i_8_4, false);
				break;
			case 998:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = RendererType.windowMode();
				break;
			case 202:
				context.anIntArray7942[context.anInt7924 * 1841827045 - 1] = QuestDefinition.loader.get(
						context.anIntArray7942[context.anInt7924 * 1841827045 - 1]).method4381(
						PlayerVariableProvider.instance) ? 1 : 0;
				break;
			case 143:
				String string15 = (String) context.anObjectArray7918[(context.anInt7929 -= -1356601931) * 211787933];
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = TwitchTV
						.setStreamTitle(string15);
				break;
			case 910:
				Class611 class61160 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class226117 = class61160.aClass226_7914;
				Interface class22164 = class61160.aClass221_7913;
				Class490.method8473(class226117, class22164, context, (byte) -30);
				break;
			case 420:
				ScriptExecutionContext.method7345(context, (byte) 3);
				break;
			case 810:
				int i_2_5 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Class480_Sub31_Sub18 class480_sub31_sub18 = Class436.method7271();
				if (class480_sub31_sub18 != null) {
					boolean bool = class480_sub31_sub18.method17861(i_2_5 >> 28 & 0x3, i_2_5 >> 14 & 0x3fff,
							i_2_5 & 0x3fff, Class626.anIntArray8037);
					if (bool) {
						context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class626.anIntArray8037[1];
						context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class626.anIntArray8037[2];
					} else {
						context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = -1;
						context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = -1;
					}
				} else {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = -1;
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = -1;
				}
				break;
			case 156:
				ScriptExecutionContext.method3542(context, -836854107);
				break;
			case 994:
				ScriptExecutionContext.method5041(context, (byte) 11);
				break;
			case 119:
				if (Client.aBool10589) {
					Class380.aClass380_4221.method6225();
				}
				break;
			case 931:
				ScriptExecutionContext.method5002(context);
				break;
			case 860:
				ScriptExecutionContext.method2872(context);
				break;
			case 284:
				Class611 class61180 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class226148 = class61180.aClass226_7914;
				Interface class22181 = class61180.aClass221_7913;
				ScriptExecutionContext.method16136(class226148, class22181, context, 630783619);
				break;
			case 405:
				ScriptExecutionContext.method6937(context, 625672426);
				break;
			case 41:
				ScriptExecutionContext.method5438(context, 853120331);
				break;
			case 794:
				MobMessage class482 = context.aClass600_Sub1_Sub3_Sub1_7936.getMessage();
				if (null == class482) {
					context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = "";
				} else {
					context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = class482.getText();
				}
				break;
			case 853:
				context.anInt7924 -= -2049596966;
				int i_4_16 = context.anIntArray7942[1841827045 * context.anInt7924];
				int i_5_22 = context.anIntArray7942[context.anInt7924 * 1841827045 + 1];
				Class369.aClass261_Sub1_4079.method4822(i_4_16, i_5_22, 563160800);
				break;
			case 714:
				int i_3_14 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = context.aClass288_7941.anIntArray3213[i_3_14];
				break;
			case 1044:
				ScriptExecutionContext.method3533(context, 1889385909);
				break;
			case 168:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Client.anInt10784
						* -1593807967;
				break;
			case 1016:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
				break;
			case 364:
				ScriptExecutionContext.method3579(context, (byte) -9);
				break;
			case 1057:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.screenSize
						.getValue();
				break;
			case 672:
				ScriptExecutionContext.method8059(context);
				break;
			case 200:
				ScriptExecutionContext.method10197(context);
				break;
			case 580:
				ScriptExecutionContext.method15953(context, 559697560);
				break;
			case 209:
				ScriptExecutionContext.method3342(context);
				break;
			case 47:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = context.aClass288_7941.allowGuests ? 1
						: 0;
				break;
			case 864:
				UnderlayDefinition.method13373(context, -1033231352);
				break;
			case 450:
				AreaSoundVolumeNormaliser.method3847(context, -1848286282);
				break;
			case 774:
				IncomingFrameMeta.method6296(context, (byte) -128);
				break;
			case 368:
				ScriptExecutionContext.method10250(context);
				break;
			case 909:
				ScriptExecutionContext.method3560(context, -1014413299);
				break;
			case 973:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = TwitchWebcamDevice
						.method2861();
				break;
			case 308:
				IdentikitDefinitionProvider.method5494(context, 845723865);
				break;
			case 1161:
				Class536.method9177(context, 2097636229);
				break;
			case 528:
				Class611 class61175 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class226140 = class61175.aClass226_7914;
				Interface class22175 = class61175.aClass221_7913;
				ScriptExecutionContext.method5137(class226140, class22175, context, -709004963);
				break;
			case 126:
				ScriptExecutionContext.method9170(context);
				break;
			case 153:
				ScriptExecutionContext.method6018(context, -1647947148);
				break;
			case 360:
				ScriptExecutionContext.method9169(context);
				break;
			case 240:
				int i_0_36 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class226132 = Widget.lookup(i_0_36);
				Interface class22126 = Class598.loadedInterfaces[i_0_36 >> 16];
				Class198.method3872(class226132, class22126, context);
				break;
			case 993:
				int i_11_10 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				if (-2028985543 * Client.anInt10892 == 2 && i_11_10 < -1763746795 * Client.friendCount) {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Client.friends[i_11_10].aBool570 ? 1
							: 0;
				} else {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
				}
				break;
			case 442:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
				break;
			case 1080:
				ScriptExecutionContext.method8544(context);
				break;
			case 849:
				Class611 class61125 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class22649 = class61125.aClass226_7914;
				context.anInt7924 -= -2049596966;
				int id2 = context.anIntArray7942[context.anInt7924 * 1841827045];
				int i_2_12 = context.anIntArray7942[context.anInt7924 * 1841827045 + 1];
				ParameterDefinition definition2 = ParameterDefinition.loader.get(id2);
				if (-125275839 * definition2.defaultInt != i_2_12) {
					class22649.method4240(id2, i_2_12, (byte) -21);
				} else {
					class22649.method4242(id2);
				}
				break;
			case 725:
				ScriptExecutionContext.method3941(context);
				break;
			case 870:
				int i_6_3 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				QuickChatCategory class480_sub31_sub9 = AnimateObjectCutsceneAction.aClass420_9538.get(i_6_3);
				if (class480_sub31_sub9.messages == null) {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
				} else {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = class480_sub31_sub9.messages.length;
				}
				break;
			case 893:
				CachedDefinitionLoader.method13913(context, -1745859014);
				break;
			case 1133:
				ScriptExecutionContext.method4745(context);
				break;
			case 823:
				ScriptExecutionContext.method13722(context, -255533587);
				break;
			case 872:
				context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = context.stringVariables[context.anIntArray7943[1523704279 * context.counter]];
				break;
			case 86:
				Class199.preferences.setValue(Class199.preferences.buildArea,
						context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045]);
				Client.savePreferences();
				Client.sentPreferences = false;
				break;
			case 1124:
				Class640.method13204(context, (byte) 8);
				break;
			case 675:
				ScriptExecutionContext.method9586(context, 1873047592);
				break;
			case 1176:
				AsynchronousOutputStream.method9166(context, (byte) -119);
				break;
			case 550:
				String string31 = (String) context.anObjectArray7918[(context.anInt7929 -= -1356601931) * 211787933];
				if (!string31.equals("")) {
					BufferedConnectionContext connection = Client.getActiveConnection();
					OutgoingFrame frame = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_3956, connection.encryptor);
					frame.payload.writeByte(Buffer.encodedStringLength(string31));
					frame.payload.writeCString(string31);
					connection.sendFrame(frame);
				}
				break;
			case 493:
				ScriptExecutionContext.method4762(context);
				break;
			case 1167:
				ScriptExecutionContext.method8819(context);
				break;
			case 835:
				Class186.method6959();
				break;
			case 1015:
				context.anInt7924 -= 1122685165;
				break;
			case 300:
				if (Class369.aClass261_Sub1_4079.method4837() != Class270.aClass270_2997) {
					throw new RuntimeException();
				}
				((Class281_Sub3) Class369.aClass261_Sub1_4079.method4876())
						.method15297(context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045] == 1);
				break;
			case 557:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = ItemDefinition.aClass192_8339
						.method3769();
				break;
			case 9:
				Class465.method7877(context, 293819605);
				break;
			case 1192:
				Class592.method10024(context, -983666506);
				break;
			case 401:
				ScriptExecutionContext.method4222(context);
				break;
			case 210:
				Class628.method13096(context, (byte) 12);
				break;
			case 559:
				context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = context.aClass288_7941.clanName;
				break;
			case 220:
				ScriptExecutionContext.method6712(context);
				break;
			case 172:
				Class199.preferences.setValue(Class199.preferences.idleAnimations,
						context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045]);
				Client.savePreferences();
				Client.sentPreferences = false;
				break;
			case 705:
				Class611 class61195 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class226173 = class61195.aClass226_7914;
				Interface class22172 = class61195.aClass221_7913;
				Class198.method3869(class22172, class226173);
				break;
			case 782:
				context.anInt7924 -= 195773364;
				int i_14_ = context.anIntArray7942[context.anInt7924 * 1841827045];
				int i_15_ = context.anIntArray7942[1 + context.anInt7924 * 1841827045];
				int i_16_1 = context.anIntArray7942[2 + context.anInt7924 * 1841827045];
				int i_17_1 = context.anIntArray7942[3 + 1841827045 * context.anInt7924];
				int i_18_1 = 256;
				TurnMobCutsceneAction.aClass186_9434.method3710(Class171.aClass171_1952, i_14_, i_15_, i_17_1,
						Class156.aClass156_1876.method3293(), Class167.aClass167_1926, 0.0F, 0.0F, null, 0, i_18_1,
						i_16_1);
				break;
			case 586:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = null == Client.aClass226_10798 ? -1
						: Client.aClass226_10798.id * 1857819631;
				break;
			case 649:
				ScriptExecutionContext.method15133(context, 1334250422);
				break;
			case 397:
				ScriptExecutionContext.method3492(context, (byte) -95);
				break;
			case 762:
				ScriptExecutionContext.method5206(context, 1122685165);
				break;
			case 641:
				ScriptExecutionContext.method6922(context, 672051584);
				break;
			case 98:
				int i_0_4 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = (int) (Math.random() * (1 + i_0_4));
				break;
			case 598:
				ScriptExecutionContext.method9890(context);
				break;
			case 1061:
				String string20 = (String) context.anObjectArray7918[(context.anInt7929 -= -1356601931) * 211787933];
				if (string20.startsWith(Class290_Sub1.crown(0)) || string20.startsWith(Class290_Sub1.crown(1))) {
					string20 = string20.substring(7);
				}
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = ItemSpriteConfiguration
						.method13634(string20);
				break;
			case 1059:
				String string41 = (String) context.anObjectArray7918[(context.anInt7929 -= -1356601931) * 211787933];
				OutgoingFrame class480_sub155 = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_4020,
						Client.gameConnection.encryptor);
				class480_sub155.payload.writeByte(string41.length() + 1);
				class480_sub155.payload.writeCString(string41);
				Client.gameConnection.sendFrame(class480_sub155);
				break;
			case 1094:
				context.anInt7924 -= 1122685165;
				break;
			case 1043:
				context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = context.aClass480_Sub33_7935.aString10231;
				break;
			case 7:
				context.anInt7928 -= 846585302;
				if (context.aLongArray7934[-47101501 * context.anInt7928] > context.aLongArray7934[-47101501
						* context.anInt7928 + 1]) {
					context.counter += context.anIntArray7943[1523704279 * context.counter] * -160194073;
				}
				break;
			case 225:
				int i_6_21 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class226155 = Widget.lookup(i_6_21);
				context.anInt7924 -= -2049596966;
				class226155.anInt2554 = context.anIntArray7942[1841827045 * context.anInt7924] * -87869317;
				class226155.anInt2428 = 1722970625 * context.anIntArray7942[1 + 1841827045 * context.anInt7924];
				Widget.redraw(class226155);
				break;
			case 650:
				context.anInt7924 -= -2049596966;
				int i_2_30 = context.anIntArray7942[1841827045 * context.anInt7924];
				int i_3_27 = context.anIntArray7942[context.anInt7924 * 1841827045 + 1];
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = i_2_30 | 1 << i_3_27;
				break;
			case 606:
				throw new RuntimeException("");
			case 355:
				ScriptExecutionContext.method3528(context);
				break;
			case 904:
				int i_9_1 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				if (null != Client.aString10890 && i_9_1 < 46303181 * Client.friendChatSize) {
					context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = Class551.friendsChat[i_9_1].accountName;
				} else {
					context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = "";
				}
				break;
			case 854:
				ScriptExecutionContext.method2863(context);
				break;
			case 227:
				Class445.method7360(context);
				break;
			case 237:
				ScriptExecutionContext.method3460(context);
				break;
			case 583:
				ScriptExecutionContext.method9689(context);
				break;
			case 602:
				ValueType.method7038(context);
				break;
			case 29:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.brightness
						.getValue();
				break;
			case 1142:
				context.longVariables[context.anIntArray7943[context.counter * 1523704279]] = context.aLongArray7934[(context.anInt7928 -= 423292651)
						* -47101501];
				break;
			case 196:
				Class611 class61115 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class22628 = class61115.aClass226_7914;
				class22628.aBool2479 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045] == 1;
				Widget.redraw(class22628);
				break;
			case 160:
				ScriptExecutionContext.method5204(context);
				break;
			case 1008:
				ScriptExecutionContext.method5283(context);
				break;
			case 601:
				ScriptExecutionContext.method5836(context);
				break;
			case 188:
				context.anInt7924 -= 1122685165;
				int i_4_5 = context.anIntArray7942[context.anInt7924 * 1841827045];
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class281.method5259(i_4_5,
						873922893);
				break;
			case 18:
				Class611 class61182 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class226151 = class61182.aClass226_7914;
				Interface class22183 = class61182.aClass221_7913;
				ScriptExecutionContext.method9925(class226151, class22183, context);
				break;
			case 1170:
				Class471.method8054(context);
				break;
			case 291:
				ScriptExecutionContext.method3162(context);
				break;
			case 933:
				ScriptExecutionContext.method4415(context);
				break;
			case 154:
				Class369.aClass261_Sub1_4079.method4823(
						context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045] / 1000.0F, (byte) 0);
				break;
			case 203:
				ScriptExecutionContext.method10159(context);
				break;
			case 753:
				int i_47_2 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				if (Client.anInt10892 * -2028985543 == 2 && i_47_2 < -1763746795 * Client.friendCount) {
					BefriendedPlayer friend = Client.friends[i_47_2];
					context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = friend.name;
					if (friend.aString566 != null) {
						context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = friend.aString566;
					} else {
						context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = "";
					}
				} else {
					context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = "";
					context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = "";
				}
				break;
			case 1139:
				int i_0_1 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class2269 = Widget.lookup(i_0_1);
				String string42 = (String) context.anObjectArray7918[(context.anInt7929 -= -1356601931) * 211787933];
				if (ScriptExecutionContext.method9239(string42, context) != null) {
					string42 = string42.substring(0, string42.length() - 1);
				}
				class2269.anObjectArray2452 = Class562_Sub1.method16248(string42, context);
				class2269.aBool2483 = true;
				break;
			case 1068:
				ScriptExecutionContext.method811(context);
				break;
			case 1091:
				ScriptExecutionContext.method5286(context);
				break;
			case 100:
				ScriptExecutionContext.method10195(context);
				break;
			case 45:
				Class24.method773(context);
				break;
			case 1075:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = -2054546641
						* Class191.emailStatus;
				break;
			case 589:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.soundsEffectsVolume
						.getValue();
				break;
			case 723:
				String string21 = (String) context.anObjectArray7918[(context.anInt7929 -= -1356601931) * 211787933];
				int i_0_10 = 0;
				if (Class292.isDecimal(string21)) {
					i_0_10 = Client.parseDecimal(string21);
				}
				OutgoingFrame class480_sub153 = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_4001,
						Client.gameConnection.encryptor);
				class480_sub153.payload.writeInt(i_0_10);
				Client.gameConnection.sendFrame(class480_sub153);
				break;
			case 387:
				Class611 class61127 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class22653 = class61127.aClass226_7914;
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 731337999 * class22653.scrollWidth;
				break;
			case 50:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = BaseGraphicDefinitionProvider
						.method10303();
				break;
			case 570:
				Class480_Sub22 class480_sub222 = (Class480_Sub22) context.anObjectArray7918[(context.anInt7929 -= -1356601931) * 211787933];
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = class480_sub222.plane
						* -841913453;
				break;
			case 1112:
				IdentikitDefinitionProvider.method5493(context);
				break;
			case 1144:
				LruDefinitionCacheIterator.method675(context);
				break;
			case 502:
				Class506.method8738();
				break;
			case 1065:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Client.anInt10622
						* -1420335485;
				break;
			case 527:
				ScriptExecutionContext.method9887(context);
				break;
			case 48:
				if (null != MobChatCutsceneAction.aClass288_9645) {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 1;
					context.aClass288_7941 = MobChatCutsceneAction.aClass288_9645;
					context.aMap7939.put(VarpType.CLAN_SETTING, ClanVariableCollection.create(context.aClass288_7941));
				} else {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
				}
				break;
			case 349:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.mobShadows
						.getValue() == 1 ? 1 : 0;
				break;
			case 10:
				Class611 class61154 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class226104 = class61154.aClass226_7914;
				Interface class22157 = class61154.aClass221_7913;
				Widget.method7527(class226104, class22157, true, 1, context);
				break;
			case 422:
				Class611 class6118 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class22612 = class6118.aClass226_7914;
				Interface class2218 = class6118.aClass221_7913;
				ScriptExecutionContext.method3838(class22612, class2218, context, Class227.aClass227_2566);
				break;
			case 668:
				int i_5_23 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.desiredToolkit
						.compatible(i_5_23);
				break;
			case 669:
				ScriptExecutionContext.method7850(context);
				break;
			case 8:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = null == ItemDefinition.aClass192_8339 ? 0
						: 1;
				break;
			case 465:
				ScriptExecutionContext.method3761(context);
				break;
			case 776:
				ScriptExecutionContext.method5277(context);
				break;
			case 1064:
				int i_3_30 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				if (-1 != i_3_30) {
					int i_4_20 = i_3_30 >> 14 & 0x3fff;
					int i_5_24 = i_3_30 & 0x3fff;
					Class553 class5534 = Client.aClass460_10760.method7679();
					i_4_20 -= class5534.x * 2051316501;
					if (i_4_20 < 0) {
						i_4_20 = 0;
					} else if (i_4_20 >= Client.aClass460_10760.method7680()) {
						i_4_20 = Client.aClass460_10760.method7680();
					}
					i_5_24 -= class5534.z * -180305283;
					if (i_5_24 < 0) {
						i_5_24 = 0;
					} else if (i_5_24 >= Client.aClass460_10760.method7707()) {
						i_5_24 = Client.aClass460_10760.method7707();
					}
					Class156.anInt1886 = 1672889529 * ((i_4_20 << 9) + 256);
					TurnMobCutsceneAction.anInt9433 = ((i_5_24 << 9) + 256) * 1490979241;
				} else {
					Class156.anInt1886 = -1672889529;
					TurnMobCutsceneAction.anInt9433 = -1490979241;
				}
				break;
			case 324:
				Class611 class61162 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class226120 = class61162.aClass226_7914;
				Interface class22166 = class61162.aClass221_7913;
				ScriptExecutionContext.method4327(class226120, class22166, context);
				break;
			case 712:
				Class581.method9843(context, (byte) 8);
				break;
			case 887:
				CutsceneMob.method3387(context, -497862481);
				break;
			case 390:
				ScriptExecutionContext.method6103(context, 1976602460);
				break;
			case 447:
				context.anInt7924 -= -926911801;
				TurnMobCutsceneAction.aClass186_9434.method3617(context.anIntArray7942[context.anInt7924 * 1841827045],
						context.anIntArray7942[1 + 1841827045 * context.anInt7924]);
				break;
			case 184:
				int i_14_1 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = context.aClass288_7941.memberNames[i_14_1];
				break;
			case 702:
				ScriptExecutionContext.method14269(context, 2134042342);
				break;
			case 16:
				ScriptExecutionContext.method8956(context);
				break;
			case 140:
				ContainerHeader.method7117(context, -1057514101);
				break;
			case 634:
				ScriptExecutionContext.method5281(context, -969845917);
				break;
			case 952:
				Class611 class6116 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class2267 = class6116.aClass226_7914;
				Interface class2215 = class6116.aClass221_7913;
				ScriptExecutionContext.method3327(class2267, class2215, context);
				break;
			case 561:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 1660153155 * context.aClass288_7941.memberCount;
				break;
			case 176:
				ScriptExecutionContext.method3569(context, 1618599947);
				break;
			case 437:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = context.aClass288_7941.currentOwner
						* -369623583;
				break;
			case 174:
				context.anInt7924 -= -2049596966;
				int i_29_ = context.anIntArray7942[1841827045 * context.anInt7924];
				int i_30_ = context.anIntArray7942[1 + context.anInt7924 * 1841827045];
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = i_29_ / i_30_;
				break;
			case 1062:
				ScriptExecutionContext.method15093(context, 991315680);
				break;
			case 152:
				ScriptExecutionContext.method2286(context, -1892512399);
				break;
			case 170:
				MobDefaults.method9581(context, -1925416200);
				break;
			case 637:
				context.anInt7924 -= 195773364;
				int i_1_29 = context.anIntArray7942[1841827045 * context.anInt7924];
				int i_2_25 = context.anIntArray7942[context.anInt7924 * 1841827045 + 1];
				int i_3_24 = context.anIntArray7942[1841827045 * context.anInt7924 + 2];
				Class397 class3973 = Class397.create(i_1_29, i_2_25, i_3_24);
				Class369.aClass261_Sub1_4079.method4818(class3973);
				class3973.cache();
				break;
			case 466:
				Npc npc = (Npc) context.aClass600_Sub1_Sub3_Sub1_7936;
				String name = npc.name;
				NpcDefinition definition8 = npc.definition;
				if (definition8.morphisms != null) {
					definition8 = definition8.morph(PlayerVariableProvider.instance, PlayerVariableProvider.instance);
					if (null == definition8) {
						name = "";
					} else {
						name = definition8.name;
					}
				}
				if (null == name) {
					name = "";
				}
				context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = name;
				break;
			case 808:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 679863921 * Class277.anInt3125;
				break;
			case 476:
				ScriptExecutionContext.method6021(context);
				break;
			case 95:
				int i_3_8 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Class562_Sub1 class562_sub11 = Class166_Sub19.method15132(i_3_8);
				if (class562_sub11 != null) {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = class562_sub11.anInt7554
							* -1833179177;
					context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = class562_sub11.aString10366;
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = class562_sub11
							.method16238();
					context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = class562_sub11
							.method16236();
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = class562_sub11.anInt7553
							* -1320445881;
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = class562_sub11.anInt10368 * 1668853513;
					context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = class562_sub11.aString10365;
				} else {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = -1;
					context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = "";
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
					context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = "";
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
					context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = "";
				}
				break;
			case 382:
				Class480_Sub31_Sub19.method17893(context);
				break;
			case 365:
				ScriptExecutionContext.method3366(context);
				break;
			case 898:
				ScriptExecutionContext.method3535(context);
				break;
			case 262:
				ScriptExecutionContext.method3551(context);
				break;
			case 780:
				ScriptExecutionContext.method2259(context);
				break;
			case 788:
				ScriptExecutionContext.method7387(context);
				break;
			case 118:
				ScriptExecutionContext.method7415(context);
				break;
			case 523:
				Class38.method1019(context);
				break;
			case 855:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = context.anIntArray7943[1523704279 * context.counter];
				break;
			case 207:
				ScriptExecutionContext.method3583(context);
				break;
			case 541:
				Class660.method13658(context);
				break;
			case 844:
				if (!Class369.aClass261_Sub1_4079.method4837().method5070()) {
					throw new RuntimeException();
				}
				Class281_Sub1 class281_sub1 = (Class281_Sub1) Class369.aClass261_Sub1_4079.method4876();
				class281_sub1.method15213(Class401.aClass401_8081, -1, 0.0F, 845020061);
				Client.aBool10611 = true;
				break;
			case 709:
				context.anInt7929 -= 1581763434;
				String string14 = (String) context.anObjectArray7918[context.anInt7929 * 211787933];
				String string_2_ = (String) context.anObjectArray7918[211787933 * context.anInt7929 + 1];
				if (0 != 1667858447 * Client.localPrivilege || (!Client.aBool10765 || Client.aBool10766)
						&& !Client.aBool10769) {
					BufferedConnectionContext class832 = Client.getActiveConnection();
					OutgoingFrame class480_sub151 = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_4034,
							class832.encryptor);
					class480_sub151.payload.writeShort(0);
					int i_3_12 = -165875887 * class480_sub151.payload.offset;
					class480_sub151.payload.writeCString(string14);
					ComponentKeyRecord.encodeHuffman(class480_sub151.payload, string_2_);
					class480_sub151.payload.writeSizeShort(-165875887 * class480_sub151.payload.offset - i_3_12,
							-1696067253);
					class832.sendFrame(class480_sub151);
				}
				break;
			case 294:
				BaseNpcDefinitionProvider.method5068(context);
				break;
			case 28:
				ScriptExecutionContext.method9382(context);
				break;
			case 530:
				ScriptExecutionContext.method3538(context);
				break;
			case 301:
				Class491.method8481(context);
				break;
			case 555:
				context.anInt7924 -= 1318458529;
				int valueType = context.anIntArray7942[context.anInt7924 * 1841827045];
				int keyType = context.anIntArray7942[1841827045 * context.anInt7924 + 1];
				int id3 = context.anIntArray7942[2 + 1841827045 * context.anInt7924];
				int key = context.anIntArray7942[1841827045 * context.anInt7924 + 3];
				int index = context.anIntArray7942[4 + 1841827045 * context.anInt7924];

				if (id3 == -1) {
					throw new RuntimeException();
				}
				EnumDefinition definition3 = EnumDefinition.loader.get(id3);
				if (definition3.keyType.getId() != keyType) {
					throw new RuntimeException();
				}
				if (definition3.valueType.getId() != valueType) {
					throw new RuntimeException();
				}
				int[] keys = definition3.getKeys(Integer.valueOf(key));
				if (index < 0 || keys == null || keys.length <= index) {
					throw new RuntimeException();
				}
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = keys[index];
				break;
			case 961:
				int i_0_20 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = ItemDefinition.aClass192_8339
						.method3806(i_0_20).method3878();
				break;
			case 1047:
				Class536.method9172(context);
				break;
			case 1046:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = AsynchronousOutputStream.anInt7300 * 571679743;
				break;
			case 1117:
				int i_0_3 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Class480_Sub31_Sub18 class480_sub31_sub181 = Class495.method8553(i_0_3);
				if (null == class480_sub31_sub181) {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = -1;
				} else {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = -667632177
							* class480_sub31_sub181.anInt11424;
				}
				break;
			case 25:
				int i_2_28 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				if (Class598.loadedInterfaces[i_2_28] == null) {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
				} else {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class598.loadedInterfaces[i_2_28].children.length;
				}
				break;
			case 1134:
				int i_2_8 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				String string9 = (String) context.anObjectArray7918[(context.anInt7929 -= -1356601931) * 211787933];
				ChecksumTableEntry.method6356(i_2_8, string9);
				break;
			case 338:
				Class660.method13656(context);
				break;
			case 711:
				Class455.method7419(context);
				break;
			case 545:
				ScriptExecutionContext.method3287(context);
				break;
			case 934:
				String string7 = (String) context.anObjectArray7918[(context.anInt7929 -= -1356601931) * 211787933];
				context.anInt7924 -= -2049596966;
				int i_6_6 = context.anIntArray7942[1841827045 * context.anInt7924];
				int i_7_3 = context.anIntArray7942[1 + context.anInt7924 * 1841827045];
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = string7.indexOf(i_6_6,
						i_7_3);
				break;
			case 270:
				Class465.method7878(context);
				break;
			case 986:
				Class470.method8042(context);
				break;
			case 235:
				ChecksumTable.method7083(context);
				break;
			case 59:
				ScriptExecutionContext.method17530(context);
				break;
			case 395:
				boolean bool11 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045] == 1;
				Class637.method13160(bool11 ? 3 : 2);
				break;
			case 451:
				ScriptExecutionContext.method1032(context);
				break;
			case 462:
				Class581.method9839(context);
				break;
			case 980:
				Class611 class6111 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class2261 = class6111.aClass226_7914;
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = -1901639223
						* class2261.positionY;
				break;
			case 554:
				ScriptExecutionContext.method15406(context);
				break;
			case 391:
				ValueType.method7039(context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045]);
				break;
			case 497:
				method3248(context);
				break;
			case 1119:
				VariableBitsDefinition.method5472(context);
				break;
			case 750:
				ScriptExecutionContext.method17578(context);
				break;
			case 12:
				ScriptExecutionContext.method4739(context);
				break;
			case 508:
				Class591.method9994(context);
				break;
			case 829:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class419.localFcRank;
				break;
			case 647:
				ScriptExecutionContext.method6280(context, Client.localPlayer);
				break;
			case 389:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Client.localPlayer.yaw
						.value();
				break;
			case 890:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class485.osName
						.startsWith("mac") ? 1 : 0;
				break;
			case 755:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.fog
						.supported() ? 1 : 0;
				break;
			case 719:
				ValueType.method7043(context);
				break;
			case 1181:
				int i_2_32 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class226129 = Widget.lookup(i_2_32);
				Interface class22170 = Class598.loadedInterfaces[i_2_32 >> 16];
				Class351.method5969(class226129, class22170, context);
				break;
			case 212:
				ScriptExecutionContext.method7087(context);
				break;
			case 356:
				ScriptExecutionContext.method10160(context);
				break;
			case 141:
				ScriptExecutionContext.method3992(context);
				break;
			case 252:
				Class486.method8249(context);
				break;
			case 701:
				QuestDefinition class2341 = QuestDefinition.loader
						.get(context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045]);
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = class2341.anIntArray2599 == null ? 0
						: class2341.anIntArray2599.length;
				break;
			case 786:
				context.aLongArray7934[(context.anInt7928 += 423292651) * -47101501 - 1] = ((Long) context.script.anObjectArray11388[context.counter * 1523704279])
						.longValue();
				break;
			case 404:
				int i_3_12 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class22646 = Widget.lookup(i_3_12);
				Interface class22125 = Class598.loadedInterfaces[i_3_12 >> 16];
				class22646.anInt2418 = 1731739231;
				class22646.anInt2486 = -1872598017 * Client.localPlayerIndex;
				class22646.anInt2420 = 0;
				if (-592186295 * class22646.component == -1 && !class22125.aBool2278) {
					PulseEvent.method7175(1857819631 * class22646.id);
				}
				break;
			case 400:
				ScriptExecutionContext.method8728(context);
				break;
			case 680:
				context.anInt7928 -= 846585302;
				if (context.aLongArray7934[context.anInt7928 * -47101501] >= context.aLongArray7934[1
						+ context.anInt7928 * -47101501]) {
					context.counter += -160194073 * context.anIntArray7943[1523704279 * context.counter];
				}
				break;
			case 278:
				ParticlesPreference.method16437(context);
				break;
			case 946:
				ScriptExecutionContext.method5401(context, -371387373);
				break;
			case 956:
				ScriptExecutionContext.method1685(context, 1590771425);
				break;
			case 940:
				context.anInt7924 -= -2049596966;
				int i_4_20 = context.anIntArray7942[context.anInt7924 * 1841827045];
				int i_5_25 = context.anIntArray7942[1841827045 * context.anInt7924 + 1];
				ConnectionInfo.method13843(2, i_4_20, i_5_25, "");
				break;
			case 949:
				ScriptExecutionContext.method3367(context);
				break;
			case 899:
				ScriptExecutionContext.method2288(context, 1362321717);
				break;
			case 104:
				MapSize.method4418();
				Class56.aBool642 = false;
				break;
			case 287:
				Class445.method7358(context, (short) -29414);
				break;
			case 728:
				ScriptExecutionContext.method9318(context, 990761182);
				break;
			case 247:
				context.anInt7924 -= -2049596966;
				int i_11_ = context.anIntArray7942[context.anInt7924 * 1841827045];
				int i_12_ = context.anIntArray7942[1 + 1841827045 * context.anInt7924];
				if (0 == i_11_) {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
				} else if (i_12_ == 0) {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 2147483647;
				} else {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = (int) Math.pow(i_11_,
							1.0 / i_12_);
				}
				break;
			case 837:
				Class611 class61149 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class22696 = class61149.aClass226_7914;
				class22696.aString2368 = (String) context.anObjectArray7918[(context.anInt7929 -= -1356601931) * 211787933];
				break;
			case 96:
				int i_1_47 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class226150 = Widget.lookup(i_1_47);
				Interface class22182 = Class598.loadedInterfaces[i_1_47 >> 16];
				ScriptExecutionContext.method1102(class226150, class22182, context);
				break;
			case 619:
				if (Class193.keyRecorder.held(82)) {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 1;
				} else {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
				}
				break;
			case 274:
				ScriptExecutionContext.method8703(context);
				break;
			case 707:
				ScriptExecutionContext.method6043(context, (byte) 1);
				break;
			case 548:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = context.aClass480_Sub33_7935.anInt10228 * 1777256127;
				break;
			case 314:
				ParticleTriangle.method9821(context, -671615837);
				break;
			case 379:
				Widget.method15337(true);
				break;
			case 310:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = context.aClass288_7941.kickRank;
				break;
			case 1106:
				ScriptExecutionContext.method2234(context, 2111547548);
				break;
			case 562:
				AsynchronousOutputStream.method9164(context, (byte) -35);
				break;
			case 632:
				ScriptExecutionContext.method9296(context, (byte) -83);
				break;
			case 440:
				ContainerHeader.method7115(context, -935022794);
				break;
			case 662:
				VariableBitsDefinition class301 = (VariableBitsDefinition) context.script.anObjectArray11388[1523704279 * context.counter];
				VariableCollection interface132 = (VariableCollection) (context.anIntArray7943[1523704279 * context.counter] == 0 ? context.aMap7939
						.get(class301.varp.type) : context.aMap7940.get(class301.varp.type));
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = interface132
						.getVarbit(class301);
				break;
			case 1155:
				ScriptExecutionContext.method5000(context);
				break;
			case 106:
				ScriptExecutionContext.method7272(context, (byte) -78);
				break;
			case 424:
				context.anInt7924 -= -2049596966;
				int i_11_8 = context.anIntArray7942[context.anInt7924 * 1841827045];
				int i_12_8 = context.anIntArray7942[1 + context.anInt7924 * 1841827045];
				Class397 class3975 = Class397.create(i_11_8, i_11_8, i_11_8);
				if (-1.0F == class3975.x) {
					class3975.x = Float.POSITIVE_INFINITY;
				}
				if (class3975.y == -1.0F) {
					class3975.y = Float.POSITIVE_INFINITY;
				}
				if (-1.0F == class3975.z) {
					class3975.z = Float.POSITIVE_INFINITY;
				}
				Class369.aClass261_Sub1_4079.method4814(class3975);
				Class369.aClass261_Sub1_4079.method4823(i_12_8 / 1000.0F, (byte) 0);
				class3975.cache();
				break;
			case 320:
				ScriptExecutionContext.method8992(context, 804338000);
				break;
			case 858:
				int i_3_7 = Class11_Sub1.method2855();
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = (Class73.anInt1110 = Class199.preferences.currentToolkit
						.getValue() * -62049615) * 1159976529;
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = i_3_7;
				Class60.method1371();
				Client.aClass460_10760.method7705();
				Client.savePreferences();
				Client.sentPreferences = false;
				break;
			case 394:
				AsynchronousInputStream.method8771(context, -1605457394);
				break;
			case 743:
				Class611 class61190 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class226167 = class61190.aClass226_7914;
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 1668905963 * class226167.anInt2453;
				break;
			case 629:
				ScriptExecutionContext.method5371(context);
				break;
			case 1095:
				ScriptExecutionContext.method5959(context, -1850257435);
				break;
			case 791:
				ScriptExecutionContext.method1606(context, (short) -1529);
				break;
			case 256:
				Class611 class61151 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class22698 = class61151.aClass226_7914;
				Interface class22151 = class61151.aClass221_7913;
				Widget.method7527(class22698, class22151, false, 2, context);
				break;
			case 1048:
				context.anInt7924 -= -2049596966;
				boolean bool10 = context.anIntArray7942[1841827045 * context.anInt7924] == 1;
				boolean bool_1_ = 1 == context.anIntArray7942[1841827045 * context.anInt7924 + 1];
				Class369.aClass261_Sub1_4079.method4824(bool10, bool_1_, -917545159);
				break;
			case 136:
				Class493.method8527(context, 1212943923);
				break;
			case 1163:
				ScriptExecutionContext.method9018(context);
				break;
			case 134:
				ScriptExecutionContext.method4411(context, 31945223);
				break;
			case 155:
				context.anInt7924 -= -2049596966;
				Class480_Sub31_Sub2 class480_sub31_sub2 = WeakReferenceTable.aClass678_Sub12_558
						.get(context.anIntArray7942[1841827045 * context.anInt7924]);
				int i_4_7 = context.anIntArray7942[1 + context.anInt7924 * 1841827045];
				int i_5_12 = -1;
				for (int i_6_12 = 0; i_6_12 < -79519899 * class480_sub31_sub2.anInt10935; i_6_12++) {
					if (i_4_7 == class480_sub31_sub2.anIntArray10933[i_6_12]) {
						i_5_12 = class480_sub31_sub2.anIntArray10932[i_6_12];
						break;
					}
				}
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = i_5_12;
				break;
			case 997:
				String string32 = (String) context.anObjectArray7918[(context.anInt7929 -= -1356601931) * 211787933];
				int i_1_30 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				FontSpecification class91 = FontSpecification.create(Class80.fonts, i_1_30, 0);
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = class91.textWidth(
						string32, WeakReferenceTable.nameIcons);
				break;
			case 336:
				Class611 class61129 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class22655 = class61129.aClass226_7914;
				if (null == class22655.aString2473) {
					context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = "";
				} else {
					context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = class22655.aString2473;
				}
				break;
			case 760:
				ScriptExecutionContext.method4358(context);
				break;
			case 208:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = -181078013
						* ((Npc) context.aClass600_Sub1_Sub3_Sub1_7936).definition.anInt3015;
				break;
			case 877:
				ScriptExecutionContext.method8842(context, 73277771);
				break;
			case 1165:
				ScriptExecutionContext.method7325(context, (byte) 46);
				break;
			case 481:
				if (null != Client.aString10890) {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 46303181 * Client.friendChatSize;
				} else {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
				}
				break;
			case 809:
				Class611 class61172 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class226136 = class61172.aClass226_7914;
				Interface class22171 = class61172.aClass221_7913;
				Class550.method9333(class226136, class22171, context, 1427128761);
				break;
			case 627:
				ScriptExecutionContext.method1094(context, 1793588998);
				break;
			case 266:
				ScriptExecutionContext.method8295(context, -1565609290);
				break;
			case 264:
				int i_12_9 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				String string46 = (String) context.anObjectArray7918[(context.anInt7929 -= -1356601931) * 211787933];
				if (i_12_9 == -1) {
					throw new RuntimeException();
				}
				EnumDefinition definition7 = EnumDefinition.loader.get(i_12_9);
				if (definition7.valueType != CharacterType.S_LOWER) {
					throw new RuntimeException();
				}
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = definition7
						.containsValue(string46) ? 1 : 0;
				break;
			case 1:
				context.anInt7924 -= -2049596966;
				int i_3_26 = context.anIntArray7942[context.anInt7924 * 1841827045];
				int i_4_15 = context.anIntArray7942[1 + context.anInt7924 * 1841827045];
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = i_3_26 - i_4_15;
				break;
			case 159:
				ScriptExecutionContext.method3498(context);
				break;
			case 645:
				ScriptExecutionContext.method13522(context, -1724893728);
				break;
			case 23:
				ScriptExecutionContext.method15351(context);
				break;
			case 1171:
				context.anIntArray7942[context.anInt7924 * 1841827045 - 1] = QuestDefinition.loader.get(
						context.anIntArray7942[1841827045 * context.anInt7924 - 1]).method4375(
						PlayerVariableProvider.instance) ? 1 : 0;
				break;
			case 166:
				context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = QuestDefinition.loader
						.get(context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045]).aString2588;
				break;
			case 930:
				int i_1_10 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class22648 = Widget.lookup(i_1_10);
				context.anInt7924 -= -2049596966;
				int id1 = context.anIntArray7942[context.anInt7924 * 1841827045];
				int i_2_11 = context.anIntArray7942[context.anInt7924 * 1841827045 + 1];
				ParameterDefinition definition1 = ParameterDefinition.loader.get(id1);
				if (-125275839 * definition1.defaultInt != i_2_11) {
					class22648.method4240(id1, i_2_11, (byte) -21);
				} else {
					class22648.method4242(id1);
				}
				break;
			case 193:
				ScriptExecutionContext.method1031(context, (byte) 1);
				break;
			case 353:
				ScriptExecutionContext.method2866(context);
				break;
			case 236:
				context.anInt7924 -= 195773364;
				int i_1_41 = context.anIntArray7942[1841827045 * context.anInt7924];
				int i_2_33 = context.anIntArray7942[1 + context.anInt7924 * 1841827045];
				int i_3_29 = context.anIntArray7942[2 + 1841827045 * context.anInt7924];
				int i_4_19 = context.anIntArray7942[context.anInt7924 * 1841827045 + 3];
				Class553 class5533 = Client.aClass460_10760.method7679();
				Class148.method3177((i_1_41 >> 14 & 0x3fff) - class5533.x * 2051316501, (i_1_41 & 0x3fff) - -180305283
						* class5533.z, i_2_33 << 2, i_3_29, i_4_19);
				break;
			case 825:
				ScriptExecutionContext.method8725(context);
				break;
			case 43:
				int i_2_ = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				ItemDefinition itemDefinition = ItemDefinition.loader.get(i_2_);
				if (itemDefinition.noteTemplate * 1898423175 >= 0 && itemDefinition.noteInfo * 43311867 >= 0) {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 43311867 * itemDefinition.noteInfo;
				} else {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = i_2_;
				}
				break;
			case 1073:
				context.anIntArray7942[1841827045 * context.anInt7924 - 1] = QuestDefinition.loader
						.get(context.anIntArray7942[context.anInt7924 * 1841827045 - 1]).anInt2603 * 527933495;
				break;
			case 652:
				ScriptExecutionContext.method3359(context, (byte) 61);
				break;
			case 438:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class495_Sub1.aBool10328 ? 1
						: 0;
				break;
			case 369:
				ScriptExecutionContext.method5222(context, 723548868);
				break;
			case 677:
				ScriptExecutionContext.method4996(context);
				break;
			case 430:
				BaseVariableParameterDefinition class131 = (BaseVariableParameterDefinition) context.script.anObjectArray11388[context.counter * 1523704279];
				VariableCollection interface13 = (VariableCollection) (context.anIntArray7943[context.counter * 1523704279] == 0 ? context.aMap7939
						.get(class131.type) : context.aMap7940.get(class131.type));
				ValueType class423 = class131.aClass422_1515.getValueType();
				if (ValueType.INTEGER == class423) {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = interface13
							.getVarp(class131);
				} else if (class423 == ValueType.LONG) {
					context.aLongArray7934[(context.anInt7928 += 423292651) * -47101501 - 1] = interface13
							.getLongVarp(class131);
				} else if (class423 == ValueType.STRING) {
					try {
						String string6 = (String) interface13.getStringVarp(class131);
						if (string6 == null) {
							string6 = "null";
						}
						context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = string6;
					} catch (Exception exception) {
						throw new RuntimeException(exception);
					}
				} else {
					throw new RuntimeException();
				}
				break;
			case 1120:
				int i_4_3 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.sceneryShadows
						.compatible(i_4_3);
				break;
			case 269:
				ScriptExecutionContext.method9023(context);
				break;
			case 983:
				Class457.method7533(context, -187691309);
				break;
			case 1157:
				ScriptExecutionContext.method8840(context, 1646710041);
				break;
			case 950:
				int i_6_1 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class22615 = Widget.lookup(i_6_1);
				Interface class22111 = Class598.loadedInterfaces[i_6_1 >> 16];
				Widget.method7527(class22615, class22111, false, 1, context);
				break;
			case 99:
				Class611 class61197 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class226175 = class61197.aClass226_7914;
				ScriptExecutionContext.method1537(class226175, context);
				break;
			case 128:
				ScriptExecutionContext.method1164(context);
				break;
			case 571:
				context.anInt7924 -= -926911801;
				int i_333_ = context.anIntArray7942[1841827045 * context.anInt7924];
				int i_334_ = context.anIntArray7942[1 + context.anInt7924 * 1841827045];
				int i_335_ = context.anIntArray7942[2 + context.anInt7924 * 1841827045];
				long l1 = Class549.method9328(0, 0, 12, i_333_, i_334_, i_335_, (byte) 2);
				int i_336_ = CubeMapTextureProvider.method2867(l1);
				if (i_335_ < 1970) {
					i_336_--;
				}
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = i_336_;
				break;
			case 862:
				Class465.method7882(context, -827880733);
				break;
			case 932:
				ScriptExecutionContext.method3546(context);
				break;
			case 473:
				int i_6_ = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class22611 = Widget.lookup(i_6_);
				Interface class2217 = Class598.loadedInterfaces[i_6_ >> 16];
				ScriptExecutionContext.method6284(class22611, class2217, context);
				break;
			case 696:
				Class480_Sub22 class480_sub223 = (Class480_Sub22) context.anObjectArray7918[(context.anInt7929 -= -1356601931) * 211787933];
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 1227419133 * class480_sub223.anInt10155;
				break;
			case 276:
				ScriptExecutionContext.method8952(context);
				break;
			case 331:
				ScriptExecutionContext.method2170(context, -1774201127);
				break;
			case 1105:
				ScriptExecutionContext.method2231(context);
				break;
			case 1150:
				Class611 class61131 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class22660 = class61131.aClass226_7914;
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 1920469085 * class22660.parent;
				break;
			case 457:
				ScriptExecutionContext.method2335(context);
				break;
			case 585:
				ScriptExecutionContext.method548(context);
				break;
			case 538:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = ProxyingVariableLoader
						.method5080();
				break;
			case 746:
				Class470.method8043(context, -1200472381);
				break;
			case 14:
				String string33 = (String) context.anObjectArray7918[(context.anInt7929 -= -1356601931) * 211787933];
				context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = Class577
						.escapeHtml(string33);
				break;
			case 433:
				int i_18_2 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = Item
						.getColourHtml(i_18_2);
				break;
			case 798:
				context.anIntArray7942[1841827045 * context.anInt7924 - 1] = context.aClass288_7941.getMemberIndices()[context.anIntArray7942[1841827045 * context.anInt7924 - 1]];
				break;
			case 1175:
				int i_0_48 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = ItemDefinition.loader
						.get(i_0_48).anInt8296 * -623149269;
				break;
			case 380:
				int i_8_6 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class226100 = Widget.lookup(i_8_6);
				Interface class22153 = Class598.loadedInterfaces[i_8_6 >> 16];
				ScriptExecutionContext.method3838(class226100, class22153, context, Class227.aClass227_2564);
				break;
			case 131:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.water
						.getValue() == 2 ? 1 : 0;
				break;
			case 658:
				Class629.method13105(context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045], -860936628);
				break;
			case 690:
				ScriptExecutionContext.method7089(context);
				break;
			case 66:
				ScriptExecutionContext.method8801(context, (byte) -71);
				break;
			case 181:
				PlayerVariableProvider.method1560();
				break;
			case 929:
				ScriptExecutionContext.method3568(context, -165875887);
				break;
			case 901:
				ScriptExecutionContext.method2236(context, (byte) -72);
				break;
			case 429:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class31.anInt436 * 931994913;
				break;
			case 468:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.multisample
						.getValue();
				break;
			case 396:
				Class199.preferences.setValue(Class199.preferences.customCursors,
						context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045] != 0 ? 1 : 0);
				Client.savePreferences();
				break;
			case 414:
				context.anInt7924 -= -926911801;
				if (Class625.aBool8033) {
				}
				break;
			case 1173:
				int i_10_7 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class226110 = Widget.lookup(i_10_7);
				Interface class22159 = Class598.loadedInterfaces[i_10_7 >> 16];
				ScriptExecutionContext.method5906(class226110, class22159, context);
				break;
			case 892:
				Class465.method7881(context, (byte) -119);
				break;
			case 1026:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 272722337 * Class31.anInt429;
				break;
			case 967:
				ScriptExecutionContext.method3758(context, 217518113);
				break;
			case 979:
				ScriptExecutionContext.method1098(context, 1973000183);
				break;
			case 1070:
				float f1 = Class373.method6114(context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045]);
				Class480_Sub31_Sub19_Sub1 class480_sub31_sub19_sub1 = new Class480_Sub31_Sub19_Sub1(
						Class369.aClass261_Sub1_4079.method15144(), f1);
				Class369.aClass261_Sub1_4079.method4826(class480_sub31_sub19_sub1);
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = class480_sub31_sub19_sub1.anInt11433 * 361545025;
				break;
			case 730:
				context.anIntArray7942[context.anInt7924 * 1841827045 - 1] = QuestDefinition.loader.get(
						context.anIntArray7942[1841827045 * context.anInt7924 - 1]).method4380(
						PlayerVariableProvider.instance) ? 1 : 0;
				break;
			case 869:
				ScriptExecutionContext.method13518(context, 345563537);
				break;
			case 642:
				Class471.method8058((String) context.anObjectArray7918[(context.anInt7929 -= -1356601931) * 211787933]);
				break;
			case 499:
				if (Client.aString10673 != null) {
					context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = Client.aString10673;
				} else {
					context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = "";
				}
				break;
			case 1088:
				if (null != Class486.aClass480_Sub33_6643) {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 1;
					context.aClass480_Sub33_7935 = Class486.aClass480_Sub33_6643;
				} else {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
				}
				break;
			case 488:
				Class581.method9840(context, 1225585735);
				break;
			case 1123:
				context.anInt7924 -= -2049596966;
				int i_56_ = context.anIntArray7942[1841827045 * context.anInt7924];
				int i_57_ = context.anIntArray7942[1841827045 * context.anInt7924 + 1];
				ItemDefinition itemDefinition4 = ItemDefinition.loader.get(i_56_);
				if (i_57_ >= 1 && i_57_ <= 5 && null != itemDefinition4.widgetActions[i_57_ - 1]) {
					context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = itemDefinition4.widgetActions[i_57_ - 1];
				} else {
					context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = "";
				}
				break;
			case 542:
				int i_5_6 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Class480_Sub41 class480_sub41 = (Class480_Sub41) Client.aClass667_10791.get(i_5_6);
				if (class480_sub41 != null) {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 1;
				} else {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
				}
				break;
			case 1162:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Client.currentLanguage
						.getId();
				break;
			case 81:
				ScriptExecutionContext.method9384(context, (byte) 6);
				break;
			case 448:
				ScriptExecutionContext.method812(context, 1203625883);
				break;
			case 880:
				context.anInt7924 -= -2049596966;
				if (context.anIntArray7942[1841827045 * context.anInt7924] >= context.anIntArray7942[1 + context.anInt7924 * 1841827045]) {
					context.counter += context.anIntArray7943[context.counter * 1523704279] * -160194073;
				}
				break;
			case 920:
				Buffer.method15896(context, -242195182);
				break;
			case 1151:
				ScriptExecutionContext.method9655(context, -1198851495);
				break;
			case 1018:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class31.method909(
						853105891).getId();
				break;
			case 453:
				ScriptExecutionContext.method7406(context, -1406111159);
				break;
			case 439:
				LatencyMonitor.method1057(context);
				break;
			case 1199:
				ScriptExecutionContext.method5849(context, -1565364777);
				break;
			case 74:
				context.anInt7924 -= -2049596966;
				int i_66_ = context.anIntArray7942[1841827045 * context.anInt7924];
				boolean bool = context.anIntArray7942[1 + 1841827045 * context.anInt7924] == 1;
				if (Class495_Sub1.aClass667_10318 != null) {
					Linkable class480 = Class495_Sub1.aClass667_10318.get(i_66_);
					if (null != class480 && !bool) {
						class480.unlink();
					} else if (null == class480 && bool) {
						class480 = new Linkable();
						Class495_Sub1.aClass667_10318.put(i_66_, class480);
					}
				}
				break;
			case 358:
				Class611 class61164 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class226123 = class61164.aClass226_7914;
				Interface class22169 = class61164.aClass221_7913;
				ScriptExecutionContext.method10237(class226123, class22169, context, -351850258);
				break;
			case 839:
				context.anIntArray7942[context.anInt7924 * 1841827045 - 1] = QuestDefinition.loader.get(
						context.anIntArray7942[context.anInt7924 * 1841827045 - 1]).method4397(
						PlayerVariableProvider.instance) ? 1 : 0;
				break;
			case 290:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Client.recorder
						.getMouseX();
				break;
			case 999:
				context.anInt7924 -= -2049596966;
				int i_0_11 = context.anIntArray7942[1841827045 * context.anInt7924];
				int i_1_16 = context.anIntArray7942[1 + context.anInt7924 * 1841827045];
				QuickChatCategory class480_sub31_sub92 = AnimateObjectCutsceneAction.aClass420_9538.get(i_0_11);
				int i_2_17 = class480_sub31_sub92.subcategories[i_1_16];
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = i_2_17;
				break;
			case 347:
				ScriptExecutionContext.method10418(context);
				break;
			case 736:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.maxScreenSize
						.getValue();
				break;
			case 1131:
				ScriptExecutionContext.method7390(context, (byte) 3);
				break;
			case 1100:
				Class588.method9913(context, 928955809);
				break;
			case 13:
				Class626.method13055(context, 1216279234);
				break;
			case 830:
				Class611 class61121 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class22639 = class61121.aClass226_7914;
				Interface class22119 = class61121.aClass221_7913;
				ScriptExecutionContext.method5906(class22639, class22119, context);
				break;
			case 229:
				int i_3_3 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				context.anInt7929 -= 1581763434;
				String string5 = (String) context.anObjectArray7918[211787933 * context.anInt7929];
				String string_4_ = (String) context.anObjectArray7918[context.anInt7929 * 211787933 + 1];
				if (string5.length() <= 500 && string_4_.length() <= 500) {
					Class471.method8055(i_3_3, string5, string_4_, -466510937);
				}
				break;
			case 1102:
				Class611 class61152 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class22699 = class61152.aClass226_7914;
				Interface class22152 = class61152.aClass221_7913;
				ScriptExecutionContext.method4359(class22699, class22152, context);
				break;
			case 654:
				ScriptExecutionContext.method3567(context, -1357983859);
				break;
			case 540:
				ScriptExecutionContext.method5203(context);
				break;
			case 311:
				int i_31_ = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class22657 = Widget.lookup(i_31_);
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = class22657.anInt2453 * 1668905963;
				break;
			case 1041:
				int i_0_31 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				if (Client.aString10890 != null && i_0_31 < 46303181 * Client.friendChatSize) {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class551.friendsChat[i_0_31].rank;
				} else {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
				}
				break;
			case 498:
				CharSequence charsequence = (CharSequence) context.anObjectArray7918[(context.anInt7929 -= -1356601931) * 211787933];
				context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = SocketProvider
						.toUrlSafe(charsequence);
				break;
			case 535:
				ScriptExecutionContext.method9292(context, -36171896);
				break;
			case 246:
				ScriptExecutionContext.method8800(context, -407933270);
				break;
			case 841:
				String string16 = (String) context.anObjectArray7918[(context.anInt7929 -= -1356601931) * 211787933];
				OutgoingFrame class480_sub151 = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_4031,
						Client.gameConnection.encryptor);
				class480_sub151.payload.writeByte(string16.length() + 1);
				class480_sub151.payload.writeCString(string16);
				Client.gameConnection.sendFrame(class480_sub151);
				break;
			case 11:
				ScriptExecutionContext.method5145(context, 836015149);
				break;
			case 219:
				context.anInt7929 -= -1356601931;
				break;
			case 1174:
				Class539.method9209(context, -1765087067);
				break;
			case 409:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.orthoMode
						.getValue();
				break;
			case 1154:
				ScriptExecutionContext.method5221(context, (byte) -51);
				break;
			case 1182:
				Class54.method1166(context, -1175095157);
				break;
			case 531:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = -551331043
						* Class272.anInt3009;
				break;
			case 1166:
				Class199.preferences.setValue(Class199.preferences.textures,
						context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045] == 1 ? 1 : 0);
				Client.savePreferences();
				PreferenceManager.method744();
				Class60.method1371();
				Client.sentPreferences = false;
				break;
			case 847:
				ScriptExecutionContext.method3721(context, (byte) 82);
				break;
			case 1076:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Client.anInt10794 * 2082952993;
				break;
			case 346:
				Client.method17267(context, -394447365);
				break;
			case 85:
				ScriptExecutionContext.method6046(context, 1750340649);
				break;
			case 1066:
				ContainerHeader.method7113(context, 196216425);
				break;
			case 628:
				ResourceCache.method8754(context, (byte) -88);
				break;
			case 826:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = TwitchTV.getStreamState();
				break;
			case 1111:
				int i_7_8 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				if (Class598.loadedInterfaces[i_7_8] == null) {
					context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = "";
				} else {
					String string6 = Class598.loadedInterfaces[i_7_8].children[0].aString2394;
					if (string6 == null) {
						context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = "";
					} else {
						context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = string6
								.substring(0, string6.indexOf(':'));
					}
				}
				break;
			case 948:
				int i_5_11 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = ItemDefinition.loader
						.get(i_5_11).anInt8277 * -1862508455;
				break;
			case 464:
				ScriptExecutionContext.method5223(context, 1961657941);
				break;
			case 681:
				ScriptExecutionContext.method5097(context, -1163840899);
				break;
			case 505:
				ScriptExecutionContext.method6323(context, (byte) -52);
				break;
			case 514:
				String string4 = (String) context.anObjectArray7918[(context.anInt7929 -= -1356601931) * 211787933];
				Class126_Sub1.method14046(string4, -136452228);
				break;
			case 729:
				BaseCursorDefinitionProvider.method9857(context, -1625191958);
				break;
			case 127:
				Class611 class61196 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class226174 = class61196.aClass226_7914;
				Interface class22190 = class61196.aClass221_7913;
				Interface.method5417(class22190, class226174);
				break;
			case 1007:
				OverlayDefinition.method9931(context, (byte) 1);
				break;
			case 125:
				context.anInt7924 -= -2049596966;
				int i_5_24 = context.anIntArray7942[1841827045 * context.anInt7924];
				int id5 = context.anIntArray7942[1841827045 * context.anInt7924 + 1];
				ParameterDefinition parameter = ParameterDefinition.loader.get(id5);
				if (parameter.isString()) {
					context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = Client.aClass460_10760
							.getObjectLoader().get(i_5_24).getParameter(id5, parameter.defaultString);
				} else {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Client.aClass460_10760
							.getObjectLoader().get(i_5_24).getParameter(id5, parameter.defaultInt * -125275839);
				}
				break;
			case 221:
				context.anInt7924 -= 1122685165;
				int i_1_9 = context.anIntArray7942[1841827045 * context.anInt7924];
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class171.method3484(i_1_9);
				break;
			case 883:
				ScriptExecutionContext.method13726(context, (byte) -7);
				break;
			case 258:
				ScriptExecutionContext.method2237(context, -609574455);
				break;
			case 215:
				ScriptExecutionContext.method3993(context);
				break;
			case 1029:
				int i_3_13 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class22652 = Widget.lookup(i_3_13);
				Interface class22128 = Class598.loadedInterfaces[i_3_13 >> 16];
				Class608.method10292(class22652, class22128, context, (short) -7589);
				break;
			case 763:
				ScriptExecutionContext.method5278(context);
				break;
			case 544:
				context.anInt7924 -= -2049596966;
				int i_1_46 = context.anIntArray7942[context.anInt7924 * 1841827045];
				int i_2_35 = context.anIntArray7942[context.anInt7924 * 1841827045 + 1];
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = i_1_46 < i_2_35 ? i_1_46
						: i_2_35;
				break;
			case 881:
				ValueType.method7037(context, (short) 15352);
				break;
			case 36:
				Class611 class61177 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class226142 = class61177.aClass226_7914;
				Interface class22176 = class61177.aClass221_7913;
				Class468.method7911(class226142, class22176, context);
				break;
			case 895:
				ScriptExecutionContext.method1536(context);
				break;
			case 807:
				Class611 class61174 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class226138 = class61174.aClass226_7914;
				Interface class22173 = class61174.aClass221_7913;
				CutsceneMob.method3384(class226138, class22173, context, 65535);
				break;
			case 496:
				LoadingRequirementType.method593(context, -404736120);
				break;
			case 745:
				ScriptExecutionContext.method4320(context, -1866198687);
				break;
			case 812:
				ScriptExecutionContext.method15117(context, (short) 1033);
				break;
			case 713:
				ScriptExecutionContext.method5439(context, (byte) -35);
				break;
			case 935:
				context.anInt7924 -= 587320092;
				HitbarDefinition.method8950();
				Class181.method3550();
				AsynchronousOutputStream.anInt7301 = 1973933085 * context.anIntArray7942[1841827045 * context.anInt7924];
				Class128.anInt1500 = -1308389453 * context.anIntArray7942[context.anInt7924 * 1841827045 + 1];
				Language.anInt7969 = context.anIntArray7942[1841827045 * context.anInt7924 + 2] * 174971861;
				Class56.anInt643 = context.anIntArray7942[1841827045 * context.anInt7924 + 3] * 2009883063;
				CutsceneVariableProvider.anInt1902 = context.anIntArray7942[context.anInt7924 * 1841827045 + 4] * 1660061463;
				BaseObjectDefinitionProvider.anInt7322 = context.anIntArray7942[5 + context.anInt7924 * 1841827045] * 703472357;
				Class480_Sub11.anInt10054 = context.anIntArray7942[context.anInt7924 * 1841827045 + 6] * -773576051;
				HitsplatDefinitionProvider.anInt10464 = context.anIntArray7942[7 + 1841827045 * context.anInt7924] * 774110763;
				Client.anInt4915 = 452826533 * context.anIntArray7942[1841827045 * context.anInt7924 + 8];
				Class283.anInt3167 = 1111816303 * context.anIntArray7942[9 + 1841827045 * context.anInt7924];
				Class79.anInt1158 = 315728857 * context.anIntArray7942[10 + context.anInt7924 * 1841827045];
				Class487.anInt6668 = 1826545413 * context.anIntArray7942[context.anInt7924 * 1841827045 + 11];
				DequeIterator.images.fileLoaded(-1531895641 * CutsceneVariableProvider.anInt1902);
				DequeIterator.images.fileLoaded(-2048013587 * BaseObjectDefinitionProvider.anInt7322);
				DequeIterator.images.fileLoaded(-52123579 * Class480_Sub11.anInt10054);
				DequeIterator.images.fileLoaded(HitsplatDefinitionProvider.anInt10464 * -1741238141);
				DequeIterator.images.fileLoaded(Client.anInt4915 * 1502562861);
				DequeIterator.images.fileLoaded(-787737139 * Class487.anInt6668);
				Class80.fonts.fileLoaded(Class487.anInt6668 * -787737139);
				BufferedConnectionContext.aClass116_1212 = null;
				MobChatCutsceneAction.aClass116_9646 = null;
				Class166_Sub19.aClass116_9633 = null;
				Class272.aClass116_3008 = null;
				Sprite.aClass116_7904 = null;
				Class338.aClass116_3626 = null;
				Class255.aClass116_2834 = null;
				LatencyMonitor.aClass116_552 = null;
				Class56.aBool642 = true;
				break;
			case 959:
				String string6 = (String) context.anObjectArray7918[(context.anInt7929 -= -1356601931) * 211787933];
				long l5 = Class368.method6101();
				if (0L == l5) {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 5;
				} else {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = CacheableEntity
							.method15590(l5, string6);
				}
				break;
			case 749:
				Widget.method4324(2089424456);
				ParticleTriangle.method9818(context);
				break;
			case 1127:
				ScriptExecutionContext.method5418(context);
				break;
			case 876:
				ScriptExecutionContext.method5835(context, 2064671293);
				break;
			case 529:
				context.anIntArray7942[context.anInt7924 * 1841827045 - 2] = QuestDefinition.loader
						.get(context.anIntArray7942[context.anInt7924 * 1841827045 - 2]).anIntArrayArray2607[context.anIntArray7942[context.anInt7924 * 1841827045 - 1]][0];
				context.anInt7924 -= 1122685165;
				break;
			case 1160:
				int i_1_32 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				if (null != Client.aString10890 && i_1_32 < Client.friendChatSize * 46303181) {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = -1188524879
							* Class551.friendsChat[i_1_32].world;
				} else {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
				}
				break;
			case 1168:
				ScriptExecutionContext.method17755(context);
				break;
			case 1200:
				ScriptExecutionContext.method9587(context, (byte) 115);
				break;
			case 966:
				ScriptExecutionContext.method2333(context);
				break;
			case 944:
				ScriptExecutionContext.method6097(context);
				break;
			case 593:
				ScriptExecutionContext.method13520(context, (byte) 46);
				break;
			case 441:
				ScriptExecutionContext.method5158(context, (byte) -84);
				break;
			case 543:
				context.anInt7924 -= -2049596966;
				int i_0_39 = context.anIntArray7942[context.anInt7924 * 1841827045];
				int i_1_44 = context.anIntArray7942[context.anInt7924 * 1841827045 + 1];
				if (Client.localPlayer.appearance != null) {
					Client.localPlayer.appearance.setColour(i_0_39, i_1_44);
				}
				break;
			case 383:
				ScriptExecutionContext.method10249(context);
				break;
			case 279:
				Class280.anInt3154 = 0;
				break;
			case 305:
				ScriptExecutionContext.method6094(context);
				break;
			case 65:
				DequeIterator.method13363(context);
				break;
			case 456:
				int i_1_1 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Class369.aClass261_Sub1_4079.method4827(i_1_1, 578223817);
				break;
			case 1078:
				int i_2_34 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = context.aClass288_7941.memberRanks[i_2_34];
				break;
			case 490:
				ScriptExecutionContext.method3969(context);
				break;
			case 1147:
				ScriptExecutionContext.method1544(context, 534880621);
				break;
			case 1036:
				ScriptExecutionContext.method3413(context, 523034128);
				break;
			case 988:
				int i_3_11 = context.anIntArray7943[1523704279 * context.counter] >> 16;
				int i_4_4 = context.anIntArray7943[context.counter * 1523704279] & 0xffff;
				int i_5_7 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				if (i_5_7 < 0 || i_5_7 > 5000) {
					throw new RuntimeException();
				}
				context.anIntArray7930[i_3_11] = i_5_7;
				int i_6_5 = -1;
				if (i_4_4 == CharacterType.I_LOWER.getId()) {
					i_6_5 = 0;
				}
				for (int i_7_5 = 0; i_7_5 < i_5_7; i_7_5++) {
					context.anIntArrayArray7922[i_3_11][i_7_5] = i_6_5;
				}
				break;
			case 325:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class16.method685(TimeUtil
						.time());
				break;
			case 432:
				context.anInt7924 -= 1122685165;
				break;
			case 228:
				context.anInt7924 -= -2049596966;
				int i_5_13 = context.anIntArray7942[context.anInt7924 * 1841827045];
				int i_6_12 = context.anIntArray7942[1841827045 * context.anInt7924 + 1];
				ParameterDefinition definition4 = ParameterDefinition.loader.get(i_6_12);
				if (definition4.isString()) {
					context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = ((Class480_Sub31_Sub1) Class548.aClass7_Sub1_7467
							.get(i_5_13)).getOrDefault(i_6_12, definition4.defaultString);
				} else {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = ((Class480_Sub31_Sub1) Class548.aClass7_Sub1_7467
							.get(i_5_13)).getOrDefault(i_6_12, -125275839 * definition4.defaultInt);
				}
				break;
			case 1196:
				int i_12_7 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class226119 = Widget.lookup(i_12_7);
				Interface class22165 = Class598.loadedInterfaces[i_12_7 >> 16];
				ScriptExecutionContext.method13220(class226119, class22165, context);
				break;
			case 891:
				Class655.method13549(context, -2074671199);
				break;
			case 253:
				OverlayDefinition.method9929((Class600_Sub1) context.anInterface55_7937, context);
				break;
			case 53:
				ScriptExecutionContext.method8987(context);
				break;
			case 486:
				Class572.method9672(context, -1432256060);
				break;
			case 388:
				ScriptExecutionContext.method7059(context, (short) 640);
				break;
			case 146:
				Class581.method9837(context, 1209440630);
				break;
			case 491:
				int i_5_8 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class22643 = Widget.lookup(i_5_8);
				Interface class22123 = Class598.loadedInterfaces[i_5_8 >> 16];
				ScriptExecutionContext.method5906(class22643, class22123, context);
				break;
			case 889:
				ScriptExecutionContext.method7395(context, (byte) -18);
				break;
			case 670:
				ScriptExecutionContext.method6095(context);
				break;
			case 518:
				ScriptExecutionContext.method8699(context);
				break;
			case 449:
				context.anInt7924 -= -2049596966;
				int i_4_2 = context.anIntArray7942[1841827045 * context.anInt7924];
				int i_5_4 = context.anIntArray7942[1841827045 * context.anInt7924 + 1];
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Class367.method6096(i_4_2,
						i_5_4, false, false, -2067061605);
				break;
			case 907:
				ScriptExecutionContext.method15096(context, 1851684495);
				break;
			case 378:
				Class611 class61150 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class22697 = class61150.aClass226_7914;
				context.anInt7924 -= -926911801;
				int i_9_7 = context.anIntArray7942[context.anInt7924 * 1841827045] - 1;
				int i_10_6 = context.anIntArray7942[1841827045 * context.anInt7924 + 1];
				int i_11_6 = context.anIntArray7942[1841827045 * context.anInt7924 + 2];
				if (i_9_7 < 0 || i_9_7 > 9) {
					throw new RuntimeException();
				}
				MobDefaults.method9579(class22697, i_9_7, i_10_6, i_11_6, context);
				break;
			case 871:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Client.localPlayer.yaw
						.value() >> 3;
				break;
			case 135:
				Class629.method13106(context, -1574934216);
				break;
			case 769:
				ScriptExecutionContext.method9585(context, 1309220911);
				break;
			case 91:
				Class611 class61118 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class22634 = class61118.aClass226_7914;
				int i_0_7 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045] - 1;
				if (i_0_7 < 0 || i_0_7 > 9) {
					context.anInt7929 -= -1356601931;
				} else {
					class22634.method4235(i_0_7,
							(String) context.anObjectArray7918[(context.anInt7929 -= -1356601931) * 211787933],
							-691848142);
				}
				break;
			case 636:
				Class491.method8479(context, (byte) -64);
				break;
			case 342:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = IdleAnimationsPreference
						.method16557();
				break;
			case 954:
				Class611 class6115 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class2266 = class6115.aClass226_7914;
				Interface class2214 = class6115.aClass221_7913;
				Class458.method7542(class2266, class2214, context);
				break;
			case 685:
				ScriptExecutionContext.method1030(context, (byte) 76);
				break;
			case 848:
				Class445.method7359(context, (byte) -112);
				break;
			case 757:
				int i_161_ = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = ItemDefinition.aClass192_8339
						.method3806(i_161_).method3889() ? 1 : 0;
				break;
			case 522:
				ScriptExecutionContext.method5003(context, (short) -12310);
				break;
			case 655:
				Class166_Sub3.method15077();
				break;
			case 761:
				ScriptExecutionContext.method3559(context, (byte) 1);
				break;
			case 519:
				CustomisedItem.method13891(context, 1818101548);
				break;
			case 124:
				Class596.method10110(context);
				break;
			case 546:
				ScriptExecutionContext.method8802(context, 2051372597);
				break;
			case 789:
				Class611 class61186 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class226162 = class61186.aClass226_7914;
				context.anInt7924 -= 1122685165;
				int i_3_34 = context.anIntArray7942[context.anInt7924 * 1841827045] - 1;
				if (i_3_34 < 0 || i_3_34 > 9) {
					throw new RuntimeException();
				}
				Client.method17268(class226162, i_3_34, context);
				break;
			case 1005:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = (int) (ItemDefinition.aClass192_8339
						.method3770() / 60000L);
				break;
			case 1143:
				ScriptExecutionContext.method2862(context);
				break;
			case 827:
				Class611 class61170 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class226134 = class61170.aClass226_7914;
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 1668905963 * class226134.anInt2453;
				break;
			case 990:
				ScriptExecutionContext.method3750(context);
				break;
			case 6:
				ScriptExecutionContext.method6084(context);
				break;
			case 224:
				Class611 class61194 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class226172 = class61194.aClass226_7914;
				ScriptExecutionContext.method5394(class226172, context);
				break;
			case 112:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = ParticleSystem
						.getParticleSetting();
				break;
			case 1006:
				ScriptExecutionContext.method13852(context);
				break;
			case 492:
				int i_0_45 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = (int) (Math.random() * i_0_45);
				break;
			case 903:
				ScriptExecutionContext.method583(context);
				break;
			case 914:
				String string1 = (String) context.anObjectArray7918[(context.anInt7929 -= -1356601931) * 211787933];
				BufferedConnectionContext class83 = Client.getActiveConnection();
				OutgoingFrame class480_sub15 = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_3992,
						class83.encryptor);
				class480_sub15.payload.writeByte(0);
				int i_8_ = -165875887 * class480_sub15.payload.offset;
				class480_sub15.payload.writeCString(string1);
				class480_sub15.payload.writeShort(context.aClass357_7946.id * -973678773);
				context.aClass357_7946.message.encode(class480_sub15.payload, context.aClass357_7946.anIntArray3818);
				class480_sub15.payload.writeSizeByte(-165875887 * class480_sub15.payload.offset - i_8_);
				class83.sendFrame(class480_sub15);
				break;
			case 706:
				ScriptExecutionContext.method4223(context);
				break;
			case 1114:
				Class199.preferences.setValue(Class199.preferences.aClass632_Sub8_10280,
						context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045]);
				Client.aClass460_10760.method7705();
				Client.savePreferences();
				Client.sentPreferences = false;
				break;
			case 687:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = Client.recorder
						.getMouseY();
				break;
			case 352:
				ScriptExecutionContext.method7353(context);
				break;
			case 588:
				ScriptExecutionContext.method9294(context);
				break;
			case 444:
				LatencyMonitor.method1056(context);
				break;
			case 1177:
				Class611 class61184 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class226157 = class61184.aClass226_7914;
				Interface class22162 = class61184.aClass221_7913;
				ScriptExecutionContext.method7011(class226157, class22162, context);
				break;
			case 767:
				int i_4_23 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class226166 = Widget.lookup(i_4_23);
				Interface class22184 = Class598.loadedInterfaces[i_4_23 >> 16];
				ScriptExecutionContext.method5906(class226166, class22184, context);
				break;
			case 692:
				int i_9_8 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = ThemeMusicVolumeNormaliser
						.isLatinLetter((char) i_9_8) ? 1 : 0;
				break;
			case 494:
				if (null != Client.aString10609) {
					context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = Client.aString10609;
				} else {
					context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = "";
				}
				break;
			case 906:
				Class611 class61189 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class226165 = class61189.aClass226_7914;
				ScriptExecutionContext.method9293(class226165, context);
				break;
			case 560:
				Class611 class61188 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class226164 = class61188.aClass226_7914;
				ScriptExecutionContext.method2233(class226164, context);
				break;
			case 359:
				Class480_Sub22 class480_sub22 = CustomisedItem.method13894(
						(Class480_Sub22) context.anObjectArray7918[(context.anInt7929 -= -1356601931) * 211787933],
						1964066940);
				context.anInt7924 -= 195773364;
				class480_sub22.plane += context.anIntArray7942[context.anInt7924 * 1841827045] * -380409189;
				class480_sub22.anInt10154 += context.anIntArray7942[1 + 1841827045 * context.anInt7924] * -904958353;
				class480_sub22.anInt10155 += context.anIntArray7942[1841827045 * context.anInt7924 + 2] * 556291925;
				class480_sub22.anInt10156 += 1050217283 * context.anIntArray7942[context.anInt7924 * 1841827045 + 3];
				context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = class480_sub22;
				break;
			case 179:
				long l = TimeUtil.time();
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = (int) (l / 86400000L) - 11745;
				break;
			case 315:
				System.out.println(context.anObjectArray7918[(context.anInt7929 -= -1356601931) * 211787933]);
				break;
			case 512:
				Class611 class61185 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class226161 = class61185.aClass226_7914;
				String string48 = (String) context.anObjectArray7918[(context.anInt7929 -= -1356601931) * 211787933];
				if (ScriptExecutionContext.method9239(string48, context) != null) {
					string48 = string48.substring(0, string48.length() - 1);
				}
				class226161.anObjectArray2447 = Class562_Sub1.method16248(string48, context);
				class226161.aBool2483 = true;
				break;
			case 648:
				context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = Client.localPlayer
						.method17971();
				break;
			case 435:
				Class611 class61187 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class226163 = class61187.aClass226_7914;
				int i_2_38 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				ParameterDefinition class331 = ParameterDefinition.loader.get(i_2_38);
				if (class331.isString()) {
					context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = class226163
							.method4239(i_2_38, class331.defaultString, 219650637);
				} else {
					context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = class226163
							.method4238(i_2_38, -125275839 * class331.defaultInt, -2072479445);
				}
				break;
			case 427:
				Class199.preferences.setValue(Class199.preferences.voiceOverVolume,
						context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045]);
				Client.savePreferences();
				Client.sentPreferences = false;
				break;
			case 485:
				context.anInt7924 -= -2049596966;
				int id4 = context.anIntArray7942[context.anInt7924 * 1841827045];
				int i_1_11 = context.anIntArray7942[1 + 1841827045 * context.anInt7924];
				EnumDefinition definition5 = EnumDefinition.loader.get(id4);
				if (CharacterType.S_LOWER == definition5.valueType) {

				}
				context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = definition5
						.getString(i_1_11);
				break;
			case 454:
				ScriptExecutionContext.method8238(context);
				break;
			case 495:
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = context.aClass480_Sub33_7935.aByte10232;
				break;
			case 149:
				ScriptExecutionContext.method5099(context);
				break;
			case 857:
				ScriptExecutionContext.method8991(context);
				break;
			case 398:
				context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = QuestDefinition.loader
						.get(context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045]).aString2587;
				break;
			case 1003:
				ScriptExecutionContext.method15581(context);
				break;
			case 754:
				ScriptExecutionContext.method16135(context);
				break;
			case 469:
				Class611 class61157 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class226109 = class61157.aClass226_7914;
				Interface class22158 = class61157.aClass221_7913;
				ScriptExecutionContext.method1159(class226109, class22158, context);
				break;
			case 32:
				ScriptExecutionContext.method5396(context);
				break;
			case 17:
				HashTable class667 = context.script.aClass667Array11399[context.anIntArray7943[context.counter * 1523704279]];
				LinkableInt class480_sub24 = (LinkableInt) class667
						.get(context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045]);
				if (class480_sub24 != null) {
					context.counter += 439482617 * class480_sub24.value;
				}
				break;
			case 322:
				ScriptExecutionContext.method9322(context);
				break;
			case 717:
				Class611 class61130 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
				Widget class22656 = class61130.aClass226_7914;
				class22656.anInt2391 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045] * 1873131179;
				Widget.redraw(class22656);
				break;
			case 1055:
				ScriptExecutionContext.method782(context);
				break;
			case 191:
				ScriptExecutionContext.method522(context);
				break;
			case 1039:
				ScriptExecutionContext.method3497(context);
				break;
			case 306:
				ScriptExecutionContext.method5150(context);
				break;
			case 1013:
				ScriptExecutionContext.method9339(context);
				break;
			case 1188:
				Class280.anInt3154 = 0;
				break;
			case 421:
				ScriptExecutionContext.method5133(context);
				break;
			case 42:
				int i_5_3 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				Widget class22625 = Widget.lookup(i_5_3);
				class22625.anInt2524 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045] * 657627567;
				break;
			case 875:
				ScriptExecutionContext.method3545(context);
				break;
			case 733:
				ScriptExecutionContext.method5267(context);
				break;
			case 190:
				int i_0_34 = context.anIntArray7942[(context.anInt7924 -= 1122685165) * 1841827045];
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = ItemDefinition.loader
						.get(i_0_34).members ? 1 : 0;
				break;
			case 741:
				ScriptExecutionContext.method3490(context);
				break;
			case 615:
				Class257.method4766();
		}
	}

	private static void method12812(ScriptExecutionContext context) {
		if (8 != Client.gameState * -1501875989 && -1501875989 * Client.gameState != 16 || Class628.method13100()) {
			context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 1;
		} else if (Class671.aBool8458) {
			context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
		} else if (1725723199557740843L * Class480_Sub1.aLong9966 > TimeUtil.time() - 1000L) {
			context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 1;
		} else {
			Class671.aBool8458 = true;
			BufferedConnectionContext connection = Client.getActiveConnection();
			OutgoingFrame frame = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_4008, connection.encryptor);
			frame.payload.writeInt(-2086472651 * Class588.anInt7779);
			connection.sendFrame(frame);
			context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
		}
	}

	private static void method3248(ScriptExecutionContext context) {
		context.anInt7924 -= -2049596966;
		int i_4_1 = context.anIntArray7942[context.anInt7924 * 1841827045];
		int id = context.anIntArray7942[1 + context.anInt7924 * 1841827045];
		ParameterDefinition definition = ParameterDefinition.loader.get(id);

		if (definition.isString()) {
			String string6 = definition.defaultString;
			if (i_4_1 == -1) {
				context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = string6;
			} else {
				context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = QuestDefinition.loader
						.get(i_4_1).getParameter(id, string6);
			}
		} else {
			int i_6_5 = definition.defaultInt * -125275839;
			if (i_4_1 == -1) {
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = i_6_5;
				context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = QuestDefinition.loader
						.get(i_4_1).getParameter(id, i_6_5);
			}
		}
	}

	private static void method3478(ScriptExecutionContext context) {
		Class562_Sub1 class562_sub1 = Class326.method5797();
		if (null != class562_sub1) {
			context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = -1741841871
					* class562_sub1.anInt10370;
			context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = -1833179177
					* class562_sub1.anInt7554;
			context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = class562_sub1.aString10366;
			context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = class562_sub1.method16238();
			context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = class562_sub1.method16236();
			context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = class562_sub1.anInt7553
					* -1320445881;
			context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 1668853513 * class562_sub1.anInt10368;
			context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = class562_sub1.aString10365;
		} else {
			context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = -1;
			context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
			context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = "";
			context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
			context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = "";
			context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
			context.anIntArray7942[(context.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
			context.anObjectArray7918[(context.anInt7929 += -1356601931) * 211787933 - 1] = "";
		}
	}

}