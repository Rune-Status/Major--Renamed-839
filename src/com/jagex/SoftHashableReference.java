package com.jagex;

import java.lang.ref.SoftReference;

public class SoftHashableReference extends HashableReference {

	SoftReference reference;

	SoftHashableReference(Hashable hashable, int size, Object object) {
		super(hashable, size);
		reference = new SoftReference(object);
	}

	@Override
	Object get() {
		return reference.get();
	}

	@Override
	boolean isSoft() {
		return true;
	}

}