package com.jagex;

public class Class632_Sub33 extends Preference {
	public static final int anInt10567 = 1;
	static final int anInt10568 = 0;

	public Class632_Sub33(int value, PreferenceManager manager) {
		super(value, manager);
	}

	public Class632_Sub33(PreferenceManager manager) {
		super(manager);
	}

	public int getValue() {
		return value * 1008789325;
	}

	public void validate() {
		int toolkit = manager.desiredToolkit.getValue();
		if (toolkit != 3 && 5 != toolkit) {
			value = 0;
		}
		if (manager.getEnvironment().getProcessorCount() < 2) {
			value = 0;
		}
		if (value * 1008789325 != 0 && 1 != value * 1008789325) {
			value = defaultValue() * -200365691;
		}
	}

	@Override
	int compatible(int value) {
		if (value == 0) {
			return 1;
		} else if (manager.getEnvironment().getProcessorCount() < 2) {
			return 3;
		}

		int toolkit = manager.desiredToolkit.getValue();
		if (toolkit != 3 && 5 != toolkit) {
			return 3;
		}
		return 1;
	}

	@Override
	int defaultValue() {
		int toolkit = manager.desiredToolkit.getValue();
		if (toolkit != 3 && toolkit != 5) {
			return 0;
		}
		return 0;
	}

	@Override
	void set(int value) {
		this.value = value * -200365691;
	}

}