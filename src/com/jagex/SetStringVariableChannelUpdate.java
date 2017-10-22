package com.jagex;

public class SetStringVariableChannelUpdate extends ClanChannelUpdate {
	ClanChannelUpdater updater;
	int id;
	String value;

	SetStringVariableChannelUpdate(ClanChannelUpdater updater) {
		this.updater = updater;
	}

	@Override
	void apply(ClanSettings settings) {
		settings.setStringVariable(id * 1558838131, value);
	}

	@Override
	void decode(Buffer buffer) {
		id = buffer.readInt() * -976838213;
		value = buffer.readString();
	}

}