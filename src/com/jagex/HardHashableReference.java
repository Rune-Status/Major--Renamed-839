package com.jagex;

public class HardHashableReference<T> extends HashableReference<T> {

	T object;

	HardHashableReference(Hashable hashable, int size, T object) {
		super(hashable, size);
		this.object = object;
	}

	@Override
	T get() {
		return object;
	}

	@Override
	boolean isSoft() {
		return false;
	}

}