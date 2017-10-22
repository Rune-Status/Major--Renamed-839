package com.jagex;

import java.util.Iterator;

public class Particle extends PointEntity {
	ParticleProducer emitter;
	short index;
	int intermediateColour;
	short lifetime;
	short lifespan;
	short aShort11652;
	int speed;
	short aShort11654;
	short aShort11655;
	short aShort11656;
	static int cachedParticles = 0;
	static Particle[] cache;

	Particle(ParticleProducer emitter, int i, int i_66_, int i_67_, int i_68_, int i_69_, int i_70_, int i_71_,
			int i_72_, int i_73_, int i_74_, int i_75_, int i_76_, int i_77_, boolean bool, boolean bool_78_) {
		this.emitter = emitter;
		x = i << 12;
		z = i_66_ << 12;
		y = i_67_ << 12;
		colour = i_73_;
		lifespan = lifetime = (short) i_72_;
		size = i_74_;
		rotation = (short) i_75_;
		aShort11656 = (short) i_76_;
		texture = i_77_;
		aBool11252 = bool_78_;
		aShort11652 = (short) i_68_;
		aShort11654 = (short) i_69_;
		aShort11655 = (short) i_70_;
		speed = i_71_;
		link();
	}

	void kill() {
		emitter.parent.particles[index] = null;
		Particle.cache[Particle.cachedParticles * 1486901643] = this;
		Particle.cachedParticles = (Particle.cachedParticles * 1486901643 + 1 & 0x3ff) * 1917177379;
		unlink();
		uncache();
	}

	void reset(ParticleProducer emitter, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_,
			int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, boolean bool, boolean bool_12_) {
		this.emitter = emitter;
		x = i << 12;
		z = i_0_ << 12;
		y = i_1_ << 12;
		colour = i_7_;
		lifespan = lifetime = (short) i_6_;
		size = i_8_;
		rotation = (short) i_9_;
		aShort11656 = (short) i_10_;
		texture = i_11_;
		aBool11252 = bool_12_;
		aShort11652 = (short) i_2_;
		aShort11654 = (short) i_3_;
		aShort11655 = (short) i_4_;
		speed = i_5_;
		link();
	}

