package com.jagex;

public abstract class BaseVarpDefinitionLoader implements DefinitionLoader<BaseVariableParameterDefinition> {
	static int anInt1129;
	public static int anInt1130;

	public static void method1630(String string) {
		if (6 == Client.gameState * -1501875989) {
			OutgoingFrame frame = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_3968,
					Client.lobbyConnection.encryptor);
			frame.payload.writeByte(0);
			int start = frame.payload.offset * -165875887;
			frame.payload.writeCString(string);
			frame.payload.offset += 217060311;
			frame.payload.encodeXtea(Class34.anIntArray447, start, -165875887 * frame.payload.offset);
			frame.payload.writeSizeByte(frame.payload.offset * -165875887 - start);
			Client.lobbyConnection.sendFrame(frame);
			Class34.aClass630_449 = Class630.aClass630_8051;
		}
	}

	protected int count;

	BaseVarpDefinitionLoader(GameContext context, Language language, int count) {
		this.count = count * 375798093;
	}

	@Override
	public int count() {
		return count * -1710250107;
	}

}