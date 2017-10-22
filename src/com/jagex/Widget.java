package com.jagex;

import java.net.MalformedURLException;
import java.net.URL;

import com.jagex.twitch.TwitchTV;

public class Widget {
	public static int anInt2350;
	public static int anInt2351;
	public static int anInt2352;
	public static int anInt2353;
	public static int anInt2354;
	public static int anInt2355;
	public static int anInt2356;
	public static int anInt2360;
	public static int anInt2362;
	public static int anInt2365;
	public static int anInt2369;
	static ReferenceCache aClass168_2370;
	static ReferenceCache aClass168_2371;
	public static ReferenceCache aClass168_2372;
	public static int anInt2398 = 0;
	public static int anInt2411;
	public static int anInt2413;
	public static final int anInt2451 = 5;
	public static int anInt2457;
	public static ReferenceCache aClass168_2468;
	public static final int anInt2469 = 1;
	public static final int anInt2470 = 2;
	public static final int anInt2471 = 4;
	public static final int anInt2472 = 8;
	public static int anInt2509;
	public static boolean aBool2512;
	public static int anInt2514;
	public static int anInt2537;
	static boolean[] aBoolArray2558;
	static {
		anInt2350 = -1878044245;
		anInt2351 = -1344299442;
		anInt2352 = 1763500935;
		anInt2353 = 411973768;
		anInt2354 = 2048789307;
		anInt2355 = -1053045293;
		anInt2356 = 25505114;
		anInt2413 = 546342771;
		anInt2537 = 435455048;
		anInt2457 = 1028733021;
		anInt2360 = 743622415;
		anInt2411 = -1300253106;
		anInt2362 = -1581349641;
		anInt2369 = -852096384;
		anInt2514 = 1146507479;
		anInt2365 = -1878510102;
		anInt2509 = -1341826015;
		aClass168_2468 = new ReferenceCache(6000000, 200);
		aClass168_2370 = new ReferenceCache(8);
		aClass168_2371 = new ReferenceCache(4);
		aClass168_2372 = new ReferenceCache(50);
		aBool2512 = false;
	}

	public static void method4321() {
		aClass168_2468.clearSoft();
		aClass168_2372.clearSoft();
		aClass168_2370.clearSoft();
		aClass168_2371.clearSoft();
	}

	public static void method4324(int i) {
		Class533.anInt7259 = -627915947;
	}

	static int[] method4318(MenuOption option) {
		int[] data = null;
		if (Class530.method9028(-20536735 * option.type)) {
			data = ItemDefinition.loader.get((int) (-1867655888037237139L * option.primary)).anIntArray8304;
		} else if (827700557 * option.item != -1) {
			data = ItemDefinition.loader.get(option.item * 827700557).anIntArray8304;
		} else if (Class31.method905(option.type * -20536735)) {
			LinkableObject<Npc> linkable = Client.npcs.get((int) (option.primary * -1867655888037237139L));
			if (null != linkable) {
				Npc npc = linkable.object;
				NpcDefinition definition = npc.definition;

				if (null != definition.morphisms) {
					definition = definition.morph(PlayerVariableProvider.instance, PlayerVariableProvider.instance);
				}

				if (null != definition) {
					data = definition.anIntArray3075;
				}
			}
		} else if (Class512.method8809(option.type * -20536735)) {
			ObjectDefinition definition = Client.aClass460_10760.getObjectLoader().get(
					(int) (option.primary * -1867655888037237139L >>> 32 & 0x7fffffffL));
			if (null != definition.morphisms) {
				definition = definition.method9255(PlayerVariableProvider.instance, PlayerVariableProvider.instance);
			}

			if (definition != null) {
				data = definition.anIntArray7440;
			}
		}

		return data;
	}

	static final void method4319(ScriptExecutionContext class613, int i) {
		class613.anInt7924 -= -2049596966;
		int i_67_ = class613.anIntArray7942[1841827045 * class613.anInt7924];
		boolean bool = class613.anIntArray7942[1 + 1841827045 * class613.anInt7924] == 1;
		class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = Class480_Sub22.method14268(
				i_67_, bool);
	}

	static final void method4322(int i, int i_69_) {
		TileFlags.method7082();
		int i_70_ = BaseVariableParameterDefinition.aClass77_Sub1_Sub2_3726.get(i).anInt8631 * -758234501;
		if (i_70_ != 0) {
			int i_71_ = PlayerVariableProvider.instance.getVarp(BaseVariableParameterDefinition.aClass77_Sub1_Sub2_3726
					.get(i));
			if (i_70_ == 5) {
				Client.anInt10780 = -1761902507 * i_71_;
			} else if (6 == i_70_) {
				Client.anInt10732 = -863605443 * i_71_;
			}
		}
	}

	public int anInt2349;
	public Object[] anObjectArray2357;
	public byte aByte2358;
	public Object[] anObjectArray2359;
	public Class267 aClass267_2361;
	short[] aShortArray2363;
	public Object[] anObjectArray2364;
	public Object[] anObjectArray2366;
	public String aString2368;
	HashTable aClass667_2373;
	public int anInt2374;
	public int anInt2375;
	public int id = 1375110385;
	public int component = 776847879;
	public int[] anIntArray2378;
	public int contentType = 0;
	public int[] anIntArray2380;
	public byte aByte2381;
	public int anInt2382;
	public byte aByte2383;
	public int basePositionX;
	public int basePositionY;
	public int anInt2386;
	public int baseHeight;
	public int positionX;
	public int anInt2389;
	public int width;
	public int anInt2391;
	public int anInt2392;
	public int anInt2393;
	public String aString2394;
	public boolean hidden;
	public int anInt2396;
	public Object[] anObjectArray2397;
	public boolean disableHover;
	public byte aByte2400 = 0;
	public int scrollPosition;
	public int scrollWidth;
	public int scrollHeight;
	public int colour;
	public boolean aBool2405;
	public int anInt2406;
	public int anInt2407;
	public int anInt2408;
	public int anInt2409;
	public int type;
	public int anInt2412;
	public boolean aBool2414;
	public boolean aBool2415;
	public boolean aBool2416;
	public boolean aBool2417;
	public int anInt2418;
	public int anInt2419;
	public int anInt2420;
	public int anInt2421;
	public int spriteOffsetX;
	public boolean aBool2423;
	public int spritePitch;
	public int anInt2425;
	public int spriteYaw;
	public int anInt2427;
	public int anInt2428;
	public int anInt2429;
	public String[] aStringArray2430;
	public int anInt2431;
	public int anInt2432;
	public int animation;
	public boolean aBool2434;
	public int anInt2435;
	short[] aShortArray2436;
	short[] aShortArray2437;
	short[] aShortArray2438;
	public int spriteOffsetY;
	public Object[] anObjectArray2440;
	public int spriteRoll;
	public int anInt2442;
	public int spriteScale;
	public boolean aBool2444;
	public int anInt2445;
	public int anInt2446;
	public Object[] anObjectArray2447;
	public int anInt2448;
	public int anInt2449;
	public int anInt2450;
	public Object[] anObjectArray2452;
	public int anInt2453;
	public Object[] anObjectArray2454;
	public String text;
	public int anInt2456;
	public int anInt2458;
	public int anInt2459;
	public int anInt2460;
	public boolean aBool2461;
	public Class480_Sub16 aClass480_Sub16_2462;
	public int anInt2463;
	int anInt2464;
	public int anInt2465;
	public int[] anIntArray2466;
	public byte[][] aByteArrayArray2467;
	public String aString2473;
	public int baseWidth;
	public boolean aBool2475;
	public int[] anIntArray2476;
	public int height;
	public Widget aClass226_2478;
	public boolean aBool2479;
	public String aString2480;
	public int anInt2481;
	int anInt2482;
	public boolean aBool2483;
	public int anInt2484;
	public int parent;
	public int anInt2486;
	public Object[] anObjectArray2487;
	public int[] anIntArray2488;
	public Object[] anObjectArray2489;
	public Object[] anObjectArray2490;
	public Object[] anObjectArray2491;
	public Object[] anObjectArray2492;
	public Object[] anObjectArray2493;
	public Object[] anObjectArray2494;
	public Object[] anObjectArray2495;
	public Object[] anObjectArray2496;
	public int[] anIntArray2497;
	public Object[] anObjectArray2498;
	public int[] anIntArray2499;
	public Object[] anObjectArray2500;
	public int[] anIntArray2501;
	public Object[] anObjectArray2502;
	public int[] anIntArray2503;
	public Object[] anObjectArray2504;
	public int[] anIntArray2505;
	public Object[] anObjectArray2506;
	public int[] anIntArray2507;
	public Object[] anObjectArray2508;
	public Object[] anObjectArray2510;
	public boolean aBool2511;
	public Object[] anObjectArray2513;
	public Object[] anObjectArray2515;
	public Object[] anObjectArray2516;
	public Object[] anObjectArray2517;
	public Object[] anObjectArray2518;
	public Object[] anObjectArray2519;
	public boolean aBool2520;
	public Widget[] aClass226Array2521;
	public Object[] anObjectArray2522;
	public Object[] anObjectArray2523;
	public int anInt2524;
	public Object[] anObjectArray2525;
	public Object[] anObjectArray2526;
	public int positionY;
	public int item;
	public int itemAmount;
	public String aString2530;
	public Class227 aClass227_2531;
	public boolean aBool2532;
	public int anInt2533;
	public int anInt2534;
	public int anInt2535;
	public boolean aBool2536;
	int anInt2538;
	public boolean aBool2539;
	public int anInt2540;
	public Class650 aClass650_2541;
	public Widget[] aClass226Array2542;
	public int anInt2543;
	public boolean aBool2544;
	public boolean aBool2545;
	public int anInt2546;
	public int anInt2547;
	public int anInt2548;
	public byte[][] aByteArrayArray2549;

	public int anInt2550;

	public int anInt2551;

	public int anInt2552;

	public Object[] anObjectArray2553;

	public int anInt2554;

	public int anInt2555;

	public ParticleSystem aClass564_2556;

	public Object[] anObjectArray2557;

	public Widget() {
		aByte2381 = (byte) 0;
		aByte2358 = (byte) 0;
		aByte2383 = (byte) 0;
		basePositionX = 0;
		basePositionY = 0;
		baseWidth = 0;
		baseHeight = 0;
		positionX = 0;
		positionY = 0;
		width = 0;
		height = 0;
		anInt2408 = 1526136459;
		anInt2393 = -970300639;
		parent = 107738123;
		hidden = false;
		anInt2484 = 1887779447;
		anInt2463 = 1132968959;
		anInt2427 = 592771235;
		disableHover = false;
		anInt2382 = 0;
		scrollPosition = 0;
		scrollWidth = 0;
		scrollHeight = 0;
		colour = 0;
		aBool2405 = false;
		anInt2406 = 0;
		anInt2407 = -1334030119;
		aBool2539 = false;
		anInt2409 = 470325955;
		anInt2391 = 0;
		aBool2475 = false;
		anInt2432 = 0;
		anInt2425 = 0;
		aBool2416 = false;
		aBool2417 = true;
		anInt2418 = -512645613;
		anInt2420 = 903294167;
		spriteOffsetX = 0;
		spriteOffsetY = 0;
		spritePitch = 0;
		spriteRoll = 0;
		spriteYaw = 0;
		anInt2554 = 0;
		anInt2428 = 0;
		anInt2429 = 0;
		spriteScale = -793742860;
		anInt2431 = 0;
		anInt2551 = 0;
		aBool2423 = false;
		aBool2434 = false;
		anInt2435 = -583955262;
		aBool2444 = false;
		anInt2453 = 1584868157;
		aBool2536 = true;
		text = "";
		anInt2456 = 0;
		anInt2546 = 0;
		anInt2458 = 0;
		aBool2520 = false;
		anInt2374 = 0;
		aBool2461 = false;
		aClass480_Sub16_2462 = Class480_Sub16.aClass480_Sub16_10092;
		aBool2414 = false;
		aString2473 = "";
		anInt2524 = -657627567;
		aClass226_2478 = null;
		anInt2446 = 0;
		anInt2465 = 0;
		anInt2481 = anInt2398 * 1620433851;
		aString2480 = "";
		aBool2483 = false;
		item = 702084843;
		itemAmount = 0;
		aString2530 = null;
		aBool2532 = false;
		anInt2533 = -1401896043;
		anInt2396 = -1115802887;
		animation = -1473373853;
		aBool2544 = false;
		aBool2545 = false;
		anInt2389 = 1271108187;
		anInt2547 = 0;
		anInt2548 = 0;
		anInt2460 = 0;
		anInt2550 = 0;
		anInt2419 = 0;
		anInt2552 = 0;
		anInt2386 = 1364952095;
		anInt2392 = 1515435387;
	}

