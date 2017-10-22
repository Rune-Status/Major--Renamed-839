package com.jagex;

public interface DefinitionProvider<T extends Definition> {

	Class<T> getClassType();

	T provide(int id, DefinitionLoader<T> cache);

}