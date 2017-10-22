package com.jagex;

public abstract class BaseCursorDefinitionProvider {
	static String[] consoleScript;

	static void method9856(ScriptExecutionContext class613, int i) {
		QuestDefinition class234 = QuestDefinition.loader
				.get(class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045]);
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = null == class234.anIntArray2590 ? 0
				: class234.anIntArray2590.length;
	}

	static final void method9857(ScriptExecutionContext class613, int i) {
		int i_1_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = (int) (Class614
				.method10355(i_1_) / 60000L);
	}

	static final void method9860(ScriptExecutionContext class613, int i) {
		class613.anInt7924 -= -2049596966;
		int i_2_ = class613.anIntArray7942[1841827045 * class613.anInt7924];
		int i_3_ = class613.anIntArray7942[class613.anInt7924 * 1841827045 + 1];
		ConnectionInfo.method13843(7, i_2_, i_3_, "");
	}

	ReferenceCache cache = new ReferenceCache(2);
	Archive images;

	BaseCursorDefinitionProvider(Archive sprites) {
		images = sprites;
	}

	void clear() {
		synchronized (cache) {
			cache.clear();
		}
	}

	void sweep(int i) {
		synchronized (cache) {
			cache.sweep(i);
		}
	}

	void clearSoft() {
		synchronized (cache) {
			cache.clearSoft();
		}
	}

}