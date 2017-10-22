package com.jagex;

public class Class522 {

	public static void method8955(int type, String string, boolean bool) {
		if (type == 0) {
			Class60.activeToolkit = Toolkit.create(0, Engine.aCanvas6501,
					CachedParticleDefinitionLoader.aClass147_3727, CutsceneObject.anInterface19_1944,
					ArchiveBillboardsLoader.instance, ParticleProducerDefinition.loader, Class274.aClass364_3093,
					Class54.shaders, Class199.preferences.multisample.getValue() * 2);
			if (string != null) {
				Class60.activeToolkit.method2426(1, 0);
				FontSpecification specification = FontSpecification.create(Class80.fonts, Class24.p12FullIndex
						* -346985765, 0);
				Font font = Class60.activeToolkit.createFont(specification,
						ImageUtils.load(DequeIterator.images, Class24.p12FullIndex * -346985765, 0), true);
				Class351.method5970();
				Class62.method1382(string, true, Class60.activeToolkit, font, specification);
			}
		} else {
			Toolkit toolkit = null;
			if (null != string) {
				toolkit = Toolkit.create(0, Engine.aCanvas6501, CachedParticleDefinitionLoader.aClass147_3727,
						CutsceneObject.anInterface19_1944, ArchiveBillboardsLoader.instance, ParticleProducerDefinition.loader,
						Class274.aClass364_3093, Class54.shaders, 0);
				toolkit.method2426(1, 0);

				FontSpecification specification = FontSpecification.create(Class80.fonts, -346985765
						* Class24.p12FullIndex, 0);
				Font font = toolkit.createFont(specification,
						ImageUtils.load(DequeIterator.images, Class24.p12FullIndex * -346985765, 0), true);

				Class351.method5970();
				Class62.method1382(string, true, toolkit, font, specification);

				try {
					toolkit.method2373();
					toolkit = null;
				} catch (Throwable throwable) {

				}
			}
			try {
				try {
					Deque.method13349();
					System.gc();
					Class60.activeToolkit = Toolkit.create(type, Engine.aCanvas6501,
							CachedParticleDefinitionLoader.aClass147_3727, CutsceneObject.anInterface19_1944,
							ArchiveBillboardsLoader.instance, ParticleProducerDefinition.loader, Class274.aClass364_3093,
							Class54.shaders, Class199.preferences.multisample.getValue() * 2);

					if (Class60.activeToolkit.method2378()) {
						boolean bool_22_ = true;
						try {
							bool_22_ = AsynchronousInputStream.systemInfo.anInt10408 * -2033165835 > 256;
						} catch (Throwable throwable) {

						}

						Class480_Sub5 class480_sub5;
						if (bool_22_) {
							class480_sub5 = Class60.activeToolkit.method2808(146800640);
						} else {
							class480_sub5 = Class60.activeToolkit.method2808(104857600);
						}

						Class60.activeToolkit.method2824(class480_sub5);
					}
				} catch (Throwable throwable) {
					switch (type) {
						case 1:
							Class359.method6033(Class22.aClass22_309);
							break;
						case 3:
							Class359.method6033(Class22.aClass22_310);
							break;
					}

					if (throwable instanceof RuntimeException_Sub1) {
						Class199.preferences.antiAliasing.set(0);
						Class199.preferences.multisample.set(0);
					}

					int i_23_ = Class199.preferences.currentToolkit.getValue();
					Class199.preferences.setValue(Class199.preferences.currentToolkit, 0);
					if (null != toolkit) {
						try {
							toolkit.method2373();
							toolkit = null;
						} catch (Throwable throwable_24_) {

						}
					}

					Deque.method13349();
					System.gc();
					method8955(i_23_, string, bool);

					if (toolkit != null) {
						try {
							toolkit.method2373();
						} catch (Throwable throwable_25_) {

						}
					}
					return;
				}

				if (toolkit != null) {
					try {
						toolkit.method2373();
					} catch (Throwable throwable) {

					}
				}
			} catch (Exception object) {
				if (toolkit != null) {
					try {
						toolkit.method2373();
					} catch (Throwable throwable) {

					}
				}
			}
		}

		if (bool) {
			Class199.preferences.setLive(Class199.preferences.currentToolkit, !bool);
		}

		Class199.preferences.setValue(Class199.preferences.currentToolkit, type);
		if (!bool) {
			Class199.preferences.setLive(Class199.preferences.currentToolkit, !bool);
		}

		Class283.method5268();
		Class60.activeToolkit.method2464(20000);
		Class60.activeToolkit.method2478(32);
		Client.aClass460_10760.method7787();

		if (Class60.activeToolkit.method2688()) {
			Class38.method1020(Class199.preferences.bloom.getValue() == 1);
		}

		Client.aClass460_10760.method7788(true);
		Client.aClass460_10760.method7690().method9709();
		HitbarDefinition.method8951();
		Client.sentPreferences = false;
		Client.aBool10905 = true;
		Class62.aClass651Array689 = null;
		Class60.activeToolkit.method2420(0.0F, 1.0F);
	}

