package com.jagex;

import jaggl.OpenGL;

public class Class112 {

	OpenGlAttachableRenderBuffer aClass480_Sub31_Sub3_1414;
	OpenGlDirectDisplay aClass146_Sub2_Sub1_1415;
	OpenGlDirectDisplay aClass146_Sub2_Sub1_1416;
	OpenGlDirectDisplay aClass146_Sub2_Sub1_1417;
	int anInt1418;
	OpenGl2DTexture[] aClass102_Sub1Array1419;
	OpenGlToolkit toolkit;
	int anInt1421;
	boolean aBool1422;
	Deque aClass644_1423;
	int anInt1424 = 0;
	boolean aBool1425;
	boolean aBool1426;
	boolean aBool1427;
	int anInt1428;
	boolean aBool1429;
	OpenGl2DTexture aClass102_Sub1_1430;
	OpenGlAttachableRenderBuffer aClass480_Sub31_Sub3_1431;
	boolean aBool1432;
	int anInt1433;
	Class151 aClass151_1434;

	Class112(OpenGlToolkit toolkit) {
		anInt1428 = 1;
		anInt1418 = 1;
		aClass644_1423 = new Deque();
		aBool1429 = true;
		aBool1425 = true;
		aBool1426 = true;
		aBool1427 = true;
		aClass102_Sub1Array1419 = new OpenGl2DTexture[2];
		aClass151_1434 = Class151.aClass151_2;
		this.toolkit = toolkit;

		if (toolkit.aBool9035 && toolkit.aBool9126) {
			aClass146_Sub2_Sub1_1417 = aClass146_Sub2_Sub1_1415 = new OpenGlDirectDisplay(toolkit);
			if (toolkit.anInt8992 > 1 && toolkit.aBool9116 && toolkit.aBool9117) {
				aClass146_Sub2_Sub1_1417 = aClass146_Sub2_Sub1_1416 = new OpenGlDirectDisplay(toolkit);
			}
		}
	}

	void method2032() {
		aClass146_Sub2_Sub1_1415 = null;
		aClass146_Sub2_Sub1_1416 = null;
		aClass146_Sub2_Sub1_1417 = null;
		aClass480_Sub31_Sub3_1431 = null;
		aClass102_Sub1_1430 = null;
		aClass102_Sub1Array1419 = null;
		aClass480_Sub31_Sub3_1414 = null;

		if (!aClass644_1423.isEmpty()) {
			for (Linkable class480 = aClass644_1423.head(); class480 != aClass644_1423.tail; class480 = class480.next) {
				((Class480_Sub4) class480).destroy();
			}
		}

		anInt1418 = 1;
		anInt1428 = 1;
	}

	boolean method2033() {
		return aClass146_Sub2_Sub1_1417 != null;
	}

	boolean method2034() {
		return aBool1422;
	}

	boolean method2035() {
		for (Class480_Sub4 class480_sub4 = (Class480_Sub4) aClass644_1423.head(); class480_sub4 != null; class480_sub4 = (Class480_Sub4) aClass644_1423
				.next()) {
			if (!class480_sub4.method15528()) {
				return false;
			}
		}
		return true;
	}

	boolean method2037(int i, int i_0_, int i_1_, int i_2_) {
		if (aClass146_Sub2_Sub1_1417 == null || aClass644_1423.isEmpty() || method2035()) {
			return false;
		}
		if (anInt1428 != i_1_ || anInt1418 != i_2_) {
			anInt1428 = i_1_;
			anInt1418 = i_2_;
			for (Linkable class480 = aClass644_1423.head(); class480 != aClass644_1423.tail; class480 = class480.next) {
				((Class480_Sub4) class480).method15491(anInt1428, anInt1418);
			}
			aBool1429 = true;
			aBool1425 = true;
			aBool1426 = true;
		}
		if (method2041()) {
			anInt1424 = i;
			anInt1421 = i_0_;
			aBool1422 = true;
			toolkit.method14290(-anInt1424, anInt1418 + anInt1421 - toolkit.method2628().getHeight());
			toolkit.method2397(aClass146_Sub2_Sub1_1417);
			aClass146_Sub2_Sub1_1417.method17475(0);
			toolkit.method2426(3, 0);
			return true;
		}
		return false;
	}

