package com.jagex;

public class Class296_Sub2 extends Class296 {
	Sprite aClass116_9776;

	Class296_Sub2(Archive images, Archive fonts, Class340_Sub1 class340_sub1) {
		super(images, fonts, class340_sub1);
	}

	@Override
	public boolean ready() {
		if (!super.ready()) {
			return false;
		}

		return images.fileLoaded(((Class340_Sub1) aClass340_3273).anInt9867 * 1142101559);
	}

	@Override
	public void load() {
		super.load();
		aClass116_9776 = Class213.method4019(images, 1142101559 * ((Class340_Sub1) aClass340_3273).anInt9867);
	}

	@Override
	void method5421(boolean bool, int i, int i_0_, int i_1_) {
		Class60.activeToolkit.method2625(i - 2, i_0_, 4 + aClass340_3273.anInt3633 * 883415057,
				aClass340_3273.anInt3634 * -1664223293 + 2, ((Class340_Sub1) aClass340_3273).anInt9866 * -615831945, 0);
		Class60.activeToolkit.method2625(i - 1, 1 + i_0_, aClass340_3273.anInt3633 * 883415057 + 2,
				aClass340_3273.anInt3634 * -1664223293, 0, 0);
	}

	@Override
	void method5422(boolean bool, int i, int i_3_, int i_4_) {
		int i_5_ = method5423() * 883415057 * aClass340_3273.anInt3633 / 10000;
		int[] is = new int[4];
		Class60.activeToolkit.method2425(is);
		Class60.activeToolkit.method2760(i, i_3_ + 2, i_5_ + i, i_3_ + -1664223293 * aClass340_3273.anInt3634);
		aClass116_9776.method2084(i, 2 + i_3_, 883415057 * aClass340_3273.anInt3633, -1664223293
				* aClass340_3273.anInt3634);
		Class60.activeToolkit.method2760(is[0], is[1], is[2], is[3]);
	}

}