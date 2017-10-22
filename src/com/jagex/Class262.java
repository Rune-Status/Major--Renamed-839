package com.jagex;

public class Class262 {
	static Class262 aClass262_2922;
	static Class262 aClass262_2923;
	static Class262 aClass262_2924;
	static Class262 aClass262_2925;
	static Class262 aClass262_2926;
	static Class262 aClass262_2928;
	static Class262 aClass262_2929;
	static Class262 aClass262_2931;
	static Class262 aClass262_2932;
	static Class262 aClass262_2933;
	static Class262 aClass262_2934;
	static Class262 aClass262_2935;
	static Class262 aClass262_2936;
	static Class262 aClass262_2937;
	static Class262 aClass262_2938;
	static Class262 aClass262_2939;
	static Class262 aClass262_2940 = new Class262(0, TranslatableString.CHECKING_FOR_UPDATES, 2);
	static Class262 aClass262_2941 = new Class262(1, TranslatableString.CHECKING_FOR_UPDATES,
			TranslatableString.CHECKING_FOR_UPDATES, 2, 3);
	static {
		aClass262_2924 = new Class262(2, TranslatableString.CHECKING_FOR_UPDATES, 3);
		aClass262_2925 = new Class262(3, TranslatableString.CHECKING_FOR_UPDATES,
				TranslatableString.CHECKING_FOR_UPDATES, 3, 4);
		aClass262_2923 = new Class262(4, TranslatableString.CHECKING_FOR_UPDATES, 4);
		aClass262_2922 = new Class262(5, TranslatableString.CHECKING_FOR_UPDATES,
				TranslatableString.CHECKING_FOR_UPDATES, 4, 5);
		aClass262_2928 = new Class262(6, TranslatableString.CHECKING_FOR_UPDATES,
				TranslatableString.CHECKING_FOR_UPDATES, 5, 98, true, true);
		aClass262_2929 = new Class262(7, TranslatableString.CHECKING_FOR_UPDATES, 99);
		aClass262_2926 = new Class262(8, TranslatableString.CHECKING_FOR_UPDATES, 100);
		aClass262_2935 = new Class262(9, TranslatableString.FETCHING_UPDATES, TranslatableString.FETCHING_UPDATES, 0,
				92, true, true);
		aClass262_2932 = new Class262(10, TranslatableString.FETCHING_UPDATES, TranslatableString.FETCHING_UPDATES, 92,
				93);
		aClass262_2933 = new Class262(11, TranslatableString.FETCHING_UPDATES, TranslatableString.FETCHING_UPDATES, 94,
				95);
		aClass262_2934 = new Class262(12, TranslatableString.FETCHING_UPDATES, TranslatableString.FETCHING_UPDATES, 96,
				97);
		aClass262_2936 = new Class262(13, TranslatableString.FETCHING_UPDATES, 97);
		aClass262_2931 = new Class262(14, TranslatableString.FETCHING_UPDATES, 97);
		aClass262_2937 = new Class262(15, TranslatableString.FETCHING_UPDATES, 100);
		aClass262_2938 = new Class262(16, TranslatableString.FETCHING_UPDATES, 100);
		aClass262_2939 = new Class262(17, TranslatableString.FETCHING_UPDATES, 100);
	}

