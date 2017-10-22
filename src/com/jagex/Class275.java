package com.jagex;

public class Class275 {
	static Class275 aClass275_3094 = new Class275(2);
	static Class275 aClass275_3095 = new Class275(1);
	static Class275 aClass275_3097 = new Class275(0);

	static int method5154(int i, int i_0_, int i_1_) {
		if (i_0_ == 9) {
			i = 1 + i & 0x3;
		} else if (10 == i_0_) {
			i = i + 3 & 0x3;
		} else if (i_0_ == 11) {
			i = 3 + i & 0x3;
		}

		return i;
	}

	public static boolean mapsceneReady(SceneObject object) {
		ObjectDefinition definition = Client.aClass460_10760.getObjectLoader().get(object.getId());
		if (-1 == -995642805 * definition.mapscene) {
			return true;
		}

		MapSceneDefinition mapscene = MapSceneDefinition.loader.get(-995642805 * definition.mapscene);
		if (mapscene.sprite * -1706425343 == -1) {
			return true;
		}

		return mapscene.loaded();
	}

	int anInt3096;

	Class275(int i) {
		anInt3096 = -1363458911 * i;
	}

}