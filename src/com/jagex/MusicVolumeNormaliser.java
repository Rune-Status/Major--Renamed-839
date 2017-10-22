package com.jagex;

class MusicVolumeNormaliser implements VolumeNormaliser {
	Class186 this$0;

	MusicVolumeNormaliser(Class186 class186) {
		this$0 = class186;
	}

	@Override
	public float normalise() {
		return Class199.preferences.musicVolume.getValue() / 255.0F;
	}

}