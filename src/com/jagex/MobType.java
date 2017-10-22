package com.jagex;

public class MobType {
	public static MobType NPC = new MobType(1);
	public static MobType PLAYER = new MobType(0);

	int type;

	MobType(int type) {
		this.type = 518548003 * type;
	}

	public static MobType valueOf(int type) {
		if (307795339 * PLAYER.type == type) {
			return PLAYER;
		} else if (type == 307795339 * NPC.type) {
			return NPC;
		}

		return null;
	}

}