package com.jagex;

public class Class367 implements Interface43 {
	static Class578[] aClass578Array4049;

	public static int method6096(int i, int parameter, boolean bool, boolean bool_21_, int i_22_) {
		Class480_Sub1 class480_sub1 = Class606.method10252(i, bool_21_);
		if (class480_sub1 == null) {
			return 0;
		}
		int i_23_ = 0;
		for (int index = 0; index < class480_sub1.anIntArray9964.length; index++) {
			if (class480_sub1.anIntArray9964[index] >= 0
					&& class480_sub1.anIntArray9964[index] < ItemDefinition.loader.definitionCount * -522945077) {
				ItemDefinition definition = ItemDefinition.loader.get(class480_sub1.anIntArray9964[index]);
				int i_25_ = definition.getOrDefault(parameter, ParameterDefinition.loader.get(parameter).defaultInt
						* -125275839);
				if (bool) {
					i_23_ += class480_sub1.anIntArray9965[index] * i_25_;
				} else {
					i_23_ += i_25_;
				}
			}
		}
		return i_23_;
	}

	static void method6092() {
		Class56.aClass480_Sub31_Sub17_615 = new MenuOption(TranslatableString.CANCEL.translate(Client.currentLanguage),
				"", Client.anInt10782 * -1573005291, 1006, -1, 0L, 0, 0, true, false, 0L, true);
	}

	static void method6093() {
		if (Class598.HSL_TABLE == null) {
			Class598.HSL_TABLE = new int[65536];
			EnvironmentContext.anIntArray8169 = new int[65536];
			double d = 0.7 + (Math.random() * 0.03 - 0.015);
			for (int i_2_ = 0; i_2_ < 65536; i_2_++) {
				double d_3_ = (i_2_ >> 10 & 0x3f) / 64.0 + 0.0078125;
				double d_4_ = (i_2_ >> 7 & 0x7) / 8.0 + 0.0625;
				double d_5_ = (i_2_ & 0x7f) / 128.0;
				double d_6_ = d_5_;
				double d_7_ = d_5_;
				double d_8_ = d_5_;
				if (0.0 != d_4_) {
					double d_9_;
					if (d_5_ < 0.5) {
						d_9_ = d_5_ * (d_4_ + 1.0);
					} else {
						d_9_ = d_5_ + d_4_ - d_5_ * d_4_;
					}
					double d_10_ = d_5_ * 2.0 - d_9_;
					double d_11_ = 0.3333333333333333 + d_3_;
					if (d_11_ > 1.0) {
						d_11_--;
					}
					double d_12_ = d_3_;
					double d_13_ = d_3_ - 0.3333333333333333;
					if (d_13_ < 0.0) {
						d_13_++;
					}
					if (d_11_ * 6.0 < 1.0) {
						d_6_ = 6.0 * (d_9_ - d_10_) * d_11_ + d_10_;
					} else if (2.0 * d_11_ < 1.0) {
						d_6_ = d_9_;
					} else if (d_11_ * 3.0 < 2.0) {
						d_6_ = d_10_ + (d_9_ - d_10_) * (0.6666666666666666 - d_11_) * 6.0;
					} else {
						d_6_ = d_10_;
					}
					if (6.0 * d_12_ < 1.0) {
						d_7_ = d_10_ + d_12_ * (6.0 * (d_9_ - d_10_));
					} else if (d_12_ * 2.0 < 1.0) {
						d_7_ = d_9_;
					} else if (3.0 * d_12_ < 2.0) {
						d_7_ = d_10_ + 6.0 * ((d_9_ - d_10_) * (0.6666666666666666 - d_12_));
					} else {
						d_7_ = d_10_;
					}
					if (6.0 * d_13_ < 1.0) {
						d_8_ = d_13_ * ((d_9_ - d_10_) * 6.0) + d_10_;
					} else if (d_13_ * 2.0 < 1.0) {
						d_8_ = d_9_;
					} else if (3.0 * d_13_ < 2.0) {
						d_8_ = d_10_ + (0.6666666666666666 - d_13_) * (d_9_ - d_10_) * 6.0;
					} else {
						d_8_ = d_10_;
					}
				}
				d_6_ = Math.pow(d_6_, d);
				d_7_ = Math.pow(d_7_, d);
				d_8_ = Math.pow(d_8_, d);
				int i_14_ = (int) (d_6_ * 256.0);
				int i_15_ = (int) (d_7_ * 256.0);
				int i_16_ = (int) (d_8_ * 256.0);
				int i_17_ = i_16_ + (i_14_ << 16) + (i_15_ << 8);
				Class598.HSL_TABLE[i_2_] = i_17_ & 0xffffff;
				int i_18_ = (i_15_ << 8) + (i_16_ << 16) + i_14_;
				EnvironmentContext.anIntArray8169[i_2_] = i_18_;
			}
		}
	}

	public int image;
	public Class349 aClass349_4045;
	public Class334 aClass334_4046;
	public int anInt4047;
	public int anInt4048;

	Class367(int i, Class349 class349, Class334 class334, int i_0_, int i_1_) {
		image = 1496133463 * i;
		aClass349_4045 = class349;
		aClass334_4046 = class334;
		anInt4047 = i_0_ * -1611744737;
		anInt4048 = i_1_ * -2017224891;
	}

	@Override
	public Class360 method316() {
		return Class360.aClass360_3882;
	}

	public static Class367 decode(Buffer buffer) {
		int i_2_ = buffer.readSmart32();
		Class349 class349 = Class349.values()[buffer.readUByte()];
		Class334 class334 = Class334.values()[buffer.readUByte()];
		int i_3_ = buffer.readShort();
		int i_4_ = buffer.readShort();
		return new Class367(i_2_, class349, class334, i_3_, i_4_);
	}

}