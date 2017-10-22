package com.jagex;

public class Class216 implements Interface23 {
	static Sprite otherLevel;

	int anInt2197;
	int anInt2198;

	Class195 this$0;

	Class216(Class195 class195, Buffer buffer) {
		this$0 = class195;
		anInt2197 = buffer.readUShort() * -8986153;
		anInt2198 = buffer.readUByte() * 1311961031;
	}

	@Override
	public void method131(Class192 class192) {
		class192.method3763(anInt2197 * -1281449497, anInt2198 * 1216225783);
		class192.method3806(-1281449497 * anInt2197).method3888();
	}

}