package com.jagex;

public class Class600_Sub1_Sub3_Sub3 extends Class600_Sub1_Sub3 implements SceneObject {
	public static void method18082(int i, int i_22_, int i_23_, int i_24_) {
		Class533.aLinkedList7260.addLast(new Class522(i, i_22_, i_23_ - i, i_24_ - i_22_));
	}

	static Class272 method18083(int i) {
		if (i == 818944887 * Class272.aClass272_3006.anInt3005) {
			return Class272.aClass272_3006;
		}
		if (818944887 * Class272.aClass272_3007.anInt3005 == i) {
			return Class272.aClass272_3007;
		}
		return null;
	}

	boolean aBool11604;
	Model model;
	Class498 aClass498_11606;
	byte aByte11607;
	ObjectDefinitionLoader loader;
	byte aByte11609;
	int id;
	boolean aBool11611;
	boolean aBool11612;
	boolean aBool11613;
	Shadow shadow;
	boolean aBool11615;

	public Class600_Sub1_Sub3_Sub3(Class490 class490, Toolkit toolkit, ObjectDefinitionLoader loader,
			ObjectDefinition definition, int i, int i_9_, int i_10_, int i_11_, int i_12_, boolean bool, int i_13_,
			int i_14_, int i_15_, int i_16_, int i_17_, int i_18_, boolean bool_19_, boolean bool_20_) {
		super(class490, i, i_9_, i_10_, i_11_, i_12_, i_13_, i_14_, i_15_, i_16_, 1 == 36878635 * definition.anInt7422,
				ObjectCategory.method6714(i_17_, i_18_));
		this.loader = loader;
		id = definition.anInt7369 * 1978328041;
		collisionPlane = (byte) i_9_;
		aBool11611 = bool;
		aByte11609 = (byte) i_17_;
		aByte11607 = (byte) i_18_;
		aBool11612 = 0 != -1893691057 * definition.anInt7389 && !bool;
		aBool11613 = bool_19_;
		aBool11604 = toolkit.method2820() && definition.aBool7383 && !aBool11611
				&& Class199.preferences.sceneryShadows.getValue() != 0;
		aBool11615 = bool_20_;

		int i_21_ = 2048;
		if (aBool11613) {
			i_21_ |= 0x10000;
		}
		if (definition.aBool7417) {
			i_21_ |= 0x80000;
		}

		Tuple<Model, Shadow> tuple = method18073(toolkit, i_21_, aBool11604);
		if (tuple != null) {
			model = tuple.first;
			shadow = tuple.second;

			if (aBool11613 || definition.aBool7417) {
				model = model.method2890((byte) 0, i_21_, false);

				if (definition.aBool7417) {
					Class450 class450 = Client.aClass460_10760.method7683();
					model.method2937(-179051851 * class450.anInt5076, 428317419 * class450.anInt5075,
							class450.anInt5074 * 1542605459, class450.anInt5077 * -1012034355);
				}
			}
		}

		method16274(1);
	}

	@Override
	public Class498 method16293(Toolkit toolkit) {
		Class397 class397 = method10164().aClass397_4507;
		if (aClass498_11606 == null) {
			aClass498_11606 = Class498.method3163((int) class397.x, (int) class397.y, (int) class397.z,
					method18072(toolkit, 0));
		}
		return aClass498_11606;
	}

	@Override
	public int method16295() {
		return model != null ? model.minimumY() : 0;
	}

	@Override
	public int getId() {
		return 2076385829 * id;
	}

	public int method18074(int i) {
		return model != null ? model.method2920() / 4 : 15;
	}

	@Override
	public boolean method212() {
		return aBool11604;
	}

	@Override
	public boolean method244() {
		return aBool11615;
	}

	@Override
	public int method339() {
		return aByte11609;
	}

	@Override
	public void method335() {
		if (null != model) {
			model.method3045();
		}
	}

	@Override
	public boolean method362() {
		return aBool11604;
	}

	@Override
	public boolean method363() {
		return aBool11615;
	}

	@Override
	public void method364(Toolkit toolkit) {
		Shadow shadow;
		if (null == this.shadow && aBool11604) {
			Tuple<Model, Shadow> tuple = method18073(toolkit, 262144, true);
			shadow = tuple != null ? tuple.second : null;
		} else {
			shadow = this.shadow;
			this.shadow = null;
		}

		Class397 class397 = method10164().aClass397_4507;
		if (shadow != null) {
			aClass490_10378.method8362(shadow, collisionPlane, (int) class397.x, (int) class397.z, null);
		}
	}

