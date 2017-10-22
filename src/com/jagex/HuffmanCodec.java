package com.jagex;

public class HuffmanCodec {
	public static short[][][] replacementBodyColours;

	static void method4342(Encodeable interface58) {
		while (Class529.aLinkedList7226.size() > 10) {
			Class529.aLinkedList7226.remove();
		}

		Class529.aLinkedList7226.add(interface58);
	}

	int[] tree;
	byte[] codeLengths;
	int[] codeTable;
	static HuffmanCodec huffman;

	public HuffmanCodec(byte[] data) {
		int symbolCount = data.length;
		codeTable = new int[symbolCount];
		codeLengths = data;
		int[] nextCodes = new int[33];
		tree = new int[8];
		int treeSize = 0;

		for (int index = 0; index < symbolCount; index++) {
			int codeLength = data[index];

			if (codeLength != 0) {
				int lengthBit = 1 << 32 - codeLength;
				int current = nextCodes[codeLength];
				codeTable[index] = current;
				int next;

				if (0 != (current & lengthBit)) {
					next = nextCodes[codeLength - 1];
				} else {
					next = current | lengthBit;
					for (int i = codeLength - 1; i >= 1; i--) {
						int code = nextCodes[i];
						if (code != current) {
							break;
						}

						int bit = 1 << 32 - i;
						if (0 != (code & bit)) {
							nextCodes[i] = nextCodes[i - 1];
							break;
						}
						nextCodes[i] = code | bit;
					}
				}

				nextCodes[codeLength] = next;
				for (int i = codeLength + 1; i <= 32; i++) {
					if (current == nextCodes[i]) {
						nextCodes[i] = next;
					}
				}

				int treeIndex = 0;
				for (int shift = 0; shift < codeLength; shift++) {
					int bit = -2147483648 >>> shift;

					if (0 != (current & bit)) {
						if (0 == tree[treeIndex]) {
							tree[treeIndex] = treeSize;
						}

						treeIndex = tree[treeIndex];
					} else {
						treeIndex++;
					}

					if (treeIndex >= tree.length) {
						int[] replacement = new int[tree.length * 2];
						for (int i = 0; i < tree.length; i++) {
							replacement[i] = tree[i];
						}
						tree = replacement;
					}

					bit >>>= 1;
				}

				tree[treeIndex] = index ^ 0xffffffff;
				if (treeIndex >= treeSize) {
					treeSize = 1 + treeIndex;
				}
			}
		}
	}

	int encode(byte[] is, int i, int i_0_, byte[] is_1_, int i_2_, int i_3_) {
		int i_4_ = 0;
		int i_5_ = i_2_ << 3;
		for (i_0_ += i; i < i_0_; i++) {
			int i_6_ = is[i] & 0xff;
			int i_7_ = codeTable[i_6_];
			int i_8_ = codeLengths[i_6_];
			if (i_8_ == 0) {
				throw new RuntimeException(new StringBuilder().append("").append(i_6_).toString());
			}
			int i_9_ = i_5_ >> 3;
			int i_10_ = i_5_ & 0x7;
			i_4_ &= -i_10_ >> 31;
			int i_11_ = i_9_ + (i_8_ + i_10_ - 1 >> 3);
			i_10_ += 24;
			is_1_[i_9_] = (byte) (i_4_ |= i_7_ >>> i_10_);
			if (i_9_ < i_11_) {
				i_9_++;
				i_10_ -= 8;
				is_1_[i_9_] = (byte) (i_4_ = i_7_ >>> i_10_);
				if (i_9_ < i_11_) {
					i_9_++;
					i_10_ -= 8;
					is_1_[i_9_] = (byte) (i_4_ = i_7_ >>> i_10_);
					if (i_9_ < i_11_) {
						i_9_++;
						i_10_ -= 8;
						is_1_[i_9_] = (byte) (i_4_ = i_7_ >>> i_10_);
						if (i_9_ < i_11_) {
							i_9_++;
							i_10_ -= 8;
							is_1_[i_9_] = (byte) (i_4_ = i_7_ << -i_10_);
						}
					}
				}
			}
			i_5_ += i_8_;
		}
		return (7 + i_5_ >> 3) - i_2_;
	}

	int decode(byte[] in, int sourceOffset, byte[] out, int destOffset, int length) {
		if (length == 0) {
			return 0;
		}
		int i_16_ = 0;
		length += destOffset;
		int i_17_ = sourceOffset;
		for (;;) {
			byte i_18_ = in[i_17_];
			if (i_18_ < 0) {
				i_16_ = tree[i_16_];
			} else {
				i_16_++;
			}
			int i_19_;
			if ((i_19_ = tree[i_16_]) < 0) {
				out[destOffset++] = (byte) (i_19_ ^ 0xffffffff);
				if (destOffset >= length) {
					break;
				}
				i_16_ = 0;
			}
			if ((i_18_ & 0x40) != 0) {
				i_16_ = tree[i_16_];
			} else {
				i_16_++;
			}
			if ((i_19_ = tree[i_16_]) < 0) {
				out[destOffset++] = (byte) (i_19_ ^ 0xffffffff);
				if (destOffset >= length) {
					break;
				}
				i_16_ = 0;
			}
			if (0 != (i_18_ & 0x20)) {
				i_16_ = tree[i_16_];
			} else {
				i_16_++;
			}
			if ((i_19_ = tree[i_16_]) < 0) {
				out[destOffset++] = (byte) (i_19_ ^ 0xffffffff);
				if (destOffset >= length) {
					break;
				}
				i_16_ = 0;
			}
			if ((i_18_ & 0x10) != 0) {
				i_16_ = tree[i_16_];
			} else {
				i_16_++;
			}
			if ((i_19_ = tree[i_16_]) < 0) {
				out[destOffset++] = (byte) (i_19_ ^ 0xffffffff);
				if (destOffset >= length) {
					break;
				}
				i_16_ = 0;
			}
			if (0 != (i_18_ & 0x8)) {
				i_16_ = tree[i_16_];
			} else {
				i_16_++;
			}
			if ((i_19_ = tree[i_16_]) < 0) {
				out[destOffset++] = (byte) (i_19_ ^ 0xffffffff);
				if (destOffset >= length) {
					break;
				}
				i_16_ = 0;
			}
			if ((i_18_ & 0x4) != 0) {
				i_16_ = tree[i_16_];
			} else {
				i_16_++;
			}
			if ((i_19_ = tree[i_16_]) < 0) {
				out[destOffset++] = (byte) (i_19_ ^ 0xffffffff);
				if (destOffset >= length) {
					break;
				}
				i_16_ = 0;
			}
			if ((i_18_ & 0x2) != 0) {
				i_16_ = tree[i_16_];
			} else {
				i_16_++;
			}
			if ((i_19_ = tree[i_16_]) < 0) {
				out[destOffset++] = (byte) (i_19_ ^ 0xffffffff);
				if (destOffset >= length) {
					break;
				}
				i_16_ = 0;
			}
			if ((i_18_ & 0x1) != 0) {
				i_16_ = tree[i_16_];
			} else {
				i_16_++;
			}
			if ((i_19_ = tree[i_16_]) < 0) {
				out[destOffset++] = (byte) (i_19_ ^ 0xffffffff);
				if (destOffset >= length) {
					break;
				}
				i_16_ = 0;
			}
			i_17_++;
		}
		return i_17_ + 1 - sourceOffset;
	}
}
