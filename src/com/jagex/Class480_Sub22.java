package com.jagex;

public class Class480_Sub22 extends Linkable implements Serializable {
	static Class480_Sub22[] cache = new Class480_Sub22[0];
	static int remainingCache;

	public static Class480_Sub22 method14268(int i, boolean bool) {
		synchronized (cache) {
			if (0 == remainingCache * 1412746033) {
				return new Class480_Sub22(i, bool);
			}

			cache[(remainingCache -= -612979247) * 1412746033].method15973(i, bool);
			return cache[remainingCache * 1412746033];
		}
	}

	static void method15974(int i) {
		int i_10_ = -1;
		if (Class495.aClass480_Sub31_Sub18_6808 != null) {
			i_10_ = Class495.aClass480_Sub31_Sub18_6808.anInt11426 * 1943328861;
		}
		CutsceneArea.method16040();
		for (int i_11_ = 0; i_11_ < 3; i_11_++) {
			for (int i_12_ = 0; i_12_ < 5; i_12_++) {
				Class495_Sub1.aClass132ArrayArray10329[i_11_][i_12_] = null;
				Class495_Sub1.aClass9ArrayArray10339[i_11_][i_12_] = null;
			}
		}
		Class495.aClass480_Sub31_Sub18_6808 = null;
		if (i_10_ != -1) {
			Mob.method18041(i_10_, -1, -1, false);
		}
	}

	public int anInt10154;
	public int anInt10155;
	public int anInt10156;
	public int plane;

	public Class480_Sub22() {
		plane = 380409189;
	}

	public Class480_Sub22(int plane, int i_6_, int i_7_, int i_8_) {
		this.plane = -380409189 * plane;
		anInt10154 = i_6_ * -904958353;
		anInt10155 = i_7_ * 556291925;
		anInt10156 = 1050217283 * i_8_;
	}

	Class480_Sub22(Class480_Sub22 other) {
		plane = other.plane * 1;
		anInt10154 = 1 * other.anInt10154;
		anInt10155 = 1 * other.anInt10155;
		anInt10156 = other.anInt10156 * 1;
	}

	Class480_Sub22(int position, boolean bool) {
		if (position == -1) {
			plane = 380409189;
		} else {
			plane = (position >> 28 & 0x3) * -380409189;
			anInt10154 = -904958353 * ((position >> 14 & 0x3fff) << 9);
			anInt10155 = 0;
			anInt10156 = 1050217283 * ((position & 0x3fff) << 9);

			if (bool) {
				anInt10154 += 258895616;
				anInt10156 += -1727315200;
			}
		}
	}

	public Class397 copy() {
		return new Class397(anInt10154 * -61099889, 1227419133 * anInt10155, -980788885 * anInt10156);
	}

	@Override
	public void decode(Buffer buffer) {
		plane = buffer.readUByte() * -380409189;
		anInt10154 = buffer.readInt() * -904958353;
		anInt10155 = buffer.readInt() * 556291925;
		anInt10156 = buffer.readInt() * 1050217283;
	}

	@Override
	public void encode(Buffer buffer) {
		buffer.writeByte(-841913453 * plane);
		buffer.writeInt(anInt10154 * -61099889);
		buffer.writeInt(1227419133 * anInt10155);
		buffer.writeInt(anInt10156 * -980788885);
	}

	@Override
	public int encodedSize() {
		return 13;
	}

	@Override
	public String toString() {
		return new StringBuilder().append("Level: ").append(-841913453 * plane).append(" Coord: ")
				.append(anInt10154 * -61099889).append(",").append(anInt10155 * 1227419133).append(",")
				.append(anInt10156 * -980788885).append(" Coord Split: ").append(anInt10154 * -61099889 >> 15)
				.append(",").append(-980788885 * anInt10156 >> 15).append(",")
				.append(anInt10154 * -61099889 >> 9 & 0x3f).append(",").append(anInt10156 * -980788885 >> 9 & 0x3f)
				.append(",").append(anInt10154 * -61099889 & 0x1ff).append(",").append(anInt10156 * -980788885 & 0x1ff)
				.toString();
	}

	void copyFrom(Class480_Sub22 other) {
		plane = other.plane;
		anInt10154 = other.anInt10154;
		anInt10155 = other.anInt10155;
		anInt10156 = other.anInt10156;
	}

	void method15973(int i, boolean bool) {
		if (-1 == i) {
			plane = 380409189;
		} else {
			plane = (i >> 28 & 0x3) * -380409189;
			anInt10154 = -904958353 * ((i >> 14 & 0x3fff) << 9);
			anInt10155 = 0;
			anInt10156 = ((i & 0x3fff) << 9) * 1050217283;

			if (bool) {
				anInt10154 += 258895616;
				anInt10156 += -1727315200;
			}
		}
	}

	void set(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		plane = i * -380409189;
		anInt10154 = -904958353 * i_0_;
		anInt10155 = i_1_ * 556291925;
		anInt10156 = i_2_ * 1050217283;
	}

	public static Class480_Sub22 create(int plane, int i_6_, int i_7_, int i_8_) {
		synchronized (cache) {
			if (1412746033 * remainingCache == 0) {
				Class480_Sub22 class480_sub22 = new Class480_Sub22(plane, i_6_, i_7_, i_8_);
				return class480_sub22;
			}
			cache[(remainingCache -= -612979247) * 1412746033].set(plane, i_6_, i_7_, i_8_,
					1672587686);
			Class480_Sub22 class480_sub22 = cache[1412746033 * remainingCache];
			return class480_sub22;
		}
	}

}