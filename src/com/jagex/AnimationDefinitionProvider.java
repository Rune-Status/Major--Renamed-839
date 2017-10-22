package com.jagex;

public class AnimationDefinitionProvider extends BaseAnimationDefinitionProvider {

	AnimationDefinitionProvider(DefinitionLoader loader, Archive frames, Archive bases) {
		super(loader, frames, bases);
	}

	@Override
	public Class getClassType() {
		return AnimationDefinition.class;
	}

	@Override
	public AnimationDefinition provide(int id, DefinitionLoader cache) {
		return new AnimationDefinition(id, this);
	}

}