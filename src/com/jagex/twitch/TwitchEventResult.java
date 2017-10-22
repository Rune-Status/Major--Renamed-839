package com.jagex.twitch;

import com.jagex.Class527;

public class TwitchEventResult extends TwitchEvent {
	public int result;

	public TwitchEventResult(int type, int result) {
		super(type);
		this.result = result;
	}

	@Override
	public void method6186(int[] ints, long[] longs, Object[] objects) {
		ints[0] = eventType;
		ints[1] = result;
	}

	@Override
	public Class527 method6187() {
		return Class527.aClass527_7220;
	}

}