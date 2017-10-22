package com.jagex;

import java.nio.ByteBuffer;

import sun.misc.Unsafe;

public class Class346 {
	int anInt3658;
	Class306 aClass306_3659 = Class306.aClass306_3315;
	Class306 aClass306_3660;
	int anInt3661 = 128;
	int anInt3662;
	float[] aFloatArray3663;
	int[] anIntArray3664;
	NativeToolkit toolkit;
	Native2DTexture[] anInterface29Array3666;
	NativeArrayBuffer anInterface32_3667;
	Class323 aClass323_3668;
	int[] anIntArray3669;
	NativeElementArrayBuffer anInterface36_3670;

	Class346(NativeToolkit toolkit, int i) {
		anInt3658 = 0;
		aFloatArray3663 = new float[anInt3661 * 16];
		anInterface29Array3666 = new Native2DTexture[anInt3661];
		anIntArray3664 = new int[anInt3661];
		anIntArray3669 = new int[4];
		this.toolkit = toolkit;
		anInterface32_3667 = toolkit.createArrayBuffer(true);
		anInterface32_3667.reallocate(i * 96, 24);
		aClass323_3668 = toolkit.method14696(new Class320(Class316.aClass316_3, Class316.aClass316_9,
				Class316.aClass316_2));
		anInterface36_3670 = toolkit.createElementArrayBuffer(false);
		int i_0_ = i * 6;
		anInterface36_3670.allocate(i_0_);
		int i_1_ = i_0_ * anInterface36_3670.method292().size * -172886387;
		ByteBuffer buffer = toolkit.aByteBuffer9279;
		toolkit.method14589(i_1_);
		buffer.clear();

		for (int i_2_ = 0; i_2_ < i; i_2_++) {
			buffer.putShort((short) (i_2_ * 4));
			buffer.putShort((short) (i_2_ * 4 + 2));
			buffer.putShort((short) (i_2_ * 4 + 1));
			buffer.putShort((short) (i_2_ * 4 + 2));
			buffer.putShort((short) (i_2_ * 4 + 3));
			buffer.putShort((short) (i_2_ * 4 + 1));
		}

		anInterface36_3670.read(0, i_0_ * anInterface36_3670.method292().size * -172886387, toolkit.aLong9268);
		anInt3662 = i;
		anInt3658 = 0;
	}

	void method5909() {
		anInterface32_3667.deleteImmediately();
		anInterface36_3670.deleteImmediately();
		anInterface32_3667 = null;
		anInterface36_3670 = null;
		aClass323_3668 = null;
		anInt3658 = 0;
	}

	void method5910(float x, float y, float maxWidth, float maxHeight, float f_6_, float f_7_, float f_8_, float f_9_,
			Native2DTexture texture, int i) {
		if ((i & ~0xffffff) != 0) {
			toolkit.method2425(anIntArray3669);
			int i_10_ = anIntArray3669[0];
			int i_11_ = anIntArray3669[1];
			int i_12_ = anIntArray3669[2];
			int i_13_ = anIntArray3669[3];

			if (!(x > i_12_) && !(y > i_13_) && !(maxWidth < i_10_) && !(maxHeight < i_11_)) {
				float dx = maxWidth - x;
				float dy = maxHeight - y;
				float f_16_ = f_8_ - f_6_;
				float f_17_ = f_9_ - f_7_;

				if (x < i_10_) {
					f_6_ += (i_10_ - x) / dx * f_16_;
					x = i_10_;
				}

				if (y < i_11_) {
					f_7_ += (i_11_ - y) / dy * f_17_;
					y = i_11_;
				}

				if (maxWidth > i_12_) {
					f_8_ -= (maxWidth - i_12_) / dx * f_16_;
					maxWidth = i_12_;
				}

				if (maxHeight > i_13_) {
					f_9_ -= (maxHeight - i_13_) / dy * f_17_;
					maxHeight = i_13_;
				}

				method5912();
				x = method5913(x);
				y = method5935(y);
				maxWidth = method5913(maxWidth);
				maxHeight = method5935(maxHeight);

				aFloatArray3663[anInt3658 * 16 + 0] = x;
				aFloatArray3663[anInt3658 * 16 + 1] = y;
				aFloatArray3663[anInt3658 * 16 + 2] = f_6_;
				aFloatArray3663[anInt3658 * 16 + 3] = f_7_;
				aFloatArray3663[anInt3658 * 16 + 4] = maxWidth;
				aFloatArray3663[anInt3658 * 16 + 5] = y;
				aFloatArray3663[anInt3658 * 16 + 6] = f_8_;
				aFloatArray3663[anInt3658 * 16 + 7] = f_7_;
				aFloatArray3663[anInt3658 * 16 + 8] = x;
				aFloatArray3663[anInt3658 * 16 + 9] = maxHeight;
				aFloatArray3663[anInt3658 * 16 + 10] = f_6_;
				aFloatArray3663[anInt3658 * 16 + 11] = f_9_;
				aFloatArray3663[anInt3658 * 16 + 12] = maxWidth;
				aFloatArray3663[anInt3658 * 16 + 13] = maxHeight;
				aFloatArray3663[anInt3658 * 16 + 14] = f_8_;
				aFloatArray3663[anInt3658 * 16 + 15] = f_9_;
				anInterface29Array3666[anInt3658] = texture;

				if (toolkit.endianness == 1) {
					anIntArray3664[anInt3658] = ~0xff00ff & i | (i & 0xff) << 16 | i >> 16 & 0xff;
				} else {
					anIntArray3664[anInt3658] = i;
				}

				anInt3658++;
				if (aClass306_3659 == Class306.aClass306_3314) {
					method5939();
				}
			}
		}
	}

