package com.jagex;

import java.util.Random;

public class Class12 {
	static final int anInt271 = 12;
	public static int[] anIntArray272;
	static int anInt273;
	public static int[] anIntArray274;
	public static int anInt275;
	static Class424 aClass424_276 = new Class424(16, Class434.aClass434_4920);

	public static void method656(int i, int i_0_) {
		if (i != -1019869547 * anInt275) {
			anIntArray274 = new int[i];
			for (int i_2_ = 0; i_2_ < i; i_2_++) {
				anIntArray274[i_2_] = (i_2_ << 12) / i;
			}
			anInt275 = -1219259203 * i;
		}
		if (i_0_ != anInt273 * -553637429) {
			if (i_0_ != anInt275 * -1019869547) {
				anIntArray272 = new int[i_0_];
				for (int i_3_ = 0; i_3_ < i_0_; i_3_++) {
					anIntArray272[i_3_] = (i_3_ << 12) / i_0_;
				}
			} else {
				anIntArray272 = anIntArray274;
			}
			anInt273 = i_0_ * -1532578845;
		}
	}

	public static byte[] method657(int seed, int i_4_) {
		byte[] is = (byte[]) aClass424_276.get(Integer.valueOf(seed));
		if (is == null) {
			is = new byte[512];
			Random random = new Random(seed);
			for (int i_5_ = 0; i_5_ < 255; i_5_++) {
				is[i_5_] = (byte) i_5_;
			}
			for (int i_6_ = 0; i_6_ < 255; i_6_++) {
				int i_7_ = 255 - i_6_;
				int i_8_ = Class36.method991(random, i_7_);
				byte i_9_ = is[i_8_];
				is[i_8_] = is[i_7_];
				is[i_7_] = is[511 - i_6_] = i_9_;
			}
			aClass424_276.put(Integer.valueOf(seed), is);
		}
		return is;
	}

	Class12() throws Throwable {
		throw new Error();
	}
}
