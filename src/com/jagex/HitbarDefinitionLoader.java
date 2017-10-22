package com.jagex;

public class HitbarDefinitionLoader extends CachedDefinitionLoader {

	public HitbarDefinitionLoader(GameContext context, Language language, Archive config, Archive images) {
		super(context, language, config, ConfigEntry.HITBARS, 64, new HitbarDefinitionProvider(images));
	}

	@Override
	public void reset() {
		super.reset();
		((BaseHitbarDefinitionProvider) provider).reset();
	}

	@Override
	public void sweep(int i) {
		super.sweep(i);
		((BaseHitbarDefinitionProvider) provider).sweep(i);
	}

	@Override
	public void clearSoft() {
		super.clearSoft();
		((BaseHitbarDefinitionProvider) provider).clearSoft();
	}

}