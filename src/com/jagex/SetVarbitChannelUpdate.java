package com.jagex;

public class SetVarbitChannelUpdate extends ClanChannelUpdate {

	int value;
	int start;
	int end;
	int id;
	ClanChannelUpdater updater;

	SetVarbitChannelUpdate(ClanChannelUpdater updater) {
		this.updater = updater;
	}

	@Override
	void apply(ClanSettings settings) {
		settings.setVarbit(id * 633250727, value * -1297632741, start * 1271517567, -2117295131 * end);
	}

	@Override
	void decode(Buffer buffer) {
		id = buffer.readInt() * -1610623977;
		value = buffer.readInt() * -1706698733;
		start = buffer.readUByte() * 1046736511;
		end = buffer.readUByte() * 2072044013;
	}

}