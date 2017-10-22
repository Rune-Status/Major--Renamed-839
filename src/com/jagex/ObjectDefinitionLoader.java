package com.jagex;

public class ObjectDefinitionLoader extends CachedDefinitionLoader<ObjectDefinition> {
	public static final int DEFINITION_CACHE_SIZE = 256;

	public ObjectDefinitionLoader(GameContext context, Language language, boolean bool, Archive objects, Archive models) {
		super(context, language, objects, ConfigEntry.OBJECTS, DEFINITION_CACHE_SIZE, new ObjectDefinitionProvider(
				bool, models, language, context));
	}

	@Override
	public void reset() {
		super.reset();
		((BaseObjectDefinitionProvider) provider).reset();
	}

	@Override
	public void sweep(int age) {
		super.sweep(age);
		((BaseObjectDefinitionProvider) provider).sweep(age);
	}

	@Override
	public void clearSoft() {
		super.clearSoft();
		((BaseObjectDefinitionProvider) provider).clearSoft();
	}

	public void setMembers(boolean members) {
		((BaseObjectDefinitionProvider) provider).setMembers(members);
	}

	public void clear(int i) {
		((BaseObjectDefinitionProvider) provider).clear(i);
	}

}