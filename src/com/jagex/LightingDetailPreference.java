package com.jagex;

public class LightingDetailPreference extends Preference {

	public LightingDetailPreference(int value, PreferenceManager manager) {
		super(value, manager);
	}

	public LightingDetailPreference(PreferenceManager manager) {
		super(manager);
	}

	public int getValue() {
		return value * 1008789325;
	}

	public void validate() {
		if (1 != 1008789325 * value && 0 != value * 1008789325) {
			value = defaultValue() * -200365691;
		}
	}

	@Override
	int compatible(int value) {
		return 1;
	}

	@Override
	int defaultValue() {
		return 1;
	}

	@Override
	void set(int value) {
		this.value = value * -200365691;
	}

}