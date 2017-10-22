package com.jagex;

public class Class664 {
	static long[] aLongArray8377;
	static final int anInt8378 = 10;
	static final String aString8379 = "\u1823\uc6e8\u87b8\u014f\u36a6\ud2f5\u796f\u9152\u60bc\u9b8e\ua30c\u7b35\u1de0\ud7c2\u2e4b\ufe57\u1577\u37e5\u9ff0\u4ada\u58c9\u290a\ub1a0\u6b85\ubd5d\u10f4\ucb3e\u0567\ue427\u418b\ua77d\u95d8\ufbee\u7c66\udd17\u479e\uca2d\ubf07\uad5a\u8333\u6302\uaa71\uc819\u49d9\uf2e3\u5b88\u9a26\u32b0\ue90f\ud580\ubecd\u3448\uff7a\u905f\u2068\u1aae\ub454\u9322\u64f1\u7312\u4008\uc3ec\udba1\u8d3d\u9700\ucf2b\u7682\ud61b\ub5af\u6a50\u45f3\u30ef\u3f55\ua2ea\u65ba\u2fc0\ude1c\ufd4d\u9275\u068a\ub2e6\u0e1f\u62d4\ua896\uf9c5\u2559\u8472\u394c\u5e78\u388c\ud1a5\ue261\ub321\u9c1e\u43c7\ufc04\u5199\u6d0d\ufadf\u7e24\u3bab\uce11\u8f4e\ub7eb\u3c81\u94f7\ub913\u2cd3\ue76e\uc403\u5644\u7fa9\u2abb\uc153\udc0b\u9d6c\u3174\uf646\uac89\u14e1\u163a\u6909\u70b6\ud0ed\ucc42\u98a4\u285c\uf886";
	static long[][] aLongArrayArray8380 = new long[8][256];
	public static final int anInt8381 = 64;
	static final int anInt8382 = 512;
	public static int lastLoginDate;
	static {
		aLongArray8377 = new long[11];
		for (int i = 0; i < 256; i++) {
			int i_5_ = "\u1823\uc6e8\u87b8\u014f\u36a6\ud2f5\u796f\u9152\u60bc\u9b8e\ua30c\u7b35\u1de0\ud7c2\u2e4b\ufe57\u1577\u37e5\u9ff0\u4ada\u58c9\u290a\ub1a0\u6b85\ubd5d\u10f4\ucb3e\u0567\ue427\u418b\ua77d\u95d8\ufbee\u7c66\udd17\u479e\uca2d\ubf07\uad5a\u8333\u6302\uaa71\uc819\u49d9\uf2e3\u5b88\u9a26\u32b0\ue90f\ud580\ubecd\u3448\uff7a\u905f\u2068\u1aae\ub454\u9322\u64f1\u7312\u4008\uc3ec\udba1\u8d3d\u9700\ucf2b\u7682\ud61b\ub5af\u6a50\u45f3\u30ef\u3f55\ua2ea\u65ba\u2fc0\ude1c\ufd4d\u9275\u068a\ub2e6\u0e1f\u62d4\ua896\uf9c5\u2559\u8472\u394c\u5e78\u388c\ud1a5\ue261\ub321\u9c1e\u43c7\ufc04\u5199\u6d0d\ufadf\u7e24\u3bab\uce11\u8f4e\ub7eb\u3c81\u94f7\ub913\u2cd3\ue76e\uc403\u5644\u7fa9\u2abb\uc153\udc0b\u9d6c\u3174\uf646\uac89\u14e1\u163a\u6909\u70b6\ud0ed\ucc42\u98a4\u285c\uf886"
					.charAt(i / 2);
			long l = 0 == (i & 0x1) ? (long) (i_5_ >>> 8) : (long) (i_5_ & 0xff);
			long l_6_ = l << 1;
			if (l_6_ >= 256L) {
				l_6_ ^= 0x11dL;
			}
			long l_7_ = l_6_ << 1;
			if (l_7_ >= 256L) {
				l_7_ ^= 0x11dL;
			}
			long l_8_ = l_7_ ^ l;
			long l_9_ = l_7_ << 1;
			if (l_9_ >= 256L) {
				l_9_ ^= 0x11dL;
			}
			long l_10_ = l_9_ ^ l;
			aLongArrayArray8380[0][i] = l << 56 | l << 48 | l_7_ << 40 | l << 32 | l_9_ << 24 | l_8_ << 16 | l_6_ << 8
					| l_10_;
			for (int i_11_ = 1; i_11_ < 8; i_11_++) {
				aLongArrayArray8380[i_11_][i] = aLongArrayArray8380[i_11_ - 1][i] >>> 8
						| aLongArrayArray8380[i_11_ - 1][i] << 56;
			}
		}
		aLongArray8377[0] = 0L;
		for (int i = 1; i <= 10; i++) {
			int i_12_ = (i - 1) * 8;
			aLongArray8377[i] = aLongArrayArray8380[0][i_12_] & ~0xffffffffffffffL ^ aLongArrayArray8380[1][i_12_ + 1]
					& 0xff000000000000L ^ aLongArrayArray8380[2][i_12_ + 2] & 0xff0000000000L
					^ aLongArrayArray8380[3][i_12_ + 3] & 0xff00000000L ^ aLongArrayArray8380[4][4 + i_12_]
					& 0xff000000L ^ aLongArrayArray8380[5][5 + i_12_] & 0xff0000L ^ aLongArrayArray8380[6][6 + i_12_]
					& 0xff00L ^ aLongArrayArray8380[7][i_12_ + 7] & 0xffL;
		}
	}

