package com.jagex;

public class QuickChatMessageType {
	public static QuickChatMessageType aClass605_7886 = new QuickChatMessageType(10, 2, 2, 0);
	public static QuickChatMessageType aClass605_7887 = new QuickChatMessageType(1, 2, 2, 0);
	public static QuickChatMessageType aClass605_7891 = new QuickChatMessageType(7, 0, 1, 1);
	public static QuickChatMessageType aClass605_7894 = new QuickChatMessageType(0, 2, 2, 1);
	public static QuickChatMessageType aClass605_7895 = new QuickChatMessageType(11, 0, 1, 2);
	public static QuickChatMessageType aClass605_7898 = new QuickChatMessageType(6, 0, 4, 2);
	static QuickChatMessageType aClass605_7888 = new QuickChatMessageType(2, 4, 4, 0);
	static QuickChatMessageType aClass605_7889 = new QuickChatMessageType(4, 1, 1, 1);
	static QuickChatMessageType aClass605_7892 = new QuickChatMessageType(8, 0, 4, 1);
	static QuickChatMessageType aClass605_7896 = new QuickChatMessageType(12, 0, 1, 0);
	static QuickChatMessageType aClass605_7897 = new QuickChatMessageType(13, 0, 1, 0);
	static QuickChatMessageType aClass605_7899 = new QuickChatMessageType(9, 0, 4, 1);
	static QuickChatMessageType aClass605_7901 = new QuickChatMessageType(15, 0, 1, 0);
	static QuickChatMessageType aClass605_7902 = new QuickChatMessageType(14, 0, 4, 1);

	public static QuickChatMessageType valueOf(int id) {
		for (QuickChatMessageType type : values()) {
			if (372827699 * type.id == id) {
				return type;
			}
		}
		return null;
	}

	static QuickChatMessageType[] values() {
		return new QuickChatMessageType[] { aClass605_7901, aClass605_7892, aClass605_7896, aClass605_7898,
				aClass605_7889, aClass605_7888, aClass605_7894, aClass605_7895, aClass605_7899, aClass605_7897,
				aClass605_7887, aClass605_7891, aClass605_7886, aClass605_7902 };
	}

	public int decodedSize;
	public int configs;
	public int encodedSize;
	public int id;

	QuickChatMessageType(int id, int encodedSize, int i_1_, int configs) {
		this.id = 913081595 * id;
		this.encodedSize = encodedSize * 924295867;
		decodedSize = i_1_ * 1580323793;
		this.configs = configs * 761905071;
	}

}