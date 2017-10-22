package com.jagex;

import java.nio.ByteBuffer;

public class Class319 {
	static float aFloat3409;
	PointEntity[][] aClass477_Sub4_Sub1ArrayArray3395;
	int anInt3396 = 1600;
	Class323 aClass323_3397;
	int anInt3398;
	int anInt3399 = 64;
	int anInt3400 = 768;
	int[] anIntArray3401;
	int anInt3402;
	int anInt3403 = 64;
	int[] anIntArray3404;
	NativeArrayBuffer anInterface32_3405;
	int[] anIntArray3406;
	NativeElementArrayBuffer anInterface36_3407;
	NativeArrayBuffer anInterface32_3408;
	PointEntity[][] aClass477_Sub4_Sub1ArrayArray3410;

	Class319(NativeToolkit toolkit) {
		anInt3396 = 1600;
		anInt3402 = LatencyMonitor.method1059(1600);
		anInt3403 = 64;
		anIntArray3404 = new int[8191];
		anIntArray3401 = new int[1600];
		anIntArray3406 = new int[64];
		aClass477_Sub4_Sub1ArrayArray3395 = new PointEntity[1600][64];
		aClass477_Sub4_Sub1ArrayArray3410 = new PointEntity[64][768];
		anInt3398 = 0;
		aClass323_3397 = toolkit.method14696(new Class320(Class316.aClass316_3, Class316.aClass316_2,
				Class316.aClass316_9), new Class320(Class316.aClass316_1));
		anInterface32_3408 = toolkit.createArrayBuffer(true);
		anInterface32_3405 = toolkit.createArrayBuffer(false);
		anInterface32_3405.reallocate(393168, 12);
		anInterface36_3407 = toolkit.createElementArrayBuffer(false);
		anInterface36_3407.allocate(49146);
		ByteBuffer buffer = toolkit.aByteBuffer9279;

		buffer.clear();
		for (int i = 0; i < 8191; i++) {
			int i_0_ = i * 4;
			buffer.putShort((short) i_0_);
			buffer.putShort((short) (i_0_ + 1));
			buffer.putShort((short) (i_0_ + 2));
			buffer.putShort((short) (i_0_ + 2));
			buffer.putShort((short) (i_0_ + 3));
			buffer.putShort((short) i_0_);
		}

		anInterface36_3407.read(0, buffer.position(), toolkit.aLong9268);
		buffer.clear();

		for (int i = 0; i < 8191; i++) {
			buffer.putFloat(0.0F);
			buffer.putFloat(-1.0F);
			buffer.putFloat(0.0F);
			buffer.putFloat(0.0F);
			buffer.putFloat(-1.0F);
			buffer.putFloat(0.0F);
			buffer.putFloat(0.0F);
			buffer.putFloat(-1.0F);
			buffer.putFloat(0.0F);
			buffer.putFloat(0.0F);
			buffer.putFloat(-1.0F);
			buffer.putFloat(0.0F);
		}

		anInterface32_3405.read(0, buffer.position(), toolkit.aLong9268);
	}

	void method5712() {
		anInterface32_3408.deleteImmediately();
	}

	void method5714(NativeToolkit toolkit) {
		anInterface32_3408.reallocate(786336, 24);
	}

	void method5715(int i, PointEntity entity) {
		if (i < 1600) {
			if (anIntArray3401[i] < 64) {
				aClass477_Sub4_Sub1ArrayArray3395[i][anIntArray3401[i]++] = entity;
			} else {
				if (anIntArray3401[i] == 64) {
					if (anInt3398 == 64) {
						return;
					}

					anIntArray3401[i] += 1 + anInt3398++;
				}

				aClass477_Sub4_Sub1ArrayArray3410[anIntArray3401[i] - 64 - 1][anIntArray3406[anIntArray3401[i] - 64 - 1]++] = entity;
			}
		}
	}

