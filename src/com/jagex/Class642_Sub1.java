package com.jagex;

public class Class642_Sub1 extends Class642 {
	static float aFloat10535;
	static int anInt10537 = 0;
	static float aFloat10538;
	static int anInt10539;
	static int anInt10540;
	static float aFloat10541;
	static int anInt10543 = 0;
	static float aFloat10544;
	static float aFloat10545;
	static float aFloat10546;
	static {
		anInt10539 = 0;
		anInt10540 = 0;
		aFloat10541 = -1.0F;
		aFloat10545 = -1.0F;
		aFloat10535 = -1.0F;
		aFloat10544 = -1.0F;
		aFloat10538 = -1.0F;
		aFloat10546 = -1.0F;
	}
	Class395 aClass395_10536;

	Class395 aClass395_10542 = new Class395();

	public Class642_Sub1(Class261 class261) {
		super(class261);
		aClass395_10536 = new Class395(Float.NaN, Float.NaN, Float.NaN, Float.NaN);
	}

	@Override
	public Class397 method13222(byte i) {
		Class397 class397 = new Class397(0.0F, 0.0F, 1000.0F);
		class397.method6480(Class395.method6371(aClass395_10536));
		class397.y *= -1.0F;
		class397.add(aClass261_8163.method4859());
		return class397;
	}

	@Override
	public void method13223(float f, int i) {
		Class395 class395 = method16693();
		if (-346928445 * anInt10537 != 0 || 0 != anInt10543 * -782221851) {
			Class395 class395_15_ = Class395.create();
			class395_15_.method6367(1.0F, 0.0F, 0.0F, (float) (2.0 * (Math.PI * (anInt10537 * -346928445))) / 16384.0F);
			class395.method6377(class395_15_);
			Class397 class397 = Class397.create(0.0F, 1.0F, 0.0F);
			class397.method6480(class395);
			Class395 class395_16_ = Class395.create();
			class397.method6446();
			class395_16_.method6380(class397, (float) (Math.PI * (-782221851 * anInt10543) * 2.0) / 16384.0F);
			class395.method6377(class395_16_);
			method16685(class395);
			anInt10537 = 0;
			anInt10543 = 0;
		}
		if (aClass261_8163.method4837() == Class270.aClass270_2997
				&& (0 != anInt10539 * 55627167 || anInt10540 * -1809448925 != 0)) {
			class395.method6379();
			Class281_Sub3 class281_sub3 = (Class281_Sub3) aClass261_8163.method4876();
			Class480_Sub22 class480_sub22 = class281_sub3.method5238((short) 17955);
			Class397 class397 = class480_sub22.copy();
			Class397 class397_17_ = Class397.create(0.0F, 0.0F, anInt10540 * -1809448925);
			class397_17_.method6480(class395);
			class397_17_.y *= -1.0F;
			class397.add(class397_17_);
			Class397 class397_18_ = Class397.create(55627167 * anInt10539, 0.0F, 0.0F);
			class397_18_.method6480(class395);
			class397_18_.y *= -1.0F;
			class397.add(class397_18_);
			method16697(class397, (byte) 14);
			class281_sub3.method15304(new Class480_Sub22(-841913453 * class480_sub22.plane, (int) class397.x,
					(int) class397.y, (int) class397.z));
			anInt10539 = 0;
			anInt10540 = 0;
		}
	}

	@Override
	public boolean method13224() {
		return !Float.isNaN(aClass395_10542.aFloat4516) && aClass261_8163.method4859() != null;
	}

	@Override
	public void method13227(Class268 class268, Class405 class405, int i, int i_12_, float f, int i_13_) {
		Class397 class397 = Class397.copyOf(aClass261_8163.method4859());
		class397.x -= i;
		class397.z -= i_12_;
		class397.y *= -1.0F;
		class405.method6737(Class395.method6371(aClass395_10542));
		class405.method6747(class397);
		class405.method6735();
		class397.cache();
	}

	@Override
	public Class397 method13235() {
		Class397 class397 = new Class397(0.0F, 0.0F, 1000.0F);
		class397.method6480(Class395.method6371(aClass395_10542));
		class397.y *= -1.0F;
		class397.add(aClass261_8163.method4859());
		return class397;
	}

	@Override
	public void method13244(Buffer buffer, int i) {
		aClass395_10542.decode(buffer);
	}

	public void method16685(Class395 class395) {
		aClass395_10536.aFloat4516 = class395.aFloat4516;
		aClass395_10536.aFloat4517 = class395.aFloat4517;
		aClass395_10536.aFloat4513 = class395.aFloat4513;
		aClass395_10536.aFloat4518 = class395.aFloat4518;
		aClass395_10542.copyFrom(aClass395_10536);
	}

	public void method16687(int i, int i_0_) {
		anInt10543 = i * -863455251;
	}

	public void method16688(int i, byte i_1_) {
		anInt10539 = 370871903 * i;
	}

	public void method16689(int i, int i_2_) {
		anInt10540 = i * -419254389;
	}

	public void method16691(int i, int i_3_, int i_4_, int i_5_) {
		Class405 class405 = new Class405();
		class405.method6731(0.0, 0.0, 0.0, i, -i_3_, i_4_, 0.0F, 1.0F, 0.0F);
		Class404 class404 = new Class404();
		class405.method6753(class404.aFloatArray4554);
		Class395 class395 = class404.method6718();
		class395.method6379();
		aClass395_10542.copyFrom(class395);
	}

	public void method16692(Class397 class397, int i, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, byte i_11_) {
		aFloat10541 = -1 == i ? -1.0F : class397.x - 512 * i;
		aFloat10545 = i_6_ == -1 ? -1.0F : 512 * i_6_ + class397.x;
		aFloat10535 = i_9_ == -1 ? -1.0F : -class397.y - 512 * i_9_;
		aFloat10544 = i_10_ == -1 ? -1.0F : -class397.y + i_10_ * 512;
		aFloat10538 = i_7_ == -1 ? -1.0F : class397.z - i_7_ * 512;
		aFloat10546 = i_8_ == -1 ? -1.0F : class397.z + 512 * i_8_;
	}

	public Class395 method16693() {
		return new Class395(aClass395_10542);
	}

	public void method16703(int i) {
		anInt10537 = 409548267 * i;
	}

	void method16697(Class397 class397, byte i) {
		if (-1.0F != aFloat10541 && class397.x < aFloat10541) {
			class397.x = aFloat10541;
		}
		if (aFloat10545 != -1.0F && class397.x > aFloat10545) {
			class397.x = aFloat10545;
		}
		if (-1.0F != aFloat10535 && class397.y < aFloat10535) {
			class397.y = aFloat10535;
		}
		if (-1.0F != aFloat10544 && class397.y > aFloat10544) {
			class397.y = aFloat10544;
		}
		if (-1.0F != aFloat10538 && class397.z < aFloat10538) {
			class397.z = aFloat10538;
		}
		if (aFloat10546 != -1.0F && class397.z > aFloat10546) {
			class397.z = aFloat10546;
		}
	}
}
