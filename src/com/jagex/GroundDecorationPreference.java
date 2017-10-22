package com.jagex;

public class GroundDecorationPreference extends Preference {
	public static final int anInt10492 = 0;
	public static final int anInt10493 = 1;

	public GroundDecorationPreference(PreferenceManager manager) {
		super(manager);
	}

	public GroundDecorationPreference(int value, PreferenceManager manager) {
		super(value, manager);
	}

	@Override
	public int compatible(int value) {
		if (manager.getGame() == GameContext.RUNESCAPE) {
			return 1;
		}
		return 3;
	}

	public void validate() {
		if (manager.getGame() != GameContext.RUNESCAPE) {
			value = -200365691;
		}
		if (0 != 1008789325 * value && 1 != 1008789325 * value) {
			value = defaultValue() * -200365691;
		}
	}

	public boolean supported() {
		return manager.getGame() == GameContext.RUNESCAPE;
	}

	public int getValue() {
		return value * 1008789325;
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