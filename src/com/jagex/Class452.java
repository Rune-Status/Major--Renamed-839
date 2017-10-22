package com.jagex;

public class Class452 {
	public static int anInt5091;

	public static String filterName(CharSequence sequence) {
		String string = Class55.decodeBase37(Class173.encodeBase37(sequence));
		if (null == string) {
			string = "";
		}
		return string;
	}

	public static String decimalToString(int value, boolean bool) {
		if (!bool || value < 0) {
			return Integer.toString(value);
		}
		return Class527.intToString(value, 10, bool);
	}

	static final void method7410(Toolkit toolkit, int i, int i_4_, int i_5_, int i_6_, int i_7_) {
		toolkit.method2760(i, i_4_, i_5_ + i, i_4_ + i_6_);
		toolkit.method2805(i, i_4_, i_5_, i_6_, -16777216);
		if (147042807 * Class495_Sub1.anInt10322 >= 100) {
			float f = (float) Class495.anInt6826 / (float) Class495.anInt6824;
			int i_8_ = i_5_;
			int i_9_ = i_6_;
			if (f < 1.0F) {
				i_9_ = (int) (f * i_5_);
			} else {
				i_8_ = (int) (i_6_ / f);
			}
			i += (i_5_ - i_8_) / 2;
			i_4_ += (i_6_ - i_9_) / 2;
			if (Class361.aClass116_3912 == null || Class361.aClass116_3912.method2157() != i_8_
					|| Class361.aClass116_3912.method2119() != i_9_) {
				Class495.aClass168_6848 = Class495.aClass168_6810;
				Class495.method8561(Class495.anInt6849, Class495.anInt6826 + Class495.anInt6823, Class495.anInt6849
						+ Class495.anInt6824, Class495.anInt6823, i, i_4_, i_8_ + i, i_4_ + i_9_);
				Class495.method8562(toolkit, false, false, Client.membersWorld, true);
				toolkit.method2456();
				Class361.aClass116_3912 = toolkit.method2630(i, i_4_, i_8_, i_9_, true);
			}
			Class361.aClass116_3912.method2079(i, i_4_);
			int i_10_ = i_8_ * CacheResourceWorker.anInt4892 * -1258027563 / Class495.anInt6824;
			int i_11_ = i_9_ * Preference.anInt8072 * -1102731111 / Class495.anInt6826;
			int i_12_ = i + LoadingRequirementType.anInt236 * -1525426341 * i_8_ / Class495.anInt6824;
			int i_13_ = i_9_ + i_4_ - i_9_ * -1888578309 * Class222_Sub1.anInt9541 / Class495.anInt6826 - i_11_;
			int i_14_ = -1996554240;
			if (GameContext.STELLAR_DAWN == Client.game) {
				i_14_ = -1996488705;
			}
			toolkit.method2434(i_12_, i_13_, i_10_, i_11_, i_14_, 1);
			toolkit.method2625(i_12_, i_13_, i_10_, i_11_, i_14_, 0);
			for (Class480_Sub37 class480_sub37 = (Class480_Sub37) Class495.aClass644_6820.head(); null != class480_sub37; class480_sub37 = (Class480_Sub37) Class495.aClass644_6820
					.next()) {
				Class224 class224 = (Class224) Class495.aClass678_Sub8_6803.get(818539827 * class480_sub37.id);
				if (Class360.method6048(class224)) {
					Class36 class36 = (Class36) Class495_Sub1.aHashMap10331.get(Integer
							.valueOf(class480_sub37.id * 818539827));
					if (null == class36) {
						class36 = (Class36) Class495_Sub1.aHashMap10332.get(Integer
								.valueOf(1606761481 * class224.anInt2303));
					}
					if (null != class36) {
						int i_15_;
						if (417680777 * class36.anInt459 > Class495_Sub1.anInt10334 * 933816983 / 2) {
							i_15_ = (1900129385 * Class495_Sub1.anInt10334 - class36.anInt459 * -865584265)
									/ (Class495_Sub1.anInt10334 * 933816983);
						} else {
							i_15_ = class36.anInt459 * -865584265 / (933816983 * Class495_Sub1.anInt10334);
						}
						int i_16_ = i + i_8_ * -1639918769 * class480_sub37.anInt10310 / Class495.anInt6824;
						int i_17_ = i_4_ + i_9_ * (Class495.anInt6826 - -342421335 * class480_sub37.anInt10308)
								/ Class495.anInt6826;
						toolkit.method2805(i_16_ - 2, i_17_ - 2, 4, 4, i_15_ << 24 | 0xffff00);
					}
				}
			}
			Class495.aClass168_6810.sweep(5);
		}
	}

	FrameBuffer buffer;
	Class458 aClass458_5090;

	public Class452(Class458 class458, FrameBuffer buffer) {
		aClass458_5090 = class458;
		this.buffer = buffer;
	}

}