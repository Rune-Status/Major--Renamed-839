package com.jagex;

public class Class360 {
	public static Class360 aClass360_3877 = new Class360(1);
	public static Class360 aClass360_3878 = new Class360(2);
	public static Class360 aClass360_3879 = new Class360(2);
	public static Class360 aClass360_3880 = new Class360(2);
	public static Class360 aClass360_3881 = new Class360(1);
	public static Class360 aClass360_3882 = new Class360(1);
	public static Class360 aClass360_3883 = new Class360(2);
	public static Class360 aClass360_3884 = new Class360(1);
	public static Class360 aClass360_3886 = new Class360(2);
	public static Class360 aClass360_3887 = new Class360(1);
	public static Class360 aClass360_3888 = new Class360(1);

	public static int blendColours(int first, int second, float alpha) {
		return JavaGround.blendColours(first, second, (int) alpha);
	}

	public static void method6049() {
		if (Class671.aBool8463) {
			if (-543986101 * Class671.anInt8461 < Class80.anInt2578 * -910063499) {
				Class671.anInt8461 = Class80.anInt2578 * 1002286143;
			}
			while (-543986101 * Class671.anInt8461 < -397285031 * Class572.anInt7654) {
				Class562_Sub1 class562_sub1 = Class166_Sub19.method15132(Class671.anInt8461 * -543986101);
				if (null == class562_sub1 || class562_sub1.anInt10368 * 1668853513 != -1) {
					Class671.anInt8461 += -1228313757;
				} else {
					if (Class671.aClass587_8456 == null) {
						Class671.aClass587_8456 = Client.aClass588_10855.method9897(class562_sub1.aString10365);
					}
					int i_6_ = 897654775 * Class671.aClass587_8456.anInt7774;
					if (-1 == i_6_) {
						break;
					}
					class562_sub1.anInt10368 = i_6_ * -649883847;
					Class671.anInt8461 += -1228313757;
					Class671.aClass587_8456 = null;
				}
			}
		}
	}

	static boolean method6048(Class224 class224) {
		if (class224 == null) {
			return false;
		} else if (null != class224.morphisms) {
			class224 = class224.method4211(Class495.anInterface14_6806, Class495.anInterface12_6805);
			if (class224 == null) {
				return false;
			}
		}

		if (!class224.aBool2330) {
			return false;
		} else if (!class224.method4205(Class495.anInterface14_6806, Class495.anInterface12_6805)) {
			return false;
		} else if (Class495_Sub1.aClass667_10318.get(class224.id * 1218226383) != null) {
			return false;
		} else if (Class495_Sub1.aClass667_10338.get(1606761481 * class224.anInt2303) != null) {
			return false;
		} else if (null != class224.aString2301) {
			if (class224.anInt2335 * 42167249 == 0 && Class495_Sub1.aBool10340) {
				return false;
			} else if (class224.anInt2335 * 42167249 == 1 && Class495_Sub1.aBool10341) {
				return false;
			} else if (class224.anInt2335 * 42167249 == 2 && Class495_Sub1.aBool10342) {
				return false;
			}
		}

		return true;
	}

	public int anInt3885;

	Class360(int i) {
		anInt3885 = -1021233799 * i;
	}

	public static Class360[] values() {
		return new Class360[] { aClass360_3884, aClass360_3883, aClass360_3879, aClass360_3880, aClass360_3881,
				aClass360_3882, aClass360_3877, aClass360_3878, aClass360_3888, aClass360_3886, aClass360_3887 };
	}

}