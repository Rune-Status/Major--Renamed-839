package com.jagex;

public abstract class Class281_Sub1 extends Class281 {
	Class401[] aClass401Array9742;
	float[] aFloatArray9743;
	int anInt9744 = 0;
	float aFloat9745 = 0.0F;
	float aFloat9746 = 0.0F;
	int[] anIntArray9747;

	Class281_Sub1(Class261 class261) {
		super(class261);
	}

	public void method15213(Class401 class401, int i, float f, int i_0_) {
		if (null == aClass401Array9742) {
			aClass401Array9742 = new Class401[] { class401 };
			aFloatArray9743 = new float[] { f };
			anIntArray9747 = new int[] { i };
		} else {
			Class401[] class401s = new Class401[1 + aClass401Array9742.length];
			float[] fs = new float[aClass401Array9742.length + 1];
			int[] is = new int[1 + aClass401Array9742.length];
			System.arraycopy(aClass401Array9742, 0, class401s, 0, aClass401Array9742.length);
			System.arraycopy(aFloatArray9743, 0, fs, 0, aClass401Array9742.length);
			System.arraycopy(anIntArray9747, 0, is, 0, aClass401Array9742.length);
			aClass401Array9742 = class401s;
			aFloatArray9743 = fs;
			anIntArray9747 = is;
			aClass401Array9742[aClass401Array9742.length - 1] = class401;
			aFloatArray9743[aFloatArray9743.length - 1] = f;
			anIntArray9747[anIntArray9747.length - 1] = i;
		}
	}

	public float method15226(short i) {
		return aClass401Array9742[307920967 * anInt9744].method6680(aFloat9745);
	}

	@Override
	public Class397 method5224() {
		Class397 class397 = Class397.empty();
		double[] ds = aClass401Array9742[307920967 * anInt9744].method6666(aFloat9745);
		class397.x = (float) ds[0];
		class397.y = (float) ds[1];
		class397.z = (float) ds[2];
		return class397;
	}

	@Override
	public void method5225(float f, int[][][] is, TileFlags class425, int i, int i_9_, byte i_10_) {
		Class401 class401 = aClass401Array9742[anInt9744 * 307920967];
		if (aFloatArray9743[anInt9744 * 307920967] > 0.0F) {
			if (aFloatArray9743[307920967 * anInt9744] >= f) {
				aFloatArray9743[anInt9744 * 307920967] -= f;
				return;
			}
			f -= aFloatArray9743[307920967 * anInt9744];
			aFloatArray9743[anInt9744 * 307920967] = 0.0F;
		}
		float f_11_ = 1.0F / EntityQueue.getFps();
		while (f > 0.0F) {
			float f_12_ = class401.method6668();
			if (aFloat9745 >= f_12_) {
				if (anInt9744 * 307920967 + 1 == aClass401Array9742.length) {
					break;
				}
				if (aFloatArray9743[anInt9744 * 307920967 + 1] >= f) {
					aFloatArray9743[307920967 * anInt9744 + 1] -= f;
					break;
				}
				anInt9744 += -939185801;
				f -= aFloatArray9743[anInt9744 * 307920967];
				aFloatArray9743[307920967 * anInt9744] = 0.0F;
				method15216(158002120);
				aFloat9745 = 0.0F;
				aFloat9746 = 0.0F;
				class401 = aClass401Array9742[307920967 * anInt9744];
				f_12_ = class401.method6668();
			}
			while (f > 0.0F && aFloat9745 < f_12_) {
				aFloat9746 = method15215(f_12_, aFloat9746, Math.min(f, f_11_), -229202576);
				f -= f_11_;
				method15214(aFloat9746, f_12_, -1763515380);
			}
		}
	}

	@Override
	public boolean method5226() {
		return aClass401Array9742 != null;
	}

	@Override
	public double[] method5228() {
		return aClass401Array9742[307920967 * anInt9744].method6666(aFloat9745);
	}

	@Override
	public float method5230(byte i) {
		return aClass401Array9742[307920967 * anInt9744].method6683(aFloat9745);
	}

	@Override
	public Class480_Sub22 method5238(short i) {
		Class397 class397 = method5224();
		return new Class480_Sub22(0, (int) class397.x, (int) class397.y, (int) class397.z);
	}

	@Override
	public void method5248(Class268 class268, int i, int i_4_, byte i_5_) {
		Class397 class397 = method5224();
		class268.anInt2983 = 1771748405 * ((int) class397.x - i);
		class268.anInt2982 = 600782361 * (int) -class397.y;
		class268.anInt2984 = ((int) class397.z - i_4_) * 994250225;
	}

	@Override
	public void method5256(Buffer buffer, byte i) {
		aFloat9745 = 0.0F;
		aFloat9746 = 0.0F;
		anInt9744 = 0;
		int i_6_ = buffer.readUByte();
		aClass401Array9742 = new Class401[i_6_];
		aFloatArray9743 = new float[i_6_];
		for (int i_7_ = 0; i_7_ < i_6_; i_7_++) {
			aClass401Array9742[i_7_] = new Class401(buffer);
			aFloatArray9743[i_7_] = buffer.readFloat();
		}
		method15218(buffer, i_6_, 2044204762);
	}

	void method15214(float f, float f_1_, int i) {
		aFloat9745 += f;
		if (aFloat9745 > f_1_) {
			aFloat9745 = f_1_;
		}
	}

	abstract float method15215(float f, float f_2_, float f_3_, int i);

	abstract void method15216(int i);

	abstract void method15218(Buffer buffer, int i, int i_8_);
}
