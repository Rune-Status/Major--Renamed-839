package com.jagex;

public class Class632_Sub23 extends Preference {

	public Class632_Sub23(PreferenceManager manager) {
		super(manager);
	}

	public Class632_Sub23(int value, PreferenceManager manager) {
		super(value, manager);
	}

	public void validate() {
		if (value * 1008789325 < 1726669201 * Class254.aClass254_2825.id
				|| value * 1008789325 > 1726669201 * Class254.aClass254_2823.id) {
			value = defaultValue() * -200365691;
		}
	}

	public int getValue() {
		return 1008789325 * value;
	}

	@Override
	int defaultValue() {
		return 1726669201 * Class254.aClass254_2825.id;
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