package com.jagex;

public class FogPreference extends Preference {
	public static final int anInt10490 = 1;
	public static final int anInt10491 = 0;

	static int getChildSize(Archive archive, ConfigEntry config) {
		if (null != archive) {
			if (config.getTypeSize() > 1) {
				int entries = archive.entryCount() - 1;
				return entries * config.getTypeSize() + archive.childSize(entries);
			}

			return archive.childSize(config.entry * 1179768225);
		}

		return 0;
	}

	public FogPreference(int value, PreferenceManager manager) {
		super(value, manager);
	}

	public FogPreference(PreferenceManager manager) {
		super(manager);
	}

	@Override
	public int compatible(int value) {
		if (0 != value && manager.orthoMode.getValue() == 2) {
			return 3;
		} else if (0 == value || manager.groundBlending.getValue() == 1) {
			return 1;
		}
		return 2;
	}

	public int getValue() {
		return 1008789325 * value;
	}

	public boolean supported() {
		return true;
	}

	public void validate() {
		if (value * 1008789325 != 0 && manager.groundBlending.getValue() != 1) {
			value = 0;
		}
		if (0 != 1008789325 * value && manager.orthoMode.getValue() == 2) {
			value = 0;
		}
		if (value * 1008789325 < 0 || value * 1008789325 > 1) {
			value = defaultValue() * -200365691;
		}
	}

	@Override
	int defaultValue() {
		return 1;
	}

	@Override
	void set(int value) {
		this.value = value * -200365691;
	}

}