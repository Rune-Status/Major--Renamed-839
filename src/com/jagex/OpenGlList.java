package com.jagex;

import jaggl.OpenGL;

public class OpenGlList {
	private static final int GL_COMPILE = 0x1300;

	int first;

	OpenGlList(OpenGlToolkit toolkit, int range) {
		first = OpenGL.glGenLists(range);
	}

	void call(char c) {
		OpenGL.glCallList(first + c);
	}

	void create(int offset) {
		OpenGL.glNewList(first + offset, GL_COMPILE);
	}

	void end() {
		OpenGL.glEndList();
	}

}