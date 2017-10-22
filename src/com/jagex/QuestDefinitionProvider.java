package com.jagex;

public class QuestDefinitionProvider implements DefinitionProvider<QuestDefinition> {
	static int anInt2664;

	public static final void method4610(Model model, Class650 class650, Class650 class650_4_) {
		if (class650.method13468() && class650_4_.method13468()) {
			AnimationDefinition class175 = class650.animation;
			AnimationDefinition class175_5_ = class650_4_.animation;

			model.method2907(class650.aClass631_8203.aClass480_Sub31_Sub8_8064,
					class650.aClass631_8203.anInt8062 * 140382599, class650.aClass631_8203.aClass480_Sub31_Sub8_8065,
					1088051891 * class650.aClass631_8203.anInt8061, 1563999969 * class650.anInt8206,
					class175.frameDurations[class650.anInt8202 * -1747811733],
					class650_4_.aClass631_8203.aClass480_Sub31_Sub8_8064,
					140382599 * class650_4_.aClass631_8203.anInt8062,
					class650_4_.aClass631_8203.aClass480_Sub31_Sub8_8065,
					class650_4_.aClass631_8203.anInt8061 * 1088051891, class650_4_.anInt8206 * 1563999969,
					class175_5_.frameDurations[class650_4_.anInt8202 * -1747811733],
					class175.aClass176_1979 != null ? class175.aClass176_1979.aBoolArray1991 : null, class175.aBool1971
							| class175_5_.aBool1971);
		}
	}

	static void method4613(Toolkit toolkit, Class480_Sub37 class480_sub37, Class224 class224) {
		Sprite sprite = class224.method4220(toolkit);
		if (null != sprite) {
			int i_8_ = sprite.method2157();
			if (sprite.method2119() > i_8_) {
				i_8_ = sprite.method2119();
			}
			int i_9_ = 10;
			int i_10_ = class480_sub37.anInt10312 * 1496520741;
			int i_11_ = class480_sub37.anInt10313 * 1449501693;
			int i_12_ = 0;
			int i_13_ = 0;
			if (null != class224.aString2301) {
				i_13_ = ChecksumTableEntry.aClass9_4512
						.textHeight(class224.aString2301, 1319181337 * Engine.screenWidth, 0, null);
				i_12_ = ChecksumTableEntry.aClass9_4512.textWidth(class224.aString2301, Engine.screenWidth * 1319181337, null);
			}
			int i_14_ = i_8_ / 2 + class480_sub37.anInt10312 * 1496520741;
			int i_15_ = 1449501693 * class480_sub37.anInt10313;
			if (i_10_ < i_8_ + Class495.anInt6864) {
				i_10_ = Class495.anInt6864;
				i_14_ = i_12_ / 2 + i_9_ + i_8_ / 2 + Class495.anInt6864 + 5;
			} else if (i_10_ > Class495.anInt6856 - i_8_) {
				i_10_ = Class495.anInt6856 - i_8_;
				i_14_ = Class495.anInt6856 - i_8_ / 2 - i_9_ - i_12_ / 2 - 5;
			}
			if (i_11_ < Class495.anInt6865 + i_8_) {
				i_11_ = Class495.anInt6865;
				i_15_ = i_8_ / 2 + i_9_ + Class495.anInt6865;
			} else if (i_11_ > Class495.anInt6807 - i_8_) {
				i_11_ = Class495.anInt6807 - i_8_;
				i_15_ = Class495.anInt6807 - i_8_ / 2 - i_9_ - i_13_;
			}
			int i_16_ = (int) (Math.atan2(i_10_ - class480_sub37.anInt10312 * 1496520741, i_11_ - 1449501693
					* class480_sub37.anInt10313)
					/ Math.PI * 32767.0) & 0xffff;
			sprite.method2091(i_10_ + i_8_ / 2.0F, i_8_ / 2.0F + i_11_, 4096, i_16_);
			int i_17_ = -2;
			int i_18_ = -2;
			int i_19_ = -2;
			int i_20_ = -2;
			if (null != class224.aString2301) {
				i_17_ = i_14_ - i_12_ / 2 - 5;
				i_18_ = i_15_;
				i_19_ = i_17_ + i_12_ + 10;
				i_20_ = 3 + i_13_ + i_18_;
				if (0 != class224.anInt2308 * 305516485) {
					toolkit.method2805(i_17_, i_18_, i_19_ - i_17_, i_20_ - i_18_, 305516485 * class224.anInt2308);
				}
				if (-1701644917 * class224.anInt2309 != 0) {
					toolkit.method2747(i_17_, i_18_, i_19_ - i_17_, i_20_ - i_18_, -1701644917 * class224.anInt2309);
				}
				Class679.aClass132_288.method2294(class224.aString2301, i_14_, i_15_, i_12_, i_13_, ~0xffffff
						| -1423941133 * class224.anInt2302, Class495.aClass560_6827.anInt7539 * -186637827, 1, 0, 0,
						null, null, null, 0, 0);
			}

			if (class224.anInt2299 * 1584610185 != -1 || class224.aString2301 != null) {
				Class480_Sub11 class480_sub11 = new Class480_Sub11(class480_sub37);
				class480_sub11.anInt10048 = (i_10_ - i_8_ / 2) * 1337324989;
				class480_sub11.anInt10045 = (i_8_ / 2 + i_10_) * 764945005;
				class480_sub11.anInt10046 = -1519212595 * (i_11_ - i_8_);
				class480_sub11.anInt10049 = -1951468827 * i_11_;
				class480_sub11.anInt10047 = 367613947 * i_17_;
				class480_sub11.anInt10050 = 972743239 * i_19_;
				class480_sub11.anInt10051 = 2013818577 * i_18_;
				class480_sub11.anInt10052 = i_20_ * 915255835;
				Class208.aClass644_2168.pushBack(class480_sub11);
			}
		}
	}

	@Override
	public Class<QuestDefinition> getClassType() {
		return QuestDefinition.class;
	}

	@Override
	public QuestDefinition provide(int id, DefinitionLoader loader) {
		return new QuestDefinition(id, loader);
	}

}