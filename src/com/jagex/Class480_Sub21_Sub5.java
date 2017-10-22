package com.jagex;

public class Class480_Sub21_Sub5 extends Class480_Sub21 {
	Class280 this$0;
	int anInt11384;
	byte aByte11385;
	String aString11386;

	Class480_Sub21_Sub5(Class280 class280) {
		this$0 = class280;
		aString11386 = null;
	}

	@Override
	void method15947(Buffer buffer) {
		if (buffer.readUByte() != 255) {
			buffer.offset -= 1258142129;
			buffer.readLong();
		}
		aString11386 = buffer.readStringFast();
		anInt11384 = buffer.readUShort() * 1632987487;
		aByte11385 = buffer.readByte();
		buffer.readLong();
	}

	@Override
	void method15948(Class480_Sub33 class480_sub33) {
		Class283 class283 = new Class283();
		class283.aString3165 = aString11386;
		class283.anInt3164 = -85342231 * anInt11384;
		class283.aByte3163 = aByte11385;
		class480_sub33.method16085(class283);
	}
}
