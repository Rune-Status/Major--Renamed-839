package com.jagex;

public class Class237 {
	static final int anInt2621 = 100;
	public static Class461 aClass461_2622;

	static final int method4432(int i) {
		return i >> 11 & 0x7f;
	}

	int anInt2619;
	Class480_Sub31_Sub13[] aClass480_Sub31_Sub13Array2620 = new Class480_Sub31_Sub13[100];

	Class480_Sub31_Sub13 method4421(int i) {
		if (i < 0 || i >= anInt2619 * 2064451505) {
			return null;
		}

		return aClass480_Sub31_Sub13Array2620[i];
	}

	int method4422() {
		return anInt2619 * 2064451505;
	}

	Class480_Sub31_Sub13 method4423(int i, int i_1_, String string, String string_2_, String string_3_,
			String string_4_, String string_5_, int i_6_, Class351 class351) {
		Class480_Sub31_Sub13 class480_sub31_sub13 = aClass480_Sub31_Sub13Array2620[99];
		for (int i_8_ = anInt2619 * 2064451505; i_8_ > 0; i_8_--) {
			if (i_8_ != 100) {
				aClass480_Sub31_Sub13Array2620[i_8_] = aClass480_Sub31_Sub13Array2620[i_8_ - 1];
			}
		}
		if (class480_sub31_sub13 == null) {
			class480_sub31_sub13 = new Class480_Sub31_Sub13(i, i_1_, string, string_2_, string_3_, string_5_, i_6_,
					string_4_, class351);
		} else {
			class480_sub31_sub13.unlink();
			class480_sub31_sub13.uncache();
			class480_sub31_sub13.method17836(i, i_1_, string, string_2_, string_3_, string_5_, i_6_, string_4_,
					class351);
		}
		aClass480_Sub31_Sub13Array2620[0] = class480_sub31_sub13;
		if (2064451505 * anInt2619 < 100) {
			anInt2619 += 343859537;
		}
		return class480_sub31_sub13;
	}

}