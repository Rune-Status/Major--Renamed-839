package com.jagex.twitch;

import com.jagex.Class527;

public class TwitchEventChatMessage extends TwitchEvent {
	public String name;
	public String message;
	public int nameColourARGB;
	public int modes;
	public int subscriptions;
	public boolean isAction;

	public TwitchEventChatMessage(int type, String name, String message, int nameColourARGB, int modes,
			int subscriptions, boolean isAction) {
		super(type);
		this.name = name;
		this.message = message;
		this.nameColourARGB = nameColourARGB;
		this.modes = modes;
		this.subscriptions = subscriptions;
		this.isAction = isAction;
	}

	@Override
	public void method6186(int[] ints, long[] longs, Object[] objects) {
		objects[0] = name;
		objects[1] = message;
	}

	@Override
	public Class527 method6187() {
		return Class527.aClass527_7219;
	}

}