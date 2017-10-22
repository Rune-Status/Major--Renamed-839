package com.jagex;

class Class462 implements Interface53 {

	static void method7851(Buffer buffer) {
		int i_1_ = buffer.readUSmart();
		Class367.aClass578Array4049 = new Class578[i_1_];
		for (int i_2_ = 0; i_2_ < i_1_; i_2_++) {
			Class367.aClass578Array4049[i_2_] = new Class578();
			Class367.aClass578Array4049[i_2_].anInt7739 = buffer.readUSmart() * -282312225;
			Class367.aClass578Array4049[i_2_].aString7738 = buffer.readPrefixedString();
		}

		Class80.anInt2578 = buffer.readUSmart() * -836106275;
		Class572.anInt7654 = buffer.readUSmart() * 779472617;
		Class572.anInt7657 = buffer.readUSmart() * 645261151;
		Class289_Sub1.aClass562_Sub1Array9823 = new Class562_Sub1[1 + -397285031 * Class572.anInt7654 - -910063499
				* Class80.anInt2578];

		for (int i_3_ = 0; i_3_ < 704263327 * Class572.anInt7657; i_3_++) {
			int i_4_ = buffer.readUSmart();
			Class562_Sub1 class562_sub1 = Class289_Sub1.aClass562_Sub1Array9823[i_4_] = new Class562_Sub1();
			class562_sub1.anInt7555 = buffer.readUByte() * -1559139611;
			class562_sub1.anInt7554 = buffer.readInt() * 2024733671;
			class562_sub1.anInt10369 = buffer.readUSmart() * -1305605251;

			if (0 != class562_sub1.anInt10369 * 1124271573) {
				class562_sub1.aString10367 = buffer.readPrefixedString();
			}

			class562_sub1.anInt10370 = -978223407 * (Class80.anInt2578 * -910063499 + i_4_);
			class562_sub1.aString10366 = buffer.readPrefixedString();
			class562_sub1.aString10365 = buffer.readPrefixedString();
		}

		Class588.anInt7779 = buffer.readInt() * -478167523;
		Class572.aBool7655 = true;
	}

	Class456 this$0;

	Class462(Class456 class456) {
		this$0 = class456;
	}

	@Override
	public byte[] method349(int i, byte i_0_) {
		return this$0.anInterface66_5136.get(i);
	}

}