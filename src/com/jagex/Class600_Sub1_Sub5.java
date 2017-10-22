package com.jagex;

public abstract class Class600_Sub1_Sub5 extends Class600_Sub1 {
	public static final int anInt11480 = 1;
	public static final int anInt11481 = 2;
	public static final int anInt11482 = 4;
	public static final int anInt11483 = 8;
	public static final int anInt11484 = 16;
	static int[] anIntArray11485 = { 19, 55, 38, 155, 255, 110, 137, 205, 76 };
	public static final int anInt11486 = 64;
	public static final int anInt11488 = 128;
	public static final int anInt11490 = 32;
	int anInt11487 = 0;
	public short aShort11489;
	PointLight[] aClass480_Sub23Array11491 = new PointLight[4];

	Class600_Sub1_Sub5(Class490 class490, int i, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_) {
		super(class490);
		plane = (byte) i_7_;
		collisionPlane = (byte) i_8_;
		aShort11489 = (short) i_9_;
		method10169(new Class397(i, i_5_, i_6_));
		for (int i_10_ = 0; i_10_ < 4; i_10_++) {
			aClass480_Sub23Array11491[i_10_] = null;
		}
	}

	@Override
	int method16267(PointLight[] class480_sub23s, int i) {
		if (aBool7869) {
			Class397 class397 = method10164().aClass397_4507;
			int i_0_ = (int) class397.x >> aClass490_10378.tileScale * -1911343043;
			int i_1_ = (int) class397.z >> -1911343043 * aClass490_10378.tileScale;
			int i_2_ = 0;
			if (i_0_ == aClass490_10378.anInt6723 * 1243106061) {
				i_2_++;
			} else if (aClass490_10378.anInt6723 * 1243106061 < i_0_) {
				i_2_ += 2;
			}
			if (i_1_ == aClass490_10378.anInt6724 * -1342442459) {
				i_2_ += 3;
			} else if (aClass490_10378.anInt6724 * -1342442459 > i_1_) {
				i_2_ += 6;
			}
			int i_3_ = anIntArray11485[i_2_];
			if ((aShort11489 & i_3_) == 0) {
				if (aShort11489 == 1 && i_0_ > 0) {
					i_0_--;
				} else if (4 == aShort11489 && i_0_ <= aClass490_10378.width * 173827901) {
					i_0_++;
				} else if (8 == aShort11489 && i_1_ > 0) {
					i_1_--;
				} else if (aShort11489 == 2 && i_1_ <= aClass490_10378.length * 134933557) {
					i_1_++;
				} else if (16 == aShort11489 && i_0_ > 0 && i_1_ <= 134933557 * aClass490_10378.length) {
					i_0_--;
					i_1_++;
				} else if (32 == aShort11489 && i_0_ <= 173827901 * aClass490_10378.width
						&& i_1_ <= aClass490_10378.length * 134933557) {
					i_0_++;
					i_1_++;
				} else if (aShort11489 == 128 && i_0_ > 0 && i_1_ > 0) {
					i_0_--;
					i_1_--;
				} else if (aShort11489 == 64 && i_0_ <= 173827901 * aClass490_10378.width && i_1_ > 0) {
					i_0_++;
					i_1_--;
				} else {
					throw new RuntimeException("");
				}
			}
			anInt11487 = method16270(i_0_, i_1_, aClass480_Sub23Array11491, 499770435) * 1214459931;
			aBool7869 = false;
		}
		for (int i_4_ = 0; i_4_ < anInt11487 * 304949779; i_4_++) {
			class480_sub23s[i_4_] = aClass480_Sub23Array11491[i_4_];
		}
		return 304949779 * anInt11487;
	}

	@Override
	boolean method16268(Toolkit class134, int i) {
		Class397 class397 = method10164().aClass397_4507;
		return aClass490_10378.aClass492_6695.method8493(this, collisionPlane, (int) class397.x >> -1911343043
				* aClass490_10378.tileScale, (int) class397.z >> -1911343043 * aClass490_10378.tileScale);
	}

	@Override
	boolean method16269(int i) {
		Class397 class397 = method10164().aClass397_4507;
		return aClass490_10378.aBoolArrayArray6733[((int) class397.x >> -1911343043 * aClass490_10378.tileScale)
				- aClass490_10378.anInt6723 * 1243106061 + 1414880535 * aClass490_10378.anInt6686][((int) class397.z >> -1911343043
				* aClass490_10378.tileScale)
				- -1342442459 * aClass490_10378.anInt6724 + 1414880535 * aClass490_10378.anInt6686];
	}
}
