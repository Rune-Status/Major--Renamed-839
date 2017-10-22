package com.jagex;

import java.lang.ref.SoftReference;

public class SoftCacheableReference<T> extends CacheableReference<T> {
	SoftReference<T> reference;

	SoftCacheableReference(T object, int i) {
		super(i);
		reference = new SoftReference<T>(object);
	}

	@Override
	boolean soft() {
		return true;
	}

	@Override
	T get() {
		return reference.get();
	}

}