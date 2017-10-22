package com.jagex;

import java.awt.Component;
import java.awt.Point;
import java.awt.Robot;
import java.awt.image.BufferedImage;

public class Class478 {

	Robot robot;

	public Class478() throws Exception {
		robot = new Robot();
	}

	public void setCustomCursor(Component component, int[] data, int width, int height, Point point) {
		if (data != null) {
			BufferedImage image = new BufferedImage(width, height, 2);
			image.setRGB(0, 0, width, height, data, 0, width);
			component.setCursor(component.getToolkit().createCustomCursor(image, point, null));
		} else {
			component.setCursor(null);
		}
	}

}