	public Font method4229(Class374 class374, FontProvider interface47, int i) {
		Font class132 = (Font) class374.method6124(interface47, 1668905963 * anInt2453, false, aBool2536);
		aBool2512 = class132 == null;
		return class132;
	}

	public FontSpecification method4230(Class374 class374, FontProvider interface47, byte i) {
		FontSpecification class9 = class374.method6125(interface47, anInt2453 * 1668905963);
		aBool2512 = null == class9;
		return class9;
	}

	public Sprite method4231(Toolkit class134, int i) {
		aBool2512 = false;
		long l = ((long) (-1694773323 * anInt2425) << 40) + ((aBool2479 ? 1L : 0L) << 38)
				+ ((long) (anInt2432 * 972044571) << 36) + anInt2409 * -370763243 + ((aBool2416 ? 1L : 0L) << 35)
				+ ((aBool2415 ? 1L : 0L) << 39);
		Sprite class116 = (Sprite) aClass168_2468.get(l);
		if (null != class116) {
			return class116;
		}
		Image class152 = ImageUtils.loadFirst(Class128.sprites, -370763243 * anInt2409, 0);
		if (null == class152) {
			aBool2512 = true;
			return null;
		}
		if (aBool2479) {
			class152.flipHorizontal();
		}
		if (aBool2415) {
			class152.flipVertical();
		}
		if (anInt2432 * 972044571 > 0) {
			class152.scale(972044571 * anInt2432);
		} else if (-1694773323 * anInt2425 != 0) {
			class152.scale(1);
		}
		if (972044571 * anInt2432 >= 1) {
			class152.setBorderColour(1);
		}
		if (anInt2432 * 972044571 >= 2) {
			class152.setBorderColour(16777215);
		}
		if (anInt2425 * -1694773323 != 0) {
			class152.setShadowColour(~0xffffff | anInt2425 * -1694773323);
		}
		class116 = class134.createSprite(class152, true);
		aClass168_2468.put(l, class116, class116.method2157() * class116.method2119() * 4);
		return class116;
	}

	public Model method4232(Toolkit class134, int i, Class678_Sub6 class678_sub6,
			IdentikitDefinitionLoader class678_sub11, NpcDefinitionLoader class678_sub7,
			ItemDefinitionLoader class678_sub14, AnimationDefinitionLoader class678_sub10, VariableLoader interface14,
			VariableProvider interface12, Class650 class650, PlayerAppearance class576, byte i_0_) {
		aBool2512 = false;
		if (0 == anInt2418 * 286135323) {
			return null;
		}
		if (286135323 * anInt2418 == 1 && anInt2486 * -643054127 == -1) {
			return null;
		}
		if (anInt2418 * 286135323 == 1) {
			int i_1_ = i;
			if (class650 != null) {
				i |= class650.method13457();
			}
			long l = -1L;
			long[] ls = Buffer.CRC_64;
			if (null != aShortArray2436) {
				for (int i_2_ = 0; i_2_ < aShortArray2436.length; i_2_++) {
					l = l >>> 8 ^ ls[(int) ((l ^ aShortArray2436[i_2_] >> 8) & 0xffL)];
					l = l >>> 8 ^ ls[(int) ((l ^ aShortArray2436[i_2_]) & 0xffL)];
					l = l >>> 8 ^ ls[(int) ((l ^ aShortArray2437[i_2_] >> 8) & 0xffL)];
					l = l >>> 8 ^ ls[(int) ((l ^ aShortArray2437[i_2_]) & 0xffL)];
				}
				i |= 0x4000;
			}
			if (null != aShortArray2438) {
				for (int i_3_ = 0; i_3_ < aShortArray2438.length; i_3_++) {
					l = l >>> 8 ^ ls[(int) ((l ^ aShortArray2438[i_3_] >> 8) & 0xffL)];
					l = l >>> 8 ^ ls[(int) ((l ^ aShortArray2438[i_3_]) & 0xffL)];
					l = l >>> 8 ^ ls[(int) ((l ^ aShortArray2363[i_3_] >> 8) & 0xffL)];
					l = l >>> 8 ^ ls[(int) ((l ^ aShortArray2363[i_3_]) & 0xffL)];
				}
				i |= 0x8000;
			}
			long l_4_ = (long) (class134.id * 976039213) << 59 | (long) (286135323 * anInt2418) << 55
					| (long) (-643054127 * anInt2486) << 38 | l & 0x3fffffffffL;
			Model class143 = (Model) aClass168_2372.get(l_4_);
			if (class143 == null || class134.method2637(class143.functionMask(), i) != 0) {
				if (null != class143) {
					i = class134.mergeFunctionMasks(i, class143.functionMask());
				}
				BaseModel class144 = BaseModel.lookup(Class54.models, -643054127 * anInt2486, 0);
				if (null == class144) {
					aBool2512 = true;
					return null;
				}
				if (class144.version < 13) {
					class144.method3103(2);
				}
				class143 = class134.createModel(class144, i, QuestDefinitionProvider.anInt2664 * -1749929127, 64, 768);
				if (null != aShortArray2436) {
					for (int i_5_ = 0; i_5_ < aShortArray2436.length; i_5_++) {
						class143.recolour(aShortArray2436[i_5_], aShortArray2437[i_5_]);
					}
				}
				if (aShortArray2438 != null) {
					for (int i_6_ = 0; i_6_ < aShortArray2438.length; i_6_++) {
						class143.retexture(aShortArray2438[i_6_], aShortArray2363[i_6_]);
					}
				}
				aClass168_2372.put(l_4_, class143);
			}
			if (null != class650) {
				class143 = class143.method2890((byte) 1, i, true);
				class650.method13458(class143, 0);
			}
			class143.updateFunctionMask(i_1_);
			return class143;
		}
		if (2 == anInt2418 * 286135323) {
			Model class143 = class678_sub7.get(anInt2486 * -643054127).method5105(class134, i, interface14,
					interface12, class650, aClass267_2361);
			if (class143 == null) {
				aBool2512 = true;
				return null;
			}
			return class143;
		}
		if (anInt2418 * 286135323 == 3) {
			if (null == class576) {
				return null;
			}
			Model class143 = class576.createHeadModel(class134, i, class678_sub11, class678_sub7, class678_sub14,
					interface14, interface12, class650);
			if (null == class143) {
				aBool2512 = true;
				return null;
			}
			return class143;
		}
		if (4 == 286135323 * anInt2418) {
			ItemDefinition itemDefinition = class678_sub14.get(anInt2486 * -643054127);
			Model class143 = itemDefinition.method13583(class134, i, 10, class576, class650, 0, 0, 0, 0);
			if (null == class143) {
				aBool2512 = true;
				return null;
			}
			return class143;
		}
		if (anInt2418 * 286135323 == 6) {
			Model class143 = class678_sub7.get(anInt2486 * -643054127).method5103(class134, i, class678_sub6,
					interface14, interface12, class650, null, null, null, 0, aClass267_2361);
			if (null == class143) {
				aBool2512 = true;
				return null;
			}
			return class143;
		}
		if (7 == anInt2418 * 286135323) {
			if (class576 == null) {
				return null;
			}
			int i_7_ = -643054127 * anInt2486 >>> 16;
			int i_8_ = anInt2486 * -643054127 & 0xffff;
			int i_9_ = anInt2420 * 405633305;
			Model class143 = class576.createHeadModel(class134, i, class678_sub11, class678_sub10, class650, i_7_,
					i_8_, i_9_, 1723143967);
			if (class143 == null) {
				aBool2512 = true;
				return null;
			}
			return class143;
		}
		return null;
	}

	public void method4234() {
		anObjectArray2440 = null;
		anObjectArray2359 = null;
		anObjectArray2357 = null;
		anObjectArray2487 = null;
		anObjectArray2557 = null;
		anObjectArray2489 = null;
		anObjectArray2490 = null;
		anObjectArray2491 = null;
		anObjectArray2492 = null;
		anObjectArray2493 = null;
		anObjectArray2494 = null;
		anObjectArray2495 = null;
		anObjectArray2496 = null;
		anIntArray2497 = null;
		anInt2547 = 0;
		anObjectArray2498 = null;
		anIntArray2499 = null;
		anInt2548 = 0;
		anObjectArray2500 = null;
		anIntArray2501 = null;
		anInt2460 = 0;
		anObjectArray2502 = null;
		anIntArray2503 = null;
		anInt2550 = 0;
		anObjectArray2504 = null;
		anIntArray2505 = null;
		anInt2419 = 0;
		anObjectArray2506 = null;
		anIntArray2507 = null;
		anInt2552 = 0;
		anObjectArray2508 = null;
		anObjectArray2553 = null;
		anObjectArray2510 = null;
		anObjectArray2452 = null;
		anObjectArray2447 = null;
		anObjectArray2513 = null;
		anObjectArray2364 = null;
		anObjectArray2515 = null;
		anObjectArray2516 = null;
		anObjectArray2517 = null;
		anObjectArray2518 = null;
		anObjectArray2519 = null;
		anObjectArray2366 = null;
		anObjectArray2454 = null;
		anObjectArray2522 = null;
		anObjectArray2523 = null;
		anObjectArray2397 = null;
		anObjectArray2525 = null;
		anObjectArray2526 = null;
		anInt2389 = 1271108187;
	}

	public void method4235(int i, String string, int i_10_) {
		if (null == aStringArray2430 || aStringArray2430.length <= i) {
			String[] strings = new String[i + 1];
			if (null != aStringArray2430) {
				for (int i_11_ = 0; i_11_ < aStringArray2430.length; i_11_++) {
					strings[i_11_] = aStringArray2430[i_11_];
				}
			}
			aStringArray2430 = strings;
		}
		aStringArray2430[i] = string;
	}

	public void method4236(int i, int i_12_, int i_13_) {
		if (null == anIntArray2476 || anIntArray2476.length <= i) {
			int[] is = new int[i + 1];
			if (anIntArray2476 != null) {
				for (int i_14_ = 0; i_14_ < anIntArray2476.length; i_14_++) {
					is[i_14_] = anIntArray2476[i_14_];
				}
				for (int i_15_ = anIntArray2476.length; i_15_ < i; i_15_++) {
					is[i_15_] = -1;
				}
			}
			anIntArray2476 = is;
		}
		anIntArray2476[i] = i_12_;
	}

	public int method4238(int i, int i_16_, int i_17_) {
		if (aClass667_2373 == null) {
			return i_16_;
		}
		LinkableInt class480_sub24 = (LinkableInt) aClass667_2373.get(i);
		if (class480_sub24 == null) {
			return i_16_;
		}
		return class480_sub24.value * -1189875169;
	}

	public String method4239(int i, String string, int i_18_) {
		if (null == aClass667_2373) {
			return string;
		}
		LinkableObject class480_sub25 = (LinkableObject) aClass667_2373.get(i);
		if (null == class480_sub25) {
			return string;
		}
		return (String) class480_sub25.object;
	}

	public void method4240(int i, int i_19_, byte i_20_) {
		if (null == aClass667_2373) {
			aClass667_2373 = new HashTable(16);
			aClass667_2373.put(i, new LinkableInt(i_19_));
		} else {
			LinkableInt class480_sub24 = (LinkableInt) aClass667_2373.get(i);
			if (class480_sub24 == null) {
				aClass667_2373.put(i, new LinkableInt(i_19_));
			} else {
				class480_sub24.value = -1975318049 * i_19_;
			}
		}
	}

