package com.jagex;

import java.util.Random;

public class Class36 {
	public static int method991(Random random, int i) {
		if (null == random) {
			random = Class3.aRandom15;
			if (null == random) {
				synchronized (Class3.anObject14) {
					if (null == Class3.aRandom15) {
						Class3.aRandom15 = new Random();
					}
					random = Class3.aRandom15;
				}
			}
		}

		if (i <= 0) {
			throw new IllegalArgumentException();
		}
		if (Class577.isPowerOf2(i)) {
			return (int) ((random.nextInt() & 0xffffffffL) * i >> 32);
		}

		int i_1_ = -2147483648 - (int) (4294967296L % i);
		int i_2_;
		do {
			i_2_ = random.nextInt();
		} while (i_2_ >= i_1_);
		return Class337.method5825(i_2_, i);
	}

	public static void method993() {
		for (MenuCategory class480_sub31_sub4 = (MenuCategory) Class56.aClass638_631.getFront(); null != class480_sub31_sub4; class480_sub31_sub4 = (MenuCategory) Class56.aClass638_631
				.next()) {
			if (713555001 * class480_sub31_sub4.size > 1) {
				class480_sub31_sub4.size = 0;
				MenuCategory.cache.put(-6309744751763661005L
						* ((MenuOption) class480_sub31_sub4.options.tail.nextCacheable).key, class480_sub31_sub4);
				class480_sub31_sub4.options.clear();
			}
		}
		MenuCategory.count = 0;
		Class56.menuOptionCount = 0;
		MenuOption.options.clear();
		MenuCategory.categories.clear();
		Class56.aClass638_631.clear();
		Class56.menuOpen = false;
	}

	static final long method992() {
		return (long) ((Class626.anInt8044 += 748426433) * 1239841601 - 1) << 32 | 0xffffffffL;
	}

	int anInt459;

	int anInt460;

	Class36() {

	}
}
