package com.jagex;

public class OpenGlXElementArrayBuffer extends OpenGlXBuffer implements NativeElementArrayBuffer {
	Class151 aClass151_9849;

	private static final int GL_ELEMENT_ARRAY_BUFFER = 0x8893;

	OpenGlXElementArrayBuffer(OpenGlXToolkit toolkit, Class151 class151, boolean stream) {
		super(toolkit, GL_ELEMENT_ARRAY_BUFFER, stream);
		aClass151_9849 = class151;
	}

	@Override
	public void allocate(int count) {
		super.allocate(count * aClass151_9849.size * -172886387);
	}

	@Override
	public Class151 method292() {
		return aClass151_9849;
	}

	@Override
	public void deleteImmediately() {
		super.deleteImmediately();
	}

}