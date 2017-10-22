package com.jagex;

import jaggl.OpenGL;

import java.awt.Canvas;
import java.awt.Dimension;

public class OpenGlDelegatingDisplay extends DelegatingDisplay {
	OpenGL gl;
	int height;
	Canvas canvas;
	long aLong11124;
	boolean aBool11125;
	int width;
	boolean aBool11127 = false;
	OpenGlToolkit toolkit;

	OpenGlDelegatingDisplay(OpenGlToolkit toolkit, Canvas canvas) {
		this(toolkit, canvas, toolkit.gl.prepareSurface(canvas));
	}

	OpenGlDelegatingDisplay(OpenGlToolkit toolkit, Canvas canvas, long l) {
		this.toolkit = toolkit;
		this.canvas = canvas;
		gl = toolkit.gl;
		aLong11124 = l;
		updateSize();
	}

	@Override
	public int draw() {
		if (aBool11127) {
			throw new IllegalStateException();
		}

		gl.swapBuffers(aLong11124);
		return 0;
	}

	@Override
	public int draw(int x, int y) {
		return 0;
	}

	@Override
	public int getWidth() {
		return width;
	}

	@Override
	public int getHeight() {
		return height;
	}

	@Override
	public void delete() {
		if (aBool11127) {
			throw new IllegalStateException();
		}

		gl.releaseSurface(canvas, aLong11124);
		aBool11127 = true;
		aBool11125 = false;
	}

	@Override
	void setDimensions(int width, int height) {
		if (aBool11127) {
			throw new IllegalStateException();
		}

		gl.surfaceResized(aLong11124);
		updateSize();

		if (this == toolkit.method2628()) {
			toolkit.method14277();
		}
	}

	void updateSize() {
		Dimension dimension = canvas.getSize();
		height = dimension.height;
		width = dimension.width;
	}

	@Override
	boolean method3151() {
		return true;
	}

	@Override
	boolean method324() {
		if (aBool11127) {
			throw new IllegalStateException();
		}

		if (!aBool11125) {
			gl.setSurface(aLong11124);
			aBool11125 = true;
		}

		toolkit.method14276();
		return true;
	}

}