package com.jagex;

public class Class480_Sub14_Sub4 extends ClanChannelUpdate {
	static boolean method17540() {
		Class31.loginType = 780098303;
		Class31.activeConnection = Client.gameConnection;
		return Class110.method2024(Class31.accountName * -3559573875977646889L == -1L, true, "", "",
				-3559573875977646889L * Class31.accountName);
	}

	ClanChannelUpdater updater;
	int value;
	int start;
	int end;
	int id;

	Class480_Sub14_Sub4(ClanChannelUpdater updater) {
		this.updater = updater;
		id = 1743725473;
	}

	@Override
	void apply(ClanSettings settings) {
		settings.method5352(id * -1135837281, value * 1583468329, -391467231 * start, -327954735 * end);
	}

	@Override
	void decode(Buffer buffer) {
		id = buffer.readUShort() * -1743725473;
		value = buffer.readInt() * 707149081;
		start = buffer.readUByte() * 1042126049;
		end = buffer.readUByte() * -931313103;
	}

}