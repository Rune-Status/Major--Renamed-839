package com.jagex;

public class Class480_Sub31_Sub19_Sub2 extends Class480_Sub31_Sub19 {
	Class255 aClass255_11733;
	float aFloat11734;
	float aFloat11735;
	float aFloat11736;

	public Class480_Sub31_Sub19_Sub2(int i, Class255 class255, float f, float f_4_) {
		super(i);
		aClass255_11733 = class255;
		aFloat11734 = f;
		aFloat11735 = f_4_;
	}

	Class480_Sub31_Sub19_Sub2(int i, Buffer buffer) {
		super(i);
		aClass255_11733 = DespawnObjectCutsceneAction.method15085(buffer.readUByte());
		aFloat11734 = buffer.readFloat();
		aFloat11735 = buffer.readFloat();
	}

	@Override
	public void method17880(float f, byte i) {
		aFloat11736 += f * aFloat11735;
	}

	@Override
	public void method17881(Class268 class268, Class405 class405, Matrix4f class399, byte i) {
		float f = (float) Math.sin(aFloat11736);
		float f_0_ = aFloat11734 * f;
		if (Class255.aClass255_2831 == aClass255_11733) {
			Class268 class268_1_;
			(class268_1_ = class268).anInt2983 = 1771748405 * (int) (1885320733 * class268_1_.anInt2983 + f_0_);
			class405.method6744(f_0_, 0.0F, 0.0F);
		} else if (Class255.aClass255_2827 == aClass255_11733) {
			Class268 class268_2_;
			(class268_2_ = class268).anInt2982 = (int) (-1797142999 * class268_2_.anInt2982 + f_0_) * 600782361;
			class405.method6744(0.0F, f_0_, 0.0F);
		} else if (Class255.aClass255_2828 == aClass255_11733) {
			Class268 class268_3_;
			(class268_3_ = class268).anInt2984 = (int) (class268_3_.anInt2984 * -196721903 + f_0_) * 994250225;
			class405.method6744(0.0F, 0.0F, f_0_);
		} else if (Class255.aClass255_2829 == aClass255_11733) {
			class405.method6739(1.0F, 0.0F, 0.0F, f_0_);
		} else if (aClass255_11733 == Class255.aClass255_2830) {
			class405.method6739(0.0F, 1.0F, 0.0F, f_0_);
		} else if (Class255.aClass255_2832 == aClass255_11733) {
			class405.method6739(0.0F, 0.0F, 1.0F, f_0_);
		}
	}

	@Override
	public void method17882(Buffer buffer, int i) {
		aClass255_11733 = DespawnObjectCutsceneAction.method15085(buffer.readUByte());
		aFloat11734 = buffer.readFloat();
		aFloat11735 = buffer.readFloat();
	}

}