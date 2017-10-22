package com.jagex;

public class SkyboxesPreference extends Preference {

	public static final int MAX_VALUE = 1;
	public static final int MIN_VALUE = 0;

	public SkyboxesPreference(int value, PreferenceManager manager) {
		super(value, manager);
	}

	public SkyboxesPreference(PreferenceManager manager) {
		super(manager);
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
		if (1008789325 * value < MIN_VALUE || 1008789325 * value > MAX_VALUE) {
			value = defaultValue() * -200365691;
		}
	}

	@Override
	int defaultValue() {
		return 1;
	}

	@Override
	void set(int value) {
		this.value = -200365691 * value;
	}

}