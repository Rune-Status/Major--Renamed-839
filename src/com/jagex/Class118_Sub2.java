package com.jagex;

public class Class118_Sub2 extends Class118 {
	NativeToolkit toolkit;
	NativeTexture texture;

	Class118_Sub2(NativeToolkit toolkit, int[] argb) {
		this.toolkit = toolkit;

		if (toolkit.threeDimensional) {
			byte[] data = flatten(argb);
			texture = toolkit.create3DTexture(Class121.aClass121_1465, 16, 16, 16, false, data);
		} else {
			texture = toolkit.create2DTexture(256, 16, false, argb);
		}
	}

	public NativeTexture getTexture() {
		return texture;
	}

	byte[] flatten(int[] argb) {
		byte[] cube = new byte[16384];

		for (int i = 0; i < 16; i++) {
			for (int i_1_ = 0; i_1_ < 16; i_1_++) {
				for (int i_2_ = 0; i_2_ < 16; i_2_++) {
					int colour = argb[256 * i_1_ + 16 * i_2_ + i];
					int index = (i_2_ * 256 + i_1_ * 16 + i) * 4;

					if (toolkit.endianness == 0) {
						cube[index + 0] = (byte) (colour & 0xff);
						cube[index + 1] = (byte) (colour >> 8 & 0xff);
						cube[index + 2] = (byte) (colour >> 16 & 0xff);
						cube[index + 3] = (byte) -1;
					} else {
						cube[index + 0] = (byte) (colour >> 16 & 0xff);
						cube[index + 1] = (byte) (colour >> 8 & 0xff);
						cube[index + 2] = (byte) (colour & 0xff);
						cube[index + 3] = (byte) -1;
					}
				}
			}
		}

		return cube;
	}

}