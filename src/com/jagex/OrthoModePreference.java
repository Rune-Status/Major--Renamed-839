package com.jagex;

public class OrthoModePreference extends Preference {
	static final int anInt10500 = 0;
	static final int anInt10501 = 2;

	public static void method16569() {
		Class166_Sub3.aShort9532 = Client.aShort10902;
		VarpDefinitionLoader.aShort10931 = Client.aShort10885;
		Class163.aShort1912 = Client.aShort10626;
		Class163.aShort1903 = Client.aShort10758;
		Class163.aBool1910 = true;
		Class163.anInt1916 = TurnMobCutsceneAction.aClass186_9434.method3719() * -63563923;
		if (Class163.anInt1905 * 730096251 != 0 && 1073481489 * Class163.anInt1908 != 0) {
			Client.aShort10626 = (short) 334;
			Client.aShort10758 = (short) 334;
			Client.aShort10885 = Client.aShort10902 = (short) (Class163.anInt1905 * 147125760 / (1073481489 * Class163.anInt1908));
		}
	}

	public OrthoModePreference(PreferenceManager manager) {
		super(manager);
	}

	public OrthoModePreference(int value, PreferenceManager manager) {
		super(value, manager);
	}

	@Override
	public int compatible(int value) {
		if (value == 2) {
			return 2;
		}
		return 1;
	}

	public boolean supported() {
		return true;
	}

	public int getValue() {
		return 1008789325 * value;
	}

	public void validate() {
		if (1008789325 * value < 0 || value * 1008789325 > 2) {
			value = defaultValue() * -200365691;
		}
	}

	@Override
	int defaultValue() {
		return 0;
	}

	@Override
	void set(int value) {
		this.value = value * -200365691;
	}

}