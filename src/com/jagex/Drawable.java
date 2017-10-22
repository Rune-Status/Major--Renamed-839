package com.jagex;

import java.awt.Graphics;

public abstract class Drawable {
	static int compassIndex;

	static byte method4771(int i, int i_1_) {
		if (i != ObjectCategory.aClass541_7339.type * -1050493863) {
			return (byte) 0;
		} else if (0 == (i_1_ & 0x1)) {
			return (byte) 1;
		}

		return (byte) 2;
	}

	Class263 this$0;
	int offsetY;
	int offsetX;

	Drawable(Class263 class263, int offsetX, int offsetY) {
		this$0 = class263;
		this.offsetX = offsetX * 446344931;
		this.offsetY = 1603507659 * offsetY;
	}

	abstract void draw(Graphics graphics);

}