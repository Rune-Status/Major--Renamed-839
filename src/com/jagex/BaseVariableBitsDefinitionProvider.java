package com.jagex;

import java.util.Map;

public abstract class BaseVariableBitsDefinitionProvider implements DefinitionProvider<VariableBitsDefinition> {
	static int[] anIntArray3291;
	Map<VarpType, DefinitionLoader<?>> loaders;

	BaseVariableBitsDefinitionProvider(Map map) {
		loaders = map;
	}

}