package com.jagex;

public class BrightnessPreference extends Preference {

	public BrightnessPreference(int value, PreferenceManager manager) {
		super(value, manager);
	}

	public BrightnessPreference(PreferenceManager manager) {
		super(manager);
	}

	public int getValue() {
		return 1008789325 * value;
	}

	public void validate() {
		if (1008789325 * value < 0 || value * 1008789325 > 4) {
			value = defaultValue() * -200365691;
		}
	}

	@Override
	int compatible(int value) {
		return 1;
	}

	@Override
	int defaultValue() {
		return 3;
	}

	@Override
	void set(int value) {
		value = value * -200365691;
	}

}