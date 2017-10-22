package com.jagex;

public class Class57 {
	static final int anInt661 = 12;
	static char[] aCharArray662 = { ' ', '\u00a0', '_', '-', '\u00e0', '\u00e1', '\u00e2', '\u00e4', '\u00e3',
			'\u00c0', '\u00c1', '\u00c2', '\u00c4', '\u00c3', '\u00e8', '\u00e9', '\u00ea', '\u00eb', '\u00c8',
			'\u00c9', '\u00ca', '\u00cb', '\u00ed', '\u00ee', '\u00ef', '\u00cd', '\u00ce', '\u00cf', '\u00f2',
			'\u00f3', '\u00f4', '\u00f6', '\u00f5', '\u00d2', '\u00d3', '\u00d4', '\u00d6', '\u00d5', '\u00f9',
			'\u00fa', '\u00fb', '\u00fc', '\u00d9', '\u00da', '\u00db', '\u00dc', '\u00e7', '\u00c7', '\u00ff',
			'\u0178', '\u00f1', '\u00d1', '\u00df' };
	static final int anInt663 = 1;
	static char[] aCharArray664 = { '[', ']', '#' };

	public static void method1361(Widget class226, int i, int i_0_) {
		if (null != class226) {
			if (null != class226.anObjectArray2494) {
				ScriptContext class480_sub35 = new ScriptContext();
				class480_sub35.source = class226;
				class480_sub35.arguments = class226.anObjectArray2494;
				Script.execute(class480_sub35);
			}
			Client.widgetSelected = true;
			Class490.anInt6751 = 1663723645 * class226.id;
			Client.anInt10756 = class226.component * 1246708015;
			Class577.selectedWidgetAttributes = i * 697287051;
			LookupTable.anInt2647 = i_0_ * -949627509;
			Client.anInt10867 = class226.item * 530929851;
			Class166_Sub8.anInt9550 = class226.anInt2484 * -287979831;
			Client.anInt10782 = 1338442557 * class226.anInt2463;
			Widget.redraw(class226);
		}
	}

