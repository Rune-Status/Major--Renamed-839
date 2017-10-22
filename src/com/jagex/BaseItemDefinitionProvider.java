package com.jagex;

public abstract class BaseItemDefinitionProvider implements DefinitionProvider<ItemDefinition> {

	Archive modelArchive;
	boolean membersServer;
	Language language;
	ReferenceCache<Model> models = new ReferenceCache<Model>(50);
	HashableCache<Sprite> sprites = new HashableCache<Sprite>(250);
	ItemSpriteConfiguration configuration = new ItemSpriteConfiguration();
	DefinitionLoader<ParameterDefinition> cache;
	String[] defaultWidgetActions;
	String[] defaultGroundActions;
	int anInt8371;

	BaseItemDefinitionProvider(GameContext context, Language language, boolean membersServer, Archive models,
			DefinitionLoader<ParameterDefinition> cache) {
		this.language = language;
		this.membersServer = membersServer;
		modelArchive = models;
		this.cache = cache;

		if (context == GameContext.RUNESCAPE) {
			defaultGroundActions = new String[] { null, null, TranslatableString.TAKE.translate(language), null, null,
					TranslatableString.EXAMINE.translate(language) };
		} else {
			defaultGroundActions = new String[] { null, null, TranslatableString.TAKE.translate(language), null, null,
					null };
		}

		defaultWidgetActions = new String[] { null, null, null, null, TranslatableString.DROP.translate(language) };
	}

	Sprite getSprite(Toolkit class134, Toolkit toolkit, int id, int amount, int border, int shadowColour, boolean bool,
			boolean bool2, int textType, Font font, PlayerAppearance appearance, MobDefaults class567,
			DefinitionLoader<ItemDefinition> cache) {
		if (!bool2) {
			Sprite cached = getCachedSprite(toolkit, id, amount, border, shadowColour, textType, appearance);
			if (cached != null) {
				return cached;
			}
		}

		ItemDefinition definition = cache.get(id);
		if (amount > 1 && null != definition.stacks) {
			int stackId = -1;
			for (int index = 0; index < 10; index++) {
				if (amount >= definition.stackAmounts[index] && definition.stackAmounts[index] != 0) {
					stackId = definition.stacks[index];
				}
			}
			if (-1 != stackId) {
				definition = cache.get(stackId);
			}
		}

		int[] image = definition.getSprite(class134, toolkit, amount, border, shadowColour, bool, textType, font,
				appearance, class567);
		if (image == null) {
			return null;
		}

		Sprite sprite;
		if (bool2) {
			sprite = class134.createSprite(image, 0, 36, 36, 32);
		} else {
			sprite = toolkit.createSprite(image, 0, 36, 36, 32);
		}

		if (!bool2) {
			ItemSpriteConfiguration configuration = new ItemSpriteConfiguration();
			configuration.toolkit = toolkit.id * 1231905271;
			configuration.id = id * 2052615147;
			configuration.amount = amount * 1543629327;
			configuration.borderSize = border * 27745307;
			configuration.shadowColour = -1097238463 * shadowColour;
			configuration.textType = 1831674925 * textType;
			configuration.useAppearance = appearance != null;
			sprites.put(sprite, configuration);
		}

		return sprite;
	}

	void clearModels(int i) {
		anInt8371 = i * 1260125509;
		synchronized (models) {
			models.clear();
		}
	}

	void clear() {
		synchronized (models) {
			models.clear();
		}
		synchronized (sprites) {
			sprites.clear();
		}
	}

	void clearSprites() {
		synchronized (sprites) {
			sprites.clear();
		}
	}

	void setMembersServer(boolean members) {
		if (members != membersServer) {
			membersServer = members;
			clear();
		}
	}

	void sweep(int maximumAge) {
		synchronized (models) {
			models.sweep(maximumAge);
		}
		synchronized (sprites) {
			sprites.sweep(maximumAge);
		}
	}

	void clearSoft() {
		synchronized (models) {
			models.clearSoft();
		}
		synchronized (sprites) {
			sprites.clearSoft();
		}
	}

	Sprite getCachedSprite(Toolkit toolkit, int id, int amount, int borderSize, int shadowColour, int textType,
			PlayerAppearance appearance) {
		configuration.toolkit = toolkit.id * 1231905271;
		configuration.id = id * 2052615147;
		configuration.amount = amount * 1543629327;
		configuration.borderSize = borderSize * 27745307;
		configuration.shadowColour = shadowColour * -1097238463;
		configuration.textType = textType * 1831674925;
		configuration.useAppearance = appearance != null;

		return sprites.get(configuration);
	}

}