package com.jagex;

public class Class496 {
	static final int anInt6872 = -2012;
	static final int anInt6873 = 38912;
	static final int anInt6874 = 1;
	static final int anInt6875 = 2;
	static final int anInt6876 = 12;
	static final int anInt6879 = 2012;
	static final int anInt6880 = 8;
	int anInt6871;
	Class492 aClass492_6877;
	int anInt6878 = 0;

	Class496(Class492 class492) {
		aClass492_6877 = class492;
	}

	final boolean method8659(int[] is, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
		if (i_2_ > i_5_) {
			i_2_ = i_5_;
		}
		if (i_1_ < 0) {
			i_1_ = 0;
		}
		if (i_1_ >= i_2_) {
			return true;
		}
		i += i_1_ - 1;
		i_0_ = i_2_ - i_1_ >> 2;
		i_3_ += i_4_ * i_1_;
		if (anInt6871 == 1) {
			anInt6878 += i_0_;
			while (--i_0_ >= 0) {
				if (i_3_ < is[++i]) {
					is[i] = i_3_;
				}
				i_3_ += i_4_;
				if (i_3_ < is[++i]) {
					is[i] = i_3_;
				}
				i_3_ += i_4_;
				if (i_3_ < is[++i]) {
					is[i] = i_3_;
				}
				i_3_ += i_4_;
				if (i_3_ < is[++i]) {
					is[i] = i_3_;
				}
				i_3_ += i_4_;
			}
			i_0_ = i_2_ - i_1_ & 0x3;
			while (--i_0_ >= 0) {
				if (i_3_ < is[++i]) {
					is[i] = i_3_;
				}
				i_3_ += i_4_;
			}
		} else {
			i_3_ -= 38912;
			while (--i_0_ >= 0) {
				if (i_3_ < is[++i]) {
					return false;
				}
				i_3_ += i_4_;
				if (i_3_ < is[++i]) {
					return false;
				}
				i_3_ += i_4_;
				if (i_3_ < is[++i]) {
					return false;
				}
				i_3_ += i_4_;
				if (i_3_ < is[++i]) {
					return false;
				}
				i_3_ += i_4_;
			}
			i_0_ = i_2_ - i_1_ & 0x3;
			while (--i_0_ >= 0) {
				if (i_3_ < is[++i]) {
					return false;
				}
				i_3_ += i_4_;
			}
		}
		return true;
	}

