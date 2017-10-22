package com.jagex;

public final class InputSubscriberUtils {

	public InputSubscriberUtils() {
		throw new AssertionError();
	}

	public static InputSubscriber decode(Buffer buffer) {
		InputSubscriberType type = InputSubscriberType.valueOf(buffer.readUByte());
		if (InputSubscriberType.COMBINED == type) {
			return CombinedInputSubscriber.decode(buffer);
		} else if (InputSubscriberType.KEY_PRESS == type) {
			return PressedKeyInputSubscriber.decode(buffer);
		} else if (type == InputSubscriberType.KEY_HOLD) {
			return HeldKeyInputSubscriber.decode(buffer);
		}

		return null;
	}

}