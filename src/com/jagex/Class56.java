package com.jagex;

public class Class56 {
	static Deque aClass644_613;
	static Deque aClass644_614;
	static MenuOption aClass480_Sub31_Sub17_615;
	static int anInt616 = 184295856;
	static ReferenceCache aClass168_617;
	static final int anInt618 = 5;
	public static boolean menuOpen = false;
	static boolean aBool620 = false;
	static int anInt621;
	public static int anInt622;
	static final int anInt623 = 3;
	static final int anInt624 = 2;
	static Class405 aClass405_625;
	static final int anInt626 = 31;
	public static int menuOptionCount;
	public static final int anInt630 = 7;
	static Queue aClass638_631;
	static int anInt632;
	static int anInt635;
	static Widget aClass226_636;
	static int anInt637;
	static int anInt638;
	static int anInt639;
	static int anInt640;
	static int anInt641;
	public static boolean aBool642;
	public static int anInt643;
	static Matrix4f aClass399_644;
	static Matrix4f aClass399_645;
	static MenuCategory aClass480_Sub31_Sub4_646 = null;
	static MenuOption aClass480_Sub31_Sub17_647;
	static int anInt648;
	static final int anInt649 = 406;
	static final int anInt650 = 31;
	static float[] aFloatArray651;
	static final int anInt652 = 0;
	static final int anInt653 = 1;
	static final int anInt654 = 2;
	static final int anInt655 = 0;
	public static final int anInt656 = 4;
	static final int anInt657 = 1;
	static final int anInt658 = 6;
	static final int anInt659 = 500;
	static final int anInt660 = 8;

	static {
		MenuOption.options = new Deque();
		MenuCategory.categories = new HashTable(16);
		aClass638_631 = new Queue();
		aClass644_614 = new Deque();
		aClass644_613 = new Deque();
		MenuCategory.cache = new ReferenceCache(30);
		aClass226_636 = null;
		anInt637 = 1357380675;
		anInt638 = -534298803;
		anInt639 = 779078951;
		anInt640 = -2092610951;
		aClass399_645 = null;
		aClass399_644 = new Matrix4f();
		aClass405_625 = new Class405();
		anInt622 = -1490974785;
		aClass168_617 = new ReferenceCache(8);
		aFloatArray651 = new float[4];
	}

	static boolean method1348() {
		return Class50.aBool584;
	}

