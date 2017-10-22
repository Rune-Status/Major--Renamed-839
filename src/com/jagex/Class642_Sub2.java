package com.jagex;

public class Class642_Sub2 extends Class642 {
	Class397 aClass397_10547;
	Class397 aClass397_10548 = new Class397(Float.NaN, Float.NaN, Float.NaN);
	Class397 aClass397_10549;

	public Class642_Sub2(Class261 class261) {
		super(class261);
		aClass397_10547 = new Class397(Float.NaN, Float.NaN, Float.NaN);
		aClass397_10549 = new Class397();
	}

	@Override
	public Class397 method13222(byte i) {
		return Class397.copyOf(aClass397_10547);
	}

	@Override
	public void method13223(float f, int i) {
		aClass261_8163.method4862(false, f, aClass397_10548, aClass261_8163.method4883((byte) 86), aClass397_10547,
				aClass397_10549, -958958229);
	}

	@Override
	public boolean method13224() {
		return !Float.isNaN(aClass397_10548.x);
	}

	@Override
	public void method13227(Class268 class268, Class405 class405, int i, int i_0_, float f, int i_1_) {
		Class397 class397 = Class397.copyOf(aClass261_8163.method4859());
		class397.x -= i;
		class397.z -= i_0_;
		class397.y *= -1.0F;
		Class397 class397_2_ = Class397.copyOf(aClass397_10548);
		class397_2_.x -= i;
		class397_2_.z -= i_0_;
		class397_2_.y *= -1.0F;
		class405.method6731(class397.x, class397.y, class397.z, class397_2_.x, class397_2_.y, class397_2_.z, 0.0F,
				1.0F, 0.0F);
		class397.cache();
		class397_2_.cache();
	}

	@Override
	public Class397 method13235() {
		return Class397.copyOf(aClass397_10548);
	}

	@Override
	public void method13244(Buffer buffer, int i) {
		aClass397_10547.decode(buffer);
	}

	public void method16708(Class480_Sub22 class480_sub22, int i) {
		aClass397_10547.x = -61099889 * class480_sub22.anInt10154;
		aClass397_10547.y = 1227419133 * class480_sub22.anInt10155;
		aClass397_10547.z = class480_sub22.anInt10156 * -980788885;
		if (Float.isNaN(aClass397_10548.x)) {
			aClass397_10548.copyFrom(aClass397_10547);
			aClass397_10549.reset();
		}
	}
}
