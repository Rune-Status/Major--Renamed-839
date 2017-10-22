package com.jagex;

public abstract class BaseAnimationDefinitionProvider implements DefinitionProvider<AnimationDefinition> {
	public static void method3319(int i) {
		QuestDefinitionProvider.anInt2664 = i * -1019943703;
		Widget.aClass168_2372.clear();
	}

	public static boolean method3320(int gameState) {
		return 16 == gameState || 13 == gameState || gameState == 3;
	}

	static final void method3318() {
		int count = -1784886003 * Class80.playerCount;
		int[] indices = Class80.playerIndices;

		for (int index = 0; index < count; index++) {
			Player player = Client.players[indices[index]];
			if (null != player) {
				TranslatableString.method559(player, false);
			}
		}
	}

	ReferenceCache<FrameCollection> cache = new ReferenceCache(100);
	DefinitionLoader loader;

	BaseAnimationDefinitionProvider(DefinitionLoader loader, Archive frames, Archive bases) {
		this.loader = loader;
		FrameCollection.init(frames, bases);
	}

	void clearSoft() {
		synchronized (cache) {
			cache.clearSoft();
		}
	}

	FrameCollection getCollection(int id) {
		FrameCollection collection;
		synchronized (cache) {
			collection = cache.get(id);

			if (collection == null) {
				collection = new FrameCollection(id);
				cache.put(id, collection);
			}

			if (!collection.loaded()) {
				return null;
			}
		}

		return collection;
	}

	void reset() {
		synchronized (cache) {
			cache.clear();
		}
	}

	void sweep(int i) {
		synchronized (cache) {
			cache.sweep(i);
		}
	}

}