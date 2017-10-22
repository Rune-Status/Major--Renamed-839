package com.jagex;

public final class HslUtils {

	HslUtils() {
		throw new AssertionError();
	}

	public static int fromRgb(int rgb) {
		double r = (rgb >> 16 & 0xff) / 256.0;
		double g = (rgb >> 8 & 0xff) / 256.0;
		double b = (rgb & 0xff) / 256.0;
		double minimum = r;

		if (g < minimum) {
			minimum = g;
		}

		if (b < minimum) {
			minimum = b;
		}

		double maximum = r;
		if (g > maximum) {
			maximum = g;
		}

		if (b > maximum) {
			maximum = b;
		}

		double h = 0.0;
		double s = 0.0;
		double l = (maximum + minimum) / 2.0;

		if (minimum != maximum) {
			if (l < 0.5) {
				s = (maximum - minimum) / (maximum + minimum);
			}

			if (l >= 0.5) {
				s = (maximum - minimum) / (2.0 - maximum - minimum);
			}

			if (maximum == r) {
				h = (g - b) / (maximum - minimum);
			} else if (maximum == g) {
				h = (b - r) / (maximum - minimum) + 2.0;
			} else if (b == maximum) {
				h = (r - g) / (maximum - minimum) + 4.0;
			}
		}

		h /= 6.0;
		int hue = (int) (h * 256.0);
		int saturation = (int) (256.0 * s);
		int luminance = (int) (256.0 * l);

		if (saturation < 0) {
			saturation = 0;
		} else if (saturation > 255) {
			saturation = 255;
		}

		if (luminance < 0) {
			luminance = 0;
		} else if (luminance > 255) {
			luminance = 255;
		}

		if (luminance > 243) {
			saturation >>= 4;
		} else if (luminance > 217) {
			saturation >>= 3;
		} else if (luminance > 192) {
			saturation >>= 2;
		} else if (luminance > 179) {
			saturation >>= 1;
		}

		return ((hue & 0xff) >> 2 << 10) + (saturation >> 5 << 7) + (luminance >> 1);
	}

	public static short hslToHsv(int hsl) {
		int hue = hsl >> 10 & 0x3f;
		int saturation = hsl >> 3 & 0x70;
		int light = hsl & 0x7f;
	
		saturation = light <= 64 ? saturation * light >> 7 : (127 - light) * saturation >> 7;
		int v = saturation + light;
		int sat;
	
		if (0 != v) {
			sat = (saturation << 8) / v;
		} else {
			sat = saturation << 1;
		}
	
		int value = v;
		return (short) (hue << 10 | sat >> 4 << 7 | value);
	}

}