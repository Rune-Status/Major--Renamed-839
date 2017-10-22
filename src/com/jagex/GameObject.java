package com.jagex;

public class GameObject extends Class600_Sub1_Sub3 implements SceneObject {
	static void method18054(Widget class226, Class211 class211, int i, int i_18_, int i_19_, int i_20_, int i_21_,
			long l) {
		int i_22_ = i_19_ * i_19_ + i_20_ * i_20_;
		if (i_22_ <= l) {
			int i_23_;
			if (Connection.anInt7170 * 1212513917 == 3) {
				i_23_ = (int) (Class369.aClass261_Sub1_4079.method4843() * 2607.5945876176133) + Client.anInt10699
						* 1093165775 & 0x3fff;
			} else if (6 == Connection.anInt7170 * 1212513917) {
				i_23_ = (int) Client.aFloat10787 & 0x3fff;
			} else {
				i_23_ = (int) Client.aFloat10787 + 1093165775 * Client.anInt10699 & 0x3fff;
			}
			int i_24_ = Class373.SINE[i_23_];
			int i_25_ = Class373.COSINE[i_23_];
			if (1212513917 * Connection.anInt7170 != 6) {
				i_24_ = i_24_ * 256 / (Client.anInt10701 * -1894746741 + 256);
				i_25_ = 256 * i_25_ / (-1894746741 * Client.anInt10701 + 256);
			}
			int i_26_ = i_19_ * i_25_ + i_20_ * i_24_ >> 14;
			int i_27_ = i_20_ * i_25_ - i_24_ * i_19_ >> 14;
			Sprite class116 = Client.mapmarkers[i_21_];
			int i_28_ = class116.method2157();
			int i_29_ = class116.method2119();
			int i_30_ = 688089097 * class226.width / 2 + i_26_ - i_28_ / 2;
			int i_31_ = i_28_ + i_30_;
			int i_32_ = class226.height * 1362321717 / 2 + -i_27_ - i_29_;
			int i_33_ = i_32_ + i_29_;
			boolean bool;
			if (class211 != null) {
				bool = !class211.method4012(i_30_, i_32_, 1356308092) || !class211.method4012(i_31_, i_32_, 1356308092)
						|| !class211.method4012(i_30_, i_33_, 1356308092)
						|| !class211.method4012(i_31_, i_33_, 1356308092);
			} else {
				int i_34_ = i_29_;
				int i_35_ = i_28_ / 2;
				bool = i_32_ <= -i_34_ || i_33_ >= class226.height * 1362321717 || i_30_ <= -i_35_
						|| i_31_ >= i_35_ + class226.width * 688089097;
			}
			if (bool) {
				double d = Math.atan2(i_26_, i_27_);
				double d_36_ = Math.atan2(Math.abs(i_26_), Math.abs(i_27_));
				double d_37_ = Math.atan2(class226.width * 688089097 / 2, 1362321717 * class226.height / 2);
				double d_39_ = 0.0;
				int i_40_;
				if (d_36_ < d_37_) {
					d_39_ = 1.5707963267948966 - d;
					i_40_ = 1362321717 * class226.height / 2;
				} else {
					d_39_ = d;
					i_40_ = 688089097 * class226.width / 2;
				}
				int i_41_ = Math.abs((int) -(i_40_ * Math.sin(1.5707963267948966) / Math.sin(d_39_)));
				Class264.hintMapEdges[i_21_].method2086(i + class226.width * 688089097 / 2.0F + 0.0F, i_18_
						+ 1362321717 * class226.height / 2.0F - 0.0F, Class264.hintMapEdges[i_21_].scaleWidth() / 2.0F,
						i_41_, 4096, (int) (65535.0 * (-d / 6.283185307179586)));
			} else if (class211 != null) {
				class116.method2081(i + i_30_, i_18_ + i_32_, class211.aClass129_2183, i, i_18_);
			} else {
				class116.method2079(i_30_ + i, i_32_ + i_18_);
			}
		}
	}

	Class498 aClass498_11572;
	boolean aBool11573;
	boolean aBool11574 = true;
	public Class481 aClass481_11575;

	boolean aBool11576;

