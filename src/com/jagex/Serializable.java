package com.jagex;

public interface Serializable {

	void decode(Buffer buffer);

	void encode(Buffer buffer);

	int encodedSize();

}