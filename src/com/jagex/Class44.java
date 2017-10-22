package com.jagex;

public class Class44 {
	public static void method1067(boolean hsv, boolean bool_0_) {
		if (hsv) {
			Class598.anInt7849 += -1935474425;
			Class207.createHsvTable();
		}

		if (bool_0_) {
			Class598.anInt7848 += 325974101;
			Class367.method6093();
		}
	}

	public static void method1072(float f, Class397 class397, Class397 class397_15_, Class397 class397_16_,
			Class397 class397_17_, Class397 class397_18_, float f_19_, float f_20_, float f_21_, float f_22_, short i) {
		if (!class397_15_.equals(class397)) {
			Class397 class397_23_ = Class397.difference(class397_15_, class397);
			float f_24_ = class397_23_.distance();
			if (f_19_ > 0.0F) {
				class397_17_ = Class397.copyOf(class397_17_);
				class397_17_.multiply(f_24_ / f_19_ * f_20_);
			}
			if (class397_17_.x == Float.POSITIVE_INFINITY || Float.isNaN(class397.x) || f_24_ > f_21_) {
				class397.copyFrom(class397_15_);
				class397_16_.reset();
			} else {
				Class397 class397_25_ = Class397.copyOf(class397_16_);
				class397_25_.abs();
				Class397 class397_26_ = Class397.quotient(class397_25_, class397_17_);
				Class397 class397_27_ = Class397.product(class397_25_, class397_26_);
				class397_27_.multiply(0.5F);
				Class397 class397_28_ = Class397.copyOf(class397_16_);
				Class397 class397_29_ = Class397.copyOf(class397_23_);
				class397_29_.abs();
				if (class397_27_.x > class397_29_.x) {
					if (class397_23_.x < 0.0F) {
						class397_28_.x += f * class397_17_.x;
						if (class397_28_.x > 0.0F) {
							class397_28_.x = 0.0F;
						}
					} else {
						class397_28_.x -= class397_17_.x * f;
						if (class397_28_.x < 0.0F) {
							class397_28_.x = 0.0F;
						}
					}
				} else if (class397_25_.x < class397_18_.x) {
					if (class397_23_.x < 0.0F) {
						class397_28_.x -= class397_17_.x * f;
						if (class397_28_.x < -class397_18_.x) {
							class397_28_.x = -class397_18_.x;
						}
					} else {
						class397_28_.x += class397_17_.x * f;
						if (class397_28_.x > class397_18_.x) {
							class397_28_.x = class397_18_.x;
						}
					}
				}
				if (class397_27_.y > class397_29_.y) {
					if (class397_23_.y < 0.0F) {
						class397_28_.y += f * class397_17_.y;
						if (class397_28_.y > 0.0F) {
							class397_28_.y = 0.0F;
						}
					} else {
						class397_28_.y -= f * class397_17_.y;
						if (class397_28_.y < 0.0F) {
							class397_28_.y = 0.0F;
						}
					}
				} else if (class397_25_.y < class397_18_.y) {
					if (class397_23_.y < 0.0F) {
						class397_28_.y -= f * class397_17_.y;
						if (class397_28_.y < -class397_18_.y) {
							class397_28_.y = -class397_18_.y;
						}
					} else {
						class397_28_.y += f * class397_17_.y;
						if (class397_28_.y > class397_18_.y) {
							class397_28_.y = class397_18_.y;
						}
					}
				}
				if (class397_27_.z > class397_29_.z) {
					if (class397_23_.z < 0.0F) {
						class397_28_.z += class397_17_.z * f;
						if (class397_28_.z > 0.0F) {
							class397_28_.z = 0.0F;
						}
					} else {
						class397_28_.z -= f * class397_17_.z;
						if (class397_28_.z < 0.0F) {
							class397_28_.z = 0.0F;
						}
					}
				} else if (class397_25_.z < class397_18_.z) {
					if (class397_23_.z < 0.0F) {
						class397_28_.z -= class397_17_.z * f;
						if (class397_28_.z < -class397_18_.z) {
							class397_28_.z = -class397_18_.z;
						}
					} else {
						class397_28_.z += class397_17_.z * f;
						if (class397_28_.z > class397_18_.z) {
							class397_28_.z = class397_18_.z;
						}
					}
				}
				class397_16_.method6467(class397_28_, 0.8F);
				if (f_24_ < f_22_ && class397_16_.distance() < f_22_) {
					class397.copyFrom(class397_15_);
					class397_16_.reset();
				} else {
					class397.add(Class397.product(class397_16_, f));
				}
				class397_25_.cache();
				class397_28_.cache();
				class397_29_.cache();
			}
		}
	}

	static final void method1071(int i, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_) {
		if (3 == Client.cutsceneStage * 2087248539) {
			int i_11_ = -1784886003 * Class80.playerCount;
			int[] is = Class80.playerIndices;
			for (int i_12_ = 0; i_12_ < i_11_; i_12_++) {
				Player class600_sub1_sub3_sub1_sub1 = Client.players[is[i_12_]];
				if (null != class600_sub1_sub3_sub1_sub1) {
					class600_sub1_sub3_sub1_sub1.method17972(i, i_4_, i_5_, i_6_, i_7_, i_8_, i_9_);
				}
			}
			for (int i_13_ = 0; i_13_ < Client.npcCount * 1746328619; i_13_++) {
				int i_14_ = Client.npcIndices[i_13_];
				LinkableObject class480_sub25 = Client.npcs.get(i_14_);
				if (class480_sub25 != null) {
					((Mob) class480_sub25.object).method17972(i, i_4_, i_5_, i_6_, i_7_, i_8_, i_9_);
				}
			}
		}
	}

	Class44() throws Throwable {
		throw new Error();
	}

}