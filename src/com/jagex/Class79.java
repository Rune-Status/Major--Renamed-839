package com.jagex;

public class Class79 {
	public static int anInt1158;

	int anInt1147;
	int anInt1148;
	float aFloat1149;
	int colour;
	int anInt1151;
	int anInt1152;
	float aFloat1153;
	int anInt1154;
	int anInt1155;
	int anInt1156;
	float aFloat1157 = 1.0F;

	Class79(int colour) {
		aFloat1149 = 1.0F;
		this.colour = 577814625 * colour;
	}

	Class79(int colour, float f, float f_0_, int i_1_, int i_2_, int i_3_) {
		aFloat1149 = 1.0F;
		this.colour = colour * 577814625;
		aFloat1157 = f;
		aFloat1149 = f_0_;
		anInt1148 = -1377274871 * i_1_;
		anInt1151 = i_2_ * -260405671;
		anInt1152 = 79565547 * i_3_;
	}

	Class79 copy() {
		return new Class79(-1876827231 * colour, aFloat1157, aFloat1149, anInt1148 * 630938169,
				-2051776023 * anInt1151, anInt1152 * -431290941);
	}

	void copyFrom(Class79 other) {
		aFloat1157 = other.aFloat1157;
		aFloat1149 = other.aFloat1149;
		anInt1148 = other.anInt1148;
		anInt1151 = other.anInt1151;
		colour = other.colour;
		anInt1152 = other.anInt1152;
	}

}