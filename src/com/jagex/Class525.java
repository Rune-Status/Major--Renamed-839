package com.jagex;

public class Class525 implements Encodeable {
	static int anInt7217;

	String aString7213;
	String error;
	int anInt7215;

	Class16 aClass16_7216;

	Class525(Class16 class16, String string, int i, Throwable throwable) {
		aClass16_7216 = class16;
		aString7213 = string;
		anInt7215 = i * -1209609977;
		error = null != throwable ? throwable.getMessage() : null;
	}

	@Override
	public void encode() {
		OutgoingFrame frame = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_3991, Client.gameConnection.encryptor);
		int start = (frame.payload.offset += 1258142129) * -165875887;
		frame.payload.writeByte(aClass16_7216.getId());
		frame.payload.writeCString(aString7213);
		frame.payload.writeShort(anInt7215 * -1873163081);
		frame.payload.writeCString(Class485.osMeta);

		if (null != error) {
			frame.payload.writeByte(1);
			String message = error;

			if (message.length() > 100) {
				message = message.substring(0, 100);
			}

			frame.payload.writeCString(message);
		} else {
			frame.payload.writeByte(0);
		}

		frame.payload.writeSizeByte(frame.payload.offset * -165875887 - start);
		Client.gameConnection.sendFrame(frame);
	}

}