	void method5911(float f, float f_18_, float f_19_, float f_20_, float f_21_, float f_22_, float f_23_, float f_24_,
			float f_25_, float f_26_, float f_27_, float f_28_, float f_29_, float f_30_, float f_31_, float f_32_,
			Native2DTexture interface29, int i) {
		if ((i & ~0xffffff) != 0) {
			toolkit.method2425(anIntArray3669);
			int i_33_ = anIntArray3669[0];
			int i_34_ = anIntArray3669[1];
			int i_35_ = anIntArray3669[2];
			int i_36_ = anIntArray3669[3];
			int i_37_ = 0;
			int i_38_ = (f < i_33_ ? 1 : 0) + (f_19_ < i_33_ ? 1 : 0) + (f_21_ < i_33_ ? 1 : 0)
					+ (f_23_ < i_33_ ? 1 : 0);

			if (i_38_ != 4) {
				i_37_ |= i_38_;
				i_38_ = (f > i_35_ ? 1 : 0) + (f_19_ > i_35_ ? 1 : 0) + (f_21_ > i_35_ ? 1 : 0)
						+ (f_23_ > i_35_ ? 1 : 0);

				if (i_38_ != 4) {
					i_37_ |= i_38_;
					i_38_ = (f_18_ < i_34_ ? 1 : 0) + (f_20_ < i_34_ ? 1 : 0) + (f_22_ < i_34_ ? 1 : 0)
							+ (f_24_ < i_34_ ? 1 : 0);

					if (i_38_ != 4) {
						i_37_ |= i_38_;
						i_38_ = (f_18_ > i_36_ ? 1 : 0) + (f_20_ > i_36_ ? 1 : 0) + (f_22_ > i_36_ ? 1 : 0)
								+ (f_24_ > i_36_ ? 1 : 0);

						if (i_38_ != 4) {
							i_37_ |= i_38_;

							if (i_37_ != 0) {
								method5939();
								toolkit.method2419(true);
								toolkit.method2760(i_33_, i_34_, i_35_, i_36_);
							}

							method5912();
							f = method5913(f);
							f_18_ = method5935(f_18_);
							f_19_ = method5913(f_19_);
							f_20_ = method5935(f_20_);
							f_21_ = method5913(f_21_);
							f_22_ = method5935(f_22_);
							f_23_ = method5913(f_23_);
							f_24_ = method5935(f_24_);

							aFloatArray3663[anInt3658 * 16 + 0] = f;
							aFloatArray3663[anInt3658 * 16 + 1] = f_18_;
							aFloatArray3663[anInt3658 * 16 + 2] = f_25_;
							aFloatArray3663[anInt3658 * 16 + 3] = f_26_;
							aFloatArray3663[anInt3658 * 16 + 4] = f_19_;
							aFloatArray3663[anInt3658 * 16 + 5] = f_20_;
							aFloatArray3663[anInt3658 * 16 + 6] = f_27_;
							aFloatArray3663[anInt3658 * 16 + 7] = f_28_;
							aFloatArray3663[anInt3658 * 16 + 8] = f_21_;
							aFloatArray3663[anInt3658 * 16 + 9] = f_22_;
							aFloatArray3663[anInt3658 * 16 + 10] = f_29_;
							aFloatArray3663[anInt3658 * 16 + 11] = f_30_;
							aFloatArray3663[anInt3658 * 16 + 12] = f_23_;
							aFloatArray3663[anInt3658 * 16 + 13] = f_24_;
							aFloatArray3663[anInt3658 * 16 + 14] = f_31_;
							aFloatArray3663[anInt3658 * 16 + 15] = f_32_;
							anInterface29Array3666[anInt3658] = interface29;

							if (toolkit.endianness == 1) {
								anIntArray3664[anInt3658] = ~0xff00ff & i | (i & 0xff) << 16 | i >> 16 & 0xff;
							} else {
								anIntArray3664[anInt3658] = i;
							}

							anInt3658++;
							if (aClass306_3659 == Class306.aClass306_3314 || i_37_ > 0) {
								method5939();
							}

							if (i_37_ != 0) {
								toolkit.method2419(false);
								toolkit.method2421();
								toolkit.method2760(i_33_, i_34_, i_35_, i_36_);
							}
						}
					}
				}
			}
		}
	}

