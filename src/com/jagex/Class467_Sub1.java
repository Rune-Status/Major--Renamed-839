package com.jagex;

import jaclib.nanotime.QueryPerformanceCounter;

public class Class467_Sub1 extends Class467 {
	long aLong9831;
	long aLong9832;
	long aLong9833 = 0L;
	long[] aLongArray9834;
	int anInt9835;
	int anInt9836;

	Class467_Sub1() {
		aLong9832 = 0L;
		aLong9831 = 0L;
		aLongArray9834 = new long[10];
		anInt9835 = 0;
		anInt9836 = 2048358221;
		aLong9832 = (aLong9833 = QueryPerformanceCounter.nanoTime() * 1276579725847282603L) * -5276280649483134003L;
		if (2844499158790119171L * aLong9833 == 0L) {
			throw new RuntimeException();
		}
	}

	long method15318() {
		long time = QueryPerformanceCounter.nanoTime();
		long l_0_ = time - aLong9831 * -3562483051975727279L;
		aLong9831 = time * -3757369480150089295L;
		if (l_0_ > -5000000000L && l_0_ < 5000000000L) {
			aLongArray9834[anInt9835 * -128664927] = l_0_;
			anInt9835 = (-128664927 * anInt9835 + 1) % 10 * 336701793;
			if (747280773 * anInt9836 < 1) {
				anInt9836 += 2048358221;
			}
		}
		long l_1_ = 0L;
		for (int i_2_ = 1; i_2_ <= 747280773 * anInt9836; i_2_++) {
			l_1_ += aLongArray9834[(10 + anInt9835 * -128664927 - i_2_) % 10];
		}
		return l_1_ / (anInt9836 * 747280773);
	}

	@Override
	void method7891() {
		aLong9831 = 0L;
		if (8388810817881945615L * aLong9832 > aLong9833 * 2844499158790119171L) {
			aLong9833 += 7200436426420914437L * aLong9832 - aLong9833 * 1L;
		}
	}

	@Override
	long method7894() {
		return 2844499158790119171L * aLong9833;
	}

	@Override
	long method7897() {
		aLong9833 += method15318() * 1276579725847282603L;
		if (8388810817881945615L * aLong9832 > aLong9833 * 2844499158790119171L) {
			return (aLong9832 * 8388810817881945615L - 2844499158790119171L * aLong9833) / 1000000L;
		}
		return 0L;
	}

	@Override
	int method7905(long l) {
		if (8388810817881945615L * aLong9832 > aLong9833 * 2844499158790119171L) {
			aLong9831 += aLong9832 * -2307482509731467425L - aLong9833 * 2340029950679118867L;
			aLong9833 += 7200436426420914437L * aLong9832 - 1L * aLong9833;
			aLong9832 += l * -2146074865549739793L;
			return 1;
		}
		int i = 0;
		do {
			i++;
			aLong9832 += l * -2146074865549739793L;
		} while (i < 10 && aLong9832 * 8388810817881945615L < aLong9833 * 2844499158790119171L);
		if (8388810817881945615L * aLong9832 < 2844499158790119171L * aLong9833) {
			aLong9832 = aLong9833 * -5276280649483134003L;
		}
		return i;
	}
}
