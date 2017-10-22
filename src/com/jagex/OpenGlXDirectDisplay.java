package com.jagex;

import jaggl.OpenGL;

public class OpenGlXDirectDisplay extends NativeDirectDisplay {
	static final int anInt11677 = 16;
	private static final int GL_FRAMEBUFFER = 0x8D40;
	private static final int GL_FRAMEBUFFER_COMPLETE_EXT = 0x8CD5;
	int anInt11671;
	int anInt11673;
	int anInt11676;
	OpenGlXAttachable anInterface51_11678;
	OpenGlXAttachable[] anInterface51Array11679 = new OpenGlXAttachable[4];
	int height;

	OpenGlXToolkit toolkit;

	int width;

	OpenGlXDirectDisplay(OpenGlXToolkit toolkit) {
		super(toolkit);
		this.toolkit = toolkit;
		int[] parameters = new int[1];

		if (!toolkit.aBool9408) {
			throw new RuntimeException("");
		}

		OpenGL.glGenFramebuffersEXT(1, parameters, 0);
		anInt11673 = parameters[0];
	}

	@Override
	public void delete() {
		if (anInt11673 != 0) {
			toolkit.method17354(anInt11673);
			anInt11673 = 0;
		}
	}

	@Override
	public void finalize() throws Throwable {
		super.finalize();
		delete();
	}

	@Override
	public int getHeight() {
		return height;
	}

	@Override
	public int getWidth() {
		return width;
	}

	@Override
	public boolean isComplete() {
		int status = OpenGL.glCheckFramebufferStatusEXT(GL_FRAMEBUFFER);
		return status == GL_FRAMEBUFFER_COMPLETE_EXT;
	}

	@Override
	public void method14255(Interface17 interface17) {
		OpenGlXAttachable interface51 = (OpenGlXAttachable) interface17;
		if (interface17 != null) {
			if (anInt11671 != 0) {
				if (width != interface51.getWidth() || height != interface51.getHeight()) {
					throw new RuntimeException();
				}
			} else {
				height = interface51.getHeight();
				width = interface51.getWidth();
				method17509();
			}

			anInt11671 |= 0x10;
			anInterface51_11678 = interface51;
		} else {
			anInt11671 &= ~0x10;
			anInterface51_11678 = null;
			if (anInt11671 == 0) {
				height = 0;
				width = 0;
			}
		}
		if (this == toolkit.method2628()) {
			method18154();
		} else {
			anInt11676 |= 0x10;
		}
	}

	@Override
	public void method14256(int i, Interface16 interface16) {
		int i_0_ = 1 << i;
		OpenGlXAttachable attachable = (OpenGlXAttachable) interface16;

		if (interface16 != null) {
			if (anInt11671 != 0) {
				if (width != attachable.getWidth() || height != attachable.getHeight()) {
					throw new RuntimeException();
				}
			} else {
				height = attachable.getHeight();
				width = attachable.getWidth();
				method17509();
			}

			anInt11671 |= i_0_;
			anInterface51Array11679[i] = attachable;
		} else {
			anInt11671 &= i_0_ ^ 0xffffffff;
			anInterface51Array11679[i] = null;

			if (anInt11671 == 0) {
				height = 0;
				width = 0;
			}
		}

		if (this == toolkit.method2628()) {
			method18155(i);
		} else {
			anInt11676 |= i_0_;
		}
	}

	@Override
	public void method14263(int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, boolean bool, boolean bool_6_) {
		if (bool | bool_6_) {
			int height = this.height;
			int i_8_ = toolkit.method2628().getHeight();
			int i_9_ = 0;

			if (bool_6_) {
				i_9_ |= 0x100;
			}
			if (bool) {
				i_9_ |= 0x4000;
			}

			OpenGL.glBindFramebufferEXT(36008, anInt11673);
			OpenGL.glBlitFramebufferEXT(i, height - i_1_ - i_3_, i + i_2_, height - i_1_, i_4_, i_8_ - i_5_ - i_3_,
					i_4_ + i_2_, i_8_ - i_5_, i_9_, 9728);
			OpenGL.glBindFramebufferEXT(36008, 0);
		}
	}

	void method18154() {
		if (anInterface51_11678 == null) {
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		} else {
			anInterface51_11678.attach(36096);
		}
	}

	void method18155(int i) {
		OpenGlXAttachable interface51 = anInterface51Array11679[i];
		if (interface51 == null) {
			OpenGL.glFramebufferRenderbufferEXT(36160, 36064 + i, 36161, 0);
		} else {
			interface51.attach(36064 + i);
		}
	}

	@Override
	boolean method3151() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	@Override
	boolean method324() {
		OpenGL.glBindFramebufferEXT(36160, anInt11673);
		for (int i = 0; i < 4; i++) {
			if ((anInt11676 & 1 << i) != 0) {
				method18155(i);
			}
		}

		if ((anInt11676 & 0x10) != 0) {
			method18154();
		}

		anInt11676 = 0;
		return super.method324();
	}

}