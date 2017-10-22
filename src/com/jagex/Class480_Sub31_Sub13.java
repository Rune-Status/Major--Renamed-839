package com.jagex;

public class Class480_Sub31_Sub13 extends Cacheable {
	static final void method17837(Widget class226, Interface class221, ScriptExecutionContext class613) {
		class226.anInt2407 = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045] * -1334030119;
		Widget.redraw(class226);
	}

	public int anInt11373;
	public Class351 aClass351_11374;
	public int anInt11375;
	public int anInt11376;
	public String aString11377;
	public String aString11378;
	public String aString11379;
	public String aString11380;
	public int anInt11381;
	public int anInt11382 = AsynchronousInputStream.method8773() * 1519526845;
	public String aString11383;

	Class480_Sub31_Sub13(int i, int i_0_, String string, String string_1_, String string_2_, String string_3_,
			int i_4_, String string_5_, Class351 class351) {
		anInt11373 = -2023056447 * Client.tick;
		anInt11375 = 805274409 * i;
		anInt11376 = i_0_ * 853146267;
		aString11377 = string;
		aString11378 = string_1_;
		aString11379 = string_2_;
		aString11380 = string_3_;
		anInt11381 = -796438857 * i_4_;
		aString11383 = string_5_;
		aClass351_11374 = class351;
	}

	void method17836(int i, int i_6_, String string, String string_7_, String string_8_, String string_9_, int i_10_,
			String string_11_, Class351 class351) {
		anInt11382 = AsynchronousInputStream.method8773() * 1519526845;
		anInt11373 = -2023056447 * Client.tick;
		anInt11375 = i * 805274409;
		anInt11376 = i_6_ * 853146267;
		aString11377 = string;
		aString11378 = string_7_;
		aString11379 = string_8_;
		aString11380 = string_9_;
		anInt11381 = -796438857 * i_10_;
		aString11383 = string_11_;
		aClass351_11374 = class351;
	}

	public static int method3149(int i) {
		Class480_Sub31_Sub13 class480_sub31_sub13 = Class248.aClass667_2666.get(i);
		if (class480_sub31_sub13 == null) {
			return -1;
		} else if (class480_sub31_sub13.previousCacheable == Class248.aClass638_2668.tail) {
			return -1;
		}
	
		return ((Class480_Sub31_Sub13) class480_sub31_sub13.previousCacheable).anInt11382 * -482365547;
	}

	public static Class480_Sub31_Sub13 method3150(int i) {
		return Class248.aClass667_2666.get(i);
	}

}