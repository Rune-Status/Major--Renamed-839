package com.jagex;

public class Class498 {
	int anInt6885;
	int anInt6886;
	int anInt6887;
	int anInt6888;
	int anInt6889;
	int anInt6890;
	int anInt6891;
	int anInt6892;
	int anInt6893;
	int anInt6894;

	Class498(int i, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_) {
		anInt6891 = i;
		anInt6886 = i_9_;
		anInt6887 = i_10_;
		anInt6888 = i_11_ * i_11_;
		anInt6885 = anInt6891 + i_12_;
		anInt6890 = anInt6891 + i_13_;
		anInt6889 = anInt6886 + i_14_;
		anInt6892 = anInt6886 + i_15_;
		anInt6893 = anInt6887 + i_16_;
		anInt6894 = anInt6887 + i_17_;
	}

	public boolean method8681(int i, int i_18_, int i_19_) {
		if (i < anInt6885 || i > anInt6890) {
			return false;
		}
		if (i_18_ < anInt6889 || i_18_ > anInt6892) {
			return false;
		}
		if (i_19_ < anInt6893 || i_19_ > anInt6894) {
			return false;
		}
		int i_20_ = i - anInt6891;
		int i_21_ = i_19_ - anInt6887;
		return i_20_ * i_20_ + i_21_ * i_21_ < anInt6888;
	}

	void method8679(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
		anInt6891 = i;
		anInt6886 = i_0_;
		anInt6887 = i_1_;
		anInt6888 = i_2_ * i_2_;
		anInt6885 = anInt6891 + i_3_;
		anInt6890 = anInt6891 + i_4_;
		anInt6889 = anInt6886 + i_5_;
		anInt6892 = anInt6886 + i_6_;
		anInt6893 = anInt6887 + i_7_;
		anInt6894 = anInt6887 + i_8_;
	}

	static Class498 method3163(int i, int i_0_, int i_1_, Model model) {
		if (null == model) {
			return null;
		}

		Class498 class498 = new Class498(i, i_0_, i_1_, model.method2920(), model.minimumX(), model.method2923(),
				model.minimumY(), model.method2931(), model.method2886(), model.maximumZ());
		return class498;
	}
}
