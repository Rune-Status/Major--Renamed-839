package com.jagex;

import com.jagex.twitch.TwitchTV;

public class Class348 implements Interface43 {
	public static Class348 decode(Buffer buffer) {
		String string = buffer.readString();
		Class349 class349 = Class349.values()[buffer.readUByte()];
		Class334 class334 = Class334.values()[buffer.readUByte()];
		int i_10_ = buffer.readShort();
		int i_11_ = buffer.readShort();
		int i_12_ = buffer.readUByte();
		int i_13_ = buffer.readUByte();
		int i_14_ = buffer.readUByte();
		int i_15_ = buffer.readUShort();
		int i_16_ = buffer.readUShort();
		int i_17_ = buffer.readSmart32();
		int i_18_ = buffer.readInt();
		int i_19_ = buffer.readInt();
		return new Class348(string, class349, class334, i_10_, i_11_, i_12_, i_13_, i_14_, i_15_, i_16_, i_17_, i_18_,
				i_19_);
	}

	public static int getTwitchChatState() {
		return TwitchTV.tv.GetChatState();
	}

	public Class334 aClass334_3679;
	public Class349 aClass349_3678;
	public int anInt3677;
	public int anInt3680;
	public int anInt3681;
	public int anInt3682;
	public int id;
	public int anInt3685;
	public int anInt3686;
	public int anInt3687;
	public int anInt3688;
	public int anInt3689;
	public String aString3683;

	Class348(String string, Class349 class349, Class334 class334, int i, int i_0_, int i_1_, int i_2_, int i_3_,
			int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
		aString3683 = string;
		aClass349_3678 = class349;
		aClass334_3679 = class334;
		anInt3677 = 1352468069 * i;
		anInt3681 = i_0_ * -2004899111;
		anInt3680 = -1598437507 * i_1_;
		anInt3682 = i_2_ * 541564795;
		anInt3688 = 493749649 * i_3_;
		anInt3685 = i_4_ * 1413484655;
		anInt3686 = i_5_ * -1664247573;
		id = 1280255455 * i_6_;
		anInt3687 = 7094965 * i_7_;
		anInt3689 = -1671276323 * i_8_;
	}

	@Override
	public Class360 method316() {
		return Class360.aClass360_3878;
	}

}