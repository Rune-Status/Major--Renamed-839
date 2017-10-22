package com.jagex;

public class RemoveRoofsPreference extends Preference {
	public static final int anInt10508 = 3;
	public static final int anInt10509 = 1;
	public static final int anInt10510 = 2;
	public static final int anInt10511 = 0;

	public RemoveRoofsPreference(int value, PreferenceManager manager) {
		super(value, manager);
	}

	public RemoveRoofsPreference(PreferenceManager manager) {
		super(manager);
	}

	public int getValue() {
		return 1008789325 * value;
	}

	public void validate() {
		if (manager.orthoMode.getValue() == 2 && 2 == value * 1008789325) {
			value = -200365691;
		}
		if (1008789325 * value < 0 || value * 1008789325 > 3) {
			value = defaultValue() * -200365691;
		}
	}

	@Override
	int compatible(int value) {
		return 1;
	}

	@Override
	int defaultValue() {
		return 2;
	}

	@Override
	void set(int value) {
		this.value = value * -200365691;
	}

}