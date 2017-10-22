package com.jagex;

public class Class370 {
	static float[] SINE = new float[16384];
	static float[] COSINE = new float[16384];

	static {
		double d = 3.834951969714103E-4;
		for (int index = 0; index < 16384; index++) {
			SINE[index] = (float) Math.sin(index * d);
			COSINE[index] = (float) Math.cos(index * d);
		}
	}

	Class370() throws Throwable {
		throw new Error();
	}

}