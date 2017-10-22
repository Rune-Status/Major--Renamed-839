package com.jagex;

public class Class477_Sub3 extends Entity {
	public static Class630 method15580(byte i) {
		if (null == Class34.aClass630_449) {
			return Class630.aClass630_8058;
		}
		return Class34.aClass630_449;
	}

	static final int method15582(int i, int i_9_, int i_10_, byte i_11_) {
		if (i_9_ == i) {
			return i;
		}
		int i_12_ = 128 - i_10_;
		int i_13_ = (i & 0x7f) * i_12_ + (i_9_ & 0x7f) * i_10_ >> 7;
		int i_14_ = i_10_ * (i_9_ & 0x380) + i_12_ * (i & 0x380) >> 7;
		int i_15_ = (i & 0xfc00) * i_12_ + (i_9_ & 0xfc00) * i_10_ >> 7;
		return i_15_ & 0xfc00 | i_14_ & 0x380 | i_13_ & 0x7f;
	}

	public HitbarDefinition hitbar;

	EntityList<Class477_Sub5> aClass649_10026 = new EntityList<Class477_Sub5>();

	public Class477_Sub3(HitbarDefinition hitbar) {
		this.hitbar = hitbar;
	}

	public boolean method15572() {
		return aClass649_10026.isEmpty();
	}

	public void method15578(int i, int i_0_, int i_1_, int i_2_) {
		Class477_Sub5 class477_sub5 = null;
		int i_4_ = 0;
		for (Class477_Sub5 class477_sub5_5_ = aClass649_10026.head(); class477_sub5_5_ != null; class477_sub5_5_ = aClass649_10026
				.next()) {
			i_4_++;

			if (i == class477_sub5_5_.anInt10076 * 233333127) {
				class477_sub5_5_.method15609(i, i_0_, i_1_, i_2_);
				return;
			} else if (233333127 * class477_sub5_5_.anInt10076 <= i) {
				class477_sub5 = class477_sub5_5_;
			}
		}

		if (null == class477_sub5) {
			if (i_4_ < Mob.defaults.anInt7592 * -1142545955) {
				aClass649_10026.method13421(new Class477_Sub5(i, i_0_, i_1_, i_2_));
			}
		} else {
			Class122.method2244(new Class477_Sub5(i, i_0_, i_1_, i_2_), class477_sub5);
			if (i_4_ >= -1142545955 * Mob.defaults.anInt7592) {
				aClass649_10026.head().unlink();
			}
		}
	}

	public Class477_Sub5 method15579(int i) {
		Class477_Sub5 class477_sub5 = aClass649_10026.head();
		if (null == class477_sub5 || class477_sub5.anInt10076 * 233333127 > i) {
			return null;
		}

		for (Class477_Sub5 class477_sub5_7_ = aClass649_10026.next(); null != class477_sub5_7_
				&& 233333127 * class477_sub5_7_.anInt10076 <= i; class477_sub5_7_ = aClass649_10026.next()) {
			class477_sub5.unlink();
			class477_sub5 = class477_sub5_7_;
		}

		if (class477_sub5.anInt10074 * 1750521973 + class477_sub5.anInt10076 * 233333127 + -946624537
				* hitbar.anInt7204 > i) {
			return class477_sub5;
		}

		class477_sub5.unlink();
		return null;
	}

}