	static boolean method1351(Toolkit toolkit, int i, int i_4_) {
		toolkit.method2456();
		TimeUtil.time();
		if (!toolkit.method2469()) {
			return false;
		}

		int i_5_ = Client.aClass460_10760.method7680();
		int i_6_ = Client.aClass460_10760.method7707();
		TileFlags flags = Client.aClass460_10760.method7775();
		Class490 class490 = Client.aClass460_10760.method7687();
		int i_7_ = i;
		if (null != Client.localPlayer) {
			int i_8_ = Client.localPlayer.pathX[0] >> 3;
			int i_9_ = Client.localPlayer.pathZ[0] >> 3;
			if (i_8_ >= 0 && i_8_ < IdentikitDefinitionProvider.aBoolArrayArray3303.length && i_9_ >= 0
					&& i_9_ < IdentikitDefinitionProvider.aBoolArrayArray3303[i_8_].length
					&& IdentikitDefinitionProvider.aBoolArrayArray3303[i_8_][i_9_]) {
				i_7_ = 0;
			}
		}
		int i_10_ = i_5_ / 2;
		int i_11_ = 0;
		int i_12_ = 0;
		boolean bool = true;
		for (int i_13_ = i_11_; i_13_ < i_5_ + i_11_; i_13_++) {
			for (int i_14_ = i_12_; i_14_ < i_6_ + i_12_; i_14_++) {
				for (int i_15_ = i_7_; i_15_ <= 3; i_15_++) {
					if (i_15_ < i || flags.method7067(i, i_15_, i_13_, i_14_)) {
						int i_16_ = i_15_;
						if (flags.isBridge(i_13_, i_14_)) {
							i_16_--;
						}
						if (i_16_ >= 0) {
							bool &= Class155.method3282(i_16_, i_13_, i_14_);
						}
					}
				}
			}
		}
		if (!bool) {
			return false;
		}
		int i_17_ = 48 + 48 + i_5_ * 4;
		int[] is = new int[i_17_ * i_17_];
		for (int i_18_ = 0; i_18_ < is.length; i_18_++) {
			is[i_18_] = 0;
		}
		DirectDisplay class146_sub2 = null;
		int i_19_ = 0;
		int i_20_ = 0;
		if (Class63.aBool944) {
			Class63.aClass116_951 = toolkit.createSprite(i_17_, i_17_, false, true);
			class146_sub2 = toolkit.createDirectDisplay();
			class146_sub2.method14256(0, Class63.aClass116_951.method2075());
			Interface17 interface17 = toolkit.method2774(i_17_, i_17_);
			class146_sub2.method14255(interface17);
			toolkit.method2397(class146_sub2);
			i_10_ = i_5_;
			i_19_ = 48;
			i_20_ = 48;
			toolkit.method2426(1, 0);
		} else {
			Class63.aClass116_951 = toolkit.createSprite(is, 0, i_17_, i_17_, i_17_);
		}
		Client.aClass460_10760.method7690().method9718();
		int i_21_ = ~0xffffff | (238 + (int) (Math.random() * 20.0) - 10 << 16)
				+ (238 + (int) (Math.random() * 20.0) - 10 << 8) + 238 + (int) (Math.random() * 20.0) - 10;
		int i_22_ = ~0xffffff | 238 + (int) (Math.random() * 20.0) - 10 << 16;
		int i_23_ = (int) (Math.random() * 8.0) << 16 | (int) (Math.random() * 8.0) << 8 | (int) (Math.random() * 8.0);
		boolean[][] bools = new boolean[2 + 1 + i_10_][2 + i_10_ + 1];
		toolkit.method2395(Class63.anIntArray942);
		toolkit.method2494();
		for (int i_24_ = i_11_; i_24_ < i_11_ + i_5_; i_24_ += i_10_) {
			for (int i_25_ = i_12_; i_25_ < i_6_ + i_12_; i_25_ += i_10_) {
				int i_26_ = i_19_;
				int i_27_ = i_20_;
				int i_28_ = i_24_;
				if (i_28_ > 0) {
					i_28_--;
					i_26_ += 4;
				}
				int i_29_ = i_25_;
				if (i_29_ > 0) {
					i_29_--;
				}
				int i_30_ = i_10_ + i_24_;
				if (i_30_ < i_5_) {
					i_30_++;
				}
				int i_31_ = i_25_ + i_10_;
				if (i_31_ < i_6_) {
					i_31_++;
					i_27_ += 4;
				}
				if (Class63.aBool940) {
					toolkit.method2421();
				} else {
					toolkit.method2760(0, 0, i_26_ + 4 * i_10_, i_10_ * 4 + i_27_);
				}
				toolkit.method2426(3, -16777216);
				int i_32_ = i_10_;
				if (i_32_ > i_5_ - 1) {
					i_32_ = i_5_ - 1;
				}
				for (int i_33_ = i_7_; i_33_ <= 3; i_33_++) {
					for (int i_34_ = 0; i_34_ <= i_32_; i_34_++) {
						for (int i_35_ = 0; i_35_ <= i_32_; i_35_++) {
							bools[i_34_][i_35_] = i_33_ < i || flags.method7067(i, i_33_, i_28_ + i_34_, i_29_ + i_35_);
						}
					}
					class490.aClass120Array6702[i_33_]
							.renderPlan(i_19_, i_20_, 1024, i_28_, i_29_, i_30_, i_31_, bools);
					for (int i_36_ = -4; i_36_ < i_10_; i_36_++) {
						for (int i_37_ = -4; i_37_ < i_10_; i_37_++) {
							int i_38_ = i_36_ + i_24_;
							int i_39_ = i_25_ + i_37_;
							if (i_38_ >= i_11_ && i_39_ >= i_12_
									&& (i_33_ < i || flags.method7067(i, i_33_, i_38_, i_39_))) {
								int i_40_ = i_33_;
								if (flags.isBridge(i_38_, i_39_)) {
									i_40_--;
								}
								if (i_40_ >= 0) {
									GlobalPlayer.method1100(toolkit, i_40_, i_38_, i_39_, 4 * i_36_ + i_26_,
											(i_10_ - i_37_) * 4 + i_27_ - 4, i_21_, i_22_, -966187647);
								}
							}
						}
					}
				}
				toolkit.method2434(i_26_, i_27_, 4 * i_10_, 4 * i_10_, i_23_, 2);
				toolkit.method2456();
				if (!Class63.aBool944) {
					Class63.aClass116_951.method2088(48 + 4 * (i_24_ - i_11_), 48 + i_6_ * 4 - 4 * (i_25_ - i_12_)
							- i_10_ * 4, i_10_ * 4, 4 * i_10_, i_26_, i_27_);
					if (Class63.aBool940) {
						Class63.aClass116_951.method2079(256, 0);
						try {
							toolkit.method2370();
							Client.sleep(2000L);
						} catch (Exception exception) {

						}
					}
				}
			}
		}
		if (Class63.aBool944) {
			toolkit.method2398(class146_sub2);
			if (Class63.aBool940) {
				Class63.aClass116_951.method2079(256, 0);
				try {
					toolkit.method2370();
					Client.sleep(2000L);
				} catch (Exception exception) {

				}
			}
		}
		toolkit.method2421();
		toolkit.method2566(Class63.anIntArray942[0], Class63.anIntArray942[1], Class63.anIntArray942[2],
				Class63.anIntArray942[3]);
		toolkit.method2426(1, 1);
		EntityQueue.method13532();
		Class63.anInt947 = 0;
		Class63.aClass644_948.clear();
		if (!Class63.aBool952) {
			Class467.method7906(i);
			Class488 class488 = Client.aClass460_10760.method7729();
			if (null != class488) {
				Queue.aClass678_Sub8_8139.resizeCaches(1024, 64);
				Class553 class553 = Client.aClass460_10760.method7679();
				for (int i_41_ = 0; i_41_ < -428779527 * class488.anInt6669; i_41_++) {
					int i_42_ = class488.anIntArray6670[i_41_];
					if (Client.localPlayer.plane == i_42_ >> 28) {
						int i_43_ = (i_42_ >> 14 & 0x3fff) - 2051316501 * class553.x;
						int i_44_ = (i_42_ & 0x3fff) - -180305283 * class553.z;
						if (i_43_ >= 0 && i_43_ < i_5_ && i_44_ >= 0 && i_44_ < i_6_) {
							Class63.aClass644_948.pushBack(new LinkableInt(i_41_));
						} else {
							Class224 class224 = (Class224) Queue.aClass678_Sub8_8139
									.get(class488.anIntArray6671[i_41_]);
							if (null != class224.anIntArray2324 && i_43_ + 1010267847 * class224.anInt2327 >= 0
									&& -280927385 * class224.anInt2310 + i_43_ < i_5_
									&& -1478762713 * class224.anInt2328 + i_44_ >= 0
									&& -2101247021 * class224.anInt2326 + i_44_ < i_6_) {
								Class63.aClass644_948.pushBack(new LinkableInt(i_41_));
							}
						}
					}
				}
				Queue.aClass678_Sub8_8139.resizeCaches(128, 64);
			}
		}
		return true;
	}

	Class56() throws Throwable {
		throw new Error();
	}
}
