package com.jagex;

public class QuestDefinitionLoader extends UnboundedDefinitionLoader<QuestDefinition> {

	static void method16831(Class640 class640) {
		Class23.aClass640_326 = class640;
	}

	public QuestDefinitionLoader(GameContext context, Language language, Archive config, boolean loadImmediately) {
		super(context, language, ConfigEntry.QUESTS, config, new QuestDefinitionProvider(), loadImmediately);
	}

	@Override
	public int count() {
		return 1323431731 * size;
	}

}