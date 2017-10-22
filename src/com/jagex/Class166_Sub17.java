package com.jagex;

public class Class166_Sub17 extends CutsceneAction {
	int anInt9609;
	int anInt9610;
	int anInt9611;
	Class456 aClass456_9612;
	int anInt9613;

	Class166_Sub17(Buffer buffer) {
		super(buffer);
		anInt9613 = buffer.readUShort() * 887935527;
		anInt9610 = buffer.readUByte() * -908612273;
		anInt9611 = buffer.readUByte() * -280848157;
		anInt9609 = buffer.readUByte() * 1131372961;
		aClass456_9612 = TurnMobCutsceneAction.aClass186_9434.method3609(Class171.aClass171_1952, this, anInt9613
				* -1550484073, anInt9609 * -1194278303, anInt9610 * -1857336913, Class156.aClass156_1876.method3293(),
				Class167.aClass167_1926, 0.0F, 0.0F, null, 0, anInt9611 * -413438773, false);
		if (aClass456_9612 != null) {
			aClass456_9612.method7429();
		}
	}

	@Override
	public void execute() {
		if (null != aClass456_9612) {
			aClass456_9612.method7430();
		}
	}

	@Override
	void method3389() {
		if (null != aClass456_9612) {
			aClass456_9612.method7431(50);
			TurnMobCutsceneAction.aClass186_9434.method3631(aClass456_9612);
			aClass456_9612 = null;
		}
	}

}