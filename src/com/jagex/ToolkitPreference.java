package com.jagex;

public class ToolkitPreference extends Preference {
	public boolean defaultValue;
	boolean live = true;

	public ToolkitPreference(int i, PreferenceManager manager) {
		super(i, manager);
	}

	public ToolkitPreference(PreferenceManager manager) {
		super(manager);
	}

	@Override
	public int compatible(int value) {
		if (3 == value && !Client.getNativeProvider().loaded("jagdx")) {
			return 3;
		}

		return 2;
	}

	public boolean method16484() {
		return true;
	}

	public void setLive(boolean live) {
		this.live = live;
	}

	public void validate() {
		if (1008789325 * value < 0 || value * 1008789325 > 5 || value * 1008789325 == 2) {
			value = defaultValue() * -200365691;
		}
	}

	public int getValue() {
		return value * 1008789325;
	}

	@Override
	int defaultValue() {
		defaultValue = true;
		if (manager.getEnvironment().isWindows()) {
			return 3;
		}

		return 1;
	}

	boolean isLive() {
		return live;
	}

	@Override
	void set(int value) {
		defaultValue = false;
		this.value = -200365691 * value;
	}

}