	void method5912() {
		if (anInt3658 == anInt3661) {
			anInt3661 *= 2;
			float[] fs = new float[anInt3661 * 16];
			for (int i = 0; i < anInt3658 * 16; i++) {
				fs[i] = aFloatArray3663[i];
			}

			aFloatArray3663 = fs;
			Native2DTexture[] textures = new Native2DTexture[anInt3661];
			int[] is = new int[anInt3661];

			for (int i = 0; i < anInt3658; i++) {
				textures[i] = anInterface29Array3666[i];
				is[i] = anIntArray3664[i];
			}

			anInterface29Array3666 = textures;
			anIntArray3664 = is;
		}
	}

	float method5913(float f) {
		int width = toolkit.method2628().getWidth();
		return (f + toolkit.method14608()) / width * 2.0F - 1.0F;
	}

	void method5915() {
		aClass306_3660 = aClass306_3659;
		aClass306_3659 = Class306.aClass306_3313;
	}

	Class306 method5917() {
		return aClass306_3659;
	}

	float method5935(float f) {
		int height = toolkit.method2628().getHeight();
		return (1.0F - (f + toolkit.method14608()) / height) * 2.0F - 1.0F;
	}

	void method5936() {
		if (aClass306_3660 != null) {
			aClass306_3659 = aClass306_3660;
			aClass306_3660 = null;
		}
	}

	void method5939() {
		if (anInt3658 != 0) {
			toolkit.method14709();
			toolkit.method14893(1);
			toolkit.method14748(anInterface36_3670);
			toolkit.method14620(0, anInterface32_3667);
			toolkit.method14697(aClass323_3668);

			Class298 class298 = toolkit.aClass298_9371;
			Unsafe unsafe = toolkit.unsafe;
			ByteBuffer buffer = toolkit.aByteBuffer9279;
			buffer.clear();

			toolkit.method14676().copyFrom(Matrix4f.aClass399_4530);
			toolkit.method14648(Class336.aClass336_3611);

			int i = (anInt3658 + anInt3662 - 1) / anInt3662;
			int i_41_ = 0;
			int i_42_ = 0;

			for (int i_43_ = 0; i_43_ < i; i_43_++) {
				int i_44_ = Math.min(anInt3662, anInt3658 - i_41_);
				long l = anInterface32_3667.lock(0, i_44_ * 96);
				int i_45_ = i_43_ * anInt3662 + i_44_;

				for (int i_46_ = i_41_; i_46_ < i_45_; i_46_++) {
					for (int i_47_ = 0; i_47_ < 4; i_47_++) {
						unsafe.putFloat(l, aFloatArray3663[i_42_++]);
						l += 4L;
						unsafe.putFloat(l, aFloatArray3663[i_42_++]);
						l += 4L;

						unsafe.putFloat(l, 0.0F);
						l += 4L;
						unsafe.putFloat(l, aFloatArray3663[i_42_++]);
						l += 4L;

						unsafe.putFloat(l, aFloatArray3663[i_42_++]);
						l += 4L;
						unsafe.putInt(l, anIntArray3664[i_46_]);
						l += 4L;
					}
				}

				anInterface32_3667.unmap();
				Native2DTexture texture = anInterface29Array3666[i_41_];
				int i_48_ = 1;
				int i_49_ = 0;

				for (int i_50_ = i_41_ + 1; i_50_ < i_45_; i_50_++) {
					if (texture == anInterface29Array3666[i_50_]) {
						i_48_++;
					} else {
						class298.texture = texture;
						class298.method5444();
						toolkit.method14977(anInterface36_3670, Class333.aClass333_3597, i_49_ * 4, i_48_ * 4,
								i_49_ * 6, i_48_ * 2);

						texture = anInterface29Array3666[i_50_];
						i_48_ = 1;
						i_49_ = i_50_ - i_41_;
					}
				}

				class298.texture = texture;
				class298.method5444();

				toolkit.method14977(anInterface36_3670, Class333.aClass333_3597, i_49_ * 4, i_48_ * 4, i_49_ * 6,
						i_48_ * 2);
				i_41_ += anInt3662;
			}

			anInt3658 = 0;
		}
	}

}