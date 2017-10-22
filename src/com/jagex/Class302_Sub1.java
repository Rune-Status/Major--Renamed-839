package com.jagex;

public abstract class Class302_Sub1 extends Class302 {
	static final int anInt9660 = 128;
	static final int anInt9677 = 1;
	static final int anInt9678 = 2;
	static final int anInt9679 = 4;
	static final int anInt9680 = 8;
	static final int anInt9681 = 16;
	static final int anInt9682 = 32;
	static final int anInt9686 = 64;
	static Matrix4f aClass399_9687 = new Matrix4f();
	protected Program program;
	int anInt9662;
	Class480_Sub13_Sub1 view;
	Class480_Sub13_Sub1 projection;
	Class480_Sub13_Sub1 aClass480_Sub13_Sub1_9665;
	int[] anIntArray9666;
	Class480_Sub13_Sub1 modelViewProjection;
	Class480_Sub13_Sub1 eyePositionOS;
	Class480_Sub13_Sub1 eyePosition;
	Class480_Sub13_Sub1 sunExponent;
	Class480_Sub13_Sub1 sunDirectionOS;
	Class480_Sub13_Sub1 ambient;
	Class480_Sub13_Sub1 sunColour;
	Class480_Sub13_Sub1 viewProjection;
	Class480_Sub13_Sub1 sunDirection;
	Class480_Sub13_Sub1 modelView;
	Class480_Sub13_Sub1 model;
	Class480_Sub13_Sub1 texture;
	Class480_Sub13_Sub1 antiSunColour;
	Matrix4f[] aClass399Array9688;
	float[] aFloatArray9689 = new float[3];

	Class302_Sub1(NativeToolkit toolkit) {
		super(toolkit);
		aClass399Array9688 = new Matrix4f[toolkit.anInt9406];

		for (int i = 0; i < toolkit.anInt9406; i++) {
			aClass399Array9688[i] = new Matrix4f();
		}
	}

	boolean method15160(String name) throws ProgramException {
		program = toolkit.loadProgram(name);
		if (program == null) {
			throw new ProgramException("");
		}

		texture = program.method4444("textureMatrix");
		model = program.method4444("modelMatrix");
		view = program.method4444("viewMatrix");
		projection = program.method4444("projectionMatrix");
		modelView = program.method4444("modelViewMatrix");
		modelViewProjection = program.method4444("modelViewProjectionMatrix");
		viewProjection = program.method4444("viewProjectionMatrix");
		ambient = program.method4444("ambientColour");
		sunDirection = program.method4444("sunDirection");
		sunColour = program.method4444("sunColour");
		antiSunColour = program.method4444("antiSunColour");
		sunExponent = program.method4444("sunExponent");
		eyePosition = program.method4444("eyePosition");
		eyePositionOS = program.method4444("eyePositionOS");
		sunDirectionOS = program.method4444("sunDirectionOS");

		if (!method15161()) {
			program = null;
			texture = null;
			model = null;
			view = null;
			projection = null;
			modelView = null;
			modelViewProjection = null;
			viewProjection = null;
			ambient = null;
			sunDirection = null;
			sunColour = null;
			antiSunColour = null;
			sunExponent = null;
			eyePosition = null;
			eyePositionOS = null;
			sunDirectionOS = null;
			return false;
		}

		if (program.method4453() == null) {
			Class249 class249 = program.method4538();
			if (class249 == null) {
				throw new ProgramException(program.getName());
			}

			program.method4464(class249);
		}

		anInt9662 = program.method4506();
		anIntArray9666 = new int[anInt9662];
		return true;
	}

	abstract boolean method15161() throws ProgramException;

	void method15163(Matrix4f class399) {
		if (program != null && program.method4476() && toolkit.method14665() == 0) {
			int i = program.method4454();
			if ((anIntArray9666[i] & 0x80) != 0 && texture != null) {
				program.method4540(texture, class399);
				anIntArray9666[i] &= ~0x80;
			}
		}
	}

