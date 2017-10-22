package com.jagex;

public class AntiAliasingPreference extends Preference {
	public static final int anInt10512 = 0;
	static final int anInt10513 = 2;

	public AntiAliasingPreference(PreferenceManager manager) {
		super(manager);
	}

	public AntiAliasingPreference(int value, PreferenceManager manager) {
		super(value, manager);
	}

	@Override
	public int compatible(int value) {
		int toolkit = manager.currentToolkit.getValue();
		return (1 == toolkit || toolkit == 3 || toolkit == 5) ? 1 : 3;
	}

	@Override
	public void set(int value) {
		this.value = -200365691 * value;
	}

	public void validate() {
		int toolkit = manager.currentToolkit.getValue();
		if (manager.currentToolkit.isLive() && !(1 == toolkit || toolkit == 3 || toolkit == 5)) {
			value = 0;
		}

		if (1008789325 * value < 0 || 1008789325 * value > 2) {
			value = defaultValue() * -200365691;
		}
	}

	public boolean supported() {
		int toolkit = manager.currentToolkit.getValue();
		return 1 == toolkit || toolkit == 3 || toolkit == 5;
	}

	public int getValue() {
		return value * 1008789325;
	}

	@Override
	int defaultValue() {
		return 0;
	}

}