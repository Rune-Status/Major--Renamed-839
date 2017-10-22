package com.jagex;

public class Class309_Sub3 extends Class309 {
	public static int anInt9903 = 1;
	public static Class118_Sub2[] aClass118_Sub2Array9904 = new Class118_Sub2[] { null, null, null };
	public static float[] aFloatArray9906 = { 0.0F, 0.0F, 0.0F };
	public static float aFloat9909 = 1.0F;

	Class249[] remap = null;
	Class480_Sub13_Sub1 texture;
	Class480_Sub13_Sub1 weightings;
	Program program;
	Class480_Sub13_Sub1[] remapTextures = null;
	Class480_Sub13_Sub1 offset;
	Class480_Sub13_Sub1 cordinates;

	boolean aBool9912;

	public Class309_Sub3(NativeToolkit toolkit) {
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
		Native2DTexture interface29_4_ = interface29;
		float f_5_ = f * 2.0F / width;
		float f_6_ = -f * 2.0F / height;
		float[] fs = { -1.0F + f_5_, 1.0F + f_6_, 0.0F, 0.0F, -1.0F + f_5_, -3.0F + f_6_, 0.0F, 2.0F, 3.0F + f_5_,
				1.0F + f_6_, 2.0F, 0.0F };
		int i_7_ = (int) width;
		int i_8_ = (int) height;
		int i_9_ = bool ? toolkit.method2391().getWidth() : i_7_;
		int i_10_ = bool ? toolkit.method2391().getHeight() : i_8_;

		Class249 class249 = remap[anInt9903 - 1];
		program.method4464(class249);
		program.method4522();
		program.method4459(weightings, aFloat9909, aFloatArray9906[0], aFloatArray9906[1], aFloatArray9906[2]);

		for (int i_12_ = 0; i_12_ < anInt9903; i_12_++) {
			if (aClass118_Sub2Array9904[i_12_] != null) {
				Class480_Sub13_Sub1 class480_sub13_sub1 = remapTextures[i_12_];
				NativeTexture interface38 = aClass118_Sub2Array9904[i_12_].getTexture();
				program.method4466(class480_sub13_sub1, i_12_ + 1, interface38);
			}
		}

		float f_13_ = i_7_ / width;
		float f_14_ = i_8_ / height;
		float f_15_ = i_9_ / width;
		float f_16_ = i_10_ / height;
		fs[8] = (fs[8] + 1.0F) * f_13_ - 1.0F;
		fs[5] = (fs[5] - 1.0F) * f_14_ + 1.0F;
		fs[10] *= f_15_;
		fs[7] *= f_16_;
		program.method4545(cordinates, fs);
		program.method4466(texture, 0, interface29_4_);
		program.method4459(offset, 0.0F, 0.0F, 0.0F, 0.0F);
		toolkit.method2566(0, 0, i_7_, i_8_);
	}

	@Override
	int method5511() {
		return 1;
	}

	@Override
	int method5512() {
		return 2;
	}

	@Override
	int method5513() {
		return 0;
	}

	@Override
	boolean method5516() {
		return anInt9903 == 0 || aFloat9909 == 1.0F
				|| aFloatArray9906[0] + aFloatArray9906[1] + aFloatArray9906[2] == 0.0F
				|| aClass118_Sub2Array9904[0] == null && aClass118_Sub2Array9904[1] == null
				&& aClass118_Sub2Array9904[2] == null;
	}

	@Override
	void method5521(int i) {
		program.method4443();
	}

	@Override
	boolean method5534() {
		return aBool9912;
	}

	@Override
	boolean method5543() {
		if (method5503()) {
			program = toolkit.loadProgram("FilterColourRemapping");
			if (program == null) {
				return false;
			}
			try {
				texture = program.method4521("sceneTex");
				remap = new Class249[3];
				remapTextures = new Class480_Sub13_Sub1[3];

				if (toolkit.threeDimensional) {
					remap[0] = program.method4447("techRemap3D_1");
					remap[1] = program.method4447("techRemap3D_2");
					remap[2] = program.method4447("techRemap3D_3");
					remapTextures[0] = program.method4521("remapTex3D_1");
					remapTextures[1] = program.method4521("remapTex3D_2");
					remapTextures[2] = program.method4521("remapTex3D_3");
				} else {
					remap[0] = program.method4447("techRemap2D_1");
					remap[1] = program.method4447("techRemap2D_2");
					remap[2] = program.method4447("techRemap2D_3");
					remapTextures[0] = program.method4521("remapTex2D_1");
					remapTextures[1] = program.method4521("remapTex2D_2");
					remapTextures[2] = program.method4521("remapTex2D_3");
				}

				weightings = program.method4521("paramsWeightings");
				offset = program.method4521("pixelOffset");
				cordinates = program.method4521("PosAndTexCoords");
			} catch (MissingShaderException exception_sub1_sub2) {
				return false;
			} catch (Exception_Sub1_Sub1 exception_sub1_sub1) {
				return false;
			}

			if (!remap[0].method4648() || !remap[1].method4648() || !remap[2].method4648()) {
				return false;
			}

			aBool9912 = true;
			return true;
		}

		return false;
	}

}