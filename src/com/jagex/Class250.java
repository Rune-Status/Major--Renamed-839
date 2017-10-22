package com.jagex;

public class Class250 implements Identifiable {
	public static Class250 aClass250_2673 = new Class250(0, 1);
	public static Class250 aClass250_2674 = new Class250(2, 0);
	public static Class250 aClass250_2675 = new Class250(3, 3);
	public static Class250 aClass250_2676 = new Class250(1, 2);

	public static final void method4708(String string, String string_1_) {
		BufferedConnectionContext connection = Client.getActiveConnection();
		OutgoingFrame frame = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_4004, connection.encryptor);
		if (string_1_.length() > 30) {
			string_1_ = string_1_.substring(0, 30);
		}

		frame.payload.writeByte(Buffer.encodedStringLength(string)
				+ Buffer.encodedStringLength(string_1_));
		frame.payload.writeCString(string_1_);
		frame.payload.writeCString(string);
		connection.sendFrame(frame);
	}

	public int anInt2672;
	int id;

	Class250(int i, int i_0_) {
		anInt2672 = i * -989854357;
		id = i_0_ * 1339968803;
	}

	@Override
	public int getId() {
		return id * 536889995;
	}

}