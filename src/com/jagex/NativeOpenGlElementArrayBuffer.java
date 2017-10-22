package com.jagex;

public class NativeOpenGlElementArrayBuffer extends NativeOpenGlBuffer implements ElementArrayBuffer {

	NativeOpenGlElementArrayBuffer(OpenGlToolkit toolkit, byte[] buffer, int length) {
		super(toolkit, buffer, length);
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
	public void write(byte[] buffer, int length) {
		write(buffer, length);
	}

}