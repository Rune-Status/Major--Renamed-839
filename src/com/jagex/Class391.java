package com.jagex;

public class Class391 {
	static LoadingRequirement[] LOADING_REQUIREMENTS;
	static int loadingStage = 0;
	static int preloadSize = 0;

	static void method6322(int i) {
		int max = 0;
		if (null != Class199.preferences) {
			max = Class199.preferences.maxScreenSize.getValue();
		}
		if (2 == max) {
			int i_4_ = -562696973 * Engine.anInt6494 > 800 ? 800 : Engine.anInt6494 * -562696973;
			int i_5_ = -1308048867 * Class166_Sub15.anInt9602 > 600 ? 600 : Class166_Sub15.anInt9602 * -1308048867;
			Engine.screenWidth = i_4_ * -266960855;
			Engine.anInt6498 = (-562696973 * Engine.anInt6494 - i_4_) / 2 * -1766002387;
			Engine.screenHeight = 895080261 * i_5_;
			Engine.anInt6499 = 0;
		} else if (max == 1) {
			int i_6_ = Engine.anInt6494 * -562696973 > 1024 ? 1024 : Engine.anInt6494 * -562696973;
			int i_7_ = -1308048867 * Class166_Sub15.anInt9602 > 768 ? 768 : Class166_Sub15.anInt9602 * -1308048867;
			Engine.screenWidth = -266960855 * i_6_;
			Engine.anInt6498 = (Engine.anInt6494 * -562696973 - i_6_) / 2 * -1766002387;
			Engine.screenHeight = 895080261 * i_7_;
			Engine.anInt6499 = 0;
		} else {
			Engine.screenWidth = -1002540309 * Engine.anInt6494;
			Engine.anInt6498 = 0;
			Engine.screenHeight = -730354479 * Class166_Sub15.anInt9602;
			Engine.anInt6499 = 0;
		}
	}

	Class391() throws Throwable {
		throw new Error();
	}

}