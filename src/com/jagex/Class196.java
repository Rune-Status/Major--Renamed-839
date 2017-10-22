package com.jagex;

public class Class196 implements Interface23 {
	Class200 aClass200_2086;
	int anInt2087;
	Class195 this$0;

	Class196(Class195 class195, Buffer buffer) {
		this$0 = class195;
		anInt2087 = buffer.readUShort() * 1033577505;
		aClass200_2086 = new Class200(buffer, false, false, class195.anInterface22_2085);
	}

	@Override
	public void method131(Class192 class192) {
		class192.method3830(547184609 * anInt2087, aClass200_2086);
	}

}