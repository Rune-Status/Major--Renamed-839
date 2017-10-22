package com.jagex;

public class Class279 implements Identifiable {
	static Class279 aClass279_3128 = new Class279(6, 10);
	static Class279 aClass279_3129 = new Class279(8, 2);
	static Class279 aClass279_3130 = new Class279(10, 14);
	static Class279 aClass279_3131 = new Class279(0, 4);
	static Class279 aClass279_3132 = new Class279(9, 5);
	static Class279 aClass279_3133 = new Class279(11, 6);
	static Class279 aClass279_3134 = new Class279(2, 7);
	static Class279 aClass279_3135 = new Class279(12, 8);
	static Class279 aClass279_3136 = new Class279(4, 9);
	static Class279 aClass279_3138 = new Class279(5, 11);
	static Class279 aClass279_3139 = new Class279(7, 1);
	static Class279 aClass279_3140 = new Class279(14, 13);
	static Class279 aClass279_3141 = new Class279(13, 12);
	static Class279 aClass279_3143 = new Class279(1, 3);
	static Class279 aClass279_3144 = new Class279(3, 15);
	static int anInt3145;

	public static boolean method5212(int i) {
		return 1 != i && i != 7;
	}

	public static final int getAverageHeight(int worldX, int worldZ, int plane) {
		if (Client.aClass460_10760.method7687() == null) {
			return 0;
		}

		int x = worldX >> 9;
		int z = worldZ >> 9;
		if (x < 0 || z < 0 || x > Client.aClass460_10760.method7680() - 1
				|| z > Client.aClass460_10760.method7707() - 1) {
			return 0;
		}

		int y = plane;
		if (y < 3 && (Client.aClass460_10760.method7775().flags[1][x][z] & 0x2) != 0) {
			y++;
		}

		return Client.aClass460_10760.method7687().aClass120Array6700[y].averageHeight(worldX, worldZ);
	}

	int anInt3137;
	int anInt3142;

	Class279(int i, int i_0_) {
		anInt3142 = 1588213079 * i;
		anInt3137 = i_0_ * -1424641511;
	}

	@Override
	public int getId() {
		return -967996887 * anInt3137;
	}

	static Class279[] values() {
		return new Class279[] { aClass279_3135, aClass279_3134, aClass279_3129, aClass279_3143, aClass279_3144,
				aClass279_3132, aClass279_3138, aClass279_3131, aClass279_3136, aClass279_3128, aClass279_3130,
				aClass279_3140, aClass279_3139, aClass279_3133, aClass279_3141 };
	}

}