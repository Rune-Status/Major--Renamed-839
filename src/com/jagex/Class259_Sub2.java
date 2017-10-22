package com.jagex;

public class Class259_Sub2 extends Class259 {
	static final int anInt9780 = 18;
	static final int anInt9781 = 0;
	static final int anInt9782 = 1;
	static final int anInt9783 = 2;
	static final int anInt9784 = 15;
	static final int anInt9785 = 8;
	static final int anInt9786 = 5;
	static final int anInt9787 = 4;
	static final int anInt9788 = 7;
	static final int anInt9789 = 7;
	static final int anInt9790 = 9;
	static final int anInt9792 = 11;
	static final int anInt9793 = 12;
	static final int anInt9794 = 13;
	static final int anInt9795 = 14;
	static final int anInt9796 = 12;
	static final int anInt9797 = 16;
	static final int anInt9798 = 17;
	static final int anInt9799 = 0;
	static final int anInt9800 = 6;
	static final int anInt9801 = 2;
	static final int anInt9803 = 1;
	static final int anInt9804 = 17;
	static final int anInt9805 = 10;
	static final int anInt9806 = 19;
	static final int anInt9808 = 3;
	Program program;
	Class249[] aClass249Array9802 = new Class249[19];
	Matrix4f aClass399_9807 = new Matrix4f();
	int[][] anIntArrayArray9809 = new int[19][17];
	int[] anIntArray9810;

	public Class259_Sub2(NativeToolkit toolkit) throws ProgramException {
		super(toolkit);
		init();
	}

	@Override
	public void method4772() {
		program.method4464(aClass249Array9802[17]);
		anIntArray9810 = anIntArrayArray9809[program.method4454()];
		program.method4522();
		method15291(0);
	}

	@Override
	public void method4775(boolean bool) {
		if (bool) {
			program.method4464(aClass249Array9802[1]);
		} else {
			program.method4464(aClass249Array9802[0]);
		}

		anIntArray9810 = anIntArrayArray9809[program.method4454()];
		program.method4522();
		program.method4473(anIntArray9810[2], 0, anInterface29_2863);
		program.method4451(anIntArray9810[4], aClass399_9807);
		program.method4471(anIntArray9810[5], aClass399_2865);
		program.method4468(anIntArray9810[7], aClass375_2869.aFloat4161, aClass375_2869.aFloat4160,
				aClass375_2869.aFloat4159, aClass375_2869.aFloat4162);
		program.method4499(anIntArray9810[8], aClass397_2872.x, aClass397_2872.y, aClass397_2872.z);
		program.method4468(anIntArray9810[9], aClass375_2871.aFloat4161, aClass375_2871.aFloat4160,
				aClass375_2871.aFloat4159, aClass375_2871.aFloat4162);
		program.method4499(anIntArray9810[10], aClass397_2875.x, aClass397_2875.y, aClass397_2875.z);
		toolkit.method14773(Class333.aClass333_3597, anInt2880, anInt2879, anInt2878, anInt2877);
	}

	@Override
	public void method4776(int i) {
		program.method4464(aClass249Array9802[i + 2]);
		anIntArray9810 = anIntArrayArray9809[program.method4454()];
		program.method4522();
		method15291(i);
	}

	@Override
	public void method4777(int i) {
		program.method4464(aClass249Array9802[7 + i]);
		anIntArray9810 = anIntArrayArray9809[program.method4454()];
		program.method4522();
		program.method4499(anIntArray9810[6], aClass397_2876.x, aClass397_2876.y, aClass397_2876.z);
		program.method4468(anIntArray9810[16], aFloat2867, aFloat2868, 0.0F, 0.0F);
		method15291(i);
	}

	@Override
	public void method4780() {
		program.method4464(aClass249Array9802[18]);
		anIntArray9810 = anIntArrayArray9809[program.method4454()];
		program.method4522();
		program.method4499(anIntArray9810[6], aClass397_2876.x, aClass397_2876.y, aClass397_2876.z);
		program.method4468(anIntArray9810[16], aFloat2867, aFloat2868, 0.0F, 0.0F);
		method15291(0);
	}

	@Override
	public void method4788(int i) {
		program.method4464(aClass249Array9802[12 + i]);
		anIntArray9810 = anIntArrayArray9809[program.method4454()];
		program.method4522();
		program.method4558(anIntArray9810[15], aClass399_2881);
		program.method4499(anIntArray9810[6], aClass397_2876.x, aClass397_2876.y, aClass397_2876.z);
		program.method4473(anIntArray9810[3], 1, anInterface39_2864);
		method15291(i);
	}

	@Override
	public void method4789(Matrix4f matrix) {
		aClass399_9807.copyFrom(matrix);
		aClass399_9807.method6547(toolkit.aClass399_9303);
	}

