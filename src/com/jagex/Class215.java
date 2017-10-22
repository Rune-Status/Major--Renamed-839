package com.jagex;

public class Class215 {
	public static Archive items;
	public static int anInt2196;

	public static char byteToChar(byte value) {
		int character = value & 0xff;
		if (character == 0) {
			throw new IllegalArgumentException(Integer.toString(character, 16));
		}

		if (character >= 128 && character < 160) {
			int unicode = Class612.UNICODE_TABLE[character - 128];
			if (unicode == 0) {
				unicode = 63;
			}

			character = unicode;
		}

		return (char) character;
	}

	static void method4036() {
		Class274.aClass168_3092.clear();
	}

	Class215() throws Throwable {
		throw new Error();
	}

}