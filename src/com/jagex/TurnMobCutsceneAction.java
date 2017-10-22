package com.jagex;

public class TurnMobCutsceneAction extends CutsceneAction {
	public static int anInt9433;
	public static Class186 aClass186_9434;
	static int anInt9435;

	static void resetCpuPreference() {
		if (Engine.processorCount * 804666615 > 1) {
			Class199.preferences.setValue(Class199.preferences.cpu, 4);
		} else {
			Class199.preferences.setValue(Class199.preferences.cpu, 2);
		}
	}

	int index;
	int direction;

	TurnMobCutsceneAction(Buffer buffer) {
		super(buffer);
		index = buffer.readUShort() * 231307673;
		direction = buffer.readUShort() * -1100864651;
	}

	@Override
	public void execute() {
		CutsceneMob.mobs[1273809577 * index].getMob().turn(1064391901 * direction, true);
	}

}