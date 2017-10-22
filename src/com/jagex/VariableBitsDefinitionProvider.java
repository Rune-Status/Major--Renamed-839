package com.jagex;

import java.util.Map;

public class VariableBitsDefinitionProvider extends BaseVariableBitsDefinitionProvider {

	static Font aClass132_9779;

	VariableBitsDefinitionProvider(Map map) {
		super(map);
	}

	@Override
	public Class getClassType() {
		return VariableBitsDefinition.class;
	}

	@Override
	public VariableBitsDefinition provide(int id, DefinitionLoader interface7) {
		return new VariableBitsDefinition(id, this);
	}

}