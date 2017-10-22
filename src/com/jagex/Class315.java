package com.jagex;

import java.nio.ByteBuffer;
import java.util.Vector;

public class Class315 {
	int anInt3336;
	DirectDisplay aClass146_Sub2_3337;
	Interface40 anInterface40_3338;
	Class323 aClass323_3339;
	NativeToolkit toolkit;
	Interface40 anInterface40_3341;
	Interface16 anInterface16_3342;
	Interface16 anInterface16_3343;
	Interface16 anInterface16_3344;
	Interface16 anInterface16_3345;
	int anInt3346;
	Interface17 anInterface17_3347;
	int anInt3348;
	Vector<Class309> aVector3349 = new Vector<Class309>();
	int anInt3350;
	int anInt3351 = 0;
	Class151 aClass151_3352 = Class151.aClass151_2;
	boolean aBool3353;
	Interface17 anInterface17_3354;
	NativeArrayBuffer anInterface32_3355;
	DirectDisplay display;
	int anInt3357;
	Interface40 anInterface40_3358;

	Class315(NativeToolkit toolkit, int i, int i_5_) {
		this.toolkit = toolkit;
		anInt3348 = i;
		anInt3336 = i_5_;
	}

	void method5666() {
		if (display != null) {
			display.delete();
			display = null;
		}

		if (anInterface16_3345 != null) {
			anInterface16_3345.deleteImmediately();
			anInterface16_3345 = null;
		}
		if (anInterface17_3347 != null) {
			anInterface17_3347.deleteImmediately();
			anInterface17_3347 = null;
		}
		if (aClass146_Sub2_3337 != null) {
			aClass146_Sub2_3337.delete();
		}
		if (anInterface16_3342 != null) {
			anInterface16_3342.deleteImmediately();
		}
		if (anInterface16_3343 != null) {
			anInterface16_3343.deleteImmediately();
		}
		if (anInterface16_3344 != null) {
			anInterface16_3344.deleteImmediately();
		}
		if (anInterface40_3358 != null) {
			anInterface40_3358.deleteImmediately();
		}
		if (anInterface40_3338 != null) {
			anInterface40_3338.deleteImmediately();
		}
		if (anInterface40_3341 != null) {
			anInterface40_3341.deleteImmediately();
		}
		if (anInterface17_3354 != null) {
			anInterface17_3354.deleteImmediately();
		}
		int i = aVector3349.size();
		for (int i_0_ = 0; i_0_ < i; i_0_++) {
			Class309 class309 = aVector3349.elementAt(i_0_);
			class309.method5507();
		}
	}

	void method5667() {
		toolkit.method14620(0, anInterface32_3355);
		toolkit.method14697(aClass323_3339);
		toolkit.method14707(Class333.aClass333_3597, 0, 1);
	}

	void method5668() {
		method5696();
		switch (anInt3357) {
			default:
				throw new RuntimeException();
			case 1:
				aClass151_3352 = Class151.aClass151_1855;
				break;
			case 2:
				aClass151_3352 = Class151.aClass151_1;
				break;
			case 0:
				aClass151_3352 = Class151.aClass151_2;
		}
		aClass146_Sub2_3337 = toolkit.createDirectDisplay();
		if (toolkit.anInt9400 > 1 && toolkit.aBool9409 && toolkit.aBool9271) {
			display = toolkit.createDirectDisplay();
			anInterface16_3345 = toolkit.method2401(anInt3348, anInt3336, Class121.aClass121_1465, aClass151_3352,
					toolkit.anInt9400);
			anInterface17_3347 = toolkit.method2403(anInt3348, anInt3336, toolkit.anInt9400);
		}
		anInterface40_3358 = toolkit.create2DTexture(Class121.aClass121_1465, aClass151_3352, anInt3348, anInt3336);
		anInterface16_3342 = anInterface40_3358.method305(0);
		anInterface40_3338 = toolkit.create2DTexture(Class121.aClass121_1465, aClass151_3352, anInt3348, anInt3336);
		anInterface16_3343 = anInterface40_3338.method305(0);
		anInterface40_3341 = toolkit.create2DTexture(Class121.aClass121_1465, aClass151_3352, anInt3348, anInt3336);
		anInterface16_3344 = anInterface40_3341.method305(0);
		anInterface17_3354 = toolkit.method2774(anInterface40_3341.getWidth(), anInterface40_3341.getHeight());
		int i = aVector3349.size();
		for (int i_1_ = 0; i_1_ < i; i_1_++) {
			Class309 class309 = aVector3349.elementAt(i_1_);
			class309.method5502(anInt3348, anInt3336);
		}
	}

	boolean method5669(Class309 class309) {
		Vector vector = new Vector();
		boolean bool = false;
		for (int i = 0; i < aVector3349.size(); i++) {
			if (!bool && class309.method5512() < method5672(i).method5512()) {
				bool = true;
				if (!method5670(vector, vector.size(), class309)) {
					return false;
				}
			}
			vector.addElement(method5672(i));
		}
		if (!bool && !method5670(vector, vector.size(), class309)) {
			return false;
		}
		aVector3349 = vector;
		return true;
	}

	boolean method5670(Vector vector, int i, Class309 class309) {
		if (class309.method5534() || class309.method5543()) {
			vector.insertElementAt(class309, i);
			class309.method5502(anInt3348, anInt3336);
			int i_2_ = class309.method5513();
			if (i_2_ > anInt3357) {
				anInt3357 = i_2_;
			}
			class309.aBool3325 = true;
			return true;
		}
		return false;
	}

