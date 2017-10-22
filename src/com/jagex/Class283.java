package com.jagex;

import java.awt.Image;

public class Class283 {
	public static Image anImage3166;
	public static int anInt3167;

	public static final void method3558(int index) {
		if (null != Class417.aClass480_Sub33_4650 && index >= 0
				&& index < Class417.aClass480_Sub33_4650.anInt10228 * 1777256127) {
			Class283 class283 = Class417.aClass480_Sub33_4650.aClass283Array10233[index];

			if (-1 == class283.aByte3163) {
				BufferedConnectionContext connection = Client.getActiveConnection();
				OutgoingFrame frame = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_3928, connection.encryptor);
				frame.payload.writeByte(2 + Buffer.encodedStringLength(class283.aString3165));
				frame.payload.writeShort(index);
				frame.payload.writeCString(class283.aString3165);
				connection.sendFrame(frame);
			}
		}
	}

	static void method5268() {
		if (Class49.aClass134_581 != null) {
			Class49.aClass134_581.method2373();
			Class49.aClass134_581 = null;
			Class49.aClass132_580 = null;
		}
	}

	public byte aByte3163;
	public int anInt3164;
	public String aString3165;

}