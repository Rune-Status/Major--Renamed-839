package com.jagex;

public class SetIntVariableChannelUpdate extends ClanChannelUpdate {

	int value;
	ClanChannelUpdater updater;
	int id;

	SetIntVariableChannelUpdate(ClanChannelUpdater updater) {
		this.updater = updater;
	}

	@Override
	void apply(ClanSettings settings) {
		settings.setIntVariable(id * 1413814509, -1014815731 * value);
	}

	@Override
	void decode(Buffer buffer) {
		id = buffer.readInt() * 2019624165;
		value = buffer.readInt() * 812632773;
	}

}