package com.jagex;

public abstract class Class600_Sub1_Sub4 extends Class600_Sub1 {
	static final String method17914(String string, String string_7_, String string_8_) {
		for (int i_9_ = string.indexOf(string_7_); -1 != i_9_; i_9_ = string.indexOf(string_7_,
				i_9_ + string_8_.length())) {
			string = new StringBuilder().append(string.substring(0, i_9_)).append(string_8_)
					.append(string.substring(i_9_ + string_7_.length())).toString();
		}
		return string;
	}

	int anInt11465 = 0;
	public short aShort11466;

	PointLight[] aClass480_Sub23Array11467 = new PointLight[4];

	Class600_Sub1_Sub4(Class490 class490, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
		super(class490);
		plane = (byte) i_2_;
		collisionPlane = (byte) i_3_;
		aShort11466 = (short) i_4_;
		method10169(new Class397(i, i_0_, i_1_));

		for (int i_5_ = 0; i_5_ < 4; i_5_++) {
			aClass480_Sub23Array11467[i_5_] = null;
		}
	}

	@Override
	int method16267(PointLight[] lights, int i) {
		if (aBool7869) {
			Class397 class397 = method10164().aClass397_4507;
			anInt11465 = method16270((int) class397.x >> aClass490_10378.tileScale * -1911343043,
					(int) class397.z >> aClass490_10378.tileScale * -1911343043, aClass480_Sub23Array11467, 499770435)
					* -1454249185;
			aBool7869 = false;
		}

		for (int index = 0; index < anInt11465 * 1158009055; index++) {
			lights[index] = aClass480_Sub23Array11467[index];
		}

		return anInt11465 * 1158009055;
	}

	@Override
	boolean method16268(Toolkit toolkit, int i) {
		Class397 class397 = method10164().aClass397_4507;
		return aClass490_10378.aClass492_6695.method8492(collisionPlane, (int) class397.x >> aClass490_10378.tileScale
				* -1911343043, (int) class397.z >> -1911343043 * aClass490_10378.tileScale);
	}

	@Override
	boolean method16269(int i) {
		Class397 class397 = method10164().aClass397_4507;
		return aClass490_10378.aBoolArrayArray6733[1414880535 * aClass490_10378.anInt6686
				+ ((int) class397.x >> aClass490_10378.tileScale * -1911343043) - aClass490_10378.anInt6723
				* 1243106061][1414880535 * aClass490_10378.anInt6686
				+ ((int) class397.z >> aClass490_10378.tileScale * -1911343043) - aClass490_10378.anInt6724
				* -1342442459];
	}

}