package com.jagex;

public abstract class Class600_Sub1_Sub2 extends Class600_Sub1 {
	PointLight[] aClass480_Sub23Array11450;
	protected short aShort11451;
	int anInt11452 = 0;
	protected short aShort11453;

	Class600_Sub1_Sub2(Class490 class490, int i, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_) {
		super(class490);
		aClass480_Sub23Array11450 = new PointLight[4];
		plane = (byte) i_6_;
		collisionPlane = (byte) i_7_;
		aShort11453 = (short) i_8_;
		aShort11451 = (short) i_9_;
		method10169(new Class397(i, i_4_, i_5_));
		for (int i_10_ = 0; i_10_ < 4; i_10_++) {
			aClass480_Sub23Array11450[i_10_] = null;
		}
	}

	@Override
	final void method16262(Toolkit toolkit, Class600_Sub1 class600_sub1, int i, int i_0_, int i_1_, boolean bool,
			int i_2_) {
		throw new IllegalStateException();
	}

	@Override
	final void method16263() {
		throw new IllegalStateException();
	}

	@Override
	int method16267(PointLight[] class480_sub23s, int i) {
		if (aBool7869) {
			Class397 class397 = method10164().aClass397_4507;
			anInt11452 = method16270((int) class397.x >> -1911343043 * aClass490_10378.tileScale,
					(int) class397.z >> aClass490_10378.tileScale * -1911343043, aClass480_Sub23Array11450, 499770435)
					* -1098709673;
			aBool7869 = false;
		}
		for (int i_3_ = 0; i_3_ < -1790200217 * anInt11452; i_3_++) {
			class480_sub23s[i_3_] = aClass480_Sub23Array11450[i_3_];
		}
		return -1790200217 * anInt11452;
	}

	@Override
	boolean method16268(Toolkit class134, int i) {
		Class397 class397 = method10164().aClass397_4507;
		return aClass490_10378.aClass492_6695
				.method8521(collisionPlane, (int) class397.x >> -1911343043 * aClass490_10378.tileScale,
						(int) class397.z >> -1911343043 * aClass490_10378.tileScale, method16295());
	}

	@Override
	boolean method16269(int i) {
		Class397 class397 = method10164().aClass397_4507;
		return aClass490_10378.aBoolArrayArray6733[1414880535 * aClass490_10378.anInt6686
				+ ((int) class397.x >> aClass490_10378.tileScale * -1911343043) - 1243106061
				* aClass490_10378.anInt6723][aClass490_10378.anInt6686 * 1414880535
				+ ((int) class397.z >> -1911343043 * aClass490_10378.tileScale) - aClass490_10378.anInt6724
				* -1342442459];
	}

	@Override
	final boolean method16302() {
		return false;
	}
}
