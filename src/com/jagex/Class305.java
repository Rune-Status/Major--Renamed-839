package com.jagex;

public class Class305 {
	int anInt3307 = 128;
	int anInt3308 = 128;
	int anInt3309;
	int anInt3310;
	int anInt3311;
	int anInt3312;

	Class305(int i) {
		anInt3310 = i;
	}

	Class305(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
		anInt3310 = i;
		anInt3308 = i_0_;
		anInt3307 = i_1_;
		anInt3312 = i_2_;
		anInt3311 = i_3_;
		anInt3309 = i_4_;
	}

	Class305 copy() {
		return new Class305(anInt3310, anInt3308, anInt3307, anInt3312, anInt3311, anInt3309);
	}

	void copyFrom(Class305 other) {
		anInt3308 = other.anInt3308;
		anInt3307 = other.anInt3307;
		anInt3312 = other.anInt3312;
		anInt3311 = other.anInt3311;
		anInt3310 = other.anInt3310;
		anInt3309 = other.anInt3309;
	}

}