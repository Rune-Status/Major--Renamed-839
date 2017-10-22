package com.jagex;

public class Class222_Sub1 extends Class222 {
	static int anInt9541;

	Class222_Sub1(Archive images, int cacheSize) {
		super(images, cacheSize);
	}

	@Override
	public Class<Class224> getClassType() {
		return Class224.class;
	}

	@Override
	public Class224 provide(int id, DefinitionLoader loader) {
		return new Class224(id, loader, this);
	}

}