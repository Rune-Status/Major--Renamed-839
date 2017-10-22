package com.jagex;

import jaclib.memory.Buffer;
import jaggl.OpenGL;

public abstract class OpenGlBuffer {
	private static final int GL_STATIC_DRAW = 0x88E4;
	private static final int GL_STREAM_DRAW = 0x88E0;

	private static int[] parameters = new int[1];

	int bufferName;
	boolean deleted = false;
	int length;
	boolean stream;
	int target;
	OpenGlToolkit toolkit;

	OpenGlBuffer(OpenGlToolkit toolkit, int target, Buffer buffer, int length, boolean stream) {
		this.toolkit = toolkit;
		this.target = target;
		this.length = length;
		this.stream = stream;

		OpenGL.glGenBuffersARB(1, parameters, 0);
		bufferName = parameters[0];
		bind();
		OpenGL.glBufferDataARBa(target, length, buffer.getAddress(), stream ? GL_STREAM_DRAW : GL_STATIC_DRAW);
		toolkit.allocatedBufferSize += length;
	}

	OpenGlBuffer(OpenGlToolkit toolkit, int target, byte[] buffer, int length, boolean stream) {
		this.toolkit = toolkit;
		this.target = target;
		this.length = length;
		this.stream = stream;

		OpenGL.glGenBuffersARB(1, parameters, 0);
		bufferName = parameters[0];
		bind();

		OpenGL.glBufferDataARBub(target, length, buffer, 0, stream ? GL_STREAM_DRAW : GL_STATIC_DRAW);
		toolkit.allocatedBufferSize += length;
	}

	@Override
	public void finalize() throws Throwable {
		if (!deleted) {
			toolkit.deleteBuffer(bufferName, length);
			deleted = true;
		}

		super.finalize();
	}

	abstract void bind();

	void write(byte[] buffer, int length) {
		bind();

		if (length > this.length) {
			OpenGL.glBufferDataARBub(target, length, buffer, 0, stream ? GL_STREAM_DRAW : GL_STATIC_DRAW);
			toolkit.allocatedBufferSize += length - this.length;
			this.length = length;
		} else {
			OpenGL.glBufferSubDataARBub(target, 0, length, buffer, 0);
		}
	}

}