package com.jagex;

public class Class331 implements Interface43 {

	public static Class331 decode(Buffer buffer) {
		Class349 class349 = Class349.values()[buffer.readUByte()];
		Class334 class334 = Class334.values()[buffer.readUByte()];
		int i_4_ = buffer.readShort();
		int i_5_ = buffer.readShort();
		int i_6_ = buffer.readSmart32();
		int i_7_ = buffer.readInt();
		int i_8_ = buffer.readUByte();
		return new Class331(class349, class334, i_4_, i_5_, i_6_, i_7_, i_8_);
	}

	public Class334 aClass334_3581;
	public Class349 aClass349_3580;
	public int anInt3582;
	public int anInt3583;
	public int colour;
	public int anInt3586;

	public int id;

	Class331(Class349 class349, Class334 class334, int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		aClass349_3580 = class349;
		aClass334_3581 = class334;
		anInt3582 = i * -895732401;
		anInt3583 = -1430159493 * i_0_;
		id = i_1_ * 1607961809;
		colour = -1446281991 * i_2_;
		anInt3586 = i_3_ * -729552207;
	}

	@Override
	public Class360 method316() {
		return Class360.aClass360_3887;
	}

}