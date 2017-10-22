package com.jagex;


public class Class229 {
	public static final int anInt2572 = 5;

	static String method4332(String string, int i) {
		String string_1_ = null;
		int i_2_ = string.indexOf("--> ");
		if (i_2_ >= 0) {
			string_1_ = string.substring(0, i_2_ + 4);
			string = string.substring(4 + i_2_);
		}
		int i_3_ = -1;
		if (string.startsWith("directlogin ")) {
			i_3_ = string.indexOf(" ", "directlogin ".length());
		}
		if (i_3_ >= 0) {
			int i_4_ = string.length();
			string = new StringBuilder().append(string.substring(0, i_3_)).append(" ").toString();
			for (int i_5_ = i_3_ + 1; i_5_ < i_4_; i_5_++) {
				string = new StringBuilder().append(string).append("*").toString();
			}
		}
		if (string_1_ != null) {
			return new StringBuilder().append(string_1_).append(string).toString();
		}
		return string;
	}

	Class229() throws Throwable {
		throw new Error();
	}

}