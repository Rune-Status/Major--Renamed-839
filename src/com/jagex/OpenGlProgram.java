package com.jagex;

import jaggl.OpenGL;

public class OpenGlProgram extends Program {
	int program;
	OpenGlXToolkit toolkit;
	Class249_Sub2 aClass249_Sub2_9649;

	OpenGlProgram(OpenGlXToolkit toolkit, ProgramDefinition class239) {
		super(toolkit, class239);
		this.toolkit = toolkit;
	}

	@Override
	public void finalize() throws Throwable {
		destroy();
		super.finalize();
	}

	@Override
	public void method4443() {

	}

	@Override
	public boolean method4464(Class249 class249) {
		if (aClass249_Sub2_9649 == class249) {
			return true;
		}

		if (!class249.method4648()) {
			return false;
		}

		boolean bool = method4476();
		aClass249_Sub2_9649 = (Class249_Sub2) class249;
		anInt2637 = indexOf(class249) * 99944697;
		if (anInt2637 * -1872152247 == -1) {
			throw new IllegalArgumentException();
		}

		program = aClass249_Sub2_9649.programId;
		if (bool) {
			OpenGL.glUseProgram(program);
			toolkit.aClass249_Sub2_10977 = aClass249_Sub2_9649;
		}

		return true;
	}

	@Override
	public boolean method4476() {
		return toolkit.aClass249_Sub2_10977 == aClass249_Sub2_9649;
	}

	@Override
	public void method4522() {
		if (toolkit.aClass249_Sub2_10977 != aClass249_Sub2_9649) {
			if (aClass249_Sub2_9649 == null) {
				throw new RuntimeException_Sub3();
			}

			OpenGL.glUseProgram(program);
			toolkit.aClass249_Sub2_10977 = aClass249_Sub2_9649;
		}
	}

	@Override
	Class249 method4446(NativeToolkit toolkit, Class246 class246) {
		return new Class249_Sub2((OpenGlXToolkit) toolkit, this, class246);
	}

	@Override
	Class480_Sub13_Sub1 method4472(Class241 class241) {
		return new Class480_Sub13_Sub1_Sub2(this, class241);
	}

	@Override
	void destroy() {
		for (int index = 0; index < method4506(); index++) {
			method4449(index).deleteImmediately();
		}

		super.destroy();
	}

}