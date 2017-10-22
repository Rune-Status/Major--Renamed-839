package com.jagex;

public class IntRaster implements Interface16 {
	public static String architecture;

	int width;
	int height;
	int[] data;

	IntRaster(int width, int height) {
		this(width, height, new int[width * height]);
	}

	IntRaster(int width, int height, int[] raster) {
		this.width = width * -565360629;
		this.height = height * -224930607;
		this.data = raster;
	}

	@Override
	public int getWidth() {
		return -1749482589 * width;
	}

	@Override
	public int getHeight() {
		return height * -217250767;
	}

	@Override
	public void deleteImmediately() {

	}

}