package com.jagex;

class VoiceOverVolumeNormaliser implements VolumeNormaliser {
	public static int anInt1993;

	public static final void method3537() {
		if (!Client.aBool10740) {
			Client.aFloat10710 += (24.0F - Client.aFloat10710) / 2.0F;
			Client.aBool10611 = true;
			Client.aBool10740 = true;
		}
	}

	Class186 this$0;

	VoiceOverVolumeNormaliser(Class186 class186) {
		this$0 = class186;
	}

	@Override
	public float normalise() {
		return Class199.preferences.voiceOverVolume.getValue() / 255.0F;
	}

}