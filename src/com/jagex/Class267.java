package com.jagex;

public class Class267 {
	float[] aFloatArray2975;
	public int[] models;
	public long aLong2977;
	public short[] colours;
	int[][] anIntArrayArray2979;
	int[][] anIntArrayArray2980;
	public short[] textures;

	public Class267(long l, int[] models, float[] fs, int[][] is_0_, int[][] is_1_, short[] colours, short[] textures) {
		aLong2977 = 359135170314717883L * l;
		this.models = models;
		aFloatArray2975 = fs;
		anIntArrayArray2980 = is_0_;
		anIntArrayArray2979 = is_1_;
		this.colours = colours;
		this.textures = textures;
	}

	public Class267(NpcDefinition definition, boolean body) {
		if (body) {
			models = new int[definition.models.length];
			aFloatArray2975 = new float[definition.models.length];
			anIntArrayArray2980 = new int[definition.models.length][3];
			anIntArrayArray2979 = new int[definition.models.length][3];
			System.arraycopy(definition.models, 0, models, 0, models.length);
		} else {
			models = new int[definition.headModels.length];
			aFloatArray2975 = new float[definition.headModels.length];
			anIntArrayArray2980 = new int[definition.headModels.length][3];
			anIntArrayArray2979 = new int[definition.headModels.length][3];
			System.arraycopy(definition.headModels, 0, models, 0, models.length);
		}

		if (definition.replacementColours != null) {
			colours = new short[definition.replacementColours.length];
			System.arraycopy(definition.replacementColours, 0, colours, 0, colours.length);
		}

		if (null != definition.replacementTextures) {
			textures = new short[definition.replacementTextures.length];
			System.arraycopy(definition.replacementTextures, 0, textures, 0, textures.length);
		}
	}

}