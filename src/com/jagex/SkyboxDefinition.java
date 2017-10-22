package com.jagex;

public class SkyboxDefinition implements Definition, Interface71 {
	static Buffer aClass480_Sub17_7011;
	public static Class55 aClass55_7012;

	int[] suns;
	int anInt7007 = 2105980587;
	int anInt7008 = -1627622711;
	Class517 aClass517_7009 = Class517.aClass517_7060;
	int anInt7010 = 69859445;
	public static SkyboxDefinitionLoader loader;

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
		if (opcode == 1) {
			anInt7008 = buffer.readUShort() * 1627622711;
		} else if (2 == opcode) {
			suns = new int[buffer.readUByte()];

			for (int index = 0; index < suns.length; index++) {
				suns[index] = buffer.readUShort();
			}
		} else if (opcode == 3) {
			anInt7007 = buffer.readUByte() * -2105980587;
		} else if (4 == opcode) {
			aClass517_7009 = CompressionType.findIdentifiable(Class517.values(), buffer.readUByte());
		} else if (opcode == 5) {
			anInt7010 = buffer.readSmart32() * -69859445;
		} else if (6 == opcode) {
			buffer.readSmart32();
		}
	}

}