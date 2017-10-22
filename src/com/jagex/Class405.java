package com.jagex;

public class Class405 {
	public static Class405 aClass405_4563 = new Class405();
	float aFloat4555;
	float aFloat4556;
	float aFloat4557;
	float aFloat4558;
	float aFloat4559;
	float aFloat4560;
	float aFloat4561;
	float aFloat4562;
	float aFloat4564;
	float aFloat4565;
	float aFloat4566;
	float aFloat4567;

	public Class405() {
		method6730();
	}

	public Class405(Class405 class405_113_) {
		copyFrom(class405_113_);
	}

	public void method6725(Class405 class405_0_) {
		if (class405_0_ == this) {
			method6735();
		} else {
			aFloat4556 = class405_0_.aFloat4556;
			aFloat4564 = class405_0_.aFloat4562;
			aFloat4559 = class405_0_.aFloat4558;
			aFloat4562 = class405_0_.aFloat4564;
			aFloat4560 = class405_0_.aFloat4560;
			aFloat4555 = class405_0_.aFloat4561;
			aFloat4558 = class405_0_.aFloat4559;
			aFloat4561 = class405_0_.aFloat4555;
			aFloat4557 = class405_0_.aFloat4557;
			aFloat4565 = -(class405_0_.aFloat4565 * aFloat4556 + class405_0_.aFloat4566 * aFloat4564 + class405_0_.aFloat4567
					* aFloat4559);
			aFloat4566 = -(class405_0_.aFloat4565 * aFloat4562 + class405_0_.aFloat4566 * aFloat4560 + class405_0_.aFloat4567
					* aFloat4555);
			aFloat4567 = -(class405_0_.aFloat4565 * aFloat4558 + class405_0_.aFloat4566 * aFloat4561 + class405_0_.aFloat4567
					* aFloat4557);
		}
	}

	public void copyFrom(Class405 other) {
		aFloat4556 = other.aFloat4556;
		aFloat4564 = other.aFloat4564;
		aFloat4559 = other.aFloat4559;
		aFloat4565 = other.aFloat4565;
		aFloat4562 = other.aFloat4562;
		aFloat4560 = other.aFloat4560;
		aFloat4555 = other.aFloat4555;
		aFloat4566 = other.aFloat4566;
		aFloat4558 = other.aFloat4558;
		aFloat4561 = other.aFloat4561;
		aFloat4557 = other.aFloat4557;
		aFloat4567 = other.aFloat4567;
	}

	public void method6728(Class393 class393) {
		method6737(class393.aClass395_4506);
		method6747(class393.aClass397_4507);
	}

	public void method6729(Class393 class393) {
		float f = class393.aClass395_4506.aFloat4518 * class393.aClass395_4506.aFloat4518;
		float f_2_ = class393.aClass395_4506.aFloat4518 * class393.aClass395_4506.aFloat4516;
		float f_3_ = class393.aClass395_4506.aFloat4518 * class393.aClass395_4506.aFloat4517;
		float f_4_ = class393.aClass395_4506.aFloat4518 * class393.aClass395_4506.aFloat4513;
		float f_5_ = class393.aClass395_4506.aFloat4516 * class393.aClass395_4506.aFloat4516;
		float f_6_ = class393.aClass395_4506.aFloat4516 * class393.aClass395_4506.aFloat4517;
		float f_7_ = class393.aClass395_4506.aFloat4516 * class393.aClass395_4506.aFloat4513;
		float f_8_ = class393.aClass395_4506.aFloat4517 * class393.aClass395_4506.aFloat4517;
		float f_9_ = class393.aClass395_4506.aFloat4517 * class393.aClass395_4506.aFloat4513;
		float f_10_ = class393.aClass395_4506.aFloat4513 * class393.aClass395_4506.aFloat4513;
		aFloat4556 = f_5_ + f - f_10_ - f_8_;
		aFloat4562 = f_6_ + f_4_ + f_6_ + f_4_;
		aFloat4558 = f_7_ - f_3_ - f_3_ + f_7_;
		aFloat4564 = f_6_ - f_4_ - f_4_ + f_6_;
		aFloat4560 = f_8_ + f - f_5_ - f_10_;
		aFloat4561 = f_9_ + f_2_ + f_9_ + f_2_;
		aFloat4559 = f_7_ + f_3_ + f_7_ + f_3_;
		aFloat4555 = f_9_ - f_2_ - f_2_ + f_9_;
		aFloat4557 = f_10_ + f - f_8_ - f_5_;
		aFloat4565 = class393.aClass397_4507.x;
		aFloat4566 = class393.aClass397_4507.y;
		aFloat4567 = class393.aClass397_4507.z;
	}

