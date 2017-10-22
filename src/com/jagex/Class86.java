package com.jagex;

public class Class86 {

	int anInt1228 = 128;
	int anInt1229;
	int anInt1230 = 128;
	int anInt1231;
	int anInt1232;
	int anInt1233;

	Class86(int i) {
		anInt1229 = i;
	}

	Class86(int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
		anInt1229 = i;
		anInt1228 = i_1_;
		anInt1230 = i_2_;
		anInt1231 = i_3_;
		anInt1232 = i_4_;
		anInt1233 = i_5_;
	}

	Class86 copy() {
		return new Class86(anInt1229, anInt1228, anInt1230, anInt1231, anInt1232, anInt1233);
	}

	void copyFrom(Class86 other) {
		anInt1228 = other.anInt1228;
		anInt1230 = other.anInt1230;
		anInt1231 = other.anInt1231;
		anInt1232 = other.anInt1232;
		anInt1229 = other.anInt1229;
		anInt1233 = other.anInt1233;
	}

}