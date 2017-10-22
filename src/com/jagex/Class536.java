package com.jagex;

public class Class536 implements Identifiable {
	static Class536 aClass536_7308;
	static Class536 aClass536_7309;
	static Class536 aClass536_7310 = new Class536(0);
	static long aLong7311;
	static {
		aClass536_7308 = new Class536(1);
		aClass536_7309 = new Class536(2);
	}

	public static void setGameState(int state) {
		if (Client.gameState * -1501875989 != state) {
			Client.anInt10631 = 0;
			if (16 == -1501875989 * Client.gameState && 13 != state) {
				ProxyingVariableLoader.method5080();
			}
			if (state == 10 || state == 14) {
				Class155.method3283();
			}
			if (10 != state && Class615.gameConnection != null) {
				Class615.gameConnection.stop();
				Class615.gameConnection = null;
			}
			if (0 == state) {
				Client.method9237(Client.gameState * -1501875989 == 6 || Client.gameState * -1501875989 == 2
						|| Client.anInt10790 * 1764783361 != 1673114103 * Mob.defaults.loginWindow);
			}
			if (8 == state) {
				boolean bool;
				if (Mob.defaults.lobbyWindow * 1803208677 == -1) {
					bool = 18 == Client.gameState * -1501875989 || -1501875989 * Client.gameState == 3;
				} else {
					bool = 1764783361 * Client.anInt10790 != Mob.defaults.lobbyWindow * 1803208677;
				}
				Client.method586(bool, 301131133);
			}
			if (18 == state || 3 == state) {
				if (!FriendsChatPlayer.method1539()) {
					return;
				}
			} else if (15 == state || state == 11 && -1501875989 * Client.gameState != 17) {
				if (!Class155.method3283()) {
					return;
				}
			} else if (state == 2) {
				Class110.method2025();
			}
			if (Class53.method1161(state)) {
				Client.aClass460_10760.method7700();
			}
			if (13 == state || 0 == state) {
				Class334.method5817();
			}
			boolean bool = 19 == state || AsynchronousStreamRequest.loggedOutState(state) || Class456.lobbyState(state);
			boolean bool_1_ = Client.gameState * -1501875989 == 19
					|| AsynchronousStreamRequest.loggedOutState(-1501875989 * Client.gameState)
					|| Class456.lobbyState(-1501875989 * Client.gameState);
			if (bool != bool_1_) {
				Class364.netWorker.sendLoginState(!bool);
			}
			if (Class53.method1161(state) || state == 10 || state == 14) {
				Class60.activeToolkit.method2405();
			}
			Client.gameState = state * 1176893379;
		}
	}

	public static Class630[] method9175() {
		return new Class630[] { Class630.aClass630_8056, Class630.aClass630_8053, Class630.aClass630_8054,
				Class630.aClass630_8055, Class630.aClass630_8052, Class630.aClass630_8058, Class630.aClass630_8057,
				Class630.aClass630_8059, Class630.aClass630_8051 };
	}

	public static void method9176() {
		DiskFile class670 = PriorityQueueIterator.getPreferences("2", Client.game.domain, true);
		Class199.aClass126_Sub1_2099.method14041(class670, (byte) 56);
	}

	static final void method9172(ScriptExecutionContext class613) {
		String string = (String) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
		Client.ignorePlayer(string, true);
	}

	static void method9173(ScriptExecutionContext class613, int i) {
		class613.anIntArray7942[1841827045 * class613.anInt7924 - 2] = QuestDefinition.loader.get(
				class613.anIntArray7942[class613.anInt7924 * 1841827045 - 2]).method4384(
				PlayerVariableProvider.instance, class613.anIntArray7942[1841827045 * class613.anInt7924 - 1]) ? 1 : 0;
		class613.anInt7924 -= 1122685165;
	}

	static final void method9177(ScriptExecutionContext class613, int i) {
		Class480_Sub22 class480_sub22 = (Class480_Sub22) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = class480_sub22.anInt10156
				* -980788885;
	}

	int anInt7307;

	Class536(int i) {
		anInt7307 = i * 658751183;
	}

	@Override
	public int getId() {
		return anInt7307 * 1009682479;
	}

	public static Class536[] values() {
		return new Class536[] { aClass536_7310, aClass536_7309, aClass536_7308 };
	}
}
