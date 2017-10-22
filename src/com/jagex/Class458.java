package com.jagex;

public class Class458 {
	public static Class458 aClass458_5152;
	public static Class458 CONSTRUCTED;
	public static Class458 aClass458_5154;
	static Class458 aClass458_5155;
	static Class458 aClass458_5156;
	static Class458 aClass458_5158;
	public static Class458 aClass458_5159;
	public static Class458 aClass458_5161 = new Class458(false, false);
	static {
		aClass458_5152 = new Class458(true, false);
		aClass458_5154 = new Class458(false, false);
		CONSTRUCTED = new Class458(true, false);
		aClass458_5156 = new Class458(true, false);
		aClass458_5155 = new Class458(true, true);
		aClass458_5158 = new Class458(true, true);
		aClass458_5159 = new Class458(false, false);
	}

	public static void method7544(String string, String string_17_, int i, boolean bool, String string_18_) {
		if (6 == Client.gameState * -1501875989) {
			OutgoingFrame frame = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_3958,
					Client.lobbyConnection.encryptor);
			frame.payload.writeShort(0);
			int start = frame.payload.offset * -165875887;
			frame.payload.writeCString(string);
			frame.payload.writeCString(string_17_);
			frame.payload.writeByte(i);
			frame.payload.writeByte(bool ? 1 : 0);
			frame.payload.writeCString(string_18_);
			frame.payload.offset += 217060311;
			frame.payload.encodeXtea(Class34.anIntArray447, start, frame.payload.offset * -165875887);
			frame.payload.writeSizeShort(frame.payload.offset * -165875887 - start, 558241984);
			Client.lobbyConnection.sendFrame(frame);
			if (i < 13) {
				Client.aBool10632 = true;
				PlayerVarpType.method15346(-1254058051);
			}
			Class23.aClass640_326 = Class640.aClass640_8156;
		}
	}

	public static void method7546(BaseVariableParameterDefinition class131, int i) {
		PulseEvent class480_sub31_sub5 = PulseEvent.create(1, class131.id * 169834903);
		class480_sub31_sub5.delay();
	}

	static final void method7542(Widget class226, Interface class221, ScriptExecutionContext class613) {
		int i_9_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		if (i_9_ == -687311621 * Widget.anInt2398 || i_9_ == Widget.anInt2350 * -1377754877
				|| i_9_ == Widget.anInt2351 * -116477801 || -721529179 * Widget.anInt2352 == i_9_) {
			class226.anInt2481 = 1170733121 * i_9_;
		}
	}

	static Class340 method7543(Buffer buffer, int i) {
		Class349 class349 = Class349.values()[buffer.readUByte()];
		Class334 class334 = Class334.values()[buffer.readUByte()];
		int i_10_ = buffer.readShort();
		int i_11_ = buffer.readShort();
		int i_12_ = buffer.readUShort();
		int i_13_ = buffer.readUShort();
		int i_14_ = buffer.readShort();
		int i_15_ = buffer.readSmart32();
		int i_16_ = buffer.readInt();
		return new Class340(class349, class334, i_10_, i_11_, i_12_, i_13_, i_14_, i_15_, i_16_);
	}

	static void method7545(Toolkit class134, int i, int i_21_, Widget class226, byte i_22_) {
		int i_23_ = 127;
		int i_24_ = 7;
		for (int i_25_ = 63; i_25_ >= 0; i_25_--) {
			int i_26_ = (i_25_ & 0x3f) << 10 | (i_24_ & 0x7) << 7 | i_23_ & 0x7f;
			Class44.method1067(false, true);
			int i_27_ = Class335.HSV_TABLE[i_26_];
			Class470.method8046(false, true);
			class134.method2434(i, i_21_ + (class226.height * 1362321717 * (63 - i_25_) >> 6),
					class226.width * 688089097, (class226.height * 1362321717 >> 6) + 1, ~0xffffff | i_27_, 0);
		}
	}

	boolean aBool5157;

	boolean aBool5160;

	Class458(boolean bool, boolean bool_0_) {
		aBool5160 = bool;
		aBool5157 = bool_0_;
	}

	public boolean method7536() {
		return aBool5157;
	}

	boolean method7537() {
		return aBool5160;
	}
}
