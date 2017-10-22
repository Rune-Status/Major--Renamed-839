package com.jagex;

import java.nio.ByteBuffer;

public class Class480_Sub34 extends Linkable {
	float aFloat10234;
	NativeGround ground;
	int anInt10236;
	long aLong10237;
	NativeToolkit toolkit;
	NativeArrayBuffer anInterface32_10239;
	int anInt10240 = 0;
	int anInt10241;
	int anInt10242 = 0;
	int[] anIntArray10243;
	int anInt10244;
	Class150 aClass150_10245;
	ByteBuffer aByteBuffer10246;

	Class480_Sub34(NativeGround ground, int i, int i_24_, Class150 class150) {
		anInt10236 = 0;
		anInt10244 = 0;
		this.ground = ground;
		toolkit = ground.toolkit;
		anInt10241 = i;
		aFloat10234 = i_24_;
		aClass150_10245 = class150;
		anIntArray10243 = new int[ground.width * 767658255 * ground.length * 295124605];
	}

	void method16090(int i, int i_0_, int i_1_) {
		anIntArray10243[i_0_ * ground.width * 767658255 + i] |= 1 << i_1_;
		anInt10240++;
	}

	void method16091(int i) {
		aByteBuffer10246 = toolkit.allocate(i * 4);
		aLong10237 = toolkit.getAddress(aByteBuffer10246);

		for (int i_2_ = 3; i_2_ < i * 4; i_2_ += 4) {
			toolkit.unsafe.putByte(aLong10237 + i_2_, (byte) 0);
		}
	}

	void method16094(int i, int i_3_, int i_4_, float f) {
		if (anInt10241 != -1) {
			TextureMetrics metrics = toolkit.metricsList.get(anInt10241);
			int i_5_ = metrics.alpha & 0xff;

			if (i_5_ != 0 && metrics.aByte1719 != 4) {
				int i_6_;

				if (i_4_ < 0) {
					i_6_ = 0;
				} else if (i_4_ > 127) {
					i_6_ = 16777215;
				} else {
					i_6_ = 131586 * i_4_;
				}

				if (i_5_ == 256) {
					i_3_ = i_6_;
				} else {
					int i_7_ = i_5_;
					int i_8_ = 256 - i_5_;
					i_3_ = ((i_6_ & 0xff00ff) * i_7_ + (i_3_ & 0xff00ff) * i_8_ & ~0xff00ff)
							+ ((i_6_ & 0xff00) * i_7_ + (i_3_ & 0xff00) * i_8_ & 0xff0000) >> 8;
				}
			}

			int i_9_ = metrics.colourOffset & 0xff;
			if (i_9_ != 0) {
				i_9_ += 256;

				int i_10_ = ((i_3_ & 0xff0000) >> 16) * i_9_;
				if (i_10_ > 65535) {
					i_10_ = 65535;
				}

				int i_11_ = ((i_3_ & 0xff00) >> 8) * i_9_;
				if (i_11_ > 65535) {
					i_11_ = 65535;
				}

				int i_12_ = (i_3_ & 0xff) * i_9_;
				if (i_12_ > 65535) {
					i_12_ = 65535;
				}

				i_3_ = (i_10_ << 8 & 0xff0000) + (i_11_ & 0xff00) + (i_12_ >> 8);
			}
		}

		if (f != 1.0F) {
			int i_13_ = i_3_ >> 16 & 0xff;
			int i_14_ = i_3_ >> 8 & 0xff;
			int i_15_ = i_3_ & 0xff;
			i_13_ *= f;

			if (i_13_ < 0) {
				i_13_ = 0;
			} else if (i_13_ > 255) {
				i_13_ = 255;
			}

			i_14_ *= f;
			if (i_14_ < 0) {
				i_14_ = 0;
			} else if (i_14_ > 255) {
				i_14_ = 255;
			}
			i_15_ *= f;

			if (i_15_ < 0) {
				i_15_ = 0;
			} else if (i_15_ > 255) {
				i_15_ = 255;
			}

			i_3_ = i_13_ << 16 | i_14_ << 8 | i_15_;
		}

		if (toolkit.endianness == 0) {
			aByteBuffer10246.put(i * 4 + 0, (byte) (i_3_ >> 16));
			aByteBuffer10246.put(i * 4 + 1, (byte) (i_3_ >> 8));
			aByteBuffer10246.put(i * 4 + 2, (byte) (i_3_ >> 0));
		} else {
			aByteBuffer10246.put(i * 4 + 0, (byte) (i_3_ >> 0));
			aByteBuffer10246.put(i * 4 + 1, (byte) (i_3_ >> 8));
			aByteBuffer10246.put(i * 4 + 2, (byte) (i_3_ >> 16));
		}
	}

	void method16095(int[] is, int i) {
		anInt10242 = 0;
		anInt10236 = 32767;
		anInt10244 = -32768;

		ByteBuffer buffer = toolkit.aByteBuffer9279;
		for (int i_16_ = 0; i_16_ < i; i_16_++) {
			int i_17_ = is[i_16_];

			short[] is_18_ = ground.aShortArrayArray8717[i_17_];
			int i_19_ = anIntArray10243[i_17_];

			if (i_19_ != 0 && is_18_ != null) {
				int i_20_ = 0;
				int i_21_ = 0;

				while (i_21_ < is_18_.length) {
					if ((i_19_ & 1 << i_20_++) != 0) {
						for (int i_22_ = 0; i_22_ < 3; i_22_++) {
							int i_23_ = is_18_[i_21_++] & 0xffff;

							if (i_23_ > anInt10244) {
								anInt10244 = i_23_;
							}

							if (i_23_ < anInt10236) {
								anInt10236 = i_23_;
							}

							buffer.putShort((short) i_23_);
						}

						anInt10242 += 3;
					} else {
						i_21_ += 3;
					}
				}
			}
		}
	}

	void method16100(int i) {
		anInterface32_10239 = toolkit.createArrayBuffer(false);
		anInterface32_10239.reallocate(i * 4, 4);
		anInterface32_10239.read(0, i * 4, aLong10237);
		aByteBuffer10246.clear();
		aByteBuffer10246 = null;
		aLong10237 = 0L;
	}

	void method16103(int i) {
		toolkit.unsafe.putByte(aLong10237 + i * 4 + 3L, (byte) -1);
	}

}