package com.jagex;

public class Projectile extends Class600_Sub1_Sub3 {

	int anInt11702;
	int initialHeight;
	double verticalAcceleration;
	boolean aBool11705;
	public int endTick;
	int verticalPitch;
	int initialDisplacement;
	int senderIndex;
	public int startTick;
	boolean aBool11711;
	int graphic;
	boolean aBool11713 = false;
	double speedX;
	double speedZ;
	double speed;
	double velocityY;
	public int targetIndex;
	public int anInt11719;
	int anInt11720 = 0;
	int equipmentSlot;
	ParticleSystem particles;
	Class650 aClass650_11723;

	public Projectile(Class490 class490, int graphic, int plane, int collisionPlane, int worldX, int worldZ,
			int initialHeight, int startTick, int endTick, int verticalPitch, int initialDisplacement, int senderIndex,
			int targetIndex, int i_32_, boolean bool, int equipmentSlot, int i_34_) {
		super(class490, plane, collisionPlane, worldX,
				Class279.getAverageHeight(worldX, worldZ, plane) - initialHeight, worldZ, worldX >> 9, worldX >> 9,
				worldZ >> 9, worldZ >> 9, false, (byte) 0);
		aBool11705 = false;
		anInt11702 = 0;
		this.graphic = graphic * 709898979;
		this.startTick = 1537614313 * startTick;
		this.endTick = 958795889 * endTick;
		this.verticalPitch = 1075247367 * verticalPitch;
		this.initialDisplacement = initialDisplacement * -1153489871;
		this.senderIndex = senderIndex * -234470757;
		this.targetIndex = 1819326809 * targetIndex;
		this.initialHeight = initialHeight * 2037858367;
		anInt11719 = i_32_ * -2085313005;
		aBool11711 = bool;
		aBool11713 = false;
		this.equipmentSlot = 1421371761 * equipmentSlot;
		anInt11702 = i_34_ * 9261423;
		int animation = GraphicDefinition.loader.get(graphic * 926720715).animation * 2053507375;
		aClass650_11723 = new Class650_Sub1(this, false);
		aClass650_11723.update(animation);
		method16274(1);
	}

	@Override
	public Class498 method16293(Toolkit toolkit) {
		return null;
	}

	@Override
	public int method16295() {
		return anInt11720 * -339957419;
	}

	public int method18191() {
		return anInt11702 * 884026767;
	}

	public final void target(int targetX, int targetZ, int height, int tick) {
		Class397 position = Class397.copyOf(method10164().aClass397_4507);
		if (!aBool11713) {
			float dx = targetX - position.x;
			float dz = targetZ - position.z;
			float distance = (float) Math.sqrt(dx * dx + dz * dz);
			if (0.0F != distance) {
				position.x += dx * (819049681 * initialDisplacement) / distance;
				position.z += dz * (819049681 * initialDisplacement) / distance;
			}

			if (aBool11711) {
				position.y = Class279.getAverageHeight((int) position.x, (int) position.z, plane) - -1645957185
						* initialHeight;
			}

			method10169(position);
		}

		double dt = 1 + endTick * -103567215 - tick;
		speedX = (targetX - position.x) / dt;
		speedZ = (targetZ - position.z) / dt;
		speed = Math.sqrt(speedZ * speedZ + speedX * speedX);

		if (-1 != verticalPitch * -298244937) {
			if (!aBool11713) {
				velocityY = -speed * Math.tan(0.02454369 * (-298244937 * verticalPitch));
			}

			verticalAcceleration = 2.0 * (height - position.y - dt * velocityY) / (dt * dt);
		} else {
			velocityY = (height - position.y) / dt;
		}

		position.cache();
	}

