package com.jagex;

public class Class632_Sub26 extends Preference {
	static final int anInt10517 = -3;
	static final int anInt10518 = -2;

	public Class632_Sub26(PreferenceManager manager) {
		super(manager);
	}

	public Class632_Sub26(int value, PreferenceManager manager) {
		super(value, manager);
	}

	public void validate() {
		if (1008789325 * value < -3) {
			value = defaultValue() * -200365691;
		}
	}

	public int getValue() {
		return value * 1008789325;
	}

	@Override
	int defaultValue() {
		return -2;
	}

	@Override
	int compatible(int value) {
		return 3;
	}

	@Override
	void set(int value) {
		this.value = value * -200365691;
	}

}