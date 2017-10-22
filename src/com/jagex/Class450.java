package com.jagex;

public class Class450 {
	public static Font b12Full;

	public static void method7394() {
		synchronized (PlayerAppearance.aClass168_7723) {
			PlayerAppearance.aClass168_7723.clearSoft();
		}
		synchronized (PlayerAppearance.models) {
			PlayerAppearance.models.clearSoft();
		}
	}

	public int anInt5074;
	public int anInt5075;
	public int anInt5076;
	public int anInt5077;

	Class450() {
		anInt5076 = (32 + (int) (Math.random() * 4.0)) * 649952157;
		anInt5075 = (3 + (int) (Math.random() * 2.0)) * 1889615299;
		anInt5074 = (16 + (int) (Math.random() * 3.0)) * 1685218203;

		if (Class199.preferences.textures.getValue() == 1) {
			anInt5077 = (int) (Math.random() * 6.0) * 793540613;
		} else {
			anInt5077 = (int) (Math.random() * 12.0) * 793540613;
		}
	}

	Class450(int i, int i_0_, int i_1_, int i_2_) {
		anInt5076 = 649952157 * i;
		anInt5075 = 1889615299 * i_0_;
		anInt5074 = 1685218203 * i_1_;
		anInt5077 = i_2_ * 793540613;
	}

}