package com.jagex;

public class DeleteMemberChannelUpdate extends ClanChannelUpdate {
	int index;
	ClanChannelUpdater updater;

	DeleteMemberChannelUpdate(ClanChannelUpdater updater) {
		this.updater = updater;
		index = -1102267989;
	}

	@Override
	void apply(ClanSettings settings) {
		settings.deleteMember(index * -470317315);
	}

	@Override
	void decode(Buffer buffer) {
		index = buffer.readUShort() * 1102267989;
	}

}