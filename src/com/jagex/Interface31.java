package com.jagex;

public interface Interface31 {

	int getLength();

	long lock(int offset, int length);

	boolean read(int offset, int length, long source);

	void unmap();

}