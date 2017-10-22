package com.jagex;

public class UnderlayDefinition implements Definition, Interface71 {

	static boolean isInt(CharSequence sequence, int radix, boolean bool) {
		if (radix < 2 || radix > 36) {
			throw new IllegalArgumentException(new StringBuilder().append("").append(radix).toString());
		}

		boolean bool_12_ = false;
		boolean bool_13_ = false;
		int i_14_ = 0;
		int length = sequence.length();

		for (int index = 0; index < length; index++) {
			int character = sequence.charAt(index);
			if (0 == index) {
				if (45 == character) {
					bool_12_ = true;
					continue;
				}

				if (character == 43 && bool) {
					continue;
				}
			}

			if (character >= 48 && character <= 57) {
				character -= 48;
			} else if (character >= 65 && character <= 90) {
				character -= 55;
			} else if (character >= 97 && character <= 122) {
				character -= 87;
			} else {
				return false;
			}
			if (character >= radix) {
				return false;
			}
			if (bool_12_) {
				character = -character;
			}
			int i_18_ = character + radix * i_14_;
			if (i_18_ / radix != i_14_) {
				return false;
			}
			i_14_ = i_18_;
			bool_13_ = true;
		}

		return bool_13_;
	}

	static final void method13373(ScriptExecutionContext class613, int i) {
		int i_19_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_19_);
		ScriptExecutionContext.method5045(class226, class613, 2120177391);
	}

	public int texture = -1396359583;
	int colour = 0;
	public int scale = 248595968;
	public boolean blockShadow = true;
	public boolean aBool8184 = true;
	public int hue;
	public int saturation;
	public int lightness;
	public int chroma;
	public static UnderlayDefinitionLoader loader;

	@Override
	public void method35() {

	}

	@Override
	public void decode(Buffer buffer) {
		for (;;) {
			int opcode = buffer.readUByte();
			if (0 == opcode) {
				break;
			}

			decode(buffer, opcode);
		}
	}

	@Override
	public void method40(int i) {

	}

	@Override
	public void setId(int id) {

	}

	void decode(Buffer buffer, int opcode) {
		if (opcode == 1) {
			colour = buffer.readUTriByte() * 535431535;
			computeHsl(484144527 * colour);
		} else if (opcode == 2) {
			texture = buffer.readUShort() * 1396359583;

			if (65535 == texture * -1116202401) {
				texture = -1396359583;
			}
		} else if (3 == opcode) {
			scale = (buffer.readUShort() << 2) * 1804036259;
		} else if (4 == opcode) {
			blockShadow = false;
		} else if (5 == opcode) {
			aBool8184 = false;
		}
	}

	void computeHsl(int colour) {
		double r = (colour >> 16 & 0xff) / 256.0;
		double g = (colour >> 8 & 0xff) / 256.0;
		double b = (colour & 0xff) / 256.0;
		double maximum = r;

		if (g < maximum) {
			maximum = g;
		}
		if (b < maximum) {
			maximum = b;
		}

		double minimum = r;
		if (g > minimum) {
			minimum = g;
		}
		if (b > minimum) {
			minimum = b;
		}

		double h = 0.0;
		double s = 0.0;
		double l = (minimum + maximum) / 2.0;

		if (minimum != maximum) {
			if (l < 0.5) {
				s = (minimum - maximum) / (minimum + maximum);
			}

			if (l >= 0.5) {
				s = (minimum - maximum) / (2.0 - minimum - maximum);
			}

			if (minimum == r) {
				h = (g - b) / (minimum - maximum);
			} else if (g == minimum) {
				h = 2.0 + (b - r) / (minimum - maximum);
			} else if (minimum == b) {
				h = 4.0 + (r - g) / (minimum - maximum);
			}
		}

		h /= 6.0;
		saturation = (int) (256.0 * s) * 1671663151;
		lightness = 7090083 * (int) (l * 256.0);

		if (-1056540465 * saturation < 0) {
			saturation = 0;
		} else if (saturation * -1056540465 > 255) {
			saturation = 1072341201;
		}

		if (-1022526453 * lightness < 0) {
			lightness = 0;
		} else if (lightness * -1022526453 > 255) {
			lightness = 1807971165;
		}

		if (l > 0.5) {
			chroma = (int) (512.0 * (s * (1.0 - l))) * -1578467271;
		} else {
			chroma = -1578467271 * (int) (s * l * 512.0);
		}
		if (chroma * -2030998007 < 1) {
			chroma = -1578467271;
		}

		hue = -1906056255 * (int) (chroma * -2030998007 * h);
	}

}