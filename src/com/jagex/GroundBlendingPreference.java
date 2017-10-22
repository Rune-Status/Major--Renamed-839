package com.jagex;

public class GroundBlendingPreference extends Preference {
	public static final int anInt10479 = 1;
	public static final int anInt10480 = 0;

	static final void method16480(ScriptExecutionContext class613, int i) {
		String string = (String) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
		Client.addFriend(string);
	}

	public GroundBlendingPreference(int value, PreferenceManager manager) {
		super(value, manager);
	}

	public GroundBlendingPreference(PreferenceManager manager) {
		super(manager);
	}

	@Override
	public int compatible(int value) {
		if (manager.getGame() == GameContext.RUNESCAPE) {
			if (value == 0) {
				if (manager.fog.getValue() == 1) {
					return 2;
				} else if (manager.textures.getValue() == 1) {
					return 2;
				} else if (manager.water.getValue() > 0) {
					return 2;
				}
			}

			return 1;
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
		if (1008789325 * value != 0 && 1 != value * 1008789325) {
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