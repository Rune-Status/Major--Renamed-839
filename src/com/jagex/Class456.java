package com.jagex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Class456 {

	public static boolean lobbyState(int state) {
		return state == 8 || 7 == state || 11 == state || 17 == state;
	}

	int anInt5121;
	Class455 aClass455_5122 = Class455.aClass455_5115;
	float aFloat5123;
	boolean aBool5124 = false;
	boolean aBool5125;
	Object anObject5126;
	float aFloat5127;
	int anInt5128;
	boolean aBool5129;
	Class397 aClass397_5130;
	float aFloat5131;
	Interface52 anInterface52_5132;
	float aFloat5133;
	Class343 aClass343_5134;
	int anInt5135;
	Interface66 anInterface66_5136;
	Object anObject5137;
	int anInt5138 = 0;
	List aList5139;

	public Class456(Class343 class343) {
		aClass343_5134 = class343;
		aList5139 = new ArrayList();
	}

	public float method7425() {
		return aFloat5133;
	}

	public void method7427(Interface66 interface66) {
		anInterface66_5136 = interface66;
		aFloat5131 = 0.0F;
		aClass455_5122 = Class455.aClass455_5119;
	}

	public void method7429() {
		if (!aBool5124
				&& Class455.aClass455_5118 != aClass455_5122
				&& aClass455_5122 != Class455.aClass455_5116
				&& aClass455_5122 != Class455.aClass455_5115
				&& Class455.aClass455_5110 != aClass455_5122
				&& (1353762627 * aClass455_5122.anInt5120 <= 1353762627 * Class455.aClass455_5119.anInt5120 || 1353762627 * aClass455_5122.anInt5120 >= 1353762627 * Class455.aClass455_5112.anInt5120)) {
			aClass455_5122 = Class455.aClass455_5111;
		}
	}

	public void method7430() {
		if (Class455.aClass455_5118 != aClass455_5122 && Class455.aClass455_5116 != aClass455_5122
				&& aClass455_5122 != Class455.aClass455_5115 && Class455.aClass455_5110 != aClass455_5122) {
			if ((aClass455_5122 == Class455.aClass455_5111 || Class455.aClass455_5113 == aClass455_5122)
					&& false == aBool5124) {
				aBool5124 = true;
			} else if (aClass455_5122.anInt5120 * 1353762627 < 1353762627 * Class455.aClass455_5111.anInt5120
					|| aClass455_5122.anInt5120 * 1353762627 >= 1353762627 * Class455.aClass455_5112.anInt5120) {
				aClass455_5122 = Class455.aClass455_5111;
				aBool5124 = true;
			}
		}
	}

	public void method7431(int i) {
		if (1353762627 * aClass455_5122.anInt5120 < Class455.aClass455_5112.anInt5120 * 1353762627) {
			if (aClass455_5122.anInt5120 * 1353762627 < 1353762627 * Class455.aClass455_5114.anInt5120) {
				aClass455_5122 = Class455.aClass455_5112;
				aBool5124 = false;
			} else if (i <= 0) {
				Iterator iterator = aList5139.iterator();
				while (iterator.hasNext()) {
					Class459 class459 = (Class459) iterator.next();
					if (class459.method7585() != this) {
						iterator.remove();
					} else {
						class459.method7558();
					}
				}
				aClass455_5122 = Class455.aClass455_5112;
				aBool5124 = false;
			} else {
				aClass455_5122 = Class455.aClass455_5110;
				Iterator iterator = aList5139.iterator();
				while (iterator.hasNext()) {
					Class459 class459 = (Class459) iterator.next();
					if (class459.method7585() != this) {
						iterator.remove();
					} else {
						class459.method7592(0.0F, i);
					}
				}
			}
		}
	}

	public void method7432() {
		Iterator iterator = aList5139.iterator();
		aClass455_5122 = Class455.aClass455_5112;
		while (iterator.hasNext()) {
			Class459 class459 = (Class459) iterator.next();
			if (class459.method7585() == this) {
				class459.method7571();
			}
		}
	}

	public void method7434(Interface52 interface52) {
		anInterface52_5132 = interface52;
	}

	public boolean method7435() {
		aBool5125 = false;
		return 0 != anInt5135 * -1963257059;
	}

	public Class455 method7436() {
		return aClass455_5122;
	}

	public void method7437(Object object) {
		anObject5126 = object;
	}

	public void method7439(Object object) {
		anObject5137 = object;
	}

	public Object method7440() {
		return anObject5137;
	}

	public void method7441(float f) {
		if (!(f < 0.0F)) {
			aFloat5127 = f;
		}
	}

	public void method7443(boolean bool) {

	}

	public Interface66 method7444() {
		return anInterface66_5136;
	}

	public void method7445(Class397 class397) {
		aClass397_5130 = class397;
	}

	public float method7448() {
		return aFloat5123;
	}

	public void method7449(float f) {
		aFloat5133 = f;
	}

	public void method7450(boolean bool, int i) {
		aBool5129 = bool;
		anInt5121 = i * -1676028235;
	}

	public void method7451(int i, boolean bool) {
		aBool5125 = bool;
		anInt5135 = i * 1897416501;
	}

	public void method7454(float f, int i) {
		aFloat5131 = f;
		int i_4_ = 0;
		Iterator iterator = aList5139.iterator();
		while (iterator.hasNext()) {
			Class459 class459 = (Class459) iterator.next();
			if (class459.method7585() != this) {
				aList5139.remove(class459);
			} else {
				class459.method7592(aFloat5131, i);
				i_4_++;
			}
		}
		if (0 == i_4_) {
			anInt5138 = i * 1262096063;
		}
	}

	public void method7483() {
		Iterator iterator = aList5139.iterator();
		aClass455_5122 = Class455.aClass455_5111;
		while (iterator.hasNext()) {
			Class459 class459 = (Class459) iterator.next();
			if (class459.method7585() == this) {
				class459.method7572();
			}
		}
	}

	public Object method7484() {
		return anObject5126;
	}

	public void method7487(float f) {
		aFloat5123 = f;
	}

	public int method7506(int i) {
		return 1066359571 * anInt5128;
	}

	public void method7509() {
		if (aClass455_5122 != Class455.aClass455_5112 && Class455.aClass455_5117 != aClass455_5122) {
			method7431(0);
		}
		Iterator iterator = aList5139.iterator();
		while (iterator.hasNext()) {
			Class459 class459 = (Class459) iterator.next();
			if (class459.method7585() != this) {
				iterator.remove();
			} else {
				class459.method7553();
			}
		}
		method7426();
		aClass455_5122 = Class455.aClass455_5116;
	}

	public void method7513() {
		if (aClass455_5122 == Class455.aClass455_5111) {
			Class563 class563 = anInterface66_5136.method413();
			if (class563 == Class563.aClass563_7559) {
				aClass455_5122 = Class455.aClass455_5113;
			}
		}
		if (Class455.aClass455_5113 == aClass455_5122 && aBool5124 == true) {
			Class459 class459 = aClass343_5134.method5905(anInterface66_5136.method417());
			if (null != class459) {
				boolean bool = anInterface66_5136.method414();
				Class462 class462 = new Class462(this);
				boolean bool_5_ = class459.method7556(bool ? null : anInterface66_5136.get(0), bool ? class462 : null,
						1066359571 * anInt5128, -354393793 * anInt5138 > 0 ? 0.0F : aFloat5131, false, aBool5129,
						anInt5121 * -301799523, aFloat5127, this);
				if (true == bool_5_) {
					aClass455_5122 = Class455.aClass455_5114;
					class459.method7559(anInterface52_5132);
					class459.method7592(aFloat5131, -354393793 * anInt5138);
					class459.method7557();
					aList5139.add(class459);
					aBool5124 = false;
				} else {
					if (class459.method7548() == Class454.aClass454_5105) {
						aClass455_5122 = Class455.aClass455_5117;
					}
					class459.method7553();
				}
			}
		}
		Iterator iterator = aList5139.iterator();
		boolean bool = true;
		while (iterator.hasNext()) {
			Class459 class459 = (Class459) iterator.next();
			if (class459.method7585() != this) {
				iterator.remove();
			} else {
				if (aClass455_5122 == Class455.aClass455_5110) {
					if (class459.method7555() == 0.0F) {
						class459.method7558();
					} else {
						bool = false;
					}
				}
				if (class459.method7551() == true || class459.method7550() == true) {
					class459.method7553();
					iterator.remove();
				} else {
					bool = false;
				}
			}
		}
		if (bool && aClass455_5122.anInt5120 * 1353762627 >= Class455.aClass455_5114.anInt5120 * 1353762627
				&& 1353762627 * aClass455_5122.anInt5120 < 1353762627 * Class455.aClass455_5112.anInt5120) {
			if (Class455.aClass455_5110 == aClass455_5122) {
				aClass455_5122 = Class455.aClass455_5112;
			} else {
				aClass455_5122 = Class455.aClass455_5117;
			}
		}
	}

	public void method7517() {
		if (-1963257059 * anInt5135 > -1 && !aBool5125) {
			anInt5135 -= 1897416501;
		}
		if (anInt5135 * -1963257059 == 0) {
			method7430();
		}
	}

	public Class397 method7518() {
		return aClass397_5130;
	}

	public void method7521(int i) {
		anInt5128 = 1370007323 * i;
	}

	void method7426() {
		anInterface66_5136 = null;
		aClass455_5122 = Class455.aClass455_5115;
		aBool5124 = false;
		aList5139.clear();
		anObject5126 = null;
		aClass397_5130 = null;
		anInt5128 = -1370007323;
		aBool5129 = false;
		anInt5121 = 0;
		aFloat5131 = 0.0F;
		anInterface52_5132 = null;
		aFloat5133 = 0.0F;
		aFloat5123 = 0.0F;
		anInt5135 = 0;
		aBool5125 = false;
		anObject5137 = null;
		anInt5138 = 0;
		aFloat5127 = 1.0F;
	}

}