	public void method6730() {
		aFloat4567 = 0.0F;
		aFloat4566 = 0.0F;
		aFloat4565 = 0.0F;
		aFloat4555 = 0.0F;
		aFloat4559 = 0.0F;
		aFloat4561 = 0.0F;
		aFloat4564 = 0.0F;
		aFloat4558 = 0.0F;
		aFloat4562 = 0.0F;
		aFloat4557 = 1.0F;
		aFloat4560 = 1.0F;
		aFloat4556 = 1.0F;
	}

	public void method6731(double d, double d_11_, double d_12_, double d_13_, double d_14_, double d_15_, float f,
			float f_16_, float f_17_) {
		float f_18_ = (float) (d_13_ - d);
		float f_19_ = (float) (d_14_ - d_11_);
		float f_20_ = (float) (d_15_ - d_12_);
		float f_21_ = f_16_ * f_20_ - f_17_ * f_19_;
		float f_22_ = f_17_ * f_18_ - f * f_20_;
		float f_23_ = f * f_19_ - f_16_ * f_18_;
		float f_24_ = (float) (1.0 / Math.sqrt(f_21_ * f_21_ + f_22_ * f_22_ + f_23_ * f_23_));
		float f_25_ = (float) (1.0 / Math.sqrt(f_18_ * f_18_ + f_19_ * f_19_ + f_20_ * f_20_));
		aFloat4556 = f_21_ * f_24_;
		aFloat4564 = f_22_ * f_24_;
		aFloat4559 = f_23_ * f_24_;
		aFloat4558 = f_18_ * f_25_;
		aFloat4561 = f_19_ * f_25_;
		aFloat4557 = f_20_ * f_25_;
		aFloat4562 = aFloat4561 * aFloat4559 - aFloat4557 * aFloat4564;
		aFloat4560 = aFloat4557 * aFloat4556 - aFloat4558 * aFloat4559;
		aFloat4555 = aFloat4558 * aFloat4564 - aFloat4561 * aFloat4556;
		aFloat4565 = -(float) (d * aFloat4556 + d_11_ * aFloat4564 + d_12_ * aFloat4559);
		aFloat4566 = -(float) (d * aFloat4562 + d_11_ * aFloat4560 + d_12_ * aFloat4555);
		aFloat4567 = -(float) (d * aFloat4558 + d_11_ * aFloat4561 + d_12_ * aFloat4557);
	}

	public void method6735() {
		float f = aFloat4565;
		float f_26_ = aFloat4566;
		float f_27_ = aFloat4564;
		aFloat4564 = aFloat4562;
		aFloat4562 = f_27_;
		float f_28_ = aFloat4559;
		aFloat4559 = aFloat4558;
		aFloat4558 = f_28_;
		float f_29_ = aFloat4555;
		aFloat4555 = aFloat4561;
		aFloat4561 = f_29_;
		aFloat4565 = -(f * aFloat4556 + f_26_ * aFloat4564 + aFloat4567 * aFloat4559);
		aFloat4566 = -(f * aFloat4562 + f_26_ * aFloat4560 + aFloat4567 * aFloat4555);
		aFloat4567 = -(f * aFloat4558 + f_26_ * aFloat4561 + aFloat4567 * aFloat4557);
	}

	public void method6737(Class395 class395) {
		method6738(class395.aFloat4516, class395.aFloat4517, class395.aFloat4513, class395.aFloat4518);
	}

