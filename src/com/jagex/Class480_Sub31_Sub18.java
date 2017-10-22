package com.jagex;

public class Class480_Sub31_Sub18 extends Cacheable {
	Deque<Class480_Sub32> aClass644_11418 = new Deque();
	public String aString11419;
	public String aString11420;
	public int anInt11421;
	public int anInt11422;
	int anInt11423 = 805433003;
	public int anInt11424 = -52767023;
	public int anInt11425 = -1235664896;
	public int anInt11426;
	public int anInt11427 = 1038958592;
	public int anInt11428 = 0;
	boolean aBool11429 = true;

	Class480_Sub31_Sub18(int i, String string, String string_9_, int i_10_, int i_11_, boolean bool, int i_12_,
			int i_13_) {
		anInt11426 = 1614134261 * i;
		aString11419 = string;
		aString11420 = string_9_;
		anInt11422 = -1126952673 * i_10_;
		anInt11423 = -805433003 * i_11_;
		aBool11429 = bool;
		anInt11424 = 52767023 * i_12_;

		if (-667632177 * anInt11424 == 255) {
			anInt11424 = 0;
		}

		MapSize.valueOf(i_13_);
	}

	public boolean method17860(int i, int i_2_, int[] is, int i_3_) {
		for (Class480_Sub32 class480_sub32 = aClass644_11418.head(); null != class480_sub32; class480_sub32 = aClass644_11418
				.next()) {
			if (class480_sub32.method16067(i, i_2_)) {
				class480_sub32.method16057(i, i_2_, is);
				return true;
			}
		}
		return false;
	}

	public boolean method17861(int i, int i_4_, int i_5_, int[] is) {
		for (Class480_Sub32 class480_sub32 = aClass644_11418.head(); class480_sub32 != null; class480_sub32 = aClass644_11418
				.next()) {
			if (class480_sub32.method16054(i, i_4_, i_5_)) {
				class480_sub32.method16057(i_4_, i_5_, is);
				return true;
			}
		}
		return false;
	}

	public boolean method17867(int i, int i_7_, int[] is, int i_8_) {
		for (Class480_Sub32 class480_sub32 = aClass644_11418.head(); null != class480_sub32; class480_sub32 = aClass644_11418
				.next()) {
			if (class480_sub32.method16053(i, i_7_)) {
				class480_sub32.method16056(i, i_7_, is);
				return true;
			}
		}
		return false;
	}

	boolean method17858(int i, int i_0_, int i_1_) {
		for (Class480_Sub32 class480_sub32 = aClass644_11418.head(); class480_sub32 != null; class480_sub32 = aClass644_11418
				.next()) {
			if (class480_sub32.method16067(i, i_0_)) {
				return true;
			}
		}
		return false;
	}

	void method17862() {
		anInt11425 = -1235664896;
		anInt11428 = 0;
		anInt11427 = 1038958592;
		anInt11421 = 0;

		for (Class480_Sub32 class480_sub32 = aClass644_11418.head(); null != class480_sub32; class480_sub32 = aClass644_11418
				.next()) {
			if (class480_sub32.anInt10217 * -31428711 < -1874808723 * anInt11425) {
				anInt11425 = class480_sub32.anInt10217 * 1742387293;
			}

			if (class480_sub32.anInt10223 * 1347667659 > -1334470583 * anInt11428) {
				anInt11428 = -578195853 * class480_sub32.anInt10223;
			}

			if (class480_sub32.anInt10216 * 276555219 < anInt11427 * 1964867229) {
				anInt11427 = -1734601937 * class480_sub32.anInt10216;
			}

			if (class480_sub32.anInt10224 * -1815373283 > anInt11421 * -144068941) {
				anInt11421 = class480_sub32.anInt10224 * -1966539793;
			}
		}
	}

	static Class480_Sub31_Sub18 load(Archive archive, int id) {
		Buffer buffer = new Buffer(archive.get(0, id));
		return Class24.method777(buffer, id);
	}

}