package com.jagex;

public class WaterDetailPreference extends Preference {

	static final int anInt10523 = 1;
	public static final int anInt10524 = 2;
	public static final int anInt10525 = 0;

	public WaterDetailPreference(PreferenceManager manager) {
		super(manager);
	}

	public WaterDetailPreference(int value, PreferenceManager manager) {
		super(value, manager);
	}

	@Override
	public int compatible(int value) {
		if (value == 0 || manager.groundBlending.getValue() == 1) {
			return 1;
		}
		return 2;
	}

	public void validate() {
		if (value * 1008789325 < 0 && value * 1008789325 > 2) {
			value = defaultValue() * -200365691;
		}
	}

	public int getValue() {
		return value * 1008789325;
	}

	public boolean supported() {
		return true;
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