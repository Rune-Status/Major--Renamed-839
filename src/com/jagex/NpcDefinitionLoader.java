package com.jagex;

public class NpcDefinitionLoader extends CachedDefinitionLoader<NpcDefinition> {

	public NpcDefinitionLoader(GameContext context, Language language, boolean bool, Archive npcs, Archive models) {
		super(context, language, npcs, ConfigEntry.aClass37_469, 64, new NpcDefinitionProvider(bool, models, language,
				context));
	}

	@Override
	public void reset() {
		super.reset();
		((BaseNpcDefinitionProvider) provider).clear();
	}

	public void clear(int i) {
		((BaseNpcDefinitionProvider) provider).clear(i);
	}

	@Override
	public void clearSoft() {
		super.clearSoft();
		((BaseNpcDefinitionProvider) provider).clearSoft();
	}

	public void setMembers(boolean members) {
		((BaseNpcDefinitionProvider) provider).setMembers(members);
		super.reset();
	}

	@Override
	public void sweep(int age) {
		super.sweep(age);
		((BaseNpcDefinitionProvider) provider).sweep(age);
	}

}