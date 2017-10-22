package com.jagex;

import jaclib.memory.Buffer;

public class NativeOpenGlBuffer {

	Buffer buffer;
	OpenGlToolkit toolkit;

	NativeOpenGlBuffer(OpenGlToolkit toolkit, Buffer buffer) {
		this.toolkit = toolkit;
		this.buffer = buffer;
	}

	NativeOpenGlBuffer(OpenGlToolkit toolkit, byte[] data, int size) {
		this.toolkit = toolkit;
		buffer = toolkit.heap.allocate(size, false);

		if (data != null) {
			buffer.write(data, 0, size, 0);
		}
	}

	void write(byte[] data, int length) {
		if (buffer == null || buffer.size() < length) {
			buffer = toolkit.heap.allocate(length, false);
		}

		buffer.write(data, 0, length, 0);
	}

}