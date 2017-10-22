package com.jagex;

public class Class166_Sub13 extends CutsceneAction {
	int anInt9577;
	int anInt9578;

	Class166_Sub13(Buffer buffer) {
		super(buffer);
		anInt9577 = buffer.readUShort() * -1332905433;
		anInt9578 = buffer.readUByte() * 1675814861;
	}

	@Override
	public void execute() {
		TurnMobCutsceneAction.aClass186_9434.method3621(970085783 * anInt9577, anInt9578 * -2083758843);
	}

}