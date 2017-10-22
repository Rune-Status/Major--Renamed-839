package com.jagex;

public class HeldKeyInputSubscriber implements InputSubscriber {

	public static HeldKeyInputSubscriber decode(Buffer buffer) {
		int count = buffer.readUByte();
		int[] keys = new int[count];

		for (int index = 0; index < count; index++) {
			keys[index] = buffer.readUByte();
		}

		return new HeldKeyInputSubscriber(keys);
	}

	static void method9417() {
		Class197.method3862();
	}

	int[] requiredKeys;

	HeldKeyInputSubscriber(int[] keys) {
		requiredKeys = keys;
	}

	@Override
	public boolean valid(MouseRecord mouse, KeyRecord[] keys, int maximumHeldKeys, KeyRecorder recorder) {
		for (int key : requiredKeys) {
			if (!recorder.held(key)) {
				return false;
			}
		}

		return true;
	}

}