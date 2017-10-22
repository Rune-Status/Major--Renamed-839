package com.jagex;

public class Class480_Sub31_Sub19_Sub1 extends Class480_Sub31_Sub19 {
	float aFloat11686 = 0.0F;

	public Class480_Sub31_Sub19_Sub1(int i, float f) {
		super(i);
		aFloat11686 = f;
	}

	Class480_Sub31_Sub19_Sub1(int i, Buffer buffer) {
		super(i);
		aFloat11686 = buffer.readFloat();
	}

	@Override
	public void method17880(float f, byte i) {

	}

	@Override
	public void method17881(Class268 class268, Class405 class405, Matrix4f class399, byte i) {
		class405.method6739(0.0F, 0.0F, 1.0F, aFloat11686);
	}

	@Override
	public void method17882(Buffer buffer, int i) {
		aFloat11686 = buffer.readFloat();
	}

	public void method18161(float f) {
		aFloat11686 = f;
	}
}
