package com.jagex;

public class Class316 {

	public static Class316 aClass316_1 = new Class316(0, 1, 3, Class151.aClass151_1); // normal pointer
	public static Class316 aClass316_2 = new Class316(7, 2, 4, Class151.aClass151_2); // 4 comp/colour color pointer
	public static Class316 aClass316_3 = new Class316(1, 0, 3, Class151.aClass151_1); // 3 coords/vertex vertex pointer
	public static Class316 aClass316_4 = new Class316(6, 9, 4, Class151.aClass151_1);
	public static Class316 aClass316_5 = new Class316(8, 5, 3, Class151.aClass151_1); // 3 coords/element tex coord
	public static Class316 aClass316_6 = new Class316(3, 6, 4, Class151.aClass151_1); // 4 coords/element tex coord
	public static Class316 aClass316_7 = new Class316(10, 7, 4, Class151.aClass151_1);
	public static Class316 aClass316_8 = new Class316(11, 8, 4, Class151.aClass151_1);
	public static Class316 aClass316_9 = new Class316(5, 4, 2, Class151.aClass151_1); // 2 coords/element tex coord
	public static Class316 aClass316_10 = new Class316(4, 10, 3, Class151.aClass151_1);
	public static Class316 aClass316_11 = new Class316(2, 11, 3, Class151.aClass151_1);
	public static Class316 aClass316_12 = new Class316(9, 3, 1, Class151.aClass151_1); // 1 coord/element tex coord
	static final int anInt3372 = 16;
	static int anInt3373 = LatencyMonitor.method1059(16);

	static Class316 method5697(int i) {
		switch (i) {
			case 6:
				return aClass316_6;
			case 2:
				return aClass316_2;
			case 3:
				return aClass316_12;
			case 4:
				return aClass316_9;
			case 1:
				return aClass316_1;
			case 0:
				return aClass316_3;
			case 5:
				return aClass316_5;
			default:
				return null;
		}
	}

	public int anInt3371;
	public int anInt3377;
	Class151 aClass151_3376;

	int anInt3359;

	int anInt3374;

	Class316(int i, int i_0_, int i_1_, Class151 class151) {
		anInt3371 = i;
		anInt3374 = i_0_;
		anInt3359 = i_1_;
		aClass151_3376 = class151;
		anInt3377 = anInt3359 * aClass151_3376.size * -172886387;

		if (anInt3374 >= 16) {
			throw new RuntimeException();
		}
	}

}