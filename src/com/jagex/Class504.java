package com.jagex;

public class Class504 {
	static final int anInt6925 = 2;
	static final int anInt6926 = 3;
	static final int anInt6927 = 13;
	static final int anInt6928 = 14;
	static final int anInt6929 = 2;
	static final int anInt6930 = 4;
	static final int anInt6932 = 5;
	static final int anInt6933 = 6;
	static final int anInt6934 = 7;
	public static final int anInt6935 = 0;
	static final int anInt6936 = 9;
	static final int anInt6937 = 5;
	static final int anInt6938 = 11;
	static final int anInt6939 = 12;
	static final int anInt6942 = 15;
	static final int anInt6943 = 3;
	public static final int anInt6944 = 31;
	static final int anInt6945 = 16;
	static final int anInt6946 = 1;
	static final int anInt6949 = 10;
	static final int anInt6955 = 8;
	static final int anInt6956 = 4;

	static final void method8724() {
		for (Class477_Sub2 class477_sub2 = (Class477_Sub2) Client.aClass649_10734.method13443(); class477_sub2 != null; class477_sub2 = (Class477_Sub2) Client.aClass649_10734
				.method13443()) {
			Class477_Sub2.method6938(class477_sub2);
		}
		int i_29_ = 0;
		int i_30_ = 3;
		if (1 == Client.cutsceneStage * 2087248539) {
			for (int i_31_ = i_29_; i_31_ <= i_30_; i_31_++) {
				Client.method17161(i_31_);
			}
			Client.method17149();
		} else {
			Client.method16925();
			for (int i_32_ = i_29_; i_32_ <= i_30_; i_32_++) {
				Client.method16849();
				Client.method16850(i_32_);
				Client.method17161(i_32_);
			}
			Client.method17048();
			Client.method17149();
		}
	}

	boolean aBool6923;
	public PointLight light;
	int anInt6931 = -1405031211;
	short[] aShortArray6940;
	int anInt6941;
	boolean aBool6947;
	public int anInt6948;
	public int anInt6950;
	int anInt6951;
	int anInt6952;
	int anInt6953;
	int anInt6954;

	public Class504(Toolkit toolkit, int tileScale, Buffer buffer, int scale) {
		if (null == BaseVariableBitsDefinitionProvider.anIntArray3291) {
			IdleAnimationsPreference.method16558();
		}

		anInt6948 = buffer.readUByte() * -794313803;
		aBool6923 = 0 != (297507485 * anInt6948 & 0x8);
		aBool6947 = (anInt6948 * 297507485 & 0x10) != 0;
		anInt6948 = (297507485 * anInt6948 & 0x7) * -794313803;

		int x = buffer.readUShort() << scale;
		int z = buffer.readUShort() << scale;
		int y = buffer.readUShort() << scale;
		int range = buffer.readUByte();

		int i_10_ = 1 + range * 2;
		aShortArray6940 = new short[i_10_];

		for (int index = 0; index < aShortArray6940.length; index++) {
			int i_12_ = (short) buffer.readUShort();
			int i_13_ = i_12_ >>> 8;
			int i_14_ = i_12_ & 0xff;

			if (i_13_ >= i_10_) {
				i_13_ = i_10_ - 1;
			}

			if (i_14_ > i_10_ - i_13_) {
				i_14_ = i_10_ - i_13_;
			}

			aShortArray6940[index] = (short) (i_13_ << 8 | i_14_);
		}

		range = (1 << tileScale >> 1) + (range << tileScale);
		int colour = Class598.HSL_TABLE != null ? Class598.HSL_TABLE[buffer.readUShort()] : Class335.HSV_TABLE[HslUtils
				.hslToHsv(buffer.readUShort()) & 0xffff];
		int attributes = buffer.readUByte();
		anInt6950 = -554034781 * (attributes & 0x1f);
		anInt6953 = -1778472313 * ((attributes & 0xe0) << 3);

		if (31 != 1154867723 * anInt6950) {
			method8707();
		}

		anInt6931 = buffer.readShort() * 1405031211;
		setLight(toolkit, x, y, z, range, colour);
	}

