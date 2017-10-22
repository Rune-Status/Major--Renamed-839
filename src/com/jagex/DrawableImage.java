package com.jagex;

import java.awt.Graphics;
import java.awt.Image;

public class DrawableImage extends Drawable {
	static void method15208(int i) {
		Class480_Sub1.anInt9963 = -1740504919 * i;
		Class480_Sub1.aClass168_9962.clear();
	}

	Image image;
	Class263 this$0;

	DrawableImage(Class263 class263, Image image, int offsetX, int offsetY) {
		super(class263, offsetX, offsetY);
		this$0 = class263;
		this.image = image;
	}

	@Override
	void draw(Graphics graphics) {
		int x = this$0.method4973(image.getWidth(null)) + offsetX * -232126773;
		int y = this$0.method4974(image.getHeight(null)) + offsetY * 2095638499;
		graphics.drawImage(image, x, y, null);
	}

}