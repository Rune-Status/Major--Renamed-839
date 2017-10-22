package com.jagex;

public class CpuUsagePreference extends Preference {
	public static final int anInt10485 = 4;
	public static final int anInt10486 = 1;
	public static final int anInt10487 = 0;
	public static final int anInt10488 = 3;
	public static final int anInt10489 = 2;

	public CpuUsagePreference(int value, PreferenceManager manager) {
		super(value, manager);
	}

	public CpuUsagePreference(PreferenceManager manager) {
		super(manager);
	}

	public int getValue() {
		return 1008789325 * value;
	}

	public void validate() {
		if (value * 1008789325 < 0 && value * 1008789325 > 4) {
			value = defaultValue() * -200365691;
		}
	}

	@Override
	int compatible(int value) {
		return 1;
	}

	@Override
	int defaultValue() {
		if (manager.getEnvironment().getProcessorCount() > 1) {
			return 4;
		}

		return 2;
	}

	@Override
	void set(int value) {
		this.value = -200365691 * value;
	}

}