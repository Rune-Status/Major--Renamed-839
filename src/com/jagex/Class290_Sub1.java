package com.jagex;

public class Class290_Sub1 extends Class290 {
	public static String crown(int id) {
		return "<img=" + id + ">";
	}

	static final void method15204(Mob mob, boolean bool) {
		Class515 class515 = mob.method17958();
		if (2071858351 * mob.pathLength == 0) {
			mob.anInt11513 = 0;
			Class279.anInt3145 = MovementType.aClass624_8025.id * -717862617;
			Class22.anInt322 = 0;
		} else {
			if (mob.aClass650_11526.hasAnimation() && !mob.aClass650_11526.method13515()) {
				AnimationDefinition definition = mob.aClass650_11526.getAnimation();
				if (mob.anInt11550 * 135669775 > 0 && 0 == -999236133 * definition.animatingPrecedence) {
					mob.anInt11513 += 1724688355;
					Class279.anInt3145 = -717862617 * MovementType.aClass624_8025.id;
					Class22.anInt322 = 0;
					return;
				}
				if (mob.anInt11550 * 135669775 <= 0 && 0 == definition.walkingPrecedence * 1425418197) {
					mob.anInt11513 += 1724688355;
					Class279.anInt3145 = MovementType.aClass624_8025.id * -717862617;
					Class22.anInt322 = 0;
					return;
				}
			}

			for (Class468 element : mob.aClass468Array11520) {
				if (-1 != -2008549027 * element.graphic && element.aClass650_6484.method13515()) {
					GraphicDefinition graphic = GraphicDefinition.loader.get(-2008549027 * element.graphic);
					if (graphic.aBool7986 && 2053507375 * graphic.animation != -1) {
						AnimationDefinition animation = AnimationDefinition.loader.get(graphic.animation * 2053507375);
						if (135669775 * mob.anInt11550 > 0 && 0 == animation.animatingPrecedence * -999236133) {
							mob.anInt11513 += 1724688355;
							Class279.anInt3145 = -717862617 * MovementType.aClass624_8025.id;
							Class22.anInt322 = 0;
							return;
						}
						if (135669775 * mob.anInt11550 <= 0 && 0 == animation.walkingPrecedence * 1425418197) {
							mob.anInt11513 += 1724688355;
							Class279.anInt3145 = -717862617 * MovementType.aClass624_8025.id;
							Class22.anInt322 = 0;
							return;
						}
					}
				}
			}

			Class397 class397 = Class397.copyOf(mob.method10164().aClass397_4507);
			int i_2_ = (int) class397.x;
			int i_3_ = (int) class397.z;
			int i_4_ = mob.pathX[mob.pathLength * 2071858351 - 1] * 512 + mob.boundSize() * 256;
			int i_5_ = 512 * mob.pathZ[mob.pathLength * 2071858351 - 1] + mob.boundSize() * 256;

			if (i_2_ < i_4_) {
				if (i_3_ < i_5_) {
					mob.turn(10240);
				} else if (i_3_ > i_5_) {
					mob.turn(14336);
				} else {
					mob.turn(12288);
				}
			} else if (i_2_ > i_4_) {
				if (i_3_ < i_5_) {
					mob.turn(6144);
				} else if (i_3_ > i_5_) {
					mob.turn(2048);
				} else {
					mob.turn(4096);
				}
			} else if (i_3_ < i_5_) {
				mob.turn(8192);
			} else if (i_3_ > i_5_) {
				mob.turn(0);
			}
			int i_6_ = mob.pathSpeed[mob.pathLength * 2071858351 - 1];
			if (!bool && (i_4_ - i_2_ > 1024 || i_4_ - i_2_ < -1024 || i_5_ - i_3_ > 1024 || i_5_ - i_3_ < -1024)) {
				mob.method10170(i_4_, class397.y, i_5_);
				mob.turn(mob.direction * 1149508617, false);
				mob.pathLength -= -379008433;
				if (135669775 * mob.anInt11550 > 0) {
					mob.anInt11550 -= -1118058769;
				}
				Class279.anInt3145 = MovementType.aClass624_8025.id * -717862617;
				Class22.anInt322 = 0;
				class397.cache();
			} else {
				int i_7_ = 16;
				boolean bool_8_ = true;
				if (mob instanceof Npc) {
					bool_8_ = ((Npc) mob).definition.slowWalk;
				}
				if (bool_8_) {
					int i_9_ = mob.direction * 1149508617 - 2069603133 * mob.yaw.value;
					if (0 != i_9_ && -209575893 * mob.anInt1180 == -1 && 0 != mob.anInt11540 * 1206344627) {
						i_7_ = 8;
					}
					if (!bool && mob.pathLength * 2071858351 > 2) {
						i_7_ = 24;
					}
					if (!bool && 2071858351 * mob.pathLength > 3) {
						i_7_ = 32;
					}
				} else {
					if (!bool && 2071858351 * mob.pathLength > 1) {
						i_7_ = 24;
					}
					if (!bool && 2071858351 * mob.pathLength > 2) {
						i_7_ = 32;
					}
				}
				if (344839627 * mob.anInt11513 > 0 && mob.pathLength * 2071858351 > 1) {
					i_7_ = 32;
					mob.anInt11513 -= 1724688355;
				}

				if (i_6_ == MovementType.RUNNING.id) {
					i_7_ <<= 1;
				} else if (i_6_ == MovementType.TELEPORTING.id) {
					i_7_ >>= 1;
				}

				if (-1 != class515.anInt7056 * 1072671173) {
					i_7_ <<= 9;

					if (1 == mob.pathLength * 2071858351) {
						int i_10_ = -219384669 * mob.anInt11532 * -219384669 * mob.anInt11532;
						int i_11_ = ((int) class397.x > i_4_ ? (int) class397.x - i_4_ : i_4_ - (int) class397.x) << 9;
						int i_12_ = ((int) class397.z > i_5_ ? (int) class397.z - i_5_ : i_5_ - (int) class397.z) << 9;
						int i_13_ = i_11_ > i_12_ ? i_11_ : i_12_;
						int i_14_ = i_13_ * 2145342346 * class515.anInt7056;

						if (i_10_ > i_14_) {
							mob.anInt11532 = mob.anInt11532 * -219384669 / 2 * -1751130357;
						} else if (i_10_ / 2 > i_13_) {
							mob.anInt11532 -= 680126071 * class515.anInt7056;

							if (mob.anInt11532 * -219384669 < 0) {
								mob.anInt11532 = 0;
							}
						} else if (mob.anInt11532 * -219384669 < i_7_) {
							mob.anInt11532 += class515.anInt7056 * 680126071;

							if (mob.anInt11532 * -219384669 > i_7_) {
								mob.anInt11532 = -1751130357 * i_7_;
							}
						}
					} else if (-219384669 * mob.anInt11532 < i_7_) {
						mob.anInt11532 += class515.anInt7056 * 680126071;

						if (mob.anInt11532 * -219384669 > i_7_) {
							mob.anInt11532 = -1751130357 * i_7_;
						}
					} else if (-219384669 * mob.anInt11532 > 0) {
						mob.anInt11532 -= 680126071 * class515.anInt7056;

						if (mob.anInt11532 * -219384669 < 0) {
							mob.anInt11532 = 0;
						}
					}

					i_7_ = -219384669 * mob.anInt11532 >> 9;

					if (i_7_ < 1) {
						i_7_ = 1;
					}
				}

				Class22.anInt322 = 0;
				if (i_2_ != i_4_ || i_5_ != i_3_) {
					if (i_2_ < i_4_) {
						class397.x += i_7_;
						Class22.anInt322 = -2005269699 * (1897950229 * Class22.anInt322 | 0x4);

						if (class397.x > i_4_) {
							class397.x = i_4_;
						}
					} else if (i_2_ > i_4_) {
						class397.x -= i_7_;
						Class22.anInt322 = (Class22.anInt322 * 1897950229 | 0x8) * -2005269699;

						if (class397.x < i_4_) {
							class397.x = i_4_;
						}
					}

					if (i_3_ < i_5_) {
						class397.z += i_7_;
						Class22.anInt322 = (Class22.anInt322 * 1897950229 | 0x1) * -2005269699;

						if (class397.z > i_5_) {
							class397.z = i_5_;
						}
					} else if (i_3_ > i_5_) {
						class397.z -= i_7_;
						Class22.anInt322 = (Class22.anInt322 * 1897950229 | 0x2) * -2005269699;

						if (class397.z < i_5_) {
							class397.z = i_5_;
						}
					}

					mob.method10169(class397);
					if (i_7_ >= 32) {
						Class279.anInt3145 = -717862617 * MovementType.RUNNING.id;
					} else {
						Class279.anInt3145 = i_6_ * -717862617;
					}

				} else {
					Class279.anInt3145 = -717862617 * MovementType.aClass624_8025.id;
				}

				if (i_4_ == (int) class397.x && i_5_ == (int) class397.z) {
					mob.pathLength -= -379008433;

					if (135669775 * mob.anInt11550 > 0) {
						mob.anInt11550 -= -1118058769;
					}
				}

				class397.cache();
			}
		}
	}

