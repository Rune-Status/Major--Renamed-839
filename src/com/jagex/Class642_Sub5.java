package com.jagex;

public abstract class Class642_Sub5 extends Class642 {
	float aFloat10573;
	int anInt10574 = 0;
	Class401[] aClass401Array10575;
	float aFloat10576;
	float[] aFloatArray10577;
	int[] anIntArray10578;

	Class642_Sub5(Class261 class261) {
		super(class261);
		aFloat10573 = 0.0F;
		aFloat10576 = 0.0F;
	}

	@Override
	public Class397 method13222(byte i) {
		return method13235();
	}

	@Override
	public void method13223(float f, int i) {
		Class401 class401 = aClass401Array10575[anInt10574 * 1537220965];
		if (aFloatArray10577[anInt10574 * 1537220965] > 0.0F) {
			if (aFloatArray10577[1537220965 * anInt10574] >= f) {
				aFloatArray10577[anInt10574 * 1537220965] -= f;
				return;
			}
			f -= aFloatArray10577[anInt10574 * 1537220965];
			aFloatArray10577[1537220965 * anInt10574] = 0.0F;
		}
		float f_1_ = 1.0F / EntityQueue.getFps();
		while (f > 0.0F) {
			float f_2_ = class401.method6668();
			if (aFloat10573 >= f_2_) {
				if (1 + anInt10574 * 1537220965 == aClass401Array10575.length) {
					break;
				}
				if (aFloatArray10577[1 + 1537220965 * anInt10574] >= f) {
					aFloatArray10577[1537220965 * anInt10574 + 1] -= f;
					break;
				}
				anInt10574 += 2089953389;
				f -= aFloatArray10577[1537220965 * anInt10574];
				aFloatArray10577[1537220965 * anInt10574] = 0.0F;
				method16766((byte) 95);
				aFloat10573 = 0.0F;
				aFloat10576 = 0.0F;
				class401 = aClass401Array10575[anInt10574 * 1537220965];
				f_2_ = class401.method6668();
			}
			while (f > 0.0F && aFloat10573 < f_2_) {
				aFloat10576 = method16765(f_2_, aFloat10576, Math.min(f, f_1_), 1789807092);
				f -= f_1_;
				method16764(aFloat10576, f_2_, (byte) -5);
			}
		}
	}

	@Override
	public boolean method13224() {
		return null != aClass401Array10575;
	}

	@Override
	public void method13227(Class268 class268, Class405 class405, int i, int i_6_, float f, int i_7_) {
		double[] ds = aClass261_8163.method4839();
		ds[0] -= i;
		ds[2] -= i_6_;
		double[] ds_8_ = method16767(61292264);
		ds_8_[0] -= i;
		ds_8_[2] -= i_6_;
		ds[1] *= -1.0;
		ds_8_[1] *= -1.0;
		Class397 class397 = Class397.empty();
		class397.x = (float) (ds_8_[0] - ds[0]);
		class397.y = (float) (ds_8_[1] - ds[1]);
		class397.z = (float) (ds_8_[2] - ds[2]);
		class397.method6446();
		Class395 class395 = new Class395();
		class395.method6380(class397, f);
		Class397 class397_9_ = Class397.create(0.0F, 1.0F, 0.0F);
		Class397 class397_10_ = Class397.method6454(class397, class397_9_);
		class397_9_ = Class397.method6454(class397_10_, class397);
		class397_9_.method6480(class395);
		class405.method6731(ds[0], ds[1], ds[2], ds_8_[0], ds_8_[1], ds_8_[2], class397_9_.x, class397_9_.y,
				class397_9_.z);
		class397_9_.cache();
	}

	@Override
	public Class397 method13235() {
		Class397 class397 = Class397.empty();
		double[] ds = aClass401Array10575[anInt10574 * 1537220965].method6666(aFloat10573);
		class397.x = (float) ds[0];
		class397.y = (float) ds[1];
		class397.z = (float) ds[2];
		return class397;
	}

	@Override
	public void method13244(Buffer buffer, int i) {
		aFloat10573 = 0.0F;
		aFloat10576 = 0.0F;
		anInt10574 = 0;
		int i_11_ = buffer.readUByte();
		aClass401Array10575 = new Class401[i_11_];
		aFloatArray10577 = new float[i_11_];
		for (int i_12_ = 0; i_12_ < i_11_; i_12_++) {
			aClass401Array10575[i_12_] = new Class401(buffer);
			aFloatArray10577[i_12_] = buffer.readFloat();
		}
		method16768(buffer, i_11_, 2062968996);
	}

	public void method16763(Class401 class401, int i, float f, byte i_0_) {
		if (aClass401Array10575 == null) {
			aClass401Array10575 = new Class401[] { class401 };
			aFloatArray10577 = new float[] { f };
			anIntArray10578 = new int[] { i };
		} else {
			Class401[] class401s = new Class401[1 + aClass401Array10575.length];
			float[] fs = new float[aClass401Array10575.length + 1];
			int[] is = new int[1 + aClass401Array10575.length];
			System.arraycopy(aClass401Array10575, 0, class401s, 0, aClass401Array10575.length);
			System.arraycopy(aFloatArray10577, 0, fs, 0, aClass401Array10575.length);
			System.arraycopy(anIntArray10578, 0, is, 0, aClass401Array10575.length);
			aClass401Array10575 = class401s;
			aFloatArray10577 = fs;
			anIntArray10578 = is;
			aClass401Array10575[aClass401Array10575.length - 1] = class401;
			aFloatArray10577[aFloatArray10577.length - 1] = f;
			anIntArray10578[anIntArray10578.length - 1] = i;
		}
	}

	void method16764(float f, float f_3_, byte i) {
		aFloat10573 += f;
		if (aFloat10573 > f_3_) {
			aFloat10573 = f_3_;
		}
	}

	abstract float method16765(float f, float f_4_, float f_5_, int i);

	abstract void method16766(byte i);

	double[] method16767(int i) {
		return aClass401Array10575[1537220965 * anInt10574].method6666(aFloat10573);
	}

	abstract void method16768(Buffer buffer, int i, int i_13_);
}
