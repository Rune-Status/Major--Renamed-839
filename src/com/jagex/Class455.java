package com.jagex;

public class Class455 {
	public static Class455 aClass455_5110;
	public static Class455 aClass455_5111;
	public static Class455 aClass455_5112;
	public static Class455 aClass455_5113;
	public static Class455 aClass455_5114;
	static Class455 aClass455_5115 = new Class455(0);
	public static Class455 aClass455_5116;
	public static Class455 aClass455_5117;
	static Class455 aClass455_5118;
	public static Class455 aClass455_5119 = new Class455(1);
	static {
		aClass455_5111 = new Class455(2);
		aClass455_5113 = new Class455(3);
		aClass455_5114 = new Class455(4);
		aClass455_5110 = new Class455(5);
		aClass455_5112 = new Class455(6);
		aClass455_5117 = new Class455(7);
		aClass455_5118 = new Class455(8);
		aClass455_5116 = new Class455(9);
	}

	public static void method7424() {
		if (!Class455.aBool1126) {
			IdentikitDefinitionProvider.method5491(Client.aClass460_10760.method7687().aClass489ArrayArrayArray6701,
					1686714818);
			if (Client.aClass460_10760.method7687().aClass489ArrayArrayArray6703 != null) {
				IdentikitDefinitionProvider.method5491(
						Client.aClass460_10760.method7687().aClass489ArrayArrayArray6703, 203300215);
			}
			Class455.aBool1126 = true;
		}
	}

	static final void method7419(ScriptExecutionContext class613) {
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Client.anInt10795 * 1661404635;
	}

	static final void method7420(ScriptExecutionContext class613, int i) {
		class613.anInt7924 -= -2049596966;
		int i_0_ = class613.anIntArray7942[class613.anInt7924 * 1841827045];
		int i_1_ = class613.anIntArray7942[class613.anInt7924 * 1841827045 + 1];
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = i_0_ & i_1_;
	}

	static boolean method7421(int i) {
		return i == 59 || i == 2 || 8 == i || 17 == i || i == 15 || i == 16 || i == 58;
	}

	static boolean loadingState(int i) {
		return 4 == i || i == 5 || 19 == i;
	}

	static final void method7423(ScriptExecutionContext class613, int i) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		int i_1_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		int i_2_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045] - 1;
		if (class226.anInt2418 * 286135323 != 6) {
			throw new RuntimeException("");
		}
		NpcDefinition npcDefinition = NpcDefinition.loader.get(-643054127 * class226.anInt2486);
		if (class226.aClass267_2361 == null) {
			class226.aClass267_2361 = new Class267(npcDefinition, true);
		}
		class226.aClass267_2361.aLong2977 = Class36.method992() * 359135170314717883L;
		if (i_2_ < 0 || i_2_ >= npcDefinition.models.length) {
			throw new RuntimeException(new StringBuilder().append("").append(i_2_).toString());
		}
		class226.aClass267_2361.models[i_2_] = i_1_;
		Widget.redraw(class226);
	}

	public int anInt5120;
	static boolean aBool1126 = false;

	Class455(int i) {
		anInt5120 = 1616608619 * i;
	}
}
