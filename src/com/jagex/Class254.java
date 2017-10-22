package com.jagex;

public class Class254 {
	static Class254 aClass254_2822 = new Class254(1, 5);
	static Class254 aClass254_2823 = new Class254(2, 6);
	static Class254 aClass254_2825 = new Class254(0, 4);

	public static void method4740(int mode, int height, int width, boolean fullScreen) {
		Client.aLong10788 = 0L;
		int currentMode = RendererType.windowMode();
		if (mode == 3 || currentMode == 3) {
			fullScreen = true;
		}

		if (!Class60.activeToolkit.method2466()) {
			fullScreen = true;
		}

		LinkableInt.method16019(currentMode, mode, height, width, fullScreen);
	}

	public int anInt2821;
	int id;

	Class254(int i, int i_0_) {
		id = i * 267648881;
		anInt2821 = 906789915 * i_0_;
	}

	public static Class254 valueOf(int i) {
		for (Class254 class254 : Class254.values()) {
			if (class254.id * 1726669201 == i) {
				return class254;
			}
		}

		return null;
	}

	static Class254[] values() {
		return new Class254[] { aClass254_2825, aClass254_2822, aClass254_2823 };
	}

}