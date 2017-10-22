package com.jagex;

public class ChecksumTableEntry {
	static FontSpecification aClass9_4512;

	public static void method6355(int i, boolean bool) {
		Class369.method6110(i, TranslatableString.LOADING_PLEASE_WAIT.translate(Client.currentLanguage), bool);
	}

	public static void method6356(int i, String name) {
		int count = -1784886003 * Class80.playerCount;
		int[] indices = Class80.playerIndices;
		boolean bool = false;

		for (int index = 0; index < count; index++) {
			Player player = Client.players[indices[index]];
			if (player != null && Client.localPlayer != player && null != player.accountName
					&& player.accountName.equalsIgnoreCase(name)) {
				OutgoingFrameMeta meta = null;
				if (i == 1) {
					meta = OutgoingFrameMeta.aClass366_3982;
				} else if (i == 2) {
					meta = OutgoingFrameMeta.aClass366_4023;
				} else if (3 == i) {
					meta = OutgoingFrameMeta.aClass366_3942;
				} else if (i == 4) {
					meta = OutgoingFrameMeta.aClass366_4021;
				} else if (5 == i) {
					meta = OutgoingFrameMeta.aClass366_3967;
				} else if (6 == i) {
					meta = OutgoingFrameMeta.aClass366_3975;
				} else if (7 == i) {
					meta = OutgoingFrameMeta.aClass366_3972;
				} else if (8 == i) {
					meta = OutgoingFrameMeta.aClass366_3965;
				} else if (9 == i) {
					meta = OutgoingFrameMeta.aClass366_3974;
				} else if (i == 10) {
					meta = OutgoingFrameMeta.aClass366_4028;
				}

				if (null != meta) {
					OutgoingFrame frame = OutgoingFrame.prepare(meta, Client.gameConnection.encryptor);
					frame.payload.writeShortA(indices[index]);
					frame.payload.writeByteS(0);
					Client.gameConnection.sendFrame(frame);
				}

				bool = true;
				break;
			}
		}

		if (!bool) {
			Class632_Sub11.addUnnamedMessage(4, TranslatableString.UNABLE_TO_FIND.translate(Client.currentLanguage)
					+ name);
		}
	}

	byte[] hash;
	int anInt4509;
	int version;
	int checksum;

	ChecksumTableEntry(int checksum, int i_0_, int version, int i_2_, byte[] hash) {
		this.checksum = checksum * 985332365;
		anInt4509 = i_0_ * 1779305693;
		this.version = version * -861215399;
		this.hash = hash;
	}

}