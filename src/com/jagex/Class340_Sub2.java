package com.jagex;

public class Class340_Sub2 extends Class340 {
	public static Class640 method15396(short i) {
		if (null == Class23.aClass640_326) {
			return Class640.aClass640_8140;
		}
		return Class23.aClass640_326;
	}

	public static final void method15397(int i) {
		Client.aBool10814 = true;
	}

	public static int method15398(int i, short i_12_) {
		if (i == 2022909907 * Class495_Sub1.anInt10345) {
			return Class495_Sub1.aBool10336 ? 1 : 0;
		}
		if (Class495_Sub1.anInt10317 * -368197735 == i) {
			return Class495_Sub1.aBool10343 ? 1 : 0;
		}
		if (-1518567513 * Class495_Sub1.anInt10337 == i) {
			return Class495_Sub1.aBool10344 ? 1 : 0;
		}
		return -1;
	}

	static final void method15399(ScriptExecutionContext class613, byte i) {
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.sceneryShadows
				.supported() ? 1 : 0;
	}

	static void method15400(Class636 class636) {
		Class34.aClass636_454 = class636;
		Class512.aString7005 = null;
	}

	public int anInt9914;

	public int anInt9915;

	public int anInt9916;

	public int anInt9917;

	public int anInt9918;

	public int anInt9919;

	Class340_Sub2(Class349 class349, Class334 class334, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_,
			int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_) {
		super(class349, class334, i, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_);
		anInt9918 = 758021531 * i_6_;
		anInt9919 = i_7_ * -2088487981;
		anInt9916 = 690711181 * i_8_;
		anInt9917 = i_9_ * 2060195781;
		anInt9915 = -496452639 * i_10_;
		anInt9914 = i_11_ * 1166413185;
	}

	@Override
	public Class360 method316() {
		return Class360.aClass360_3880;
	}

	public static Class340 decode(Buffer buffer) {
		Class340 class340 = Class458.method7543(buffer, -863439756);
		int i_1_ = buffer.readSmart32();
		int i_2_ = buffer.readSmart32();
		int i_3_ = buffer.readSmart32();
		int i_4_ = buffer.readSmart32();
		int i_5_ = buffer.readSmart32();
		int i_6_ = buffer.readSmart32();
		return new Class340_Sub2(class340.aClass349_3630, class340.aClass334_3635, -1014966953 * class340.anInt3631,
				class340.anInt3629 * 458356303, class340.anInt3633 * 883415057, -1664223293 * class340.anInt3634,
				class340.anInt3632 * 149441097, -998046321 * class340.anInt3636, class340.anInt3637 * -1918746481,
				i_1_, i_2_, i_3_, i_4_, i_5_, i_6_);
	}
}
