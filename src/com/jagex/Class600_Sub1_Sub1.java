package com.jagex;

public abstract class Class600_Sub1_Sub1 extends Class600_Sub1 {
	Class600_Sub1_Sub1(Class490 class490, int i, int i_3_, int i_4_, int i_5_, int i_6_) {
		super(class490);
		plane = (byte) i_5_;
		collisionPlane = (byte) i_6_;
		method10169(new Class397(i, i_3_, i_4_));
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
		Class397 class397 = method10164().aClass397_4507;
		return method16270((int) class397.x >> aClass490_10378.tileScale * -1911343043,
				(int) class397.z >> aClass490_10378.tileScale * -1911343043, class480_sub23s, 499770435);
	}

	@Override
	boolean method16268(Toolkit class134, int i) {
		Class397 class397 = method10164().aClass397_4507;
		Class491 class491 = aClass490_10378.method8350(collisionPlane, (int) class397.x >> aClass490_10378.tileScale
				* -1911343043, (int) class397.z >> aClass490_10378.tileScale * -1911343043, -1805913001);
		if (null != class491 && class491.aClass600_Sub1_Sub3_6752.aBool11461) {
			return aClass490_10378.aClass492_6695.method8521(collisionPlane,
					(int) class397.x >> aClass490_10378.tileScale * -1911343043, (int) class397.z >> -1911343043
							* aClass490_10378.tileScale, class491.aClass600_Sub1_Sub3_6752.method16295()
							+ method16295());
		}
		return aClass490_10378.aClass492_6695.method8492(collisionPlane, (int) class397.x >> aClass490_10378.tileScale
				* -1911343043, (int) class397.z >> -1911343043 * aClass490_10378.tileScale);
	}

	@Override
	boolean method16269(int i) {
		Class397 class397 = method10164().aClass397_4507;
		return aClass490_10378.aBoolArrayArray6733[1414880535 * aClass490_10378.anInt6686
				+ ((int) class397.x >> -1911343043 * aClass490_10378.tileScale) - 1243106061
				* aClass490_10378.anInt6723][((int) class397.z >> aClass490_10378.tileScale * -1911343043)
				- aClass490_10378.anInt6724 * -1342442459 + aClass490_10378.anInt6686 * 1414880535];
	}

	@Override
	final boolean method16302() {
		return false;
	}
}
