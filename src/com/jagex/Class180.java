package com.jagex;

public class Class180 implements Interface23 {
	static int anInt2000;

	public static void method3544() {
		Class391.loadingStage = 0;
		Class391.preloadSize = 0;
	}

	public static byte[] method3548(String string) {
		int i_3_ = string.length();
		if (i_3_ == 0) {
			return new byte[0];
		}

		int i_4_ = 3 + i_3_ & ~0x3;
		int i_5_ = i_4_ / 4 * 3;
		if (i_4_ - 2 >= i_3_ || Class361.method6061(string.charAt(i_4_ - 2)) == -1) {
			i_5_ -= 2;
		} else if (i_4_ - 1 >= i_3_ || Class361.method6061(string.charAt(i_4_ - 1)) == -1) {
			i_5_--;
		}

		byte[] is = new byte[i_5_];
		Class608.method10291(string, is, 0);
		return is;
	}

	int anInt1998;
	boolean aBool1999;
	Class195 this$0;

	Class180(Class195 class195, Buffer buffer) {
		this$0 = class195;
		anInt1998 = buffer.readUShort() * 1773504799;
		aBool1999 = buffer.readUByte() == 1;
	}

	@Override
	public void method131(Class192 class192) {
		class192.method3783(anInt1998 * -809848097, aBool1999, -561914517);
		class192.method3806(-809848097 * anInt1998).method3888();
	}

}