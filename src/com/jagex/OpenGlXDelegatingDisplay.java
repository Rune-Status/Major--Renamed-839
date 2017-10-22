package com.jagex;

import jaggl.OpenGL;

import java.awt.Canvas;
import java.awt.Dimension;

public class OpenGlXDelegatingDisplay extends NativeDelegatingDisplay {
	Canvas canvas;
	int width;
	long aLong11667;
	OpenGL gl;
	int height;
	boolean aBool11670 = false;

	OpenGlXDelegatingDisplay(OpenGlXToolkit toolkit, Canvas canvas) {
		this(toolkit, canvas, toolkit.gl.prepareSurface(canvas));
	}

	OpenGlXDelegatingDisplay(OpenGlXToolkit toolkit, Canvas canvas, long l) {
		super(toolkit);
		this.canvas = canvas;
		gl = toolkit.gl;
		aLong11667 = l;
		updateSize();
	}

	@Override
	public int draw() {
		if (aLong11667 == 0L) {
			throw new IllegalStateException("");
		}

		gl.swapBuffers(aLong11667);
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
		if (aLong11667 != 0L) {
			gl.releaseSurface(canvas, aLong11667);
			aLong11667 = 0L;
		}
	}

	@Override
	void setDimensions(int width, int height) {
		if (aLong11667 == 0L) {
			throw new IllegalStateException("");
		}

		gl.surfaceResized(aLong11667);
		updateSize();
		super.setDimensions(width, height);
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
		if (aLong11667 == 0L) {
			throw new IllegalStateException("");
		}

		boolean bool = true;
		if (!aBool11670) {
			bool = gl.setSurface(aLong11667);
			aBool11670 = true;
		}

		return bool && super.method324();
	}

}