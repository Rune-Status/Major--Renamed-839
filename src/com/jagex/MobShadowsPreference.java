package com.jagex;

public class MobShadowsPreference extends Preference {
	public static final int anInt10473 = 1;
	public static final int anInt10474 = 0;
	static int anInt10475;

	public MobShadowsPreference(PreferenceManager manager) {
		super(manager);
	}

	public MobShadowsPreference(int value, PreferenceManager manager) {
		super(value, manager);
	}

	@Override
	public int compatible(int value) {
		return 1;
	}

	public boolean supported() {
		return true;
	}

	public void validate() {
		if (value * 1008789325 != 1 && 0 != value * 1008789325) {
			value = defaultValue() * -200365691;
		}
	}

	public int getValue() {
		return value * 1008789325;
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