	static void method1362(Toolkit class134) {
		int i_2_ = TextureMetricsList.anInt1822 * 907118265;
		int i_3_ = 1889755609 * MobVariableCollection.anInt6537;
		int i_4_ = -1708755565 * Class480_Sub41_Sub4.anInt11432;
		int i_5_ = Class593.anInt7836 * 502538357 - 3;
		int i_6_ = 20;
		if (null == VariableBitsDefinitionProvider.aClass132_9779 || null == Class592.aClass9_7834) {
			VariableBitsDefinitionProvider.aClass132_9779 = (Font) Class509.aClass374_6997.method6124(
					Client.anInterface47_10645, Class487.anInt6668 * -787737139, true, true);
			Class592.aClass9_7834 = Class509.aClass374_6997.method6125(Client.anInterface47_10645, Class487.anInt6668
					* -787737139);
			if (VariableBitsDefinitionProvider.aClass132_9779 != null && null != Class592.aClass9_7834) {
				HitbarDefinition.method8950();
				int i_7_ = i_4_ / 2 + i_2_;
				if (i_7_ + i_4_ > Engine.screenWidth * 1319181337) {
					i_7_ = 1319181337 * Engine.screenWidth - i_4_;
				}
				if (i_7_ < 0) {
					i_7_ = 0;
				}
				RegionUpdateType.method6030(i_7_, 1889755609 * MobVariableCollection.anInt6537);
				return;
			}
		}
		Font class132;
		if (null == VariableBitsDefinitionProvider.aClass132_9779 || Class592.aClass9_7834 == null) {
			class132 = Class450.b12Full;
		} else {
			class132 = VariableBitsDefinitionProvider.aClass132_9779;
		}
		FontSpecification class9 = Class179.method3543();
		Class262.method4965(class134, TextureMetricsList.anInt1822 * 907118265,
				1889755609 * MobVariableCollection.anInt6537, Class480_Sub41_Sub4.anInt11432 * -1708755565,
				Class593.anInt7836 * 502538357, i_6_, class132, class9,
				TranslatableString.CHOOSE_OPTION.translate(Client.currentLanguage), -1886452245);
		int i_8_ = 255 - -355382265 * Class56.anInt643 - -1755800039 * Class56.anInt648;
		if (i_8_ < 0) {
			i_8_ = 0;
		}
		int i_9_ = Client.recorder.getMouseX();
		int i_10_ = Client.recorder.getMouseY();
		if (!Class56.aBool620) {
			int i_11_ = 0;
			for (MenuOption class480_sub31_sub17 = MenuOption.options.head(); class480_sub31_sub17 != null; class480_sub31_sub17 = MenuOption.options
					.next()) {
				int i_12_ = (Class56.menuOptionCount * 84366055 - 1 - i_11_) * -1427683309 * Class56.anInt616
						+ -1971642963 * class9.topPadding + i_3_ + i_6_ + 1;
				if (i_9_ > 907118265 * TextureMetricsList.anInt1822
						&& i_9_ < -1708755565 * Class480_Sub41_Sub4.anInt11432 + TextureMetricsList.anInt1822
								* 907118265 && i_10_ > i_12_ - -1971642963 * class9.topPadding - 1
						&& i_10_ < i_12_ + -1569538073 * class9.bottomPadding && class480_sub31_sub17.aBool11412) {
					class134.method2434(907118265 * TextureMetricsList.anInt1822, i_12_ - class9.topPadding
							* -1971642963, -1708755565 * Class480_Sub41_Sub4.anInt11432,
							-1427683309 * Class56.anInt616, i_8_ << 24 | -779188867 * Language.anInt7969, 1);
				}
				i_11_++;
			}
		} else {
			int i_13_ = 0;
			for (MenuCategory class480_sub31_sub4 = (MenuCategory) Class56.aClass638_631.getFront(); class480_sub31_sub4 != null; class480_sub31_sub4 = (MenuCategory) Class56.aClass638_631
					.next()) {
				int i_14_ = 1 + i_6_ + i_3_ + class9.topPadding * -1971642963 + -1427683309 * Class56.anInt616 * i_13_;
				if (i_9_ > TextureMetricsList.anInt1822 * 907118265
						&& i_9_ < 907118265 * TextureMetricsList.anInt1822 + -1708755565
								* Class480_Sub41_Sub4.anInt11432
						&& i_10_ > i_14_ - class9.topPadding * -1971642963 - 1
						&& i_10_ < i_14_ + -1569538073 * class9.bottomPadding
						&& (class480_sub31_sub4.size * 713555001 > 1 || ((MenuOption) class480_sub31_sub4.options.tail.nextCacheable).aBool11412)) {
					class134.method2434(907118265 * TextureMetricsList.anInt1822, i_14_ - class9.topPadding
							* -1971642963, -1708755565 * Class480_Sub41_Sub4.anInt11432,
							Class56.anInt616 * -1427683309, i_8_ << 24 | Language.anInt7969 * -779188867, 1);
				}
				i_13_++;
			}
			if (Class56.aClass480_Sub31_Sub4_646 != null) {
				Class262.method4965(class134, -1393036739 * Class56.anInt635, Class159.anInt1896 * -2036920667,
						328052667 * EnvironmentContext.anInt8164, FloatRaster.anInt1245 * 217318921, i_6_, class132,
						class9, Class56.aClass480_Sub31_Sub4_646.title, -1886452245);
				i_13_ = 0;
				for (MenuOption class480_sub31_sub17 = Class56.aClass480_Sub31_Sub4_646.options.getFront(); null != class480_sub31_sub17; class480_sub31_sub17 = Class56.aClass480_Sub31_Sub4_646.options
						.next()) {
					int i_15_ = class9.topPadding * -1971642963 + i_6_ + Class159.anInt1896 * -2036920667 + 1 + i_13_
							* Class56.anInt616 * -1427683309;
					if (i_9_ > Class56.anInt635 * -1393036739
							&& i_9_ < 328052667 * EnvironmentContext.anInt8164 + -1393036739 * Class56.anInt635
							&& i_10_ > i_15_ - class9.topPadding * -1971642963 - 1
							&& i_10_ < class9.bottomPadding * -1569538073 + i_15_ && class480_sub31_sub17.aBool11412) {
						class134.method2434(-1393036739 * Class56.anInt635, i_15_ - class9.topPadding * -1971642963,
								328052667 * EnvironmentContext.anInt8164, -1427683309 * Class56.anInt616, i_8_ << 24
										| Language.anInt7969 * -779188867, 1);
					}
					i_13_++;
				}
				CursorDefinitionLoader.method16797(class134, -1393036739 * Class56.anInt635, -2036920667
						* Class159.anInt1896, 328052667 * EnvironmentContext.anInt8164, FloatRaster.anInt1245 * 217318921,
						i_6_, -768799385);
			}
		}
		CursorDefinitionLoader.method16797(class134, TextureMetricsList.anInt1822 * 907118265,
				MobVariableCollection.anInt6537 * 1889755609, -1708755565 * Class480_Sub41_Sub4.anInt11432,
				502538357 * Class593.anInt7836, i_6_, -768799385);
		if (!Class56.aBool620) {
			int i_16_ = 0;
			for (MenuOption class480_sub31_sub17 = MenuOption.options.head(); class480_sub31_sub17 != null; class480_sub31_sub17 = MenuOption.options
					.next()) {
				int i_17_ = class9.topPadding * -1971642963 + i_3_ + i_6_ + 1
						+ (Class56.menuOptionCount * 84366055 - 1 - i_16_) * Class56.anInt616 * -1427683309;
				JavaToolkit.method14153(i_9_, i_10_, i_2_, i_3_, i_4_, i_5_, i_17_, class480_sub31_sub17, class132,
						class9, Class283.anInt3167 * -1814862193 | ~0xffffff,
						-23155607 * Class79.anInt1158 | ~0xffffff, 2121911449);
				i_16_++;
			}
		} else {
			int i_18_ = 0;
			for (MenuCategory class480_sub31_sub4 = (MenuCategory) Class56.aClass638_631.getFront(); null != class480_sub31_sub4; class480_sub31_sub4 = (MenuCategory) Class56.aClass638_631
					.next()) {
				int i_19_ = 1 + 1889755609 * MobVariableCollection.anInt6537 + i_6_ + class9.topPadding * -1971642963
						+ i_18_ * -1427683309 * Class56.anInt616;
				if (1 == class480_sub31_sub4.size * 713555001) {
					JavaToolkit.method14153(i_9_, i_10_, 907118265 * TextureMetricsList.anInt1822,
							MobVariableCollection.anInt6537 * 1889755609, Class480_Sub41_Sub4.anInt11432 * -1708755565,
							Class593.anInt7836 * 502538357, i_19_,
							(MenuOption) class480_sub31_sub4.options.tail.nextCacheable, class132, class9,
							Class283.anInt3167 * -1814862193 | ~0xffffff, Class79.anInt1158 * -23155607 | ~0xffffff,
							2069641259);
				} else {
					Class50.method1125(i_9_, i_10_, 907118265 * TextureMetricsList.anInt1822,
							MobVariableCollection.anInt6537 * 1889755609, Class480_Sub41_Sub4.anInt11432 * -1708755565,
							502538357 * Class593.anInt7836, i_19_, class480_sub31_sub4, class132, class9,
							Class283.anInt3167 * -1814862193 | ~0xffffff, Class79.anInt1158 * -23155607 | ~0xffffff,
							1156223154);
				}
				i_18_++;
			}
			if (null != Class56.aClass480_Sub31_Sub4_646) {
				i_18_ = 0;
				for (MenuOption class480_sub31_sub17 = Class56.aClass480_Sub31_Sub4_646.options.getFront(); null != class480_sub31_sub17; class480_sub31_sub17 = Class56.aClass480_Sub31_Sub4_646.options
						.next()) {
					int i_20_ = 1 + -2036920667 * Class159.anInt1896 + i_6_ + class9.topPadding * -1971642963 + i_18_
							* -1427683309 * Class56.anInt616;
					JavaToolkit.method14153(i_9_, i_10_, Class56.anInt635 * -1393036739, Class159.anInt1896
							* -2036920667, 328052667 * EnvironmentContext.anInt8164, 217318921 * FloatRaster.anInt1245,
							i_20_, class480_sub31_sub17, class132, class9,
							Class283.anInt3167 * -1814862193 | ~0xffffff, -23155607 * Class79.anInt1158 | ~0xffffff,
							1924313372);
					i_18_++;
				}
			}
		}
	}

	Class57() throws Throwable {
		throw new Error();
	}
}
