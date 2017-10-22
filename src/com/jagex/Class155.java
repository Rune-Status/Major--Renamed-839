package com.jagex;

public class Class155 {
	static Class155 aClass155_1871 = new Class155();
	static Class155 aClass155_1872 = new Class155();
	static Class155 aClass155_1873 = new Class155();
	static int anInt1874;

	public static void method3285(Archive models, TextureMetricsList metrics, Interface19 interface19) {
		Class512.models = models;
		HandshakeType.aClass147_3723 = metrics;
		PlayerVariableProvider.anInterface19_1027 = interface19;
	}

	static boolean method3282(int i, int i_0_, int i_1_) {
		Class490 class490 = Client.aClass460_10760.method7687();
		boolean bool = true;

		SceneObject interface55 = (SceneObject) class490.method8345(i, i_0_, i_1_);
		if (interface55 != null) {
			bool &= Class275.mapsceneReady(interface55);
		}

		interface55 = (SceneObject) class490.method8349(i, i_0_, i_1_, Client.anInterface57_10904);
		if (null != interface55) {
			bool &= Class275.mapsceneReady(interface55);
		}

		interface55 = (SceneObject) class490.method8351(i, i_0_, i_1_);
		if (interface55 != null) {
			bool &= Class275.mapsceneReady(interface55);
		}

		return bool;
	}

	static boolean method3283() {
		if (null != Client.aByteArray10716) {
			return Class671.method13825();
		} else if (-1420488133 * Class31.socialNetworkId != -1) {
			return Class480_Sub14_Sub4.method17540();
		}

		return Class615.method10359(Class31.aString423, Class31.accountPassword);
	}

}