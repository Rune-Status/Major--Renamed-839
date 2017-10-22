package com.jagex;

import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

public final class DelegatingCanvas extends Canvas {

	Component delegate;

	DelegatingCanvas(Component component) {
		delegate = component;
	}

	@Override
	public final void paint(Graphics graphics) {
		delegate.paint(graphics);
	}

	@Override
	public final void update(Graphics graphics) {
		delegate.update(graphics);
	}

}