	long[] aLongArray8376;
	byte[] aByteArray8383 = new byte[32];
	int anInt8384;
	int anInt8385;
	long[] aLongArray8386;
	long[] aLongArray8387;
	long[] aLongArray8388;
	byte[] aByteArray8389 = new byte[64];
	long[] aLongArray8390;

	Class664() {
		aLongArray8386 = new long[8];
		aLongArray8387 = new long[8];
		aLongArray8388 = new long[8];
		aLongArray8376 = new long[8];
		aLongArray8390 = new long[8];
	}

	void method13703(byte[] is, int i, short i_0_) {
		aByteArray8389[159925113 * anInt8385] |= 128 >>> (-1407852437 * anInt8384 & 0x7);
		anInt8385 += -1633438007;
		if (159925113 * anInt8385 > 32) {
			while (159925113 * anInt8385 < 64) {
				aByteArray8389[(anInt8385 += -1633438007) * 159925113 - 1] = (byte) 0;
			}
			method13709(-182301169);
			anInt8385 = 0;
		}
		while (anInt8385 * 159925113 < 32) {
			aByteArray8389[(anInt8385 += -1633438007) * 159925113 - 1] = (byte) 0;
		}
		System.arraycopy(aByteArray8383, 0, aByteArray8389, 32, 32);
		method13709(-129289747);
		int i_1_ = 0;
		int i_2_ = i;
		while (i_1_ < 8) {
			long l = aLongArray8386[i_1_];
			is[i_2_] = (byte) (int) (l >>> 56);
			is[i_2_ + 1] = (byte) (int) (l >>> 48);
			is[2 + i_2_] = (byte) (int) (l >>> 40);
			is[3 + i_2_] = (byte) (int) (l >>> 32);
			is[4 + i_2_] = (byte) (int) (l >>> 24);
			is[5 + i_2_] = (byte) (int) (l >>> 16);
			is[i_2_ + 6] = (byte) (int) (l >>> 8);
			is[i_2_ + 7] = (byte) (int) l;
			i_1_++;
			i_2_ += 8;
		}
	}

	void method13704(int i) {
		for (int i_3_ = 0; i_3_ < 32; i_3_++) {
			aByteArray8383[i_3_] = (byte) 0;
		}
		anInt8385 = 0;
		anInt8384 = 0;
		aByteArray8389[0] = (byte) 0;
		for (int i_4_ = 0; i_4_ < 8; i_4_++) {
			aLongArray8386[i_4_] = 0L;
		}
	}

