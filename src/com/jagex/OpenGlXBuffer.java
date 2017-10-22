package com.jagex;

import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;

public abstract class OpenGlXBuffer implements Interface31 {
	static final int anInt5084 = 34962;
	static final int anInt5086 = 34963;
	static int[] parameters = new int[1];
	private static final int GL_STATIC_DRAW = 0x88E4;
	private static final int GL_STREAM_DRAW = 0x88E0;
	private static final int GL_WRITE_ONLY = 0x88B9;
	int allocated;
	NativeHeapBuffer buffer;
	int identifier = -1;
	int length;
	boolean stream;
	int target;
	OpenGlXToolkit toolkit;

	OpenGlXBuffer(OpenGlXToolkit toolkit, int target, boolean stream) {
		this.toolkit = toolkit;
		this.target = target;
		this.stream = stream;
	}

	@Override
	public void finalize() throws Throwable {
		deleteImmediately();
		super.finalize();
	}

	@Override
	public int getLength() {
		return length;
	}

	@Override
	public long lock(int offset, int length) {
		OpenGL.glBindBufferARB(target, identifier);
		return OpenGL.glMapBufferARB(target, GL_WRITE_ONLY) + offset;
	}

	@Override
	public boolean read(int offset, int length, long source) {
		init();

		if (identifier > 0) {
			OpenGL.glBindBufferARB(target, identifier);
			OpenGL.glBufferSubDataARBa(target, offset, length, source);
		} else {
			buffer.heap.copy(buffer.getAddress() + offset, source, length);
		}

		return true;
	}

	@Override
	public final void unmap() {
		OpenGL.glUnmapBufferARB(target);
	}

	void allocate(int length) {
		if (length > allocated) {
			init();

			if (identifier > 0) {
				OpenGL.glBindBufferARB(target, identifier);
				OpenGL.glBufferDataARBub(target, length, null, 0, stream ? GL_STREAM_DRAW : GL_STATIC_DRAW);
				toolkit.anInt9275 += length - allocated;
			} else {
				buffer = toolkit.allocateHeapBuffer(length, false);
			}

			allocated = length;
		}

		this.length = length;
	}

	void bind() {
		if (toolkit.aBool10982) {
			OpenGL.glBindBufferARB(target, identifier);
		}
	}

	void deleteImmediately() {
		if (identifier > 0) {
			toolkit.method17351(identifier, length);
			identifier = -1;
		}
	}

	long getAddress() {
		return identifier == 0 ? buffer.getAddress() : 0;
	}

	void init() {
		if (identifier < 0) {
			if (toolkit.aBool10982) {
				OpenGL.glGenBuffersARB(1, parameters, 0);
				identifier = parameters[0];
				OpenGL.glBindBufferARB(target, identifier);
			} else {
				identifier = 0;
			}
		}
	}

}