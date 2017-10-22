package com.jagex;

public class Class589 {
	static Class589 aClass589_7780;
	public static Class589 aClass589_7781;
	public static Class589 aClass589_7782;
	public static Class589 aClass589_7783;
	public static Class589 aClass589_7784;
	public static Class589 aClass589_7785;
	public static Class589 aClass589_7786;
	public static Class589 aClass589_7787 = new Class589(1);
	static Class589 aClass589_7788;
	static Class589 aClass589_7789;
	static Class589 aClass589_7790;
	static Class589 aClass589_7791;
	static Class589 aClass589_7792;
	static Class589 aClass589_7793;
	public static Class589 aClass589_7794;
	protected static FullScreenAdapter fullScreenAdapter;
	static {
		aClass589_7781 = new Class589(2);
		aClass589_7782 = new Class589(4);
		aClass589_7783 = new Class589(8);
		aClass589_7784 = new Class589(16);
		aClass589_7785 = new Class589(32);
		aClass589_7786 = new Class589(64);
		aClass589_7794 = new Class589(128);
		aClass589_7780 = new Class589(256);
		aClass589_7789 = new Class589(512);
		aClass589_7793 = new Class589(1024);
		aClass589_7788 = new Class589(2048);
		aClass589_7792 = new Class589(4096);
		aClass589_7791 = new Class589(8192);
		aClass589_7790 = new Class589(16384);
	}

	static String method9918(MenuOption class480_sub31_sub17) {
		if (class480_sub31_sub17.aString11415 == null || class480_sub31_sub17.aString11415.length() == 0) {
			if (class480_sub31_sub17.target != null && class480_sub31_sub17.target.length() > 0) {
				return new StringBuilder().append(class480_sub31_sub17.action)
						.append(TranslatableString.aClass5_157.translate(Client.currentLanguage))
						.append(class480_sub31_sub17.target).toString();
			}
			return class480_sub31_sub17.action;
		}
		if (null != class480_sub31_sub17.target && class480_sub31_sub17.target.length() > 0) {
			return new StringBuilder().append(class480_sub31_sub17.action)
					.append(TranslatableString.aClass5_157.translate(Client.currentLanguage))
					.append(class480_sub31_sub17.target)
					.append(TranslatableString.aClass5_157.translate(Client.currentLanguage))
					.append(class480_sub31_sub17.aString11415).toString();
		}
		return new StringBuilder().append(class480_sub31_sub17.action)
				.append(TranslatableString.aClass5_157.translate(Client.currentLanguage))
				.append(class480_sub31_sub17.aString11415).toString();
	}

	public int anInt7795;

	Class589(int i) {
		anInt7795 = i * 1214416785;
	}

}