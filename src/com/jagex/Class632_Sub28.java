package com.jagex;

public class Class632_Sub28 extends Preference {
	public static final int anInt10521 = 0;
	static final int anInt10522 = 1;

	public Class632_Sub28(PreferenceManager manager) {
		super(manager);
	}

	public Class632_Sub28(int value, PreferenceManager manager) {
		super(value, manager);
	}

	public void validate() {
		if (0 != value * 1008789325 && 1 != value * 1008789325) {
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
	int compatible(int value) {
		return 1;
	}

	@Override
	void set(int value) {
		this.value = value * -200365691;
	}

}