	void method5671(Class309 class309) {
		class309.method5507();
		class309.aBool3325 = false;
		aVector3349.removeElement(class309);
	}

	Class309 method5672(int i) {
		return aVector3349.elementAt(i);
	}

	boolean method5673() {
		int i = aVector3349.size();
		for (int i_3_ = 0; i_3_ < i; i_3_++) {
			if (!aVector3349.elementAt(i_3_).method5516()) {
				return false;
			}
		}
		return true;
	}

	void method5675(int i, int i_4_) {
		if (aBool3353) {
			if (display != null) {
				toolkit.method2398(display);
				toolkit.method2397(aClass146_Sub2_3337);
				display.method14263(0, 0, anInt3348, anInt3336, 0, 0, true, anInterface17_3354 != null);
			}
			method5684(i, i_4_);
			aBool3353 = false;
		}
	}

	void method5684(int i, int i_6_) {
		toolkit.method2419(true);
		toolkit.method14709();
		toolkit.method14893(0);
		toolkit.method14668(1);
		toolkit.method2421();
		aClass146_Sub2_3337.method14255(null);
		toolkit.method14946(0, 0);
		int i_7_ = aVector3349.size();
		Vector vector = aVector3349;
		for (int i_8_ = 0; i_8_ < i_7_; i_8_++) {
			if (aVector3349.elementAt(i_8_).method5516()) {
				vector = new Vector();
				for (int i_9_ = 0; i_9_ < i_7_; i_9_++) {
					if (!aVector3349.elementAt(i_9_).method5516()) {
						vector.addElement(aVector3349.elementAt(i_9_));
					}
				}
				i_7_ = vector.size();
				break;
			}
		}
		anInterface40_3341.generateMipmaps();
		for (int i_10_ = 0; i_10_ < i_7_; i_10_++) {
			Class309 class309 = (Class309) vector.elementAt(i_10_);
			int i_11_ = class309.method5511();
			boolean bool = i_10_ == i_7_ - 1;
			boolean bool_12_ = false;
			for (int i_13_ = 0; i_13_ < i_11_; i_13_++) {
				if (i_13_ == i_11_ - 1) {
					if (bool) {
						toolkit.method2398(aClass146_Sub2_3337);
						toolkit.method2760(anInt3350, anInt3351, anInt3350 + i, anInt3351 + i_6_);
					} else {
						bool_12_ = true;
						aClass146_Sub2_3337.method14256(0, anInterface16_3344);
					}
				} else {
					aClass146_Sub2_3337.method14256(0, anInterface16_3343);
				}
				Interface40 interface40 = anInterface40_3358;
				if (i_13_ == 0) {
					interface40 = anInterface40_3341;
				}
				class309.method5509(i_13_, aClass146_Sub2_3337, interface40, anInterface17_3354, anInterface40_3341,
						bool && i_13_ == i_11_ - 1);
				method5667();
				class309.method5521(i_13_);
				if (bool_12_) {
					anInterface40_3341.generateMipmaps();
				}
				Interface40 interface40_14_ = anInterface40_3358;
				anInterface40_3358 = anInterface40_3338;
				anInterface40_3338 = interface40_14_;
				Interface16 interface16 = anInterface16_3342;
				anInterface16_3342 = anInterface16_3343;
				anInterface16_3343 = interface16;
			}
		}
		toolkit.method14893(1);
		toolkit.method14668(0);
		toolkit.method2419(false);
		toolkit.method2421();
	}

	boolean method5690(int i, int i_15_, int i_16_, int i_17_) {
		if (aVector3349.isEmpty() || method5673()) {
			return true;
		}
		if (anInt3348 != i_16_ || anInt3336 != i_17_ || toolkit.anInt9400 != anInt3346) {
			anInt3346 = toolkit.anInt9400;
			anInt3348 = i_16_;
			anInt3336 = i_17_;
			method5666();
			method5668();
		}
		aClass146_Sub2_3337.method14256(0, anInterface16_3344);
		if (anInterface17_3354 != null) {
			aClass146_Sub2_3337.method14255(anInterface17_3354);
		}
		if (display != null) {
			display.method14256(0, anInterface16_3345);
			display.method14255(anInterface17_3347);
			toolkit.method2397(display);
		} else {
			toolkit.method2397(aClass146_Sub2_3337);
		}
		if (!aClass146_Sub2_3337.isComplete()) {
			toolkit.method2398(display != null ? display : aClass146_Sub2_3337);
			return false;
		}
		anInt3350 = i;
		anInt3351 = i_15_;
		toolkit.method2426(3, -16777216);
		toolkit.method14686(15);
		toolkit.method14684(0);
		aBool3353 = true;
		return true;
	}

	void method5696() {
		if (anInterface32_3355 == null) {
			anInterface32_3355 = toolkit.createArrayBuffer(false);
			anInterface32_3355.reallocate(12, 4);
			ByteBuffer bytebuffer = toolkit.aByteBuffer9279;
			bytebuffer.clear();
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(2.0F);
			anInterface32_3355.read(0, bytebuffer.position(), toolkit.aLong9268);
			aClass323_3339 = toolkit.method14696(new Class320[] { new Class320(Class316.aClass316_12) });
		}
	}
}
