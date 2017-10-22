package com.jagex;

import java.util.Iterator;

class LruDefinitionCacheIterator<T extends Definition> implements Iterator<T> {
	static int[] anIntArray278;

	static final void method675(ScriptExecutionContext class613) {
		class613.anInt7924 -= -2049596966;
		int i_1_ = class613.anIntArray7942[1841827045 * class613.anInt7924];
		int i_2_ = class613.anIntArray7942[class613.anInt7924 * 1841827045 + 1];
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Widget.method3189(i_1_, i_2_,
				1019608933) ? 1 : 0;
	}

	int previous;
	CachedDefinitionLoader<T> definitions;

	LruDefinitionCacheIterator(CachedDefinitionLoader<T> cache) {
		this.definitions = cache;
	}

	@Override
	public boolean hasNext() {
		return previous * 222362261 < -522945077 * definitions.definitionCount;
	}

	@Override
	public T next() {
		int id = (previous += -1607794499) * 222362261 - 1;
		synchronized (definitions.cache) {
			T definition = definitions.cache.get(id);

			if (definition != null) {
				return definition;
			}
		}

		return definitions.load(id);
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

}