package com.jagex;

public abstract class Class642 {
	public static void method13248() {
		if (null == Class277.aClass262Array3115) {
			Class277.aClass262Array3115 = Class262.values(218740043);
			Class262.aClass262_2650 = Class277.aClass262Array3115[0];
			Class151.aLong1860 = TimeUtil.time() * -8177040504110399203L;
		}
		if (IgnoredPlayer.aClass266_670 == null) {
			Class266.method10430();
		}
		Class262 class262 = Class262.aClass262_2650;
		int i_2_ = ClientVarpType.method15442();
		if (Class262.aClass262_2650 == class262) {
			Class277.aString3121 = Class262.aClass262_2650.aClass5_2930.translate(Client.currentLanguage);
			Class268.aString2985 = Class277.aString3121;
			if (Class262.aClass262_2650.aBool2946) {
				WeakReferenceTable.anInt559 = -1005245751
						* ((Class262.aClass262_2650.anInt2927 * -2004811939 - Class262.aClass262_2650.anInt2943 * 1311420491)
								* i_2_ / 100 + Class262.aClass262_2650.anInt2943 * 1311420491);
			}
			if (Class262.aClass262_2650.aBool2945) {
				Class268.aString2985 = new StringBuilder().append(Class268.aString2985).append(" - ")
						.append(34934649 * WeakReferenceTable.anInt559).append("%").toString();
			}
		} else if (Class262.aClass262_2650 == Class262.aClass262_2939) {
			IgnoredPlayer.aClass266_670 = null;
			Class536.setGameState(0);
			if (Class277.aBool3118) {
				Class277.aBool3118 = false;
				Client.method5440(SpawnAnimatedObjectCutsceneAction.aString11131, BaseNpcDefinitionProvider.aString2994,
						"", false, 1666399204);
			}
		} else {
			Class277.aString3121 = class262.aClass5_2942.translate(Client.currentLanguage);
			Class268.aString2985 = Class277.aString3121;
			if (Class262.aClass262_2650.aBool2945) {
				Class268.aString2985 = new StringBuilder().append(Class268.aString2985)
						.append(-2004811939 * class262.anInt2927).append("%").toString();
			}
			WeakReferenceTable.anInt559 = 2110702085 * class262.anInt2927;
			if (Class262.aClass262_2650.aBool2946 || class262.aBool2946) {
				Class151.aLong1860 = TimeUtil.time() * -8177040504110399203L;
			}
		}
		if (null != IgnoredPlayer.aClass266_670) {
			IgnoredPlayer.aClass266_670.method5013(Class151.aLong1860 * -4493359127459657419L, Class277.aString3121,
					Class268.aString2985, 34934649 * WeakReferenceTable.anInt559, Class262.aClass262_2650);
			if (null != Class277.anInterface27Array3114) {
				for (int i_3_ = 1 + Class277.anInt3117 * 793335435; i_3_ < Class277.anInterface27Array3114.length; i_3_++) {
					if (Class277.anInterface27Array3114[i_3_].method160() >= 100
							&& i_3_ - 1 == Class277.anInt3117 * 793335435 && 4 != -1501875989 * Client.gameState
							&& IgnoredPlayer.aClass266_670.method5011((byte) 45)) {
						try {
							Class277.anInterface27Array3114[i_3_].method106();
						} catch (Exception exception) {
							Class277.anInterface27Array3114 = null;
							break;
						}
						IgnoredPlayer.aClass266_670.method5012(Class277.anInterface27Array3114[i_3_], 1116749629);
						Class277.anInt3117 += -2116296413;
						if (793335435 * Class277.anInt3117 >= Class277.anInterface27Array3114.length - 1
								&& Class277.anInterface27Array3114.length > 1) {
							Class277.anInt3117 = (Class148.aClass35_1827.method983() ? 0 : -1) * -2116296413;
						}
					}
				}
			}
		}
	}

	static final void method13249(ScriptExecutionContext class613, byte i) {
		int i_4_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = ThemeMusicVolumeNormaliser.aClass10_2062
				.get(i_4_).fillerCount();
	}

	Class261 aClass261_8163;

	Class642(Class261 class261) {
		aClass261_8163 = class261;
	}

	public abstract Class397 method13222(byte i);

	public abstract void method13223(float f, int i);

	public abstract boolean method13224();

	public abstract void method13227(Class268 class268, Class405 class405, int i, int i_0_, float f, int i_1_);

	public abstract Class397 method13235();

	public abstract void method13244(Buffer buffer, int i);
}