	@Override
	public void method365(Toolkit toolkit) {
		Shadow shadow;
		if (null == this.shadow && aBool11604) {
			Tuple<Model, Shadow> tuple = method18073(toolkit, 262144, true);
			shadow = tuple != null ? tuple.second : null;
		} else {
			shadow = this.shadow;
			this.shadow = null;
		}

		Class397 class397 = method10164().aClass397_4507;
		if (null != shadow) {
			aClass490_10378.method8338(shadow, collisionPlane, (int) class397.x, (int) class397.z, null);
		}
	}

	@Override
	public void method372() {
		if (null != model) {
			model.method3045();
		}
	}

	@Override
	public int method377() {
		return aByte11607;
	}

	@Override
	public int method48() {
		return 2076385829 * id;
	}

	@Override
	boolean method16257(Toolkit toolkit, int i, int i_3_) {
		Class379 class379 = loader.get(id * 2076385829).aClass379_7439;
		if (class379 != null) {
			return toolkit.method2445(i, i_3_, method10166(), class379);
		}
		Model model = method18072(toolkit, 131072);
		if (model != null) {
			Class405 class405 = method10166();
			return model.method2918(i, i_3_, class405, false, 0);
		}
		return false;
	}

	@Override
	boolean method16260() {
		if (model != null) {
			return !model.method2940();
		}
		return true;
	}

	@Override
	boolean method16261() {
		if (null != model) {
			return model.method2939();
		}
		return false;
	}

	@Override
	void method16262(Toolkit toolkit, Class600_Sub1 class600_sub1, int i, int i_5_, int i_6_, boolean bool, int i_7_) {
		if (class600_sub1 instanceof Class600_Sub1_Sub5_Sub1) {
			Class600_Sub1_Sub5_Sub1 class600_sub1_sub5_sub1 = (Class600_Sub1_Sub5_Sub1) class600_sub1;
			if (null != model && class600_sub1_sub5_sub1.aClass143_11591 != null) {
				model.method2944(class600_sub1_sub5_sub1.aClass143_11591, i, i_5_, i_6_, bool);
			}
		} else if (class600_sub1 instanceof Class600_Sub1_Sub3_Sub3) {
			Class600_Sub1_Sub3_Sub3 class600_sub1_sub3_sub3_8_ = (Class600_Sub1_Sub3_Sub3) class600_sub1;
			if (null != model && class600_sub1_sub3_sub3_8_.model != null) {
				model.method2944(class600_sub1_sub3_sub3_8_.model, i, i_5_, i_6_, bool);
			}
		}
	}

	@Override
	void method16263() {
		aBool11613 = false;
		if (null != model) {
			model.updateFunctionMask(model.functionMask() & ~0x10000);
		}
	}

	@Override
	void method16265(Toolkit toolkit) {

	}

	@Override
	Class506 method16271(Toolkit toolkit) {
		if (null == model) {
			return null;
		}

		Class405 class405 = method10166();
		Class506 class506 = Class506.method570(aBool11612);
		Class379 class379 = loader.get(id * 2076385829).aClass379_7439;

		if (class379 != null) {
			model.method2917(class405, null, 0);
			toolkit.method2447(class405, aClass139Array10373[0], class379);
		} else {
			model.method2917(class405, aClass139Array10373[0], 0);
		}

		return class506;
	}

	@Override
	boolean method16302() {
		return aBool11613;
	}

	Model method18072(Toolkit toolkit, int i) {
		if (model != null && toolkit.method2637(model.functionMask(), i) == 0) {
			return model;
		}
		Tuple<Model, Shadow> tuple = method18073(toolkit, i, false);
		if (null != tuple) {
			return tuple.first;
		}
		return null;
	}

	Tuple<Model, Shadow> method18073(Toolkit toolkit, int i, boolean bool) {
		ObjectDefinition definition = loader.get(id * 2076385829);
		Ground class120;
		Ground class120_2_;

		if (aBool11611) {
			class120 = aClass490_10378.aClass120Array6704[collisionPlane];
			class120_2_ = aClass490_10378.aClass120Array6702[0];
		} else {
			class120 = aClass490_10378.aClass120Array6702[collisionPlane];
			if (collisionPlane < 3) {
				class120_2_ = aClass490_10378.aClass120Array6702[1 + collisionPlane];
			} else {
				class120_2_ = null;
			}
		}

		Class397 class397 = method10164().aClass397_4507;
		return definition.method9287(toolkit, i,
				aByte11609 != ObjectCategory.aClass541_7357.type * -1050493863 ? (int) aByte11609 : -1050493863
						* ObjectCategory.aClass541_7338.type, aByte11609 == -1050493863
						* ObjectCategory.aClass541_7357.type ? aByte11607 + 4 : aByte11607, class120, class120_2_,
				(int) class397.x, (int) class397.y, (int) class397.z, bool, null);
	}

}