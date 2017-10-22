package com.jagex;

public class Class480_Sub37 extends Linkable {

	static DequeIterator<Class480_Sub37> aClass645_10316;

	public static Class480_Sub37 method7529() {
		if (null == Class495.aClass644_6820 || Class480_Sub37.aClass645_10316 == null) {
			return null;
		}

		for (Class480_Sub37 class480_sub37 = Class480_Sub37.aClass645_10316.next(); class480_sub37 != null; class480_sub37 = Class480_Sub37.aClass645_10316
				.next()) {
			Class224 class224 = (Class224) Class495.aClass678_Sub8_6803.get(818539827 * class480_sub37.id);
			if (null != class224 && class224.aBool2340
					&& class224.method4205(Class495.anInterface14_6806, Class495.anInterface12_6805)) {
				return class480_sub37;
			}
		}

		return null;
	}

	public boolean aBool10311 = false;
	public int anInt10308;
	public int anInt10310;
	public int anInt10312;
	public int anInt10313;
	public int anInt10314;

	public int id = -2142492155;

	Class480_Sub37(int id) {
		this.id = 2142492155 * id;
	}

}