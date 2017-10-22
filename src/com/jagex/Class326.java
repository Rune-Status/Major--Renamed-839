package com.jagex;

import java.io.IOException;

public class Class326 {

	public static void readRandom(Buffer buffer) {
		byte[] data = new byte[24];
		try {
			Engine.random.seek(0L);
			Engine.random.read(data);
			int length;
			for (length = 0; length < 24 && 0 == data[length]; length++) {

			}

			if (length >= 24) {
				throw new IOException();
			}
		} catch (Exception exception) {
			for (int index = 0; index < 24; index++) {
				data[index] = (byte) -1;
			}
		}

		buffer.writeBytes(data, 0, 24);
	}

	public static Class562_Sub1 method5797() {
		Class671.anInt8460 = 0;
		return Class287.method5302();
	}

	float aFloat3546;
	Class326 aClass326_3547;
	VolumeNormaliser normaliser;
	float aFloat3549;
	float aFloat3550;
	long aLong3551;
	long aLong3552;
	float aFloat3553;

	Class326(int i, float f, Object object, Class339 class339, VolumeNormaliser normaliser, Class326 class326_3_) {
		aClass326_3547 = class326_3_;
		this.normaliser = normaliser;
		aFloat3550 = 1.0F;
		aFloat3549 = f;
		aFloat3553 = -1.0F;
		aFloat3546 = -1.0F;
		aLong3552 = -4287258324876468017L;
		aLong3551 = -2513027320901351511L;
	}

	public float method5779(int i) {
		float f = 1.0F;
		for (Class326 class326_2_ = this; null != class326_2_; class326_2_ = class326_2_.method5782()) {
			f *= class326_2_.method5776();
		}
		return f;
	}

	public float method5780() {
		return aFloat3550;
	}

	public void method5781(float f) {
		if (normaliser == null) {
			aFloat3546 = f;
			aFloat3553 = aFloat3550;
			aLong3552 = TimeUtil.time() * 4287258324876468017L;
			aLong3551 = 4717258934283910663L * aLong3552 + -6951684941798571524L;
		}
	}

	public Class326 method5782() {
		return aClass326_3547;
	}

	public float method5794(int i) {
		float f = aFloat3550;
		for (Class326 class326_4_ = aClass326_3547; class326_4_ != null; class326_4_ = class326_4_.method5782()) {
			f *= class326_4_.method5780();
		}

		f = Math.min(Math.max(f, 0.0F), 1.0F);
		return f;
	}

	float method5776() {
		return aFloat3549;
	}

	void method5778(int i) {
		if (normaliser != null) {
			float f = normaliser.normalise();
			if (aFloat3550 != f && aFloat3546 < 0.0F) {
				aFloat3553 = aFloat3550;
				aFloat3546 = f;
				aLong3552 = TimeUtil.time() * 4287258324876468017L;
				aLong3551 = aLong3552 * 4717258934283910663L + -6951684941798571524L;
			}
		}

		if (aFloat3546 >= 0.0F) {
			long l = TimeUtil.time();
			if (l > aLong3551 * 1364596213155050343L) {
				aFloat3550 = aFloat3546;
				aFloat3546 = -1.0F;
			} else {
				float f = aFloat3546 - aFloat3553;
				long l_0_ = 1364596213155050343L * aLong3551 - 7199366365728070097L * aLong3552;
				float f_1_ = f / l_0_;

				aFloat3550 = f_1_ * (l - aLong3552 * 7199366365728070097L) + aFloat3553;
				if (aFloat3550 == aFloat3546) {
					aFloat3546 = -1.0F;
				}
			}
		}

		aFloat3550 = Math.min(1.0F, Math.max(aFloat3550, 0.0F));
	}

}