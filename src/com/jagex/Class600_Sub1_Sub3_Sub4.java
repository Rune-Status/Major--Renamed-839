package com.jagex;

public class Class600_Sub1_Sub3_Sub4 extends Class600_Sub1_Sub3 {
	Class473 aClass473_11701;

	Class600_Sub1_Sub3_Sub4(Class490 class490, Class473 class473, int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		super(class490, i, i_0_, i_1_, i_2_, i_3_, i_1_ >> 9, i_1_ >> 9, i_3_ >> 9, i_3_ >> 9, false, (byte) 0);
		aClass473_11701 = class473;
	}

	@Override
	public Class498 method16293(Toolkit toolkit) {
		return null;
	}

	@Override
	public int method16295() {
		if (aClass473_11701.model == null) {
			return 0;
		}

		return aClass473_11701.model.minimumY();
	}

	@Override
	boolean method16257(Toolkit toolkit, int i, int i_5_) {
		return false;
	}

	@Override
	boolean method16260() {
		return true;
	}

	@Override
	boolean method16261() {
		return false;
	}

	@Override
	void method16262(Toolkit toolkit, Class600_Sub1 class600_sub1, int i, int i_7_, int i_8_, boolean bool, int i_9_) {

	}

	@Override
	void method16263() {

	}

	@Override
	void method16265(Toolkit toolkit) {

	}

	@Override
	Class506 method16271(Toolkit toolkit) {
		if (aClass473_11701.model == null) {
			return null;
		}

		Class405 class405 = toolkit.method2463();
		Class405 class405_4_ = method10166();
		Class393 class393 = method10164();
		class405.copyFrom(class405_4_);
		Class489 class489 = aClass490_10378.aClass489ArrayArrayArray6706[plane][(int) class393.aClass397_4507.x >> 9][(int) class393.aClass397_4507.z >> 9];

		if (null != class489 && class489.aClass600_Sub1_Sub4_6678 != null) {
			class405.method6744(0.0F, -class489.aClass600_Sub1_Sub4_6678.aShort11466, 0.0F);
		}

		aClass473_11701.model.method2917(class405, null, 0);
		return null;
	}

	@Override
	boolean method16302() {
		return false;
	}

}