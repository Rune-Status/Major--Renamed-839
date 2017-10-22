package com.jagex;

public class Class276 {
	static Class276 aClass276_3099 = new Class276(1);
	static Class276 aClass276_3100 = new Class276(0);
	static Class276 aClass276_3101 = new Class276(3);
	static Class276 aClass276_3102 = new Class276(2);
	static Class276 aClass276_3103 = new Class276(6);
	static Class276 aClass276_3104 = new Class276(5);
	static Class276 aClass276_3105 = new Class276(7);
	static Class276 aClass276_3106 = new Class276(10);
	static Class276 aClass276_3107 = new Class276(9);
	static Class276 aClass276_3108 = new Class276(4);
	static Class276 aClass276_3109 = new Class276(11);
	static Class276 aClass276_3110 = new Class276(12);
	static Class276 aClass276_3111 = new Class276(13);
	static Class276 aClass276_3112 = new Class276(14);
	static Class276 aClass276_3113 = new Class276(8);

	public static void method5162(int i, int i_1_, short i_2_) {
		OutgoingFrame frame = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_3963, Client.gameConnection.encryptor);
		frame.payload.writeMEInt(i);
		frame.payload.writeShort(i_1_);
		Client.gameConnection.sendFrame(frame);
	}

	int anInt3098;

	Class276(int i) {
		anInt3098 = i * -378124609;
	}

}