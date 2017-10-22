package com.jagex;

public interface ArrayBuffer {

	long getAddress();

	int getName();

	int getStride();

	void write(int stride, byte[] buffer, int length);

}