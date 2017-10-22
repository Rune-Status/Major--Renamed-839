package com.jagex;

public class Class417 implements Identifiable {
	static Class417 aClass417_4646 = new Class417(1);
	static Class417 aClass417_4647 = new Class417(0);
	static Class417 aClass417_4648 = new Class417(2);
	public static Class480_Sub33 aClass480_Sub33_4650;

	public static void method6981(String string, boolean bool, int i) {
		if (Client.gameState * -1501875989 == 8 && !Class628.method13100() && !Class200.method3939()) {
			Class31.aString405 = string;
			Class31.aBool426 = bool;
			Class536.setGameState(11);
		}
	}

	int id;

	Class417(int i) {
		id = 1477438597 * i;
	}

	@Override
	public int getId() {
		return id * 1292053581;
	}

	public static Class417[] values() {
		return new Class417[] { aClass417_4646, aClass417_4647, aClass417_4648 };
	}

}