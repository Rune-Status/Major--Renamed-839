package com.jagex;

import jaggl.OpenGL;

public final class Class480_Sub13_Sub1_Sub2 extends Class480_Sub13_Sub1 {

	int[] anIntArray11741 = null;
	OpenGlProgram program;

	Class480_Sub13_Sub1_Sub2(OpenGlProgram program, Class241 class241) {
		super(class241);
		this.program = program;
	}

	@Override
	public final int method17547(int index) {
		return anIntArray11741[index];
	}

	@Override
	public boolean method17548(int i) {
		if (anIntArray11741 == null) {
			anIntArray11741 = new int[program.method4506()];
		}

		Class249_Sub2 class249_sub2 = (Class249_Sub2) program.method4449(i);
		anIntArray11741[i] = OpenGL.glGetUniformLocation(class249_sub2.programId, getName());
		return anIntArray11741[i] != -1;
	}

	final int method18234() {
		return anIntArray11741[program.method4454()];
	}

}