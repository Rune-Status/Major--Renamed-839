package com.jagex;

public class Class293 implements Interface28 {
	static MenuOption aClass480_Sub31_Sub17_3254;
	static Sprite[] crosses;

	public static void method5402() {
		if (null != IgnoredPlayer.aClass266_670) {
			IgnoredPlayer.aClass266_670.method5008();
		}
		if (null != Class263.aThread2955) {
			for (;;) {
				try {
					Class263.aThread2955.join();
					break;
				} catch (InterruptedException interruptedexception) {

				}
			}
		}
	}

	static int method5403(int i) {
		LinkableInt linkable = (LinkableInt) Class570.aClass667_7639.get(i);
		if (linkable == null) {
			Class361 class361 = Class198.anInterface44_2095.load(i);
			if (class361 == null || 2 != 939371847 * class361.anInt3894) {
				return -1;
			}
			linkable = new LinkableInt(1765478053 * Class570.anInt7642);
			Class570.aClass667_7639.put(i, linkable);
			Class570.aClass361Array7635[(Class570.anInt7642 += 827205933) * 1765478053 - 1] = class361;
		}
		return linkable.value * -1189875169;
	}

	Class350 aClass350_3251;
	Archive images;
	Sprite sprite;

	Class293(Archive images, Class350 class350) {
		this.images = images;
		aClass350_3251 = class350;
	}

	@Override
	public boolean ready() {
		return images.fileLoaded(aClass350_3251.image * 535483733);
	}

	@Override
	public void load() {
		sprite = Class213.method4019(images, 535483733 * aClass350_3251.image);
	}

	@Override
	public void method176(boolean bool) {
		if (bool) {
			int i_0_ = Engine.screenWidth * 1319181337 > -1936703811 * Client.anInt10682 ? Engine.screenWidth * 1319181337
					: -1936703811 * Client.anInt10682;
			int i_1_ = Engine.screenHeight * -551672947 > Client.anInt10813 * -73018749 ? Engine.screenHeight
					* -551672947 : -73018749 * Client.anInt10813;
			int width = sprite.scaleWidth();
			int height = sprite.scaleHeight();
			int i_4_ = 0;
			int i_5_ = i_0_;
			int i_6_ = i_0_ * height / width;
			int i_7_ = (i_1_ - i_6_) / 2;

			if (i_6_ > i_1_) {
				i_7_ = 0;
				i_6_ = i_1_;
				i_5_ = width * i_1_ / height;
				i_4_ = (i_0_ - i_5_) / 2;
			}

			sprite.method2145(i_4_, i_7_, i_5_, i_6_);
		}
	}

}