	public void method6739(float f, float f_42_, float f_43_, float f_44_) {
		float f_45_ = (float) Math.cos(f_44_);
		float f_46_ = (float) Math.sin(f_44_);
		float f_47_ = f_45_ + f * f * (1.0F - f_45_);
		float f_48_ = f_43_ * f_46_ + f_42_ * f * (1.0F - f_45_);
		float f_49_ = -f_42_ * f_46_ + f_43_ * f * (1.0F - f_45_);
		float f_50_ = -f_43_ * f_46_ + f * f_42_ * (1.0F - f_45_);
		float f_51_ = f_45_ + f_42_ * f_42_ * (1.0F - f_45_);
		float f_52_ = f * f_46_ + f_43_ * f_42_ * (1.0F - f_45_);
		float f_53_ = f_42_ * f_46_ + f * f_43_ * (1.0F - f_45_);
		float f_54_ = -f * f_46_ + f_42_ * f_43_ * (1.0F - f_45_);
		float f_55_ = f_45_ + f_43_ * f_43_ * (1.0F - f_45_);
		float f_56_ = aFloat4556;
		float f_57_ = aFloat4562;
		float f_58_ = aFloat4564;
		float f_59_ = aFloat4560;
		float f_60_ = aFloat4559;
		float f_61_ = aFloat4555;
		float f_62_ = aFloat4565;
		float f_63_ = aFloat4566;
		aFloat4556 = f_56_ * f_47_ + f_57_ * f_50_ + aFloat4558 * f_53_;
		aFloat4562 = f_56_ * f_48_ + f_57_ * f_51_ + aFloat4558 * f_54_;
		aFloat4558 = f_56_ * f_49_ + f_57_ * f_52_ + aFloat4558 * f_55_;
		aFloat4564 = f_58_ * f_47_ + f_59_ * f_50_ + aFloat4561 * f_53_;
		aFloat4560 = f_58_ * f_48_ + f_59_ * f_51_ + aFloat4561 * f_54_;
		aFloat4561 = f_58_ * f_49_ + f_59_ * f_52_ + aFloat4561 * f_55_;
		aFloat4559 = f_60_ * f_47_ + f_61_ * f_50_ + aFloat4557 * f_53_;
		aFloat4555 = f_60_ * f_48_ + f_61_ * f_51_ + aFloat4557 * f_54_;
		aFloat4557 = f_60_ * f_49_ + f_61_ * f_52_ + aFloat4557 * f_55_;
		aFloat4565 = f_62_ * f_47_ + f_63_ * f_50_ + aFloat4567 * f_53_;
		aFloat4566 = f_62_ * f_48_ + f_63_ * f_51_ + aFloat4567 * f_54_;
		aFloat4567 = f_62_ * f_49_ + f_63_ * f_52_ + aFloat4567 * f_55_;
	}

	public void method6740(float f, float f_64_, float f_65_) {
		aFloat4556 = f;
		aFloat4564 = 0.0F;
		aFloat4559 = 0.0F;
		aFloat4565 = 0.0F;
		aFloat4562 = 0.0F;
		aFloat4560 = f_64_;
		aFloat4555 = 0.0F;
		aFloat4566 = 0.0F;
		aFloat4558 = 0.0F;
		aFloat4561 = 0.0F;
		aFloat4557 = f_65_;
		aFloat4567 = 0.0F;
	}

	public void method6741(float f, float f_66_, float f_67_) {
		aFloat4556 *= f;
		aFloat4564 *= f;
		aFloat4559 *= f;
		aFloat4565 *= f;
		aFloat4562 *= f_66_;
		aFloat4560 *= f_66_;
		aFloat4555 *= f_66_;
		aFloat4566 *= f_66_;
		aFloat4558 *= f_67_;
		aFloat4561 *= f_67_;
		aFloat4557 *= f_67_;
		aFloat4567 *= f_67_;
	}

	public void method6742(float f, float f_68_, float f_69_) {
		aFloat4555 = 0.0F;
		aFloat4559 = 0.0F;
		aFloat4561 = 0.0F;
		aFloat4564 = 0.0F;
		aFloat4558 = 0.0F;
		aFloat4562 = 0.0F;
		aFloat4557 = 1.0F;
		aFloat4560 = 1.0F;
		aFloat4556 = 1.0F;
		aFloat4565 = f;
		aFloat4566 = f_68_;
		aFloat4567 = f_69_;
	}

	public void method6744(float f, float f_70_, float f_71_) {
		aFloat4565 += f;
		aFloat4566 += f_70_;
		aFloat4567 += f_71_;
	}

