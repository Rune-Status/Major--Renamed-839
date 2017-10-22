package com.jagex;

public class Class282 implements Interface28 {
	public static int anInt3162;

	Class331 aClass331_3161;
	long aLong3156 = 3109214547592109183L;
	int anInt3160;
	Font font;
	Archive fonts;
	Archive images;

	Class282(Archive images, Archive fonts, Class331 class331) {
		this.images = images;
		this.fonts = fonts;
		this.aClass331_3161 = class331;
	}

	@Override
	public void load() {
		FontSpecification specification = FontSpecification.load(fonts, -957330383 * aClass331_3161.id);
		font = Class60.activeToolkit.createFont(specification, ImageUtils.load(images, aClass331_3161.id * -957330383),
				true);
	}

	@Override
	public void method176(boolean bool) {
		int i_0_ = aClass331_3161.aClass349_3580.method5948(0, Client.anInt10682 * -1936703811)
				+ aClass331_3161.anInt3582 * 550093231;
		int i_1_ = aClass331_3161.aClass334_3581.method5811(0, Client.anInt10813 * -73018749) + 1531873203
				* aClass331_3161.anInt3583;

		String string;
		switch (aClass331_3161.anInt3586 * 90316369) {
			case 0:
				string = IgnoredPlayer.aClass266_670.method5035();
				break;
			default:
				string = "";
				break;
			case 1:
				string = IgnoredPlayer.aClass266_670.method5022() + "%";
				break;
			case 2:
				string = IgnoredPlayer.aClass266_670.method5016();
		}

		int i_2_ = IgnoredPlayer.aClass266_670.method5022();
		if (aLong3156 * 1862491996128582785L < 0L || i_2_ == 0 || i_2_ != -777339927 * anInt3160) {
			aLong3156 = TimeUtil.time() * -3109214547592109183L;
			anInt3160 = i_2_ * -380646311;
		}

		if (aClass331_3161.anInt3586 * 90316369 != 1 && TimeUtil.time() - aLong3156 * 1862491996128582785L > 10000L) {
			string += " (" + (IgnoredPlayer.aClass266_670.method5019().anInt2944 * 1189066767) + ")";
		}

		font.method2293(string, i_0_, i_1_, aClass331_3161.colour * 1147962697, -1);
	}

	@Override
	public boolean ready() {
		boolean loaded = true;
		if (!images.fileLoaded(-957330383 * aClass331_3161.id)) {
			loaded = false;
		}
		if (!fonts.fileLoaded(-957330383 * aClass331_3161.id)) {
			loaded = false;
		}

		return loaded;
	}

}