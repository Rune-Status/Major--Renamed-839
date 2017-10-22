package com.jagex;


class Class177 implements Interface52 {
	public static ConnectionInfo aClass672_1992;

	Class186 this$0;

	Class177(Class186 class186) {
		this$0 = class186;
	}

	@Override
	public void method345(Object object, float[] fs, Object[] objects, int i) {
		Class456 class456 = (Class456) object;
		Class397 class397 = class456.method7518();
		float f = class456.method7425();
		float f_0_ = class456.method7448();
		Class397 class397_1_ = this$0.method3598();
		Class397 class397_2_ = Class397.difference(class397, class397_1_);
		float f_3_ = 0.0F;
		float distance = class397_2_.distance();

		if (distance >= f_0_) {
			f_3_ = 0.0F;
		} else {
			float f_5_ = ((Float) objects[0]).floatValue();
			float f_6_ = ((Float) objects[1]).floatValue();

			if (class397_1_.x > class397.x - f_5_ / 2.0F && class397_1_.x < f_5_ / 2.0F + class397.x
					&& class397_1_.z > class397.z - f_6_ / 2.0F && class397_1_.z < class397.z + f_6_ / 2.0F) {
				float f_7_ = Math.abs(class397_1_.x - (class397.x + f_5_ / 2.0F));
				float f_8_ = Math.abs(class397_1_.x - (class397.x - f_5_ / 2.0F));
				float f_9_ = Math.abs(class397_1_.z - (class397.x + f_6_ / 2.0F));
				float f_10_ = Math.abs(class397_1_.z - (class397.x - f_6_ / 2.0F));
				float f_11_ = f_0_ - f;
				float f_12_ = Math.min(f_7_, f_8_);
				float f_13_ = Math.min(f_9_, f_10_);
				float f_14_ = f_12_ * (1.0F / f_11_);
				float f_15_ = f_13_ * (1.0F / f_11_);

				f_14_ = Math.min(Math.max(f_14_, 0.0F), 1.0F);
				f_15_ = Math.min(Math.max(f_15_, 0.0F), 1.0F);
				f_3_ = Math.min(f_14_, f_15_);
			}
		}

		fs[0] = f_3_;
		fs[1] = f_3_;
	}

}