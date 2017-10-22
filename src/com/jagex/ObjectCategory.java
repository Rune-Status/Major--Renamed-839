package com.jagex;

public class ObjectCategory implements Identifiable {
	public static ObjectCategory aClass541_7335 = new ObjectCategory(0, 0);
	public static ObjectCategory aClass541_7336 = new ObjectCategory(1, 0);
	public static ObjectCategory aClass541_7337 = new ObjectCategory(2, 0);
	public static ObjectCategory aClass541_7338 = new ObjectCategory(10, 2);
	public static ObjectCategory aClass541_7339 = new ObjectCategory(9, 2);
	public static ObjectCategory aClass541_7340 = new ObjectCategory(6, 1);
	public static ObjectCategory aClass541_7341 = new ObjectCategory(5, 1);
	public static ObjectCategory aClass541_7343 = new ObjectCategory(7, 1);
	public static ObjectCategory aClass541_7344 = new ObjectCategory(4, 1);
	public static ObjectCategory aClass541_7346 = new ObjectCategory(13, 2);
	public static ObjectCategory aClass541_7355 = new ObjectCategory(3, 0);
	public static ObjectCategory aClass541_7356 = new ObjectCategory(8, 1);
	public static ObjectCategory aClass541_7357 = new ObjectCategory(11, 2);
	public static ObjectCategory aClass541_7358 = new ObjectCategory(22, 3);
	static ObjectCategory aClass541_7345 = new ObjectCategory(12, 2);
	static ObjectCategory aClass541_7347 = new ObjectCategory(14, 2);
	static ObjectCategory aClass541_7348 = new ObjectCategory(15, 2);
	static ObjectCategory aClass541_7349 = new ObjectCategory(16, 2);
	static ObjectCategory aClass541_7350 = new ObjectCategory(17, 2);
	static ObjectCategory aClass541_7351 = new ObjectCategory(18, 2);
	static ObjectCategory aClass541_7352 = new ObjectCategory(19, 2);
	static ObjectCategory aClass541_7353 = new ObjectCategory(20, 2);
	static ObjectCategory aClass541_7354 = new ObjectCategory(21, 2);

	public static boolean method9380(int type) {
		return type >= -1050493863 * aClass541_7345.type && type <= aClass541_7350.type * -1050493863;
	}

	public static ObjectCategory[] values() {
		return new ObjectCategory[] { aClass541_7348, aClass541_7351, aClass541_7358, aClass541_7336, aClass541_7357,
				aClass541_7338, aClass541_7339, aClass541_7356, aClass541_7335, aClass541_7349, aClass541_7347,
				aClass541_7350, aClass541_7344, aClass541_7345, aClass541_7352, aClass541_7337, aClass541_7346,
				aClass541_7343, aClass541_7340, aClass541_7355, aClass541_7353, aClass541_7354, aClass541_7341 };
	}

	static byte method6714(int type, int i_1_) {
		if (type != aClass541_7339.type * -1050493863) {
			return (byte) 0;
		} else if (0 == (i_1_ & 0x1)) {
			return (byte) 1;
		}

		return (byte) 2;
	}

	public int group;
	public int type;

	ObjectCategory(int type, int group) {
		this.type = 1728629737 * type;
		this.group = -32183817 * group;
	}

	@Override
	public int getId() {
		return -1050493863 * type;
	}

	static boolean method5284(int i) {
		return i >= aClass541_7344.type * -1050493863
				&& i <= -1050493863 * aClass541_7356.type;
	}

}