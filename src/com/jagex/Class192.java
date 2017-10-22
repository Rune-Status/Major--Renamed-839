package com.jagex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Class192 {
	static final int anInt2064 = 2;
	static final int anInt2073 = 1;
	static final int anInt2075 = 4;
	static final int anInt2076 = 1;

	boolean aBool2065;
	ArrayList anArrayList2066;
	DefaultHashMap aClass666_2067;
	long aLong2068;
	long aLong2069;
	String aString2070;
	boolean aBool2071;
	int anInt2072;
	ArrayList anArrayList2074;
	boolean aBool2077;
	int anInt2078 = 980771591;
	int anInt2079;

	public Class192(long l, Buffer buffer, boolean bool, Interface22 interface22) {
		aLong2068 = -5049527404560524915L * l;
		int magic = buffer.readUByte();
		if (magic <= 0 || magic > 1) {
			throw new IllegalStateException("");
		}

		int attributes = buffer.readUByte();
		aBool2071 = 0 != (attributes & 0x1);
		aBool2065 = (attributes & 0x2) != 0;
		aBool2077 = 0 != (attributes & 0x4);
		anInt2079 = buffer.readInt() * 216272363;
		aLong2069 = buffer.readLong() * -1031715948526905239L;
		aString2070 = buffer.readString();
		anInt2072 = buffer.readShort() * -1260257311;
		buffer.readInt();
		buffer.readLong();
		int i_7_ = buffer.readUShort();
		anArrayList2074 = new ArrayList(i_7_);
		for (int i_8_ = 0; i_8_ < i_7_; i_8_++) {
			anArrayList2074.add(new Class200(buffer, aBool2065, aBool2077, interface22));
		}
		int i_9_ = buffer.readUShort();
		anArrayList2066 = new ArrayList(i_9_);
		for (int i_10_ = 0; i_10_ < i_9_; i_10_++) {
			anArrayList2066.add(new Class182(buffer, aBool2065, aBool2077));
		}
		aClass666_2067 = new DefaultHashMap(interface22.method119());
		int i_11_ = buffer.readUShort();
		for (int i_12_ = 0; i_12_ < i_11_; i_12_++) {
			DefaultMapEntry class383 = interface22.method119().method13918(buffer);
			aClass666_2067.put(1960527763 * class383.key, class383.value);
		}
		if (!bool) {
			buffer.readUShort();
			buffer.readUShort();
			buffer.readUShort();
			buffer.readUShort();
			buffer.readUShort();
		}

		method3771();
	}

	@Override
	public int hashCode() {
		return (int) (-5896531547024649915L * aLong2068);
	}

	public List method3764() {
		return Collections.unmodifiableList(anArrayList2074);
	}

	public List method3765() {
		return Collections.unmodifiableList(anArrayList2066);
	}

	public boolean method3768() {
		return aBool2071;
	}

	public int method3769() {
		return -1129413599 * anInt2072;
	}

	public long method3770() {
		return 3662153331706968025L * aLong2069;
	}

	public int method3772() {
		return anInt2078 * -1851562679;
	}

	public Class207 method3773() {
		if (anArrayList2074.isEmpty()) {
			return Class207.aClass207_2161;
		}

		Class207 class207 = ((Class200) anArrayList2074.get(0)).method3884();
		switch (1526009243 * class207.anInt2166) {
			default: {
				Iterator iterator = anArrayList2074.iterator();
				while (iterator.hasNext()) {
					Class200 class200 = (Class200) iterator.next();
					if (class200.method3884() == Class207.aClass207_2161) {
						return Class207.aClass207_2161;
					}
				}
				return Class207.aClass207_2162;
			}
			case 0:
			case 3:
				return class207;
		}
	}

	public Class200 method3806(int i) {
		if (i == -1) {
			return null;
		}
		return (Class200) anArrayList2074.get(i);
	}

	public String method3811() {
		return aString2070;
	}

	public VariableCollection method3836() {
		return new HashedVariableCollection(VarpType.aClass441_5047, aClass666_2067);
	}

	void method3763(int i, int i_0_) {
		((Class200) anArrayList2074.get(i)).method3887(i_0_);
	}

	int method3766() {
		return anInt2079 * -1026247997;
	}

	void method3767() {
		anInt2079 += 216272363;
	}

	void method3771() {
		int i_2_ = -1;
		int i_3_ = -1;

		for (int i_4_ = 0; i_4_ < anArrayList2074.size(); i_4_++) {
			Class200 class200 = (Class200) anArrayList2074.get(i_4_);
			int i_5_ = class200.method3878();

			if (i_5_ > i_2_) {
				i_2_ = i_5_;
				i_3_ = i_4_;
			}
		}

		anInt2078 = -980771591 * i_3_;
	}

	void method3776(Class200 class200) {
		anArrayList2074.add(class200);
		method3771();
	}

	void method3777(int i) {
		anArrayList2074.remove(i);
		method3771();
	}

	void method3778(Class182 class182) {
		anArrayList2066.add(class182);
	}

	void method3780(int i, int i_14_) {
		((Class200) anArrayList2074.get(i)).method3925(i_14_);
		method3771();
	}

	void method3781(int i, int i_16_, int i_17_) {
		Class200 class200 = (Class200) anArrayList2074.get(i);
		class200.method3922(i_16_);
		class200.method3883(true);
	}

	void method3783(int i, boolean bool, int i_18_) {
		Class200 class200 = (Class200) anArrayList2074.get(i);
		class200.method3885(bool ? Class207.aClass207_2162 : Class207.aClass207_2161);
	}

	void method3785() {
		Iterator iterator = anArrayList2074.iterator();
		while (iterator.hasNext()) {
			Class200 class200 = (Class200) iterator.next();
			class200.method3885(Class207.aClass207_2163);
		}
	}

	void method3786() {
		Iterator iterator = anArrayList2074.iterator();
		while (iterator.hasNext()) {
			Class200 class200 = (Class200) iterator.next();
			class200.method3885(Class207.aClass207_2164);
		}
	}

	void method3808(int i) {
		anArrayList2066.remove(i);
	}

	void method3830(int i, Class200 class200) {
		Class200 class200_22_ = (Class200) anArrayList2074.get(i);
		class200_22_.method3891(class200);
	}

	void method3833(int i) {
		Class200 class200 = (Class200) anArrayList2074.get(i);
		class200.method3883(false);
	}
}
