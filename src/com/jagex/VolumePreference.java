package com.jagex;

public class VolumePreference extends Preference {
	static final int MINIMUM_VALUE = 0;
	static final int MAXIMUM_VALUE = 255;

	static final void method16788(Widget class226, Interface class221, ScriptExecutionContext context, int i) {
		String string = (String) context.anObjectArray7918[(context.anInt7929 -= -1356601931) * 211787933];
		if (ScriptExecutionContext.method9239(string, context) != null) {
			string = string.substring(0, string.length() - 1);
		}
		class226.anObjectArray2494 = Class562_Sub1.method16248(string, context);
		class226.aBool2483 = true;
	}

	public VolumePreference(int value, PreferenceManager manager) {
		super(value, manager);
	}

	public VolumePreference(PreferenceManager manager) {
		super(manager);
	}

	public int getValue() {
		return 1008789325 * value;
	}

	public void validate() {
		if (1008789325 * value < MINIMUM_VALUE && 1008789325 * value > MAXIMUM_VALUE) {
			value = defaultValue() * -200365691;
		}
	}

	@Override
	int compatible(int value) {
		return 1;
	}

	@Override
	int defaultValue() {
		return 127;
	}

	@Override
	void set(int value) {
		this.value = -200365691 * value;
	}

}