	public void method4241(int i, String string) {
		if (null == aClass667_2373) {
			aClass667_2373 = new HashTable(16);
			aClass667_2373.put(i, new LinkableObject(string));
		} else {
			LinkableObject class480_sub25 = (LinkableObject) aClass667_2373.get(i);
			if (class480_sub25 != null) {
				class480_sub25.unlink();
			}
			aClass667_2373.put(i, new LinkableObject(string));
		}
	}

	public void method4242(int i) {
		if (aClass667_2373 != null) {
			Linkable class480 = aClass667_2373.get(i);
			if (null != class480) {
				class480.unlink();
			}
		}
	}

	public void method4243(int i, short i_23_, short i_24_) {
		if (i < 5) {
			if (null == aShortArray2436) {
				aShortArray2436 = new short[5];
				aShortArray2437 = new short[5];
			}
			aShortArray2436[i] = i_23_;
			aShortArray2437[i] = i_24_;
		}
	}

	public void method4247(Toolkit class134, Model class143, Class405 class405, int i, int i_26_) {
		class143.method3063(class405);
		Class145[] class145s = class143.method2942();
		Class115[] class115s = class143.method2943();
		if ((null == aClass564_2556 || aClass564_2556.stopped) && (null != class145s || class115s != null)) {
			aClass564_2556 = ParticleSystem.create(i, false);
		}
		if (aClass564_2556 != null) {
			aClass564_2556.method9488(class134, i, class145s, class115s, false);
		}
	}

	public void method4249(int i, short i_27_, short i_28_) {
		if (i < 5) {
			if (aShortArray2438 == null) {
				aShortArray2438 = new short[5];
				aShortArray2363 = new short[5];
			}
			aShortArray2438[i] = i_27_;
			aShortArray2363[i] = i_28_;
		}
	}

	public Class487 method4269(SkyboxDefinitionLoader class678_sub9, SunDefinitionLoader class678_sub1, int i) {
		if (anInt2533 * -2141876157 == -1) {
			return null;
		}
		long l = (1249493721 * anInt2464 & 0xffffL) << 48 | (anInt2482 * 51414865 & 0xffffL) << 32
				| (-1384584013 * anInt2538 & 0xffffL) << 16 | -2141876157 * anInt2533 & 0xffffL;
		Class487 class487 = (Class487) aClass168_2371.get(l);
		if (null == class487) {
			class487 = Class487.create(-2141876157 * anInt2533, anInt2464 * 1249493721, anInt2482 * 51414865,
					-1384584013 * anInt2538, class678_sub9, class678_sub1);
			aClass168_2371.put(l, class487);
		}
		return class487;
	}

	public Class211 method4298(Toolkit toolkit) {
		long l = (long) (id * 1857819631) << 32 | component * -592186295 & 0xffffffffL;
		Class211 class211 = (Class211) aClass168_2370.get(l);
		if (class211 != null) {
			if (anInt2409 * -370763243 != class211.anInt2184 * -1899051811) {
				aClass168_2370.remove(l);
				class211 = null;
			}
			if (class211 != null) {
				return class211;
			}
		}
		Image class152 = ImageUtils.loadFirst(Class128.sprites, -370763243 * anInt2409, 0);
		if (class152 == null) {
			return null;
		}
		int i_35_ = class152.getScaleWidth();
		int i_36_ = class152.getScaleHeight();
		int[] is = new int[i_36_];
		int[] is_37_ = new int[i_36_];
		for (int i_38_ = 0; i_38_ < class152.getHeight(); i_38_++) {
			int i_39_ = 0;
			int i_40_ = class152.getWidth();
			for (int i_41_ = 0; i_41_ < class152.getWidth(); i_41_++) {
				if (class152.getColour(i_41_, i_38_) != 0) {
					i_39_ = i_41_;
					break;
				}
			}
			for (int i_42_ = class152.getWidth() - 1; i_42_ >= i_39_; i_42_--) {
				if (class152.getColour(i_42_, i_38_) != 0) {
					i_40_ = i_42_ + 1;
					break;
				}
			}
			is[i_38_ + class152.getOffsetY()] = i_39_ + class152.getOffsetX();
			is_37_[i_38_ + class152.getOffsetY()] = i_40_ - i_39_;
		}
		ClippingMask class129 = toolkit.createClippingMask(i_35_, i_36_, is, is_37_);
		if (null == class129) {
			return null;
		}

		class211 = new Class211(i_35_, i_36_, is_37_, is, class129, anInt2409 * -370763243);
		aClass168_2370.put(l, class211);
		return class211;
	}

	int[] method4250(Buffer buffer, byte i) {
		int i_30_ = buffer.readUByte();
		if (i_30_ == 0) {
			return null;
		}
		int[] is = new int[i_30_];
		for (int i_31_ = 0; i_31_ < i_30_; i_31_++) {
			is[i_31_] = buffer.readInt();
		}
		return is;
	}

	Object[] method4273(Buffer buffer, byte i) {
		int i_32_ = buffer.readUByte();
		if (0 == i_32_) {
			return null;
		}
		Object[] objects = new Object[i_32_];
		for (int i_33_ = 0; i_33_ < i_32_; i_33_++) {
			int i_34_ = buffer.readUByte();
			if (i_34_ == 0) {
				objects[i_33_] = new Integer(buffer.readInt());
			} else if (i_34_ == 1) {
				objects[i_33_] = buffer.readString();
			}
		}
		aBool2483 = true;
		return objects;
	}

	void method4301(Buffer buffer) {
		int i_43_ = buffer.readUByte();
		if (255 == i_43_) {
			i_43_ = -1;
		}
		type = buffer.readUByte() * 1147822351;
		if ((1558474223 * type & 0x80) != 0) {
			type = (type * 1558474223 & 0x7f) * 1147822351;
			aString2394 = buffer.readString();
		}
		contentType = buffer.readUShort() * 1352407759;
		basePositionX = buffer.readShort() * 2065256071;
		basePositionY = buffer.readShort() * -970876179;
		baseWidth = buffer.readUShort() * 1719388879;
		baseHeight = buffer.readUShort() * 2033732677;
		aByte2358 = buffer.readByte();
		aByte2383 = buffer.readByte();
		aByte2400 = buffer.readByte();
		aByte2381 = buffer.readByte();
		parent = buffer.readUShort() * -107738123;
		if (65535 == 1920469085 * parent) {
			parent = 107738123;
		} else {
			parent = -107738123 * ((id * 1857819631 & ~0xffff) + 1920469085 * parent);
		}
		int i_44_ = buffer.readUByte();
		hidden = 0 != (i_44_ & 0x1);
		if (i_43_ >= 0) {
			disableHover = (i_44_ & 0x2) != 0;
		}
		if (1558474223 * type == 0) {
			scrollWidth = buffer.readUShort() * 1011153391;
			scrollHeight = buffer.readUShort() * 1575701533;
			if (i_43_ < 0) {
				disableHover = buffer.readUByte() == 1;
			}
		}
		if (5 == type * 1558474223) {
			anInt2409 = buffer.readInt() * -470325955;
			anInt2391 = buffer.readUShort() * 1873131179;
			int i_45_ = buffer.readUByte();
			aBool2475 = (i_45_ & 0x1) != 0;
			aBool2416 = (i_45_ & 0x2) != 0;
			anInt2406 = buffer.readUByte() * 76171347;
			anInt2432 = buffer.readUByte() * -1184204525;
			anInt2425 = buffer.readInt() * 1380050589;
			aBool2479 = buffer.readUByte() == 1;
			aBool2415 = buffer.readUByte() == 1;
			colour = buffer.readInt() * -742586667;
			if (i_43_ >= 3) {
				aBool2417 = buffer.readUByte() == 1;
			}
		}
		if (1558474223 * type == 6) {
			anInt2418 = -512645613;
			anInt2486 = buffer.readSmart32() * 1265546033;
			int i_46_ = buffer.readUByte();
			boolean bool = (i_46_ & 0x1) == 1;
			aBool2511 = (i_46_ & 0x2) == 2;
			aBool2423 = 4 == (i_46_ & 0x4);
			aBool2434 = 8 == (i_46_ & 0x8);
			if (bool) {
				anInt2554 = buffer.readShort() * -87869317;
				anInt2428 = buffer.readShort() * 1722970625;
				spritePitch = buffer.readUShort() * 1513530733;
				spriteRoll = buffer.readUShort() * 1225722821;
				spriteYaw = buffer.readUShort() * 746962885;
				spriteScale = buffer.readUShort() * 1495301125;
			} else if (aBool2511) {
				anInt2554 = buffer.readShort() * -87869317;
				anInt2428 = buffer.readShort() * 1722970625;
				anInt2429 = buffer.readShort() * -86437937;
				spritePitch = buffer.readUShort() * 1513530733;
				spriteRoll = buffer.readUShort() * 1225722821;
				spriteYaw = buffer.readUShort() * 746962885;
				spriteScale = buffer.readShort() * 1495301125;
			}
			animation = buffer.readSmart32() * 1473373853;
			if (0 != aByte2358) {
				anInt2431 = buffer.readUShort() * -835146629;
			}
			if (aByte2383 != 0) {
				anInt2551 = buffer.readUShort() * -581331043;
			}
		}
		if (4 == 1558474223 * type) {
			anInt2453 = buffer.readSmart32() * -1584868157;
			if (i_43_ >= 2) {
				aBool2536 = buffer.readUByte() == 1;
			}
			text = buffer.readString();
			anInt2456 = buffer.readUByte() * -522822693;
			anInt2546 = buffer.readUByte() * -61633803;
			anInt2458 = buffer.readUByte() * 557492527;
			aBool2520 = buffer.readUByte() == 1;
			colour = buffer.readInt() * -742586667;
			anInt2406 = buffer.readUByte() * 76171347;
			if (i_43_ >= 0) {
				anInt2374 = buffer.readUByte() * 1445901463;
			}
		}
		if (1558474223 * type == 3) {
			colour = buffer.readInt() * -742586667;
			aBool2405 = buffer.readUByte() == 1;
			anInt2406 = buffer.readUByte() * 76171347;
		}
		if (9 == type * 1558474223) {
			anInt2407 = buffer.readUByte() * -1334030119;
			colour = buffer.readInt() * -742586667;
			aBool2539 = buffer.readUByte() == 1;
		}
		int i_47_ = buffer.readUTriByte();
		int i_48_ = buffer.readUByte();
		if (i_48_ != 0) {
			aByteArrayArray2549 = new byte[11][];
			aByteArrayArray2467 = new byte[11][];
			anIntArray2466 = new int[11];
			anIntArray2380 = new int[11];
			for (; i_48_ != 0; i_48_ = buffer.readUByte()) {
				int i_49_ = (i_48_ >> 4) - 1;
				i_48_ = i_48_ << 8 | buffer.readUByte();
				i_48_ &= 0xfff;
				if (i_48_ == 4095) {
					i_48_ = -1;
				}
				byte i_50_ = buffer.readByte();
				if (i_50_ != 0) {
					aBool2414 = true;
				}
				byte i_51_ = buffer.readByte();
				anIntArray2466[i_49_] = i_48_;
				aByteArrayArray2549[i_49_] = new byte[] { i_50_ };
				aByteArrayArray2467[i_49_] = new byte[] { i_51_ };
			}
		}
		aString2473 = buffer.readString();
		int i_52_ = buffer.readUByte();
		int i_53_ = i_52_ & 0xf;
		int i_54_ = i_52_ >> 4;
		if (i_53_ > 0) {
			aStringArray2430 = new String[i_53_];
			for (int i_55_ = 0; i_55_ < i_53_; i_55_++) {
				aStringArray2430[i_55_] = buffer.readString();
			}
		}
		if (i_54_ > 0) {
			int i_56_ = buffer.readUByte();
			anIntArray2476 = new int[1 + i_56_];
			for (int i_57_ = 0; i_57_ < anIntArray2476.length; i_57_++) {
				anIntArray2476[i_57_] = -1;
			}
			anIntArray2476[i_56_] = buffer.readUShort();
		}
		if (i_54_ > 1) {
			int i_58_ = buffer.readUByte();
			anIntArray2476[i_58_] = buffer.readUShort();
		}
		aString2368 = buffer.readString();
		if (aString2368.equals("")) {
			aString2368 = null;
		}
		anInt2446 = buffer.readUByte() * -1908006435;
		anInt2465 = buffer.readUByte() * 1912613655;
		anInt2481 = buffer.readUByte() * 1170733121;
		aString2480 = buffer.readString();
		int i_59_ = -1;
		if (Class237.method4432(i_47_) != 0) {
			i_59_ = buffer.readUShort();
			if (i_59_ == 65535) {
				i_59_ = -1;
			}
			anInt2484 = buffer.readUShort() * -1887779447;
			if (anInt2484 * 326975673 == 65535) {
				anInt2484 = 1887779447;
			}
			anInt2463 = buffer.readUShort() * -1132968959;
			if (65535 == anInt2463 * -711476223) {
				anInt2463 = 1132968959;
			}
		}
		if (i_43_ >= 0) {
			anInt2427 = buffer.readUShort() * -592771235;
			if (anInt2427 * -1203862283 == 65535) {
				anInt2427 = 592771235;
			}
		}
		aClass480_Sub16_2462 = new Class480_Sub16(i_47_, i_59_);
		if (i_43_ >= 0) {
			int i_60_ = buffer.readUByte();
			for (int i_61_ = 0; i_61_ < i_60_; i_61_++) {
				int i_62_ = buffer.readUTriByte();
				int i_63_ = buffer.readInt();
				aClass667_2373.put(i_62_, new LinkableInt(i_63_));
			}
			int i_64_ = buffer.readUByte();
			for (int i_65_ = 0; i_65_ < i_64_; i_65_++) {
				int i_66_ = buffer.readUTriByte();
				String string = buffer.readPrefixedString();
				aClass667_2373.put(i_66_, new LinkableObject(string));
			}
		}
		anObjectArray2440 = method4273(buffer, (byte) 18);
		anObjectArray2489 = method4273(buffer, (byte) 120);
		anObjectArray2491 = method4273(buffer, (byte) 108);
		anObjectArray2495 = method4273(buffer, (byte) 106);
		anObjectArray2494 = method4273(buffer, (byte) 75);
		anObjectArray2496 = method4273(buffer, (byte) 110);
		anObjectArray2498 = method4273(buffer, (byte) 91);
		anObjectArray2500 = method4273(buffer, (byte) 85);
		anObjectArray2508 = method4273(buffer, (byte) 76);
		anObjectArray2553 = method4273(buffer, (byte) 125);
		if (i_43_ >= 0) {
			anObjectArray2510 = method4273(buffer, (byte) 72);
		}
		anObjectArray2490 = method4273(buffer, (byte) 22);
		anObjectArray2359 = method4273(buffer, (byte) 108);
		anObjectArray2357 = method4273(buffer, (byte) 88);
		anObjectArray2487 = method4273(buffer, (byte) 125);
		anObjectArray2557 = method4273(buffer, (byte) 106);
		anObjectArray2492 = method4273(buffer, (byte) 23);
		anObjectArray2493 = method4273(buffer, (byte) 84);
		anObjectArray2452 = method4273(buffer, (byte) 77);
		anObjectArray2502 = method4273(buffer, (byte) 19);
		anObjectArray2504 = method4273(buffer, (byte) 82);
		anIntArray2497 = method4250(buffer, (byte) -128);
		anIntArray2499 = method4250(buffer, (byte) -66);
		anIntArray2501 = method4250(buffer, (byte) -20);
		anIntArray2503 = method4250(buffer, (byte) -54);
		anIntArray2505 = method4250(buffer, (byte) -102);
	}

