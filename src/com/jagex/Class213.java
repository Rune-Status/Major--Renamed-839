package com.jagex;

public class Class213 {

	public static Sprite method4019(Archive images, int id) {
		Sprite sprite = (Sprite) Class274.aClass168_3092.get(id);
		if (sprite == null) {
			if (NpcVarpType.aBool9950) {
				sprite = Class60.activeToolkit.createSprite(ImageUtils.loadFirst(images, id), true);
			} else {
				sprite = Sprite.create(images.get(id));
			}

			Class274.aClass168_3092.put(id, sprite);
		}
		return sprite;
	}

	static void method4020() {
		Class75.aClass168_1125.clearSoft();
	}

	Class213() throws Throwable {
		throw new Error();
	}

}