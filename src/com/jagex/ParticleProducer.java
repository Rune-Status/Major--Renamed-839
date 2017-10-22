package com.jagex;

public class ParticleProducer {
	static Widget aClass226_7678;

	static final void method9684(int i, int[] is) {
		if (Widget.loadInterface(i, is)) {
			Widget[] widgets = Class598.loadedInterfaces[i].children;
			for (Widget widget : widgets) {
				if (widget != null && widget.aClass650_2541 != null) {
					widget.aClass650_2541.method13463();
				}
			}
		}
	}

	ParticleSystem parent;
	ParticleTriangle current;
	Class145 aClass145_7661;
	int anInt7662;
	EntityList particles;
	int particleCount;
	long startTime;
	boolean aBool7666;
	int particleCounter = 0;
	ParticleTriangle aClass579_7668;
	int anInt7669;
	int anInt7670;
	int anInt7671;
	int anInt7672;
	ParticleProducerDefinition definition;
	int anInt7674;
	int anInt7675;
	boolean unmoved;
	boolean aBool7677;

	ParticleProducer(Toolkit toolkit, Class145 class145, ParticleSystem system, long time) {
		aBool7666 = false;
		current = new ParticleTriangle();
		aClass579_7668 = new ParticleTriangle();
		unmoved = false;
		aBool7677 = false;
		aClass145_7661 = class145;
		parent = system;
		startTime = time * -7590219732314579427L;
		definition = aClass145_7661.getProducer(toolkit.particleLoader);
		if (!toolkit.method2539() && -2115856105 * definition.anInt3770 != -1) {
			definition = toolkit.particleLoader.load(-2115856105 * definition.anInt3770);
		}

		particles = new EntityList();
		particleCounter = (int) (1143511863 * particleCounter + Math.random() * 64.0) * -894825849;
		updatePosition();
		aClass579_7668.anInt7750 = current.anInt7750 * 1;
		aClass579_7668.anInt7742 = 1 * current.anInt7742;
		aClass579_7668.anInt7743 = current.anInt7743 * 1;
		aClass579_7668.anInt7744 = current.anInt7744 * 1;
		aClass579_7668.anInt7746 = current.anInt7746 * 1;
		aClass579_7668.anInt7751 = 1 * current.anInt7751;
		aClass579_7668.anInt7745 = 1 * current.anInt7745;
		aClass579_7668.anInt7748 = current.anInt7748 * 1;
		aClass579_7668.anInt7749 = current.anInt7749 * 1;
	}

	void updatePosition() {
		current.anInt7750 = 1065904471 * aClass145_7661.anInt1809;
		current.anInt7742 = -530820371 * aClass145_7661.anInt1816;
		current.anInt7743 = -1563545285 * aClass145_7661.anInt1811;
		current.anInt7744 = 1166708931 * aClass145_7661.anInt1810;
		current.anInt7746 = aClass145_7661.anInt1813 * -1213788101;
		current.anInt7751 = 1166829601 * aClass145_7661.anInt1814;
		current.anInt7745 = aClass145_7661.anInt1815 * 723244479;
		current.anInt7748 = aClass145_7661.anInt1808 * -2075851931;
		current.anInt7749 = 280437761 * aClass145_7661.anInt1817;
		if (-1196990579 * current.anInt7744 == 1352340659 * current.anInt7750
				&& current.anInt7745 * 1199269763 == current.anInt7744 * -1196990579
				&& current.anInt7742 * 1890882153 == current.anInt7746 * -1081209023
				&& current.anInt7748 * -241717785 == current.anInt7746 * -1081209023
				&& -1917760555 * current.anInt7743 == 1298407239 * current.anInt7751
				&& current.anInt7751 * 1298407239 == current.anInt7749 * -189952439) {
			unmoved = true;
		} else if (unmoved) {
			unmoved = false;
			aClass579_7668.anInt7750 = 1 * current.anInt7750;
			aClass579_7668.anInt7742 = current.anInt7742 * 1;
			aClass579_7668.anInt7743 = 1 * current.anInt7743;
			aClass579_7668.anInt7744 = 1 * current.anInt7744;
			aClass579_7668.anInt7746 = current.anInt7746 * 1;
			aClass579_7668.anInt7751 = 1 * current.anInt7751;
			aClass579_7668.anInt7745 = 1 * current.anInt7745;
			aClass579_7668.anInt7748 = current.anInt7748 * 1;
			aClass579_7668.anInt7749 = 1 * current.anInt7749;
		}
	}

