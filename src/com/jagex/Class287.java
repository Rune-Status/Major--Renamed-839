package com.jagex;

public class Class287 implements Interface28 {
	public static Class562_Sub1 method5302() {
		if (359181819 * Class671.anInt8460 < Class671.aClass562_Sub1Array8455.length) {
			return Class671.aClass562_Sub1Array8455[(Class671.anInt8460 += 374560051) * 359181819 - 1];
		}
		return null;
	}

	Class297 aClass297_3194;
	Class330 aClass330_3195;

	Class287(Class297 class297, Class330 class330) {
		aClass330_3195 = class330;
		aClass297_3194 = class297;
	}

	@Override
	public boolean ready() {
		return aClass297_3194.start();
	}

	@Override
	public void load() {

	}

	@Override
	public void method176(boolean bool) {
		Class292 class292 = aClass297_3194.method5433(1831154633 * aClass330_3195.anInt3566);
		if (null != class292) {
			int i_0_ = aClass330_3195.aClass349_3573.method5948(778302667 * aClass330_3195.anInt3575, Client.anInt10682
					* -1936703811)
					+ aClass330_3195.anInt3568 * 926846703;
			int i_1_ = aClass330_3195.aClass334_3567.method5811(aClass330_3195.anInt3574 * 883378935, -73018749
					* Client.anInt10813)
					+ 1781524983 * aClass330_3195.anInt3569;
			if (aClass330_3195.aBool3576) {
				Class60.activeToolkit.method2625(i_0_, i_1_, aClass330_3195.anInt3575 * 778302667,
						883378935 * aClass330_3195.anInt3574, aClass330_3195.anInt3572 * 1184588107, 0);
			}
			i_1_ += method5294(Class450.b12Full, class292.aString3250, i_0_, i_1_, 5) * 12;
			i_1_ += 8;
			if (aClass330_3195.aBool3576) {
				Class60.activeToolkit.method2783(i_0_, i_1_, i_0_ + aClass330_3195.anInt3575 * 778302667 - 1, i_1_,
						1184588107 * aClass330_3195.anInt3572, 0);
			}
			i_1_ = ++i_1_ + method5294(Class450.b12Full, class292.aString3249, i_0_, i_1_, 5) * 12;
			i_1_ += 5;
			i_1_ += method5294(Class450.b12Full, class292.aString3248, i_0_, i_1_, 5) * 12;
		}
	}

	int method5294(Font font, String string, int i, int i_2_, int i_3_) {
		return font.method2294(string, i + i_3_, i_3_ + i_2_, 778302667 * aClass330_3195.anInt3575 - 2 * i_3_,
				aClass330_3195.anInt3574 * 883378935 - i_3_ * 2, aClass330_3195.anInt3570 * 924923203,
				aClass330_3195.anInt3571 * 540152935, 0, 0, 0, null, null, null, 0, 0);
	}

}