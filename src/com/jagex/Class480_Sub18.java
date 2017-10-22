package com.jagex;

public class Class480_Sub18 extends Linkable {
	static Deque aClass644_10111 = new Deque();
	static Deque aClass644_10112 = new Deque();
	static HashTable aClass667_10113 = new HashTable(16);
	static final int anInt10127 = 0;
	static final int anInt10128 = 1;
	static final int anInt10130 = 3;
	static final int anInt10131 = 2;
	static final int anInt10141 = 512;

	int anInt10110;
	int anInt10114;
	int anInt10115;
	int anInt10116;
	int anInt10117;
	int anInt10118;
	Class456 aClass456_10119;
	Class397 aClass397_10120 = new Class397(0.0F, 0.0F, 0.0F);
	Class397 aClass397_10121 = new Class397(0.0F, 0.0F, 0.0F);
	int anInt10122;
	int anInt10123;
	ObjectDefinition object;
	Npc npc;
	Player player;
	int anInt10129;
	boolean aBool10132;
	int anInt10133;
	int anInt10134;
	int anInt10135;
	Class456 aClass456_10136;
	int[] anIntArray10137;
	int anInt10138;
	int anInt10139;
	int anInt10140;

	void method15898() {
		int i_0_ = 1796370749 * anInt10135;
		if (null != object) {
			ObjectDefinition definition = object.method9255(PlayerVariableProvider.instance,
					Client.cutsceneStage * 2087248539 == 1 ? Class163.anInterface12_1911
							: PlayerVariableProvider.instance);
			if (definition != null) {
				anInt10135 = definition.anInt7427 * 417790327;
				anInt10114 = 1691784827 * (definition.anInt7386 * 1609510815 << 9);
				anInt10140 = definition.anInt7430 * 1443858117;
				anInt10138 = definition.anInt7431 * -1688501205;
				anInt10139 = -1955539479 * definition.anInt7432;
				anIntArray10137 = definition.anIntArray7433;
				anInt10110 = 2107457377 * definition.anInt7393;
				anInt10133 = -288681823 * definition.anInt7438;
			} else {
				anInt10135 = 1301352939;
				anInt10114 = 0;
				anInt10140 = 0;
				anInt10138 = 0;
				anInt10139 = 0;
				anIntArray10137 = null;
				anInt10110 = 49552128;
				anInt10133 = -1620333824;
				anInt10122 = 0;
			}
		} else if (npc != null) {
			int i_1_ = ParticleTriangle.method9819(npc);
			if (i_1_ != i_0_) {
				anInt10135 = i_1_ * -1301352939;
				NpcDefinition definition = npc.definition;
				if (null != definition.morphisms) {
					definition = definition.morph(PlayerVariableProvider.instance, PlayerVariableProvider.instance);
				}
				if (null != definition) {
					anInt10114 = 1691784827 * (definition.anInt3068 * -1993698969 << 9);
					anInt10122 = -1490451167 * (-1670374007 * definition.anInt3069 << 9);
					anInt10140 = definition.anInt3070 * -1514553083;
					anInt10110 = -1497921415 * definition.anInt3080;
					anInt10133 = definition.anInt3079 * 2076021449;
				} else {
					anInt10122 = 0;
					anInt10114 = 0;
					anInt10140 = 0;
					anInt10110 = 49552128;
					anInt10133 = -1620333824;
				}
			}
		} else if (player != null) {
			anInt10135 = Class3.method545(player, 1959999479) * -1301352939;
			anInt10114 = 1691784827 * (player.anInt11760 * -930097605 << 9);
			anInt10122 = 0;
			anInt10140 = 1466892445 * player.anInt11780;
			anInt10110 = 49552128;
			anInt10133 = -1620333824;
		}

		if (i_0_ != anInt10135 * 1796370749 && aClass456_10136 != null && aClass456_10136 != null) {
			aClass456_10136.method7431(100);
			TurnMobCutsceneAction.aClass186_9434.method3631(aClass456_10136);
			aClass456_10136 = null;
		}
	}

