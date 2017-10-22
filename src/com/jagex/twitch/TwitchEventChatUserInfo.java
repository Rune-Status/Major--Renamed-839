package com.jagex.twitch;

import com.jagex.Class527;

public class TwitchEventChatUserInfo extends TwitchEvent {
	public String displayName;
	public int userState;
	public int nameColourARGB;
	public boolean ignore;
	public int modes;
	public int subscriptions;

	public TwitchEventChatUserInfo(int type, int userState, String name, int colour, boolean ignore, int modes,
			int subscriptions) {
		super(type);
		this.userState = userState;
		displayName = name;
		nameColourARGB = colour;
		this.ignore = ignore;
		this.modes = modes;
		this.subscriptions = subscriptions;
	}

	@Override
	public void method6186(int[] ints, long[] longs, Object[] objects) {

	}

	@Override
	public Class527 method6187() {
		return null;
	}
}
