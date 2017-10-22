package com.jagex;

public class Class166_Sub14 extends CutsceneAction {

	public static void method15118(Mob mob, int[] animations, int[] is_0_, int[] is_1_) {
		for (int index = 0; index < animations.length; index++) {
			int animationId = animations[index];
			int i_4_ = is_1_[index];
			int i_5_ = is_0_[index];

			for (int i_6_ = 0; 0 != i_4_ && i_6_ < mob.aClass650_Sub1_Sub1Array11537.length; i_4_ >>>= 1) {
				if (0 != (i_4_ & 0x1)) {
					if (animationId == -1) {
						mob.aClass650_Sub1_Sub1Array11537[i_6_] = null;
					} else {
						AnimationDefinition animation = AnimationDefinition.loader.get(animationId);
						int replayMode = -1719904053 * animation.replayMode;

						Class650_Sub1_Sub1 class650_sub1_sub1 = mob.aClass650_Sub1_Sub1Array11537[i_6_];
						if (null != class650_sub1_sub1 && class650_sub1_sub1.hasAnimation()) {
							if (animationId == class650_sub1_sub1.getAnimationId()) {
								if (0 == replayMode) {
									mob.aClass650_Sub1_Sub1Array11537[i_6_] = null;
									class650_sub1_sub1 = null;
								} else if (1 == replayMode) {
									class650_sub1_sub1.method13463();
									class650_sub1_sub1.anInt11454 = i_5_ * 1509478705;
								} else if (replayMode == 2) {
									class650_sub1_sub1.method13496();
								}
							} else if (739199743 * animation.priority >= class650_sub1_sub1.getAnimation().priority * 739199743) {
								mob.aClass650_Sub1_Sub1Array11537[i_6_] = null;
								class650_sub1_sub1 = null;
							}
						}

						if (class650_sub1_sub1 == null || !class650_sub1_sub1.hasAnimation()) {
							class650_sub1_sub1 = mob.aClass650_Sub1_Sub1Array11537[i_6_] = new Class650_Sub1_Sub1(mob);
							class650_sub1_sub1.update(animationId);
							class650_sub1_sub1.anInt11454 = i_5_ * 1509478705;
						}
					}
				}

				i_6_++;
			}
		}
	}

	int anInt9579;
	int anInt9580;

	Class166_Sub14(Buffer buffer) {
		super(buffer);
		anInt9579 = buffer.readUShort() * 956444073;
		anInt9580 = buffer.readUByte() * 1732025167;
	}

	@Override
	public void execute() {
		TurnMobCutsceneAction.aClass186_9434.method3616(anInt9579 * 345163417);
	}

	@Override
	boolean ready() {
		TurnMobCutsceneAction.aClass186_9434.method3685(anInt9579 * 345163417, 631741359 * anInt9580);
		return true;
	}

}