	public static void method8883(Player player) {
		Class480_Sub18 class480_sub18 = (Class480_Sub18) aClass667_10113.get(player.index * 387935885);
		if (null != class480_sub18) {
			if (class480_sub18.aClass456_10136 != null) {
				class480_sub18.aClass456_10136.method7431(100);
				TurnMobCutsceneAction.aClass186_9434.method3631(class480_sub18.aClass456_10136);
				class480_sub18.aClass456_10136 = null;
			}
			class480_sub18.unlink();
		}
	}

	public static void method8150(Npc npc) {
		for (Class480_Sub18 class480_sub18 = (Class480_Sub18) aClass644_10112.head(); null != class480_sub18; class480_sub18 = (Class480_Sub18) aClass644_10112
				.next()) {
			if (class480_sub18.npc == npc) {
				if (class480_sub18.aClass456_10136 != null) {
					class480_sub18.aClass456_10136.method7431(100);
					TurnMobCutsceneAction.aClass186_9434.method3631(class480_sub18.aClass456_10136);
					class480_sub18.aClass456_10136 = null;
				}
	
				class480_sub18.unlink();
				break;
			}
		}
	}

	public static void method15334(int i, int i_19_, int i_20_, ObjectDefinition definition, int i_21_) {
		for (Class480_Sub18 class480_sub18 = (Class480_Sub18) aClass644_10111.head(); class480_sub18 != null; class480_sub18 = (Class480_Sub18) aClass644_10111
				.next()) {
			if (i == class480_sub18.anInt10134 * -1681107401 && i_19_ << 9 == -990627965 * class480_sub18.anInt10115
					&& i_20_ << 9 == -1955720303 * class480_sub18.anInt10123
					&& -894246227 * definition.anInt7369 == class480_sub18.object.anInt7369 * -894246227) {
				if (class480_sub18.aClass456_10136 != null) {
					class480_sub18.aClass456_10136.method7431(100);
					TurnMobCutsceneAction.aClass186_9434.method3631(class480_sub18.aClass456_10136);
					class480_sub18.aClass456_10136 = null;
				}
				class480_sub18.unlink();
				break;
			}
		}
	}

