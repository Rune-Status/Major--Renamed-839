package com.jagex;

public class Class578 {
	static int anInt7740;

	static boolean method9812(Toolkit toolkit, Class480_Sub37 class480_sub37, Class224 class224, int i, int i_0_) {
		if (Class495.aBool6834
				&& !Client.membersWorld
				&& !Class495
						.method8573(class480_sub37.anInt10310 * -1639918769, -342421335 * class480_sub37.anInt10308)) {
			return false;
		}
		if (null != class224.morphisms) {
			class224 = class224.method4211(Class495.anInterface14_6806, Class495.anInterface12_6805);
			if (null == class224) {
				return false;
			}
		}
		int i_2_ = 2147483647;
		int i_3_ = -2147483648;
		int i_4_ = 2147483647;
		int i_5_ = -2147483648;
		if (null != class224.anIntArray2324) {
			i_2_ = (-280927385 * class224.anInt2310 + class480_sub37.anInt10310 * -1639918769 - Class495.anInt6860)
					* (Class495.anInt6856 - Class495.anInt6864) / (Class495.anInt6862 - Class495.anInt6860)
					+ Class495.anInt6864;
			i_3_ = (Class495.anInt6856 - Class495.anInt6864)
					* (1010267847 * class224.anInt2327 + -1639918769 * class480_sub37.anInt10310 - Class495.anInt6860)
					/ (Class495.anInt6862 - Class495.anInt6860) + Class495.anInt6864;
			i_5_ = Class495.anInt6807
					- (-342421335 * class480_sub37.anInt10308 + class224.anInt2326 * -2101247021 - Class495.anInt6863)
					* (Class495.anInt6807 - Class495.anInt6865) / (Class495.anInt6861 - Class495.anInt6863);
			i_4_ = Class495.anInt6807 - (Class495.anInt6807 - Class495.anInt6865)
					* (-342421335 * class480_sub37.anInt10308 + -1478762713 * class224.anInt2328 - Class495.anInt6863)
					/ (Class495.anInt6861 - Class495.anInt6863);
		}

		Sprite sprite = null;
		int i_6_ = 0;
		int i_7_ = 0;
		int i_8_ = 0;
		int i_9_ = 0;

		if (1584610185 * class224.anInt2299 != -1) {
			if (class480_sub37.aBool10311 && class224.anInt2305 * 823274667 != -1) {
				sprite = class224.method4207(toolkit, true);
			} else {
				sprite = class224.method4207(toolkit, false);
			}

			if (sprite != null) {
				switch (class224.aClass203_2341.anInt2125 * 347466895) {
					case 1:
						i_6_ = class480_sub37.anInt10312 * 1496520741 - (sprite.scaleWidth() + 1 >> 1);
						i_7_ = class480_sub37.anInt10312 * 1496520741 + (sprite.scaleWidth() + 1 >> 1);
						break;
					case 2:
						i_6_ = class480_sub37.anInt10312 * 1496520741;
						i_7_ = 1496520741 * class480_sub37.anInt10312 + sprite.scaleWidth();
						break;
					case 0:
						i_6_ = class480_sub37.anInt10312 * 1496520741 - sprite.scaleWidth();
						i_7_ = class480_sub37.anInt10312 * 1496520741;
						break;
				}
				switch (class224.aClass220_2336.anInt2275 * -340911157) {
					case 2:
						i_8_ = 1449501693 * class480_sub37.anInt10313 - sprite.scaleHeight();
						i_9_ = 1449501693 * class480_sub37.anInt10313;
						break;
					case 0:
						i_8_ = class480_sub37.anInt10313 * 1449501693 - (sprite.scaleHeight() + 1 >> 1);
						i_9_ = 1449501693 * class480_sub37.anInt10313 + (sprite.scaleHeight() + 1 >> 1);
						break;
					case 1:
						i_8_ = class480_sub37.anInt10313 * 1449501693;
						i_9_ = class480_sub37.anInt10313 * 1449501693 + sprite.scaleHeight();
						break;
				}
				if (i_6_ < i_2_) {
					i_2_ = i_6_;
				}
				if (i_7_ > i_3_) {
					i_3_ = i_7_;
				}
				if (i_8_ < i_4_) {
					i_4_ = i_8_;
				}
				if (i_9_ > i_5_) {
					i_5_ = i_9_;
				}
			}
		}
		Sprite class116_10_ = null;
		if (class224.anInt2296 * -667407941 != -1) {
			class116_10_ = class224.method4208(toolkit);
		}
		int i_11_ = 0;
		int i_12_ = 0;
		int i_13_ = 0;
		int i_14_ = 0;
		int i_15_ = 0;
		int i_16_ = 0;
		int i_17_ = 0;
		int i_18_ = 0;
		if (null != class224.aString2301) {
			EnvironmentContext.method13263(class224.anInt2335 * 42167249, (byte) -46);
			if (null != Class679.aClass132_288) {
				i_18_ = ChecksumTableEntry.aClass9_4512
						.textHeight(class224.aString2301, Engine.screenWidth * 1319181337, 0, null);
				i_13_ = ChecksumTableEntry.aClass9_4512.textWidth(class224.aString2301, Engine.screenWidth * 1319181337, null);
				i_11_ = class224.anInt2333 * 1047454583 * (Class495.anInt6856 - Class495.anInt6864)
						/ (Class495.anInt6862 - Class495.anInt6860) + 1496520741 * class480_sub37.anInt10312 - i_13_
						/ 2;
				i_12_ = class480_sub37.anInt10313 * 1449501693 - (Class495.anInt6807 - Class495.anInt6865)
						* class224.anInt2338 * -61102559 / (Class495.anInt6861 - Class495.anInt6863);
				if (null == sprite) {
					i_12_ -= i_18_ / 2;
				} else {
					i_12_ -= (sprite.scaleHeight() >> 1) + i_18_;
				}
				i_14_ = i + i_11_;
				if (i_14_ < i_2_) {
					i_2_ = i_14_;
				}
				i_15_ = i + i_13_ + i_11_;
				if (i_15_ > i_3_) {
					i_3_ = i_15_;
				}
				i_16_ = i_0_ + i_12_;
				if (i_16_ < i_4_) {
					i_4_ = i_16_;
				}
				i_17_ = i_0_ + i_12_ + i_18_;
				if (i_17_ > i_5_) {
					i_5_ = i_17_;
				}
			}
		}
		if (i_3_ < Class495.anInt6864 || i_2_ > Class495.anInt6856 || i_5_ < Class495.anInt6865
				|| i_4_ > Class495.anInt6807) {
			return true;
		}
		Class495.method8572(toolkit, class480_sub37, class224);
		if (null != sprite) {
			int i_19_ = 0;
			int i_20_ = 0;
			int i_21_ = 0;
			int i_22_ = 0;
			int i_23_ = 0;
			int i_24_ = 0;
			switch (class224.aClass203_2341.anInt2125 * 347466895) {
				case 1:
					i_19_ = sprite.method2157() / 2;
					i_21_ = sprite.scaleWidth() >> 1;
					break;
				case 2:
					i_20_ = -(sprite.method2157() + 1) / 2;
					break;
				case 0:
					i_19_ = sprite.method2157();
					i_20_ = (sprite.method2157() + 1) / 2;
					i_21_ = sprite.scaleWidth();
					break;
			}
			switch (class224.aClass220_2336.anInt2275 * -340911157) {
				case 2:
					i_22_ = sprite.method2157();
					i_23_ = (sprite.method2157() + 1) / 2;
					i_24_ = sprite.scaleHeight();
					break;
				case 1:
					i_23_ = -(sprite.method2157() + 1) / 2;
					break;
				case 0:
					i_22_ = sprite.method2157() / 2;
					i_24_ = sprite.scaleHeight() >> 1;
					break;
			}
			Class36 class36 = (Class36) Class495_Sub1.aHashMap10331.get(Integer.valueOf(818539827 * class480_sub37.id));
			if (null == class36) {
				class36 = (Class36) Class495_Sub1.aHashMap10332.get(Integer.valueOf(1606761481 * class224.anInt2303));
			}
			if (class36 != null && class224.anInt2296 * -667407941 == -1) {
				int i_25_;
				if (417680777 * class36.anInt459 > Class495_Sub1.anInt10334 * 933816983 / 2) {
					i_25_ = (1900129385 * Class495_Sub1.anInt10334 - -865584265 * class36.anInt459)
							/ (933816983 * Class495_Sub1.anInt10334);
				} else {
					i_25_ = class36.anInt459 * -865584265 / (Class495_Sub1.anInt10334 * 933816983);
				}
				int i_26_ = i_25_ << 24 | 0xffff00;
				if (toolkit instanceof NativeToolkit) {
					toolkit.method2805(1496520741 * class480_sub37.anInt10312 - i_19_ - 7, class480_sub37.anInt10313
							* 1449501693 - i_22_ - 7, sprite.method2157() + 14, sprite.method2157() + 14, i_26_);
					toolkit.method2805(class480_sub37.anInt10312 * 1496520741 - i_19_ - 5, 1449501693
							* class480_sub37.anInt10313 - i_22_ - 5, sprite.method2157() + 10,
							sprite.method2157() + 10, i_26_);
					toolkit.method2805(class480_sub37.anInt10312 * 1496520741 - i_19_ - 3, 1449501693
							* class480_sub37.anInt10313 - i_22_ - 3, sprite.method2157() + 6, sprite.method2157() + 6,
							i_26_);
					toolkit.method2805(1496520741 * class480_sub37.anInt10312 - i_19_ - 1, 1449501693
							* class480_sub37.anInt10313 - i_22_ - 1, sprite.method2157() + 2, sprite.method2157() + 2,
							i_26_);
					toolkit.method2805(class480_sub37.anInt10312 * 1496520741 - i_19_, 1449501693
							* class480_sub37.anInt10313 - i_22_, sprite.method2157(), sprite.method2157(), i_26_);
				} else {
					toolkit.method2827(class480_sub37.anInt10312 * 1496520741 - i_20_, class480_sub37.anInt10313
							* 1449501693 - i_23_, sprite.method2157() / 2 + 7, i_26_, -528818615);
					toolkit.method2827(class480_sub37.anInt10312 * 1496520741 - i_20_, class480_sub37.anInt10313
							* 1449501693 - i_23_ - i_23_ != 0 ? 1 : 0, sprite.method2157() / 2 + 5, i_26_, -80845405);
					toolkit.method2827(1496520741 * class480_sub37.anInt10312 - i_20_, 1449501693
							* class480_sub37.anInt10313 - i_23_ - i_23_ != 0 ? 1 : 0, sprite.method2157() / 2 + 3,
							i_26_, -2006205343);
					toolkit.method2827(1496520741 * class480_sub37.anInt10312 - i_20_, class480_sub37.anInt10313
							* 1449501693 - i_23_ - i_23_ != 0 ? 1 : 0, sprite.method2157() / 2 + 1, i_26_, 1343475885);
					toolkit.method2827(class480_sub37.anInt10312 * 1496520741 - i_20_, class480_sub37.anInt10313
							* 1449501693 - i_23_ - i_23_ != 0 ? 1 : 0, sprite.method2157() / 2, i_26_, 495837471);
				}
			}
			sprite.method2079(1496520741 * class480_sub37.anInt10312 - i_21_, class480_sub37.anInt10313 * 1449501693
					- i_24_);
			int i_27_ = 0;
			int i_28_ = 0;
			if (null != class36 && null != class116_10_) {
				switch (347466895 * class224.aClass203_2341.anInt2125) {
					case 0:
						break;
					case 2:
						i_27_ = class116_10_.scaleWidth();
						break;
					case 1:
						i_27_ = class116_10_.scaleWidth() >> 1;
						break;
				}
				switch (-340911157 * class224.aClass220_2336.anInt2275) {
					case 0:
						i_28_ = (class116_10_.scaleHeight() / 2 + sprite.scaleHeight()) / 2;
						break;
					case 2:
						i_28_ = (class116_10_.scaleHeight() + sprite.scaleHeight()) / 2;
						break;
				}
				int i_29_;
				if (417680777 * class36.anInt459 > 933816983 * Class495_Sub1.anInt10334 / 2) {
					i_29_ = (Class495_Sub1.anInt10334 * 1900129385 - -865584265 * class36.anInt459)
							/ (Class495_Sub1.anInt10334 * 933816983);
				} else {
					i_29_ = class36.anInt459 * -865584265 / (Class495_Sub1.anInt10334 * 933816983);
				}
				int i_30_ = i_29_ << 24 | 0xffff00;
				class116_10_.method2142(class480_sub37.anInt10312 * 1496520741 - i_27_, class480_sub37.anInt10313
						* 1449501693 - i_28_, 0, i_30_, 1);
			}
		}
		if (null != class224.aString2301 && null != Class679.aClass132_288) {
			SoundEffectsVolumeNormaliser.method3468(toolkit, class480_sub37, class224, i_11_, i_12_, i_18_, i_13_,
					(short) 11353);
		}
		if (-1 != 1584610185 * class224.anInt2299 || null != class224.aString2301) {
			Class480_Sub11 class480_sub11 = new Class480_Sub11(class480_sub37);
			class480_sub11.anInt10048 = 1337324989 * i_6_;
			class480_sub11.anInt10045 = i_7_ * 764945005;
			class480_sub11.anInt10046 = i_8_ * -1519212595;
			class480_sub11.anInt10049 = -1951468827 * i_9_;
			class480_sub11.anInt10047 = 367613947 * i_14_;
			class480_sub11.anInt10050 = 972743239 * i_15_;
			class480_sub11.anInt10051 = i_16_ * 2013818577;
			class480_sub11.anInt10052 = i_17_ * 915255835;
			Class208.aClass644_2168.pushBack(class480_sub11);
		}
		return false;
	}

	String aString7738;

	int anInt7739;

	Class578() {

	}
}
