package com.jagex;

public class Class642_Sub5_Sub1 extends Class642_Sub5 {
	public Class642_Sub5_Sub1(Class261 class261) {
		super(class261);
	}

	@Override
	float method16765(float f, float f_0_, float f_1_, int i) {
		float f_2_ = f - aFloat10573;
		if (aClass261_8163.method4846((short) 16385).x == Float.POSITIVE_INFINITY) {
			f_0_ = aClass261_8163.method4912().distance();
		} else {
			float f_3_ = f_0_ / aClass261_8163.method4846((short) 16385).distance();
			float f_4_ = f_3_ * (f_0_ / 2.0F);
			if (f_4_ > f_2_) {
				f_0_ -= aClass261_8163.method4846((short) 16385).distance() * f_1_;
				if (f_0_ < 0.0F) {
					f_0_ = 0.0F;
				}
			} else if (f_0_ < aClass261_8163.method4912().distance()) {
				f_0_ += aClass261_8163.method4846((short) 16385).distance() * f_1_;
				if (f_0_ > aClass261_8163.method4912().distance()) {
					f_0_ = aClass261_8163.method4912().distance();
				}
			}
		}
		return f_0_;
	}

	@Override
	void method16766(byte i) {

	}

	@Override
	void method16768(Buffer buffer, int i, int i_5_) {

	}
}
