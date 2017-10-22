package com.jagex;

public abstract class Class249 implements Deletable {

	public static void method4699(Class349 class349, Class334 class334, int i, int i_13_, int i_14_, int i_15_,
			int i_16_, int i_17_, int i_18_, int i_19_, int i_20_) {
		Class82.aClass349_1182 = class349;
		Class82.aClass334_1177 = class334;
		Class82.anInt1179 = i * -443370283;
		Class82.anInt1180 = i_13_ * -1863503803;
		ResetMobCutsceneAction.anInt9558 = -1054869863 * i_14_;
		Class82.anInt1184 = i_15_ * 36551855;
		Class82.anInt1185 = -988534253 * i_16_;
		Class80.anInt578 = i_17_ * -287273565;
		Class82.anInt1183 = i_18_ * 508080499;
		Class82.aClass152_1178 = null;
		ItemDeque.aClass152_9984 = null;
		Class80.aClass152_7063 = null;
		CachedDefinitionLoader.anInt8502 = -714487109 * i_19_;
		Class82.anInt1181 = i_20_ * 1267481097;
		Class80.method1676();
		Class82.aBool1187 = true;
	}

	static boolean method4705(int i, int i_24_) {
		return i == 44 || i == 45 || i == 46 || i == 47 || 48 == i || 49 == i || 50 == i || 51 == i || i == 52
				|| 53 == i || i == 15;
	}

	protected String vertexShaderName;
	protected String name = null;
	protected String pixelShaderName;

	public abstract boolean method4648();

	abstract void method4649(Class480_Sub13_Sub1 class480_sub13_sub1, float f, float f_0_);

	abstract void method4650(Class480_Sub13_Sub1 class480_sub13_sub1, float f, float f_1_, float f_2_);

	abstract void method4651(Class480_Sub13_Sub1 class480_sub13_sub1, float f, float f_3_, float f_4_, float f_5_);

	abstract void method4653(Class480_Sub13_Sub1 class480_sub13_sub1, Matrix4f matrix);

	abstract void method4655(Class480_Sub13_Sub1 class480_sub13_sub1, int i, NativeTexture texture);

	String getName() {
		return name;
	}

	abstract void method4659(int i, Matrix4f class399);

	abstract void method4660(int i, Matrix4f class399);

	abstract void method4661(int i, float[] fs, int i_6_);

	abstract void method4663(Class480_Sub13_Sub1 class480_sub13_sub1, float[] fs, int i);

	abstract void method4665(Class480_Sub13_Sub1 class480_sub13_sub1, Matrix4f texture);

	abstract void method4668(int i, float f, float f_7_, float f_8_, float f_9_);

	abstract void method4674(int i, int i_10_, NativeTexture texture);

	abstract void method4681(int i, float f, float f_11_, float f_12_);

	abstract void method4692(int i, Matrix4f matrix);

	abstract void method4697(Class480_Sub13_Sub1 class480_sub13_sub1, float f);

}