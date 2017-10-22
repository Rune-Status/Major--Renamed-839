package com.jagex;

import jaggl.OpenGL;

public class Class93 {

	int anInt1269;
	int anInt1270;
	int anInt1271;
	int anInt1272;
	OpenGlToolkit toolkit;
	ElementArrayBuffer anInterface15_1274;
	boolean aBool1275 = true;
	Class91 aClass91_1276;
	NativeOpenGlElementArrayBuffer aClass97_Sub1_1277;
	OpenGl2DTexture aClass102_Sub1_1278;

	Class93(OpenGlToolkit toolkit, Class91 class91, OpenGlGround ground, int i, int i_9_, int i_10_, int i_11_,
			int i_12_) {
		anInt1269 = -1;
		this.toolkit = toolkit;
		aClass91_1276 = class91;
		anInt1271 = i_11_;
		anInt1272 = i_12_;
		int i_13_ = 1 << i_10_;
		int i_14_ = 0;
		int i_15_ = i << i_10_;
		int i_16_ = i_9_ << i_10_;
		for (int i_17_ = 0; i_17_ < i_13_; i_17_++) {
			int i_18_ = (i_16_ + i_17_) * ground.width * 767658255 + i_15_;
			for (int i_19_ = 0; i_19_ < i_13_; i_19_++) {
				short[] is = ground.materialIndices[i_18_++];
				if (is != null) {
					i_14_ += is.length;
				}
			}
		}
		anInt1270 = i_14_;
		if (i_14_ > 0) {
			Buffer buffer = new Buffer(i_14_ * 2);
			if (toolkit.bigEndian) {
				for (int i_20_ = 0; i_20_ < i_13_; i_20_++) {
					int i_21_ = (i_16_ + i_20_) * ground.width * 767658255 + i_15_;
					for (int i_22_ = 0; i_22_ < i_13_; i_22_++) {
						short[] is = ground.materialIndices[i_21_++];
						if (is != null) {
							for (short element : is) {
								buffer.writeShort(element & 0xffff);
							}
						}
					}
				}
			} else {
				for (int i_24_ = 0; i_24_ < i_13_; i_24_++) {
					int i_25_ = (i_16_ + i_24_) * ground.width * 767658255 + i_15_;
					for (int i_26_ = 0; i_26_ < i_13_; i_26_++) {
						short[] is = ground.materialIndices[i_25_++];
						if (is != null) {
							for (short element : is) {
								buffer.writeLEShort(element & 0xffff);
							}
						}
					}
				}
			}
			anInterface15_1274 = toolkit.createElementArrayBuffer(buffer.payload, buffer.offset * -165875887, false);
			aClass97_Sub1_1277 = new NativeOpenGlElementArrayBuffer(toolkit, null, 1);
		} else {
			aClass102_Sub1_1278 = null;
		}
	}

	void method1757() {
		method1759(anInterface15_1274, anInt1270);
	}

	void method1758(byte[] buffer, int i) {
		aClass97_Sub1_1277.write(buffer, i * 2);
		method1759(aClass97_Sub1_1277, i);
	}

	void method1759(ElementArrayBuffer buffer, int i) {
		if (i != 0) {
			method1760();
			toolkit.setActiveTexture(aClass102_Sub1_1278);
			toolkit.drawElements(buffer, 4, 0, i);
		}
	}

	void method1760() {
		if (aBool1275) {
			aBool1275 = false;
			byte[] is = aClass91_1276.map;
			byte[] is_0_ = toolkit.aByteArray9095;
			int i = 0;
			int i_1_ = aClass91_1276.width;
			int i_2_ = anInt1271 + anInt1272 * aClass91_1276.width;
			for (int i_3_ = -128; i_3_ < 0; i_3_++) {
				i = (i << 8) - i;
				for (int i_4_ = -128; i_4_ < 0; i_4_++) {
					if (is[i_2_++] != 0) {
						i++;
					}
				}
				i_2_ += i_1_ - 128;
			}
			if (aClass102_Sub1_1278 != null && anInt1269 == i) {
				aBool1275 = false;
			} else {
				anInt1269 = i;
				int i_5_ = 0;
				i_2_ = anInt1271 + anInt1272 * i_1_;
				for (int i_6_ = -128; i_6_ < 0; i_6_++) {
					for (int i_7_ = -128; i_7_ < 0; i_7_++) {
						if (is[i_2_] != 0) {
							is_0_[i_5_++] = (byte) 68;
						} else {
							int i_8_ = 0;
							if (is[i_2_ - 1] != 0) {
								i_8_++;
							}
							if (is[i_2_ + 1] != 0) {
								i_8_++;
							}
							if (is[i_2_ - i_1_] != 0) {
								i_8_++;
							}
							if (is[i_2_ + i_1_] != 0) {
								i_8_++;
							}
							is_0_[i_5_++] = (byte) (17 * i_8_);
						}
						i_2_++;
					}
					i_2_ += aClass91_1276.width - 128;
				}
				if (aClass102_Sub1_1278 == null) {
					aClass102_Sub1_1278 = new OpenGl2DTexture(toolkit, OpenGL.GL_TEXTURE_2D, Class121.aClass121_1460,
							Class151.aClass151_2, 128, 128, false, toolkit.aByteArray9095, Class121.aClass121_1460,
							false);
					aClass102_Sub1_1278.setRepeating(false, false);
					aClass102_Sub1_1278.filterLinear(true);
				} else {
					aClass102_Sub1_1278.copy(0, 0, 128, 128, toolkit.aByteArray9095, Class121.aClass121_1460, 0, 0,
							false);
				}
			}
		}
	}

}