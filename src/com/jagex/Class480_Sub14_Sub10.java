package com.jagex;

public class Class480_Sub14_Sub10 extends ClanChannelUpdate {
	String name;
	long hash;
	int anInt11231;
	ClanChannelUpdater updater;

	Class480_Sub14_Sub10(ClanChannelUpdater updater) {
		this.updater = updater;
		hash = -2846368014652360791L;
	}

	@Override
	void apply(ClanSettings settings) {
		settings.addMember(hash * 344801121092903783L, name, anInt11231 * 196976887);
	}

	@Override
	void decode(Buffer buffer) {
		if (buffer.readUByte() != 255) {
			buffer.offset -= 1258142129;
			hash = buffer.readLong() * 2846368014652360791L;
		}

		name = buffer.readStringFast();
		anInt11231 = buffer.readUShort() * -351330105;
	}

}