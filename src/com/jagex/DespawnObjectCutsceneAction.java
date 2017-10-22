package com.jagex;

public class DespawnObjectCutsceneAction extends CutsceneAction {
	public static Class255 method15085(int i) {
		if (Class255.aClass255_2831.anInt2826 * -1763837637 == i) {
			return Class255.aClass255_2831;
		} else if (Class255.aClass255_2827.anInt2826 * -1763837637 == i) {
			return Class255.aClass255_2827;
		} else if (i == Class255.aClass255_2828.anInt2826 * -1763837637) {
			return Class255.aClass255_2828;
		} else if (Class255.aClass255_2829.anInt2826 * -1763837637 == i) {
			return Class255.aClass255_2829;
		} else if (i == -1763837637 * Class255.aClass255_2830.anInt2826) {
			return Class255.aClass255_2830;
		} else if (i == -1763837637 * Class255.aClass255_2832.anInt2826) {
			return Class255.aClass255_2832;
		}

		return null;
	}

	int index;

	DespawnObjectCutsceneAction(Buffer buffer) {
		super(buffer);
		index = buffer.readUShort() * 1093318395;
	}

	@Override
	public void execute() {
		CutsceneObject.objects[229827635 * index].despawn();
	}

}