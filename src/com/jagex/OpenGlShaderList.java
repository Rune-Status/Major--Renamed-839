package com.jagex;

import jaggl.OpenGL;

public class OpenGlShaderList {
	static int[] parameters = new int[2];

	private static final int GL_LINK_STATUS = 0x8B82;
	private static final int GL_INFO_LOG_LENGTH = 0x8B84;

	static OpenGlShaderList create(OpenGlToolkit toolkit, OpenGlShaderPointer... pointers) {
		for (OpenGlShaderPointer pointer : pointers) {
			if (pointer == null || pointer.shader <= 0) {
				return null;
			}
		}

		int program = OpenGL.glCreateProgram();
		for (OpenGlShaderPointer pointer : pointers) {
			OpenGL.glAttachShader(program, pointer.shader);
		}

		OpenGL.glLinkProgram(program);
		OpenGL.glGetProgramiv(program, GL_LINK_STATUS, parameters, 0);

		if (parameters[0] == 0) {
			OpenGL.glGetProgramiv(program, GL_INFO_LOG_LENGTH, parameters, 1);
			if (parameters[1] > 1) {
				byte[] log = new byte[parameters[1]];
				OpenGL.glGetProgramInfoLog(program, parameters[1], parameters, 0, log, 0);
				System.out.println(new String(log));
			}

			if (parameters[0] == 0) {
				for (OpenGlShaderPointer pointer : pointers) {
					OpenGL.glDetachShader(program, pointer.shader);
				}

				OpenGL.glDeleteProgram(program);
				return null;
			}
		}

		return new OpenGlShaderList(toolkit, program, pointers);
	}

	int program;
	OpenGlToolkit toolkit;

	OpenGlShaderList(OpenGlToolkit toolkit, int program, OpenGlShaderPointer[] pointers) {
		this.toolkit = toolkit;
		this.program = program;
	}

	@Override
	public void finalize() throws Throwable {
		toolkit.deleteShader(program);
		super.finalize();
	}

}