	void method2038(int i, int i_3_) {
		if (aBool1422) {
			if (aClass146_Sub2_Sub1_1416 != null) {
				toolkit.method2398(aClass146_Sub2_Sub1_1416);
				toolkit.method2397(aClass146_Sub2_Sub1_1415);
				aClass146_Sub2_Sub1_1415.method17475(0);
				aClass146_Sub2_Sub1_1416.method14263(0, 0, anInt1428, anInt1418, 0, 0, true, aBool1432);
			}
			toolkit.method14322();
			toolkit.setBlendMode(0);
			toolkit.setColourOp(1);
			toolkit.method2421();
			int i_4_ = 0;
			int i_5_ = 1;
			int i_6_ = 0;
			int i_7_ = 0;
			int i_8_ = 0;
			for (Class480_Sub4 class480_sub4 = (Class480_Sub4) aClass644_1423.head(); class480_sub4 != null; class480_sub4 = (Class480_Sub4) aClass644_1423
					.next()) {
				if (!class480_sub4.method15528()) {
					i_7_++;
				}
			}
			Class480_Sub4[] class480_sub4s = new Class480_Sub4[i_7_];
			i_7_ = 0;
			for (Class480_Sub4 class480_sub4 = (Class480_Sub4) aClass644_1423.head(); class480_sub4 != null; class480_sub4 = (Class480_Sub4) aClass644_1423
					.next()) {
				if (!class480_sub4.method15528()) {
					class480_sub4s[i_7_++] = class480_sub4;
				}
			}
			while (i_6_ < i_7_) {
				for (int i_9_ = 0; i_9_ < i_7_; i_9_++) {
					Class480_Sub4 class480_sub4 = class480_sub4s[i_9_];
					if (class480_sub4.method15495() == i_8_) {
						int i_10_ = class480_sub4.method15497();
						for (int i_11_ = 0; i_11_ < i_10_; i_11_++) {
							toolkit.method14290(0, 0);
							class480_sub4.method15492(i_11_, aClass102_Sub1Array1419[i_4_], aClass102_Sub1_1430, i_3_,
									i);
							if (i_11_ == i_10_ - 1 && i_6_ == i_7_ - 1) {
								toolkit.method2398(aClass146_Sub2_Sub1_1415);
								OpenGL.glBegin(7);
								OpenGL.glTexCoord2f(0.0F, 0 + anInt1418);
								OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
								OpenGL.glVertex2i(anInt1424, anInt1421);
								OpenGL.glTexCoord2f(0.0F, anInt1418 - i_3_);
								OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
								OpenGL.glVertex2i(anInt1424, anInt1421 + i_3_);
								OpenGL.glTexCoord2f(0 + i, anInt1418 - i_3_);
								OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
								OpenGL.glVertex2i(anInt1424 + i, anInt1421 + i_3_);
								OpenGL.glTexCoord2f(0 + i, 0 + anInt1418);
								OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
								OpenGL.glVertex2i(anInt1424 + i, anInt1421);
								OpenGL.glEnd();
							} else {
								aClass146_Sub2_Sub1_1415.method17475(i_5_);
								OpenGL.glBegin(7);
								OpenGL.glTexCoord2f(0.0F, anInt1418);
								OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
								OpenGL.glVertex2i(0, 0);
								OpenGL.glTexCoord2f(0.0F, anInt1418 - i_3_);
								OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
								OpenGL.glVertex2i(0, i_3_);
								OpenGL.glTexCoord2f(i, anInt1418 - i_3_);
								OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
								OpenGL.glVertex2i(i, i_3_);
								OpenGL.glTexCoord2f(i, anInt1418);
								OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
								OpenGL.glVertex2i(i, 0);
								OpenGL.glEnd();
							}
							class480_sub4.method15493();
							i_5_ = i_5_ + 1 & 0x1;
							i_4_ = i_4_ + 1 & 0x1;
						}
						i_6_++;
					}
				}
				i_8_++;
			}
			aBool1422 = false;
		}
	}

