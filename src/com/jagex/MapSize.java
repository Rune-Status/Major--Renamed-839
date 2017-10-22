package com.jagex;

public class MapSize {
	static MapSize aClass236_2612 = new MapSize(4, 72);
	static MapSize aClass236_2613 = new MapSize(1, 120);
	static MapSize aClass236_2614 = new MapSize(2, 136);
	static MapSize aClass236_2617 = new MapSize(3, 168);
	public static MapSize STANDARD = new MapSize(0, 104);

	public static void method4418() {
		Class181.method3550();
		Class368.aClass116Array4053 = null;
	}

	public int length;
	public int type;

	MapSize(int type, int length) {
		this.type = type * 1071859137;
		this.length = -1217624961 * length;
	}

	public static MapSize valueOf(int type) {
		for (MapSize size : MapSize.values()) {
			if (type == size.type * 1283574337) {
				return size;
			}
		}

		return null;
	}

	static MapSize[] values() {
		return new MapSize[] { aClass236_2617, aClass236_2612, aClass236_2614, STANDARD, aClass236_2613 };
	}

}