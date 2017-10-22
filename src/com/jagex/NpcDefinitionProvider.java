package com.jagex;

public class NpcDefinitionProvider extends BaseNpcDefinitionProvider {

	NpcDefinitionProvider(boolean membersServer, Archive models, Language language, GameContext context) {
		super(membersServer, models, language, context);
	}

	@Override
	public Class getClassType() {
		return NpcDefinition.class;
	}

	@Override
	public Definition provide(int id, DefinitionLoader cache) {
		return new NpcDefinition(id, this, cache);
	}

}