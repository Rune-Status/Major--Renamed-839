package com.jagex;

public abstract class Class281 {
	public static int method5259(int i, int i_4_) {
		Class237 class237 = (Class237) Class248.aMap2667.get(Integer.valueOf(i));
		if (class237 == null) {
			return 0;
		}
		return class237.method4422();
	}

	Class261 aClass261_3155;

	Class281(Class261 class261) {
		aClass261_3155 = class261;
	}

	public abstract Class397 method5224();

	public abstract void method5225(float f, int[][][] is, TileFlags flags, int i, int i_0_, byte i_1_);

	public abstract boolean method5226();

	public abstract double[] method5228();

	public abstract float method5230(byte i);

	public abstract Class480_Sub22 method5238(short i);

	public abstract void method5248(Class268 class268, int i, int i_2_, byte i_3_);

	public abstract void method5256(Buffer buffer, byte i);

}