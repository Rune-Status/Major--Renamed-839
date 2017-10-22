package com.jagex;

public class Class509 {
	public static final int anInt6981 = 1;
	public static final int anInt6982 = 4;
	public static final int anInt6984 = 16;
	public static final int anInt6986 = 2;
	public static final int anInt6987 = 8;
	public static Class374 aClass374_6997;

	public static void method8776(boolean bool) {
		if (Class533.aBool7287 != bool) {
			Class150.method3186();
			Class533.aBool7287 = bool;
		}
	}

	public static int method8779(CharSequence charsequence, CharSequence charsequence_15_, int i) {
		int i_16_ = charsequence.length();
		int i_17_ = charsequence_15_.length();
		if (i_16_ == 0) {
			return i_17_;
		}
		if (0 == i_17_) {
			return i_16_;
		}
		int[] is = new int[1 + i_16_];
		int[] is_18_ = new int[1 + i_16_];
		for (int i_19_ = 0; i_19_ <= i_16_; i_19_++) {
			is[i_19_] = i_19_;
		}
		for (int i_20_ = 1; i_20_ <= i_17_; i_20_++) {
			is_18_[0] = i_20_;
			char c = charsequence_15_.charAt(i_20_ - 1);
			for (int i_21_ = 1; i_21_ <= i_16_; i_21_++) {
				is_18_[i_21_] = Math.min(Math.min(1 + is_18_[i_21_ - 1], is[i_21_] + 1),
						is[i_21_ - 1] + (charsequence.charAt(i_21_ - 1) == c ? 0 : 1));
			}
			int[] is_22_ = is;
			is = is_18_;
			is_18_ = is_22_;
		}
		return is[i_16_];
	}

	byte aByte6980;
	int[] anIntArray6983;
	short aShort6985;
	short aShort6988;
	short aShort6989;
	short aShort6990;
	int[] anIntArray6991;

	int[] anIntArray6992;

	short[] aShortArray6993;

	byte aByte6994;

	short[] aShortArray6995;

	short[] aShortArray6996;

	Class509(Class490 class490, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_,
			int i_8_, int i_9_, int i_10_, int i_11_, int i_12_) {
		aByte6994 = (byte) i;
		aByte6980 = (byte) i_0_;
		anIntArray6991 = new int[4];
		anIntArray6992 = new int[4];
		anIntArray6983 = new int[4];
		anIntArray6991[0] = i_1_;
		anIntArray6991[1] = i_2_;
		anIntArray6991[2] = i_3_;
		anIntArray6991[3] = i_4_;
		anIntArray6992[0] = i_5_;
		anIntArray6992[1] = i_6_;
		anIntArray6992[2] = i_7_;
		anIntArray6992[3] = i_8_;
		anIntArray6983[0] = i_9_;
		anIntArray6983[1] = i_10_;
		anIntArray6983[2] = i_11_;
		anIntArray6983[3] = i_12_;
		aShort6985 = (short) (i_1_ >> class490.tileScale * -1911343043);
		aShort6988 = (short) (i_3_ >> class490.tileScale * -1911343043);
		aShort6989 = (short) (i_9_ >> class490.tileScale * -1911343043);
		aShort6990 = (short) (i_11_ >> class490.tileScale * -1911343043);
		aShortArray6995 = new short[4];
		aShortArray6993 = new short[4];
		aShortArray6996 = new short[4];
	}

}