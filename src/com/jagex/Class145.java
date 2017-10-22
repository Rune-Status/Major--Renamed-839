package com.jagex;

public class Class145 {

	public Class145 aClass145_1803;
	public int anInt1802;
	public int anInt1804;
	public int anInt1805;
	public int anInt1806;
	public int anInt1808;
	public int anInt1809;
	public int anInt1810;
	public int anInt1811;
	public int anInt1813;
	public int anInt1814;
	public int anInt1815;
	public int anInt1816;
	public int anInt1817;
	public int producer;
	byte priority;

	Class145(int producer, int i_4_, int i_5_, int i_6_, int i_7_, byte priority) {
		this.producer = 828943405 * producer;
		anInt1804 = i_4_ * -1985586637;
		anInt1805 = i_5_ * -416785201;
		anInt1802 = -504824887 * i_6_;
		anInt1806 = i_7_ * -1711329739;
		this.priority = priority;
	}

	public ParticleProducerDefinition getProducer(ParticleProducerDefinitionLoader loader) {
		return loader.load(producer * -471432283);
	}

	Class145 method3138(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		return new Class145(producer * -471432283, i, i_0_, i_1_, i_2_, priority);
	}

}