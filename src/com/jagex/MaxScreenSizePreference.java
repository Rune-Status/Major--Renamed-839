package com.jagex;

public class MaxScreenSizePreference extends Preference {
	public static final int anInt10494 = 2;
	public static final int anInt10495 = 1;
	public static final int anInt10496 = 0;

	public MaxScreenSizePreference(int value, PreferenceManager manager) {
		super(value, manager);
	}

	public MaxScreenSizePreference(PreferenceManager manager) {
		super(manager);
	}

	@Override
	public int compatible(int value) {
		return 1;
	}

	public int getValue() {
		return 1008789325 * value;
	}

	public boolean supported() {
		return true;
	}

	public void validate() {
		if (1008789325 * value < 0 || 1008789325 * value > 2) {
			value = defaultValue() * -200365691;
		}
	}

	@Override
	int defaultValue() {
		int toolkit = manager.currentToolkit.getValue();
		if (manager.currentToolkit.isLive() && (0 == toolkit || 2 == toolkit)) {
			return 1;
		}

		return 0;
	}

	@Override
	void set(int value) {
		this.value = value * -200365691;
	}

}