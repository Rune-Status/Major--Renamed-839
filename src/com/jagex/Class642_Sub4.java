package com.jagex;

public class Class642_Sub4 extends Class642 {
	public static void method16758(int i, byte i_5_) {
		PulseEvent class480_sub31_sub5 = PulseEvent.create(5, i);
		class480_sub31_sub5.delay();
	}

	Class401 aClass401_10571 = null;

	Class281_Sub1 aClass281_Sub1_10572 = null;

	public Class642_Sub4(Class261 class261) {
		super(class261);
	}

	@Override
	public Class397 method13222(byte i) {
		return method13235();
	}

	@Override
	public void method13223(float f, int i) {

	}

	@Override
	public boolean method13224() {
		return null != aClass401_10571 && aClass281_Sub1_10572 != null && aClass281_Sub1_10572.method5226();
	}

	@Override
	public void method13227(Class268 class268, Class405 class405, int i, int i_0_, float f, int i_1_) {
		double[] ds = aClass261_8163.method4839();
		ds[0] -= i;
		ds[2] -= i_0_;
		double[] ds_2_ = method16755((byte) -10);
		ds_2_[0] -= i;
		ds_2_[2] -= i_0_;
		ds[1] *= -1.0;
		ds_2_[1] *= -1.0;
		Class397 class397 = Class397.empty();
		class397.x = (float) (ds_2_[0] - ds[0]);
		class397.y = (float) (ds_2_[1] - ds[1]);
		class397.z = (float) (ds_2_[2] - ds[2]);
		class397.method6446();
		Class395 class395 = new Class395();
		class395.method6380(class397, f);
		Class397 class397_3_ = Class397.create(0.0F, 1.0F, 0.0F);
		Class397 class397_4_ = Class397.method6454(class397, class397_3_);
		class397_3_ = Class397.method6454(class397_4_, class397);
		class397_3_.method6480(class395);
		class405.method6731(ds[0], ds[1], ds[2], ds_2_[0], ds_2_[1], ds_2_[2], class397_3_.x, class397_3_.y,
				class397_3_.z);
		class397_3_.cache();
	}

	@Override
	public Class397 method13235() {
		Class397 class397 = Class397.empty();
		double[] ds = aClass401_10571.method6671(aClass281_Sub1_10572.method15226((short) 27779));
		class397.x = (float) ds[0];
		class397.y = (float) ds[1];
		class397.z = (float) ds[2];
		return class397;
	}

	@Override
	public void method13244(Buffer buffer, int i) {
		aClass401_10571 = new Class401(buffer);
	}

	double[] method16755(byte i) {
		return aClass401_10571.method6671(aClass281_Sub1_10572.method15226((short) 31437));
	}
}
