package com.jagex;

public final class Class7_Sub1 extends UnboundedDefinitionLoader {

	static void method16830(byte[] data) {
		Buffer buffer = new Buffer(data);
		for (;;) {
			int opcode = buffer.readUByte();
			if (0 == opcode) {
				break;
			}

			if (opcode == 1) {
				Class575.anInt7708 = buffer.readUShort() * -607860969;
			}
		}
	}

	public Class7_Sub1(GameContext context, Language language, Archive varbits, boolean loadImmediately) {
		super(context, language, ConfigEntry.aClass37_514, varbits, new ReflectiveDefinitionProvider(
				Class480_Sub31_Sub1.class), loadImmediately);
	}

}