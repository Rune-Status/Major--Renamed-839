package com.jagex;

import jaggl.OpenGL;

public class OpenGlDirectDisplay extends DirectDisplay {
	static final int anInt11097 = 16;
	private static final int GL_FRAMEBUFFER = 0x8D40;
	private static final int GL_FRAMEBUFFER_COMPLETE_EXT = 0x8CD5;
	private static final int GL_READ_FRAMEBUFFER = 0x8CA8;

	int anInt11092;
	int anInt11099;
	OpenGlAttachable anInterface10_11098;
	OpenGlAttachable[] anInterface10Array11094 = new OpenGlAttachable[4];
	int frameBuffer;
	int height;
	OpenGlToolkit toolkit;
	int width;

	OpenGlDirectDisplay(OpenGlToolkit toolkit) {
		if (!toolkit.aBool9035) {
			throw new IllegalStateException("");
		}

		this.toolkit = toolkit;
		int[] parameters = new int[1];
		OpenGL.glGenFramebuffersEXT(1, parameters, 0);
		frameBuffer = parameters[0];
	}

	@Override
	public void delete() {
		if (frameBuffer != 0) {
			toolkit.deleteFrameBuffer(frameBuffer);
			frameBuffer = 0;
		}
	}

	@Override
	public void finalize() throws Throwable {
		super.finalize();
		delete();
	}

	@Override
	public boolean isComplete() {
		int status = OpenGL.glCheckFramebufferStatusEXT(GL_FRAMEBUFFER);
		return status == GL_FRAMEBUFFER_COMPLETE_EXT;
	}

	@Override
	public void method14255(Interface17 interface17) {
		OpenGlAttachable attachable = (OpenGlAttachable) interface17;
		if (interface17 != null) {
			if ((anInt11099 | 0x10) != 16) {
				if (width != attachable.getWidth() || height != attachable.getHeight()) {
					throw new RuntimeException();
				}
			} else {
				height = attachable.getHeight();
				width = attachable.getWidth();

				if (this == toolkit.method2628()) {
					toolkit.method14277();
				}
			}

			anInt11099 |= 0x10;
			anInterface10_11098 = attachable;
		} else {
			anInt11099 &= ~0x10;
			anInterface10_11098 = null;

			if (anInt11099 == 0) {
				height = 0;
				width = 0;
			}
		}

		if (this == toolkit.method2628()) {
			method17476();
		} else {
			anInt11092 |= 0x10;
		}
	}

	@Override
	public void method14256(int i, Interface16 interface16) {
		int i_0_ = 1 << i;
		OpenGlAttachable attachable = (OpenGlAttachable) interface16;
		if (interface16 != null) {
			if ((anInt11099 | i_0_) != i_0_) {
				if (width != attachable.getWidth() || height != attachable.getHeight()) {
					throw new RuntimeException();
				}
			} else {
				height = attachable.getHeight();
				width = attachable.getWidth();

				if (this == toolkit.method2628()) {
					toolkit.method14277();
				}
			}

			anInt11099 |= i_0_;
			anInterface10Array11094[i] = attachable;
		} else {
			anInt11099 &= i_0_ ^ 0xffffffff;
			anInterface10Array11094[i] = null;

			if (anInt11099 == 0) {
				height = 0;
				width = 0;
			}
		}

		if (this == toolkit.method2628()) {
			method17471(i);
		} else {
			anInt11092 |= i_0_;
		}
	}

	@Override
	public void method14263(int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, boolean bool, boolean bool_6_) {
		if (bool | bool_6_) {
			int i_7_ = height;
			int i_8_ = toolkit.method2628().getHeight();
			int i_9_ = 0;

			if (bool_6_) {
				i_9_ |= 0x100;
			}

			if (bool) {
				i_9_ |= 0x4000;
			}

			OpenGL.glBindFramebufferEXT(GL_READ_FRAMEBUFFER, frameBuffer);
			OpenGL.glBlitFramebufferEXT(i, i_7_ - i_1_ - i_3_, i + i_2_, i_7_ - i_1_, i_4_, i_8_ - i_5_ - i_3_, i_4_
					+ i_2_, i_8_ - i_5_, i_9_, 9728);
			OpenGL.glBindFramebufferEXT(GL_READ_FRAMEBUFFER, 0);
		}
	}

	@Override
	public int getWidth() {
		return width;
	}

	@Override
	public int getHeight() {
		return height;
	}

	void method17471(int i) {
		OpenGlAttachable attachable = anInterface10Array11094[i];
		if (attachable == null) {
			OpenGL.glFramebufferRenderbufferEXT(GL_FRAMEBUFFER, 36064 + i, 36161, 0);
		} else {
			attachable.attach(36064 + i);
		}
	}

	void method17475(int i) {
		OpenGL.glDrawBuffer(36064 + i);
	}

	void method17476() {
		if (anInterface10_11098 == null) {
			OpenGL.glFramebufferRenderbufferEXT(GL_FRAMEBUFFER, 36096, 36161, 0);
		} else {
			anInterface10_11098.attach(36096);
		}
	}

	@Override
	boolean method3151() {
		OpenGL.glBindFramebufferEXT(GL_FRAMEBUFFER, 0);
		return true;
	}

	@Override
	boolean method324() {
		OpenGL.glBindFramebufferEXT(GL_FRAMEBUFFER, frameBuffer);
		for (int i = 0; i < 4; i++) {
			if ((anInt11092 & 1 << i) != 0) {
				method17471(i);
			}
		}

		if ((anInt11092 & 0x10) != 0) {
			method17476();
		}

		anInt11092 = 0;
		toolkit.method14276();
		return true;
	}

}