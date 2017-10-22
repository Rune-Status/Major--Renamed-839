package com.jagex;

import java.util.HashMap;
import java.util.Map;

public class Class248 {
	static int anInt2665;
	static HashTable<Class480_Sub31_Sub13> aClass667_2666 = new HashTable(1024);
	static Map aMap2667 = new HashMap();
	static Queue aClass638_2668 = new Queue();

	public static Interface66 method4643(Archive archive, int i, Interface63 interface63, boolean music,
			ReferenceCache class168) {
		if (null != Class593.aClass343_7835) {
			if (music) {
				return new Class571(archive, i, Class593.aClass343_7835, interface63);
			}
			return new Class552(archive, i, Class593.aClass343_7835, interface63, class168);
		}
		return null;
	}

	static boolean method4641() {
		return !Class455.loadingState(Client.gameState * -1501875989);
	}

	Class248() throws Throwable {
		throw new Error();
	}

	public static void method4007() {
		aMap2667.clear();
		aClass667_2666.clear();
		aClass638_2668.clear();
		anInt2665 = 0;
	}

}