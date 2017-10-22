package com.jagex;

public interface InputSubscriber {

	boolean valid(MouseRecord mouse, KeyRecord[] keys, int maximumHeldKeys, KeyRecorder recorder);

}