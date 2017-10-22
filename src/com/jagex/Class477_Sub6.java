package com.jagex;

public class Class477_Sub6 extends Entity {

	public static void create(int plane, int localX, int localZ, int heightOffset, int longetivity, int i_30_,
			String string) {
		Class477_Sub6 class477_sub6 = new Class477_Sub6();
		class477_sub6.plane = plane * -102380829;
		class477_sub6.localX = localX * -1860465507;
		class477_sub6.localZ = -1450667131 * localZ;
		class477_sub6.longetivity = -1252636999 * (longetivity + Client.tick);
		class477_sub6.heightOffset = 1211237767 * heightOffset;
		class477_sub6.aString10083 = string;
		class477_sub6.anInt10082 = i_30_ * -692882417;
		Client.aClass649_10779.offer(class477_sub6);
	}

	int anInt10082;
	String aString10083;
	int heightOffset;
	int localX;
	int localZ;
	int longetivity;
	int plane;

}