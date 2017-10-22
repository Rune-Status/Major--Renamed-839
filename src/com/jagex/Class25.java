package com.jagex;

public class Class25 implements Identifiable {
	public static Class25 aClass25_337 = new Class25(6, 5, "");
	static Class25 aClass25_338 = new Class25(3, 1, "");
	static Class25 aClass25_339 = new Class25(0, 4, "");
	public static Class25 aClass25_340 = new Class25(1, 3, "");
	static Class25 aClass25_341 = new Class25(7, 2, "");
	public static Class25 aClass25_342 = new Class25(2, 6, "");
	public static Class25 aClass25_347 = new Class25(4, 0, "");
	public static Class25 aClass25_344 = new Class25(5, -1, "");

	static final void method779(int i, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
		for (Class477_Sub6 class477_sub6 = (Class477_Sub6) Client.aClass649_10779.head(); null != class477_sub6; class477_sub6 = (Class477_Sub6) Client.aClass649_10779
				.next()) {
			if (Client.tick >= 2055331721 * class477_sub6.longetivity) {
				class477_sub6.unlink();
			} else {
				Class42.method1043(class477_sub6.plane * -497300789, (1295997365 * class477_sub6.localX << 9) + 256,
						256 + (-747868851 * class477_sub6.localZ << 9), 0, 1876516974 * class477_sub6.heightOffset,
						false, false);
				Class450.b12Full.method2293(class477_sub6.aString10083, (int) (Client.aFloatArray10736[0] + i),
						(int) (Client.aFloatArray10736[1] + i_4_), ~0xffffff | class477_sub6.anInt10082 * 518060783, 0);
			}
		}
	}

	String aString343;
	int anInt345;
	int id;

	Class25(int i, int id, String string) {
		anInt345 = -1809520059 * i;
		this.id = id * 139985089;
		aString343 = string;
	}

	@Override
	public int getId() {
		return -1942188223 * id;
	}

	@Override
	public String toString() {
		return aString343;
	}

}