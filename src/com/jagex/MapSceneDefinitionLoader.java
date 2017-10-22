package com.jagex;

public class MapSceneDefinitionLoader extends CachedDefinitionLoader<MapSceneDefinition> {

	public static final int DEFINITION_CACHE_SIZE = 64;
	public static final int SPRITE_CACHE_SIZE = 64;

	public MapSceneDefinitionLoader(GameContext context, Language language, Archive config, Archive images) {
		super(context, language, config, ConfigEntry.MAP_SCENES, DEFINITION_CACHE_SIZE, new MapSceneDefinitionProvider(
				images, SPRITE_CACHE_SIZE));
	}

	@Override
	public void reset() {
		super.reset();
		((BaseMapSceneDefinitionProvider) provider).clear();
	}

	@Override
	public void clearSoft() {
		super.clearSoft();
		((BaseMapSceneDefinitionProvider) provider).clearSoft();
	}

	public void resizeCache(int definitionSize, int spriteSize) {
		super.resize(definitionSize);
		((BaseMapSceneDefinitionProvider) provider).resizeCache(spriteSize);
	}

	@Override
	public void sweep(int age) {
		super.sweep(age);
		((BaseMapSceneDefinitionProvider) provider).sweep(age);
	}

}