	static void method2232(Widget class226) {
		if (5 == 1558474223 * class226.type && -1 != class226.item * 1391525437) {
			PlayerVarpDefinitionIterator.method4139(Class60.activeToolkit, class226);
		}
	}

	static void method14089(Interface class221, int i, int i_12_, int i_13_, boolean bool,
			ScriptExecutionContext class613) {
		if (i_12_ == 0) {
			throw new RuntimeException();
		}
		Widget class226 = class221.children[i];
		if (class226.aClass226Array2542 == null) {
			class226.aClass226Array2542 = new Widget[1 + i_13_];
			class226.aClass226Array2521 = class226.aClass226Array2542;
		}
		if (class226.aClass226Array2542.length <= i_13_) {
			if (class226.aClass226Array2521 == class226.aClass226Array2542) {
				Widget[] class226s = new Widget[1 + i_13_];
				for (int i_15_ = 0; i_15_ < class226.aClass226Array2542.length; i_15_++) {
					class226s[i_15_] = class226.aClass226Array2542[i_15_];
				}
				class226.aClass226Array2542 = class226.aClass226Array2521 = class226s;
			} else {
				Widget[] class226s = new Widget[i_13_ + 1];
				Widget[] class226s_16_ = new Widget[i_13_ + 1];
				for (int i_17_ = 0; i_17_ < class226.aClass226Array2542.length; i_17_++) {
					class226s[i_17_] = class226.aClass226Array2542[i_17_];
					class226s_16_[i_17_] = class226.aClass226Array2521[i_17_];
				}
				class226.aClass226Array2542 = class226s;
				class226.aClass226Array2521 = class226s_16_;
			}
		}
		if (i_13_ > 0 && class226.aClass226Array2542[i_13_ - 1] == null) {
			throw new RuntimeException(new StringBuilder().append("").append(i_13_ - 1).toString());
		}
		Widget class226_18_ = new Widget();
		class226_18_.type = 1147822351 * i_12_;
		class226_18_.parent = (class226_18_.id = class226.id * 1) * 201742523;
		class226_18_.component = i_13_ * -776847879;
		class226.aClass226Array2542[i_13_] = class226_18_;
		if (class226.aClass226Array2521 != class226.aClass226Array2542) {
			class226.aClass226Array2521[i_13_] = class226_18_;
		}
		Class611 class611;
		if (bool) {
			class611 = class613.aClass611_7945;
		} else {
			class611 = class613.aClass611_7931;
		}
		class611.aClass221_7913 = class221;
		class611.aClass226_7914 = class226_18_;
		redraw(class226);
	}

	public static void method5082(int id, int[] is) {
		if (id != -1 && loadInterface(id, is)) {
			Widget[] widgets = Class598.loadedInterfaces[id].children;
			PriorityQueueElement.method6072(widgets);
		}
	}

	static void method5437(int i) {
		if (i != -1 && !aBoolArray2558[i]) {
			UnboundedDefinitionLoaderIterator.widgets.clearUnpacked(i);
			Class598.loadedInterfaces[i] = null;
		}
	}

	static void method15084(Widget widget, int i, int i_0_, boolean bool, byte i_1_) {
		int i_2_ = 688089097 * widget.width;
		int i_3_ = widget.height * 1362321717;
		if (0 == widget.aByte2358) {
			widget.width = widget.baseWidth * 956604535;
		} else if (widget.aByte2358 == 1) {
			widget.width = (i - -759235537 * widget.baseWidth) * 1149806137;
		} else if (2 == widget.aByte2358) {
			widget.width = (widget.baseWidth * -759235537 * i >> 14) * 1149806137;
		}
		if (0 == widget.aByte2383) {
			widget.height = 603403001 * widget.baseHeight;
		} else if (1 == widget.aByte2383) {
			widget.height = (i_0_ - widget.baseHeight * 219735693) * -331699939;
		} else if (widget.aByte2383 == 2) {
			widget.height = (i_0_ * widget.baseHeight * 219735693 >> 14) * -331699939;
		}
		if (4 == widget.aByte2358) {
			widget.width = 1149806137 * (widget.anInt2408 * -1028458205 * widget.height * 1362321717 / (widget.anInt2393 * -1077747487));
		}
		if (widget.aByte2383 == 4) {
			widget.height = widget.anInt2393 * -1077747487 * widget.width * 688089097
					/ (-1028458205 * widget.anInt2408) * -331699939;
		}
		if (Client.aBool10603
				&& (Client.method17050(widget).anInt10100 * -528482985 != 0 || 0 == 1558474223 * widget.type)) {
			if (widget.height * 1362321717 < 5 && widget.width * 688089097 < 5) {
				widget.height = -1658499695;
				widget.width = 1454063389;
			} else {
				if (widget.height * 1362321717 <= 0) {
					widget.height = -1658499695;
				}
				if (688089097 * widget.width <= 0) {
					widget.width = 1454063389;
				}
			}
		}
		if (widget.contentType * 1584180271 == anInt2354 * 1217733147) {
			Client.aClass226_10798 = widget;
		}
		if (bool && null != widget.anObjectArray2523
				&& (i_2_ != widget.width * 688089097 || i_3_ != widget.height * 1362321717)) {
			ScriptContext class480_sub35 = new ScriptContext();
			class480_sub35.source = widget;
			class480_sub35.arguments = widget.anObjectArray2523;
			Client.aClass644_10843.pushBack(class480_sub35);
		}
	}

	static final void method7527(Widget widget, Interface class221, boolean bool, int i, ScriptExecutionContext class613) {
		class613.anInt7924 -= -2049596966;
		int id = class613.anIntArray7942[1841827045 * class613.anInt7924];
		int amount = class613.anIntArray7942[1 + 1841827045 * class613.anInt7924];

		if (-1 == widget.component * -592186295 && !class221.aBool2278) {
			PulseEvent.method17525(1857819631 * widget.id);
			PulseEvent.method4741(1857819631 * widget.id);
			PulseEvent.method17579(widget.id * 1857819631);
		}

		if (-1 == id) {
			widget.anInt2418 = -512645613;
			widget.anInt2486 = -1265546033;
			widget.item = 702084843;
		} else {
			widget.item = id * -702084843;
			widget.itemAmount = amount * 1985329561;
			widget.aBool2532 = bool;
			ItemDefinition definition = ItemDefinition.loader.get(id);
			widget.spritePitch = 2032618151 * definition.modelPitch;
			widget.spriteRoll = -1760530027 * definition.modelRoll;
			widget.spriteYaw = 892689883 * definition.modelYaw;
			widget.spriteOffsetX = definition.modelTranslateX * -1774654731;
			widget.spriteOffsetY = definition.modelTranslateY * -1762851215;
			widget.spriteScale = definition.modelScale * -1917655991;
			widget.anInt2435 = i * 1855506017;

			if (459297459 * widget.anInt2431 > 0) {
				widget.spriteScale = widget.spriteScale * -350348896 / (widget.anInt2431 * 459297459) * 1495301125;
			} else if (-759235537 * widget.baseWidth > 0) {
				widget.spriteScale = 1495301125 * (widget.spriteScale * -350348896 / (widget.baseWidth * -759235537));
			}
		}
	}

