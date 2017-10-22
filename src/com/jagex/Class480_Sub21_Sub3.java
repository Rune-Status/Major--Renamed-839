package com.jagex;

public class Class480_Sub21_Sub3 extends Class480_Sub21 {
	public static Archive soundEffects;
	byte aByte11206;
	String aString11207;
	byte aByte11208;
	Class280 this$0;

	Class480_Sub21_Sub3(Class280 class280) {
		this$0 = class280;
	}

	@Override
	void method15947(Buffer buffer) {
		aString11207 = buffer.readStringFast();
		if (null != aString11207) {
			buffer.readUByte();
			aByte11208 = buffer.readByte();
			aByte11206 = buffer.readByte();
		}
	}

	@Override
	void method15948(Class480_Sub33 class480_sub33) {
		class480_sub33.aString10231 = aString11207;
		if (aString11207 != null) {
			class480_sub33.aByte10232 = aByte11208;
			class480_sub33.aByte10226 = aByte11206;
		}
	}
}
