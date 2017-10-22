package com.jagex;

public class Class128 implements Identifiable {
	static Class128 aClass128_1490 = new Class128(0, 6);
	static Class128 aClass128_1491 = new Class128(6, 2);
	static Class128 aClass128_1492 = new Class128(2, 1);
	static Class128 aClass128_1493 = new Class128(4, 4);
	static Class128 aClass128_1495 = new Class128(1, 3);
	static Class128 aClass128_1496 = new Class128(3, 7);
	static Class128 aClass128_1498 = new Class128(5, 5);
	static Archive sprites;
	public static int anInt1500;

	int id;
	int anInt1497;

	Class128(int i, int i_0_) {
		anInt1497 = -1925935887 * i;
		id = -1261583341 * i_0_;
	}

	@Override
	public int getId() {
		return id * -1892112869;
	}

	static Class128[] values() {
		return new Class128[] { aClass128_1495, aClass128_1491, aClass128_1498, aClass128_1490, aClass128_1496,
				aClass128_1493, aClass128_1492 };
	}

}