package com.jagex;

public class OpenGlShadow extends Shadow {
	static final int anInt11699 = 16;

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

	int width;
	int y;
	int height;
	int x;
	byte[] map;

	OpenGlShadow(OpenGlToolkit toolkit, int i, int i_5_) {
		map = new byte[i * i_5_];
	}

	void setBounds(int x, int y, int maxX, int maxY) {
		this.x = x;
		this.y = y;
		width = maxX - x;
		height = maxY - y;
	}

	boolean containsRegion(int i, int i_3_) {
		return map.length >= i * i_3_;
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

	void fill(int i, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_) {
		int i_14_ = 0;
		if (i_9_ != i) {
			i_14_ = (i_12_ - i_11_ << 16) / (i_9_ - i);
		}

		int i_15_ = 0;
		if (i_10_ != i_9_) {
			i_15_ = (i_13_ - i_12_ << 16) / (i_10_ - i_9_);
		}

		int i_16_ = 0;
		if (i_10_ != i) {
			i_16_ = (i_11_ - i_13_ << 16) / (i - i_10_);
		}

		if (i <= i_9_ && i <= i_10_) {
			if (i_9_ < i_10_) {
				i_13_ = i_11_ <<= 16;
				if (i < 0) {
					i_13_ -= i_16_ * i;
					i_11_ -= i_14_ * i;
					i = 0;
				}
				i_12_ <<= 16;
				if (i_9_ < 0) {
					i_12_ -= i_15_ * i_9_;
					i_9_ = 0;
				}
				if (i != i_9_ && i_16_ < i_14_ || i == i_9_ && i_16_ > i_15_) {
					i_10_ -= i_9_;
					i_9_ -= i;
					i *= width;
					while (--i_9_ >= 0) {
						fillMap(map, i, 0, i_13_ >> 16, i_11_ >> 16);
						i_13_ += i_16_;
						i_11_ += i_14_;
						i += width;
					}
					while (--i_10_ >= 0) {
						fillMap(map, i, 0, i_13_ >> 16, i_12_ >> 16);
						i_13_ += i_16_;
						i_12_ += i_15_;
						i += width;
					}
				} else {
					i_10_ -= i_9_;
					i_9_ -= i;
					i *= width;
					while (--i_9_ >= 0) {
						fillMap(map, i, 0, i_11_ >> 16, i_13_ >> 16);
						i_13_ += i_16_;
						i_11_ += i_14_;
						i += width;
					}
					while (--i_10_ >= 0) {
						fillMap(map, i, 0, i_12_ >> 16, i_13_ >> 16);
						i_13_ += i_16_;
						i_12_ += i_15_;
						i += width;
					}
				}
			} else {
				i_12_ = i_11_ <<= 16;
				if (i < 0) {
					i_12_ -= i_16_ * i;
					i_11_ -= i_14_ * i;
					i = 0;
				}
				i_13_ <<= 16;
				if (i_10_ < 0) {
					i_13_ -= i_15_ * i_10_;
					i_10_ = 0;
				}
				if (i != i_10_ && i_16_ < i_14_ || i == i_10_ && i_15_ > i_14_) {
					i_9_ -= i_10_;
					i_10_ -= i;
					i *= width;
					while (--i_10_ >= 0) {
						fillMap(map, i, 0, i_12_ >> 16, i_11_ >> 16);
						i_12_ += i_16_;
						i_11_ += i_14_;
						i += width;
					}
					while (--i_9_ >= 0) {
						fillMap(map, i, 0, i_13_ >> 16, i_11_ >> 16);
						i_13_ += i_15_;
						i_11_ += i_14_;
						i += width;
					}
				} else {
					i_9_ -= i_10_;
					i_10_ -= i;
					i *= width;
					while (--i_10_ >= 0) {
						fillMap(map, i, 0, i_11_ >> 16, i_12_ >> 16);
						i_12_ += i_16_;
						i_11_ += i_14_;
						i += width;
					}
					while (--i_9_ >= 0) {
						fillMap(map, i, 0, i_11_ >> 16, i_13_ >> 16);
						i_13_ += i_15_;
						i_11_ += i_14_;
						i += width;
					}
				}
			}
		} else if (i_9_ <= i_10_) {
			if (i_10_ < i) {
				i_11_ = i_12_ <<= 16;
				if (i_9_ < 0) {
					i_11_ -= i_14_ * i_9_;
					i_12_ -= i_15_ * i_9_;
					i_9_ = 0;
				}
				i_13_ <<= 16;
				if (i_10_ < 0) {
					i_13_ -= i_16_ * i_10_;
					i_10_ = 0;
				}
				if (i_9_ != i_10_ && i_14_ < i_15_ || i_9_ == i_10_ && i_14_ > i_16_) {
					i -= i_10_;
					i_10_ -= i_9_;
					i_9_ *= width;
					while (--i_10_ >= 0) {
						fillMap(map, i_9_, 0, i_11_ >> 16, i_12_ >> 16);
						i_11_ += i_14_;
						i_12_ += i_15_;
						i_9_ += width;
					}
					while (--i >= 0) {
						fillMap(map, i_9_, 0, i_11_ >> 16, i_13_ >> 16);
						i_11_ += i_14_;
						i_13_ += i_16_;
						i_9_ += width;
					}
				} else {
					i -= i_10_;
					i_10_ -= i_9_;
					i_9_ *= width;
					while (--i_10_ >= 0) {
						fillMap(map, i_9_, 0, i_12_ >> 16, i_11_ >> 16);
						i_11_ += i_14_;
						i_12_ += i_15_;
						i_9_ += width;
					}
					while (--i >= 0) {
						fillMap(map, i_9_, 0, i_13_ >> 16, i_11_ >> 16);
						i_11_ += i_14_;
						i_13_ += i_16_;
						i_9_ += width;
					}
				}
			} else {
				i_13_ = i_12_ <<= 16;
				if (i_9_ < 0) {
					i_13_ -= i_14_ * i_9_;
					i_12_ -= i_15_ * i_9_;
					i_9_ = 0;
				}
				i_11_ <<= 16;
				if (i < 0) {
					i_11_ -= i_16_ * i;
					i = 0;
				}
				if (i_14_ < i_15_) {
					i_10_ -= i;
					i -= i_9_;
					i_9_ *= width;
					while (--i >= 0) {
						fillMap(map, i_9_, 0, i_13_ >> 16, i_12_ >> 16);
						i_13_ += i_14_;
						i_12_ += i_15_;
						i_9_ += width;
					}
					while (--i_10_ >= 0) {
						fillMap(map, i_9_, 0, i_11_ >> 16, i_12_ >> 16);
						i_11_ += i_16_;
						i_12_ += i_15_;
						i_9_ += width;
					}
				} else {
					i_10_ -= i;
					i -= i_9_;
					i_9_ *= width;
					while (--i >= 0) {
						fillMap(map, i_9_, 0, i_12_ >> 16, i_13_ >> 16);
						i_13_ += i_14_;
						i_12_ += i_15_;
						i_9_ += width;
					}
					while (--i_10_ >= 0) {
						fillMap(map, i_9_, 0, i_12_ >> 16, i_11_ >> 16);
						i_11_ += i_16_;
						i_12_ += i_15_;
						i_9_ += width;
					}
				}
			}
		} else if (i < i_9_) {
			i_12_ = i_13_ <<= 16;
			if (i_10_ < 0) {
				i_12_ -= i_15_ * i_10_;
				i_13_ -= i_16_ * i_10_;
				i_10_ = 0;
			}
			i_11_ <<= 16;
			if (i < 0) {
				i_11_ -= i_14_ * i;
				i = 0;
			}
			if (i_15_ < i_16_) {
				i_9_ -= i;
				i -= i_10_;
				i_10_ *= width;
				while (--i >= 0) {
					fillMap(map, i_10_, 0, i_12_ >> 16, i_13_ >> 16);
					i_12_ += i_15_;
					i_13_ += i_16_;
					i_10_ += width;
				}
				while (--i_9_ >= 0) {
					fillMap(map, i_10_, 0, i_12_ >> 16, i_11_ >> 16);
					i_12_ += i_15_;
					i_11_ += i_14_;
					i_10_ += width;
				}
			} else {
				i_9_ -= i;
				i -= i_10_;
				i_10_ *= width;
				while (--i >= 0) {
					fillMap(map, i_10_, 0, i_13_ >> 16, i_12_ >> 16);
					i_12_ += i_15_;
					i_13_ += i_16_;
					i_10_ += width;
				}
				while (--i_9_ >= 0) {
					fillMap(map, i_10_, 0, i_11_ >> 16, i_12_ >> 16);
					i_12_ += i_15_;
					i_11_ += i_14_;
					i_10_ += width;
				}
			}
		} else {
			i_11_ = i_13_ <<= 16;
			if (i_10_ < 0) {
				i_11_ -= i_15_ * i_10_;
				i_13_ -= i_16_ * i_10_;
				i_10_ = 0;
			}
			i_12_ <<= 16;
			if (i_9_ < 0) {
				i_12_ -= i_14_ * i_9_;
				i_9_ = 0;
			}
			if (i_15_ < i_16_) {
				i -= i_9_;
				i_9_ -= i_10_;
				i_10_ *= width;
				while (--i_9_ >= 0) {
					fillMap(map, i_10_, 0, i_11_ >> 16, i_13_ >> 16);
					i_11_ += i_15_;
					i_13_ += i_16_;
					i_10_ += width;
				}
				while (--i >= 0) {
					fillMap(map, i_10_, 0, i_12_ >> 16, i_13_ >> 16);
					i_12_ += i_14_;
					i_13_ += i_16_;
					i_10_ += width;
				}
			} else {
				i -= i_9_;
				i_9_ -= i_10_;
				i_10_ *= width;
				while (--i_9_ >= 0) {
					fillMap(map, i_10_, 0, i_13_ >> 16, i_11_ >> 16);
					i_11_ += i_15_;
					i_13_ += i_16_;
					i_10_ += width;
				}
				while (--i >= 0) {
					fillMap(map, i_10_, 0, i_13_ >> 16, i_12_ >> 16);
					i_12_ += i_14_;
					i_13_ += i_16_;
					i_10_ += width;
				}
			}
		}
	}

}