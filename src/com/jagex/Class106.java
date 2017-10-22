package com.jagex;

public class Class106 {
	OpenGlToolkit toolkit;
	int anInt1346 = 0;
	Class101[] aClass101Array1347;
	int anInt1348;
	int anInt1349 = 0;
	Class107 aClass107_1350;
	Class101_Sub2 aClass101_Sub2_1351;

	Class106(OpenGlToolkit toolkit) {
		anInt1348 = 0;
		this.toolkit = toolkit;
		aClass107_1350 = new Class107(toolkit);
		aClass101Array1347 = new Class101[16];
		aClass101Array1347[1] = new Class101_Sub5(toolkit);
		aClass101Array1347[2] = new Class101_Sub1(toolkit, aClass107_1350);
		aClass101Array1347[4] = new Class101_Sub7(toolkit, aClass107_1350);
		aClass101Array1347[5] = new Class101_Sub3(toolkit, aClass107_1350);
		aClass101Array1347[6] = new Class101_Sub4(toolkit);
		aClass101Array1347[7] = new Class101_Sub8(toolkit);

		aClass101Array1347[3] = aClass101_Sub2_1351 = new Class101_Sub2(toolkit);
		aClass101Array1347[8] = new Class101_Sub9(toolkit, aClass107_1350);
		aClass101Array1347[9] = new Class101_Sub6(toolkit, aClass107_1350);

		if (!aClass101Array1347[8].method1811()) {
			aClass101Array1347[8] = aClass101Array1347[4];
		}
		if (!aClass101Array1347[9].method1811()) {
			aClass101Array1347[9] = aClass101Array1347[8];
		}
	}

	boolean method1973(OpenGlTexture texture, int i) {
		if (anInt1348 == 0) {
			return false;
		}

		aClass101Array1347[anInt1348 & 0x7fffffff].activate(texture, i);
		return true;
	}

	boolean method1974(int i) {
		return aClass101Array1347[i].method1811();
	}

	void method1975(int i, int i_0_, int i_1_, boolean bool, boolean bool_2_) {
		bool_2_ &= toolkit.method14286();
		if (!bool_2_ && (i == 4 || i == 8 || i == 9)) {
			if (i == 4) {
				i_1_ = i_0_;
			}
			i = 2;
		}

		if (i != 0 && bool) {
			i |= ~0x7fffffff;
		}

		if (anInt1348 != i) {
			if (anInt1348 != 0) {
				aClass101Array1347[anInt1348 & 0x7fffffff].method1814();
			}

			if (i != 0) {
				aClass101Array1347[i & 0x7fffffff].method1812(bool);
				aClass101Array1347[i & 0x7fffffff].method1828(bool);
				aClass101Array1347[i & 0x7fffffff].method1815(i_0_, i_1_);
			}

			anInt1348 = i;
			anInt1346 = i_0_;
			anInt1349 = i_1_;
		} else if (anInt1348 != 0) {
			aClass101Array1347[anInt1348 & 0x7fffffff].method1828(bool);
			if (anInt1346 != i_0_ || anInt1349 != i_1_) {
				aClass101Array1347[anInt1348 & 0x7fffffff].method1815(i_0_, i_1_);
				anInt1346 = i_0_;
				anInt1349 = i_1_;
			}
		}
	}

}