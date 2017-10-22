package com.jagex;

public abstract class BaseHitbarDefinitionProvider {

	ReferenceCache<Sprite> sprites = new ReferenceCache<Sprite>(20);
	Archive images;

	BaseHitbarDefinitionProvider(Archive images) {
		this.images = images;
	}

	void reset() {
		synchronized (sprites) {
			sprites.clear();
		}
	}

	void sweep(int i) {
		synchronized (sprites) {
			sprites.sweep(i);
		}
	}

	void clearSoft() {
		synchronized (sprites) {
			sprites.clearSoft();
		}
	}

}