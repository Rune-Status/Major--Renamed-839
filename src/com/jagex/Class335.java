package com.jagex;

public class Class335 {
	public static Class335 aClass335_3604 = new Class335();
	public static Class335 aClass335_3605 = new Class335();
	public static int[] HSV_TABLE;

	static String method5818(Widget widget, int index) {
		if (!Client.method17050(widget).method15632(index) && null == widget.anObjectArray2553) {
			return null;
		}

		if (widget.aStringArray2430 == null || widget.aStringArray2430.length <= index
				|| widget.aStringArray2430[index] == null || widget.aStringArray2430[index].trim().length() == 0) {
			if (Client.aBool10603) {
				return "Hidden-" + index;
			}

			return null;
		}

		return widget.aStringArray2430[index];
	}

}