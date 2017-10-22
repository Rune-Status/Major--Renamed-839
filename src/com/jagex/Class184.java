package com.jagex;

public class Class184 implements Interface23 {
	public static VarpDefinitionLoader aClass77_Sub1_Sub1_2006;

	static int method3580(char character, Language language) {
		int i_3_ = character << 4;
		if (Character.isUpperCase(character) || Character.isTitleCase(character)) {
			character = Character.toLowerCase(character);
			i_3_ = 1 + (character << 4);
		}

		if (241 == character && language == Language.SPANISH) {
			i_3_ = 1762;
		}

		return i_3_;
	}

	Class195 this$0;
	int anInt2005;

	Class184(Class195 class195, Buffer buffer) {
		this$0 = class195;
		anInt2005 = buffer.readUShort() * 1075970037;
	}

	@Override
	public void method131(Class192 class192) {
		Class200 class200 = class192.method3806(anInt2005 * -115379107);
		class200.method3888();
		class200.method3930();
		class192.method3777(-115379107 * anInt2005);
	}

}