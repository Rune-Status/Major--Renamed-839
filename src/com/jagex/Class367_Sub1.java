package com.jagex;

public class Class367_Sub1 extends Class367 {
	public int anInt9940;

	Class367_Sub1(int i, Class349 class349, Class334 class334, int i_0_, int i_1_, int i_2_) {
		super(i, class349, class334, i_0_, i_1_);
		anInt9940 = i_2_ * 272461641;
	}

	@Override
	public Class360 method316() {
		return Class360.aClass360_3877;
	}

	public static Class367 decode(Buffer buffer) {
		Class367 class367 = Class367.decode(buffer);
		int i_0_ = buffer.readTriByte();
		return new Class367_Sub1(class367.image * -1872155545, class367.aClass349_4045, class367.aClass334_4046,
				-923385377 * class367.anInt4047, class367.anInt4048 * 269378445, i_0_);
	}

}