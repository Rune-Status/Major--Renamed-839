package com.jagex;

import java.util.HashMap;
import java.util.Iterator;

public class Class460 {
	Class575 aClass575_5213;
	Class458 aClass458_5214;
	Class458 aClass458_5215;
	int anInt5216;
	HashMap aHashMap5217;
	Class436_Sub1 aClass436_Sub1_5218;
	Class553 aClass553_5219 = new Class553();
	Class553 aClass553_5220 = new Class553();
	int centreX;
	int centreY;
	int mapWidth;
	int mapLength;
	byte[][] aByteArrayArray5225;
	byte[][] aByteArrayArray5226;
	TileFlags flags;
	int anInt5228;
	int anInt5229;
	Class480_Sub31_Sub18 aClass480_Sub31_Sub18_5230;
	Class488 aClass488_5231;
	Class450 aClass450_5232 = new Class450(0, 0, 0, 0);
	byte[][] aByteArrayArray5233;
	ObjectDefinitionLoader objects;
	int[][] anIntArrayArray5235;
	int anInt5236;
	Class436_Sub1 aClass436_Sub1_5237;
	Class447 aClass447_5238;
	byte[][][] aByteArrayArrayArray5239;
	int anInt5240;
	int anInt5241;
	int regionCount;
	MapSize aClass236_5243;
	boolean aBool5244;
	int[] regionIds;
	int[] mapIds;
	byte[][] aByteArrayArray5247;
	byte[][] aByteArrayArray5248;
	float aFloat5249;
	int[][][] regionData;
	int[][] anIntArrayArray5251;
	Class490 aClass490_5252;
	public boolean aBool5253;
	public long aLong5254;

	int anInt5255 = 0;

	public Class460(boolean bool) {
		anInt5240 = -870183945;
		anInt5216 = 564736157;
		aHashMap5217 = new HashMap();
		aBool5244 = bool;
	}

	public Class458 method7675() {
		return aClass458_5214;
	}

	public Class447 method7676() {
		return aClass447_5238;
	}

	public int method7678() {
		return 100 - 1170792412 * anInt5241 / (-1085876811 * anInt5216);
	}

	public Class553 method7679() {
		return aClass553_5219;
	}

	public int method7680() {
		return -1171509167 * mapWidth;
	}

	public Class450 method7683() {
		return aClass450_5232;
	}

	public int method7685() {
		return 1173873181 * anInt5228;
	}

	public int method7686() {
		return 1024399169 * anInt5229;
	}

	public Class490 method7687() {
		return aClass490_5252;
	}

	public byte[][] method7688(int i) {
		if (null != aClass436_Sub1_5218 && null != aClass436_Sub1_5218.aByteArrayArrayArray4971
				&& null != aClass436_Sub1_5218.aByteArrayArrayArray4971[i]) {
			return aClass436_Sub1_5218.aByteArrayArrayArray4971[i];
		}
		return null;
	}

	public Class575 method7690() {
		return aClass575_5213;
	}

	public ObjectDefinitionLoader getObjectLoader() {
		return objects;
	}

	public int[][] method7692() {
		return anIntArrayArray5235;
	}

	public int[][] method7693() {
		return anIntArrayArray5251;
	}

	public byte[][][] method7694() {
		return aByteArrayArrayArray5239;
	}

	public Class436_Sub1 method7696() {
		return aClass436_Sub1_5218;
	}

	public void method7698() {
		aClass553_5219 = new Class553();
		centreY = 0;
		centreX = 0;
	}

	public void method7700() {
		aClass447_5238 = Class447.aClass447_5064;
		anInt5255 = 0;
		anInt5240 = -870183945;
		anInt5241 = 0;
		anInt5216 = 564736157;
		anInt5236 = 0;
	}

	public void method7702() {
		aClass575_5213.method9696(this, null, 0);
	}

	public void method7705() {
		if (aBool5244) {
			method7700();
			Class460 class460_2_ = Client.aClass460_10760;
			regionCount = 1 * class460_2_.regionCount;
			regionIds = class460_2_.regionIds;
			mapIds = class460_2_.mapIds;
			aByteArrayArray5247 = class460_2_.aByteArrayArray5247;
			aByteArrayArray5248 = class460_2_.aByteArrayArray5248;
			aByteArrayArray5226 = class460_2_.aByteArrayArray5226;
			aByteArrayArray5225 = class460_2_.aByteArrayArray5225;
			aByteArrayArray5233 = class460_2_.aByteArrayArray5233;
			flags = class460_2_.flags;
			aClass575_5213 = class460_2_.aClass575_5213;
			regionData = class460_2_.regionData;
			anInt5228 = class460_2_.anInt5228 * 1;
			anInt5229 = class460_2_.anInt5229 * 1;
			aClass480_Sub31_Sub18_5230 = class460_2_.aClass480_Sub31_Sub18_5230;
			aClass488_5231 = class460_2_.aClass488_5231;
			anIntArrayArray5235 = class460_2_.anIntArrayArray5235;
			anIntArrayArray5251 = class460_2_.anIntArrayArray5251;
			aByteArrayArrayArray5239 = class460_2_.aByteArrayArrayArray5239;
			aClass458_5214 = class460_2_.aClass458_5214;
			aClass236_5243 = class460_2_.aClass236_5243;
			aClass553_5219 = class460_2_.aClass553_5219;
			aClass553_5220 = class460_2_.aClass553_5220;
			centreX = class460_2_.centreX * 1;
			centreY = 1 * class460_2_.centreY;
			mapWidth = class460_2_.mapWidth * 1;
			mapLength = 1 * class460_2_.mapLength;
		} else if (-1501875989 * Client.gameState == 0) {
			Class536.setGameState(12);
		} else if (-1501875989 * Client.gameState == 8) {
			Class536.setGameState(7);
		} else if (11 == Client.gameState * -1501875989) {
			Class536.setGameState(17);
		} else if (16 == Client.gameState * -1501875989) {
			Class536.setGameState(13);
		} else if (-1501875989 * Client.gameState == 6) {
			Class536.setGameState(1);
		}
	}

	public void method7706(Class452 class452) {
		aClass458_5214 = class452.aClass458_5090;
		if (Class458.aClass458_5161 == aClass458_5214) {
			method7727();
		} else if (aClass458_5214 == Class458.aClass458_5154) {
			decodeMapArea(class452.buffer);
		} else if (Class458.aClass458_5152 == aClass458_5214) {
			method7757();
		} else if (aClass458_5214.method7537()) {
			method7709(class452.buffer);
		}
	}

	public int method7707() {
		return mapLength * 18804445;
	}

	public Class488 method7729() {
		return aClass488_5231;
	}

	public float method7752() {
		return aFloat5249;
	}

	public void setObjectLoader(ObjectDefinitionLoader loader) {
		objects = loader;
	}

	public void method7770(byte[][][] is) {
		aByteArrayArrayArray5239 = is;
	}

	public TileFlags method7775() {
		return flags;
	}

	public int method7779() {
		return 100 - -572767956 * anInt5255 / (-383638073 * anInt5240);
	}

