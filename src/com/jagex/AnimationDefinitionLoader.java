package com.jagex;

public class AnimationDefinitionLoader extends CachedDefinitionLoader<AnimationDefinition> {

	static AnimationDefinitionLoader instance;

	public AnimationDefinitionLoader(GameContext context, Language language, Archive animations, Archive frames,
			Archive bases, Class678_Sub3 class678_sub3) {
		super(context, language, animations, ConfigEntry.ANIMATIONS, 64, new AnimationDefinitionProvider(class678_sub3,
				frames, bases));
	}

	@Override
	public void clearSoft() {
		super.clearSoft();
		((BaseAnimationDefinitionProvider) provider).clearSoft();
	}

	public FrameCollection getCollection(int id) {
		return ((BaseAnimationDefinitionProvider) provider).getCollection(id);
	}

	@Override
	public void reset() {
		super.reset();
		((BaseAnimationDefinitionProvider) provider).reset();
	}

	@Override
	public void sweep(int i) {
		super.sweep(i);
		((BaseAnimationDefinitionProvider) provider).sweep(i);
	}

	public static void init(AnimationDefinitionLoader loader) {
		instance = loader;
	}

}