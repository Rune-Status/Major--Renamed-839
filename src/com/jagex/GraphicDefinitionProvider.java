package com.jagex;

public class GraphicDefinitionProvider extends BaseGraphicDefinitionProvider {

	GraphicDefinitionProvider(Archive models) {
		super(models);
	}

	@Override
	public Class<GraphicDefinition> getClassType() {
		return GraphicDefinition.class;
	}

	@Override
	public GraphicDefinition provide(int id, DefinitionLoader loader) {
		return new GraphicDefinition(id, this);
	}

}