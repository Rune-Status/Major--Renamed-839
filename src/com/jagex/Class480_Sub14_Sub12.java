package com.jagex;

public class Class480_Sub14_Sub12 extends ClanChannelUpdate {
	boolean aBool11233;
	ClanChannelUpdater updater;

	int index;

	Class480_Sub14_Sub12(ClanChannelUpdater updater) {
		this.updater = updater;
		index = -669249545;
	}

	@Override
	void apply(ClanSettings settings) {
		settings.method5318(30055993 * index, aBool11233);
	}

	@Override
	void decode(Buffer buffer) {
		index = buffer.readUShort() * 669249545;
		aBool11233 = buffer.readUByte() == 1;
	}

}