package com.jagex;

import java.awt.Component;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Class497 {
	public static KeyRecorder method8673(Component component) {
		return new ComponentKeyRecorder(component);
	}

	public static Model method8676(Toolkit class134, int i, int i_5_, int i_6_, int i_7_, int i_8_, Model class143,
			int i_9_, int i_10_, int i_11_, int i_12_, Class650 class650) {
		if (null == class143) {
			return null;
		}
		int i_14_ = 2055;
		if (null != class650) {
			i_14_ |= class650.method13457();
			i_14_ &= ~0x200;
		}
		long l = (i_12_ << 24) + (i_11_ << 16) + i_8_ + ((long) i_9_ << 32) + ((long) i_10_ << 48);
		Model class143_15_;
		synchronized (Class38.aClass168_538) {
			class143_15_ = (Model) Class38.aClass168_538.get(l);
		}
		if (null == class143_15_ || class134.method2637(class143_15_.functionMask(), i_14_) != 0) {
			if (null != class143_15_) {
				i_14_ = class134.mergeFunctionMasks(i_14_, class143_15_.functionMask());
			}
			int i_16_ = 3 * i_8_ + 6;
			int i_17_ = 3;
			int[] is = { 64, 96, 128 };
			BaseModel class144 = new BaseModel(i_17_ * i_16_ + 1, i_17_ * i_16_ * 2 - i_16_, 0);
			int i_18_ = class144.method3089(0, 0, 0);
			int[][] is_19_ = new int[i_17_][i_16_];
			for (int i_20_ = 0; i_20_ < i_17_; i_20_++) {
				int i_21_ = is[i_20_];
				int i_22_ = is[i_20_];
				for (int i_23_ = 0; i_23_ < i_16_; i_23_++) {
					int i_24_ = (i_23_ << 14) / i_16_;
					int i_25_ = Class373.SINE[i_24_] * i_21_ >> 14;
					int i_26_ = Class373.COSINE[i_24_] * i_22_ >> 14;
					is_19_[i_20_][i_23_] = class144.method3089(i_25_, 0, i_26_);
				}
			}
			for (int i_27_ = 0; i_27_ < i_17_; i_27_++) {
				int i_28_ = (128 + i_27_ * 256) / i_17_;
				int i_29_ = 256 - i_28_;
				byte i_30_ = (byte) (i_11_ * i_29_ + i_28_ * i_12_ >> 8);
				short i_31_ = (short) ((i_29_ * (i_9_ & 0x7f) + (i_10_ & 0x7f) * i_28_ & 0x7f00)
						+ (i_29_ * (i_9_ & 0x380) + i_28_ * (i_10_ & 0x380) & 0x38000)
						+ (i_29_ * (i_9_ & 0xfc00) + (i_10_ & 0xfc00) * i_28_ & 0xfc0000) >> 8);
				for (int i_32_ = 0; i_32_ < i_16_; i_32_++) {
					if (i_27_ == 0) {
						class144.method3114(i_18_, is_19_[0][(i_32_ + 1) % i_16_], is_19_[0][i_32_], (byte) 1,
								(byte) -1, i_31_, i_30_, (short) -1);
					} else {
						class144.method3114(is_19_[i_27_ - 1][i_32_], is_19_[i_27_ - 1][(i_32_ + 1) % i_16_],
								is_19_[i_27_][(1 + i_32_) % i_16_], (byte) 1, (byte) -1, i_31_, i_30_, (short) -1);
						class144.method3114(is_19_[i_27_ - 1][i_32_], is_19_[i_27_][(i_32_ + 1) % i_16_],
								is_19_[i_27_][i_32_], (byte) 1, (byte) -1, i_31_, i_30_, (short) -1);
					}
				}
			}
			class143_15_ = class134.createModel(class144, i_14_, -2135198873 * Class38.anInt539, 64, 768);
			synchronized (Class38.aClass168_538) {
				Class38.aClass168_538.put(l, class143_15_);
			}
		}
		int i_33_ = class143.minimumX();
		int i_34_ = class143.method2923();
		int i_35_ = class143.method2886();
		int i_36_ = class143.maximumZ();
		if (null != class650) {
			class143_15_ = class143_15_.method2890((byte) 3, i_14_, true);
			class143_15_.scale(i_34_ - i_33_ >> 1, 128, i_36_ - i_35_ >> 1);
			class143_15_.translate(i_34_ + i_33_ >> 1, 0, i_35_ + i_36_ >> 1);
			class650.method13460(class143_15_);
		} else {
			class143_15_ = class143_15_.method2890((byte) 3, i_14_, true);
			class143_15_.scale(i_34_ - i_33_ >> 1, 128, i_36_ - i_35_ >> 1);
			class143_15_.translate(i_33_ + i_34_ >> 1, 0, i_35_ + i_36_ >> 1);
		}
		if (0 != i_5_) {
			class143_15_.pitch(i_5_);
		}
		if (0 != i_6_) {
			class143_15_.roll(i_6_);
		}
		if (0 != i_7_) {
			class143_15_.translate(0, i_7_, 0);
		}
		return class143_15_;
	}

	public List aList6881 = new LinkedList();

	boolean aBool6882 = false;

	int anInt6883 = 0;

	int anInt6884 = 0;

	Class497(boolean bool) {
		aBool6882 = bool;
	}

	public void method8666() {
		Iterator iterator = aList6881.iterator();
		while (iterator.hasNext()) {
			Class506 class506 = (Class506) iterator.next();
			iterator.remove();
			ArchiveFileLoader.method6965(class506);
		}
	}

	void method8668(Class506 class506, byte i) {
		Class600_Sub1 class600_sub1 = class506.aClass600_Sub1_6962;
		boolean bool = true;
		Class139[] class139s = class506.aClass600_Sub1_6962.aClass139Array10373;
		for (Class139 class139 : class139s) {
			if (class139.aBool1581) {
				bool = false;
				break;
			}
		}
		if (!bool) {
			class506.aClass497_6963 = this;
			if (aBool6882) {
				Iterator iterator = aList6881.iterator();
				while (iterator.hasNext()) {
					Class506 class506_1_ = (Class506) iterator.next();
					if (class506_1_.aClass600_Sub1_6962 == class600_sub1) {
						iterator.remove();
						ArchiveFileLoader.method6965(class506_1_);
					}
				}
			}
			ListIterator listiterator = aList6881.listIterator();
			while (listiterator.hasNext()) {
				Class506 class506_2_ = (Class506) listiterator.next();
				if (-1777491969 * class600_sub1.anInt10377 >= class506_2_.aClass600_Sub1_6962.anInt10377 * -1777491969) {
					listiterator.previous();
					listiterator.add(class506);
					return;
				}
			}
			aList6881.add(class506);
		}
	}
}
