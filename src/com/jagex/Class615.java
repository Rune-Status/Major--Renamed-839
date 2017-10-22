package com.jagex;

public class Class615 implements Identifiable {
	public static Class615 aClass615_7953 = new Class615(1);
	public static Class615 aClass615_7954 = new Class615(0);
	static Connection gameConnection;

	static boolean method10359(String string, String string_0_) {
		Class31.loginType = 780098303;
		Class31.activeConnection = Client.gameConnection;
		return Class110.method2024(false, false, string, string_0_, -1L);
	}

	int id;

	Class615(int i) {
		id = 1236210249 * i;
	}

	@Override
	public int getId() {
		return 628981753 * id;
	}

}