package com.jagex;

public abstract class Preference {

	public static final int anInt8067 = 3;
	protected static final int anInt8068 = 1;
	protected static final int anInt8071 = 2;
	public static int anInt8072;
	static int cameraViewY;
	protected int value;
	protected PreferenceManager manager;

	Preference(PreferenceManager manager) {
		this.manager = manager;
		value = defaultValue() * -200365691;
	}

	Preference(int value, PreferenceManager manager) {
		this.value = value * -200365691;
		this.manager = manager;
	}

	abstract int defaultValue();

	abstract int compatible(int value);

	void setIfCompatible(int value) {
		if (compatible(value) != 3) {
			set(value);
		}
	}

	abstract void set(int value);

}