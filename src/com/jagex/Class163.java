package com.jagex;

public class Class163 {
	static short aShort1903;
	static int anInt1905;
	public static HashTable<LinkableInt> variables = new HashTable(32);
	static int anInt1907 = -1697778917;
	static int anInt1908;
	static boolean aBool1910;
	public static VariableProvider anInterface12_1911 = new CutsceneVariableProvider();
	static short aShort1912;
	static int anInt1914 = -739340267;
	static Class155 aClass155_1915;
	static int anInt1916 = 63563923;

	Class163() throws Throwable {
		throw new Error();
	}

	static void method977(Buffer buffer) {
		for (;;) {
			int opcode = buffer.readUByte();
			switch (opcode) {
				case 255:
					return;
				case 0:
					anInt1908 = buffer.readUShort() * 1763822065;
					anInt1905 = buffer.readUShort() * -706335565;
			}
		}
	}

}