package com.jagex;

public class JavaDirectDisplay extends DirectDisplay {
	FloatRaster aClass89_11100;
	int width = 0;
	IntRaster aClass74_11102;
	JavaToolkit toolkit;

	int height = 0;

	JavaDirectDisplay(JavaToolkit toolkit) {
		this.toolkit = toolkit;
	}

	@Override
	public void method14255(Interface17 interface17) {
		FloatRaster class89 = (FloatRaster) interface17;
		if (null != aClass74_11102
				&& class89 != null
				&& (aClass74_11102.width * -1749482589 != class89.width * 312791861 || aClass74_11102.height
						* -217250767 != 187588765 * class89.height)) {
			throw new RuntimeException();
		}

		aClass89_11100 = class89;
		if (null != class89) {
			width = -2040465743 * class89.width;
			height = class89.height * 947059725;
		} else if (aClass74_11102 == null) {
			width = 0;
			height = 0;
		}

		if (this == toolkit.method2628()) {
			method324();
		}
	}

	@Override
	public void method14256(int i, Interface16 interface16) {
		if (i != 0) {
			throw new RuntimeException();
		}

		IntRaster class74 = (IntRaster) interface16;
		if (aClass89_11100 != null
				&& class74 != null
				&& (aClass89_11100.width * 312791861 != -1749482589 * class74.width || -217250767 * class74.height != 187588765 * aClass89_11100.height)) {
			throw new RuntimeException();
		}

		aClass74_11102 = class74;
		if (class74 != null) {
			width = 540379719 * class74.width;
			height = 1062404961 * class74.height;
		} else if (null == aClass89_11100) {
			width = 0;
			height = 0;
		}

		if (this == toolkit.method2628()) {
			method324();
		}
	}

	@Override
	public boolean isComplete() {
		return true;
	}

	@Override
	public void method14263(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, boolean bool, boolean bool_5_) {
		int[] is = null;
		int[] is_6_ = null;
		float[] fs = null;
		float[] fs_7_ = null;

		if (bool && aClass74_11102 != null) {
			is = aClass74_11102.data;
			is_6_ = toolkit.anIntArray8797;
		}

		if (bool_5_ && aClass89_11100 != null) {
			fs = aClass89_11100.data;
			fs_7_ = toolkit.aFloatArray8801;
		}

		ObjectDefinitionProvider.method16372(width * -176157243, toolkit.displayWidth * 464577083, is, is_6_, fs,
				fs_7_, i, i_0_, i_3_, i_4_, i_1_, i_2_);
	}

	@Override
	public int getWidth() {
		return -176157243 * width;
	}

	@Override
	public int getHeight() {
		return 1922073297 * height;
	}

	@Override
	public void delete() {

	}

	@Override
	boolean method3151() {
		return true;
	}

	@Override
	boolean method324() {
		toolkit.method14132(-176157243 * width, 1922073297 * height, aClass74_11102 == null ? null
				: aClass74_11102.data, aClass89_11100 == null ? null : aClass89_11100.data);
		return true;
	}

}