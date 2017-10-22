package com.jagex;

public final class Class480_Sub16 extends Linkable {
	static Class480_Sub16 aClass480_Sub16_10092 = new Class480_Sub16(0, -1);
	public static final int anInt10093 = 1;
	public static final int anInt10094 = 4;
	public static final int anInt10095 = 8;
	public static final int anInt10096 = 16;
	public static final int anInt10097 = 32;
	public static final int anInt10098 = 64;
	public static final int anInt10099 = 2;

	public int anInt10100;

	public int anInt10101;

	public Class480_Sub16(int i, int i_1_) {
		anInt10100 = -565559705 * i;
		anInt10101 = i_1_ * 1284440215;
	}

	public final boolean method15630(int i) {
		return 0 != (anInt10100 * -528482985 >> 23 & 0x1);
	}

	public final boolean method15631(short i) {
		return (-528482985 * anInt10100 & 0x1) != 0;
	}

	public final boolean method15632(int i) {
		return (-528482985 * anInt10100 >> 1 + i & 0x1) != 0;
	}

	public final int method15633() {
		return Class237.method4432(-528482985 * anInt10100);
	}

	public final int method15634(int i) {
		return anInt10100 * -528482985 >> 18 & 0x7;
	}

	public final boolean method15635(int i) {
		return 0 != (anInt10100 * -528482985 >> 21 & 0x1);
	}

	public final boolean method15636(byte i) {
		return 0 != (anInt10100 * -528482985 >> 22 & 0x1);
	}
}
