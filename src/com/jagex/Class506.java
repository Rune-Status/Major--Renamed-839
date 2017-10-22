package com.jagex;

import java.util.Stack;

public class Class506 {
	static Stack aStack6961 = new Stack();
	static int anInt6966;

	public static void method8738() {
		if (0 == Client.gameState * -1501875989 && !Class628.method13100() && !Class200.method3939()) {
			Class536.setGameState(2);
		}
	}

	public static int writeCharSequence(CharSequence sequence, int seqOffset, int seqLength, byte[] buffer, int offset) {
		int characters = seqLength - seqOffset;
		for (int index = 0; index < characters; index++) {
			char c = sequence.charAt(index + seqOffset);
			if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff') {
				buffer[offset + index] = (byte) c;
			} else if ('\u20ac' == c) {
				buffer[offset + index] = (byte) -128;
			} else if ('\u201a' == c) {
				buffer[index + offset] = (byte) -126;
			} else if ('\u0192' == c) {
				buffer[offset + index] = (byte) -125;
			} else if (c == '\u201e') {
				buffer[index + offset] = (byte) -124;
			} else if (c == '\u2026') {
				buffer[index + offset] = (byte) -123;
			} else if (c == '\u2020') {
				buffer[offset + index] = (byte) -122;
			} else if (c == '\u2021') {
				buffer[offset + index] = (byte) -121;
			} else if ('\u02c6' == c) {
				buffer[index + offset] = (byte) -120;
			} else if (c == '\u2030') {
				buffer[offset + index] = (byte) -119;
			} else if ('\u0160' == c) {
				buffer[offset + index] = (byte) -118;
			} else if ('\u2039' == c) {
				buffer[offset + index] = (byte) -117;
			} else if ('\u0152' == c) {
				buffer[offset + index] = (byte) -116;
			} else if (c == '\u017d') {
				buffer[offset + index] = (byte) -114;
			} else if ('\u2018' == c) {
				buffer[offset + index] = (byte) -111;
			} else if ('\u2019' == c) {
				buffer[index + offset] = (byte) -110;
			} else if (c == '\u201c') {
				buffer[index + offset] = (byte) -109;
			} else if (c == '\u201d') {
				buffer[offset + index] = (byte) -108;
			} else if ('\u2022' == c) {
				buffer[offset + index] = (byte) -107;
			} else if (c == '\u2013') {
				buffer[index + offset] = (byte) -106;
			} else if (c == '\u2014') {
				buffer[offset + index] = (byte) -105;
			} else if (c == '\u02dc') {
				buffer[offset + index] = (byte) -104;
			} else if ('\u2122' == c) {
				buffer[offset + index] = (byte) -103;
			} else if ('\u0161' == c) {
				buffer[offset + index] = (byte) -102;
			} else if (c == '\u203a') {
				buffer[offset + index] = (byte) -101;
			} else if ('\u0153' == c) {
				buffer[offset + index] = (byte) -100;
			} else if (c == '\u017e') {
				buffer[index + offset] = (byte) -98;
			} else if (c == '\u0178') {
				buffer[offset + index] = (byte) -97;
			} else {
				buffer[offset + index] = (byte) 63;
			}
		}
		return characters;
	}

	static void method8737() {
		if (14 == -1501875989 * Client.gameState) {
			Class51.method1135();
		}
		Client.lobbyConnection.stopConnection();
		Class197.method3862();
		HashedVariableCollection.aBool1483 = true;
		ReflectionRequest.resetActiveRequests();
		for (int i_4_ = 0; i_4_ < Client.aClass75Array10623.length; i_4_++) {
			Client.aClass75Array10623[i_4_] = null;
		}
		Client.widgetSelected = false;
		Client.anInt10692 = ((int) (Math.random() * 100.0) - 50) * 2058003129;
		Client.anInt10694 = ((int) (Math.random() * 110.0) - 55) * 2111447817;
		Client.anInt10615 = ((int) (Math.random() * 80.0) - 40) * -1513945043;
		Client.anInt10699 = ((int) (Math.random() * 120.0) - 60) * 544433199;
		Client.anInt10701 = ((int) (Math.random() * 30.0) - 20) * 1049201187;
		Client.aFloat10787 = (int) (Math.random() * 160.0) - 80 & 0x3fff;
		Class480_Sub33.method16088();
		for (int i_5_ = 0; i_5_ < 2048; i_5_++) {
			Client.players[i_5_] = null;
		}
		Client.localPlayer = null;
		Client.npcCount = 0;
		Client.anInt10862 = 0;
		Client.npcs.clear();
		Client.projectiles.clear();
		Client.animatedObjects.clear();
		Client.aClass649_10779.clear();
		Client.groundItems.clear();
		Class480_Sub12.aClass644_10068 = new Deque();
		Class480_Sub12.aClass644_10067 = new Deque();
		Class282.anInt3162 = 0;
		VoiceOverVolumeNormaliser.anInt1993 = 0;
		Class166_Sub6.anInt9539 = 0;
		Class122.anInt1471 = 0;
		MobShadowsPreference.anInt10475 = 0;
		ComponentKeyRecord.cameraViewX = 0;
		Class51.cameraViewZ = 0;
		Preference.cameraViewY = 0;
		Class525.anInt7217 = 0;
		BefriendedPlayer.anInt576 = 0;
		if (-1 != Client.anInt10790 * 1764783361) {
			Widget.method10427(1764783361 * Client.anInt10790);
		}
		for (Class480_Sub41 class480_sub41 = (Class480_Sub41) Client.aClass667_10791.first(); null != class480_sub41; class480_sub41 = (Class480_Sub41) Client.aClass667_10791
				.next()) {
			if (!class480_sub41.isLinked()) {
				class480_sub41 = (Class480_Sub41) Client.aClass667_10791.first();
				if (class480_sub41 == null) {
					break;
				}
			}
			Class480_Sub41.method9830(class480_sub41, true, false);
		}
		Client.anInt10790 = -1598589697;
		Client.aClass667_10791 = new HashTable(8);
		CutsceneMob.method3383((byte) 1);
		Client.aClass226_10793 = null;
		for (int i_6_ = 0; i_6_ < 8; i_6_++) {
			Client.playerOptions[i_6_] = null;
			Client.playerOptionReducedPriority[i_6_] = false;
			Client.playerOptionCursors[i_6_] = -1;
		}
		Class189.method3752();
		Client.aBool10616 = true;
		for (int i_7_ = 0; i_7_ < 104; i_7_++) {
			Client.aBoolArray10850[i_7_] = true;
		}
		for (int i_8_ = 0; i_8_ < 6; i_8_++) {
			Client.aClass448Array10869[i_8_] = new Class448();
		}
		Client.aClass460_10760.method7690().method9709();
		Client.aBool10611 = true;
		ObjectDefinition.aShortArray7446 = NpcDefinition.aShortArray3034 = ItemDefinition.aShortArray8265 = new short[256];
		ParticleTriangle.aString7753 = TranslatableString.WALK_HERE.translate(Client.currentLanguage);
		Class199.preferences.setValue(Class199.preferences.aClass632_Sub22_10284,
				Class199.preferences.removeRoofs.getValue());
		Client.anInt10657 = 0;
		Class36.method993();
		Class24.aClass587_336 = null;
		Class224.aLong2344 = 0L;
	}

	public Class600_Sub1 aClass600_Sub1_6962;
	Class497 aClass497_6963;
	boolean aBool6964;

	Class506() {

	}

	public boolean method8730(Toolkit toolkit, int i, int i_0_, byte i_1_) {
		int i_2_ = aClass600_Sub1_6962.method16258();
		if (aClass600_Sub1_6962.aClass139Array10373 != null) {
			for (int i_3_ = 0; i_3_ < aClass600_Sub1_6962.aClass139Array10373.length; i_3_++) {
				aClass600_Sub1_6962.aClass139Array10373[i_3_].anInt1585 <<= i_2_;
				if (aClass600_Sub1_6962.aClass139Array10373[i_3_].method2871(i + aClass497_6963.anInt6883 * -195662231,
						aClass497_6963.anInt6884 * -1554242261 + i_0_)
						&& aClass600_Sub1_6962.method16257(toolkit, i, i_0_)) {
					aClass600_Sub1_6962.aClass139Array10373[i_3_].anInt1585 >>= i_2_;
					return true;
				}
				aClass600_Sub1_6962.aClass139Array10373[i_3_].anInt1585 >>= i_2_;
			}
		}
		return false;
	}

	public static Class506 method570(boolean bool) {
		synchronized (aStack6961) {
			Class506 class506;
			if (aStack6961.isEmpty()) {
				class506 = new Class506();
			} else {
				class506 = (Class506) aStack6961.pop();
			}

			class506.aBool6964 = bool;
			return class506;
		}
	}

}