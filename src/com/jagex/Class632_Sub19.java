package com.jagex;

import java.io.File;

public class Class632_Sub19 extends Preference {
	static File aFile10502;

	public Class632_Sub19(int value, PreferenceManager manager) {
		super(value, manager);
	}

	public Class632_Sub19(PreferenceManager manager) {
		super(manager);
	}

	public int getValue() {
		return 1008789325 * value;
	}

	public void validate() {

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