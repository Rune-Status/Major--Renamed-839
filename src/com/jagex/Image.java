package com.jagex;

public abstract class Image {

	public abstract void clearOffsets();

	public abstract boolean isIndexed();

	public abstract int getWidth();

	public abstract int getHeight();

	public abstract int getOffsetX();

	public abstract int getDeltaWidth();

	public abstract int getOffsetY();

	public abstract int getDeltaHeight();

	public abstract int getScaleWidth();

	public abstract int getScaleHeight();

	public abstract void scale(int i);

	public abstract void setBorderColour(int colour);

	public abstract void setShadowColour(int colour);

	public abstract void flipVertical();

	public abstract void flipHorizontal();

	public abstract void rotateClockwise();

	public abstract int[] argb(boolean scale);

	public abstract int getColour(int x, int y);

	public abstract void offsetColour(int dr, int dg, int db);

	public abstract boolean hasAlpha();

}