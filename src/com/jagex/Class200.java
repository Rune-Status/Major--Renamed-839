package com.jagex;

import java.util.Iterator;

public class Class200 {

	static boolean method3939() {
		return Class34.aClass40_450 != null;
	}

	String aString2100;
	long aLong2102;
	Class565[] aClass565Array2103;
	DefaultHashMap aClass666_2104;
	boolean aBool2105;
	int anInt2106;
	int anInt2107;
	int anInt2109;
	Class207 aClass207_2110;
	boolean aBool2111;
	DefaultHashMap aClass666_2112;

	Class200(Buffer buffer, boolean bool, boolean bool_3_, Interface22 interface22) {
		if (bool) {
			aLong2102 = buffer.readLong() * 8903545097561406783L;
		} else {
			aLong2102 = -8903545097561406783L;
		}

		if (bool_3_) {
			aString2100 = buffer.readStringFast();
		}

		int i = buffer.readUByte();
		aBool2105 = 0 != (i & 0x1);
		aBool2111 = (i & 0x2) != 0;
		aClass565Array2103 = new Class565[interface22.method121().method9564()];
		int i_4_ = buffer.readUByte();
		if (i_4_ > aClass565Array2103.length) {
			throw new IllegalStateException("");
		}

		for (int i_5_ = 0; i_5_ < aClass565Array2103.length; i_5_++) {
			Class565 class565 = aClass565Array2103[i_5_] = new Class565(interface22.method121().method9565(i_5_), true);
			if (i_5_ < i_4_) {
				class565.method9532(buffer.readInt());
			} else {
				class565.method9532(0);
			}
			class565.method9529(class565.method9536());
		}

		int i_6_ = buffer.readUShort();
		aClass666_2104 = new DefaultHashMap(interface22.method128());
		for (int i_7_ = 0; i_7_ < i_6_; i_7_++) {
			DefaultMapEntry entry = interface22.method128().method13918(buffer);
			aClass666_2104.put(entry.key * 1960527763, entry.value);
		}

		anInt2107 = buffer.readUShort() * -1141290937;
		if (65535 == 169861495 * anInt2107) {
			anInt2107 = 1141290937;
		}

		anInt2109 = buffer.readUByte() * 2112991593;
		aClass207_2110 = CompressionType.findIdentifiable(Class207.values(), buffer.readUByte());
		anInt2106 = buffer.readUByte() * 528239491;
	}

	public int method3878() {
		return anInt2109 * -1970671911;
	}

	public int method3880() {
		return 169861495 * anInt2107;
	}

	public boolean method3882() {
		return aBool2111;
	}

	public Class207 method3884() {
		return aClass207_2110;
	}

	public boolean method3889() {
		return aBool2105;
	}

	public void method3892(Interface22 interface22) {
		if (null == aClass666_2112) {
			aClass666_2112 = new DefaultHashMap(interface22.method128());
		} else {
			aClass666_2112.clear();
		}
	}

	public DefaultHashMap method3893() {
		return aClass666_2112;
	}

	public int method3921() {
		return -364012757 * anInt2106;
	}

	public Class565 method3927(int i) {
		return aClass565Array2103[i];
	}

	public String method3930() {
		return aString2100;
	}

	void method3883(boolean bool) {
		aBool2111 = bool;
	}

	void method3885(Class207 class207) {
		aClass207_2110 = class207;
	}

	void method3887(int i) {
		anInt2106 = i * 528239491;
	}

	long method3888() {
		return 212384477047091903L * aLong2102;
	}

	void method3891(Class200 class200_1_) {
		for (int i_2_ = 0; i_2_ < aClass565Array2103.length; i_2_++) {
			aClass565Array2103[i_2_].method9532(class200_1_.aClass565Array2103[i_2_].getExperience());
			aClass565Array2103[i_2_].method9529(aClass565Array2103[i_2_].method9536());
		}
		aClass666_2104.clear();
		Iterator iterator = class200_1_.aClass666_2104.iterator();
		while (iterator.hasNext()) {
			DefaultMapEntry class383 = (DefaultMapEntry) iterator.next();
			aClass666_2104.put(class383.key * 1960527763, class383.value);
		}
		aBool2105 = class200_1_.aBool2105;
	}

	void method3922(int i) {
		anInt2107 = i * -1141290937;
	}

	void method3925(int i) {
		anInt2109 = i * 2112991593;
	}
}
