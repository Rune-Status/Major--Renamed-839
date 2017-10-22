package com.jagex;

public class Class491 {
	static int anInt6754 = 0;
	static Class491 aClass491_6755;

	public static void method8480(String string, boolean bool, byte i) {
		string = string.toLowerCase();
		Class280.anInt3154 = 0;
		if (1225579785 * Client.anInt10901 != -2102855523 * Client.anInt10688 || bool != Client.aBool10675
				|| !string.equals(Class115.aString1445)) {
			Class115.aString1445 = string;
			Client.anInt10901 = Client.anInt10688 * 1519958005;
			Client.aBool10675 = bool;
			short[] is = new short[16];
			int i_2_ = 0;
			for (int i_3_ = 0; i_3_ < -522945077 * ItemDefinition.loader.definitionCount; i_3_++) {
				ItemDefinition itemDefinition = ItemDefinition.loader.get(i_3_);
				if ((!bool || itemDefinition.aBool8328) && itemDefinition.noteTemplate * 1898423175 == -1
						&& itemDefinition.loanTemplate * 156720255 == -1
						&& itemDefinition.boughtTemplate * -2144992323 == -1
						&& -421820049 * itemDefinition.anInt8274 == 0
						&& itemDefinition.name.toLowerCase().indexOf(string) != -1) {
					if (i_2_ >= 250) {
						Class357.anInt3819 = -1647591413;
						Class16.aShortArray282 = null;
						return;
					}
					if (i_2_ >= is.length) {
						short[] is_4_ = new short[is.length * 2];
						for (int i_5_ = 0; i_5_ < i_2_; i_5_++) {
							is_4_[i_5_] = is[i_5_];
						}
						is = is_4_;
					}
					is[i_2_++] = (short) i_3_;
				}
			}
			Class16.aShortArray282 = is;
			Class357.anInt3819 = i_2_ * 1647591413;
			String[] strings = new String[Class357.anInt3819 * -1937034147];
			for (int i_6_ = 0; i_6_ < -1937034147 * Class357.anInt3819; i_6_++) {
				strings[i_6_] = ItemDefinition.loader.get(is[i_6_]).name;
			}
			ArrayUtils.sort(Class16.aShortArray282, strings);
		}
	}

	static final void method8478(ScriptExecutionContext class613) {
		if (0 == -2028985543 * Client.anInt10892) {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = -1;
		} else {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Client.ignoredPlayerCount
					* -1127325433;
		}
	}

	static final void method8479(ScriptExecutionContext class613, byte i) {
		class613.anInt7924 -= -2049596966;
		int i_0_ = class613.anIntArray7942[class613.anInt7924 * 1841827045];
		int i_1_ = class613.anIntArray7942[class613.anInt7924 * 1841827045 + 1];
		ItemDefinition itemDefinition = ItemDefinition.loader.get(i_0_);
		if (i_1_ >= 1 && i_1_ <= 5 && null != itemDefinition.groundActions[i_1_ - 1]) {
			class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = itemDefinition.groundActions[i_1_ - 1];
		} else {
			class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = "";
		}
	}

	static final void method8481(ScriptExecutionContext class613) {
		int i_7_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = AnimateObjectCutsceneAction.aClass420_9538
				.get(i_7_).name;
	}

	public Class600_Sub1_Sub3 aClass600_Sub1_Sub3_6752;

	public Class491 aClass491_6753;

	Class491() {

	}

	void method8474(int i) {
		if (-1076722623 * anInt6754 < 500) {
			aClass600_Sub1_Sub3_6752 = null;
			aClass491_6753 = aClass491_6755;
			aClass491_6755 = this;
			anInt6754 += 968592321;
		}
	}

	static Class491 method5373(Class600_Sub1_Sub3 class600_sub1_sub3, int i) {
		Class491 class491;
		if (aClass491_6755 == null) {
			class491 = new Class491();
		} else {
			class491 = aClass491_6755;
			aClass491_6755 = aClass491_6755.aClass491_6753;
			class491.aClass491_6753 = null;
			anInt6754 -= 968592321;
		}
		class491.aClass600_Sub1_Sub3_6752 = class600_sub1_sub3;
		return class491;
	}
}
