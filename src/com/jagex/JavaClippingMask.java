package com.jagex;

public class JavaClippingMask extends ClippingMask {

	int[] widths;
	int[] offsets;

	JavaClippingMask(int[] offsets, int[] widths) {
		this.offsets = offsets;
		this.widths = widths;
	}

}