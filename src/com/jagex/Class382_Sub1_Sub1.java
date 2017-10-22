package com.jagex;

public class Class382_Sub1_Sub1 extends Class382_Sub1 {
	byte[] aByteArray11105;

	Class382_Sub1_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@Override
	void method15338(int i, byte i_0_) {
		int i_1_ = i * 2;
		i_0_ = (byte) (127 + ((i_0_ & 0xff) >> 1));
		aByteArray11105[i_1_++] = i_0_;
		aByteArray11105[i_1_] = i_0_;
	}

	byte[] method17490(int i, int i_2_, int i_3_) {
		aByteArray11105 = new byte[i * i_2_ * i_3_ * 2];
		method6251(i, i_2_, i_3_);
		return aByteArray11105;
	}
}
