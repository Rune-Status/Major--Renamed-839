package com.jagex;

public class FlickeringEffectsPreference extends Preference {
	public static final int anInt10449 = 0;
	public static final int anInt10450 = 1;

	public FlickeringEffectsPreference(int value, PreferenceManager manager) {
		super(value, manager);
	}

	public FlickeringEffectsPreference(PreferenceManager manager) {
		super(manager);
	}

	public int getValue() {
		return value * 1008789325;
	}

	public void validate() {
		if (value * 1008789325 != 1 && 1008789325 * value != 0) {
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