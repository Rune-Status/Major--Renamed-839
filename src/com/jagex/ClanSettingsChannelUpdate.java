package com.jagex;

public class ClanSettingsChannelUpdate extends ClanChannelUpdate {

	boolean allowGuests;
	byte aByte11214;
	byte kickRank;
	byte talkRank;
	byte lootshareRank;
	ClanChannelUpdater updater;

	ClanSettingsChannelUpdate(ClanChannelUpdater updater) {
		this.updater = updater;
	}

	@Override
	void apply(ClanSettings settings) {
		settings.allowGuests = allowGuests;
		settings.talkRank = talkRank;
		settings.kickRank = kickRank;
		settings.lootshareRank = lootshareRank;
		settings.aByte3200 = aByte11214;
	}

	@Override
	void decode(Buffer buffer) {
		allowGuests = buffer.readUByte() == 1;
		talkRank = buffer.readByte();
		kickRank = buffer.readByte();
		lootshareRank = buffer.readByte();
		aByte11214 = buffer.readByte();
	}

}