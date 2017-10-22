package com.jagex;

public class ItemDefinitionProvider extends BaseItemDefinitionProvider {

	ItemDefinitionProvider(GameContext context, Language language, boolean membersServer, Archive models,
			DefinitionLoader cache) {
		super(context, language, membersServer, models, cache);
	}

	@Override
	public Class<ItemDefinition> getClassType() {
		return ItemDefinition.class;
	}

	@Override
	public ItemDefinition provide(int id, DefinitionLoader cache) {
		return new ItemDefinition(id, cache, this);
	}

}