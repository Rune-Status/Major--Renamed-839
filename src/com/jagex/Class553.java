package com.jagex;

public class Class553 {
	public int plane;
	public int x;
	public int z;

	public Class553() {
		plane = -854958999;
	}

	public Class553(int packed) {
		if (packed == -1) {
			plane = -854958999;
		} else {
			plane = 854958999 * (packed >> 28 & 0x3);
			x = (packed >> 14 & 0x3fff) * -1155670979;
			z = 2125481685 * (packed & 0x3fff);
		}
	}

	public Class553(int plane, int x, int z) {
		this.plane = plane * 854958999;
		this.x = x * -1155670979;
		this.z = 2125481685 * z;
	}

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		} else if (!(object instanceof Class553)) {
			return false;
		}

		return equals((Class553) object);
	}

	@Override
	public int hashCode() {
		return hash();
	}

	public int hash() {
		return plane * 394202151 << 28 | 2051316501 * x << 14 | -180305283 * z;
	}

	public void method9356(Class480_Sub22 class480_sub22) {
		plane = class480_sub22.plane * 1739852981;
		x = (-61099889 * class480_sub22.anInt10154 >> 9) * -1155670979;
		z = 2125481685 * (class480_sub22.anInt10156 * -980788885 >> 9);
	}

	@Override
	public String toString() {
		return new StringBuilder().append(plane * 394202151).append(",").append(x * 2051316501 >> 6).append(",")
				.append(-180305283 * z >> 6).append(",").append(x * 2051316501 & 0x3f).append(",")
				.append(z * -180305283 & 0x3f).toString();
	}

	boolean equals(Class553 other) {
		if (394202151 * plane != other.plane * 394202151) {
			return false;
		} else if (2051316501 * other.x != x * 2051316501) {
			return false;
		}

		return -180305283 * z == -180305283 * other.z;
	}

}