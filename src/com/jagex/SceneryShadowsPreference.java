package com.jagex;

public class SceneryShadowsPreference extends Preference {
	public static final int anInt10514 = 2;
	public static final int anInt10515 = 0;
	public static final int anInt10516 = 1;

	public SceneryShadowsPreference(int value, PreferenceManager manager) {
		super(value, manager);
	}

	public SceneryShadowsPreference(PreferenceManager manager) {
		super(manager);
	}

	@Override
	public int compatible(int value) {
		if (manager.textures.getValue() == 0) {
			return 3;
		}
		return 1;
	}

	public int getValue() {
		return value * 1008789325;
	}

	public boolean supported() {
		return manager.textures.getValue() != 0;
	}

	public void validate() {
		if (manager.textures.getValue() == 0) {
			value = 0;
		}

		if (1008789325 * value < 0 || value * 1008789325 > 2) {
			value = defaultValue() * -200365691;
		}
	}

	@Override
	int defaultValue() {
		return 2;
	}

	@Override
	void set(int value) {
		this.value = -200365691 * value;
	}

}