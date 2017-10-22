package com.jagex;

public interface DefaultMap extends Iterable {

	void clear();

	long getOrDefaultLong(int key);

	void put(int key, int value);

	Object getOrDefaultObject(int key);

	void put(int key, long value);

	void remove(int key);

	void put(int key, Object value);

	int getOrDefaultInt(int key);

}