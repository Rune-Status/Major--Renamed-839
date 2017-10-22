package com.jagex;

public class TexturesPreference extends Preference {
	public static final int anInt10447 = 1;
	public static final int anInt10448 = 0;

	public TexturesPreference(int value, PreferenceManager manager) {
		super(value, manager);
	}

	public TexturesPreference(PreferenceManager manager) {
		super(manager);
	}

	@Override
	public int compatible(int value) {
		if (manager.getGame() == GameContext.RUNESCAPE) {
			if (value == 0 || manager.groundBlending.getValue() == 1) {
				return 1;
			}

			return 2;
		}

		return 3;
	}

	public int getValue() {
		return value * 1008789325;
	}

	public boolean supported() {
		return manager.getGame() == GameContext.RUNESCAPE;
	}

	public void validate() {
		if (manager.getGame() != GameContext.RUNESCAPE) {
			value = -200365691;
		}
		if (value * 1008789325 != 0 && 1008789325 * value != 1) {
			value = defaultValue() * -200365691;
		}
	}

	@Override
	int defaultValue() {
		return 1;
	}

	@Override
	void set(int value) {
		this.value = -200365691 * value;
	}

}