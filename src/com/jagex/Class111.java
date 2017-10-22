package com.jagex;

public class Class111 {
	static float[] SINE = new float[16384];
	static float[] COSINE = new float[16384];

	static {
		double pi = Math.PI;
		for (int index = 0; index < 16384; index++) {
			SINE[index] = (float) Math.sin(index * pi);
			COSINE[index] = (float) Math.cos(index * pi);
		}
	}

	Class111() throws Throwable {
		throw new Error();
	}
}
