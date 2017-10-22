package com.jagex;

public class Class480_Sub21_Sub1 extends Class480_Sub21 {
	Class280 this$0;

	int anInt11163;

	Class480_Sub21_Sub1(Class280 class280) {
		this$0 = class280;
		anInt11163 = -1183015617;
	}

	@Override
	void method15947(Buffer buffer) {
		anInt11163 = buffer.readUShort() * 1183015617;
		buffer.readUByte();

		if (buffer.readUByte() != 255) {
			buffer.offset -= 1258142129;
			buffer.readLong();
		}
	}

	@Override
	void method15948(Class480_Sub33 class480_sub33) {
		class480_sub33.method16075(-1169674943 * anInt11163);
	}

}