package com.jagex;

public class Class281_Sub3 extends Class281 {
	static FontSpecification b12Full;

	static final void method15307(Class600_Sub1 class600_sub1, int i, boolean bool) {
		AnimationDefinition.method3522(class600_sub1, i, false, bool);
	}

	int anInt9811;
	Class397 aClass397_9812 = new Class397(Float.NaN, Float.NaN, Float.NaN);
	Class397 aClass397_9813 = new Class397(Float.NaN, Float.NaN, Float.NaN);

	Class397 aClass397_9814 = new Class397();

	boolean aBool9815 = false;

	public Class281_Sub3(Class261 class261) {
		super(class261);
	}

	public void method15297(boolean bool) {
		aBool9815 = bool;
	}

	public void method15304(Class480_Sub22 class480_sub22) {
		aClass397_9813.x = class480_sub22.anInt10154 * -61099889;
		aClass397_9813.y = 1227419133 * class480_sub22.anInt10155;
		aClass397_9813.z = -980788885 * class480_sub22.anInt10156;
		if (Float.isNaN(aClass397_9812.x)) {
			aClass397_9812.copyFrom(aClass397_9813);
			aClass397_9814.reset();
		}
		anInt9811 = -1531586685 * class480_sub22.plane;
	}

	@Override
	public Class397 method5224() {
		return Class397.copyOf(aClass397_9812);
	}

	@Override
	public void method5225(float f, int[][][] is, TileFlags class425, int i, int i_0_, byte i_1_) {
		if (aBool9815) {
			method15300(is, class425, i, i_0_, -1784581298);
		}
		aClass261_3155.method4862(true, f, aClass397_9812, aClass261_3155.method4883((byte) 70), aClass397_9813,
				aClass397_9814, -958958229);
	}

	@Override
	public boolean method5226() {
		return !Float.isNaN(aClass397_9812.x);
	}

	@Override
	public double[] method5228() {
		double[] ds = new double[3];
		Class397 class397 = method5224();
		ds[0] = class397.x;
		ds[1] = class397.y;
		ds[2] = class397.z;
		return ds;
	}

	@Override
	public float method5230(byte i) {
		return 0.0F;
	}

	@Override
	public Class480_Sub22 method5238(short i) {
		return new Class480_Sub22(anInt9811 * 954519217, (int) aClass397_9812.x, (int) aClass397_9812.y,
				(int) aClass397_9812.z);
	}

	@Override
	public void method5248(Class268 class268, int i, int i_9_, byte i_10_) {
		class268.anInt2983 = ((int) aClass397_9812.x - i) * 1771748405;
		class268.anInt2982 = 600782361 * (int) -aClass397_9812.y;
		class268.anInt2984 = 994250225 * ((int) aClass397_9812.z - i_9_);
	}

	@Override
	public void method5256(Buffer buffer, byte i) {
		aClass397_9813.decode(buffer);
	}

	void method15300(int[][][] is, TileFlags flags, int i, int i_2_, int i_3_) {
		if (method5226() && (aClass261_3155.method4845() || aClass261_3155.method4855())
				&& aClass261_3155.method4855() && is != null) {
			int i_4_ = (int) aClass397_9813.x - i >> 9;
			int i_5_ = (int) aClass397_9813.z - i_2_ >> 9;
			if (i_4_ >= 0 && i_5_ >= 0 && 1 + i_4_ < is[0].length && 1 + i_5_ < is[0][0].length) {
				int i_6_ = anInt9811 * 954519217;
				if (flags.isBridge(i_4_, i_5_)) {
					i_6_ = 1 + anInt9811 * 954519217;
				}
				long l = (long) aClass397_9813.x % 512L;
				long l_7_ = (long) aClass397_9813.z % 512L;
				long l_8_ = is[i_6_][i_4_][i_5_] * (512L - l) * (512L - l_7_);
				l_8_ += (512L - l_7_) * l * is[i_6_][1 + i_4_][i_5_];
				l_8_ += is[i_6_][i_4_][1 + i_5_] * (512L - l) * l_7_;
				l_8_ += l_7_ * l * is[i_6_][i_4_ + 1][1 + i_5_];
				l_8_ /= 262144L;
				l_8_ -= 512L;
				float f = (-l_8_) - aClass397_9813.y;
				if (f > 0.0F) {
					aClass397_9813.y = -l_8_;
				}
			}
		}
	}

}