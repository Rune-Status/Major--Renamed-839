package com.jagex;

public class CutsceneActionType {
	static CutsceneActionType aClass29_349;
	static CutsceneActionType aClass29_350;
	static CutsceneActionType aClass29_351;
	static CutsceneActionType aClass29_352;
	static CutsceneActionType aClass29_353;
	static CutsceneActionType aClass29_354;
	static CutsceneActionType aClass29_355;
	static CutsceneActionType aClass29_357;
	static CutsceneActionType aClass29_358;
	static CutsceneActionType aClass29_359;
	static CutsceneActionType aClass29_360 = new CutsceneActionType(6, 0);
	static CutsceneActionType aClass29_361;
	static CutsceneActionType aClass29_362;
	static CutsceneActionType aClass29_363;
	static CutsceneActionType aClass29_364;
	static CutsceneActionType aClass29_365;
	static CutsceneActionType aClass29_366;
	static CutsceneActionType aClass29_367;
	static CutsceneActionType aClass29_368;
	static CutsceneActionType aClass29_369;
	static CutsceneActionType aClass29_370;
	static CutsceneActionType aClass29_371;
	static CutsceneActionType aClass29_372;
	static CutsceneActionType aClass29_373;
	static CutsceneActionType aClass29_374;
	static CutsceneActionType aClass29_375;
	static CutsceneActionType aClass29_376;
	static CutsceneActionType aClass29_377;
	static CutsceneActionType aClass29_378;
	static CutsceneActionType aClass29_379;
	static CutsceneActionType aClass29_380;
	static {
		aClass29_350 = new CutsceneActionType(0, 1);
		aClass29_351 = new CutsceneActionType(8, 2);
		aClass29_352 = new CutsceneActionType(18, 3);
		aClass29_379 = new CutsceneActionType(27, 10);
		aClass29_357 = new CutsceneActionType(11, 11);
		aClass29_355 = new CutsceneActionType(21, 12);
		aClass29_369 = new CutsceneActionType(25, 13);
		aClass29_380 = new CutsceneActionType(12, 14);
		aClass29_359 = new CutsceneActionType(24, 15);
		aClass29_354 = new CutsceneActionType(1, 16);
		aClass29_358 = new CutsceneActionType(29, 17);
		aClass29_361 = new CutsceneActionType(22, 20);
		aClass29_362 = new CutsceneActionType(17, 21);
		aClass29_363 = new CutsceneActionType(5, 22);
		aClass29_364 = new CutsceneActionType(10, 30);
		aClass29_365 = new CutsceneActionType(2, 31);
		aClass29_366 = new CutsceneActionType(23, 32);
		aClass29_349 = new CutsceneActionType(19, 33);
		aClass29_368 = new CutsceneActionType(16, 40);
		aClass29_370 = new CutsceneActionType(9, 41);
		aClass29_377 = new CutsceneActionType(15, 42);
		aClass29_371 = new CutsceneActionType(4, 43);
		aClass29_372 = new CutsceneActionType(13, 50);
		aClass29_373 = new CutsceneActionType(7, 51);
		aClass29_374 = new CutsceneActionType(3, 52);
		aClass29_375 = new CutsceneActionType(14, 53);
		aClass29_376 = new CutsceneActionType(26, 60);
		aClass29_353 = new CutsceneActionType(30, 61);
		aClass29_378 = new CutsceneActionType(20, 70);
		aClass29_367 = new CutsceneActionType(28, 255);
	}

	public int id;
	int anInt357;

	CutsceneActionType(int i, int i_0_) {
		id = i * -91121015;
		anInt357 = -2023934273 * i_0_;
	}

	static CutsceneActionType[] values() {
		return new CutsceneActionType[] { aClass29_380, aClass29_378, aClass29_371, aClass29_369, aClass29_370,
				aClass29_357, aClass29_372, aClass29_353, aClass29_364, aClass29_377, aClass29_349, aClass29_365,
				aClass29_355, aClass29_352, aClass29_363, aClass29_374, aClass29_367, aClass29_375, aClass29_360,
				aClass29_368, aClass29_354, aClass29_362, aClass29_379, aClass29_373, aClass29_359, aClass29_350,
				aClass29_361, aClass29_358, aClass29_376, aClass29_366, aClass29_351 };
	}

	public static CutsceneActionType valueOf(int id) {
		for (CutsceneActionType class29 : values()) {
			if (1877031231 * class29.anInt357 == id) {
				return class29;
			}
		}

		return null;
	}

}