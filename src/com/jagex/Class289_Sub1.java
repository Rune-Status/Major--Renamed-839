package com.jagex;

public class Class289_Sub1 extends Class289 {
	static Class562_Sub1[] aClass562_Sub1Array9823;

	static final void method15314(int i) {
		int i_2_ = 0;
		Class490 class490 = Client.aClass460_10760.method7687();
		for (int i_3_ = 0; i_3_ < Client.aClass460_10760.method7680(); i_3_++) {
			for (int i_4_ = 0; i_4_ < Client.aClass460_10760.method7707(); i_4_++) {
				if (Class480_Sub31_Sub2.method17300(class490.aClass489ArrayArrayArray6706, i_2_, i_3_, i_4_, true,
						1202237689)) {
					i_2_++;
				}
				if (i_2_ >= 512) {
					return;
				}
			}
		}
	}

	int anInt9824 = 0;

	Class289_Sub1(Archive class406, Class367_Sub1 class367_sub1) {
		super(class406, class367_sub1);
	}

	@Override
	public void method176(boolean bool) {
		int i_0_ = aClass367_3228.aClass349_4045.method5948(sprite.scaleWidth(), Client.anInt10682
				* -1936703811)
				+ aClass367_3228.anInt4047 * -923385377;
		int i_1_ = aClass367_3228.aClass334_4046.method5811(sprite.scaleHeight(),
				Client.anInt10813 * -73018749) + 269378445 * aClass367_3228.anInt4048;
		sprite.method2091(i_0_ + sprite.scaleWidth() / 2, i_1_ + sprite.scaleHeight() / 2,
				4096, anInt9824 * -50012557);
		anInt9824 += ((Class367_Sub1) aClass367_3228).anInt9940 * 713359843;
	}
}
