package com.jagex;

public class Class302_Sub1_Sub1 extends Class302_Sub1 {
	Class480_Sub13_Sub1 distanceFogPlane;
	Class294 aClass294_11004;
	Class480_Sub13_Sub1 normalSampler;
	Class480_Sub13_Sub1 environmentSampler;
	Class480_Sub13_Sub1 wave;
	public Matrix4f aClass399_11008 = new Matrix4f();
	Class480_Sub13_Sub1 heightFogPlane;
	public Matrix4f aClass399_11010 = new Matrix4f();
	Class480_Sub13_Sub1 eye;
	Class375 aClass375_11012 = new Class375();
	Class480_Sub13_Sub1 wvp;
	Class480_Sub13_Sub1 sunDirection;
	Class375 aClass375_11015 = new Class375();
	Class480_Sub13_Sub1 sunColour;
	public int anInt11017;
	public Class397 aClass397_11018 = new Class397();
	Class375 aClass375_11019 = new Class375();
	boolean aBool11020;
	public Class375 aClass375_11021 = new Class375();
	Class480_Sub13_Sub1 heightFogColour;
	public int anInt11023;
	public Class397 aClass397_11024 = new Class397();
	public Class375 aClass375_11025 = new Class375();
	Class480_Sub13_Sub1 distanceFogColour;
	boolean sea;
	public int anInt11028;
	public Class397 aClass397_11029 = new Class397();
	public int anInt11030;
	public int anInt11031;
	float aFloat11032;
	Class480_Sub13_Sub1 textureCoordinates;
	Class249 environmentMap;

	public Class302_Sub1_Sub1(NativeToolkit toolkit, Class294 class294, boolean bool) throws ProgramException {
		super(toolkit);
		aClass294_11004 = class294;
		sea = bool;

		if (toolkit.method14585() && toolkit.method14586()) {
			aBool11020 = method15160("EnvMappedWater");
		} else {
			aBool11020 = false;
		}
	}

	public boolean method17393(short i) {
		return aBool11020;
	}

	public void method17395(byte i) {
		method17396(302120153);
		program.method4464(environmentMap);
		program.method4522();
		program.method4466(normalSampler, 0, aClass294_11004.anInterface30_3265);
		program.method4466(environmentSampler, 1, toolkit.method14587());
		program.method4470(wvp, aClass399_11008);
		program.method4540(textureCoordinates, aClass399_11010);
		int i_2_ = 1 << (-405365263 * anInt11023 & 0x3);
		program.method4459(eye, aClass397_11024.x, aClass397_11024.y, aClass397_11024.z, toolkit.anInt9401 * i_2_
				% 40000 / 40000.0F);
		program.method4448(sunDirection, aClass375_11015);
		program.method4448(sunColour, aClass375_11012);
		program.method4448(wave, aClass375_11019);
		program.method4448(heightFogPlane, aClass375_11021);
		program.method4460(heightFogColour, aClass397_11018);
		program.method4448(distanceFogPlane, aClass375_11025);
		program.method4460(distanceFogColour, aClass397_11029);
		toolkit.method14773(Class333.aClass333_3597, anInt11028 * -891855507, anInt11017 * -981652561, anInt11030
				* -1936408371, -434252745 * anInt11031);
	}

	@Override
	boolean method15161() throws ProgramException {
		if (!aClass294_11004.method5413()) {
			return false;
		}

		normalSampler = program.method4521("NormalSampler");
		environmentSampler = program.method4521("EnvMapSampler");
		wvp = program.method4521("WVPMatrix");
		textureCoordinates = program.method4521("TexCoordMatrix");
		eye = program.method4521("EyePosAndTime");
		sunDirection = program.method4521("SunDirectionAndExponent");
		sunColour = program.method4521("SunColourAndWaveExponent");
		wave = program.method4521("WaveIntensityAndBreakWaterDepthAndOffset");
		heightFogPlane = program.method4521("HeightFogPlane");
		heightFogColour = program.method4521("HeightFogColour");
		distanceFogPlane = program.method4521("DistanceFogPlane");
		distanceFogColour = program.method4521("DistanceFogColour");
		environmentMap = program.method4447(sea ? "EnvMappedSea" : "EnvMappedWater");
		program.method4464(environmentMap);
		return true;
	}

	@Override
	void method15163(Matrix4f class399) {
		Matrix4f class399_1_ = new Matrix4f();
		class399_1_.method6551(aFloat11032, aFloat11032, 1.0F, 1.0F);
		class399_1_.method6546(class399, class399_1_);
		super.method15163(class399_1_);
	}

	@Override
	void method15166(boolean bool) {
		float f = 1.0F + (1.0F - Math.abs(toolkit.aFloatArray9298[1])) * 2.0F;
		float f_0_ = toolkit.aFloat9344;
		toolkit.aFloat9344 *= f;
		super.method15166(bool);
		toolkit.aFloat9344 = f_0_;
	}

	void method17396(int i) {
		aFloat11032 = 2.4414062E-4F;
		int i_3_ = 256;
		float f = 0.3F;
		float f_4_ = 0.4F;
		float f_5_ = 0.1F;
		int i_6_ = 5;
		aClass399_11010.method6551(aFloat11032, aFloat11032, aFloat11032, aFloat11032);
		aClass375_11015.set(-toolkit.aFloatArray9298[0], -toolkit.aFloatArray9298[1], -toolkit.aFloatArray9298[2],
				32.0F);
		aClass375_11012.set(toolkit.aFloat9340, toolkit.aFloat9321, toolkit.aFloat9320, i_6_);
		aClass375_11019.set(f_5_, f_4_, i_3_, f);
	}

}