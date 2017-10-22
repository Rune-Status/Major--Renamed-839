package com.jagex;

public interface ElementArrayBuffer {

	int getName();

	long getAddress();

	void write(byte[] buffer, int length);

}