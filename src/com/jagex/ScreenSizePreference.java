package com.jagex;

public class ScreenSizePreference extends Preference {
	public static final int anInt10526 = 2;
	public static final int anInt10527 = 1;
	public static final int anInt10528 = 3;

	public ScreenSizePreference(int value, PreferenceManager manager) {
		super(value, manager);
	}

	public ScreenSizePreference(PreferenceManager manager) {
		super(manager);
	}

	public int getValue() {
		return value * 1008789325;
	}

	public void validate() {
		if (value * 1008789325 < 1 || value * 1008789325 > 3) {
			value = defaultValue() * -200365691;
		}
	}

	@Override
	int compatible(int value) {
		return 1;
	}

	@Override
	int defaultValue() {
		return manager.getEnvironment().isArm() ? 3 : 2;
	}

	@Override
	void set(int value) {
		this.value = value * -200365691;
	}

}