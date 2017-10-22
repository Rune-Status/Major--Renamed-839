package com.jagex;

import java.util.Arrays;

public class Class166_Sub19 extends CutsceneAction {
	public static Sprite aClass116_9633;

	public static Class562_Sub1 method15132(int i) {
		if (!Class572.aBool7655 || i < Class80.anInt2578 * -910063499 || i > -397285031 * Class572.anInt7654) {
			return null;
		}
		return Class289_Sub1.aClass562_Sub1Array9823[i - -910063499 * Class80.anInt2578];
	}

	int index;
	int animation;
	int anInt9631;
	int[] animations;

	Class166_Sub19(Buffer buffer) {
		super(buffer);

		index = buffer.readUShort() * 677979063;
		animations = new int[4];
		animation = buffer.readSmart32() * -715148741;
		Arrays.fill(animations, 0, animations.length, animation * 306075379);
		anInt9631 = buffer.readInt() * -1092967349;
	}

	@Override
	public void execute() {
		Mob mob = CutsceneMob.mobs[-1394857465 * index].getMob();
		if (0 == anInt9631 * -1936259741) {
			Mob.method8795(mob, animations, 0, false);
		} else {
			Class166_Sub14.method15118(mob, new int[] { animation * 306075379 }, new int[] { 0 }, new int[] { anInt9631
					* -1936259741 });
		}
	}

	@Override
	boolean ready() {
		AnimationDefinition animation = AnimationDefinition.loader.get(306075379 * this.animation);
		return animation.ready();
	}
}
