package com.jagex;

public class Class296_Sub1 extends Class296 {

	static final void method15196(int i, int i_6_, int i_7_, int i_8_) {
		Toolkit.method2868(Class60.activeToolkit);
		Class25.method779(i, i_6_, i_7_, i_8_, 256, 256);
		HitMobCutsceneAction.method15091(i, i_6_, i_7_, i_8_, 256, 256);
		Class208.method3994(i, i_6_, i_7_, i_8_, 256, 256);
		PlayerVariableParameterDefinition.method14016(i, i_6_, i_7_, i_8_);
	}

	Class296_Sub1(Archive class406, Archive fonts, Class340_Sub3 class340_sub3) {
		super(class406, fonts, class340_sub3);
	}

	@Override
	void method5421(boolean bool, int i, int i_3_, int i_4_) {
		Class60.activeToolkit.method2625(i - 2, i_3_, 883415057 * aClass340_3273.anInt3633 + 4,
				aClass340_3273.anInt3634 * -1664223293 + 2, ((Class340_Sub3) aClass340_3273).anInt9921 * 899905071, 0);
		Class60.activeToolkit.method2625(i - 1, 1 + i_3_, aClass340_3273.anInt3633 * 883415057 + 2,
				aClass340_3273.anInt3634 * -1664223293, 0, 0);
	}

	@Override
	void method5422(boolean bool, int i, int i_0_, int i_1_) {
		int i_2_ = method5423() * aClass340_3273.anInt3633 * 883415057 / 10000;
		Class60.activeToolkit.method2434(i, 2 + i_0_, i_2_, -1664223293 * aClass340_3273.anInt3634 - 2,
				((Class340_Sub3) aClass340_3273).anInt9920 * 331441051, 0);
		Class60.activeToolkit.method2434(i + i_2_, 2 + i_0_, aClass340_3273.anInt3633 * 883415057 - i_2_, -1664223293
				* aClass340_3273.anInt3634 - 2, 0, 0);
	}

}