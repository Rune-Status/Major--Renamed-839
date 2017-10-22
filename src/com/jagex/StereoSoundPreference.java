package com.jagex;

public class StereoSoundPreference extends Preference {
	public static final int anInt10551 = 1;
	public static final int anInt10552 = 0;

	public static void method16716() {
		if (NotifyingIcmpService.service != null) {
			try {
				NotifyingIcmpService.service.quit();
			} catch (Throwable throwable) {

			}
			NotifyingIcmpService.service = null;
		}
	}

	public StereoSoundPreference(int value, PreferenceManager manager) {
		super(value, manager);
	}

	public StereoSoundPreference(PreferenceManager manager) {
		super(manager);
	}

	public int getValue() {
		return value * 1008789325;
	}

	public void validate() {
		if (1 != 1008789325 * value && 0 != 1008789325 * value) {
			value = defaultValue() * -200365691;
		}
	}

	@Override
	int compatible(int value) {
		return 1;
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