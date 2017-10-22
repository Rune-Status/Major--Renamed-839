package com.jagex;

public class Class650_Sub2 extends Class650 {
	static final void method16744(ScriptExecutionContext class613) {
		class613.anInt7924 -= -2049596966;
		int i_1_ = class613.anIntArray7942[class613.anInt7924 * 1841827045];
		int i_2_ = class613.anIntArray7942[1 + 1841827045 * class613.anInt7924];
		if (null != Client.localPlayer.appearance) {
			Client.localPlayer.appearance.equip(ItemDefinition.loader, i_2_, i_1_);
		}
	}

	Mob aClass600_Sub1_Sub3_Sub1_10565;

	public boolean aBool10566 = false;

	Class650_Sub2(Mob class600_sub1_sub3_sub1, boolean bool) {
		super(bool);
		aClass600_Sub1_Sub3_Sub1_10565 = class600_sub1_sub3_sub1;
	}

	@Override
	void method13467(AnimationDefinition animation, int i) {
		if (!aBool10566 || !aClass600_Sub1_Sub3_Sub1_10565.aClass650_11526.hasAnimation()
				|| aClass600_Sub1_Sub3_Sub1_10565.aClass650_11526.method13515()) {
			TurnMobCutsceneAction.aClass186_9434.method3714(animation, i, aClass600_Sub1_Sub3_Sub1_10565);
		}
	}
}
