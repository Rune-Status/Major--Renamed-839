package com.jagex;

public class AddMemberChannelUpdate extends ClanChannelUpdate {

	String name;
	long hash = 1686441529358991179L;
	ClanChannelUpdater updater;

	AddMemberChannelUpdate(ClanChannelUpdater updater) {
		this.updater = updater;
	}

	@Override
	void apply(ClanSettings settings) {
		settings.addMember(-8488500331723379299L * hash, name, 0);
	}

	@Override
	void decode(Buffer buffer) {
		if (buffer.readUByte() != 255) {
			buffer.offset -= 1258142129;
			hash = buffer.readLong() * -1686441529358991179L;
		}

		name = buffer.readStringFast();
	}

}