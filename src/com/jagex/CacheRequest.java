package com.jagex;

public class CacheRequest extends ResourceRequest {
	static final int anInt11680 = 2;
	static final int anInt11682 = 3;
	static final int anInt11685 = 1;
	byte[] data;
	int type;
	ResourceCache cache;

	CacheRequest() {

	}

	@Override
	int complete() {
		if (waiting) {
			return 0;
		}
		return 100;
	}

	@Override
	byte[] getData() {
		if (waiting) {
			throw new RuntimeException();
		}
		return data;
	}
}
