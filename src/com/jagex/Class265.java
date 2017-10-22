package com.jagex;

public class Class265 {
	static void method5006(int i, int i_4_) {
		AsynchronousStreamRequest.anInt4532 = i * 807429799;
		Class495_Sub1.anInt10327 = -1164673443;
		Class495_Sub1.anInt10324 = -732309487;
		SpawnObjectCutsceneAction.method15149();
	}

	public int[] anIntArray2962;
	public short[] aShortArray2963;

	public Class265(int[] is, short[] is_1_) {
		anIntArray2962 = is;
		aShortArray2963 = is_1_;
	}

	public Class265(NpcDefinition definition) {
		anIntArray2962 = new int[8];
		aShortArray2963 = new short[8];
		int length = 0;

		if (null != definition.anIntArray3011 && null != definition.aShortArray3046) {
			length = definition.anIntArray3011.length;
			System.arraycopy(definition.anIntArray3011, 0, anIntArray2962, 0, length);
			System.arraycopy(definition.aShortArray3046, 0, aShortArray2963, 0, length);
		}

		for (int index = length; index < 8; index++) {
			anIntArray2962[index] = -1;
			aShortArray2963[index] = (short) -1;
		}
	}

}