package com.jagex;

public class Class632_Sub21 extends Preference {
	static final int anInt10505 = 0;
	static final int anInt10506 = 1;
	static final int anInt10507 = 3;

	public Class632_Sub21(PreferenceManager class480_sub36) {
		super(class480_sub36);
	}

	public Class632_Sub21(int i, PreferenceManager class480_sub36) {
		super(i, class480_sub36);
	}

	public int getValue() {
		return value * 1008789325;
	}

	public void validate() {
		if (1008789325 * value < 0 || value * 1008789325 > 3) {
			value = defaultValue() * -200365691;
		}
	}

	@Override
	int defaultValue() {
		return 1;
	}

	@Override
	int compatible(int value) {
		int i = manager.currentToolkit.getValue();
		if (!(1 == i || i == 3 || i == 5)) {
			return 3;
		}
		return 1;
	}

	@Override
	void set(int value) {
		this.value = -200365691 * value;
	}

}