	static void method8954(Toolkit class134, int i, int i_6_, int i_7_, int i_8_, int i_9_) {
		class134.method2760(i, i_6_, i_7_ + i, i_6_ + i_8_);
		if (Class495_Sub1.anInt10322 * 147042807 < 100) {
			int i_10_ = 20;
			int i_11_ = i_7_ / 2 + i;
			int i_12_ = i_6_ + i_8_ / 2 - 18 - i_10_;
			class134.method2434(i, i_6_, i_7_, i_8_, -16777216, 0);
			class134.method2625(i_11_ - 152, i_12_, 304, 34,
					Client.aColorArray10845[Client.anInt10593 * -39997795].getRGB(), 0);
			class134.method2434(i_11_ - 150, i_12_ + 2, 441128421 * Class495_Sub1.anInt10322, 30,
					Client.aColorArray10641[Client.anInt10593 * -39997795].getRGB(), 0);
			Class450.b12Full.method2293(TranslatableString.LOADING.translate(Client.currentLanguage), i_11_, i_12_
					+ i_10_, Client.aColorArray10633[-39997795 * Client.anInt10593].getRGB(), -1);
		} else {
			int i_13_ = -1343037161 * AsynchronousStreamRequest.anInt4532 - (int) (i_7_ / Class495.aFloat6818);
			int i_14_ = (int) (i_8_ / Class495.aFloat6818) + -1266662223 * ClanChannelUpdater.anInt3185;
			int i_15_ = (int) (i_7_ / Class495.aFloat6818) + -1343037161 * AsynchronousStreamRequest.anInt4532;
			int i_16_ = ClanChannelUpdater.anInt3185 * -1266662223 - (int) (i_8_ / Class495.aFloat6818);
			LoadingRequirementType.anInt236 = 409501907 * (AsynchronousStreamRequest.anInt4532 * -1343037161 - (int) (i_7_ / Class495.aFloat6818));
			Class222_Sub1.anInt9541 = 1761891891 * (ClanChannelUpdater.anInt3185 * -1266662223 - (int) (i_8_ / Class495.aFloat6818));
			CacheResourceWorker.anInt4892 = -1255863427 * (int) (i_7_ * 2 / Class495.aFloat6818);
			Preference.anInt8072 = (int) (i_8_ * 2 / Class495.aFloat6818) * -1954403415;
			Class495.aClass168_6848 = Class495.aClass168_6825;
			Class495.method8561(i_13_ + Class495.anInt6849, Class495.anInt6823 + i_14_, i_15_ + Class495.anInt6849,
					i_16_ + Class495.anInt6823, i, i_6_, i_7_ + i, i_8_ + i_6_ + 1);
			Class495.method8562(class134, !Class495_Sub1.aBool10343, !Class495_Sub1.aBool10344, Client.membersWorld,
					false);
			Deque class644 = Class495.method8592(class134);
			Orientation.method816(class134, class644, 0, 0);
			if (Client.displayFps) {
				int i_17_ = i_7_ + i - 5;
				int i_18_ = i_6_ + i_8_ - 8;
				Client.p12Full.method2318(new StringBuilder().append("Fps: ").append(Engine.anInt6488 * -1101491257)
						.append(" (").append(Engine.anInt6489 * 835525597).append(" ms)").toString(), i_17_, i_18_,
						16776960, -1);
				i_18_ -= 15;
				Runtime runtime = Runtime.getRuntime();
				int i_19_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
				int i_20_ = 16776960;
				if (i_19_ > 65536) {
					i_20_ = 16711680;
				}
				Client.p12Full.method2318(new StringBuilder().append("Mem:").append(i_19_).append("k").toString(),
						i_17_, i_18_, i_20_, -1);
				i_18_ -= 15;
			}
			Class495.aClass168_6825.sweep(5);
		}
	}

	int anInt7207;
	int anInt7208;
	int anInt7209;
	int anInt7210;

	Class522(int i, int i_0_, int i_1_, int i_2_) {
		anInt7210 = 1282734623 * i;
		anInt7208 = i_0_ * 1531079839;
		anInt7209 = 878137469 * i_1_;
		anInt7207 = i_2_ * -365697157;
	}

}