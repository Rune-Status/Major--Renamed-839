package com.jagex;

public abstract class Class480_Sub13_Sub1 extends IndexedString {

	Class253 aClass253_11204;
	Class253 aClass253_11205;
	int anInt11202;
	String name;
	String aString11203;

	Class480_Sub13_Sub1(Class241 class241) {
		aClass253_11204 = class241.aClass253_2639;
		name = class241.name;
		aString11203 = class241.aString2643;
		anInt11202 = class241.anInt2641 * -6249949;
		aClass253_11205 = class241.aClass253_2640;
	}

	public Class253 method17541() {
		return aClass253_11204;
	}

	public Class253 method17545() {
		return aClass253_11205;
	}

	public int method17546() {
		if (Class253.aClass253_2697 != aClass253_11204) {
			throw new IllegalArgumentException_Sub1(this, aClass253_11204.toString().toLowerCase());
		}

		return anInt11202 * -607013831;
	}

	public abstract int method17547(int i);

	public abstract boolean method17548(int i);

	@Override
	public String toString() {
		String string = aClass253_11204 + " " + name;
		if (null != aString11203 && !"".equals(aString11203)) {
			string += " : " + aString11203;
		}

		return string;
	}

	String getName() {
		return name;
	}

}