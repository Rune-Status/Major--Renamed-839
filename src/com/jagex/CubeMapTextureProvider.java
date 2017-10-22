package com.jagex;

public abstract class CubeMapTextureProvider {

	public static int method2867(long l) {
		return (int) (l / 86400000L) - 11745;
	}

	static void method2864(int i) {
		if (-397456237 * Class65.anInt1008 > 0) {
			int i_0_ = 0;
			for (String element : Class65.consoleMessages) {
				if (element.indexOf("--> ") != -1 && ++i_0_ == -397456237 * Class65.anInt1008) {
					Class65.consoleText = element.substring(element.indexOf('>') + 2);
					break;
				}
			}
		} else {
			Class65.consoleText = "";
		}
	}

}