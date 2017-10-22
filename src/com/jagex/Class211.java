package com.jagex;

public class Class211 {
	public int[] anIntArray2179;
	public int anInt2180;
	public int[] anIntArray2181;
	public int anInt2182;
	public ClippingMask aClass129_2183;
	int anInt2184;

	Class211(int i, int i_3_, int[] is, int[] is_4_, ClippingMask class129, int i_5_) {
		anInt2182 = 408806399 * i;
		anInt2180 = -609395889 * i_3_;
		anIntArray2179 = is;
		anIntArray2181 = is_4_;
		aClass129_2183 = class129;
		anInt2184 = -1964493963 * i_5_;
	}

	public boolean method4012(int i, int i_0_, int i_1_) {
		if (i_0_ >= 0 && i_0_ < anIntArray2181.length) {
			int i_2_ = anIntArray2181[i_0_];
			if (i >= i_2_ && i <= i_2_ + anIntArray2179[i_0_]) {
				return true;
			}
		}
		return false;
	}

}