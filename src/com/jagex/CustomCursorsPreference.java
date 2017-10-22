package com.jagex;

public class CustomCursorsPreference extends Preference {
	public static final int anInt10581 = 1;
	public static final int anInt10582 = 0;

	public CustomCursorsPreference(int value, PreferenceManager manager) {
		super(manager);
	}

	public CustomCursorsPreference(PreferenceManager manager) {
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
		this.value = -200365691 * value;
	}

}