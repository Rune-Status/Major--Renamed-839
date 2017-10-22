package com.jagex;

public class NanoTimer {
	static void method683(int i, int i_3_, int i_4_, int i_5_, boolean bool) {
		long l = i | (bool ? -2147483648 : 0);
		Class480_Sub1 class480_sub1 = (Class480_Sub1) Class480_Sub1.aClass667_9961.get(l);
		if (null == class480_sub1) {
			class480_sub1 = new Class480_Sub1();
			Class480_Sub1.aClass667_9961.put(l, class480_sub1);
		}
		if (class480_sub1.anIntArray9964.length <= i_3_) {
			int[] is = new int[1 + i_3_];
			int[] is_7_ = new int[1 + i_3_];
			for (int i_8_ = 0; i_8_ < class480_sub1.anIntArray9964.length; i_8_++) {
				is[i_8_] = class480_sub1.anIntArray9964[i_8_];
				is_7_[i_8_] = class480_sub1.anIntArray9965[i_8_];
			}
			for (int i_9_ = class480_sub1.anIntArray9964.length; i_9_ < i_3_; i_9_++) {
				is[i_9_] = -1;
				is_7_[i_9_] = 0;
			}
			class480_sub1.anIntArray9964 = is;
			class480_sub1.anIntArray9965 = is_7_;
		}
		class480_sub1.anIntArray9964[i_3_] = i_4_;
		class480_sub1.anIntArray9965[i_3_] = i_5_;
	}

	public NanoTimer() {
		System.nanoTime();
	}

	public long getTime() {
		return System.nanoTime();
	}

}