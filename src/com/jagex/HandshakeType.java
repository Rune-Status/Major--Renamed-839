package com.jagex;

public class HandshakeType {
	static HandshakeType aClass352_3709 = new HandshakeType(27, 0);
	public static HandshakeType UPDATE = new HandshakeType(15, -1);
	public static HandshakeType GAME_LOGIN = new HandshakeType(16, -2);
	public static HandshakeType aClass352_3712 = new HandshakeType(28, -2);
	static HandshakeType[] values;
	static HandshakeType aClass352_3714 = new HandshakeType(24, -1);
	public static HandshakeType aClass352_3715 = new HandshakeType(26, 0);
	public static HandshakeType LOBBY_LOGIN = new HandshakeType(19, -2);
	public static HandshakeType INIT_GAME_CONNECTION = new HandshakeType(14, 0);
	public static HandshakeType INIT_SOCIAL_GAME_CONNECTION = new HandshakeType(29, -2);
	public static HandshakeType SOCIAL_LOGIN = new HandshakeType(30, -2);
	static HandshakeType aClass352_3720 = new HandshakeType(31, 4);
	static HandshakeType aClass352_3722 = new HandshakeType(23, 4);
	static TextureMetricsList aClass147_3723;
	static {
		values = new HandshakeType[32];

		HandshakeType[] type = HandshakeType.values();
		for (int index = 0; index < type.length; index++) {
			values[type[index].type * 1262357869] = type[index];
		}
	}

	public int type;

	HandshakeType(int type, int i_0_) {
		this.type = 321586277 * type;
	}

	static HandshakeType[] values() {
		return new HandshakeType[] { GAME_LOGIN, UPDATE, aClass352_3720, aClass352_3709, SOCIAL_LOGIN, aClass352_3715,
				INIT_SOCIAL_GAME_CONNECTION, INIT_GAME_CONNECTION, LOBBY_LOGIN, aClass352_3722, aClass352_3714,
				aClass352_3712 };
	}

}