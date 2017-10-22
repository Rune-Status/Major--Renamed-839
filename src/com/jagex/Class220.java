package com.jagex;

public class Class220 implements Identifiable {
	static Class220 aClass220_2272;
	public static Class220 aClass220_2273;
	static Class220 aClass220_2274 = new Class220(1, 0);
	static {
		aClass220_2273 = new Class220(0, 1);
		aClass220_2272 = new Class220(2, 2);
	}

	public static boolean method4154(int i) {
		for (MenuOption class480_sub31_sub17 = MenuOption.options.head(); null != class480_sub31_sub17; class480_sub31_sub17 = MenuOption.options
				.next()) {
			if (Class31.method905(-20536735 * class480_sub31_sub17.type)
					&& i == -1867655888037237139L * class480_sub31_sub17.primary) {
				return true;
			}
		}
		return false;
	}

	public int anInt2275;

	int id;

	Class220(int i, int i_0_) {
		anInt2275 = i * 1769124323;
		id = 123571521 * i_0_;
	}

	@Override
	public int getId() {
		return id * -102890815;
	}

	static Class220[] values() {
		return new Class220[] { aClass220_2273, aClass220_2274, aClass220_2272 };
	}

}