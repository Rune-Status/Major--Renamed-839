package com.jagex;

public class SafeModePreference extends Preference {
	public static final int anInt10530 = 3;
	public static final int anInt10531 = 0;
	public static final int anInt10532 = 1;
	public static final int anInt10533 = 4;
	public static final int anInt10534 = 5;
	static final int anInt10529 = 2;

	public SafeModePreference(int value, PreferenceManager manager) {
		super(value, manager);
	}

	public SafeModePreference(PreferenceManager manager) {
		super(manager);
	}

	public int getValue() {
		return 1008789325 * value;
	}

	public void validate() {
		if (1008789325 * value < 0 || value * 1008789325 > 5 || value * 1008789325 == 2) {
			value = defaultValue() * -200365691;
		}
	}

	@Override
	int compatible(int value) {
		return 1;
	}

	@Override
	int defaultValue() {
		return 0;
	}

	@Override
	void set(int value) {
		this.value = value * -200365691;
	}

}