	void method5716(NativeToolkit toolkit, int i, boolean bool) {
		int i_1_ = 0;
		Matrix4f matrix = toolkit.aClass399_9281;
		float f = matrix.array[0];
		float f_2_ = matrix.array[4];
		float f_3_ = matrix.array[8];
		float f_4_ = matrix.array[1];
		float f_5_ = matrix.array[5];
		float f_6_ = matrix.array[9];
		float f_7_ = f + f_4_;
		float f_8_ = f_2_ + f_5_;
		float f_9_ = f_3_ + f_6_;
		float f_10_ = f - f_4_;
		float f_11_ = f_2_ - f_5_;
		float f_12_ = f_3_ - f_6_;
		float f_13_ = f_4_ - f;
		float f_14_ = f_5_ - f_2_;
		float f_15_ = f_6_ - f_3_;
		float[] fs = new float[3];
		float[] fs_16_ = new float[3];
		toolkit.aClass399_9324.method6545(toolkit.aClass399_9323);
		ByteBuffer buffer = toolkit.aByteBuffer9279;
		buffer.clear();

		for (int i_17_ = i - 1; i_17_ >= 0; i_17_--) {
			int i_18_ = anIntArray3401[i_17_] > 64 ? 64 : anIntArray3401[i_17_];

			if (i_18_ > 0) {
				for (int i_19_ = i_18_ - 1; i_19_ >= 0; i_19_--) {
					PointEntity entity = aClass477_Sub4_Sub1ArrayArray3395[i_17_][i_19_];
					int colour = entity.colour;

					byte red = (byte) (colour >> 16);
					byte green = (byte) (colour >> 8);
					byte blue = (byte) colour;
					byte alpha = (byte) (colour >>> 24);

					if (toolkit.endianness == 0) {
						byte tmp = red;
						red = blue;
						blue = tmp;
					}

					float x = entity.x >> 12;
					float z = entity.z >> 12;
					float y = entity.y >> 12;
					int size = entity.size >> 12;

					if (entity.rotation != 0) {
						toolkit.aClass399_9289.method6577(entity.rotation, size, size, 0.0F, 0.0F, 0.0F);
						toolkit.aClass399_9289.method6547(toolkit.aClass399_9324);
						toolkit.aClass399_9289.method6553(1.0F, 0.0F, 0.0F, fs);
						toolkit.aClass399_9289.method6553(0.0F, 1.0F, 0.0F, fs_16_);
						buffer.putFloat(x - fs[0] - fs_16_[0]);
						buffer.putFloat(z - fs[1] - fs_16_[1]);
						buffer.putFloat(y - fs[2] - fs_16_[2]);
						buffer.put(red);
						buffer.put(green);
						buffer.put(blue);
						buffer.put(alpha);
						buffer.putFloat(0.0F);
						buffer.putFloat(0.0F);
						buffer.putFloat(x - fs[0] + fs_16_[0]);
						buffer.putFloat(z - fs[1] + fs_16_[1]);
						buffer.putFloat(y - fs[2] + fs_16_[2]);
						buffer.put(red);
						buffer.put(green);
						buffer.put(blue);
						buffer.put(alpha);
						buffer.putFloat(0.0F);
						buffer.putFloat(1.0F);
						buffer.putFloat(x + fs[0] + fs_16_[0]);
						buffer.putFloat(z + fs[1] + fs_16_[1]);
						buffer.putFloat(y + fs[2] + fs_16_[2]);
						buffer.put(red);
						buffer.put(green);
						buffer.put(blue);
						buffer.put(alpha);
						buffer.putFloat(1.0F);
						buffer.putFloat(1.0F);
						buffer.putFloat(x + fs[0] - fs_16_[0]);
						buffer.putFloat(z + fs[1] - fs_16_[1]);
						buffer.putFloat(y + fs[2] - fs_16_[2]);
						buffer.put(red);
						buffer.put(green);
						buffer.put(blue);
						buffer.put(alpha);
						buffer.putFloat(1.0F);
						buffer.putFloat(0.0F);
					} else {
						buffer.putFloat(x + f_7_ * -size);
						buffer.putFloat(z + f_8_ * -size);
						buffer.putFloat(y + f_9_ * -size);
						buffer.put(red);
						buffer.put(green);
						buffer.put(blue);
						buffer.put(alpha);
						buffer.putFloat(0.0F);
						buffer.putFloat(0.0F);
						buffer.putFloat(x + f_13_ * size);
						buffer.putFloat(z + f_14_ * size);
						buffer.putFloat(y + f_15_ * size);
						buffer.put(red);
						buffer.put(green);
						buffer.put(blue);
						buffer.put(alpha);
						buffer.putFloat(0.0F);
						buffer.putFloat(1.0F);
						buffer.putFloat(x + f_7_ * size);
						buffer.putFloat(z + f_8_ * size);
						buffer.putFloat(y + f_9_ * size);
						buffer.put(red);
						buffer.put(green);
						buffer.put(blue);
						buffer.put(alpha);
						buffer.putFloat(1.0F);
						buffer.putFloat(1.0F);
						buffer.putFloat(x + f_10_ * size);
						buffer.putFloat(z + f_11_ * size);
						buffer.putFloat(y + f_12_ * size);
						buffer.put(red);
						buffer.put(green);
						buffer.put(blue);
						buffer.put(alpha);
						buffer.putFloat(1.0F);
						buffer.putFloat(0.0F);
					}

					i_1_++;
				}

				if (anIntArray3401[i_17_] > 64) {
					int i_30_ = anIntArray3401[i_17_] - 64 - 1;
					for (int i_31_ = anIntArray3406[i_30_] - 1; i_31_ >= 0; i_31_--) {
						PointEntity entity = aClass477_Sub4_Sub1ArrayArray3410[i_30_][i_31_];
						int colour = entity.colour;
						byte red = (byte) (colour >> 16);
						byte green = (byte) (colour >> 8);
						byte blue = (byte) colour;
						byte alpha = (byte) (colour >>> 24);

						float x = entity.x >> 12;
						float z = entity.z >> 12;
						float y = entity.y >> 12;
						int size = entity.size >> 12;

						if (toolkit.endianness == 0) {
							byte temp = red;
							red = blue;
							blue = temp;
						}

						if (entity.rotation != 0) {
							toolkit.aClass399_9289.method6577(entity.rotation, size, size, 0.0F, 0.0F, 0.0F);
							toolkit.aClass399_9289.method6547(toolkit.aClass399_9324);
							toolkit.aClass399_9289.method6553(1.0F, 0.0F, 0.0F, fs);
							toolkit.aClass399_9289.method6553(0.0F, 1.0F, 0.0F, fs_16_);
							buffer.putFloat(x - fs[0] - fs_16_[0]);
							buffer.putFloat(z - fs[1] - fs_16_[1]);
							buffer.putFloat(y - fs[2] - fs_16_[2]);
							buffer.put(red);
							buffer.put(green);
							buffer.put(blue);
							buffer.put(alpha);
							buffer.putFloat(0.0F);
							buffer.putFloat(0.0F);
							buffer.putFloat(x - fs[0] + fs_16_[0]);
							buffer.putFloat(z - fs[1] + fs_16_[1]);
							buffer.putFloat(y - fs[2] + fs_16_[2]);
							buffer.put(red);
							buffer.put(green);
							buffer.put(blue);
							buffer.put(alpha);
							buffer.putFloat(0.0F);
							buffer.putFloat(1.0F);
							buffer.putFloat(x + fs[0] + fs_16_[0]);
							buffer.putFloat(z + fs[1] + fs_16_[1]);
							buffer.putFloat(y + fs[2] + fs_16_[2]);
							buffer.put(red);
							buffer.put(green);
							buffer.put(blue);
							buffer.put(alpha);
							buffer.putFloat(1.0F);
							buffer.putFloat(1.0F);
							buffer.putFloat(x + fs[0] - fs_16_[0]);
							buffer.putFloat(z + fs[1] - fs_16_[1]);
							buffer.putFloat(y + fs[2] - fs_16_[2]);
							buffer.put(red);
							buffer.put(green);
							buffer.put(blue);
							buffer.put(alpha);
							buffer.putFloat(1.0F);
							buffer.putFloat(0.0F);
						} else {
							buffer.putFloat(x + f_7_ * -size);
							buffer.putFloat(z + f_8_ * -size);
							buffer.putFloat(y + f_9_ * -size);
							buffer.put(red);
							buffer.put(green);
							buffer.put(blue);
							buffer.put(alpha);
							buffer.putFloat(0.0F);
							buffer.putFloat(0.0F);
							buffer.putFloat(x + f_13_ * size);
							buffer.putFloat(z + f_14_ * size);
							buffer.putFloat(y + f_15_ * size);
							buffer.put(red);
							buffer.put(green);
							buffer.put(blue);
							buffer.put(alpha);
							buffer.putFloat(0.0F);
							buffer.putFloat(1.0F);
							buffer.putFloat(x + f_7_ * size);
							buffer.putFloat(z + f_8_ * size);
							buffer.putFloat(y + f_9_ * size);
							buffer.put(red);
							buffer.put(green);
							buffer.put(blue);
							buffer.put(alpha);
							buffer.putFloat(1.0F);
							buffer.putFloat(1.0F);
							buffer.putFloat(x + f_10_ * size);
							buffer.putFloat(z + f_11_ * size);
							buffer.putFloat(y + f_12_ * size);
							buffer.put(red);
							buffer.put(green);
							buffer.put(blue);
							buffer.put(alpha);
							buffer.putFloat(1.0F);
							buffer.putFloat(0.0F);
						}

						i_1_++;
					}
				}
			}
		}

		anInterface32_3408.read(0, buffer.position(), toolkit.aLong9268);
		toolkit.method14620(0, anInterface32_3408);
		toolkit.method14620(1, anInterface32_3405);
		toolkit.method14697(aClass323_3397);
		Class290 class290 = toolkit.aClass290_9426;
		class290.method5377(i_1_, bool);
	}

