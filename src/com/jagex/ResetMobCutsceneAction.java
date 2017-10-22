package com.jagex;

public class ResetMobCutsceneAction extends CutsceneAction {
	static int anInt9558;

	int index;

	ResetMobCutsceneAction(Buffer buffer) {
		super(buffer);
		index = buffer.readUShort() * -64024015;
	}

	@Override
	public void execute() {
		CutsceneMob.mobs[index * 1865746129].reset();
	}

}