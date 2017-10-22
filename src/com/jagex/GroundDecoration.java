package com.jagex;

public class GroundDecoration extends Class600_Sub1_Sub4 implements SceneObject {

	public static void method18064(HuffmanCodec huffman) {
		HuffmanCodec.huffman = huffman;
	}

	boolean aBool11587;
	public Class481 aClass481_11588;
	Class498 aClass498_11589;
	boolean aBool11590 = true;

	public GroundDecoration(Class490 class490, Toolkit toolkit, ObjectDefinitionLoader loader, ObjectDefinition object,
			int i, int i_9_, int i_10_, int i_11_, int i_12_, boolean bool, int i_13_, int i_14_, int i_15_) {
		super(class490, i_10_, i_11_, i_12_, i, i_9_, object.anInt7445 * 906201759);
		aClass481_11588 = new Class481(toolkit, loader, object, -1050493863 * ObjectCategory.aClass541_7358.type, i_13_,
				i_9_, this, bool, i_14_, i_15_);
		aBool11587 = 0 != object.anInt7389 * -1893691057 && !bool;
		method16274(1);
	}

	@Override
	public Class498 method16293(Toolkit toolkit) {
		return aClass498_11589;
	}

	@Override
	public int method16295() {
		return aClass481_11588.method8173();
	}

	@Override
	public int method16307() {
		return aClass481_11588.method8175();
	}

	@Override
	public int getId() {
		return aClass481_11588.object * -38386243;
	}

	public void method18063(Class540 class540) {
		aClass481_11588.method8174(class540);
	}

	@Override
	public boolean method212() {
		return aClass481_11588.method8179();
	}

	@Override
	public boolean method244() {
		return true;
	}

	@Override
	public int method339() {
		return 126053155 * aClass481_11588.anInt6594;
	}

	@Override
	public void method335() {

	}

	@Override
	public boolean method362() {
		return aClass481_11588.method8179();
	}

	@Override
	public boolean method363() {
		return true;
	}

	@Override
	public void method364(Toolkit toolkit) {
		aClass481_11588.method8180(toolkit);
	}

	@Override
	public void method365(Toolkit toolkit) {
		aClass481_11588.method8172(toolkit);
	}

	@Override
	public void method372() {

	}

	@Override
	public int method377() {
		return -1400492407 * aClass481_11588.anInt6591;
	}

	@Override
	public int method48() {
		return aClass481_11588.object * -38386243;
	}

	@Override
	boolean method16257(Toolkit toolkit, int i, int i_2_) {
		ObjectDefinition class544 = aClass481_11588.method8206();
		if (null != class544.aClass379_7439) {
			return toolkit.method2445(i, i_2_, method10166(), class544.aClass379_7439);
		}

		Model model = aClass481_11588.method8201(toolkit, 131072, false, false);
		if (model == null) {
			return false;
		}

		return model.method2918(i, i_2_, method10166(), false, 0);
	}

	@Override
	boolean method16260() {
		return false;
	}

	@Override
	boolean method16261() {
		return aBool11590;
	}

	@Override
	final void method16262(Toolkit toolkit, Class600_Sub1 class600_sub1, int i, int i_4_, int i_5_, boolean bool,
			int i_6_) {
		throw new IllegalStateException();
	}

	@Override
	final void method16263() {
		throw new IllegalStateException();
	}

	@Override
	void method16265(Toolkit toolkit) {
		Model model = aClass481_11588.method8201(toolkit, 262144, true, true);
		if (model != null) {
			Class397 class397 = method10164().aClass397_4507;
			int x = (int) class397.x >> 9;
			int i_1_ = (int) class397.z >> 9;
			aClass481_11588.method8184(toolkit, model, method10166(), x, x, i_1_, i_1_, false);
		}
	}

	@Override
	Class506 method16271(Toolkit toolkit) {
		Model class143 = aClass481_11588.method8201(toolkit, 2048, false, true);
		if (null == class143) {
			return null;
		}
		Class405 class405 = method10166();
		Class393 class393 = method10164();
		Class506 class506 = Class506.method570(aBool11587);
		int i_7_ = (int) class393.aClass397_4507.x >> 9;
		int i_8_ = (int) class393.aClass397_4507.z >> 9;
		aClass481_11588.method8184(toolkit, class143, class405, i_7_, i_7_, i_8_, i_8_, true);
		ObjectDefinition definition = aClass481_11588.method8206();
		if (null != definition.aClass379_7439) {
			class143.method2917(class405, null, 0);
			toolkit.method2447(class405, aClass139Array10373[0], definition.aClass379_7439);
		} else {
			class143.method2917(class405, aClass139Array10373[0], 0);
		}
		if (null != aClass481_11588.particles) {
			Class137 class137 = aClass481_11588.particles.method9492();
			toolkit.method2470(class137);
		}
		aBool11590 = class143.method2939() || aClass481_11588.particles != null;
		if (aClass498_11589 == null) {
			aClass498_11589 = Class498.method3163((int) class393.aClass397_4507.x, (int) class393.aClass397_4507.y,
					(int) class393.aClass397_4507.z, class143);
		} else {
			Class545.method9300(aClass498_11589, (int) class393.aClass397_4507.x, (int) class393.aClass397_4507.y,
					(int) class393.aClass397_4507.z, class143);
		}
		return class506;
	}

	@Override
	final boolean method16302() {
		return false;
	}

}