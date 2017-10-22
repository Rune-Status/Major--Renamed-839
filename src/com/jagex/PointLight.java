package com.jagex;

public class PointLight extends Linkable {

	public Class397 position = new Class397();
	int range;
	int anInt10159;
	int anInt10160;
	int anInt10161;
	float intensity;
	int blendedColour;
	int anInt10164;
	long lastColourChange;
	int colour;

	PointLight(int x, int y, int z, int range, int colour, float intensity) {
		position.set(x, y, z);
		this.range = range * -736420765;
		this.colour = colour * 925406755;
		this.blendedColour = -1762647073 * this.colour;
		this.anInt10159 = -388678863 * this.colour;
		this.intensity = intensity;
	}

	public final int getX() {
		return (int) position.x;
	}

	public void reposition(int x, int y, int z) {
		position.set(x, y, z);
	}

	public final float getIntensity() {
		return intensity;
	}

	public void setIntensity(float f) {
		intensity = f;
	}

	public int method15984() {
		return -558782085 * anInt10159;
	}

	public int method15985() {
		return -1965148395 * anInt10164;
	}

	public void method15986(int i) {
		blendedColour = -609119875 * i;
	}

	public void method15987(int i, int i_4_) {
		anInt10159 = i * -1937912397;
		anInt10161 = blendedColour * -2040791617;
		anInt10160 = 1513187767 * i_4_;

		if (-1 == -558782085 * anInt10159) {
			anInt10159 = colour * -388678863;
		}

		anInt10164 = 1007771709 * i_4_;
		lastColourChange = TimeUtil.time() * 2954476098383365691L;
	}

	public void method15988() {
		if (blendedColour * 528232405 != anInt10159 * -558782085) {
			long time = TimeUtil.time();
			long l_6_ = time - 1581201979747803891L * lastColourChange;
			anInt10164 -= 1007771709L * l_6_;

			if (anInt10164 * -1965148395 > 0) {
				blendedColour = Class360.blendColours(anInt10161 * -1368318101, -558782085 * anInt10159,
						(1106953223 * anInt10160 - -1965148395 * anInt10164) / (anInt10160 * 1106953223) * 255.0F)
						* -609119875;
			} else {
				blendedColour = -993432561 * anInt10159;
			}

			lastColourChange = 2954476098383365691L * time;
		}
	}

	public final int getRange() {
		return 1970816331 * range;
	}

	public final int getY() {
		return (int) position.y;
	}

	public final int getZ() {
		return (int) position.z;
	}

	public final int getColour() {
		return blendedColour * 528232405;
	}

}