package com.jagex;

public class BanMemberChannelUpdate extends ClanChannelUpdate {
	ClanChannelUpdater updater;
	String name;

	long hash;

	BanMemberChannelUpdate(ClanChannelUpdater updater) {
		this.updater = updater;
		hash = -3821166119096873507L;
		name = null;
	}

	@Override
	void apply(ClanSettings settings) {
		settings.ban(hash * -8963443443869004405L, name);
	}

	@Override
	void decode(Buffer buffer) {
		if (buffer.readUByte() != 255) {
			buffer.offset -= 1258142129;
			hash = buffer.readLong() * 3821166119096873507L;
		}

		name = buffer.readStringFast();
	}

}