package com.jagex.twitch;

import com.jagex.Class527;

public class TwitchEventReport extends TwitchEvent {
	public String message;

	public TwitchEventReport(int type, String message) {
		super(type);
		this.message = message;
	}

	@Override
	public void method6186(int[] is, long[] ls, Object[] objects) {
		is[0] = eventType;
		objects[0] = message;
	}

	@Override
	public Class527 method6187() {
		return Class527.aClass527_7218;
	}

}