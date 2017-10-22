package com.jagex;

public class Class199 implements Interface21 {
	public static PreferenceManager preferences;
	public static Class126_Sub1 aClass126_Sub1_2099;

	Class182 aClass182_2097;
	Class195 this$0;

	Class199(Class195 class195, Buffer buffer) {
		this$0 = class195;
		boolean bool = buffer.readUByte() != 255;
		if (bool) {
			buffer.offset -= 1258142129;
		}
		aClass182_2097 = new Class182(buffer, bool, true);
	}

	@Override
	public void method131(Class192 class192) {
		class192.method3778(aClass182_2097);
	}

}