	public void method18193() {
		if (!aBool11713) {
			if (senderIndex * 1470550931 != 0) {
				Mob mob = null;

				if (1 == 2087248539 * Client.cutsceneStage) {
					mob = CutsceneMob.mobs[senderIndex * 1470550931 - 1].getMob();
				} else if (senderIndex * 1470550931 < 0) {
					int index = -(senderIndex * 1470550931) - 1;

					if (index == -406165969 * Client.localPlayerIndex) {
						mob = Client.localPlayer;
					} else {
						mob = Client.players[index];
					}
				} else {
					int index = 1470550931 * senderIndex - 1;
					LinkableObject<Npc> linkable = Client.npcs.get(index);

					if (null != linkable) {
						mob = linkable.object;
					}
				}

				if (null != mob) {
					Class397 class397 = mob.method10164().aClass397_4507;
					method10170(class397.x, Class279.getAverageHeight((int) class397.x, (int) class397.z, plane)
							- initialHeight * -1645957185, class397.z);
					if (equipmentSlot * 1488271249 >= 0) {
						Class515 class515 = mob.method17958();
						int i_11_ = 0;
						int i_12_ = 0;

						if (class515.anIntArrayArray7043 != null
								&& class515.anIntArrayArray7043[equipmentSlot * 1488271249] != null) {
							i_11_ += class515.anIntArrayArray7043[1488271249 * equipmentSlot][0];
							i_12_ += class515.anIntArrayArray7043[1488271249 * equipmentSlot][2];
						}

						if (null != class515.anIntArrayArray7044
								&& null != class515.anIntArrayArray7044[equipmentSlot * 1488271249]) {
							i_11_ += class515.anIntArrayArray7044[equipmentSlot * 1488271249][0];
							i_12_ += class515.anIntArrayArray7044[1488271249 * equipmentSlot][2];
						}

						if (0 != i_11_ || 0 != i_12_) {
							int yaw = mob.yaw.value();
							int raw = yaw;
							if (null != mob.anIntArray11518 && mob.anIntArray11518[equipmentSlot * 1488271249] != -1) {
								raw = mob.anIntArray11518[1488271249 * equipmentSlot];
							}

							int angle = raw - yaw & 0x3fff;
							int sin = Class373.SINE[angle];
							int cos = Class373.COSINE[angle];

							int i_18_ = sin * i_12_ + i_11_ * cos >> 14;
							i_12_ = i_12_ * cos - sin * i_11_ >> 14;
							i_11_ = i_18_;

							Class397 class397_19_ = Class397.copyOf(method10164().aClass397_4507);
							class397_19_.x += i_11_;
							class397_19_.z += i_12_;
							method10169(class397_19_);
							class397_19_.cache();
						}
					}
				}
			}
		}
	}

	public void method18196() {
		if (particles != null) {
			particles.method9484();
		}
	}

	public final void method18203(int elapsed) {
		aBool11713 = true;
		Class393 class393 = new Class393(method10164());
		class393.aClass397_4507.x += speedX * elapsed;
		class393.aClass397_4507.z += speedZ * elapsed;

		if (aBool11711) {
			class393.aClass397_4507.y = Class279.getAverageHeight((int) class393.aClass397_4507.x,
					(int) class393.aClass397_4507.z, plane) - initialHeight * -1645957185;
		} else if (verticalPitch * -298244937 != -1) {
			class393.aClass397_4507.y += elapsed * velocityY + elapsed * (verticalAcceleration * 0.5) * elapsed;
			velocityY += verticalAcceleration * elapsed;
		} else {
			class393.aClass397_4507.y += elapsed * velocityY;
		}

		class393.aClass395_4506.method6367(1.0F, 0.0F, 0.0F, (float) Math.atan2(velocityY, speed));
		Class395 class395 = Class395.create();
		class395.method6367(0.0F, 1.0F, 0.0F, (float) (Math.atan2(speedX, speedZ) - Math.PI));
		class393.aClass395_4506.method6377(class395);

		class395.cache();
		method10171(class393);

		if (aClass650_11723.method13465(1) && aClass650_11723.method13461()) {
			aClass650_11723.method13463();
		}
	}

	@Override
	boolean method16257(Toolkit toolkit, int i, int i_36_) {
		return false;
	}

	@Override
	boolean method16260() {
		return false;
	}

	@Override
	boolean method16261() {
		return aBool11705;
	}

	@Override
	final void method16262(Toolkit toolkit, Class600_Sub1 class600_sub1, int i, int i_0_, int i_1_, boolean bool,
			int i_2_) {
		throw new IllegalStateException();
	}

