package com.jagex;

import java.util.Iterator;

public class AnimatedObject extends Class600_Sub1_Sub3 {
	int graphic;
	int anInt11725 = 0;
	Class650 aClass650_11726;
	int anInt11727 = 0;
	boolean aBool11728 = true;
	ParticleSystem particles;
	int anInt11730 = 0;

	public AnimatedObject(Class490 class490, int graphicId, int i_6_, int plane, int collisionPlane, int worldX,
			int height, int worldZ, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, boolean bool, int i_17_) {
		super(class490, plane, collisionPlane, worldX, height, worldZ, i_12_, i_13_, i_14_, i_15_, false, (byte) 0);
		graphic = graphicId * 1008259317;
		anInt11725 = i_16_ * -1776123549;
		anInt11730 = 758058859 * i_17_;
		GraphicDefinition graphic = GraphicDefinition.loader.get(-1866376355 * graphicId);

		int animation = graphic.animation * 2053507375;
		if (-1 != animation) {
			aClass650_11726 = new Class650_Sub1(this, false);
			int i_19_ = graphic.aBool7986 ? 0 : 2;

			if (bool) {
				i_19_ = 1;
			}

			aClass650_11726.method13453(animation, i_6_, i_19_, false);
		}

		method16274(1);
	}

	@Override
	public Class498 method16293(Toolkit toolkit) {
		return null;
	}

	@Override
	public int method16295() {
		return anInt11727 * -977187077;
	}

	public int method18210() {
		return anInt11730 * -1845648061;
	}

	public final boolean method18211() {
		return null != aClass650_11726 && !aClass650_11726.method13515();
	}

	public final boolean method18212() {
		return null == aClass650_11726 || aClass650_11726.method13461();
	}

	public final void method18222(int i) {
		if (null != aClass650_11726 && !aClass650_11726.method13461()) {
			aClass650_11726.method13465(i);
		}
	}

	public void method18224() {
		if (null != particles) {
			particles.method9484();
		}
	}

	@Override
	boolean method16257(Toolkit toolkit, int i, int i_20_) {
		return false;
	}

	@Override
	boolean method16260() {
		return false;
	}

	@Override
	boolean method16261() {
		return aBool11728;
	}

	@Override
	final void method16262(Toolkit toolkit, Class600_Sub1 class600_sub1, int i, int i_3_, int i_4_, boolean bool,
			int i_5_) {
		throw new IllegalStateException();
	}

	@Override
	final void method16263() {
		throw new IllegalStateException();
	}

	@Override
	void method16265(Toolkit toolkit) {
		Model model = method18213(toolkit, 0, graphic * -1866376355);
		if (null != model) {
			method18214(toolkit, model, method10166());
		}
	}

	@Override
	Class506 method16271(Toolkit toolkit) {
		Model model = method18213(toolkit, 0x800 | (anInt11725 * 210962507 != 0 ? 5 : 0), -1866376355 * graphic);
		if (null == model) {
			return null;
		}

		Class405 class405 = method10166();
		method18214(toolkit, model, class405);
		Class506 class506 = Class506.method570(false);
		model.method2917(class405, aClass139Array10373[0], 0);

		if (particles != null) {
			Class137 class137 = particles.method9492();
			toolkit.method2470(class137);
		}

		aBool11728 = model.method2939();
		anInt11727 = model.minimumY() * -668693453;
		model.method3016();
		return class506;
	}

	@Override
	final boolean method16302() {
		return false;
	}

	Model method18213(Toolkit toolkit, int i, int graphicId) {
		GraphicDefinition graphic = GraphicDefinition.loader.get(graphicId);
		Ground class120 = aClass490_10378.aClass120Array6702[plane];
		Ground class120_2_ = collisionPlane < 3 ? aClass490_10378.aClass120Array6702[1 + collisionPlane] : null;
		Class397 class397 = method10164().aClass397_4507;

		return null != aClass650_11726 && !aClass650_11726.method13461() ? graphic.method10391(toolkit, i, -1740482560
				* anInt11725, class120, class120_2_, (int) class397.x, (int) class397.y, (int) class397.z,
				aClass650_11726, (byte) 2) : graphic.method10391(toolkit, i, -1740482560 * anInt11725, class120,
				class120_2_, (int) class397.x, (int) class397.y, (int) class397.z, null, (byte) 2);
	}

	void method18214(Toolkit toolkit, Model model, Class405 class405) {
		model.method3063(class405);
		Class145[] class145s = model.method2942();
		Class115[] class115s = model.method2943();

		if ((particles == null || particles.stopped) && (null != class145s || class115s != null)) {
			particles = ParticleSystem.create(Client.tick, true);
		}

		if (particles != null) {
			particles.method9488(toolkit, Client.tick, class145s, class115s, false);
			particles.method9485(plane, aShort11457, aShort11458, aShort11464, aShort11459);
		}
	}

	static final void method916() {
		Iterator iterator = Client.animatedObjects.iterator();

		while (iterator.hasNext()) {
			CacheableAnimatedObject cacheable = (CacheableAnimatedObject) iterator.next();
			AnimatedObject animated = cacheable.animated;

			if (Client.aClass460_10760.method7687() != null && animated.method18211()) {
				Client.aClass460_10760.method7687().method8423(animated, true);
			}
		}
	}

}