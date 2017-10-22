package com.jagex;

import java.awt.Canvas;

public abstract class JavaDelegatingDisplay extends DelegatingDisplay {
	JavaToolkit toolkit;
	Canvas canvas;
	int width;
	int[] data;
	int height;
	float[] aFloatArray11115;
	boolean aBool11116;

	JavaDelegatingDisplay(JavaToolkit toolkit, Canvas canvas, int width, int height) {
		this.canvas = canvas;
		this.toolkit = toolkit;
		this.width = -1794240069 * width;
		this.height = height * 1430266757;
	}

	@Override
	public int getWidth() {
		return 1603341171 * width;
	}

	@Override
	public int getHeight() {
		return 1240882509 * height;
	}

	@Override
	final void setDimensions(int width, int height) {
		if (width != this.width * 1603341171 || this.height * 1240882509 != height) {
			this.width = -1794240069 * width;
			this.height = 1430266757 * height;
			init();
		}
	}

	void init() {
		data = new int[1240882509 * height * 1603341171 * width];
		aFloatArray11115 = new float[width * 1603341171 * height * 1240882509];

		if (aBool11116) {
			toolkit.method14132(1603341171 * width, 1240882509 * height, data, aFloatArray11115);
		}
	}

	@Override
	final boolean method3151() {
		aBool11116 = false;
		return true;
	}

	@Override
	final boolean method324() {
		toolkit.method14132(width * 1603341171, 1240882509 * height, data, aFloatArray11115);
		aBool11116 = true;
		return true;
	}

	static JavaDelegatingDisplay create(JavaToolkit toolkit, Canvas canvas, int width, int height) {
		return new JavaImageDelegatingDisplay(toolkit, canvas, width, height);
	}

}