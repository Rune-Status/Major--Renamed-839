package com.jagex;

public class Class636 implements Identifiable {
	public static Class636 aClass636_8123 = new Class636(-2);
	public static Class636 aClass636_8124;
	public static Class636 aClass636_8125;
	public static Class636 aClass636_8126 = new Class636(-3);
	static Class636 aClass636_8127;
	static {
		aClass636_8124 = new Class636(2);
		aClass636_8125 = new Class636(3);
		aClass636_8127 = new Class636(4);
	}

	int anInt8128;

	Class636(int i) {
		anInt8128 = i * -1582499351;
	}

	@Override
	public int getId() {
		return anInt8128 * 1673752153;
	}

	public static Class636[] values() {
		return new Class636[] { aClass636_8126, aClass636_8125, aClass636_8123, aClass636_8124, aClass636_8127 };
	}
}
