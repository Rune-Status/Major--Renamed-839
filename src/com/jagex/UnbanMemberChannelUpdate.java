package com.jagex;

public class UnbanMemberChannelUpdate extends ClanChannelUpdate {
	ClanChannelUpdater updater;
	int index;

	UnbanMemberChannelUpdate(ClanChannelUpdater updater) {
		this.updater = updater;
		index = -1647148557;
	}

	@Override
	void apply(ClanSettings settings) {
		settings.unban(2104885445 * index);
	}

	@Override
	void decode(Buffer buffer) {
		index = buffer.readUShort() * 1647148557;
	}

}