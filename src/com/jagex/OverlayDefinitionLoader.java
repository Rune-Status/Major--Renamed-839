package com.jagex;

public class OverlayDefinitionLoader extends CachedDefinitionLoader<OverlayDefinition> {

	public OverlayDefinitionLoader(GameContext context, Language language, Archive config) {
		super(context, language, config, ConfigEntry.OVERLAYS, 64, new ReflectiveDefinitionProvider(
				OverlayDefinition.class));
	}

	@Override
	public OverlayDefinition get(int id) {
		OverlayDefinition overlay = super.get(id);
		if (!overlay.aBool7813) {

		}
		return overlay;
	}

}