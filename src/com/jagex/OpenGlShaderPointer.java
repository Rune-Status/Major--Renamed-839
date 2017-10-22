package com.jagex;

import jaggl.OpenGL;

public class OpenGlShaderPointer {
	static int[] parameters = new int[2];

	private static final int GL_COMPILE_STATUS = 0x8B81;
	private static final int GL_INFO_LOG_LENGTH = 0x8B84;

	static OpenGlShaderPointer create(OpenGlToolkit toolkit, int type, String string) {
		int shader = OpenGL.glCreateShader(type);
		OpenGL.glShaderSource(shader, string);
		OpenGL.glCompileShader(shader);
		OpenGL.glGetShaderiv(shader, GL_COMPILE_STATUS, parameters, 0);

		if (parameters[0] == 0) {
			boolean unsuccessful = false;
			if (parameters[0] == 0) {
				unsuccessful = true;
				System.out.println("");
			}

			OpenGL.glGetShaderiv(shader, GL_INFO_LOG_LENGTH, parameters, 1);
			if (parameters[1] > 1) {
				byte[] log = new byte[parameters[1]];
				OpenGL.glGetShaderInfoLog(shader, parameters[1], parameters, 0, log, 0);
				System.out.println(new String(log));
			}

			if (unsuccessful) {
				OpenGL.glDeleteShader(shader);
				return null;
			}
		}

		return new OpenGlShaderPointer(toolkit, shader);
	}

	OpenGlToolkit toolkit;
	int shader;

	OpenGlShaderPointer(OpenGlToolkit toolkit, int shader) {
		this.toolkit = toolkit;
		this.shader = shader;
	}

	@Override
	public void finalize() throws Throwable {
		toolkit.deleteShader(shader);
		super.finalize();
	}

}