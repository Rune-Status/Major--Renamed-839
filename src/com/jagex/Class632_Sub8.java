package com.jagex;

public class Class632_Sub8 extends Preference {
	static final int MAX_VALUE = 4;
	static final int DEFAULT_VALUE = 1;
	static final int MIN_VALUE = 0;

	public Class632_Sub8(int value, PreferenceManager manager) {
		super(value, manager);
	}

	public Class632_Sub8(PreferenceManager manager) {
		super(manager);
	}

	@Override
	public int compatible(int value) {
		return 1;
	}

	public int getValue() {
		return value * 1008789325;
	}

	public boolean supported() {
		return true;
	}

	public void validate() {
		if (value * 1008789325 < MIN_VALUE || value * 1008789325 > MAX_VALUE) {
			value = defaultValue() * -200365691;
		}
	}

	@Override
	int defaultValue() {
		return DEFAULT_VALUE;
	}

	@Override
	void set(int value) {
		this.value = -200365691 * value;
	}

}