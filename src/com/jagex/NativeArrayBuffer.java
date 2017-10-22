package com.jagex;

public interface NativeArrayBuffer extends Interface31, Deletable {

	boolean reallocate(int length, int stride);

}