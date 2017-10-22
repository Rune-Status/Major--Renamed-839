package com.jagex;

public interface FontProvider<T> {

	T get(byte[] data, FontSpecification specification, boolean bool);

}