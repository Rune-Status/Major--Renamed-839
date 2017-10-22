package com.jagex;

public class Class632_Sub11 extends Preference {
	public static final int anInt10483 = 0;
	public static final int anInt10484 = 1;

	public static void addUnnamedMessage(int type, String string) {
		Class176.addChatMessage(type, 0, "", "", "", string, null);
	}

	public Class632_Sub11(PreferenceManager manager) {
		super(manager);
	}

	public Class632_Sub11(int value, PreferenceManager manager) {
		super(value, manager);
	}

	@Override
	public int compatible(int value) {
		return 1;
	}

	public void validate() {
		if (1 != value * 1008789325 && 0 != value * 1008789325) {
			value = defaultValue() * -200365691;
		}
	}

	public int getValue() {
		return 1008789325 * value;
	}

	public boolean supported() {
		return true;
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