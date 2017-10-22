package com.jagex;

final class WorldVarpType extends VarpType {
	public static final void method15405(int index, boolean bool) {
		if (null != Class417.aClass480_Sub33_4650 && index >= 0
				&& index < Class417.aClass480_Sub33_4650.anInt10228 * 1777256127) {
			Class283 class283 = Class417.aClass480_Sub33_4650.aClass283Array10233[index];
			BufferedConnectionContext connection = Client.getActiveConnection();
			OutgoingFrame frame = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_3936, connection.encryptor);
			frame.payload.writeByte(3 + Buffer.encodedStringLength(class283.aString3165));
			frame.payload.writeShort(index);
			frame.payload.writeByte(bool ? 1 : 0);
			frame.payload.writeCString(class283.aString3165);
			connection.sendFrame(frame);
		}
	}

	WorldVarpType(ConfigEntry config, int id) {
		super(config, id);
	}

	@Override
	Object method7337(BaseVariableParameterDefinition parameter) {
		if (CharacterType.ONE == parameter.aClass422_1515) {
			return -1;
		}

		return parameter.aClass422_1515.method7017();
	}

}