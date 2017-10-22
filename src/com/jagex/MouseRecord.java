package com.jagex;

public abstract class MouseRecord extends Linkable {

	public static final int MOVE_TYPE = -1;
	public static final int WHEEL_TYPE = 6;
	public static final int LEFT_BUTTON_DOWN_TYPE = 0;
	public static final int RIGHT_BUTTON_DOWN_TYPE = 2;
	static final int MIDDLE_BUTTON_UP_TYPE = 4;
	static final int LEFT_BUTTON_UP_TYPE = 3;
	static final int MIDDLE_BUTTON_DOWN_TYPE = 1;
	static final int RIGHT_BUTTON_UP_TYPE = 5;

	public abstract void cache();

	public abstract int getMeta();

	public abstract long getTime();

	public abstract int getClickType();

	public abstract int getX();

	public abstract int getY();

}