	Class249 particleFog;
	Class480_Sub13_Sub1 diffuseSampler;
	Class480_Sub13_Sub1 texCoordMatrix;
	Class480_Sub13_Sub1 worldViewProjection;
	Program particle;
	Class480_Sub13_Sub1 diffuseColour;
	Class480_Sub13_Sub1 distanceFogPlane;
	Class480_Sub13_Sub1 distanceFogAmount;
	Class480_Sub13_Sub1 distanceFogColour;
	Class249 noFog;
	Matrix4f aClass399_9704 = new Matrix4f();
	Class249 billboardFog;

	public Class290_Sub1(NativeToolkit toolkit) throws ProgramException {
		super(toolkit);
		init();
	}

	@Override
	public void method5376(boolean fog) {
		particle.method4464(fog ? billboardFog : noFog);
		particle.method4522();
		method15203(fog, false);
		toolkit.method14705();
	}

	@Override
	public void method5377(int i, boolean fog) {
		particle.method4464(fog ? particleFog : noFog);
		particle.method4522();
		method15203(fog, true);
		toolkit.method14773(Class333.aClass333_3597, 0, 4 * i, 0, i * 2);
	}

	@Override
	public void method5378(Matrix4f class399) {
		aClass399_9704.copyFrom(class399);
		aClass399_9704.method6547(toolkit.aClass399_9303);
	}

