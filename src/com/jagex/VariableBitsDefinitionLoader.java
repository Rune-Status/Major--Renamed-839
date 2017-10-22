package com.jagex;

import java.util.Map;

public class VariableBitsDefinitionLoader extends CachedDefinitionLoader<VariableBitsDefinition> {
	public static final int anInt10554 = 64;

	static void method16717() {
		if (1642530983 * Client.currentCutscene < 0) {
			FontSpecification class9 = Class179.method3543();
			if (!Class56.menuOpen) {
				Class56.aBool620 = Class56.anInt622 * -921069631 != -1
						&& Class56.menuOptionCount * 84366055 >= Class56.anInt622 * -921069631
						|| (Class56.aBool642 ? 26 : 22) + Class56.anInt616 * -1427683309 * 84366055
								* Class56.menuOptionCount > Engine.screenHeight * -551672947;
			}
			Class56.aClass644_614.clear();
			Class56.aClass644_613.clear();
			for (MenuOption class480_sub31_sub17 = MenuOption.options.head(); null != class480_sub31_sub17; class480_sub31_sub17 = MenuOption.options
					.next()) {
				int i_0_ = -20536735 * class480_sub31_sub17.type;
				if (i_0_ < 1000) {
					class480_sub31_sub17.unlink();
					if (59 == i_0_ || i_0_ == 2 || i_0_ == 8 || i_0_ == 17 || 15 == i_0_ || i_0_ == 16 || 58 == i_0_) {
						Class56.aClass644_613.pushBack(class480_sub31_sub17);
					} else {
						Class56.aClass644_614.pushBack(class480_sub31_sub17);
					}
				}
			}
			Class56.aClass644_614.join(MenuOption.options);
			Class56.aClass644_613.join(MenuOption.options);
			if (Class56.menuOptionCount * 84366055 > 1) {
				if (Class612.method10339() && Class56.menuOptionCount * 84366055 > 2) {
					Class480_Sub41_Sub4.aClass480_Sub31_Sub17_11430 = (MenuOption) MenuOption.options.tail.previous.previous;
				} else {
					Class480_Sub41_Sub4.aClass480_Sub31_Sub17_11430 = (MenuOption) MenuOption.options.tail.previous;
				}
				Class56.aClass480_Sub31_Sub17_647 = (MenuOption) MenuOption.options.tail.previous;
				if (84366055 * Class56.menuOptionCount > 2) {
					MenuOption.aClass480_Sub31_Sub17_348 = (MenuOption) Class56.aClass480_Sub31_Sub17_647.previous;
				} else {
					MenuOption.aClass480_Sub31_Sub17_348 = null;
				}
			} else {
				Class480_Sub41_Sub4.aClass480_Sub31_Sub17_11430 = null;
				Class56.aClass480_Sub31_Sub17_647 = null;
				MenuOption.aClass480_Sub31_Sub17_348 = null;
			}
			MouseRecord class480_sub20 = Client.mouseRecords.head();
			int i_1_;
			int i_2_;
			if (class480_sub20 != null) {
				i_1_ = class480_sub20.getX();
				i_2_ = class480_sub20.getY();
			} else {
				i_1_ = Client.recorder.getMouseX();
				i_2_ = Client.recorder.getMouseY();
			}
			if (Class56.menuOpen) {
				if (ScriptContext.method16107(Script.aClass580_11401.anInterface62_7754, class480_sub20)) {
					if (null != Class56.aClass480_Sub31_Sub4_646 && i_1_ >= Class56.anInt635 * -1393036739
							&& i_1_ <= -1393036739 * Class56.anInt635 + 328052667 * EnvironmentContext.anInt8164
							&& i_2_ >= Class159.anInt1896 * -2036920667
							&& i_2_ <= -2036920667 * Class159.anInt1896 + FloatRaster.anInt1245 * 217318921) {
						int i_3_ = -1;
						for (int i_4_ = 0; i_4_ < Class56.aClass480_Sub31_Sub4_646.size * 713555001; i_4_++) {
							if (Class56.aBool642) {
								int i_5_ = -1427683309 * Class56.anInt616 * i_4_ + -1971642963 * class9.topPadding + 20
										+ -2036920667 * Class159.anInt1896 + 1;
								if (i_2_ > i_5_ - class9.topPadding * -1971642963 - 1
										&& i_2_ < i_5_ + class9.bottomPadding * -1569538073) {
									i_3_ = i_4_;
								}
							} else {
								int i_6_ = i_4_ * -1427683309 * Class56.anInt616 + Class159.anInt1896 * -2036920667
										+ 31;
								if (i_2_ > i_6_ - 13 && i_2_ < 3 + i_6_) {
									i_3_ = i_4_;
								}
							}
						}
						if (i_3_ != -1) {
							int i_7_ = 0;
							QueueIterator class634 = new QueueIterator(Class56.aClass480_Sub31_Sub4_646.options);
							for (MenuOption class480_sub31_sub17 = (MenuOption) class634.head(); class480_sub31_sub17 != null; class480_sub31_sub17 = (MenuOption) class634
									.next()) {
								if (i_7_ == i_3_) {
									Class467_Sub2.method15327(class480_sub31_sub17, i_1_, i_2_, true);
									break;
								}
								i_7_++;
							}
						}
						HitbarDefinition.method8950();
					} else if (i_1_ >= 907118265 * TextureMetricsList.anInt1822
							&& i_1_ <= Class480_Sub41_Sub4.anInt11432 * -1708755565 + 907118265
									* TextureMetricsList.anInt1822
							&& i_2_ >= MobVariableCollection.anInt6537 * 1889755609
							&& i_2_ <= 1889755609 * MobVariableCollection.anInt6537 + Class593.anInt7836 * 502538357) {
						if (!Class56.aBool620) {
							int i_8_ = -1;
							for (int i_9_ = 0; i_9_ < 84366055 * Class56.menuOptionCount; i_9_++) {
								if (Class56.aBool642) {
									int i_10_ = 1 + 1889755609 * MobVariableCollection.anInt6537 + 20
											+ class9.topPadding * -1971642963
											+ (Class56.menuOptionCount * 84366055 - 1 - i_9_) * -1427683309
											* Class56.anInt616;
									if (i_2_ > i_10_ - -1971642963 * class9.topPadding - 1
											&& i_2_ < i_10_ + -1569538073 * class9.bottomPadding) {
										i_8_ = i_9_;
									}
								} else {
									int i_11_ = (Class56.menuOptionCount * 84366055 - 1 - i_9_) * -1427683309
											* Class56.anInt616 + 1889755609 * MobVariableCollection.anInt6537 + 31;
									if (i_2_ > i_11_ - 13 && i_2_ < 3 + i_11_) {
										i_8_ = i_9_;
									}
								}
							}
							if (-1 != i_8_) {
								int i_12_ = 0;
								DequeIterator class645 = new DequeIterator(MenuOption.options);
								for (MenuOption class480_sub31_sub17 = (MenuOption) class645.front(); class480_sub31_sub17 != null; class480_sub31_sub17 = (MenuOption) class645
										.next()) {
									if (i_8_ == i_12_) {
										Class467_Sub2.method15327(class480_sub31_sub17, i_1_, i_2_, true);
										break;
									}
									i_12_++;
								}
							}
							HitbarDefinition.method8950();
						} else {
							int i_13_ = -1;
							for (int i_14_ = 0; i_14_ < MenuCategory.count * 1469668737; i_14_++) {
								if (Class56.aBool642) {
									int i_15_ = Class56.anInt616 * -1427683309 * i_14_ + 1
											+ MobVariableCollection.anInt6537 * 1889755609 + 20 + -1971642963
											* class9.topPadding;
									if (i_2_ > i_15_ - class9.topPadding * -1971642963 - 1
											&& i_2_ < class9.bottomPadding * -1569538073 + i_15_) {
										i_13_ = i_14_;
										break;
									}
								} else {
									int i_16_ = -1427683309 * Class56.anInt616 * i_14_ + 31 + 1889755609
											* MobVariableCollection.anInt6537;
									if (i_2_ > i_16_ - 13 && i_2_ < i_16_ + 3) {
										i_13_ = i_14_;
										break;
									}
								}
							}
							if (i_13_ != -1) {
								int i_17_ = 0;
								QueueIterator class634 = new QueueIterator(Class56.aClass638_631);
								for (MenuCategory class480_sub31_sub4 = (MenuCategory) class634.head(); class480_sub31_sub4 != null; class480_sub31_sub4 = (MenuCategory) class634
										.next()) {
									if (i_17_ == i_13_) {
										Class467_Sub2.method15327(
												(MenuOption) class480_sub31_sub4.options.tail.nextCacheable, i_1_,
												i_2_, true);
										HitbarDefinition.method8950();
										break;
									}
									i_17_++;
								}
							}
						}
					}
				} else {
					boolean bool = false;
					if (null != Class56.aClass480_Sub31_Sub4_646) {
						if (i_1_ < Class56.anInt635 * -1393036739 - 10
								|| i_1_ > 10 + Class56.anInt635 * -1393036739 + 328052667
										* EnvironmentContext.anInt8164 || i_2_ < Class159.anInt1896 * -2036920667 - 10
								|| i_2_ > 10 + 217318921 * FloatRaster.anInt1245 + Class159.anInt1896 * -2036920667) {
							Class403.method6716();
						} else {
							bool = true;
						}
					}
					if (!bool) {
						if (i_1_ < TextureMetricsList.anInt1822 * 907118265 - 10
								|| i_1_ > Class480_Sub41_Sub4.anInt11432 * -1708755565 + TextureMetricsList.anInt1822
										* 907118265 + 10
								|| i_2_ < MobVariableCollection.anInt6537 * 1889755609 - 10
								|| i_2_ > 10 + 1889755609 * MobVariableCollection.anInt6537 + Class593.anInt7836
										* 502538357) {
							HitbarDefinition.method8950();
						} else if (Class56.aBool620) {
							int i_18_ = -1;
							int i_19_ = -1;
							for (int i_20_ = 0; i_20_ < MenuCategory.count * 1469668737; i_20_++) {
								if (Class56.aBool642) {
									int i_21_ = class9.topPadding * -1971642963 + 1889755609
											* MobVariableCollection.anInt6537 + 20 + 1 + i_20_ * -1427683309
											* Class56.anInt616;
									if (i_2_ > i_21_ - -1971642963 * class9.topPadding - 1
											&& i_2_ < i_21_ + -1569538073 * class9.bottomPadding) {
										i_18_ = i_20_;
										i_19_ = i_21_ - class9.topPadding * -1971642963 - 1;
										break;
									}
								} else {
									int i_22_ = MobVariableCollection.anInt6537 * 1889755609 + 31 + i_20_
											* Class56.anInt616 * -1427683309;
									if (i_2_ > i_22_ - 13 && i_2_ < 3 + i_22_) {
										i_18_ = i_20_;
										i_19_ = i_22_ - 13;
										break;
									}
								}
							}
							if (i_18_ != -1) {
								int i_23_ = 0;
								QueueIterator class634 = new QueueIterator(Class56.aClass638_631);
								for (MenuCategory class480_sub31_sub4 = (MenuCategory) class634.head(); class480_sub31_sub4 != null; class480_sub31_sub4 = (MenuCategory) class634
										.next()) {
									if (i_23_ == i_18_) {
										if (class480_sub31_sub4.size * 713555001 > 1) {
											Class480_Sub21_Sub4.method17756(class480_sub31_sub4, i_19_, (byte) -55);
										}
										break;
									}
									i_23_++;
								}
							}
						}
					}
				}
			} else {
				boolean bool = ScriptContext.method16107(Script.aClass580_11401.anInterface62_7757, class480_sub20);
				boolean bool_24_ = ScriptContext.method16107(Script.aClass580_11401.anInterface62_7755, class480_sub20);
				boolean bool_25_ = ScriptContext.method16107(Script.aClass580_11401.anInterface62_7756, class480_sub20);
				if ((bool || bool_24_)
						&& (-1088062211 * Client.anInt10780 == 1 && Class56.menuOptionCount * 84366055 > 2 || Class436
								.method7269())) {
					bool_25_ = true;
				}
				if (bool_25_ && 84366055 * Class56.menuOptionCount > 0) {
					if (null == Client.aClass226_10801 && -1296345277 * Client.anInt10815 == 0) {
						RegionUpdateType.method6030(i_1_, i_2_);
					} else {
						Class56.anInt632 = -1714033414;
					}
				} else if (bool_24_) {
					if (null != MenuOption.aClass480_Sub31_Sub17_348) {
						Class467_Sub2.method15327(MenuOption.aClass480_Sub31_Sub17_348, i_1_, i_2_, false);
					}
				} else if (bool) {
					if (null != Class480_Sub41_Sub4.aClass480_Sub31_Sub17_11430) {
						boolean bool_26_ = null != Client.aClass226_10801 || Client.anInt10815 * -1296345277 > 0;
						if (bool_26_) {
							Class56.anInt632 = -857016707;
							Class293.aClass480_Sub31_Sub17_3254 = Class480_Sub41_Sub4.aClass480_Sub31_Sub17_11430;
						} else {
							Class467_Sub2.method15327(Class480_Sub41_Sub4.aClass480_Sub31_Sub17_11430, i_1_, i_2_,
									false);
						}
					} else if (Client.widgetSelected) {
						PlayerVariableProvider.method1560();
					}
				}
				if (Client.aClass226_10801 == null && Client.anInt10815 * -1296345277 == 0) {
					Class56.anInt632 = 0;
					Class293.aClass480_Sub31_Sub17_3254 = null;
				}
			}
		}
	}

	public VariableBitsDefinitionLoader(GameContext context, Language language, Archive config, Map map) {
		super(context, language, config, ConfigEntry.VARIABLE_BITS, 64, new VariableBitsDefinitionProvider(map));
	}

}