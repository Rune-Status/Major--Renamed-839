package com.jagex;

public class Class214 {
	Class217 aClass217_2186;
	int anInt2187;
	int[] anIntArray2188 = null;
	int[] anIntArray2189;
	int[] anIntArray2190;
	int anInt2191;
	int[] anIntArray2192;
	int[] anIntArray2193;

	void method4021(int[] is) {
		if (is != null) {
			for (int i = 0; i < is.length; i++) {
				is[i] = 0;
			}
		}
	}

	int method4023(int i) {
		int i_0_ = 0;
		for (; i > 0; i >>= 1) {
			i_0_++;
		}
		return i_0_;
	}

	void method4025(Class217 class217) {
		aClass217_2186 = class217;
		int i = aClass217_2186.method4046();
		aClass217_2186.method4119(16);
		anInt2191 = aClass217_2186.method4060() != 0 ? aClass217_2186.method4119(4) + 1 : 1;
		if (aClass217_2186.method4060() != 0) {
			anInt2187 = aClass217_2186.method4119(8) + 1;
			if (anIntArray2192 == null || anIntArray2192.length != anInt2187) {
				anIntArray2192 = new int[anInt2187];
			} else {
				method4021(anIntArray2192);
			}
			if (anIntArray2193 == null || anIntArray2193.length != anInt2187) {
				anIntArray2193 = new int[anInt2187];
			} else {
				method4021(anIntArray2193);
			}
			for (int i_1_ = 0; i_1_ < anInt2187; i_1_++) {
				anIntArray2192[i_1_] = aClass217_2186.method4119(method4023(i - 1));
				anIntArray2193[i_1_] = aClass217_2186.method4119(method4023(i - 1));
			}
		} else {
			anInt2187 = 0;
		}
		aClass217_2186.method4119(2);
		if (anInt2191 > 1) {
			anIntArray2188 = new int[i];
			for (int i_2_ = 0; i_2_ < i; i_2_++) {
				anIntArray2188[i_2_] = aClass217_2186.method4119(4);
			}
		}
		if (anIntArray2189 == null || anIntArray2189.length != anInt2191) {
			anIntArray2189 = new int[anInt2191];
		} else {
			method4021(anIntArray2189);
		}
		if (anIntArray2190 == null || anIntArray2190.length != anInt2191) {
			anIntArray2190 = new int[anInt2191];
		} else {
			method4021(anIntArray2190);
		}
		for (int i_3_ = 0; i_3_ < anInt2191; i_3_++) {
			aClass217_2186.method4119(8);
			anIntArray2189[i_3_] = aClass217_2186.method4119(8);
			anIntArray2190[i_3_] = aClass217_2186.method4119(8);
		}
	}

}