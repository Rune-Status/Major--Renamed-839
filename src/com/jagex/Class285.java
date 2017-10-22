package com.jagex;

public class Class285 implements Interface28 {
	public static Archive enumerations;

	Font font;
	Archive images;
	Class348 aClass348_3188;
	Archive fonts;

	Class285(Archive images, Archive fonts, Class348 class348) {
		aClass348_3188 = class348;
		this.images = images;
		this.fonts = fonts;
	}

	@Override
	public boolean ready() {
		boolean bool = true;
		if (!images.fileLoaded(-1417751009 * aClass348_3188.id)) {
			bool = false;
		}
		if (!fonts.fileLoaded(-1417751009 * aClass348_3188.id)) {
			bool = false;
		}
		return bool;
	}

	@Override
	public void load() {
		FontSpecification specification = FontSpecification.load(fonts, -1417751009 * aClass348_3188.id);
		font = Class60.activeToolkit.createFont(specification,
				ImageUtils.load(images, -1417751009 * aClass348_3188.id), true);
	}

	@Override
	public void method176(boolean bool) {
		if (bool) {
			int i_1_ = aClass348_3188.aClass349_3678.method5948(144395919 * aClass348_3188.anInt3685, Client.anInt10682
					* -1936703811)
					+ aClass348_3188.anInt3677 * 2110733165;
			int i_2_ = aClass348_3188.aClass334_3679.method5811(aClass348_3188.anInt3686 * 1251758019, -73018749
					* Client.anInt10813)
					+ 1290024297 * aClass348_3188.anInt3681;
			font.method2294(aClass348_3188.aString3683, i_1_, i_2_, 144395919 * aClass348_3188.anInt3685,
					1251758019 * aClass348_3188.anInt3686, 160045981 * aClass348_3188.anInt3687, -1787084939
							* aClass348_3188.anInt3689, -1014879787 * aClass348_3188.anInt3680,
					1106470835 * aClass348_3188.anInt3682, 1353014129 * aClass348_3188.anInt3688, null, null, null, 0,
					0);
		}
	}

}