	void method13709(int i) {
		int i_13_ = 0;
		int i_14_ = 0;
		while (i_13_ < 8) {
			aLongArray8376[i_13_] = (long) aByteArray8389[i_14_] << 56 ^ (aByteArray8389[1 + i_14_] & 0xffL) << 48
					^ (aByteArray8389[i_14_ + 2] & 0xffL) << 40 ^ (aByteArray8389[i_14_ + 3] & 0xffL) << 32
					^ (aByteArray8389[i_14_ + 4] & 0xffL) << 24 ^ (aByteArray8389[i_14_ + 5] & 0xffL) << 16
					^ (aByteArray8389[6 + i_14_] & 0xffL) << 8 ^ aByteArray8389[i_14_ + 7] & 0xffL;
			i_13_++;
			i_14_ += 8;
		}
		for (i_13_ = 0; i_13_ < 8; i_13_++) {
			aLongArray8390[i_13_] = aLongArray8376[i_13_] ^ (aLongArray8387[i_13_] = aLongArray8386[i_13_]);
		}
		for (i_13_ = 1; i_13_ <= 10; i_13_++) {
			for (i_14_ = 0; i_14_ < 8; i_14_++) {
				aLongArray8388[i_14_] = 0L;
				int i_15_ = 0;
				int i_16_ = 56;
				while (i_15_ < 8) {
					aLongArray8388[i_14_] ^= aLongArrayArray8380[i_15_][(int) (aLongArray8387[i_14_ - i_15_ & 0x7] >>> i_16_) & 0xff];
					i_15_++;
					i_16_ -= 8;
				}
			}
			for (i_14_ = 0; i_14_ < 8; i_14_++) {
				aLongArray8387[i_14_] = aLongArray8388[i_14_];
			}
			aLongArray8387[0] ^= aLongArray8377[i_13_];
			for (i_14_ = 0; i_14_ < 8; i_14_++) {
				aLongArray8388[i_14_] = aLongArray8387[i_14_];
				int i_17_ = 0;
				int i_18_ = 56;
				while (i_17_ < 8) {
					aLongArray8388[i_14_] ^= aLongArrayArray8380[i_17_][(int) (aLongArray8390[i_14_ - i_17_ & 0x7] >>> i_18_) & 0xff];
					i_17_++;
					i_18_ -= 8;
				}
			}
			for (i_14_ = 0; i_14_ < 8; i_14_++) {
				aLongArray8390[i_14_] = aLongArray8388[i_14_];
			}
		}
		for (i_13_ = 0; i_13_ < 8; i_13_++) {
			aLongArray8386[i_13_] ^= aLongArray8390[i_13_] ^ aLongArray8376[i_13_];
		}
	}

	void method13710(byte[] is, long l) {
		int i = 0;
		int i_19_ = 8 - ((int) l & 0x7) & 0x7;
		int i_20_ = anInt8384 * -1407852437 & 0x7;
		long l_21_ = l;
		int i_22_ = 31;
		int i_23_ = 0;
		for (; i_22_ >= 0; i_22_--) {
			i_23_ += ((int) l_21_ & 0xff) + (aByteArray8383[i_22_] & 0xff);
			aByteArray8383[i_22_] = (byte) i_23_;
			i_23_ >>>= 8;
			l_21_ >>>= 8;
		}
		while (l > 8L) {
			int i_24_ = is[i] << i_19_ & 0xff | (is[i + 1] & 0xff) >>> 8 - i_19_;
			if (i_24_ < 0 || i_24_ >= 256) {
				throw new RuntimeException();
			}
			aByteArray8389[159925113 * anInt8385] |= i_24_ >>> i_20_;
			anInt8385 += -1633438007;
			anInt8384 += (8 - i_20_) * 2123615299;
			if (512 == anInt8384 * -1407852437) {
				method13709(1973601565);
				anInt8385 = 0;
				anInt8384 = 0;
			}
			aByteArray8389[anInt8385 * 159925113] = (byte) (i_24_ << 8 - i_20_ & 0xff);
			anInt8384 += 2123615299 * i_20_;
			l -= 8L;
			i++;
		}
		int i_25_;
		if (l > 0L) {
			i_25_ = is[i] << i_19_ & 0xff;
			aByteArray8389[159925113 * anInt8385] |= i_25_ >>> i_20_;
		} else {
			i_25_ = 0;
		}
		if (i_20_ + l < 8L) {
			anInt8384 += 2123615299L * l;
		} else {
			anInt8385 += -1633438007;
			anInt8384 += (8 - i_20_) * 2123615299;
			l -= 8 - i_20_;
			if (512 == -1407852437 * anInt8384) {
				method13709(-57354274);
				anInt8385 = 0;
				anInt8384 = 0;
			}
			aByteArray8389[159925113 * anInt8385] = (byte) (i_25_ << 8 - i_20_ & 0xff);
			anInt8384 += (int) l * 2123615299;
		}
	}
}
