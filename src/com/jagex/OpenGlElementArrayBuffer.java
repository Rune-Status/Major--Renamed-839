package com.jagex;

public class OpenGlElementArrayBuffer extends OpenGlBuffer implements ElementArrayBuffer {

	static final int GL_ELEMENT_ARRAY_BUFFER = 0x8893;

	OpenGlElementArrayBuffer(OpenGlToolkit toolkit, byte[] buffer, int length, boolean stream) {
		super(toolkit, GL_ELEMENT_ARRAY_BUFFER, buffer, length, stream);
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
	public void write(byte[] buffer, int length) {
		write(buffer, length);
	}

	@Override
	void bind() {
		toolkit.bindElementArrayBuffer(this);
	}

}