package com.jagex;

public class Class289 implements Interface28 {
	Archive images;
	Class367 aClass367_3228;

	Sprite sprite;

	Class289(Archive class406, Class367 class367) {
		images = class406;
		aClass367_3228 = class367;
	}

	@Override
	public boolean ready() {
		return images.fileLoaded(-1872155545 * aClass367_3228.image);
	}

	@Override
	public void load() {
		sprite = Class213.method4019(images, -1872155545 * aClass367_3228.image);
	}

	@Override
	public void method176(boolean bool) {
		if (bool) {
			int i_0_ = aClass367_3228.aClass349_4045.method5948(sprite.scaleWidth(), -1936703811 * Client.anInt10682) + aClass367_3228.anInt4047 * -923385377;
			int i_1_ = aClass367_3228.aClass334_4046.method5811(sprite.scaleHeight(), Client.anInt10813 * -73018749) + 269378445 * aClass367_3228.anInt4048;
			sprite.method2079(i_0_, i_1_);
		}
	}

}