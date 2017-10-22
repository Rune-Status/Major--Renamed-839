package com.jagex;

public class HardCacheableReference<T> extends CacheableReference<T> {
	T object;

	HardCacheableReference(T object, int size) {
		super(size);
		this.object = object;
	}

	@Override
	boolean soft() {
		return false;
	}

	@Override
	T get() {
		return object;
	}

}