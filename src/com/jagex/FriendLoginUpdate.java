package com.jagex;

public class FriendLoginUpdate extends Entity {

	short world;
	int time = (int) (TimeUtil.time() / 1000L) * -46074705;
	String name;

	FriendLoginUpdate(String name, int world) {
		this.name = name;
		this.world = (short) world;
	}

}