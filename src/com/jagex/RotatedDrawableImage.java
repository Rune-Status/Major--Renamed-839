package com.jagex;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

public class RotatedDrawableImage extends DrawableImage {
	Class263 this$0;
	float step;

	float rotation;

	RotatedDrawableImage(Class263 class263, Image image, int offsetX, int offsetY, float step) {
		super(class263, image, offsetX, offsetY);
		this$0 = class263;
		this.step = step;
		this.rotation = -step;
	}

	@Override
	void draw(Graphics graphics) {
		rotation += step;
		if (rotation < 0.0F) {
			rotation += 360.0F;
		}

		rotation %= 360.0F;
		double theta = Math.toRadians(rotation);
		int width = image.getWidth(null);
		int height = image.getHeight(null);
		Graphics2D graphics2d = (Graphics2D) graphics;
		graphics2d.rotate(theta, this$0.method4973(width) + width / 2 + offsetX * -232126773, this$0.method4974(height)
				+ height / 2 + offsetY * 2095638499);
		graphics2d.translate(this$0.method4973(width) + offsetX * -232126773, this$0.method4974(height) + offsetY
				* 2095638499);
		graphics2d.drawImage(image, null, null);
		graphics2d.setTransform(this$0.affine);
	}

}