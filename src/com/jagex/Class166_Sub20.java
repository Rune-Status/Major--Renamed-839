package com.jagex;

public class Class166_Sub20 extends CutsceneAction {
	int anInt9634;
	int anInt9635;
	int anInt9636;
	int anInt9637;

	Class456 aClass456_9638;

	Class166_Sub20(Buffer buffer) {
		super(buffer);
		anInt9637 = buffer.readUShort() * -1323800333;
		anInt9635 = buffer.readUByte() * -1198738043;
		anInt9634 = buffer.readUByte() * 982941727;
		anInt9636 = buffer.readUByte() * 2096916675;
		aClass456_9638 = TurnMobCutsceneAction.aClass186_9434.method3609(Class171.aClass171_1952, this, anInt9637
				* -32182213, anInt9636 * -1980790805, anInt9635 * 1294269261, Class156.aClass156_1876.method3293(),
				Class167.aClass167_1926, 0.0F, 0.0F, null, 0, -1883702305 * anInt9634, false);
		if (null != aClass456_9638) {
			aClass456_9638.method7429();
		}
	}

	@Override
	public void execute() {
		if (null != aClass456_9638) {
			aClass456_9638.method7430();
		}
	}

	@Override
	void method3389() {
		if (aClass456_9638 != null) {
			aClass456_9638.method7431(50);
			TurnMobCutsceneAction.aClass186_9434.method3631(aClass456_9638);
			aClass456_9638 = null;
		}
	}

}