package com.jagex;

class SoundEffectsVolumeNormaliser implements VolumeNormaliser {
	public static int anInt1937;

	public static int loadedVitalImageCount(Archive images) {
		int loaded = 0;
		if (images.fileLoaded(Client.hintHeadiconsIndex * -1865373537)) {
			loaded++;
		}
		if (images.fileLoaded(-1197117939 * Client.hintMapmarkersIndex)) {
			loaded++;
		}
		if (images.fileLoaded(-291662025 * Deque.mapflagIndex)) {
			loaded++;
		}
		if (images.fileLoaded(Class179.crossIndex * -1573181517)) {
			loaded++;
		}
		if (images.fileLoaded(Client.mapDotsIndex * -684001105)) {
			loaded++;
		}
		if (images.fileLoaded(-717918803 * Class619.nameIconsIndex)) {
			loaded++;
		}
		if (images.fileLoaded(708757833 * Class572.floorShadowsIndex)) {
			loaded++;
		}
		if (images.fileLoaded(Drawable.compassIndex * 1750930985)) {
			loaded++;
		}
		if (images.fileLoaded(Client.otherLevelIndex * -1841657153)) {
			loaded++;
		}
		if (images.fileLoaded(-298285549 * Client.hintMapEdgeIndex)) {
			loaded++;
		}

		return loaded;
	}

	static void method3468(Toolkit class134, Class480_Sub37 class480_sub37, Class224 class224, int i, int i_12_,
			int i_13_, int i_14_, short i_15_) {
		int i_16_ = i - 5;
		int i_17_ = i_12_ + 2;
		if (305516485 * class224.anInt2308 != 0) {
			class134.method2805(i_16_, i_17_, 10 + i_14_, i_12_ + i_13_ - i_17_ + 1, class224.anInt2308 * 305516485);
		}
		if (0 != class224.anInt2309 * -1701644917) {
			class134.method2747(i_16_, i_17_, i_14_ + 10, 1 + i_13_ + i_12_ - i_17_, -1701644917 * class224.anInt2309);
		}
		int i_18_ = class224.anInt2302 * -1423941133;
		if (class480_sub37.aBool10311 && 809027445 * class224.anInt2304 != -1) {
			i_18_ = 809027445 * class224.anInt2304;
		}
		Class679.aClass132_288.method2294(class224.aString2301, i, i_12_, i_14_, i_13_, ~0xffffff | i_18_, -186637827
				* Class495.aClass560_6827.anInt7539, 1, 0, 0, null, null, null, 0, 0);
	}

	Class186 this$0;

	SoundEffectsVolumeNormaliser(Class186 class186) {
		this$0 = class186;
	}

	@Override
	public float normalise() {
		return Class199.preferences.soundsEffectsVolume.getValue() / 255.0F;
	}

}