	public void method8719(int i, int i_20_, int i_21_, int i_22_) {
		anInt6951 = i * 1641422405;
		anInt6941 = -1612504999 * i_22_;
		anInt6954 = 125856003 * i_21_;
		anInt6952 = i_20_ * -844667897;
	}

	void setLight(Toolkit toolkit, int x, int y, int z, int range, int colour) {
		light = toolkit.createPointLight(x, y, z, range, colour, 1.0F);
	}

	void method8707() {
		switch (1154867723 * anInt6950) {
			case 12:
				anInt6951 = -1012122486;
				anInt6941 = 0;
				anInt6954 = 55056384;
				anInt6952 = 991967232;
				break;
			case 8:
				anInt6951 = 629299919;
				anInt6941 = -1937677312;
				anInt6954 = 27528192;
				anInt6952 = 991967232;
				break;
			case 2:
				anInt6951 = 1641422405;
				anInt6941 = 0;
				anInt6954 = 55056384;
				anInt6952 = 991967232;
				break;
			case 6:
				anInt6951 = 629299919;
				anInt6941 = 1872870656;
				anInt6954 = -2126837504;
				anInt6952 = 991967232;
				break;
			case 14:
				anInt6951 = 1641422405;
				anInt6941 = 1872870656;
				anInt6954 = -2126837504;
				anInt6952 = 991967232;
				break;
			default:
				anInt6941 = 0;
				anInt6951 = 0;
				anInt6954 = 55056384;
				anInt6952 = 991967232;
				break;
			case 16:
				anInt6951 = 1641422405;
				anInt6941 = 904032000;
				anInt6954 = -2140601600;
				anInt6952 = -327098368;
				break;
			case 10:
				anInt6951 = 629299919;
				anInt6941 = 1388451328;
				anInt6954 = 13764096;
				anInt6952 = 991967232;
				break;
			case 15:
				anInt6951 = 1641422405;
				anInt6941 = 1388451328;
				anInt6954 = 13764096;
				anInt6952 = 1983934464;
				break;
			case 11:
				anInt6951 = 629299919;
				anInt6941 = 1388451328;
				anInt6954 = 13764096;
				anInt6952 = 1983934464;
				break;
			case 9:
				anInt6951 = 629299919;
				anInt6941 = -1937677312;
				anInt6954 = 27528192;
				anInt6952 = 1983934464;
				break;
			case 5:
				anInt6951 = -2024244972;
				anInt6941 = 0;
				anInt6954 = 55056384;
				anInt6952 = -327098368;
				break;
			case 4:
				anInt6951 = -2024244972;
				anInt6941 = 0;
				anInt6954 = 55056384;
				anInt6952 = 991967232;
				break;
			case 3:
				anInt6951 = 1641422405;
				anInt6941 = 0;
				anInt6954 = 55056384;
				anInt6952 = 1983934464;
				break;
			case 13:
				anInt6951 = -1012122486;
				anInt6941 = 0;
				anInt6954 = 55056384;
				anInt6952 = -327098368;
				break;
			case 7:
				anInt6951 = 629299919;
				anInt6941 = 1872870656;
				anInt6954 = -2126837504;
				anInt6952 = 1983934464;
		}
	}

	void method8713(int i, boolean bool) {
		int i_18_;
		if (!bool) {
			int i_19_ = anInt6953 * 351402807 + -1975334473 * anInt6952 * i / 50 & 0x7ff;
			switch (2027635853 * anInt6951) {
				default:
					i_18_ = 2048;
					break;
				case 3:
					i_18_ = BaseVariableBitsDefinitionProvider.anIntArray3291[i_19_] >> 1;
					break;
				case 2:
					i_18_ = i_19_;
					break;
				case 5:
					i_18_ = (i_19_ < 1024 ? i_19_ : 2048 - i_19_) << 1;
					break;
				case 4:
					i_18_ = i_19_ >> 10 << 11;
					break;
				case 1:
					i_18_ = (Class373.SINE[i_19_ << 3] >> 4) + 1024;
			}
		} else {
			i_18_ = 2048;
		}

		light.setIntensity(((i_18_ * anInt6954 * 756566443 >> 11) + anInt6941 * -404084759) / 2048.0F);
		light.method15988();
	}

}