package com.jagex;

public class ProcessorInformation {

	int anInt8393;
	int anInt8394;
	int anInt8395;
	int anInt8396;
	int anInt8397;

	ProcessorInformation(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		anInt8396 = i * 1357762343;
		anInt8394 = i_0_ * 314154883;
		anInt8395 = -2124415511 * i_1_;
		anInt8397 = 1702526615 * i_2_;
		anInt8393 = i_3_ * 1948816665;
	}

	@Override
	public int hashCode() {
		return anInt8396 * 1647358103;
	}

}