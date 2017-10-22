package com.jagex;

public class CursorDefinitionProvider extends BaseCursorDefinitionProvider implements DefinitionProvider {
	CursorDefinitionProvider(Archive sprites) {
		super(sprites);
	}

	@Override
	public Class getClassType() {
		return CursorDefinition.class;
	}

	@Override
	public Definition provide(int id, DefinitionLoader loader) {
		return new CursorDefinition(id, this);
	}

}