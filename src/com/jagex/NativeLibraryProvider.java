package com.jagex;

public interface NativeLibraryProvider {

	boolean loaded(String name);

	boolean clear();

	void load(String string) throws NativeLibraryLoadException;

}