	public void method6745(Class405 other) {
		float f = aFloat4556;
		float f_73_ = aFloat4562;
		float f_74_ = aFloat4564;
		float f_75_ = aFloat4560;
		float f_76_ = aFloat4559;
		float f_77_ = aFloat4555;
		float f_78_ = aFloat4565;
		float f_79_ = aFloat4566;
		float f_80_ = aFloat4558;
		float f_81_ = aFloat4561;
		float f_82_ = aFloat4557;
		float f_83_ = aFloat4567;
		aFloat4556 = f * other.aFloat4556 + f_73_ * other.aFloat4564 + f_80_ * other.aFloat4559;
		aFloat4562 = f * other.aFloat4562 + f_73_ * other.aFloat4560 + f_80_ * other.aFloat4555;
		aFloat4558 = f * other.aFloat4558 + f_73_ * other.aFloat4561 + f_80_ * other.aFloat4557;
		aFloat4564 = f_74_ * other.aFloat4556 + f_75_ * other.aFloat4564 + f_81_ * other.aFloat4559;
		aFloat4560 = f_74_ * other.aFloat4562 + f_75_ * other.aFloat4560 + f_81_ * other.aFloat4555;
		aFloat4561 = f_74_ * other.aFloat4558 + f_75_ * other.aFloat4561 + f_81_ * other.aFloat4557;
		aFloat4559 = f_76_ * other.aFloat4556 + f_77_ * other.aFloat4564 + f_82_ * other.aFloat4559;
		aFloat4555 = f_76_ * other.aFloat4562 + f_77_ * other.aFloat4560 + f_82_ * other.aFloat4555;
		aFloat4557 = f_76_ * other.aFloat4558 + f_77_ * other.aFloat4561 + f_82_ * other.aFloat4557;
		aFloat4565 = f_78_ * other.aFloat4556 + f_79_ * other.aFloat4564 + f_83_ * other.aFloat4559 + other.aFloat4565;
		aFloat4566 = f_78_ * other.aFloat4562 + f_79_ * other.aFloat4560 + f_83_ * other.aFloat4555 + other.aFloat4566;
		aFloat4567 = f_78_ * other.aFloat4558 + f_79_ * other.aFloat4561 + f_83_ * other.aFloat4557 + other.aFloat4567;
	}

	public void method6746(Class405 class405_84_, Class405 class405_85_) {
		aFloat4556 = class405_84_.aFloat4556 * class405_85_.aFloat4556 + class405_84_.aFloat4562
				* class405_85_.aFloat4564 + class405_84_.aFloat4558 * class405_85_.aFloat4559;
		aFloat4562 = class405_84_.aFloat4556 * class405_85_.aFloat4562 + class405_84_.aFloat4562
				* class405_85_.aFloat4560 + class405_84_.aFloat4558 * class405_85_.aFloat4555;
		aFloat4558 = class405_84_.aFloat4556 * class405_85_.aFloat4558 + class405_84_.aFloat4562
				* class405_85_.aFloat4561 + class405_84_.aFloat4558 * class405_85_.aFloat4557;
		aFloat4564 = class405_84_.aFloat4564 * class405_85_.aFloat4556 + class405_84_.aFloat4560
				* class405_85_.aFloat4564 + class405_84_.aFloat4561 * class405_85_.aFloat4559;
		aFloat4560 = class405_84_.aFloat4564 * class405_85_.aFloat4562 + class405_84_.aFloat4560
				* class405_85_.aFloat4560 + class405_84_.aFloat4561 * class405_85_.aFloat4555;
		aFloat4561 = class405_84_.aFloat4564 * class405_85_.aFloat4558 + class405_84_.aFloat4560
				* class405_85_.aFloat4561 + class405_84_.aFloat4561 * class405_85_.aFloat4557;
		aFloat4559 = class405_84_.aFloat4559 * class405_85_.aFloat4556 + class405_84_.aFloat4555
				* class405_85_.aFloat4564 + class405_84_.aFloat4557 * class405_85_.aFloat4559;
		aFloat4555 = class405_84_.aFloat4559 * class405_85_.aFloat4562 + class405_84_.aFloat4555
				* class405_85_.aFloat4560 + class405_84_.aFloat4557 * class405_85_.aFloat4555;
		aFloat4557 = class405_84_.aFloat4559 * class405_85_.aFloat4558 + class405_84_.aFloat4555
				* class405_85_.aFloat4561 + class405_84_.aFloat4557 * class405_85_.aFloat4557;
		aFloat4565 = class405_84_.aFloat4565 * class405_85_.aFloat4556 + class405_84_.aFloat4566
				* class405_85_.aFloat4564 + class405_84_.aFloat4567 * class405_85_.aFloat4559 + class405_85_.aFloat4565;
		aFloat4566 = class405_84_.aFloat4565 * class405_85_.aFloat4562 + class405_84_.aFloat4566
				* class405_85_.aFloat4560 + class405_84_.aFloat4567 * class405_85_.aFloat4555 + class405_85_.aFloat4566;
		aFloat4567 = class405_84_.aFloat4565 * class405_85_.aFloat4558 + class405_84_.aFloat4566
				* class405_85_.aFloat4561 + class405_84_.aFloat4567 * class405_85_.aFloat4557 + class405_85_.aFloat4567;
	}

