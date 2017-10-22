package com.jagex;

public class FriendsChatPlayer {

	static void method1538() {
		Client.lobbyConnection.stopConnection();
		if (Class34.loginErrors * -1507527029 < 2) {
			Class671.lobbyConnectionInfo.swap();
			Class34.loginTicks = 0;
			Class34.loginErrors += 388710691;
			Class34.aClass40_450 = Class40.aClass40_542;
		} else {
			Class34.aClass40_450 = null;
			Class34.aClass653_451 = Class653.aClass653_8225;
			Class536.setGameState(0);
		}
	}

	static boolean method1539() {
		if (Client.aByteArray10716 != null) {
			return Class340.method5854();
		} else if (Class31.socialNetworkId * -1420488133 != -1) {
			return DefaultMapEntry.method6279();
		}

		return Class198.method3871(Class31.aString423, Class31.accountPassword);
	}

	static void method1540() {
		for (MenuCategory class480_sub31_sub4 = (MenuCategory) Class56.aClass638_631.getFront(); null != class480_sub31_sub4; class480_sub31_sub4 = (MenuCategory) Class56.aClass638_631
				.next()) {
			if (713555001 * class480_sub31_sub4.size > 1) {
				class480_sub31_sub4.size = 0;
				MenuCategory.cache.put(((MenuOption) class480_sub31_sub4.options.tail.nextCacheable).key
						* -6309744751763661005L, class480_sub31_sub4);
				class480_sub31_sub4.options.clear();
			}
		}
		MenuCategory.count = 0;
		Class56.menuOptionCount = 0;
		MenuOption.options.clear();
		MenuCategory.categories.clear();
		Class56.aClass638_631.clear();
		MenuOption.insert(Class56.aClass480_Sub31_Sub17_615);
	}

	public FriendsChatPlayer() {
	}

	public String aString1017;
	public String accountName;
	String displayName;
	public int world;
	public byte rank;
	public String aString1022;

}