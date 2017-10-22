package com.jagex;

import java.awt.image.BufferedImage;

public class Class480_Sub32 extends Linkable {

	public static int[] getArgb(BufferedImage image) {
		if (image.getType() == BufferedImage.TYPE_BYTE_GRAY || image.getType() == BufferedImage.TYPE_CUSTOM) {
			int[] raster = null;
			raster = image.getRaster().getPixels(0, 0, image.getWidth(), image.getHeight(), raster);
			int[] copy = new int[image.getWidth() * image.getHeight()];

			if (image.getType() == BufferedImage.TYPE_BYTE_GRAY) {
				for (int index = 0; index < copy.length; index++) {
					copy[index] = -16777216 + (raster[index] << 16) + (raster[index] << 8) + raster[index];
				}
			} else {
				for (int index = 0; index < copy.length; index++) {
					int offset = index * 2;
					copy[index] = (raster[offset + 1] << 24) + raster[offset] + (raster[offset] << 8)
							+ (raster[offset] << 16);
				}
			}

			return copy;
		}

		return image.getRGB(0, 0, image.getWidth(), image.getHeight(), null, 0, image.getWidth());
	}

	int anInt10216;
	int anInt10217;
	int anInt10218;
	int anInt10219;
	int anInt10220;
	int anInt10221;
	int anInt10222;
	int anInt10223;
	int anInt10224;

	Class480_Sub32(int i, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_) {
		anInt10220 = i * 707410391;
		anInt10221 = -456013501 * i_5_;
		anInt10218 = 2037931041 * i_6_;
		anInt10219 = i_7_ * -1598497311;
		anInt10222 = -1065752455 * i_8_;
		anInt10217 = 1632466089 * i_9_;
		anInt10216 = -1495352741 * i_10_;
		anInt10223 = i_11_ * 99806947;
		anInt10224 = i_12_ * 842135605;
	}

	boolean method16053(int i, int i_0_) {
		return i >= -31428711 * anInt10217 && i <= 1347667659 * anInt10223 && i_0_ >= anInt10216 * 276555219
				&& i_0_ <= anInt10224 * -1815373283;
	}

	boolean method16054(int i, int i_2_, int i_3_) {
		return i >= -538654233 * anInt10220 && i_2_ >= 1752763243 * anInt10221 && i_2_ <= -1497618911 * anInt10219
				&& i_3_ >= 829302753 * anInt10218 && i_3_ <= -1050672695 * anInt10222;
	}

	void method16056(int i, int i_13_, int[] is) {
		is[0] = -538654233 * anInt10220;
		is[1] = anInt10221 * 1752763243 - -31428711 * anInt10217 + i;
		is[2] = i_13_ + anInt10218 * 829302753 - anInt10216 * 276555219;
	}

	void method16057(int i, int i_15_, int[] is) {
		is[0] = 0;
		is[1] = anInt10217 * -31428711 - anInt10221 * 1752763243 + i;
		is[2] = i_15_ + anInt10216 * 276555219 - anInt10218 * 829302753;
	}

	boolean method16067(int i, int i_17_) {
		return i >= anInt10221 * 1752763243 && i <= -1497618911 * anInt10219 && i_17_ >= 829302753 * anInt10218
				&& i_17_ <= -1050672695 * anInt10222;
	}

}