	public void method7787() {
		anInt5228 = 208906600;
		if (-1171509167 * mapWidth == 0) {
			anInt5229 = 1309201454;
		} else {
			anInt5229 = (int) (mapWidth * -1171509167 * 34.46) * 662272193;
		}
		anInt5229 = 662272193 * (1024399169 * anInt5229 << 2);
		if (Class60.activeToolkit.method2386()) {
			anInt5229 += -219053568;
		}
	}

	public void method7788(boolean bool) {
		Class591 class591 = null;
		if (aClass575_5213 != null && bool) {
			class591 = aClass575_5213.method9753();
		}

		aClass575_5213 = new Class575(Class60.activeToolkit, DequeIterator.images, mapWidth * -1171509167 >> 3,
				mapLength * 18804445 >> 3);
		if (class591 != null) {
			aClass575_5213.method9696(this, class591, 0);
		}
	}

	public void method7805() {
		if (null != aClass490_5252) {
			Class23.method752();
			aHashMap5217 = aClass490_5252.method8358();
			aClass490_5252.aClass497_6711.method8666();
			aClass490_5252 = null;
		}
	}

	public boolean method7810() {
		if (!aBool5244) {
			HostNameIdentifier.method1377(false);
		}
		anInt5255 = 0;
		for (int i_147_ = 0; i_147_ < regionCount * -812287789; i_147_++) {
			if (!BufferedConnectionContext.maps.loadEntry(mapIds[i_147_])) {
				anInt5255 += -299787605;
			}
		}
		if (aClass488_5231 == null) {
			if (null != aClass480_Sub31_Sub18_5230
					&& SetMemberRankChannelUpdate.worldMap.validFile(aClass480_Sub31_Sub18_5230.aString11419)) {
				if (!SetMemberRankChannelUpdate.worldMap.loadEntry(aClass480_Sub31_Sub18_5230.aString11419)) {
					anInt5255 += -299787605;
				} else {
					aClass488_5231 = Class448.method1002(SetMemberRankChannelUpdate.worldMap,
							aClass480_Sub31_Sub18_5230.aString11419, Client.membersWorld);
				}
			} else {
				aClass488_5231 = new Class488(0);
			}
		}
		if (anInt5255 * 466718723 > 0) {
			if (anInt5240 * -383638073 < 466718723 * anInt5255) {
				anInt5240 = 1556616165 * anInt5255;
			}
			aClass447_5238 = Class447.aClass447_5065;
			return false;
		}
		for (int i_148_ = 0; i_148_ < regionCount * -812287789; i_148_++) {
			if (null == aByteArrayArray5247[i_148_]) {
				aByteArrayArray5247[i_148_] = BufferedConnectionContext.maps.get(mapIds[i_148_], -1891347841
						* Class431.aClass431_4896.anInt4902);
			}
			if (null == aByteArrayArray5248[i_148_]) {
				aByteArrayArray5248[i_148_] = BufferedConnectionContext.maps.get(mapIds[i_148_], -1891347841
						* Class431.aClass431_4893.anInt4902);
			}
			if (null == aByteArrayArray5225[i_148_]) {
				aByteArrayArray5225[i_148_] = BufferedConnectionContext.maps.get(mapIds[i_148_],
						Class431.aClass431_4897.anInt4902 * -1891347841);
			}
			if (aByteArrayArray5233[i_148_] == null) {
				aByteArrayArray5233[i_148_] = BufferedConnectionContext.maps.get(mapIds[i_148_],
						Class431.aClass431_4894.anInt4902 * -1891347841);
			}
			if (null != aByteArrayArray5226 && aByteArrayArray5226[i_148_] == null) {
				aByteArrayArray5226[i_148_] = BufferedConnectionContext.maps.get(mapIds[i_148_],
						Class431.aClass431_4895.anInt4902 * -1891347841);
			}
		}
		int i_149_ = -2006926705 * anInt5241;
		Class583 class583 = new Class583(-1);
		Class583 class583_150_ = new Class583(-1);
		anInt5241 = 0;
		for (int i_151_ = 0; i_151_ < regionCount * -812287789; i_151_++) {
			byte[] is = aByteArrayArray5248[i_151_];
			if (is != null) {
				int i_152_ = 64 * (regionIds[i_151_] >> 8) - 2051316501 * aClass553_5219.x;
				int i_153_ = (regionIds[i_151_] & 0xff) * 64 - aClass553_5219.z * -180305283;
				if (aClass458_5214.method7537()) {
					i_152_ = 10;
					i_153_ = 10;
				}
				int i_154_ = MovementType.method10454(objects, is, i_152_, i_153_, mapWidth * -1171509167,
						18804445 * mapLength, class583_150_, class583);
				if (i_154_ > 0) {
					anInt5241 += 343745647 * i_154_;
				}
			}
			is = aByteArrayArray5233[i_151_];
			if (null != is) {
				int i_155_ = (regionIds[i_151_] >> 8) * 64 - 2051316501 * aClass553_5219.x;
				int i_156_ = (regionIds[i_151_] & 0xff) * 64 - -180305283 * aClass553_5219.z;
				if (aClass458_5214.method7537()) {
					i_155_ = 10;
					i_156_ = 10;
				}
				int i_157_ = MovementType.method10454(objects, is, i_155_, i_156_, -1171509167 * mapWidth,
						mapLength * 18804445, class583_150_, class583);
				if (i_157_ > 0) {
					anInt5241 += i_157_ * 343745647;
				}
			}
		}
		if (-2006926705 * anInt5241 > 0) {
			if (i_149_ == -2006926705 * anInt5241) {
				if (0 != anInt5236 * 537401083 && 1000 == Client.tick - 537401083 * anInt5236) {
					Class20_Sub1.method15486(2070742035 * class583_150_.anInt7770, 2070742035 * class583.anInt7770,
							anInt5241 * -2006926705, 1462426986);
					Class540.method9217();
				}
			} else {
				anInt5236 = Client.tick * -109149133;
			}
			if (anInt5216 * -1085876811 < -2006926705 * anInt5241) {
				anInt5216 = anInt5241 * 1572092339;
			}
			aClass447_5238 = Class447.aClass447_5066;
			return false;
		}
		if (!aBool5244 && aClass447_5238 != Class447.aClass447_5064) {
			Class62.method1382(
					new StringBuilder()
							.append(TranslatableString.LOADING_PLEASE_WAIT.translate(Client.currentLanguage))
							.append(Class60.LINE_BREAK).append("(100%)").toString(), true, Class60.activeToolkit,
					Client.p12Full, Class24.p12Full);
		}
		aClass447_5238 = Class447.aClass447_5067;
		if (!aBool5244 && TurnMobCutsceneAction.aClass186_9434 != null) {
			TurnMobCutsceneAction.aClass186_9434.method3615();
		}
		if (!aBool5244) {
			for (int i_158_ = 0; i_158_ < 2048; i_158_++) {
				Player class600_sub1_sub3_sub1_sub1 = Client.players[i_158_];
				if (class600_sub1_sub3_sub1_sub1 != null) {
					class600_sub1_sub3_sub1_sub1.aClass490_10378 = null;
				}
			}
			for (LinkableObject element : Client.aClass480_Sub25Array10654) {
				LinkableObject class480_sub25 = element;
				if (class480_sub25 != null) {
					((Class600_Sub1) class480_sub25.object).aClass490_10378 = null;
				}
			}
		}
		if (!aBool5244) {
			Client.method14088(true);
		}
		boolean bool = false;
		if (Class199.preferences.water.getValue() == 2) {
			for (int i_160_ = 0; i_160_ < -812287789 * regionCount; i_160_++) {
				if (aByteArrayArray5233[i_160_] != null || aByteArrayArray5225[i_160_] != null) {
					bool = true;
					break;
				}
			}
		}
		int i_161_ = Class254.valueOf(Class199.preferences.aClass632_Sub23_10272.getValue()).anInt2821 * -1892831080;
		if (Class60.activeToolkit.method2386()) {
			i_161_++;
		}
		method7787();
		method7748(-939768260);
		aClass490_5252 = new Class490(Class60.activeToolkit, 9, 4, -1171509167 * mapWidth, 18804445 * mapLength,
				i_161_, bool, Class60.activeToolkit.method2480() > 0);
		aClass490_5252.method8315(false);
		aClass490_5252.method8313(Client.anInt10874 * 1986137235);
		aClass490_5252.method8370(aHashMap5217);
		if (1986137235 * Client.anInt10874 != 0) {
			aClass490_5252.method8314(Class558.p11Full);
		} else {
			aClass490_5252.method8314(null);
		}
		aClass450_5232 = new Class450();
		aFloat5249 = -0.05F + (float) (Math.random() / 10.0);
		aClass436_Sub1_5218 = new Class436_Sub1(aClass490_5252, objects, 4, -1171509167 * mapWidth,
				mapLength * 18804445, false, flags, aClass575_5213);
		aClass436_Sub1_5218.method7192();
		aClass436_Sub1_5218.anInt4942 = Class199.preferences.sceneryShadows.getValue() * 1075085311;
		aClass436_Sub1_5218.aBool4939 = Class199.preferences.water.getValue() == 2;
		aClass436_Sub1_5218.aBool4928 = Class199.preferences.lighting.getValue() == 1;
		aClass436_Sub1_5218.aBool4929 = Class199.preferences.groundBlending.getValue() == 1;
		aClass436_Sub1_5218.aBool4927 = Class199.preferences.textures.getValue() == 1;
		if (!aClass458_5214.method7537()) {
			method7719(aClass436_Sub1_5218, aByteArrayArray5247);
		} else {
			method7720(aClass436_Sub1_5218, aByteArrayArray5247);
		}
		if (aBool5244) {
			sleep(50);
		}
		aClass575_5213.method9734(-1171509167 * mapWidth >> 4, mapLength * 18804445 >> 4);
		aClass575_5213.method9694(this);
		if (bool) {
			aClass490_5252.method8315(true);
			aClass436_Sub1_5237 = new Class436_Sub1(aClass490_5252, objects, 1, mapWidth * -1171509167,
					mapLength * 18804445, true, flags, aClass575_5213);
			aClass436_Sub1_5237.method7192();
			aClass436_Sub1_5237.anInt4942 = Class199.preferences.sceneryShadows.getValue() * 1075085311;
			aClass436_Sub1_5237.aBool4939 = Class199.preferences.water.getValue() == 2;
			aClass436_Sub1_5237.aBool4928 = Class199.preferences.lighting.getValue() == 1;
			aClass436_Sub1_5237.aBool4929 = Class199.preferences.groundBlending.getValue() == 1;
			aClass436_Sub1_5237.aBool4927 = Class199.preferences.textures.getValue() == 1;
			if (!aClass458_5214.method7537()) {
				method7719(aClass436_Sub1_5237, aByteArrayArray5225);
				if (!aBool5244) {
					HostNameIdentifier.method1377(true);
				}
			} else {
				method7720(aClass436_Sub1_5237, aByteArrayArray5225);
				if (!aBool5244) {
					HostNameIdentifier.method1377(true);
				}
			}
			aClass436_Sub1_5237.offsetTileHeights(0, aClass436_Sub1_5218.tileHeights[0]);
			aClass436_Sub1_5237.method7260(Class60.activeToolkit, null);
			aClass490_5252.method8315(false);
			if (aBool5244) {
				sleep(50);
			}
		}
		aClass436_Sub1_5218.method7260(Class60.activeToolkit, bool ? aClass436_Sub1_5237.tileHeights : null);
		if (!aClass458_5214.method7537()) {
			if (!aBool5244) {
				HostNameIdentifier.method1377(true);
			}
			method7721(aClass436_Sub1_5218, aByteArrayArray5248);
			if (aByteArrayArray5226 != null) {
				method7802();
			}
		} else {
			if (!aBool5244) {
				HostNameIdentifier.method1377(true);
			}
			method7740(aClass436_Sub1_5218, aByteArrayArray5248, (byte) -13);
		}
		if (!aBool5244) {
			HostNameIdentifier.method1377(true);
		}
		aClass436_Sub1_5218.method7201(Class60.activeToolkit, bool ? aClass490_5252.aClass120Array6704[0] : null, null,
				216954262);
		if (aBool5244) {
			sleep(75);
		}
		aClass436_Sub1_5218.method15416(Class60.activeToolkit, false, -1913311032);
		if (aBool5244) {
			sleep(75);
		}
		if (!aBool5244) {
			HostNameIdentifier.method1377(true);
		}
		if (bool) {
			aClass490_5252.method8315(true);
			if (!aBool5244) {
				HostNameIdentifier.method1377(true);
			}
			if (!aClass458_5214.method7537()) {
				method7721(aClass436_Sub1_5237, aByteArrayArray5233);
			} else {
				method7740(aClass436_Sub1_5237, aByteArrayArray5233, (byte) 1);
			}
			if (!aBool5244) {
				HostNameIdentifier.method1377(true);
			}
			aClass436_Sub1_5237.method7201(Class60.activeToolkit, null, aClass490_5252.aClass120Array6702[0],
					-1362717963);
			aClass436_Sub1_5237.method15416(Class60.activeToolkit, true, -1470640276);
			if (!aBool5244) {
				HostNameIdentifier.method1377(true);
			}
			aClass490_5252.method8315(false);
			if (aBool5244) {
				sleep(50);
			}
		}
		aClass436_Sub1_5218.method7219();
		if (null != aClass436_Sub1_5237) {
			aClass436_Sub1_5237.method7219();
		}
		aClass490_5252.method8325();
		if (aBool5244) {
			TimeUtil.time();
			while (!Class60.activeToolkit.method2469()) {
				sleep(1);
			}
		}
		boolean bool_162_ = false;
		if (aBool5244) {
			Class460 class460_163_ = Client.aClass460_10760;
			method7703(class460_163_, 855558545);
			Class237.aClass461_2622.method7840(class460_163_);
			bool_162_ = true;
			TimeUtil.time();
			synchronized (Client.anObject10668) {
				Client.aBool10827 = true;
				try {
					Client.anObject10668.wait();
				} catch (InterruptedException interruptedexception) {

				}
			}
			Client.aClass460_10760 = this;
			class460_163_.method7748(-381516556);
			method7715(13);
			method7713();
		} else {
			TurnMobCutsceneAction.aClass186_9434.method3615();
			aClass575_5213.method9712();
			Class454.method7418();
		}
		for (int i_164_ = 0; i_164_ < 4; i_164_++) {
			for (int i_165_ = 0; i_165_ < mapWidth * -1171509167; i_165_++) {
				for (int i_166_ = 0; i_166_ < mapLength * 18804445; i_166_++) {
					FloatRaster.method1727(i_164_, i_165_, i_166_);
				}
			}
		}
		for (Class473 element : Client.aClass473Array10624) {
			if (null != element) {
				element.method8066();
			}
		}
		Class591.method9995();
		IdentikitDefinitionProvider.method5495(-1852635103);
		if (Class255.method4749() == Class465.aClass465_5274 && Client.gameConnection.getConnection() != null
				&& -1501875989 * Client.gameState == 13) {
			OutgoingFrame class480_sub15 = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_3988,
					Client.gameConnection.encryptor);
			class480_sub15.payload.writeInt(1057001181);
			Client.gameConnection.sendFrame(class480_sub15);
		}
		if (!aClass458_5214.method7537()) {
			int i_168_ = (-1352797383 * centreX - (mapWidth * -1171509167 >> 4)) / 8;
			int i_169_ = ((mapWidth * -1171509167 >> 4) + centreX * -1352797383) / 8;
			int i_170_ = (-41048943 * centreY - (mapLength * 18804445 >> 4)) / 8;
			int i_171_ = ((mapLength * 18804445 >> 4) + -41048943 * centreY) / 8;
			for (int i_172_ = i_168_ - 1; i_172_ <= 1 + i_169_; i_172_++) {
				for (int i_173_ = i_170_ - 1; i_173_ <= i_171_ + 1; i_173_++) {
					if (i_172_ < i_168_ || i_172_ > i_169_ || i_173_ < i_170_ || i_173_ > i_171_) {
						BufferedConnectionContext.maps.request(getMapId(i_172_, i_173_));
					}
				}
			}
		}
		if (Client.gameState * -1501875989 == 12) {
			Class536.setGameState(0);
		} else if (-1501875989 * Client.gameState == 7) {
			Class536.setGameState(8);
		} else if (Client.gameState * -1501875989 == 17) {
			Class536.setGameState(11);
		} else if (1 == Client.gameState * -1501875989) {
			Class536.setGameState(6);
		} else {
			Class536.setGameState(16);
			if (Client.gameConnection.getConnection() != null) {
				OutgoingFrame class480_sub15 = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_3997,
						Client.gameConnection.encryptor);
				Client.gameConnection.sendFrame(class480_sub15);
			}
		}
		if (aBool5253) {
			CutsceneMob.printConsoleMessage(Long.toString(TimeUtil.time() - aLong5254 * -1453308937974335277L));
			aBool5253 = false;
		}
		if (bool_162_) {
			synchronized (Client.anObject10671) {
				Client.anObject10671.notify();
			}
		}
		return true;
	}

	void method7703(Class460 class460_1_, int i) {
		boolean bool = class460_1_.aBool5244;
		class460_1_.aBool5244 = aBool5244;
		aBool5244 = bool;
		Class458 class458 = class460_1_.aClass458_5215;
		class460_1_.aClass458_5215 = aClass458_5215;
		aClass458_5215 = class458;
		class460_1_.aClass553_5220 = aClass553_5219;
		aClass553_5220 = class460_1_.aClass553_5219;
		aClass575_5213.method9722(class460_1_.method7690());
	}

	void decodeMapArea(FrameBuffer buffer) {
		boolean force = buffer.readNegatedUByte() == 1;
		int regions = buffer.readNegatedUByte();
		int centreY = buffer.readUShort();
		int size = buffer.readUByteS();
		int centreX = buffer.readLEUShort();

		if (!aBool5244) {
			method7713();
		}

		method7712(MapSize.valueOf(size));
		regionIds = new int[regions];
		mapIds = new int[regions];
		aByteArrayArray5247 = new byte[regions][];
		aByteArrayArray5248 = new byte[regions][];
		aByteArrayArray5226 = null;
		aByteArrayArray5225 = new byte[regions][];
		aByteArrayArray5233 = new byte[regions][];
		regions = 0;

		for (int x = (centreX - (-1171509167 * mapWidth >> 4)) / 8; x <= (centreX + (mapWidth * -1171509167 >> 4)) / 8; x++) {
			for (int y = (centreY - (mapLength * 18804445 >> 4)) / 8; y <= (centreY + (18804445 * mapLength >> 4)) / 8; y++) {
				if (BufferedConnectionContext.maps.validChild(getMapId(x, y), -1891347841
						* Class431.aClass431_4896.anInt4902)) {
					regionIds[regions] = y + (x << 8);
					mapIds[regions] = getMapId(x, y);
					regions++;
				}
			}
		}

		regionCount = 486645595 * regions;
		updateMapArea(centreX, centreY, 13, force);
	}

	void method7709(FrameBuffer buffer) {
		int attributes = buffer.readUByteA();
		boolean force = 0 != (attributes & 0x1);
		int centreX = buffer.readLEUShortA();
		int centreZ = buffer.readLEUShortA();
		int size = buffer.readUByteA();
		int type = buffer.readUByteS();

		if (1 == type) {
			aClass458_5214 = Class458.CONSTRUCTED;
		} else if (2 == type) {
			aClass458_5214 = Class458.aClass458_5156;
		} else if (type == 3) {
			aClass458_5214 = Class458.aClass458_5155;
		} else if (4 == type) {
			aClass458_5214 = Class458.aClass458_5158;
		}

		if (!aBool5244) {
			method7713();
		}

		method7712(MapSize.valueOf(size));
		buffer.disableBitAccess();

		for (int plane = 0; plane < 4; plane++) {
			for (int x = 0; x < mapWidth * -1171509167 >> 3; x++) {
				for (int z = 0; z < 18804445 * mapLength >> 3; z++) {
					int present = buffer.readBits(1);
					if (1 == present) {
						regionData[plane][x][z] = buffer.readBits(26);
					} else {
						regionData[plane][x][z] = -1;
					}
				}
			}
		}

		buffer.enableBitAccess();
		int count = buffer.readUByte();
		regionIds = new int[count];
		mapIds = new int[count];
		aByteArrayArray5247 = new byte[count][];
		aByteArrayArray5248 = new byte[count][];
		aByteArrayArray5226 = null;
		aByteArrayArray5225 = new byte[count][];
		aByteArrayArray5233 = new byte[count][];
		count = 0;

		for (int plane = 0; plane < 4; plane++) {
			for (int x = 0; x < -1171509167 * mapWidth >> 3; x++) {
				for (int z = 0; z < mapLength * 18804445 >> 3; z++) {
					int data = regionData[plane][x][z];

					if (-1 != data) {
						int regionX = data >> 14 & 0x3ff;
						int regionZ = data >> 3 & 0x7ff;
						int id = (regionX / 8 << 8) + regionZ / 8;

						for (int index = 0; index < count; index++) {
							if (regionIds[index] == id) {
								id = -1;
								break;
							}
						}

						if (id != -1) {
							int mapX = id >> 8 & 0xff;
							int mapZ = id & 0xff;
							if (BufferedConnectionContext.maps.validChild(getMapId(mapX, mapZ), -1891347841
									* Class431.aClass431_4896.anInt4902)) {
								regionIds[count] = id;
								mapIds[count] = getMapId(mapX, mapZ);
								count++;
							}
						}
					}
				}
			}
		}

		regionCount = count * 486645595;
		updateMapArea(centreX, centreZ, 13, force);
	}

	int getMapId(int mapX, int mapZ) {
		return mapX | mapZ << 7;
	}

	void method7712(MapSize size) {
		if (size != aClass236_5243) {
			mapWidth = (mapLength = size.length * -1615112181) * 1828118221;
			regionData = new int[4][mapWidth * -1171509167 >> 3][mapLength * 18804445 >> 3];
			anIntArrayArray5235 = new int[mapWidth * -1171509167][18804445 * mapLength];
			anIntArrayArray5251 = new int[mapWidth * -1171509167][18804445 * mapLength];
			aByteArrayArrayArray5239 = new byte[4][-1171509167 * mapWidth][18804445 * mapLength];
			flags = new TileFlags(4, mapWidth * -1171509167, 18804445 * mapLength);
			method7788(false);
			HitbarDefinition.method8951();
			aClass236_5243 = size;
		}
	}

	void method7713() {
		if (aClass458_5214 != Class458.aClass458_5152 && Class458.aClass458_5152 != aClass458_5215) {
			if (aClass458_5214 == Class458.CONSTRUCTED || aClass458_5214 == Class458.aClass458_5155
					|| aClass458_5214 != aClass458_5215
					&& (aClass458_5214 == Class458.aClass458_5154 || Class458.aClass458_5154 == aClass458_5215)) {
				Iterator<LinkableObject<Npc>> iterator = Client.npcs.iterator();
				while (iterator.hasNext()) {
					LinkableObject<Npc> linkable = iterator.next();
					Class480_Sub18.method8150(linkable.object);
				}

				Client.npcCount = 0;
				Client.anInt10862 = 0;
				Client.npcs.clear();
			}

			aClass458_5215 = aClass458_5214;
		}
	}

	void updateMapArea(int centreX, int centreY, int i_32_, boolean force) {
		if (0 == 2087248539 * Client.cutsceneStage) {
			if (aBool5244) {
				throw new IllegalStateException();
			}

			Client.cutsceneStage = 676960953;
			Client.currentCutscene = -1216225047;
		}

		if (force || this.centreX * -1352797383 != centreX || -41048943 * this.centreY != centreY) {
			this.centreX = -482931959 * centreX;
			this.centreY = centreY * 303209585;

			if (!aBool5244) {
				Class536.setGameState(i_32_);
				Class62.method1382(TranslatableString.LOADING_PLEASE_WAIT.translate(Client.currentLanguage), true,
						Class60.activeToolkit, Client.p12Full, Class24.p12Full);
			}

			if (aClass553_5219 != null) {
				aClass553_5220 = aClass553_5219;
			} else {
				aClass553_5220 = new Class553(0, 0, 0);
			}

			aClass553_5219 = new Class553(0, 8 * (-1352797383 * this.centreX - (-1171509167 * mapWidth >> 4)),
					8 * (this.centreY * -41048943 - (18804445 * mapLength >> 4)));
			aClass480_Sub31_Sub18_5230 = Class495.method8552(
					mapWidth * -1171509167 / 2 + aClass553_5219.x * 2051316501, -1171509167 * mapWidth / 2
							+ aClass553_5219.z * -180305283);
			aClass488_5231 = null;

			if (!aBool5244) {
				method7715(i_32_);
			}
		}
	}

	void method7715(int i) {
		int dx = 2051316501 * aClass553_5219.x - 2051316501 * aClass553_5220.x;
		int dz = -180305283 * aClass553_5219.z - aClass553_5220.z * -180305283;

		if (13 == i) {
			for (int index = 0; index < -999337347 * Client.anInt10862; index++) {
				LinkableObject<Npc> linkable = Client.aClass480_Sub25Array10654[index];
				if (null != linkable) {
					Npc npc = linkable.object;

					for (int step = 0; step < npc.pathX.length; step++) {
						npc.pathX[step] -= dx;
						npc.pathZ[step] -= dz;
					}

					Class397 class397 = Class397.copyOf(npc.method10164().aClass397_4507);
					class397.x -= 512 * dx;
					class397.z -= 512 * dz;
					npc.method10169(class397);
					class397.cache();
				}
			}
		} else {
			boolean bool = false;
			Client.npcCount = 0;
			int width = mapWidth * 1482727936 - 512;
			int length = mapLength * 1037941248 - 512;

			for (int index = 0; index < -999337347 * Client.anInt10862; index++) {
				LinkableObject<Npc> linkable = Client.aClass480_Sub25Array10654[index];
				if (null != linkable) {
					Npc npc = linkable.object;
					Class397 class397 = Class397.copyOf(npc.method10164().aClass397_4507);
					class397.x -= dx * 512;
					class397.z -= dz * 512;
					npc.method10169(class397);
					if ((int) class397.x < 0 || (int) class397.x > width || (int) class397.z < 0
							|| (int) class397.z > length) {
						npc.setDefinition(null);
						linkable.unlink();
						bool = true;
					} else {
						boolean keep = true;
						for (int step = 0; step < npc.pathX.length; step++) {
							npc.pathX[step] -= dx;
							npc.pathZ[step] -= dz;

							if (npc.pathX[step] < 0 || npc.pathX[step] >= -1171509167 * mapWidth || npc.pathZ[step] < 0
									|| npc.pathZ[step] >= 18804445 * mapLength) {
								keep = false;
							}
						}

						if (keep) {
							Client.npcIndices[(Client.npcCount += 541000323) * 1746328619 - 1] = npc.index * 387935885;
						} else {
							npc.setDefinition(null);
							linkable.unlink();
							bool = true;
						}
					}
					class397.cache();
				}
			}

			if (bool) {
				Client.anInt10862 = Client.npcs.size() * 1526871765;
				int count = 0;
				Iterator<LinkableObject<Npc>> iterator = Client.npcs.iterator();

				while (iterator.hasNext()) {
					LinkableObject<Npc> linkable = iterator.next();
					Client.aClass480_Sub25Array10654[count++] = linkable;
				}
			}
		}

		for (int index = 0; index < 2048; index++) {
			Player player = Client.players[index];
			if (null != player) {
				for (int step = 0; step < player.pathX.length; step++) {
					player.pathX[step] -= dx;
					player.pathZ[step] -= dz;
				}

				Class397 class397 = Class397.copyOf(player.method10164().aClass397_4507);
				class397.x -= dx * 512;
				class397.z -= 512 * dz;
				player.method10169(class397);
				class397.cache();
			}
		}

		Class75[] class75s = Client.aClass75Array10623;
		for (Class75 class752 : class75s) {
			Class75 class75 = class752;

			if (class75 != null) {
				class75.anInt1119 -= 592564736 * dx;
				class75.anInt1122 -= dz * 1171577344;
			}
		}

		for (Class480_Sub12 class480_sub12 = (Class480_Sub12) Class480_Sub12.aClass644_10068.head(); null != class480_sub12; class480_sub12 = (Class480_Sub12) Class480_Sub12.aClass644_10068
				.next()) {
			class480_sub12.localX -= -1064812159 * dx;
			class480_sub12.localZ -= dz * 1342836999;
			ObjectDefinition definition = objects.get(class480_sub12.id * 42318177);
			int i_48_;
			int i_49_;

			if ((class480_sub12.orientation * 1727643 & 0x1) == 0) {
				i_48_ = definition.width * 723391465;
				i_49_ = 2076427087 * definition.length;
			} else {
				i_48_ = 2076427087 * definition.length;
				i_49_ = definition.width * 723391465;
			}

			if (aClass458_5214 != Class458.aClass458_5158
					&& (1155137153 * class480_sub12.localX + i_48_ <= 0
							|| i_49_ + 51547319 * class480_sub12.localZ <= 0
							|| 1155137153 * class480_sub12.localX >= -1171509167 * mapWidth || class480_sub12.localZ * 51547319 >= 18804445 * mapLength)) {
				class480_sub12.unlink();
			}
		}

		for (Class480_Sub12 class480_sub12 = (Class480_Sub12) Class480_Sub12.aClass644_10067.head(); class480_sub12 != null; class480_sub12 = (Class480_Sub12) Class480_Sub12.aClass644_10067
				.next()) {
			class480_sub12.localX -= dx * -1064812159;
			class480_sub12.localZ -= 1342836999 * dz;
			ObjectDefinition definition = objects.get(42318177 * class480_sub12.id);
			int i_50_;
			int i_51_;

			if (0 == (1727643 * class480_sub12.orientation & 0x1)) {
				i_50_ = 723391465 * definition.width;
				i_51_ = definition.length * 2076427087;
			} else {
				i_50_ = definition.length * 2076427087;
				i_51_ = definition.width * 723391465;
			}

			if (aClass458_5214 != Class458.aClass458_5158
					&& (class480_sub12.localX * 1155137153 + i_50_ <= 0
							|| i_51_ + class480_sub12.localZ * 51547319 <= 0
							|| 1155137153 * class480_sub12.localX >= mapWidth * -1171509167 || class480_sub12.localZ * 51547319 >= 18804445 * mapLength)) {
				class480_sub12.unlink();
			}
		}

		for (ItemDeque items = Client.groundItems.first(); null != items; items = Client.groundItems.next()) {
			int plane = (int) (-4821875126325281949L * items.linkedKey >> 28 & 0x3L);
			int x = (int) (items.linkedKey * -4821875126325281949L & 0x3fffL);
			int localX = x - 2051316501 * aClass553_5219.x;
			int z = (int) (-4821875126325281949L * items.linkedKey >> 14 & 0x3fffL);
			int localZ = z - aClass553_5219.z * -180305283;

			if (null != aClass490_5252) {
				if (localX < 0 || localZ < 0 || localX >= mapWidth * -1171509167 || localZ >= mapLength * 18804445
						|| localX >= aClass490_5252.width * 173827901 || localZ >= aClass490_5252.length * 134933557) {
					if (aClass458_5214 != Class458.aClass458_5158) {
						items.unlink();
					}
				} else if (null != aClass490_5252.aClass489ArrayArrayArray6706) {
					aClass490_5252.method8341(plane, localX, localZ);
				}
			}
		}

		if (0 != 1134492539 * Class63.anInt939) {
			Class63.anInt939 -= dx * -517887053;
			Class63.anInt950 -= dz * 224109565;
		}

		Class549.method9329(false);
		if (13 == i) {
			Client.anInt10706 -= -1380399616 * dx;
			Client.anInt10707 -= -1587359232 * dz;
			Class215.anInt2196 -= 1659243008 * dx;
			Class115.anInt1444 -= dz * 835428864;

			if (6 != Connection.anInt7170 * 1212513917 && 1212513917 * Connection.anInt7170 != 3) {
				Class637.method13160(FloatRaster.method1728());
			}
		} else {
			Class282.anInt3162 -= -1244013069 * dx;
			VoiceOverVolumeNormaliser.anInt1993 -= dz * 1045555115;
			ComponentKeyRecord.cameraViewX -= dx * 1716222449;
			Class51.cameraViewZ -= 541735519 * dz;
			Client.cameraX -= 1018237440 * dx;
			Wall.cameraZ -= -1732435456 * dz;

			if (Math.abs(dx) > -1171509167 * mapWidth || Math.abs(dz) > 18804445 * mapLength) {
				aClass575_5213.method9709();
			}
		}

		Class36.method993();
		Class679.method696();
		Client.animatedObjects.clear();
		Client.projectiles.clear();
		Client.aClass649_10779.clear();
		Class530.method9021();
	}

	void sleep(int ms) {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException interruptedexception) {

		}
	}

	void method7719(Class436_Sub1 class436_sub1, byte[][] is) {
		int count = is.length;
		for (int index = 0; index < count; index++) {
			byte[] data = is[index];
			if (null != data) {
				Buffer buffer = new Buffer(data);
				int regionX = regionIds[index] >> 8;
				int regionZ = regionIds[index] & 0xff;
				int dx = 64 * regionX - aClass553_5219.x * 2051316501;
				int dz = 64 * regionZ - aClass553_5219.z * -180305283;

				if (!aBool5244 && null != TurnMobCutsceneAction.aClass186_9434) {
					TurnMobCutsceneAction.aClass186_9434.method3615();
				}

				class436_sub1.method7245(buffer, dx, dz, aClass553_5219.x * 2051316501, aClass553_5219.z * -180305283);
				class436_sub1.method15408(Class60.activeToolkit, buffer, dx, dz);
			}
		}

		for (int index = 0; index < count; index++) {
			int i_66_ = (regionIds[index] >> 8) * 64 - 2051316501 * aClass553_5219.x;
			int i_67_ = 64 * (regionIds[index] & 0xff) - -180305283 * aClass553_5219.z;
			byte[] is_68_ = is[index];

			if (null == is_68_ && -41048943 * centreY < 800) {
				if (!aBool5244 && null != TurnMobCutsceneAction.aClass186_9434) {
					TurnMobCutsceneAction.aClass186_9434.method3615();
				}

				class436_sub1.method7194(i_66_, i_67_, 64, 64);
			}
		}
	}

	void method7720(Class436_Sub1 class436_sub1, byte[][] is) {
		for (int i_69_ = 0; i_69_ < class436_sub1.anInt4969 * -710177039; i_69_++) {
			if (!aBool5244) {
				TurnMobCutsceneAction.aClass186_9434.method3615();
			}
			for (int i_70_ = 0; i_70_ < -1171509167 * mapWidth >> 3; i_70_++) {
				for (int i_71_ = 0; i_71_ < 18804445 * mapLength >> 3; i_71_++) {
					int i_72_ = regionData[i_69_][i_70_][i_71_];
					if (i_72_ != -1) {
						int i_73_ = i_72_ >> 24 & 0x3;
						if (!class436_sub1.underwater || 0 == i_73_) {
							int i_74_ = i_72_ >> 1 & 0x3;
							int i_75_ = i_72_ >> 14 & 0x3ff;
							int i_76_ = i_72_ >> 3 & 0x7ff;
							int i_77_ = (i_75_ / 8 << 8) + i_76_ / 8;
							for (int i_78_ = 0; i_78_ < regionIds.length; i_78_++) {
								if (i_77_ == regionIds[i_78_] && null != is[i_78_]) {
									Buffer buffer = new Buffer(is[i_78_]);
									class436_sub1.method7197(buffer, i_69_, i_70_ * 8, i_71_ * 8, i_73_, i_75_, i_76_,
											i_74_, -260585437);
									class436_sub1.method15431(Class60.activeToolkit, buffer, i_69_, i_70_ * 8,
											8 * i_71_, i_73_, i_75_, i_76_, i_74_, -442105026);
									break;
								}
							}
						}
					}
				}
			}
		}
		for (int i_79_ = 0; i_79_ < -710177039 * class436_sub1.anInt4969; i_79_++) {
			if (!aBool5244) {
				TurnMobCutsceneAction.aClass186_9434.method3615();
			}
			for (int i_80_ = 0; i_80_ < -1171509167 * mapWidth >> 3; i_80_++) {
				for (int i_81_ = 0; i_81_ < mapLength * 18804445 >> 3; i_81_++) {
					int i_82_ = regionData[i_79_][i_80_][i_81_];
					if (i_82_ == -1) {
						class436_sub1.method7195(i_79_, 8 * i_80_, 8 * i_81_, 8, 8);
					}
				}
			}
		}
	}

	void method7721(Class436_Sub1 class436_sub1, byte[][] is) {
		for (int i_83_ = 0; i_83_ < -812287789 * regionCount; i_83_++) {
			byte[] is_84_ = is[i_83_];
			if (null != is_84_) {
				int i_85_ = (regionIds[i_83_] >> 8) * 64 - 2051316501 * aClass553_5219.x;
				int i_86_ = (regionIds[i_83_] & 0xff) * 64 - -180305283 * aClass553_5219.z;
				if (!aBool5244) {
					TurnMobCutsceneAction.aClass186_9434.method3615();
				}
				class436_sub1.method15425(Class60.activeToolkit, is_84_, i_85_, i_86_, (byte) 0);
				if (aBool5244) {
					sleep(10);
				}
			}
		}
	}

	void method7727() {
		method7712(MapSize.valueOf(Class199.preferences.buildArea.getValue()));
		int i_87_ = aClass553_5219.x * 2051316501;
		int i_88_ = -180305283 * aClass553_5219.z;
		int i_89_ = (2006359481 * Client.cameraX >> 12) + (i_87_ >> 3);
		int i_90_ = (i_88_ >> 3) + (Wall.cameraZ * 1829446257 >> 12);
		Client.localPlayer.plane = (byte) 0;
		ProxyingVariableLoader.localPlane = 0;
		Client.localPlayer.move(8, 8);
		int i_91_ = 18;
		regionIds = new int[i_91_];
		mapIds = new int[i_91_];
		aByteArrayArray5247 = new byte[i_91_][];
		aByteArrayArray5248 = new byte[i_91_][];
		aByteArrayArray5226 = new byte[i_91_][];
		aByteArrayArray5225 = new byte[i_91_][];
		aByteArrayArray5233 = new byte[i_91_][];
		i_91_ = 0;
		for (int i_92_ = (i_89_ - (-1171509167 * mapWidth >> 4)) / 8; i_92_ <= (i_89_ + (-1171509167 * mapWidth >> 4)) / 8; i_92_++) {
			for (int i_93_ = (i_90_ - (18804445 * mapLength >> 4)) / 8; i_93_ <= (i_90_ + (mapLength * 18804445 >> 4)) / 8; i_93_++) {
				int i_94_ = (i_92_ << 8) + i_93_;
				if (BufferedConnectionContext.maps.validChild(getMapId(i_92_, i_93_), -1891347841
						* Class431.aClass431_4896.anInt4902)) {
					regionIds[i_91_] = i_94_;
					mapIds[i_91_] = getMapId(i_92_, i_93_);
					i_91_++;
				}
			}
		}
		regionCount = i_91_ * 486645595;
		int i_95_;
		if (Client.gameState * -1501875989 == 0) {
			i_95_ = 12;
		} else if (11 == -1501875989 * Client.gameState) {
			i_95_ = 17;
		} else if (8 == Client.gameState * -1501875989) {
			i_95_ = 7;
		} else if (-1501875989 * Client.gameState == 6) {
			i_95_ = 1;
		} else {
			throw new RuntimeException(new StringBuilder().append("").append(Client.gameState * -1501875989).toString());
		}
		updateMapArea(i_89_, i_90_, i_95_, false);
	}

	void method7740(Class436_Sub1 class436_sub1, byte[][] is, byte i) {
		for (int i_96_ = 0; i_96_ < -710177039 * class436_sub1.anInt4969; i_96_++) {
			if (!aBool5244) {
				TurnMobCutsceneAction.aClass186_9434.method3615();
			}
			for (int i_97_ = 0; i_97_ < -1171509167 * mapWidth >> 3; i_97_++) {
				for (int i_98_ = 0; i_98_ < 18804445 * mapLength >> 3; i_98_++) {
					int i_99_ = regionData[i_96_][i_97_][i_98_];
					if (i_99_ != -1) {
						int i_100_ = i_99_ >> 24 & 0x3;
						if (!class436_sub1.underwater || i_100_ == 0) {
							int i_101_ = i_99_ >> 1 & 0x3;
							int i_102_ = i_99_ >> 14 & 0x3ff;
							int i_103_ = i_99_ >> 3 & 0x7ff;
							int i_104_ = i_103_ / 8 + (i_102_ / 8 << 8);
							for (int i_105_ = 0; i_105_ < regionIds.length; i_105_++) {
								if (regionIds[i_105_] == i_104_ && is[i_105_] != null) {
									class436_sub1.method15410(Class60.activeToolkit, is[i_105_], i_96_, 8 * i_97_,
											8 * i_98_, i_100_, (i_102_ & 0x7) * 8, 8 * (i_103_ & 0x7), i_101_,
											(byte) -60);
									break;
								}
							}
						}
					}
					if (aBool5244) {
						sleep(5);
					}
				}
			}
		}
	}

	void method7748(int i) {
		aClass436_Sub1_5237 = null;
		aClass436_Sub1_5218 = null;
		if (flags != null) {
			flags.init();
		}
		if (aClass575_5213 != null) {
			aClass575_5213.method9705(1524002363);
		}
		if (null != aClass490_5252) {
			aClass490_5252.aClass497_6711.method8666();
			aClass490_5252 = null;
		}
	}

	void method7757() {
		aClass458_5215 = aClass458_5214;
		method7712(MapSize.STANDARD);
		for (int i_106_ = 0; i_106_ < 4; i_106_++) {
			for (int i_107_ = 0; i_107_ < -1171509167 * mapWidth >> 3; i_107_++) {
				for (int i_108_ = 0; i_108_ < mapLength * 18804445 >> 3; i_108_++) {
					regionData[i_106_][i_107_][i_108_] = -1;
				}
			}
		}
		for (CutsceneArea class480_sub28 = (CutsceneArea) CutsceneArea.cutsceneAreas.head(); null != class480_sub28; class480_sub28 = (CutsceneArea) CutsceneArea.cutsceneAreas
				.next()) {
			int i_109_ = -1937859367 * class480_sub28.anInt10203;
			boolean bool = (i_109_ & 0x1) == 1;
			int i_110_ = class480_sub28.regionX * 534306089 >> 3;
			int i_111_ = class480_sub28.regionZ * -1055800957 >> 3;
			int i_112_ = 1623127417 * class480_sub28.anInt10199;
			int i_113_ = class480_sub28.anInt10200 * 1814170383;
			int i_114_ = 1377866291 * class480_sub28.plane;
			int i_115_ = class480_sub28.anInt10198 * 776939977;
			int i_116_ = -1100825061 * class480_sub28.width;
			int i_117_ = 697906291 * class480_sub28.length;
			int i_118_ = 0;
			int i_119_ = 0;
			int i_120_ = 1;
			int i_121_ = 1;
			if (i_109_ == 1) {
				i_119_ = i_116_ - 1;
				i_120_ = -1;
			} else if (i_109_ == 2) {
				i_119_ = i_116_ - 1;
				i_118_ = i_117_ - 1;
				i_120_ = -1;
				i_121_ = -1;
			} else if (i_109_ == 3) {
				i_118_ = i_117_ - 1;
				i_120_ = 1;
				i_121_ = -1;
			}
			int i_122_ = i_111_;
			while (i_122_ < i_111_ + i_117_) {
				int i_123_ = i_119_;
				int i_124_ = i_110_;
				while (i_124_ < i_116_ + i_110_) {
					if (bool) {
						regionData[i_115_][i_112_ + i_118_][i_123_ + i_113_] = (i_114_ << 24) + (i_124_ << 14)
								+ (i_122_ << 3) + (i_109_ << 1);
					} else {
						regionData[i_115_][i_112_ + i_123_][i_118_ + i_113_] = (i_109_ << 1) + (i_124_ << 14)
								+ (i_114_ << 24) + (i_122_ << 3);
					}
					i_124_++;
					i_123_ += i_120_;
				}
				i_122_++;
				i_118_ += i_121_;
			}
		}
		int i_125_ = Client.anInt10681 * 320824459;
		regionIds = new int[i_125_];
		mapIds = new int[i_125_];
		aByteArrayArray5247 = new byte[i_125_][];
		aByteArrayArray5248 = new byte[i_125_][];
		aByteArrayArray5226 = null;
		aByteArrayArray5225 = new byte[i_125_][];
		aByteArrayArray5233 = new byte[i_125_][];
		i_125_ = 0;
		for (CutsceneArea class480_sub28 = (CutsceneArea) CutsceneArea.cutsceneAreas.head(); class480_sub28 != null; class480_sub28 = (CutsceneArea) CutsceneArea.cutsceneAreas
				.next()) {
			int i_126_ = 534306089 * class480_sub28.regionX >>> 3;
			int i_127_ = class480_sub28.regionZ * -1055800957 >>> 3;
			int i_128_ = i_126_ + class480_sub28.width * -1100825061;
			if (0 == (i_128_ & 0x7)) {
				i_128_--;
			}
			i_128_ >>>= 3;
			int i_129_ = i_127_ + class480_sub28.length * 697906291;
			if ((i_129_ & 0x7) == 0) {
				i_129_--;
			}
			i_129_ >>>= 3;
			for (int i_130_ = i_126_ >>> 3; i_130_ <= i_128_; i_130_++) {
				while_25_: for (int i_131_ = i_127_ >>> 3; i_131_ <= i_129_; i_131_++) {
					int i_132_ = i_130_ << 8 | i_131_;
					for (int i_133_ = 0; i_133_ < i_125_; i_133_++) {
						if (i_132_ == regionIds[i_133_]) {
							continue while_25_;
						}
					}
					if (BufferedConnectionContext.maps.validChild(getMapId(i_130_, i_131_),
							Class431.aClass431_4896.anInt4902 * -1891347841)) {
						regionIds[i_125_] = i_132_;
						mapIds[i_125_] = getMapId(i_130_, i_131_);
						i_125_++;
					}
				}
			}
		}
		regionCount = i_125_ * 486645595;
		updateMapArea(mapWidth * -1171509167 >> 4, 18804445 * mapLength >> 4, 13, false);
	}

	void method7802() {
		int i_134_ = aByteArrayArray5226.length;
		for (int i_135_ = 0; i_135_ < i_134_; i_135_++) {
			if (aByteArrayArray5226[i_135_] != null) {
				int i_136_ = -1;
				for (int i_137_ = 0; i_137_ < 114717583 * Client.anInt10674; i_137_++) {
					if (regionIds[i_135_] == Client.anIntArray10754[i_137_]) {
						i_136_ = i_137_;
						break;
					}
				}
				if (i_136_ == -1) {
					Client.anIntArray10754[114717583 * Client.anInt10674] = regionIds[i_135_];
					i_136_ = (Client.anInt10674 += 264719215) * 114717583 - 1;
				}
				Buffer buffer = new Buffer(aByteArrayArray5226[i_135_]);
				int i_138_ = 0;
				while (-165875887 * buffer.offset < aByteArrayArray5226[i_135_].length && i_138_ < 511
						&& Client.npcCount * 1746328619 < 1023) {
					int i_139_ = i_136_ | i_138_++ << 6;
					int i_140_ = buffer.readUShort();
					int i_141_ = i_140_ >> 14;
					int i_142_ = i_140_ >> 7 & 0x3f;
					int i_143_ = i_140_ & 0x3f;
					int i_144_ = (regionIds[i_135_] >> 8) * 64 - aClass553_5219.x * 2051316501 + i_142_;
					int i_145_ = i_143_ + (regionIds[i_135_] & 0xff) * 64 - -180305283 * aClass553_5219.z;
					NpcDefinition npcDefinition = NpcDefinition.loader.get(buffer.readUShort());
					LinkableObject class480_sub25 = Client.npcs.get(i_139_);
					if (class480_sub25 == null && (npcDefinition.movementCapabilities & 0x1) > 0 && i_144_ >= 0
							&& npcDefinition.boundSize * 2117527163 + i_144_ < -1171509167 * mapWidth && i_145_ >= 0
							&& npcDefinition.boundSize * 2117527163 + i_145_ < mapLength * 18804445) {
						Npc class600_sub1_sub3_sub1_sub2 = new Npc(aClass490_5252);
						class600_sub1_sub3_sub1_sub2.index = 1228997701 * i_139_;
						LinkableObject class480_sub25_146_ = new LinkableObject(class600_sub1_sub3_sub1_sub2);
						Client.npcs.put(i_139_, class480_sub25_146_);
						Client.aClass480_Sub25Array10654[(Client.anInt10862 += 1526871765) * -999337347 - 1] = class480_sub25_146_;
						Client.npcIndices[(Client.npcCount += 541000323) * 1746328619 - 1] = i_139_;
						class600_sub1_sub3_sub1_sub2.lastUpdate = 648279047 * Client.tick;
						class600_sub1_sub3_sub1_sub2.setDefinition(npcDefinition);
						class600_sub1_sub3_sub1_sub2
								.setBoundSize(class600_sub1_sub3_sub1_sub2.definition.boundSize * 2117527163);
						class600_sub1_sub3_sub1_sub2.anInt11540 = 2036386683 * (1704389047 * class600_sub1_sub3_sub1_sub2.definition.contrast << 3);
						class600_sub1_sub3_sub1_sub2.turn(class600_sub1_sub3_sub1_sub2.definition.aClass621_3020
								.opposite().getId() << 11 & 0x3fff, true);
						class600_sub1_sub3_sub1_sub2.move(i_144_, i_145_, i_141_, true,
								class600_sub1_sub3_sub1_sub2.boundSize());
					}
				}
			}
		}
	}
}
