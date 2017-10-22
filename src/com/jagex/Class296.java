package com.jagex;

public abstract class Class296 implements Interface28 {
	long aLong3270;
	Archive fonts;
	Font font;
	Class340 aClass340_3273;

	int anInt3274;

	Archive images;

	Class296(Archive images, Archive fonts, Class340 class340) {
		this.images = images;
		this.fonts = fonts;
		aClass340_3273 = class340;
	}

	@Override
	public boolean ready() {
		boolean bool = true;
		if (!images.fileLoaded(aClass340_3273.anInt3636 * -998046321)) {
			bool = false;
		}
		if (!fonts.fileLoaded(-998046321 * aClass340_3273.anInt3636)) {
			bool = false;
		}
		return bool;
	}

	@Override
	public void load() {
		FontSpecification specification = FontSpecification.load(fonts, -998046321 * aClass340_3273.anInt3636);
		font = Class60.activeToolkit.createFont(specification,
				ImageUtils.load(images, -998046321 * aClass340_3273.anInt3636), true);
	}

	@Override
	public void method176(boolean bool) {
		int i_0_ = aClass340_3273.aClass349_3630.method5948(aClass340_3273.anInt3633 * 883415057, -1936703811
				* Client.anInt10682)
				+ -1014966953 * aClass340_3273.anInt3631;
		int i_1_ = aClass340_3273.aClass334_3635.method5811(aClass340_3273.anInt3634 * -1664223293, Client.anInt10813
				* -73018749)
				+ aClass340_3273.anInt3629 * 458356303;
		method5421(bool, i_0_, i_1_, 1995754991);
		method5422(bool, i_0_, i_1_, -2062786135);
		String string = IgnoredPlayer.aClass266_670.method5016();
		if (TimeUtil.time() - 8358009879975169895L * aLong3270 > 10000L) {
			string = new StringBuilder().append(string).append(" (")
					.append(IgnoredPlayer.aClass266_670.method5019().anInt2944 * 1189066767).append(")")
					.toString();
		}
		font.method2293(string, i_0_ + aClass340_3273.anInt3633 * 883415057 / 2, aClass340_3273.anInt3634
				* -1664223293 / 2 + i_1_ + 4 + 149441097 * aClass340_3273.anInt3632, -1918746481
				* aClass340_3273.anInt3637, -1);
	}

	abstract void method5421(boolean bool, int i, int i_2_, int i_3_);

	abstract void method5422(boolean bool, int i, int i_4_, int i_5_);

	int method5423() {
		int i_6_ = IgnoredPlayer.aClass266_670.method5022();
		int i_7_ = 100 * i_6_;
		if (1015851189 * anInt3274 == i_6_ && 0 != i_6_) {
			int i_8_ = IgnoredPlayer.aClass266_670.method5018(-825024534);
			if (i_8_ > i_6_) {
				long l = aLong3270 * 8358009879975169895L - IgnoredPlayer.aClass266_670.method5031(-724947114);
				if (l > 0L) {
					long l_9_ = (i_8_ - i_6_) * (l * 10000L / i_6_);
					long l_10_ = (TimeUtil.time() - 8358009879975169895L * aLong3270) * 10000L;
					if (l_10_ < l_9_) {
						i_7_ = (int) (l_10_ * (i_8_ - i_6_) * 100L / l_9_ + i_6_ * 100);
					} else {
						i_7_ = 100 * i_8_;
					}
				}
			}
		} else {
			anInt3274 = i_6_ * -531823203;
			aLong3270 = TimeUtil.time() * 1253341056490576983L;
		}
		return i_7_;
	}

}