package com.jagex;

public class EnumDefinitionLoader extends CachedDefinitionLoader<EnumDefinition> {

	public EnumDefinitionLoader(GameContext context, Language language, Archive enumerations) {
		super(context, language, enumerations, ConfigEntry.ENUMERATIONS, 128, new ReflectiveDefinitionProvider(
				EnumDefinition.class));
	}

}