	public void method6747(Class397 class397) {
		method6744(class397.x, class397.y, class397.z);
	}

	public void method6749(float[] fs) {
		float f = fs[0] - aFloat4565;
		float f_86_ = fs[1] - aFloat4566;
		float f_87_ = fs[2] - aFloat4567;
		fs[0] = (int) (aFloat4556 * f + aFloat4562 * f_86_ + aFloat4558 * f_87_);
		fs[1] = (int) (aFloat4564 * f + aFloat4560 * f_86_ + aFloat4561 * f_87_);
		fs[2] = (int) (aFloat4559 * f + aFloat4555 * f_86_ + aFloat4557 * f_87_);
	}

	public void method6750(float[] fs) {
		float f = fs[0];
		float f_88_ = fs[1];
		float f_89_ = fs[2];
		fs[0] = aFloat4556 * f + aFloat4562 * f_88_ + aFloat4558 * f_89_;
		fs[1] = aFloat4564 * f + aFloat4560 * f_88_ + aFloat4561 * f_89_;
		fs[2] = aFloat4559 * f + aFloat4555 * f_88_ + aFloat4557 * f_89_;
	}

	public float[] method6751(float[] fs) {
		fs[0] = aFloat4565;
		fs[1] = aFloat4566;
		fs[2] = aFloat4567;
		return fs;
	}

	public float[] method6753(float[] fs) {
		fs[0] = aFloat4556;
		fs[1] = aFloat4562;
		fs[2] = aFloat4558;
		fs[3] = aFloat4564;
		fs[4] = aFloat4560;
		fs[5] = aFloat4561;
		fs[6] = aFloat4559;
		fs[7] = aFloat4555;
		fs[8] = aFloat4557;
		return fs;
	}

	public void method6754(float f, float f_90_, float f_91_, float f_92_, float f_93_, float f_94_, float f_95_,
			float f_96_, float f_97_) {
		aFloat4556 = f;
		aFloat4564 = f_92_;
		aFloat4559 = f_95_;
		aFloat4565 = 0.0F;
		aFloat4562 = f_90_;
		aFloat4560 = f_93_;
		aFloat4555 = f_96_;
		aFloat4566 = 0.0F;
		aFloat4558 = f_91_;
		aFloat4561 = f_94_;
		aFloat4557 = f_97_;
		aFloat4567 = 0.0F;
	}

	public void method6758(float f, float f_98_, float f_99_, float theta) {
		float cos = (float) Math.cos(theta);
		float sin = (float) Math.sin(theta);
		aFloat4556 = cos + f * f * (1.0F - cos);
		aFloat4562 = f_99_ * sin + f_98_ * f * (1.0F - cos);
		aFloat4558 = -f_98_ * sin + f_99_ * f * (1.0F - cos);
		aFloat4564 = -f_99_ * sin + f * f_98_ * (1.0F - cos);
		aFloat4560 = cos + f_98_ * f_98_ * (1.0F - cos);
		aFloat4561 = f * sin + f_99_ * f_98_ * (1.0F - cos);
		aFloat4559 = f_98_ * sin + f * f_99_ * (1.0F - cos);
		aFloat4555 = -f * sin + f_98_ * f_99_ * (1.0F - cos);
		aFloat4557 = cos + f_99_ * f_99_ * (1.0F - cos);
		aFloat4567 = 0.0F;
		aFloat4566 = 0.0F;
		aFloat4565 = 0.0F;
	}

