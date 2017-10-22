package com.jagex;

import java.util.LinkedList;

public class Class575 {
	static Class487 aClass487_7680;
	static CubeMapTextureProvider aClass138_7681;
	static int anInt7683;
	public static int anInt7708 = 607860969;
	static ResourceCache aClass507_7710;
	static {
		anInt7683 = -2104859019;
	}

	public static void method9765(Interface44 interface44) {
		Class570.anInt7636 = 0;
		Particle.cachedParticles = 0;
		Class570.aList7638 = new LinkedList();
		Particle.cache = new Particle[1024];
		ParticleSystem.cache = new ParticleSystem[1 + Class149.maxParticleSystems[Class570.particleSetting
				* -897945427]];
		Class570.anInt7637 = 0;
		ParticleSystem.cachedCount = 0;
		Class198.anInterface44_2095 = interface44;
	}

	static final void method9766(Class480_Sub41 class480_sub41, int i, int i_31_, int i_32_, int i_33_, int i_34_,
			int i_35_, int i_36_, int i_37_, int i_38_) {
		if (Widget.loadInterface(i, null)) {
			if (class480_sub41 != null && !class480_sub41.method16250()) {
				Class480_Sub41.method9830(class480_sub41, true, false);
			} else {
				Interface class221 = Class598.loadedInterfaces[i];
				Client.method17015(class221, class221.method4158(), -1, i_31_, i_32_, i_33_, i_34_, i_35_, i_36_,
						i_37_, i_38_);
			}
		}
	}

	boolean aBool7682;
	Class569 aClass569_7684;
	Class569[][] aClass569ArrayArray7685;
	int anInt7686 = 0;
	float aFloat7687;
	long aLong7688;
	float aFloat7689;
	Class569 aClass569_7690;
	int anInt7691 = 278186945;
	Class569 aClass569_7692;
	Toolkit toolkit;
	float aFloat7694;
	Class569 aClass569_7695;
	Class397 aClass397_7696;
	ReferenceCache aClass168_7697;
	ReferenceCache aClass168_7698;
	ReferenceCache aClass168_7699;
	Archive images;
	boolean aBool7701;
	int[] anIntArray7702;
	float[] aFloatArray7703;
	boolean aBool7704;
	float aFloat7705;
	float aFloat7706;
	Class569 aClass569_7707;
	Class591 aClass591_7709;

	public Class575(Toolkit toolkit, Archive images, int i, int i_12_) {
		aClass397_7696 = new Class397(-50.0F, -60.0F, -50.0F);
		aClass168_7697 = new ReferenceCache(8);
		aClass168_7698 = new ReferenceCache(8);
		aClass168_7699 = new ReferenceCache(9);
		anIntArray7702 = new int[] { -1, -1, -1 };
		aFloatArray7703 = new float[] { 0.0F, 0.0F, 0.0F };

		this.toolkit = toolkit;
		this.images = images;
		aClass569ArrayArray7685 = new Class569[i][i_12_];

		if (-1 != 868409511 * anInt7708) {
			aClass138_7681 = method9701(868409511 * anInt7708);
		}

		aClass569_7690 = new Class569();
		aClass569_7684 = new Class569();
		aClass569_7692 = new Class569();
		aClass569_7707 = new Class569();
		method9709();
		method9698();
		method9749();
	}

	public void method9694(Class460 class460) {
		Class569 class569 = method9706(class460);
		if (null != aClass591_7709) {
			aClass569_7695.copyFrom(class569);
			aClass569_7695.method9598(this, aClass591_7709);
			method9720(aClass569_7695, aClass591_7709.method9953());
		} else {
			method9720(class569, anInt7683 * 1445882517);
		}

		method9708();
		method9710();
		method9712();
	}

	public void method9696(Class460 class460, Class591 class591, int i) {
		aClass591_7709 = class591;
		Class569 class569 = method9706(class460);
		if (aClass591_7709 != null) {
			if (aClass569_7695 == null) {
				aClass569_7695 = new Class569();
			}
			aClass569_7695.copyFrom(class569);
			aClass569_7695.method9598(this, aClass591_7709);
			method9720(aClass569_7695, i);
		} else {
			method9720(class569, i);
			aClass569_7695 = null;
		}
	}

	public void clearCaches() {
		aClass168_7697.clear();
		aClass168_7698.clear();
		aClass168_7699.clear();
	}

	public void method9704(int i, int i_8_, Class569 class569) {
		aClass569ArrayArray7685[i][i_8_] = class569;
	}

	public void method9705(int i) {
		for (int i_10_ = 0; i_10_ < aClass569ArrayArray7685.length; i_10_++) {
			for (int i_11_ = 0; i_11_ < aClass569ArrayArray7685[i_10_].length; i_11_++) {
				aClass569ArrayArray7685[i_10_][i_11_] = aClass569_7690;
			}
		}
	}

	public Class569 method9707() {
		return aClass569_7684;
	}

	public void method9709() {
		aBool7682 = true;
	}

