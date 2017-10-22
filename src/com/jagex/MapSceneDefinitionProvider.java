package com.jagex;

public class MapSceneDefinitionProvider extends BaseMapSceneDefinitionProvider {

	MapSceneDefinitionProvider(Archive images, int cacheSize) {
		super(images, cacheSize);
	}

	@Override
	public Class<MapSceneDefinition> getClassType() {
		return MapSceneDefinition.class;
	}

	@Override
	public MapSceneDefinition provide(int id, DefinitionLoader loader) {
		return new MapSceneDefinition(id, this);
	}

}