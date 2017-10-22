package com.jagex;

public class Class577 {
	static Class577 aClass577_7727 = new Class577(2);
	static Class577 aClass577_7728 = new Class577(5);
	public static Class577 aClass577_7729 = new Class577(4);
	static Class577 aClass577_7730 = new Class577(9);
	static Class577 aClass577_7731 = new Class577(3);
	static Class577 aClass577_7732 = new Class577(7);
	static Class577 aClass577_7733 = new Class577(8);
	public static Class577 aClass577_7734 = new Class577(1);
	static Class577 aClass577_7735 = new Class577(10);
	static Class577 EQUIPMENT = new Class577(6);
	static int selectedWidgetAttributes;

	public static boolean isPowerOf2(int i) {
		return i == (i & -i);
	}

	public static String escapeHtml(String string) {
		int length = string.length();
		int extra = 0;
		for (int index = 0; index < length; index++) {
			char character = string.charAt(index);

			if ('<' == character || '>' == character) {
				extra += 3;
			}
		}

		StringBuilder builder = new StringBuilder(length + extra);
		for (int index = 0; index < length; index++) {
			char character = string.charAt(index);
			if ('<' == character) {
				builder.append("<lt>");
			} else if (character == '>') {
				builder.append("<gt>");
			} else {
				builder.append(character);
			}
		}

		return builder.toString();
	}

	static void method9811() {
		synchronized (Class38.aClass168_538) {
			Class38.aClass168_538.clearSoft();
		}
	}

	public int file;

	Class577(int file) {
		this.file = 2057034917 * file;
	}

}