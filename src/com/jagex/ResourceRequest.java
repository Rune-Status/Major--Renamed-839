package com.jagex;

public abstract class ResourceRequest extends Cacheable {
	volatile boolean waiting = true;
	boolean old;
	boolean highPriority;

	ResourceRequest() {

	}

	abstract int complete();

	abstract byte[] getData();
}