	static void method6905(Class480_Sub18 class480_sub18, int i, int i_84_, int i_85_, int i_86_, int i_87_) {
		if (class480_sub18.anInt10135 * 1796370749 != -1 || null != class480_sub18.anIntArray10137) {
			int i_88_ = 256466337 * class480_sub18.anInt10140;
			if (0 == 317184179 * class480_sub18.anInt10114 || Class199.preferences.areaSoundsVolume.getValue() == 0
					|| i != class480_sub18.anInt10134 * -1681107401) {
				if (null != class480_sub18.aClass456_10136) {
					class480_sub18.aClass456_10136.method7431(100);
					TurnMobCutsceneAction.aClass186_9434.method3631(class480_sub18.aClass456_10136);
					class480_sub18.aClass456_10136 = null;
				}
			} else {
				if (class480_sub18.aClass456_10136 != null
						&& (class480_sub18.aClass456_10136.method7436() == Class455.aClass455_5117 || class480_sub18.aClass456_10136
								.method7436() == Class455.aClass455_5112)) {
					TurnMobCutsceneAction.aClass186_9434.method3631(class480_sub18.aClass456_10136);
					class480_sub18.aClass456_10136 = null;
				}
				if (null == class480_sub18.aClass456_10136) {
					if (class480_sub18.anInt10135 * 1796370749 >= 0) {
						int i_89_ = 256;
						int i_90_ = (int) (-990627965 * class480_sub18.anInt10115 + (810416715 * class480_sub18.anInt10117 - -990627965
								* class480_sub18.anInt10115) * 0.5F);
						int i_91_ = (int) (0.5F * (-2127881017 * class480_sub18.anInt10118 - -1955720303
								* class480_sub18.anInt10123) + -1955720303 * class480_sub18.anInt10123);
						class480_sub18.aClass397_10121.x = i_90_;
						class480_sub18.aClass397_10121.z = i_91_;
						class480_sub18.aClass456_10136 = TurnMobCutsceneAction.aClass186_9434.method3609(
								Class171.aClass171_1957, class480_sub18, 1796370749 * class480_sub18.anInt10135, -1, 0,
								Class156.aClass156_1884.method3293(), Class167.aClass167_1927,
								class480_sub18.anInt10122 * -104579359, 317184179 * class480_sub18.anInt10114,
								class480_sub18.aClass397_10121, 0, i_89_, false);
						if (null != class480_sub18.aClass456_10136) {
							float f = i_88_ / 255.0F;
							class480_sub18.aClass456_10136.method7454(f, 150);
							class480_sub18.aClass456_10136.method7430();
						}
					}
				} else {
					int i_92_ = (int) (-990627965 * class480_sub18.anInt10115 + 0.5F * (class480_sub18.anInt10117 * 810416715 - class480_sub18.anInt10115
							* -990627965));
					int i_93_ = (int) (0.5F * (-2127881017 * class480_sub18.anInt10118 - class480_sub18.anInt10123
							* -1955720303) + -1955720303 * class480_sub18.anInt10123);
					class480_sub18.aClass397_10121.x = i_92_;
					class480_sub18.aClass397_10121.z = i_93_;
				}
				if (class480_sub18.aClass456_10119 == null) {
					if (class480_sub18.anIntArray10137 != null
							&& (class480_sub18.anInt10129 -= -1614899133 * i_86_) * -825723797 <= 0) {
						int i_94_ = -677263853 * class480_sub18.anInt10110 == 256
								&& -671074557 * class480_sub18.anInt10133 == 256 ? 256
								: (int) (Math.random() * (-677263853 * class480_sub18.anInt10110 - class480_sub18.anInt10133
										* -671074557))
										+ class480_sub18.anInt10133 * -671074557;
						int i_95_ = (int) (Math.random() * class480_sub18.anIntArray10137.length);
						int i_96_ = (int) (class480_sub18.anInt10115 * -990627965 + 0.5F * (810416715 * class480_sub18.anInt10117 - -990627965
								* class480_sub18.anInt10115));
						int i_97_ = (int) (0.5F * (class480_sub18.anInt10118 * -2127881017 - -1955720303
								* class480_sub18.anInt10123) + class480_sub18.anInt10123 * -1955720303);
						class480_sub18.aClass397_10120.x = i_96_;
						class480_sub18.aClass397_10120.z = i_97_;
						class480_sub18.aClass456_10119 = TurnMobCutsceneAction.aClass186_9434.method3609(
								Class171.aClass171_1949, class480_sub18, class480_sub18.anIntArray10137[i_95_], 0,
								i_88_, Class156.aClass156_1885.method3293(), Class167.aClass167_1927,
								class480_sub18.anInt10122 * -104579359, class480_sub18.anInt10122 * -104579359
										+ class480_sub18.anInt10114 * 317184179, class480_sub18.aClass397_10120, 0,
								i_94_, false);
						if (null != class480_sub18.aClass456_10119) {
							class480_sub18.aClass456_10119.method7430();
						}
						class480_sub18.anInt10129 = (class480_sub18.anInt10138 * -1965120663 + (int) (Math.random() * (class480_sub18.anInt10139
								* -674374589 - class480_sub18.anInt10138 * -1965120663)))
								* -1614899133;
					}
				} else {
					int i_98_ = (int) ((810416715 * class480_sub18.anInt10117 - -990627965 * class480_sub18.anInt10115) * 0.5F + -990627965
							* class480_sub18.anInt10115);
					int i_99_ = (int) (0.5F * (class480_sub18.anInt10118 * -2127881017 - class480_sub18.anInt10123
							* -1955720303) + -1955720303 * class480_sub18.anInt10123);
					class480_sub18.aClass397_10120.x = i_98_;
					class480_sub18.aClass397_10120.z = i_99_;
					if (class480_sub18.aClass456_10119.method7436() == Class455.aClass455_5117
							|| class480_sub18.aClass456_10119.method7436() == Class455.aClass455_5112) {
						TurnMobCutsceneAction.aClass186_9434.method3631(class480_sub18.aClass456_10119);
						class480_sub18.aClass456_10119 = null;
					}
				}
			}
		}
	}

}