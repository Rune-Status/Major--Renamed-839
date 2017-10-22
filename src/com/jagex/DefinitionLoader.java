package com.jagex;

public interface DefinitionLoader<T extends Definition> extends Iterable {

	int count();

	T get(int id);

}