	void method5723(NativeToolkit toolkit, Class137 class137) {
		toolkit.method2473(false);
		aFloat3409 = toolkit.aFloat9331;

		float f = toolkit.aClass399_9281.array[2];
		float f_42_ = toolkit.aClass399_9281.array[6];
		float f_43_ = toolkit.aClass399_9281.array[10];
		float f_44_ = toolkit.aClass399_9281.array[14];
		int i = 0;

		int i_45_ = 2147483647;
		int i_46_ = 0;

		CacheableEntity cacheable = class137.entities.tail;
		for (CacheableEntity next = cacheable.nextCacheable; next != cacheable; next = next.nextCacheable) {
			PointEntity entity = (PointEntity) next;
			int i_48_ = (int) (f * (entity.x >> 12) + f_42_ * (entity.z >> 12) + f_43_ * (entity.y >> 12) + f_44_);

			if (i_48_ > i_46_) {
				i_46_ = i_48_;
			}

			if (i_48_ < i_45_) {
				i_45_ = i_48_;
			}

			anIntArray3404[i++] = i_48_;
		}

		int i_49_ = i_46_ - i_45_;
		int i_50_;

		if (i_49_ + 2 > 1600) {
			i_50_ = 1 + LatencyMonitor.method1059(i_49_) - anInt3402;
			i_49_ = (i_49_ >> i_50_) + 2;
		} else {
			i_50_ = 0;
			i_49_ += 2;
		}

		toolkit.method14748(anInterface36_3407);
		Class290 class290 = toolkit.aClass290_9426;
		class290.method5378(Matrix4f.aClass399_4530);
		class290.aClass399_3234.toIdentity();
		class290.anInt3233 = -1;
		boolean bool = toolkit.anInt9390 > 0;

		if (bool) {
			class290.aClass375_3231.set(0.0F, 0.0F, 1.0F, -toolkit.aFloat9392);
			class290.aClass397_3232.set((toolkit.anInt9293 >> 16 & 0xff) / 255.0F,
					(toolkit.anInt9293 >> 8 & 0xff) / 255.0F, (toolkit.anInt9293 >> 0 & 0xff) / 255.0F);
			class290.aClass375_3231.method6163(toolkit.aClass399_9283);
			class290.aClass375_3231.multiply(1.0F / (toolkit.aFloat9393 - toolkit.aFloat9392));
		} else {
			class290.aClass375_3231.set(0.0F, 0.0F, 0.0F, 0.0F);
			class290.aClass397_3232.set(0.0F, 0.0F, 0.0F);
		}

		method5726(toolkit, cacheable, i_49_, i_45_, i_50_, class290, bool);
		if (toolkit.aFloat9331 != aFloat3409) {
			toolkit.method2476(aFloat3409);
		}

		toolkit.method2473(true);
	}

