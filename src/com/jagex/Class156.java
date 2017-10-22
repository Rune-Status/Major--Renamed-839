package com.jagex;

public class Class156 {
	static Class156 aClass156_1875;
	public static Class156 aClass156_1876 = new Class156(8);
	public static Class156 aClass156_1877;
	static Class156 aClass156_1878;
	static Class156 aClass156_1879;
	static Class156 aClass156_1880;
	static Class156 aClass156_1881;
	static Class156 aClass156_1883;
	static Class156 aClass156_1884;
	static Class156 aClass156_1885;
	public static int anInt1886;
	static {
		aClass156_1875 = new Class156(5);
		aClass156_1877 = new Class156(6);
		aClass156_1878 = new Class156(3);
		aClass156_1879 = new Class156(7);
		aClass156_1880 = new Class156(2);
		aClass156_1881 = new Class156(9);
		aClass156_1883 = new Class156(4);
		aClass156_1885 = new Class156(0);
		aClass156_1884 = new Class156(1);
	}

	public static int[][] method3300(int i, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, float f, boolean bool) {
		int[][] is = new int[i_4_][i];
		Class480_Sub40_Sub1 class480_sub40_sub1 = new Class480_Sub40_Sub1();
		class480_sub40_sub1.aBool11448 = bool;
		class480_sub40_sub1.anInt11442 = 2005410763 * i_6_;
		class480_sub40_sub1.anInt11445 = 1480267487 * i_7_;
		class480_sub40_sub1.anInt11446 = i_8_ * -407558729;
		class480_sub40_sub1.anInt11447 = (int) (4096.0F * f) * 1254205369;
		class480_sub40_sub1.method17902();
		Class12.method656(i, i_4_);
		for (int i_10_ = 0; i_10_ < i_4_; i_10_++) {
			class480_sub40_sub1.method17899(i_10_, is[i_10_]);
		}
		return is;
	}

	static final void clearSoftLoaderCaches() {
		OverlayDefinition.loader.clearSoft();
		UnderlayDefinition.loader.clearSoft();
		IdentikitDefinition.loader.clearSoft();
		Client.aClass460_10760.getObjectLoader().clearSoft();
		NpcDefinition.loader.clearSoft();
		ItemDefinition.loader.clearSoft();
		AnimationDefinition.loader.clearSoft();
		GraphicDefinition.loader.clearSoft();
		VariableBitsDefinition.loader.clearSoft();
		BaseVariableParameterDefinition.aClass77_Sub1_Sub2_3726.clearSoft();
		Npc.varpLoader.clearSoft();
		Class501.aClass77_Sub1_Sub1_6903.clearSoft();
		Class184.aClass77_Sub1_Sub1_2006.clearSoft();
		SunDefinition.aClass77_Sub1_Sub1_2846.clearSoft();
		ProxyingVariableLoader.aClass678_Sub6_3003.clearSoft();
		MapSceneDefinition.loader.clearSoft();
		Queue.aClass678_Sub8_8139.clearSoft();
		ParameterDefinition.loader.clearSoft();
		SkyboxDefinition.loader.clearSoft();
		SunDefinition.loader.clearSoft();
		Class457.aClass678_Sub21_5151.clearSoft();
		CursorDefinition.loader.clearSoft();
		HitsplatDefinition.loader.clearSoft();
		HitbarDefinition.loader.clearSoft();
		Class450.method7394();
		Widget.method4321();
		Class509.aClass374_6997.clearSoft();
		Class213.method4020();
		Class577.method9811();
		Client.aClass168_10883.clearSoft();
		Client.aClass168_10649.clearSoft();
		Class56.aClass168_617.clearSoft();
		Class626.aClass168_8035.clearSoft();
		Client.aClass168_10778.clearSoft();
	}

	static void method3299(int i) {
		if (Class199.preferences.aClass632_Sub33_10293.getValue() == 1) {
			Class237.aClass461_2622.method7825(new Class452(Class458.aClass458_5159, null));
		} else {
			Client.aClass460_10760.method7705();
			Class679.method696();
		}
	}

	int anInt1882;

	Class156(int i) {
		anInt1882 = -1604110419 * i;
	}

	public int method3293() {
		return 0x2000000 | 1782268965 * anInt1882;
	}

}