package com.jagex;

class Class449 implements Interface37 {
	static final void method7388(Mob mob) {
		Class650_Sub2 class650_sub2 = mob.aClass650_Sub2_11525;
		if (class650_sub2.hasAnimation() && class650_sub2.method13465(1) && class650_sub2.method13461()) {
			if (class650_sub2.aBool10566) {
				class650_sub2.method13452(mob.method17958().method8824(), false, true);
				class650_sub2.aBool10566 = class650_sub2.hasAnimation();
			}

			class650_sub2.method13463();
		}

		for (int i_0_ = 0; i_0_ < mob.aClass468Array11520.length; i_0_++) {
			if (-1 != -2008549027 * mob.aClass468Array11520[i_0_].graphic) {
				Class650 class650 = mob.aClass468Array11520[i_0_].aClass650_6484;
				if (class650.method13515()) {
					GraphicDefinition graphic = GraphicDefinition.loader.get(mob.aClass468Array11520[i_0_].graphic
							* -2008549027);
					AnimationDefinition animation = class650.getAnimation();
					if (graphic.aBool7986) {
						if (3 == animation.animatingPrecedence * -999236133) {
							if (135669775 * mob.anInt11550 > 0 && mob.anInt11560 * -589638007 <= Client.tick
									&& mob.anInt11522 * -1506188915 < Client.tick) {
								class650.update(-1);
								mob.aClass468Array11520[i_0_].graphic = 738188555;
								continue;
							}
						} else if (animation.animatingPrecedence * -999236133 == 1 && 135669775 * mob.anInt11550 > 0
								&& -589638007 * mob.anInt11560 <= Client.tick
								&& mob.anInt11522 * -1506188915 < Client.tick) {
							continue;
						}
					}
				}
				if (class650.method13465(1) && class650.method13461()) {
					class650.update(-1);
					mob.aClass468Array11520[i_0_].graphic = 738188555;
				}
			}
		}
		Class650 class650 = mob.aClass650_11526;
		do {
			if (class650.hasAnimation()) {
				AnimationDefinition animation = class650.getAnimation();
				if (3 == -999236133 * animation.animatingPrecedence) {
					if (mob.anInt11550 * 135669775 > 0 && mob.anInt11560 * -589638007 <= Client.tick
							&& -1506188915 * mob.anInt11522 < Client.tick) {
						mob.anIntArray11538 = null;
						class650.update(-1);
						break;
					}
				} else if (-999236133 * animation.animatingPrecedence == 1) {
					if (135669775 * mob.anInt11550 > 0 && -589638007 * mob.anInt11560 <= Client.tick
							&& mob.anInt11522 * -1506188915 < Client.tick) {
						class650.method13462(1);
						break;
					}
					class650.method13462(0);
				}
				if (class650.method13465(1) && class650.method13461()) {
					mob.anIntArray11538 = null;
					class650.update(-1);
				}
			}
		} while (false);
		for (int i_1_ = 0; i_1_ < mob.aClass650_Sub1_Sub1Array11537.length; i_1_++) {
			Class650_Sub1_Sub1 class650_sub1_sub1 = mob.aClass650_Sub1_Sub1Array11537[i_1_];

			if (class650_sub1_sub1 != null) {
				if (class650_sub1_sub1.anInt11454 * 1111156689 > 0) {
					class650_sub1_sub1.anInt11454 -= 1509478705;
				} else if (class650_sub1_sub1.method13465(1) && class650_sub1_sub1.method13461()) {
					mob.aClass650_Sub1_Sub1Array11537[i_1_] = null;
				}
			}
		}
	}

	static final void method7389(int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
		if (!Widget.loadInterface(i, null)) {
			if (i_8_ != -1) {
				Client.aBoolArray10850[i_8_] = true;
			} else {
				for (int i_10_ = 0; i_10_ < 104; i_10_++) {
					Client.aBoolArray10850[i_10_] = true;
				}
			}
		} else {
			Widget.method587(Class598.loadedInterfaces[i].method4158(), -1, i_2_, i_3_, i_4_, i_5_, i_6_, i_7_, i_8_,
					i_8_ < 0);
		}
	}

	Class459 this$0;

	Class449(Class459 class459) {
		this$0 = class459;
	}

	@Override
	public void method172(int i) {
		this$0.method7575(true);
	}

	@Override
	public void method233() {
		this$0.method7575(true);
	}

	@Override
	public void method98() {
		this$0.method7575(true);
	}

}