	boolean method2039(Class480_Sub4 class480_sub4) {
		if (aClass146_Sub2_Sub1_1417 != null) {
			if (class480_sub4.method15487() || class480_sub4.method15509()) {
				aClass644_1423.pushBack(class480_sub4);
				method2051();
				if (class480_sub4.method15495() >= 0 && method2041()) {
					if (anInt1428 != -1 && anInt1418 != -1) {
						class480_sub4.method15491(anInt1428, anInt1418);
					}
					class480_sub4.aBool9986 = true;
					return true;
				}
			}
			method2040(class480_sub4);
		}
		return false;
	}

	void method2040(Class480_Sub4 class480_sub4) {
		class480_sub4.aBool9986 = false;
		class480_sub4.destroy();
		class480_sub4.unlink();
		method2051();
	}

	boolean method2041() {
		if (aBool1425) {
			if (aClass480_Sub31_Sub3_1431 != null) {
				aClass480_Sub31_Sub3_1431.deleteImmediately();
				aClass480_Sub31_Sub3_1431 = null;
			}
			if (aClass102_Sub1_1430 != null) {
				aClass102_Sub1_1430.deleteImmediately();
				aClass102_Sub1_1430 = null;
			}
		}
		if (aBool1429) {
			if (aClass480_Sub31_Sub3_1414 != null) {
				aClass480_Sub31_Sub3_1414.deleteImmediately();
				aClass480_Sub31_Sub3_1414 = null;
			}
			if (aClass102_Sub1Array1419[0] != null) {
				aClass102_Sub1Array1419[0].deleteImmediately();
				aClass102_Sub1Array1419[0] = null;
			}
			if (aClass102_Sub1Array1419[1] != null) {
				aClass102_Sub1Array1419[1].deleteImmediately();
				aClass102_Sub1Array1419[1] = null;
			}
		}
		if (aBool1425) {
			if (aClass146_Sub2_Sub1_1416 != null) {
				aClass480_Sub31_Sub3_1431 = new OpenGlAttachableRenderBuffer(toolkit, Class121.aClass121_1467,
						Class151.aClass151_1854, anInt1428, anInt1418, toolkit.anInt8992);
			}
			if (aBool1432) {
				aClass102_Sub1_1430 = new OpenGl2DTexture(toolkit, 34037, Class121.aClass121_1467,
						Class151.aClass151_1854, anInt1428, anInt1418);
			} else if (aClass480_Sub31_Sub3_1431 == null) {
				aClass480_Sub31_Sub3_1431 = new OpenGlAttachableRenderBuffer(toolkit, Class121.aClass121_1467,
						Class151.aClass151_1854, anInt1428, anInt1418);
			}
			aBool1425 = false;
			aBool1426 = true;
			aBool1427 = true;
		}
		if (aBool1429) {
			if (aClass146_Sub2_Sub1_1416 != null) {
				aClass480_Sub31_Sub3_1414 = new OpenGlAttachableRenderBuffer(toolkit, Class121.aClass121_1465, aClass151_1434,
						anInt1428, anInt1418, toolkit.anInt8992);
			}
			aClass102_Sub1Array1419[0] = new OpenGl2DTexture(toolkit, 34037, Class121.aClass121_1465, aClass151_1434,
					anInt1428, anInt1418);
			aClass102_Sub1Array1419[1] = anInt1433 > 1 ? new OpenGl2DTexture(toolkit, 34037, Class121.aClass121_1465,
					aClass151_1434, anInt1428, anInt1418) : null;
			aBool1429 = false;
			aBool1426 = true;
			aBool1427 = true;
		}
		if (aBool1426) {
			if (aClass146_Sub2_Sub1_1416 != null) {
				toolkit.method2397(aClass146_Sub2_Sub1_1415);
				aClass146_Sub2_Sub1_1415.method14255(null);
				aClass146_Sub2_Sub1_1415.method14256(0, null);
				aClass146_Sub2_Sub1_1415.method14256(1, null);
				aClass146_Sub2_Sub1_1415.method14256(0, aClass102_Sub1Array1419[0].method13938(0));
				aClass146_Sub2_Sub1_1415.method14256(1, anInt1433 > 1 ? aClass102_Sub1Array1419[1].method13938(0)
						: null);
				if (aBool1432) {
					aClass146_Sub2_Sub1_1415.method14255(aClass102_Sub1_1430.method435(0));
				}
				toolkit.method2398(aClass146_Sub2_Sub1_1415);
				toolkit.method2397(aClass146_Sub2_Sub1_1416);
				aClass146_Sub2_Sub1_1416.method14255(null);
				aClass146_Sub2_Sub1_1416.method14256(0, null);
				aClass146_Sub2_Sub1_1416.method14256(0, aClass480_Sub31_Sub3_1414);
				aClass146_Sub2_Sub1_1416.method14255(aClass480_Sub31_Sub3_1431);
				toolkit.method2398(aClass146_Sub2_Sub1_1416);
			} else {
				toolkit.method2397(aClass146_Sub2_Sub1_1415);
				aClass146_Sub2_Sub1_1415.method14255(null);
				aClass146_Sub2_Sub1_1415.method14256(0, null);
				aClass146_Sub2_Sub1_1415.method14256(1, null);
				aClass146_Sub2_Sub1_1415.method14256(0, aClass102_Sub1Array1419[0].method13938(0));
				aClass146_Sub2_Sub1_1415.method14256(1, anInt1433 > 1 ? aClass102_Sub1Array1419[1].method13938(0)
						: null);
				if (aBool1432) {
					aClass146_Sub2_Sub1_1415.method14255(aClass102_Sub1_1430.method435(0));
				} else {
					aClass146_Sub2_Sub1_1415.method14255(aClass480_Sub31_Sub3_1431);
				}
				toolkit.method2398(aClass146_Sub2_Sub1_1415);
			}
			aBool1426 = false;
			aBool1427 = true;
		}
		if (aBool1427) {
			toolkit.method2397(aClass146_Sub2_Sub1_1417);
			aBool1427 = !aClass146_Sub2_Sub1_1417.isComplete();
			toolkit.method2398(aClass146_Sub2_Sub1_1417);
		}
		return !aBool1427;
	}

	void method2051() {
		int i = 0;
		boolean bool = false;
		Class151 class151 = Class151.aClass151_2;
		for (Class480_Sub4 class480_sub4 = (Class480_Sub4) aClass644_1423.head(); class480_sub4 != null; class480_sub4 = (Class480_Sub4) aClass644_1423
				.next()) {
			Class151 class151_12_ = class480_sub4.method15520();
			if (class151_12_.size * -172886387 > class151.size * -172886387) {
				class151 = class151_12_;
			}
			bool |= class480_sub4.method15496();
			i += class480_sub4.method15497();
		}
		if (class151 != aClass151_1434) {
			aClass151_1434 = class151;
			aBool1429 = true;
		}
		int i_13_ = anInt1433 > 2 ? 2 : anInt1433;
		int i_14_ = i > 2 ? 2 : i;
		if (i_13_ != i_14_) {
			aBool1429 = true;
			aBool1426 = true;
		}
		if (bool != aBool1432) {
			aBool1432 = bool;
			aBool1425 = true;
		}
		anInt1433 = i;
	}
}
