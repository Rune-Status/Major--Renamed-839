package com.jagex;

import jaclib.memory.Buffer;

public class NativeOpenGlArrayBuffer extends NativeOpenGlBuffer implements ArrayBuffer {
	int stride;

	NativeOpenGlArrayBuffer(OpenGlToolkit toolkit, int stride, Buffer buffer) {
		super(toolkit, buffer);
		this.stride = stride;
	}

	NativeOpenGlArrayBuffer(OpenGlToolkit toolkit, int stride, byte[] buffer, int length) {
		super(toolkit, buffer, length);
		this.stride = stride;
	}

	@Override
	public int getName() {
		return 0;
	}

	@Override
	public long getAddress() {
		return buffer.getAddress();
	}

	@Override
	public void write(int stride, byte[] buffer, int length) {
		write(buffer, length);
		this.stride = stride;
	}

	@Override
	public int getStride() {
		return stride;
	}

}