	boolean init() throws ProgramException {
		particle = toolkit.loadProgram("Particle");
		worldViewProjection = particle.method4521("WVPMatrix");
		diffuseSampler = particle.method4521("DiffuseSampler");
		texCoordMatrix = particle.method4521("TexCoordMatrix");
		distanceFogPlane = particle.method4521("DistanceFogPlane");
		distanceFogColour = particle.method4521("DistanceFogColour");
		distanceFogAmount = particle.method4521("DistanceFogAmount");
		diffuseColour = particle.method4521("DiffuseColour");
		noFog = particle.method4447("NoFog");
		particleFog = particle.method4447("ParticleFog");
		billboardFog = particle.method4447("BillboardFog");

		if (!noFog.method4648()) {
			return false;
		}
		if (!particleFog.method4648()) {
			return false;
		}

		return billboardFog.method4648();
	}

	void method15203(boolean bool, boolean bool_0_) {
		particle.method4466(diffuseSampler, 0, texture);
		particle.method4470(worldViewProjection, aClass399_9704);
		particle.method4540(texCoordMatrix, aClass399_3234);
		particle.method4463(diffuseColour, anInt3233);

		if (bool) {
			if (bool_0_) {
				particle.method4459(distanceFogPlane, aClass375_3231.aFloat4161, aClass375_3231.aFloat4160,
						aClass375_3231.aFloat4159, aClass375_3231.aFloat4162);
			} else {
				particle.method4456(distanceFogAmount, Math.min(Math.max(aFloat3236, 0.0F), 1.0F));
			}
			particle.method4461(distanceFogColour, aClass397_3232.x, aClass397_3232.y, aClass397_3232.z);
		}
	}

}