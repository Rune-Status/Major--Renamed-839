package com.jagex;

public class BefriendedPlayer {

	public static CacheResourceWorker cacheWorker;
	static int anInt576;

	public static Class480_Sub31_Sub13 method1101(int i, int i_0_) {
		Class237 class237 = (Class237) Class248.aMap2667.get(Integer.valueOf(i));
		return class237.method4421(i_0_);
	}

	public int anInt565;
	public String aString566;
	public int world;
	public String aString568;
	public boolean aBool569;
	public boolean aBool570;
	public String name;
	public int anInt572;
	public String aString573;
	public int anInt574;

	public static final int indexOf(String string) {
		if (string == null) {
			return -1;
		}

		for (int index = 0; index < Client.friendCount * -1763746795; index++) {
			if (string.equalsIgnoreCase(Client.friends[index].name)) {
				return index;
			}
		}

		return -1;
	}

}