	void method5726(NativeToolkit toolkit, CacheableEntity entity, int i, int i_51_, int i_52_, Class290 class290,
			boolean bool) {
		CacheableEntity next = entity.nextCacheable;
		int i_54_ = 0;
		int texture = -2;
		boolean bool_56_ = true;
		boolean bool_57_ = true;

		while (next != entity) {
			anInt3398 = 0;
			for (int i_58_ = 0; i_58_ < i; i_58_++) {
				anIntArray3401[i_58_] = 0;
			}

			for (int i_59_ = 0; i_59_ < 64; i_59_++) {
				anIntArray3406[i_59_] = 0;
			}

			for (; next != entity; next = next.nextCacheable) {
				PointEntity point = (PointEntity) next;
				if (bool_57_) {
					texture = point.texture;
					bool_56_ = point.aBool11252;
					bool_57_ = false;
				}

				if (i_54_ > 0 && (texture != point.texture || bool_56_ != point.aBool11252)) {
					bool_57_ = true;
					break;
				}

				method5715(anIntArray3404[i_54_++] - i_51_ >> i_52_, point);
			}

			class290.texture = null;
			if (texture >= 0) {
				TextureMetrics metrics = toolkit.metricsList.get(texture);
				if (metrics.aBool1698) {
					class290.texture = toolkit.aClass321_9360.get(metrics);
				}

				byte i_60_ = 0;
				if (metrics.aClass554_1727 == Class554.aClass554_7501) {
					i_60_ = metrics.aByte1711;
				}

				toolkit.method14685(i_60_);
			}

			if (bool_56_ && toolkit.aFloat9331 != aFloat3409) {
				toolkit.method2476(aFloat3409);
			} else if (toolkit.aFloat9331 != 1.0F) {
				toolkit.method2476(1.0F);
			}

			method5716(toolkit, i, bool);
		}
	}

}