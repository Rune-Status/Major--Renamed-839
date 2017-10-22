package com.jagex;

public abstract class Class600_Sub1_Sub3 extends Class600_Sub1 {
	public short aShort11457;
	public short aShort11458;
	public short aShort11459;
	PointLight[] aClass480_Sub23Array11460;
	public boolean aBool11461;
	byte aByte11462;
	int anInt11463 = 0;
	public short aShort11464;

	Class600_Sub1_Sub3(Class490 class490, int plane, int collisionPlane, int worldX, int height, int worldZ, int i_8_,
			int i_9_, int i_10_, int i_11_, boolean bool, byte i_12_) {
		super(class490);
		aClass480_Sub23Array11460 = new PointLight[4];
		this.plane = (byte) plane;
		this.collisionPlane = (byte) collisionPlane;
		method10169(new Class397(worldX, height, worldZ));
		aShort11457 = (short) i_8_;
		aShort11458 = (short) i_9_;
		aShort11464 = (short) i_10_;
		aShort11459 = (short) i_11_;
		aBool11461 = bool;
		aByte11462 = i_12_;

		for (int i_13_ = 0; i_13_ < 4; i_13_++) {
			aClass480_Sub23Array11460[i_13_] = null;
		}
	}

	@Override
	int method16267(PointLight[] class480_sub23s, int i) {
		if (aBool7869) {
			anInt11463 = 0;
			int i_14_ = Math.max(0, aShort11457);
			int i_15_ = Math.min(aClass490_10378.aLongArrayArrayArray6720[plane].length - 1, aShort11458);
			int i_16_ = Math.max(0, aShort11464);
			int i_17_ = Math.min(aClass490_10378.aLongArrayArrayArray6720[plane][i_14_].length - 1, aShort11459);

			while_39_: for (; i_14_ <= i_15_; i_14_++) {
				for (; i_16_ <= i_17_; i_16_++) {
					long l = aClass490_10378.aLongArrayArrayArray6720[plane][i_14_][i_16_];
					long l_18_ = 0L;

					while_38_: while (l_18_ <= 48L) {
						int i_19_ = (int) (l >>> (int) l_18_ & 0xffffL);
						if (i_19_ <= 0) {
							break;
						}

						Class504 class504 = aClass490_10378.aClass504Array6742[i_19_ - 1];
						for (int i_20_ = 0; i_20_ < 418224773 * anInt11463; i_20_++) {
							if (class504.light == aClass480_Sub23Array11460[i_20_]) {
								l_18_ += 16L;
								continue while_38_;
							}
						}

						aClass480_Sub23Array11460[(anInt11463 += -1713090995) * 418224773 - 1] = class504.light;
						if (418224773 * anInt11463 == 4) {
							break while_39_;
						}

						l_18_ += 16L;
					}
				}
			}

			for (int i_21_ = 418224773 * anInt11463; i_21_ < 4; i_21_++) {
				aClass480_Sub23Array11460[i_21_] = null;
			}

			if (aByte11462 != 0) {
				int i_22_ = aShort11457 - 1243106061 * aClass490_10378.anInt6723;
				int i_23_ = aShort11464 - aClass490_10378.anInt6724 * -1342442459;
				short i_24_;
				int i_25_;
				int i_26_;
				short i_27_;

				if (1 == aByte11462) {
					if (i_23_ > i_22_) {
						i_24_ = aShort11457;
						i_25_ = aShort11464 - 1;
						i_26_ = 1 + aShort11457;
						i_27_ = aShort11464;
					} else {
						i_24_ = aShort11457;
						i_25_ = aShort11464 + 1;
						i_26_ = aShort11457 - 1;
						i_27_ = aShort11464;
					}
				} else if (i_23_ > -i_22_) {
					i_24_ = aShort11457;
					i_25_ = aShort11464 - 1;
					i_26_ = aShort11457 - 1;
					i_27_ = aShort11464;
				} else {
					i_24_ = aShort11457;
					i_25_ = 1 + aShort11464;
					i_26_ = 1 + aShort11457;
					i_27_ = aShort11464;
				}

				int i_28_ = 0;
				while_41_: for (; i_28_ < anInt11463 * 418224773; i_28_++) {
					long l = aClass490_10378.aLongArrayArrayArray6720[plane][i_24_][i_25_];
					while (0L != l) {
						Class504 class504 = aClass490_10378.aClass504Array6742[(int) ((l & 0xffffL) - 1L)];
						l >>>= 16;
						if (class504.light == aClass480_Sub23Array11460[i_28_]) {
							continue while_41_;
						}
					}

					l = aClass490_10378.aLongArrayArrayArray6720[plane][i_26_][i_27_];
					while (0L != l) {
						Class504 class504 = aClass490_10378.aClass504Array6742[(int) ((l & 0xffffL) - 1L)];
						l >>>= 16;
						if (aClass480_Sub23Array11460[i_28_] == class504.light) {
							continue while_41_;
						}
					}

					for (int i_29_ = i_28_; i_29_ < 418224773 * anInt11463 - 1; i_29_++) {
						aClass480_Sub23Array11460[i_29_] = aClass480_Sub23Array11460[1 + i_29_];
					}
					anInt11463 -= -1713090995;
				}
			}

			aBool7869 = false;
		}

		for (int i_30_ = 0; i_30_ < anInt11463 * 418224773; i_30_++) {
			class480_sub23s[i_30_] = aClass480_Sub23Array11460[i_30_];
		}

		return anInt11463 * 418224773;
	}

	@Override
	boolean method16268(Toolkit toolkit, int i) {
		return aClass490_10378.aClass492_6695.method8487(collisionPlane, aShort11457, aShort11458, aShort11464,
				aShort11459, method16293(toolkit));
	}

	@Override
	boolean method16269(int i) {
		for (int i_0_ = aShort11457; i_0_ <= aShort11458; i_0_++) {
			for (int i_1_ = aShort11464; i_1_ <= aShort11459; i_1_++) {
				int i_2_ = 1414880535 * aClass490_10378.anInt6686 + i_0_ - 1243106061 * aClass490_10378.anInt6723;
				if (i_2_ >= 0 && i_2_ < aClass490_10378.aBoolArrayArray6733.length) {
					int i_3_ = i_1_ - -1342442459 * aClass490_10378.anInt6724 + aClass490_10378.anInt6686 * 1414880535;
					if (i_3_ >= 0 && i_3_ < aClass490_10378.aBoolArrayArray6733.length
							&& aClass490_10378.aBoolArrayArray6733[i_2_][i_3_]) {
						return true;
					}
				}
			}
		}
		return false;
	}

	void method17912() {

	}

}