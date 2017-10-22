package com.jagex;

public class Class630 implements Identifiable {
	public static Class630 aClass630_8051;
	public static Class630 aClass630_8052;
	static Class630 aClass630_8053;
	static Class630 aClass630_8054;
	static Class630 aClass630_8055;
	static Class630 aClass630_8056;
	static Class630 aClass630_8057;
	public static Class630 aClass630_8058 = new Class630(-2);
	static Class630 aClass630_8059;
	public static VarpDefinitionLoader aClass77_Sub1_Sub1_8060;
	static {
		aClass630_8051 = new Class630(-3);
		aClass630_8059 = new Class630(2);
		aClass630_8052 = new Class630(3);
		aClass630_8054 = new Class630(4);
		aClass630_8055 = new Class630(5);
		aClass630_8056 = new Class630(6);
		aClass630_8057 = new Class630(7);
		aClass630_8053 = new Class630(8);
	}

	public static String method13109(MenuOption class480_sub31_sub17, int i) {
		if (Class56.menuOpen || null == class480_sub31_sub17) {
			return "";
		}
		if ((null == class480_sub31_sub17.target || class480_sub31_sub17.target.length() == 0)
				&& null != class480_sub31_sub17.aString11415 && class480_sub31_sub17.aString11415.length() > 0) {
			return class480_sub31_sub17.aString11415;
		}
		return class480_sub31_sub17.target;
	}

	int anInt8050;

	Class630(int i) {
		anInt8050 = 219922441 * i;
	}

	@Override
	public int getId() {
		return 716426809 * anInt8050;
	}
}
