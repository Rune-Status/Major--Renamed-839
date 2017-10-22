package com.jagex;

public class Class302_Sub1_Sub2 extends Class302_Sub1 {
	public int anInt11134;
	float aFloat11135;
	Class480_Sub13_Sub1 aClass480_Sub13_Sub1_11136;
	Class249 aClass249_11137;
	Class480_Sub13_Sub1 aClass480_Sub13_Sub1_11138;
	Class480_Sub13_Sub1 aClass480_Sub13_Sub1_11139;
	float[] aFloatArray11140;
	Class480_Sub13_Sub1 aClass480_Sub13_Sub1_11141;
	public Matrix4f aClass399_11142;
	Class480_Sub13_Sub1 aClass480_Sub13_Sub1_11143;
	float[] aFloatArray11144;
	Class480_Sub13_Sub1 aClass480_Sub13_Sub1_11145;
	public int anInt11146;
	public Matrix4f aClass399_11147 = new Matrix4f();
	Class294 aClass294_11148;
	public int anInt11149;
	public int anInt11150;
	Class249 aClass249_11151;

	public Class302_Sub1_Sub2(NativeToolkit toolkit, Class294 class294) throws ProgramException {
		super(toolkit);
		aClass399_11142 = new Matrix4f();
		aFloatArray11144 = new float[4];
		aFloatArray11140 = new float[4];
		aClass294_11148 = class294;

		if (aClass294_11148.method5406() && toolkit.method14585()) {
			method15160("Waterfall");
		}
	}

	public void method17512(int i, int i_0_, int i_1_) {
		float f = (1 + (i & 0x3)) * -5.0E-4F;
		float f_2_ = ((i >> 3 & 0x3) + 1) * 5.0E-4F;
		float f_3_ = (i & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		boolean bool = 0 != (i & 0x80);
		if (bool) {
			aFloatArray11144[0] = f_3_;
			aFloatArray11144[1] = 0.0F;
			aFloatArray11144[2] = 0.0F;
			aFloatArray11144[3] = 0.0F;
		} else {
			aFloatArray11144[0] = 0.0F;
			aFloatArray11144[1] = 0.0F;
			aFloatArray11144[2] = f_3_;
			aFloatArray11144[3] = 0.0F;
		}
		aFloatArray11140[0] = 0.0F;
		aFloatArray11140[1] = f_3_;
		aFloatArray11140[2] = 0.0F;
		aFloatArray11140[3] = f * toolkit.anInt9401 % 1.0F;
		if (!aClass294_11148.threeDimensional) {
			int i_4_ = (int) (16.0F * (f_2_ * toolkit.anInt9401));
			toolkit.method14689(aClass294_11148.anInterface29Array3258[i_4_ % 16]);
		} else {
			aFloat11135 = (float) ((double) f_2_ * (double) toolkit.anInt9401 % 1.0);
		}
	}

	public void method17513(int i) {
		if (aClass294_11148.threeDimensional) {
			program.method4464(aClass249_11137);
		} else {
			program.method4464(aClass249_11151);
		}
		program.method4522();
		if (aClass294_11148.threeDimensional) {
			program.method4466(aClass480_Sub13_Sub1_11136, 0, aClass294_11148.anInterface30_3264);
		}
		program.method4470(aClass480_Sub13_Sub1_11138, aClass399_11142);
		program.method4470(aClass480_Sub13_Sub1_11139, aClass399_11147);
		program.method4448(aClass480_Sub13_Sub1_11143, new Class375(aFloatArray11144[0], aFloatArray11144[1],
				aFloatArray11144[2], aFloatArray11144[3]));
		program.method4448(aClass480_Sub13_Sub1_11145, new Class375(aFloatArray11140[0], aFloatArray11140[1],
				aFloatArray11140[2], aFloatArray11140[3]));
		program.method4448(aClass480_Sub13_Sub1_11141, new Class375(aFloat11135, 0.0F, 0.0F, 0.0F));
		toolkit.method14773(Class333.aClass333_3597, anInt11146 * -25283447, 1050477657 * anInt11149,
				anInt11150 * 1754627551, anInt11134 * -342665431);
	}

	@Override
	boolean method15161() throws ProgramException {
		aClass480_Sub13_Sub1_11138 = program.method4521("WorldMatrix");
		aClass480_Sub13_Sub1_11139 = program.method4521("WVPMatrix");
		aClass480_Sub13_Sub1_11143 = program.method4521("UGenerationPlane");
		aClass480_Sub13_Sub1_11145 = program.method4521("VGenerationPlane");
		aClass480_Sub13_Sub1_11141 = program.method4521("Time");
		aClass480_Sub13_Sub1_11136 = program.method4521("billowSampler3D");
		if (aClass294_11148.threeDimensional) {
			aClass249_11137 = program.method4447("Waterfall3D");
			program.method4464(aClass249_11137);
		} else {
			aClass249_11151 = program.method4447("Waterfall2D");
			program.method4464(aClass249_11151);
		}
		return true;
	}
}