	void method9675(Class490 class490, Toolkit toolkit, long l) {
		for (Particle class477_sub4_sub1_sub1 = (Particle) particles.head(); class477_sub4_sub1_sub1 != null; class477_sub4_sub1_sub1 = (Particle) particles
				.next()) {
			class477_sub4_sub1_sub1.method18122(class490, toolkit, l);
		}
	}

	void method9676(Toolkit toolkit, long l, int i, boolean bool) {
		if (aBool7666) {
			bool = false;
		} else if (Class570.particleSetting * -897945427 < definition.minimumSetting * 904647545) {
			bool = false;
		} else if (Class570.anInt7640 * -238678919 > Class149.anIntArray1832[-897945427 * Class570.particleSetting]) {
			bool = false;
		} else if (unmoved) {
			bool = false;
		} else if (909775785 * definition.lifetime != -1) {
			int i_1_ = (int) (l - -8879684279511083979L * startTime);
			if (!definition.periodic && i_1_ > definition.lifetime * 909775785) {
				bool = false;
			} else {
				i_1_ %= 909775785 * definition.lifetime;
			}
			if (!definition.activeFirst && i_1_ < 526596259 * definition.anInt3766) {
				bool = false;
			}
			if (definition.activeFirst && i_1_ >= 526596259 * definition.anInt3766) {
				bool = false;
			}
		}
		particleCount = 0;
		for (Particle class477_sub4_sub1_sub1 = (Particle) particles.head(); class477_sub4_sub1_sub1 != null; class477_sub4_sub1_sub1 = (Particle) particles
				.next()) {
			class477_sub4_sub1_sub1.method18121(l, i);
			particleCount += 539160383;
		}
		if (bool) {
			int i_2_ = (1352340659 * current.anInt7750 + current.anInt7744 * -1196990579 + 1199269763 * current.anInt7745) / 3;
			int i_3_ = (-241717785 * current.anInt7748 + -1081209023 * current.anInt7746 + 1890882153 * current.anInt7742) / 3;
			int i_4_ = (current.anInt7751 * 1298407239 + current.anInt7743 * -1917760555 + -189952439
					* current.anInt7749) / 3;
			if (i_2_ != -1984741165 * current.centerX || i_3_ != -352293249 * current.centerZ
					|| i_4_ != 1179722655 * current.centerY || !aBool7677) {
				current.centerX = i_2_ * -1298720933;
				current.centerZ = 1689080191 * i_3_;
				current.centerY = 1497839711 * i_4_;
				int i_5_ = -1196990579 * current.anInt7744 - current.anInt7750 * 1352340659;
				int i_6_ = -1081209023 * current.anInt7746 - current.anInt7742 * 1890882153;
				int i_7_ = current.anInt7751 * 1298407239 - -1917760555 * current.anInt7743;
				int i_8_ = 1199269763 * current.anInt7745 - current.anInt7750 * 1352340659;
				int i_9_ = -241717785 * current.anInt7748 - 1890882153 * current.anInt7742;
				int i_10_ = current.anInt7749 * -189952439 - -1917760555 * current.anInt7743;
				anInt7662 = (i_6_ * i_10_ - i_9_ * i_7_) * -305971867;
				anInt7670 = 178010635 * (i_8_ * i_7_ - i_5_ * i_10_);
				for (anInt7671 = 1155893337 * (i_9_ * i_5_ - i_6_ * i_8_); -172774291 * anInt7662 > 32767
						|| anInt7670 * -1543044701 > 32767 || anInt7671 * -1313783831 > 32767
						|| -172774291 * anInt7662 < -32767 || anInt7670 * -1543044701 < -32767
						|| anInt7671 * -1313783831 < -32767; anInt7671 = 1155893337 * (-1313783831 * anInt7671 >> 1)) {
					anInt7662 = -305971867 * (-172774291 * anInt7662 >> 1);
					anInt7670 = (anInt7670 * -1543044701 >> 1) * 178010635;
				}
				int i_11_ = (int) Math.sqrt(anInt7671 * -1313783831 * -1313783831 * anInt7671 + anInt7662 * -172774291
						* -172774291 * anInt7662 + anInt7670 * -1543044701 * anInt7670 * -1543044701);
				if (i_11_ <= 0) {
					i_11_ = 1;
				}
				anInt7662 = anInt7662 * -528297069 / i_11_ * -305971867;
				anInt7670 = 178010635 * (anInt7670 * -590709155 / i_11_);
				anInt7671 = 1155893337 * (anInt7671 * -297582569 / i_11_);
				if (definition.maximumAngleH > 0 || definition.maximumAngleV > 0) {
					int i_12_ = (int) (Math.atan2(anInt7671 * -1313783831, -172774291 * anInt7662) * 2607.5945876176133);
					int i_13_ = (int) (Math.atan2(
							anInt7670 * -1543044701,
							Math.sqrt(anInt7662 * -172774291 * anInt7662 * -172774291 + -1313783831 * anInt7671
									* anInt7671 * -1313783831)) * 2607.5945876176133);
					anInt7669 = (definition.maximumAngleH - definition.minimumAngleH) * 2146455129;
					anInt7672 = 288851487 * (i_12_ + definition.minimumAngleH - (anInt7669 * 1802639849 >> 1));
					anInt7675 = (definition.maximumAngleV - definition.minimumAngleV) * -1540772663;
					anInt7674 = (definition.minimumAngleV + i_13_ - (-1166135943 * anInt7675 >> 1)) * 2107384261;
				}
				aBool7677 = true;
			}
			particleCounter += (int) (i * (definition.minimumParticleRate * 334215149 + Math.random()
					* (definition.maximumParticleRate * 988678901 - definition.minimumParticleRate * 334215149)))
					* -894825849;
			if (particleCounter * 1143511863 > 63) {
				int i_14_ = 1143511863 * particleCounter >> 6;
				particleCounter = -894825849 * (particleCounter * 1143511863 & 0x3f);
				int i_15_ = (i << 8) / i_14_;
				int i_16_ = 0;
				int i_17_ = 0;
				while (i_17_ < i_14_) {
					int i_18_;
					int i_19_;
					int i_20_;
					if (definition.maximumAngleH > 0 || definition.maximumAngleV > 0) {
						int i_21_ = anInt7672 * -118852129 + (int) (1802639849 * anInt7669 * Math.random());
						i_21_ &= 0x3fff;
						int i_22_ = Class373.SINE[i_21_];
						int i_23_ = Class373.COSINE[i_21_];
						int i_24_ = anInt7674 * 1535816973 + (int) (-1166135943 * anInt7675 * Math.random());
						i_24_ &= 0x1fff;
						int i_25_ = Class373.SINE[i_24_];
						int i_26_ = Class373.COSINE[i_24_];
						int i_27_ = 13;
						i_18_ = i_25_ * i_23_ >> i_27_;
						i_19_ = -1 * (i_26_ << 1);
						i_20_ = i_25_ * i_22_ >> i_27_;
					} else {
						i_18_ = anInt7662 * -172774291;
						i_19_ = anInt7670 * -1543044701;
						i_20_ = -1313783831 * anInt7671;
					}
					float f = (float) Math.random();
					float f_28_ = (float) Math.random();
					if (f_28_ + f > 1.0F) {
						f = 1.0F - f;
						f_28_ = 1.0F - f_28_;
					}
					float f_29_ = 1.0F - (f + f_28_);
					int i_30_ = (int) (current.anInt7750 * 1352340659 * f + current.anInt7744 * -1196990579 * f_28_ + f_29_
							* (current.anInt7745 * 1199269763));
					int i_31_ = (int) (f_28_ * (current.anInt7746 * -1081209023) + current.anInt7742
							* 1890882153 * f + f_29_ * (current.anInt7748 * -241717785));
					int i_32_ = (int) (current.anInt7749 * -189952439 * f_29_ + (f_28_
							* (current.anInt7751 * 1298407239) + current.anInt7743 * -1917760555 * f));
					int i_33_ = definition.minimumSpeed
							* 723887793
							+ (int) (Math.random() * (1808445073 * definition.maximumSpeed - definition.minimumSpeed * 723887793));
					int i_34_ = definition.minimumLifetime
							* 1431886847
							+ (int) (Math.random() * (-1122401665 * definition.maximumLifetime - 1431886847 * definition.minimumLifetime));
					int i_35_ = 1137043897
							* definition.minimumSize
							+ (int) (Math.random() * (-598486203 * definition.maximumSize - 1137043897 * definition.minimumSize));
					int i_36_ = 2071910779 * definition.anInt3786;
					if (definition.anInt3804 * 1321905051 != 0) {
						if (1899993099 * definition.anInt3753 == 0) {
							i_36_ += (int) (Math.random() * (definition.anInt3804 * 1321905051 + 1));
						} else {
							i_36_ += (int) (Math.random() * (1 + 1899993099 * definition.anInt3753))
									* (definition.anInt3804 * 1321905051 / (definition.anInt3753 * 1899993099));
						}
					}
					int i_37_ = -413551963 * definition.anInt3774;
					if (0 != -1538644467 * definition.anInt3788) {
						i_37_ += (int) (Math.random() * (1 + definition.anInt3788 * -1538644467));
					}
					int i_38_;
					if (definition.uniformColourVariance) {
						double d = Math.random();
						i_38_ = (int) (14034843 * definition.minimumStartRed + d
								* (definition.startRedVariance * 1537964727)) << 16
								| (int) (1320046975 * definition.startBlueVariance * d + definition.minimumStartBlue * 938436719) << 8
								| (int) (-914890509 * definition.minimumStartGreen + d
										* (1586025355 * definition.startGreenVariance))
								| (int) (-1556156205 * definition.minimumStartAlpha + Math.random()
										* (definition.startAlphaVariance * 910074069)) << 24;
					} else {
						i_38_ = (int) (14034843 * definition.minimumStartRed + Math.random()
								* (1537964727 * definition.startRedVariance)) << 16
								| (int) (definition.minimumStartBlue * 938436719 + Math.random()
										* (definition.startBlueVariance * 1320046975)) << 8
								| (int) (-914890509 * definition.minimumStartGreen + Math.random()
										* (1586025355 * definition.startGreenVariance))
								| (int) (-1556156205 * definition.minimumStartAlpha + Math.random()
										* (910074069 * definition.startAlphaVariance)) << 24;
					}
					int i_39_ = -919955657 * definition.anInt3793;
					if (!toolkit.method2539() && !definition.aBool3799) {
						i_39_ = -1;
					}
					Particle class477_sub4_sub1_sub1;
					if (Class570.anInt7636 * 1076968887 != 1486901643 * Particle.cachedParticles) {
						class477_sub4_sub1_sub1 = Particle.cache[Class570.anInt7636 * 1076968887];
						Class570.anInt7636 = (1 + 1076968887 * Class570.anInt7636 & 0x3ff) * 93532167;
						class477_sub4_sub1_sub1.reset(this, i_30_, i_31_, i_32_, i_18_, i_19_, i_20_, i_33_, i_34_,
								i_38_, i_35_, i_36_, i_37_, i_39_, definition.aBool3773, definition.aBool3801);
					} else {
						class477_sub4_sub1_sub1 = new Particle(this, i_30_, i_31_, i_32_, i_18_, i_19_, i_20_, i_33_,
								i_34_, i_38_, i_35_, i_36_, i_37_, i_39_, definition.aBool3773, definition.aBool3801);
					}
					if (i_16_ > 256) {
						class477_sub4_sub1_sub1.method18121(l, i_16_ >> 8);
					}
					particleCount += 539160383;
					i_17_++;
					i_16_ += i_15_;
				}
			}
		}

		if (!current.equals(aClass579_7668)) {
			ParticleTriangle triangle = aClass579_7668;
			aClass579_7668 = current;
			current = triangle;
			current.anInt7750 = aClass145_7661.anInt1809 * 1065904471;
			current.anInt7742 = -530820371 * aClass145_7661.anInt1816;
			current.anInt7743 = aClass145_7661.anInt1811 * -1563545285;
			current.anInt7744 = 1166708931 * aClass145_7661.anInt1810;
			current.anInt7746 = -1213788101 * aClass145_7661.anInt1813;
			current.anInt7751 = 1166829601 * aClass145_7661.anInt1814;
			current.anInt7745 = 723244479 * aClass145_7661.anInt1815;
			current.anInt7748 = -2075851931 * aClass145_7661.anInt1808;
			current.anInt7749 = aClass145_7661.anInt1817 * 280437761;
			current.centerX = aClass579_7668.centerX * 1;
			current.centerZ = aClass579_7668.centerZ * 1;
			current.centerY = 1 * aClass579_7668.centerY;
		}

		Class570.anInt7633 += particleCount * -2838089;
	}

}