	public GameObject(Class490 class490, Toolkit toolkit, ObjectDefinitionLoader loader, ObjectDefinition definition,
			int plane, int collisionPlane, int i_6_, int i_7_, int i_8_, boolean underwater, int localX, int i_10_,
			int localZ, int i_12_, int type, int orientation, int animation, int i_16_, boolean bool_17_) {
		super(class490, plane, collisionPlane, i_6_, i_7_, i_8_, localX, i_10_, localZ, i_12_,
				1 == 36878635 * definition.anInt7422, Drawable.method4771(type, orientation));
		aClass481_11575 = new Class481(toolkit, loader, definition, type, orientation, collisionPlane, this,
				underwater, animation, i_16_);
		aBool11573 = definition.anInt7389 * -1893691057 != 0 && !underwater;
		aBool11576 = bool_17_;
		method16274(1);
	}

	@Override
	public Class498 method16293(Toolkit toolkit) {
		return aClass498_11572;
	}

	@Override
	public int method16295() {
		return aClass481_11575.method8173();
	}

	@Override
	public int method16307() {
		return aClass481_11575.method8175();
	}

	@Override
	public int getId() {
		return aClass481_11575.object * -38386243;
	}

	public void method18048(Class540 class540) {
		aClass481_11575.method8174(class540);
	}

	@Override
	public boolean method212() {
		return aClass481_11575.method8179();
	}

	@Override
	public boolean method244() {
		return aBool11576;
	}

	@Override
	public int method339() {
		return aClass481_11575.anInt6594 * 126053155;
	}

	@Override
	public void method335() {

	}

	@Override
	public boolean method362() {
		return aClass481_11575.method8179();
	}

	@Override
	public boolean method363() {
		return aBool11576;
	}

	@Override
	public void method364(Toolkit toolkit) {
		aClass481_11575.method8180(toolkit);
	}

	@Override
	public void method365(Toolkit toolkit) {
		aClass481_11575.method8172(toolkit);
	}

	@Override
	public void method372() {

	}

	@Override
	public int method377() {
		return -1400492407 * aClass481_11575.anInt6591;
	}

	@Override
	public int method48() {
		return aClass481_11575.object * -38386243;
	}

	@Override
	boolean method16257(Toolkit toolkit, int i, int i_0_) {
		ObjectDefinition class544 = aClass481_11575.method8206();
		if (null != class544.aClass379_7439) {
			return toolkit.method2445(i, i_0_, method10166(), class544.aClass379_7439);
		}
		Model class143 = aClass481_11575.method8201(toolkit, 131072, false, false);
		if (null == class143) {
			return false;
		}
		return class143.method2918(i, i_0_, method10166(), false, 0);
	}

	@Override
	boolean method16260() {
		return false;
	}

	@Override
	boolean method16261() {
		return aBool11574;
	}

	@Override
	final void method16262(Toolkit toolkit, Class600_Sub1 class600_sub1, int i, int i_2_, int i_3_, boolean bool,
			int i_4_) {
		throw new IllegalStateException();
	}

	@Override
	final void method16263() {
		throw new IllegalStateException();
	}

	@Override
	void method16265(Toolkit toolkit) {
		Model class143 = aClass481_11575.method8201(toolkit, 262144, true, true);
		if (null != class143) {
			aClass481_11575.method8184(toolkit, class143, method10166(), aShort11457, aShort11458, aShort11464,
					aShort11459, false);
		}
	}

	@Override
	Class506 method16271(Toolkit toolkit) {
		Model class143 = aClass481_11575.method8201(toolkit, 2048, false, true);
		if (class143 == null) {
			return null;
		}
		Class405 class405 = method10166();
		Class506 class506 = Class506.method570(aBool11573);
		aClass481_11575.method8184(toolkit, class143, class405, aShort11457, aShort11458, aShort11464, aShort11459,
				true);
		ObjectDefinition class544 = aClass481_11575.method8206();
		if (class544.aClass379_7439 != null) {
			class143.method2917(class405, null, 0);
			toolkit.method2447(class405, aClass139Array10373[0], class544.aClass379_7439);
		} else {
			class143.method2917(class405, aClass139Array10373[0], 0);
		}
		if (aClass481_11575.particles != null) {
			Class137 class137 = aClass481_11575.particles.method9492();
			toolkit.method2470(class137);
		}
		aBool11574 = class143.method2939() || aClass481_11575.particles != null;
		Class393 class393 = method10164();
		if (aClass498_11572 == null) {
			aClass498_11572 = Class498.method3163((int) class393.aClass397_4507.x, (int) class393.aClass397_4507.y,
					(int) class393.aClass397_4507.z, class143);
		} else {
			Class545.method9300(aClass498_11572, (int) class393.aClass397_4507.x, (int) class393.aClass397_4507.y,
					(int) class393.aClass397_4507.z, class143);
		}
		return class506;
	}

	@Override
	final boolean method16302() {
		return false;
	}
}
