package com.jagex;

public class Class11_Sub1 extends Class11 implements Encodeable {

	public void method16219(int i) {
		anInt270 = -1777840941 * i;
	}

	public void method16220(int i) {
		anInt251 = (anInt251 * 96501937 | i) * -308426671;
	}

	public void method16222(int i, int i_2_) {
		if (i == 0 && i_2_ > 32767) {
			i_2_ = 32767;
		} else if (i_2_ > 8388607) {
			i_2_ = 8388607;
		}

		switch (i) {
			case 0:
				anInt263 = i_2_ * 128685035;
				break;
			case 5:
				anInt267 = 574405197 * i_2_;
				break;
			case 1:
				anInt255 = i_2_ * 1426066077;
				break;
			case 3:
				anInt260 = 56244271 * i_2_;
				break;
		}
	}

	public void method16226(int i) {
		anInt269 = i * -1612336451;
	}

	@Override
	public void encode() {
		OutgoingFrame frame = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_4003, Client.gameConnection.encryptor);
		frame.payload.writeShortA(39451843 * anInt263);
		frame.payload.writeShortA(anInt251 * 96501937);
		frame.payload.writeMETriByte(-1245287605 * anInt264);
		frame.payload.writeByte(anInt269 * -1103734635);
		frame.payload.writeTriByte(anInt267 * 1087311493);
		frame.payload.writeTriByte(anInt255 * -194589771);
		frame.payload.writeLETriByte(1009127119 * anInt260);
		frame.payload.writeByteA(anInt270 * 1627253595);
		Client.gameConnection.sendFrame(frame);
	}


	public static int method2855() {
		Class11_Sub1 class11_sub1 = Class186.method3725();
		Class337.method5828(class11_sub1);
		return class11_sub1.method647();
	}

}