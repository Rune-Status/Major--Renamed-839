package com.jagex;

public interface Native2DTexture extends NativeTexture {

	int getWidth();

	float method180(float f);

	boolean method181();

	void method183(int i, int i_0_, int i_1_, int i_2_, int[] is, int i_3_, int i_4_);

	float method184();

	void method185(int i, int i_5_, int i_6_, int i_7_, int[] is, int[] is_8_, int i_9_);

	float method187();

	float method191(float f);

	void setRepeating(boolean bool, boolean bool_10_);

	boolean generateMipmaps();

	void method213(int i, int i_11_, int i_12_, int i_13_, byte[] is, Class121 class121, int i_14_, int i_15_);

	void method218(int i, int i_16_, int i_17_, int i_18_, int[] is, int i_19_);

	void method221(int i, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_);

	int getHeight();

}