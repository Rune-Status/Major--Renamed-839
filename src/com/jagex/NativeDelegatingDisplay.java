package com.jagex;

public abstract class NativeDelegatingDisplay extends DelegatingDisplay {
	NativeToolkit toolkit;

	NativeDelegatingDisplay(NativeToolkit toolkit) {
		this.toolkit = toolkit;
	}

	@Override
	void setDimensions(int width, int height) {
		if (this == toolkit.method2628()) {
			toolkit.method14957();
		}
	}

	@Override
	boolean method324() {
		toolkit.method14612();
		return true;
	}

}