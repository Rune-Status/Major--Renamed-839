package com.jagex;

import java.awt.Point;

public class CursorDefinition implements Definition {

	public static CursorDefinitionLoader loader;

	public static short[] copy(short[] source) {
		if (source == null) {
			return null;
		}

		short[] copy = new short[source.length];
		System.arraycopy(source, 0, copy, 0, source.length);
		return copy;
	}

	static final void method10096(ScriptExecutionContext context) {
		Class611 class611 = context.aBool7932 ? context.aClass611_7945 : context.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		Interface class221 = class611.aClass221_7913;
		VolumePreference.method16788(class226, class221, context, 1837595482);
	}

	static final void method10097() {
		DrawableText.method15317();
	}

	public int hotspotX;
	public int hotspotY;
	int image;
	BaseCursorDefinitionProvider provider;

	CursorDefinition(int id, BaseCursorDefinitionProvider provider) {
		this.provider = provider;
	}

	@Override
	public void decode(Buffer buffer) {
		for (;;) {
			int opcode = buffer.readUByte();
			if (opcode == 0) {
				break;
			}

			decode(buffer, opcode);
		}
	}

	public synchronized Image getImage() {
		Image image = (Image) provider.cache.get(-1311079443 * this.image);
		if (image != null) {
			return image;
		}

		image = ImageUtils.loadFirst(provider.images, this.image * -1311079443, 0);
		if (image != null) {
			provider.cache.put(-1311079443 * this.image, image);
		}

		return image;
	}

	@Override
	public void method35() {

	}

	void decode(Buffer buffer, int opcode) {
		if (opcode == 1) {
			image = buffer.readSmart32() * 229790181;
		} else if (opcode == 2) {
			hotspotX = buffer.readUByte() * -1383065565;
			hotspotY = buffer.readUByte() * -123564169;
		}
	}

	static void createCursor(int id) {
		if (Class199.preferences.customCursors.getValue() == 0) {
			id = -1;
		}

		if (id != Client.anInt10784 * -1593807967) {
			if (id != -1) {
				CursorDefinition cursor = (CursorDefinition) loader.get(id);
				Image image = cursor.getImage();

				if (null != image) {
					Class167.aClass478_1931.setCustomCursor(Engine.aCanvas6501, image.argb(true),
							image.getScaleWidth(), image.getScaleHeight(), new Point(cursor.hotspotX * -1801103477,
									-542049721 * cursor.hotspotY));
					Client.anInt10784 = id * 1137457249;
				} else {
					id = -1;
				}
			}

			if (id == -1 && Client.anInt10784 * -1593807967 != -1) {
				Class167.aClass478_1931.setCustomCursor(Engine.aCanvas6501, null, -1, -1, new Point());
				Client.anInt10784 = -1137457249;
			}
		}
	}

}