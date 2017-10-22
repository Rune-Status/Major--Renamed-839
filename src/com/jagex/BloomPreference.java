package com.jagex;

public class BloomPreference extends Preference {
	public static final int anInt10519 = 1;
	public static final int anInt10520 = 0;

	public BloomPreference(PreferenceManager manager) {
		super(manager);
	}

	public BloomPreference(int value, PreferenceManager manager) {
		super(value, manager);
	}

	@Override
	public int compatible(int value) {
		int toolkit = manager.currentToolkit.getValue();
		return (1 == toolkit || toolkit == 3 || toolkit == 5) ? 1 : 3;
	}

	public int getValue() {
		return 1008789325 * value;
	}

	public boolean supported() {
		int toolkit = manager.currentToolkit.getValue();
		return 1 == toolkit || toolkit == 3 || toolkit == 5;
	}

	public void validate() {
		int toolkit = manager.currentToolkit.getValue();
		if (manager.currentToolkit.isLive() && (1 != toolkit && toolkit != 3 && toolkit != 5)) {
			value = 0;
		}

		if (1008789325 * value < 0 || value * 1008789325 > 1) {
			value = defaultValue() * -200365691;
		}
	}

	@Override
	int defaultValue() {
		return 0;
	}

	@Override
	void set(int value) {
		this.value = value * -200365691;
	}

}