	public static void method4972(int i, int i_16_, int i_17_, int i_18_, ObjectDefinition object, Npc npc,
			Player player) {
		Class480_Sub18 class480_sub18 = new Class480_Sub18();
		class480_sub18.anInt10134 = -1632551033 * i;
		class480_sub18.anInt10115 = (i_16_ << 9) * 238948139;
		class480_sub18.anInt10123 = (i_17_ << 9) * 725290353;
		if (null != object) {
			class480_sub18.object = object;
			int i_20_ = object.width * 723391465;
			int i_21_ = object.length * 2076427087;
			if (1 == i_18_ || i_18_ == 3) {
				i_20_ = 2076427087 * object.length;
				i_21_ = object.width * 723391465;
			}
			class480_sub18.anInt10117 = (i_20_ + i_16_ << 9) * -1142456477;
			class480_sub18.anInt10118 = (i_21_ + i_17_ << 9) * 1443554551;
			class480_sub18.anInt10135 = object.anInt7427 * 417790327;
			class480_sub18.anInt10114 = 1691784827 * (1609510815 * object.anInt7386 << 9);
			class480_sub18.anInt10140 = 1443858117 * object.anInt7430;
			class480_sub18.anInt10138 = -1688501205 * object.anInt7431;
			class480_sub18.anInt10139 = object.anInt7432 * -1955539479;
			class480_sub18.anIntArray10137 = object.anIntArray7433;
			class480_sub18.anInt10110 = object.anInt7393 * 2107457377;
			class480_sub18.anInt10133 = object.anInt7438 * -288681823;
			class480_sub18.anInt10122 = -1490451167 * (1748646349 * object.anInt7406 << 9);
			if (object.morphisms != null) {
				class480_sub18.aBool10132 = true;
				class480_sub18.method15898();
			}
			if (class480_sub18.anIntArray10137 != null) {
				class480_sub18.anInt10129 = (-1965120663 * class480_sub18.anInt10138 + (int) (Math.random() * (-674374589
						* class480_sub18.anInt10139 - -1965120663 * class480_sub18.anInt10138)))
						* -1614899133;
			}
			Class480_Sub18.aClass644_10111.pushBack(class480_sub18);
			TurnMobCutsceneAction.aClass186_9434.method3603(1796370749 * class480_sub18.anInt10135);
			TurnMobCutsceneAction.aClass186_9434.method3602(class480_sub18.anIntArray10137, 1922861463);
		} else if (npc != null) {
			class480_sub18.npc = npc;
			NpcDefinition npcDefinition = npc.definition;
			if (npcDefinition.morphisms != null) {
				class480_sub18.aBool10132 = true;
				npcDefinition = npcDefinition.morph(PlayerVariableProvider.instance, PlayerVariableProvider.instance);
			}
			if (npcDefinition != null) {
				class480_sub18.anInt10117 = -1142456477 * (i_16_ + 2117527163 * npcDefinition.boundSize << 9);
				class480_sub18.anInt10118 = 1443554551 * (2117527163 * npcDefinition.boundSize + i_17_ << 9);
				class480_sub18.anInt10135 = ParticleTriangle.method9819(npc) * -1301352939;
				class480_sub18.anInt10114 = 1691784827 * (npcDefinition.anInt3068 * -1993698969 << 9);
				class480_sub18.anInt10140 = -1514553083 * npcDefinition.anInt3070;
				class480_sub18.anInt10110 = -1497921415 * npcDefinition.anInt3080;
				class480_sub18.anInt10133 = npcDefinition.anInt3079 * 2076021449;
				class480_sub18.anInt10122 = (npcDefinition.anInt3069 * -1670374007 << 9) * -1490451167;
				TurnMobCutsceneAction.aClass186_9434.method3603(npcDefinition.anInt3029 * -1110085267);
				TurnMobCutsceneAction.aClass186_9434.method3603(-1218621881 * npcDefinition.anInt3065);
				TurnMobCutsceneAction.aClass186_9434.method3603(-1939755065 * npcDefinition.anInt3050);
				TurnMobCutsceneAction.aClass186_9434.method3603(npcDefinition.anInt3042 * -232975009);
			}
			Class480_Sub18.aClass644_10112.pushBack(class480_sub18);
		} else if (player != null) {
			class480_sub18.player = player;
			class480_sub18.anInt10117 = (i_16_ + player.boundSize() << 9) * -1142456477;
			class480_sub18.anInt10118 = (i_17_ + player.boundSize() << 9) * 1443554551;
			class480_sub18.anInt10135 = Class3.method545(player, 1674548084) * -1301352939;
			class480_sub18.anInt10114 = 1691784827 * (player.anInt11760 * -930097605 << 9);
			class480_sub18.anInt10140 = 1466892445 * player.anInt11780;
			class480_sub18.anInt10110 = 49552128;
			class480_sub18.anInt10133 = -1620333824;
			class480_sub18.anInt10122 = 0;
			Class480_Sub18.aClass667_10113.put(player.index * 387935885, class480_sub18);
			TurnMobCutsceneAction.aClass186_9434.method3603(274573991 * player.anInt11763);
			TurnMobCutsceneAction.aClass186_9434.method3603(player.anInt11776 * 1288494369);
			TurnMobCutsceneAction.aClass186_9434.method3603(player.anInt11777 * 1968610425);
			TurnMobCutsceneAction.aClass186_9434.method3603(player.anInt11778 * -1010561117);
		}
	}

