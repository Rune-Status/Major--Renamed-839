package com.jagex;

public class InputSubscriberType {

	static InputSubscriberType COMBINED = new InputSubscriberType(0);
	static InputSubscriberType KEY_HOLD = new InputSubscriberType(2);
	static InputSubscriberType KEY_PRESS = new InputSubscriberType(1);

	static InputSubscriberType valueOf(int id) {
		InputSubscriberType[] types = InputSubscriberType.values();
		for (InputSubscriberType type : types) {
			if (-1526667407 * type.id == id) {
				return type;
			}
		}

		return null;
	}

	static InputSubscriberType[] values() {
		return new InputSubscriberType[] { COMBINED, KEY_PRESS, KEY_HOLD };
	}

	int id;

	InputSubscriberType(int id) {
		this.id = id * 1331755409;
	}

}