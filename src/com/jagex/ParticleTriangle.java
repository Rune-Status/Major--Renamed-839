package com.jagex;

import com.jagex.twitch.TwitchTV;

public class ParticleTriangle {
	static String aString7753;

	public static String decodeString(Buffer buffer) {
		return CharacterType.decodeString(buffer, 32767);
	}

	static final void method9817(ScriptExecutionContext context) {
		SocketProvider.method13763();
	}

	static void method9818(ScriptExecutionContext class613) {
		int i_1_ = Class266.method5042();
		if (i_1_ < 0) {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = -1;
			class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = "";
			class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = "";
			class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = "";
			class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = "";
		} else {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = TwitchTV.aTwitchEventLiveStreams1243.viewerCounts[i_1_];
			class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = TwitchTV.aTwitchEventLiveStreams1243.channelUrls[i_1_];
			class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = TwitchTV.aTwitchEventLiveStreams1243.previewUrlTemplates[i_1_];
			class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = TwitchTV.aTwitchEventLiveStreams1243.streamTitles[i_1_];
			class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = TwitchTV.aTwitchEventLiveStreams1243.channelDisplayNames[i_1_];
		}
	}

	static int method9819(Npc class600_sub1_sub3_sub1_sub2) {
		NpcDefinition npcDefinition = class600_sub1_sub3_sub1_sub2.definition;
		if (null != npcDefinition.morphisms) {
			npcDefinition = npcDefinition.morph(PlayerVariableProvider.instance,
					PlayerVariableProvider.instance);
			if (npcDefinition == null) {
				return -1;
			}
		}
		int i_2_ = -1939755065 * npcDefinition.anInt3050;
		Class515 class515 = class600_sub1_sub3_sub1_sub2.method17958();
		int i_3_ = class600_sub1_sub3_sub1_sub2.aClass650_Sub2_11525.getAnimationId();
		if (i_3_ == -1 || class600_sub1_sub3_sub1_sub2.aClass650_Sub2_11525.aBool10566) {
			i_2_ = npcDefinition.anInt3029 * -1110085267;
		} else if (i_3_ == -272802151 * class515.anInt7025 || i_3_ == class515.anInt7055 * 902814335
				|| i_3_ == 1992950567 * class515.anInt7021 || i_3_ == 2085451397 * class515.anInt7027) {
			i_2_ = -232975009 * npcDefinition.anInt3042;
		} else if (i_3_ == class515.anInt7020 * -1451252109 || class515.anInt7030 * 671475489 == i_3_
				|| i_3_ == class515.anInt7032 * -1068126007 || class515.anInt7031 * 1418155347 == i_3_) {
			i_2_ = npcDefinition.anInt3065 * -1218621881;
		}
		return i_2_;
	}

	static final void method9820(ScriptExecutionContext class613, int i) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		Interface class221 = class611.aClass221_7913;
		ScriptExecutionContext.method4993(class226, class221, class613);
	}

	static final void method9821(ScriptExecutionContext class613, int i) {
		int i_4_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		int i_5_ = i_4_ >> 16;
		if (Class598.loadedInterfaces[i_5_] == null) {
			class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = "";
		} else {
			String string = Class598.loadedInterfaces[i_5_].children[i_4_].aString2394;
			if (null == string) {
				class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = "";
			} else {
				class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = string;
			}
		}
	}

	int centerX;
	int anInt7742;
	int anInt7743;
	int anInt7744;
	int anInt7745;
	int anInt7746;
	int centerZ;
	int anInt7748;
	int anInt7749;
	int anInt7750;
	int anInt7751;
	int centerY;

	boolean equals(ParticleTriangle other) {
		return other.centerX * -1984741165 == centerX * -1984741165
				&& -352293249 * centerZ == other.centerZ * -352293249
				&& 1179722655 * other.centerY == centerY * 1179722655;
	}

}