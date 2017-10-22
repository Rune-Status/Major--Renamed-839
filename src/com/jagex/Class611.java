package com.jagex;

public class Class611 {
	public static int anInt7915;

	public static int method10320() {
		return 1023171603 * Class277.anInt3120;
	}

	public static void method10321(int i, int i_2_, int i_3_, int i_4_, int i_5_) {
		for (Class480_Sub18 class480_sub18 = (Class480_Sub18) Class480_Sub18.aClass644_10111.head(); null != class480_sub18; class480_sub18 = (Class480_Sub18) Class480_Sub18.aClass644_10111
				.next()) {
			Class480_Sub18.method6905(class480_sub18, i, i_2_, i_3_, i_4_, -1296484740);
		}
		for (Class480_Sub18 class480_sub18 = (Class480_Sub18) Class480_Sub18.aClass644_10112.head(); class480_sub18 != null; class480_sub18 = (Class480_Sub18) Class480_Sub18.aClass644_10112
				.next()) {
			int i_6_ = 1;
			Class515 class515 = class480_sub18.npc.method17958();
			int i_7_ = class480_sub18.npc.aClass650_Sub2_11525.getAnimationId();
			if (-1 == i_7_ || class480_sub18.npc.aClass650_Sub2_11525.aBool10566) {
				i_6_ = 0;
			} else if (i_7_ == class515.anInt7025 * -272802151 || 902814335 * class515.anInt7055 == i_7_
					|| class515.anInt7021 * 1992950567 == i_7_ || class515.anInt7027 * 2085451397 == i_7_) {
				i_6_ = 2;
			} else if (i_7_ == -1451252109 * class515.anInt7020 || class515.anInt7030 * 671475489 == i_7_
					|| class515.anInt7032 * -1068126007 == i_7_ || i_7_ == 1418155347 * class515.anInt7031) {
				i_6_ = 3;
			}
			if (i_6_ != class480_sub18.anInt10116 * 63208259) {
				int i_8_ = ParticleTriangle.method9819(class480_sub18.npc);
				NpcDefinition npcDefinition = class480_sub18.npc.definition;
				if (npcDefinition.morphisms != null) {
					npcDefinition = npcDefinition.morph(PlayerVariableProvider.instance,
							PlayerVariableProvider.instance);
				}
				if (npcDefinition == null || i_8_ == -1) {
					class480_sub18.anInt10135 = 1301352939;
					class480_sub18.anInt10116 = 910584171 * i_6_;
				} else if (class480_sub18.anInt10135 * 1796370749 != i_8_) {
					boolean bool = false;
					if (class480_sub18.aClass456_10136 != null) {
						class480_sub18.anInt10140 -= 1401733632;
						if (class480_sub18.anInt10140 * 256466337 <= 0) {
							class480_sub18.aClass456_10136.method7431(100);
							TurnMobCutsceneAction.aClass186_9434.method3631(class480_sub18.aClass456_10136);
							class480_sub18.aClass456_10136 = null;
							bool = true;
						}
					} else {
						bool = true;
					}
					if (bool) {
						class480_sub18.anInt10140 = npcDefinition.anInt3070 * -1514553083;
						class480_sub18.anInt10135 = -1301352939 * i_8_;
						class480_sub18.anInt10116 = 910584171 * i_6_;
					}
				} else {
					class480_sub18.anInt10116 = i_6_ * 910584171;
					class480_sub18.anInt10140 = -1514553083 * npcDefinition.anInt3070;
				}
			}
			Class397 class397 = class480_sub18.npc.method10164().aClass397_4507;
			class480_sub18.anInt10115 = 238948139 * (int) class397.x;
			class480_sub18.anInt10117 = ((int) class397.x + (class480_sub18.npc.boundSize() << 8)) * -1142456477;
			class480_sub18.anInt10123 = (int) class397.z * 725290353;
			class480_sub18.anInt10118 = ((int) class397.z + (class480_sub18.npc.boundSize() << 8)) * 1443554551;
			class480_sub18.anInt10134 = -1632551033 * class480_sub18.npc.plane;
			Class480_Sub18.method6905(class480_sub18, i, i_2_, i_3_, i_4_, -1296484740);
		}
		for (Class480_Sub18 class480_sub18 = (Class480_Sub18) Class480_Sub18.aClass667_10113.first(); class480_sub18 != null; class480_sub18 = (Class480_Sub18) Class480_Sub18.aClass667_10113
				.next()) {
			int i_9_ = 1;
			Class515 class515 = class480_sub18.player.method17958();
			int i_10_ = class480_sub18.player.aClass650_Sub2_11525.getAnimationId();
			if (i_10_ == -1 || class480_sub18.player.aClass650_Sub2_11525.aBool10566) {
				i_9_ = 0;
			} else if (i_10_ == -272802151 * class515.anInt7025 || i_10_ == 902814335 * class515.anInt7055
					|| 1992950567 * class515.anInt7021 == i_10_ || class515.anInt7027 * 2085451397 == i_10_) {
				i_9_ = 2;
			} else if (-1451252109 * class515.anInt7020 == i_10_ || 671475489 * class515.anInt7030 == i_10_
					|| i_10_ == -1068126007 * class515.anInt7032 || i_10_ == 1418155347 * class515.anInt7031) {
				i_9_ = 3;
			}
			if (class480_sub18.anInt10116 * 63208259 != i_9_) {
				int i_11_ = Class3.method545(class480_sub18.player, 1747981955);
				if (class480_sub18.anInt10135 * 1796370749 != i_11_) {
					boolean bool = false;
					if (class480_sub18.aClass456_10136 != null) {
						class480_sub18.anInt10140 -= 1401733632;
						if (256466337 * class480_sub18.anInt10140 <= 0) {
							class480_sub18.aClass456_10136.method7431(100);
							TurnMobCutsceneAction.aClass186_9434.method3631(class480_sub18.aClass456_10136);
							class480_sub18.aClass456_10136 = null;
							bool = true;
						}
					} else {
						bool = true;
					}
					if (bool) {
						class480_sub18.anInt10140 = 1466892445 * class480_sub18.player.anInt11780;
						class480_sub18.anInt10135 = i_11_ * -1301352939;
						class480_sub18.anInt10116 = i_9_ * 910584171;
					}
				} else {
					class480_sub18.anInt10140 = 1466892445 * class480_sub18.player.anInt11780;
					class480_sub18.anInt10116 = i_9_ * 910584171;
				}
			}
			Class397 class397 = class480_sub18.player.method10164().aClass397_4507;
			class480_sub18.anInt10115 = (int) class397.x * 238948139;
			class480_sub18.anInt10117 = ((int) class397.x + (class480_sub18.player.boundSize() << 8)) * -1142456477;
			class480_sub18.anInt10123 = 725290353 * (int) class397.z;
			class480_sub18.anInt10118 = ((int) class397.z + (class480_sub18.player.boundSize() << 8)) * 1443554551;
			class480_sub18.anInt10134 = class480_sub18.player.plane * -1632551033;
			Class480_Sub18.method6905(class480_sub18, i, i_2_, i_3_, i_4_, -1296484740);
		}
	}

	Interface aClass221_7913;
	Widget aClass226_7914;

	Class611() {

	}

	Widget method10313() {
		return aClass221_7913.getChild(1857819631 * aClass226_7914.id);
	}

	void method10314() {
		aClass221_7913 = null;
		aClass226_7914 = null;
	}

	boolean method10315(int i, int i_0_, int i_1_) {
		Widget class226 = Class185.method3584(i, i_0_);
		if (null != class226) {
			aClass221_7913 = Class598.loadedInterfaces[i >> 16];
			aClass226_7914 = class226;
			return true;
		}

		method10314();
		return false;
	}

}