package com.jagex;

public abstract class AnimatingCutsceneAction extends CutsceneAction {

	int anInt9559;
	int graphic;
	int heightOffset;

	AnimatingCutsceneAction(Buffer buffer) {
		super(buffer);
		graphic = buffer.readUShort() * -1527622927;
		anInt9559 = buffer.readUShort() * -1529038493;
		heightOffset = buffer.readUByte() * 1567821073;
	}

	@Override
	boolean ready() {
		GraphicDefinition graphic = GraphicDefinition.loader.get(-1061921263 * this.graphic);
		boolean loaded = graphic.loaded();
		AnimationDefinition animation = AnimationDefinition.loader.get(graphic.animation * 2053507375);
		loaded &= animation.ready();
		return loaded;
	}

}