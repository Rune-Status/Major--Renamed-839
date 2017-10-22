package com.jagex;

public class ContainerHeader {
	public static final void method7119(String string, int i, int i_2_) {
		BufferedConnectionContext class83 = Client.getActiveConnection();
		OutgoingFrame class480_sub15 = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_3948, class83.encryptor);
		class480_sub15.payload.writeByte(1 + Buffer.encodedStringLength(string));
		class480_sub15.payload.writeNegatedByte(i);
		class480_sub15.payload.writeCString(string);
		class83.sendFrame(class480_sub15);
	}

	static final void method7113(ScriptExecutionContext class613, int i) {
		if (-748745979 * class613.anInt7927 != 0) {
			Class604 class604 = class613.aClass604Array7919[(class613.anInt7927 -= -783480371) * -748745979];
			class613.script = class604.scripts;
			class613.instructions = class613.script.instructions;
			class613.anIntArray7943 = class613.script.anIntArray11391;
			class613.counter = 1701262983 * class604.anInt7882;
			class613.intVariables = class604.anIntArray7883;
			class613.stringVariables = class604.anObjectArray7881;
			class613.longVariables = class604.aLongArray7885;
		}
	}

	static final void method7114(ScriptExecutionContext class613) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		Interface class221 = class611.aClass221_7913;
		ScriptExecutionContext.method1632(class226, class221, class613);
	}

	static final void method7115(ScriptExecutionContext class613, int i) {
		int i_0_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 1499273543 * class613.aClass480_Sub33_7935.aClass283Array10233[i_0_].anInt3164;
	}

	static final void method7116(ScriptExecutionContext class613, int i) {
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.desiredToolkit
				.getValue();
	}

	static final void method7117(ScriptExecutionContext class613, int i) {
		int i_1_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.groundBlending
				.compatible(i_1_);
	}

	static final void method7118(ScriptExecutionContext class613, byte i) {
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
	}

	static void method7120(int i, int i_3_) {
		PulseEvent class480_sub31_sub5 = PulseEvent.create(15, i);
		class480_sub31_sub5.immediate();
		class480_sub31_sub5.primary = 106711445 * i_3_;
	}

	int decompressedLength;

	int length;

	CompressionType type;

	ContainerHeader(Buffer buffer) {
		type = CompressionType.findIdentifiable(CompressionType.values(), buffer.readUByte());
		length = buffer.readInt() * -1759417141;
		if (type != CompressionType.UNCOMPRESSED) {
			decompressedLength = buffer.readInt() * -374400553;
		} else {
			decompressedLength = length * -470838875;
		}
	}

	CompressionType compressionType() {
		return type;
	}

	int compressedLength() {
		return length * -104032029;
	}

	int decompressedLength() {
		return 1040050663 * decompressedLength;
	}
}
