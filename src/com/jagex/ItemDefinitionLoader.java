package com.jagex;

public class ItemDefinitionLoader extends CachedDefinitionLoader<ItemDefinition> {

	public ItemDefinitionLoader(GameContext context, Language language, boolean membersServer, DefinitionLoader cache,
			Archive items, Archive models) {
		super(context, language, items, ConfigEntry.ITEMS, 64, new ItemDefinitionProvider(context, language,
				membersServer, models, cache));
	}

	@Override
	public void reset() {
		super.reset();
		((BaseItemDefinitionProvider) provider).clear();
	}

	@Override
	public void sweep(int age) {
		super.sweep(age);
		((BaseItemDefinitionProvider) provider).sweep(age);
	}

	@Override
	public void clearSoft() {
		super.clearSoft();
		((BaseItemDefinitionProvider) provider).clearSoft();
	}

	public Sprite getCachedSprite(Toolkit toolkit, int id, int amount, int border, int shadowColour, int textType,
			PlayerAppearance appearance) {
		return ((BaseItemDefinitionProvider) provider).getCachedSprite(toolkit, id, amount, border, shadowColour,
				textType, appearance);
	}

	public void clearModelsCache(int i) {
		((BaseItemDefinitionProvider) provider).clearModels(i);
	}

	public void setMembersServer(boolean members) {
		((BaseItemDefinitionProvider) provider).setMembersServer(members);
		super.reset();
	}

	public Sprite getSprite(Toolkit class134, Toolkit class134_8_, int i, int i_9_, int i_10_, int i_11_, boolean bool,
			boolean bool_12_, int i_13_, Font font, PlayerAppearance appearance, MobDefaults defaults) {
		return ((BaseItemDefinitionProvider) provider).getSprite(class134, class134_8_, i, i_9_, i_10_, i_11_, bool,
				bool_12_, i_13_, font, appearance, defaults, this);
	}

	public void clearSpriteCache() {
		((BaseItemDefinitionProvider) provider).clearSprites();
	}

}