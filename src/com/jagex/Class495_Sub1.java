package com.jagex;

import java.io.IOException;
import java.util.HashMap;

public class Class495_Sub1 extends Class495 {
	static int anInt10317;
	public static HashTable aClass667_10318;
	static int anInt10319;
	static boolean aBool10320;
	static boolean aBool10321;
	public static int anInt10322;
	public static int anInt10323;
	static int anInt10324;
	public static int anInt10325;
	static int anInt10326;
	static int anInt10327;
	public static boolean aBool10328;
	static Font[][] aClass132ArrayArray10329;
	static int anInt10330;
	static HashMap aHashMap10331;
	static HashMap aHashMap10332;
	static int anInt10333;
	static int anInt10334;
	static boolean aBool10335;
	static boolean aBool10336;
	static int anInt10337;
	public static HashTable aClass667_10338;
	static FontSpecification[][] aClass9ArrayArray10339;
	public static boolean aBool10340;
	public static boolean aBool10341;
	public static boolean aBool10342;
	static boolean aBool10343;
	static boolean aBool10344;
	static int anInt10345 = 0;
	static {
		anInt10317 = 112403625;
		anInt10337 = 251162670;
		anInt10319 = -376614664;
		anInt10323 = 704724893;
		anInt10325 = -588788146;
		anInt10322 = 0;
		anInt10327 = -1164673443;
		anInt10324 = -732309487;
		aBool10320 = false;
		anInt10326 = -238998875;
		anInt10330 = -499380035;
		aBool10321 = false;
		aClass132ArrayArray10329 = new Font[3][5];
		aClass9ArrayArray10339 = new FontSpecification[3][5];
		aHashMap10331 = new HashMap();
		aHashMap10332 = new HashMap();
		anInt10333 = -1428542803 * anInt10323;
		anInt10334 = 205337113 * anInt10325;
		aBool10335 = false;
		aBool10328 = false;
		aClass667_10318 = new HashTable(8);
		aClass667_10338 = new HashTable(8);
		Class480_Sub37.aClass645_10316 = new DequeIterator(new Deque());
		aBool10340 = false;
		aBool10341 = false;
		aBool10342 = false;
		aBool10343 = false;
		aBool10344 = false;
		aBool10336 = false;
	}

	public static final void logout(boolean bool) {
		BufferedConnectionContext[] class83s = Client.connectionContexts;
		for (BufferedConnectionContext class83 : class83s) {
			try {
				class83.flush();
			} catch (IOException ioexception) {

			}
			class83.stopConnection();
		}

		Class410.method6946();
		Client.method3938();
		Client.method14088(false);
		Client.aClass460_10760.method7805();
		Client.aClass460_10760.method7698();
		Client.aClass460_10760.method7702();
		CutsceneArea.method16040();
		Class343_Sub2.method15447();
		Class549.method9329(true);
		Class517.method8884();
		Class51.method1135();
		Client.localPlayerIndex = 5857073;

		if (bool) {
			Class536.setGameState(3);
		} else {
			Class536.setGameState(0);
			try {
				JavascriptUtils.call(Class454.applet, "loggedout");
			} catch (Throwable throwable) {

			}
		}
	}

	Class495_Sub1() throws Throwable {
		throw new Error();
	}
}
