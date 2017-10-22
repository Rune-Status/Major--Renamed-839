package com.jagex;

public class SetMemberRankChannelUpdate extends ClanChannelUpdate {
	public static Archive worldMap;

	byte rank;
	ClanChannelUpdater updater;
	int index;

	SetMemberRankChannelUpdate(ClanChannelUpdater updater) {
		this.updater = updater;
		index = 2108025647;
	}

	@Override
	void apply(ClanSettings settings) {
		settings.setRank(index * -1003305935, rank);
	}

	@Override
	void decode(Buffer buffer) {
		index = buffer.readUShort() * -2108025647;
		rank = buffer.readByte();
	}

}