	public void method9711(float f, float f_15_, float f_16_, int i, int i_17_, int i_18_, int i_19_, int i_20_) {
		toolkit.method2476((0.7F + Class199.preferences.brightness.getValue() * 0.1F + Client.aClass460_10760
				.method7752()) * f);
		toolkit.method2477(i, f_15_, f_16_, i_17_ << 2, i_18_ << 2, i_19_ << 2);
		toolkit.setCubeMapTextureProvider(method9701(i_20_));
	}

	public void method9712() {
		int colour = (aClass569_7684.anInt7620 * -1441893967 + 256 << 2);
		toolkit.setFogColour(aClass569_7684.anInt7619 * 1359053771, Class199.preferences.fog.getValue() == 1 ? colour
				: -1, 0);
	}

	public void method9718() {
		toolkit.method2476((0.7F + Class199.preferences.brightness.getValue() * 0.1F + Client.aClass460_10760
				.method7752()) * 1.1523438F);
		toolkit.method2477(16777215, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
		toolkit.setFogColour(13156520, -1, 0);
		toolkit.setCubeMapTextureProvider(aClass138_7681);
	}

	public void method9722(Class575 class575_27_) {
		aClass569_7684.copyFrom(class575_27_.aClass569_7684);
		aClass569_7692.copyFrom(class575_27_.aClass569_7692);
		aClass569_7707.copyFrom(class575_27_.aClass569_7707);
		aLong7688 = class575_27_.aLong7688 * 1L;
		anInt7686 = class575_27_.anInt7686 * 1;
		anInt7691 = class575_27_.anInt7691 * 1;
	}

	public void method9727(Class460 class460) {
		Class569 class569 = method9706(class460);
		if (null != aClass591_7709) {
			aClass569_7695.copyFrom(class569);
			aClass569_7695.method9598(this, aClass591_7709);
			method9720(aClass569_7695, aClass591_7709.method9953());
		} else {
			method9720(class569, anInt7683 * 1445882517);
		}

		method9708();
		method9713();
		method9714();
		method9716();
	}

	public void method9734(int i, int i_28_) {
		Class569 class569 = aClass569ArrayArray7685[i][i_28_];
		if (class569 != null) {
			aClass397_7696.copyFrom(class569.aClass397_7618);
		}
		method9710();
	}

	public Class591 method9753() {
		return aClass591_7709;
	}

	void method9698() {
		aBool7701 = false;
		int[] is = anIntArray7702;
		int[] is_1_ = anIntArray7702;
		anIntArray7702[2] = -1;
		is_1_[1] = -1;
		is[0] = -1;
		float[] fs = aFloatArray7703;
		float[] fs_2_ = aFloatArray7703;
		aFloatArray7703[2] = 0.0F;
		fs_2_[1] = 0.0F;
		fs[0] = 0.0F;
	}

	CubeMapTextureProvider method9701(int id) {
		CubeMapTextureProvider class138 = (CubeMapTextureProvider) aClass168_7697.get(id);
		if (class138 != null) {
			return class138;
		}

		class138 = toolkit.createCubeMapTextureProvider(id);
		aClass168_7697.put(id, class138);
		return class138;
	}

	Class487 method9702(int skybox, int i_4_, int i_5_, int i_6_) {
		long l = (i_4_ & 0xffffL) << 48 | (i_5_ & 0xffffL) << 32 | (i_6_ & 0xffffL) << 16 | skybox & 0xffffL;
		Class487 class487 = (Class487) aClass168_7698.get(l);
		if (class487 == null) {
			class487 = Class487.create(skybox, i_4_, i_5_, i_6_, SkyboxDefinition.loader, SunDefinition.loader);
			aClass168_7698.put(l, class487);
		}

		return class487;
	}

	Class569 method9706(Class460 class460) {
		int regionX = -1;
		int regionZ = -1;

		if (AsynchronousStreamRequest.loggedOutState(Client.gameState * -1501875989)
				|| Class456.lobbyState(Client.gameState * -1501875989)) {
			regionX = 2006359481 * Client.cameraX >> 12;
			regionZ = 1829446257 * Wall.cameraZ >> 12;
		} else {
			if (Client.localPlayer != null) {
				regionX = Client.localPlayer.pathX[0] >> 3;
				regionZ = Client.localPlayer.pathZ[0] >> 3;
			}

			if (regionX < 0 || regionX >= class460.method7680() >> 3 || regionZ < 0
					|| regionZ >= class460.method7707() >> 3) {
				regionX = class460.method7680() >> 4;
				regionZ = class460.method7707() >> 4;
			}
		}

		Class569 class569 = aClass569ArrayArray7685[regionX][regionZ];
		if (null == class569) {
			class569 = aClass569_7690;
		}

		return class569;
	}

	void method9708() {
		if (296139711 * anInt7691 >= 0) {
			long l = TimeUtil.time();
			anInt7691 -= (l - aLong7688 * -230158481140244361L) * -278186945L;
			if (anInt7691 * 296139711 > 0) {
				aClass569_7684.method9591(toolkit, aClass569_7692, aClass569_7707,
						(float) (369777877 * anInt7686 - anInt7691 * 296139711) / (float) (369777877 * anInt7686));
			} else {
				aClass569_7684.copyFrom(aClass569_7707);
				if (null != aClass569_7684.aClass487_7625) {
					aClass569_7684.aClass487_7625.method8262();
				}
				anInt7691 = 278186945;
			}
			aLong7688 = l * 8019312175229712711L;
		}
	}

	void method9710() {
		toolkit.method2476((0.7F + Class199.preferences.brightness.getValue() * 0.1F + Client.aClass460_10760
				.method7752()) * aClass569_7684.aFloat7615);
		toolkit.method2477(-1514981919 * aClass569_7684.anInt7617, aClass569_7684.aFloat7616,
				aClass569_7684.aFloat7632, (int) aClass397_7696.x << 2, (int) aClass397_7696.y << 2,
				(int) aClass397_7696.z << 2);
		toolkit.setCubeMapTextureProvider(aClass569_7684.aClass138_7621);
	}

	void method9713() {
		toolkit.method2497(aClass569_7684.aFloat7627, aClass569_7684.aFloat7631, aClass569_7684.aFloat7623,
				(byte) 54);
	}

	void method9714() {
		if (toolkit.method2489()) {
			if (aBool7704) {
				toolkit.method2490(aFloat7705, aFloat7706, aFloat7687, aFloat7694, aFloat7689);
			} else {
				toolkit.method2490(aClass569_7684.aFloat7626, aClass569_7684.aFloat7622,
						aClass569_7684.aFloat7628, aClass569_7684.aFloat7624, aClass569_7684.aFloat7630);
			}
		}
	}

	void method9716() {
		if (toolkit.method2492()) {
			Class118 class118 = null;
			Class118 class118_24_ = null;
			Class118 class118_25_ = null;
			if (aBool7701) {
				if (anIntArray7702[0] > -1) {
					class118 = method9742(anIntArray7702[0]);
				}
				if (anIntArray7702[1] > -1) {
					class118_24_ = method9742(anIntArray7702[1]);
				}
				if (anIntArray7702[2] > -1) {
					class118_25_ = method9742(anIntArray7702[2]);
				}
				toolkit.method2493(class118, aFloatArray7703[0], class118_24_, aFloatArray7703[1], class118_25_,
						aFloatArray7703[2]);
			} else {
				if (aClass569_7684.anIntArray7629[0] > -1) {
					class118 = method9742(aClass569_7684.anIntArray7629[0]);
				}
				if (aClass569_7684.anIntArray7629[1] > -1) {
					class118_24_ = method9742(aClass569_7684.anIntArray7629[1]);
				}
				if (aClass569_7684.anIntArray7629[2] > -1) {
					class118_25_ = method9742(aClass569_7684.anIntArray7629[2]);
				}
				toolkit.method2493(class118, aClass569_7684.aFloatArray7614[0], class118_24_,
						aClass569_7684.aFloatArray7614[1], class118_25_, aClass569_7684.aFloatArray7614[2]);
			}
		}
	}

	void method9720(Class569 class569, int i) {
		if (aBool7682) {
			aBool7682 = false;
			i = 0;
		}
		if (!aClass569_7707.equals(class569)) {
			aClass569_7707.copyFrom(class569);
			aLong7688 = TimeUtil.time() * 8019312175229712711L;
			anInt7686 = (anInt7691 = i * -278186945) * -1884901309;
			if (0 != 369777877 * anInt7686) {
				aClass569_7692.copyFrom(aClass569_7684);
				if (null != aClass569_7684.aClass487_7625) {
					if (aClass569_7684.aClass487_7625.method8253()) {
						aClass569_7684.aClass487_7625 = aClass569_7692.aClass487_7625 = aClass569_7684.aClass487_7625
								.method8254();
					}
					if (null != aClass569_7684.aClass487_7625
							&& aClass569_7707.aClass487_7625 != aClass569_7684.aClass487_7625) {
						aClass569_7684.aClass487_7625.method8252(aClass569_7707.aClass487_7625);
					}
				}
			}
		}
	}

	Class118 method9742(int i) {
		Class118 class118 = (Class118) aClass168_7699.get(i);
		if (null != class118) {
			return class118;
		}

		Image image = ImageUtils.loadFirst(images, i);
		if (image != null && image.getWidth() == 256 && image.getHeight() == 16) {
			int[] argb = image.argb(false);
			class118 = toolkit.method2491(argb);

			if (class118 != null) {
				aClass168_7699.put(i, class118);
			}
		}

		return class118;
	}

	void method9749() {
		aBool7704 = false;
		aFloat7705 = 1.0F;
		aFloat7706 = 0.0F;
		aFloat7687 = 1.0F;
		aFloat7694 = 0.0F;
		aFloat7689 = 1.0F;
	}

}