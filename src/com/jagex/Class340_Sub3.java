package com.jagex;

public class Class340_Sub3 extends Class340 {
	public static Archive frameBases;

	public static int method15403(CharSequence charsequence, int i) {
		int i_25_ = charsequence.length();
		int i_26_ = 0;
		for (int i_27_ = 0; i_27_ < i_25_; i_27_++) {
			char c = charsequence.charAt(i_27_);
			if (c <= '\u007f') {
				i_26_++;
			} else if (c <= '\u07ff') {
				i_26_ += 2;
			} else {
				i_26_ += 3;
			}
		}
		return i_26_;
	}

	public int anInt9920;
	public int anInt9921;

	Class340_Sub3(Class349 class349, Class334 class334, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_,
			int i_5_, int i_6_, int i_7_) {
		super(class349, class334, i, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_);
		anInt9920 = -997504365 * i_6_;
		anInt9921 = i_7_ * 167219407;
	}

	@Override
	public Class360 method316() {
		return Class360.aClass360_3883;
	}

	public static Class340 decode(Buffer buffer) {
		Class340 class340 = Class458.method7543(buffer, 422772804);
		int i_2_ = buffer.readInt();
		int i_3_ = buffer.readInt();
		return new Class340_Sub3(class340.aClass349_3630, class340.aClass334_3635, -1014966953 * class340.anInt3631,
				458356303 * class340.anInt3629, class340.anInt3633 * 883415057, -1664223293 * class340.anInt3634,
				149441097 * class340.anInt3632, -998046321 * class340.anInt3636, -1918746481 * class340.anInt3637,
				i_2_, i_3_);
	}

}