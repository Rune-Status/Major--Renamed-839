package com.jagex;

public class Class480_Sub27 extends Linkable {
	static float[] aFloatArray10189 = new float[3];
	float aFloat10187;
	Class361 aClass361_10188;
	int anInt10190;
	int anInt10191;
	float aFloat10192;
	int anInt10193;
	Class115 aClass115_10194;

	Class480_Sub27(Class115 class115, ParticleSystem class564) {
		aClass115_10194 = class115;
		aClass361_10188 = aClass115_10194.method2061(Class198.anInterface44_2095);
		method16037((byte) 41);
	}

	void method16037(byte i) {
		anInt10193 = 1777333621 * aClass115_10194.anInt1438;
		anInt10190 = aClass115_10194.anInt1440 * -805871243;
		anInt10191 = -1620725439 * aClass115_10194.anInt1442;
		if (null != aClass115_10194.aClass399_1443) {
			aClass115_10194.aClass399_1443.method6554(-1787673313 * aClass361_10188.anInt3901,
					1822099009 * aClass361_10188.anInt3902, 1305416359 * aClass361_10188.anInt3893, aFloatArray10189);
		}
		aFloat10192 = aFloatArray10189[0];
		aFloat10187 = aFloatArray10189[2];
	}
}