	void method15291(int i) {
		program.method4473(anIntArray9810[2], 0, anInterface29_2863);
		program.method4451(anIntArray9810[4], aClass399_9807);
		program.method4471(anIntArray9810[5], aClass399_2865);
		program.method4468(anIntArray9810[7], aClass375_2869.aFloat4161, aClass375_2869.aFloat4160,
				aClass375_2869.aFloat4159, aClass375_2869.aFloat4162);
		program.method4499(anIntArray9810[8], aClass397_2872.x, aClass397_2872.y, aClass397_2872.z);
		program.method4468(anIntArray9810[9], aClass375_2871.aFloat4161, aClass375_2871.aFloat4160,
				aClass375_2871.aFloat4159, aClass375_2871.aFloat4162);
		program.method4499(anIntArray9810[10], aClass397_2875.x, aClass397_2875.y, aClass397_2875.z);
		program.method4469(anIntArray9810[11], aClass397_2859);
		program.method4469(anIntArray9810[12], aClass397_2874);
		program.method4469(anIntArray9810[13], aClass397_2873);
		program.method4469(anIntArray9810[14], aClass397_2870);

		if (i > 0) {
			program.method4458(anIntArray9810[1], aFloatArray2862, 4 * i);
			program.method4458(anIntArray9810[0], aFloatArray2861, 4 * i);
		}

		toolkit.method14773(Class333.aClass333_3597, anInt2880, anInt2879, anInt2878, anInt2877);
	}

	boolean init() throws ProgramException {
		program = toolkit.loadProgram("Model");
		Class480_Sub13_Sub1 diffuse = program.method4521("DiffuseSampler");
		Class480_Sub13_Sub1 environment = program.method4521("EnvironmentSampler");
		Class480_Sub13_Sub1 lightPositions = program.method4521("PointLightsPosAndRadiusInv");
		Class480_Sub13_Sub1 lightDiffuse = program.method4521("PointLightsDiffuseColour");
		Class480_Sub13_Sub1 wvp = program.method4521("WVPMatrix");
		Class480_Sub13_Sub1 coordinates = program.method4521("TexCoordMatrix");
		Class480_Sub13_Sub1 heightFogPlane = program.method4521("HeightFogPlane");
		Class480_Sub13_Sub1 heightFogColour = program.method4521("HeightFogColour");
		Class480_Sub13_Sub1 distanceFogPlane = program.method4521("DistanceFogPlane");
		Class480_Sub13_Sub1 distanceFogColour = program.method4521("DistanceFogColour");
		Class480_Sub13_Sub1 sunDirection = program.method4521("SunDir");
		Class480_Sub13_Sub1 sunColour = program.method4521("SunColour");
		Class480_Sub13_Sub1 antiSunColour = program.method4521("AntiSunColour");
		Class480_Sub13_Sub1 ambientColour = program.method4521("AmbientColour");
		Class480_Sub13_Sub1 eye = program.method4521("EyePos");
		Class480_Sub13_Sub1 specular = program.method4521("SpecularExponent");
		Class480_Sub13_Sub1 world = program.method4521("WorldMatrix");

		aClass249Array9802[0] = program.method4447("Unlit");
		aClass249Array9802[1] = program.method4447("Unlit_IgnoreAlpha");
		aClass249Array9802[17] = program.method4447("UnderwaterGround");
		aClass249Array9802[18] = program.method4447("UnderwaterGroundSpecular");

		for (int index = 0; index <= 4; index++) {
			aClass249Array9802[2 + index] = program.method4447("Standard_" + index + "PointLights");
			aClass249Array9802[index + 7] = program.method4447("Specular_" + index + "PointLights");
			aClass249Array9802[12 + index] = program.method4447("EnvironmentalMapping_" + index + "PointLights");
		}

		for (int index = 0; index < 19; index++) {
			int value = program.indexOf(aClass249Array9802[index]);
			anIntArrayArray9809[index][2] = diffuse.method17547(value);
			anIntArrayArray9809[index][3] = environment.method17547(value);
			anIntArrayArray9809[index][1] = lightPositions.method17547(value);
			anIntArrayArray9809[index][0] = lightDiffuse.method17547(value);
			anIntArrayArray9809[index][4] = wvp.method17547(value);
			anIntArrayArray9809[index][5] = coordinates.method17547(value);
			anIntArrayArray9809[index][7] = heightFogPlane.method17547(value);
			anIntArrayArray9809[index][8] = heightFogColour.method17547(value);
			anIntArrayArray9809[index][9] = distanceFogPlane.method17547(value);
			anIntArrayArray9809[index][10] = distanceFogColour.method17547(value);
			anIntArrayArray9809[index][11] = sunDirection.method17547(value);
			anIntArrayArray9809[index][12] = sunColour.method17547(value);
			anIntArrayArray9809[index][13] = antiSunColour.method17547(value);
			anIntArrayArray9809[index][14] = ambientColour.method17547(value);
			anIntArrayArray9809[index][6] = eye.method17547(value);
			anIntArrayArray9809[index][15] = world.method17547(value);
			anIntArrayArray9809[index][16] = specular.method17547(value);
		}

		program.method4464(aClass249Array9802[2]);
		return true;
	}

}