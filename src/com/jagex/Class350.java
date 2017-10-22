package com.jagex;

public class Class350 implements Interface43 {
	public static Archive config;

	public static Class350 decode(Buffer buffer) {
		int image = buffer.readSmart32();
		return new Class350(image);
	}

	public int image;

	Class350(int image) {
		this.image = image * 549355517;
	}

	@Override
	public Class360 method316() {
		return Class360.aClass360_3888;
	}

}