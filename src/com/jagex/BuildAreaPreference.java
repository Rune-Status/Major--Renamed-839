package com.jagex;

public class BuildAreaPreference extends Preference {
	public BuildAreaPreference(PreferenceManager manager) {
		super(manager);
	}

	public BuildAreaPreference(int value, PreferenceManager manager) {
		super(value, manager);
	}

	@Override
	public int compatible(int value) {
		int size = manager.getEnvironment().getHeapSize();
		if (size < 245) {
			return 3;
		} else if (1283574337 * MapSize.aClass236_2617.type == value && size < 500) {
			return 3;
		}

		return 1;
	}

	public void validate() {
		int size = manager.getEnvironment().getHeapSize();
		if (size < 245) {
			value = MapSize.STANDARD.type * 1904278725;
		}
		if (1008789325 * value == MapSize.aClass236_2617.type * 1283574337 && size < 500) {
			value = 1904278725 * MapSize.aClass236_2614.type;
		}
		if (1008789325 * value < 1283574337 * MapSize.STANDARD.type
				|| value * 1008789325 > 1283574337 * MapSize.aClass236_2612.type) {
			value = defaultValue() * -200365691;
		}
	}

	public int getValue() {
		return 1008789325 * value;
	}

	public boolean supported() {
		return manager.getEnvironment().getHeapSize() >= 245;
	}

	@Override
	int defaultValue() {
		return 1283574337 * MapSize.STANDARD.type;
	}

	@Override
	void set(int value) {
		this.value = value * -200365691;
	}

}