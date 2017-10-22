package com.jagex;

public class SetClanNameChannelUpdate extends ClanChannelUpdate {

	ClanChannelUpdater updater;
	String name;

	SetClanNameChannelUpdate(ClanChannelUpdater updater) {
		this.updater = updater;
	}

	@Override
	void apply(ClanSettings settings) {
		settings.clanName = name;
	}

	@Override
	void decode(Buffer buffer) {
		name = buffer.readString();
		buffer.readInt();
	}

}