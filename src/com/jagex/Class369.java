package com.jagex;

public class Class369 {
	public static Class261_Sub1 aClass261_Sub1_4079;

	static void method6107(Widget widget, ClippingMask class129, int i, int i_1_, int i_2_, int i_3_, Sprite sprite) {
		Class349.method5957(widget, class129, i, i_1_, i_2_, i_3_, sprite, 100.0, Class203.aClass203_2122,
				Class220.aClass220_2273);
	}

	static void method6108(String string) {
		Class34.aClass636_454 = Class636.aClass636_8124;
		Class512.aString7005 = string;
	}

	static void method6110(int i, String string, boolean bool) {
		Class293.method5402();
		Deque.method13349();
		Class166_Sub8.method15090();
		Class522.method8955(i, string, bool);
		Class509.aClass374_6997.method6120();
		Class509.aClass374_6997.init(Client.anInterface47_10645);
		Class222.method4165(Class60.activeToolkit);
		Sprite.loadVitalImages(Class60.activeToolkit, DequeIterator.images);
		MapSize.method4418();
		Sprite.method8794(WeakReferenceTable.nameIcons);
		EntityQueue.method13532();
		PreferenceManager.method744();

		if (0 == -1501875989 * Client.gameState) {
			Class536.setGameState(12);
		} else if (Client.gameState * -1501875989 == 8) {
			Class536.setGameState(7);
		} else if (11 == -1501875989 * Client.gameState) {
			Class536.setGameState(17);
		} else if (16 == Client.gameState * -1501875989) {
			Class536.setGameState(13);
		} else if (5 == Client.gameState * -1501875989 || 19 == -1501875989 * Client.gameState) {
			OverlayDefinition.method9930();
		} else if (6 == -1501875989 * Client.gameState) {
			Class536.setGameState(1);
		} else if (13 == -1501875989 * Client.gameState) {
			Class549.method9329(false);
		}
	}

	Class369() throws Throwable {
		throw new Error();
	}

}