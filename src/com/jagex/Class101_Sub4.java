package com.jagex;

public class Class101_Sub4 extends Class101 {
	Class101_Sub4(OpenGlToolkit toolkit) {
		super(toolkit);
	}

	@Override
	boolean method1811() {
		return true;
	}

	@Override
	void method1812(boolean bool) {
		toolkit.method14336(true);
	}

	@Override
	void method1814() {
		toolkit.method14336(false);
	}

	@Override
	void method1815(int i, int i_0_) {

	}

	@Override
	void activate(OpenGlTexture texture, int i) {
		toolkit.setActiveTexture(texture);
		toolkit.setColourOp(i);
	}

	@Override
	void method1828(boolean bool) {

	}

}