	void method18121(long l, int dt) {
		lifetime -= dt;
		if (lifetime <= 0) {
			kill();
		} else {
			int tileX = x >> 12;
			int tileZ = z >> 12;
			int plane = y >> 12;

			ParticleSystem system = emitter.parent;
			ParticleProducerDefinition definition = emitter.definition;

			if (definition.fadeColour * -626809649 != 0) {
				if (lifespan - lifetime <= definition.colourFadeStart * 66694965) {
					int r = (colour >> 8 & 0xff00) + (intermediateColour >> 16 & 0xff) + definition.fadeRedStep
							* -1564095251 * dt;
					int g = (colour & 0xff00) + (intermediateColour >> 8 & 0xff) + definition.fadeBlueStep * -580139801
							* dt;
					int b = (colour << 8 & 0xff00) + (intermediateColour & 0xff) + definition.fadeGreenStep
							* -962775437 * dt;

					if (r < 0) {
						r = 0;
					} else if (r > 65535) {
						r = 65535;
					}

					if (g < 0) {
						g = 0;
					} else if (g > 65535) {
						g = 65535;
					}

					if (b < 0) {
						b = 0;
					} else if (b > 65535) {
						b = 65535;
					}

					colour &= ~0xffffff;
					colour |= ((r & 0xff00) << 8) + (g & 0xff00) + ((b & 0xff00) >> 8);
					intermediateColour &= ~0xffffff;
					intermediateColour |= ((r & 0xff) << 16) + ((g & 0xff) << 8) + (b & 0xff);
				}

				if (lifespan - lifetime <= definition.alphaFadeStart * 573235277) {
					int alpha = (colour >> 16 & 0xff00) + (intermediateColour >> 24 & 0xff) + definition.fadeAlphaStep
							* -1516743469 * dt;
					if (alpha < 0) {
						alpha = 0;
					} else if (alpha > 65535) {
						alpha = 65535;
					}

					colour &= 0xffffff;
					colour |= (alpha & 0xff00) << 16;
					intermediateColour &= 0xffffff;
					intermediateColour |= (alpha & 0xff) << 24;
				}
			}

			if (definition.endSpeed * -386165965 != -1
					&& lifespan - lifetime <= definition.startSpeedChange * -691699619) {
				speed += definition.speedStep * -764730269 * dt;
			}
			if (definition.endSize * -410860795 != -1 && lifespan - lifetime <= definition.startSizeChange * 293564889) {
				size += definition.sizeChangeStep * -1492871803 * dt;
			}
			if (aShort11656 != 0) {
				rotation = (short) (rotation + aShort11656 * dt & 0x3fff);
			}

			double directionX = aShort11652;
			double directionZ = aShort11654;
			double directionY = aShort11655;
			boolean bool = false;

			if (definition.anInt3737 * -413945127 == 1) {
				int dx = tileX - emitter.current.centerX * -1984741165;
				int dz = tileZ - emitter.current.centerZ * -352293249;
				int dy = plane - emitter.current.centerY * 1179722655;
				int i_25_ = (int) Math.sqrt(dx * dx + dz * dz + dy * dy) >> 2;
				long l_26_ = definition.anInt3738 * 33106565 * i_25_ * dt;
				speed -= speed * l_26_ >> 18;
			} else if (definition.anInt3737 * -413945127 == 2) {
				int dx = tileX - emitter.current.centerX * -1984741165;
				int dz = tileZ - emitter.current.centerZ * -352293249;
				int dy = plane - emitter.current.centerY * 1179722655;
				int i_30_ = dx * dx + dz * dz + dy * dy;
				long l_31_ = definition.anInt3738 * 33106565 * i_30_ * dt;
				speed -= speed * l_31_ >> 28;
			}

			if (definition.anIntArray3756 != null) {
				Iterator<Class480_Sub27> iterator = system.aList7561.iterator();
				while (iterator.hasNext()) {
					Class480_Sub27 class480_sub27 = iterator.next();
					Class361 class361 = class480_sub27.aClass361_10188;
					if (class361.anInt3894 * 939371847 != 1) {
						boolean found = false;
						for (int id : definition.anIntArray3756) {
							if (id == class361.id * -1673408569) {
								found = true;
								break;
							}
						}

						if (found) {
							double dx = tileX - class480_sub27.anInt10193 * -443484517;
							double dz = tileZ - class480_sub27.anInt10190 * 2068163667;
							double dy = plane - class480_sub27.anInt10191 * -541373055;
							double d_37_ = dx * dx + dz * dz + dy * dy;

							if (!(d_37_ > class361.aLong3889 * -171913190644866815L)) {
								double distance = Math.sqrt(d_37_);
								if (distance == 0.0) {
									distance = 1.0;
								}

								double d_39_ = (dx * class480_sub27.aFloat10192 + dz
										* (class361.anInt3902 * 1822099009) + dy * class480_sub27.aFloat10187)
										* 65535.0 / (class361.distance * -965405943 * distance);
								if (!(d_39_ < class361.anInt3911 * -1142488497)) {
									double d_40_ = 0.0;
									if (class361.anInt3903 * 1365723579 == 1) {
										d_40_ = distance / 16.0 * (class361.anInt3905 * -2110574355);
									} else if (class361.anInt3903 * 1365723579 == 2) {
										d_40_ = distance / 16.0 * (distance / 16.0)
												* (class361.anInt3905 * -2110574355);
									}
									if (class361.anInt3899 * 428868563 == 0) {
										if (class361.anInt3906 * 1563141513 == 0) {
											directionX += (class480_sub27.aFloat10192 - d_40_) * dt;
											directionZ += (class361.anInt3902 * 1822099009 - d_40_) * dt;
											directionY += (class480_sub27.aFloat10187 - d_40_) * dt;
											bool = true;
										} else {
											x += (class480_sub27.aFloat10192 - d_40_) * dt;
											z += (class361.anInt3902 * 1822099009 - d_40_) * dt;
											y += (class480_sub27.aFloat10187 - d_40_) * dt;
										}
									} else {
										double d_41_ = dx / distance * (class361.distance * -965405943);
										double d_42_ = dz / distance * (class361.distance * -965405943);
										double d_43_ = dy / distance * (class361.distance * -965405943);

										if (class361.anInt3906 * 1563141513 == 0) {
											directionX += d_41_ * dt;
											directionZ += d_42_ * dt;
											directionY += d_43_ * dt;
											bool = true;
										} else {
											x += d_41_ * dt;
											z += d_42_ * dt;
											y += d_43_ * dt;
										}
									}
								}
							}
						}
					}
				}
			}
			if (definition.anIntArray3757 != null) {
				for (int element : definition.anIntArray3757) {
					Class480_Sub27 class480_sub27 = (Class480_Sub27) Class570.aClass667_7644.get(element);
					while (class480_sub27 != null) {
						Class361 class361 = class480_sub27.aClass361_10188;
						double d_45_ = tileX - class480_sub27.anInt10193 * -443484517;
						double d_46_ = tileZ - class480_sub27.anInt10190 * 2068163667;
						double d_47_ = plane - class480_sub27.anInt10191 * -541373055;
						double d_48_ = d_45_ * d_45_ + d_46_ * d_46_ + d_47_ * d_47_;
						if (d_48_ > class361.aLong3889 * -171913190644866815L) {
							class480_sub27 = (Class480_Sub27) Class570.aClass667_7644.nextInBucket();
						} else {
							double d_49_ = Math.sqrt(d_48_);
							if (d_49_ == 0.0) {
								d_49_ = 1.0;
							}
							double d_50_ = (d_45_ * class480_sub27.aFloat10192 + d_46_
									* (class361.anInt3902 * 1822099009) + d_47_ * class480_sub27.aFloat10187)
									* 65535.0 / (class361.distance * -965405943 * d_49_);
							if (d_50_ < class361.anInt3911 * -1142488497) {
								class480_sub27 = (Class480_Sub27) Class570.aClass667_7644.nextInBucket();
							} else {
								double d_51_ = 0.0;
								if (class361.anInt3903 * 1365723579 == 1) {
									d_51_ = d_49_ / 16.0 * (class361.anInt3905 * -2110574355);
								} else if (class361.anInt3903 * 1365723579 == 2) {
									d_51_ = d_49_ / 16.0 * (d_49_ / 16.0) * (class361.anInt3905 * -2110574355);
								}
								if (class361.anInt3899 * 428868563 == 0) {
									if (class361.anInt3906 * 1563141513 == 0) {
										directionX += (class480_sub27.aFloat10192 - d_51_) * dt;
										directionZ += (class361.anInt3902 * 1822099009 - d_51_) * dt;
										directionY += (class480_sub27.aFloat10187 - d_51_) * dt;
										bool = true;
									} else {
										x += (class480_sub27.aFloat10192 - d_51_) * dt;
										z += (class361.anInt3902 * 1822099009 - d_51_) * dt;
										y += (class480_sub27.aFloat10187 - d_51_) * dt;
									}
								} else {
									double d_52_ = d_45_ / d_49_ * (class361.distance * -965405943);
									double d_53_ = d_46_ / d_49_ * (class361.distance * -965405943);
									double d_54_ = d_47_ / d_49_ * (class361.distance * -965405943);
									if (class361.anInt3906 * 1563141513 == 0) {
										directionX += d_52_ * dt;
										directionZ += d_53_ * dt;
										directionY += d_54_ * dt;
										bool = true;
									} else {
										x += d_52_ * dt;
										z += d_53_ * dt;
										y += d_54_ * dt;
									}
								}
								class480_sub27 = (Class480_Sub27) Class570.aClass667_7644.nextInBucket();
							}
						}
					}
				}
			}
			if (definition.anIntArray3758 != null) {
				if (definition.anIntArray3777 == null) {
					definition.anIntArray3777 = new int[definition.anIntArray3758.length];
					for (int i_55_ = 0; i_55_ < definition.anIntArray3758.length; i_55_++) {
						Class198.anInterface44_2095.load(definition.anIntArray3758[i_55_]);
						definition.anIntArray3777[i_55_] = Class293.method5403(definition.anIntArray3758[i_55_]);
					}
				}
				for (int element : definition.anIntArray3777) {
					Class361 class361 = Class570.aClass361Array7635[element];
					if (class361.anInt3906 * 1563141513 == 0) {
						directionX += class361.anInt3901 * -1787673313 * dt;
						directionZ += class361.anInt3902 * 1822099009 * dt;
						directionY += class361.anInt3893 * 1305416359 * dt;
						bool = true;
					} else {
						x += class361.anInt3901 * -1787673313 * dt;
						z += class361.anInt3902 * 1822099009 * dt;
						y += class361.anInt3893 * 1305416359 * dt;
					}
				}
			}
			if (bool) {
				while (directionX > 32767.0 || directionZ > 32767.0 || directionY > 32767.0 || directionX < -32767.0
						|| directionZ < -32767.0 || directionY < -32767.0) {
					directionX /= 2.0;
					directionZ /= 2.0;
					directionY /= 2.0;
					speed <<= 1;
				}
				aShort11652 = (short) directionX;
				aShort11654 = (short) directionZ;
				aShort11655 = (short) directionY;
			}
			x += ((long) aShort11652 * (long) (speed << 2) >> 23) * dt;
			z += ((long) aShort11654 * (long) (speed << 2) >> 23) * dt;
			y += ((long) aShort11655 * (long) (speed << 2) >> 23) * dt;
		}
	}

