package com.jagex;

public class SunDefinition implements Definition, Interface71 {
	public static VarpDefinitionLoader aClass77_Sub1_Sub1_2846;

	public static SunDefinitionLoader loader;
	public boolean aBool2844;
	public int anInt2835;
	public int anInt2836 = -1864472856;
	public int anInt2837;
	public int anInt2838;
	public int anInt2839;
	public int anInt2840 = 1922674319;
	public int anInt2841;
	public int anInt2842;
	public int anInt2843;
	public int anInt2845;

	@Override
	public void decode(Buffer buffer) {
		for (;;) {
			int opcode = buffer.readUByte();
			if (opcode == 0) {
				break;
			}

			decode(buffer, opcode);
		}
	}

	@Override
	public void method35() {

	}

	@Override
	public void method40(int i) {

	}

	@Override
	public void setId(int id) {

	}

	void decode(Buffer buffer, int opcode) {
		if (opcode == 1) {
			anInt2836 = buffer.readUShort() * 303811805;
		} else if (opcode == 2) {
			aBool2844 = true;
		} else if (3 == opcode) {
			anInt2837 = buffer.readShort() * -1621919081;
			anInt2835 = buffer.readShort() * 2127324865;
			anInt2838 = buffer.readShort() * -168349875;
		} else if (opcode == 4) {
			anInt2842 = buffer.readUByte() * -646401827;
		} else if (5 == opcode) {
			anInt2841 = buffer.readSmart32() * -1171470105;
		} else if (6 == opcode) {
			anInt2840 = buffer.readUTriByte() * -26848911;
		} else if (opcode == 7) {
			anInt2843 = buffer.readShort() * -665687589;
			anInt2839 = buffer.readShort() * 123442147;
			anInt2845 = buffer.readShort() * -1105488919;
		}
	}

}