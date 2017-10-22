package com.jagex;

public class OpenGlXArrayBuffer extends OpenGlXBuffer implements NativeArrayBuffer {
	byte stride;

	private static final int GL_ARRAY_BUFFER = 0x8892;

	OpenGlXArrayBuffer(OpenGlXToolkit toolkit, boolean stream) {
		super(toolkit, GL_ARRAY_BUFFER, stream);
	}

	@Override
	public boolean reallocate(int length, int stride) {
		this.stride = (byte) stride;
		super.allocate(length);
		return true;
	}

	@Override
	public void deleteImmediately() {
		super.deleteImmediately();
	}

	int getStride() {
		return stride;
	}

}