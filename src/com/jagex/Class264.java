package com.jagex;

public class Class264 {
	static Class264 aClass264_2956;
	static Class264 aClass264_2957 = new Class264(0, true);
	static Class264 aClass264_2958;
	static Sprite[] hintMapEdges;
	static {
		aClass264_2956 = new Class264(1, true);
		aClass264_2958 = new Class264(2, false);
	}

	public static void method5001(Widget[] widgets, int i, int i_3_, int i_4_, boolean bool) {
		for (Widget widget : widgets) {

			if (null != widget && 1920469085 * widget.parent == i) {
				Widget.method15084(widget, i_3_, i_4_, bool, (byte) -13);
				Class197.method3866(widget, i_3_, i_4_, (byte) -2);
				if (-1909412215 * widget.anInt2382 > widget.scrollWidth * 731337999 - widget.width * 688089097) {
					widget.anInt2382 = widget.scrollWidth * 199147735 - widget.width * -1727361663;
				}
				if (widget.anInt2382 * -1909412215 < 0) {
					widget.anInt2382 = 0;
				}
				if (widget.scrollPosition * -1881455913 > -184691147 * widget.scrollHeight - 1362321717 * widget.height) {
					widget.scrollPosition = widget.scrollHeight * 1461672403 - widget.height * 73385683;
				}
				if (widget.scrollPosition * -1881455913 < 0) {
					widget.scrollPosition = 0;
				}

				if (0 == widget.type * 1558474223) {
					Class171.method3489(widgets, widget, bool);
				}
			}
		}
	}

	int anInt2959;
	boolean aBool2960;

	Class264(int i, boolean bool) {
		anInt2959 = i * 1712987795;
		aBool2960 = bool;
	}

}