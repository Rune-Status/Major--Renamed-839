package com.jagex;

public class Class296_Sub3 extends Class296 {
	static void method15312(Class630 class630) {
		Class34.aClass630_449 = class630;
	}

	Sprite aClass116_9817;
	Sprite aClass116_9818;
	Sprite aClass116_9819;
	Sprite aClass116_9820;
	Sprite aClass116_9821;
	Sprite aClass116_9822;

	Class296_Sub3(Archive class406, Archive class406_0_, Class340_Sub2 class340_sub2) {
		super(class406, class406_0_, class340_sub2);
	}

	@Override
	public boolean ready() {
		if (!super.ready()) {
			return false;
		}

		Class340_Sub2 class340_sub2 = (Class340_Sub2) aClass340_3273;
		if (!images.fileLoaded(class340_sub2.anInt9918 * 45588627)) {
			return false;
		} else if (!images.fileLoaded(582982747 * class340_sub2.anInt9919)) {
			return false;
		} else if (!images.fileLoaded(-1932564411 * class340_sub2.anInt9916)) {
			return false;
		} else if (!images.fileLoaded(-286699763 * class340_sub2.anInt9917)) {
			return false;
		} else if (!images.fileLoaded(class340_sub2.anInt9915 * 1958266913)) {
			return false;
		}

		return images.fileLoaded(-791661951 * class340_sub2.anInt9914);
	}

	@Override
	public void load() {
		super.load();
		Class340_Sub2 class340_sub2 = (Class340_Sub2) aClass340_3273;
		aClass116_9818 = Class213.method4019(images, class340_sub2.anInt9918 * 45588627);
		aClass116_9819 = Class213.method4019(images, class340_sub2.anInt9919 * 582982747);
		aClass116_9817 = Class213.method4019(images, -1932564411 * class340_sub2.anInt9916);
		aClass116_9820 = Class213.method4019(images, -286699763 * class340_sub2.anInt9917);
		aClass116_9821 = Class213.method4019(images, 1958266913 * class340_sub2.anInt9915);
		aClass116_9822 = Class213.method4019(images, class340_sub2.anInt9914 * -791661951);
	}

	void method15309(int i, int i_17_, int i_18_, int i_19_) {
		aClass116_9818.method2084(i, i_17_, i_18_, i_19_);
	}

	@Override
	void method5421(boolean bool, int i, int i_1_, int i_2_) {
		if (bool) {
			int[] is = new int[4];
			Class60.activeToolkit.method2425(is);
			Class60.activeToolkit.method2760(i, i_1_, i + aClass340_3273.anInt3633 * 883415057, i_1_
					+ aClass340_3273.anInt3634 * -1664223293);
			int i_3_ = aClass116_9817.scaleWidth();
			int i_4_ = aClass116_9817.scaleHeight();
			int i_5_ = aClass116_9820.scaleWidth();
			int i_6_ = aClass116_9820.scaleHeight();
			aClass116_9817.method2079(i, i_1_ + (aClass340_3273.anInt3634 * -1664223293 - i_4_) / 2);
			aClass116_9820.method2079(i + 883415057 * aClass340_3273.anInt3633 - i_5_, (aClass340_3273.anInt3634
					* -1664223293 - i_6_)
					/ 2 + i_1_);
			Class60.activeToolkit.method2760(i, i_1_, i + 883415057 * aClass340_3273.anInt3633,
					i_1_ + aClass116_9821.scaleHeight());
			aClass116_9821.method2084(i_3_ + i, i_1_, 883415057 * aClass340_3273.anInt3633 - i_3_ - i_5_,
					aClass340_3273.anInt3634 * -1664223293);
			int i_7_ = aClass116_9822.scaleHeight();
			Class60.activeToolkit.method2760(i, i_1_ + aClass340_3273.anInt3634 * -1664223293 - i_7_, i
					+ aClass340_3273.anInt3633 * 883415057, -1664223293 * aClass340_3273.anInt3634 + i_1_);
			aClass116_9822.method2084(i_3_ + i, i_1_ + aClass340_3273.anInt3634 * -1664223293 - i_7_,
					aClass340_3273.anInt3633 * 883415057 - i_3_ - i_5_, aClass340_3273.anInt3634 * -1664223293);
			Class60.activeToolkit.method2760(is[0], is[1], is[2], is[3]);
		}
	}

	@Override
	void method5422(boolean bool, int i, int i_8_, int i_9_) {
		int i_10_ = i + aClass116_9817.scaleWidth();
		int i_11_ = aClass340_3273.anInt3633 * 883415057 + i - aClass116_9820.scaleWidth();
		int i_12_ = i_8_ + aClass116_9821.scaleHeight();
		int i_13_ = i_8_ + -1664223293 * aClass340_3273.anInt3634 - aClass116_9822.scaleHeight();
		int i_14_ = i_11_ - i_10_;
		int i_15_ = i_13_ - i_12_;
		int i_16_ = method5423() * i_14_ / 10000;
		int[] is = new int[4];
		Class60.activeToolkit.method2425(is);
		Class60.activeToolkit.method2760(i_10_, i_12_, i_16_ + i_10_, i_13_);
		method15309(i_10_, i_12_, i_14_, i_15_);
		Class60.activeToolkit.method2760(i_16_ + i_10_, i_12_, i_11_, i_13_);
		aClass116_9819.method2084(i_10_, i_12_, i_14_, i_15_);
		Class60.activeToolkit.method2760(is[0], is[1], is[2], is[3]);
	}

}