package com.jagex;

public abstract class BaseHitsplatDefinitionProvider {
	ReferenceCache cache = new ReferenceCache(20);
	Archive images;

	BaseHitsplatDefinitionProvider(Archive images) {
		this.images = images;
	}

	void clearSoft() {
		synchronized (cache) {
			cache.clearSoft();
		}
	}

	void sweep(int i) {
		synchronized (cache) {
			cache.sweep(i);
		}
	}

	void clear() {
		synchronized (cache) {
			cache.clear();
		}
	}

}