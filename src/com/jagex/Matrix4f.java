package com.jagex;

import java.util.Arrays;

public final class Matrix4f {
	public static Matrix4f aClass399_4530 = new Matrix4f();
	public float[] array = new float[16];

	public Matrix4f() {
		toIdentity();
	}

	public Matrix4f(Matrix4f other) {
		copyFrom(other);
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Matrix4f)) {
			return false;
		}

		Matrix4f other = (Matrix4f) object;
		for (int index = 0; index < 16; index++) {
			if (array[index] != other.array[index]) {
				return false;
			}
		}

		return true;
	}

	@Override
	public int hashCode() {
		return 31 + Arrays.hashCode(array);
	}

	public void toIdentity() {
		array[0] = 1.0F;
		array[1] = 0.0F;
		array[2] = 0.0F;
		array[3] = 0.0F;
		array[4] = 0.0F;
		array[5] = 1.0F;
		array[6] = 0.0F;
		array[7] = 0.0F;
		array[8] = 0.0F;
		array[9] = 0.0F;
		array[10] = 1.0F;
		array[11] = 0.0F;
		array[12] = 0.0F;
		array[13] = 0.0F;
		array[14] = 0.0F;
		array[15] = 1.0F;
	}

	public void copyFrom(Matrix4f other) {
		System.arraycopy(other.array, 0, array, 0, 16);
	}

	public void method6545(Matrix4f other) {
		System.arraycopy(other.array, 0, array, 0, 11);
		array[3] = 0.0F;
		array[7] = 0.0F;
		array[11] = 0.0F;
		array[12] = 0.0F;
		array[13] = 0.0F;
		array[14] = 0.0F;
		array[15] = 1.0F;
	}

	public void method6546(Matrix4f class399_3_, Matrix4f class399_4_) {
		float f = class399_3_.array[0] * class399_4_.array[0] + class399_3_.array[1] * class399_4_.array[4]
				+ class399_3_.array[2] * class399_4_.array[8] + class399_3_.array[3] * class399_4_.array[12];
		float f_5_ = class399_3_.array[0] * class399_4_.array[1] + class399_3_.array[1] * class399_4_.array[5]
				+ class399_3_.array[2] * class399_4_.array[9] + class399_3_.array[3] * class399_4_.array[13];
		float f_6_ = class399_3_.array[0] * class399_4_.array[2] + class399_3_.array[1] * class399_4_.array[6]
				+ class399_3_.array[2] * class399_4_.array[10] + class399_3_.array[3] * class399_4_.array[14];
		float f_7_ = class399_3_.array[0] * class399_4_.array[3] + class399_3_.array[1] * class399_4_.array[7]
				+ class399_3_.array[2] * class399_4_.array[11] + class399_3_.array[3] * class399_4_.array[15];
		float f_8_ = class399_3_.array[4] * class399_4_.array[0] + class399_3_.array[5] * class399_4_.array[4]
				+ class399_3_.array[6] * class399_4_.array[8] + class399_3_.array[7] * class399_4_.array[12];
		float f_9_ = class399_3_.array[4] * class399_4_.array[1] + class399_3_.array[5] * class399_4_.array[5]
				+ class399_3_.array[6] * class399_4_.array[9] + class399_3_.array[7] * class399_4_.array[13];
		float f_10_ = class399_3_.array[4] * class399_4_.array[2] + class399_3_.array[5] * class399_4_.array[6]
				+ class399_3_.array[6] * class399_4_.array[10] + class399_3_.array[7] * class399_4_.array[14];
		float f_11_ = class399_3_.array[4] * class399_4_.array[3] + class399_3_.array[5] * class399_4_.array[7]
				+ class399_3_.array[6] * class399_4_.array[11] + class399_3_.array[7] * class399_4_.array[15];
		float f_12_ = class399_3_.array[8] * class399_4_.array[0] + class399_3_.array[9] * class399_4_.array[4]
				+ class399_3_.array[10] * class399_4_.array[8] + class399_3_.array[11] * class399_4_.array[12];
		float f_13_ = class399_3_.array[8] * class399_4_.array[1] + class399_3_.array[9] * class399_4_.array[5]
				+ class399_3_.array[10] * class399_4_.array[9] + class399_3_.array[11] * class399_4_.array[13];
		float f_14_ = class399_3_.array[8] * class399_4_.array[2] + class399_3_.array[9] * class399_4_.array[6]
				+ class399_3_.array[10] * class399_4_.array[10] + class399_3_.array[11] * class399_4_.array[14];
		float f_15_ = class399_3_.array[8] * class399_4_.array[3] + class399_3_.array[9] * class399_4_.array[7]
				+ class399_3_.array[10] * class399_4_.array[11] + class399_3_.array[11] * class399_4_.array[15];
		float f_16_ = class399_3_.array[12] * class399_4_.array[0] + class399_3_.array[13] * class399_4_.array[4]
				+ class399_3_.array[14] * class399_4_.array[8] + class399_3_.array[15] * class399_4_.array[12];
		float f_17_ = class399_3_.array[12] * class399_4_.array[1] + class399_3_.array[13] * class399_4_.array[5]
				+ class399_3_.array[14] * class399_4_.array[9] + class399_3_.array[15] * class399_4_.array[13];
		float f_18_ = class399_3_.array[12] * class399_4_.array[2] + class399_3_.array[13] * class399_4_.array[6]
				+ class399_3_.array[14] * class399_4_.array[10] + class399_3_.array[15] * class399_4_.array[14];
		float f_19_ = class399_3_.array[12] * class399_4_.array[3] + class399_3_.array[13] * class399_4_.array[7]
				+ class399_3_.array[14] * class399_4_.array[11] + class399_3_.array[15] * class399_4_.array[15];
		array[0] = f;
		array[1] = f_5_;
		array[2] = f_6_;
		array[3] = f_7_;
		array[4] = f_8_;
		array[5] = f_9_;
		array[6] = f_10_;
		array[7] = f_11_;
		array[8] = f_12_;
		array[9] = f_13_;
		array[10] = f_14_;
		array[11] = f_15_;
		array[12] = f_16_;
		array[13] = f_17_;
		array[14] = f_18_;
		array[15] = f_19_;
	}

	public void method6547(Matrix4f other) {
		float f = array[0] * other.array[0] + array[1] * other.array[4] + array[2] * other.array[8] + array[3]
				* other.array[12];
		float f_21_ = array[0] * other.array[1] + array[1] * other.array[5] + array[2] * other.array[9] + array[3]
				* other.array[13];
		float f_22_ = array[0] * other.array[2] + array[1] * other.array[6] + array[2] * other.array[10] + array[3]
				* other.array[14];
		float f_23_ = array[0] * other.array[3] + array[1] * other.array[7] + array[2] * other.array[11] + array[3]
				* other.array[15];
		float f_24_ = array[4] * other.array[0] + array[5] * other.array[4] + array[6] * other.array[8] + array[7]
				* other.array[12];
		float f_25_ = array[4] * other.array[1] + array[5] * other.array[5] + array[6] * other.array[9] + array[7]
				* other.array[13];
		float f_26_ = array[4] * other.array[2] + array[5] * other.array[6] + array[6] * other.array[10] + array[7]
				* other.array[14];
		float f_27_ = array[4] * other.array[3] + array[5] * other.array[7] + array[6] * other.array[11] + array[7]
				* other.array[15];
		float f_28_ = array[8] * other.array[0] + array[9] * other.array[4] + array[10] * other.array[8] + array[11]
				* other.array[12];
		float f_29_ = array[8] * other.array[1] + array[9] * other.array[5] + array[10] * other.array[9] + array[11]
				* other.array[13];
		float f_30_ = array[8] * other.array[2] + array[9] * other.array[6] + array[10] * other.array[10] + array[11]
				* other.array[14];
		float f_31_ = array[8] * other.array[3] + array[9] * other.array[7] + array[10] * other.array[11] + array[11]
				* other.array[15];
		float f_32_ = array[12] * other.array[0] + array[13] * other.array[4] + array[14] * other.array[8] + array[15]
				* other.array[12];
		float f_33_ = array[12] * other.array[1] + array[13] * other.array[5] + array[14] * other.array[9] + array[15]
				* other.array[13];
		float f_34_ = array[12] * other.array[2] + array[13] * other.array[6] + array[14] * other.array[10] + array[15]
				* other.array[14];
		float f_35_ = array[12] * other.array[3] + array[13] * other.array[7] + array[14] * other.array[11] + array[15]
				* other.array[15];
		array[0] = f;
		array[1] = f_21_;
		array[2] = f_22_;
		array[3] = f_23_;
		array[4] = f_24_;
		array[5] = f_25_;
		array[6] = f_26_;
		array[7] = f_27_;
		array[8] = f_28_;
		array[9] = f_29_;
		array[10] = f_30_;
		array[11] = f_31_;
		array[12] = f_32_;
		array[13] = f_33_;
		array[14] = f_34_;
		array[15] = f_35_;
	}

	public void method6548(Class405 class405) {
		array[0] = class405.aFloat4556;
		array[1] = class405.aFloat4562;
		array[2] = class405.aFloat4558;
		array[3] = 0.0F;
		array[4] = class405.aFloat4564;
		array[5] = class405.aFloat4560;
		array[6] = class405.aFloat4561;
		array[7] = 0.0F;
		array[8] = class405.aFloat4559;
		array[9] = class405.aFloat4555;
		array[10] = class405.aFloat4557;
		array[11] = 0.0F;
		array[12] = class405.aFloat4565;
		array[13] = class405.aFloat4566;
		array[14] = class405.aFloat4567;
		array[15] = 1.0F;
	}

	public float method6550() {
		return (array[14] - array[15]) / (array[11] - array[10]);
	}

	public void method6551(float f, float f_36_, float f_37_, float f_38_) {
		array[0] = f;
		array[1] = 0.0F;
		array[2] = 0.0F;
		array[3] = 0.0F;
		array[4] = 0.0F;
		array[5] = f_36_;
		array[6] = 0.0F;
		array[7] = 0.0F;
		array[8] = 0.0F;
		array[9] = 0.0F;
		array[10] = f_37_;
		array[11] = 0.0F;
		array[12] = 0.0F;
		array[13] = 0.0F;
		array[14] = 0.0F;
		array[15] = f_38_;
	}

	public void method6553(float f, float f_39_, float f_40_, float[] fs) {
		fs[0] = array[0] * f + array[4] * f_39_ + array[8] * f_40_ + array[12];
		fs[1] = array[1] * f + array[5] * f_39_ + array[9] * f_40_ + array[13];
		fs[2] = array[2] * f + array[6] * f_39_ + array[10] * f_40_ + array[14];
		if (fs.length > 3) {
			fs[3] = array[3] * f + array[7] * f_39_ + array[11] * f_40_ + array[15];
		}
	}

	public void method6554(float f, float f_41_, float f_42_, float[] fs) {
		fs[0] = array[0] * f + array[4] * f_41_ + array[8] * f_42_;
		fs[1] = array[1] * f + array[5] * f_41_ + array[9] * f_42_;
		fs[2] = array[2] * f + array[6] * f_41_ + array[10] * f_42_;
		if (fs.length > 3) {
			fs[3] = array[3] * f + array[7] * f_41_ + array[11] * f_42_;
		}
	}

	public void method6555(float f, float f_43_, float f_44_, float f_45_, float f_46_, float f_47_) {
		array[0] = 2.0F / (f_43_ - f);
		array[1] = 0.0F;
		array[2] = 0.0F;
		array[3] = 0.0F;
		array[4] = 0.0F;
		array[5] = 2.0F / (f_45_ - f_44_);
		array[6] = 0.0F;
		array[7] = 0.0F;
		array[8] = 0.0F;
		array[9] = 0.0F;
		array[10] = 2.0F / (f_47_ - f_46_);
		array[11] = 0.0F;
		array[12] = -(f_43_ + f) / (f_43_ - f);
		array[13] = -(f_45_ + f_44_) / (f_45_ - f_44_);
		array[14] = -(f_47_ + f_46_) / (f_47_ - f_46_);
		array[15] = 1.0F;
	}

	public void method6556(float f, float f_48_, float f_49_, float f_50_) {
		float f_51_ = (float) (Math.tan(f_49_ / 2.0F) * f);
		float f_52_ = (float) (Math.tan(f_50_ / 2.0F) * f);
		method6646(-f_51_, f_51_, -f_52_, f_52_, f, f_48_);
	}

	public void method6557(float f, float f_53_, float f_54_) {
		method6555(-10000.0F / f_54_, 10000.0F / f_54_, -10000.0F / f_54_, 10000.0F / f_54_, f, f_53_);
	}

	public void method6559(float f, float f_55_, float f_56_, float f_57_, float f_58_, float f_59_, float width,
			float height) {
		array[0] = f_56_ * 2.0F / width;
		array[1] = 0.0F;
		array[2] = 0.0F;
		array[3] = 0.0F;
		array[4] = 0.0F;
		array[5] = f_57_ * 2.0F / height;
		array[6] = 0.0F;
		array[7] = 0.0F;
		array[8] = 2.0F * f / width - 1.0F;
		array[9] = 2.0F * f_55_ / height - 1.0F;
		array[10] = (f_59_ + f_58_) / (f_59_ - f_58_);
		array[11] = 1.0F;
		array[12] = 0.0F;
		array[13] = 0.0F;
		array[14] = 2.0F * f_59_ * f_58_ / (f_58_ - f_59_);
		array[15] = 0.0F;
	}

	public void method6560(float f, float f_62_, float f_63_, float f_64_, float f_65_, float f_66_, float f_67_,
			float f_68_, float f_69_) {
		method6555(-(f * f_69_) / f_63_, f_69_ * (f_67_ - f) / f_63_, -(f_62_ * f_69_) / f_64_, f_69_ * (f_68_ - f_62_)
				/ f_64_, f_65_, f_66_);
	}

	public float[] method6563(float[] fs) {
		float f = array[3] + array[0];
		float f_70_ = array[7] + array[4];
		float f_71_ = array[11] + array[8];
		double distance = Math.sqrt(f * f + f_70_ * f_70_ + f_71_ * f_71_);
		fs[0] = (float) (f / distance);
		fs[1] = (float) (f_70_ / distance);
		fs[2] = (float) (f_71_ / distance);
		fs[3] = (float) ((array[15] + array[12]) / distance);
		return fs;
	}

	public float[] method6564(float[] fs) {
		float f = array[3] - array[0];
		float f_72_ = array[7] - array[4];
		float f_73_ = array[11] - array[8];
		double distance = Math.sqrt(f * f + f_72_ * f_72_ + f_73_ * f_73_);
		fs[0] = (float) (f / distance);
		fs[1] = (float) (f_72_ / distance);
		fs[2] = (float) (f_73_ / distance);
		fs[3] = (float) ((array[15] - array[12]) / distance);
		return fs;
	}

	public float[] method6566(float[] fs) {
		float f = array[3] - array[1];
		float f_74_ = array[7] - array[5];
		float f_75_ = array[11] - array[9];
		double distance = Math.sqrt(f * f + f_74_ * f_74_ + f_75_ * f_75_);
		fs[0] = (float) (f / distance);
		fs[1] = (float) (f_74_ / distance);
		fs[2] = (float) (f_75_ / distance);
		fs[3] = (float) ((array[15] - array[13]) / distance);
		return fs;
	}

	public float[] method6567(float[] fs) {
		float f = array[3] + array[2];
		float f_76_ = array[7] + array[6];
		float f_77_ = array[11] + array[10];
		double distance = Math.sqrt(f * f + f_76_ * f_76_ + f_77_ * f_77_);
		fs[0] = (float) (f / distance);
		fs[1] = (float) (f_76_ / distance);
		fs[2] = (float) (f_77_ / distance);
		fs[3] = (float) ((array[15] + array[14]) / distance);
		return fs;
	}

	public float[] method6568(float[] fs) {
		float f = array[3] - array[2];
		float f_78_ = array[7] - array[6];
		float f_79_ = array[11] - array[10];
		double distance = Math.sqrt(f * f + f_78_ * f_78_ + f_79_ * f_79_);
		fs[0] = (float) (f / distance);
		fs[1] = (float) (f_78_ / distance);
		fs[2] = (float) (f_79_ / distance);
		fs[3] = (float) ((array[15] - array[14]) / distance);
		return fs;
	}

	public void method6569() {
		float f = array[0];
		float f_80_ = array[4];
		float f_81_ = array[8];
		float f_82_ = array[12];
		float f_83_ = array[1];
		float f_84_ = array[5];
		float f_85_ = array[9];
		float f_86_ = array[13];
		float f_87_ = array[2];
		float f_88_ = array[6];
		float f_89_ = array[10];
		float f_90_ = array[14];
		float f_91_ = array[3];
		float f_92_ = array[7];
		float f_93_ = array[11];
		float f_94_ = array[15];
		array[0] = f;
		array[1] = f_80_;
		array[2] = f_81_;
		array[3] = f_82_;
		array[4] = f_83_;
		array[5] = f_84_;
		array[6] = f_85_;
		array[7] = f_86_;
		array[8] = f_87_;
		array[9] = f_88_;
		array[10] = f_89_;
		array[11] = f_90_;
		array[12] = f_91_;
		array[13] = f_92_;
		array[14] = f_93_;
		array[15] = f_94_;
	}

	public float[] method6570(float[] fs) {
		fs[0] = array[0];
		fs[1] = array[1];
		fs[2] = 0.0F;
		fs[3] = 0.0F;
		fs[4] = array[4];
		fs[5] = array[5];
		fs[6] = 0.0F;
		fs[7] = 0.0F;
		fs[8] = array[12];
		fs[9] = array[13];
		fs[10] = array[14];
		fs[11] = 0.0F;
		fs[12] = 0.0F;
		fs[13] = 0.0F;
		fs[14] = 0.0F;
		fs[15] = 1.0F;
		return fs;
	}

	public float[] method6571(float[] fs) {
		System.arraycopy(array, 0, fs, 0, 16);
		fs[3] = 0.0F;
		fs[7] = 0.0F;
		fs[11] = 0.0F;
		fs[12] = 0.0F;
		fs[13] = 0.0F;
		fs[14] = 0.0F;
		fs[15] = 1.0F;
		return fs;
	}

	public float[] method6573(float[] fs) {
		fs[0] = array[0];
		fs[1] = array[4];
		fs[2] = array[8];
		fs[3] = array[12];
		fs[4] = array[1];
		fs[5] = array[5];
		fs[6] = array[9];
		fs[7] = array[13];
		fs[8] = array[2];
		fs[9] = array[6];
		fs[10] = array[10];
		fs[11] = array[14];
		fs[12] = array[3];
		fs[13] = array[7];
		fs[14] = array[11];
		fs[15] = array[15];
		return fs;
	}

	public float[] method6575(float[] fs) {
		fs[0] = array[0];
		fs[1] = array[4];
		fs[2] = array[8];
		fs[3] = array[12];
		fs[4] = array[1];
		fs[5] = array[5];
		fs[6] = array[9];
		fs[7] = array[13];
		return fs;
	}

	public void method6577(int theta, int i_95_, int i_96_, float f, float f_97_, float f_98_) {
		if (theta != 0) {
			float f_99_ = Class370.COSINE[theta & 0x3fff];
			float f_100_ = Class370.SINE[theta & 0x3fff];

			array[0] = f_99_ * i_95_;
			array[5] = f_99_ * i_96_;
			array[1] = f_100_ * i_95_;
			array[4] = -f_100_ * i_96_;
			array[10] = 1.0F;

			float[] fs = array;
			float[] fs_101_ = array;
			float[] fs_102_ = array;

			array[9] = 0.0F;
			fs_102_[8] = 0.0F;
			fs_101_[6] = 0.0F;
			fs[2] = 0.0F;
		} else {
			array[0] = i_95_;
			array[5] = i_96_;
			array[10] = 1.0F;

			float[] fs = array;
			float[] fs_103_ = array;
			float[] fs_104_ = array;
			float[] fs_105_ = array;
			float[] fs_106_ = array;

			array[9] = 0.0F;
			fs_106_[8] = 0.0F;
			fs_105_[6] = 0.0F;
			fs_104_[4] = 0.0F;
			fs_103_[2] = 0.0F;
			fs[1] = 0.0F;
		}

		float[] fs = array;
		float[] fs_107_ = array;
		array[11] = 0.0F;
		fs_107_[7] = 0.0F;
		fs[3] = 0.0F;
		array[15] = 1.0F;
		array[12] = f;
		array[13] = f_97_;
		array[14] = f_98_;
	}

	public float[] method6598(float[] fs) {
		fs[0] = array[0];
		fs[1] = array[1];
		fs[2] = array[2];
		fs[3] = array[4];
		fs[4] = array[5];
		fs[5] = array[6];
		fs[6] = array[8];
		fs[7] = array[9];
		fs[8] = array[10];
		return fs;
	}

	public float method6602() {
		return -(array[15] + array[14]) / (array[11] + array[10]);
	}

	public void method6627(float[] fs) {
		float f = fs[0];
		float f_109_ = fs[1];
		float f_110_ = fs[2];
		fs[0] = array[0] * f + array[4] * f_109_ + array[8] * f_110_ + array[12];
		fs[1] = array[1] * f + array[5] * f_109_ + array[9] * f_110_ + array[13];
		fs[2] = array[2] * f + array[6] * f_109_ + array[10] * f_110_ + array[14];
	}

	public float[] method6632(float[] fs) {
		float f = array[3] + array[1];
		float f_111_ = array[7] + array[5];
		float f_112_ = array[11] + array[9];
		double distance = Math.sqrt(f * f + f_111_ * f_111_ + f_112_ * f_112_);
		fs[0] = (float) (f / distance);
		fs[1] = (float) (f_111_ / distance);
		fs[2] = (float) (f_112_ / distance);
		fs[3] = (float) ((array[15] + array[13]) / distance);
		return fs;
	}

	public boolean method6640() {
		return array[0] == 1.0F && array[1] == 0.0F && array[2] == 0.0F && array[3] == 0.0F && array[4] == 0.0F
				&& array[5] == 1.0F && array[6] == 0.0F && array[7] == 0.0F && array[8] == 0.0F && array[9] == 0.0F
				&& array[10] == 1.0F && array[11] == 0.0F && array[12] == 0.0F && array[13] == 0.0F
				&& array[14] == 0.0F && array[15] == 1.0F;
	}

	public void method6643() {
		float f = 1.0F / method6562();
		float f_113_ = (array[5] * array[10] * array[15] - array[5] * array[11] * array[14] - array[6] * array[9]
				* array[15] + array[6] * array[11] * array[13] + array[7] * array[9] * array[14] - array[7] * array[10]
				* array[13])
				* f;
		float f_114_ = (-array[1] * array[10] * array[15] + array[1] * array[11] * array[14] + array[2] * array[9]
				* array[15] - array[2] * array[11] * array[13] - array[3] * array[9] * array[14] + array[3] * array[10]
				* array[13])
				* f;
		float f_115_ = (array[1] * array[6] * array[15] - array[1] * array[7] * array[14] - array[2] * array[5]
				* array[15] + array[2] * array[7] * array[13] + array[3] * array[5] * array[14] - array[3] * array[6]
				* array[13])
				* f;
		float f_116_ = (-array[1] * array[6] * array[11] + array[1] * array[7] * array[10] + array[2] * array[5]
				* array[11] - array[2] * array[7] * array[9] - array[3] * array[5] * array[10] + array[3] * array[6]
				* array[9])
				* f;
		float f_117_ = (-array[4] * array[10] * array[15] + array[4] * array[11] * array[14] + array[6] * array[8]
				* array[15] - array[6] * array[11] * array[12] - array[7] * array[8] * array[14] + array[7] * array[10]
				* array[12])
				* f;
		float f_118_ = (array[0] * array[10] * array[15] - array[0] * array[11] * array[14] - array[2] * array[8]
				* array[15] + array[2] * array[11] * array[12] + array[3] * array[8] * array[14] - array[3] * array[10]
				* array[12])
				* f;
		float f_119_ = (-array[0] * array[6] * array[15] + array[0] * array[7] * array[14] + array[2] * array[4]
				* array[15] - array[2] * array[7] * array[12] - array[3] * array[4] * array[14] + array[3] * array[6]
				* array[12])
				* f;
		float f_120_ = (array[0] * array[6] * array[11] - array[0] * array[7] * array[10] - array[2] * array[4]
				* array[11] + array[2] * array[7] * array[8] + array[3] * array[4] * array[10] - array[3] * array[6]
				* array[8])
				* f;
		float f_121_ = (array[4] * array[9] * array[15] - array[4] * array[11] * array[13] - array[5] * array[8]
				* array[15] + array[5] * array[11] * array[12] + array[7] * array[8] * array[13] - array[7] * array[9]
				* array[12])
				* f;
		float f_122_ = (-array[0] * array[9] * array[15] + array[0] * array[11] * array[13] + array[1] * array[8]
				* array[15] - array[1] * array[11] * array[12] - array[3] * array[8] * array[13] + array[3] * array[9]
				* array[12])
				* f;
		float f_123_ = (array[0] * array[5] * array[15] - array[0] * array[7] * array[13] - array[1] * array[4]
				* array[15] + array[1] * array[7] * array[12] + array[3] * array[4] * array[13] - array[3] * array[5]
				* array[12])
				* f;
		float f_124_ = (-array[0] * array[5] * array[11] + array[0] * array[7] * array[9] + array[1] * array[4]
				* array[11] - array[1] * array[7] * array[8] - array[3] * array[4] * array[9] + array[3] * array[5]
				* array[8])
				* f;
		float f_125_ = (-array[4] * array[9] * array[14] + array[4] * array[10] * array[13] + array[5] * array[8]
				* array[14] - array[5] * array[10] * array[12] - array[6] * array[8] * array[13] + array[6] * array[9]
				* array[12])
				* f;
		float f_126_ = (array[0] * array[9] * array[14] - array[0] * array[10] * array[13] - array[1] * array[8]
				* array[14] + array[1] * array[10] * array[12] + array[2] * array[8] * array[13] - array[2] * array[9]
				* array[12])
				* f;
		float f_127_ = (-array[0] * array[5] * array[14] + array[0] * array[6] * array[13] + array[1] * array[4]
				* array[14] - array[1] * array[6] * array[12] - array[2] * array[4] * array[13] + array[2] * array[5]
				* array[12])
				* f;
		float f_128_ = (array[0] * array[5] * array[10] - array[0] * array[6] * array[9] - array[1] * array[4]
				* array[10] + array[1] * array[6] * array[8] + array[2] * array[4] * array[9] - array[2] * array[5]
				* array[8])
				* f;
		array[0] = f_113_;
		array[1] = f_114_;
		array[2] = f_115_;
		array[3] = f_116_;
		array[4] = f_117_;
		array[5] = f_118_;
		array[6] = f_119_;
		array[7] = f_120_;
		array[8] = f_121_;
		array[9] = f_122_;
		array[10] = f_123_;
		array[11] = f_124_;
		array[12] = f_125_;
		array[13] = f_126_;
		array[14] = f_127_;
		array[15] = f_128_;
	}

	public float[] copy(float[] copy) {
		System.arraycopy(array, 0, copy, 0, 16);
		return copy;
	}

	public float[] method6652(float[] fs) {
		fs[0] = array[0];
		fs[1] = array[1];
		fs[2] = array[4];
		fs[3] = array[5];
		fs[4] = array[8];
		fs[5] = array[9];
		fs[6] = array[12];
		fs[7] = array[13];
		return fs;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for (int n = 0; n < 4; n++) {
			for (int m = 0; m < 4; m++) {
				if (m > 0) {
					builder.append("\t");
				}

				builder.append(array[n * 4 + m]);
			}

			builder.append("\n");
		}

		return builder.toString();
	}

	float method6562() {
		return array[0] * array[5] * array[10] * array[15] - array[0] * array[5] * array[11] * array[14] - array[0]
				* array[6] * array[9] * array[15] + array[0] * array[6] * array[11] * array[13] + array[0] * array[7]
				* array[9] * array[14] - array[0] * array[7] * array[10] * array[13] - array[1] * array[4] * array[10]
				* array[15] + array[1] * array[4] * array[11] * array[14] + array[1] * array[6] * array[8] * array[15]
				- array[1] * array[6] * array[11] * array[12] - array[1] * array[7] * array[8] * array[14] + array[1]
				* array[7] * array[10] * array[12] + array[2] * array[4] * array[9] * array[15] - array[2] * array[4]
				* array[11] * array[13] - array[2] * array[5] * array[8] * array[15] + array[2] * array[5] * array[11]
				* array[12] + array[2] * array[7] * array[8] * array[13] - array[2] * array[7] * array[9] * array[12]
				- array[3] * array[4] * array[9] * array[14] + array[3] * array[4] * array[10] * array[13] + array[3]
				* array[5] * array[8] * array[14] - array[3] * array[5] * array[10] * array[12] - array[3] * array[6]
				* array[8] * array[13] + array[3] * array[6] * array[9] * array[12];
	}

	void method6646(float f, float f_130_, float f_131_, float f_132_, float f_133_, float f_134_) {
		array[0] = 2.0F * f_133_ / (f_130_ - f);
		array[1] = 0.0F;
		array[2] = 0.0F;
		array[3] = 0.0F;
		array[4] = 0.0F;
		array[5] = 2.0F * f_133_ / (f_132_ - f_131_);
		array[6] = 0.0F;
		array[7] = 0.0F;
		array[8] = (f_130_ + f) / (f_130_ - f);
		array[9] = (f_132_ + f_131_) / (f_132_ - f_131_);
		array[10] = (f_134_ + f_133_) / (f_134_ - f_133_);
		array[11] = 1.0F;
		array[12] = 0.0F;
		array[13] = 0.0F;
		array[14] = -(2.0F * f_134_ * f_133_) / (f_134_ - f_133_);
		array[15] = 0.0F;
	}

}