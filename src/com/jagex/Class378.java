package com.jagex;

public class Class378 {
	public static final int anInt4175 = 21;
	public static final int anInt4176 = 16;
	public static final int anInt4177 = 2;
	public static final int anInt4178 = 1;
	public static final int anInt4179 = 13;
	public static final int anInt4180 = 24;
	public static final int anInt4181 = 22;
	public static final int anInt4182 = 8;
	public static final int anInt4183 = 10;
	public static final int anInt4184 = 28;
	public static final int anInt4185 = 29;
	public static final int anInt4186 = 14;
	public static final int anInt4187 = 11;
	public static final int anInt4188 = 6;
	public static final int anInt4189 = 9;
	public static final int anInt4190 = 7;
	public static final int anInt4191 = 3;
	public static final int anInt4192 = 15;
	public static final int anInt4193 = 17;
	public static final int anInt4194 = 5;
	public static final int anInt4195 = 19;
	public static final int anInt4196 = 25;
	public static final int anInt4197 = 26;
	public static final int anInt4198 = 23;
	public static final int anInt4199 = 27;
	public static final int anInt4200 = 20;
	public static VariableLoader anInterface14_4201;

	static void saveUid(Buffer buffer, int offset) {
		if (null != Engine.random) {
			try {
				Engine.random.seek(0L);
				Engine.random.write(buffer.payload, offset, 24);
			} catch (Exception exception) {

			}
		}
	}

	static void method6213(Class637 class637) {
		Class34.aClass637_448 = class637;
	}

	Class378() throws Throwable {
		throw new Error();
	}

}