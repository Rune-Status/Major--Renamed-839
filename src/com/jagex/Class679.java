package com.jagex;

public class Class679 implements Definition, Interface71 {
	public static long subscriptionExpiration;
	static Font aClass132_288;

	public static int light(int colour, int light) {
		light = light * (colour & 0x7f) >> 7;
		if (light < 2) {
			light = 2;
		} else if (light > 126) {
			light = 126;
		}

		return (colour & 0xff80) + light;
	}

	public static void method696() {
		Class63.aClass116_951 = null;
		Class63.anInt943 = 742271049;
	}

	public int anInt283;
	public int anInt284 = 470956032;
	public int anInt285 = -742459392;
	public int anInt286 = 0;

	@Override
	public void method35() {

	}

	@Override
	public void decode(Buffer buffer) {
		for (;;) {
			int opcode = buffer.readUByte();
			if (0 == opcode) {
				break;
			}

			decode(buffer, opcode);
		}
	}

	@Override
	public void method40(int i) {

	}

	@Override
	public void setId(int id) {

	}

	void decode(Buffer buffer, int opcode) {
		if (1 == opcode) {
			anInt286 = buffer.readUByte() * 803640937;
		} else if (2 == opcode) {
			anInt284 = buffer.readUShort() * -788299193;
		} else if (3 == opcode) {
			anInt285 = buffer.readUShort() * -426084385;
		} else if (4 == opcode) {
			anInt283 = buffer.readShort() * -569575451;
		}
	}

}