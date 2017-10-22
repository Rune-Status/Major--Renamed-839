package com.jagex;

public class JavaThreadResource {
	static final float aFloat958 = 255.0F;

	public static void addChatMessage(int type, int i_0_, String name, String string_1_, String string_2_,
			String message, String string_4_, int i_5_, Class351 class351) {
		Class237 class237 = (Class237) Class248.aMap2667.get(Integer.valueOf(type));
		if (class237 == null) {
			class237 = new Class237();
			Class248.aMap2667.put(Integer.valueOf(type), class237);
		}

		Class480_Sub31_Sub13 class480_sub31_sub13 = class237.method4423(type, i_0_, name, string_1_, string_2_,
				message, string_4_, i_5_, class351);
		Class248.aClass667_2666.put(class480_sub31_sub13.anInt11382 * -482365547, class480_sub31_sub13);
		Class248.aClass638_2668.offer(class480_sub31_sub13);
		Client.anInt10833 = -2110475847 * Client.anInt10823;
	}

	public static String method1491() {
		return Class485.method8246("www", false);
	}

	float aFloat956;
	Runnable runnable;
	boolean aBool959;
	float aFloat960 = 0.85F;
	float aFloat961;
	int fogColour;
	int anInt963;
	JavaToolkit toolkit;
	int anInt965;
	int anInt966;
	boolean aBool967;
	float aFloat968;
	Class405 aClass405_969;
	Rasterizer rasterizer;
	Class405 aClass405_971;
	Matrix4f aClass399_972;
	Matrix4f aClass399_973;
	int[] anIntArray974;
	int[] anIntArray975;
	float[] aFloatArray976;
	float aFloat977;
	float[] aFloatArray978;
	int[] anIntArray979;
	int anInt980;
	float[] aFloatArray981;
	float[] aFloatArray982;
	int[] anIntArray983;
	int[] anIntArray984;
	float[] aFloatArray985;
	float aFloat986;
	float aFloat987;
	float[] aFloatArray988;
	int[] anIntArray989;
	boolean aBool990;
	float[] aFloatArray991;
	Matrix4f aClass399_992;
	float[] aFloatArray993;
	JavaModel[] aClass143_Sub3Array994;
	JavaModel[] aClass143_Sub3Array995;
	float[] aFloatArray996;
	float[] aFloatArray997;
	float[] aFloatArray998;
	int[] anIntArray999;
	float aFloat1000;
	float aFloat1001;

	JavaThreadResource(JavaToolkit toolkit) {
		aFloat956 = 1.0F - aFloat960;
		aBool967 = true;
		aClass399_992 = new Matrix4f();
		aClass405_969 = new Class405();
		aClass405_971 = new Class405();
		aClass399_972 = new Matrix4f();
		aClass399_973 = new Matrix4f();
		anIntArray974 = new int[JavaModel.anInt9445];
		aFloatArray991 = new float[JavaModel.anInt9445];
		aFloatArray976 = new float[JavaModel.anInt9445];
		aFloatArray982 = new float[JavaModel.anInt9445];
		aFloatArray996 = new float[JavaModel.anInt9445];
		anIntArray979 = new int[8];
		anIntArray989 = new int[8];
		anIntArray975 = new int[8];
		anIntArray999 = new int[10000];
		anIntArray983 = new int[10000];
		aFloat961 = 1.0F;
		aFloat968 = 1.0F;
		aFloatArray993 = new float[2];
		aClass143_Sub3Array994 = new JavaModel[8];
		aClass143_Sub3Array995 = new JavaModel[8];
		aFloatArray978 = new float[64];
		aFloatArray997 = new float[64];
		aFloatArray985 = new float[64];
		aFloatArray988 = new float[64];
		aFloatArray998 = new float[64];
		aFloatArray981 = new float[3];
		this.toolkit = toolkit;
		rasterizer = new Rasterizer(toolkit, this);

		for (int index = 0; index < 8; index++) {
			aClass143_Sub3Array994[index] = new JavaModel(toolkit);
			aClass143_Sub3Array995[index] = new JavaModel(toolkit);
		}

		anIntArray984 = new int[JavaModel.anInt9446];
		for (int index = 0; index < JavaModel.anInt9446; index++) {
			anIntArray984[index] = -1;
		}
	}

	void resetRasterizer() {
		rasterizer = new Rasterizer(toolkit, this);
	}

	void setRunnable(Runnable runnable) {
		this.runnable = runnable;
	}

}