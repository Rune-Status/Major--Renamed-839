package com.jagex;

public class Class298_Sub1 extends Class298 {
	static long aLong9722;

	static void method15207(int i) {
		Class38.anInt539 = 1132525655 * i;
		synchronized (Class38.aClass168_538) {
			Class38.aClass168_538.clear();
		}
	}

	Class249 normal;
	Class480_Sub13_Sub1 sampler;
	Program program;

	public Class298_Sub1(NativeToolkit toolkit) throws ProgramException {
		super(toolkit);
		load();
	}

	@Override
	public void method5444() {
		program.method4522();
		program.method4466(sampler, 0, texture);
	}

	boolean load() throws ProgramException {
		program = toolkit.loadProgram("BatchedSprite");
		sampler = program.method4521("SpriteSampler");
		normal = program.method4447("Normal");
		program.method4464(normal);
		return true;
	}

}