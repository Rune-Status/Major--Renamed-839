package com.jagex;

class Class172 implements Interface52 {
	static Widget aClass226_1961;

	static void method3495(int i, int i_16_, boolean bool) {
		IdentikitDefinitionProvider.aBoolArrayArray3303[i][i_16_] = bool;
	}

	Class186 this$0;

	Class172(Class186 class186) {
		this$0 = class186;
	}

	@Override
	public void method345(Object object, float[] fs, Object[] objects, int i) {
		Class456 class456 = (Class456) object;
		Class397 class397 = class456.method7518();
		float f = class456.method7425();
		float f_0_ = class456.method7448();

		Class397 class397_1_ = Class397.difference(class397, this$0.method3598());
		float f_2_ = 0.0F;
		float f_3_ = class397_1_.distance();

		if (f_3_ >= f_0_) {
			f_2_ = 0.0F;
		}

		if (f_3_ <= f) {
			f_2_ = 1.0F;
		} else {
			float f_4_ = 1.0F - (f_3_ - f) * (1.0F / (f_0_ - f));
			if (f_4_ < 0.0 || f_4_ > 1.0) {
				f_4_ = Math.min(Math.max(f_4_, 0.0F), 1.0F);
			}

			f_2_ = f_4_;
		}

		int i_5_ = 8192;
		float f_6_ = 0.0F;

		if (Connection.anInt7170 * 1212513917 == 3) {
			float f_7_ = Class369.aClass261_Sub1_4079.method4843();
			if (class397_1_.x != 0.0F || 0.0F != class397_1_.z) {
				int i_8_ = (int) (-1.0F * f_7_ * 2607.5945876176133)
						- (int) (Math.atan2(class397_1_.x, class397_1_.z) * 2607.5945876176133) - 4096 & 0x3fff;
				if (i_8_ > 8192) {
					i_8_ = 16384 - i_8_;
				}

				int i_9_;
				if (f_3_ <= 0.0F) {
					i_9_ = 8192;
				} else if (f_3_ >= 4096.0F) {
					i_9_ = 16384;
				} else {
					i_9_ = (int) (f_3_ * 8192.0F / 4096.0F + 8192.0F);
				}

				i_5_ = i_8_ * i_9_ / 8192 + (16384 - i_9_ >> 1);
			}

			f_6_ = 6.1035156E-5F * i_5_;
		} else {
			if (class397_1_.x != 0.0F || class397_1_.z != 0.0F) {
				int i_10_ = -(Class550.anInt7476 * 1686504405)
						- (int) (Math.atan2(class397_1_.x, class397_1_.z) * 2607.5945876176133) - 4096 & 0x3fff;

				if (i_10_ > 8192) {
					i_10_ = 16384 - i_10_;
				}

				int i_11_;
				if (f_3_ <= 0.0F) {
					i_11_ = 8192;
				} else if (f_3_ >= 4096.0F) {
					i_11_ = 16384;
				} else {
					i_11_ = (int) (8192.0F + 8192.0F * f_3_ / 4096.0F);
				}

				i_5_ = (16384 - i_11_ >> 1) + i_11_ * i_10_ / 8192;
			}

			f_6_ = i_5_ * 6.1035156E-5F;
		}

		fs[0] = (float) (i_5_ < 0 ? (double) f_2_ : f_2_ * Math.sqrt(2.0F * (1.0F - f_6_)));
		fs[1] = (float) (i_5_ < 0 ? (double) -f_2_ : f_2_ * Math.sqrt(f_6_ * 2.0F));
	}

}