package com.jagex;

public class Class650_Sub1 extends Class650 {
	static final void method16709(Widget widget, int i, byte[] is, byte[] is_1_, ScriptExecutionContext class613,
			int i_2_) {
		if (null == widget.aByteArrayArray2549) {
			if (null != is) {
				widget.aByteArrayArray2549 = new byte[11][];
				widget.aByteArrayArray2467 = new byte[11][];
				widget.anIntArray2466 = new int[11];
				widget.anIntArray2488 = new int[11];
				widget.anIntArray2380 = new int[11];
			} else {
				return;
			}
		}
		widget.aByteArrayArray2549[i] = is;
		if (null != is) {
			widget.aBool2414 = true;
		} else {
			widget.aBool2414 = false;
			for (int i_3_ = 0; i_3_ < widget.aByteArrayArray2549.length; i_3_++) {
				if (widget.aByteArrayArray2549[i_3_] != null || widget.anIntArray2380[i_3_] > 0) {
					widget.aBool2414 = true;
					break;
				}
			}
		}
		widget.aByteArrayArray2467[i] = is_1_;
	}

	Class600_Sub1 aClass600_Sub1_10550;

	Class650_Sub1(Class600_Sub1 class600_sub1, boolean bool) {
		super(bool);
		aClass600_Sub1_10550 = class600_sub1;
	}

	@Override
	void method13467(AnimationDefinition animation, int i) {
		TurnMobCutsceneAction.aClass186_9434.method3714(animation, i, aClass600_Sub1_10550);
	}

}