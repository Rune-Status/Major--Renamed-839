package com.jagex;

public abstract class ResourceProvider {
	static String[] cacheDirectories;
	public static Archive npcs;

	abstract byte[] get(int file);

	abstract void request(int i);

	abstract ReferenceTable getTable();

	abstract int percentComplete(int file);

}