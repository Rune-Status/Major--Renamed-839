package com.jagex;

public class GlobalPlayer {
	static boolean method1099() {
		return Class56.menuOptionCount * 84366055 > 0;
	}

	static void method1100(Toolkit toolkit, int i, int i_437_, int i_438_, int i_439_, int i_440_, int i_441_,
			int i_442_, int i_443_) {
		Class490 class490 = Client.aClass460_10760.method7687();
		SceneObject interface55 = (SceneObject) class490.method8345(i, i_437_, i_438_);
		if (interface55 != null) {
			ObjectDefinition object = Client.aClass460_10760.getObjectLoader().get(interface55.getId());
			int i_444_ = interface55.method377() & 0x3;
			int i_445_ = interface55.method339();
			if (object.mapscene * -995642805 != -1) {
				GlobalPlayer.method1545(toolkit, object, i_444_, i_439_, i_440_);
			} else {
				int i_446_ = i_441_;
				if (object.anInt7389 * -1893691057 > 0) {
					i_446_ = i_442_;
				}
				if (-1050493863 * ObjectCategory.aClass541_7335.type == i_445_
						|| ObjectCategory.aClass541_7337.type * -1050493863 == i_445_) {
					if (i_444_ == 0) {
						toolkit.method2431(i_439_, i_440_, 4, i_446_, 114042240);
					} else if (1 == i_444_) {
						toolkit.method2382(i_439_, i_440_, 4, i_446_, -1942925271);
					} else if (i_444_ == 2) {
						toolkit.method2431(i_439_ + 3, i_440_, 4, i_446_, -1011643414);
					} else if (i_444_ == 3) {
						toolkit.method2382(i_439_, 3 + i_440_, 4, i_446_, -2055972086);
					}
				}
				if (-1050493863 * ObjectCategory.aClass541_7355.type == i_445_) {
					if (0 == i_444_) {
						toolkit.method2805(i_439_, i_440_, 1, 1, i_446_);
					} else if (i_444_ == 1) {
						toolkit.method2805(i_439_ + 3, i_440_, 1, 1, i_446_);
					} else if (2 == i_444_) {
						toolkit.method2805(3 + i_439_, i_440_ + 3, 1, 1, i_446_);
					} else if (i_444_ == 3) {
						toolkit.method2805(i_439_, i_440_ + 3, 1, 1, i_446_);
					}
				}
				if (i_445_ == -1050493863 * ObjectCategory.aClass541_7337.type) {
					if (0 == i_444_) {
						toolkit.method2382(i_439_, i_440_, 4, i_446_, -1955754881);
					} else if (1 == i_444_) {
						toolkit.method2431(i_439_ + 3, i_440_, 4, i_446_, -328569375);
					} else if (2 == i_444_) {
						toolkit.method2382(i_439_, 3 + i_440_, 4, i_446_, -2141510226);
					} else if (3 == i_444_) {
						toolkit.method2431(i_439_, i_440_, 4, i_446_, -1664693532);
					}
				}
			}
		}
		interface55 = (SceneObject) class490.method8349(i, i_437_, i_438_, Client.anInterface57_10904);
		if (interface55 != null) {
			ObjectDefinition object = Client.aClass460_10760.getObjectLoader().get(interface55.getId());
			int i_447_ = interface55.method377() & 0x3;
			int i_448_ = interface55.method339();
			if (-1 != -995642805 * object.mapscene) {
				GlobalPlayer.method1545(toolkit, object, i_447_, i_439_, i_440_);
			} else if (i_448_ == ObjectCategory.aClass541_7339.type * -1050493863) {
				int i_449_ = -1118482;
				if (object.anInt7389 * -1893691057 > 0) {
					i_449_ = -1179648;
				}
				if (i_447_ == 0 || i_447_ == 2) {
					toolkit.method2432(i_439_, 3 + i_440_, i_439_ + 3, i_440_, i_449_);
				} else {
					toolkit.method2432(i_439_, i_440_, i_439_ + 3, i_440_ + 3, i_449_);
				}
			}
		}
		interface55 = (SceneObject) class490.method8351(i, i_437_, i_438_);
		if (interface55 != null) {
			ObjectDefinition object = Client.aClass460_10760.getObjectLoader().get(interface55.getId());
			int i_450_ = interface55.method377() & 0x3;
			if (-1 != object.mapscene * -995642805) {
				GlobalPlayer.method1545(toolkit, object, i_450_, i_439_, i_440_);
			}
		}
	}

	int target;
	int anInt561;
	Class198 aClass198_562 = Class198.aClass198_2093;
	boolean aBool563;
	int position;
	static GlobalPlayer[] globals;
	static void method1545(Toolkit toolkit, ObjectDefinition object, int rotations, int i_1_, int i_2_) {
		MapSceneDefinition scene = MapSceneDefinition.loader.get(-995642805 * object.mapscene);
		if (scene.sprite * -1706425343 != -1) {
			if (object.aBool7437) {
				rotations += object.anInt7407 * 83616977;
				rotations &= 0x3;
			} else {
				rotations = 0;
			}
	
			Sprite sprite = scene.getSprite(toolkit, rotations, object.invertMapScene);
			if (null != sprite) {
				int width_ = 723391465 * object.width;
				int length_ = object.length * 2076427087;
	
				if ((rotations & 0x1) == 1) {
					width_ = 2076427087 * object.length;
					length_ = object.width * 723391465;
				}
	
				int width = sprite.scaleWidth();
				int height = sprite.scaleHeight();
	
				if (scene.aBool292) {
					width = 4 * width_;
					height = 4 * length_;
				}
	
				if (0 != scene.colour * 1249789109) {
					sprite.method2082(i_1_, i_2_ - 4 * (length_ - 1), width, height, 0, ~0xffffff | 1249789109
							* scene.colour, 1);
				} else {
					sprite.method2145(i_1_, i_2_ - (length_ - 1) * 4, width, height);
				}
			}
		}
	}

}