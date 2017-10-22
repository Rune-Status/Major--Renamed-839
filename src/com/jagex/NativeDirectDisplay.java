package com.jagex;

public abstract class NativeDirectDisplay extends DirectDisplay {
	NativeToolkit toolkit;

	NativeDirectDisplay(NativeToolkit toolkit) {
		this.toolkit = toolkit;
	}

	void method17509() {
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