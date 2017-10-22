package com.jagex;

public class AnimateMobCutsceneAction extends AnimatingCutsceneAction {

	int anInt11035;
	int index;
	int anInt11037;

	AnimateMobCutsceneAction(Buffer buffer) {
		super(buffer);
		index = buffer.readUShort() * -1330115545;
		anInt11035 = buffer.readUByte() * -1793585237;
		anInt11037 = buffer.readUShort() * 1853753529;
	}

	@Override
	public void execute() {
		CutsceneMob.mobs[-1154702441 * index].getMob().method18035(graphic * -1061921263,
				988906481 * heightOffset << 16, -1659203509 * anInt9559, anInt11037 * -1155302007, false,
				anInt11035 * 2131391235);
	}

}