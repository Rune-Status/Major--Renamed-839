package com.jagex;

import java.nio.ByteBuffer;

public class Class317 {
	static final int anInt3379 = 128;
	static final int anInt3385 = 7;
	int anInt3378;
	NativeToolkit toolkit;
	boolean aBool3381 = true;
	Class322 aClass322_3382;
	int anInt3383 = -1;
	int anInt3384;
	int anInt3386;
	NativeElementArrayBuffer elements;
	Native2DTexture texture;
	int anInt3389;
	int anInt3390;
	int[] anIntArray3391;
	byte[] aByteArray3392;

	Class317(NativeToolkit toolkit, Class322 class322, NativeGround ground, int i, int i_14_, int i_15_, int i_16_,
			int i_17_) {
		this.toolkit = toolkit;
		aClass322_3382 = class322;
		anInt3378 = i_16_;
		anInt3384 = i_17_;
		int i_18_ = 1 << i_15_;
		int size = 0;
		int i_20_ = i << i_15_;
		int i_21_ = i_14_ << i_15_;

		for (int i_22_ = 0; i_22_ < i_18_; i_22_++) {
			int index = (i_21_ + i_22_) * ground.width * 767658255 + i_20_;
			for (int i_24_ = 0; i_24_ < i_18_; i_24_++) {
				short[] is = ground.aShortArrayArray8717[index++];

				if (is != null) {
					size += is.length;
				}
			}
		}

		if (size > 0) {
			anInt3390 = -2147483648;
			anInt3389 = 2147483647;
			elements = toolkit.createElementArrayBuffer(false);
			elements.allocate(size);
			ByteBuffer buffer = toolkit.aByteBuffer9279;
			buffer.clear();

			for (int i_25_ = 0; i_25_ < i_18_; i_25_++) {
				int i_26_ = (i_21_ + i_25_) * ground.width * 767658255 + i_20_;

				for (int i_27_ = 0; i_27_ < i_18_; i_27_++) {
					short[] is = ground.aShortArrayArray8717[i_26_++];

					if (is != null) {
						for (short element : is) {
							int i_29_ = element & 0xffff;
							if (i_29_ < anInt3389) {
								anInt3389 = i_29_;
							}

							if (i_29_ > anInt3390) {
								anInt3390 = i_29_;
							}

							buffer.putShort((short) i_29_);
						}
					}
				}
			}

			elements.read(0, buffer.position(), toolkit.aLong9268);
			anInt3386 = size / 3;
		} else {
			anInt3386 = 0;
			texture = null;
		}
	}

	void method5702(Class259 class259, NativeElementArrayBuffer elements, int i, int i_0_) {
		if (i_0_ > 0) {
			method5705();
			toolkit.method14748(elements);
			class259.anInterface29_2863 = texture;
			class259.anInt2880 = anInt3389;
			class259.anInt2879 = anInt3390 - anInt3389 + 1;
			class259.anInt2878 = i;
			class259.anInt2877 = i_0_;
			class259.method4775(false);
		}
	}

	void method5703(Class259 class259) {
		method5702(class259, elements, 0, anInt3386);
	}

	void method5705() {
		if (aBool3381) {
			aBool3381 = false;
			byte[] is = aClass322_3382.aByteArray3420;
			int i = 0;

			int i_1_ = aClass322_3382.anInt3418;
			int i_2_ = anInt3378 + anInt3384 * aClass322_3382.anInt3418;

			for (int i_3_ = -128; i_3_ < 0; i_3_++) {
				i = (i << 8) - i;
				for (int i_4_ = -128; i_4_ < 0; i_4_++) {
					if (is[i_2_++] != 0) {
						i++;
					}
				}

				i_2_ += i_1_ - 128;
			}

			if (texture != null && anInt3383 == i) {
				aBool3381 = false;
			} else {
				anInt3383 = i;
				int i_5_ = 0;
				i_2_ = anInt3378 + anInt3384 * i_1_;

				if (toolkit.method14655(Class121.aClass121_1460, Class151.aClass151_2)) {
					if (aByteArray3392 == null) {
						aByteArray3392 = new byte[16384];
					}

					byte[] is_6_ = aByteArray3392;
					for (int i_7_ = -128; i_7_ < 0; i_7_++) {
						for (int i_8_ = -128; i_8_ < 0; i_8_++) {
							if (is[i_2_] != 0) {
								is_6_[i_5_++] = (byte) 68;
							} else {
								int i_9_ = 0;
								if (is[i_2_ - 1] != 0) {
									i_9_++;
								}

								if (is[i_2_ + 1] != 0) {
									i_9_++;
								}

								if (is[i_2_ - i_1_] != 0) {
									i_9_++;
								}

								if (is[i_2_ + i_1_] != 0) {
									i_9_++;
								}
								is_6_[i_5_++] = (byte) (17 * i_9_);
							}

							i_2_++;
						}

						i_2_ += aClass322_3382.anInt3418 - 128;
					}

					if (texture == null) {
						texture = toolkit.create2DTexture(Class121.aClass121_1460, 128, 128, false, aByteArray3392);
						texture.setRepeating(false, false);
					} else {
						texture.method213(0, 0, 128, 128, aByteArray3392, Class121.aClass121_1460, 0, 128);
					}
				} else {
					if (anIntArray3391 == null) {
						anIntArray3391 = new int[16384];
					}

					int[] is_10_ = anIntArray3391;
					for (int i_11_ = -128; i_11_ < 0; i_11_++) {
						for (int i_12_ = -128; i_12_ < 0; i_12_++) {
							if (is[i_2_] != 0) {
								is_10_[i_5_++] = 1140850688;
							} else {
								int i_13_ = 0;
								if (is[i_2_ - 1] != 0) {
									i_13_++;
								}

								if (is[i_2_ + 1] != 0) {
									i_13_++;
								}

								if (is[i_2_ - i_1_] != 0) {
									i_13_++;
								}

								if (is[i_2_ + i_1_] != 0) {
									i_13_++;
								}

								is_10_[i_5_++] = 17 * i_13_ << 24;
							}

							i_2_++;
						}

						i_2_ += aClass322_3382.anInt3418 - 128;
					}

					if (texture == null) {
						texture = toolkit.create2DTexture(128, 128, false, anIntArray3391);
						texture.setRepeating(false, false);
					} else {
						texture.method183(0, 0, 128, 128, anIntArray3391, 0, 128);
					}
				}
			}
		}
	}

}