	final boolean method8665(int i, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_) {
		if (i > 2012 || i_6_ > 2012 || i_7_ > 2012 || i_8_ > 2012 || i_9_ > 2012 || i_10_ > 2012) {
			return false;
		}
		if (i < -2012 || i_6_ < -2012 || i_7_ < -2012 || i_8_ < -2012 || i_9_ < -2012 || i_10_ < -2012) {
			return false;
		}
		if (anInt6871 == 2) {
			int i_14_ = i_8_ + i * aClass492_6877.anInt6770;
			if (i_14_ >= 0 && i_14_ < aClass492_6877.anIntArray6780.length
					&& (i_11_ << 8) - 38912 < aClass492_6877.anIntArray6780[i_14_]) {
				return false;
			}
			i_14_ = i_9_ + i_6_ * aClass492_6877.anInt6770;
			if (i_14_ >= 0 && i_14_ < aClass492_6877.anIntArray6780.length
					&& (i_12_ << 8) - 38912 < aClass492_6877.anIntArray6780[i_14_]) {
				return false;
			}
			i_14_ = i_10_ + i_7_ * aClass492_6877.anInt6770;
			if (i_14_ >= 0 && i_14_ < aClass492_6877.anIntArray6780.length
					&& (i_13_ << 8) - 38912 < aClass492_6877.anIntArray6780[i_14_]) {
				return false;
			}
		}
		int i_15_ = i_9_ - i_8_;
		int i_16_ = i_6_ - i;
		int i_17_ = i_10_ - i_8_;
		int i_18_ = i_7_ - i;
		int i_19_ = i_12_ - i_11_;
		int i_20_ = i_13_ - i_11_;
		if (i < i_6_ && i < i_7_) {
			i--;
			if (i_6_ > i_7_) {
				i_6_++;
			} else {
				i_7_++;
			}
		} else if (i_6_ < i_7_) {
			i_6_--;
			if (i > i_7_) {
				i++;
			} else {
				i_7_++;
			}
		} else {
			i_7_--;
			if (i > i_6_) {
				i++;
			} else {
				i_6_++;
			}
		}
		int i_21_ = 0;
		if (i_6_ != i) {
			i_21_ = (i_9_ - i_8_ << 12) / (i_6_ - i);
		}
		int i_22_ = 0;
		if (i_7_ != i_6_) {
			i_22_ = (i_10_ - i_9_ << 12) / (i_7_ - i_6_);
		}
		int i_23_ = 0;
		if (i_7_ != i) {
			i_23_ = (i_8_ - i_10_ << 12) / (i - i_7_);
		}
		int i_24_ = i_15_ * i_18_ - i_17_ * i_16_;
		if (i_24_ == 0) {
			return false;
		}
		int i_25_ = (i_19_ * i_18_ - i_20_ * i_16_ << 8) / i_24_;
		int i_26_ = (i_20_ * i_15_ - i_19_ * i_17_ << 8) / i_24_;
		if (i <= i_6_ && i <= i_7_) {
			if (i >= aClass492_6877.anInt6785) {
				return true;
			}
			if (i_6_ > aClass492_6877.anInt6785) {
				i_6_ = aClass492_6877.anInt6785;
			}
			if (i_7_ > aClass492_6877.anInt6785) {
				i_7_ = aClass492_6877.anInt6785;
			}
			i_11_ = (i_11_ << 8) - i_25_ * i_8_ + i_25_;
			if (i_6_ < i_7_) {
				i_10_ = i_8_ <<= 12;
				if (i < 0) {
					i_10_ -= i_23_ * i;
					i_8_ -= i_21_ * i;
					i_11_ -= i_26_ * i;
					i = 0;
				}
				i_9_ <<= 12;
				if (i_6_ < 0) {
					i_9_ -= i_22_ * i_6_;
					i_6_ = 0;
				}
				if (i != i_6_ && i_23_ < i_21_ || i == i_6_ && i_23_ > i_22_) {
					i_7_ -= i_6_;
					i_6_ -= i;
					i *= aClass492_6877.anInt6770;
					while (--i_6_ >= 0) {
						if (!method8659(aClass492_6877.anIntArray6780, i, 0, (i_10_ >> 12) - 1, (i_8_ >> 12) + 1,
								i_11_, i_25_, aClass492_6877.anInt6770)) {
							return false;
						}
						i_10_ += i_23_;
						i_8_ += i_21_;
						i_11_ += i_26_;
						i += aClass492_6877.anInt6770;
					}
					while (--i_7_ >= 0) {
						if (!method8659(aClass492_6877.anIntArray6780, i, 0, (i_10_ >> 12) - 1, (i_9_ >> 12) + 1,
								i_11_, i_25_, aClass492_6877.anInt6770)) {
							return false;
						}
						i_10_ += i_23_;
						i_9_ += i_22_;
						i_11_ += i_26_;
						i += aClass492_6877.anInt6770;
					}
					return true;
				}
				i_7_ -= i_6_;
				i_6_ -= i;
				i *= aClass492_6877.anInt6770;
				while (--i_6_ >= 0) {
					if (!method8659(aClass492_6877.anIntArray6780, i, 0, (i_8_ >> 12) - 1, (i_10_ >> 12) + 1, i_11_,
							i_25_, aClass492_6877.anInt6770)) {
						return false;
					}
					i_10_ += i_23_;
					i_8_ += i_21_;
					i_11_ += i_26_;
					i += aClass492_6877.anInt6770;
				}
				while (--i_7_ >= 0) {
					if (!method8659(aClass492_6877.anIntArray6780, i, 0, (i_9_ >> 12) - 1, (i_10_ >> 12) + 1, i_11_,
							i_25_, aClass492_6877.anInt6770)) {
						return false;
					}
					i_10_ += i_23_;
					i_9_ += i_22_;
					i_11_ += i_26_;
					i += aClass492_6877.anInt6770;
				}
				return true;
			}
			i_9_ = i_8_ <<= 12;
			if (i < 0) {
				i_9_ -= i_23_ * i;
				i_8_ -= i_21_ * i;
				i_11_ -= i_26_ * i;
				i = 0;
			}
			i_10_ <<= 12;
			if (i_7_ < 0) {
				i_10_ -= i_22_ * i_7_;
				i_7_ = 0;
			}
			if (i != i_7_ && i_23_ < i_21_ || i == i_7_ && i_22_ > i_21_) {
				i_6_ -= i_7_;
				i_7_ -= i;
				i *= aClass492_6877.anInt6770;
				while (--i_7_ >= 0) {
					if (!method8659(aClass492_6877.anIntArray6780, i, 0, (i_9_ >> 12) - 1, (i_8_ >> 12) + 1,
							i_11_, i_25_, aClass492_6877.anInt6770)) {
						return false;
					}
					i_9_ += i_23_;
					i_8_ += i_21_;
					i_11_ += i_26_;
					i += aClass492_6877.anInt6770;
				}
				while (--i_6_ >= 0) {
					if (!method8659(aClass492_6877.anIntArray6780, i, 0, (i_10_ >> 12) - 1, (i_8_ >> 12) + 1,
							i_11_, i_25_, aClass492_6877.anInt6770)) {
						return false;
					}
					i_10_ += i_22_;
					i_8_ += i_21_;
					i_11_ += i_26_;
					i += aClass492_6877.anInt6770;
				}
				return true;
			}
			i_6_ -= i_7_;
			i_7_ -= i;
			i *= aClass492_6877.anInt6770;
			while (--i_7_ >= 0) {
				if (!method8659(aClass492_6877.anIntArray6780, i, 0, (i_8_ >> 12) - 1, (i_9_ >> 12) + 1, i_11_, i_25_,
						aClass492_6877.anInt6770)) {
					return false;
				}
				i_9_ += i_23_;
				i_8_ += i_21_;
				i_11_ += i_26_;
				i += aClass492_6877.anInt6770;
			}
			while (--i_6_ >= 0) {
				if (!method8659(aClass492_6877.anIntArray6780, i, 0, (i_8_ >> 12) - 1, (i_10_ >> 12) + 1, i_11_,
						i_25_, aClass492_6877.anInt6770)) {
					return false;
				}
				i_10_ += i_22_;
				i_8_ += i_21_;
				i_11_ += i_26_;
				i += aClass492_6877.anInt6770;
			}
			return true;
		}
		if (i_6_ <= i_7_) {
			if (i_6_ >= aClass492_6877.anInt6785) {
				return true;
			}
			if (i_7_ > aClass492_6877.anInt6785) {
				i_7_ = aClass492_6877.anInt6785;
			}
			if (i > aClass492_6877.anInt6785) {
				i = aClass492_6877.anInt6785;
			}
			i_12_ = (i_12_ << 8) - i_25_ * i_9_ + i_25_;
			if (i_7_ < i) {
				i_8_ = i_9_ <<= 12;
				if (i_6_ < 0) {
					i_8_ -= i_21_ * i_6_;
					i_9_ -= i_22_ * i_6_;
					i_12_ -= i_26_ * i_6_;
					i_6_ = 0;
				}
				i_10_ <<= 12;
				if (i_7_ < 0) {
					i_10_ -= i_23_ * i_7_;
					i_7_ = 0;
				}
				if (i_6_ != i_7_ && i_21_ < i_22_ || i_6_ == i_7_ && i_21_ > i_23_) {
					i -= i_7_;
					i_7_ -= i_6_;
					i_6_ *= aClass492_6877.anInt6770;
					while (--i_7_ >= 0) {
						if (!method8659(aClass492_6877.anIntArray6780, i_6_, 0, (i_8_ >> 12) - 1, (i_9_ >> 12) + 1,
								i_12_, i_25_, aClass492_6877.anInt6770)) {
							return false;
						}
						i_8_ += i_21_;
						i_9_ += i_22_;
						i_12_ += i_26_;
						i_6_ += aClass492_6877.anInt6770;
					}
					while (--i >= 0) {
						if (!method8659(aClass492_6877.anIntArray6780, i_6_, 0, (i_8_ >> 12) - 1,
								(i_10_ >> 12) + 1, i_12_, i_25_, aClass492_6877.anInt6770)) {
							return false;
						}
						i_8_ += i_21_;
						i_10_ += i_23_;
						i_12_ += i_26_;
						i_6_ += aClass492_6877.anInt6770;
					}
					return true;
				}
				i -= i_7_;
				i_7_ -= i_6_;
				i_6_ *= aClass492_6877.anInt6770;
				while (--i_7_ >= 0) {
					if (!method8659(aClass492_6877.anIntArray6780, i_6_, 0, (i_9_ >> 12) - 1, (i_8_ >> 12) + 1, i_12_,
							i_25_, aClass492_6877.anInt6770)) {
						return false;
					}
					i_8_ += i_21_;
					i_9_ += i_22_;
					i_12_ += i_26_;
					i_6_ += aClass492_6877.anInt6770;
				}
				while (--i >= 0) {
					if (!method8659(aClass492_6877.anIntArray6780, i_6_, 0, (i_10_ >> 12) - 1, (i_8_ >> 12) + 1, i_12_,
							i_25_, aClass492_6877.anInt6770)) {
						return false;
					}
					i_8_ += i_21_;
					i_10_ += i_23_;
					i_12_ += i_26_;
					i_6_ += aClass492_6877.anInt6770;
				}
				return true;
			}
			i_10_ = i_9_ <<= 12;
			if (i_6_ < 0) {
				i_10_ -= i_21_ * i_6_;
				i_9_ -= i_22_ * i_6_;
				i_12_ -= i_26_ * i_6_;
				i_6_ = 0;
			}
			i_8_ <<= 12;
			if (i < 0) {
				i_8_ -= i_23_ * i;
				i = 0;
			}
			if (i_21_ < i_22_) {
				i_7_ -= i;
				i -= i_6_;
				i_6_ *= aClass492_6877.anInt6770;
				while (--i >= 0) {
					if (!method8659(aClass492_6877.anIntArray6780, i_6_, 0, (i_10_ >> 12) - 1, (i_9_ >> 12) + 1, i_12_,
							i_25_, aClass492_6877.anInt6770)) {
						return false;
					}
					i_10_ += i_21_;
					i_9_ += i_22_;
					i_12_ += i_26_;
					i_6_ += aClass492_6877.anInt6770;
				}
				while (--i_7_ >= 0) {
					if (!method8659(aClass492_6877.anIntArray6780, i_6_, 0, (i_8_ >> 12) - 1, (i_9_ >> 12) + 1,
							i_12_, i_25_, aClass492_6877.anInt6770)) {
						return false;
					}
					i_8_ += i_23_;
					i_9_ += i_22_;
					i_12_ += i_26_;
					i_6_ += aClass492_6877.anInt6770;
				}
				return true;
			}
			i_7_ -= i;
			i -= i_6_;
			i_6_ *= aClass492_6877.anInt6770;
			while (--i >= 0) {
				if (!method8659(aClass492_6877.anIntArray6780, i_6_, 0, (i_9_ >> 12) - 1, (i_10_ >> 12) + 1, i_12_,
						i_25_, aClass492_6877.anInt6770)) {
					return false;
				}
				i_10_ += i_21_;
				i_9_ += i_22_;
				i_12_ += i_26_;
				i_6_ += aClass492_6877.anInt6770;
			}
			while (--i_7_ >= 0) {
				if (!method8659(aClass492_6877.anIntArray6780, i_6_, 0, (i_9_ >> 12) - 1, (i_8_ >> 12) + 1, i_12_,
						i_25_, aClass492_6877.anInt6770)) {
					return false;
				}
				i_8_ += i_23_;
				i_9_ += i_22_;
				i_12_ += i_26_;
				i_6_ += aClass492_6877.anInt6770;
			}
			return true;
		}
		if (i_7_ >= aClass492_6877.anInt6785) {
			return true;
		}
		if (i > aClass492_6877.anInt6785) {
			i = aClass492_6877.anInt6785;
		}
		if (i_6_ > aClass492_6877.anInt6785) {
			i_6_ = aClass492_6877.anInt6785;
		}
		i_13_ = (i_13_ << 8) - i_25_ * i_10_ + i_25_;
		if (i < i_6_) {
			i_9_ = i_10_ <<= 12;
			if (i_7_ < 0) {
				i_9_ -= i_22_ * i_7_;
				i_10_ -= i_23_ * i_7_;
				i_13_ -= i_26_ * i_7_;
				i_7_ = 0;
			}
			i_8_ <<= 12;
			if (i < 0) {
				i_8_ -= i_21_ * i;
				i = 0;
			}
			if (i_22_ < i_23_) {
				i_6_ -= i;
				i -= i_7_;
				i_7_ *= aClass492_6877.anInt6770;
				while (--i >= 0) {
					if (!method8659(aClass492_6877.anIntArray6780, i_7_, 0, (i_9_ >> 12) - 1, (i_10_ >> 12) + 1, i_13_,
							i_25_, aClass492_6877.anInt6770)) {
						return false;
					}
					i_9_ += i_22_;
					i_10_ += i_23_;
					i_13_ += i_26_;
					i_7_ += aClass492_6877.anInt6770;
				}
				while (--i_6_ >= 0) {
					if (!method8659(aClass492_6877.anIntArray6780, i_7_, 0, (i_9_ >> 12) - 1, (i_8_ >> 12) + 1,
							i_13_, i_25_, aClass492_6877.anInt6770)) {
						return false;
					}
					i_9_ += i_22_;
					i_8_ += i_21_;
					i_13_ += i_26_;
					i_7_ += aClass492_6877.anInt6770;
				}
				return true;
			}
			i_6_ -= i;
			i -= i_7_;
			i_7_ *= aClass492_6877.anInt6770;
			while (--i >= 0) {
				if (!method8659(aClass492_6877.anIntArray6780, i_7_, 0, (i_10_ >> 12) - 1, (i_9_ >> 12) + 1,
						i_13_, i_25_, aClass492_6877.anInt6770)) {
					return false;
				}
				i_9_ += i_22_;
				i_10_ += i_23_;
				i_13_ += i_26_;
				i_7_ += aClass492_6877.anInt6770;
			}
			while (--i_6_ >= 0) {
				if (!method8659(aClass492_6877.anIntArray6780, i_7_, 0, (i_8_ >> 12) - 1, (i_9_ >> 12) + 1, i_13_,
						i_25_, aClass492_6877.anInt6770)) {
					return false;
				}
				i_9_ += i_22_;
				i_8_ += i_21_;
				i_13_ += i_26_;
				i_7_ += aClass492_6877.anInt6770;
			}
			return true;
		}
		i_8_ = i_10_ <<= 12;
		if (i_7_ < 0) {
			i_8_ -= i_22_ * i_7_;
			i_10_ -= i_23_ * i_7_;
			i_13_ -= i_26_ * i_7_;
			i_7_ = 0;
		}
		i_9_ <<= 12;
		if (i_6_ < 0) {
			i_9_ -= i_21_ * i_6_;
			i_6_ = 0;
		}
		if (i_22_ < i_23_) {
			i -= i_6_;
			i_6_ -= i_7_;
			i_7_ *= aClass492_6877.anInt6770;
			while (--i_6_ >= 0) {
				if (!method8659(aClass492_6877.anIntArray6780, i_7_, 0, (i_8_ >> 12) - 1, (i_10_ >> 12) + 1, i_13_,
						i_25_, aClass492_6877.anInt6770)) {
					return false;
				}
				i_8_ += i_22_;
				i_10_ += i_23_;
				i_13_ += i_26_;
				i_7_ += aClass492_6877.anInt6770;
			}
			while (--i >= 0) {
				if (!method8659(aClass492_6877.anIntArray6780, i_7_, 0, (i_9_ >> 12) - 1, (i_10_ >> 12) + 1,
						i_13_, i_25_, aClass492_6877.anInt6770)) {
					return false;
				}
				i_9_ += i_21_;
				i_10_ += i_23_;
				i_13_ += i_26_;
				i_7_ += aClass492_6877.anInt6770;
			}
			return true;
		}
		i -= i_6_;
		i_6_ -= i_7_;
		i_7_ *= aClass492_6877.anInt6770;
		while (--i_6_ >= 0) {
			if (!method8659(aClass492_6877.anIntArray6780, i_7_, 0, (i_10_ >> 12) - 1, (i_8_ >> 12) + 1, i_13_, i_25_,
					aClass492_6877.anInt6770)) {
				return false;
			}
			i_8_ += i_22_;
			i_10_ += i_23_;
			i_13_ += i_26_;
			i_7_ += aClass492_6877.anInt6770;
		}
		while (--i >= 0) {
			if (!method8659(aClass492_6877.anIntArray6780, i_7_, 0, (i_10_ >> 12) - 1, (i_9_ >> 12) + 1, i_13_,
					i_25_, aClass492_6877.anInt6770)) {
				return false;
			}
			i_9_ += i_21_;
			i_10_ += i_23_;
			i_13_ += i_26_;
			i_7_ += aClass492_6877.anInt6770;
		}
		return true;
	}
}