	public void method6766(int i, int i_103_, int i_104_, float f, float f_105_, float f_106_) {
		if (i != 0) {
			float cos = Class370.COSINE[i & 0x3fff];
			float sin = Class370.SINE[i & 0x3fff];
			aFloat4557 = 1.0F;
			aFloat4555 = 0.0F;
			aFloat4559 = 0.0F;
			aFloat4561 = 0.0F;
			aFloat4558 = 0.0F;
			aFloat4556 = 2.0F * cos * i_103_;
			aFloat4560 = 2.0F * cos * i_104_;
			aFloat4562 = 2.0F * sin * i_103_;
			aFloat4564 = -2.0F * sin * i_104_;
			aFloat4565 = 2 * i_103_ * (0.5F * sin - 0.5F * cos) + f;
			aFloat4566 = 2 * i_104_ * (-0.5F * sin - 0.5F * cos) + f_105_;
			aFloat4567 = f_106_;
		} else {
			aFloat4555 = 0.0F;
			aFloat4559 = 0.0F;
			aFloat4561 = 0.0F;
			aFloat4564 = 0.0F;
			aFloat4558 = 0.0F;
			aFloat4562 = 0.0F;
			aFloat4556 = 2 * i_103_;
			aFloat4560 = 2 * i_104_;
			aFloat4557 = 1.0F;
			aFloat4565 = f - i_103_;
			aFloat4566 = f_105_ - i_104_;
			aFloat4567 = f_106_;
		}
	}

	public void method6785(float f, float f_109_, float f_110_, float[] fs) {
		f -= aFloat4565;
		f_109_ -= aFloat4566;
		f_110_ -= aFloat4567;
		fs[0] = (int) (aFloat4556 * f + aFloat4562 * f_109_ + aFloat4558 * f_110_);
		fs[1] = (int) (aFloat4564 * f + aFloat4560 * f_109_ + aFloat4561 * f_110_);
		fs[2] = (int) (aFloat4559 * f + aFloat4555 * f_109_ + aFloat4557 * f_110_);
	}

	public void method6793(float f, float f_111_, float f_112_, float[] fs) {
		fs[0] = aFloat4556 * f + aFloat4564 * f_111_ + aFloat4559 * f_112_ + aFloat4565;
		fs[1] = aFloat4562 * f + aFloat4560 * f_111_ + aFloat4555 * f_112_ + aFloat4566;
		fs[2] = aFloat4558 * f + aFloat4561 * f_111_ + aFloat4557 * f_112_ + aFloat4567;
	}

	@Override
	public String toString() {
		return new StringBuilder().append(aFloat4556).append(",").append(aFloat4564).append(",").append(aFloat4559)
				.append(",").append(aFloat4565).append(" - ").append(aFloat4562).append(",").append(aFloat4560)
				.append(",").append(aFloat4555).append(",").append(aFloat4566).append(" - ").append(aFloat4558)
				.append(",").append(aFloat4561).append(",").append(aFloat4557).append(",").append(aFloat4567)
				.toString();
	}

	void method6738(float f, float f_30_, float f_31_, float f_32_) {
		float f_33_ = f * f;
		float f_34_ = f * f_30_;
		float f_35_ = f * f_31_;
		float f_36_ = f * f_32_;
		float f_37_ = f_30_ * f_30_;
		float f_38_ = f_30_ * f_31_;
		float f_39_ = f_30_ * f_32_;
		float f_40_ = f_31_ * f_31_;
		float f_41_ = f_31_ * f_32_;
		aFloat4556 = 1.0F - 2.0F * (f_37_ + f_40_);
		aFloat4564 = 2.0F * (f_34_ - f_41_);
		aFloat4559 = 2.0F * (f_35_ + f_39_);
		aFloat4562 = 2.0F * (f_34_ + f_41_);
		aFloat4560 = 1.0F - 2.0F * (f_33_ + f_40_);
		aFloat4555 = 2.0F * (f_38_ - f_36_);
		aFloat4558 = 2.0F * (f_35_ - f_39_);
		aFloat4561 = 2.0F * (f_38_ + f_36_);
		aFloat4557 = 1.0F - 2.0F * (f_33_ + f_37_);
		aFloat4567 = 0.0F;
		aFloat4566 = 0.0F;
		aFloat4565 = 0.0F;
	}

}