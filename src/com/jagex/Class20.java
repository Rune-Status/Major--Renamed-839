package com.jagex;

public abstract class Class20 {
	public static int method730(int i, int i_9_, int orientation, int i_11_) {
		orientation &= 0x3;
		if (orientation == 0) {
			return i;
		} else if (orientation == 1) {
			return i_9_;
		} else if (2 == orientation) {
			return 4095 - i;
		}

		return 4095 - i_9_;
	}

	static final void method728(int x, int z) {
		Class63.anInt939 = x * -517887053;
		Class63.anInt950 = 224109565 * z;
		Class63.aBool955 = false;
		PulseEvent.method16137();
	}

	protected boolean aBool295;
	protected int anInt296;
	protected int anInt297;
	protected int anInt298;
	protected int anInt299;
	protected int anInt300;
	protected boolean aBool301;
	protected int anInt302;
	protected int anInt303;

	Class20(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, boolean bool, boolean bool_5_, int i_6_) {
		anInt302 = i * -1904407039;
		anInt296 = i_0_ * 1419701159;
		anInt297 = (i_1_ > 65535 ? 65535 : i_1_) * 1990882051;
		anInt298 = -1761237945 * i_2_;
		anInt299 = 1697893163 * (i_3_ > 255 ? 255 : i_3_);
		anInt300 = i_4_ * 1679482491;
		aBool301 = bool;
		aBool295 = bool_5_;
		anInt303 = -1730207905 * i_6_;
	}

}