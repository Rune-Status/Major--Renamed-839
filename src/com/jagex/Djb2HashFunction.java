package com.jagex;

final class Djb2HashFunction implements StringHashFunction { // Actually a slightly modified djb2

	@Override
	public long hash(String string) {
		return Class252.hashString(string);
	}

}