	public static final void method15337(boolean bool) {
		OutgoingFrame frame = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_4018, Client.gameConnection.encryptor);
		Client.gameConnection.sendFrame(frame);
		for (Class480_Sub41 class480_sub41 = (Class480_Sub41) Client.aClass667_10791.first(); class480_sub41 != null; class480_sub41 = (Class480_Sub41) Client.aClass667_10791
				.next()) {
			if (!class480_sub41.isLinked()) {
				class480_sub41 = (Class480_Sub41) Client.aClass667_10791.first();
				if (null == class480_sub41) {
					break;
				}
			}
			if (0 == class480_sub41.anInt10371 * -487784573) {
				Class480_Sub41.method9830(class480_sub41, true, bool);
			}
		}
		if (null != Client.aClass226_10793) {
			redraw(Client.aClass226_10793);
			Client.aClass226_10793 = null;
		}
	}

	static final void method3529(Widget widget) {
		if (widget.contentType * 1584180271 == 1084594073 * anInt2353) {
			if (null == Client.localPlayer.accountName) {
				widget.anInt2486 = 0;
				widget.anInt2420 = 0;
			} else {
				widget.spritePitch = -603656738;
				widget.spriteRoll = ((int) (Math.sin(Client.tick / 40.0) * 256.0) & 0x7ff) * 1225722821;
				widget.anInt2418 = 1731739231;
				widget.anInt2486 = -1872598017 * Client.localPlayerIndex;
				widget.anInt2420 = Queue.method13192(Client.localPlayer.accountName) * -903294167;
				Class650_Sub2 class650_sub2 = Client.localPlayer.aClass650_Sub2_11525;

				if (class650_sub2 != null) {
					if (widget.aClass650_2541 == null) {
						widget.aClass650_2541 = new Class650_Sub3();
					}
					widget.animation = class650_sub2.getAnimationId() * 1473373853;
					widget.aClass650_2541.method13514(class650_sub2);
				} else {
					widget.aClass650_2541 = null;
				}
			}
		}
	}

	static final void method15440(int id, int i_1_) {
		if (loadInterface(id, null)) {
			Class427.method7091(Class598.loadedInterfaces[id].children, i_1_);
		}
	}

	public static void redraw(Widget class226) {
		if (-1337319859 * class226.anInt2392 == -1091196149 * Client.anInt10864) {
			Client.aBoolArray10850[class226.anInt2386 * -561182687] = true;
		}
	}

	static void method7346(Toolkit toolkit, ClippingMask class129, Widget widget, int i, int i_3_, int i_4_, int i_5_,
			int i_6_, int i_7_) {
		Class224 class224 = (Class224) Queue.aClass678_Sub8_8139.get(i_6_);
		if (class224 != null && null != class224.morphisms
				&& class224.method4205(PlayerVariableProvider.instance, PlayerVariableProvider.instance)) {
			class224 = class224.method4211(PlayerVariableProvider.instance, PlayerVariableProvider.instance);
		}
		if (null != class224 && class224.aBool2311
				&& class224.method4205(PlayerVariableProvider.instance, PlayerVariableProvider.instance)) {
			if (class224.anIntArray2324 != null) {
				int[] is = new int[class224.anIntArray2324.length];
				for (int i_8_ = 0; i_8_ < is.length / 2; i_8_++) {
					int i_9_;
					if (3 == Connection.anInt7170 * 1212513917) {
						i_9_ = (int) (Class369.aClass261_Sub1_4079.method4843() * 2607.5945876176133) + 1093165775
								* Client.anInt10699 & 0x3fff;
					} else if (Connection.anInt7170 * 1212513917 == 6) {
						i_9_ = (int) Client.aFloat10787 & 0x3fff;
					} else {
						i_9_ = (int) Client.aFloat10787 + Client.anInt10699 * 1093165775 & 0x3fff;
					}
					int i_10_ = Class373.SINE[i_9_];
					int i_11_ = Class373.COSINE[i_9_];
					if (1212513917 * Connection.anInt7170 != 6) {
						i_10_ = i_10_ * 256 / (Client.anInt10701 * -1894746741 + 256);
						i_11_ = 256 * i_11_ / (Client.anInt10701 * -1894746741 + 256);
					}
					is[2 * i_8_] = 688089097
							* widget.width
							/ 2
							+ i
							+ ((i_5_ + class224.anIntArray2324[2 * i_8_ + 1] * 4) * i_10_ + i_11_
									* (i_4_ + class224.anIntArray2324[2 * i_8_] * 4) >> 14);
					is[1 + 2 * i_8_] = widget.height
							* 1362321717
							/ 2
							+ i_3_
							- ((i_5_ + 4 * class224.anIntArray2324[i_8_ * 2 + 1]) * i_11_
									- (class224.anIntArray2324[2 * i_8_] * 4 + i_4_) * i_10_ >> 14);
				}
				Class211 class211 = widget.method4298(toolkit);
				if (null != class211) {
					Class133.method2355(toolkit, is, class224.anInt2319 * -1269404395, class211.anIntArray2181,
							class211.anIntArray2179);
				}
				if (-2038170095 * class224.anInt2343 > 0) {
					for (int i_12_ = 0; i_12_ < is.length / 2 - 1; i_12_++) {
						int i_13_ = is[2 * i_12_];
						int i_14_ = is[1 + i_12_ * 2];
						int i_15_ = is[(i_12_ + 1) * 2];
						int i_16_ = is[(i_12_ + 1) * 2 + 1];
						if (i_15_ < i_13_) {
							int i_17_ = i_13_;
							int i_18_ = i_14_;
							i_13_ = i_15_;
							i_14_ = i_16_;
							i_15_ = i_17_;
							i_16_ = i_18_;
						} else if (i_13_ == i_15_ && i_16_ < i_14_) {
							int i_19_ = i_14_;
							i_14_ = i_16_;
							i_16_ = i_19_;
						}
						if (null != class129) {
							toolkit.method2813(i_13_, i_14_, i_15_, i_16_,
									class224.anIntArray2337[class224.aByteArray2323[i_12_] & 0xff], 1, class129, i,
									i_3_, -2038170095 * class224.anInt2343, -1863776093 * class224.anInt2331,
									class224.anInt2332 * -178285943);
						} else {
							toolkit.method2441(i_13_, i_14_, i_15_, i_16_,
									class224.anIntArray2337[class224.aByteArray2323[i_12_] & 0xff], 1, -2038170095
											* class224.anInt2343, class224.anInt2331 * -1863776093, class224.anInt2332
											* -178285943);
						}
					}
					int i_20_ = is[is.length - 2];
					int i_21_ = is[is.length - 1];
					int i_22_ = is[0];
					int i_23_ = is[1];
					if (i_22_ < i_20_) {
						int i_24_ = i_20_;
						int i_25_ = i_21_;
						i_20_ = i_22_;
						i_21_ = i_23_;
						i_22_ = i_24_;
						i_23_ = i_25_;
					} else if (i_20_ == i_22_ && i_23_ < i_21_) {
						int i_26_ = i_21_;
						i_21_ = i_23_;
						i_23_ = i_26_;
					}
					if (class129 != null) {
						toolkit.method2813(
								i_20_,
								i_21_,
								i_22_,
								i_23_,
								class224.anIntArray2337[class224.aByteArray2323[class224.aByteArray2323.length - 1] & 0xff],
								1, class129, i, i_3_, -2038170095 * class224.anInt2343, class224.anInt2331
										* -1863776093, class224.anInt2332 * -178285943);
					} else {
						toolkit.method2441(
								i_20_,
								i_21_,
								i_22_,
								i_23_,
								class224.anIntArray2337[class224.aByteArray2323[class224.aByteArray2323.length - 1] & 0xff],
								1, -2038170095 * class224.anInt2343, class224.anInt2331 * -1863776093,
								class224.anInt2332 * -178285943);
					}
				} else if (null != class129) {
					for (int i_27_ = 0; i_27_ < is.length / 2 - 1; i_27_++) {
						toolkit.method2440(is[i_27_ * 2], is[i_27_ * 2 + 1], is[2 * (1 + i_27_)],
								is[1 + (1 + i_27_) * 2],
								class224.anIntArray2337[class224.aByteArray2323[i_27_] & 0xff], 1, class129, i, i_3_);
					}
					toolkit.method2440(
							is[is.length - 2],
							is[is.length - 1],
							is[0],
							is[1],
							class224.anIntArray2337[class224.aByteArray2323[class224.aByteArray2323.length - 1] & 0xff],
							1, class129, i, i_3_);
				} else {
					for (int i_28_ = 0; i_28_ < is.length / 2 - 1; i_28_++) {
						toolkit.method2783(is[2 * i_28_], is[2 * i_28_ + 1], is[2 * (i_28_ + 1)],
								is[2 * (i_28_ + 1) + 1],
								class224.anIntArray2337[class224.aByteArray2323[i_28_] & 0xff], 1);
					}
					toolkit.method2783(
							is[is.length - 2],
							is[is.length - 1],
							is[0],
							is[1],
							class224.anIntArray2337[class224.aByteArray2323[class224.aByteArray2323.length - 1] & 0xff],
							1);
				}
			}
			Sprite class116 = null;
			if (class224.anInt2299 * 1584610185 != -1) {
				class116 = class224.method4207(toolkit, false);
				if (null != class116) {
					int i_29_ = 1013076751 * class224.anInt2339 > 0 ? 1013076751 * class224.anInt2339
							: Mob.defaults.anInt7600 * 734521737;
					Class349.method5957(widget, class129, i, i_3_, i_4_, i_5_, class116, i_29_,
							class224.aClass203_2341, class224.aClass220_2336);
				}
			}
			if (null != class224.aString2301) {
				int i_30_ = 0;
				if (class116 != null) {
					i_30_ = class116.method2119();
				}
				Font class132 = Class558.p11Full;
				FontSpecification class9 = Class24.p11Full;
				if (class224.anInt2335 * 42167249 == 1) {
					class132 = Client.p12Full;
					class9 = Class24.p12Full;
				}
				if (class224.anInt2335 * 42167249 == 2) {
					class132 = Class450.b12Full;
					class9 = Class281_Sub3.b12Full;
				}
				Class24.method775(widget, class129, i, i_3_, i_4_, i_5_, i_30_, class224.aString2301, class132, class9,
						class224.anInt2302 * -1423941133, -889257482);
			}
		}
	}

	static void method2287(Widget class226, int i, int i_5_, short i_6_) {
		Class211 class211 = class226.method4298(Class60.activeToolkit);
		if (class211 != null) {
			Class60.activeToolkit.method2760(i, i_5_, i + class226.width * 688089097, i_5_ + 1362321717
					* class226.height);
			if (Class63.anInt954 * 422203915 < 3) {
				int i_7_;
				if (3 == Connection.anInt7170 * 1212513917) {
					i_7_ = (int) -(Class369.aClass261_Sub1_4079.method4843() * 2607.5945876176133);
				} else {
					i_7_ = (int) -Client.aFloat10787;
				}
				i_7_ = i_7_ + -2108635746 * Client.anInt10699 & 0x3fff;
				i_7_ <<= 2;
				CutsceneObject.compass.method2128(i + class226.width * 688089097 / 2.0F, i_5_ + class226.height
						* 1362321717 / 2.0F, 4298, i_7_, class211.aClass129_2183, i, i_5_);
			} else {
				Class60.activeToolkit.method2467(-16777216, class211.aClass129_2183, i, i_5_);
			}
		}
	}

	public static boolean method3189(int i, int i_1_, int i_2_) {
		if (!Class56.menuOpen) {
			return false;
		}
		int i_3_ = i >> 16;
		int i_4_ = i & 0xffff;
		if (null == Class598.loadedInterfaces[i_3_] || null == Class598.loadedInterfaces[i_3_].children[i_4_]) {
			return false;
		}
		Widget class226 = Class598.loadedInterfaces[i_3_].children[i_4_];
		if (i_1_ != -1 || class226.type * 1558474223 != 0) {
			for (MenuOption class480_sub31_sub17 = MenuOption.options.head(); null != class480_sub31_sub17; class480_sub31_sub17 = MenuOption.options
					.next()) {
				if (i_1_ == -1800080575 * class480_sub31_sub17.secondary
						&& class226.id * 1857819631 == 1353485821 * class480_sub31_sub17.tertiary
						&& (58 == -20536735 * class480_sub31_sub17.type
								|| 1007 == class480_sub31_sub17.type * -20536735
								|| -20536735 * class480_sub31_sub17.type == 25
								|| 57 == -20536735 * class480_sub31_sub17.type || 30 == -20536735
								* class480_sub31_sub17.type)) {
					return true;
				}
			}
		} else {
			for (MenuOption class480_sub31_sub17 = MenuOption.options.head(); null != class480_sub31_sub17; class480_sub31_sub17 = MenuOption.options
					.next()) {
				if (class480_sub31_sub17.type * -20536735 == 58 || -20536735 * class480_sub31_sub17.type == 1007
						|| 25 == class480_sub31_sub17.type * -20536735 || -20536735 * class480_sub31_sub17.type == 57
						|| class480_sub31_sub17.type * -20536735 == 30) {
					for (Widget class226_5_ = lookup(class480_sub31_sub17.tertiary * 1353485821); class226_5_ != null; class226_5_ = Class339
							.method5850(Class598.loadedInterfaces[class226_5_.id * 1857819631 >> 16], class226_5_,
									308457455)) {
						if (1857819631 * class226_5_.id == class226.id * 1857819631) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	public static void method3326(int maximumAge) {
		aClass168_2468.sweep(maximumAge);
		aClass168_2372.sweep(maximumAge);
		aClass168_2370.sweep(maximumAge);
		aClass168_2371.sweep(maximumAge);
	}

	public static boolean loadInterface(int id, int[] is) {
		if (aBoolArray2558[id]) {
			return true;
		}

		Class598.loadedInterfaces[id] = GameContext.method10444(id, is, Class598.loadedInterfaces[id], false);
		if (Class598.loadedInterfaces[id] == null) {
			return false;
		}

		aBoolArray2558[id] = true;
		return true;
	}

	public static Widget lookup(int id) {
		int parent = id >> 16;
		if (Class598.loadedInterfaces[parent] == null || Class598.loadedInterfaces[parent].getChild(id) == null) {
			boolean loaded = Widget.loadInterface(parent, null);
			if (!loaded) {
				return null;
			}
		}

		return Class598.loadedInterfaces[parent].getChild(id);
	}

	public static void method10427(int i) {
		aBoolArray2558[i] = false;
		Widget.method5437(i);
	}

	static final void method13702(Widget class226, Interface class221, ScriptExecutionContext class613, byte i) {
		String string = (String) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
		if (ScriptExecutionContext.method9239(string, class613) != null) {
			string = string.substring(0, string.length() - 1);
		}

		class226.anObjectArray2397 = Class562_Sub1.method16248(string, class613);
		class226.aBool2483 = true;
	}

	public static final void method587(Widget[] widgets, int i, int i_2_, int i_3_, int i_4_, int i_5_, int x, int y,
			int i_8_, boolean bool) {
		Class60.activeToolkit.method2760(i_2_, i_3_, i_4_, i_5_);
		for (Widget widget : widgets) {
			if (widget != null
					&& (widget.parent * 1920469085 == i || i == -1412584499 && Client.aClass226_10801 == widget)) {
				int i_11_;

				if (i_8_ == -1) {
					Client.aRectangleArray10852[Client.anInt10848 * -573888519].setBounds(x + widget.positionX
							* -346651673, widget.positionY * -1901639223 + y, 688089097 * widget.width,
							widget.height * 1362321717);
					i_11_ = (Client.anInt10848 += 1959324233) * -573888519 - 1;
				} else {
					i_11_ = i_8_;
				}

				widget.anInt2386 = -1364952095 * i_11_;
				widget.anInt2392 = Client.tick * -1515435387;
				if (!Client.method16857(widget)) {
					if (0 != 1584180271 * widget.contentType) {
						Widget.method3529(widget);
					}
					
					int i_12_ = x + widget.positionX * -346651673;
					int i_13_ = -1901639223 * widget.positionY + y;
					int i_14_ = widget.anInt2406 * -5030949;
					
					if (Client.aBool10603
							&& (Client.method17050(widget).anInt10100 * -528482985 != 0 || 0 == widget.type * 1558474223)
							&& i_14_ > 127) {
						i_14_ = 127;
					}
					
					if (Client.aClass226_10801 == widget) {
						if (-1412584499 != i
								&& (-1326442559 * widget.anInt2481 == -116477801 * anInt2351
										|| anInt2398 * -687311621 == widget.anInt2481 * -1326442559 || Client
										.method17050(widget).method15630(1754788389)
										&& widget.anInt2481 * -1326442559 != -721529179 * anInt2352)) {
							Class480_Sub12.aClass226Array10072 = widgets;
							Class514.anInt7014 = -725918667 * x;
							TurnMobCutsceneAction.anInt9435 = -2036018243 * y;
							continue;
						}
						
						if (Client.aBool10814 && Client.aBool10806) {
							int i_15_ = Client.recorder.getMouseX();
							int i_16_ = Client.recorder.getMouseY();
							i_15_ -= 1600472963 * Client.anInt10803;
							i_16_ -= 558940787 * Client.anInt10804;
							if (i_15_ < Client.anInt10849 * 1253169817) {
								i_15_ = 1253169817 * Client.anInt10849;
							}
							if (i_15_ + widget.width * 688089097 > 1253169817 * Client.anInt10849 + 1098611987
									* Client.anInt10809) {
								i_15_ = 1253169817 * Client.anInt10849 + 1098611987 * Client.anInt10809 - 688089097
										* widget.width;
							}
							if (i_16_ < 220249895 * Client.anInt10808) {
								i_16_ = 220249895 * Client.anInt10808;
							}
							if (i_16_ + 1362321717 * widget.height > 1332547005 * Client.anInt10810 + Client.anInt10808
									* 220249895) {
								i_16_ = 1332547005 * Client.anInt10810 + Client.anInt10808 * 220249895 - 1362321717
										* widget.height;
							}
							if (Client.method17050(widget).method15630(1754788389)) {
								Client.method8796(i_15_, i_16_, widget.width * 688089097, 1362321717 * widget.height);
							}
							if (widget.anInt2481 * -1326442559 != anInt2352 * -721529179) {
								i_12_ = i_15_;
								i_13_ = i_16_;
							}
						}
						if (widget.anInt2481 * -1326442559 == anInt2398 * -687311621) {
							i_14_ = 128;
						}
					}
					int i_17_;
					int i_18_;
					int i_19_;
					int i_20_;
					if (1558474223 * widget.type == 2) {
						i_17_ = i_2_;
						i_18_ = i_3_;
						i_19_ = i_4_;
						i_20_ = i_5_;
					} else {
						int i_21_ = i_12_ + 688089097 * widget.width;
						int i_22_ = i_13_ + widget.height * 1362321717;
						if (widget.type * 1558474223 == 9) {
							i_21_++;
							i_22_++;
						}
						i_17_ = i_12_ > i_2_ ? i_12_ : i_2_;
						i_18_ = i_13_ > i_3_ ? i_13_ : i_3_;
						i_19_ = i_21_ < i_4_ ? i_21_ : i_4_;
						i_20_ = i_22_ < i_5_ ? i_22_ : i_5_;
					}
					if (i_17_ < i_19_ && i_18_ < i_20_) {
						if (0 != widget.contentType * 1584180271) {
							if (anInt2354 * 1217733147 == 1584180271 * widget.contentType
									|| 1584180271 * widget.contentType == anInt2355 * -1388209991) {
								if (Client.aBool10799) {
									Class60.activeToolkit.method2456();
									Class252.method4718(i_12_, i_13_, 688089097 * widget.width,
											widget.height * 1362321717,
											anInt2355 * -1388209991 == 1584180271 * widget.contentType, -1464786379);
									Class44.method1071(i_11_, i_17_, i_18_, i_19_, i_20_, i_12_, i_13_);
									Class60.activeToolkit.method2494();
									Class60.activeToolkit.method2760(i_2_, i_3_, i_4_, i_5_);
									Client.aBoolArray10850[i_11_] = true;
								}
								continue;
							}
							if (anInt2356 * -1563899471 == widget.contentType * 1584180271
									&& Client.cutsceneStage * 2087248539 == 3) {
								if (5 != widget.type * 1558474223 || widget.method4298(Class60.activeToolkit) != null) {
									Class622.method10436(Class60.activeToolkit, widget, i_12_, i_13_, (byte) 79);
									Class60.activeToolkit.method2760(i_2_, i_3_, i_4_, i_5_);
								}
								continue;
							}
							if (1584180271 * widget.contentType == anInt2369 * 1024467871) {
								Class458.method7545(Class60.activeToolkit, i_12_, i_13_, widget, (byte) -84);
								continue;
							}
							if (219388263 * anInt2514 == widget.contentType * 1584180271) {
								Class296_Sub3_Sub1.method17523(Class60.activeToolkit, i_12_, i_13_, widget,
										widget.colour * 923665021 % 64, (byte) 0);
								continue;
							}
							if (widget.contentType * 1584180271 == anInt2413 * -1997453031) {
								if (widget.method4298(Class60.activeToolkit) != null) {
									Class60.activeToolkit.method2456();
									Widget.method2287(widget, i_12_, i_13_, (short) 8192);
									Class60.activeToolkit.method2760(i_2_, i_3_, i_4_, i_5_);
								}
								continue;
							}
							if (1584180271 * widget.contentType == anInt2537 * 1655048567) {
								Class522.method8954(Class60.activeToolkit, i_12_, i_13_, widget.width * 688089097,
										widget.height * 1362321717, -63976445);
								Client.aBoolArray10850[i_11_] = true;
								Class60.activeToolkit.method2760(i_2_, i_3_, i_4_, i_5_);
								continue;
							}
							if (1073954765 * anInt2457 == 1584180271 * widget.contentType) {
								Class452.method7410(Class60.activeToolkit, i_12_, i_13_, widget.width * 688089097,
										widget.height * 1362321717, 2036939663);
								Client.aBoolArray10850[i_11_] = true;
								Class60.activeToolkit.method2760(i_2_, i_3_, i_4_, i_5_);
								continue;
							}
							if (-433861965 * anInt2360 == widget.contentType * 1584180271) {
								if (Client.displayFps || Client.aBool10693) {
									ShaderMetaBuffer.method4369(i_12_, i_13_, widget, (byte) -23);
									Client.aBoolArray10850[i_11_] = true;
								}
								continue;
							}
							if (anInt2365 * 1022755101 == 1584180271 * widget.contentType) {
								Sprite class116 = FontSpecification.method641();
								if (null != class116) {
									int i_23_ = i_4_ - i_2_;
									int i_24_ = i_5_ - i_3_;
									float f = (float) i_23_ / (float) i_24_;
									float f_25_ = (float) class116.method2157() / (float) class116.method2119();
									int i_26_;
									int i_27_;
									if (f < f_25_) {
										i_26_ = i_23_;
										i_27_ = (int) (i_23_ / f_25_);
									} else {
										i_26_ = (int) (i_24_ * f_25_);
										i_27_ = i_24_;
									}
									int i_28_ = (i_23_ - i_26_) / 2 + i_2_;
									int i_29_ = (i_24_ - i_27_) / 2 + i_3_;
									class116.method2145(i_28_, i_29_, i_26_, i_27_);
								}
								continue;
							}
							if (anInt2509 * -994128605 == widget.contentType * 1584180271) {
								if (TwitchTV.isStreaming() && Class410.method6951()) {
									Class600_Sub1_Sub3_Sub3.method18082(i_2_, i_3_, i_4_, i_5_);
								}
								continue;
							}
						}
						if (widget.type * 1558474223 == 0) {
							if (829737401 * anInt2362 == 1584180271 * widget.contentType) {
								Class60.activeToolkit.method2456();
								Client.aClass460_10760.method7690().method9727(Client.aClass460_10760);
								Class60.activeToolkit.method2730(i_12_, i_13_, Engine.screenWidth * 1319181337,
										Engine.screenHeight * -551672947);
							}
							method587(widgets, widget.id * 1857819631, i_17_, i_18_, i_19_, i_20_, i_12_
									- widget.anInt2382 * -1909412215, i_13_ - widget.scrollPosition * -1881455913,
									i_11_, bool);
							if (widget.aClass226Array2521 != null) {
								method587(widget.aClass226Array2521, 1857819631 * widget.id, i_17_, i_18_, i_19_,
										i_20_, i_12_ - widget.anInt2382 * -1909412215, i_13_ - widget.scrollPosition
												* -1881455913, i_11_, bool);
							}
							Class480_Sub41 class480_sub41 = (Class480_Sub41) Client.aClass667_10791
									.get(widget.id * 1857819631);
							if (class480_sub41 != null) {
								Class449.method7389(1021060255 * class480_sub41.anInt10372, i_17_, i_18_, i_19_, i_20_,
										i_12_ - widget.anInt2382 * -1909412215, i_13_ - -1881455913
												* widget.scrollPosition, i_11_);
							}
							if (1584180271 * widget.contentType == anInt2362 * 829737401) {
								if (Class60.activeToolkit.method2678()) {
									Class60.activeToolkit.method2487(widget.width * 688089097,
											widget.height * 1362321717);
									if (16 == -1501875989 * Client.gameState) {
										Class296_Sub1.method15196(i_12_, i_13_, 688089097 * widget.width,
												1362321717 * widget.height);
									}
								}
								if (1 == Client.cutsceneStage * 2087248539) {
									int i_30_ = Client.anInt10684 * -1926091511;
									int i_31_ = -319380787 * Client.anInt10685;
									int i_32_ = Client.anInt10774 * -199882515;
									int i_33_ = Client.anInt10689 * 1775409077;
									if (Client.tick < 1779708161 * Client.anInt10700) {
										float f = 1.0F * (Client.tick - 513337573 * Client.anInt10872)
												/ (1779708161 * Client.anInt10700 - 513337573 * Client.anInt10872);
										i_30_ = (int) (-521512767 * BaseVarpDefinitionLoader.anInt1130 * (1.0F - f) + f
												* (Client.anInt10684 * -1926091511));
										i_31_ = (int) (BufferedConnectionContext.anInt1211 * -1551903347 * (1.0F - f) + f
												* (Client.anInt10685 * -319380787));
										i_32_ = (int) (-1099881767 * Class166_Sub21.anInt546 * (1.0F - f) + -199882515
												* Client.anInt10774 * f);
										i_33_ = (int) (Client.anInt10689 * 1775409077 * f + 1532721931
												* Class338.anInt3624 * (1.0F - f));
									}
									if (i_30_ > 0) {
										Class60.activeToolkit.method2805(i_17_, i_18_, i_19_ - i_17_, i_20_ - i_18_,
												i_30_ << 24 | i_31_ << 16 | i_32_ << 8 | i_33_);
									}
								}
							}
							Class60.activeToolkit.method2760(i_2_, i_3_, i_4_, i_5_);
						}
						if (Client.aBoolArray10851[i_11_] || 2114392935 * Client.anInt10853 > 1) {
							if (widget.type * 1558474223 == 3) {
								if (i_14_ == 0) {
									if (widget.aBool2405) {
										Class60.activeToolkit.method2434(i_12_, i_13_, widget.width * 688089097,
												widget.height * 1362321717, ~0xffffff | widget.colour * 923665021, 0);
									} else {
										Class60.activeToolkit.method2625(i_12_, i_13_, 688089097 * widget.width,
												widget.height * 1362321717, ~0xffffff | 923665021 * widget.colour, 0);
									}
								} else if (widget.aBool2405) {
									Class60.activeToolkit.method2434(i_12_, i_13_, 688089097 * widget.width,
											widget.height * 1362321717, 255 - (i_14_ & 0xff) << 24 | 923665021
													* widget.colour & 0xffffff, 1);
								} else {
									Class60.activeToolkit.method2625(i_12_, i_13_, 688089097 * widget.width,
											widget.height * 1362321717, 255 - (i_14_ & 0xff) << 24 | widget.colour
													* 923665021 & 0xffffff, 1);
								}
							} else if (widget.type * 1558474223 == 4) {
								int i_34_ = 255 - (i_14_ & 0xff);
								if (0 != i_34_) {
									Font class132 = widget.method4229(Class509.aClass374_6997,
											Client.anInterface47_10645, -1428946199);
									if (null == class132) {
										if (aBool2512) {
											Widget.redraw(widget);
										}
									} else {
										int i_35_ = 923665021 * widget.colour;
										String string = widget.text;
										if (-1 != widget.item * 1391525437) {
											ItemDefinition itemDefinition = ItemDefinition.loader
													.get(1391525437 * widget.item);
											string = itemDefinition.name;
											if (null == string) {
												string = "null";
											}
											if ((1146503759 * itemDefinition.stackable == 1 || widget.itemAmount
													* -1212380503 != 1)
													&& -1 != -1212380503 * widget.itemAmount) {
												string = new StringBuilder()
														.append(Item.getColourHtml(16748608))
														.append(string)
														.append(Class60.CLOSING_COLOUR_TAG)
														.append(" x")
														.append(ReflectiveDefinitionProvider.method13895(-1212380503
																* widget.itemAmount, 917829094)).toString();
											}
										}
										if (Client.aClass226_10793 == widget) {
											string = TranslatableString.PLEASE_WAIT.translate(Client.currentLanguage);
											i_35_ = 923665021 * widget.colour;
										}
										if (Client.aBool10739) {
											Class60.activeToolkit.method2511(i_12_, i_13_, 688089097 * widget.width
													+ i_12_, widget.height * 1362321717 + i_13_);
										}
										i_34_ <<= 24;
										if (widget.aBool2461) {
											class132.method2300(string, i_12_, i_13_, widget.width * 688089097,
													1362321717 * widget.height, i_34_ | i_35_, widget.aBool2520 ? i_34_
															: -1, 747852125 * widget.anInt2546,
													982465999 * widget.anInt2458, Client.aRandom10887,
													Class54.anInt608, Client.anIntArray10854,
													WeakReferenceTable.nameIcons, null, 2146753376);
										} else {
											class132.method2295(string, i_12_, i_13_, 688089097 * widget.width,
													1362321717 * widget.height, i_34_ | i_35_, widget.aBool2520 ? i_34_
															: -1, widget.anInt2546 * 747852125,
													982465999 * widget.anInt2458, widget.anInt2456 * -1873663917,
													266341159 * widget.anInt2374, WeakReferenceTable.nameIcons, null,
													null, 0, 0);
										}
										if (Client.aBool10739) {
											Class60.activeToolkit.method2760(i_2_, i_3_, i_4_, i_5_);
										}
									}
								}
							} else if (5 == 1558474223 * widget.type) {
								if (-2141876157 * widget.anInt2533 >= 0) {
									widget.method4269(SkyboxDefinition.loader, SunDefinition.loader, 2103217409)
											.method8257(Class60.activeToolkit, 0, i_12_, i_13_,
													widget.width * 688089097, widget.height * 1362321717,
													widget.anInt2534 * -107198099 << 3,
													widget.anInt2535 * -23340955 << 3, 0, 0);
								} else {
									Sprite sprite;
									if (-1 != 1391525437 * widget.item) {
										PlayerAppearance appearance = widget.aBool2532 ? Client.localPlayer.appearance
												: null;
										sprite = ItemDefinition.loader.getCachedSprite(Class60.activeToolkit,
												widget.item * 1391525437, -1212380503 * widget.itemAmount,
												widget.anInt2432 * 972044571, ~0xffffff | widget.anInt2425
														* -1694773323, 1276796321 * widget.anInt2435, appearance);
									} else if (-1863708489 * widget.anInt2396 != -1) {
										sprite = (Sprite) Client.aClass168_10778.get(widget.anInt2396 * -1863708489);
										if (sprite == null
												&& !Client.aMap10908.containsKey(Integer.valueOf(widget.anInt2396
														* -1863708489))) {
											try {
												Client.aMap10908
														.put(Integer.valueOf(widget.anInt2396 * -1863708489),
																IsaacCipher.aClass52_8356.submit(new URL(
																		new StringBuilder().append(Client.aString10759)
																				.append("/img/image_")
																				.append(widget.anInt2396 * -1863708489)
																				.append(".png?a=")
																				.append(TimeUtil.time()).toString())));
											} catch (MalformedURLException malformedurlexception) {
												HitsplatDefinitionProvider.reportError(null, malformedurlexception);
											}
										}
									} else {
										sprite = widget.method4231(Class60.activeToolkit, -275272222);
									}
									if (sprite != null) {
										int i_36_ = sprite.scaleWidth();
										int i_37_ = sprite.scaleHeight();
										int i_38_ = 255 - (i_14_ & 0xff);
										if (i_38_ != 0) {
											int i_39_;
											if (923665021 * widget.colour == -1) {
												i_39_ = 16777215;
											} else {
												i_39_ = widget.colour * 923665021 & 0xffffff;
												if (0 == i_39_) {
													i_39_ = 16777215;
												}
											}
											i_39_ |= i_38_ << 24;
											boolean bool_40_ = i_39_ != -1;
											if (widget.aBool2475) {
												Class60.activeToolkit.method2511(i_12_, i_13_, i_12_ + 688089097
														* widget.width, i_13_ + 1362321717 * widget.height);
												if (widget.anInt2391 * -1168337917 != 0) {
													int i_41_ = (widget.width * 688089097 + i_36_ - 1) / i_36_;
													int i_42_ = (widget.height * 1362321717 + i_37_ - 1) / i_37_;
													for (int i_43_ = 0; i_43_ < i_41_; i_43_++) {
														for (int i_44_ = 0; i_44_ < i_42_; i_44_++) {
															if (bool_40_) {
																sprite.method2080(i_12_ + i_36_ * i_43_ + i_36_ / 2.0F,
																		i_37_ / 2.0F + (i_13_ + i_37_ * i_44_), 4096,
																		-1168337917 * widget.anInt2391, 0, i_39_, 1);
															} else {
																sprite.method2091(i_36_ * i_43_ + i_12_ + i_36_ / 2.0F,
																		i_13_ + i_44_ * i_37_ + i_37_ / 2.0F, 4096,
																		-1168337917 * widget.anInt2391);
															}
														}
													}
												} else if (bool_40_) {
													sprite.method2085(i_12_, i_13_, widget.width * 688089097,
															widget.height * 1362321717, 0, i_39_, 1);
												} else {
													sprite.method2084(i_12_, i_13_, widget.width * 688089097,
															widget.height * 1362321717);
												}
												Class60.activeToolkit.method2760(i_2_, i_3_, i_4_, i_5_);
											} else if (bool_40_) {
												if (0 != -1168337917 * widget.anInt2391) {
													sprite.method2080(688089097 * widget.width / 2.0F + i_12_,
															1362321717 * widget.height / 2.0F + i_13_, widget.width
																	* 914395136 / i_36_,
															-1168337917 * widget.anInt2391, 0, i_39_, 1);
												} else if (688089097 * widget.width != i_36_
														|| widget.height * 1362321717 != i_37_) {
													sprite.method2082(i_12_, i_13_, widget.width * 688089097,
															widget.height * 1362321717, 0, i_39_, 1);
												} else {
													sprite.method2142(i_12_, i_13_, 0, i_39_, 1);
												}
											} else if (widget.anInt2391 * -1168337917 != 0) {
												sprite.method2130(688089097 * widget.width / 2.0F + i_12_,
														widget.height * 1362321717 / 2.0F + i_13_, i_36_ / 2.0F,
														i_37_ / 2.0F, widget.width * 914395136 / i_36_, 907235328
																* widget.height / i_37_,
														widget.anInt2391 * -1168337917, 1, -1, 1);
											} else if (688089097 * widget.width != i_36_
													|| 1362321717 * widget.height != i_37_) {
												sprite.method2145(i_12_, i_13_, 688089097 * widget.width,
														widget.height * 1362321717);
											} else {
												sprite.method2079(i_12_, i_13_);
											}
										}
									} else if (aBool2512) {
										Widget.redraw(widget);
									}
								}
							} else if (6 == 1558474223 * widget.type) {
								Class60.activeToolkit.method2456();
								Model class143 = null;
								int i_45_ = 2048;
								if (widget.anInt2412 * 82398819 != 0) {
									i_45_ |= 0x80000;
								}
								int i_46_ = 0;
								if (-1 != widget.item * 1391525437) {
									ItemDefinition itemDefinition = ItemDefinition.loader.get(1391525437 * widget.item);
									if (itemDefinition != null) {
										itemDefinition = itemDefinition.getStack(widget.itemAmount * -1212380503);
										class143 = itemDefinition.method13583(Class60.activeToolkit, i_45_, 1,
												widget.aBool2532 ? Client.localPlayer.appearance : null,
												widget.aClass650_2541, 0, 0, 0, 0);
										if (null != class143) {
											i_46_ = -class143.minimumY() >> 1;
										} else {
											Widget.redraw(widget);
										}
									}
								} else if (widget.anInt2418 * 286135323 == 3) {
									int i_47_ = widget.anInt2486 * -643054127;
									if (i_47_ >= 0 && i_47_ < 2048) {
										Player class600_sub1_sub3_sub1_sub1 = Client.players[i_47_];
										if (null != class600_sub1_sub3_sub1_sub1
												&& (i_47_ == Client.localPlayerIndex * -406165969 || Queue
														.method13192(class600_sub1_sub3_sub1_sub1.accountName) == widget.anInt2420 * 405633305)) {
											class143 = widget.method4232(Class60.activeToolkit, i_45_,
													ProxyingVariableLoader.aClass678_Sub6_3003,
													IdentikitDefinition.loader, NpcDefinition.loader,
													ItemDefinition.loader, AnimationDefinition.loader,
													PlayerVariableProvider.instance, PlayerVariableProvider.instance,
													widget.aClass650_2541, class600_sub1_sub3_sub1_sub1.appearance,
													(byte) 13);
											if (class143 == null && aBool2512) {
												Widget.redraw(widget);
											}
										}
									}
								} else if (5 == 286135323 * widget.anInt2418) {
									int i_48_ = widget.anInt2486 * -643054127;
									Player class600_sub1_sub3_sub1_sub1 = null;
									if (i_48_ >= 0 && i_48_ < 2048) {
										class600_sub1_sub3_sub1_sub1 = Client.players[i_48_];
									} else if (i_48_ == -1) {
										class600_sub1_sub3_sub1_sub1 = Client.localPlayer;
									} else if (i_48_ == 387935885 * HashTableIterator.aClass600_Sub1_Sub3_Sub1_Sub1_8361.index) {
										class600_sub1_sub3_sub1_sub1 = HashTableIterator.aClass600_Sub1_Sub3_Sub1_Sub1_8361;
									}
									if (class600_sub1_sub3_sub1_sub1 != null
											&& null != class600_sub1_sub3_sub1_sub1.appearance
											&& (i_48_ == -1 || i_48_ == -2
													|| i_48_ == -406165969 * Client.localPlayerIndex || Queue
													.method13192(class600_sub1_sub3_sub1_sub1.accountName) == 405633305 * widget.anInt2420)) {
										class143 = class600_sub1_sub3_sub1_sub1.appearance.method9773(
												Class60.activeToolkit, i_45_,
												ProxyingVariableLoader.aClass678_Sub6_3003, IdentikitDefinition.loader,
												NpcDefinition.loader, ItemDefinition.loader,
												PlayerVariableProvider.instance, PlayerVariableProvider.instance,
												widget.aClass650_2541, null, null, null, 0, true,
												EquipmentDefaults.defaults);
									}
								} else if (widget.anInt2418 * 286135323 == 8 || widget.anInt2418 * 286135323 == 9) {
									Class480_Sub1 class480_sub1 = Class606.method10252(-643054127 * widget.anInt2486,
											false);
									if (class480_sub1 != null) {
										class143 = class480_sub1.method15450(Class60.activeToolkit, i_45_,
												widget.aClass650_2541, widget.anInt2420 * 405633305,
												9 == 286135323 * widget.anInt2418,
												widget.aBool2532 ? Client.localPlayer.appearance : null);
									}
								} else if (widget.aClass650_2541 == null || !widget.aClass650_2541.hasAnimation()) {
									class143 = widget.method4232(Class60.activeToolkit, i_45_,
											ProxyingVariableLoader.aClass678_Sub6_3003, IdentikitDefinition.loader,
											NpcDefinition.loader, ItemDefinition.loader, AnimationDefinition.loader,
											PlayerVariableProvider.instance, PlayerVariableProvider.instance, null,
											Client.localPlayer.appearance, (byte) 13);
									if (class143 == null && aBool2512) {
										Widget.redraw(widget);
									}
								} else {
									class143 = widget.method4232(Class60.activeToolkit, i_45_,
											ProxyingVariableLoader.aClass678_Sub6_3003, IdentikitDefinition.loader,
											NpcDefinition.loader, ItemDefinition.loader, AnimationDefinition.loader,
											PlayerVariableProvider.instance, PlayerVariableProvider.instance,
											widget.aClass650_2541, Client.localPlayer.appearance, (byte) 13);
									if (class143 == null && aBool2512) {
										Widget.redraw(widget);
									}
								}
								if (null != class143) {
									if (82398819 * widget.anInt2412 != 0) {
										class143.method2937(-782603395 * widget.anInt2540, -1899239005
												* widget.anInt2555, 822564919 * widget.anInt2442,
												82398819 * widget.anInt2412);
									}
									int i_49_;
									if (459297459 * widget.anInt2431 > 0) {
										i_49_ = (widget.width * 688089097 << 9) / (widget.anInt2431 * 459297459);
									} else {
										i_49_ = 512;
									}
									int i_50_;
									if (widget.anInt2551 * 557360821 > 0) {
										i_50_ = (widget.height * 1362321717 << 9) / (widget.anInt2551 * 557360821);
									} else {
										i_50_ = 512;
									}
									int i_51_ = i_12_ + 688089097 * widget.width / 2;
									int i_52_ = 1362321717 * widget.height / 2 + i_13_;
									if (!widget.aBool2511) {
										i_51_ += i_49_ * 2029250227 * widget.anInt2554 >> 9;
										i_52_ += widget.anInt2428 * 202477057 * i_50_ >> 9;
									}
									Client.aClass405_10612.method6730();
									Class60.activeToolkit.method2471(Client.aClass405_10612);
									Matrix4f class399 = Class60.activeToolkit.method2462();
									int i_53_ = Client.aClass460_10760.method7685();
									int i_54_ = Client.aClass460_10760.method7686();
									i_54_ += widget.spriteScale * 1331228877;
									if (widget.aBool2423) {
										if (Connection.anInt7170 * 1212513917 == 3) {
											if (widget.aBool2511) {
												class399.method6560(i_51_, i_52_, i_49_, i_50_,
														Class369.aClass261_Sub1_4079.method4829(2083608683),
														Class369.aClass261_Sub1_4079.method4852(-1117167181),
														Engine.screenWidth * 1319181337, -551672947
																* Engine.screenHeight, 1331228877 * widget.spriteScale);
											} else {
												class399.method6560(i_51_, i_52_, i_49_, i_50_,
														Class369.aClass261_Sub1_4079.method4829(1924893158),
														Class369.aClass261_Sub1_4079.method4852(2049800142),
														1319181337 * Engine.screenWidth, Engine.screenHeight
																* -551672947, widget.spriteScale * 1331228877 << 2);
											}
										} else if (widget.aBool2511) {
											class399.method6560(i_51_, i_52_, i_49_, i_50_, i_53_, i_54_,
													Engine.screenWidth * 1319181337, -551672947 * Engine.screenHeight,
													widget.spriteScale * 1331228877);
										} else {
											class399.method6560(i_51_, i_52_, i_49_, i_50_, i_53_, i_54_,
													1319181337 * Engine.screenWidth, Engine.screenHeight * -551672947,
													widget.spriteScale * 1331228877 << 2);
										}
									} else if (Connection.anInt7170 * 1212513917 == 3) {
										class399.method6559(i_51_, i_52_, i_49_, i_50_,
												Class369.aClass261_Sub1_4079.method4829(1987880513),
												Class369.aClass261_Sub1_4079.method4852(-481187663),
												1319181337 * Engine.screenWidth, Engine.screenHeight * -551672947);
									} else {
										class399.method6559(i_51_, i_52_, i_49_, i_50_, i_53_, i_54_,
												Engine.screenWidth * 1319181337, -551672947 * Engine.screenHeight);
									}
									Class60.activeToolkit.method2540(class399);
									Class60.activeToolkit.method2426(2, 0);
									if (widget.aBool2434) {
										Class60.activeToolkit.method2473(false);
									}
									if (widget.aBool2511) {
										Client.aClass405_10715.method6758(1.0F, 0.0F, 0.0F,
												Class373.method6114(widget.spritePitch * -322294683));
										Client.aClass405_10715.method6739(0.0F, 1.0F, 0.0F,
												Class373.method6114(-1831978227 * widget.spriteRoll));
										Client.aClass405_10715.method6739(0.0F, 0.0F, 1.0F,
												Class373.method6114(1151952653 * widget.spriteYaw));
										Client.aClass405_10715.method6744(2029250227 * widget.anInt2554,
												202477057 * widget.anInt2428, widget.anInt2429 * 1656592175);
									} else {
										int i_55_ = Class373.SINE[-322294683 * widget.spritePitch << 3]
												* (1331228877 * widget.spriteScale << 2) >> 14;
										int i_56_ = Class373.COSINE[-322294683 * widget.spritePitch << 3]
												* (1331228877 * widget.spriteScale << 2) >> 14;
										Client.aClass405_10715.method6758(0.0F, 0.0F, 1.0F,
												Class373.method6114(-(widget.spriteYaw * 1151952653) << 3));
										Client.aClass405_10715.method6739(0.0F, 1.0F, 0.0F,
												Class373.method6114(-1831978227 * widget.spriteRoll << 3));
										Client.aClass405_10715.method6744(widget.spriteOffsetX * 2134977475 << 2, i_55_
												+ (2141391961 * widget.spriteOffsetY << 2) + i_46_,
												(widget.spriteOffsetY * 2141391961 << 2) + i_56_);
										Client.aClass405_10715.method6739(1.0F, 0.0F, 0.0F,
												Class373.method6114(-322294683 * widget.spritePitch << 3));
									}
									widget.method4247(Class60.activeToolkit, class143, Client.aClass405_10715,
											Client.tick, 1359565111);
									Class60.activeToolkit.method2494();
									Class60.activeToolkit.method2419(true);
									Class60.activeToolkit.method2760(i_2_, i_3_, i_4_, i_5_);
									if (Client.aBool10739) {
										Class60.activeToolkit.method2511(i_12_, i_13_,
												i_12_ + 688089097 * widget.width, i_13_ + widget.height * 1362321717);
									}
									if (widget.aBool2444) {
										Client.aClass460_10760.method7690().method9711(
												widget.anInt2450 * 2143344029 / 256.0F,
												-902630033 * widget.anInt2421 / 256.0F,
												widget.anInt2449 * -957992483 / 256.0F, -1912219661 * widget.anInt2448,
												widget.anInt2445 * -377437189, -551715477 * widget.anInt2459,
												widget.anInt2349 * 256509351, -2074835423 * widget.anInt2543);
									} else {
										Client.aClass460_10760.method7690().method9718();
									}
									class143.method2917(Client.aClass405_10715, null, 1);
									if (!widget.aBool2423 && null != widget.aClass564_2556) {
										Class60.activeToolkit.method2470(widget.aClass564_2556.method9494());
									}
									if (Client.aBool10739) {
										Class60.activeToolkit.method2760(i_2_, i_3_, i_4_, i_5_);
									}
									Class60.activeToolkit.method2419(false);
									Class60.activeToolkit.method2421();
									Class60.activeToolkit.method2760(i_2_, i_3_, i_4_, i_5_);
									if (widget.aBool2444) {
										Client.aClass460_10760.method7690().method9718();
									}
									if (widget.aBool2434) {
										Class60.activeToolkit.method2473(true);
									}
								}
							} else if (9 == widget.type * 1558474223) {
								int i_57_;
								int i_58_;
								int i_59_;
								int i_60_;
								if (widget.aBool2539) {
									i_57_ = i_12_;
									i_58_ = i_13_ + widget.height * 1362321717;
									i_59_ = i_12_ + 688089097 * widget.width;
									i_60_ = i_13_;
								} else {
									i_57_ = i_12_;
									i_58_ = i_13_;
									i_59_ = i_12_ + widget.width * 688089097;
									i_60_ = 1362321717 * widget.height + i_13_;
								}
								if (1 == widget.anInt2407 * -794611863) {
									Class60.activeToolkit.method2783(i_57_, i_58_, i_59_, i_60_, ~0xffffff
											| widget.colour * 923665021, 0);
								} else {
									Class60.activeToolkit.method2748(i_57_, i_58_, i_59_, i_60_, ~0xffffff | 923665021
											* widget.colour, -794611863 * widget.anInt2407, 0);
								}
							}
						}
					}
				}
			}
		}
	}
}
