package com.jagex;

public class Class185 implements Interface23 {
	static int localRegionX;

	public static boolean method3582() {
		return Class277.aBool3118;
	}

	public static Widget method3584(int id, int child) {
		Widget widget = Widget.lookup(id);
		if (child == -1) {
			return widget;
		} else if (widget == null || null == widget.aClass226Array2542 || child >= widget.aClass226Array2542.length) {
			return null;
		}

		return widget.aClass226Array2542[child];
	}

	Class195 this$0;

	Class185(Class195 class195) {
		this$0 = class195;
	}

	@Override
	public void method131(Class192 class192) {
		class192.method3785();
	}

}