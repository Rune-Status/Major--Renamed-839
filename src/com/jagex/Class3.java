package com.jagex;

import java.util.Random;

public class Class3 {
	static Object anObject14 = new Object();
	static Random aRandom15;

	static int method545(Player player, int i) {
		int i_0_ = player.anInt11777 * 1968610425;
		Class515 class515 = player.method17958();
		int i_1_ = player.aClass650_Sub2_11525.getAnimationId();
		if (-1 == i_1_ || player.aClass650_Sub2_11525.aBool10566) {
			i_0_ = player.anInt11763 * 274573991;
		} else if (i_1_ == class515.anInt7025 * -272802151 || i_1_ == class515.anInt7055 * 902814335
				|| class515.anInt7021 * 1992950567 == i_1_ || i_1_ == class515.anInt7027 * 2085451397) {
			i_0_ = -1010561117 * player.anInt11778;
		} else if (-1451252109 * class515.anInt7020 == i_1_ || i_1_ == class515.anInt7030 * 671475489
				|| i_1_ == -1068126007 * class515.anInt7032 || 1418155347 * class515.anInt7031 == i_1_) {
			i_0_ = player.anInt11776 * 1288494369;
		}
		return i_0_;
	}

	Class3() throws Throwable {
		throw new Error();
	}

}