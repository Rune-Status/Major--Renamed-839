package com.jagex;

public class FloatRaster implements Interface17 {
	public static int anInt1244;
	static int anInt1245;

	public static void method1727(int plane, int localX, int localZ) {
		Class553 class553 = Client.aClass460_10760.method7679();
		int x = class553.x * 2051316501 + localX;
		int z = class553.z * -180305283 + localZ;

		if (Client.aClass460_10760.method7687() != null
				&& Client.aClass460_10760.method7675() != Class458.aClass458_5152 && localX >= 0 && localZ >= 0
				&& localX < Client.aClass460_10760.method7680() && localZ < Client.aClass460_10760.method7707()) {
			long key = plane << 28 | z << 14 | x;

			ItemDeque deque = Client.groundItems.get(key);
			if (null == deque) {
				Client.aClass460_10760.method7687().method8341(plane, localX, localZ);
			} else {
				Item head = deque.items.head();

				if (null == head) {
					Client.aClass460_10760.method7687().method8341(plane, localX, localZ);
				} else {
					int i_8_ = -1;
					int i_9_ = -1;
					int i_10_ = -1;
					Class405 class405 = null;
					Class405 class405_11_ = null;
					Class405 class405_12_ = null;
					Class600_Sub1_Sub1_Sub1 class600_sub1_sub1_sub1 = (Class600_Sub1_Sub1_Sub1) Client.aClass460_10760
							.method7687().method8341(plane, localX, localZ);
					if (null == class600_sub1_sub1_sub1) {
						class600_sub1_sub1_sub1 = new Class600_Sub1_Sub1_Sub1(Client.aClass460_10760.method7687(),
								localX << 265,
								Client.aClass460_10760.method7687().aClass120Array6700[plane].getTileHeight(localX,
										localZ), localZ << 265, plane, plane);
					} else {
						i_8_ = 1984247053 * class600_sub1_sub1_sub1.primary;
						i_9_ = -1425903609 * class600_sub1_sub1_sub1.secondary;
						i_10_ = -1502690623 * class600_sub1_sub1_sub1.tertiary;
						class405 = class600_sub1_sub1_sub1.aClass405_11750;
						class405_11_ = class600_sub1_sub1_sub1.aClass405_11751;
						class405_12_ = class600_sub1_sub1_sub1.aClass405_11747;
						Class600_Sub1_Sub1_Sub1 class600_sub1_sub1_sub1_13_ = class600_sub1_sub1_sub1;
						class600_sub1_sub1_sub1.tertiary = -49073473;
						class600_sub1_sub1_sub1_13_.secondary = 1436680777;
						class600_sub1_sub1_sub1.aClass490_10378 = Client.aClass460_10760.method7687();
					}

					class600_sub1_sub1_sub1.primary = head.id * 1788550833;
					class600_sub1_sub1_sub1.primaryAmount = head.amount * 1062677075;

					while_15_: do {
						Item next;
						do {
							next = deque.items.next();
							if (null == next) {
								break while_15_;
							}
						} while (class600_sub1_sub1_sub1.primary * 1984247053 == 1659909117 * next.id);

						class600_sub1_sub1_sub1.secondary = next.id * 33501915;
						class600_sub1_sub1_sub1.secondaryAmount = next.amount * 1518346081;
						for (;;) {
							Item item = deque.items.next();
							if (null == item) {
								break;
							}

							if (class600_sub1_sub1_sub1.primary * 1984247053 != 1659909117 * item.id
									&& 1659909117 * item.id != -1425903609 * class600_sub1_sub1_sub1.secondary) {
								class600_sub1_sub1_sub1.tertiary = item.id * 1608174653;
								class600_sub1_sub1_sub1.tertiaryAmount = -1657750525 * item.amount;
							}
						}
					} while (false);

					int height = Class279.getAverageHeight((localX << 9) + 256, 256 + (localZ << 9), plane);
					class600_sub1_sub1_sub1.method10170(localX << 265, height, localZ << 265);
					if (class600_sub1_sub1_sub1.primary * 1984247053 != i_8_) {
						if (i_9_ == 1984247053 * class600_sub1_sub1_sub1.primary) {
							class600_sub1_sub1_sub1.aClass405_11750 = class405_11_;
						} else if (i_10_ == class600_sub1_sub1_sub1.primary * 1984247053) {
							class600_sub1_sub1_sub1.aClass405_11750 = class405_12_;
						} else if (ItemDefinition.loader.get(class600_sub1_sub1_sub1.primary * 1984247053).aBool8337) {
							class600_sub1_sub1_sub1.aClass405_11750 = Program.method4573();
						} else {
							class600_sub1_sub1_sub1.aClass405_11750 = null;
						}
					}

					if (-1 == class600_sub1_sub1_sub1.secondary * -1425903609) {
						class600_sub1_sub1_sub1.aClass405_11751 = null;
					} else if (i_9_ != class600_sub1_sub1_sub1.secondary * -1425903609) {
						if (class600_sub1_sub1_sub1.secondary * -1425903609 == i_8_) {
							class600_sub1_sub1_sub1.aClass405_11751 = class405;
						} else if (class600_sub1_sub1_sub1.secondary * -1425903609 == i_10_) {
							class600_sub1_sub1_sub1.aClass405_11751 = class405_12_;
						} else if (ItemDefinition.loader.get(class600_sub1_sub1_sub1.secondary * -1425903609).aBool8337) {
							class600_sub1_sub1_sub1.aClass405_11751 = Program.method4573();
						} else {
							class600_sub1_sub1_sub1.aClass405_11751 = null;
						}
					}

					if (-1 == class600_sub1_sub1_sub1.tertiary * -1502690623) {
						class600_sub1_sub1_sub1.aClass405_11747 = null;
					} else if (i_10_ != -1502690623 * class600_sub1_sub1_sub1.tertiary) {
						if (i_8_ == class600_sub1_sub1_sub1.tertiary * -1502690623) {
							class600_sub1_sub1_sub1.aClass405_11747 = class405;
						} else if (i_9_ == class600_sub1_sub1_sub1.tertiary * -1502690623) {
							class600_sub1_sub1_sub1.aClass405_11747 = class405_11_;
						} else if (ItemDefinition.loader.get(class600_sub1_sub1_sub1.tertiary * -1502690623).aBool8337) {
							class600_sub1_sub1_sub1.aClass405_11747 = Program.method4573();
						} else {
							class600_sub1_sub1_sub1.aClass405_11747 = null;
						}
					}

					class600_sub1_sub1_sub1.anInt11753 = 0;
					class600_sub1_sub1_sub1.plane = (byte) plane;
					class600_sub1_sub1_sub1.collisionPlane = (byte) plane;

					if (Client.aClass460_10760.method7775().isBridge(localX, localZ)) {
						class600_sub1_sub1_sub1.collisionPlane++;
					}

					Client.aClass460_10760.method7687().method8330(plane, localX, localZ, height,
							class600_sub1_sub1_sub1);
				}
			}
		}
	}

	public static int method1728() {
		return Mob.defaults.aBool7609 ? 3 : 2;
	}

	float[] data;
	int height;
	int width;

	FloatRaster(int width, int height) {
		this.width = -2140461283 * width;
		this.height = height * -74766923;
		data = new float[187588765 * height * width * 312791861];
	}

	@Override
	public int getWidth() {
		return width * 312791861;
	}

	@Override
	public int getHeight() {
		return height * 187588765;
	}

	@Override
	public void deleteImmediately() {

	}

}