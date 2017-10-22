package com.jagex;

public abstract class DelegatingDisplay extends Display {

	public abstract int draw();

	public abstract int draw(int x, int y);

	abstract void setDimensions(int width, int height);

}