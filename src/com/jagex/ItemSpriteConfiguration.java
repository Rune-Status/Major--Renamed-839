package com.jagex;

public class ItemSpriteConfiguration implements Hashable {

	public static final int method13634(String string) {
		if (null == string || string.length() == 0) {
			return -1;
		}

		for (int index = 0; index < Client.ignoredPlayerCount * -1127325433; index++) {
			if (string.equalsIgnoreCase(Client.ignoredPlayers[index].name)) {
				return index;
			}
		}

		return -1;
	}

	int borderSize;
	int id;
	int amount;
	int toolkit;
	int shadowColour;
	int textType;
	boolean useAppearance;

	@Override
	public long hash() {
		long[] table = Buffer.CRC_64;
		long hash = -1L;

		hash = hash >>> 8 ^ table[(int) ((hash ^ toolkit * 1039851771) & 0xffL)];
		hash = hash >>> 8 ^ table[(int) ((hash ^ id * 1677354179 >> 8) & 0xffL)];
		hash = hash >>> 8 ^ table[(int) ((hash ^ id * 1677354179) & 0xffL)];
		hash = hash >>> 8 ^ table[(int) ((hash ^ 2077082863 * amount >> 24) & 0xffL)];
		hash = hash >>> 8 ^ table[(int) ((hash ^ amount * 2077082863 >> 16) & 0xffL)];
		hash = hash >>> 8 ^ table[(int) ((hash ^ 2077082863 * amount >> 8) & 0xffL)];
		hash = hash >>> 8 ^ table[(int) ((hash ^ 2077082863 * amount) & 0xffL)];
		hash = hash >>> 8 ^ table[(int) ((hash ^ borderSize * -1779753453) & 0xffL)];
		hash = hash >>> 8 ^ table[(int) ((hash ^ shadowColour * -2132895807 >> 24) & 0xffL)];
		hash = hash >>> 8 ^ table[(int) ((hash ^ -2132895807 * shadowColour >> 16) & 0xffL)];
		hash = hash >>> 8 ^ table[(int) ((hash ^ -2132895807 * shadowColour >> 8) & 0xffL)];
		hash = hash >>> 8 ^ table[(int) ((hash ^ -2132895807 * shadowColour) & 0xffL)];
		hash = hash >>> 8 ^ table[(int) ((hash ^ textType * 2048445349) & 0xffL)];
		hash = hash >>> 8 ^ table[(int) ((hash ^ (useAppearance ? 1 : 0)) & 0xffL)];

		return hash;
	}

	@Override
	public boolean equals(Hashable hashable) {
		if (!(hashable instanceof ItemSpriteConfiguration)) {
			return false;
		}

		ItemSpriteConfiguration class658_0_ = (ItemSpriteConfiguration) hashable;
		if (1039851771 * toolkit != class658_0_.toolkit * 1039851771) {
			return false;
		} else if (1677354179 * id != 1677354179 * class658_0_.id) {
			return false;
		} else if (2077082863 * amount != 2077082863 * class658_0_.amount) {
			return false;
		} else if (borderSize * -1779753453 != class658_0_.borderSize * -1779753453) {
			return false;
		} else if (shadowColour * -2132895807 != class658_0_.shadowColour * -2132895807) {
			return false;
		} else if (2048445349 * textType != class658_0_.textType * 2048445349) {
			return false;
		}

		return useAppearance == class658_0_.useAppearance;
	}

}