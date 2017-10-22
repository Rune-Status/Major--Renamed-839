package com.jagex;

public final class NativeShadow extends Shadow {
	static final int anInt11689 = 16;

	static final void fillMap(byte[] map, int index, int remaining, int start, int end) {
		if (start < end) {
			index += start;
			remaining = end - start >> 2;

			while (--remaining >= 0) {
				map[index++] = (byte) 1;
				map[index++] = (byte) 1;
				map[index++] = (byte) 1;
				map[index++] = (byte) 1;
			}

			remaining = end - start & 0x3;
			while (--remaining >= 0) {
				map[index++] = (byte) 1;
			}
		}
	}

	int height;
	int width;
	int x;
	int y;

	byte[] map;

	NativeShadow(NativeToolkit toolkit, int i, int i_15_) {
		map = new byte[i * i_15_];
	}

	void setBounds(int x, int y, int maxX, int maxY) {
		this.x = x;
		this.y = y;
		width = maxX - x;
		height = maxY - y;
	}

	void fill(int i, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_) {
		int i_8_ = 0;
		if (i_3_ != i) {
			i_8_ = (i_6_ - i_5_ << 16) / (i_3_ - i);
		}

		int i_9_ = 0;
		if (i_4_ != i_3_) {
			i_9_ = (i_7_ - i_6_ << 16) / (i_4_ - i_3_);
		}

		int i_10_ = 0;
		if (i_4_ != i) {
			i_10_ = (i_5_ - i_7_ << 16) / (i - i_4_);
		}

		if (i <= i_3_ && i <= i_4_) {
			if (i_3_ < i_4_) {
				i_7_ = i_5_ <<= 16;
				if (i < 0) {
					i_7_ -= i_10_ * i;
					i_5_ -= i_8_ * i;
					i = 0;
				}
				i_6_ <<= 16;
				if (i_3_ < 0) {
					i_6_ -= i_9_ * i_3_;
					i_3_ = 0;
				}
				if (i != i_3_ && i_10_ < i_8_ || i == i_3_ && i_10_ > i_9_) {
					i_4_ -= i_3_;
					i_3_ -= i;
					i *= width;
					while (--i_3_ >= 0) {
						fillMap(map, i, 0, i_7_ >> 16, i_5_ >> 16);
						i_7_ += i_10_;
						i_5_ += i_8_;
						i += width;
					}
					while (--i_4_ >= 0) {
						fillMap(map, i, 0, i_7_ >> 16, i_6_ >> 16);
						i_7_ += i_10_;
						i_6_ += i_9_;
						i += width;
					}
				} else {
					i_4_ -= i_3_;
					i_3_ -= i;
					i *= width;
					while (--i_3_ >= 0) {
						fillMap(map, i, 0, i_5_ >> 16, i_7_ >> 16);
						i_7_ += i_10_;
						i_5_ += i_8_;
						i += width;
					}
					while (--i_4_ >= 0) {
						fillMap(map, i, 0, i_6_ >> 16, i_7_ >> 16);
						i_7_ += i_10_;
						i_6_ += i_9_;
						i += width;
					}
				}
			} else {
				i_6_ = i_5_ <<= 16;
				if (i < 0) {
					i_6_ -= i_10_ * i;
					i_5_ -= i_8_ * i;
					i = 0;
				}
				i_7_ <<= 16;
				if (i_4_ < 0) {
					i_7_ -= i_9_ * i_4_;
					i_4_ = 0;
				}
				if (i != i_4_ && i_10_ < i_8_ || i == i_4_ && i_9_ > i_8_) {
					i_3_ -= i_4_;
					i_4_ -= i;
					i *= width;
					while (--i_4_ >= 0) {
						fillMap(map, i, 0, i_6_ >> 16, i_5_ >> 16);
						i_6_ += i_10_;
						i_5_ += i_8_;
						i += width;
					}
					while (--i_3_ >= 0) {
						fillMap(map, i, 0, i_7_ >> 16, i_5_ >> 16);
						i_7_ += i_9_;
						i_5_ += i_8_;
						i += width;
					}
				} else {
					i_3_ -= i_4_;
					i_4_ -= i;
					i *= width;
					while (--i_4_ >= 0) {
						fillMap(map, i, 0, i_5_ >> 16, i_6_ >> 16);
						i_6_ += i_10_;
						i_5_ += i_8_;
						i += width;
					}
					while (--i_3_ >= 0) {
						fillMap(map, i, 0, i_5_ >> 16, i_7_ >> 16);
						i_7_ += i_9_;
						i_5_ += i_8_;
						i += width;
					}
				}
			}
		} else if (i_3_ <= i_4_) {
			if (i_4_ < i) {
				i_5_ = i_6_ <<= 16;
				if (i_3_ < 0) {
					i_5_ -= i_8_ * i_3_;
					i_6_ -= i_9_ * i_3_;
					i_3_ = 0;
				}
				i_7_ <<= 16;
				if (i_4_ < 0) {
					i_7_ -= i_10_ * i_4_;
					i_4_ = 0;
				}
				if (i_3_ != i_4_ && i_8_ < i_9_ || i_3_ == i_4_ && i_8_ > i_10_) {
					i -= i_4_;
					i_4_ -= i_3_;
					i_3_ *= width;
					while (--i_4_ >= 0) {
						fillMap(map, i_3_, 0, i_5_ >> 16, i_6_ >> 16);
						i_5_ += i_8_;
						i_6_ += i_9_;
						i_3_ += width;
					}
					while (--i >= 0) {
						fillMap(map, i_3_, 0, i_5_ >> 16, i_7_ >> 16);
						i_5_ += i_8_;
						i_7_ += i_10_;
						i_3_ += width;
					}
				} else {
					i -= i_4_;
					i_4_ -= i_3_;
					i_3_ *= width;
					while (--i_4_ >= 0) {
						fillMap(map, i_3_, 0, i_6_ >> 16, i_5_ >> 16);
						i_5_ += i_8_;
						i_6_ += i_9_;
						i_3_ += width;
					}
					while (--i >= 0) {
						fillMap(map, i_3_, 0, i_7_ >> 16, i_5_ >> 16);
						i_5_ += i_8_;
						i_7_ += i_10_;
						i_3_ += width;
					}
				}
			} else {
				i_7_ = i_6_ <<= 16;
				if (i_3_ < 0) {
					i_7_ -= i_8_ * i_3_;
					i_6_ -= i_9_ * i_3_;
					i_3_ = 0;
				}
				i_5_ <<= 16;
				if (i < 0) {
					i_5_ -= i_10_ * i;
					i = 0;
				}
				if (i_8_ < i_9_) {
					i_4_ -= i;
					i -= i_3_;
					i_3_ *= width;
					while (--i >= 0) {
						fillMap(map, i_3_, 0, i_7_ >> 16, i_6_ >> 16);
						i_7_ += i_8_;
						i_6_ += i_9_;
						i_3_ += width;
					}
					while (--i_4_ >= 0) {
						fillMap(map, i_3_, 0, i_5_ >> 16, i_6_ >> 16);
						i_5_ += i_10_;
						i_6_ += i_9_;
						i_3_ += width;
					}
				} else {
					i_4_ -= i;
					i -= i_3_;
					i_3_ *= width;
					while (--i >= 0) {
						fillMap(map, i_3_, 0, i_6_ >> 16, i_7_ >> 16);
						i_7_ += i_8_;
						i_6_ += i_9_;
						i_3_ += width;
					}
					while (--i_4_ >= 0) {
						fillMap(map, i_3_, 0, i_6_ >> 16, i_5_ >> 16);
						i_5_ += i_10_;
						i_6_ += i_9_;
						i_3_ += width;
					}
				}
			}
		} else if (i < i_3_) {
			i_6_ = i_7_ <<= 16;
			if (i_4_ < 0) {
				i_6_ -= i_9_ * i_4_;
				i_7_ -= i_10_ * i_4_;
				i_4_ = 0;
			}
			i_5_ <<= 16;
			if (i < 0) {
				i_5_ -= i_8_ * i;
				i = 0;
			}
			if (i_9_ < i_10_) {
				i_3_ -= i;
				i -= i_4_;
				i_4_ *= width;
				while (--i >= 0) {
					fillMap(map, i_4_, 0, i_6_ >> 16, i_7_ >> 16);
					i_6_ += i_9_;
					i_7_ += i_10_;
					i_4_ += width;
				}
				while (--i_3_ >= 0) {
					fillMap(map, i_4_, 0, i_6_ >> 16, i_5_ >> 16);
					i_6_ += i_9_;
					i_5_ += i_8_;
					i_4_ += width;
				}
			} else {
				i_3_ -= i;
				i -= i_4_;
				i_4_ *= width;
				while (--i >= 0) {
					fillMap(map, i_4_, 0, i_7_ >> 16, i_6_ >> 16);
					i_6_ += i_9_;
					i_7_ += i_10_;
					i_4_ += width;
				}
				while (--i_3_ >= 0) {
					fillMap(map, i_4_, 0, i_5_ >> 16, i_6_ >> 16);
					i_6_ += i_9_;
					i_5_ += i_8_;
					i_4_ += width;
				}
			}
		} else {
			i_5_ = i_7_ <<= 16;
			if (i_4_ < 0) {
				i_5_ -= i_9_ * i_4_;
				i_7_ -= i_10_ * i_4_;
				i_4_ = 0;
			}
			i_6_ <<= 16;
			if (i_3_ < 0) {
				i_6_ -= i_8_ * i_3_;
				i_3_ = 0;
			}
			if (i_9_ < i_10_) {
				i -= i_3_;
				i_3_ -= i_4_;
				i_4_ *= width;
				while (--i_3_ >= 0) {
					fillMap(map, i_4_, 0, i_5_ >> 16, i_7_ >> 16);
					i_5_ += i_9_;
					i_7_ += i_10_;
					i_4_ += width;
				}
				while (--i >= 0) {
					fillMap(map, i_4_, 0, i_6_ >> 16, i_7_ >> 16);
					i_6_ += i_8_;
					i_7_ += i_10_;
					i_4_ += width;
				}
			} else {
				i -= i_3_;
				i_3_ -= i_4_;
				i_4_ *= width;

				while (--i_3_ >= 0) {
					fillMap(map, i_4_, 0, i_7_ >> 16, i_5_ >> 16);
					i_5_ += i_9_;
					i_7_ += i_10_;
					i_4_ += width;
				}

				while (--i >= 0) {
					fillMap(map, i_4_, 0, i_7_ >> 16, i_6_ >> 16);
					i_6_ += i_8_;
					i_7_ += i_10_;
					i_4_ += width;
				}
			}
		}
	}

	void clear() {
		int index = -1;
		int length = map.length - 8;

		while (index < length) {
			map[++index] = (byte) 0;
			map[++index] = (byte) 0;
			map[++index] = (byte) 0;
			map[++index] = (byte) 0;
			map[++index] = (byte) 0;
			map[++index] = (byte) 0;
			map[++index] = (byte) 0;
			map[++index] = (byte) 0;
		}

		while (index < map.length - 1) {
			map[++index] = (byte) 0;
		}
	}

	boolean containsRegion(int i, int i_16_) {
		return map.length >= i * i_16_;
	}

}