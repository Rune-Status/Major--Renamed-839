package com.jagex;

public class Class159 {
	static int anInt1896;

	int[] anIntArray1889;
	int[] anIntArray1890;
	int[] anIntArray1891;
	int[] anIntArray1892;
	int[] anIntArray1893;
	int[] anIntArray1894;
	int[] anIntArray1895;

	Class159(Buffer buffer) {
		int count = buffer.readUSmart();
		anIntArray1892 = new int[count];
		anIntArray1895 = new int[count];
		anIntArray1891 = new int[count];
		anIntArray1889 = new int[count];
		anIntArray1893 = new int[count];
		anIntArray1894 = new int[count];
		anIntArray1890 = new int[count];

		for (int index = 0; index < count; index++) {
			anIntArray1892[index] = buffer.readUShort() - 5120;
			anIntArray1891[index] = buffer.readUShort() - 5120;
			anIntArray1895[index] = buffer.readShort();
			anIntArray1893[index] = buffer.readUShort() - 5120;
			anIntArray1890[index] = buffer.readUShort() - 5120;
			anIntArray1894[index] = buffer.readShort();
			anIntArray1889[index] = buffer.readShort();
		}
	}

	void method3322(int i) {
		int[][] is = new int[anIntArray1892.length << 1][4];
		for (int index = 0; index < anIntArray1892.length; index++) {
			is[2 * index][0] = anIntArray1892[index];
			is[index * 2][1] = anIntArray1895[index];
			is[2 * index][2] = anIntArray1891[index];
			is[index * 2][3] = anIntArray1889[index];
			is[1 + 2 * index][0] = anIntArray1893[index];
			is[index * 2 + 1][1] = anIntArray1894[index];
			is[2 * index + 1][2] = anIntArray1890[index];
			is[1 + index * 2][3] = anIntArray1889[index];
		}

		Client.anIntArrayArrayArray10720[i] = is;
	}

}