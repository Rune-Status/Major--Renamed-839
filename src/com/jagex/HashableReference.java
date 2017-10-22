package com.jagex;

public abstract class HashableReference<T> extends Cacheable {
	int size;
	Hashable key;

	HashableReference(Hashable key, int size) {
		this.key = key;
		this.size = size;
	}

	abstract T get();

	abstract boolean isSoft();

}