	@Override
	final void method16263() {
		throw new IllegalStateException();
	}

	@Override
	void method16265(Toolkit toolkit) {
		Model model = method18194(toolkit, 0);
		if (model != null) {
			Class405 class405 = method10166();
			anInt11720 = model.minimumY() * -2043802627;
			model.method3016();
			method18205(toolkit, model, class405);
		}
	}

	@Override
	Class506 method16271(Toolkit toolkit) {
		Model model = method18194(toolkit, 2048);
		if (model == null) {
			return null;
		}

		Class405 class405 = method10166();
		method18205(toolkit, model, class405);
		Class506 class506 = Class506.method570(false);
		model.method2917(class405, aClass139Array10373[0], 0);

		if (particles != null) {
			Class137 class137 = particles.method9492();
			toolkit.method2470(class137);
		}

		aBool11705 = model.method2939();
		model.method3016();
		anInt11720 = model.minimumY() * -2043802627;
		return class506;
	}

	@Override
	final boolean method16302() {
		return false;
	}

	@Override
	void method17912() {
		Class397 class397 = method10164().aClass397_4507;
		aShort11457 = aShort11458 = (short) (class397.x / 512.0F);
		aShort11464 = aShort11459 = (short) (class397.z / 512.0F);
	}

	Model method18194(Toolkit toolkit, int i) {
		GraphicDefinition graphic = GraphicDefinition.loader.get(926720715 * this.graphic);
		return graphic.method10394(toolkit, i, aClass650_11723, (byte) 2);
	}

	void method18205(Toolkit toolkit, Model model, Class405 class405) {
		model.method3063(class405);
		Class145[] class145s = model.method2942();
		Class115[] class115s = model.method2943();

		if ((particles == null || particles.stopped) && (null != class145s || class115s != null)) {
			particles = ParticleSystem.create(Client.tick, true);
		}

		if (null != particles) {
			particles.method9488(toolkit, Client.tick, class145s, class115s, false);
			particles.method9485(plane, aShort11457, aShort11458, aShort11464, aShort11459);
		}
	}

	static void create(int graphic, int senderIndex, int targetIndex, int equipmentSlot, int initialHeight,
			int heightOffset, int originX, int originZ, int targetX, int targetZ, int delay, int longetivity,
			int verticalPitch, int initialDisplacement, boolean bool, int i_21_) {
		if (0 != senderIndex && -1 != equipmentSlot) {
			Mob mob = null;
			if (senderIndex < 0) {
				int index = -senderIndex - 1;
				if (-406165969 * Client.localPlayerIndex == index) {
					mob = Client.localPlayer;
				} else {
					mob = Client.players[index];
				}
			} else {
				int index = senderIndex - 1;
				LinkableObject<Npc> linkable = Client.npcs.get(index);
				if (linkable != null) {
					mob = linkable.object;
				}
			}

			if (null != mob) {
				Class515 class515 = mob.method17958();
				if (null != class515.anIntArrayArray7043 && class515.anIntArrayArray7043[equipmentSlot] != null) {
					initialHeight -= class515.anIntArrayArray7043[equipmentSlot][1];
				}

				if (class515.anIntArrayArray7044 != null && class515.anIntArrayArray7044[equipmentSlot] != null) {
					initialHeight -= class515.anIntArrayArray7044[equipmentSlot][1];
				}
			}
		}

		Projectile projectile = new Projectile(Client.aClass460_10760.method7687(), graphic,
				BaseVarpDefinitionLoader.anInt1129 * -1123616625, -1123616625 * BaseVarpDefinitionLoader.anInt1129,
				originX, originZ, initialHeight, delay + Client.tick, longetivity + Client.tick, verticalPitch,
				initialDisplacement, senderIndex, targetIndex, heightOffset, bool, equipmentSlot, i_21_);
		projectile.target(targetX, targetZ,
				Class279.getAverageHeight(targetX, targetZ, BaseVarpDefinitionLoader.anInt1129 * -1123616625)
						- heightOffset, delay + Client.tick);
		Client.projectiles.pushBack(new CacheableProjectile(projectile));
	}

}