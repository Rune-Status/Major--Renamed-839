package com.jagex;

public class Class678_Sub8 extends CachedDefinitionLoader {
	public static final int DEFINITION_CACHE_SIZE = 128;
	public static final int SPRITE_CACHE_SIZE = 64;

	public Class678_Sub8(GameContext context, Language language, Archive config, Archive images) {
		super(context, language, config, ConfigEntry.WORLD_MAP_INFO, DEFINITION_CACHE_SIZE, new Class222_Sub1(images,
				SPRITE_CACHE_SIZE));
	}

	@Override
	public void reset() {
		super.reset();
		((Class222) provider).cache.clear();
	}

	@Override
	public void sweep(int maximumAge) {
		super.sweep(maximumAge);
		((Class222) provider).cache.sweep(maximumAge);
	}

	@Override
	public void clearSoft() {
		super.clearSoft();
		((Class222) provider).cache.clearSoft();
	}

	public void resizeCaches(int definitionSize, int spriteSize) {
		super.resize(definitionSize);
		((Class222) provider).cache = new ReferenceCache(spriteSize);
	}

}