	static void method4965(Toolkit toolkit, int i, int i_8_, int i_9_, int i_10_, int i_11_, Font font,
			FontSpecification specification, String string, int i_12_) {
		int i_13_ = 255 - Class128.anInt1500 * 1353430907 - Class56.anInt648 * -1755800039;
		if (i_13_ < 0) {
			i_13_ = 0;
		}
		if (Class338.aClass116_3626 == null || null == Sprite.aClass116_7904) {
			if (DequeIterator.images.fileLoaded(CutsceneVariableProvider.anInt1902 * -1531895641)
					&& DequeIterator.images.fileLoaded(-2048013587 * BaseObjectDefinitionProvider.anInt7322)) {
				Class338.aClass116_3626 = toolkit
						.createSprite(
								ImageUtils.loadFirst(DequeIterator.images, -1531895641
										* CutsceneVariableProvider.anInt1902, 0), true);
				Image class152 = ImageUtils.loadFirst(DequeIterator.images, -2048013587
						* BaseObjectDefinitionProvider.anInt7322, 0);
				Sprite.aClass116_7904 = toolkit.createSprite(class152, true);
				class152.flipVertical();
				Class272.aClass116_3008 = toolkit.createSprite(class152, true);
			} else {
				toolkit.method2434(i, i_8_, i_9_, i_11_, i_13_ << 24 | AsynchronousOutputStream.anInt7301 * -106066379,
						1);
			}
		}
		if (null != Class338.aClass116_3626 && Sprite.aClass116_7904 != null) {
			int i_14_ = (i_9_ - Sprite.aClass116_7904.method2157() * 2) / Class338.aClass116_3626.method2157();
			for (int i_15_ = 0; i_15_ < i_14_; i_15_++) {
				Class338.aClass116_3626.method2079(i + Sprite.aClass116_7904.method2157() + i_15_
						* Class338.aClass116_3626.method2157(), i_8_);
			}
			Sprite.aClass116_7904.method2079(i, i_8_);
			Class272.aClass116_3008.method2079(i_9_ + i - Class272.aClass116_3008.method2157(), i_8_);
		}
		font.method2291(string, 3 + i, (20 - specification.topPadding * -1971642963) / 2 + i_8_ + -1971642963
				* specification.topPadding, -1814862193 * Class283.anInt3167 | ~0xffffff, -1);
		toolkit.method2434(i, i_8_ + i_11_, i_9_, i_10_ - i_11_, i_13_ << 24 | -106066379
				* AsynchronousOutputStream.anInt7301, 1);
	}

	static Class262[] values(int i) {
		return new Class262[] { aClass262_2940, aClass262_2941, aClass262_2924, aClass262_2925, aClass262_2923,
				aClass262_2922, aClass262_2928, aClass262_2929, aClass262_2926, aClass262_2935, aClass262_2932,
				aClass262_2933, aClass262_2934, aClass262_2936, aClass262_2931, aClass262_2937, aClass262_2938,
				aClass262_2939 };
	}

	int anInt2927;
	TranslatableString aClass5_2930;
	TranslatableString aClass5_2942;
	int anInt2943;
	public int anInt2944;
	boolean aBool2945;
	boolean aBool2946;
	static Class262 aClass262_2650;

	Class262(int i, TranslatableString class5, TranslatableString class5_5_, int i_6_, int i_7_) {
		this(i, class5, class5_5_, i_6_, i_7_, true, false);
	}

	Class262(int i, TranslatableString class5, TranslatableString class5_0_, int i_1_, int i_2_, boolean bool,
			boolean bool_3_) {
		anInt2944 = i * 1185953519;
		aClass5_2930 = class5;
		aClass5_2942 = class5_0_;
		anInt2943 = 1271109987 * i_1_;
		anInt2927 = i_2_ * -739488523;
		aBool2945 = bool;
		aBool2946 = bool_3_;
	}

	Class262(int i, TranslatableString class5, int i_4_) {
		this(i, class5, class5, i_4_, i_4_, true, false);
	}

}