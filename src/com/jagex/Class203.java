package com.jagex;

import java.awt.Font;

public class Class203 implements Identifiable {
	public static Class203 aClass203_2122;
	static Class203 aClass203_2123 = new Class203(2, 0);
	static Class203 aClass203_2124;
	static Font aFont2127;
	static {
		aClass203_2122 = new Class203(1, 1);
		aClass203_2124 = new Class203(0, 2);
	}

	public int anInt2125;
	int id;

	Class203(int i, int i_0_) {
		anInt2125 = -1230130577 * i;
		id = 2056307385 * i_0_;
	}

	@Override
	public int getId() {
		return -1964203127 * id;
	}

	static Class203[] values() {
		return new Class203[] { aClass203_2124, aClass203_2122, aClass203_2123 };
	}

}