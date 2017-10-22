package com.jagex;

public class PerlinUtils {

	static final int interpolate(int a, int b, int angle, int divisor) {
		int cos = 65536 - Class373.COSINE[angle * 8192 / divisor] >> 1;
		return (a * (65536 - cos) >> 16) + (b * cos >> 16);
	}

	PerlinUtils() throws Throwable {
		throw new Error();
	}

	static final int perlin(int x, int z) {
		int n = 57 * z + x;
		n = n << 13 ^ n;
		n = n * (n * n * 15731 + 789221) + 1376312589 & 0x7fffffff;
		return n >> 19 & 0xff;
	}

	static final int smoothNoise(int x, int z) {
		int corners = perlin(x - 1, z - 1) + perlin(x + 1, z - 1)
				+ perlin(x - 1, 1 + z) + perlin(1 + x, z + 1);
		int sides = perlin(x - 1, z) + perlin(1 + x, z)
				+ perlin(x, z - 1) + perlin(x, z + 1);
		int center = perlin(x, z);
		return center / 4 + sides / 8 + corners / 16;
	}

	static final int interpolatedNoise(int x, int z, int divisor) {
		int i_3_ = x / divisor;
		int i_4_ = x & divisor - 1;
		int i_5_ = z / divisor;
		int i_6_ = z & divisor - 1;
		int i_7_ = smoothNoise(i_3_, i_5_);
		int i_8_ = smoothNoise(i_3_ + 1, i_5_);
		int i_9_ = smoothNoise(i_3_, i_5_ + 1);
		int i_10_ = smoothNoise(1 + i_3_, 1 + i_5_);
		int i_11_ = interpolate(i_7_, i_8_, i_4_, divisor);
		int i_12_ = interpolate(i_9_, i_10_, i_4_, divisor);
		return interpolate(i_11_, i_12_, i_6_, divisor);
	}

}