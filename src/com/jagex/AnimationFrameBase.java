package com.jagex;

public class AnimationFrameBase extends Linkable {
	public static final int anInt10028 = 1;
	public static final int anInt10029 = 8;
	public static final int anInt10030 = 3;
	public static final int anInt10031 = 5;
	static final int anInt10032 = 6;
	public static final int anInt10033 = 7;
	public static final int anInt10035 = 9;
	public static final int anInt10036 = 10;
	public static final int anInt10039 = 0;
	public static final int anInt10040 = 2;

	public static void method15586() {
		RendererType.method2248(true);
	}

	int[] transformationTypes;
	int[][] labels;
	int id;
	int count;
	boolean[] aBoolArray10041;

	int[] anIntArray10042;

	AnimationFrameBase(int id, byte[] data) {
		id = -1273464611 * id;
		Buffer buffer = new Buffer(data);
		count = buffer.readUShort() * 307009477;
		transformationTypes = new int[-1475031283 * count];
		labels = new int[count * -1475031283][];
		aBoolArray10041 = new boolean[-1475031283 * count];
		anIntArray10042 = new int[count * -1475031283];

		for (int index = 0; index < count * -1475031283; index++) {
			transformationTypes[index] = buffer.readUByte();

			if (transformationTypes[index] == 6) {
				transformationTypes[index] = 2;
			}
		}

		for (int index = 0; index < -1475031283 * count; index++) {
			aBoolArray10041[index] = buffer.readUByte() == 1;
		}

		for (int index = 0; index < -1475031283 * count; index++) {
			anIntArray10042[index] = buffer.readUShort();
		}

		for (int index = 0; index < -1475031283 * count; index++) {
			labels[index] = new int[buffer.readUSmart()];
		}

		for (int count = 0; count < -1475031283 * this.count; count++) {
			for (int index = 0; index < labels[count].length; index++) {
				labels[count][index] = buffer.readUSmart();
			}
		}
	}

}