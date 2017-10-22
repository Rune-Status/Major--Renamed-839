package com.jagex.twitch;

import com.jagex.Class527;

public abstract class TwitchEvent {
	public int eventType;

	public TwitchEvent(int type) {
		eventType = type;
	}

	public abstract void method6186(int[] ints, long[] longs, Object[] objects);

	public abstract Class527 method6187();

}