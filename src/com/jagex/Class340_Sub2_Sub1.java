package com.jagex;

public class Class340_Sub2_Sub1 extends Class340_Sub2 {
	public int anInt11117;

	Class340_Sub2_Sub1(Class349 class349, Class334 class334, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_,
			int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_) {
		super(class349, class334, i, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_, i_6_, i_7_, i_8_, i_9_, i_10_, i_11_);
		anInt11117 = 1186365255 * i_12_;
	}

	@Override
	public Class360 method316() {
		return Class360.aClass360_3886;
	}

	public static Class340 decode(Buffer buffer) {
		Class340_Sub2 class340_sub2 = (Class340_Sub2) Class340_Sub2.decode(buffer);
		int i_1_ = buffer.readShort();
		return new Class340_Sub2_Sub1(class340_sub2.aClass349_3630, class340_sub2.aClass334_3635, -1014966953
				* class340_sub2.anInt3631, 458356303 * class340_sub2.anInt3629, 883415057 * class340_sub2.anInt3633,
				-1664223293 * class340_sub2.anInt3634, class340_sub2.anInt3632 * 149441097, -998046321
						* class340_sub2.anInt3636, -1918746481 * class340_sub2.anInt3637,
				class340_sub2.anInt9918 * 45588627, class340_sub2.anInt9919 * 582982747, class340_sub2.anInt9916
						* -1932564411, -286699763 * class340_sub2.anInt9917, class340_sub2.anInt9915 * 1958266913,
				-791661951 * class340_sub2.anInt9914, i_1_);
	}
}
