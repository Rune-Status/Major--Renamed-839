package com.jagex;

public class Class517 implements Identifiable {
	public static Class517 aClass517_7061 = new Class517(1);
	static Class517 aClass517_7060 = new Class517(0);

	static void method8884() {
		CutsceneArea.method16040();
		Class495.aClass480_Sub31_Sub18_6808 = null;
		IndexedJavaFont.aClass480_Sub31_Sub18_8847 = null;
		Class495_Sub1.aClass667_10318.clear();
		Class495_Sub1.aClass667_10338.clear();

		for (int i_7_ = 0; i_7_ < 3; i_7_++) {
			for (int i_8_ = 0; i_8_ < 5; i_8_++) {
				Class495_Sub1.aClass132ArrayArray10329[i_7_][i_8_] = null;
				Class495_Sub1.aClass9ArrayArray10339[i_7_][i_8_] = null;
			}
		}
	}

	static Class517[] values() {
		return new Class517[] { aClass517_7061, aClass517_7060 };
	}

	int id;

	Class517(int i) {
		id = i * 1246226535;
	}

	@Override
	public int getId() {
		return -1418677417 * id;
	}

}