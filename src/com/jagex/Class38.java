package com.jagex;

public class Class38 {
	static ReferenceCache aClass168_538 = new ReferenceCache(32);
	static int anInt539;

	public static boolean method1020(boolean bloom) {
		boolean bool_7_ = Class60.activeToolkit.method2496();
		if (bloom != bool_7_) {
			if (bloom) {
				if (!Class60.activeToolkit.method2411()) {
					bloom = false;
				}
			} else {
				Class60.activeToolkit.method2495();
			}

			if (bloom != bool_7_) {
				Class199.preferences.setValue(Class199.preferences.bloom, bloom ? 1 : 0);
				Client.savePreferences();
				return true;
			}

			return false;
		}

		return true;
	}

	static final void method1016(ScriptExecutionContext class613, int i) {
		int i_0_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_0_);
		Interface class221 = Class598.loadedInterfaces[i_0_ >> 16];
		ScriptExecutionContext.method15352(class226, class221, class613);
	}

	static final void method1017(ScriptExecutionContext class613, int i) {
		int i_1_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_1_);
		class613.anInt7924 -= 1122685165;
		int i_3_ = class613.anIntArray7942[class613.anInt7924 * 1841827045] - 1;
		if (i_3_ < 0 || i_3_ > 9) {
			throw new RuntimeException();
		}
		Client.method17268(class226, i_3_, class613);
	}

	static final void method1018(ScriptExecutionContext class613, int i) {
		int i_2_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Class515 class515 = ProxyingVariableLoader.aClass678_Sub6_3003.get(i_2_);
		if (null != class515.anIntArray7016 && class515.anIntArray7016.length > 0) {
			int i_3_ = 0;
			int i_4_ = class515.anIntArray7017[0];
			for (int i_5_ = 1; i_5_ < class515.anIntArray7016.length; i_5_++) {
				if (class515.anIntArray7017[i_5_] > i_4_) {
					i_3_ = i_5_;
					i_4_ = class515.anIntArray7017[i_5_];
				}
			}
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = class515.anIntArray7016[i_3_];
		} else {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = class515.anInt7029
					* -885045501;
		}
	}

	static final void method1019(ScriptExecutionContext class613) {
		int i_6_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = ItemDefinition.loader
				.get(i_6_).name;
	}

	static final void method1021(int i, int i_8_) {
		int i_9_ = Client.tick - 665362717 * Client.anInt10639;
		if (i_9_ >= 100) {
			Connection.anInt7170 = FloatRaster.method1728() * 442919637;
			TurnMobCutsceneAction.anInt9433 = -1490979241;
			Class156.anInt1886 = -1672889529;
		} else {
			float f = 1.0F - (100 - i_9_) * (100 - i_9_) * (100 - i_9_) / 1000000.0F;
			int i_10_;
			if (FloatRaster.method1728() == 3) {
				Class480_Sub22 class480_sub22 = Class369.aClass261_Sub1_4079.method4876().method5238((short) 15810);
				Class553 class553 = Client.aClass460_10760.method7679();
				Class155.anInt1874 = ((int) (Class369.aClass261_Sub1_4079.method4907((byte) 1) * 2607.5945876176133) & 0x3fff)
						* -1300105055;
				Class550.anInt7476 = ((int) (Class369.aClass261_Sub1_4079.method4843() * -2607.5945876176133) & 0x3fff)
						* -1726145155;
				IncomingFrameMeta.anInt4473 = 0;
				Client.anInt10906 = (int) (DrawableText.anInt9830 * 422651069 + ((int) (101040205 * Client.anInt10888 / (4.0 * Math
						.tan(Class369.aClass261_Sub1_4079.method4853((short) -397) / 2.0F))) - 422651069 * DrawableText.anInt9830)
						* f)
						* -1137455197;
				Client.cameraX = (int) ((-61099889 * class480_sub22.anInt10154 - -1992939008 * class553.x - ValueType.anInt4856 * 718417889)
						* f + ValueType.anInt4856 * 718417889)
						* -224503671;
				Class268.cameraY = (int) (f
						* (-(class480_sub22.anInt10155 * 1227419133) - HashedVariableCollection.anInt1485 * -419341025) + HashedVariableCollection.anInt1485
						* -419341025)
						* -1128143643;
				Wall.cameraZ = -187933039
						* (int) (Class512.anInt7004 * -2126389539 + f
								* (class480_sub22.anInt10156 * -980788885 - class553.z * -2121991680 - -2126389539
										* Class512.anInt7004));
				i_10_ = -(1686504405 * Class550.anInt7476) - 2012215581 * AsynchronousHttpRequestCreator.anInt4613
						& 0x3fff;
				if (i_10_ > 8192) {
					i_10_ -= 16384;
				} else if (i_10_ < -8192) {
					i_10_ += 16384;
				}
			} else {
				int i_11_ = (int) Client.aFloat10708;
				if (1848927567 * Client.anInt10717 >> 8 > i_11_) {
					i_11_ = 1848927567 * Client.anInt10717 >> 8;
				}
				if (Client.aBoolArray10873[4] && 128 + Client.anIntArray10875[4] > i_11_) {
					i_11_ = Client.anIntArray10875[4] + 128;
				}
				int i_12_ = (int) Client.aFloat10787 + Client.anInt10615 * 1902938021 & 0x3fff;
				Class397 class397 = Client.localPlayer.method10164().aClass397_4507;
				NativeLibraryLoadException.method17347(Class215.anInt2196 * -55942707,
						Class279.getAverageHeight((int) class397.x, (int) class397.z, ProxyingVariableLoader.localPlane * 1611577177)
								- Client.anInt10912 * -1160922663, -457862351 * Class115.anInt1444, i_11_, i_12_,
						3 * (i_11_ >> 3) + 600 << 2, i, -70033577);
				Client.cameraX = -224503671
						* (int) (ValueType.anInt4856 * 718417889 + (2006359481 * Client.cameraX - ValueType.anInt4856 * 718417889)
								* f);
				Class268.cameraY = (int) (HashedVariableCollection.anInt1485 * -419341025 + f
						* (1525233901 * Class268.cameraY - -419341025 * HashedVariableCollection.anInt1485))
						* -1128143643;
				Wall.cameraZ = -187933039
						* (int) (Class512.anInt7004 * -2126389539 + f
								* (Wall.cameraZ * 1829446257 - Class512.anInt7004 * -2126389539));
				Class155.anInt1874 = (int) (1597295205 * Class206.anInt2160 + f
						* (Class155.anInt1874 * 912649057 - Class206.anInt2160 * 1597295205))
						* -1300105055;
				i_10_ = 1686504405 * Class550.anInt7476 - AsynchronousHttpRequestCreator.anInt4613 * 2012215581;
				if (i_10_ > 8192) {
					i_10_ -= 16384;
				} else if (i_10_ < -8192) {
					i_10_ += 16384;
				}
			}
			Class550.anInt7476 = -1726145155
					* (int) (f * i_10_ + AsynchronousHttpRequestCreator.anInt4613 * 2012215581);
			Class550.anInt7476 = (Class550.anInt7476 * 1686504405 & 0x3fff) * -1726145155;
			Client.anInt10906 = -1137455197
					* (int) (DrawableText.anInt9830 * 422651069 + (749919243 * Client.anInt10906 - DrawableText.anInt9830 * 422651069)
							* f);
		}
	}

	Class38() throws Throwable {
		throw new Error();
	}
}
