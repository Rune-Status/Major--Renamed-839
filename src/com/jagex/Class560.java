package com.jagex;

public class Class560 {
	public static final int anInt7521 = 5;
	public static final int anInt7522 = 1;
	public static final int anInt7523 = 2;
	public static final int anInt7524 = 3;
	public static final int anInt7525 = 0;
	public static final int anInt7526 = 1;
	public static final int anInt7527 = 2;
	public static final int anInt7528 = 3;
	public static final int anInt7529 = 4;
	static final int anInt7530 = 100;
	static final int anInt7531 = 3;
	public static final int anInt7540 = 0;

	public int[][] anIntArrayArray7532 = new int[3][5];
	public int anInt7533;
	public int anInt7534;
	public int anInt7535;
	public int anInt7536;
	public int anInt7537;
	public int anInt7538;
	public int anInt7539;

	public Class560(Archive defaults) {
		byte[] data = defaults.get(-1881625811 * Class577.aClass577_7735.file);
		decode(new Buffer(data));
	}

	void decode(Buffer buffer) {
		for (;;) {
			int opcode = buffer.readUByte();
			if (opcode == 0) {
				break;
			}

			if (opcode == 1) {
				anInt7533 = buffer.readInt() * 213144873;
			} else if (2 == opcode) {
				anInt7537 = buffer.readInt() * 230817873;
			} else if (opcode == 3) {
				anInt7535 = buffer.readInt() * 424784285;
			} else if (opcode == 4) {
				anInt7536 = buffer.readUByte() * 2102059161;
			} else if (5 == opcode) {
				anInt7538 = buffer.readUByte() * 1544372801;
			} else if (6 == opcode) {
				anInt7534 = buffer.readInt() * -515654997;
			} else if (7 == opcode) {
				anInt7539 = buffer.readInt() * 281396053;
			} else if (opcode >= 100) {
				opcode -= 100;
				anIntArrayArray7532[opcode & (int) (Math.pow(2.0, 3.0) - 1.0)][opcode >> 3] = buffer.readUShort();
			}
		}
	}

}