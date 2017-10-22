package com.jagex;

public class Class281_Sub1_Sub2 extends Class281_Sub1 {
	static final void method17498(ScriptExecutionContext class613, int i) {

	}

	public Class281_Sub1_Sub2(Class261 class261) {
		super(class261);
	}

	@Override
	float method15215(float f, float f_0_, float f_1_, int i) {
		float f_2_ = f - aFloat9745;
		if (aClass261_3155.method4847(-169907002).x == Float.POSITIVE_INFINITY) {
			f_0_ = aClass261_3155.method4850(1327959542).distance();
		} else {
			float f_3_ = f_0_ / aClass261_3155.method4847(22063303).distance();
			float f_4_ = f_3_ * (f_0_ / 2.0F);
			if (f_4_ > f_2_) {
				f_0_ -= aClass261_3155.method4847(-1137347880).distance() * f_1_;
				if (f_0_ < 0.0F) {
					f_0_ = 0.0F;
				}
			} else if (f_0_ < aClass261_3155.method4850(1374015250).distance()) {
				f_0_ += aClass261_3155.method4847(15673424).distance() * f_1_;
				if (f_0_ > aClass261_3155.method4850(1922607975).distance()) {
					f_0_ = aClass261_3155.method4850(-293294881).distance();
				}
			}
		}
		return f_0_;
	}

	@Override
	void method15216(int i) {

	}

	@Override
	void method15218(Buffer buffer, int i, int i_5_) {

	}
}
