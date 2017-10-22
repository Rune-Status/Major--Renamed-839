package com.jagex;

public class Class309_Sub1 extends Class309 {
	public static float aFloat9707 = 1.0F;
	public static float aFloat9714 = 0.0F;
	public static float aFloat9715 = 1.0F;
	public static float aFloat9716 = 0.0F;
	public static float aFloat9717 = 1.0F;
	Class249 adjust;
	Class480_Sub13_Sub1 ranges;
	Class480_Sub13_Sub1 gamma;
	Class480_Sub13_Sub1 texture;
	Program program;
	Class480_Sub13_Sub1 coordinates;
	Class480_Sub13_Sub1 offset;
	boolean aBool9718;

	public Class309_Sub1(NativeToolkit toolkit) {
		super(toolkit);
	}

	@Override
	void method5502(int i, int i_0_) {

	}

	@Override
	boolean method5503() {
		return toolkit.aBool9408 && toolkit.method14586();
	}

	@Override
	void method5507() {

	}

	@Override
	void method5509(int i, DirectDisplay class146_sub2, Native2DTexture interface29, Interface17 interface17,
			Native2DTexture interface29_1_, boolean bool) {
		float f = toolkit.method14608();
		float width = class146_sub2.getWidth();
		float height = class146_sub2.getHeight();
		float f_4_ = f * 2.0F / width;
		float f_5_ = -f * 2.0F / height;
		float[] fs = { -1.0F + f_4_, 1.0F + f_5_, 0.0F, 0.0F, -1.0F + f_4_, -3.0F + f_5_, 0.0F, 2.0F, 3.0F + f_4_,
				1.0F + f_5_, 2.0F, 0.0F };
		int i_6_ = (int) width;
		int i_7_ = (int) height;
		int i_8_ = bool ? toolkit.method2391().getWidth() : i_6_;
		int i_9_ = bool ? toolkit.method2391().getHeight() : i_7_;
		program.method4464(adjust);
		program.method4522();
		float f_10_ = i_6_ / width;
		float f_11_ = i_7_ / height;
		float f_12_ = i_8_ / width;
		float f_13_ = i_9_ / height;
		fs[8] = (fs[8] + 1.0F) * f_10_ - 1.0F;
		fs[5] = (fs[5] - 1.0F) * f_11_ + 1.0F;
		fs[10] *= f_12_;
		fs[7] *= f_13_;
		program.method4545(coordinates, fs);
		program.method4466(texture, 0, interface29);
		program.method4456(gamma, aFloat9707);
		program.method4459(ranges, aFloat9714, aFloat9715, aFloat9716, aFloat9717);
		program.method4459(offset, 0.0F, 0.0F, 0.0F, 0.0F);
		toolkit.method2566(0, 0, i_6_, i_7_);
	}

	@Override
	int method5511() {
		return 1;
	}

	@Override
	int method5512() {
		return 1;
	}

	@Override
	int method5513() {
		return 0;
	}

	@Override
	boolean method5516() {
		return aFloat9707 == 1.0F && aFloat9714 == 0.0F && aFloat9715 == 1.0F && aFloat9716 == 0.0F
				&& aFloat9717 == 1.0F;
	}

	@Override
	void method5521(int i) {
		program.method4443();
	}

	@Override
	boolean method5534() {
		return aBool9718;
	}

	@Override
	boolean method5543() {
		if (method5503()) {
			program = toolkit.loadProgram("FilterLevels");
			if (program == null) {
				return false;
			}

			try {
				texture = program.method4521("sceneTex");
				gamma = program.method4521("paramsGamma");
				ranges = program.method4521("paramsRanges");
				offset = program.method4521("pixelOffset");
				coordinates = program.method4521("PosAndTexCoords");
				adjust = program.method4447("techAdjust");
			} catch (MissingShaderException exception_sub1_sub2) {
				return false;
			} catch (Exception_Sub1_Sub1 exception_sub1_sub1) {
				return false;
			}

			if (!adjust.method4648()) {
				return false;
			}

			aBool9718 = true;
			return true;
		}

		return false;
	}

}