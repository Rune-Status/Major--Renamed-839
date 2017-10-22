package com.jagex;

public class OpenGlArrayBufferPointer {

	ArrayBuffer buffer;
	byte offset;
	byte size;
	short type;

	OpenGlArrayBufferPointer(ArrayBuffer buffer, int type, int size, int offset) {
		this.buffer = buffer;
		this.type = (short) type;
		this.size = (byte) size;
		this.offset = (byte) offset;
	}

}