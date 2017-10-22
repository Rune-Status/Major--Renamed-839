package com.jagex;

public class Class373 {
	public static int[] COSINE;
	public static final int anInt4137 = 12288;
	public static final int anInt4138 = 14;
	public static final int anInt4139 = 14336;
	public static final int anInt4140 = 16384;
	public static final int anInt4141 = 16383;
	public static final int anInt4142 = 14;
	public static final int anInt4143 = 16383;
	public static final int anInt4144 = 2048;
	public static final int anInt4145 = 4096;
	public static final int anInt4146 = 6144;
	public static final int anInt4147 = 8192;
	public static final int anInt4148 = 10240;
	public static final int anInt4149 = 16384;
	public static final int anInt4150 = 1024;
	public static final int anInt4151 = 16384;
	public static int[] SINE = new int[16384];
	public static final double aDouble4153 = 2607.5945876176133;

	static {
		COSINE = new int[16384];
		double d = 3.834951969714103E-4;
		for (int index = 0; index < 16384; index++) {
			SINE[index] = (int) (16384.0 * Math.sin(index * d));
			COSINE[index] = (int) (16384.0 * Math.cos(index * d));
		}
	}

	public static float method6114(int i) {
		i &= 0x3fff;
		return (float) (i / 16384.0F * (2 * Math.PI));
	}

	Class373() throws Throwable {
		throw new Error();
	}

}