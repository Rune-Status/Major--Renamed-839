package com.jagex;

import java.util.Iterator;

class UnboundedDefinitionLoaderIterator<T extends Definition> implements Iterator<T> {
	static Archive widgets;

	int index;
	UnboundedDefinitionLoader<T> loader;

	UnboundedDefinitionLoaderIterator(UnboundedDefinitionLoader<T> loader) {
		this.loader = loader;
	}

	@Override
	public boolean hasNext() {
		return -232777431 * index < loader.definitions.length;
	}

	@Override
	public T next() {
		return (T) loader.definitions[(index += -2022468839) * -232777431 - 1];
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

}