package com.jagex;

public class Class207 implements Identifiable {
	static Class207 aClass207_2161 = new Class207(2, 0);
	static Class207 aClass207_2162 = new Class207(1, 1);
	static Class207 aClass207_2163 = new Class207(0, 2);
	static Class207 aClass207_2164 = new Class207(3, 3);

	static Class207[] values() {
		return new Class207[] { aClass207_2163, aClass207_2162, aClass207_2161, aClass207_2164 };
	}

	static void createHsvTable() {
		if (null != Class335.HSV_TABLE) {
			return;
		}

		Class335.HSV_TABLE = new int[65536];

		double intensity = 0.7 + (Math.random() * 0.03 - 0.015);
		int count = 0;

		for (int colour = 0; colour < 512; colour++) {
			float hue = 360.0F * (0.0078125F + (colour >> 3) / 64.0F);
			float saturation = 0.0625F + (colour & 0x7) / 8.0F;

			for (int brightness = 0; brightness < 128; brightness++) {
				float value = brightness / 128.0F;
				float normalisedRed = 0.0F;
				float normalisedGreen = 0.0F;
				float normalisedBlue = 0.0F;

				float f_9_ = hue / 60.0F;
				int i_10_ = (int) f_9_;
				int type = i_10_ % 6;
				float f_12_ = f_9_ - i_10_;
				float chroma = value * (1.0F - saturation);
				float f_14_ = (1.0F - f_12_ * saturation) * value;
				float f_15_ = value * (1.0F - saturation * (1.0F - f_12_));

				if (0 == type) {
					normalisedRed = value;
					normalisedGreen = f_15_;
					normalisedBlue = chroma;
				} else if (1 == type) {
					normalisedRed = f_14_;
					normalisedGreen = value;
					normalisedBlue = chroma;
				} else if (type == 2) {
					normalisedRed = chroma;
					normalisedGreen = value;
					normalisedBlue = f_15_;
				} else if (type == 3) {
					normalisedRed = chroma;
					normalisedGreen = f_14_;
					normalisedBlue = value;
				} else if (type == 4) {
					normalisedRed = f_15_;
					normalisedGreen = chroma;
					normalisedBlue = value;
				} else if (type == 5) {
					normalisedRed = value;
					normalisedGreen = chroma;
					normalisedBlue = f_14_;
				}

				normalisedRed = (float) Math.pow(normalisedRed, intensity);
				normalisedGreen = (float) Math.pow(normalisedGreen, intensity);
				normalisedBlue = (float) Math.pow(normalisedBlue, intensity);

				int r = (int) (256.0F * normalisedRed);
				int g = (int) (256.0F * normalisedGreen);
				int b = (int) (normalisedBlue * 256.0F);

				int rgb = b + (g << 8) + (r << 16) + -16777216;
				Class335.HSV_TABLE[count++] = rgb;
			}
		}
	}

	int id;
	int anInt2166;

	Class207(int i, int i_0_) {
		anInt2166 = i * -1811509101;
		id = i_0_ * -1759064623;
	}

	@Override
	public int getId() {
		return 1385737009 * id;
	}

}