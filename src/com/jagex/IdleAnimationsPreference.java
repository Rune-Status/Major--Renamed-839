package com.jagex;

import com.jagex.twitch.TwitchTV;

public class IdleAnimationsPreference extends Preference {
	public static final int anInt10497 = 1;
	static final int anInt10498 = 2;
	public static final int anInt10499 = 0;

	public static int method16557() {
		if (!TwitchTV.isStreaming()) {
			return 0;
		}
		return -1882911283 * Class533.anInt7279;
	}

	static void method16558() {
		BaseVariableBitsDefinitionProvider.anIntArray3291 = Class481.method8209(2048, 35, 8, 8, 4, 0.4F, true);
	}

	public IdleAnimationsPreference(PreferenceManager manager) {
		super(manager);
	}

	public IdleAnimationsPreference(int value, PreferenceManager manager) {
		super(value, manager);
	}

	public void validate() {
		if (manager.getGame() == GameContext.STELLAR_DAWN) {
			value = -400731382;
		}
		if (1008789325 * value < 0 || value * 1008789325 > 2) {
			value = defaultValue() * -200365691;
		}
	}

	public int getValue() {
		return 1008789325 * value;
	}

	@Override
	int defaultValue() {
		return 1;
	}

	@Override
	int compatible(int value) {
		return 1;
	}

	@Override
	void set(int value) {
		this.value = value * -200365691;
	}

}