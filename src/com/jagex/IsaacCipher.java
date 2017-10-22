package com.jagex;

public final class IsaacCipher {
	static final int anInt8347 = 256;
	static final int anInt8348 = 8;
	static final int anInt8349 = 1020;
	static UrlResourceProvider aClass52_8356;

	int count;
	int[] results;
	int counter;
	int accumulator;
	int last;
	int[] state = new int[256];

	public IsaacCipher(int[] is) {
		results = new int[256];
		for (int i = 0; i < is.length; i++) {
			results[i] = is[i];
		}
		init();
	}

	public final int peek() {
		if (0 == count * -1461407363) {
			isaac();
			count = 974116096;
		}

		return results[-1461407363 * count - 1];
	}

	public final int nextInt() {
		if (-1461407363 * count == 0) {
			isaac();
			count = 974116096;
		}

		return results[(count -= -516288555) * -1461407363];
	}

	final void isaac() {
		last += (counter += -628981659) * 516941425;
		for (int i_0_ = 0; i_0_ < 256; i_0_++) {
			int i_1_ = state[i_0_];
			if (0 == (i_0_ & 0x2)) {
				if ((i_0_ & 0x1) == 0) {
					accumulator = (-1824917269 * accumulator ^ -1824917269 * accumulator << 13) * 358412227;
				} else {
					accumulator = (accumulator * -1824917269 ^ -1824917269 * accumulator >>> 6) * 358412227;
				}
			} else if ((i_0_ & 0x1) == 0) {
				accumulator = 358412227 * (accumulator * -1824917269 ^ -1824917269 * accumulator << 2);
			} else {
				accumulator = (accumulator * -1824917269 ^ accumulator * -1824917269 >>> 16) * 358412227;
			}
			accumulator += 358412227 * state[128 + i_0_ & 0xff];
			int i_2_;
			state[i_0_] = i_2_ = -79163203 * last + -1824917269 * accumulator + state[(i_1_ & 0x3fc) >> 2];
			results[i_0_] = (last = (i_1_ + state[(i_2_ >> 8 & 0x3fc) >> 2]) * 1520462485) * -79163203;
		}
	}

	final void init() {
		int i_3_ = -1640531527;
		int i_4_ = -1640531527;
		int i_5_ = -1640531527;
		int i_6_ = -1640531527;
		int i_7_ = -1640531527;
		int i_8_ = -1640531527;
		int i_9_ = -1640531527;
		int i_10_ = -1640531527;
		for (int i_11_ = 0; i_11_ < 4; i_11_++) {
			i_10_ ^= i_9_ << 11;
			i_7_ += i_10_;
			i_9_ += i_8_;
			i_9_ ^= i_8_ >>> 2;
			i_6_ += i_9_;
			i_8_ += i_7_;
			i_8_ ^= i_7_ << 8;
			i_5_ += i_8_;
			i_7_ += i_6_;
			i_7_ ^= i_6_ >>> 16;
			i_4_ += i_7_;
			i_6_ += i_5_;
			i_6_ ^= i_5_ << 10;
			i_3_ += i_6_;
			i_5_ += i_4_;
			i_5_ ^= i_4_ >>> 4;
			i_10_ += i_5_;
			i_4_ += i_3_;
			i_4_ ^= i_3_ << 8;
			i_9_ += i_4_;
			i_3_ += i_10_;
			i_3_ ^= i_10_ >>> 9;
			i_8_ += i_3_;
			i_10_ += i_9_;
		}
		for (int i_12_ = 0; i_12_ < 256; i_12_ += 8) {
			i_10_ += results[i_12_];
			i_9_ += results[1 + i_12_];
			i_8_ += results[2 + i_12_];
			i_7_ += results[3 + i_12_];
			i_6_ += results[i_12_ + 4];
			i_5_ += results[i_12_ + 5];
			i_4_ += results[i_12_ + 6];
			i_3_ += results[i_12_ + 7];
			i_10_ ^= i_9_ << 11;
			i_7_ += i_10_;
			i_9_ += i_8_;
			i_9_ ^= i_8_ >>> 2;
			i_6_ += i_9_;
			i_8_ += i_7_;
			i_8_ ^= i_7_ << 8;
			i_5_ += i_8_;
			i_7_ += i_6_;
			i_7_ ^= i_6_ >>> 16;
			i_4_ += i_7_;
			i_6_ += i_5_;
			i_6_ ^= i_5_ << 10;
			i_3_ += i_6_;
			i_5_ += i_4_;
			i_5_ ^= i_4_ >>> 4;
			i_10_ += i_5_;
			i_4_ += i_3_;
			i_4_ ^= i_3_ << 8;
			i_9_ += i_4_;
			i_3_ += i_10_;
			i_3_ ^= i_10_ >>> 9;
			i_8_ += i_3_;
			i_10_ += i_9_;
			state[i_12_] = i_10_;
			state[i_12_ + 1] = i_9_;
			state[2 + i_12_] = i_8_;
			state[i_12_ + 3] = i_7_;
			state[i_12_ + 4] = i_6_;
			state[i_12_ + 5] = i_5_;
			state[i_12_ + 6] = i_4_;
			state[7 + i_12_] = i_3_;
		}
		for (int i_13_ = 0; i_13_ < 256; i_13_ += 8) {
			i_10_ += state[i_13_];
			i_9_ += state[i_13_ + 1];
			i_8_ += state[2 + i_13_];
			i_7_ += state[3 + i_13_];
			i_6_ += state[i_13_ + 4];
			i_5_ += state[i_13_ + 5];
			i_4_ += state[6 + i_13_];
			i_3_ += state[i_13_ + 7];
			i_10_ ^= i_9_ << 11;
			i_7_ += i_10_;
			i_9_ += i_8_;
			i_9_ ^= i_8_ >>> 2;
			i_6_ += i_9_;
			i_8_ += i_7_;
			i_8_ ^= i_7_ << 8;
			i_5_ += i_8_;
			i_7_ += i_6_;
			i_7_ ^= i_6_ >>> 16;
			i_4_ += i_7_;
			i_6_ += i_5_;
			i_6_ ^= i_5_ << 10;
			i_3_ += i_6_;
			i_5_ += i_4_;
			i_5_ ^= i_4_ >>> 4;
			i_10_ += i_5_;
			i_4_ += i_3_;
			i_4_ ^= i_3_ << 8;
			i_9_ += i_4_;
			i_3_ += i_10_;
			i_3_ ^= i_10_ >>> 9;
			i_8_ += i_3_;
			i_10_ += i_9_;
			state[i_13_] = i_10_;
			state[1 + i_13_] = i_9_;
			state[i_13_ + 2] = i_8_;
			state[i_13_ + 3] = i_7_;
			state[i_13_ + 4] = i_6_;
			state[i_13_ + 5] = i_5_;
			state[6 + i_13_] = i_4_;
			state[7 + i_13_] = i_3_;
		}

		isaac();
		count = 974116096;
	}
}
