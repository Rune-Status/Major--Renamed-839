package com.jagex;

public class Class600_Sub1_Sub5_Sub1 extends Class600_Sub1_Sub5 implements SceneObject {
	static int[] anIntArray11600 = { 1, 2, 4, 8 };
	static int[] anIntArray11603 = { 16, 32, 64, 128 };

	static final void method18071(ScriptExecutionContext class613, int i) {
		class613.anInt7924 -= -1853823602;
		int i_17_ = class613.anIntArray7942[1841827045 * class613.anInt7924];
		int i_18_ = class613.anIntArray7942[1 + class613.anInt7924 * 1841827045];
		int i_19_ = class613.anIntArray7942[2 + class613.anInt7924 * 1841827045];
		int i_20_ = class613.anIntArray7942[3 + class613.anInt7924 * 1841827045];
		int i_21_ = class613.anIntArray7942[class613.anInt7924 * 1841827045 + 4];
		int i_22_ = class613.anIntArray7942[5 + class613.anInt7924 * 1841827045];
		Class456 class456 = TurnMobCutsceneAction.aClass186_9434.method3609(Class171.aClass171_1947,
				TurnMobCutsceneAction.aClass186_9434, i_17_, i_18_, i_20_, Class156.aClass156_1876.method3293(),
				Class167.aClass167_1926, 0.0F, 0.0F, null, 0, i_21_, false);
		if (null != class456) {
			TurnMobCutsceneAction.aClass186_9434.method3593(class456, i_22_, i_19_, 1333460900);
		}
	}

	Model aClass143_11591;
	byte aByte11592;
	boolean aBool11593;
	boolean aBool11594;
	Shadow aClass480_Sub31_Sub12_11595;
	Class498 aClass498_11596;
	int anInt11597;
	byte aByte11598;
	ObjectDefinitionLoader aClass678_Sub17_11599;
	boolean aBool11601;

	boolean aBool11602;

	public Class600_Sub1_Sub5_Sub1(Class490 class490, Toolkit class134, ObjectDefinitionLoader class678_sub17,
			ObjectDefinition class544, int i, int i_9_, int i_10_, int i_11_, int i_12_, boolean bool, int i_13_,
			int i_14_, boolean bool_15_) {
		super(class490, i_10_, i_11_, i_12_, i, i_9_, ReflectiveDefinitionProvider.method13896(i_13_, i_14_, (byte) 58));
		aClass678_Sub17_11599 = class678_sub17;
		anInt11597 = -1365917065 * class544.anInt7369;
		aBool11593 = bool;
		aByte11592 = (byte) i_13_;
		aByte11598 = (byte) i_14_;
		aBool11601 = class544.anInt7389 * -1893691057 != 0 && !bool;
		aBool11602 = bool_15_;
		aBool11594 = class134.method2820() && class544.aBool7383 && !aBool11593
				&& Class199.preferences.sceneryShadows.getValue() != 0;
		int i_16_ = 2048;
		if (aBool11602) {
			i_16_ |= 0x10000;
		}
		if (class544.aBool7417) {
			i_16_ |= 0x80000;
		}
		Tuple class674 = method18067(class134, i_16_, aBool11594, -2031634851);
		if (class674 != null) {
			aClass143_11591 = (Model) class674.first;
			aClass480_Sub31_Sub12_11595 = (Shadow) class674.second;
			if (aBool11602 || class544.aBool7417) {
				aClass143_11591 = aClass143_11591.method2890((byte) 0, i_16_, false);
				if (class544.aBool7417) {
					Class450 class450 = Client.aClass460_10760.method7683();
					aClass143_11591.method2937(class450.anInt5076 * -179051851, 428317419 * class450.anInt5075,
							class450.anInt5074 * 1542605459, -1012034355 * class450.anInt5077);
				}
			}
		}
		method16274(1);
	}

	@Override
	public Class498 method16293(Toolkit toolkit) {
		Class397 class397 = method10164().aClass397_4507;
		if (aClass498_11596 == null) {
			aClass498_11596 = Class498.method3163((int) class397.x, (int) class397.y, (int) class397.z,
					method18066(toolkit, 0, (byte) -79));
		}
		return aClass498_11596;
	}

	@Override
	public int method16295() {
		return aClass143_11591 != null ? aClass143_11591.minimumY() : 0;
	}

	@Override
	public int getId() {
		return -1956476677 * anInt11597;
	}

	@Override
	public boolean method212() {
		return aBool11594;
	}

	@Override
	public boolean method244() {
		return true;
	}

	@Override
	public int method339() {
		return aByte11592;
	}

	@Override
	public void method335() {
		if (null != aClass143_11591) {
			aClass143_11591.method3045();
		}
	}

	@Override
	public boolean method362() {
		return aBool11594;
	}

	@Override
	public boolean method363() {
		return true;
	}

	@Override
	public void method364(Toolkit toolkit) {
		Shadow class480_sub31_sub12;
		if (null == aClass480_Sub31_Sub12_11595 && aBool11594) {
			Tuple class674 = method18067(toolkit, 262144, true, 1222430926);
			class480_sub31_sub12 = (Shadow) (class674 != null ? class674.second : null);
		} else {
			class480_sub31_sub12 = aClass480_Sub31_Sub12_11595;
			aClass480_Sub31_Sub12_11595 = null;
		}
		Class397 class397 = method10164().aClass397_4507;
		if (class480_sub31_sub12 != null) {
			aClass490_10378.method8362(class480_sub31_sub12, collisionPlane, (int) class397.x, (int) class397.z, null);
		}
	}

