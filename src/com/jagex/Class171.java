package com.jagex;

public class Class171 {
	public static Class171 aClass171_1947 = new Class171();
	static Class171 aClass171_1948 = new Class171();
	static Class171 aClass171_1949 = new Class171();
	static Class171 aClass171_1950 = new Class171();
	static Class171 aClass171_1951 = new Class171();
	public static Class171 aClass171_1952 = new Class171();
	static Class171 aClass171_1953 = new Class171();
	static Class171 aClass171_1954 = new Class171();
	static Class171 aClass171_1955 = new Class171();
	static Class171 aClass171_1956 = new Class171();
	static Class171 aClass171_1957 = new Class171();
	static Class171 aClass171_1958 = new Class171();
	static Class171 aClass171_1959 = new Class171();
	static long aLong1960;

	public static int method3484(int i) {
		Class480_Sub31_Sub13 class480_sub31_sub13 = Class248.aClass667_2666.get(i);
		if (class480_sub31_sub13 == null) {
			return -1;
		} else if (Class248.aClass638_2668.tail == class480_sub31_sub13.nextCacheable) {
			return -1;
		}

		return ((Class480_Sub31_Sub13) class480_sub31_sub13.nextCacheable).anInt11382 * -482365547;
	}

	public static void method3488(float f, Class397 class397, Class395 class395, Class397 class397_6_,
			Class397 class397_7_, Class397 class397_8_, float f_9_, float f_10_, float f_11_, int i) {
		if (!class397_6_.equals(class397)) {
			Class397 class397_12_ = Class397.create(0.0F, 0.0F, 0.0F);
			Class397 class397_13_ = Class397.copyOf(Class397.difference(class397_6_, class397));
			class397_13_.method6480(class395);
			Class397 difference = Class397.difference(class397_13_, class397_12_);
			float distance = difference.distance();

			if (class397_8_.x == Float.POSITIVE_INFINITY || Float.isNaN(class397.x) || distance > f_10_
					|| distance < f_11_) {
				class397.copyFrom(class397_6_);
				class397_7_.reset();
			} else {
				class395.method6379();
				Class397 class397_16_ = Class397.create(1.0F, 0.0F, 0.0F);
				Class397 class397_17_ = Class397.create(0.0F, 1.0F, 0.0F);
				Class397 class397_18_ = Class397.create(0.0F, 0.0F, 1.0F);
				class397_16_.method6480(class395);
				class397_17_.method6480(class395);
				class397_18_.method6480(class395);
				Class397 class397_19_ = Class397.create(Class397.method6452(class397_16_, class397_7_),
						Class397.method6452(class397_17_, class397_7_), Class397.method6452(class397_18_, class397_7_));
				Class397 class397_20_ = Class397.copyOf(class397_19_);
				Class397 class397_21_ = Class397.create(difference.x * class397_8_.x, class397_8_.y * difference.y,
						class397_8_.z * difference.z);
				class397_20_.method6448(class397_21_, f);
				class397_20_.divide(f_9_);
				Class397 class397_22_ = Class397.product(class397_16_, class397_20_.x);
				class397_22_.method6448(class397_17_, class397_20_.y);
				class397_22_.method6448(class397_18_, class397_20_.z);
				class397_7_.copyFrom(class397_22_);
				class397.add(Class397.product(class397_7_, f));
			}
		}
	}

	static void method3489(Widget[] widgets, Widget class226, boolean bool) {
		int i_23_ = 0 != class226.scrollWidth * 731337999 ? class226.scrollWidth * 731337999
				: 688089097 * class226.width;
		int i_24_ = -184691147 * class226.scrollHeight != 0 ? -184691147 * class226.scrollHeight
				: 1362321717 * class226.height;

		Class264.method5001(widgets, 1857819631 * class226.id, i_23_, i_24_, bool);
		if (class226.aClass226Array2521 != null) {
			Class264.method5001(class226.aClass226Array2521, 1857819631 * class226.id, i_23_, i_24_, bool);
		}

		Class480_Sub41 class480_sub41 = (Class480_Sub41) Client.aClass667_10791.get(class226.id * 1857819631);
		if (class480_sub41 != null) {
			CustomisedItem.method13892(class480_sub41.anInt10372 * 1021060255, i_23_, i_24_, bool);
		}

		if (class226 == Client.aClass226_10798) {
			int count = -1784886003 * Class80.playerCount;
			int[] indices = Class80.playerIndices;

			for (int index = 0; index < count; index++) {
				Player player = Client.players[indices[index]];
				if (null != player) {
					player.method17968(i_23_, i_24_, bool);
				}
			}

			for (int i = 0; i < 1746328619 * Client.npcCount; i++) {
				int index = Client.npcIndices[i];
				LinkableObject<Npc> linkable = Client.npcs.get(index);
				if (null != linkable) {
					((Mob) linkable.object).method17968(i_23_, i_24_, bool);
				}
			}
		}
	}

}