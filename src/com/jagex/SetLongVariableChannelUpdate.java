package com.jagex;

public class SetLongVariableChannelUpdate extends ClanChannelUpdate {
	int id;
	long value;
	ClanChannelUpdater updater;

	SetLongVariableChannelUpdate(ClanChannelUpdater updater) {
		this.updater = updater;
	}

	@Override
	void apply(ClanSettings settings) {
		settings.setLongVariable(-1066086837 * id, value * -6940485725723062755L);
	}

	@Override
	void decode(Buffer buffer) {
		id = buffer.readInt() * -2088432797;
		value = buffer.readLong() * 7426748192176579637L;
	}

}