	@Override
	public void method365(Toolkit toolkit) {
		Shadow class480_sub31_sub12;
		if (null == aClass480_Sub31_Sub12_11595 && aBool11594) {
			Tuple class674 = method18067(toolkit, 262144, true, 552225746);
			class480_sub31_sub12 = (Shadow) (class674 != null ? class674.second : null);
		} else {
			class480_sub31_sub12 = aClass480_Sub31_Sub12_11595;
			aClass480_Sub31_Sub12_11595 = null;
		}
		Class397 class397 = method10164().aClass397_4507;
		if (class480_sub31_sub12 != null) {
			aClass490_10378.method8338(class480_sub31_sub12, collisionPlane, (int) class397.x, (int) class397.z, null);
		}
	}

	@Override
	public void method372() {
		if (null != aClass143_11591) {
			aClass143_11591.method3045();
		}
	}

	@Override
	public int method377() {
		return aByte11598;
	}

	@Override
	public int method48() {
		return -1956476677 * anInt11597;
	}

	@Override
	boolean method16257(Toolkit toolkit, int i, int i_3_) {
		Class379 class379 = aClass678_Sub17_11599.get(anInt11597 * -1956476677).aClass379_7439;
		if (null != class379) {
			return toolkit.method2445(i, i_3_, method10166(), class379);
		}
		Model class143 = method18066(toolkit, 131072, (byte) 0);
		if (class143 != null) {
			Class405 class405 = method10166();
			return class143.method2918(i, i_3_, class405, false, 0);
		}
		return false;
	}

	@Override
	boolean method16260() {
		if (aClass143_11591 != null) {
			return !aClass143_11591.method2940();
		}
		return true;
	}

	@Override
	boolean method16261() {
		if (aClass143_11591 != null) {
			return aClass143_11591.method2939();
		}
		return false;
	}

	@Override
	void method16262(Toolkit toolkit, Class600_Sub1 class600_sub1, int i, int i_5_, int i_6_, boolean bool, int i_7_) {
		if (class600_sub1 instanceof Class600_Sub1_Sub5_Sub1) {
			Class600_Sub1_Sub5_Sub1 class600_sub1_sub5_sub1_8_ = (Class600_Sub1_Sub5_Sub1) class600_sub1;
			if (null != aClass143_11591 && null != class600_sub1_sub5_sub1_8_.aClass143_11591) {
				aClass143_11591.method2944(class600_sub1_sub5_sub1_8_.aClass143_11591, i, i_5_, i_6_, bool);
			}
		} else if (class600_sub1 instanceof Class600_Sub1_Sub3_Sub3) {
			Class600_Sub1_Sub3_Sub3 class600_sub1_sub3_sub3 = (Class600_Sub1_Sub3_Sub3) class600_sub1;
			if (aClass143_11591 != null && null != class600_sub1_sub3_sub3.model) {
				aClass143_11591.method2944(class600_sub1_sub3_sub3.model, i, i_5_, i_6_, bool);
			}
		}
	}

	@Override
	void method16263() {
		aBool11602 = false;
		if (null != aClass143_11591) {
			aClass143_11591.updateFunctionMask(aClass143_11591.functionMask() & ~0x10000);
		}
	}

	@Override
	void method16265(Toolkit toolkit) {

	}

	@Override
	Class506 method16271(Toolkit toolkit) {
		if (aClass143_11591 == null) {
			return null;
		}
		Class405 class405 = method10166();
		Class506 class506 = Class506.method570(aBool11601);
		Class379 class379 = aClass678_Sub17_11599.get(-1956476677 * anInt11597).aClass379_7439;
		if (class379 != null) {
			aClass143_11591.method2917(class405, null, 0);
			toolkit.method2447(class405, aClass139Array10373[0], class379);
		} else {
			aClass143_11591.method2917(class405, aClass139Array10373[0], 0);
		}
		return class506;
	}

	@Override
	boolean method16302() {
		return aBool11602;
	}

	Model method18066(Toolkit class134, int i, byte i_0_) {
		if (aClass143_11591 != null && class134.method2637(aClass143_11591.functionMask(), i) == 0) {
			return aClass143_11591;
		}
		Tuple class674 = method18067(class134, i, false, -1724301459);
		if (class674 != null) {
			return (Model) class674.first;
		}
		return null;
	}

	Tuple method18067(Toolkit class134, int i, boolean bool, int i_1_) {
		ObjectDefinition class544 = aClass678_Sub17_11599.get(-1956476677 * anInt11597);
		Ground class120;
		Ground class120_2_;
		if (aBool11593) {
			class120 = aClass490_10378.aClass120Array6704[collisionPlane];
			class120_2_ = aClass490_10378.aClass120Array6702[0];
		} else {
			class120 = aClass490_10378.aClass120Array6702[collisionPlane];
			if (collisionPlane < 3) {
				class120_2_ = aClass490_10378.aClass120Array6702[collisionPlane + 1];
			} else {
				class120_2_ = null;
			}
		}
		Class397 class397 = method10164().aClass397_4507;
		return class544.method9287(class134, i, aByte11592, aByte11598, class120, class120_2_, (int) class397.x,
				(int) class397.y, (int) class397.z, bool, null);
	}
}
