package com.jagex;

public class Class75 {
	static ReferenceCache aClass168_1125 = new ReferenceCache(4);

	static void method1615(byte[] data) {
		Buffer buffer = new Buffer(data);
		for (;;) {
			int opcode = buffer.readUByte();
			if (opcode == 0) {
				break;
			}

			if (1 == opcode) {
				int i_1_ = buffer.readUShort();
				TurnMobCutsceneAction.aClass186_9434.method3613(i_1_);
			}
		}
	}

	public int anInt1115 = -1173898881;
	int anInt1116;
	public int anInt1117;
	int anInt1118;
	public int anInt1119;
	int anInt1120;
	public int anInt1121;
	public int anInt1122;
	public int anInt1123;
	int anInt1124;

	public Class75() {
	}

}