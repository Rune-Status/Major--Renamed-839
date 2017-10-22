package com.jagex;

public class RendererType {
	public static final int anInt1472 = 0;
	public static final int anInt1473 = 4318;
	public static final int anInt1474 = 4098;
	public static final int anInt1476 = 32902;
	public static final int anInt1478 = -1;

	public static int windowMode() {
		if (Client.supportsFullScreen && null != Client.fullScreenFrame) {
			return 3;
		}
		return Client.resizableScreen ? 2 : 1;
	}

	static void method2248(boolean bool) {
		Class553 class553 = Client.localPlayer.method17970();
		Class480_Sub31_Sub18 class480_sub31_sub18 = Class495.method8552(class553.x * 2051316501, -180305283
				* class553.z);
		if (null == class480_sub31_sub18) {
			class480_sub31_sub18 = Class495.method8553(Class495.aClass560_6827.anInt7534 * -1885442045);
		}
		if (IndexedJavaFont.aClass480_Sub31_Sub18_8847 != class480_sub31_sub18 || bool) {
			IndexedJavaFont.aClass480_Sub31_Sub18_8847 = class480_sub31_sub18;
			boolean bool_2_ = Class495.method8613(class480_sub31_sub18);
			if (bool_2_) {
				Class495.aBool6845 = true;
				CutsceneArea.method16040();
			}
		}
	}

	public String device;
	public long driver;
	public String name;
	public int vendor;
	public int version;

	public RendererType(int vendor, String name, int version, String device, long driver) {
		this.vendor = vendor * 1183369489;
		this.name = name;
		this.version = 398624645 * version;
		this.device = device;
		this.driver = driver * -2511105947671025741L;
	}

}