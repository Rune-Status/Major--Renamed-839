package com.jagex;

public class Class398 {
	public static void method6540(Class397 class397, Class397 class397_0_, Class397 class397_1_, float f,
			Class397[] class397s) {
		Class397 class397_2_ = Class397.difference(class397, class397_1_);
		float f_3_ = Class397.method6452(class397_2_, class397_2_) - f * f;
		float f_4_ = Class397.method6452(class397_0_, class397_2_);
		float f_5_ = f_4_ * f_4_ - f_3_;
		if (f_5_ < 0.0F) {
			Class397[] class397s_6_ = class397s;
			class397s[1] = null;
			class397s_6_[0] = null;
		} else if (f_5_ >= 9.765625E-4F) {
			float f_7_ = (float) Math.sqrt(f_5_);
			class397s[0] = Class397.empty();
			class397s[0].copyFrom(class397);
			class397s[0].add(Class397.product(Class397.copyOf(class397_0_), -f_4_ - f_7_));
			class397s[1] = Class397.empty();
			class397s[1].copyFrom(class397);
			class397s[1].add(Class397.product(Class397.copyOf(class397_0_), -f_4_ + f_7_));
		} else {
			class397s[0] = Class397.empty();
			class397s[0].copyFrom(class397);
			class397s[0].add(Class397.product(Class397.copyOf(class397_0_), -f_4_));
			class397s[1] = null;
		}
	}

	Class398() throws Throwable {
		throw new Error();
	}
}
