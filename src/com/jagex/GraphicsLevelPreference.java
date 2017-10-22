package com.jagex;

public class GraphicsLevelPreference extends Preference {
	public static final int anInt10468 = 0;
	public static final int anInt10469 = 3;
	public static final int anInt10470 = 2;
	public static final int anInt10471 = 1;
	public static final int anInt10472 = 4;

	public GraphicsLevelPreference(PreferenceManager manager) {
		super(manager);
	}

	public GraphicsLevelPreference(int value, PreferenceManager manager) {
		super(value, manager);
	}

	public void validate() {
		if (value * 1008789325 < 0 || 1008789325 * value > 4) {
			value = defaultValue() * -200365691;
		}
	}

	public int getValue() {
		return 1008789325 * value;
	}

	@Override
	int defaultValue() {
		return 0;
	}

	@Override
	int compatible(int value) {
		return 1;
	}

	@Override
	void set(int value) {
		this.value = -200365691 * value;
	}
}
