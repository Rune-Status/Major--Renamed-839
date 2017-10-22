package com.jagex;

public class CutsceneObject {
	public static Interface19 anInterface19_1944;
	static int anInt1945;
	static Sprite compass;

	static CutsceneObject[] objects;

	static void method3483(int i, int i_14_, Widget widget, ClippingMask class129, int i_15_, int i_16_, int i_17_) {
		int count = -1784886003 * Class80.playerCount;
		int[] indices = Class80.playerIndices;

		for (int index = 0; index < count; index++) {
			Player player = Client.players[indices[index]];
			if (null != player && player.hasAppearance() && !player.aBool11783 && Client.localPlayer != player
					&& Client.localPlayer.plane == player.plane) {
				Class397 class397 = player.method10164().aClass397_4507;

				int i_20_ = (int) class397.x / 128 - i / 128;
				int i_21_ = (int) class397.z / 128 - i_14_ / 128;
				boolean isFriend = false;
				for (int friendIndex = 0; friendIndex < -1763746795 * Client.friendCount; friendIndex++) {
					BefriendedPlayer friend = Client.friends[friendIndex];
					if (player.accountName.equals(friend.name) && -1900962431 * friend.world != 0) {
						isFriend = true;
						break;
					}
				}

				boolean bool_23_ = false;
				for (int i_24_ = 0; i_24_ < Client.friendChatSize * 46303181; i_24_++) {
					if (player.accountName.equals(Class551.friendsChat[i_24_].accountName)) {
						bool_23_ = true;
						break;
					}
				}

				boolean bool_25_ = false;
				if (1911759637 * Client.localPlayer.team != 0 && 0 != 1911759637 * player.team
						&& Client.localPlayer.team * 1911759637 == 1911759637 * player.team) {
					bool_25_ = true;
				}
				if (player.appearance != null && player.appearance.npc * 1639350421 != -1
						&& NpcDefinition.loader.get(1639350421 * player.appearance.npc).aBool3084) {
					Class369.method6107(widget, class129, i_15_, i_16_, i_20_, i_21_, Client.mapDots[1]);
				} else if (player.aClass198_11782 == Class198.aClass198_2091) {
					Class369.method6107(widget, class129, i_15_, i_16_, i_20_, i_21_, Client.mapDots[8]);
				} else if (player.aClass198_11782 == Class198.aClass198_2092) {
					Class369.method6107(widget, class129, i_15_, i_16_, i_20_, i_21_, Client.mapDots[6]);
				} else if (bool_25_) {
					Class369.method6107(widget, class129, i_15_, i_16_, i_20_, i_21_, Client.mapDots[4]);
				} else if (player.clanmate) {
					Class369.method6107(widget, class129, i_15_, i_16_, i_20_, i_21_, Client.mapDots[7]);
				} else if (isFriend) {
					Class369.method6107(widget, class129, i_15_, i_16_, i_20_, i_21_, Client.mapDots[3]);
				} else if (bool_23_) {
					Class369.method6107(widget, class129, i_15_, i_16_, i_20_, i_21_, Client.mapDots[5]);
				} else {
					Class369.method6107(widget, class129, i_15_, i_16_, i_20_, i_21_, Client.mapDots[2]);
				}
			}
		}
	}

	ObjectCategory category;
	int id;
	int orientation;
	int plane;
	int x;
	int z;

	CutsceneObject(Buffer buffer) {
		id = buffer.readSmart32() * -1676462355;
		category = CompressionType.findIdentifiable(ObjectCategory.values(), buffer.readUByte());
	}

	void despawn() {
		FullScreenAdapter.method13393(-1399477555 * plane, 615186799 * x, z * -625996537, category.group * 1481811911,
				-1, category.type * -1050493863, orientation * -2095101887);
	}

	boolean ready() {
		if (id * -2046454043 >= 0) {
			ObjectDefinition definition = Class539.aClass678_Sub17_7330.get(id * -2046454043);
			boolean loaded = definition.typeLoaded(-1050493863 * category.type);
			int[] animations = definition.method9251();

			if (animations != null) {
				for (int animation : animations) {
					loaded &= AnimationDefinition.loader.get(animation).ready();
				}
			}

			return loaded;
		}

		return true;
	}

	void spawn(int plane, int localX, int localZ, int orientation) {
		FullScreenAdapter.method13393(plane, localX, localZ, 1481811911 * category.group, id * -2046454043,
				category.type * -1050493863, orientation);
		this.plane = plane * -1915334139;
		x = -701923953 * localX;
		z = 1319620791 * localZ;
		this.orientation = -1002387519 * orientation;
	}

}