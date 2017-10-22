package com.jagex;

public final class Class299_Sub2 extends Class299 {
	static final int anInt9759 = 1;
	static final int anInt9760 = 1;
	static final int anInt9761 = 2;
	static final int anInt9763 = 0;
	static final int anInt9764 = 5;
	static final int anInt9765 = 6;
	static final int anInt9767 = 0;
	static final int anInt9769 = 2;
	static final int anInt9770 = 3;
	static final int anInt9771 = 7;
	static final int anInt9773 = 4;
	static final int anInt9774 = 3;

	int[] anIntArray9758;
	Class249[] aClass249Array9762 = new Class249[3];
	Class375 aClass375_9766 = new Class375(1.0F, 1.0F, 1.0F, 1.0F);
	int[][] anIntArrayArray9768 = new int[3][7];
	Program program;

	Class375 aClass375_9775 = new Class375(0.0F, 0.0F, 0.0F, 0.0F);

	public Class299_Sub2(NativeToolkit toolkit) throws ProgramException {
		super(toolkit);
		method15274();
	}

	@Override
	public void method5448(int i, int i_0_) {
		switch (i) {
			case 4:
				aClass375_9766.method6159(-1);
				aClass375_9775.method6159(i_0_);
				aClass375_9775.invert();
				break;
			case 3:
				aClass375_9766.method6159(0xffffff | i_0_ & ~0xffffff);
				aClass375_9775.method6159(i_0_ & 0xffffff);
				break;
			case 2:
				aClass375_9766.method6159(i_0_);
				aClass375_9775.method6159(0);
				break;
			case 0:
				aClass375_9766.method6159(i_0_);
				aClass375_9775.method6159(0);
				break;
			case 1:
				aClass375_9766.method6159(-1);
				aClass375_9775.method6159(0);
				break;
		}
	}

	@Override
	public void method5449() {
		program.method4464(aClass249Array9762[1]);
		program.method4522();
		anIntArray9758 = anIntArrayArray9768[program.method4454()];
		program.method4473(anIntArray9758[2], 1, anInterface29_3283);
		program.method4471(anIntArray9758[4], aClass399_3285);
		method15275();
	}

	@Override
	public void method5453() {
		program.method4464(aClass249Array9762[0]);
		program.method4522();
		anIntArray9758 = anIntArrayArray9768[program.method4454()];
		method15275();
	}

	boolean method15274() throws ProgramException {
		program = toolkit.loadProgram("Sprite");
		Class480_Sub13_Sub1 wvp = program.method4521("WVPMatrix");
		Class480_Sub13_Sub1 sprite = program.method4521("SpriteSampler");
		Class480_Sub13_Sub1 mask = program.method4521("MaskSampler");
		Class480_Sub13_Sub1 class480_sub13_sub1_3_ = program.method4521("MulColour");
		Class480_Sub13_Sub1 class480_sub13_sub1_4_ = program.method4521("AddColour");
		Class480_Sub13_Sub1 spriteCoordinates = program.method4521("SpriteTexCoordMatrix");
		Class480_Sub13_Sub1 maskCoordinates = program.method4521("MaskTexCoordMatrix");

		aClass249Array9762[0] = program.method4447("Normal");
		aClass249Array9762[1] = program.method4447("Masked");
		aClass249Array9762[2] = program.method4447("AlphaTex");

		for (int i_7_ = 0; i_7_ < 3; i_7_++) {
			int i_8_ = program.indexOf(aClass249Array9762[i_7_]);
			anIntArrayArray9768[i_7_][0] = wvp.method17547(i_8_);
			anIntArrayArray9768[i_7_][1] = sprite.method17547(i_8_);
			anIntArrayArray9768[i_7_][2] = mask.method17547(i_8_);
			anIntArrayArray9768[i_7_][5] = class480_sub13_sub1_3_.method17547(i_8_);
			anIntArrayArray9768[i_7_][6] = class480_sub13_sub1_4_.method17547(i_8_);
			anIntArrayArray9768[i_7_][3] = spriteCoordinates.method17547(i_8_);
			anIntArrayArray9768[i_7_][4] = maskCoordinates.method17547(i_8_);
		}
		program.method4464(aClass249Array9762[0]);
		return true;
	}

	void method15275() {
		program.method4473(anIntArray9758[1], 0, anInterface29_3282);
		toolkit.method14735(aClass399_3284);
		program.method4451(anIntArray9758[0], aClass399_3284);
		program.method4471(anIntArray9758[3], aClass399_3281);
		program.method4468(anIntArray9758[5], aClass375_9766.aFloat4161, aClass375_9766.aFloat4160,
				aClass375_9766.aFloat4159, aClass375_9766.aFloat4162);
		program.method4468(anIntArray9758[6], aClass375_9775.aFloat4161, aClass375_9775.aFloat4160,
				aClass375_9775.aFloat4159, aClass375_9775.aFloat4162);
		toolkit.method14620(0, anInterface32_3287);
		toolkit.method14697(aClass323_3288);
		toolkit.method14707(Class333.aClass333_3598, anInt3289, 2);
	}

}