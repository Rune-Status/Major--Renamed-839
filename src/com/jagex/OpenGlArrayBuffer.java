package com.jagex;

import jaclib.memory.Buffer;

public class OpenGlArrayBuffer extends OpenGlBuffer implements ArrayBuffer {

	private static final int GL_ARRAY_BUFFER = 0x8892;

	/**
	 * https://www.opengl.org/sdk/docs/man2/xhtml/glColorPointer.xml
	 */
	int stride;

	OpenGlArrayBuffer(OpenGlToolkit toolkit, int stride, Buffer buffer, int length, boolean stream) {
		super(toolkit, GL_ARRAY_BUFFER, buffer, length, stream);
		this.stride = stride;
	}

	OpenGlArrayBuffer(OpenGlToolkit toolkit, int stride, byte[] buffer, int length, boolean stream) {
		super(toolkit, GL_ARRAY_BUFFER, buffer, length, stream);
		this.stride = stride;
	}

	@Override
	public long getAddress() {
		return 0L;
	}

	@Override
	public int getName() {
		return bufferName;
	}

	@Override
	public int getStride() {
		return stride;
	}

	@Override
	public void write(int stride, byte[] buffer, int length) {
		write(buffer, length);
		this.stride = stride;
	}

	@Override
	void bind() {
		toolkit.bindArrayBuffer(this);
	}

}