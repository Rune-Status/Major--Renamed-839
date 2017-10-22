package com.jagex;

class ThemeMusicVolumeNormaliser implements VolumeNormaliser {
	public static QuickChatMessageLoader aClass10_2062;

	public static void method3756(int i, int i_0_, float f, VolumeNormaliser normaliser) {
		if (Class593.aClass343_7835 != null) {
			Class593.aClass343_7835.method5888().method5837(i, i_0_, f, normaliser);
		}
	}

	public static boolean isLatinLetter(char c) {
		return c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z';
	}

	static boolean method3755() {
		return AsynchronousHttpRequestCreator.method6956(Script.aClass580_11401.aClass557_7759);
	}

	Class186 this$0;

	ThemeMusicVolumeNormaliser(Class186 class186) {
		this$0 = class186;
	}

	@Override
	public float normalise() {
		return Class199.preferences.themeMusicVolume.getValue() / 255.0F;
	}

}