	void method15164() {
		if (program != null && program.method4476()) {
			int i = program.method4454();
			int i_0_ = anIntArray9666[i];
			if ((i_0_ & 0x1) != 0 && model != null) {
				program.method4470(model, toolkit.method14633());
			}
			if ((i_0_ & 0x2) != 0) {
				if (view != null) {
					program.method4470(view, toolkit.method14921());
				}
				if (eyePosition != null) {
					aFloatArray9689[0] = 0.0F;
					aFloatArray9689[1] = 0.0F;
					aFloatArray9689[2] = 0.0F;
					toolkit.method2754().method6785(aFloatArray9689[0], aFloatArray9689[1], aFloatArray9689[2],
							aFloatArray9689);
					program.method4461(eyePosition, aFloatArray9689[0], aFloatArray9689[1], aFloatArray9689[2]);
				}
			}
			if ((i_0_ & 0x10) != 0 && modelView != null) {
				program.method4470(modelView, toolkit.method14758());
			}
			if ((i_0_ & 0x8) != 0 && aClass480_Sub13_Sub1_9665 != null) {
				program.method4470(aClass480_Sub13_Sub1_9665, toolkit.method14630());
			}
			if ((i_0_ & 0x4) != 0 && projection != null) {
				program.method4470(projection, toolkit.method14635());
			}
			if ((i_0_ & 0x20) != 0 && modelViewProjection != null) {
				aClass399_9687.method6546(toolkit.method14758(), toolkit.method14635());
				program.method4470(modelViewProjection, aClass399_9687);
			}
			if ((i_0_ & 0x40) != 0 && viewProjection != null) {
				aClass399_9687.method6546(toolkit.method14921(), toolkit.method14635());
				program.method4470(viewProjection, aClass399_9687);
			}
			if (toolkit.method14665() == 0 && (anIntArray9666[i] & 0x80) != 0 && texture != null) {
				program.method4540(texture, toolkit.method14675());
				anIntArray9666[i] &= ~0x80;
			}
			anIntArray9666[i] = 0;
		}
	}

	void method15165(int i, Class405 class405) {
		if (eyePositionOS != null) {
			Matrix4f class399 = toolkit.method14630();
			float[] fs = { class399.array[12], class399.array[13], class399.array[14] };
			float[] fs_1_ = { 0.0F, 0.0F, 0.0F };
			class399.method6627(fs_1_);
			float[] fs_2_ = { 0.0F, 0.0F, 0.0F };
			toolkit.method2754().method6793(0.0F, 0.0F, 0.0F, fs_2_);
			class405.method6749(fs);
			program.method4461(eyePositionOS, fs[0], fs[1], fs[2]);
		}
	}

	void method15166(boolean bool) {
		if (program != null && program.method4476()) {
			if (ambient != null) {
				program.method4461(ambient, toolkit.aFloat9340 * toolkit.aFloat9331, toolkit.aFloat9321
						* toolkit.aFloat9331, toolkit.aFloat9320 * toolkit.aFloat9331);
			}
			if (sunDirection != null) {
				program.method4461(sunDirection, toolkit.aFloatArray9298[0], toolkit.aFloatArray9298[1],
						toolkit.aFloatArray9298[2]);
			}
			if (sunColour != null) {
				program.method4461(sunColour, toolkit.aFloat9340 * toolkit.aFloat9344, toolkit.aFloat9321
						* toolkit.aFloat9344, toolkit.aFloat9320 * toolkit.aFloat9344);
			}
			if (antiSunColour != null) {
				program.method4461(antiSunColour, -toolkit.aFloat9340 * toolkit.aFloat9345, -toolkit.aFloat9321
						* toolkit.aFloat9345, -toolkit.aFloat9320 * toolkit.aFloat9345);
			}
			if (sunExponent != null) {
				program.method4456(sunExponent, 64.0F + Math.abs(toolkit.aFloatArray9298[1]) * 928.0F);
			}
		}
	}

	void method15167(int i) {
		for (int i_3_ = 0; i_3_ < anInt9662; i_3_++) {
			anIntArray9666[i_3_] |= 128 << i;
		}
	}

	void method15168(Class405 class405) {
		Matrix4f class399 = toolkit.aClass399_9324;
		class399.method6548(class405);
		int i = program.method4454();
		if (model != null) {
			program.method4470(model, class399);
			anIntArray9666[i] &= ~0x1;
		}
		if (modelView != null) {
			aClass399_9687.method6546(class399, toolkit.method14921());
			program.method4470(modelView, aClass399_9687);
			anIntArray9666[i] &= ~0x10;
		}
		if (modelViewProjection != null) {
			aClass399_9687.method6546(class399, toolkit.method14713());
			program.method4470(modelViewProjection, aClass399_9687);
			anIntArray9666[i] &= ~0x20;
		}
		method15165(i, class405);
		method15185(i, class405);
	}

	void method15170(int i) {
		aClass399Array9688[0].toIdentity();
		method15167(i);
	}

	void method15185(int i, Class405 class405) {
		if (sunDirectionOS != null) {
			float[] fs = { toolkit.aFloatArray9298[0], toolkit.aFloatArray9298[1], toolkit.aFloatArray9298[2] };
			class405.method6750(fs);
			program.method4461(sunDirectionOS, fs[0], fs[1], fs[2]);
		}
	}

	void method15194() {
		method15166(toolkit.aBool9332);
		method15163(toolkit.method14675());
		method15164();
		method5478();
	}

	@Override
	void method5473() {
		method15168(Class405.aClass405_4563);
	}

	@Override
	void method5475() {
		if (program != null) {
			program.method4443();
		}
	}

	@Override
	void method5478() {

	}

	@Override
	void method5480() {
		program.method4522();
		anIntArray9666[program.method4454()] = -1;
		method15170(0);
		method15194();
	}

}