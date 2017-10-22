package com.jagex;

public class Class419 implements Identifiable {
	public static Class419 aClass419_4652 = new Class419(0);
	public static Class419 aClass419_4653 = new Class419(2);
	public static Class419 aClass419_4654 = new Class419(1);
	public static byte localFcRank;

	public static final void method6999(String string, String string_2) {
		BufferedConnectionContext connection = Client.getActiveConnection();
		OutgoingFrame frame = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_3973, connection.encryptor);
		if (string_2.length() > 30) {
			string_2 = string_2.substring(0, 30);
		}

		frame.payload
				.writeByte(Buffer.encodedStringLength(string) + Buffer.encodedStringLength(string_2));
		frame.payload.writeCString(string);
		frame.payload.writeCString(string_2);
		connection.sendFrame(frame);
	}

	int id;

	Class419(int i) {
		id = 1167548331 * i;
	}

	@Override
	public int getId() {
		return id * 1475388163;
	}

	public static Class419[] values() {
		return new Class419[] { aClass419_4653, aClass419_4652, aClass419_4654 };
	}

}