package com.jagex;

class AreaSoundVolumeNormaliser implements VolumeNormaliser {
	public static int method3850(int i, int i_2_, int i_3_, int i_4_) {
		i_3_ &= 0x3;
		if (i_3_ == 0) {
			return i_2_;
		}
		if (1 == i_3_) {
			return 4095 - i;
		}
		if (2 == i_3_) {
			return 4095 - i_2_;
		}
		return i;
	}

	static final void method3845(ScriptExecutionContext class613, byte i) {
		int i_0_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_0_);
		Class607.method10287(class226, class613, (byte) 0);
	}

	static final void method3846(ScriptExecutionContext class613, int i) {
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = class613.aClass288_7941.aByte3200;
	}

	static final void method3847(ScriptExecutionContext class613, int i) {
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Class628.method13100() ? 1 : 0;
	}

	static final void method3848(ScriptExecutionContext class613, byte i) {
		int i_1_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		if (i_1_ < 0 || i_1_ > 1) {
			i_1_ = 0;
		}
		Class38.method1020(1 == i_1_);
	}

	static void method3849() {
		Class63.anInt954 = 0;
		Class63.anInt939 = 517887053;
		Class63.anInt950 = -224109565;
	}

	static int method3851(FrameBuffer buffer) {
		int type = buffer.readBits(2);
		int i_6_;

		if (0 == type) {
			i_6_ = 0;
		} else if (1 == type) {
			i_6_ = buffer.readBits(5);
		} else if (type == 2) {
			i_6_ = buffer.readBits(8);
		} else {
			i_6_ = buffer.readBits(11);
		}

		return i_6_;
	}

	Class186 this$0;

	AreaSoundVolumeNormaliser(Class186 class186) {
		this$0 = class186;
	}

	@Override
	public float normalise() {
		return Class199.preferences.areaSoundsVolume.getValue() / 255.0F;
	}

}