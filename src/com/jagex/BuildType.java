package com.jagex;

public class BuildType {
	public static BuildType BUILDLIVE = new BuildType("BUILDLIVE", 3);
	public static BuildType LIVE = new BuildType("LIVE", 0);
	public static BuildType RC = new BuildType("RC", 1);
	public static BuildType WIP = new BuildType("WIP", 2);
	static BuildType INTBETA = new BuildType("INTBETA", 4);

	static BuildType[] values() {
		return new BuildType[] { BUILDLIVE, WIP, INTBETA, RC, LIVE };
	}

	public String name;

	public int value;
	static BuildType active;

	BuildType(String name, int value) {
		this.name = name;
		this.value = -2028638397 * value;
	}

	public static BuildType valueOf(int value) {
		for (BuildType type : values()) {
			if (-1060235925 * type.value == value) {
				return type;
			}
		}
		return null;
	}

}