package com.jagex;

public class Class340_Sub1 extends Class340 {
	public static int anInt9868;

	public int anInt9866;
	public int anInt9867;

	Class340_Sub1(Class349 class349, Class334 class334, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_,
			int i_5_, int i_6_, int i_7_, int i_8_) {
		super(class349, class334, i, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_);
		anInt9866 = 1274975047 * i_7_;
		anInt9867 = i_8_ * 2019983239;
	}

	@Override
	public Class360 method316() {
		return Class360.aClass360_3879;
	}

	public static Class340 decode(Buffer buffer) {
		Class340 class340 = Class458.method7543(buffer, -473039886);
		int i_0_ = buffer.readInt();
		int i_1_ = buffer.readInt();
		int i_2_ = buffer.readSmart32();
		return new Class340_Sub1(class340.aClass349_3630, class340.aClass334_3635, -1014966953 * class340.anInt3631,
				class340.anInt3629 * 458356303, class340.anInt3633 * 883415057, -1664223293 * class340.anInt3634,
				149441097 * class340.anInt3632, -998046321 * class340.anInt3636, class340.anInt3637 * -1918746481,
				i_0_, i_1_, i_2_);
	}

}