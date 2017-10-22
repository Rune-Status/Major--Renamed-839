package com.jagex;

public class Class309_Sub2 extends Class309 {
	public static float aFloat9725 = 1;
	public static float aFloat9726 = 1;
	public static float aFloat9728 = 1;
	public static float aFloat9733 = 0.25F;

	Class480_Sub13_Sub1 bloomTexture;
	Class480_Sub13_Sub1 coordinates;
	Class249 fullscreen;
	Class249 brightPass;
	Program program;
	Class249 techDefault;
	Class480_Sub13_Sub1 sceneTexture;
	Class249 blur;
	Class480_Sub13_Sub1 parameters;
	Class480_Sub13_Sub1 sampleSize;
	Class480_Sub13_Sub1 scale;
	Class249 composite;

	boolean aBool9741;

	public Class309_Sub2(NativeToolkit toolkit) {
		super(toolkit);
	}

	@Override
	void method5502(int i, int i_0_) {

	}

	@Override
	boolean method5503() {
		return toolkit.aBool9408 && toolkit.method14586() && toolkit.method14964(true);
	}

	@Override
	void method5507() {

	}

	@Override
	void method5509(int i, DirectDisplay class146_sub2, Native2DTexture interface29, Interface17 interface17,
			Native2DTexture interface29_1_, boolean bool) {
		float f = toolkit.method14608();
		float f_2_ = class146_sub2.getWidth();
		float f_3_ = class146_sub2.getHeight();
		Native2DTexture interface29_4_ = interface29;
		float f_5_ = f * 2.0F / f_2_;
		float f_6_ = -f * 2.0F / f_3_;
		float[] fs = { -1.0F + f_5_, 1.0F + f_6_, 0.0F, 0.0F, -1.0F + f_5_, -3.0F + f_6_, 0.0F, 2.0F, 3.0F + f_5_,
				1.0F + f_6_, 2.0F, 0.0F };
		int i_7_ = (int) f_2_;
		int i_8_ = (int) f_3_;
		int i_9_ = bool ? toolkit.method2391().getWidth() : i_7_;
		int i_10_ = bool ? toolkit.method2391().getHeight() : i_8_;
		if (i == 0) {
			i_7_ = 256;
			i_8_ = 256;
			program.method4464(brightPass);
			program.method4522();
		} else if (i == 1) {
			i_7_ = 256;
			i_8_ = 256;
			i_9_ = i_7_;
			i_10_ = i_8_;
			program.method4464(blur);
			program.method4522();
			program.method4457(sampleSize, aFloat9728 / f_2_, 0.0F, (byte) -2);
		} else if (i == 2) {
			i_7_ = 256;
			i_8_ = 256;
			i_9_ = i_7_;
			i_10_ = i_8_;
			program.method4464(blur);
			program.method4522();
			program.method4457(sampleSize, 0.0F, aFloat9728 / f_3_, (byte) -34);
		} else if (i == 3) {
			program.method4464(composite);
			interface29_4_ = interface29_1_;
			program.method4466(bloomTexture, 1, interface29);
			program.method4522();
		}
		float f_11_ = i_7_ / f_2_;
		float f_12_ = i_8_ / f_3_;
		float f_13_ = i_9_ / f_2_;
		float f_14_ = i_10_ / f_3_;
		fs[8] = (fs[8] + 1.0F) * f_11_ - 1.0F;
		fs[5] = (fs[5] - 1.0F) * f_12_ + 1.0F;
		fs[10] *= f_13_;
		fs[7] *= f_14_;
		program.method4545(coordinates, fs);
		program.method4466(sceneTexture, 0, interface29_4_);
		program.method4459(parameters, aFloat9725, aFloat9733, aFloat9726, 0.0F);
		program.method4459(scale, 0.0F, 0.0F, 256.0F / f_2_, 256.0F / f_3_);
		toolkit.method2566(0, 0, i_7_, i_8_);
	}

	@Override
	int method5511() {
		return 4;
	}

	@Override
	int method5512() {
		return 0;
	}

	@Override
	int method5513() {
		return 1;
	}

	@Override
	boolean method5516() {
		return false;
	}

	@Override
	void method5521(int i) {
		program.method4443();
	}

	@Override
	boolean method5534() {
		return aBool9741;
	}

	@Override
	boolean method5543() {
		if (method5503()) {
			program = toolkit.loadProgram("FilterBloom");
			if (program == null) {
				return false;
			}

			try {
				sceneTexture = program.method4521("sceneTex");
				bloomTexture = program.method4521("bloomTex1");
				parameters = program.method4521("params");
				sampleSize = program.method4521("sampleSize");
				scale = program.method4521("pixelOffsetAndBloomScale");
				coordinates = program.method4521("PosAndTexCoords");
				program.method4447("test");
				fullscreen = program.method4447("techFullscreenTri");
				brightPass = program.method4447("brightpass");
				blur = program.method4447("blur");
				composite = program.method4447("composite");
				techDefault = program.method4447("techDefault");
			} catch (MissingShaderException exception_sub1_sub2) {
				return false;
			} catch (Exception_Sub1_Sub1 exception_sub1_sub1) {
				return false;
			}

			if (!fullscreen.method4648()) {
				return false;
			} else if (!brightPass.method4648()) {
				return false;
			} else if (!blur.method4648()) {
				return false;
			} else if (!composite.method4648()) {
				return false;
			} else if (!techDefault.method4648()) {
				return false;
			}

			aBool9741 = true;
			return true;
		}

		return false;
	}

}