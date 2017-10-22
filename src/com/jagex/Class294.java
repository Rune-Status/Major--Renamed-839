package com.jagex;

public class Class294 {
	static Object anObject3256;
	static final int anInt3257 = 128;
	static final int anInt3263 = 128;
	public static final int anInt3266 = 16;
	static Object anObject3267;
	static Object anObject3268;

	static void method5408() {
		if (anObject3256 == null) {
			Class382_Sub2_Sub2 class382_sub2_sub2 = new Class382_Sub2_Sub2();
			byte[] is = class382_sub2_sub2.method17562(128, 128, 16);
			anObject3256 = Archive.wrap(is, false);
		}
		if (anObject3267 == null) {
			Class382_Sub1_Sub2 class382_sub1_sub2 = new Class382_Sub1_Sub2();
			byte[] is = class382_sub1_sub2.method17521(128, 128, 16);
			anObject3267 = Archive.wrap(is, false);
		}
	}

	public Native2DTexture[] anInterface29Array3258;
	NativeToolkit toolkit;
	public boolean threeDimensional;
	Native2DTexture[] anInterface29Array3261 = null;
	Native3DTexture anInterface30_3262 = null;
	public Native3DTexture anInterface30_3264;

	public Native3DTexture anInterface30_3265;

	Class294(NativeToolkit toolkit) {
		anInterface29Array3258 = null;
		anInterface30_3264 = null;
		anInterface30_3265 = null;
		this.toolkit = toolkit;
		threeDimensional = toolkit.threeDimensional;
		if (threeDimensional && !toolkit.aBool9414) {
			threeDimensional = false;
		}

		if (threeDimensional && !toolkit.method14656(Class121.aClass121_1462, Class151.aClass151_2)) {
			threeDimensional = false;
		}

		if (threeDimensional || toolkit.method14655(Class121.aClass121_1462, Class151.aClass151_2)) {
			method5408();
			if (!threeDimensional) {
				anInterface29Array3261 = new Native2DTexture[16];
				for (int i = 0; i < 16; i++) {
					byte[] is = Archive.unwrap(anObject3256, i * 32768, 32768);
					anInterface29Array3261[i] = toolkit.create2DTexture(Class121.aClass121_1462, 128, 128, true, is);
				}
				anInterface29Array3258 = new Native2DTexture[16];
				for (int i = 0; i < 16; i++) {
					byte[] is = Archive.unwrap(anObject3267, i * 32768, 32768);
					anInterface29Array3258[i] = toolkit.create2DTexture(Class121.aClass121_1462, 128, 128, true, is);
				}
			} else {
				byte[] is = Archive.unwrap(anObject3256, false);
				anInterface30_3262 = toolkit.create3DTexture(Class121.aClass121_1462, 128, 128, 16, true, is);
				is = Archive.unwrap(anObject3267, false);
				anInterface30_3264 = toolkit.create3DTexture(Class121.aClass121_1462, 128, 128, 16, true, is);
			}
		}
	}

	public boolean method5406() {
		return threeDimensional ? anInterface30_3262 != null : anInterface29Array3261 != null;
	}

	public boolean method5413() {
		if (!toolkit.threeDimensional) {
			return false;
		}

		if (anInterface30_3265 == null) {
			if (anObject3268 == null) {
				byte[] is = Class476.method8139(128, 128, 16, 8, new Class484_Sub1(419684), 4.0F, 4.0F, 16.0F, 0.5F,
						0.6F);
				anObject3268 = Archive.wrap(is, false);
			}

			byte[] unwrapped = Archive.unwrap(anObject3268, false);
			byte[] data = new byte[unwrapped.length * 4];
			int dest = 0;

			for (int i_1_ = 0; i_1_ < 16; i_1_++) {
				int source = i_1_ * 16384;
				int i_3_ = source;

				for (int i_4_ = 0; i_4_ < 128; i_4_++) {
					int i_5_ = i_3_ + i_4_ * 128;
					int i_6_ = i_3_ + (i_4_ - 1 & 0x7f) * 128;
					int i_7_ = i_3_ + (i_4_ + 1 & 0x7f) * 128;
					for (int i_8_ = 0; i_8_ < 128; i_8_++) {
						float f = (unwrapped[i_6_ + i_8_] & 0xff) - (unwrapped[i_7_ + i_8_] & 0xff);
						float f_9_ = (unwrapped[i_5_ + (i_8_ - 1 & 0x7f)] & 0xff) - (unwrapped[i_5_ + (i_8_ + 1 & 0x7f)] & 0xff);
						float f_10_ = (float) (128.0 / Math.sqrt(f_9_ * f_9_ + 16384.0F + f * f));
						data[dest++] = (byte) (int) (f_9_ * f_10_ + 127.0F);
						data[dest++] = (byte) (int) (128.0F * f_10_ + 127.0F);
						data[dest++] = (byte) (int) (f * f_10_ + 127.0F);
						data[dest++] = unwrapped[source++];
					}
				}
			}

			anInterface30_3265 = toolkit.create3DTexture(Class121.aClass121_1465, 128, 128, 16, true, data);
		}

		return anInterface30_3265 != null;
	}

}