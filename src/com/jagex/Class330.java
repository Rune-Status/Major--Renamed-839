package com.jagex;

public class Class330 implements Interface43 {
	static final void method5804(ScriptExecutionContext class613) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = class226.text;
	}

	static void method5806(Matrix4f class399, boolean bool, float f, float f_11_, float f_12_, float f_13_, int i,
			int i_14_) {
		int i_16_ = Client.aClass460_10760.method7686();
		int i_17_ = Client.aClass460_10760.method7685();
		class399.method6559(f, f_11_, f_12_, f_13_, i_17_, i_16_, i, i_14_);
	}

	static final void method5807(Mob mob) {
		if (null != mob.anIntArray11553 || mob.anIntArray11518 != null) {
			boolean bool = true;
			Class553 class553 = Client.aClass460_10760.method7679();
			for (int i_18_ = 0; i_18_ < mob.anIntArray11553.length; i_18_++) {
				int i_19_ = -1;
				if (mob.anIntArray11553 != null) {
					i_19_ = mob.anIntArray11553[i_18_];
				}
				if (-1 == i_19_) {
					if (!mob.method18024(i_18_, -1, (byte) -39)) {
						bool = false;
					}
				} else {
					bool = false;
					Class397 class397 = mob.method10164().aClass397_4507;
					int i_22_;
					int i_23_;
					if (-1073741824 == (i_19_ & ~0x3fffffff)) {
						int i_24_ = i_19_ & 0xfffffff;
						int i_25_ = i_24_ >> 14;
						int i_26_ = i_24_ & 0x3fff;
						i_22_ = (int) class397.x - (256 + (i_25_ - class553.x * 2051316501) * 512);
						i_23_ = (int) class397.z - ((i_26_ - -180305283 * class553.z) * 512 + 256);
					} else if ((i_19_ & 0x8000) != 0) {
						int i_27_ = i_19_ & 0x7fff;
						Player class600_sub1_sub3_sub1_sub1 = Client.players[i_27_];
						if (class600_sub1_sub3_sub1_sub1 != null) {
							Class397 class397_28_ = class600_sub1_sub3_sub1_sub1.method10164().aClass397_4507;
							i_22_ = (int) class397.x - (int) class397_28_.x;
							i_23_ = (int) class397.z - (int) class397_28_.z;
						} else {
							mob.method18024(i_18_, -1, (byte) 14);
							continue;
						}
					} else {
						LinkableObject class480_sub25 = Client.npcs.get(i_19_);
						if (class480_sub25 != null) {
							Npc class600_sub1_sub3_sub1_sub2 = (Npc) class480_sub25.object;
							Class397 class397_29_ = class600_sub1_sub3_sub1_sub2.method10164().aClass397_4507;
							i_22_ = (int) class397.x - (int) class397_29_.x;
							i_23_ = (int) class397.z - (int) class397_29_.z;
						} else {
							mob.method18024(i_18_, -1, (byte) -26);
							continue;
						}
					}
					if (i_22_ != 0 || 0 != i_23_) {
						mob.method18024(i_18_, (int) (Math.atan2(i_22_, i_23_) * 2607.5945876176133) & 0x3fff,
								(byte) 56);
					}
				}
			}
			if (bool) {
				mob.anIntArray11553 = null;
				mob.anIntArray11518 = null;
			}
		}
	}

	static final void method5808(Mob class600_sub1_sub3_sub1, Mob class600_sub1_sub3_sub1_30_, int i, int i_31_,
			int i_32_, int i_33_, int i_34_, int i_35_, int i_36_, int i_37_) {
		int id = class600_sub1_sub3_sub1_30_.getArmyIcon();
		if (id != -1) {
			Sprite sprite = (Sprite) Client.aClass168_10883.get(id);

			if (sprite == null) {
				Image[] images = ImageUtils.load(DequeIterator.images, id, 0);
				if (null == images) {
					return;
				}

				sprite = Class60.activeToolkit.createSprite(images[0], true);
				Client.aClass168_10883.put(id, sprite);
			}

			Class397 class397 = class600_sub1_sub3_sub1.method10164().aClass397_4507;
			Class42.method1043(class600_sub1_sub3_sub1.plane, (int) class397.x, (int) class397.z,
					class600_sub1_sub3_sub1.boundSize() * 256, 0, false, false);
			int i_39_ = (int) (Client.aFloatArray10736[0] + i_31_ - 18.0F);
			int i_40_ = (int) (i_32_ + Client.aFloatArray10736[1] - 16.0F - 54.0F);
			i_39_ += i / 4 * 18;
			i_40_ += 18 * (i % 4);
			sprite.method2079(i_39_, i_40_);

			if (class600_sub1_sub3_sub1_30_ == class600_sub1_sub3_sub1) {
				Class60.activeToolkit.method2747(i_39_ - 1, i_40_ - 1, 18, 18, -256);
			}

			Class477_Sub2 class477_sub2 = Class477_Sub2.method13574();
			class477_sub2.mob = class600_sub1_sub3_sub1_30_;
			class477_sub2.anInt9979 = -915276225 * i_39_;
			class477_sub2.anInt9980 = i_40_ * -162992783;
			class477_sub2.anInt9976 = -1830746149 * (16 + i_39_);
			class477_sub2.anInt9978 = -882224571 * (i_40_ + 16);
			Client.aClass649_10734.offer(class477_sub2);
		}
	}

	public int anInt3566;
	public Class334 aClass334_3567;
	public int anInt3568;
	public int anInt3569;
	public int anInt3570;
	public int anInt3571;
	public int anInt3572;
	public Class349 aClass349_3573;
	public int anInt3574;
	public int anInt3575;
	public boolean aBool3576;

	Class330(int i, Class349 class349, Class334 class334, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_,
			int i_6_, boolean bool) {
		anInt3566 = i * 1247630969;
		aClass349_3573 = class349;
		aClass334_3567 = class334;
		anInt3568 = 235167759 * i_0_;
		anInt3569 = 1168615367 * i_1_;
		anInt3575 = i_2_ * -313798429;
		anInt3574 = i_3_ * 171480775;
		anInt3570 = i_4_ * 18612075;
		anInt3571 = 1518978903 * i_5_;
		anInt3572 = i_6_ * -113237917;
		aBool3576 = bool;
	}

	@Override
	public Class360 method316() {
		return Class360.aClass360_3881;
	}

	public static Class330 decode(Buffer buffer) {
		int i_6_ = buffer.readUByte();
		Class349 class349 = Class349.values()[buffer.readUByte()];
		Class334 class334 = Class334.values()[buffer.readUByte()];
		int i_7_ = buffer.readShort();
		int i_8_ = buffer.readShort();
		int i_9_ = buffer.readUShort();
		int i_10_ = buffer.readUShort();
		int i_11_ = buffer.readInt();
		int i_12_ = buffer.readInt();
		int i_13_ = buffer.readInt();
		boolean bool = buffer.readUByte() == 1;
		return new Class330(i_6_, class349, class334, i_7_, i_8_, i_9_, i_10_, i_11_, i_12_, i_13_, bool);
	}
}
