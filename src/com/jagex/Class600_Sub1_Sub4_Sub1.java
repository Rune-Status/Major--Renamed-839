package com.jagex;

public class Class600_Sub1_Sub4_Sub1 extends Class600_Sub1_Sub4 implements SceneObject {
	static final void method18061(ScriptExecutionContext class613, int i) {
		int i_16_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_16_);
		Interface class221 = Class598.loadedInterfaces[i_16_ >> 16];
		TimeUtil.method4148(class226, class221, class613, -1196475317);
	}

	static final void method18062(Widget class226, Interface class221, ScriptExecutionContext class613, int i) {
		String string = (String) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
		if (ScriptExecutionContext.method9239(string, class613) != null) {
			string = string.substring(0, string.length() - 1);
		}
		class226.anObjectArray2525 = Class562_Sub1.method16248(string, class613);
		class226.aBool2483 = true;
	}

	boolean aBool11577;
	byte aByte11578;
	Shadow aClass480_Sub31_Sub12_11579;
	Class498 aClass498_11580;
	int object;
	Model aClass143_11582;
	boolean aBool11583;
	ObjectDefinitionLoader aClass678_Sub17_11584;

	boolean aBool11585;

	boolean aBool11586;

	public Class600_Sub1_Sub4_Sub1(Class490 class490, Toolkit toolkit, ObjectDefinitionLoader loader,
			ObjectDefinition definition, int plane, int collisionPlane, int i_8_, int i_9_, int i_10_,
			boolean underwater, int i_11_, boolean bool_12_) {
		super(class490, i_8_, i_9_, i_10_, plane, collisionPlane, definition.anInt7445 * 906201759);
		aClass678_Sub17_11584 = loader;
		object = -2011950653 * definition.anInt7369;
		aBool11583 = underwater;
		aByte11578 = (byte) i_11_;
		aBool11577 = -1893691057 * definition.anInt7389 != 0 && !underwater;
		aBool11585 = bool_12_;
		aBool11586 = toolkit.method2820() && definition.aBool7383 && !aBool11583
				&& Class199.preferences.sceneryShadows.getValue() != 0;

		int i_13_ = 2048;
		if (aBool11585) {
			i_13_ |= 0x10000;
		}
		if (definition.aBool7417) {
			i_13_ |= 0x80000;
		}

		Tuple class674 = method18058(toolkit, i_13_, aBool11586);
		if (class674 != null) {
			aClass143_11582 = (Model) class674.first;
			aClass480_Sub31_Sub12_11579 = (Shadow) class674.second;

			if (aBool11585 || definition.aBool7417) {
				aClass143_11582 = aClass143_11582.method2890((byte) 0, i_13_, false);

				if (definition.aBool7417) {
					Class450 class450 = Client.aClass460_10760.method7683();
					aClass143_11582.method2937(class450.anInt5076 * -179051851, class450.anInt5075 * 428317419,
							1542605459 * class450.anInt5074, class450.anInt5077 * -1012034355);
				}
			}
		}

		method16274(1);
	}

	@Override
	public Class498 method16293(Toolkit toolkit) {
		Class397 class397 = method10164().aClass397_4507;
		if (aClass498_11580 == null) {
			aClass498_11580 = Class498.method3163((int) class397.x, (int) class397.y, (int) class397.z,
					method18055(toolkit, 0));
		}

		return aClass498_11580;
	}

	@Override
	public int method16295() {
		return null != aClass143_11582 ? aClass143_11582.minimumY() : 0;
	}

	@Override
	public int getId() {
		return -1979252017 * object;
	}

	@Override
	public boolean method212() {
		return aBool11586;
	}

	@Override
	public boolean method244() {
		return true;
	}

	@Override
	public int method339() {
		return -1050493863 * ObjectCategory.aClass541_7358.type;
	}

	@Override
	public void method335() {
		if (aClass143_11582 != null) {
			aClass143_11582.method3045();
		}
	}

	@Override
	public boolean method362() {
		return aBool11586;
	}

	@Override
	public boolean method363() {
		return true;
	}

	@Override
	public void method364(Toolkit toolkit) {
		Shadow shadow;
		if (aClass480_Sub31_Sub12_11579 == null && aBool11586) {
			Tuple<?, Shadow> tuple = method18058(toolkit, 262144, true);
			shadow = null != tuple ? tuple.second : null;
		} else {
			shadow = aClass480_Sub31_Sub12_11579;
			aClass480_Sub31_Sub12_11579 = null;
		}

		Class397 class397 = method10164().aClass397_4507;
		if (shadow != null) {
			aClass490_10378.method8362(shadow, collisionPlane, (int) class397.x, (int) class397.z, null);
		}
	}

	@Override
	public void method365(Toolkit toolkit) {
		Shadow shadow;
		if (aClass480_Sub31_Sub12_11579 == null && aBool11586) {
			Tuple tuple = method18058(toolkit, 262144, true);
			shadow = (Shadow) (null != tuple ? tuple.second : null);
		} else {
			shadow = aClass480_Sub31_Sub12_11579;
			aClass480_Sub31_Sub12_11579 = null;
		}

		Class397 class397 = method10164().aClass397_4507;
		if (null != shadow) {
			aClass490_10378.method8338(shadow, collisionPlane, (int) class397.x, (int) class397.z, null);
		}
	}

	@Override
	public void method372() {
		if (aClass143_11582 != null) {
			aClass143_11582.method3045();
		}
	}

	@Override
	public int method377() {
		return aByte11578;
	}

	@Override
	public int method48() {
		return -1979252017 * object;
	}

	@Override
	boolean method16257(Toolkit toolkit, int i, int i_5_) {
		Class379 class379 = aClass678_Sub17_11584.get(object * -1979252017).aClass379_7439;
		if (class379 != null) {
			return toolkit.method2445(i, i_5_, method10166(), class379);
		}

		Model model = method18055(toolkit, 131072);
		if (model != null) {
			Class405 class405 = method10166();
			return model.method2918(i, i_5_, class405, false, 0);
		}

		return false;
	}

	@Override
	boolean method16260() {
		if (aClass143_11582 != null) {
			return !aClass143_11582.method2940();
		}
		return true;
	}

	@Override
	boolean method16261() {
		if (aClass143_11582 != null) {
			return aClass143_11582.method2939();
		}
		return false;
	}

	@Override
	void method16262(Toolkit toolkit, Class600_Sub1 class600_sub1, int i, int i_1_, int i_2_, boolean bool, int i_3_) {
		if (class600_sub1 instanceof Class600_Sub1_Sub4_Sub1) {
			Class600_Sub1_Sub4_Sub1 class600_sub1_sub4_sub1_4_ = (Class600_Sub1_Sub4_Sub1) class600_sub1;
			if (aClass143_11582 != null && class600_sub1_sub4_sub1_4_.aClass143_11582 != null) {
				aClass143_11582.method2944(class600_sub1_sub4_sub1_4_.aClass143_11582, i, i_1_, i_2_, bool);
			}
		}
	}

	@Override
	void method16263() {
		aBool11585 = false;
		if (null != aClass143_11582) {
			aClass143_11582.updateFunctionMask(aClass143_11582.functionMask() & ~0x10000);
		}
	}

	@Override
	void method16265(Toolkit toolkit) {

	}

	@Override
	Class506 method16271(Toolkit toolkit) {
		if (aClass143_11582 == null) {
			return null;
		}

		Class405 class405 = method10166();
		Class506 class506 = Class506.method570(aBool11577);
		Class379 class379 = aClass678_Sub17_11584.get(-1979252017 * object).aClass379_7439;

		if (class379 != null) {
			aClass143_11582.method2917(class405, null, 0);
			toolkit.method2447(class405, aClass139Array10373[0], class379);
		} else {
			aClass143_11582.method2917(class405, aClass139Array10373[0], 0);
		}

		return class506;
	}

	@Override
	boolean method16302() {
		return aBool11585;
	}

	Model method18055(Toolkit toolkit, int i) {
		if (aClass143_11582 != null && toolkit.method2637(aClass143_11582.functionMask(), i) == 0) {
			return aClass143_11582;
		}

		Tuple<Model, Shadow> tuple = method18058(toolkit, i, false);
		if (null != tuple) {
			return tuple.first;
		}

		return null;
	}

	Tuple method18058(Toolkit toolkit, int i, boolean bool) {
		ObjectDefinition definition = aClass678_Sub17_11584.get(object * -1979252017);
		Ground ground;
		Ground other;

		if (aBool11583) {
			ground = aClass490_10378.aClass120Array6704[collisionPlane];
			other = aClass490_10378.aClass120Array6702[0];
		} else {
			ground = aClass490_10378.aClass120Array6702[collisionPlane];
			if (collisionPlane < 3) {
				other = aClass490_10378.aClass120Array6702[1 + collisionPlane];
			} else {
				other = null;
			}
		}

		Class397 class397 = method10164().aClass397_4507;
		return definition.method9287(toolkit, i, ObjectCategory.aClass541_7358.type * -1050493863, aByte11578, ground,
				other, (int) class397.x, (int) class397.y, (int) class397.z, bool, null);
	}

}