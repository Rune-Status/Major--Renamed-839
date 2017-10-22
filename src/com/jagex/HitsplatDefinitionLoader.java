package com.jagex;

public class HitsplatDefinitionLoader extends CachedDefinitionLoader<HitsplatDefinition> {
	public static byte aByte10553;

	public HitsplatDefinitionLoader(GameContext context, Language language, Archive config, Archive images) {
		super(context, language, config, ConfigEntry.HITSPLATS, 64, new HitsplatDefinitionProvider(images));
	}

	@Override
	public void reset() {
		super.reset();
		((BaseHitsplatDefinitionProvider) provider).clear();
	}

	@Override
	public void sweep(int age) {
		super.sweep(age);
		((BaseHitsplatDefinitionProvider) provider).sweep(age);
	}

	@Override
	public void clearSoft() {
		super.clearSoft();
		((BaseHitsplatDefinitionProvider) provider).clearSoft();
	}

}