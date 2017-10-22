package com.jagex;

public class Class49 {
	static Deque aClass644_579 = new Deque();
	static Font aClass132_580;
	static Toolkit aClass134_581;

	public static void method1112(float f, Class397 class397, Class395 class395, Class397 class397_1_,
			Class397 class397_2_, Class397 class397_3_, Class397 class397_4_, float f_5_, float f_6_, float f_7_,
			float f_8_, int i) {
		if (!class397_1_.equals(class397)) {
			Class397 class397_9_ = Class397.create(0.0F, 0.0F, 0.0F);
			Class397 class397_10_ = Class397.copyOf(Class397.difference(class397_1_, class397));
			class397_10_.method6480(class395);
			Class397 class397_11_ = Class397.difference(class397_10_, class397_9_);
			float f_12_ = class397_11_.distance();
			if (f_5_ > 0.0F) {
				class397_3_ = Class397.copyOf(class397_3_);
				class397_3_.multiply(f_6_ * (f_12_ / f_5_));
			}
			if (class397_3_.x == Float.POSITIVE_INFINITY || Float.isNaN(class397.x) || f_12_ > f_7_ || f_12_ < f_8_) {
				class397.copyFrom(class397_1_);
				class397_2_.reset();
			} else {
				class395.method6379();
				Class397 class397_13_ = Class397.create(1.0F, 0.0F, 0.0F);
				Class397 class397_14_ = Class397.create(0.0F, 1.0F, 0.0F);
				Class397 class397_15_ = Class397.create(0.0F, 0.0F, 1.0F);
				class397_13_.method6480(class395);
				class397_14_.method6480(class395);
				class397_15_.method6480(class395);
				Class397 class397_16_ = Class397.create(Class397.method6452(class397_13_, class397_2_),
						Class397.method6452(class397_14_, class397_2_), Class397.method6452(class397_15_, class397_2_));
				Class397 class397_17_ = Class397.copyOf(class397_16_);
				class397_17_.abs();
				Class397 class397_18_ = Class397.quotient(Class397.product(class397_17_, class397_17_),
						Class397.product(class397_3_, 2.0F));
				Class397 class397_19_ = Class397.copyOf(class397_11_);
				class397_19_.abs();
				Class397 class397_20_ = Class397.copyOf(class397_16_);
				if (class397_18_.x > class397_19_.x) {
					if (class397_11_.x < 0.0F) {
						class397_20_.x += f * class397_3_.x;
						if (class397_20_.x > 0.0F) {
							class397_20_.x = 0.0F;
						}
					} else {
						class397_20_.x -= f * class397_3_.x;
						if (class397_20_.x < 0.0F) {
							class397_20_.x = 0.0F;
						}
					}
				} else if (class397_17_.x < class397_4_.x) {
					if (class397_11_.x < 0.0F) {
						class397_20_.x -= f * class397_3_.x;
						if (class397_20_.x < -class397_4_.x) {
							class397_20_.x = -class397_4_.x;
						}
					} else {
						class397_20_.x += f * class397_3_.x;
						if (class397_20_.x > class397_4_.x) {
							class397_20_.x = class397_4_.x;
						}
					}
				}
				if (class397_18_.y > class397_19_.y) {
					if (class397_11_.y < 0.0F) {
						class397_20_.y += f * class397_3_.y;
						if (class397_20_.y > 0.0F) {
							class397_20_.y = 0.0F;
						}
					} else {
						class397_20_.y -= f * class397_3_.y;
						if (class397_20_.y < 0.0F) {
							class397_20_.y = 0.0F;
						}
					}
				} else if (class397_17_.y < class397_4_.y) {
					if (class397_11_.y < 0.0F) {
						class397_20_.y -= f * class397_3_.y;
						if (class397_20_.y < -class397_4_.y) {
							class397_20_.y = -class397_4_.y;
						}
					} else {
						class397_20_.y += class397_3_.y * f;
						if (class397_20_.y > class397_4_.y) {
							class397_20_.y = class397_4_.y;
						}
					}
				}
				if (class397_18_.z > class397_19_.z) {
					if (class397_11_.z < 0.0F) {
						class397_20_.z += f * class397_3_.z;
						if (class397_20_.z > 0.0F) {
							class397_20_.z = 0.0F;
						}
					} else {
						class397_20_.z -= f * class397_3_.z;
						if (class397_20_.z < 0.0F) {
							class397_20_.z = 0.0F;
						}
					}
				} else if (class397_17_.z < class397_4_.z) {
					if (class397_11_.z < 0.0F) {
						class397_20_.z -= class397_3_.z * f;
						if (class397_20_.z < -class397_4_.z) {
							class397_20_.z = -class397_4_.z;
						}
					} else {
						class397_20_.z += f * class397_3_.z;
						if (class397_20_.z > class397_4_.z) {
							class397_20_.z = class397_4_.z;
						}
					}
				}
				Class397 class397_21_ = Class397.product(class397_13_, class397_20_.x);
				class397_21_.method6448(class397_14_, class397_20_.y);
				class397_21_.method6448(class397_15_, class397_20_.z);
				class397_2_.method6467(class397_21_, 0.8F);
				class397.add(Class397.product(class397_2_, f));
				class397_17_.cache();
				class397_20_.cache();
				class397_19_.cache();
			}
		}
	}

	static final void method1110(Widget class226, Interface class221, ScriptExecutionContext class613, int i) {
		String string = (String) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
		if (ScriptExecutionContext.method9239(string, class613) != null) {
			string = string.substring(0, string.length() - 1);
		}
		class226.anObjectArray2364 = Class562_Sub1.method16248(string, class613);
		class226.aBool2483 = true;
	}

	static final void method1111(ScriptExecutionContext class613, int i) {
		int i_0_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = ItemDefinition.aClass192_8339
				.method3806(i_0_).method3921();
	}

	static final void method1113() {
		ParticleSystem.method3934(Class60.activeToolkit, Client.tick);
		if (1764783361 * Client.anInt10790 != -1) {
			Interface.method9889(Client.anInt10790 * 1764783361);
		}
		for (int i_22_ = 0; i_22_ < -573888519 * Client.anInt10848; i_22_++) {
			Client.aBoolArray10851[i_22_] = Client.aBoolArray10850[i_22_];
			Client.aBoolArray10850[i_22_] = false;
		}
		Client.anInt10864 = -401913693 * Client.tick;
		if (-1 != 1764783361 * Client.anInt10790) {
			Client.anInt10848 = 0;
			Class671.method13823((byte) 0);
		}
		Class60.activeToolkit.method2421();
		Class471.method8052(Class60.activeToolkit);
		int i_23_ = Class480_Sub31_Sub1.method17278();
		if (i_23_ == -1) {
			i_23_ = Client.anInt10782 * -1573005291;
		}
		if (-1 == i_23_) {
			i_23_ = Client.anInt10781 * 918063407;
		}
		CursorDefinition.createCursor(i_23_);
		Client.anInt10595 = 0;
	}

	static final void method1114(ScriptExecutionContext class613, int i) {
		int i_24_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_24_);
		Interface class221 = Class598.loadedInterfaces[i_24_ >> 16];
		ScriptExecutionContext.method753(class226, class221, class613);
	}

	Class49() throws Throwable {
		throw new Error();
	}
}
