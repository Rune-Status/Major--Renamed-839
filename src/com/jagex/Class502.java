package com.jagex;

public class Class502 {

	Class494 aClass494_6904;
	byte[] aByteArray6905;
	int anInt6906;
	byte[] aByteArray6907;
	int anInt6908;
	int anInt6909;
	int anInt6910;
	float aFloat6911;
	int anInt6912;
	int anInt6913;
	Class343_Sub2 this$0;

	Class502(Class343_Sub2 class343_sub2, Class494 class494, int i, float f, int i_0_, int i_1_, boolean bool,
			boolean bool_2_) {
		this$0 = class343_sub2;
		aClass494_6904 = class494;
		aByteArray6907 = new byte[i];
		aByteArray6905 = new byte[i_0_ / 8];
		anInt6909 = -406266727 * aByteArray6907.length;
		aFloat6911 = f;
		anInt6912 = i_0_ * 1190002191;
		anInt6906 = i_1_ * 1705418381;
		anInt6908 = 0;
		anInt6913 = 0;
		anInt6910 = 0;
	}

	int method8692() {
		return anInt6909 * 813545385;
	}

	void method8694(byte[] is, int i, int i_3_, int i_4_) {
		int i_5_ = i;

		while (i_5_ < i + i_3_) {
			aByteArray6907[anInt6908 * 85247661] = is[i_5_];
			aByteArray6907[85247661 * anInt6908 + 1] = is[1 + i_5_];
			i_5_ += 2;
			anInt6908 += -1305142710;
			anInt6908 = -652571355 * (85247661 * anInt6908 % aByteArray6907.length);
			anInt6909 -= -812533454;
		}
	}

}