	void method18122(Class490 class490, Toolkit toolkit, long l) {
		int tileX = x >> 12 + class490.tileScale * -1911343043;
		int tileY = y >> 12 + class490.tileScale * -1911343043;
		int tileZ = z >> 12;

		if (tileZ > 262144 || tileZ < -262144 || tileX < 0 || tileX >= class490.width * 173827901 || tileY < 0
				|| tileY >= class490.length * 134933557) {
			kill();
		} else {
			ParticleSystem parent = emitter.parent;
			ParticleProducerDefinition definition = emitter.definition;
			Ground[] ground = class490.aClass120Array6700;
			int plane = parent.plane;
			Class489 class489 = class490.aClass489ArrayArrayArray6706[parent.plane][tileX][tileY];

			if (class489 != null) {
				plane = class489.aByte6679;
			}

			int groundHeight = ground[plane].getTileHeight(tileX, tileY);
			int nextGroundHeight;
			if (plane < class490.planes * 453886331 - 1) {
				nextGroundHeight = ground[plane + 1].getTileHeight(tileX, tileY);
			} else {
				nextGroundHeight = groundHeight - (8 << class490.tileScale * -1911343043);
			}

			if (definition.aBool3781) {
				if (definition.anInt3728 * 2069100195 == -1 && tileZ > groundHeight) {
					kill();
					return;
				}
				if (definition.anInt3728 * 2069100195 >= 0
						&& tileZ > ground[definition.anInt3728 * 2069100195].getTileHeight(tileX, tileY)) {
					kill();
					return;
				}
				if (definition.anInt3762 * 1187402097 == -1 && tileZ < nextGroundHeight) {
					kill();
					return;
				}
				if (definition.anInt3762 * 1187402097 >= 0
						&& tileZ < ground[definition.anInt3762 * 1187402097 + 1].getTileHeight(tileX, tileY)) {
					kill();
					return;
				}
			}
			int i_62_;
			for (i_62_ = class490.planes * 453886331 - 1; i_62_ > 0
					&& tileZ > ground[i_62_].getTileHeight(tileX, tileY); i_62_--) {

			}
			if (definition.aBool3752 && i_62_ == 0 && tileZ > ground[0].getTileHeight(tileX, tileY)) {
				kill();
			} else if (i_62_ == class490.planes * 453886331 - 1
					&& ground[i_62_].getTileHeight(tileX, tileY) - tileZ > 8 << class490.tileScale * -1911343043) {
				kill();
			} else {
				class489 = class490.aClass489ArrayArrayArray6706[i_62_][tileX][tileY];
				if (class489 == null) {
					if (i_62_ == 0 || class490.aClass489ArrayArrayArray6706[0][tileX][tileY] == null) {
						class489 = class490.aClass489ArrayArrayArray6706[0][tileX][tileY] = new Class489(0);
					}
					boolean bool = class490.aClass489ArrayArrayArray6706[0][tileX][tileY].aClass489_6673 != null;
					if (i_62_ == 3 && bool) {
						i_62_--;
					}
					for (int i_63_ = 1; i_63_ <= i_62_; i_63_++) {
						if (class490.aClass489ArrayArrayArray6706[i_63_][tileX][tileY] == null) {
							class489 = class490.aClass489ArrayArrayArray6706[i_63_][tileX][tileY] = new Class489(i_63_);
							if (bool) {
								class489.aByte6679++;
							}
						}
					}
					if (class489 == null) {
						class489 = class490.aClass489ArrayArrayArray6706[i_62_][tileX][tileY];
					}
				}
				if (definition.aBool3778) {
					int i_64_ = x >> 12;
					int i_65_ = y >> 12;
					if (class489.aClass600_Sub1_Sub5_6674 != null) {
						Class498 class498 = class489.aClass600_Sub1_Sub5_6674.method16293(toolkit);
						if (class498 != null && class498.method8681(i_64_, tileZ, i_65_)) {
							kill();
							return;
						}
					}
					if (class489.aClass600_Sub1_Sub5_6675 != null) {
						Class498 class498 = class489.aClass600_Sub1_Sub5_6675.method16293(toolkit);
						if (class498 != null && class498.method8681(i_64_, tileZ, i_65_)) {
							kill();
							return;
						}
					}
					if (class489.aClass600_Sub1_Sub4_6678 != null) {
						Class498 class498 = class489.aClass600_Sub1_Sub4_6678.method16293(toolkit);
						if (class498 != null && class498.method8681(i_64_, tileZ, i_65_)) {
							kill();
							return;
						}
					}
					for (Class491 class491 = class489.aClass491_6680; class491 != null; class491 = class491.aClass491_6753) {
						Class498 class498 = class491.aClass600_Sub1_Sub3_6752.method16293(toolkit);
						if (class498 != null && class498.method8681(i_64_, tileZ, i_65_)) {
							kill();
							return;
						}
					}
				}
				parent.aClass137_7560.entities.offer(this);
			}
		}
	}

	void link() {
		int index = emitter.parent.anInt7568;
		if (emitter.parent.particles[index] != null) {
			emitter.parent.particles[index].kill();
		}

		emitter.parent.particles[index] = this;
		this.index = (short) emitter.parent.anInt7568;
		emitter.parent.anInt7568 = index + 1 & 0x1fff;
		emitter.particles.offer(this);
	}

}