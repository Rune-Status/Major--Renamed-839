package com.jagex;

public abstract class CacheableReference<T> extends Cacheable {
	int size;

	CacheableReference(int size) {
		this.size = size * 808866141;
	}

	abstract boolean soft();

	abstract T get();
}
